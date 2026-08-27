import com.mojang.serialization.Codec;

public interface djn<T extends djm> {
   djn<dje> a = a("block", new dje.a());
   djn<djg> b = a("entity", new djg.a());

   T b(sh var1);

   void a(sh var1, T var2);

   Codec<T> a();

   static <S extends djn<T>, T extends djm> S a(String $$0, S $$1) {
      return hs.a(jc.w, $$0, $$1);
   }

   static djm c(sh $$0) {
      aep $$1 = $$0.s();
      return jc.w.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown position source type " + $$1)).b($$0);
   }

   static <T extends djm> void a(T $$0, sh $$1) {
      $$1.a(jc.w.b($$0.a()));
      ((djn<T>)$$0.a()).a($$1, $$0);
   }
}
