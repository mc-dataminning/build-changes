import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class ejk extends ejn {
   public static final MapCodec<ejk> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ejk::new));

   public ejk(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ejo<?> a() {
      return ejo.c;
   }

   @Override
   public List<ehv.a> a(dfb $$0, BiConsumer<jg, dvd> $$1, azr $$2, int $$3, jg $$4, ehf $$5) {
      jg $$6 = $$4.e();
      a($$0, $$1, $$2, $$6, $$5);
      a($$0, $$1, $$2, $$6.i(), $$5);
      a($$0, $$1, $$2, $$6.g(), $$5);
      a($$0, $$1, $$2, $$6.g().i(), $$5);
      jg.a $$7 = new jg.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
         if ($$8 < $$3 - 1) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
         }
      }

      return ImmutableList.of(new ehv.a($$4.b($$3), 0, true));
   }

   private void a(dfb $$0, BiConsumer<jg, dvd> $$1, azr $$2, jg.a $$3, ehf $$4, jg $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
