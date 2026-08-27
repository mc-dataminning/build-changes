import com.mojang.serialization.Codec;

public class drz<P extends dry> {
   public static final drz<drx> a = a("mangrove_root_placer", drx.c);
   private final Codec<P> b;

   private static <P extends dry> drz<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.Z, $$0, new drz<>($$1));
   }

   private drz(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
