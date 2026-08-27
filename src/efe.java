import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class efe extends eff {
   public static final MapCodec<efe> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, efe::new));

   public efe(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected efg<?> a() {
      return efg.a;
   }

   @Override
   public List<edn.a> a(dbd $$0, BiConsumer<io, drb> $$1, ayk $$2, int $$3, io $$4, ecx $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new edn.a($$4.b($$3), 0, false));
   }
}
