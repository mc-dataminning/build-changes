import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class efg extends efh {
   public static final MapCodec<efg> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, efg::new));

   public efg(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected efi<?> a() {
      return efi.a;
   }

   @Override
   public List<edp.a> a(dbf $$0, BiConsumer<io, drd> $$1, aym $$2, int $$3, io $$4, ecz $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new edp.a($$4.b($$3), 0, false));
   }
}
