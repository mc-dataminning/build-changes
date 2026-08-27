import com.mojang.serialization.Codec;

public class dsj extends dsh {
   public static final Codec<dsj> a = Codec.unit(() -> dsj.b);
   public static final dsj b = new dsj();

   @Override
   protected dsi<?> a() {
      return dsi.a;
   }

   @Override
   public void a(dsh.a $$0) {
      art $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            gv $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dbe.c);
            }
         }

         if ($$1.a(3) > 0) {
            gv $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dbe.e);
            }
         }

         if ($$1.a(3) > 0) {
            gv $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dbe.d);
            }
         }

         if ($$1.a(3) > 0) {
            gv $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dbe.b);
            }
         }
      });
   }
}
