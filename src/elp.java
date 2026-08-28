import com.mojang.serialization.MapCodec;

public class elp extends eln {
   public static final MapCodec<elp> a = MapCodec.unit(() -> elp.b);
   public static final elp b = new elp();

   @Override
   protected elo<?> a() {
      return elo.a;
   }

   @Override
   public void a(eln.a $$0) {
      bac $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            jh $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, dte.d);
            }
         }

         if ($$1.a(3) > 0) {
            jh $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, dte.f);
            }
         }

         if ($$1.a(3) > 0) {
            jh $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, dte.e);
            }
         }

         if ($$1.a(3) > 0) {
            jh $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, dte.c);
            }
         }
      });
   }
}
