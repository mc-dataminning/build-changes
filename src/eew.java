import com.mojang.serialization.MapCodec;

public class eew<P extends eev> {
   public static final eew<eex> a = a("trunk_vine", eex.a);
   public static final eew<eeu> b = a("leave_vine", eeu.a);
   public static final eew<eet> c = a("cocoa", eet.a);
   public static final eew<ees> d = a("beehive", ees.a);
   public static final eew<eeq> e = a("alter_ground", eeq.a);
   public static final eew<eer> f = a("attached_to_leaves", eer.a);
   private final MapCodec<P> g;

   private static <P extends eev> eew<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.Z, $$0, new eew<>($$1));
   }

   private eew(MapCodec<P> $$0) {
      this.g = $$0;
   }

   public MapCodec<P> a() {
      return this.g;
   }
}
