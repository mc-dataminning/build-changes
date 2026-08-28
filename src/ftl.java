import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ftl extends fuk {
   private static final wp b = wp.c("createWorld.customize.flat.title");
   static final akv c = akv.b("container/slot");
   private static final int d = 18;
   private static final int s = 20;
   private static final int u = 1;
   private static final int v = 1;
   private static final int w = 2;
   private static final int x = 2;
   private final fsg y = new fsg(this, 33, 64);
   protected final fzj a;
   private final Consumer<elo> z;
   elo A;
   @Nullable
   private ftl.a B;
   @Nullable
   private fos C;

   public ftl(fzj $$0, Consumer<elo> $$1, elo $$2) {
      super(b);
      this.a = $$0;
      this.z = $$1;
      this.A = $$2;
   }

   public elo l() {
      return this.A;
   }

   public void a(elo $$0) {
      this.A = $$0;
      if (this.B != null) {
         this.B.b();
         this.m();
      }
   }

   @Override
   protected void aR_() {
      this.y.a(this.l, this.p);
      this.B = this.y.c(new ftl.a());
      fsk $$0 = this.y.b(fsk.d().a(4));
      $$0.c().e();
      fsk $$1 = $$0.a(fsk.e().a(8));
      fsk $$2 = $$0.a(fsk.e().a(8));
      this.C = $$1.a(fos.a(wp.c("createWorld.customize.flat.removeLayer"), $$0x -> {
         if (this.E()) {
            List<ell> $$1x = this.A.e();
            int $$2x = this.B.aH_().indexOf(this.B.p());
            int $$3 = $$1x.size() - $$2x - 1;
            $$1x.remove($$3);
            this.B.a($$1x.isEmpty() ? null : this.B.aH_().get(Math.min($$2x, $$1x.size() - 1)));
            this.A.g();
            this.B.b();
            this.m();
         }
      }).a());
      $$1.a(fos.a(wp.c("createWorld.customize.presets"), $$0x -> {
         this.m.a(new fug(this));
         this.A.g();
         this.m();
      }).a());
      $$2.a(fos.a(wo.d, $$0x -> {
         this.z.accept(this.A);
         this.aO_();
         this.A.g();
      }).a());
      $$2.a(fos.a(wo.e, $$0x -> {
         this.aO_();
         this.A.g();
      }).a());
      this.A.g();
      this.m();
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

   void m() {
      if (this.C != null) {
         this.C.j = this.E();
      }
   }

   private boolean E() {
      return this.B != null && this.B.p() != null;
   }

   @Override
   public void aO_() {
      this.m.a(this.a);
   }

   class a extends fpo<ftl.a.a> {
      private static final wp m = wp.c("createWorld.customize.flat.tile").a(n.t);
      private static final wp n = wp.c("createWorld.customize.flat.height").a(n.t);

      public a() {
         super(ftl.this.m, ftl.this.n, ftl.this.o - 103, 43, 24, (int)(9.0 * 1.5));

         for (int $$0 = 0; $$0 < ftl.this.A.e().size(); $$0++) {
            this.b(new ftl.a.a());
         }
      }

      public void a(@Nullable ftl.a.a $$0) {
         super.a($$0);
         ftl.this.m();
      }

      public void b() {
         int $$0 = this.aH_().indexOf(this.p());
         this.s();

         for (int $$1 = 0; $$1 < ftl.this.A.e().size(); $$1++) {
            this.b(new ftl.a.a());
         }

         List<ftl.a.a> $$2 = this.aH_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      @Override
      protected void a(fod $$0, int $$1, int $$2) {
         $$0.b(ftl.this.p, m, $$1, $$2, -1);
         $$0.b(ftl.this.p, n, $$1 + this.a() - ftl.this.p.a(n) - 8, $$2, -1);
      }

      class a extends fpo.a<ftl.a.a> {
         @Override
         public void a(fod $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            ell $$10 = ftl.this.A.e().get(ftl.this.A.e().size() - $$1 - 1);
            dww $$11 = $$10.b();
            cwo $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            int $$13 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(ftl.this.p, $$12.y(), $$3 + 18 + 5, $$13, -1);
            wp $$14;
            if ($$1 == 0) {
               $$14 = wp.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == ftl.this.A.e().size() - 1) {
               $$14 = wp.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$14 = wp.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.b(ftl.this.p, $$14, $$3 + $$4 - ftl.this.p.a($$14) - 8, $$13, -1);
         }

         private cwo a(dww $$0) {
            cwk $$1 = $$0.b().j();
            if ($$1 == cws.a) {
               if ($$0.a(djn.J)) {
                  $$1 = cws.rg;
               } else if ($$0.a(djn.K)) {
                  $$1 = cws.rh;
               }
            }

            return new cwo($$1);
         }

         @Override
         public wp a() {
            ell $$0 = ftl.this.A.e().get(ftl.this.A.e().size() - a.this.aH_().indexOf(this) - 1);
            cwo $$1 = this.a($$0.b());
            return (wp)(!$$1.f() ? wp.a("narrator.select", $$1.y()) : wo.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(fod $$0, int $$1, int $$2, cwo $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.f()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(fod $$0, int $$1, int $$2) {
            $$0.a(gmh::H, ftl.c, $$1, $$2, 18, 18);
         }
      }
   }
}
