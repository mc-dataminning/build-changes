import com.mojang.serialization.Codec;

public class efm extends eel<ehd> {
   public efm(Codec<ehd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(een<ehd> $$0) {
      dfy $$1 = $$0.b();
      jh $$2 = $$0.e();
      ehd $$3 = $$0.f();

      for (egx.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
