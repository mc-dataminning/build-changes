import com.mojang.serialization.MapCodec;

public class elw extends elu {
   public static final MapCodec<elw> a = MapCodec.unit(() -> elw.b);
   public static final elw b = new elw();

   @Override
   protected elv<?> a() {
      return elv.a;
   }

   @Override
   public void a(elu.a $$0) {
      bam $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            jh $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, dtl.d);
            }
         }

         if ($$1.a(3) > 0) {
            jh $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, dtl.f);
            }
         }

         if ($$1.a(3) > 0) {
            jh $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, dtl.e);
            }
         }

         if ($$1.a(3) > 0) {
            jh $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, dtl.c);
            }
         }
      });
   }
}
