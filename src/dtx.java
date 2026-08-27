import com.mojang.serialization.Codec;

public class dtx<P extends dtw> {
   public static final dtx<dtv> a = a("straight_trunk_placer", dtv.a);
   public static final dtx<dts> b = a("forking_trunk_placer", dts.a);
   public static final dtx<dtt> c = a("giant_trunk_placer", dtt.a);
   public static final dtx<dtu> d = a("mega_jungle_trunk_placer", dtu.b);
   public static final dtx<dtq> e = a("dark_oak_trunk_placer", dtq.a);
   public static final dtx<dtr> f = a("fancy_trunk_placer", dtr.a);
   public static final dtx<dto> g = a("bending_trunk_placer", dto.a);
   public static final dtx<dty> h = a("upwards_branching_trunk_placer", dty.a);
   public static final dtx<dtp> i = a("cherry_trunk_placer", dtp.a);
   private final Codec<P> j;

   private static <P extends dtw> dtx<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.Y, $$0, new dtx<>($$1));
   }

   private dtx(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}
