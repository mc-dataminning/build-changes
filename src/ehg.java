import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class ehg extends ehf {
   public static final MapCodec<ehg> b = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ehg::new));

   public ehg(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ehj<?> a() {
      return ehj.d;
   }

   @Override
   public List<efq.a> a(dda $$0, BiConsumer<jd, dta> $$1, ayv $$2, int $$3, jd $$4, efa $$5) {
      List<efq.a> $$6 = Lists.newArrayList();
      $$6.addAll(super.a($$0, $$1, $$2, $$3, $$4, $$5));

      for (int $$7 = $$3 - 2 - $$2.a(4); $$7 > $$3 / 2; $$7 -= 2 + $$2.a(4)) {
         float $$8 = $$2.i() * (float) (Math.PI * 2);
         int $$9 = 0;
         int $$10 = 0;

         for (int $$11 = 0; $$11 < 5; $$11++) {
            $$9 = (int)(1.5F + ayn.b($$8) * (float)$$11);
            $$10 = (int)(1.5F + ayn.a($$8) * (float)$$11);
            jd $$12 = $$4.b($$9, $$7 - 3 + $$11 / 2, $$10);
            this.b($$0, $$1, $$2, $$12, $$5);
         }

         $$6.add(new efq.a($$4.b($$9, $$7, $$10), -2, false));
      }

      return $$6;
   }
}
