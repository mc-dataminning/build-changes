import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drq extends dqr implements drj {
   public static final MapCodec<drq> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvy.a.fieldOf("block_set_type").forGetter(dqr::q), drj.a.e.fieldOf("weathering_state").forGetter(drq::r), t()).apply($$0, drq::new)
   );
   private final drj.a n;

   @Override
   public MapCodec<drq> a() {
      return m;
   }

   protected drq(dvy $$0, drj.a $$1, dvi.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dvj $$0) {
      return drj.c($$0.b()).isPresent();
   }

   public drj.a r() {
      return this.n;
   }
}
