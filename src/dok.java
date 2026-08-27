import com.mojang.serialization.Codec;

public class dok extends dnl<dqb> {
   public dok(Codec<dqb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dqb> $$0) {
      dqb $$1 = $$0.f();
      art $$2 = $$0.d();
      cqe $$3 = $$0.b();
      dgv $$4 = $$0.c();
      gv $$5 = $$0.e();

      for (dpf $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
