import com.mojang.serialization.Codec;

public class dsw extends dsu {
   public static final Codec<dsw> a = Codec.unit(() -> dsw.b);
   public static final dsw b = new dsw();

   @Override
   protected dsv<?> a() {
      return dsv.a;
   }

   @Override
   public void a(dsu.a $$0) {
      ase $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            gw $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dbr.c);
            }
         }

         if ($$1.a(3) > 0) {
            gw $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dbr.e);
            }
         }

         if ($$1.a(3) > 0) {
            gw $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dbr.d);
            }
         }

         if ($$1.a(3) > 0) {
            gw $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dbr.b);
            }
         }
      });
   }
}
