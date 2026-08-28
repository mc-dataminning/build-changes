import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwp extends dvo implements dwi {
   public static final MapCodec<dwp> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebd.a.fieldOf("block_set_type").forGetter(dvo::q), dwi.a.e.fieldOf("weathering_state").forGetter(dwp::r), t()).apply($$0, dwp::new)
   );
   private final dwi.a h;

   @Override
   public MapCodec<dwp> a() {
      return g;
   }

   protected dwp(ebd $$0, dwi.a $$1, ean.d $$2) {
      super($$0, $$2);
      this.h = $$1;
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(eao $$0) {
      return dwi.c($$0.b()).isPresent();
   }

   public dwi.a r() {
      return this.h;
   }
}
