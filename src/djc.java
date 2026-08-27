import com.mojang.serialization.MapCodec;

public class djc extends daj {
   public static final MapCodec<djc> a = b(djc::new);
   protected static final eqk b = daa.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<djc> a() {
      return a;
   }

   protected djc(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, bow $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof apf && $$3 instanceof ckp) {
         $$1.a(new ib($$2), true, $$3);
      }
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return b;
   }

   @Override
   protected boolean b(dmz $$0, cwf $$1, ib $$2) {
      ein $$3 = $$1.b_($$2);
      ein $$4 = $$1.b_($$2.c());
      return ($$3.a() == eio.c || $$0.b() instanceof ddx) && $$4.a() == eio.a;
   }
}
