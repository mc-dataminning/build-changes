import com.mojang.serialization.Codec;

public class ecx<P extends ecw> {
   public static final ecx<ecv> a = a("mangrove_root_placer", ecv.c);
   private final Codec<P> b;

   private static <P extends ecw> ecx<P> a(String $$0, Codec<P> $$1) {
      return ji.a(lc.Y, $$0, new ecx<>($$1));
   }

   private ecx(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
