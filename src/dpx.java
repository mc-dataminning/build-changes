import com.mojang.serialization.Codec;

public class dpx<P extends dpw> {
   public static final dpx<dpv> a = a("straight_trunk_placer", dpv.a);
   public static final dpx<dps> b = a("forking_trunk_placer", dps.a);
   public static final dpx<dpt> c = a("giant_trunk_placer", dpt.a);
   public static final dpx<dpu> d = a("mega_jungle_trunk_placer", dpu.b);
   public static final dpx<dpq> e = a("dark_oak_trunk_placer", dpq.a);
   public static final dpx<dpr> f = a("fancy_trunk_placer", dpr.a);
   public static final dpx<dpo> g = a("bending_trunk_placer", dpo.a);
   public static final dpx<dpy> h = a("upwards_branching_trunk_placer", dpy.a);
   public static final dpx<dpp> i = a("cherry_trunk_placer", dpp.a);
   private final Codec<P> j;

   private static <P extends dpw> dpx<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.Y, $$0, new dpx<>($$1));
   }

   private dpx(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}
