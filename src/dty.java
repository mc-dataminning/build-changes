import com.mojang.serialization.Codec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class dty extends duj {
   public static final Codec<dty> a = bgj.b(0, 256).fieldOf("count").xmap(dty::new, $$0 -> $$0.c).codec();
   private final bgj c;

   private dty(bgj $$0) {
      this.c = $$0;
   }

   public static dty a(bgj $$0) {
      return new dty($$0);
   }

   public static dty a(int $$0) {
      return a(bgg.a($$0));
   }

   @Override
   public Stream<gw> a_(duh $$0, ash $$1, gw $$2) {
      Builder<gw> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(dkm.a.e, $$7, $$8);
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
   public duk<?> b() {
      return duk.i;
   }

   private static int a(duh $$0, int $$1, int $$2, int $$3, int $$4) {
      gw.a $$5 = new gw.a($$1, $$2, $$3);
      int $$6 = 0;
      dfd $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dfd $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(cte.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dfd $$0) {
      return $$0.i() || $$0.a(cte.G) || $$0.a(cte.H);
   }
}
