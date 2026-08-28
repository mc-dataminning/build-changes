import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fss extends ftr {
   private static final xk b = xk.c("createWorld.customize.flat.title");
   static final alp c = alp.b("container/slot");
   private static final int d = 18;
   private static final int s = 20;
   private static final int u = 1;
   private static final int v = 1;
   private static final int w = 2;
   private static final int x = 2;
   private final frn y = new frn(this, 33, 64);
   protected final fyq a;
   private final Consumer<emg> z;
   emg A;
   @Nullable
   private fss.a B;
   @Nullable
   private fny C;

   public fss(fyq $$0, Consumer<emg> $$1, emg $$2) {
      super(b);
      this.a = $$0;
      this.z = $$1;
      this.A = $$2;
   }

   public emg k() {
      return this.A;
   }

   public void a(emg $$0) {
      this.A = $$0;
   }

   @Override
   protected void aT_() {
      this.y.a(this.l, this.p);
      this.B = this.y.c(new fss.a());
      frr $$0 = this.y.b(frr.d().a(4));
      $$0.c().e();
      frr $$1 = $$0.a(frr.e().a(8));
      frr $$2 = $$0.a(frr.e().a(8));
      this.C = $$1.a(fny.a(xk.c("createWorld.customize.flat.removeLayer"), $$0x -> {
         if (this.E()) {
            List<emd> $$1x = this.A.e();
            int $$2x = this.B.aI_().indexOf(this.B.g());
            int $$3 = $$1x.size() - $$2x - 1;
            $$1x.remove($$3);
            this.B.a($$1x.isEmpty() ? null : this.B.aI_().get(Math.min($$2x, $$1x.size() - 1)));
            this.A.g();
            this.B.b();
            this.l();
         }
      }).a());
      $$1.a(fny.a(xk.c("createWorld.customize.presets"), $$0x -> {
         this.m.a(new ftn(this));
         this.A.g();
         this.l();
      }).a());
      $$2.a(fny.a(xj.d, $$0x -> {
         this.z.accept(this.A);
         this.aP_();
         this.A.g();
      }).a());
      $$2.a(fny.a(xj.e, $$0x -> {
         this.aP_();
         this.A.g();
      }).a());
      this.A.g();
      this.l();
      this.y.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      if (this.B != null) {
         this.B.a(this.n, this.y);
      }

      this.y.a();
   }

   void l() {
      if (this.C != null) {
         this.C.j = this.E();
      }
   }

   private boolean E() {
      return this.B != null && this.B.g() != null;
   }

   @Override
   public void aP_() {
      this.m.a(this.a);
   }

   class a extends fov<fss.a.a> {
      private static final xk m = xk.c("createWorld.customize.flat.tile").a(n.t);
      private static final xk n = xk.c("createWorld.customize.flat.height").a(n.t);

      public a() {
         super(fss.this.m, fss.this.n, fss.this.o - 103, 43, 24);
         this.a(true, (int)(9.0 * 1.5));

         for (int $$0 = 0; $$0 < fss.this.A.e().size(); $$0++) {
            this.b(new fss.a.a());
         }
      }

      public void a(@Nullable fss.a.a $$0) {
         super.a($$0);
         fss.this.l();
      }

      public void b() {
         int $$0 = this.aI_().indexOf(this.g());
         this.j();

         for (int $$1 = 0; $$1 < fss.this.A.e().size(); $$1++) {
            this.b(new fss.a.a());
         }

         List<fss.a.a> $$2 = this.aI_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      @Override
      protected void a(fnl $$0, int $$1, int $$2) {
         $$0.b(fss.this.p, m, $$1, $$2, -1);
         $$0.b(fss.this.p, n, $$1 + this.a() - fss.this.p.a(n) - 8, $$2, -1);
      }

      class a extends fov.a<fss.a.a> {
         @Override
         public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            emd $$10 = fss.this.A.e().get(fss.this.A.e().size() - $$1 - 1);
            dxo $$11 = $$10.b();
            cxg $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            int $$13 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fss.this.p, $$12.y(), $$3 + 18 + 5, $$13, -1);
            xk $$14;
            if ($$1 == 0) {
               $$14 = xk.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fss.this.A.e().size() - 1) {
               $$14 = xk.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$14 = xk.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.b(fss.this.p, $$14, $$3 + $$4 - fss.this.p.a($$14) - 8, $$13, -1);
         }

         private cxg a(dxo $$0) {
            cxc $$1 = $$0.b().j();
            if ($$1 == cxk.a) {
               if ($$0.a(dkf.J)) {
                  $$1 = cxk.rg;
               } else if ($$0.a(dkf.K)) {
                  $$1 = cxk.rh;
               }
            }

            return new cxg($$1);
         }

         @Override
         public xk a() {
            emd $$0 = fss.this.A.e().get(fss.this.A.e().size() - a.this.aI_().indexOf(this) - 1);
            cxg $$1 = this.a($$0.b());
            return (xk)(!$$1.f() ? xk.a("narrator.select", $$1.y()) : xj.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(fnl $$0, int $$1, int $$2, cxg $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.f()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(fnl $$0, int $$1, int $$2) {
            $$0.a(glq::H, fss.c, $$1, $$2, 18, 18);
         }
      }
   }
}
