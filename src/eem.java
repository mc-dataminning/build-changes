import com.mojang.serialization.Codec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class eem extends eex {
   public static final Codec<eem> a = bnk.b(0, 256).fieldOf("count").xmap(eem::new, $$0 -> $$0.c).codec();
   private final bnk c;

   private eem(bnk $$0) {
      this.c = $$0;
   }

   public static eem a(bnk $$0) {
      return new eem($$0);
   }

   public static eem a(int $$0) {
      return a(bnh.a($$0));
   }

   @Override
   public Stream<id> a_(eev $$0, axt $$1, id $$2) {
      Builder<id> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(dva.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new id($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public eey<?> b() {
      return eey.i;
   }

   private static int a(eev $$0, int $$1, int $$2, int $$3, int $$4) {
      id.a $$5 = new id.a($$1, $$2, $$3);
      int $$6 = 0;
      dpi $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dpi $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(dcj.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dpi $$0) {
      return $$0.i() || $$0.a(dcj.G) || $$0.a(dcj.H);
   }
}
