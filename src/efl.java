import com.mojang.serialization.Codec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class efl extends efw {
   public static final Codec<efl> a = bor.b(0, 256).fieldOf("count").xmap(efl::new, $$0 -> $$0.c).codec();
   private final bor c;

   private efl(bor $$0) {
      this.c = $$0;
   }

   public static efl a(bor $$0) {
      return new efl($$0);
   }

   public static efl a(int $$0) {
      return a(boo.a($$0));
   }

   @Override
   public Stream<in> a_(efu $$0, ayg $$1, in $$2) {
      Builder<in> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(dvz.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new in($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public efx<?> b() {
      return efx.i;
   }

   private static int a(efu $$0, int $$1, int $$2, int $$3, int $$4) {
      in.a $$5 = new in.a($$1, $$2, $$3);
      int $$6 = 0;
      dqh $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dqh $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(ddg.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dqh $$0) {
      return $$0.i() || $$0.a(ddg.G) || $$0.a(ddg.H);
   }
}
