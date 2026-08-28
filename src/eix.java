import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eix extends eiy {
   public static final MapCodec<eix> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eix::new));

   public eix(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eiz<?> a() {
      return eiz.a;
   }

   @Override
   public List<ehg.a> a(dem $$0, BiConsumer<je, duo> $$1, azl $$2, int $$3, je $$4, egq $$5) {
      a($$0, $$1, $$2, $$4.e(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new ehg.a($$4.b($$3), 0, false));
   }
}
