import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class elh extends eli {
   public static final MapCodec<elh> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, elh::new));

   public elh(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected elj<?> a() {
      return elj.a;
   }

   @Override
   public List<ejo.a> a(dgo $$0, BiConsumer<ji, dwx> $$1, azh $$2, int $$3, ji $$4, eiy $$5) {
      a($$0, $$1, $$2, $$4.e(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new ejo.a($$4.b($$3), 0, false));
   }
}
