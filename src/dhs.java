import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhs extends dac implements dhr {
   public static final MapCodec<dhs> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhr.a.e.fieldOf("weathering_state").forGetter(dhs::g), u()).apply($$0, dhs::new)
   );
   private final dhr.a e;

   @Override
   protected MapCodec<dhs> a() {
      return d;
   }

   public dhs(dhr.a $$0, dle.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dlf $$0) {
      return dhr.c($$0.b()).isPresent();
   }

   public dhr.a g() {
      return this.e;
   }
}
