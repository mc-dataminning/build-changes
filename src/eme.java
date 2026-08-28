import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eme extends emf {
   public static final MapCodec<eme> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eme::new));

   public eme(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected emg<?> a() {
      return emg.a;
   }

   @Override
   public List<ekl.a> a(dhn $$0, BiConsumer<jh, dxu> $$1, bam $$2, int $$3, jh $$4, ejv $$5) {
      a($$0, $$1, $$2, $$4.e(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new ekl.a($$4.b($$3), 0, false));
   }
}
