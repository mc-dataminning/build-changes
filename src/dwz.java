import com.mojang.serialization.MapCodec;

public interface dwz<T extends dwy> {
   dwz<dwq> a = a("block", new dwq.a());
   dwz<dws> b = a("entity", new dws.a());

   MapCodec<T> a();

   zm<? super wz, T> b();

   static <S extends dwz<T>, T extends dwy> S a(String $$0, S $$1) {
      return jv.a(lp.v, $$0, $$1);
   }
}
