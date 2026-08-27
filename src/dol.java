import com.mojang.serialization.Codec;

public class dol extends dnm<dqc> {
   public dol(Codec<dqc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dno<dqc> $$0) {
      dqc $$1 = $$0.f();
      aru $$2 = $$0.d();
      cqf $$3 = $$0.b();
      dgw $$4 = $$0.c();
      gu $$5 = $$0.e();

      for (dpg $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
