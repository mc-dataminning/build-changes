import com.mojang.serialization.Codec;

public interface ekp<P extends eko> {
   ekp<ekm> a = a("clear", ekm.a);
   ekp<ekn> b = a("passthrough", ekn.b);
   ekp<ekl> c = a("append_static", ekl.a);
   ekp<ekk> d = a("append_loot", ekk.a);

   Codec<P> codec();

   private static <P extends eko> ekp<P> a(String $$0, Codec<P> $$1) {
      return ji.a(lc.p, $$0, () -> $$1);
   }
}
