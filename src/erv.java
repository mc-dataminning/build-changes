import com.mojang.serialization.MapCodec;

public interface erv<P extends eru> {
   erv<ers> a = a("clear", ers.a);
   erv<ert> b = a("passthrough", ert.b);
   erv<err> c = a("append_static", err.a);
   erv<erq> d = a("append_loot", erq.a);

   MapCodec<P> codec();

   private static <P extends eru> erv<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.n, $$0, () -> $$1);
   }
}
