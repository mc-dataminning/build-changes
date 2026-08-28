import com.mojang.serialization.Codec;

public class egv extends efw<eim> {
   public egv(Codec<eim> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efy<eim> $$0) {
      eim $$1 = $$0.f();
      azg $$2 = $$0.d();
      dhe $$3 = $$0.b();
      dyr $$4 = $$0.c();
      ji $$5 = $$0.e();

      for (ehq $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
