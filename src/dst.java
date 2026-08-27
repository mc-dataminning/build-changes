import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dst extends dsu {
   public static final Codec<dst> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dst::new));

   public dst(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dsv<?> a() {
      return dsv.a;
   }

   @Override
   public List<drc.a> a(cpr $$0, BiConsumer<gu, dez> $$1, aru $$2, int $$3, gu $$4, dqm $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new drc.a($$4.b($$3), 0, false));
   }
}
