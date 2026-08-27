import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dzz extends eac {
   public static final Codec<dzz> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dzz::new));

   public dzz(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ead<?> a() {
      return ead.c;
   }

   @Override
   public List<dyk.a> a(cwk $$0, BiConsumer<ib, dme> $$1, awt $$2, int $$3, ib $$4, dxu $$5) {
      ib $$6 = $$4.d();
      a($$0, $$1, $$2, $$6, $$5);
      a($$0, $$1, $$2, $$6.h(), $$5);
      a($$0, $$1, $$2, $$6.f(), $$5);
      a($$0, $$1, $$2, $$6.f().h(), $$5);
      ib.a $$7 = new ib.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
         if ($$8 < $$3 - 1) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
         }
      }

      return ImmutableList.of(new dyk.a($$4.b($$3), 0, true));
   }

   private void a(cwk $$0, BiConsumer<ib, dme> $$1, awt $$2, ib.a $$3, dxu $$4, ib $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
