import com.mojang.serialization.Codec;

public class dru<P extends drt> {
   public static final dru<drs> a = a("mangrove_root_placer", drs.c);
   private final Codec<P> b;

   private static <P extends drt> dru<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.Z, $$0, new dru<>($$1));
   }

   private dru(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
