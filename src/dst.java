import com.mojang.serialization.Codec;

public class dst extends dsu {
   public static final Codec<dst> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dst::new, $$0 -> $$0.b).codec();
   private final float b;

   @Override
   protected dsv<?> a() {
      return dsv.b;
   }

   public dst(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(dsu.a $$0) {
      ase $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            gw $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, dbr.c, $$0);
            }
         }

         if ($$1.i() < this.b) {
            gw $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, dbr.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            gw $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, dbr.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            gw $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, dbr.b, $$0);
            }
         }
      });
   }

   private static void a(gw $$0, dgc $$1, dsu.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (gw var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
