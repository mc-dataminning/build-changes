import com.mojang.serialization.Codec;

public class ema extends ekk<emw> {
   public ema(Codec<emw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ekm<emw> $$0) {
      dkw $$1 = $$0.b();
      iv $$2 = $$0.e();
      $$0.f();
      if (!$$1.v($$2)) {
         return false;
      } else {
         for (jb $$3 : jb.values()) {
            if ($$3 != jb.a && dwp.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dne.fx.m().b(dwp.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
