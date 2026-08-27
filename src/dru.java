import com.mojang.serialization.Codec;

public class dru<P extends drt> {
   public static final dru<drw> a = a("two_layers_feature_size", drw.d);
   public static final dru<drv> b = a("three_layers_feature_size", drv.d);
   private final Codec<P> c;

   private static <P extends drt> dru<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.ab, $$0, new dru<>($$1));
   }

   private dru(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
