import com.mojang.serialization.Codec;

public class dqz extends dqa<dsq> {
   public dqz(Codec<dsq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dqc<dsq> $$0) {
      dsq $$1 = $$0.f();
      atw $$2 = $$0.d();
      csz $$3 = $$0.b();
      djk $$4 = $$0.c();
      hx $$5 = $$0.e();

      for (dru $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
