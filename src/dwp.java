import com.mojang.serialization.Codec;

public class dwp extends dwq {
   public static final Codec<dwp> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dwp::new, $$0 -> $$0.b).codec();
   private final float b;

   @Override
   protected dwr<?> a() {
      return dwr.b;
   }

   public dwp(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(dwq.a $$0) {
      auv $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            hx $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, dfk.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            hx $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, dfk.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            hx $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, dfk.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            hx $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, dfk.c, $$0);
            }
         }
      });
   }

   private static void a(hx $$0, djy $$1, dwq.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (hx var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
