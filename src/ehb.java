import com.mojang.serialization.Codec;

public class ehb extends ehc {
   public static final Codec<ehb> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(ehb::new, $$0 -> $$0.b).codec();
   private final float b;

   @Override
   protected ehd<?> a() {
      return ehd.b;
   }

   public ehb(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(ehc.a $$0) {
      ayt $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            ir $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, doo.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            ir $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, doo.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            ir $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, doo.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            ir $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, doo.c, $$0);
            }
         }
      });
   }

   private static void a(ir $$0, dtt $$1, ehc.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (ir var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
