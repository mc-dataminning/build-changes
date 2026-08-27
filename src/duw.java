import com.mojang.serialization.Codec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class duw extends dvh {
   public static final Codec<duw> a = bhg.b(0, 256).fieldOf("count").xmap(duw::new, $$0 -> $$0.c).codec();
   private final bhg c;

   private duw(bhg $$0) {
      this.c = $$0;
   }

   public static duw a(bhg $$0) {
      return new duw($$0);
   }

   public static duw a(int $$0) {
      return a(bhd.a($$0));
   }

   @Override
   public Stream<ht> a_(dvf $$0, ate $$1, ht $$2) {
      Builder<ht> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(dlk.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new ht($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public dvi<?> b() {
      return dvi.i;
   }

   private static int a(dvf $$0, int $$1, int $$2, int $$3, int $$4) {
      ht.a $$5 = new ht.a($$1, $$2, $$3);
      int $$6 = 0;
      dgb $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dgb $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(cuc.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dgb $$0) {
      return $$0.i() || $$0.a(cuc.G) || $$0.a(cuc.H);
   }
}
