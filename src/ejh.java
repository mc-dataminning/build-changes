import com.mojang.serialization.Codec;

public class ejh extends ehr<ekc> {
   public ejh(Codec<ekc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eht<ekc> $$0) {
      dio $$1 = $$0.b();
      jj $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (jo $$3 : jo.values()) {
            if ($$3 != jo.a && dty.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dkw.ft.m().b(dty.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
