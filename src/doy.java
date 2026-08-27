import com.mojang.serialization.Codec;

public class doy extends dnr<dqn> {
   public doy(Codec<dqn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnt<dqn> $$0) {
      dqn $$1 = $$0.f();
      cqk $$2 = $$0.b();
      gw $$3 = $$0.e();
      dfe $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof cuu) {
            if (!$$2.t($$3.c())) {
               return false;
            }

            cuu.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
