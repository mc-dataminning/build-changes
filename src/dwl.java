import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwl extends dmm implements dwi {
   public static final MapCodec<dwl> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwi.a.e.fieldOf("weathering_state").forGetter(dnp::c), t()).apply($$0, dwl::new)
   );
   private final dwi.a e;

   @Override
   public MapCodec<dwl> a() {
      return d;
   }

   public dwl(dwi.a $$0, ean.d $$1) {
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
