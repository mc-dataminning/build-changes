import com.mojang.serialization.Codec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class eaa extends eal {
   public static final Codec<eaa> a = bkz.b(0, 256).fieldOf("count").xmap(eaa::new, $$0 -> $$0.c).codec();
   private final bkz c;

   private eaa(bkz $$0) {
      this.c = $$0;
   }

   public static eaa a(bkz $$0) {
      return new eaa($$0);
   }

   public static eaa a(int $$0) {
      return a(bkw.a($$0));
   }

   @Override
   public Stream<hz> a_(eaj $$0, awo $$1, hz $$2) {
      Builder<hz> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(dqo.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new hz($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public eam<?> b() {
      return eam.i;
   }

   private static int a(eaj $$0, int $$1, int $$2, int $$3, int $$4) {
      hz.a $$5 = new hz.a($$1, $$2, $$3);
      int $$6 = 0;
      dlf $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dlf $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(cyq.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dlf $$0) {
      return $$0.i() || $$0.a(cyq.G) || $$0.a(cyq.H);
   }
}
