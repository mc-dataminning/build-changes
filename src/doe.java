import com.mojang.serialization.Codec;

public interface doe<T extends dod> {
   doe<dnv> a = a("block", new dnv.a());
   doe<dnx> b = a("entity", new dnx.a());

   T b(uj var1);

   void a(uj var1, T var2);

   Codec<T> a();

   static <S extends doe<T>, T extends dod> S a(String $$0, S $$1) {
      return it.a(kd.v, $$0, $$1);
   }

   static dod c(uj $$0) {
      doe<?> $$1 = $$0.a(kd.v);
      if ($$1 == null) {
         throw new IllegalArgumentException("Unknown position source type");
      } else {
         return $$1.b($$0);
      }
   }

   static <T extends dod> void a(T $$0, uj $$1) {
      $$1.a(kd.v, $$0.a());
      ((doe<T>)$$0.a()).a($$1, $$0);
   }
}
