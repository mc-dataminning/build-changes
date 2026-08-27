import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dvg extends dvf {
   public static final Codec<dvg> b = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dvg::new));

   public dvg(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dvj<?> a() {
      return dvj.d;
   }

   @Override
   public List<dtq.a> a(csl $$0, BiConsumer<hx, dhn> $$1, atw $$2, int $$3, hx $$4, dta $$5) {
      List<dtq.a> $$6 = Lists.newArrayList();
      $$6.addAll(super.a($$0, $$1, $$2, $$3, $$4, $$5));

      for (int $$7 = $$3 - 2 - $$2.a(4); $$7 > $$3 / 2; $$7 -= 2 + $$2.a(4)) {
         float $$8 = $$2.i() * (float) (Math.PI * 2);
         int $$9 = 0;
         int $$10 = 0;

         for (int $$11 = 0; $$11 < 5; $$11++) {
            $$9 = (int)(1.5F + atq.b($$8) * (float)$$11);
            $$10 = (int)(1.5F + atq.a($$8) * (float)$$11);
            hx $$12 = $$4.b($$9, $$7 - 3 + $$11 / 2, $$10);
            this.b($$0, $$1, $$2, $$12, $$5);
         }

         $$6.add(new dtq.a($$4.b($$9, $$7, $$10), -2, false));
      }

      return $$6;
   }
}
