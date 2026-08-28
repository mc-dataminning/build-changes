import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fji extends hhs {
   static final Logger a = LogUtils.getLogger();
   private static final xk b = xk.c("mco.configure.world.backup");
   static final xk c = xk.c("mco.backup.button.restore");
   static final xk C = xk.c("mco.backup.changes.tooltip");
   private static final xk D = xk.c("mco.backup.nobackups");
   private static final xk E = xk.c("mco.backup.button.download");
   private static final String F = "uploaded";
   private static final int G = 8;
   final fjl H;
   List<fhr> I = Collections.emptyList();
   @Nullable
   fji.a J;
   final frn K = new frn(this);
   private final int L;
   @Nullable
   fny M;
   final fic N;
   boolean O = false;

   public fji(fjl $$0, fic $$1, int $$2) {
      super(b);
      this.H = $$0;
      this.N = $$1;
      this.L = $$2;
   }

   @Override
   public void aT_() {
      this.K.a(b, this.p);
      this.J = this.K.c(new fji.a());
      frr $$0 = this.K.b(frr.e().a(8));
      this.M = $$0.a(fny.a(E, $$0x -> this.F()).a());
      this.M.j = false;
      $$0.a(fny.a(xj.k, $$0x -> this.aP_()).a());
      this.K.a($$1 -> {
         fnw var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.O && this.J != null) {
         $$0.b(this.p, D, this.n / 2 - this.p.a(D) / 2, this.J.E() + this.J.w() / 2 - 9 / 2, -1);
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
            fhb $$0 = fhb.a();

            try {
               List<fhr> $$1 = $$0.e(fji.this.N.a).a;
               fji.this.m.execute(() -> {
                  fji.this.I = $$1;
                  fji.this.O = fji.this.I.isEmpty();
                  if (!fji.this.O && fji.this.M != null) {
                     fji.this.M.j = true;
                  }

                  if (fji.this.J != null) {
                     fji.this.J.a(fji.this.I.stream().map($$0xx -> fji.this.new b($$0xx)).toList());
                  }
               });
            } catch (fix var3) {
               fji.a.error("Couldn't request backups", var3);
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
            fjx.a(
               this,
               xk.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.m
                     .a(
                        new fjr(
                           this.H.g(),
                           new fkw(this.N.a, this.L, Objects.requireNonNullElse(this.N.c, "") + " (" + this.N.i.get(this.N.p).a(this.N.p) + ")", this)
                        )
                     )
            )
         );
   }

   class a extends foe<fji.b> {
      private static final int a = 36;

      public a() {
         super(flz.Q(), fji.this.n, fji.this.K.d(), fji.this.K.c(), 36);
      }

      @Override
      public int a() {
         return 300;
      }
   }

   class b extends foe.a<fji.b> {
      private static final int b = 2;
      private final fhr c;
      @Nullable
      private fny d;
      @Nullable
      private fny e;
      private final List<fnw> f = new ArrayList<>();

      public b(final fhr $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fny.a(fji.C, $$0x -> fji.this.m.a(new fjh(fji.this, this.c)))
               .a(8 + fji.this.p.a(fji.C))
               .a($$0x -> xj.a(xk.a("mco.backup.narration", this.c()), (xk)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fji.this.N.j) {
            this.d = fny.a(fji.c, $$0x -> this.g()).a(8 + fji.this.p.a(fji.C)).a($$0x -> xj.a(xk.a("mco.backup.narration", this.c()), (xk)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fhr $$0) {
         int $$1 = fji.this.I.indexOf($$0);
         if ($$1 != fji.this.I.size() - 1) {
            fhr $$2 = fji.this.I.get($$1 + 1);

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
         xk $$0 = fkq.a(this.c.b);
         xk $$1 = xk.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fji.this.m.a(fjx.b(fji.this, $$1, $$0x -> fji.this.m.a(new fjr(fji.this.H.g(), new fld(this.c, fji.this.N.a, fji.this.H)))));
      }

      @Override
      public List<? extends fpw> aI_() {
         return this.f;
      }

      @Override
      public List<? extends fru> b() {
         return this.f;
      }

      @Override
      public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.b(fji.this.p, xk.a("mco.backup.entry", fkq.a(this.c.b)), $$3, $$11, $$13);
         $$0.b(fji.this.p, this.a(this.c.b), $$3, $$12, 5000268);
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
