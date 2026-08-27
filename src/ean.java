import com.mojang.serialization.Codec;

public class ean extends eao {
   public static final Codec<ean> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(ean::new, $$0 -> $$0.b).codec();
   private final float b;

   @Override
   protected eap<?> a() {
      return eap.b;
   }

   public ean(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(eao.a $$0) {
      axd $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            ib $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, dix.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            ib $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, dix.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            ib $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, dix.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            ib $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, dix.c, $$0);
            }
         }
      });
   }

   private static void a(ib $$0, dns $$1, eao.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (ib var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
