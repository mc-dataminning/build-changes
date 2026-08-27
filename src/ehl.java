import com.mojang.serialization.Codec;

public interface ehl<P extends ehk> {
   ehl<ehi> a = a("clear", ehi.a);
   ehl<ehj> b = a("passthrough", ehj.b);
   ehl<ehh> c = a("append_static", ehh.a);
   ehl<ehg> d = a("append_loot", ehg.a);

   Codec<P> codec();

   private static <P extends ehk> ehl<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.p, $$0, () -> $$1);
   }
}
