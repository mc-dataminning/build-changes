import com.mojang.serialization.MapCodec;

public interface dxa<T extends dwz> {
   dxa<dwr> a = a("block", new dwr.a());
   dxa<dwt> b = a("entity", new dwt.a());

   MapCodec<T> a();

   zn<? super xa, T> b();

   static <S extends dxa<T>, T extends dwz> S a(String $$0, S $$1) {
      return jv.a(lp.v, $$0, $$1);
   }
}
