import com.mojang.serialization.Codec;

public class drq<P extends drp> {
   public static final drq<dro> a = a("mangrove_root_placer", dro.c);
   private final Codec<P> b;

   private static <P extends drp> drq<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.Z, $$0, new drq<>($$1));
   }

   private drq(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
