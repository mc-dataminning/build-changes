import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class epd extends epp {
   public static final MapCodec<epd> a = btd.b(0, 256).fieldOf("count").xmap(epd::new, $$0 -> $$0.c);
   private final btd c;

   private epd(btd $$0) {
      this.c = $$0;
   }

   public static epd a(btd $$0) {
      return new epd($$0);
   }

   public static epd a(int $$0) {
      return a(bta.a($$0));
   }

   @Override
   public Stream<iu> a_(epn $$0, azt $$1, iu $$2) {
      Builder<iu> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(efn.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new iu($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public epq<?> b() {
      return epq.i;
   }

   private static int a(epn $$0, int $$1, int $$2, int $$3, int $$4) {
      iu.a $$5 = new iu.a($$1, $$2, $$3);
      int $$6 = 0;
      dzo $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dzo $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(dlw.I)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dzo $$0) {
      return $$0.l() || $$0.a(dlw.J) || $$0.a(dlw.K);
   }
}
