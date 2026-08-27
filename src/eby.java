import com.mojang.serialization.Codec;

public class eby<P extends ebx> {
   public static final eby<ebw> a = a("mangrove_root_placer", ebw.c);
   private final Codec<P> b;

   private static <P extends ebx> eby<P> a(String $$0, Codec<P> $$1) {
      return iy.a(kr.Y, $$0, new eby<>($$1));
   }

   private eby(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
