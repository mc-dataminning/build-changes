import com.mojang.serialization.Codec;

public class drt<P extends drs> {
   public static final drt<drr> a = a("mangrove_root_placer", drr.c);
   private final Codec<P> b;

   private static <P extends drs> drt<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.Z, $$0, new drt<>($$1));
   }

   private drt(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
