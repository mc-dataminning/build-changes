import com.mojang.serialization.Codec;

public class dwi extends dwj {
   public static final Codec<dwi> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dwi::new, $$0 -> $$0.b).codec();
   private final float b;

   @Override
   protected dwk<?> a() {
      return dwk.b;
   }

   public dwi(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(dwj.a $$0) {
      aup $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            hx $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, dfd.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            hx $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, dfd.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            hx $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, dfd.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            hx $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, dfd.c, $$0);
            }
         }
      });
   }

   private static void a(hx $$0, djr $$1, dwj.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (hx var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
