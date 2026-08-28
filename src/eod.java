import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eod extends eoe {
   public static final MapCodec<eod> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eod::new));

   public eod(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eof<?> a() {
      return eof.a;
   }

   @Override
   public List<emj.a> a(div $$0, BiConsumer<iu, dzo> $$1, azt $$2, int $$3, iu $$4, elt $$5) {
      a($$0, $$1, $$2, $$4.e(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new emj.a($$4.b($$3), 0, false));
   }
}
