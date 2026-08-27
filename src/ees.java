import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ees extends eet {
   public static final MapCodec<ees> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(ees::new, $$0 -> $$0.b);
   private final float b;

   @Override
   protected eeu<?> a() {
      return eeu.b;
   }

   public ees(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(eet.a $$0) {
      ayk $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            io $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, dmu.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            io $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, dmu.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            io $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, dmu.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            io $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, dmu.c, $$0);
            }
         }
      });
   }

   private static void a(io $$0, drs $$1, eet.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (io var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
