import com.mojang.serialization.Codec;

public class ecs<P extends ecr> {
   public static final ecs<ect> a = a("trunk_vine", ect.a);
   public static final ecs<ecq> b = a("leave_vine", ecq.a);
   public static final ecs<ecp> c = a("cocoa", ecp.a);
   public static final ecs<eco> d = a("beehive", eco.a);
   public static final ecs<ecm> e = a("alter_ground", ecm.a);
   public static final ecs<ecn> f = a("attached_to_leaves", ecn.a);
   private final Codec<P> g;

   private static <P extends ecr> ecs<P> a(String $$0, Codec<P> $$1) {
      return iy.a(kr.Z, $$0, new ecs<>($$1));
   }

   private ecs(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
