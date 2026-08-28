import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class elq extends elt {
   public static final MapCodec<elq> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(elq::new, $$0 -> $$0.b);
   private final float b;

   @Override
   protected elu<?> a() {
      return elu.b;
   }

   public elq(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(elt.a $$0) {
      azh $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            ji $$3 = $$2.h();
            if ($$0.a($$3)) {
               a($$3, dtg.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            ji $$4 = $$2.i();
            if ($$0.a($$4)) {
               a($$4, dtg.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            ji $$5 = $$2.f();
            if ($$0.a($$5)) {
               a($$5, dtg.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            ji $$6 = $$2.g();
            if ($$0.a($$6)) {
               a($$6, dtg.c, $$0);
            }
         }
      });
   }

   private static void a(ji $$0, dyh $$1, elt.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (ji var4 = $$0.e(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.e();
      }
   }
}
