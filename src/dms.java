import com.mojang.serialization.MapCodec;

public class dms extends dvr {
   public static final MapCodec<dms> a = b(dms::new);
   private static final ffk b = dmf.b(14.0, 0.0, 12.0);

   @Override
   public MapCodec<? extends dms> a() {
      return a;
   }

   public dms(eag.d $$0) {
      super($$0);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return b;
   }

   @Override
   protected boolean b(eah $$0, dig $$1, iu $$2) {
      eah $$3 = $$1.a_($$2);
      return $$3.a(dmh.eg) || $$3.a($$1, $$2, ja.b, duq.b);
   }
}
