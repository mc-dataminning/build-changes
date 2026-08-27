import com.mojang.serialization.MapCodec;

public class cyd extends dar {
   public static final MapCodec<cyd> a = b(cyd::new);

   @Override
   public MapCodec<cyd> a() {
      return a;
   }

   public cyd(dfc.d $$0) {
      super($$0);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(iv.U, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
