import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class ekw extends eli {
   public static final MapCodec<ekw> a = brm.b(0, 256).fieldOf("count").xmap(ekw::new, $$0 -> $$0.c);
   private final brm c;

   private ekw(brm $$0) {
      this.c = $$0;
   }

   public static ekw a(brm $$0) {
      return new ekw($$0);
   }

   public static ekw a(int $$0) {
      return a(brj.a($$0));
   }

   @Override
   public Stream<jh> a_(elg $$0, azv $$1, jh $$2) {
      Builder<jh> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(ebj.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new jh($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public elj<?> b() {
      return elj.i;
   }

   private static int a(elg $$0, int $$1, int $$2, int $$3, int $$4) {
      jh.a $$5 = new jh.a($$1, $$2, $$3);
      int $$6 = 0;
      dvo $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dvo $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(dil.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dvo $$0) {
      return $$0.l() || $$0.a(dil.G) || $$0.a(dil.H);
   }
}
