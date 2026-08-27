import com.mojang.serialization.MapCodec;

public class dcd extends cuj implements cud {
   public static final MapCodec<dcd> a = b(dcd::new);
   protected static final float b = 6.0F;
   protected static final eiy c = cua.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dcd> a() {
      return a;
   }

   protected dcd(dga.d $$0) {
      super($$0);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return c;
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      return true;
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return true;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      cwg $$4 = (cwg)($$3.a(cuc.bu) ? cuc.iI : cuc.iH);
      if ($$4.o().a($$0, $$2) && $$0.t($$2.c())) {
         cwg.a($$0, $$4.o(), $$2, 2);
      }
   }
}
