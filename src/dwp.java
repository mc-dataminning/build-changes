import com.mojang.serialization.Codec;

public class dwp extends dvq<dyg> {
   public dwp(Codec<dyg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvs<dyg> $$0) {
      dyg $$1 = $$0.f();
      axd $$2 = $$0.d();
      cxu $$3 = $$0.b();
      dow $$4 = $$0.c();
      ib $$5 = $$0.e();

      for (dxk $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
