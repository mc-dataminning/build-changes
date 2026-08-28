import com.mojang.serialization.MapCodec;

public interface eoa<P extends enz> {
   eoa<enx> a = a("clear", enx.a);
   eoa<eny> b = a("passthrough", eny.b);
   eoa<enw> c = a("append_static", enw.a);
   eoa<env> d = a("append_loot", env.a);

   MapCodec<P> codec();

   private static <P extends enz> eoa<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.n, $$0, () -> $$1);
   }
}
