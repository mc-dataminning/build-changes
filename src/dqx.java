import com.mojang.serialization.MapCodec;

public class dqx extends djm {
   public static final MapCodec<dqx> n = b(dqx::new);

   @Override
   public MapCodec<dqx> a() {
      return n;
   }

   public dqx(dvn.d $$0) {
      super(() -> dst.c, $$0);
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dum($$0, $$1);
   }

   @Override
   protected awv<all> c() {
      return awy.i.b(awy.ai);
   }

   @Override
   protected boolean f_(dvo $$0) {
      return true;
   }

   @Override
   protected int a(dvo $$0, dek $$1, jh $$2, jm $$3) {
      return azn.a(dsy.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dvo $$0, dek $$1, jh $$2, jm $$3) {
      return $$3 == jm.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
