import com.mojang.serialization.Codec;

public class dwl<P extends dwk> {
   public static final dwl<dwj> a = a("straight_trunk_placer", dwj.a);
   public static final dwl<dwg> b = a("forking_trunk_placer", dwg.a);
   public static final dwl<dwh> c = a("giant_trunk_placer", dwh.a);
   public static final dwl<dwi> d = a("mega_jungle_trunk_placer", dwi.b);
   public static final dwl<dwe> e = a("dark_oak_trunk_placer", dwe.a);
   public static final dwl<dwf> f = a("fancy_trunk_placer", dwf.a);
   public static final dwl<dwc> g = a("bending_trunk_placer", dwc.a);
   public static final dwl<dwm> h = a("upwards_branching_trunk_placer", dwm.a);
   public static final dwl<dwd> i = a("cherry_trunk_placer", dwd.a);
   private final Codec<P> j;

   private static <P extends dwk> dwl<P> a(String $$0, Codec<P> $$1) {
      return ir.a(kb.X, $$0, new dwl<>($$1));
   }

   private dwl(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}
