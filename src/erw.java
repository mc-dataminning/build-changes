import com.mojang.serialization.MapCodec;

public interface erw<P extends erv> {
   erw<ert> a = a("clear", ert.a);
   erw<eru> b = a("passthrough", eru.b);
   erw<ers> c = a("append_static", ers.a);
   erw<err> d = a("append_loot", err.a);

   MapCodec<P> codec();

   private static <P extends erv> erw<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.n, $$0, () -> $$1);
   }
}
