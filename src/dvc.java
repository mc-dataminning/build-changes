import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dvc extends dvd {
   public static final Codec<dvc> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dvc::new));

   public dvc(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dve<?> a() {
      return dve.a;
   }

   @Override
   public List<dtl.a> a(csg $$0, BiConsumer<ht, dhi> $$1, ats $$2, int $$3, ht $$4, dsv $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new dtl.a($$4.b($$3), 0, false));
   }
}
