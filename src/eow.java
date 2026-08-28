import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eow extends eox {
   public static final MapCodec<eow> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eow::new));

   public eow(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eoy<?> a() {
      return eoy.a;
   }

   @Override
   public List<enc.a> a(djg $$0, BiConsumer<iu, eah> $$1, azv $$2, int $$3, iu $$4, emm $$5) {
      a($$0, $$1, $$2, $$4.e(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new enc.a($$4.b($$3), 0, false));
   }
}
