import com.mojang.serialization.MapCodec;

public class ejd extends ejb {
   public static final MapCodec<ejd> a = MapCodec.unit(() -> ejd.b);
   public static final ejd b = new ejd();

   @Override
   protected ejc<?> a() {
      return ejc.a;
   }

   @Override
   public void a(ejb.a $$0) {
      azr $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            jg $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, dqu.d);
            }
         }

         if ($$1.a(3) > 0) {
            jg $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, dqu.f);
            }
         }

         if ($$1.a(3) > 0) {
            jg $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, dqu.e);
            }
         }

         if ($$1.a(3) > 0) {
            jg $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, dqu.c);
            }
         }
      });
   }
}
