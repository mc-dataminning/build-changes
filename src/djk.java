import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djk extends dht implements dje {
   public static final MapCodec<djk> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dje.a.e.fieldOf("weathering_state").forGetter(dbb::c), dmz.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, djk::new)
   );
   private final dje.a J;

   @Override
   public MapCodec<djk> a() {
      return I;
   }

   public djk(dje.a $$0, dmz $$1, dmy.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dmz $$0) {
      return dje.c($$0.b()).isPresent();
   }

   public dje.a i() {
      return this.J;
   }
}
