import com.mojang.serialization.MapCodec;

public class epp extends epn {
   public static final MapCodec<epp> a = MapCodec.unit(() -> epp.b);
   public static final epp b = new epp();

   @Override
   protected epo<?> a() {
      return epo.a;
   }

   @Override
   public void a(epn.a $$0) {
      azz $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            iw $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, dwr.d);
            }
         }

         if ($$1.a(3) > 0) {
            iw $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, dwr.f);
            }
         }

         if ($$1.a(3) > 0) {
            iw $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, dwr.e);
            }
         }

         if ($$1.a(3) > 0) {
            iw $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, dwr.c);
            }
         }
      });
   }
}
