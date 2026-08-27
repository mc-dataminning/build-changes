import com.mojang.serialization.Codec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class efc extends efn {
   public static final Codec<efc> a = bnv.b(0, 256).fieldOf("count").xmap(efc::new, $$0 -> $$0.c).codec();
   private final bnv c;

   private efc(bnv $$0) {
      this.c = $$0;
   }

   public static efc a(bnv $$0) {
      return new efc($$0);
   }

   public static efc a(int $$0) {
      return a(bns.a($$0));
   }

   @Override
   public Stream<im> a_(efl $$0, ayd $$1, im $$2) {
      Builder<im> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(dvq.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new im($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public efo<?> b() {
      return efo.i;
   }

   private static int a(efl $$0, int $$1, int $$2, int $$3, int $$4) {
      im.a $$5 = new im.a($$1, $$2, $$3);
      int $$6 = 0;
      dpy $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dpy $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(dcx.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dpy $$0) {
      return $$0.i() || $$0.a(dcx.G) || $$0.a(dcx.H);
   }
}
