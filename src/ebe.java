import com.mojang.serialization.Codec;

public class ebe extends dzx<ect> {
   public ebe(Codec<ect> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzz<ect> $$0) {
      ect $$1 = $$0.f();
      dbs $$2 = $$0.b();
      io $$3 = $$0.e();
      drb $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dgg) {
            if (!$$2.u($$3.c())) {
               return false;
            }

            dgg.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
