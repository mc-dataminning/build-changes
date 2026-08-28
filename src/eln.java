import com.mojang.serialization.MapCodec;

public class eln<P extends elm> {
   public static final eln<elo> a = a("trunk_vine", elo.a);
   public static final eln<elk> b = a("leave_vine", elk.a);
   public static final eln<ell> c = a("pale_moss", ell.a);
   public static final eln<elj> d = a("creaking_heart", elj.a);
   public static final eln<eli> e = a("cocoa", eli.a);
   public static final eln<elh> f = a("beehive", elh.a);
   public static final eln<elf> g = a("alter_ground", elf.a);
   public static final eln<elg> h = a("attached_to_leaves", elg.a);
   private final MapCodec<P> i;

   private static <P extends elm> eln<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.X, $$0, new eln<>($$1));
   }

   private eln(MapCodec<P> $$0) {
      this.i = $$0;
   }

   public MapCodec<P> a() {
      return this.i;
   }
}
