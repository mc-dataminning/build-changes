import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eqi extends eqj {
   public static final MapCodec<eqi> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eqi::new));

   public eqi(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eqk<?> a() {
      return eqk.a;
   }

   @Override
   public List<eon.a> a(dkp $$0, BiConsumer<iw, ebq> $$1, bai $$2, int $$3, iw $$4, enx $$5) {
      a($$0, $$1, $$2, $$4.e(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new eon.a($$4.b($$3), 0, false));
   }
}
