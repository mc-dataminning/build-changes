import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class efz extends ega {
   public static final MapCodec<efz> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(efz::new, $$0 -> $$0.b);
   private final float b;

   @Override
   protected egb<?> a() {
      return egb.b;
   }

   public efz(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(ega.a $$0) {
      aym $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            ja $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, dob.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            ja $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, dob.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            ja $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, dob.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            ja $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, dob.c, $$0);
            }
         }
      });
   }

   private static void a(ja $$0, dsy $$1, ega.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (ja var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
