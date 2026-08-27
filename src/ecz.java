import com.mojang.serialization.Codec;

public class ecz extends eda {
   public static final Codec<ecz> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(ecz::new, $$0 -> $$0.b).codec();
   private final float b;

   @Override
   protected edb<?> a() {
      return edb.b;
   }

   public ecz(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(eda.a $$0) {
      axt $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            id $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, dlc.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            id $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, dlc.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            id $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, dlc.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            id $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, dlc.c, $$0);
            }
         }
      });
   }

   private static void a(id $$0, dpz $$1, eda.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (id var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
