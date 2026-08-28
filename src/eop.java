import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eop extends eos {
   public static final MapCodec<eop> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(eop::new, $$0 -> $$0.b);
   private final float b;

   @Override
   protected eot<?> a() {
      return eot.b;
   }

   public eop(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(eos.a $$0) {
      azv $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            iv $$3 = $$2.h();
            if ($$0.a($$3)) {
               a($$3, dvz.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            iv $$4 = $$2.i();
            if ($$0.a($$4)) {
               a($$4, dvz.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            iv $$5 = $$2.f();
            if ($$0.a($$5)) {
               a($$5, dvz.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            iv $$6 = $$2.g();
            if ($$0.a($$6)) {
               a($$6, dvz.c, $$0);
            }
         }
      });
   }

   private static void a(iv $$0, ebf $$1, eos.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (iv var4 = $$0.e(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.e();
      }
   }
}
