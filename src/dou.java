import com.mojang.serialization.Codec;

public class dou extends dnw<dqn> {
   public dou(Codec<dqn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dny<dqn> $$0) {
      dqn $$1 = $$0.f();
      asc $$2 = $$0.d();
      gw $$3 = $$0.e();
      cqp $$4 = $$0.b();
      int $$5 = 0;
      gw.a $$6 = new gw.a();
      int $$7 = $$1.b() + 1;
      int $$8 = $$1.c() + 1;

      for (int $$9 = 0; $$9 < $$1.a(); $$9++) {
         $$6.a($$3, $$2.a($$7) - $$2.a($$7), $$2.a($$8) - $$2.a($$8), $$2.a($$7) - $$2.a($$7));
         if ($$1.d().a().a($$4, $$0.c(), $$2, $$6)) {
            $$5++;
         }
      }

      return $$5 > 0;
   }
}
