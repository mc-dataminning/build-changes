import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhy extends dha implements dhr {
   public static final MapCodec<dhy> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dlu.a.fieldOf("block_set_type").forGetter(dha::g), dhr.a.e.fieldOf("weathering_state").forGetter(dhy::s), u()).apply($$0, dhy::new)
   );
   private final dhr.a n;

   @Override
   public MapCodec<dhy> a() {
      return m;
   }

   protected dhy(dlu $$0, dhr.a $$1, dle.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dlf $$0) {
      return dhr.c($$0.b()).isPresent();
   }

   public dhr.a s() {
      return this.n;
   }
}
