import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class ehe extends ehp {
   public static final MapCodec<ehe> a = bpx.b(0, 256).fieldOf("count").xmap(ehe::new, $$0 -> $$0.c);
   private final bpx c;

   private ehe(bpx $$0) {
      this.c = $$0;
   }

   public static ehe a(bpx $$0) {
      return new ehe($$0);
   }

   public static ehe a(int $$0) {
      return a(bpu.a($$0));
   }

   @Override
   public Stream<iz> a_(ehn $$0, azf $$1, iz $$2) {
      Builder<iz> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(dxs.a.e, $$7, $$8);
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
   public ehq<?> b() {
      return ehq.i;
   }

   private static int a(ehn $$0, int $$1, int $$2, int $$3, int $$4) {
      iz.a $$5 = new iz.a($$1, $$2, $$3);
      int $$6 = 0;
      dsa $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dsa $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(dez.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dsa $$0) {
      return $$0.i() || $$0.a(dez.G) || $$0.a(dez.H);
   }
}
