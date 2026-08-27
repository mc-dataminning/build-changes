import com.mojang.serialization.MapCodec;

public class ddl extends ddb implements cyv {
   public static final MapCodec<ddl> a = b(ddl::new);

   @Override
   public MapCodec<ddl> a() {
      return a;
   }

   public ddl(dli.d $$0) {
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
      $$0.a($$2.d(), ddm.c(), 2);
   }

   @Override
   public hz a(hz $$0) {
      return $$0.d();
   }
}
