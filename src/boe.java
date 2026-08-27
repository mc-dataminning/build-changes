import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class boe {
   private static final float a = 0.4F;

   public static ImmutableList<Pair<Integer, ? extends bla<? super cbj>>> a(cbm $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, new bns(0.8F)),
         Pair.of(0, blx.a()),
         Pair.of(0, new bme(45, 90)),
         Pair.of(0, new bog()),
         Pair.of(0, boh.a()),
         Pair.of(0, bmr.a()),
         Pair.of(0, bnb.a()),
         Pair.of(0, bob.a($$0.b(), bsj.c)),
         Pair.of(0, bob.a($$0.c(), bsj.d)),
         Pair.of(1, new bmi()),
         Pair.of(2, bml.a()),
         Pair.of(3, new bmd($$1)),
         new Pair[]{
            Pair.of(5, blt.a($$1, false, 4)),
            Pair.of(6, bks.a($$0.c(), bsj.c, bsj.d, true, Optional.empty())),
            Pair.of(7, new blr($$1)),
            Pair.of(8, bok.a($$1)),
            Pair.of(10, bks.a($$0x -> $$0x.a(bul.n), bsj.b, false, Optional.of((byte)14))),
            Pair.of(10, bks.a($$0x -> $$0x.a(bul.o), bsj.e, true, Optional.of((byte)14))),
            Pair.of(10, bkv.a()),
            Pair.of(10, bms.a())
         }
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bla<? super cbj>>> b(cbm $$0, float $$1) {
      boj $$2;
      if ($$0 == cbm.g) {
         $$2 = new boi();
      } else {
         $$2 = new boj();
      }

      return ImmutableList.of(
         b(),
         Pair.of(
            5,
            new bmv(
               ImmutableList.of(
                  Pair.of($$2, 7),
                  Pair.of(bnp.a(bsj.c, 0.4F, 4), 2),
                  Pair.of(bnq.a(bsj.c, 0.4F, 1, 10), 5),
                  Pair.of(bnr.a(bsj.f, $$1, 1, 6, bsj.c), 5),
                  Pair.of(new blu(), $$0 == cbm.g ? 2 : 5),
                  Pair.of(new boa(), $$0 == cbm.g ? 4 : 7)
               )
            )
         ),
         Pair.of(10, new bng(400, 1600)),
         Pair.of(10, bna.a(biw.bt, 4)),
         Pair.of(2, bne.a(bsj.c, $$1, 9, 100, 1200)),
         Pair.of(3, new blo(100)),
         Pair.of(99, bnz.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bla<? super cbj>>> a(float $$0) {
      return ImmutableList.of(
         Pair.of(0, new bmi(80, 120)),
         a(),
         Pair.of(5, bmk.a()),
         Pair.of(
            5,
            new bmv(
               ImmutableMap.of(bsj.i, bsk.b),
               ImmutableList.of(
                  Pair.of(blw.a(biw.bf, 8, bsj.q, $$0, 2), 2),
                  Pair.of(blw.a(biw.m, 8, bsj.q, $$0, 2), 1),
                  Pair.of(boc.a($$0), 1),
                  Pair.of(bnf.a($$0, 2), 1),
                  Pair.of(new bly($$0), 2),
                  Pair.of(new blj(20, 40), 2)
               )
            )
         ),
         Pair.of(99, bnz.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bla<? super cbj>>> c(cbm $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, bne.a(bsj.b, $$1, 1, 150, 1200)),
         Pair.of(3, bob.a($$0x -> $$0x.a(bul.n), bsj.b)),
         Pair.of(3, new bni()),
         Pair.of(
            5,
            new bmv(
               ImmutableMap.of(bsj.b, bsk.b),
               ImmutableList.of(Pair.of(bmw.a($$1), 1), Pair.of(blv.a($$1), 4), Pair.of(blq.a($$1, 4), 2), Pair.of(new blj(20, 40), 2))
            )
         ),
         b(),
         Pair.of(99, bnz.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bla<? super cbj>>> d(cbm $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, bnu.a(ImmutableList.of(Pair.of(bnp.a(bsj.e, 0.4F, 40), 2), Pair.of(bnj.a(), 2)))),
         Pair.of(10, new bng(400, 1600)),
         Pair.of(10, bna.a(biw.bt, 4)),
         Pair.of(2, bne.a(bsj.e, $$1, 6, 100, 200)),
         Pair.of(3, new blo(100)),
         Pair.of(3, bob.a($$0x -> $$0x.a(bul.o), bsj.e)),
         Pair.of(3, new bln(ImmutableMap.of(), ImmutableSet.of(bsj.q), bln.a.a, bln.b.a, ImmutableList.of(Pair.of(new bnt(), 1)))),
         a(),
         Pair.of(99, bnz.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bla<? super cbj>>> e(cbm $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(
            2,
            new bmv(
               ImmutableList.of(
                  Pair.of(blw.a(biw.bf, 8, bsj.q, $$1, 2), 2),
                  Pair.of(blw.a(biw.bf, 8, bin::V_, bin::V_, bsj.r, $$1, 2), 1),
                  Pair.of(blw.a(biw.m, 8, bsj.q, $$1, 2), 1),
                  Pair.of(boc.a($$1), 1),
                  Pair.of(bnf.a($$1, 2), 1),
                  Pair.of(new bly($$1), 1),
                  Pair.of(new blj(30, 60), 1)
               )
            )
         ),
         Pair.of(3, new blo(100)),
         Pair.of(3, bna.a(biw.bt, 4)),
         Pair.of(3, new bng(400, 1600)),
         Pair.of(3, new bln(ImmutableMap.of(), ImmutableSet.of(bsj.q), bln.a.a, bln.b.a, ImmutableList.of(Pair.of(new bnt(), 1)))),
         Pair.of(3, new bln(ImmutableMap.of(), ImmutableSet.of(bsj.r), bln.a.a, bln.b.a, ImmutableList.of(Pair.of(new bof(), 1)))),
         a(),
         Pair.of(99, bnz.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bla<? super cbj>>> f(cbm $$0, float $$1) {
      float $$2 = $$1 * 1.5F;
      return ImmutableList.of(
         Pair.of(0, bod.a()), Pair.of(1, bnc.b(bsj.A, $$2, 6, false)), Pair.of(1, bnc.b(bsj.y, $$2, 6, false)), Pair.of(3, boc.a($$2, 2, 2)), b()
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bla<? super cbj>>> g(cbm $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, bmu.a()),
         Pair.of(0, bnu.a(ImmutableList.of(Pair.of(bne.a(bsj.e, $$1 * 1.5F, 2, 150, 200), 6), Pair.of(boc.a($$1 * 1.5F), 2)))),
         b(),
         Pair.of(99, bmt.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bla<? super cbj>>> h(cbm $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, bol.a(bol.a(boe::b), bnu.a(ImmutableList.of(Pair.of(bmh.a($$1), 5), Pair.of(boc.a($$1 * 1.1F), 2))))),
         Pair.of(0, new bld(600, 600)),
         Pair.of(2, bol.a(bol.a(boe::a), blz.a(24, $$1 * 1.4F, 1))),
         b(),
         Pair.of(99, bmt.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bla<? super cbj>>> i(cbm $$0, float $$1) {
      int $$2 = 2;
      return ImmutableList.of(Pair.of(0, bmz.a(15, 3)), Pair.of(1, blz.a(32, $$1 * 1.25F, 2)), b());
   }

   private static Pair<Integer, bla<bji>> a() {
      return Pair.of(
         5,
         new bmv(
            ImmutableList.of(
               Pair.of(bmx.a(biw.m, 8.0F), 8),
               Pair.of(bmx.a(biw.bf, 8.0F), 2),
               Pair.of(bmx.a(biw.bt, 8.0F), 2),
               Pair.of(bmx.a(bjl.b, 8.0F), 1),
               Pair.of(bmx.a(bjl.f, 8.0F), 1),
               Pair.of(bmx.a(bjl.d, 8.0F), 1),
               Pair.of(bmx.a(bjl.e, 8.0F), 1),
               Pair.of(bmx.a(bjl.g, 8.0F), 1),
               Pair.of(bmx.a(bjl.a, 8.0F), 1),
               Pair.of(new blj(30, 60), 2)
            )
         )
      );
   }

   private static Pair<Integer, bla<bji>> b() {
      return Pair.of(5, new bmv(ImmutableList.of(Pair.of(bmx.a(biw.bf, 8.0F), 2), Pair.of(bmx.a(biw.bt, 8.0F), 2), Pair.of(new blj(30, 60), 8))));
   }

   private static boolean a(aks $$0, bji $$1) {
      cdd $$2 = $$0.c($$1.dl());
      return $$2 != null && $$2.v() && !$$2.e() && !$$2.f();
   }

   private static boolean b(aks $$0, bji $$1) {
      cdd $$2 = $$0.c($$1.dl());
      return $$2 != null && $$2.e();
   }
}
