import com.mojang.serialization.MapCodec;

public class duv extends dvr implements dmi {
   public static final MapCodec<duv> a = b(duv::new);
   private static final ffk b = dmf.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<duv> a() {
      return a;
   }

   protected duv(eag.d $$0) {
      super($$0);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return b;
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return o($$2).m().a($$0, $$1) && $$0.v($$1.d());
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      doo.a($$0, o($$3).m(), $$2, 2);
   }

   private static doo o(eah $$0) {
      return (doo)($$0.a(dmh.bB) ? dmh.jk : dmh.jj);
   }
}
