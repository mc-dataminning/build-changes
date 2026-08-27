import com.mojang.serialization.Codec;

public class dvx<P extends dvw> {
   public static final dvx<dvv> a = a("mangrove_root_placer", dvv.c);
   private final Codec<P> b;

   private static <P extends dvw> dvx<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.Y, $$0, new dvx<>($$1));
   }

   private dvx(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
