import com.mojang.serialization.Codec;

public class dom extends dnl<dqd> {
   public dom(Codec<dqd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dqd> $$0) {
      cqe $$1 = $$0.b();
      gv $$2 = $$0.e();
      dqd $$3 = $$0.f();

      for (dpx.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
