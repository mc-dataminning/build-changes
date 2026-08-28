import com.mojang.serialization.Codec;

public class ehp extends efz<eik> {
   public ehp(Codec<eik> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egb<eik> $$0) {
      dhh $$1 = $$0.b();
      ji $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (jn $$3 : jn.values()) {
            if ($$3 != jn.a && dso.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, djp.ft.m().b(dso.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
