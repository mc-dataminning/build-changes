import com.mojang.serialization.MapCodec;

public class epn extends epl {
   public static final MapCodec<epn> a = MapCodec.unit(() -> epn.b);
   public static final epn b = new epn();

   @Override
   protected epm<?> a() {
      return epm.a;
   }

   @Override
   public void a(epl.a $$0) {
      azx $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            iv $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, dwp.d);
            }
         }

         if ($$1.a(3) > 0) {
            iv $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, dwp.f);
            }
         }

         if ($$1.a(3) > 0) {
            iv $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, dwp.e);
            }
         }

         if ($$1.a(3) > 0) {
            iv $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, dwp.c);
            }
         }
      });
   }
}
