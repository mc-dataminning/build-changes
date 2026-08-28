import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class ege extends egf {
   public static final MapCodec<ege> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ege::new));

   public ege(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected egg<?> a() {
      return egg.a;
   }

   @Override
   public List<een.a> a(dcd $$0, BiConsumer<iz, dsb> $$1, azg $$2, int $$3, iz $$4, edx $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new een.a($$4.b($$3), 0, false));
   }
}
