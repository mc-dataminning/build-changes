import com.mojang.serialization.Codec;

public class dyx extends dyv {
   public static final Codec<dyx> a = Codec.unit(() -> dyx.b);
   public static final dyx b = new dyx();

   @Override
   protected dyw<?> a() {
      return dyw.a;
   }

   @Override
   public void a(dyv.a $$0) {
      awp $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            hz $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dhm.d);
            }
         }

         if ($$1.a(3) > 0) {
            hz $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dhm.f);
            }
         }

         if ($$1.a(3) > 0) {
            hz $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dhm.e);
            }
         }

         if ($$1.a(3) > 0) {
            hz $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dhm.c);
            }
         }
      });
   }
}
