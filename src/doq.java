import com.mojang.serialization.Codec;

public class doq extends dnr<dqh> {
   public doq(Codec<dqh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnt<dqh> $$0) {
      dqh $$1 = $$0.f();
      arx $$2 = $$0.d();
      cqk $$3 = $$0.b();
      dhb $$4 = $$0.c();
      gw $$5 = $$0.e();

      for (dpl $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
