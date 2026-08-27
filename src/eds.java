import com.mojang.serialization.Codec;

public class eds extends edq {
   public static final Codec<eds> a = Codec.unit(() -> eds.b);
   public static final eds b = new eds();

   @Override
   protected edr<?> a() {
      return edr.a;
   }

   @Override
   public void a(edq.a $$0) {
      ayd $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            im $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dlr.d);
            }
         }

         if ($$1.a(3) > 0) {
            im $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dlr.f);
            }
         }

         if ($$1.a(3) > 0) {
            im $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dlr.e);
            }
         }

         if ($$1.a(3) > 0) {
            im $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dlr.c);
            }
         }
      });
   }
}
