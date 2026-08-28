import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dul extends dug implements duh {
   public static final MapCodec<dul> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(duh.a.e.fieldOf("weathering_state").forGetter(dul::q), t()).apply($$0, dul::new)
   );
   private final duh.a f;

   @Override
   protected MapCodec<dul> a() {
      return e;
   }

   protected dul(duh.a $$0, dyl.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dym $$0) {
      return duh.c($$0.b()).isPresent();
   }

   public duh.a q() {
      return this.f;
   }
}
