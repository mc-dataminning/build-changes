import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjo extends hhv {
   static final Logger a = LogUtils.getLogger();
   private static final xv b = xv.c("mco.configure.world.backup");
   static final xv c = xv.c("mco.backup.button.restore");
   static final xv C = xv.c("mco.backup.changes.tooltip");
   private static final xv D = xv.c("mco.backup.nobackups");
   private static final xv E = xv.c("mco.backup.button.download");
   private static final String F = "uploaded";
   private static final int G = 8;
   final fjr H;
   List<fhx> I = Collections.emptyList();
   @Nullable
   fjo.a J;
   final frt K = new frt(this);
   private final int L;
   @Nullable
   foe M;
   final fii N;
   boolean O = false;

   public fjo(fjr $$0, fii $$1, int $$2) {
      super(b);
      this.H = $$0;
      this.N = $$1;
      this.L = $$2;
   }

   @Override
   public void aT_() {
      this.K.a(b, this.p);
      this.J = this.K.c(new fjo.a());
      frx $$0 = this.K.b(frx.e().a(8));
      this.M = $$0.a(foe.a(E, $$0x -> this.F()).a());
      this.M.j = false;
      $$0.a(foe.a(xu.k, $$0x -> this.aP_()).a());
      this.K.a($$1 -> {
         foc var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   public void a(fnr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.O && this.J != null) {
         $$0.a(this.p, D, this.n / 2 - this.p.a(D) / 2, this.J.E() + this.J.w() / 2 - 9 / 2, -1, false);
      }
   }

   @Override
   protected void c() {
      this.K.a();
      if (this.J != null) {
         this.J.a(this.n, this.K);
      }
   }

   private void E() {
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            fhh $$0 = fhh.a();

            try {
               List<fhx> $$1 = $$0.e(fjo.this.N.a).a;
               fjo.this.m.execute(() -> {
                  fjo.this.I = $$1;
                  fjo.this.O = fjo.this.I.isEmpty();
                  if (!fjo.this.O && fjo.this.M != null) {
                     fjo.this.M.j = true;
                  }

                  if (fjo.this.J != null) {
                     fjo.this.J.a(fjo.this.I.stream().map($$0xx -> fjo.this.new b($$0xx)).toList());
                  }
               });
            } catch (fjd var3) {
               fjo.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void aP_() {
      this.m.a(this.H);
   }

   private void F() {
      this.m
         .a(
            fkd.a(
               this,
               xv.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.m
                     .a(
                        new fjx(
                           this.H.g(),
                           new flc(this.N.a, this.L, Objects.requireNonNullElse(this.N.c, "") + " (" + this.N.i.get(this.N.p).a(this.N.p) + ")", this)
                        )
                     )
            )
         );
   }

   class a extends fok<fjo.b> {
      private static final int a = 36;

      public a() {
         super(fmf.Q(), fjo.this.n, fjo.this.K.d(), fjo.this.K.c(), 36);
      }

      @Override
      public int a() {
         return 300;
      }
   }

   class b extends fok.a<fjo.b> {
      private static final int b = 2;
      private final fhx c;
      @Nullable
      private foe d;
      @Nullable
      private foe e;
      private final List<foc> f = new ArrayList<>();

      public b(final fhx $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = foe.a(fjo.C, $$0x -> fjo.this.m.a(new fjn(fjo.this, this.c)))
               .a(8 + fjo.this.p.a(fjo.C))
               .a($$0x -> xu.a(xv.a("mco.backup.narration", this.c()), (xv)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fjo.this.N.j) {
            this.d = foe.a(fjo.c, $$0x -> this.g()).a(8 + fjo.this.p.a(fjo.C)).a($$0x -> xu.a(xv.a("mco.backup.narration", this.c()), (xv)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fhx $$0) {
         int $$1 = fjo.this.I.indexOf($$0);
         if ($$1 != fjo.this.I.size() - 1) {
            fhx $$2 = fjo.this.I.get($$1 + 1);

            for (String $$3 : $$0.d.keySet()) {
               if (!$$3.contains("uploaded") && $$2.d.containsKey($$3)) {
                  if (!$$0.d.get($$3).equals($$2.d.get($$3))) {
                     this.a($$3);
                  }
               } else {
                  this.a($$3);
               }
            }
         }
      }

      private void a(String $$0) {
         if ($$0.contains("uploaded")) {
            String $$1 = DateFormat.getDateTimeInstance(3, 3).format(this.c.b);
            this.c.e.put($$0, $$1);
            this.c.a(true);
         } else {
            this.c.e.put($$0, this.c.d.get($$0));
         }
      }

      private String c() {
         return DateFormat.getDateTimeInstance(3, 3).format(this.c.b);
      }

      private void g() {
         xv $$0 = fkw.a(this.c.b);
         xv $$1 = xv.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fjo.this.m.a(fkd.b(fjo.this, $$1, $$0x -> fjo.this.m.a(new fjx(fjo.this.H.g(), new flj(this.c, fjo.this.N.a, fjo.this.H)))));
      }

      @Override
      public List<? extends fqc> aI_() {
         return this.f;
      }

      @Override
      public List<? extends fsa> b() {
         return this.f;
      }

      @Override
      public void a(fnr $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.a(fjo.this.p, xv.a("mco.backup.entry", fkw.a(this.c.b)), $$3, $$11, $$13, false);
         $$0.a(fjo.this.p, this.a(this.c.b), $$3, $$12, 5000268, false);
         int $$14 = 0;
         int $$15 = $$2 + $$5 / 2 - 10;
         if (this.d != null) {
            $$14 += this.d.y() + 8;
            this.d.k($$3 + $$4 - $$14);
            this.d.l($$15);
            this.d.a($$0, $$6, $$7, $$9);
         }

         if (this.e != null) {
            $$14 += this.e.y() + 8;
            this.e.k($$3 + $$4 - $$14);
            this.e.l($$15);
            this.e.a($$0, $$6, $$7, $$9);
         }
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }
   }
}
