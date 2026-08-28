import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eil extends eim {
   public static final MapCodec<eil> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(eil::new, $$0 -> $$0.b);
   private final float b;

   @Override
   protected ein<?> a() {
      return ein.b;
   }

   public eil(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(eim.a $$0) {
      azl $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            je $$3 = $$2.h();
            if ($$0.a($$3)) {
               a($$3, dqg.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            je $$4 = $$2.i();
            if ($$0.a($$4)) {
               a($$4, dqg.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            je $$5 = $$2.f();
            if ($$0.a($$5)) {
               a($$5, dqg.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            je $$6 = $$2.g();
            if ($$0.a($$6)) {
               a($$6, dqg.c, $$0);
            }
         }
      });
   }

   private static void a(je $$0, dvf $$1, eim.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (je var4 = $$0.e(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.e();
      }
   }
}
