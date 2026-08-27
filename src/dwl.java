import com.mojang.serialization.Codec;

public class dwl extends dwj {
   public static final Codec<dwl> a = Codec.unit(() -> dwl.b);
   public static final dwl b = new dwl();

   @Override
   protected dwk<?> a() {
      return dwk.a;
   }

   @Override
   public void a(dwj.a $$0) {
      aup $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            hx $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dfd.d);
            }
         }

         if ($$1.a(3) > 0) {
            hx $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dfd.f);
            }
         }

         if ($$1.a(3) > 0) {
            hx $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dfd.e);
            }
         }

         if ($$1.a(3) > 0) {
            hx $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dfd.c);
            }
         }
      });
   }
}
