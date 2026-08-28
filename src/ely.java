import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class ely extends elz {
   public static final MapCodec<ely> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ely::new));

   public ely(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ema<?> a() {
      return ema.a;
   }

   @Override
   public List<ekf.a> a(dhf $$0, BiConsumer<jh, dxo> $$1, bac $$2, int $$3, jh $$4, ejp $$5) {
      a($$0, $$1, $$2, $$4.e(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new ekf.a($$4.b($$3), 0, false));
   }
}
