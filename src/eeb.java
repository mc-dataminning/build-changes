import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eeb extends eec {
   public static final Codec<eeb> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, eeb::new));

   public eeb(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eed<?> a() {
      return eed.a;
   }

   @Override
   public List<eck.a> a(daa $$0, BiConsumer<im, dpy> $$1, ayd $$2, int $$3, im $$4, ebu $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new eck.a($$4.b($$3), 0, false));
   }
}
