import com.mojang.serialization.MapCodec;

public class eof<P extends eoe> {
   public static final eof<eod> a = a("straight_trunk_placer", eod.a);
   public static final eof<eoa> b = a("forking_trunk_placer", eoa.a);
   public static final eof<eob> c = a("giant_trunk_placer", eob.a);
   public static final eof<eoc> d = a("mega_jungle_trunk_placer", eoc.b);
   public static final eof<eny> e = a("dark_oak_trunk_placer", eny.a);
   public static final eof<enz> f = a("fancy_trunk_placer", enz.a);
   public static final eof<enw> g = a("bending_trunk_placer", enw.a);
   public static final eof<eog> h = a("upwards_branching_trunk_placer", eog.a);
   public static final eof<enx> i = a("cherry_trunk_placer", enx.a);
   private final MapCodec<P> j;

   private static <P extends eoe> eof<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.V, $$0, new eof<>($$1));
   }

   private eof(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}
