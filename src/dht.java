import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dht extends dau implements dhr {
   public static final MapCodec<dht> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dlu.a.fieldOf("block_set_type").forGetter(dau::b), dhr.a.e.fieldOf("weathering_state").forGetter(dht::g), u()).apply($$0, dht::new)
   );
   private final dhr.a m;

   @Override
   public MapCodec<dht> a() {
      return l;
   }

   protected dht(dlu $$0, dhr.a $$1, dle.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if ($$0.c(dau.f) == dmb.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean e_(dlf $$0) {
      return dhr.c($$0.b()).isPresent();
   }

   public dhr.a g() {
      return this.m;
   }
}
