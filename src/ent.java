import com.mojang.serialization.MapCodec;

public class ent<P extends ens> {
   public static final ent<enu> a = a("trunk_vine", enu.a);
   public static final ent<enp> b = a("leave_vine", enp.a);
   public static final ent<enq> c = a("pale_moss", enq.a);
   public static final ent<eno> d = a("creaking_heart", eno.a);
   public static final ent<enn> e = a("cocoa", enn.a);
   public static final ent<enm> f = a("beehive", enm.a);
   public static final ent<enk> g = a("alter_ground", enk.a);
   public static final ent<enl> h = a("attached_to_leaves", enl.a);
   public static final ent<enr> i = a("place_on_ground", enr.a);
   private final MapCodec<P> j;

   private static <P extends ens> ent<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.X, $$0, new ent<>($$1));
   }

   private ent(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}
