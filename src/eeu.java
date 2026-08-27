import com.mojang.serialization.MapCodec;

public class eeu<P extends eet> {
   public static final eeu<eev> a = a("trunk_vine", eev.a);
   public static final eeu<ees> b = a("leave_vine", ees.a);
   public static final eeu<eer> c = a("cocoa", eer.a);
   public static final eeu<eeq> d = a("beehive", eeq.a);
   public static final eeu<eeo> e = a("alter_ground", eeo.a);
   public static final eeu<eep> f = a("attached_to_leaves", eep.a);
   private final MapCodec<P> g;

   private static <P extends eet> eeu<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.Z, $$0, new eeu<>($$1));
   }

   private eeu(MapCodec<P> $$0) {
      this.g = $$0;
   }

   public MapCodec<P> a() {
      return this.g;
   }
}
