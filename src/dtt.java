import com.mojang.serialization.Codec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class dtt extends due {
   public static final Codec<dtt> a = bft.b(0, 256).fieldOf("count").xmap(dtt::new, $$0 -> $$0.c).codec();
   private final bft c;

   private dtt(bft $$0) {
      this.c = $$0;
   }

   public static dtt a(bft $$0) {
      return new dtt($$0);
   }

   public static dtt a(int $$0) {
      return a(bfq.a($$0));
   }

   @Override
   public Stream<gv> a_(duc $$0, art $$1, gv $$2) {
      Builder<gv> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(dkh.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new gv($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public duf<?> b() {
      return duf.i;
   }

   private static int a(duc $$0, int $$1, int $$2, int $$3, int $$4) {
      gv.a $$5 = new gv.a($$1, $$2, $$3);
      int $$6 = 0;
      dey $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dey $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(csl.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dey $$0) {
      return $$0.i() || $$0.a(csl.G) || $$0.a(csl.H);
   }
}
