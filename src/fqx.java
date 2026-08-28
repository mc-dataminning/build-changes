import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fqx extends frw {
   static final alj b = alj.b("container/slot");
   private static final int c = 18;
   private static final int d = 20;
   private static final int s = 1;
   private static final int u = 1;
   private static final int v = 2;
   private static final int w = 2;
   protected final fwv a;
   private final Consumer<ekl> x;
   ekl y;
   private xj z;
   private xj A;
   private fqx.a B;
   private fmd C;

   public fqx(fwv $$0, Consumer<ekl> $$1, ekl $$2) {
      super(xj.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.x = $$1;
      this.y = $$2;
   }

   public ekl l() {
      return this.y;
   }

   public void a(ekl $$0) {
      this.y = $$0;
   }

   @Override
   protected void aR_() {
      this.z = xj.c("createWorld.customize.flat.tile");
      this.A = xj.c("createWorld.customize.flat.height");
      this.B = this.c(new fqx.a());
      this.C = this.c(fmd.a(xj.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.F()) {
            List<eki> $$1 = this.y.e();
            int $$2 = this.B.aH_().indexOf(this.B.h());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.B.a($$1.isEmpty() ? null : this.B.aH_().get(Math.min($$2, $$1.size() - 1)));
            this.y.g();
            this.B.c();
            this.m();
         }
      }).a(this.n / 2 - 155, this.o - 52, 150, 20).a());
      this.c(fmd.a(xj.c("createWorld.customize.presets"), $$0 -> {
         this.m.a(new frs(this));
         this.y.g();
         this.m();
      }).a(this.n / 2 + 5, this.o - 52, 150, 20).a());
      this.c(fmd.a(xi.d, $$0 -> {
         this.x.accept(this.y);
         this.m.a(this.a);
         this.y.g();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a());
      this.c(fmd.a(xi.e, $$0 -> {
         this.m.a(this.a);
         this.y.g();
      }).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
      this.y.g();
      this.m();
   }

   void m() {
      this.C.j = this.F();
   }

   private boolean F() {
      return this.B.h() != null;
   }

   @Override
   public void aO_() {
      this.m.a(this.a);
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
      int $$4 = this.n / 2 - 92 - 16;
      $$0.b(this.p, this.z, $$4, 32, 16777215);
      $$0.b(this.p, this.A, $$4 + 2 + 213 - this.p.a(this.A), 32, 16777215);
   }

   class a extends fmz<fqx.a.a> {
      public a() {
         super(fqx.this.m, fqx.this.n, fqx.this.o - 103, 43, 24);

         for (int $$0 = 0; $$0 < fqx.this.y.e().size(); $$0++) {
            this.b(new fqx.a.a());
         }
      }

      public void a(@Nullable fqx.a.a $$0) {
         super.a($$0);
         fqx.this.m();
      }

      public void c() {
         int $$0 = this.aH_().indexOf(this.h());
         this.k();

         for (int $$1 = 0; $$1 < fqx.this.y.e().size(); $$1++) {
            this.b(new fqx.a.a());
         }

         List<fqx.a.a> $$2 = this.aH_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends fmz.a<fqx.a.a> {
         @Override
         public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            eki $$10 = fqx.this.y.e().get(fqx.this.y.e().size() - $$1 - 1);
            dvv $$11 = $$10.b();
            cwm $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(fqx.this.p, $$12.y(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            xj $$13;
            if ($$1 == 0) {
               $$13 = xj.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fqx.this.y.e().size() - 1) {
               $$13 = xj.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = xj.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(fqx.this.p, $$13, $$3 + 2 + 213 - fqx.this.p.a($$13), $$2 + 3, 16777215, false);
         }

         private cwm a(dvv $$0) {
            cwi $$1 = $$0.b().j();
            if ($$1 == cwq.a) {
               if ($$0.a(dis.G)) {
                  $$1 = cwq.qA;
               } else if ($$0.a(dis.H)) {
                  $$1 = cwq.qB;
               }
            }

            return new cwm($$1);
         }

         @Override
         public xj a() {
            eki $$0 = fqx.this.y.e().get(fqx.this.y.e().size() - a.this.aH_().indexOf(this) - 1);
            cwm $$1 = this.a($$0.b());
            return (xj)(!$$1.f() ? xj.a("narrator.select", $$1.y()) : xi.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(flq $$0, int $$1, int $$2, cwm $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.f()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(flq $$0, int $$1, int $$2) {
            $$0.a(gjq::B, fqx.b, $$1, $$2, 18, 18);
         }
      }
   }
}
