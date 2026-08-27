import com.mojang.serialization.Codec;

public interface efn<P extends efm> {
   efn<efk> a = a("clear", efk.a);
   efn<efl> b = a("passthrough", efl.b);
   efn<efj> c = a("append_static", efj.a);
   efn<efi> d = a("append_loot", efi.a);

   Codec<P> codec();

   private static <P extends efm> efn<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.p, $$0, () -> $$1);
   }
}
