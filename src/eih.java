import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eih extends eik {
   public static final MapCodec<eih> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eih::new));

   public eih(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eil<?> a() {
      return eil.c;
   }

   @Override
   public List<egs.a> a(ddy $$0, BiConsumer<je, dua> $$1, azk $$2, int $$3, je $$4, egc $$5) {
      je $$6 = $$4.e();
      a($$0, $$1, $$2, $$6, $$5);
      a($$0, $$1, $$2, $$6.i(), $$5);
      a($$0, $$1, $$2, $$6.g(), $$5);
      a($$0, $$1, $$2, $$6.g().i(), $$5);
      je.a $$7 = new je.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
         if ($$8 < $$3 - 1) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
         }
      }

      return ImmutableList.of(new egs.a($$4.b($$3), 0, true));
   }

   private void a(ddy $$0, BiConsumer<je, dua> $$1, azk $$2, je.a $$3, egc $$4, je $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
