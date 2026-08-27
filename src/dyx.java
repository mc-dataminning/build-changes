import com.mojang.serialization.Codec;

public class dyx<P extends dyw> {
   public static final dyx<dyv> a = a("mangrove_root_placer", dyv.c);
   private final Codec<P> b;

   private static <P extends dyw> dyx<P> a(String $$0, Codec<P> $$1) {
      return ix.a(kh.Y, $$0, new dyx<>($$1));
   }

   private dyx(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
