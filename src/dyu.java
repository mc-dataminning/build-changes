import com.mojang.serialization.Codec;

public class dyu extends dxv<eal> {
   public dyu(Codec<eal> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dxx<eal> $$0) {
      eal $$1 = $$0.f();
      axr $$2 = $$0.d();
      czs $$3 = $$0.b();
      dqw $$4 = $$0.c();
      ib $$5 = $$0.e();

      for (dzp $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
