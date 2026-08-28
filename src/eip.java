import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eip extends eiq {
   public static final MapCodec<eip> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(eip::new, $$0 -> $$0.b);
   private final float b;

   @Override
   protected eir<?> a() {
      return eir.b;
   }

   public eip(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(eiq.a $$0) {
      azn $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            jf $$3 = $$2.h();
            if ($$0.a($$3)) {
               a($$3, dqj.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jf $$4 = $$2.i();
            if ($$0.a($$4)) {
               a($$4, dqj.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jf $$5 = $$2.f();
            if ($$0.a($$5)) {
               a($$5, dqj.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jf $$6 = $$2.g();
            if ($$0.a($$6)) {
               a($$6, dqj.c, $$0);
            }
         }
      });
   }

   private static void a(jf $$0, dvj $$1, eiq.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (jf var4 = $$0.e(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.e();
      }
   }
}
