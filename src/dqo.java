import com.mojang.serialization.Codec;

public class dqo extends drc<dtn> {
   public dqo(Codec<dtn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dtn> $$0) {
      ctt $$1 = $$0.b();
      hv $$2 = $$0.e();
      auf $$3 = $$0.d();
      if ($$1.t($$2) && $$1.a_($$2.d()).a(cwb.fz)) {
         cxe.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
