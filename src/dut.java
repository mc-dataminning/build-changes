import com.mojang.serialization.Codec;

public class dut extends dur {
   public static final Codec<dut> a = Codec.unit(() -> dut.b);
   public static final dut b = new dut();

   @Override
   protected dus<?> a() {
      return dus.a;
   }

   @Override
   public void a(dur.a $$0) {
      ats $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            ht $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, ddt.d);
            }
         }

         if ($$1.a(3) > 0) {
            ht $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, ddt.f);
            }
         }

         if ($$1.a(3) > 0) {
            ht $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, ddt.e);
            }
         }

         if ($$1.a(3) > 0) {
            ht $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, ddt.c);
            }
         }
      });
   }
}
