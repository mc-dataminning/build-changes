import com.mojang.serialization.Codec;

public class don extends dnm<dqe> {
   public don(Codec<dqe> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dno<dqe> $$0) {
      cqf $$1 = $$0.b();
      gu $$2 = $$0.e();
      dqe $$3 = $$0.f();

      for (dpy.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
