import com.mojang.serialization.MapCodec;

public interface eet<T extends ees> {
   eet<eek> a = a("block", new eek.a());
   eet<eem> b = a("entity", new eem.a());

   MapCodec<T> a();

   yu<? super wh, T> b();

   static <S extends eet<T>, T extends ees> S a(String $$0, S $$1) {
      return jr.a(mf.t, $$0, $$1);
   }
}
