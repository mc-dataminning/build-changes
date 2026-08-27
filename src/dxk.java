import com.mojang.serialization.Codec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class dxk extends dxv {
   public static final Codec<dxk> a = biq.b(0, 256).fieldOf("count").xmap(dxk::new, $$0 -> $$0.c).codec();
   private final biq c;

   private dxk(biq $$0) {
      this.c = $$0;
   }

   public static dxk a(biq $$0) {
      return new dxk($$0);
   }

   public static dxk a(int $$0) {
      return a(bin.a($$0));
   }

   @Override
   public Stream<hv> a_(dxt $$0, auf $$1, hv $$2) {
      Builder<hv> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(dny.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new hv($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public dxw<?> b() {
      return dxw.i;
   }

   private static int a(dxt $$0, int $$1, int $$2, int $$3, int $$4) {
      hv.a $$5 = new hv.a($$1, $$2, $$3);
      int $$6 = 0;
      dip $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dip $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(cwb.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dip $$0) {
      return $$0.i() || $$0.a(cwb.G) || $$0.a(cwb.H);
   }
}
