import com.mojang.serialization.Codec;

public class duv extends duw {
   public static final Codec<duv> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(duv::new, $$0 -> $$0.b).codec();
   private final float b;

   @Override
   protected dux<?> a() {
      return dux.b;
   }

   public duv(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(duw.a $$0) {
      atw $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            hx $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, ddy.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            hx $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, ddy.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            hx $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, ddy.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            hx $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, ddy.c, $$0);
            }
         }
      });
   }

   private static void a(hx $$0, die $$1, duw.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (hx var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
