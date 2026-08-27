import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bxz {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 1.0F;
   private static final float e = 0.75F;
   private static final bib f = bib.a(100, 140);
   private static final int g = 2;
   private static final int h = 4;
   private static final float i = 1.5F;
   private static final float j = 1.25F;

   protected static void a(bxy $$0, ato $$1) {
      $$0.dN().a(btz.R, f.a($$1));
   }

   protected static bly<?> a(bly<bxy> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cex.a));
      $$0.b(cex.b);
      $$0.f();
      return $$0;
   }

   private static void b(bly<bxy> $$0) {
      $$0.a(cex.a, 0, ImmutableList.of(new bmk(2.0F), new bnu(45, 90), new bny(), new bmv(btz.O), new bmv(btz.R)));
   }

   private static void c(bly<bxy> $$0) {
      $$0.a(
         cex.b,
         ImmutableList.of(
            Pair.of(0, boo.a(bkm.bt, 6.0F, bib.a(30, 60))),
            Pair.of(0, new bmj(bkm.O, 1.0F)),
            Pair.of(1, new bnc($$0x -> 1.25F)),
            Pair.of(2, bpa.a(bxz::b, $$0x -> $$0x.dN().c(btz.B))),
            Pair.of(3, bpl.a(6, 1.0F)),
            Pair.of(
               4,
               new bol(
                  ImmutableMap.of(btz.m, bua.b),
                  ImmutableList.of(Pair.of(bog.a(1.0F), 1), Pair.of(bov.a(1.0F, 3), 1), Pair.of(new bmw(), 3), Pair.of(bqb.a(bki::aA), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(btz.S, bua.b), Pair.of(btz.W, bua.b))
      );
   }

   private static void d(bly<bxy> $$0) {
      $$0.a(
         cex.t,
         ImmutableList.of(
            Pair.of(0, boo.a(bkm.bt, 6.0F, bib.a(30, 60))),
            Pair.of(1, new bnc($$0x -> 1.25F)),
            Pair.of(2, bpa.a(bxz::b, $$0x -> $$0x.dN().c(btz.B))),
            Pair.of(3, bpl.a(8, 1.5F)),
            Pair.of(
               5,
               new bnd(
                  ImmutableMap.of(btz.m, bua.b),
                  ImmutableSet.of(),
                  bnd.a.a,
                  bnd.b.b,
                  ImmutableList.of(Pair.of(bog.c(0.75F), 1), Pair.of(bog.a(1.0F, true), 1), Pair.of(bov.a(1.0F, 3), 1), Pair.of(bqb.a(bki::ba), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(btz.S, bua.b), Pair.of(btz.W, bua.a))
      );
   }

   private static void e(bly<bxy> $$0) {
      $$0.a(
         cex.u,
         ImmutableList.of(
            Pair.of(0, boo.a(bkm.bt, 6.0F, bib.a(30, 60))),
            Pair.of(1, bpa.a(bxz::b, $$0x -> $$0x.dN().c(btz.B))),
            Pair.of(2, bpm.a(8, 1.0F)),
            Pair.of(3, bpo.a(cuv.sm)),
            Pair.of(4, new bol(ImmutableList.of(Pair.of(bog.a(1.0F), 2), Pair.of(bov.a(1.0F, 3), 1), Pair.of(new bmw(), 2), Pair.of(bqb.a(bki::aA), 1))))
         ),
         ImmutableSet.of(Pair.of(btz.S, bua.b), Pair.of(btz.X, bua.a))
      );
   }

   private static void f(bly<bxy> $$0) {
      $$0.a(
         cex.q,
         ImmutableList.of(Pair.of(0, new bnq(f, aqn.iO)), Pair.of(1, new bnr<>(f, 2, 4, 1.5F, $$0x -> aqn.iN, arc.bK, 0.5F, bxz::a))),
         ImmutableSet.of(Pair.of(btz.N, bua.b), Pair.of(btz.r, bua.b), Pair.of(btz.R, bua.b), Pair.of(btz.W, bua.b))
      );
   }

   private static void g(bly<bxy> $$0) {
      $$0.a(cex.s, 0, ImmutableList.of(bpd.a(), new bya(aqn.iP, aqn.iK)), btz.o);
   }

   private static <E extends bla> boolean a(E $$0, ht $$1) {
      crs $$2 = $$0.dL();
      ht $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dgw $$4 = $$2.a_($$1);
         dgw $$5 = $$2.a_($$3);
         if (!$$4.a(arc.bK) && !$$5.a(arc.bK)) {
            ecr $$6 = eda.a($$2, $$1.j());
            ecr $$7 = eda.a($$2, $$3.j());
            return $$6 != ecr.e && (!$$4.i() || $$7 != ecr.e) ? bns.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(bxy $$0) {
      return !bmr.a($$0);
   }

   public static void a(bxy $$0) {
      $$0.dN().a(ImmutableList.of(cex.s, cex.u, cex.q, cex.t, cex.b));
   }

   public static coc a() {
      return bxy.bT;
   }
}
