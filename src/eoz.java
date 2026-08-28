import com.mojang.serialization.MapCodec;

public interface eoz<P extends eoy> {
   eoz<eow> a = a("clear", eow.a);
   eoz<eox> b = a("passthrough", eox.b);
   eoz<eov> c = a("append_static", eov.a);
   eoz<eou> d = a("append_loot", eou.a);

   MapCodec<P> codec();

   private static <P extends eoy> eoz<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.n, $$0, () -> $$1);
   }
}
