import com.mojang.serialization.Codec;

public class dpc extends dnm<dpx> {
   public dpc(Codec<dpx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dno<dpx> $$0) {
      cqf $$1 = $$0.b();
      gu $$2 = $$0.e();
      $$0.f();
      if (!$$1.t($$2)) {
         return false;
      } else {
         for (ha $$3 : ha.values()) {
            if ($$3 != ha.a && dbf.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, csm.ff.n().a(dbf.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
