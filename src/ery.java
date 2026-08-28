import com.mojang.serialization.MapCodec;

public interface ery<P extends erx> {
   ery<erv> a = a("clear", erv.a);
   ery<erw> b = a("passthrough", erw.b);
   ery<eru> c = a("append_static", eru.a);
   ery<ert> d = a("append_loot", ert.a);

   MapCodec<P> codec();

   private static <P extends erx> ery<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.n, $$0, () -> $$1);
   }
}
