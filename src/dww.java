import com.mojang.serialization.Codec;

public class dww<P extends dwv> {
   public static final dww<dwu> a = a("straight_trunk_placer", dwu.a);
   public static final dww<dwr> b = a("forking_trunk_placer", dwr.a);
   public static final dww<dws> c = a("giant_trunk_placer", dws.a);
   public static final dww<dwt> d = a("mega_jungle_trunk_placer", dwt.b);
   public static final dww<dwp> e = a("dark_oak_trunk_placer", dwp.a);
   public static final dww<dwq> f = a("fancy_trunk_placer", dwq.a);
   public static final dww<dwn> g = a("bending_trunk_placer", dwn.a);
   public static final dww<dwx> h = a("upwards_branching_trunk_placer", dwx.a);
   public static final dww<dwo> i = a("cherry_trunk_placer", dwo.a);
   private final Codec<P> j;

   private static <P extends dwv> dww<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.X, $$0, new dww<>($$1));
   }

   private dww(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}
