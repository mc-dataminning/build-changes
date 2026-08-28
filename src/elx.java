import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class elx extends ely {
   public static final MapCodec<elx> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, elx::new));

   public elx(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected elz<?> a() {
      return elz.a;
   }

   @Override
   public List<eke.a> a(dhg $$0, BiConsumer<jh, dxn> $$1, bam $$2, int $$3, jh $$4, ejo $$5) {
      a($$0, $$1, $$2, $$4.e(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new eke.a($$4.b($$3), 0, false));
   }
}
