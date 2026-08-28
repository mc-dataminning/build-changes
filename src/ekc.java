import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekc extends eke {
   public static final MapCodec<ekc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c(), b(), d()).apply($$0, ekc::new));

   protected ekc(Either<akk, emy> $$0, jj<emw> $$1, ekh.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected emu a(dlv $$0, eip $$1, boolean $$2) {
      emu $$3 = super.a($$0, $$1, $$2);
      $$3.b(ema.b);
      $$3.a(ema.d);
      return $$3;
   }

   @Override
   public ekg<?> a() {
      return ekg.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
