import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwm extends dwh implements dwi {
   public static final MapCodec<dwm> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwi.a.e.fieldOf("weathering_state").forGetter(dwm::q), t()).apply($$0, dwm::new)
   );
   private final dwi.a f;

   @Override
   protected MapCodec<dwm> a() {
      return e;
   }

   protected dwm(dwi.a $$0, ean.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(eao $$0) {
      return dwi.c($$0.b()).isPresent();
   }

   public dwi.a q() {
      return this.f;
   }
}
