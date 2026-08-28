import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class egp extends egs {
   public static final MapCodec<egp> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, egp::new));

   public egp(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected egt<?> a() {
      return egt.c;
   }

   @Override
   public List<efa.a> a(dcl $$0, BiConsumer<ja, dsk> $$1, ayo $$2, int $$3, ja $$4, eek $$5) {
      ja $$6 = $$4.d();
      a($$0, $$1, $$2, $$6, $$5);
      a($$0, $$1, $$2, $$6.h(), $$5);
      a($$0, $$1, $$2, $$6.f(), $$5);
      a($$0, $$1, $$2, $$6.f().h(), $$5);
      ja.a $$7 = new ja.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
         if ($$8 < $$3 - 1) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
         }
      }

      return ImmutableList.of(new efa.a($$4.b($$3), 0, true));
   }

   private void a(dcl $$0, BiConsumer<ja, dsk> $$1, ayo $$2, ja.a $$3, eek $$4, ja $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
