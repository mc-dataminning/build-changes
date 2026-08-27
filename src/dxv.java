import com.mojang.serialization.Codec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class dxv extends dyg {
   public static final Codec<dxv> a = bja.b(0, 256).fieldOf("count").xmap(dxv::new, $$0 -> $$0.c).codec();
   private final bja c;

   private dxv(bja $$0) {
      this.c = $$0;
   }

   public static dxv a(bja $$0) {
      return new dxv($$0);
   }

   public static dxv a(int $$0) {
      return a(bix.a($$0));
   }

   @Override
   public Stream<hx> a_(dye $$0, aup $$1, hx $$2) {
      Builder<hx> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(doj.a.e, $$7, $$8);
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
   public dyh<?> b() {
      return dyh.i;
   }

   private static int a(dye $$0, int $$1, int $$2, int $$3, int $$4) {
      hx.a $$5 = new hx.a($$1, $$2, $$3);
      int $$6 = 0;
      dja $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dja $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(cwl.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dja $$0) {
      return $$0.i() || $$0.a(cwl.G) || $$0.a(cwl.H);
   }
}
