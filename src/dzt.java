import com.mojang.serialization.Codec;

public class dzt<P extends dzs> {
   public static final dzt<dzr> a = a("mangrove_root_placer", dzr.c);
   private final Codec<P> b;

   private static <P extends dzs> dzt<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.Y, $$0, new dzt<>($$1));
   }

   private dzt(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
