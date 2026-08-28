import com.mojang.serialization.MapCodec;

public class ehx<P extends ehw> {
   public static final ehx<ehv> a = a("mangrove_root_placer", ehv.c);
   private final MapCodec<P> b;

   private static <P extends ehw> ehx<P> a(String $$0, MapCodec<P> $$1) {
      return kb.a(lv.W, $$0, new ehx<>($$1));
   }

   private ehx(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
