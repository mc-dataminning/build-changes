import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dte extends dtd {
   public static final Codec<dte> b = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dte::new));

   public dte(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dth<?> a() {
      return dth.d;
   }

   @Override
   public List<dro.a> a(cqd $$0, BiConsumer<gw, dfl> $$1, ase $$2, int $$3, gw $$4, dqy $$5) {
      List<dro.a> $$6 = Lists.newArrayList();
      $$6.addAll(super.a($$0, $$1, $$2, $$3, $$4, $$5));

      for (int $$7 = $$3 - 2 - $$2.a(4); $$7 > $$3 / 2; $$7 -= 2 + $$2.a(4)) {
         float $$8 = $$2.i() * (float) (Math.PI * 2);
         int $$9 = 0;
         int $$10 = 0;

         for (int $$11 = 0; $$11 < 5; $$11++) {
            $$9 = (int)(1.5F + ary.b($$8) * (float)$$11);
            $$10 = (int)(1.5F + ary.a($$8) * (float)$$11);
            gw $$12 = $$4.b($$9, $$7 - 3 + $$11 / 2, $$10);
            this.b($$0, $$1, $$2, $$12, $$5);
         }

         $$6.add(new dro.a($$4.b($$9, $$7, $$10), -2, false));
      }

      return $$6;
   }
}
