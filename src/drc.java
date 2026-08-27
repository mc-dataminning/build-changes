import com.mojang.serialization.Codec;

public class drc<P extends drb> {
   public static final drc<dre> a = a("two_layers_feature_size", dre.d);
   public static final drc<drd> b = a("three_layers_feature_size", drd.d);
   private final Codec<P> c;

   private static <P extends drb> drc<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.ab, $$0, new drc<>($$1));
   }

   private drc(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
