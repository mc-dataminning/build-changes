import com.mojang.serialization.Codec;

public class dut<P extends dus> {
   public static final dut<dun> a = a("blob_foliage_placer", dun.a);
   public static final dut<duy> b = a("spruce_foliage_placer", duy.a);
   public static final dut<duw> c = a("pine_foliage_placer", duw.a);
   public static final dut<dum> d = a("acacia_foliage_placer", dum.a);
   public static final dut<duo> e = a("bush_foliage_placer", duo.c);
   public static final dut<dur> f = a("fancy_foliage_placer", dur.c);
   public static final dut<duu> g = a("jungle_foliage_placer", duu.a);
   public static final dut<duv> h = a("mega_pine_foliage_placer", duv.a);
   public static final dut<duq> i = a("dark_oak_foliage_placer", duq.a);
   public static final dut<dux> j = a("random_spread_foliage_placer", dux.a);
   public static final dut<dup> k = a("cherry_foliage_placer", dup.a);
   private final Codec<P> l;

   private static <P extends dus> dut<P> a(String $$0, Codec<P> $$1) {
      return ir.a(kb.W, $$0, new dut<>($$1));
   }

   private dut(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}
