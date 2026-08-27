import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class egh extends egs {
   public static final MapCodec<egh> a = bpb.b(0, 256).fieldOf("count").xmap(egh::new, $$0 -> $$0.c);
   private final bpb c;

   private egh(bpb $$0) {
      this.c = $$0;
   }

   public static egh a(bpb $$0) {
      return new egh($$0);
   }

   public static egh a(int $$0) {
      return a(boy.a($$0));
   }

   @Override
   public Stream<io> a_(egq $$0, aym $$1, io $$2) {
      Builder<io> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(dwv.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new io($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public egt<?> b() {
      return egt.i;
   }

   private static int a(egq $$0, int $$1, int $$2, int $$3, int $$4) {
      io.a $$5 = new io.a($$1, $$2, $$3);
      int $$6 = 0;
      drd $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         drd $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(dec.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(drd $$0) {
      return $$0.i() || $$0.a(dec.G) || $$0.a(dec.H);
   }
}
