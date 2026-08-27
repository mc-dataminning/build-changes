import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dtv extends dtw {
   public static final Codec<dtv> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dtv::new));

   public dtv(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dtx<?> a() {
      return dtx.a;
   }

   @Override
   public List<dse.a> a(crf $$0, BiConsumer<ht, dgb> $$1, ate $$2, int $$3, ht $$4, dro $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new dse.a($$4.b($$3), 0, false));
   }
}
