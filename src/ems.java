import com.mojang.serialization.MapCodec;

public class ems extends emq {
   public static final MapCodec<ems> a = MapCodec.unit(() -> ems.b);
   public static final ems b = new ems();

   @Override
   protected emr<?> a() {
      return emr.a;
   }

   @Override
   public void a(emq.a $$0) {
      azs $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            jj $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, dty.d);
            }
         }

         if ($$1.a(3) > 0) {
            jj $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, dty.f);
            }
         }

         if ($$1.a(3) > 0) {
            jj $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, dty.e);
            }
         }

         if ($$1.a(3) > 0) {
            jj $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, dty.c);
            }
         }
      });
   }
}
