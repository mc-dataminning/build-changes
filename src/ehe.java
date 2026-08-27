import com.mojang.serialization.Codec;

public class ehe extends ehc {
   public static final Codec<ehe> a = Codec.unit(() -> ehe.b);
   public static final ehe b = new ehe();

   @Override
   protected ehd<?> a() {
      return ehd.a;
   }

   @Override
   public void a(ehc.a $$0) {
      ayt $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            ir $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, doo.d);
            }
         }

         if ($$1.a(3) > 0) {
            ir $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, doo.f);
            }
         }

         if ($$1.a(3) > 0) {
            ir $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, doo.e);
            }
         }

         if ($$1.a(3) > 0) {
            ir $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, doo.c);
            }
         }
      });
   }
}
