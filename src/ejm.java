import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class ejm extends ejn {
   public static final MapCodec<ejm> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ejm::new));

   public ejm(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ejo<?> a() {
      return ejo.a;
   }

   @Override
   public List<ehv.a> a(dfb $$0, BiConsumer<jg, dvd> $$1, azr $$2, int $$3, jg $$4, ehf $$5) {
      a($$0, $$1, $$2, $$4.e(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new ehv.a($$4.b($$3), 0, false));
   }
}
