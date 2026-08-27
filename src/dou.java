import com.mojang.serialization.Codec;

public class dou extends dnn<dqj> {
   public dou(Codec<dqj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnp<dqj> $$0) {
      dqj $$1 = $$0.f();
      cqg $$2 = $$0.b();
      gu $$3 = $$0.e();
      dfa $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof cuq) {
            if (!$$2.t($$3.c())) {
               return false;
            }

            cuq.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
