import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class emh extends emt {
   public static final MapCodec<emh> a = brp.b(0, 256).fieldOf("count").xmap(emh::new, $$0 -> $$0.c);
   private final brp c;

   private emh(brp $$0) {
      this.c = $$0;
   }

   public static emh a(brp $$0) {
      return new emh($$0);
   }

   public static emh a(int $$0) {
      return a(brm.a($$0));
   }

   @Override
   public Stream<ji> a_(emr $$0, azh $$1, ji $$2) {
      Builder<ji> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(ecs.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new ji($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public emu<?> b() {
      return emu.i;
   }

   private static int a(emr $$0, int $$1, int $$2, int $$3, int $$4) {
      ji.a $$5 = new ji.a($$1, $$2, $$3);
      int $$6 = 0;
      dwx $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dwx $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(djo.I)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dwx $$0) {
      return $$0.l() || $$0.a(djo.J) || $$0.a(djo.K);
   }
}
