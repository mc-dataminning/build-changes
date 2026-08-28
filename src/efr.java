import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class efr extends efs {
   public static final MapCodec<efr> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(efr::new, $$0 -> $$0.b);
   private final float b;

   @Override
   protected eft<?> a() {
      return eft.b;
   }

   public efr(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(efs.a $$0) {
      azf $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            iz $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, dnt.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            iz $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, dnt.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            iz $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, dnt.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            iz $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, dnt.c, $$0);
            }
         }
      });
   }

   private static void a(iz $$0, dsr $$1, efs.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (iz var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
