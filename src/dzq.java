import com.mojang.serialization.MapCodec;

public interface dzq<T extends dzp> {
   dzq<dzh> a = a("block", new dzh.a());
   dzq<dzj> b = a("entity", new dzj.a());

   MapCodec<T> a();

   zb<? super wo, T> b();

   static <S extends dzq<T>, T extends dzp> S a(String $$0, S $$1) {
      return ka.a(lu.t, $$0, $$1);
   }
}
