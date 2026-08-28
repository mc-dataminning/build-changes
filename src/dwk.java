import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwk extends dot implements dwi {
   public static final MapCodec<dwk> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebd.a.fieldOf("block_set_type").forGetter(dot::b), dwi.a.e.fieldOf("weathering_state").forGetter(dwk::q), t()).apply($$0, dwk::new)
   );
   private final dwi.a h;

   @Override
   public MapCodec<dwk> a() {
      return g;
   }

   protected dwk(ebd $$0, dwi.a $$1, ean.d $$2) {
      super($$0, $$2);
      this.h = $$1;
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      if ($$0.c(dot.c) == ebk.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(eao $$0) {
      return dwi.c($$0.b()).isPresent();
   }

   public dwi.a q() {
      return this.h;
   }
}
