import com.mojang.serialization.Codec;

public class ebv<P extends ebu> {
   public static final ebv<ebp> a = a("blob_foliage_placer", ebp.a);
   public static final ebv<eca> b = a("spruce_foliage_placer", eca.a);
   public static final ebv<eby> c = a("pine_foliage_placer", eby.a);
   public static final ebv<ebo> d = a("acacia_foliage_placer", ebo.a);
   public static final ebv<ebq> e = a("bush_foliage_placer", ebq.c);
   public static final ebv<ebt> f = a("fancy_foliage_placer", ebt.c);
   public static final ebv<ebw> g = a("jungle_foliage_placer", ebw.a);
   public static final ebv<ebx> h = a("mega_pine_foliage_placer", ebx.a);
   public static final ebv<ebs> i = a("dark_oak_foliage_placer", ebs.a);
   public static final ebv<ebz> j = a("random_spread_foliage_placer", ebz.a);
   public static final ebv<ebr> k = a("cherry_foliage_placer", ebr.a);
   private final Codec<P> l;

   private static <P extends ebu> ebv<P> a(String $$0, Codec<P> $$1) {
      return ja.a(kt.W, $$0, new ebv<>($$1));
   }

   private ebv(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}
