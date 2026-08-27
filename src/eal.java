import com.mojang.serialization.Codec;

public class eal extends eam {
   public static final Codec<eal> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(eal::new, $$0 -> $$0.b).codec();
   private final float b;

   @Override
   protected ean<?> a() {
      return ean.b;
   }

   public eal(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(eam.a $$0) {
      axd $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            ib $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, div.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            ib $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, div.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            ib $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, div.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            ib $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, div.c, $$0);
            }
         }
      });
   }

   private static void a(ib $$0, dnq $$1, eam.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (ib var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
