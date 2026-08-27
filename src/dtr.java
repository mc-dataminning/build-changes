import com.mojang.serialization.Codec;

public class dtr<P extends dtq> {
   public static final dtr<dtl> a = a("blob_foliage_placer", dtl.a);
   public static final dtr<dtw> b = a("spruce_foliage_placer", dtw.a);
   public static final dtr<dtu> c = a("pine_foliage_placer", dtu.a);
   public static final dtr<dtk> d = a("acacia_foliage_placer", dtk.a);
   public static final dtr<dtm> e = a("bush_foliage_placer", dtm.c);
   public static final dtr<dtp> f = a("fancy_foliage_placer", dtp.c);
   public static final dtr<dts> g = a("jungle_foliage_placer", dts.a);
   public static final dtr<dtt> h = a("mega_pine_foliage_placer", dtt.a);
   public static final dtr<dto> i = a("dark_oak_foliage_placer", dto.a);
   public static final dtr<dtv> j = a("random_spread_foliage_placer", dtv.a);
   public static final dtr<dtn> k = a("cherry_foliage_placer", dtn.a);
   private final Codec<P> l;

   private static <P extends dtq> dtr<P> a(String $$0, Codec<P> $$1) {
      return is.a(kc.X, $$0, new dtr<>($$1));
   }

   private dtr(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}
