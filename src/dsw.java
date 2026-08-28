import com.mojang.serialization.MapCodec;

public class dsw extends dlg {
   public static final MapCodec<dsw> n = b(dsw::new);

   @Override
   public MapCodec<dsw> a() {
      return n;
   }

   public dsw(dxn.d $$0) {
      super(() -> dus.c, $$0);
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dwm($$0, $$1);
   }

   @Override
   protected axc<alp> c() {
      return axf.i.b(axf.ai);
   }

   @Override
   protected boolean f_(dxo $$0) {
      return true;
   }

   @Override
   protected int a(dxo $$0, dge $$1, jh $$2, jm $$3) {
      return azu.a(dux.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dxo $$0, dge $$1, jh $$2, jm $$3) {
      return $$3 == jm.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
