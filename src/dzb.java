import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dzb extends dzh {
   public static final Codec<dzb> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dzb::new));

   public dzb(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dzi<?> a() {
      return dzi.e;
   }

   @Override
   public List<dxp.a> a(cvx $$0, BiConsumer<hz, dlj> $$1, awp $$2, int $$3, hz $$4, dwz $$5) {
      List<dxp.a> $$6 = Lists.newArrayList();
      hz $$7 = $$4.d();
      a($$0, $$1, $$2, $$7, $$5);
      a($$0, $$1, $$2, $$7.h(), $$5);
      a($$0, $$1, $$2, $$7.f(), $$5);
      a($$0, $$1, $$2, $$7.f().h(), $$5);
      ie $$8 = ie.c.a.a($$2);
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
         hz $$19 = new hz($$14, $$18, $$15);
         if (dvl.b($$0, $$19)) {
            this.b($$0, $$1, $$2, $$19, $$5);
            this.b($$0, $$1, $$2, $$19.h(), $$5);
            this.b($$0, $$1, $$2, $$19.f(), $$5);
            this.b($$0, $$1, $$2, $$19.h().f(), $$5);
         }
      }

      $$6.add(new dxp.a(new hz($$14, $$16, $$15), 0, true));

      for (int $$20 = -1; $$20 <= 2; $$20++) {
         for (int $$21 = -1; $$21 <= 2; $$21++) {
            if (($$20 < 0 || $$20 > 1 || $$21 < 0 || $$21 > 1) && $$2.a(3) <= 0) {
               int $$22 = $$2.a(3) + 2;

               for (int $$23 = 0; $$23 < $$22; $$23++) {
                  this.b($$0, $$1, $$2, new hz($$11 + $$20, $$16 - $$23 - 1, $$13 + $$21), $$5);
               }

               $$6.add(new dxp.a(new hz($$14 + $$20, $$16, $$15 + $$21), 0, false));
            }
         }
      }

      return $$6;
   }
}
