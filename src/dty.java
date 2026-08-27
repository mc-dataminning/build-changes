import com.mojang.serialization.Codec;

public class dty<P extends dtx> {
   public static final dty<dtw> a = a("mangrove_root_placer", dtw.c);
   private final Codec<P> b;

   private static <P extends dtx> dty<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.Z, $$0, new dty<>($$1));
   }

   private dty(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
