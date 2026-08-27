import com.mojang.serialization.Codec;

public class edy extends edz {
   public static final Codec<edy> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(edy::new, $$0 -> $$0.b).codec();
   private final float b;

   @Override
   protected eea<?> a() {
      return eea.b;
   }

   public edy(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(edz.a $$0) {
      ayg $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            in $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, dma.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            in $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, dma.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            in $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, dma.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            in $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, dma.c, $$0);
            }
         }
      });
   }

   private static void a(in $$0, dqy $$1, edz.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (in var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
