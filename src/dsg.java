import com.mojang.serialization.Codec;

public class dsg extends dsh {
   public static final Codec<dsg> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dsg::new, $$0 -> $$0.b).codec();
   private final float b;

   @Override
   protected dsi<?> a() {
      return dsi.b;
   }

   public dsg(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(dsh.a $$0) {
      art $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            gv $$3 = $$2.g();
            if ($$0.a($$3)) {
               a($$3, dbe.c, $$0);
            }
         }

         if ($$1.i() < this.b) {
            gv $$4 = $$2.h();
            if ($$0.a($$4)) {
               a($$4, dbe.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            gv $$5 = $$2.e();
            if ($$0.a($$5)) {
               a($$5, dbe.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            gv $$6 = $$2.f();
            if ($$0.a($$6)) {
               a($$6, dbe.b, $$0);
            }
         }
      });
   }

   private static void a(gv $$0, dfp $$1, dsh.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (gv var4 = $$0.d(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.d();
      }
   }
}
