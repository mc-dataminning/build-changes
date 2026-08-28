import com.mojang.serialization.MapCodec;

public interface etr<P extends etq> {
   etr<eto> a = a("clear", eto.a);
   etr<etp> b = a("passthrough", etp.b);
   etr<etn> c = a("append_static", etn.a);
   etr<etm> d = a("append_loot", etm.a);

   MapCodec<P> codec();

   private static <P extends etq> etr<P> a(String $$0, MapCodec<P> $$1) {
      return kf.a(md.n, $$0, () -> $$1);
   }
}
