import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class ehi extends eht {
   public static final MapCodec<ehi> a = bqb.b(0, 256).fieldOf("count").xmap(ehi::new, $$0 -> $$0.c);
   private final bqb c;

   private ehi(bqb $$0) {
      this.c = $$0;
   }

   public static ehi a(bqb $$0) {
      return new ehi($$0);
   }

   public static ehi a(int $$0) {
      return a(bpy.a($$0));
   }

   @Override
   public Stream<iz> a_(ehr $$0, azh $$1, iz $$2) {
      Builder<iz> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(dxw.a.e, $$7, $$8);
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
   public ehu<?> b() {
      return ehu.i;
   }

   private static int a(ehr $$0, int $$1, int $$2, int $$3, int $$4) {
      iz.a $$5 = new iz.a($$1, $$2, $$3);
      int $$6 = 0;
      dse $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dse $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(dfd.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dse $$0) {
      return $$0.i() || $$0.a(dfd.G) || $$0.a(dfd.H);
   }
}
