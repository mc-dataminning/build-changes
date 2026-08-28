import com.mojang.serialization.Codec;

public class efk extends edu<egf> {
   public efk(Codec<egf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(edw<egf> $$0) {
      dfg $$1 = $$0.b();
      jf $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (jk $$3 : jk.values()) {
            if ($$3 != jk.a && dqj.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dho.ff.n().b(dqj.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
