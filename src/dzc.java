import com.mojang.serialization.MapCodec;

public interface dzc<T extends dzb> {
   dzc<dyt> a = a("block", new dyt.a());
   dzc<dyv> b = a("entity", new dyv.a());

   MapCodec<T> a();

   zb<? super wo, T> b();

   static <S extends dzc<T>, T extends dzb> S a(String $$0, S $$1) {
      return ka.a(lu.t, $$0, $$1);
   }
}
