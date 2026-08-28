import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxe extends dwz implements dxa {
   public static final MapCodec<dxe> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxa.a.e.fieldOf("weathering_state").forGetter(dxe::q), t()).apply($$0, dxe::new)
   );
   private final dxa.a f;

   @Override
   protected MapCodec<dxe> a() {
      return e;
   }

   protected dxe(dxa.a $$0, ebf.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(ebg $$0) {
      return dxa.c($$0.b()).isPresent();
   }

   public dxa.a q() {
      return this.f;
   }
}
