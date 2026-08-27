import com.mojang.serialization.Codec;

public class dvq<P extends dvp> {
   public static final dvq<dvo> a = a("mangrove_root_placer", dvo.c);
   private final Codec<P> b;

   private static <P extends dvp> dvq<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.Y, $$0, new dvq<>($$1));
   }

   private dvq(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
