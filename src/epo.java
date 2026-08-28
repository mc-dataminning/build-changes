import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class epo extends eqa {
   public static final MapCodec<epo> a = btg.b(0, 256).fieldOf("count").xmap(epo::new, $$0 -> $$0.c);
   private final btg c;

   private epo(btg $$0) {
      this.c = $$0;
   }

   public static epo a(btg $$0) {
      return new epo($$0);
   }

   public static epo a(int $$0) {
      return a(btd.a($$0));
   }

   @Override
   public Stream<iu> a_(epy $$0, azv $$1, iu $$2) {
      Builder<iu> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(efy.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new iu($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public eqb<?> b() {
      return eqb.i;
   }

   private static int a(epy $$0, int $$1, int $$2, int $$3, int $$4) {
      iu.a $$5 = new iu.a($$1, $$2, $$3);
      int $$6 = 0;
      dzz $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dzz $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(dmc.I)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dzz $$0) {
      return $$0.l() || $$0.a(dmc.J) || $$0.a(dmc.K);
   }
}
