import com.mojang.serialization.MapCodec;

public class dmp extends dvr implements dmi {
   public static final MapCodec<dmp> a = b(dmp::new);
   private static final ffk b = dmf.b(16.0, 0.0, 13.0);

   @Override
   public MapCodec<dmp> a() {
      return a;
   }

   protected dmp(eag.d $$0) {
      super($$0);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return b;
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return dmi.a_($$0, $$1, $$2);
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      dmi.a((dja)$$0, $$2, $$3).ifPresent($$1x -> $$0.b($$1x, this.m()));
   }
}
