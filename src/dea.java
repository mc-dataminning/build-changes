import com.mojang.serialization.MapCodec;

public class dea extends cvj {
   public static final MapCodec<dea> a = b(dea::new);
   protected static final ekn b = cva.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dea> a() {
      return a;
   }

   protected dea(dhh.d $$0) {
      super($$0);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, bkq $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof ame && $$3 instanceof cfn) {
         $$1.a(new ht($$2), true, $$3);
      }
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return b;
   }

   @Override
   protected boolean b(dhi $$0, crg $$1, ht $$2) {
      ecs $$3 = $$1.b_($$2);
      ecs $$4 = $$1.b_($$2.c());
      return ($$3.a() == ect.c || $$0.b() instanceof cyx) && $$4.a() == ect.a;
   }
}
