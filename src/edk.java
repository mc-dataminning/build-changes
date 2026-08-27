import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class edk extends edj {
   public static final Codec<edk> b = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, edk::new));

   public edk(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected edn<?> a() {
      return edn.d;
   }

   @Override
   public List<ebu.a> a(czm $$0, BiConsumer<id, dpi> $$1, axt $$2, int $$3, id $$4, ebe $$5) {
      List<ebu.a> $$6 = Lists.newArrayList();
      $$6.addAll(super.a($$0, $$1, $$2, $$3, $$4, $$5));

      for (int $$7 = $$3 - 2 - $$2.a(4); $$7 > $$3 / 2; $$7 -= 2 + $$2.a(4)) {
         float $$8 = $$2.i() * (float) (Math.PI * 2);
         int $$9 = 0;
         int $$10 = 0;

         for (int $$11 = 0; $$11 < 5; $$11++) {
            $$9 = (int)(1.5F + axm.b($$8) * (float)$$11);
            $$10 = (int)(1.5F + axm.a($$8) * (float)$$11);
            id $$12 = $$4.b($$9, $$7 - 3 + $$11 / 2, $$10);
            this.b($$0, $$1, $$2, $$12, $$5);
         }

         $$6.add(new ebu.a($$4.b($$9, $$7, $$10), -2, false));
      }

      return $$6;
   }
}
