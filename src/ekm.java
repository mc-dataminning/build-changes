import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class ekm extends eky {
   public static final MapCodec<ekm> a = brd.b(0, 256).fieldOf("count").xmap(ekm::new, $$0 -> $$0.c);
   private final brd c;

   private ekm(brd $$0) {
      this.c = $$0;
   }

   public static ekm a(brd $$0) {
      return new ekm($$0);
   }

   public static ekm a(int $$0) {
      return a(bra.a($$0));
   }

   @Override
   public Stream<jg> a_(ekw $$0, azr $$1, jg $$2) {
      Builder<jg> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(eaz.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new jg($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public ekz<?> b() {
      return ekz.i;
   }

   private static int a(ekw $$0, int $$1, int $$2, int $$3, int $$4) {
      jg.a $$5 = new jg.a($$1, $$2, $$3);
      int $$6 = 0;
      dvd $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dvd $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(dia.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dvd $$0) {
      return $$0.l() || $$0.a(dia.G) || $$0.a(dia.H);
   }
}
