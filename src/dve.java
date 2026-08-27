import com.mojang.serialization.Codec;

public class dve<P extends dvd> {
   public static final dve<duy> a = a("blob_foliage_placer", duy.a);
   public static final dve<dvj> b = a("spruce_foliage_placer", dvj.a);
   public static final dve<dvh> c = a("pine_foliage_placer", dvh.a);
   public static final dve<dux> d = a("acacia_foliage_placer", dux.a);
   public static final dve<duz> e = a("bush_foliage_placer", duz.c);
   public static final dve<dvc> f = a("fancy_foliage_placer", dvc.c);
   public static final dve<dvf> g = a("jungle_foliage_placer", dvf.a);
   public static final dve<dvg> h = a("mega_pine_foliage_placer", dvg.a);
   public static final dve<dvb> i = a("dark_oak_foliage_placer", dvb.a);
   public static final dve<dvi> j = a("random_spread_foliage_placer", dvi.a);
   public static final dve<dva> k = a("cherry_foliage_placer", dva.a);
   private final Codec<P> l;

   private static <P extends dvd> dve<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.W, $$0, new dve<>($$1));
   }

   private dve(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}
