import com.mojang.serialization.Codec;

public class eem<P extends eel> {
   public static final eem<eek> a = a("straight_trunk_placer", eek.a);
   public static final eem<eeh> b = a("forking_trunk_placer", eeh.a);
   public static final eem<eei> c = a("giant_trunk_placer", eei.a);
   public static final eem<eej> d = a("mega_jungle_trunk_placer", eej.b);
   public static final eem<eef> e = a("dark_oak_trunk_placer", eef.a);
   public static final eem<eeg> f = a("fancy_trunk_placer", eeg.a);
   public static final eem<eed> g = a("bending_trunk_placer", eed.a);
   public static final eem<een> h = a("upwards_branching_trunk_placer", een.a);
   public static final eem<eee> i = a("cherry_trunk_placer", eee.a);
   private final Codec<P> j;

   private static <P extends eel> eem<P> a(String $$0, Codec<P> $$1) {
      return jj.a(ld.X, $$0, new eem<>($$1));
   }

   private eem(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}
