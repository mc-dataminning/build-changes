import com.mojang.serialization.Codec;

public class dve<P extends dvd> {
   public static final dve<dvc> a = a("straight_trunk_placer", dvc.a);
   public static final dve<duz> b = a("forking_trunk_placer", duz.a);
   public static final dve<dva> c = a("giant_trunk_placer", dva.a);
   public static final dve<dvb> d = a("mega_jungle_trunk_placer", dvb.b);
   public static final dve<dux> e = a("dark_oak_trunk_placer", dux.a);
   public static final dve<duy> f = a("fancy_trunk_placer", duy.a);
   public static final dve<duv> g = a("bending_trunk_placer", duv.a);
   public static final dve<dvf> h = a("upwards_branching_trunk_placer", dvf.a);
   public static final dve<duw> i = a("cherry_trunk_placer", duw.a);
   private final Codec<P> j;

   private static <P extends dvd> dve<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.Y, $$0, new dve<>($$1));
   }

   private dve(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}
