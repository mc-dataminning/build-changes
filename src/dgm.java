import com.mojang.serialization.MapCodec;

public class dgm extends dig implements diy {
   public static final MapCodec<dgm> b = b(dgm::new);
   public static final dpq c = dpp.C;
   public static final dpq d = dpp.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<dgm> a() {
      return b;
   }

   public dgm(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ih.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public doz a(cuo $$0) {
      eks $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ekt.c;
      return this.n().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(c) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   protected int a(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(doz $$0, cyx $$1, ib $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(doz $$0, cyx $$1, ib $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      if ($$1.ab() && (long)$$1.z.a(200) <= $$1.Y() % 200L && $$2.v() == $$1.a(dur.a.b, $$2.u(), $$2.w()) - 1) {
         axn.a($$0.c(a).o(), $$1, $$2, 0.125, kl.aR, bnl.a(1, 2));
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.O().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(cyx $$0, doz $$1, erw $$2, ckl $$3) {
      if ($$0.ab() && $$3 instanceof cky && ((cky)$$3).K()) {
         ib $$4 = $$2.a();
         if ($$0.h($$4)) {
            bqn $$5 = bqb.al.a($$0);
            if ($$5 != null) {
               $$5.e(esa.c($$4.c()));
               bpv $$6 = $$3.u();
               $$5.b($$6 instanceof apt ? (apt)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, aum.zl, aun.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(doz $$0) {
      return true;
   }
}
