import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dvh extends dvi {
   public static final Codec<dvh> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dvh::new));

   public dvh(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dvj<?> a() {
      return dvj.a;
   }

   @Override
   public List<dtq.a> a(csl $$0, BiConsumer<hx, dhn> $$1, atw $$2, int $$3, hx $$4, dta $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new dtq.a($$4.b($$3), 0, false));
   }
}
