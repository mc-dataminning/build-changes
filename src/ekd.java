import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class ekd extends eke {
   public static final MapCodec<ekd> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ekd::new));

   public ekd(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ekf<?> a() {
      return ekf.a;
   }

   @Override
   public List<eim.a> a(dfs $$0, BiConsumer<jh, dvv> $$1, azu $$2, int $$3, jh $$4, ehw $$5) {
      a($$0, $$1, $$2, $$4.e(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new eim.a($$4.b($$3), 0, false));
   }
}
