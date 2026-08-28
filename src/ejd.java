import com.mojang.serialization.MapCodec;

public class ejd<P extends ejc> {
   public static final ejd<ejb> a = a("straight_trunk_placer", ejb.a);
   public static final ejd<eiy> b = a("forking_trunk_placer", eiy.a);
   public static final ejd<eiz> c = a("giant_trunk_placer", eiz.a);
   public static final ejd<eja> d = a("mega_jungle_trunk_placer", eja.b);
   public static final ejd<eiw> e = a("dark_oak_trunk_placer", eiw.a);
   public static final ejd<eix> f = a("fancy_trunk_placer", eix.a);
   public static final ejd<eiu> g = a("bending_trunk_placer", eiu.a);
   public static final ejd<eje> h = a("upwards_branching_trunk_placer", eje.a);
   public static final ejd<eiv> i = a("cherry_trunk_placer", eiv.a);
   private final MapCodec<P> j;

   private static <P extends ejc> ejd<P> a(String $$0, MapCodec<P> $$1) {
      return kb.a(lv.V, $$0, new ejd<>($$1));
   }

   private ejd(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}
