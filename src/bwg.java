import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class bwg {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bgl f = bgl.a(5, 16);
   private static final ImmutableList<bto<? extends btn<? super bwf>>> g = ImmutableList.of(bto.c, bto.f, bto.s, bto.n);
   private static final ImmutableList<bsj<?>> h = ImmutableList.of(
      bsj.Y, bsj.x, bsj.y, bsj.m, bsj.n, bsj.E, bsj.t, bsj.h, bsj.N, bsj.O, bsj.P, bsj.Q, new bsj[]{bsj.r, bsj.J}
   );

   protected static void a(bwf $$0, ase $$1) {
   }

   public static bki.b<bwf> a() {
      return bki.a(h, g);
   }

   protected static bki<?> a(bki<bwf> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cdh.a));
      $$0.b(cdh.b);
      $$0.f();
      return $$0;
   }

   private static void b(bki<bwf> $$0) {
      $$0.a(cdh.a, 0, ImmutableList.of(new bns(0.8F), new bwg.a(4.0F), new bme(45, 90), new bmi(), new blf(bsj.O), new blf(bsj.P)));
   }

   private static void c(bki<bwf> $$0) {
      $$0.a(
         cdh.b,
         ImmutableList.of(
            Pair.of(0, bmy.a(biw.bt, 6.0F, bgl.a(30, 60))),
            Pair.of(1, new bkt(biw.l, 1.0F)),
            Pair.of(
               2,
               new bmv(
                  ImmutableList.of(Pair.of(new blm($$0x -> 2.5F, $$0x -> $$0x.m_() ? 2.5 : 3.5), 1), Pair.of(bol.a(Predicate.not(bwf::t), bkw.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bmp(bgl.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bmv(
                  ImmutableMap.of(bsj.m, bsk.b),
                  ImmutableList.of(
                     Pair.of(bol.a(Predicate.not(bwf::t), bmq.a(2.0F)), 1),
                     Pair.of(bol.a(Predicate.not(bwf::t), bnf.a(2.0F, 3)), 1),
                     Pair.of(new bwg.b(20), 1),
                     Pair.of(new blj(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(bwf $$0) {
      $$0.dN().a(ImmutableList.of(cdh.b));
   }

   public static cmi b() {
      return bwf.bT;
   }

   public static class a extends bku {
      public a(float $$0) {
         super($$0);
      }

      @Override
      protected void b(aks $$0, bjr $$1, long $$2) {
         if ($$1 instanceof bwf $$3) {
            $$3.gq();
         }

         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bkz<bwf> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(aks $$0, bwf $$1) {
         return !$$1.aX() && $$1.gr() >= (long)this.c && !$$1.fR() && $$1.aA() && !$$1.cO() && $$1.gd();
      }

      protected void a(aks $$0, bwf $$1, long $$2) {
         if ($$1.gl()) {
            $$1.gp();
         } else if (!$$1.ga()) {
            $$1.go();
         }
      }
   }
}
