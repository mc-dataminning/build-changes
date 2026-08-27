import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dss extends dst {
   public static final Codec<dss> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dss::new));

   public dss(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dsu<?> a() {
      return dsu.a;
   }

   @Override
   public List<drb.a> a(cpq $$0, BiConsumer<gv, dey> $$1, art $$2, int $$3, gv $$4, dql $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new drb.a($$4.b($$3), 0, false));
   }
}
