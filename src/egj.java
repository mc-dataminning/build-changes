import com.mojang.serialization.Codec;

public class egj<P extends egi> {
   public static final egj<egh> a = a("mangrove_root_placer", egh.c);
   private final Codec<P> b;

   private static <P extends egi> egj<P> a(String $$0, Codec<P> $$1) {
      return jn.a(lh.Y, $$0, new egj<>($$1));
   }

   private egj(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
