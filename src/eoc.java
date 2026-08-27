import com.mojang.serialization.Codec;

public interface eoc<P extends eob> {
   eoc<enz> a = a("clear", enz.a);
   eoc<eoa> b = a("passthrough", eoa.b);
   eoc<eny> c = a("append_static", eny.a);
   eoc<enx> d = a("append_loot", enx.a);

   Codec<P> codec();

   private static <P extends eob> eoc<P> a(String $$0, Codec<P> $$1) {
      return jn.a(lh.p, $$0, () -> $$1);
   }
}
