import com.mojang.serialization.Codec;

public class eiy extends ehr<ekn> {
   public eiy(Codec<ekn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eht<ekn> $$0) {
      ekn $$1 = $$0.f();
      dio $$2 = $$0.b();
      jj $$3 = $$0.e();
      dym $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dnd) {
            if (!$$2.u($$3.d())) {
               return false;
            }

            dnd.a($$2, $$4, $$3, 2);
         } else if ($$4.b() instanceof dpw) {
            dpw.a($$2, $$3, $$2.C_(), 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         if ($$1.b()) {
            $$2.a($$3, $$2.a_($$3).b(), 1);
         }

         return true;
      } else {
         return false;
      }
   }
}
