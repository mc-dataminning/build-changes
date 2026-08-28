import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class emz extends enc {
   public static final MapCodec<emz> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, emz::new));

   public emz(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected end<?> a() {
      return end.c;
   }

   @Override
   public List<elh.a> a(dhv $$0, BiConsumer<jj, dym> $$1, azs $$2, int $$3, jj $$4, ekr $$5) {
      jj $$6 = $$4.e();
      a($$0, $$1, $$2, $$6, $$5);
      a($$0, $$1, $$2, $$6.i(), $$5);
      a($$0, $$1, $$2, $$6.g(), $$5);
      a($$0, $$1, $$2, $$6.g().i(), $$5);
      jj.a $$7 = new jj.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
         if ($$8 < $$3 - 1) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
         }
      }

      return ImmutableList.of(new elh.a($$4.b($$3), 0, true));
   }

   private void a(dhv $$0, BiConsumer<jj, dym> $$1, azs $$2, jj.a $$3, ekr $$4, jj $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
