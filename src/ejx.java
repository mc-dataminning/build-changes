import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class ejx extends ekj {
   public static final MapCodec<ejx> a = bqu.b(0, 256).fieldOf("count").xmap(ejx::new, $$0 -> $$0.c);
   private final bqu c;

   private ejx(bqu $$0) {
      this.c = $$0;
   }

   public static ejx a(bqu $$0) {
      return new ejx($$0);
   }

   public static ejx a(int $$0) {
      return a(bqr.a($$0));
   }

   @Override
   public Stream<je> a_(ekh $$0, azl $$1, je $$2) {
      Builder<je> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(eak.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new je($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public ekk<?> b() {
      return ekk.i;
   }

   private static int a(ekh $$0, int $$1, int $$2, int $$3, int $$4) {
      je.a $$5 = new je.a($$1, $$2, $$3);
      int $$6 = 0;
      duo $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         duo $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(dhl.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(duo $$0) {
      return $$0.l() || $$0.a(dhl.G) || $$0.a(dhl.H);
   }
}
