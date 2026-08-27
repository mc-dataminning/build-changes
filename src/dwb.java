import com.mojang.serialization.Codec;

public class dwb extends duu<dxq> {
   public dwb(Codec<dxq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(duw<dxq> $$0) {
      dxq $$1 = $$0.f();
      cwz $$2 = $$0.b();
      ib $$3 = $$0.e();
      dme $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dbn) {
            if (!$$2.u($$3.c())) {
               return false;
            }

            dbn.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
