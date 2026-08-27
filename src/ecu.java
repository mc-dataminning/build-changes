import com.mojang.serialization.Codec;

public class ecu<P extends ect> {
   public static final ecu<eco> a = a("blob_foliage_placer", eco.a);
   public static final ecu<ecz> b = a("spruce_foliage_placer", ecz.a);
   public static final ecu<ecx> c = a("pine_foliage_placer", ecx.a);
   public static final ecu<ecn> d = a("acacia_foliage_placer", ecn.a);
   public static final ecu<ecp> e = a("bush_foliage_placer", ecp.c);
   public static final ecu<ecs> f = a("fancy_foliage_placer", ecs.c);
   public static final ecu<ecv> g = a("jungle_foliage_placer", ecv.a);
   public static final ecu<ecw> h = a("mega_pine_foliage_placer", ecw.a);
   public static final ecu<ecr> i = a("dark_oak_foliage_placer", ecr.a);
   public static final ecu<ecy> j = a("random_spread_foliage_placer", ecy.a);
   public static final ecu<ecq> k = a("cherry_foliage_placer", ecq.a);
   private final Codec<P> l;

   private static <P extends ect> ecu<P> a(String $$0, Codec<P> $$1) {
      return jj.a(ld.W, $$0, new ecu<>($$1));
   }

   private ecu(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}
