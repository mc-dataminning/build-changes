import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class epw extends eqi {
   public static final MapCodec<epw> a = bti.b(0, 256).fieldOf("count").xmap(epw::new, $$0 -> $$0.c);
   private final bti c;

   private epw(bti $$0) {
      this.c = $$0;
   }

   public static epw a(bti $$0) {
      return new epw($$0);
   }

   public static epw a(int $$0) {
      return a(btf.a($$0));
   }

   @Override
   public Stream<iu> a_(eqg $$0, azv $$1, iu $$2) {
      Builder<iu> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(egg.a.e, $$7, $$8);
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
   public eqj<?> b() {
      return eqj.i;
   }

   private static int a(eqg $$0, int $$1, int $$2, int $$3, int $$4) {
      iu.a $$5 = new iu.a($$1, $$2, $$3);
      int $$6 = 0;
      eah $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         eah $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(dmh.I)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(eah $$0) {
      return $$0.l() || $$0.a(dmh.J) || $$0.a(dmh.K);
   }
}
