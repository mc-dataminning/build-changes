import com.mojang.serialization.Codec;

public class elv extends ekw<enn> {
   public elv(Codec<enn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<enn> $$0) {
      enn $$1 = $$0.f();
      bai $$2 = $$0.d();
      dli $$3 = $$0.b();
      edo $$4 = $$0.c();
      iw $$5 = $$0.e();

      for (emq $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
