import com.mojang.serialization.MapCodec;

public class elu<P extends elt> {
   public static final elu<elv> a = a("trunk_vine", elv.a);
   public static final elu<elr> b = a("leave_vine", elr.a);
   public static final elu<els> c = a("pale_moss", els.a);
   public static final elu<elq> d = a("creaking_heart", elq.a);
   public static final elu<elp> e = a("cocoa", elp.a);
   public static final elu<elo> f = a("beehive", elo.a);
   public static final elu<elm> g = a("alter_ground", elm.a);
   public static final elu<eln> h = a("attached_to_leaves", eln.a);
   private final MapCodec<P> i;

   private static <P extends elt> elu<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.X, $$0, new elu<>($$1));
   }

   private elu(MapCodec<P> $$0) {
      this.i = $$0;
   }

   public MapCodec<P> a() {
      return this.i;
   }
}
