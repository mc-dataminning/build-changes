import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dtd extends dtg {
   public static final Codec<dtd> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dtd::new));

   public dtd(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dth<?> a() {
      return dth.c;
   }

   @Override
   public List<dro.a> a(cqd $$0, BiConsumer<gw, dfl> $$1, ase $$2, int $$3, gw $$4, dqy $$5) {
      gw $$6 = $$4.d();
      a($$0, $$1, $$2, $$6, $$5);
      a($$0, $$1, $$2, $$6.h(), $$5);
      a($$0, $$1, $$2, $$6.f(), $$5);
      a($$0, $$1, $$2, $$6.f().h(), $$5);
      gw.a $$7 = new gw.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
         if ($$8 < $$3 - 1) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
         }
      }

      return ImmutableList.of(new dro.a($$4.b($$3), 0, true));
   }

   private void a(cqd $$0, BiConsumer<gw, dfl> $$1, ase $$2, gw.a $$3, dqy $$4, gw $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
