import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dro extends dph implements drj {
   public static final MapCodec<dro> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drj.a.e.fieldOf("weathering_state").forGetter(djf::c), t()).apply($$0, dro::new)
   );
   private final drj.a g;

   @Override
   public MapCodec<dro> a() {
      return f;
   }

   public dro(drj.a $$0, dvi.d $$1) {
      super($$1);
      this.g = $$0;
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dvj $$0) {
      return drj.c($$0.b()).isPresent();
   }

   public drj.a q() {
      return this.g;
   }
}
