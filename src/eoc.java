import com.mojang.serialization.MapCodec;

public interface eoc<P extends eob> {
   eoc<enz> a = a("clear", enz.a);
   eoc<eoa> b = a("passthrough", eoa.b);
   eoc<eny> c = a("append_static", eny.a);
   eoc<enx> d = a("append_loot", enx.a);

   MapCodec<P> codec();

   private static <P extends eob> eoc<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.n, $$0, () -> $$1);
   }
}
