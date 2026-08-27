import com.mojang.serialization.Codec;

public class ecl<P extends eck> {
   public static final ecl<ecf> a = a("blob_foliage_placer", ecf.a);
   public static final ecl<ecq> b = a("spruce_foliage_placer", ecq.a);
   public static final ecl<eco> c = a("pine_foliage_placer", eco.a);
   public static final ecl<ece> d = a("acacia_foliage_placer", ece.a);
   public static final ecl<ecg> e = a("bush_foliage_placer", ecg.c);
   public static final ecl<ecj> f = a("fancy_foliage_placer", ecj.c);
   public static final ecl<ecm> g = a("jungle_foliage_placer", ecm.a);
   public static final ecl<ecn> h = a("mega_pine_foliage_placer", ecn.a);
   public static final ecl<eci> i = a("dark_oak_foliage_placer", eci.a);
   public static final ecl<ecp> j = a("random_spread_foliage_placer", ecp.a);
   public static final ecl<ech> k = a("cherry_foliage_placer", ech.a);
   private final Codec<P> l;

   private static <P extends eck> ecl<P> a(String $$0, Codec<P> $$1) {
      return ji.a(lc.W, $$0, new ecl<>($$1));
   }

   private ecl(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}
