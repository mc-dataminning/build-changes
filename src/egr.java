import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class egr extends egs {
   public static final MapCodec<egr> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, egr::new));

   public egr(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected egt<?> a() {
      return egt.a;
   }

   @Override
   public List<efa.a> a(dcl $$0, BiConsumer<ja, dsk> $$1, ayo $$2, int $$3, ja $$4, eek $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new efa.a($$4.b($$3), 0, false));
   }
}
