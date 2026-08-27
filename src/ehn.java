import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class ehn extends eho {
   public static final Codec<ehn> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, ehn::new));

   public ehn(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ehp<?> a() {
      return ehp.a;
   }

   @Override
   public List<efw.a> a(dcg $$0, BiConsumer<ir, dtc> $$1, ayt $$2, int $$3, ir $$4, efg $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new efw.a($$4.b($$3), 0, false));
   }
}
