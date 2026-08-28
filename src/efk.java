import com.mojang.serialization.Codec;

public class efk extends eel<ehb> {
   public efk(Codec<ehb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(een<ehb> $$0) {
      ehb $$1 = $$0.f();
      azs $$2 = $$0.d();
      dfy $$3 = $$0.b();
      dxg $$4 = $$0.c();
      jh $$5 = $$0.e();

      for (egf $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
