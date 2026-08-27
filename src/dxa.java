import com.mojang.serialization.Codec;

public class dxa extends dwy {
   public static final Codec<dxa> a = Codec.unit(() -> dxa.b);
   public static final dxa b = new dxa();

   @Override
   protected dwz<?> a() {
      return dwz.a;
   }

   @Override
   public void a(dwy.a $$0) {
      auw $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            hx $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dfs.d);
            }
         }

         if ($$1.a(3) > 0) {
            hx $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dfs.f);
            }
         }

         if ($$1.a(3) > 0) {
            hx $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dfs.e);
            }
         }

         if ($$1.a(3) > 0) {
            hx $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dfs.c);
            }
         }
      });
   }
}
