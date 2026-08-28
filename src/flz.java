import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class flz extends fne {
   static final alf b = new alf("container/slot");
   private static final int c = 18;
   private static final int d = 20;
   private static final int r = 1;
   private static final int s = 1;
   private static final int u = 2;
   private static final int v = 2;
   protected final frt a;
   private final Consumer<ego> w;
   ego x;
   private xp y;
   private xp z;
   private flz.a A;
   private fhf B;

   public flz(frt $$0, Consumer<ego> $$1, ego $$2) {
      super(xp.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   public ego l() {
      return this.x;
   }

   public void a(ego $$0) {
      this.x = $$0;
   }

   @Override
   protected void aM_() {
      this.y = xp.c("createWorld.customize.flat.tile");
      this.z = xp.c("createWorld.customize.flat.height");
      this.A = this.c(new flz.a());
      this.B = this.c(fhf.a(xp.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.E()) {
            List<egl> $$1 = this.x.e();
            int $$2 = this.A.aD_().indexOf(this.A.h());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.A.a($$1.isEmpty() ? null : this.A.aD_().get(Math.min($$2, $$1.size() - 1)));
            this.x.g();
            this.A.c();
            this.m();
         }
      }).a(this.n / 2 - 155, this.o - 52, 150, 20).a());
      this.c(fhf.a(xp.c("createWorld.customize.presets"), $$0 -> {
         this.m.a(new fna(this));
         this.x.g();
         this.m();
      }).a(this.n / 2 + 5, this.o - 52, 150, 20).a());
      this.c(fhf.a(xo.d, $$0 -> {
         this.w.accept(this.x);
         this.m.a(this.a);
         this.x.g();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a());
      this.c(fhf.a(xo.e, $$0 -> {
         this.m.a(this.a);
         this.x.g();
      }).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
      this.x.g();
      this.m();
   }

   void m() {
      this.B.j = this.E();
   }

   private boolean E() {
      return this.A.h() != null;
   }

   @Override
   public void d() {
      this.m.a(this.a);
   }

   @Override
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
      int $$4 = this.n / 2 - 92 - 16;
      $$0.b(this.p, this.y, $$4, 32, 16777215);
      $$0.b(this.p, this.z, $$4 + 2 + 213 - this.p.a(this.z), 32, 16777215);
   }

   class a extends fib<flz.a.a> {
      public a() {
         super(flz.this.m, flz.this.n, flz.this.o - 103, 43, 24);

         for (int $$0 = 0; $$0 < flz.this.x.e().size(); $$0++) {
            this.b(new flz.a.a());
         }
      }

      public void a(@Nullable flz.a.a $$0) {
         super.a($$0);
         flz.this.m();
      }

      public void c() {
         int $$0 = this.aD_().indexOf(this.h());
         this.k();

         for (int $$1 = 0; $$1 < flz.this.x.e().size(); $$1++) {
            this.b(new flz.a.a());
         }

         List<flz.a.a> $$2 = this.aD_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends fib.a<flz.a.a> {
         @Override
         public void a(fgs $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            egl $$10 = flz.this.x.e().get(flz.this.x.e().size() - $$1 - 1);
            dsd $$11 = $$10.b();
            cuq $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(flz.this.p, $$12.x(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            xp $$13;
            if ($$1 == 0) {
               $$13 = xp.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == flz.this.x.e().size() - 1) {
               $$13 = xp.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = xp.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(flz.this.p, $$13, $$3 + 2 + 213 - flz.this.p.a($$13), $$2 + 3, 16777215, false);
         }

         private cuq a(dsd $$0) {
            cul $$1 = $$0.b().r();
            if ($$1 == cut.a) {
               if ($$0.a(dfc.G)) {
                  $$1 = cut.qz;
               } else if ($$0.a(dfc.H)) {
                  $$1 = cut.qA;
               }
            }

            return new cuq($$1);
         }

         @Override
         public xp a() {
            egl $$0 = flz.this.x.e().get(flz.this.x.e().size() - a.this.aD_().indexOf(this) - 1);
            cuq $$1 = this.a($$0.b());
            return (xp)(!$$1.e() ? xp.a("narrator.select", $$1.x()) : xo.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(fgs $$0, int $$1, int $$2, cuq $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.e()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(fgs $$0, int $$1, int $$2) {
            $$0.a(flz.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
