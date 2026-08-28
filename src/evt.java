import com.mojang.serialization.MapCodec;

public interface evt<P extends evs> {
   evt<evq> a = a("clear", evq.a);
   evt<evr> b = a("passthrough", evr.b);
   evt<evp> c = a("append_static", evp.a);
   evt<evo> d = a("append_loot", evo.a);

   MapCodec<P> codec();

   private static <P extends evs> evt<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.n, $$0, () -> $$1);
   }
}
