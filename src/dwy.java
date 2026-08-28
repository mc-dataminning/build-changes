import com.mojang.serialization.MapCodec;

public interface dwy<T extends dwx> {
   dwy<dwp> a = a("block", new dwp.a());
   dwy<dwr> b = a("entity", new dwr.a());

   MapCodec<T> a();

   zm<? super wz, T> b();

   static <S extends dwy<T>, T extends dwx> S a(String $$0, S $$1) {
      return jv.a(lp.v, $$0, $$1);
   }
}
