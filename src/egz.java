import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class egz extends eha {
   public static final MapCodec<egz> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(egz::new, $$0 -> $$0.b);
   private final float b;

   @Override
   protected ehb<?> a() {
      return ehb.b;
   }

   public egz(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(eha.a $$0) {
      ayw $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            jd $$3 = $$2.h();
            if ($$0.a($$3)) {
               a($$3, dov.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jd $$4 = $$2.i();
            if ($$0.a($$4)) {
               a($$4, dov.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jd $$5 = $$2.f();
            if ($$0.a($$5)) {
               a($$5, dov.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jd $$6 = $$2.g();
            if ($$0.a($$6)) {
               a($$6, dov.c, $$0);
            }
         }
      });
   }

   private static void a(jd $$0, dtt $$1, eha.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (jd var4 = $$0.e(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.e();
      }
   }
}
