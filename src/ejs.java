import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class ejs extends ejt {
   public static final MapCodec<ejs> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ejs::new));

   public ejs(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eju<?> a() {
      return eju.a;
   }

   @Override
   public List<eib.a> a(dfh $$0, BiConsumer<jh, dvj> $$1, azs $$2, int $$3, jh $$4, ehl $$5) {
      a($$0, $$1, $$2, $$4.e(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new eib.a($$4.b($$3), 0, false));
   }
}
