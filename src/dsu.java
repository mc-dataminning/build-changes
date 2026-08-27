import com.mojang.serialization.Codec;

public class dsu extends dss {
   public static final Codec<dsu> a = Codec.unit(() -> dsu.b);
   public static final dsu b = new dsu();

   @Override
   protected dst<?> a() {
      return dst.a;
   }

   @Override
   public void a(dss.a $$0) {
      asc $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            gw $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dbp.c);
            }
         }

         if ($$1.a(3) > 0) {
            gw $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dbp.e);
            }
         }

         if ($$1.a(3) > 0) {
            gw $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dbp.d);
            }
         }

         if ($$1.a(3) > 0) {
            gw $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dbp.b);
            }
         }
      });
   }
}
