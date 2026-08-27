import com.mojang.serialization.Codec;

public interface dnp<T extends dno> {
   dnp<dng> a = a("block", new dng.a());
   dnp<dni> b = a("entity", new dni.a());

   T b(ug var1);

   void a(ug var1, T var2);

   Codec<T> a();

   static <S extends dnp<T>, T extends dno> S a(String $$0, S $$1) {
      return it.a(kd.v, $$0, $$1);
   }

   static dno c(ug $$0) {
      dnp<?> $$1 = $$0.a(kd.v);
      if ($$1 == null) {
         throw new IllegalArgumentException("Unknown position source type");
      } else {
         return $$1.b($$0);
      }
   }

   static <T extends dno> void a(T $$0, ug $$1) {
      $$1.a(kd.v, $$0.a());
      ((dnp<T>)$$0.a()).a($$1, $$0);
   }
}
