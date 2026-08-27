import com.mojang.serialization.Codec;

public class dor<P extends doq> {
   public static final dor<dop> a = a("mangrove_root_placer", dop.c);
   private final Codec<P> b;

   private static <P extends doq> dor<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.Z, $$0, new dor<>($$1));
   }

   private dor(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
