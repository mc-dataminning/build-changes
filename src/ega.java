import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class ega extends egb {
   public static final MapCodec<ega> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ega::new));

   public ega(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected egc<?> a() {
      return egc.a;
   }

   @Override
   public List<eej.a> a(dbz $$0, BiConsumer<iz, drx> $$1, azc $$2, int $$3, iz $$4, edt $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new eej.a($$4.b($$3), 0, false));
   }
}
