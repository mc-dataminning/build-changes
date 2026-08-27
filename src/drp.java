import com.mojang.serialization.Codec;

public class drp<P extends dro> {
   public static final drp<drn> a = a("mangrove_root_placer", drn.c);
   private final Codec<P> b;

   private static <P extends dro> drp<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.Z, $$0, new drp<>($$1));
   }

   private drp(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
