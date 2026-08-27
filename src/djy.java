import com.mojang.serialization.Codec;

public interface djy<T extends djx> {
   djy<djp> a = a("block", new djp.a());
   djy<djr> b = a("entity", new djr.a());

   T b(so var1);

   void a(so var1, T var2);

   Codec<T> a();

   static <S extends djy<T>, T extends djx> S a(String $$0, S $$1) {
      return ht.a(jd.w, $$0, $$1);
   }

   static djx c(so $$0) {
      aex $$1 = $$0.s();
      return jd.w.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown position source type " + $$1)).b($$0);
   }

   static <T extends djx> void a(T $$0, so $$1) {
      $$1.a(jd.w.b($$0.a()));
      ((djy<T>)$$0.a()).a($$1, $$0);
   }
}
