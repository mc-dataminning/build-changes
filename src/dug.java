import com.mojang.serialization.Codec;

public class dug<P extends duf> {
   public static final dug<duh> a = a("trunk_vine", duh.a);
   public static final dug<due> b = a("leave_vine", due.a);
   public static final dug<dud> c = a("cocoa", dud.a);
   public static final dug<duc> d = a("beehive", duc.a);
   public static final dug<dua> e = a("alter_ground", dua.a);
   public static final dug<dub> f = a("attached_to_leaves", dub.a);
   private final Codec<P> g;

   private static <P extends duf> dug<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.aa, $$0, new dug<>($$1));
   }

   private dug(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
