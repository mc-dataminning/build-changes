import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwo extends duq implements dwi {
   public static final MapCodec<dwo> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwi.a.e.fieldOf("weathering_state").forGetter(dnp::c), eao.a.fieldOf("base_state").forGetter($$0x -> $$0x.f), t()).apply($$0, dwo::new)
   );
   private final dwi.a h;

   @Override
   public MapCodec<dwo> a() {
      return g;
   }

   public dwo(dwi.a $$0, eao $$1, ean.d $$2) {
      super($$1, $$2);
      this.h = $$0;
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
      return this.h;
   }
}
