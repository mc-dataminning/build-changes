import com.mojang.serialization.Codec;

public class dsm extends dsn {
   public static final Codec<dsm> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dsm::new, $$0 -> $$0.b).codec();
   private final float b;

   @Override
   protected dso<?> a() {
      return dso.b;
   }

   public dsm(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(dsn.a $$0) {
      arx $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            gw $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, dbk.c, $$0);
            }
         }

         if ($$1.i() < this.b) {
            gw $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, dbk.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            gw $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, dbk.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            gw $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, dbk.b, $$0);
            }
         }
      });
   }

   private static void a(gw $$0, dfv $$1, dsn.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (gw var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
