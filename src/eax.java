import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eax extends eay {
   public static final Codec<eax> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, eax::new));

   public eax(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eaz<?> a() {
      return eaz.a;
   }

   @Override
   public List<dzg.a> a(cxf $$0, BiConsumer<ib, dmz> $$1, axd $$2, int $$3, ib $$4, dyq $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new dzg.a($$4.b($$3), 0, false));
   }
}
