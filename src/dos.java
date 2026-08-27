import com.mojang.serialization.Codec;

public class dos extends dnl<dqh> {
   public dos(Codec<dqh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dqh> $$0) {
      dqh $$1 = $$0.f();
      cqe $$2 = $$0.b();
      gv $$3 = $$0.e();
      dey $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof cuo) {
            if (!$$2.t($$3.c())) {
               return false;
            }

            cuo.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
