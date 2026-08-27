import com.mojang.serialization.Codec;

public class dvj<P extends dvi> {
   public static final dvj<dvh> a = a("straight_trunk_placer", dvh.a);
   public static final dvj<dve> b = a("forking_trunk_placer", dve.a);
   public static final dvj<dvf> c = a("giant_trunk_placer", dvf.a);
   public static final dvj<dvg> d = a("mega_jungle_trunk_placer", dvg.b);
   public static final dvj<dvc> e = a("dark_oak_trunk_placer", dvc.a);
   public static final dvj<dvd> f = a("fancy_trunk_placer", dvd.a);
   public static final dvj<dva> g = a("bending_trunk_placer", dva.a);
   public static final dvj<dvk> h = a("upwards_branching_trunk_placer", dvk.a);
   public static final dvj<dvb> i = a("cherry_trunk_placer", dvb.a);
   private final Codec<P> j;

   private static <P extends dvi> dvj<P> a(String $$0, Codec<P> $$1) {
      return is.a(kc.Y, $$0, new dvj<>($$1));
   }

   private dvj(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}
