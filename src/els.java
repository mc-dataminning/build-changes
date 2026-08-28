import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class els extends elu {
   public static final MapCodec<els> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(els::new, $$0 -> $$0.b);
   private final float b;

   @Override
   protected elv<?> a() {
      return elv.b;
   }

   public els(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(elu.a $$0) {
      bam $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            jh $$3 = $$2.h();
            if ($$0.a($$3)) {
               a($$3, dtl.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jh $$4 = $$2.i();
            if ($$0.a($$4)) {
               a($$4, dtl.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jh $$5 = $$2.f();
            if ($$0.a($$5)) {
               a($$5, dtl.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jh $$6 = $$2.g();
            if ($$0.a($$6)) {
               a($$6, dtl.c, $$0);
            }
         }
      });
   }

   private static void a(jh $$0, dym $$1, elu.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (jh var4 = $$0.e(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.e();
      }
   }
}
