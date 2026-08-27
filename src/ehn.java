import com.mojang.serialization.Codec;

public interface ehn<P extends ehm> {
   ehn<ehk> a = a("clear", ehk.a);
   ehn<ehl> b = a("passthrough", ehl.b);
   ehn<ehj> c = a("append_static", ehj.a);
   ehn<ehi> d = a("append_loot", ehi.a);

   Codec<P> codec();

   private static <P extends ehm> ehn<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.p, $$0, () -> $$1);
   }
}
