import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class egf extends egg {
   public static final MapCodec<egf> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(egf::new, $$0 -> $$0.b);
   private final float b;

   @Override
   protected egh<?> a() {
      return egh.b;
   }

   public egf(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(egg.a $$0) {
      ayo $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            ja $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, dod.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            ja $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, dod.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            ja $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, dod.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            ja $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, dod.c, $$0);
            }
         }
      });
   }

   private static void a(ja $$0, dtb $$1, egg.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (ja var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
