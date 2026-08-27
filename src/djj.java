import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djj extends dhc implements dje {
   public static final MapCodec<djj> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dje.a.e.fieldOf("weathering_state").forGetter(dbb::c), u()).apply($$0, djj::new)
   );
   private final dje.a g;

   @Override
   public MapCodec<djj> a() {
      return f;
   }

   public djj(dje.a $$0, dmy.d $$1) {
      super($$1);
      this.g = $$0;
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
      return this.g;
   }
}
