import com.mojang.serialization.Codec;

public class duh extends duf {
   public static final Codec<duh> a = Codec.unit(() -> duh.b);
   public static final duh b = new duh();

   @Override
   protected dug<?> a() {
      return dug.a;
   }

   @Override
   public void a(duf.a $$0) {
      ato $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            ht $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, ddl.d);
            }
         }

         if ($$1.a(3) > 0) {
            ht $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, ddl.f);
            }
         }

         if ($$1.a(3) > 0) {
            ht $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, ddl.e);
            }
         }

         if ($$1.a(3) > 0) {
            ht $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, ddl.c);
            }
         }
      });
   }
}
