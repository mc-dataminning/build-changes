import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class ene extends enq {
   public static final MapCodec<ene> a = bsd.b(0, 256).fieldOf("count").xmap(ene::new, $$0 -> $$0.c);
   private final bsd c;

   private ene(bsd $$0) {
      this.c = $$0;
   }

   public static ene a(bsd $$0) {
      return new ene($$0);
   }

   public static ene a(int $$0) {
      return a(bsa.a($$0));
   }

   @Override
   public Stream<ji> a_(eno $$0, azh $$1, ji $$2) {
      Builder<ji> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(edo.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new ji($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public enr<?> b() {
      return enr.i;
   }

   private static int a(eno $$0, int $$1, int $$2, int $$3, int $$4) {
      ji.a $$5 = new ji.a($$1, $$2, $$3);
      int $$6 = 0;
      dxq $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dxq $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(dkg.I)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dxq $$0) {
      return $$0.l() || $$0.a(dkg.J) || $$0.a(dkg.K);
   }
}
