import com.mojang.serialization.MapCodec;

public interface dxb<T extends dxa> {
   dxb<dws> a = a("block", new dws.a());
   dxb<dwu> b = a("entity", new dwu.a());

   MapCodec<T> a();

   zn<? super xa, T> b();

   static <S extends dxb<T>, T extends dxa> S a(String $$0, S $$1) {
      return jv.a(lp.v, $$0, $$1);
   }
}
