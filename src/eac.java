import com.mojang.serialization.Codec;

public class eac extends dzd<ebt> {
   public eac(Codec<ebt> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzf<ebt> $$0) {
      ebt $$1 = $$0.f();
      ayg $$2 = $$0.d();
      day $$3 = $$0.b();
      dse $$4 = $$0.c();
      in $$5 = $$0.e();

      for (eax $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
