import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class egl extends egm {
   public static final MapCodec<egl> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, egl::new));

   public egl(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected egn<?> a() {
      return egn.a;
   }

   @Override
   public List<eeu.a> a(dcj $$0, BiConsumer<ja, dsh> $$1, aym $$2, int $$3, ja $$4, eee $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new eeu.a($$4.b($$3), 0, false));
   }
}
