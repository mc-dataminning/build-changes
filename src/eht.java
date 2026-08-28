import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class eht extends eie {
   public static final MapCodec<eht> a = bpm.b(0, 256).fieldOf("count").xmap(eht::new, $$0 -> $$0.c);
   private final bpm c;

   private eht(bpm $$0) {
      this.c = $$0;
   }

   public static eht a(bpm $$0) {
      return new eht($$0);
   }

   public static eht a(int $$0) {
      return a(bpj.a($$0));
   }

   @Override
   public Stream<ja> a_(eic $$0, ayo $$1, ja $$2) {
      Builder<ja> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(dyg.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new ja($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public eif<?> b() {
      return eif.i;
   }

   private static int a(eic $$0, int $$1, int $$2, int $$3, int $$4) {
      ja.a $$5 = new ja.a($$1, $$2, $$3);
      int $$6 = 0;
      dsl $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dsl $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(dfk.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dsl $$0) {
      return $$0.i() || $$0.a(dfk.G) || $$0.a(dfk.H);
   }
}
