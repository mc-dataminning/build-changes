import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class egv extends egw {
   public static final MapCodec<egv> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(egv::new, $$0 -> $$0.b);
   private final float b;

   @Override
   protected egx<?> a() {
      return egx.b;
   }

   public egv(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(egw.a $$0) {
      ayv $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            jd $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, dot.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jd $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, dot.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jd $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, dot.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jd $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, dot.c, $$0);
            }
         }
      });
   }

   private static void a(jd $$0, dtr $$1, egw.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (jd var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
