import com.mojang.serialization.Codec;

public class dvf<P extends dve> {
   public static final dvf<dvd> a = a("mangrove_root_placer", dvd.c);
   private final Codec<P> b;

   private static <P extends dve> dvf<P> a(String $$0, Codec<P> $$1) {
      return ir.a(kb.Y, $$0, new dvf<>($$1));
   }

   private dvf(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
