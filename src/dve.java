import com.mojang.serialization.Codec;

public class dve extends dvs<dyd> {
   public dve(Codec<dyd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvu<dyd> $$0) {
      cxw $$1 = $$0.b();
      ib $$2 = $$0.e();
      axd $$3 = $$0.d();
      if ($$1.u($$2) && $$1.a_($$2.d()).a(dae.fz)) {
         dbh.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
