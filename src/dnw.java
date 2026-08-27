import com.mojang.serialization.Codec;

public interface dnw<T extends dnv> {
   dnw<dnn> a = a("block", new dnn.a());
   dnw<dnp> b = a("entity", new dnp.a());

   T b(ui var1);

   void a(ui var1, T var2);

   Codec<T> a();

   static <S extends dnw<T>, T extends dnv> S a(String $$0, S $$1) {
      return it.a(kd.v, $$0, $$1);
   }

   static dnv c(ui $$0) {
      dnw<?> $$1 = $$0.a(kd.v);
      if ($$1 == null) {
         throw new IllegalArgumentException("Unknown position source type");
      } else {
         return $$1.b($$0);
      }
   }

   static <T extends dnv> void a(T $$0, ui $$1) {
      $$1.a(kd.v, $$0.a());
      ((dnw<T>)$$0.a()).a($$1, $$0);
   }
}
