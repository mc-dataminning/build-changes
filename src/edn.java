import com.mojang.serialization.Codec;

public class edn<P extends edm> {
   public static final edn<edl> a = a("straight_trunk_placer", edl.a);
   public static final edn<edi> b = a("forking_trunk_placer", edi.a);
   public static final edn<edj> c = a("giant_trunk_placer", edj.a);
   public static final edn<edk> d = a("mega_jungle_trunk_placer", edk.b);
   public static final edn<edg> e = a("dark_oak_trunk_placer", edg.a);
   public static final edn<edh> f = a("fancy_trunk_placer", edh.a);
   public static final edn<ede> g = a("bending_trunk_placer", ede.a);
   public static final edn<edo> h = a("upwards_branching_trunk_placer", edo.a);
   public static final edn<edf> i = a("cherry_trunk_placer", edf.a);
   private final Codec<P> j;

   private static <P extends edm> edn<P> a(String $$0, Codec<P> $$1) {
      return ja.a(kt.X, $$0, new edn<>($$1));
   }

   private edn(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}
