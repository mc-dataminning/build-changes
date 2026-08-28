import com.mojang.serialization.MapCodec;

public class dqq extends dhv {
   public static final MapCodec<dqq> a = b(dqq::new);
   protected static final ezq b = dhm.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dqq> a() {
      return a;
   }

   protected dqq(dur.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, btr $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof arj && $$3 instanceof cpx) {
         $$1.a(new jf($$2), true, $$3);
      }
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return b;
   }

   @Override
   protected boolean b(dus $$0, ddo $$1, jf $$2) {
      eqt $$3 = $$1.b_($$2);
      eqt $$4 = $$1.b_($$2.d());
      return ($$3.a() == equ.c || $$0.b() instanceof dlk) && $$4.a() == equ.a;
   }
}
