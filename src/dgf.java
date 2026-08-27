import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgf extends dga implements dgb {
   public static final MapCodec<dgf> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgb.a.e.fieldOf("weathering_state").forGetter(dgf::g), u()).apply($$0, dgf::new)
   );
   private final dgb.a f;

   @Override
   protected MapCodec<dgf> a() {
      return e;
   }

   protected dgf(dgb.a $$0, djo.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(djp $$0) {
      return dgb.c($$0.b()).isPresent();
   }

   public dgb.a g() {
      return this.f;
   }
}
