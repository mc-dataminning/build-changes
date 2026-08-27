import com.mojang.serialization.MapCodec;

public class dla extends dch {
   public static final MapCodec<dla> a = b(dla::new);
   protected static final est b = dby.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dla> a() {
      return a;
   }

   protected dla(doy.d $$0) {
      super($$0);
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, bpv $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof aps && $$3 instanceof clq) {
         $$1.a(new ib($$2), true, $$3);
      }
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return b;
   }

   @Override
   protected boolean b(doz $$0, cyd $$1, ib $$2) {
      eks $$3 = $$1.b_($$2);
      eks $$4 = $$1.b_($$2.c());
      return ($$3.a() == ekt.c || $$0.b() instanceof dfv) && $$4.a() == ekt.a;
   }
}
