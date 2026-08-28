import com.mojang.serialization.Codec;

public class efv extends eew<ehm> {
   public efv(Codec<ehm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eey<ehm> $$0) {
      ehm $$1 = $$0.f();
      azu $$2 = $$0.d();
      dgk $$3 = $$0.b();
      dxr $$4 = $$0.c();
      jh $$5 = $$0.e();

      for (egq $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
