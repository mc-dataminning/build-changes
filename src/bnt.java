import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class bnt {
   private static final float a = 0.4F;

   public static ImmutableList<Pair<Integer, ? extends bkp<? super cay>>> a(cbb $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, new bnh(0.8F)),
         Pair.of(0, blm.a()),
         Pair.of(0, new blt(45, 90)),
         Pair.of(0, new bnv()),
         Pair.of(0, bnw.a()),
         Pair.of(0, bmg.a()),
         Pair.of(0, bmq.a()),
         Pair.of(0, bnq.a($$0.b(), bry.c)),
         Pair.of(0, bnq.a($$0.c(), bry.d)),
         Pair.of(1, new blx()),
         Pair.of(2, bma.a()),
         Pair.of(3, new bls($$1)),
         new Pair[]{
            Pair.of(5, bli.a($$1, false, 4)),
            Pair.of(6, bkh.a($$0.c(), bry.c, bry.d, true, Optional.empty())),
            Pair.of(7, new blg($$1)),
            Pair.of(8, bnz.a($$1)),
            Pair.of(10, bkh.a($$0x -> $$0x.a(bua.n), bry.b, false, Optional.of((byte)14))),
            Pair.of(10, bkh.a($$0x -> $$0x.a(bua.o), bry.e, true, Optional.of((byte)14))),
            Pair.of(10, bkk.a()),
            Pair.of(10, bmh.a())
         }
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bkp<? super cay>>> b(cbb $$0, float $$1) {
      bny $$2;
      if ($$0 == cbb.g) {
         $$2 = new bnx();
      } else {
         $$2 = new bny();
      }

      return ImmutableList.of(
         b(),
         Pair.of(
            5,
            new bmk(
               ImmutableList.of(
                  Pair.of($$2, 7),
                  Pair.of(bne.a(bry.c, 0.4F, 4), 2),
                  Pair.of(bnf.a(bry.c, 0.4F, 1, 10), 5),
                  Pair.of(bng.a(bry.f, $$1, 1, 6, bry.c), 5),
                  Pair.of(new blj(), $$0 == cbb.g ? 2 : 5),
                  Pair.of(new bnp(), $$0 == cbb.g ? 4 : 7)
               )
            )
         ),
         Pair.of(10, new bmv(400, 1600)),
         Pair.of(10, bmp.a(bik.bt, 4)),
         Pair.of(2, bmt.a(bry.c, $$1, 9, 100, 1200)),
         Pair.of(3, new bld(100)),
         Pair.of(99, bno.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bkp<? super cay>>> a(float $$0) {
      return ImmutableList.of(
         Pair.of(0, new blx(80, 120)),
         a(),
         Pair.of(5, blz.a()),
         Pair.of(
            5,
            new bmk(
               ImmutableMap.of(bry.i, brz.b),
               ImmutableList.of(
                  Pair.of(bll.a(bik.bf, 8, bry.q, $$0, 2), 2),
                  Pair.of(bll.a(bik.m, 8, bry.q, $$0, 2), 1),
                  Pair.of(bnr.a($$0), 1),
                  Pair.of(bmu.a($$0, 2), 1),
                  Pair.of(new bln($$0), 2),
                  Pair.of(new bky(20, 40), 2)
               )
            )
         ),
         Pair.of(99, bno.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bkp<? super cay>>> c(cbb $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, bmt.a(bry.b, $$1, 1, 150, 1200)),
         Pair.of(3, bnq.a($$0x -> $$0x.a(bua.n), bry.b)),
         Pair.of(3, new bmx()),
         Pair.of(
            5,
            new bmk(
               ImmutableMap.of(bry.b, brz.b),
               ImmutableList.of(Pair.of(bml.a($$1), 1), Pair.of(blk.a($$1), 4), Pair.of(blf.a($$1, 4), 2), Pair.of(new bky(20, 40), 2))
            )
         ),
         b(),
         Pair.of(99, bno.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bkp<? super cay>>> d(cbb $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, bnj.a(ImmutableList.of(Pair.of(bne.a(bry.e, 0.4F, 40), 2), Pair.of(bmy.a(), 2)))),
         Pair.of(10, new bmv(400, 1600)),
         Pair.of(10, bmp.a(bik.bt, 4)),
         Pair.of(2, bmt.a(bry.e, $$1, 6, 100, 200)),
         Pair.of(3, new bld(100)),
         Pair.of(3, bnq.a($$0x -> $$0x.a(bua.o), bry.e)),
         Pair.of(3, new blc(ImmutableMap.of(), ImmutableSet.of(bry.q), blc.a.a, blc.b.a, ImmutableList.of(Pair.of(new bni(), 1)))),
         a(),
         Pair.of(99, bno.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bkp<? super cay>>> e(cbb $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(
            2,
            new bmk(
               ImmutableList.of(
                  Pair.of(bll.a(bik.bf, 8, bry.q, $$1, 2), 2),
                  Pair.of(bll.a(bik.bf, 8, bib::P_, bib::P_, bry.r, $$1, 2), 1),
                  Pair.of(bll.a(bik.m, 8, bry.q, $$1, 2), 1),
                  Pair.of(bnr.a($$1), 1),
                  Pair.of(bmu.a($$1, 2), 1),
                  Pair.of(new bln($$1), 1),
                  Pair.of(new bky(30, 60), 1)
               )
            )
         ),
         Pair.of(3, new bld(100)),
         Pair.of(3, bmp.a(bik.bt, 4)),
         Pair.of(3, new bmv(400, 1600)),
         Pair.of(3, new blc(ImmutableMap.of(), ImmutableSet.of(bry.q), blc.a.a, blc.b.a, ImmutableList.of(Pair.of(new bni(), 1)))),
         Pair.of(3, new blc(ImmutableMap.of(), ImmutableSet.of(bry.r), blc.a.a, blc.b.a, ImmutableList.of(Pair.of(new bnu(), 1)))),
         a(),
         Pair.of(99, bno.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bkp<? super cay>>> f(cbb $$0, float $$1) {
      float $$2 = $$1 * 1.5F;
      return ImmutableList.of(
         Pair.of(0, bns.a()), Pair.of(1, bmr.b(bry.A, $$2, 6, false)), Pair.of(1, bmr.b(bry.y, $$2, 6, false)), Pair.of(3, bnr.a($$2, 2, 2)), b()
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bkp<? super cay>>> g(cbb $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, bmj.a()),
         Pair.of(0, bnj.a(ImmutableList.of(Pair.of(bmt.a(bry.e, $$1 * 1.5F, 2, 150, 200), 6), Pair.of(bnr.a($$1 * 1.5F), 2)))),
         b(),
         Pair.of(99, bmi.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bkp<? super cay>>> h(cbb $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, boa.a(boa.a(bnt::b), bnj.a(ImmutableList.of(Pair.of(blw.a($$1), 5), Pair.of(bnr.a($$1 * 1.1F), 2))))),
         Pair.of(0, new bks(600, 600)),
         Pair.of(2, boa.a(boa.a(bnt::a), blo.a(24, $$1 * 1.4F, 1))),
         b(),
         Pair.of(99, bmi.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bkp<? super cay>>> i(cbb $$0, float $$1) {
      int $$2 = 2;
      return ImmutableList.of(Pair.of(0, bmo.a(15, 3)), Pair.of(1, blo.a(32, $$1 * 1.25F, 2)), b());
   }

   private static Pair<Integer, bkp<biw>> a() {
      return Pair.of(
         5,
         new bmk(
            ImmutableList.of(
               Pair.of(bmm.a(bik.m, 8.0F), 8),
               Pair.of(bmm.a(bik.bf, 8.0F), 2),
               Pair.of(bmm.a(bik.bt, 8.0F), 2),
               Pair.of(bmm.a(biz.b, 8.0F), 1),
               Pair.of(bmm.a(biz.f, 8.0F), 1),
               Pair.of(bmm.a(biz.d, 8.0F), 1),
               Pair.of(bmm.a(biz.e, 8.0F), 1),
               Pair.of(bmm.a(biz.g, 8.0F), 1),
               Pair.of(bmm.a(biz.a, 8.0F), 1),
               Pair.of(new bky(30, 60), 2)
            )
         )
      );
   }

   private static Pair<Integer, bkp<biw>> b() {
      return Pair.of(5, new bmk(ImmutableList.of(Pair.of(bmm.a(bik.bf, 8.0F), 2), Pair.of(bmm.a(bik.bt, 8.0F), 2), Pair.of(new bky(30, 60), 8))));
   }

   private static boolean a(aki $$0, biw $$1) {
      ccs $$2 = $$0.c($$1.dk());
      return $$2 != null && $$2.v() && !$$2.e() && !$$2.f();
   }

   private static boolean b(aki $$0, biw $$1) {
      ccs $$2 = $$0.c($$1.dk());
      return $$2 != null && $$2.e();
   }
}
