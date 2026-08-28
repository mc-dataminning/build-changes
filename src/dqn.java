import com.mojang.serialization.MapCodec;

public class dqn extends dhs {
   public static final MapCodec<dqn> a = b(dqn::new);
   protected static final ezm b = dhj.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dqn> a() {
      return a;
   }

   protected dqn(dun.d $$0) {
      super($$0);
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, bto $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof arh && $$3 instanceof cpu) {
         $$1.a(new je($$2), true, $$3);
      }
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return b;
   }

   @Override
   protected boolean b(duo $$0, ddl $$1, je $$2) {
      eqp $$3 = $$1.b_($$2);
      eqp $$4 = $$1.b_($$2.d());
      return ($$3.a() == eqq.c || $$0.b() instanceof dlh) && $$4.a() == eqq.a;
   }
}
