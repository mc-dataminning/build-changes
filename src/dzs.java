import com.mojang.serialization.Codec;

public class dzs extends dzq {
   public static final Codec<dzs> a = Codec.unit(() -> dzs.b);
   public static final dzs b = new dzs();

   @Override
   protected dzr<?> a() {
      return dzr.a;
   }

   @Override
   public void a(dzq.a $$0) {
      awt $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            ib $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dia.d);
            }
         }

         if ($$1.a(3) > 0) {
            ib $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dia.f);
            }
         }

         if ($$1.a(3) > 0) {
            ib $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dia.e);
            }
         }

         if ($$1.a(3) > 0) {
            ib $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dia.c);
            }
         }
      });
   }
}
