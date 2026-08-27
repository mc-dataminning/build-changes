import com.mojang.serialization.Codec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class dyk extends dyv {
   public static final Codec<dyk> a = bjh.b(0, 256).fieldOf("count").xmap(dyk::new, $$0 -> $$0.c).codec();
   private final bjh c;

   private dyk(bjh $$0) {
      this.c = $$0;
   }

   public static dyk a(bjh $$0) {
      return new dyk($$0);
   }

   public static dyk a(int $$0) {
      return a(bje.a($$0));
   }

   @Override
   public Stream<hx> a_(dyt $$0, auw $$1, hx $$2) {
      Builder<hx> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(doy.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new hx($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public dyw<?> b() {
      return dyw.i;
   }

   private static int a(dyt $$0, int $$1, int $$2, int $$3, int $$4) {
      hx.a $$5 = new hx.a($$1, $$2, $$3);
      int $$6 = 0;
      djp $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         djp $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(cxa.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(djp $$0) {
      return $$0.i() || $$0.a(cxa.G) || $$0.a(cxa.H);
   }
}
