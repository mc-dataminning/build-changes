import com.mojang.serialization.Codec;

public class dte extends dts<dwd> {
   public dte(Codec<dwd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dtu<dwd> $$0) {
      cwi $$1 = $$0.b();
      hz $$2 = $$0.e();
      awo $$3 = $$0.d();
      if ($$1.u($$2) && $$1.a_($$2.d()).a(cyq.fz)) {
         czt.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
