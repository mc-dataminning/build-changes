import com.mojang.serialization.MapCodec;

public interface emz<P extends emy> {
   emz<emw> a = a("clear", emw.a);
   emz<emx> b = a("passthrough", emx.b);
   emz<emv> c = a("append_static", emv.a);
   emz<emu> d = a("append_loot", emu.a);

   MapCodec<P> codec();

   private static <P extends emy> emz<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.n, $$0, () -> $$1);
   }
}
