import com.mojang.serialization.Codec;

public class eho extends egp<ejf> {
   public eho(Codec<ejf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egr<ejf> $$0) {
      ejf $$1 = $$0.f();
      bac $$2 = $$0.d();
      dhx $$3 = $$0.b();
      dzk $$4 = $$0.c();
      jh $$5 = $$0.e();

      for (eij $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
