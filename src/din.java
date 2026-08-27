import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class din extends dii implements dij {
   public static final MapCodec<din> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dij.a.e.fieldOf("weathering_state").forGetter(din::i), u()).apply($$0, din::new)
   );
   private final dij.a f;

   @Override
   protected MapCodec<din> a() {
      return e;
   }

   protected din(dij.a $$0, dmd.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dme $$0) {
      return dij.c($$0.b()).isPresent();
   }

   public dij.a i() {
      return this.f;
   }
}
