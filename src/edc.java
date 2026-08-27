import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class edc extends edd {
   public static final Codec<edc> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, edc::new));

   public edc(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ede<?> a() {
      return ede.a;
   }

   @Override
   public List<ebl.a> a(czd $$0, BiConsumer<ib, doz> $$1, axr $$2, int $$3, ib $$4, eav $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new ebl.a($$4.b($$3), 0, false));
   }
}
