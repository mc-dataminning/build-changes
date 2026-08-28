import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class egs extends egt {
   public static final MapCodec<egs> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, egs::new));

   public egs(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected egu<?> a() {
      return egu.a;
   }

   @Override
   public List<efb.a> a(dcm $$0, BiConsumer<ja, dsl> $$1, ayo $$2, int $$3, ja $$4, eel $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new efb.a($$4.b($$3), 0, false));
   }
}
