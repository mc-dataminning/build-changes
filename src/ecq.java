import com.mojang.serialization.Codec;

public class ecq extends ecr {
   public static final Codec<ecq> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(ecq::new, $$0 -> $$0.b).codec();
   private final float b;

   @Override
   protected ecs<?> a() {
      return ecs.b;
   }

   public ecq(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(ecr.a $$0) {
      axr $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            ib $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, dkt.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            ib $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, dkt.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            ib $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, dkt.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            ib $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, dkt.c, $$0);
            }
         }
      });
   }

   private static void a(ib $$0, dpq $$1, ecr.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (ib var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
