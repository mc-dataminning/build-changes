import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class elg extends elh {
   public static final MapCodec<elg> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, elg::new));

   public elg(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eli<?> a() {
      return eli.a;
   }

   @Override
   public List<ejn.a> a(dgn $$0, BiConsumer<ji, dww> $$1, azh $$2, int $$3, ji $$4, eix $$5) {
      a($$0, $$1, $$2, $$4.e(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new ejn.a($$4.b($$3), 0, false));
   }
}
