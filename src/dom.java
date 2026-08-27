import com.mojang.serialization.Codec;

public class dom extends dnn<dqd> {
   public dom(Codec<dqd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnp<dqd> $$0) {
      dqd $$1 = $$0.f();
      aru $$2 = $$0.d();
      cqg $$3 = $$0.b();
      dgx $$4 = $$0.c();
      gu $$5 = $$0.e();

      for (dph $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
