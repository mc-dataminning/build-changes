import com.mojang.serialization.Codec;

public class dxv<P extends dxu> {
   public static final dxv<dxt> a = a("mangrove_root_placer", dxt.c);
   private final Codec<P> b;

   private static <P extends dxu> dxv<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.Y, $$0, new dxv<>($$1));
   }

   private dxv(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
