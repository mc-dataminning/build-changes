import com.mojang.serialization.MapCodec;

public class daj extends cuj {
   public static final MapCodec<daj> a = b(daj::new);
   protected static final float b = 6.0F;
   protected static final eiy c = cua.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<daj> a() {
      return a;
   }

   protected daj(dga.d $$0) {
      super($$0);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return c;
   }

   @Override
   protected boolean d(dgb $$0, cqf $$1, ht $$2) {
      return $$0.a(aqs.aK) || $$0.a(cuc.dX) || super.d($$0, $$1, $$2);
   }
}
