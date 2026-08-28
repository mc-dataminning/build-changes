import com.mojang.serialization.MapCodec;

public class dob extends dfh {
   public static final MapCodec<dob> a = b(dob::new);
   protected static final ewj b = dey.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dob> a() {
      return a;
   }

   protected dob(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, bst $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof are && $$3 instanceof cou) {
         $$1.a(new iz($$2), true, $$3);
      }
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return b;
   }

   @Override
   protected boolean b(dsb $$0, dbd $$1, iz $$2) {
      enu $$3 = $$1.b_($$2);
      enu $$4 = $$1.b_($$2.c());
      return ($$3.a() == env.c || $$0.b() instanceof diw) && $$4.a() == env.a;
   }
}
