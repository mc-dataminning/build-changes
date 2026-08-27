import com.mojang.serialization.Codec;

public class dsr<P extends dsq> {
   public static final dsr<dsp> a = a("mangrove_root_placer", dsp.c);
   private final Codec<P> b;

   private static <P extends dsq> dsr<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.Z, $$0, new dsr<>($$1));
   }

   private dsr(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
