import com.mojang.serialization.MapCodec;

public class emr<P extends emq> {
   public static final emr<ems> a = a("trunk_vine", ems.a);
   public static final emr<emn> b = a("leave_vine", emn.a);
   public static final emr<emo> c = a("pale_moss", emo.a);
   public static final emr<emm> d = a("creaking_heart", emm.a);
   public static final emr<eml> e = a("cocoa", eml.a);
   public static final emr<emk> f = a("beehive", emk.a);
   public static final emr<emi> g = a("alter_ground", emi.a);
   public static final emr<emj> h = a("attached_to_leaves", emj.a);
   public static final emr<emp> i = a("place_on_ground", emp.a);
   private final MapCodec<P> j;

   private static <P extends emq> emr<P> a(String $$0, MapCodec<P> $$1) {
      return kf.a(md.X, $$0, new emr<>($$1));
   }

   private emr(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}
