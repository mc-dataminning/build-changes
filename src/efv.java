import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class efv extends efw {
   public static final MapCodec<efv> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(efv::new, $$0 -> $$0.b);
   private final float b;

   @Override
   protected efx<?> a() {
      return efx.b;
   }

   public efv(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(efw.a $$0) {
      azh $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            iz $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, dnx.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            iz $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, dnx.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            iz $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, dnx.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            iz $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, dnx.c, $$0);
            }
         }
      });
   }

   private static void a(iz $$0, dsv $$1, efw.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (iz var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
