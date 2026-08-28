import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class emn extends emq {
   public static final MapCodec<emn> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(emn::new, $$0 -> $$0.b);
   private final float b;

   @Override
   protected emr<?> a() {
      return emr.b;
   }

   public emn(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(emq.a $$0) {
      azs $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            jj $$3 = $$2.h();
            if ($$0.a($$3)) {
               a($$3, dty.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jj $$4 = $$2.i();
            if ($$0.a($$4)) {
               a($$4, dty.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jj $$5 = $$2.f();
            if ($$0.a($$5)) {
               a($$5, dty.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jj $$6 = $$2.g();
            if ($$0.a($$6)) {
               a($$6, dty.c, $$0);
            }
         }
      });
   }

   private static void a(jj $$0, dzd $$1, emq.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (jj var4 = $$0.e(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.e();
      }
   }
}
