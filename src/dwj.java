import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dwj extends dwk {
   public static final Codec<dwj> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dwj::new));

   public dwj(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dwl<?> a() {
      return dwl.a;
   }

   @Override
   public List<dus.a> a(cte $$0, BiConsumer<hv, dip> $$1, auf $$2, int $$3, hv $$4, duc $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new dus.a($$4.b($$3), 0, false));
   }
}
