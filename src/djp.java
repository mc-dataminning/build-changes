import com.mojang.serialization.Codec;

public interface djp<T extends djo> {
   djp<djg> a = a("block", new djg.a());
   djp<dji> b = a("entity", new dji.a());

   T b(si var1);

   void a(si var1, T var2);

   Codec<T> a();

   static <S extends djp<T>, T extends djo> S a(String $$0, S $$1) {
      return hr.a(jb.w, $$0, $$1);
   }

   static djo c(si $$0) {
      aer $$1 = $$0.s();
      return jb.w.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown position source type " + $$1)).b($$0);
   }

   static <T extends djo> void a(T $$0, si $$1) {
      $$1.a(jb.w.b($$0.a()));
      ((djp<T>)$$0.a()).a($$1, $$0);
   }
}
