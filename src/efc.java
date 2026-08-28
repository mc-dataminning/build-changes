import com.mojang.serialization.MapCodec;

public class efc<P extends efb> {
   public static final efc<efa> a = a("mangrove_root_placer", efa.c);
   private final MapCodec<P> b;

   private static <P extends efb> efc<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.Y, $$0, new efc<>($$1));
   }

   private efc(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
