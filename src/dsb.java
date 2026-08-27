import com.mojang.serialization.Codec;

public class dsb<P extends dsa> {
   public static final dsb<drz> a = a("mangrove_root_placer", drz.c);
   private final Codec<P> b;

   private static <P extends dsa> dsb<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.Z, $$0, new dsb<>($$1));
   }

   private dsb(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
