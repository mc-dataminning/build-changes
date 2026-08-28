import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class elf extends elg {
   public static final MapCodec<elf> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, elf::new));

   public elf(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected elh<?> a() {
      return elh.a;
   }

   @Override
   public List<ejm.a> a(dgm $$0, BiConsumer<ji, dwv> $$1, azg $$2, int $$3, ji $$4, eiw $$5) {
      a($$0, $$1, $$2, $$4.e(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new ejm.a($$4.b($$3), 0, false));
   }
}
