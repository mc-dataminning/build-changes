import com.mojang.serialization.Codec;

public class dtm<P extends dtl> {
   public static final dtm<dtk> a = a("mangrove_root_placer", dtk.c);
   private final Codec<P> b;

   private static <P extends dtl> dtm<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.Z, $$0, new dtm<>($$1));
   }

   private dtm(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
