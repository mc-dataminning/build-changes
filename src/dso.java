import com.mojang.serialization.Codec;

public class dso extends dsm {
   public static final Codec<dso> a = Codec.unit(() -> dso.b);
   public static final dso b = new dso();

   @Override
   protected dsn<?> a() {
      return dsn.a;
   }

   @Override
   public void a(dsm.a $$0) {
      ash $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            gw $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dbt.d);
            }
         }

         if ($$1.a(3) > 0) {
            gw $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dbt.f);
            }
         }

         if ($$1.a(3) > 0) {
            gw $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dbt.e);
            }
         }

         if ($$1.a(3) > 0) {
            gw $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dbt.c);
            }
         }
      });
   }
}
