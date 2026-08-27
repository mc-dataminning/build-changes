import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eek extends eel {
   public static final Codec<eek> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, eek::new));

   public eek(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eem<?> a() {
      return eem.a;
   }

   @Override
   public List<ect.a> a(daj $$0, BiConsumer<in, dqh> $$1, ayg $$2, int $$3, in $$4, ecd $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new ect.a($$4.b($$3), 0, false));
   }
}
