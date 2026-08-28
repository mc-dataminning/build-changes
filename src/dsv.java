import com.mojang.serialization.MapCodec;

public class dsv extends djx {
   public static final MapCodec<dsv> a = b(dsv::new);
   protected static final fbv b = djn.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dsv> a() {
      return a;
   }

   protected dsv(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, bum $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof ard && $$3 instanceof cqv) {
         $$1.a(new ji($$2), true, $$3);
      }
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return b;
   }

   @Override
   protected boolean b(dwy $$0, dfo $$1, ji $$2) {
      eta $$3 = $$1.b_($$2);
      eta $$4 = $$1.b_($$2.d());
      return ($$3.a() == etb.c || $$0.b() instanceof dnn) && $$4.a() == etb.a;
   }
}
