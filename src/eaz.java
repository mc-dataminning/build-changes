import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eaz extends eba {
   public static final Codec<eaz> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, eaz::new));

   public eaz(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ebb<?> a() {
      return ebb.a;
   }

   @Override
   public List<dzi.a> a(cxh $$0, BiConsumer<ib, dnb> $$1, axd $$2, int $$3, ib $$4, dys $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new dzi.a($$4.b($$3), 0, false));
   }
}
