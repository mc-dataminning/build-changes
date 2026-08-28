import com.mojang.serialization.MapCodec;

public class dsw extends dmf implements dmi {
   public static final MapCodec<dsw> a = b(dsw::new);

   @Override
   public MapCodec<dsw> a() {
      return a;
   }

   public dsw(eag.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      $$0.b($$2.e(), dmh.tq.m());
   }

   @Override
   public iu a(iu $$0) {
      return $$0.e();
   }
}
