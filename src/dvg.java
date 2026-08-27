import com.mojang.serialization.Codec;

public class dvg extends dtz<dwv> {
   public dvg(Codec<dwv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dub<dwv> $$0) {
      dwv $$1 = $$0.f();
      cwm $$2 = $$0.b();
      hz $$3 = $$0.e();
      dlj $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dba) {
            if (!$$2.u($$3.c())) {
               return false;
            }

            dba.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
