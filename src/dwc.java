import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwc extends dnu implements dwb {
   public static final MapCodec<dwc> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwb.a.e.fieldOf("weathering_state").forGetter(dwc::q), t()).apply($$0, dwc::new)
   );
   private final dwb.a e;

   @Override
   protected MapCodec<dwc> a() {
      return d;
   }

   public dwc(dwb.a $$0, eag.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(eah $$0) {
      return dwb.c($$0.b()).isPresent();
   }

   public dwb.a q() {
      return this.e;
   }
}
