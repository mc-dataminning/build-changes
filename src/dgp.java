import com.mojang.serialization.MapCodec;

public class dgp extends dfb {
   public static final MapCodec<dgp> a = b(dgp::new);
   public static final dsv b = dsu.w;
   public static final dsv c = dsu.r;

   @Override
   protected MapCodec<? extends dgp> a() {
      return a;
   }

   public dgp(dsd.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof arf $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3, iz $$4, boolean $$5) {
      if ($$1 instanceof arf $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dse $$0, arf $$1, iz $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dse $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? awa.fG : awa.fH, awb.e);
         }

         $$1.a($$2, $$4.a(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(dse $$0) {
      return true;
   }

   @Override
   protected int a(dse $$0, dca $$1, iz $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
