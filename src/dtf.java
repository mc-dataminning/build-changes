import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dtf extends dtg {
   public static final Codec<dtf> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dtf::new));

   public dtf(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dth<?> a() {
      return dth.a;
   }

   @Override
   public List<dro.a> a(cqd $$0, BiConsumer<gw, dfl> $$1, ase $$2, int $$3, gw $$4, dqy $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new dro.a($$4.b($$3), 0, false));
   }
}
