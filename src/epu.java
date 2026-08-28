import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class epu extends epx {
   public static final MapCodec<epu> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(epu::new, $$0 -> $$0.b);
   private final float b;

   @Override
   protected epy<?> a() {
      return epy.b;
   }

   public epu(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(epx.a $$0) {
      bai $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            iw $$3 = $$2.h();
            if ($$0.a($$3)) {
               a($$3, dxb.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            iw $$4 = $$2.i();
            if ($$0.a($$4)) {
               a($$4, dxb.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            iw $$5 = $$2.f();
            if ($$0.a($$5)) {
               a($$5, dxb.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            iw $$6 = $$2.g();
            if ($$0.a($$6)) {
               a($$6, dxb.c, $$0);
            }
         }
      });
   }

   private static void a(iw $$0, ech $$1, epx.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (iw var4 = $$0.e(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.e();
      }
   }
}
