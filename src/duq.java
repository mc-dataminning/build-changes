import com.mojang.serialization.Codec;

public class duq extends dur {
   public static final Codec<duq> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(duq::new, $$0 -> $$0.b).codec();
   private final float b;

   @Override
   protected dus<?> a() {
      return dus.b;
   }

   public duq(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(dur.a $$0) {
      ats $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            ht $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, ddt.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            ht $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, ddt.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            ht $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, ddt.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            ht $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, ddt.c, $$0);
            }
         }
      });
   }

   private static void a(ht $$0, dhz $$1, dur.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (ht var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
