import com.mojang.serialization.Codec;

public class dsm extends drn<dud> {
   public dsm(Codec<dud> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drp<dud> $$0) {
      dud $$1 = $$0.f();
      aup $$2 = $$0.d();
      cud $$3 = $$0.b();
      dkx $$4 = $$0.c();
      hx $$5 = $$0.e();

      for (dth $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
