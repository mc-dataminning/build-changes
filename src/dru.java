import com.mojang.serialization.MapCodec;

public class dru extends dju implements djn {
   public static final MapCodec<dru> a = b(dru::new);
   protected static final float b = 6.0F;
   protected static final fbs c = djk.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dru> a() {
      return a;
   }

   protected dru(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return c;
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      return o($$2).m().a($$0, $$1) && $$0.u($$1.d());
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      dlt.a($$0, o($$3).m(), $$2, 2);
   }

   private static dlt o(dwv $$0) {
      return (dlt)($$0.a(djm.bB) ? djm.jg : djm.jf);
   }
}
