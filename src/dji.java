import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dji extends djd implements dje {
   public static final MapCodec<dji> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dje.a.e.fieldOf("weathering_state").forGetter(dji::i), u()).apply($$0, dji::new)
   );
   private final dje.a f;

   @Override
   protected MapCodec<dji> a() {
      return e;
   }

   protected dji(dje.a $$0, dmy.d $$1) {
      super($$1);
      this.f = $$0;
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
      return this.f;
   }
}
