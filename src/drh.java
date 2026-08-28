import com.mojang.serialization.MapCodec;

public class drh extends din {
   public static final MapCodec<drh> a = b(drh::new);
   protected static final fah b = die.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<drh> a() {
      return a;
   }

   protected drh(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, bue $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof arn && $$3 instanceof cqm) {
         $$1.a(new jh($$2), true, $$3);
      }
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return b;
   }

   @Override
   protected boolean b(dvj $$0, deg $$1, jh $$2) {
      erk $$3 = $$1.b_($$2);
      erk $$4 = $$1.b_($$2.d());
      return ($$3.a() == erl.c || $$0.b() instanceof dmb) && $$4.a() == erl.a;
   }
}
