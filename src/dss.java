import com.mojang.serialization.MapCodec;

public class dss extends dju {
   public static final MapCodec<dss> a = b(dss::new);
   protected static final fbs b = djk.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dss> a() {
      return a;
   }

   protected dss(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, buj $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof arc && $$3 instanceof cqs) {
         $$1.a(new ji($$2), true, $$3);
      }
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return b;
   }

   @Override
   protected boolean b(dwv $$0, dfl $$1, ji $$2) {
      esx $$3 = $$1.b_($$2);
      esx $$4 = $$1.b_($$2.d());
      return ($$3.a() == esy.c || $$0.b() instanceof dnk) && $$4.a() == esy.a;
   }
}
