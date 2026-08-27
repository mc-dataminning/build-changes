import com.mojang.serialization.Codec;

public class dsu extends drn<duj> {
   public dsu(Codec<duj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drp<duj> $$0) {
      duj $$1 = $$0.f();
      cud $$2 = $$0.b();
      hx $$3 = $$0.e();
      dja $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof cyr) {
            if (!$$2.u($$3.c())) {
               return false;
            }

            cyr.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
