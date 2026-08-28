import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.BiConsumer;

public class egi extends egm {
   public static final MapCodec<egi> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, egi::new));

   public egi(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected egn<?> a() {
      return egn.b;
   }

   @Override
   public List<eeu.a> a(dcj $$0, BiConsumer<ja, dsh> $$1, aym $$2, int $$3, ja $$4, eee $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);
      List<eeu.a> $$6 = Lists.newArrayList();
      jf $$7 = jf.c.a.a($$2);
      int $$8 = $$3 - $$2.a(4) - 1;
      int $$9 = 3 - $$2.a(3);
      ja.a $$10 = new ja.a();
      int $$11 = $$4.u();
      int $$12 = $$4.w();
      OptionalInt $$13 = OptionalInt.empty();

      for (int $$14 = 0; $$14 < $$3; $$14++) {
         int $$15 = $$4.v() + $$14;
         if ($$14 >= $$8 && $$9 > 0) {
            $$11 += $$7.j();
            $$12 += $$7.l();
            $$9--;
         }

         if (this.b($$0, $$1, $$2, $$10.d($$11, $$15, $$12), $$5)) {
            $$13 = OptionalInt.of($$15 + 1);
         }
      }

      if ($$13.isPresent()) {
         $$6.add(new eeu.a(new ja($$11, $$13.getAsInt(), $$12), 1, false));
      }

      $$11 = $$4.u();
      $$12 = $$4.w();
      jf $$16 = jf.c.a.a($$2);
      if ($$16 != $$7) {
         int $$17 = $$8 - $$2.a(2) - 1;
         int $$18 = 1 + $$2.a(3);
         $$13 = OptionalInt.empty();

         for (int $$19 = $$17; $$19 < $$3 && $$18 > 0; $$18--) {
            if ($$19 >= 1) {
               int $$20 = $$4.v() + $$19;
               $$11 += $$16.j();
               $$12 += $$16.l();
               if (this.b($$0, $$1, $$2, $$10.d($$11, $$20, $$12), $$5)) {
                  $$13 = OptionalInt.of($$20 + 1);
               }
            }

            $$19++;
         }

         if ($$13.isPresent()) {
            $$6.add(new eeu.a(new ja($$11, $$13.getAsInt(), $$12), 0, false));
         }
      }

      return $$6;
   }
}
