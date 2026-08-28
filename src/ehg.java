import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class ehg extends ehr {
   public static final MapCodec<ehg> a = bpz.b(0, 256).fieldOf("count").xmap(ehg::new, $$0 -> $$0.c);
   private final bpz c;

   private ehg(bpz $$0) {
      this.c = $$0;
   }

   public static ehg a(bpz $$0) {
      return new ehg($$0);
   }

   public static ehg a(int $$0) {
      return a(bpw.a($$0));
   }

   @Override
   public Stream<iz> a_(ehp $$0, azh $$1, iz $$2) {
      Builder<iz> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(dxu.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new iz($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public ehs<?> b() {
      return ehs.i;
   }

   private static int a(ehp $$0, int $$1, int $$2, int $$3, int $$4) {
      iz.a $$5 = new iz.a($$1, $$2, $$3);
      int $$6 = 0;
      dsc $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dsc $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(dfb.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dsc $$0) {
      return $$0.i() || $$0.a(dfb.G) || $$0.a(dfb.H);
   }
}
