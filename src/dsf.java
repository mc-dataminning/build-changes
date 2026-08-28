import com.mojang.serialization.MapCodec;

public class dsf extends doc {
   public static final MapCodec<dsf> a = b(dsf::new);
   private static final ffk[] b = dmf.a(7, $$0 -> dmf.b(16.0, 0.0, (double)(2 + $$0)));

   @Override
   public MapCodec<dsf> a() {
      return a;
   }

   public dsf(eag.d $$0) {
      super($$0);
   }

   @Override
   protected diz d() {
      return czh.vq;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return b[this.h($$0)];
   }
}
