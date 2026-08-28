import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fir extends hle {
   static final Logger a = LogUtils.getLogger();
   private static final wp b = wp.c("mco.configure.world.backup");
   static final wp c = wp.c("mco.backup.button.restore");
   static final wp C = wp.c("mco.backup.changes.tooltip");
   private static final wp D = wp.c("mco.backup.nobackups");
   private static final wp E = wp.c("mco.backup.button.download");
   private static final String F = "uploaded";
   private static final int G = 8;
   final fiu H;
   List<fha> I = Collections.emptyList();
   @Nullable
   fir.a J;
   final fsh K = new fsh(this);
   private final int L;
   @Nullable
   fot M;
   final fhl N;
   boolean O = false;

   public fir(fiu $$0, fhl $$1, int $$2) {
      super(b);
      this.H = $$0;
      this.N = $$1;
      this.L = $$2;
   }

   @Override
   public void aR_() {
      this.K.a(b, this.p);
      this.J = this.K.c(new fir.a());
      fsl $$0 = this.K.b(fsl.e().a(8));
      this.M = $$0.a(fot.a(E, $$0x -> this.F()).a());
      this.M.j = false;
      $$0.a(fot.a(wo.k, $$0x -> this.aO_()).a());
      this.K.a($$1 -> {
         foq var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   public void a(foe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.O && this.J != null) {
         $$0.b(this.p, D, this.n / 2 - this.p.a(D) / 2, this.J.G() + this.J.y() / 2 - 9 / 2, -1);
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
            fgk $$0 = fgk.a();

            try {
               List<fha> $$1 = $$0.e(fir.this.N.a).a;
               fir.this.m.execute(() -> {
                  fir.this.I = $$1;
                  fir.this.O = fir.this.I.isEmpty();
                  if (!fir.this.O && fir.this.M != null) {
                     fir.this.M.j = true;
                  }

                  if (fir.this.J != null) {
                     fir.this.J.a(fir.this.I.stream().map($$0xx -> fir.this.new b($$0xx)).toList());
                  }
               });
            } catch (fig var3) {
               fir.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void aO_() {
      this.m.a(this.H);
   }

   private void F() {
      this.m
         .a(
            fjg.a(
               this,
               wp.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.m
                     .a(
                        new fja(
                           this.H.g(),
                           new fkf(this.N.a, this.L, Objects.requireNonNullElse(this.N.c, "") + " (" + this.N.i.get(this.N.p).a(this.N.p) + ")", this)
                        )
                     )
            )
         );
   }

   class a extends foz<fir.b> {
      private static final int a = 36;

      public a() {
         super(flj.Q(), fir.this.n, fir.this.K.d(), fir.this.K.c(), 36);
      }

      @Override
      public int a() {
         return 300;
      }
   }

   class b extends foz.a<fir.b> {
      private static final int b = 2;
      private final fha c;
      @Nullable
      private fot d;
      @Nullable
      private fot e;
      private final List<foq> f = new ArrayList<>();

      public b(final fha $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fot.a(fir.C, $$0x -> fir.this.m.a(new fiq(fir.this, this.c)))
               .a(8 + fir.this.p.a(fir.C))
               .a($$0x -> wo.a(wp.a("mco.backup.narration", this.c()), (wp)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fir.this.N.j) {
            this.d = fot.a(fir.c, $$0x -> this.g()).a(8 + fir.this.p.a(fir.C)).a($$0x -> wo.a(wp.a("mco.backup.narration", this.c()), (wp)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fha $$0) {
         int $$1 = fir.this.I.indexOf($$0);
         if ($$1 != fir.this.I.size() - 1) {
            fha $$2 = fir.this.I.get($$1 + 1);

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
         wp $$0 = fjz.a(this.c.b);
         wp $$1 = wp.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fir.this.m.a(fjg.b(fir.this, $$1, $$0x -> fir.this.m.a(new fja(fir.this.H.g(), new fkm(this.c, fir.this.N.a, fir.this.H)))));
      }

      @Override
      public List<? extends fqq> aH_() {
         return this.f;
      }

      @Override
      public List<? extends fso> b() {
         return this.f;
      }

      @Override
      public void a(foe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.b(fir.this.p, wp.a("mco.backup.entry", fjz.a(this.c.b)), $$3, $$11, $$13);
         $$0.b(fir.this.p, this.a(this.c.b), $$3, $$12, 5000268);
         int $$14 = 0;
         int $$15 = $$2 + $$5 / 2 - 10;
         if (this.d != null) {
            $$14 += this.d.A() + 8;
            this.d.j($$3 + $$4 - $$14);
            this.d.k($$15);
            this.d.a($$0, $$6, $$7, $$9);
         }

         if (this.e != null) {
            $$14 += this.e.A() + 8;
            this.e.j($$3 + $$4 - $$14);
            this.e.k($$15);
            this.e.a($$0, $$6, $$7, $$9);
         }
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }
   }
}
