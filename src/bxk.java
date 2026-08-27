import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bxk {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 1.0F;
   private static final float e = 0.75F;
   private static final bhm f = bhm.a(100, 140);
   private static final int g = 2;
   private static final int h = 4;
   private static final float i = 1.5F;
   private static final float j = 1.25F;

   protected static void a(bxj $$0, ate $$1) {
      $$0.dN().a(btk.R, f.a($$1));
   }

   protected static blj<?> a(blj<bxj> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cei.a));
      $$0.b(cei.b);
      $$0.f();
      return $$0;
   }

   private static void b(blj<bxj> $$0) {
      $$0.a(cei.a, 0, ImmutableList.of(new blv(2.0F), new bnf(45, 90), new bnj(), new bmg(btk.O), new bmg(btk.R)));
   }

   private static void c(blj<bxj> $$0) {
      $$0.a(
         cei.b,
         ImmutableList.of(
            Pair.of(0, bnz.a(bjx.bt, 6.0F, bhm.a(30, 60))),
            Pair.of(0, new blu(bjx.O, 1.0F)),
            Pair.of(1, new bmn($$0x -> 1.25F)),
            Pair.of(2, bol.a(bxk::b, $$0x -> $$0x.dN().c(btk.B))),
            Pair.of(3, bow.a(6, 1.0F)),
            Pair.of(
               4,
               new bnw(
                  ImmutableMap.of(btk.m, btl.b),
                  ImmutableList.of(Pair.of(bnr.a(1.0F), 1), Pair.of(bog.a(1.0F, 3), 1), Pair.of(new bmh(), 3), Pair.of(bpm.a(bjt::aA), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(btk.S, btl.b), Pair.of(btk.W, btl.b))
      );
   }

   private static void d(blj<bxj> $$0) {
      $$0.a(
         cei.t,
         ImmutableList.of(
            Pair.of(0, bnz.a(bjx.bt, 6.0F, bhm.a(30, 60))),
            Pair.of(1, new bmn($$0x -> 1.25F)),
            Pair.of(2, bol.a(bxk::b, $$0x -> $$0x.dN().c(btk.B))),
            Pair.of(3, bow.a(8, 1.5F)),
            Pair.of(
               5,
               new bmo(
                  ImmutableMap.of(btk.m, btl.b),
                  ImmutableSet.of(),
                  bmo.a.a,
                  bmo.b.b,
                  ImmutableList.of(Pair.of(bnr.c(0.75F), 1), Pair.of(bnr.a(1.0F, true), 1), Pair.of(bog.a(1.0F, 3), 1), Pair.of(bpm.a(bjt::ba), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(btk.S, btl.b), Pair.of(btk.W, btl.a))
      );
   }

   private static void e(blj<bxj> $$0) {
      $$0.a(
         cei.u,
         ImmutableList.of(
            Pair.of(0, bnz.a(bjx.bt, 6.0F, bhm.a(30, 60))),
            Pair.of(1, bol.a(bxk::b, $$0x -> $$0x.dN().c(btk.B))),
            Pair.of(2, box.a(8, 1.0F)),
            Pair.of(3, boz.a(cuc.sm)),
            Pair.of(4, new bnw(ImmutableList.of(Pair.of(bnr.a(1.0F), 2), Pair.of(bog.a(1.0F, 3), 1), Pair.of(new bmh(), 2), Pair.of(bpm.a(bjt::aA), 1))))
         ),
         ImmutableSet.of(Pair.of(btk.S, btl.b), Pair.of(btk.X, btl.a))
      );
   }

   private static void f(blj<bxj> $$0) {
      $$0.a(
         cei.q,
         ImmutableList.of(Pair.of(0, new bnb(f, aqd.iM)), Pair.of(1, new bnc<>(f, 2, 4, 1.5F, $$0x -> aqd.iL, aqs.bK, 0.5F, bxk::a))),
         ImmutableSet.of(Pair.of(btk.N, btl.b), Pair.of(btk.r, btl.b), Pair.of(btk.R, btl.b), Pair.of(btk.W, btl.b))
      );
   }

   private static void g(blj<bxj> $$0) {
      $$0.a(cei.s, 0, ImmutableList.of(boo.a(), new bxl(aqd.iN, aqd.iI)), btk.o);
   }

   private static <E extends bkl> boolean a(E $$0, ht $$1) {
      cqz $$2 = $$0.dL();
      ht $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dgb $$4 = $$2.a_($$1);
         dgb $$5 = $$2.a_($$3);
         if (!$$4.a(aqs.bK) && !$$5.a(aqs.bK)) {
            ebp $$6 = eby.a($$2, $$1.j());
            ebp $$7 = eby.a($$2, $$3.j());
            return $$6 != ebp.e && (!$$4.i() || $$7 != ebp.e) ? bnd.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(bxj $$0) {
      return !bmc.a($$0);
   }

   public static void a(bxj $$0) {
      $$0.dN().a(ImmutableList.of(cei.s, cei.u, cei.q, cei.t, cei.b));
   }

   public static cnk a() {
      return bxj.bT;
   }
}
