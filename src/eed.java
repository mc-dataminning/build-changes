import com.mojang.serialization.Codec;

public class eed<P extends eec> {
   public static final eed<eeb> a = a("straight_trunk_placer", eeb.a);
   public static final eed<edy> b = a("forking_trunk_placer", edy.a);
   public static final eed<edz> c = a("giant_trunk_placer", edz.a);
   public static final eed<eea> d = a("mega_jungle_trunk_placer", eea.b);
   public static final eed<edw> e = a("dark_oak_trunk_placer", edw.a);
   public static final eed<edx> f = a("fancy_trunk_placer", edx.a);
   public static final eed<edu> g = a("bending_trunk_placer", edu.a);
   public static final eed<eee> h = a("upwards_branching_trunk_placer", eee.a);
   public static final eed<edv> i = a("cherry_trunk_placer", edv.a);
   private final Codec<P> j;

   private static <P extends eec> eed<P> a(String $$0, Codec<P> $$1) {
      return ji.a(lc.X, $$0, new eed<>($$1));
   }

   private eed(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}
