import com.mojang.serialization.MapCodec;

public class dag extends cys {
   public static final MapCodec<dag> a = b(dag::new);
   public static final dma b = dlz.w;
   public static final dma c = dlz.r;

   @Override
   protected MapCodec<? extends dag> a() {
      return a;
   }

   public dag(dli.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof aow $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, cys $$3, hz $$4, boolean $$5) {
      if ($$1 instanceof aow $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dlj $$0, aow $$1, hz $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dlj $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? atl.ft : atl.fu, atm.e);
         }

         $$1.a($$2, $$4.a(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean d_(dlj $$0) {
      return true;
   }

   @Override
   protected int a(dlj $$0, cvr $$1, hz $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
