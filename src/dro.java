import com.mojang.serialization.Codec;

public class dro<P extends drn> {
   public static final dro<drm> a = a("mangrove_root_placer", drm.c);
   private final Codec<P> b;

   private static <P extends drn> dro<P> a(String $$0, Codec<P> $$1) {
      return hs.a(jc.Z, $$0, new dro<>($$1));
   }

   private dro(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
