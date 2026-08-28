import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class ejw extends ejx {
   public static final MapCodec<ejw> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ejw::new));

   public ejw(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ejy<?> a() {
      return ejy.a;
   }

   @Override
   public List<eif.a> a(dfl $$0, BiConsumer<jh, dvo> $$1, azv $$2, int $$3, jh $$4, ehp $$5) {
      a($$0, $$1, $$2, $$4.e(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new eif.a($$4.b($$3), 0, false));
   }
}
