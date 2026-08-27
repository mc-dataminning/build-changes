import com.mojang.serialization.Codec;

public class dzj extends dzx<eci> {
   public dzj(Codec<eci> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzz<eci> $$0) {
      dbs $$1 = $$0.b();
      io $$2 = $$0.e();
      ayk $$3 = $$0.d();
      if ($$1.u($$2) && $$1.a_($$2.d()).a(dea.fz)) {
         dfd.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
