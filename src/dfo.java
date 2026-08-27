import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfo extends cyp implements dfm {
   public static final MapCodec<dfo> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djp.a.fieldOf("block_set_type").forGetter(cyp::b), dfm.a.e.fieldOf("weathering_state").forGetter(dfo::g), u()).apply($$0, dfo::new)
   );
   private final dfm.a m;

   @Override
   public MapCodec<dfo> a() {
      return l;
   }

   protected dfo(djp $$0, dfm.a $$1, diz.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$0.c(cyp.f) == djw.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean e_(dja $$0) {
      return dfm.c($$0.b()).isPresent();
   }

   public dfm.a g() {
      return this.m;
   }
}
