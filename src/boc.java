import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class boc {
   private static final float a = 0.4F;

   public static ImmutableList<Pair<Integer, ? extends bky<? super cbh>>> a(cbk $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, new bnq(0.8F)),
         Pair.of(0, blv.a()),
         Pair.of(0, new bmc(45, 90)),
         Pair.of(0, new boe()),
         Pair.of(0, bof.a()),
         Pair.of(0, bmp.a()),
         Pair.of(0, bmz.a()),
         Pair.of(0, bnz.a($$0.b(), bsh.c)),
         Pair.of(0, bnz.a($$0.c(), bsh.d)),
         Pair.of(1, new bmg()),
         Pair.of(2, bmj.a()),
         Pair.of(3, new bmb($$1)),
         new Pair[]{
            Pair.of(5, blr.a($$1, false, 4)),
            Pair.of(6, bkq.a($$0.c(), bsh.c, bsh.d, true, Optional.empty())),
            Pair.of(7, new blp($$1)),
            Pair.of(8, boi.a($$1)),
            Pair.of(10, bkq.a($$0x -> $$0x.a(buj.n), bsh.b, false, Optional.of((byte)14))),
            Pair.of(10, bkq.a($$0x -> $$0x.a(buj.o), bsh.e, true, Optional.of((byte)14))),
            Pair.of(10, bkt.a()),
            Pair.of(10, bmq.a())
         }
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bky<? super cbh>>> b(cbk $$0, float $$1) {
      boh $$2;
      if ($$0 == cbk.g) {
         $$2 = new bog();
      } else {
         $$2 = new boh();
      }

      return ImmutableList.of(
         b(),
         Pair.of(
            5,
            new bmt(
               ImmutableList.of(
                  Pair.of($$2, 7),
                  Pair.of(bnn.a(bsh.c, 0.4F, 4), 2),
                  Pair.of(bno.a(bsh.c, 0.4F, 1, 10), 5),
                  Pair.of(bnp.a(bsh.f, $$1, 1, 6, bsh.c), 5),
                  Pair.of(new bls(), $$0 == cbk.g ? 2 : 5),
                  Pair.of(new bny(), $$0 == cbk.g ? 4 : 7)
               )
            )
         ),
         Pair.of(10, new bne(400, 1600)),
         Pair.of(10, bmy.a(biu.bt, 4)),
         Pair.of(2, bnc.a(bsh.c, $$1, 9, 100, 1200)),
         Pair.of(3, new blm(100)),
         Pair.of(99, bnx.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bky<? super cbh>>> a(float $$0) {
      return ImmutableList.of(
         Pair.of(0, new bmg(80, 120)),
         a(),
         Pair.of(5, bmi.a()),
         Pair.of(
            5,
            new bmt(
               ImmutableMap.of(bsh.i, bsi.b),
               ImmutableList.of(
                  Pair.of(blu.a(biu.bf, 8, bsh.q, $$0, 2), 2),
                  Pair.of(blu.a(biu.m, 8, bsh.q, $$0, 2), 1),
                  Pair.of(boa.a($$0), 1),
                  Pair.of(bnd.a($$0, 2), 1),
                  Pair.of(new blw($$0), 2),
                  Pair.of(new blh(20, 40), 2)
               )
            )
         ),
         Pair.of(99, bnx.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bky<? super cbh>>> c(cbk $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, bnc.a(bsh.b, $$1, 1, 150, 1200)),
         Pair.of(3, bnz.a($$0x -> $$0x.a(buj.n), bsh.b)),
         Pair.of(3, new bng()),
         Pair.of(
            5,
            new bmt(
               ImmutableMap.of(bsh.b, bsi.b),
               ImmutableList.of(Pair.of(bmu.a($$1), 1), Pair.of(blt.a($$1), 4), Pair.of(blo.a($$1, 4), 2), Pair.of(new blh(20, 40), 2))
            )
         ),
         b(),
         Pair.of(99, bnx.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bky<? super cbh>>> d(cbk $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, bns.a(ImmutableList.of(Pair.of(bnn.a(bsh.e, 0.4F, 40), 2), Pair.of(bnh.a(), 2)))),
         Pair.of(10, new bne(400, 1600)),
         Pair.of(10, bmy.a(biu.bt, 4)),
         Pair.of(2, bnc.a(bsh.e, $$1, 6, 100, 200)),
         Pair.of(3, new blm(100)),
         Pair.of(3, bnz.a($$0x -> $$0x.a(buj.o), bsh.e)),
         Pair.of(3, new bll(ImmutableMap.of(), ImmutableSet.of(bsh.q), bll.a.a, bll.b.a, ImmutableList.of(Pair.of(new bnr(), 1)))),
         a(),
         Pair.of(99, bnx.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bky<? super cbh>>> e(cbk $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(
            2,
            new bmt(
               ImmutableList.of(
                  Pair.of(blu.a(biu.bf, 8, bsh.q, $$1, 2), 2),
                  Pair.of(blu.a(biu.bf, 8, bil::V_, bil::V_, bsh.r, $$1, 2), 1),
                  Pair.of(blu.a(biu.m, 8, bsh.q, $$1, 2), 1),
                  Pair.of(boa.a($$1), 1),
                  Pair.of(bnd.a($$1, 2), 1),
                  Pair.of(new blw($$1), 1),
                  Pair.of(new blh(30, 60), 1)
               )
            )
         ),
         Pair.of(3, new blm(100)),
         Pair.of(3, bmy.a(biu.bt, 4)),
         Pair.of(3, new bne(400, 1600)),
         Pair.of(3, new bll(ImmutableMap.of(), ImmutableSet.of(bsh.q), bll.a.a, bll.b.a, ImmutableList.of(Pair.of(new bnr(), 1)))),
         Pair.of(3, new bll(ImmutableMap.of(), ImmutableSet.of(bsh.r), bll.a.a, bll.b.a, ImmutableList.of(Pair.of(new bod(), 1)))),
         a(),
         Pair.of(99, bnx.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bky<? super cbh>>> f(cbk $$0, float $$1) {
      float $$2 = $$1 * 1.5F;
      return ImmutableList.of(
         Pair.of(0, bob.a()), Pair.of(1, bna.b(bsh.A, $$2, 6, false)), Pair.of(1, bna.b(bsh.y, $$2, 6, false)), Pair.of(3, boa.a($$2, 2, 2)), b()
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bky<? super cbh>>> g(cbk $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, bms.a()),
         Pair.of(0, bns.a(ImmutableList.of(Pair.of(bnc.a(bsh.e, $$1 * 1.5F, 2, 150, 200), 6), Pair.of(boa.a($$1 * 1.5F), 2)))),
         b(),
         Pair.of(99, bmr.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bky<? super cbh>>> h(cbk $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, boj.a(boj.a(boc::b), bns.a(ImmutableList.of(Pair.of(bmf.a($$1), 5), Pair.of(boa.a($$1 * 1.1F), 2))))),
         Pair.of(0, new blb(600, 600)),
         Pair.of(2, boj.a(boj.a(boc::a), blx.a(24, $$1 * 1.4F, 1))),
         b(),
         Pair.of(99, bmr.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bky<? super cbh>>> i(cbk $$0, float $$1) {
      int $$2 = 2;
      return ImmutableList.of(Pair.of(0, bmx.a(15, 3)), Pair.of(1, blx.a(32, $$1 * 1.25F, 2)), b());
   }

   private static Pair<Integer, bky<bjg>> a() {
      return Pair.of(
         5,
         new bmt(
            ImmutableList.of(
               Pair.of(bmv.a(biu.m, 8.0F), 8),
               Pair.of(bmv.a(biu.bf, 8.0F), 2),
               Pair.of(bmv.a(biu.bt, 8.0F), 2),
               Pair.of(bmv.a(bjj.b, 8.0F), 1),
               Pair.of(bmv.a(bjj.f, 8.0F), 1),
               Pair.of(bmv.a(bjj.d, 8.0F), 1),
               Pair.of(bmv.a(bjj.e, 8.0F), 1),
               Pair.of(bmv.a(bjj.g, 8.0F), 1),
               Pair.of(bmv.a(bjj.a, 8.0F), 1),
               Pair.of(new blh(30, 60), 2)
            )
         )
      );
   }

   private static Pair<Integer, bky<bjg>> b() {
      return Pair.of(5, new bmt(ImmutableList.of(Pair.of(bmv.a(biu.bf, 8.0F), 2), Pair.of(bmv.a(biu.bt, 8.0F), 2), Pair.of(new blh(30, 60), 8))));
   }

   private static boolean a(akr $$0, bjg $$1) {
      cdb $$2 = $$0.c($$1.dl());
      return $$2 != null && $$2.v() && !$$2.e() && !$$2.f();
   }

   private static boolean b(akr $$0, bjg $$1) {
      cdb $$2 = $$0.c($$1.dl());
      return $$2 != null && $$2.e();
   }
}
