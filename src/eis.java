import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eis extends eiy {
   public static final MapCodec<eis> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eis::new));

   public eis(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eiz<?> a() {
      return eiz.e;
   }

   @Override
   public List<ehg.a> a(dem $$0, BiConsumer<je, duo> $$1, azl $$2, int $$3, je $$4, egq $$5) {
      List<ehg.a> $$6 = Lists.newArrayList();
      je $$7 = $$4.e();
      a($$0, $$1, $$2, $$7, $$5);
      a($$0, $$1, $$2, $$7.i(), $$5);
      a($$0, $$1, $$2, $$7.g(), $$5);
      a($$0, $$1, $$2, $$7.g().i(), $$5);
      jj $$8 = jj.c.a.a($$2);
      int $$9 = $$3 - $$2.a(4);
      int $$10 = 2 - $$2.a(3);
      int $$11 = $$4.u();
      int $$12 = $$4.v();
      int $$13 = $$4.w();
      int $$14 = $$11;
      int $$15 = $$13;
      int $$16 = $$12 + $$3 - 1;

      for (int $$17 = 0; $$17 < $$3; $$17++) {
         if ($$17 >= $$9 && $$10 > 0) {
            $$14 += $$8.j();
            $$15 += $$8.l();
            $$10--;
         }

         int $$18 = $$12 + $$17;
         je $$19 = new je($$14, $$18, $$15);
         if (efc.b($$0, $$19)) {
            this.b($$0, $$1, $$2, $$19, $$5);
            this.b($$0, $$1, $$2, $$19.i(), $$5);
            this.b($$0, $$1, $$2, $$19.g(), $$5);
            this.b($$0, $$1, $$2, $$19.i().g(), $$5);
         }
      }

      $$6.add(new ehg.a(new je($$14, $$16, $$15), 0, true));

      for (int $$20 = -1; $$20 <= 2; $$20++) {
         for (int $$21 = -1; $$21 <= 2; $$21++) {
            if (($$20 < 0 || $$20 > 1 || $$21 < 0 || $$21 > 1) && $$2.a(3) <= 0) {
               int $$22 = $$2.a(3) + 2;

               for (int $$23 = 0; $$23 < $$22; $$23++) {
                  this.b($$0, $$1, $$2, new je($$11 + $$20, $$16 - $$23 - 1, $$13 + $$21), $$5);
               }

               $$6.add(new ehg.a(new je($$14 + $$20, $$16, $$15 + $$21), 0, false));
            }
         }
      }

      return $$6;
   }
}
