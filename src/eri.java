import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class eri extends eru {
   public static final MapCodec<eri> a = buh.b(0, 256).fieldOf("count").xmap(eri::new, $$0 -> $$0.c);
   private final buh c;

   private eri(buh $$0) {
      this.c = $$0;
   }

   public static eri a(buh $$0) {
      return new eri($$0);
   }

   public static eri a(int $$0) {
      return a(bue.a($$0));
   }

   @Override
   public Stream<iw> a_(ers $$0, bai $$1, iw $$2) {
      Builder<iw> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(ehp.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new iw($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public erv<?> b() {
      return erv.i;
   }

   private static int a(ers $$0, int $$1, int $$2, int $$3, int $$4) {
      iw.a $$5 = new iw.a($$1, $$2, $$3);
      int $$6 = 0;
      ebq $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         ebq $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(dnq.I)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(ebq $$0) {
      return $$0.l() || $$0.a(dnq.J) || $$0.a(dnq.K);
   }
}
