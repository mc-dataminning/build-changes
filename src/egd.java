import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class egd extends ege {
   public static final MapCodec<egd> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, egd::new));

   public egd(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected egf<?> a() {
      return egf.a;
   }

   @Override
   public List<eem.a> a(dcc $$0, BiConsumer<iz, dsa> $$1, azf $$2, int $$3, iz $$4, edw $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new eem.a($$4.b($$3), 0, false));
   }
}
