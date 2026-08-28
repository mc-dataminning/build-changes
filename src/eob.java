import com.mojang.serialization.MapCodec;

public class eob<P extends eoa> {
   public static final eob<enz> a = a("mangrove_root_placer", enz.c);
   private final MapCodec<P> b;

   private static <P extends eoa> eob<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.W, $$0, new eob<>($$1));
   }

   private eob(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
