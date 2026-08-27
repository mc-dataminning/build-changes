import com.mojang.serialization.Codec;

public class dtm extends dtk {
   public static final Codec<dtm> a = Codec.unit(() -> dtm.b);
   public static final dtm b = new dtm();

   @Override
   protected dtl<?> a() {
      return dtl.a;
   }

   @Override
   public void a(dtk.a $$0) {
      ate $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            ht $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dcr.d);
            }
         }

         if ($$1.a(3) > 0) {
            ht $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dcr.f);
            }
         }

         if ($$1.a(3) > 0) {
            ht $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dcr.e);
            }
         }

         if ($$1.a(3) > 0) {
            ht $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dcr.c);
            }
         }
      });
   }
}
