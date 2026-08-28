import com.mojang.serialization.Codec;

public class edc extends ecd<eet> {
   public edc(Codec<eet> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecf<eet> $$0) {
      eet $$1 = $$0.f();
      ayw $$2 = $$0.d();
      dds $$3 = $$0.b();
      duz $$4 = $$0.c();
      jd $$5 = $$0.e();

      for (edx $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
