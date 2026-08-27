import com.mojang.serialization.Codec;

public class dts extends dsc<dun> {
   public dts(Codec<dun> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dse<dun> $$0) {
      cus $$1 = $$0.b();
      hx $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (ic $$3 : ic.values()) {
            if ($$3 != ic.a && dfs.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, cxa.ff.o().a(dfs.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
