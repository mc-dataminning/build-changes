import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dsr extends dsu {
   public static final Codec<dsr> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dsr::new));

   public dsr(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dsv<?> a() {
      return dsv.c;
   }

   @Override
   public List<drc.a> a(cpr $$0, BiConsumer<gu, dez> $$1, aru $$2, int $$3, gu $$4, dqm $$5) {
      gu $$6 = $$4.d();
      a($$0, $$1, $$2, $$6, $$5);
      a($$0, $$1, $$2, $$6.h(), $$5);
      a($$0, $$1, $$2, $$6.f(), $$5);
      a($$0, $$1, $$2, $$6.f().h(), $$5);
      gu.a $$7 = new gu.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
         if ($$8 < $$3 - 1) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
         }
      }

      return ImmutableList.of(new drc.a($$4.b($$3), 0, true));
   }

   private void a(cpr $$0, BiConsumer<gu, dez> $$1, aru $$2, gu.a $$3, dqm $$4, gu $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
