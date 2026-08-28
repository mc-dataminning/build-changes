import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eja extends eiz {
   public static final MapCodec<eja> b = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eja::new));

   public eja(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ejd<?> a() {
      return ejd.d;
   }

   @Override
   public List<ehk.a> a(dep $$0, BiConsumer<jf, dus> $$1, azn $$2, int $$3, jf $$4, egu $$5) {
      List<ehk.a> $$6 = Lists.newArrayList();
      $$6.addAll(super.a($$0, $$1, $$2, $$3, $$4, $$5));

      for (int $$7 = $$3 - 2 - $$2.a(4); $$7 > $$3 / 2; $$7 -= 2 + $$2.a(4)) {
         float $$8 = $$2.i() * (float) (Math.PI * 2);
         int $$9 = 0;
         int $$10 = 0;

         for (int $$11 = 0; $$11 < 5; $$11++) {
            $$9 = (int)(1.5F + azf.b($$8) * (float)$$11);
            $$10 = (int)(1.5F + azf.a($$8) * (float)$$11);
            jf $$12 = $$4.b($$9, $$7 - 3 + $$11 / 2, $$10);
            this.b($$0, $$1, $$2, $$12, $$5);
         }

         $$6.add(new ehk.a($$4.b($$9, $$7, $$10), -2, false));
      }

      return $$6;
   }
}
