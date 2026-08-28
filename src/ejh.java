import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class ejh extends ejn {
   public static final MapCodec<ejh> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ejh::new));

   public ejh(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ejo<?> a() {
      return ejo.e;
   }

   @Override
   public List<ehv.a> a(dfb $$0, BiConsumer<jg, dvd> $$1, azr $$2, int $$3, jg $$4, ehf $$5) {
      List<ehv.a> $$6 = Lists.newArrayList();
      jg $$7 = $$4.e();
      a($$0, $$1, $$2, $$7, $$5);
      a($$0, $$1, $$2, $$7.i(), $$5);
      a($$0, $$1, $$2, $$7.g(), $$5);
      a($$0, $$1, $$2, $$7.g().i(), $$5);
      jl $$8 = jl.c.a.a($$2);
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
         jg $$19 = new jg($$14, $$18, $$15);
         if (efr.b($$0, $$19)) {
            this.b($$0, $$1, $$2, $$19, $$5);
            this.b($$0, $$1, $$2, $$19.i(), $$5);
            this.b($$0, $$1, $$2, $$19.g(), $$5);
            this.b($$0, $$1, $$2, $$19.i().g(), $$5);
         }
      }

      $$6.add(new ehv.a(new jg($$14, $$16, $$15), 0, true));

      for (int $$20 = -1; $$20 <= 2; $$20++) {
         for (int $$21 = -1; $$21 <= 2; $$21++) {
            if (($$20 < 0 || $$20 > 1 || $$21 < 0 || $$21 > 1) && $$2.a(3) <= 0) {
               int $$22 = $$2.a(3) + 2;

               for (int $$23 = 0; $$23 < $$22; $$23++) {
                  this.b($$0, $$1, $$2, new jg($$11 + $$20, $$16 - $$23 - 1, $$13 + $$21), $$5);
               }

               $$6.add(new ehv.a(new jg($$14 + $$20, $$16, $$15 + $$21), 0, false));
            }
         }
      }

      return $$6;
   }
}
