import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ejk extends ejl {
   public static final MapCodec<ejk> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(ejk::new, $$0 -> $$0.b);
   private final float b;

   @Override
   protected ejm<?> a() {
      return ejm.b;
   }

   public ejk(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(ejl.a $$0) {
      azv $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            jh $$3 = $$2.h();
            if ($$0.a($$3)) {
               a($$3, drf.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jh $$4 = $$2.i();
            if ($$0.a($$4)) {
               a($$4, drf.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jh $$5 = $$2.f();
            if ($$0.a($$5)) {
               a($$5, drf.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jh $$6 = $$2.g();
            if ($$0.a($$6)) {
               a($$6, drf.c, $$0);
            }
         }
      });
   }

   private static void a(jh $$0, dwf $$1, ejl.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (jh var4 = $$0.e(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.e();
      }
   }
}
