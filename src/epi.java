import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class epi extends epj {
   public static final MapCodec<epi> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, epi::new));

   public epi(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected epk<?> a() {
      return epk.a;
   }

   @Override
   public List<eno.a> a(djs $$0, BiConsumer<iv, eat> $$1, azv $$2, int $$3, iv $$4, emy $$5) {
      a($$0, $$1, $$2, $$4.e(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new eno.a($$4.b($$3), 0, false));
   }
}
