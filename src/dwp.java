import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwp extends doy implements dwn {
   public static final MapCodec<dwp> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebi.a.fieldOf("block_set_type").forGetter(doy::b), dwn.a.e.fieldOf("weathering_state").forGetter(dwp::q), t()).apply($$0, dwp::new)
   );
   private final dwn.a h;

   @Override
   public MapCodec<dwp> a() {
      return g;
   }

   protected dwp(ebi $$0, dwn.a $$1, eas.d $$2) {
      super($$0, $$2);
      this.h = $$1;
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      if ($$0.c(doy.c) == ebp.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(eat $$0) {
      return dwn.c($$0.b()).isPresent();
   }

   public dwn.a q() {
      return this.h;
   }
}
