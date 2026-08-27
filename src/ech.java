import com.mojang.serialization.Codec;

public class ech<P extends ecg> {
   public static final ech<ecf> a = a("mangrove_root_placer", ecf.c);
   private final Codec<P> b;

   private static <P extends ecg> ech<P> a(String $$0, Codec<P> $$1) {
      return ja.a(kt.Y, $$0, new ech<>($$1));
   }

   private ech(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
