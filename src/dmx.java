import com.mojang.serialization.Codec;

public class dmx extends dnl<dpw> {
   public dmx(Codec<dpw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dpw> $$0) {
      cqe $$1 = $$0.b();
      gv $$2 = $$0.e();
      art $$3 = $$0.d();
      if ($$1.t($$2) && $$1.a_($$2.d()).a(csl.fz)) {
         cto.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
