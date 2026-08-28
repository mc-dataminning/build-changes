import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class ejb extends ejc {
   public static final MapCodec<ejb> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ejb::new));

   public ejb(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ejd<?> a() {
      return ejd.a;
   }

   @Override
   public List<ehk.a> a(dep $$0, BiConsumer<jf, dus> $$1, azn $$2, int $$3, jf $$4, egu $$5) {
      a($$0, $$1, $$2, $$4.e(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new ehk.a($$4.b($$3), 0, false));
   }
}
