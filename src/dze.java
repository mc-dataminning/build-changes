import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dze extends dzh {
   public static final Codec<dze> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dze::new));

   public dze(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dzi<?> a() {
      return dzi.c;
   }

   @Override
   public List<dxp.a> a(cvx $$0, BiConsumer<hz, dlj> $$1, awp $$2, int $$3, hz $$4, dwz $$5) {
      hz $$6 = $$4.d();
      a($$0, $$1, $$2, $$6, $$5);
      a($$0, $$1, $$2, $$6.h(), $$5);
      a($$0, $$1, $$2, $$6.f(), $$5);
      a($$0, $$1, $$2, $$6.f().h(), $$5);
      hz.a $$7 = new hz.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
         if ($$8 < $$3 - 1) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
         }
      }

      return ImmutableList.of(new dxp.a($$4.b($$3), 0, true));
   }

   private void a(cvx $$0, BiConsumer<hz, dlj> $$1, awp $$2, hz.a $$3, dwz $$4, hz $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
