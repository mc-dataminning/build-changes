import com.mojang.serialization.Codec;

public class dyc<P extends dyb> {
   public static final dyc<dya> a = a("mangrove_root_placer", dya.c);
   private final Codec<P> b;

   private static <P extends dyb> dyc<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.Y, $$0, new dyc<>($$1));
   }

   private dyc(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
