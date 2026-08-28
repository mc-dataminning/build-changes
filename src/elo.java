import com.mojang.serialization.MapCodec;

public class elo<P extends eln> {
   public static final elo<elp> a = a("trunk_vine", elp.a);
   public static final elo<ell> b = a("leave_vine", ell.a);
   public static final elo<elm> c = a("pale_moss", elm.a);
   public static final elo<elk> d = a("creaking_heart", elk.a);
   public static final elo<elj> e = a("cocoa", elj.a);
   public static final elo<eli> f = a("beehive", eli.a);
   public static final elo<elg> g = a("alter_ground", elg.a);
   public static final elo<elh> h = a("attached_to_leaves", elh.a);
   private final MapCodec<P> i;

   private static <P extends eln> elo<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.X, $$0, new elo<>($$1));
   }

   private elo(MapCodec<P> $$0) {
      this.i = $$0;
   }

   public MapCodec<P> a() {
      return this.i;
   }
}
