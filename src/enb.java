import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class enb extends enc {
   public static final MapCodec<enb> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, enb::new));

   public enb(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected end<?> a() {
      return end.a;
   }

   @Override
   public List<elh.a> a(dhv $$0, BiConsumer<jj, dym> $$1, azs $$2, int $$3, jj $$4, ekr $$5) {
      a($$0, $$1, $$2, $$4.e(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new elh.a($$4.b($$3), 0, false));
   }
}
