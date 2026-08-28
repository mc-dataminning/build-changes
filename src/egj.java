import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class egj extends egm {
   public static final MapCodec<egj> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, egj::new));

   public egj(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected egn<?> a() {
      return egn.c;
   }

   @Override
   public List<eeu.a> a(dcj $$0, BiConsumer<ja, dsh> $$1, aym $$2, int $$3, ja $$4, eee $$5) {
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

      return ImmutableList.of(new eeu.a($$4.b($$3), 0, true));
   }

   private void a(dcj $$0, BiConsumer<ja, dsh> $$1, aym $$2, ja.a $$3, eee $$4, ja $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
