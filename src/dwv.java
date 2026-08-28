import com.mojang.serialization.MapCodec;

public interface dwv<T extends dwu> {
   dwv<dwm> a = a("block", new dwm.a());
   dwv<dwo> b = a("entity", new dwo.a());

   MapCodec<T> a();

   zj<? super ww, T> b();

   static <S extends dwv<T>, T extends dwu> S a(String $$0, S $$1) {
      return jv.a(lp.v, $$0, $$1);
   }
}
