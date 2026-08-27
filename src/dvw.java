import com.mojang.serialization.Codec;

public class dvw<P extends dvv> {
   public static final dvw<dvu> a = a("mangrove_root_placer", dvu.c);
   private final Codec<P> b;

   private static <P extends dvv> dvw<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.Y, $$0, new dvw<>($$1));
   }

   private dvw(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
