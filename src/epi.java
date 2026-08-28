import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class epi extends epl {
   public static final MapCodec<epi> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(epi::new, $$0 -> $$0.b);
   private final float b;

   @Override
   protected epm<?> a() {
      return epm.b;
   }

   public epi(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(epl.a $$0) {
      azx $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            iv $$3 = $$2.h();
            if ($$0.a($$3)) {
               a($$3, dwp.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            iv $$4 = $$2.i();
            if ($$0.a($$4)) {
               a($$4, dwp.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            iv $$5 = $$2.f();
            if ($$0.a($$5)) {
               a($$5, dwp.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            iv $$6 = $$2.g();
            if ($$0.a($$6)) {
               a($$6, dwp.c, $$0);
            }
         }
      });
   }

   private static void a(iv $$0, ebv $$1, epl.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (iv var4 = $$0.e(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.e();
      }
   }
}
