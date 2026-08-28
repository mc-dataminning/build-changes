import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fmy extends fnx {
   static final akq b = akq.b("container/slot");
   private static final int c = 18;
   private static final int q = 20;
   private static final int r = 1;
   private static final int s = 1;
   private static final int u = 2;
   private static final int v = 2;
   protected final fsw a;
   private final Consumer<ehp> w;
   ehp x;
   private wy y;
   private wy z;
   private fmy.a A;
   private fig B;

   public fmy(fsw $$0, Consumer<ehp> $$1, ehp $$2) {
      super(wy.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   public ehp l() {
      return this.x;
   }

   public void a(ehp $$0) {
      this.x = $$0;
   }

   @Override
   protected void aP_() {
      this.y = wy.c("createWorld.customize.flat.tile");
      this.z = wy.c("createWorld.customize.flat.height");
      this.A = this.c(new fmy.a());
      this.B = this.c(fig.a(wy.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.D()) {
            List<ehm> $$1 = this.x.e();
            int $$2 = this.A.aG_().indexOf(this.A.h());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.A.a($$1.isEmpty() ? null : this.A.aG_().get(Math.min($$2, $$1.size() - 1)));
            this.x.g();
            this.A.c();
            this.m();
         }
      }).a(this.m / 2 - 155, this.n - 52, 150, 20).a());
      this.c(fig.a(wy.c("createWorld.customize.presets"), $$0 -> {
         this.l.a(new fnt(this));
         this.x.g();
         this.m();
      }).a(this.m / 2 + 5, this.n - 52, 150, 20).a());
      this.c(fig.a(wx.d, $$0 -> {
         this.w.accept(this.x);
         this.l.a(this.a);
         this.x.g();
      }).a(this.m / 2 - 155, this.n - 28, 150, 20).a());
      this.c(fig.a(wx.e, $$0 -> {
         this.l.a(this.a);
         this.x.g();
      }).a(this.m / 2 + 5, this.n - 28, 150, 20).a());
      this.x.g();
      this.m();
   }

   void m() {
      this.B.j = this.D();
   }

   private boolean D() {
      return this.A.h() != null;
   }

   @Override
   public void d() {
      this.l.a(this.a);
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 8, 16777215);
      int $$4 = this.m / 2 - 92 - 16;
      $$0.b(this.o, this.y, $$4, 32, 16777215);
      $$0.b(this.o, this.z, $$4 + 2 + 213 - this.o.a(this.z), 32, 16777215);
   }

   class a extends fjc<fmy.a.a> {
      public a() {
         super(fmy.this.l, fmy.this.m, fmy.this.n - 103, 43, 24);

         for (int $$0 = 0; $$0 < fmy.this.x.e().size(); $$0++) {
            this.b(new fmy.a.a());
         }
      }

      public void a(@Nullable fmy.a.a $$0) {
         super.a($$0);
         fmy.this.m();
      }

      public void c() {
         int $$0 = this.aG_().indexOf(this.h());
         this.k();

         for (int $$1 = 0; $$1 < fmy.this.x.e().size(); $$1++) {
            this.b(new fmy.a.a());
         }

         List<fmy.a.a> $$2 = this.aG_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends fjc.a<fmy.a.a> {
         @Override
         public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            ehm $$10 = fmy.this.x.e().get(fmy.this.x.e().size() - $$1 - 1);
            dta $$11 = $$10.b();
            cuo $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(fmy.this.o, $$12.w(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            wy $$13;
            if ($$1 == 0) {
               $$13 = wy.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fmy.this.x.e().size() - 1) {
               $$13 = wy.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = wy.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(fmy.this.o, $$13, $$3 + 2 + 213 - fmy.this.o.a($$13), $$2 + 3, 16777215, false);
         }

         private cuo a(dta $$0) {
            cuj $$1 = $$0.b().r();
            if ($$1 == cur.a) {
               if ($$0.a(dfy.G)) {
                  $$1 = cur.qz;
               } else if ($$0.a(dfy.H)) {
                  $$1 = cur.qA;
               }
            }

            return new cuo($$1);
         }

         @Override
         public wy a() {
            ehm $$0 = fmy.this.x.e().get(fmy.this.x.e().size() - a.this.aG_().indexOf(this) - 1);
            cuo $$1 = this.a($$0.b());
            return (wy)(!$$1.e() ? wy.a("narrator.select", $$1.w()) : wx.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(fht $$0, int $$1, int $$2, cuo $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.e()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(fht $$0, int $$1, int $$2) {
            $$0.a(fmy.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
