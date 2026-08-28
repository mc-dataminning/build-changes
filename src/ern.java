import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ern extends erp {
   public static final MapCodec<ern> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, ern::new));

   protected ern(Either<ale, euk> $$0, je<eui> $$1, ers.a $$2, Optional<etu> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected eug a(dsm $$0, eqa $$1, etu $$2, boolean $$3) {
      eug $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(etl.b);
      $$4.a(etl.d);
      return $$4;
   }

   @Override
   public err<?> a() {
      return err.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
