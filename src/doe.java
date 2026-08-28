import com.mojang.serialization.MapCodec;

public class doe extends dgh implements dgb {
   public static final MapCodec<doe> a = b(doe::new);
   protected static final float b = 6.0F;
   protected static final ext c = dfy.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<doe> a() {
      return a;
   }

   protected doe(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return c;
   }

   @Override
   public boolean b(dcz $$0, jd $$1, dtc $$2) {
      return true;
   }

   @Override
   public boolean a(dcw $$0, ayw $$1, jd $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqu $$0, ayw $$1, jd $$2, dtc $$3) {
      dig $$4 = (dig)($$3.a(dga.bu) ? dga.iI : dga.iH);
      if ($$4.o().a($$0, $$2) && $$0.u($$2.d())) {
         dig.a($$0, $$4.o(), $$2, 2);
      }
   }
}
