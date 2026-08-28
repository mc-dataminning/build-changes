import com.mojang.serialization.MapCodec;

public interface eft<T extends efs> {
   eft<efk> a = a("block", new efk.a());
   eft<efm> b = a("entity", new efm.a());

   MapCodec<T> a();

   yw<? super wj, T> b();

   static <S extends eft<T>, T extends efs> S a(String $$0, S $$1) {
      return js.a(mg.t, $$0, $$1);
   }
}
