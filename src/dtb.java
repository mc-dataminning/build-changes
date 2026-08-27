import com.mojang.serialization.Codec;

public class dtb<P extends dta> {
   public static final dtb<dtd> a = a("two_layers_feature_size", dtd.d);
   public static final dtb<dtc> b = a("three_layers_feature_size", dtc.d);
   private final Codec<P> c;

   private static <P extends dta> dtb<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.ab, $$0, new dtb<>($$1));
   }

   private dtb(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
