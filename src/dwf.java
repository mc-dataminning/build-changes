import com.mojang.serialization.Codec;

public class dwf<P extends dwe> {
   public static final dwf<dwd> a = a("mangrove_root_placer", dwd.c);
   private final Codec<P> b;

   private static <P extends dwe> dwf<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.Y, $$0, new dwf<>($$1));
   }

   private dwf(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
