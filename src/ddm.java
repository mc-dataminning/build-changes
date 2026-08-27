import com.mojang.serialization.MapCodec;

public class ddm extends dby {
   public static final MapCodec<ddm> a = b(ddm::new);
   public static final dpq b = dpp.w;
   public static final dpq c = dpp.r;

   @Override
   protected MapCodec<? extends ddm> a() {
      return a;
   }

   public ddm(doy.d $$0) {
      super($$0);
      this.k(this.n().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof aps $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, dby $$3, ib $$4, boolean $$5) {
      if ($$1 instanceof aps $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(doz $$0, aps $$1, ib $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         doz $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? aum.fB : aum.fC, aun.e);
         }

         $$1.a($$2, $$4.a(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean d_(doz $$0) {
      return true;
   }

   @Override
   protected int a(doz $$0, cyx $$1, ib $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
