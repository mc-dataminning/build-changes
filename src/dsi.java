import com.mojang.serialization.Codec;

public class dsi extends dsj {
   public static final Codec<dsi> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dsi::new, $$0 -> $$0.b).codec();
   private final float b;

   @Override
   protected dsk<?> a() {
      return dsk.b;
   }

   public dsi(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(dsj.a $$0) {
      aru $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            gu $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, dbg.c, $$0);
            }
         }

         if ($$1.i() < this.b) {
            gu $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, dbg.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            gu $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, dbg.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            gu $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, dbg.b, $$0);
            }
         }
      });
   }

   private static void a(gu $$0, dfr $$1, dsj.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (gu var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
