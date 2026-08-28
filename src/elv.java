import com.mojang.serialization.MapCodec;

public class elv<P extends elu> {
   public static final elv<elw> a = a("trunk_vine", elw.a);
   public static final elv<els> b = a("leave_vine", els.a);
   public static final elv<elt> c = a("pale_moss", elt.a);
   public static final elv<elr> d = a("creaking_heart", elr.a);
   public static final elv<elq> e = a("cocoa", elq.a);
   public static final elv<elp> f = a("beehive", elp.a);
   public static final elv<eln> g = a("alter_ground", eln.a);
   public static final elv<elo> h = a("attached_to_leaves", elo.a);
   private final MapCodec<P> i;

   private static <P extends elu> elv<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.X, $$0, new elv<>($$1));
   }

   private elv(MapCodec<P> $$0) {
      this.i = $$0;
   }

   public MapCodec<P> a() {
      return this.i;
   }
}
