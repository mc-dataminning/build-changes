import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eka extends ekc {
   public static final MapCodec<eka> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c(), b(), d()).apply($$0, eka::new));

   protected eka(Either<akk, emw> $$0, jj<emu> $$1, ekf.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ems a(dlu $$0, eio $$1, boolean $$2) {
      ems $$3 = super.a($$0, $$1, $$2);
      $$3.b(ely.b);
      $$3.a(ely.d);
      return $$3;
   }

   @Override
   public eke<?> a() {
      return eke.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
