import com.mojang.serialization.Codec;

public interface djo<T extends djn> {
   djo<djf> a = a("block", new djf.a());
   djo<djh> b = a("entity", new djh.a());

   T b(si var1);

   void a(si var1, T var2);

   Codec<T> a();

   static <S extends djo<T>, T extends djn> S a(String $$0, S $$1) {
      return hr.a(jb.w, $$0, $$1);
   }

   static djn c(si $$0) {
      aer $$1 = $$0.s();
      return jb.w.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown position source type " + $$1)).b($$0);
   }

   static <T extends djn> void a(T $$0, si $$1) {
      $$1.a(jb.w.b($$0.a()));
      ((djo<T>)$$0.a()).a($$1, $$0);
   }
}
