import com.mojang.serialization.Codec;

public interface dmc<T extends dmb> {
   dmc<dlt> a = a("block", new dlt.a());
   dmc<dlv> b = a("entity", new dlv.a());

   T b(ty var1);

   void a(ty var1, T var2);

   Codec<T> a();

   static <S extends dmc<T>, T extends dmb> S a(String $$0, S $$1) {
      return is.a(kc.w, $$0, $$1);
   }

   static dmb c(ty $$0) {
      agm $$1 = $$0.t();
      return kc.w.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown position source type " + $$1)).b($$0);
   }

   static <T extends dmb> void a(T $$0, ty $$1) {
      $$1.a(kc.w.b($$0.a()));
      ((dmc<T>)$$0.a()).a($$1, $$0);
   }
}
