import com.mojang.serialization.Codec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class dyc extends dyn {
   public static final Codec<dyc> a = bjg.b(0, 256).fieldOf("count").xmap(dyc::new, $$0 -> $$0.c).codec();
   private final bjg c;

   private dyc(bjg $$0) {
      this.c = $$0;
   }

   public static dyc a(bjg $$0) {
      return new dyc($$0);
   }

   public static dyc a(int $$0) {
      return a(bjd.a($$0));
   }

   @Override
   public Stream<hx> a_(dyl $$0, auv $$1, hx $$2) {
      Builder<hx> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(doq.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new hx($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public dyo<?> b() {
      return dyo.i;
   }

   private static int a(dyl $$0, int $$1, int $$2, int $$3, int $$4) {
      hx.a $$5 = new hx.a($$1, $$2, $$3);
      int $$6 = 0;
      djh $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         djh $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(cws.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(djh $$0) {
      return $$0.i() || $$0.a(cws.G) || $$0.a(cws.H);
   }
}
