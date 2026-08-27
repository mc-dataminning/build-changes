import com.mojang.serialization.Codec;

public class dsk extends dsi {
   public static final Codec<dsk> a = Codec.unit(() -> dsk.b);
   public static final dsk b = new dsk();

   @Override
   protected dsj<?> a() {
      return dsj.a;
   }

   @Override
   public void a(dsi.a $$0) {
      aru $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            gu $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dbf.c);
            }
         }

         if ($$1.a(3) > 0) {
            gu $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dbf.e);
            }
         }

         if ($$1.a(3) > 0) {
            gu $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dbf.d);
            }
         }

         if ($$1.a(3) > 0) {
            gu $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dbf.b);
            }
         }
      });
   }
}
