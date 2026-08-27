import com.mojang.serialization.Codec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class dtz extends duk {
   public static final Codec<dtz> a = bfy.b(0, 256).fieldOf("count").xmap(dtz::new, $$0 -> $$0.c).codec();
   private final bfy c;

   private dtz(bfy $$0) {
      this.c = $$0;
   }

   public static dtz a(bfy $$0) {
      return new dtz($$0);
   }

   public static dtz a(int $$0) {
      return a(bfv.a($$0));
   }

   @Override
   public Stream<gw> a_(dui $$0, arx $$1, gw $$2) {
      Builder<gw> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(dkn.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new gw($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public dul<?> b() {
      return dul.i;
   }

   private static int a(dui $$0, int $$1, int $$2, int $$3, int $$4) {
      gw.a $$5 = new gw.a($$1, $$2, $$3);
      int $$6 = 0;
      dfe $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dfe $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(csr.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dfe $$0) {
      return $$0.i() || $$0.a(csr.G) || $$0.a(csr.H);
   }
}
