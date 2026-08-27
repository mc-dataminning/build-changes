import com.mojang.serialization.MapCodec;

public class czt extends czj implements cvd {
   public static final MapCodec<czt> a = b(czt::new);

   @Override
   public MapCodec<czt> a() {
      return a;
   }

   public czt(dhh.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return true;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      $$0.a($$2.d(), czu.c(), 2);
   }
}
