import com.mojang.serialization.Codec;

public class dst extends dru<duk> {
   public dst(Codec<duk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drw<duk> $$0) {
      duk $$1 = $$0.f();
      auv $$2 = $$0.d();
      cuk $$3 = $$0.b();
      dle $$4 = $$0.c();
      hx $$5 = $$0.e();

      for (dto $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
