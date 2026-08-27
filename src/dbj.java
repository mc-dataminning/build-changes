import com.mojang.serialization.MapCodec;

public class dbj extends cva implements cvd {
   public static final MapCodec<dbj> a = b(dbj::new);

   @Override
   public MapCodec<dbj> a() {
      return a;
   }

   public dbj(dhh.d $$0) {
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
      $$0.b($$2.d(), cvc.sG.o());
   }
}
