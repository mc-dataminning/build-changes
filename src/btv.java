import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class btv {
   private static final float d = 0.4F;
   public static final int a = 5;
   public static final int b = 2;
   public static final float c = 0.5F;

   public static ImmutableList<Pair<Integer, ? extends bqq<? super chn>>> a(chq $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, new btj(0.8F)),
         Pair.of(0, brn.a()),
         Pair.of(0, new brv(45, 90)),
         Pair.of(0, new btx()),
         Pair.of(0, bty.a()),
         Pair.of(0, bsi.a()),
         Pair.of(0, bss.a()),
         Pair.of(0, bts.a($$0.b(), bya.c)),
         Pair.of(0, bts.a($$0.c(), bya.d)),
         Pair.of(1, new brz()),
         Pair.of(2, bsc.a()),
         Pair.of(3, new bru($$1)),
         new Pair[]{
            Pair.of(5, brj.a($$1, false, 4)),
            Pair.of(6, bqi.a($$0.c(), bya.c, bya.d, true, Optional.empty())),
            Pair.of(7, new brh($$1)),
            Pair.of(8, bub.a($$1)),
            Pair.of(10, bqi.a($$0x -> $$0x.a(cae.n), bya.b, false, Optional.of((byte)14))),
            Pair.of(10, bqi.a($$0x -> $$0x.a(cae.o), bya.e, true, Optional.of((byte)14))),
            Pair.of(10, bql.a()),
            Pair.of(10, bsj.a())
         }
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bqq<? super chn>>> b(chq $$0, float $$1) {
      bua $$2;
      if ($$0 == chq.g) {
         $$2 = new btz();
      } else {
         $$2 = new bua();
      }

      return ImmutableList.of(
         b(),
         Pair.of(
            5,
            new bsm(
               ImmutableList.of(
                  Pair.of($$2, 7),
                  Pair.of(btg.a(bya.c, 0.4F, 4), 2),
                  Pair.of(bth.a(bya.c, 0.4F, 1, 10), 5),
                  Pair.of(bti.a(bya.f, $$1, 1, 6, bya.c), 5),
                  Pair.of(new brk(), $$0 == chq.g ? 2 : 5),
                  Pair.of(new btr(), $$0 == chq.g ? 4 : 7)
               )
            )
         ),
         Pair.of(10, new bsx(400, 1600)),
         Pair.of(10, bsr.a(bol.bw, 4)),
         Pair.of(2, bsv.a(bya.c, $$1, 9, 100, 1200)),
         Pair.of(3, new bre(100)),
         Pair.of(99, btq.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bqq<? super chn>>> a(float $$0) {
      return ImmutableList.of(
         Pair.of(0, new brz(80, 120)),
         a(),
         Pair.of(5, bsb.a()),
         Pair.of(
            5,
            new bsm(
               ImmutableMap.of(bya.i, byb.b),
               ImmutableList.of(
                  Pair.of(brm.a(bol.bh, 8, bya.q, $$0, 2), 2),
                  Pair.of(brm.a(bol.o, 8, bya.q, $$0, 2), 1),
                  Pair.of(btt.a($$0), 1),
                  Pair.of(bsw.a($$0, 2), 1),
                  Pair.of(new bro($$0), 2),
                  Pair.of(new bqz(20, 40), 2)
               )
            )
         ),
         Pair.of(99, btq.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bqq<? super chn>>> c(chq $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, bsv.a(bya.b, $$1, 1, 150, 1200)),
         Pair.of(3, bts.a($$0x -> $$0x.a(cae.n), bya.b)),
         Pair.of(3, new bsz()),
         Pair.of(
            5,
            new bsm(
               ImmutableMap.of(bya.b, byb.b),
               ImmutableList.of(Pair.of(bsn.a($$1), 1), Pair.of(brl.a($$1), 4), Pair.of(brg.a($$1, 4), 2), Pair.of(new bqz(20, 40), 2))
            )
         ),
         b(),
         Pair.of(99, btq.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bqq<? super chn>>> d(chq $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, btl.a(ImmutableList.of(Pair.of(btg.a(bya.e, 0.4F, 40), 2), Pair.of(bta.a(), 2)))),
         Pair.of(10, new bsx(400, 1600)),
         Pair.of(10, bsr.a(bol.bw, 4)),
         Pair.of(2, bsv.a(bya.e, $$1, 6, 100, 200)),
         Pair.of(3, new bre(100)),
         Pair.of(3, bts.a($$0x -> $$0x.a(cae.o), bya.e)),
         Pair.of(3, new brd(ImmutableMap.of(), ImmutableSet.of(bya.q), brd.a.a, brd.b.a, ImmutableList.of(Pair.of(new btk(), 1)))),
         a(),
         Pair.of(99, btq.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bqq<? super chn>>> e(chq $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(
            2,
            new bsm(
               ImmutableList.of(
                  Pair.of(brm.a(bol.bh, 8, bya.q, $$1, 2), 2),
                  Pair.of(brm.a(bol.bh, 8, boa::Y_, boa::Y_, bya.r, $$1, 2), 1),
                  Pair.of(brm.a(bol.o, 8, bya.q, $$1, 2), 1),
                  Pair.of(btt.a($$1), 1),
                  Pair.of(bsw.a($$1, 2), 1),
                  Pair.of(new bro($$1), 1),
                  Pair.of(new bqz(30, 60), 1)
               )
            )
         ),
         Pair.of(3, new bre(100)),
         Pair.of(3, bsr.a(bol.bw, 4)),
         Pair.of(3, new bsx(400, 1600)),
         Pair.of(3, new brd(ImmutableMap.of(), ImmutableSet.of(bya.q), brd.a.a, brd.b.a, ImmutableList.of(Pair.of(new btk(), 1)))),
         Pair.of(3, new brd(ImmutableMap.of(), ImmutableSet.of(bya.r), brd.a.a, brd.b.a, ImmutableList.of(Pair.of(new btw(), 1)))),
         a(),
         Pair.of(99, btq.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bqq<? super chn>>> f(chq $$0, float $$1) {
      float $$2 = $$1 * 1.5F;
      return ImmutableList.of(
         Pair.of(0, btu.a()), Pair.of(1, bst.b(bya.A, $$2, 6, false)), Pair.of(1, bst.b(bya.y, $$2, 6, false)), Pair.of(3, btt.a($$2, 2, 2)), b()
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bqq<? super chn>>> g(chq $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, bsl.a()),
         Pair.of(0, btl.a(ImmutableList.of(Pair.of(bsv.a(bya.e, $$1 * 1.5F, 2, 150, 200), 6), Pair.of(btt.a($$1 * 1.5F), 2)))),
         b(),
         Pair.of(99, bsk.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bqq<? super chn>>> h(chq $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, buc.a(buc.a(btv::b), btl.a(ImmutableList.of(Pair.of(bry.a($$1), 5), Pair.of(btt.a($$1 * 1.1F), 2))))),
         Pair.of(0, new bqt(600, 600)),
         Pair.of(2, buc.a(buc.a(btv::a), brp.a(24, $$1 * 1.4F, 1))),
         b(),
         Pair.of(99, bsk.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bqq<? super chn>>> i(chq $$0, float $$1) {
      int $$2 = 2;
      return ImmutableList.of(Pair.of(0, bsq.a(15, 3)), Pair.of(1, brp.a(32, $$1 * 1.25F, 2)), b());
   }

   private static Pair<Integer, bqq<box>> a() {
      return Pair.of(
         5,
         new bsm(
            ImmutableList.of(
               Pair.of(bso.a(bol.o, 8.0F), 8),
               Pair.of(bso.a(bol.bh, 8.0F), 2),
               Pair.of(bso.a(bol.bw, 8.0F), 2),
               Pair.of(bso.a(bpa.b, 8.0F), 1),
               Pair.of(bso.a(bpa.f, 8.0F), 1),
               Pair.of(bso.a(bpa.d, 8.0F), 1),
               Pair.of(bso.a(bpa.e, 8.0F), 1),
               Pair.of(bso.a(bpa.g, 8.0F), 1),
               Pair.of(bso.a(bpa.a, 8.0F), 1),
               Pair.of(new bqz(30, 60), 2)
            )
         )
      );
   }

   private static Pair<Integer, bqq<box>> b() {
      return Pair.of(5, new bsm(ImmutableList.of(Pair.of(bso.a(bol.bh, 8.0F), 2), Pair.of(bso.a(bol.bw, 8.0F), 2), Pair.of(new bqz(30, 60), 8))));
   }

   private static boolean a(apa $$0, box $$1) {
      cjj $$2 = $$0.d($$1.dj());
      return $$2 != null && $$2.v() && !$$2.e() && !$$2.f();
   }

   private static boolean b(apa $$0, box $$1) {
      cjj $$2 = $$0.d($$1.dj());
      return $$2 != null && $$2.e();
   }
}
