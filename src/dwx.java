import com.mojang.serialization.Codec;

public class dwx extends dwy {
   public static final Codec<dwx> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dwx::new, $$0 -> $$0.b).codec();
   private final float b;

   @Override
   protected dwz<?> a() {
      return dwz.b;
   }

   public dwx(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(dwy.a $$0) {
      auw $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            hx $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, dfs.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            hx $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, dfs.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            hx $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, dfs.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            hx $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, dfs.c, $$0);
            }
         }
      });
   }

   private static void a(hx $$0, dkg $$1, dwy.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (hx var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
