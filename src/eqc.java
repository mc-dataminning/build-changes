import com.mojang.serialization.MapCodec;

public interface eqc<P extends eqb> {
   eqc<epz> a = a("clear", epz.a);
   eqc<eqa> b = a("passthrough", eqa.b);
   eqc<epy> c = a("append_static", epy.a);
   eqc<epx> d = a("append_loot", epx.a);

   MapCodec<P> codec();

   private static <P extends eqb> eqc<P> a(String $$0, MapCodec<P> $$1) {
      return kc.a(lx.n, $$0, () -> $$1);
   }
}
