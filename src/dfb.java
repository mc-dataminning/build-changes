import com.mojang.serialization.MapCodec;

public class dfb extends cys implements cyv {
   public static final MapCodec<dfb> a = b(dfb::new);

   @Override
   public MapCodec<dfb> a() {
      return a;
   }

   public dfb(dli.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return true;
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      $$0.b($$2.d(), cyu.sG.o());
   }

   @Override
   public hz a(hz $$0) {
      return $$0.d();
   }
}
