import com.mojang.serialization.MapCodec;

public interface evy<P extends evx> {
   evy<evv> a = a("clear", evv.a);
   evy<evw> b = a("passthrough", evw.b);
   evy<evu> c = a("append_static", evu.a);
   evy<evt> d = a("append_loot", evt.a);

   MapCodec<P> codec();

   private static <P extends evx> evy<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.n, $$0, () -> $$1);
   }
}
