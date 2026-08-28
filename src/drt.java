import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drt extends dpm implements dro {
   public static final MapCodec<drt> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dro.a.e.fieldOf("weathering_state").forGetter(djk::c), t()).apply($$0, drt::new)
   );
   private final dro.a g;

   @Override
   public MapCodec<drt> a() {
      return f;
   }

   public drt(dro.a $$0, dvn.d $$1) {
      super($$1);
      this.g = $$0;
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dvo $$0) {
      return dro.c($$0.b()).isPresent();
   }

   public dro.a q() {
      return this.g;
   }
}
