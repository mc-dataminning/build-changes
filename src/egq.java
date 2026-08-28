import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class egq extends egt {
   public static final MapCodec<egq> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, egq::new));

   public egq(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected egu<?> a() {
      return egu.c;
   }

   @Override
   public List<efb.a> a(dcm $$0, BiConsumer<ja, dsl> $$1, ayo $$2, int $$3, ja $$4, eel $$5) {
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

      return ImmutableList.of(new efb.a($$4.b($$3), 0, true));
   }

   private void a(dcm $$0, BiConsumer<ja, dsl> $$1, ayo $$2, ja.a $$3, eel $$4, ja $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
