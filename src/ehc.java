import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class ehc extends ehi {
   public static final MapCodec<ehc> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ehc::new));

   public ehc(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ehj<?> a() {
      return ehj.e;
   }

   @Override
   public List<efq.a> a(dda $$0, BiConsumer<jd, dta> $$1, ayv $$2, int $$3, jd $$4, efa $$5) {
      List<efq.a> $$6 = Lists.newArrayList();
      jd $$7 = $$4.d();
      a($$0, $$1, $$2, $$7, $$5);
      a($$0, $$1, $$2, $$7.h(), $$5);
      a($$0, $$1, $$2, $$7.f(), $$5);
      a($$0, $$1, $$2, $$7.f().h(), $$5);
      ji $$8 = ji.c.a.a($$2);
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
         jd $$19 = new jd($$14, $$18, $$15);
         if (edm.b($$0, $$19)) {
            this.b($$0, $$1, $$2, $$19, $$5);
            this.b($$0, $$1, $$2, $$19.h(), $$5);
            this.b($$0, $$1, $$2, $$19.f(), $$5);
            this.b($$0, $$1, $$2, $$19.h().f(), $$5);
         }
      }

      $$6.add(new efq.a(new jd($$14, $$16, $$15), 0, true));

      for (int $$20 = -1; $$20 <= 2; $$20++) {
         for (int $$21 = -1; $$21 <= 2; $$21++) {
            if (($$20 < 0 || $$20 > 1 || $$21 < 0 || $$21 > 1) && $$2.a(3) <= 0) {
               int $$22 = $$2.a(3) + 2;

               for (int $$23 = 0; $$23 < $$22; $$23++) {
                  this.b($$0, $$1, $$2, new jd($$11 + $$20, $$16 - $$23 - 1, $$13 + $$21), $$5);
               }

               $$6.add(new efq.a(new jd($$14 + $$20, $$16, $$15 + $$21), 0, false));
            }
         }
      }

      return $$6;
   }
}
