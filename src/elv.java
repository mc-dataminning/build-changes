import com.mojang.serialization.MapCodec;

public class elv extends elt {
   public static final MapCodec<elv> a = MapCodec.unit(() -> elv.b);
   public static final elv b = new elv();

   @Override
   protected elu<?> a() {
      return elu.a;
   }

   @Override
   public void a(elt.a $$0) {
      bam $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            jh $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, dtk.d);
            }
         }

         if ($$1.a(3) > 0) {
            jh $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, dtk.f);
            }
         }

         if ($$1.a(3) > 0) {
            jh $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, dtk.e);
            }
         }

         if ($$1.a(3) > 0) {
            jh $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, dtk.c);
            }
         }
      });
   }
}
