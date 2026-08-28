import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class enp extends ens {
   public static final MapCodec<enp> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(enp::new, $$0 -> $$0.b);
   private final float b;

   @Override
   protected ent<?> a() {
      return ent.b;
   }

   public enp(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(ens.a $$0) {
      azt $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            iu $$3 = $$2.h();
            if ($$0.a($$3)) {
               a($$3, dva.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            iu $$4 = $$2.i();
            if ($$0.a($$4)) {
               a($$4, dva.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            iu $$5 = $$2.f();
            if ($$0.a($$5)) {
               a($$5, dva.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            iu $$6 = $$2.g();
            if ($$0.a($$6)) {
               a($$6, dva.c, $$0);
            }
         }
      });
   }

   private static void a(iu $$0, eaf $$1, ens.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (iu var4 = $$0.e(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.e();
      }
   }
}
