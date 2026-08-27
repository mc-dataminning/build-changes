import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dzg extends dzh {
   public static final Codec<dzg> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dzg::new));

   public dzg(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dzi<?> a() {
      return dzi.a;
   }

   @Override
   public List<dxp.a> a(cvx $$0, BiConsumer<hz, dlj> $$1, awp $$2, int $$3, hz $$4, dwz $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new dxp.a($$4.b($$3), 0, false));
   }
}
