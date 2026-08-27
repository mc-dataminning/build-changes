import com.mojang.serialization.Codec;

public interface dnv<T extends dnu> {
   dnv<dnm> a = a("block", new dnm.a());
   dnv<dno> b = a("entity", new dno.a());

   T b(ui var1);

   void a(ui var1, T var2);

   Codec<T> a();

   static <S extends dnv<T>, T extends dnu> S a(String $$0, S $$1) {
      return it.a(kd.v, $$0, $$1);
   }

   static dnu c(ui $$0) {
      dnv<?> $$1 = $$0.a(kd.v);
      if ($$1 == null) {
         throw new IllegalArgumentException("Unknown position source type");
      } else {
         return $$1.b($$0);
      }
   }

   static <T extends dnu> void a(T $$0, ui $$1) {
      $$1.a(kd.v, $$0.a());
      ((dnv<T>)$$0.a()).a($$1, $$0);
   }
}
