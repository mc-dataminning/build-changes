import com.mojang.serialization.Codec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class dtu extends duf {
   public static final Codec<dtu> a = bfv.b(0, 256).fieldOf("count").xmap(dtu::new, $$0 -> $$0.c).codec();
   private final bfv c;

   private dtu(bfv $$0) {
      this.c = $$0;
   }

   public static dtu a(bfv $$0) {
      return new dtu($$0);
   }

   public static dtu a(int $$0) {
      return a(bfs.a($$0));
   }

   @Override
   public Stream<gu> a_(dud $$0, aru $$1, gu $$2) {
      Builder<gu> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(dki.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new gu($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public dug<?> b() {
      return dug.i;
   }

   private static int a(dud $$0, int $$1, int $$2, int $$3, int $$4) {
      gu.a $$5 = new gu.a($$1, $$2, $$3);
      int $$6 = 0;
      dez $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dez $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(csm.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dez $$0) {
      return $$0.i() || $$0.a(csm.G) || $$0.a(csm.H);
   }
}
