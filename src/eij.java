import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eij extends eik {
   public static final MapCodec<eij> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eij::new));

   public eij(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eil<?> a() {
      return eil.a;
   }

   @Override
   public List<egs.a> a(ddy $$0, BiConsumer<je, dua> $$1, azk $$2, int $$3, je $$4, egc $$5) {
      a($$0, $$1, $$2, $$4.e(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new egs.a($$4.b($$3), 0, false));
   }
}
