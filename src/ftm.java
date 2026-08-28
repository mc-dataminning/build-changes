import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ftm extends ful {
   private static final wp b = wp.c("createWorld.customize.flat.title");
   static final akv c = akv.b("container/slot");
   private static final int d = 18;
   private static final int s = 20;
   private static final int u = 1;
   private static final int v = 1;
   private static final int w = 2;
   private static final int x = 2;
   private final fsh y = new fsh(this, 33, 64);
   protected final fzk a;
   private final Consumer<elp> z;
   elp A;
   @Nullable
   private ftm.a B;
   @Nullable
   private fot C;

   public ftm(fzk $$0, Consumer<elp> $$1, elp $$2) {
      super(b);
      this.a = $$0;
      this.z = $$1;
      this.A = $$2;
   }

   public elp l() {
      return this.A;
   }

   public void a(elp $$0) {
      this.A = $$0;
      if (this.B != null) {
         this.B.b();
         this.m();
      }
   }

   @Override
   protected void aR_() {
      this.y.a(this.l, this.p);
      this.B = this.y.c(new ftm.a());
      fsl $$0 = this.y.b(fsl.d().a(4));
      $$0.c().e();
      fsl $$1 = $$0.a(fsl.e().a(8));
      fsl $$2 = $$0.a(fsl.e().a(8));
      this.C = $$1.a(fot.a(wp.c("createWorld.customize.flat.removeLayer"), $$0x -> {
         if (this.E()) {
            List<elm> $$1x = this.A.e();
            int $$2x = this.B.aH_().indexOf(this.B.p());
            int $$3 = $$1x.size() - $$2x - 1;
            $$1x.remove($$3);
            this.B.a($$1x.isEmpty() ? null : this.B.aH_().get(Math.min($$2x, $$1x.size() - 1)));
            this.A.g();
            this.B.b();
            this.m();
         }
      }).a());
      $$1.a(fot.a(wp.c("createWorld.customize.presets"), $$0x -> {
         this.m.a(new fuh(this));
         this.A.g();
         this.m();
      }).a());
      $$2.a(fot.a(wo.d, $$0x -> {
         this.z.accept(this.A);
         this.aO_();
         this.A.g();
      }).a());
      $$2.a(fot.a(wo.e, $$0x -> {
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

   class a extends fpp<ftm.a.a> {
      private static final wp m = wp.c("createWorld.customize.flat.tile").a(n.t);
      private static final wp n = wp.c("createWorld.customize.flat.height").a(n.t);

      public a() {
         super(ftm.this.m, ftm.this.n, ftm.this.o - 103, 43, 24, (int)(9.0 * 1.5));

         for (int $$0 = 0; $$0 < ftm.this.A.e().size(); $$0++) {
            this.b(new ftm.a.a());
         }
      }

      public void a(@Nullable ftm.a.a $$0) {
         super.a($$0);
         ftm.this.m();
      }

      public void b() {
         int $$0 = this.aH_().indexOf(this.p());
         this.s();

         for (int $$1 = 0; $$1 < ftm.this.A.e().size(); $$1++) {
            this.b(new ftm.a.a());
         }

         List<ftm.a.a> $$2 = this.aH_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      @Override
      protected void a(foe $$0, int $$1, int $$2) {
         $$0.b(ftm.this.p, m, $$1, $$2, -1);
         $$0.b(ftm.this.p, n, $$1 + this.a() - ftm.this.p.a(n) - 8, $$2, -1);
      }

      class a extends fpp.a<ftm.a.a> {
         @Override
         public void a(foe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            elm $$10 = ftm.this.A.e().get(ftm.this.A.e().size() - $$1 - 1);
            dwx $$11 = $$10.b();
            cwp $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            int $$13 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(ftm.this.p, $$12.y(), $$3 + 18 + 5, $$13, -1);
            wp $$14;
            if ($$1 == 0) {
               $$14 = wp.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == ftm.this.A.e().size() - 1) {
               $$14 = wp.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$14 = wp.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.b(ftm.this.p, $$14, $$3 + $$4 - ftm.this.p.a($$14) - 8, $$13, -1);
         }

         private cwp a(dwx $$0) {
            cwl $$1 = $$0.b().j();
            if ($$1 == cwt.a) {
               if ($$0.a(djo.J)) {
                  $$1 = cwt.rg;
               } else if ($$0.a(djo.K)) {
                  $$1 = cwt.rh;
               }
            }

            return new cwp($$1);
         }

         @Override
         public wp a() {
            elm $$0 = ftm.this.A.e().get(ftm.this.A.e().size() - a.this.aH_().indexOf(this) - 1);
            cwp $$1 = this.a($$0.b());
            return (wp)(!$$1.f() ? wp.a("narrator.select", $$1.y()) : wo.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(foe $$0, int $$1, int $$2, cwp $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.f()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(foe $$0, int $$1, int $$2) {
            $$0.a(gmi::H, ftm.c, $$1, $$2, 18, 18);
         }
      }
   }
}
