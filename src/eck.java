import com.mojang.serialization.Codec;

public class eck extends ebl<eeb> {
   public eck(Codec<eeb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebn<eeb> $$0) {
      eeb $$1 = $$0.f();
      ayo $$2 = $$0.d();
      ddc $$3 = $$0.b();
      dui $$4 = $$0.c();
      ja $$5 = $$0.e();

      for (edf $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
