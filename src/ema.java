import com.mojang.serialization.MapCodec;

public interface ema<P extends elz> {
   ema<eld> a = a("always_true", eld.a);
   ema<eli> b = a("block_match", eli.a);
   ema<elk> c = a("blockstate_match", elk.a);
   ema<emh> d = a("tag_match", emh.a);
   ema<elw> e = a("random_block_match", elw.a);
   ema<elx> f = a("random_blockstate_match", elx.a);

   MapCodec<P> codec();

   static <P extends elz> ema<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.o, $$0, () -> $$1);
   }
}
