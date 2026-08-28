import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eoo extends eop {
   public static final MapCodec<eoo> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eoo::new));

   public eoo(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eoq<?> a() {
      return eoq.a;
   }

   @Override
   public List<emu.a> a(djb $$0, BiConsumer<iu, dzz> $$1, azv $$2, int $$3, iu $$4, eme $$5) {
      a($$0, $$1, $$2, $$4.e(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new emu.a($$4.b($$3), 0, false));
   }
}
