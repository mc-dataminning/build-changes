import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwj extends dob implements dwi {
   public static final MapCodec<dwj> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwi.a.e.fieldOf("weathering_state").forGetter(dwj::q), t()).apply($$0, dwj::new)
   );
   private final dwi.a e;

   @Override
   protected MapCodec<dwj> a() {
      return d;
   }

   public dwj(dwi.a $$0, ean.d $$1) {
      super($$1);
      this.e = $$0;
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
      return this.e;
   }
}
