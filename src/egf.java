import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class egf extends egg {
   public static final MapCodec<egf> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, egf::new));

   public egf(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected egh<?> a() {
      return egh.a;
   }

   @Override
   public List<eeo.a> a(dce $$0, BiConsumer<iz, dsc> $$1, azh $$2, int $$3, iz $$4, edy $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new eeo.a($$4.b($$3), 0, false));
   }
}
