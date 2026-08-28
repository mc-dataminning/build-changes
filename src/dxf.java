import com.mojang.serialization.MapCodec;

public interface dxf<T extends dxe> {
   dxf<dww> a = a("block", new dww.a());
   dxf<dwy> b = a("entity", new dwy.a());

   MapCodec<T> a();

   ys<? super wf, T> b();

   static <S extends dxf<T>, T extends dxe> S a(String $$0, S $$1) {
      return jw.a(lq.t, $$0, $$1);
   }
}
