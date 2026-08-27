import com.mojang.serialization.Codec;

public class dtm<P extends dtl> {
   public static final dtm<dtg> a = a("blob_foliage_placer", dtg.a);
   public static final dtm<dtr> b = a("spruce_foliage_placer", dtr.a);
   public static final dtm<dtp> c = a("pine_foliage_placer", dtp.a);
   public static final dtm<dtf> d = a("acacia_foliage_placer", dtf.a);
   public static final dtm<dth> e = a("bush_foliage_placer", dth.c);
   public static final dtm<dtk> f = a("fancy_foliage_placer", dtk.c);
   public static final dtm<dtn> g = a("jungle_foliage_placer", dtn.a);
   public static final dtm<dto> h = a("mega_pine_foliage_placer", dto.a);
   public static final dtm<dtj> i = a("dark_oak_foliage_placer", dtj.a);
   public static final dtm<dtq> j = a("random_spread_foliage_placer", dtq.a);
   public static final dtm<dti> k = a("cherry_foliage_placer", dti.a);
   private final Codec<P> l;

   private static <P extends dtl> dtm<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.X, $$0, new dtm<>($$1));
   }

   private dtm(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}
