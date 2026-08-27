import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dsx extends dsy {
   public static final Codec<dsx> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dsx::new));

   public dsx(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dsz<?> a() {
      return dsz.a;
   }

   @Override
   public List<drg.a> a(cqh $$0, BiConsumer<gw, dfd> $$1, ash $$2, int $$3, gw $$4, dqq $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new drg.a($$4.b($$3), 0, false));
   }
}
