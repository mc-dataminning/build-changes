import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class epk extends epn {
   public static final MapCodec<epk> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(epk::new, $$0 -> $$0.b);
   private final float b;

   @Override
   protected epo<?> a() {
      return epo.b;
   }

   public epk(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(epn.a $$0) {
      azz $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            iw $$3 = $$2.h();
            if ($$0.a($$3)) {
               a($$3, dwr.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            iw $$4 = $$2.i();
            if ($$0.a($$4)) {
               a($$4, dwr.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            iw $$5 = $$2.f();
            if ($$0.a($$5)) {
               a($$5, dwr.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            iw $$6 = $$2.g();
            if ($$0.a($$6)) {
               a($$6, dwr.c, $$0);
            }
         }
      });
   }

   private static void a(iw $$0, ebx $$1, epn.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (iw var4 = $$0.e(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.e();
      }
   }
}
