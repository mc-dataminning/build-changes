import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class egd extends egc {
   public static final MapCodec<egd> b = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, egd::new));

   public egd(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected egg<?> a() {
      return egg.d;
   }

   @Override
   public List<een.a> a(dcd $$0, BiConsumer<iz, dsb> $$1, azg $$2, int $$3, iz $$4, edx $$5) {
      List<een.a> $$6 = Lists.newArrayList();
      $$6.addAll(super.a($$0, $$1, $$2, $$3, $$4, $$5));

      for (int $$7 = $$3 - 2 - $$2.a(4); $$7 > $$3 / 2; $$7 -= 2 + $$2.a(4)) {
         float $$8 = $$2.i() * (float) (Math.PI * 2);
         int $$9 = 0;
         int $$10 = 0;

         for (int $$11 = 0; $$11 < 5; $$11++) {
            $$9 = (int)(1.5F + ayy.b($$8) * (float)$$11);
            $$10 = (int)(1.5F + ayy.a($$8) * (float)$$11);
            iz $$12 = $$4.b($$9, $$7 - 3 + $$11 / 2, $$10);
            this.b($$0, $$1, $$2, $$12, $$5);
         }

         $$6.add(new een.a($$4.b($$9, $$7, $$10), -2, false));
      }

      return $$6;
   }
}
