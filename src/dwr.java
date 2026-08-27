import com.mojang.serialization.Codec;

public class dwr extends dvs<dyi> {
   public dwr(Codec<dyi> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvu<dyi> $$0) {
      dyi $$1 = $$0.f();
      axd $$2 = $$0.d();
      cxw $$3 = $$0.b();
      doy $$4 = $$0.c();
      ib $$5 = $$0.e();

      for (dxm $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
