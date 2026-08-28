import com.mojang.serialization.Codec;

public class elo extends ejy<emj> {
   public elo(Codec<emj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eka<emj> $$0) {
      dkl $$1 = $$0.b();
      iv $$2 = $$0.e();
      $$0.f();
      if (!$$1.v($$2)) {
         return false;
      } else {
         for (jb $$3 : jb.values()) {
            if ($$3 != jb.a && dwe.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dmt.fx.m().b(dwe.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
