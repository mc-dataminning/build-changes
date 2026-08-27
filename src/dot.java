import com.mojang.serialization.Codec;

public class dot extends dnm<dqi> {
   public dot(Codec<dqi> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dno<dqi> $$0) {
      dqi $$1 = $$0.f();
      cqf $$2 = $$0.b();
      gu $$3 = $$0.e();
      dez $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof cup) {
            if (!$$2.t($$3.c())) {
               return false;
            }

            cup.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
