import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ejg extends ejh {
   public static final MapCodec<ejg> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(ejg::new, $$0 -> $$0.b);
   private final float b;

   @Override
   protected eji<?> a() {
      return eji.b;
   }

   public ejg(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(ejh.a $$0) {
      azs $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            jh $$3 = $$2.h();
            if ($$0.a($$3)) {
               a($$3, dra.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jh $$4 = $$2.i();
            if ($$0.a($$4)) {
               a($$4, dra.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jh $$5 = $$2.f();
            if ($$0.a($$5)) {
               a($$5, dra.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jh $$6 = $$2.g();
            if ($$0.a($$6)) {
               a($$6, dra.c, $$0);
            }
         }
      });
   }

   private static void a(jh $$0, dwa $$1, ejh.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (jh var4 = $$0.e(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.e();
      }
   }
}
