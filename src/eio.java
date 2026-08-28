import com.mojang.serialization.MapCodec;

public class eio<P extends ein> {
   public static final eio<eim> a = a("mangrove_root_placer", eim.c);
   private final MapCodec<P> b;

   private static <P extends ein> eio<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ly.W, $$0, new eio<>($$1));
   }

   private eio(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
