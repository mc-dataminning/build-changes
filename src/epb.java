import com.mojang.serialization.MapCodec;

public class epb extends eos {
   public static final MapCodec<epb> b = ebg.a.fieldOf("state").xmap(epb::new, $$0 -> $$0.c);
   private final ebg c;

   protected epb(ebg $$0) {
      this.c = $$0;
   }

   @Override
   protected eot<?> a() {
      return eot.a;
   }

   @Override
   public ebg a(azz $$0, iw $$1) {
      return this.c;
   }
}
