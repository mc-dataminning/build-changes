import com.mojang.serialization.Codec;

public class elj extends ejt<eme> {
   public elj(Codec<eme> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejv<eme> $$0) {
      dkg $$1 = $$0.b();
      iv $$2 = $$0.e();
      $$0.f();
      if (!$$1.v($$2)) {
         return false;
      } else {
         for (jb $$3 : jb.values()) {
            if ($$3 != jb.a && dvz.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dmo.fx.m().b(dvz.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
