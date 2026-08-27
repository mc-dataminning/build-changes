import com.mojang.serialization.Codec;

public class dnd extends dnr<dqc> {
   public dnd(Codec<dqc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnt<dqc> $$0) {
      cqk $$1 = $$0.b();
      gw $$2 = $$0.e();
      arx $$3 = $$0.d();
      if ($$1.t($$2) && $$1.a_($$2.d()).a(csr.fz)) {
         ctu.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
