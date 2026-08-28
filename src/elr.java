import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class elr extends elt {
   public static final MapCodec<elr> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(elr::new, $$0 -> $$0.b);
   private final float b;

   @Override
   protected elu<?> a() {
      return elu.b;
   }

   public elr(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(elt.a $$0) {
      bam $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            jh $$3 = $$2.h();
            if ($$0.a($$3)) {
               a($$3, dtk.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jh $$4 = $$2.i();
            if ($$0.a($$4)) {
               a($$4, dtk.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jh $$5 = $$2.f();
            if ($$0.a($$5)) {
               a($$5, dtk.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jh $$6 = $$2.g();
            if ($$0.a($$6)) {
               a($$6, dtk.c, $$0);
            }
         }
      });
   }

   private static void a(jh $$0, dyl $$1, elt.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (jh var4 = $$0.e(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.e();
      }
   }
}
