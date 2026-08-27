import com.mojang.serialization.Codec;

public class dus<P extends dur> {
   public static final dus<duq> a = a("straight_trunk_placer", duq.a);
   public static final dus<dun> b = a("forking_trunk_placer", dun.a);
   public static final dus<duo> c = a("giant_trunk_placer", duo.a);
   public static final dus<dup> d = a("mega_jungle_trunk_placer", dup.b);
   public static final dus<dul> e = a("dark_oak_trunk_placer", dul.a);
   public static final dus<dum> f = a("fancy_trunk_placer", dum.a);
   public static final dus<duj> g = a("bending_trunk_placer", duj.a);
   public static final dus<dut> h = a("upwards_branching_trunk_placer", dut.a);
   public static final dus<duk> i = a("cherry_trunk_placer", duk.a);
   private final Codec<P> j;

   private static <P extends dur> dus<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.Y, $$0, new dus<>($$1));
   }

   private dus(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}
