import com.mojang.serialization.Codec;

public class dzv<P extends dzu> {
   public static final dzv<dzt> a = a("mangrove_root_placer", dzt.c);
   private final Codec<P> b;

   private static <P extends dzu> dzv<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.Y, $$0, new dzv<>($$1));
   }

   private dzv(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
