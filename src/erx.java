import com.mojang.serialization.MapCodec;

public interface erx<P extends erw> {
   erx<eru> a = a("clear", eru.a);
   erx<erv> b = a("passthrough", erv.b);
   erx<ert> c = a("append_static", ert.a);
   erx<ers> d = a("append_loot", ers.a);

   MapCodec<P> codec();

   private static <P extends erw> erx<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.n, $$0, () -> $$1);
   }
}
