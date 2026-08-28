import com.mojang.serialization.MapCodec;

public class elu<P extends elt> {
   public static final elu<elv> a = a("trunk_vine", elv.a);
   public static final elu<elq> b = a("leave_vine", elq.a);
   public static final elu<elr> c = a("pale_moss", elr.a);
   public static final elu<elp> d = a("creaking_heart", elp.a);
   public static final elu<elo> e = a("cocoa", elo.a);
   public static final elu<eln> f = a("beehive", eln.a);
   public static final elu<ell> g = a("alter_ground", ell.a);
   public static final elu<elm> h = a("attached_to_leaves", elm.a);
   public static final elu<els> i = a("place_on_ground", els.a);
   private final MapCodec<P> j;

   private static <P extends elt> elu<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.X, $$0, new elu<>($$1));
   }

   private elu(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}
