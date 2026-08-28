import com.mojang.serialization.MapCodec;

public interface eve<P extends evd> {
   eve<evb> a = a("clear", evb.a);
   eve<evc> b = a("passthrough", evc.b);
   eve<eva> c = a("append_static", eva.a);
   eve<euz> d = a("append_loot", euz.a);

   MapCodec<P> codec();

   private static <P extends evd> eve<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.n, $$0, () -> $$1);
   }
}
