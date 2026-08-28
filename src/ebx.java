import com.mojang.serialization.MapCodec;

public interface ebx<T extends ebw> {
   ebx<ebo> a = a("block", new ebo.a());
   ebx<ebq> b = a("entity", new ebq.a());

   MapCodec<T> a();

   yn<? super wa, T> b();

   static <S extends ebx<T>, T extends ebw> S a(String $$0, S $$1) {
      return ke.a(mb.t, $$0, $$1);
   }
}
