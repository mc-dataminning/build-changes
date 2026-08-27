import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class bvm {
   private static final float d = 0.4F;
   public static final int a = 5;
   public static final int b = 2;
   public static final float c = 0.5F;

   public static ImmutableList<Pair<Integer, ? extends bsh<? super cjg>>> a(cjj $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, new bva(0.8F)),
         Pair.of(0, bte.a()),
         Pair.of(0, new btm(45, 90)),
         Pair.of(0, new bvo()),
         Pair.of(0, bvp.a()),
         Pair.of(0, btz.a()),
         Pair.of(0, buj.a()),
         Pair.of(0, bvj.a($$0.b(), bzr.c)),
         Pair.of(0, bvj.a($$0.c(), bzr.d)),
         Pair.of(1, new btq()),
         Pair.of(2, btt.a()),
         Pair.of(3, new btl($$1)),
         new Pair[]{
            Pair.of(5, bta.a($$1, false, 4)),
            Pair.of(6, brz.a($$0.c(), bzr.c, bzr.d, true, Optional.empty())),
            Pair.of(7, new bsy($$1)),
            Pair.of(8, bvs.a($$1)),
            Pair.of(10, brz.a($$0x -> $$0x.a(cbv.n), bzr.b, false, Optional.of((byte)14))),
            Pair.of(10, brz.a($$0x -> $$0x.a(cbv.o), bzr.e, true, Optional.of((byte)14))),
            Pair.of(10, bsc.a()),
            Pair.of(10, bua.a())
         }
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bsh<? super cjg>>> b(cjj $$0, float $$1) {
      bvr $$2;
      if ($$0 == cjj.g) {
         $$2 = new bvq();
      } else {
         $$2 = new bvr();
      }

      return ImmutableList.of(
         b(),
         Pair.of(
            5,
            new bud(
               ImmutableList.of(
                  Pair.of($$2, 7),
                  Pair.of(bux.a(bzr.c, 0.4F, 4), 2),
                  Pair.of(buy.a(bzr.c, 0.4F, 1, 10), 5),
                  Pair.of(buz.a(bzr.f, $$1, 1, 6, bzr.c), 5),
                  Pair.of(new btb(), $$0 == cjj.g ? 2 : 5),
                  Pair.of(new bvi(), $$0 == cjj.g ? 4 : 7)
               )
            )
         ),
         Pair.of(10, new buo(400, 1600)),
         Pair.of(10, bui.a(bqb.bx, 4)),
         Pair.of(2, bum.a(bzr.c, $$1, 9, 100, 1200)),
         Pair.of(3, new bsv(100)),
         Pair.of(99, bvh.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bsh<? super cjg>>> a(float $$0) {
      return ImmutableList.of(
         Pair.of(0, new btq(80, 120)),
         a(),
         Pair.of(5, bts.a()),
         Pair.of(
            5,
            new bud(
               ImmutableMap.of(bzr.i, bzs.b),
               ImmutableList.of(
                  Pair.of(btd.a(bqb.bi, 8, bzr.q, $$0, 2), 2),
                  Pair.of(btd.a(bqb.p, 8, bzr.q, $$0, 2), 1),
                  Pair.of(bvk.a($$0), 1),
                  Pair.of(bun.a($$0, 2), 1),
                  Pair.of(new btf($$0), 2),
                  Pair.of(new bsq(20, 40), 2)
               )
            )
         ),
         Pair.of(99, bvh.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bsh<? super cjg>>> c(cjj $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, bum.a(bzr.b, $$1, 1, 150, 1200)),
         Pair.of(3, bvj.a($$0x -> $$0x.a(cbv.n), bzr.b)),
         Pair.of(3, new buq()),
         Pair.of(
            5,
            new bud(
               ImmutableMap.of(bzr.b, bzs.b),
               ImmutableList.of(Pair.of(bue.a($$1), 1), Pair.of(btc.a($$1), 4), Pair.of(bsx.a($$1, 4), 2), Pair.of(new bsq(20, 40), 2))
            )
         ),
         b(),
         Pair.of(99, bvh.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bsh<? super cjg>>> d(cjj $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, bvc.a(ImmutableList.of(Pair.of(bux.a(bzr.e, 0.4F, 40), 2), Pair.of(bur.a(), 2)))),
         Pair.of(10, new buo(400, 1600)),
         Pair.of(10, bui.a(bqb.bx, 4)),
         Pair.of(2, bum.a(bzr.e, $$1, 6, 100, 200)),
         Pair.of(3, new bsv(100)),
         Pair.of(3, bvj.a($$0x -> $$0x.a(cbv.o), bzr.e)),
         Pair.of(3, new bsu(ImmutableMap.of(), ImmutableSet.of(bzr.q), bsu.a.a, bsu.b.a, ImmutableList.of(Pair.of(new bvb(), 1)))),
         a(),
         Pair.of(99, bvh.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bsh<? super cjg>>> e(cjj $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(
            2,
            new bud(
               ImmutableList.of(
                  Pair.of(btd.a(bqb.bi, 8, bzr.q, $$1, 2), 2),
                  Pair.of(btd.a(bqb.bi, 8, bpp::W_, bpp::W_, bzr.r, $$1, 2), 1),
                  Pair.of(btd.a(bqb.p, 8, bzr.q, $$1, 2), 1),
                  Pair.of(bvk.a($$1), 1),
                  Pair.of(bun.a($$1, 2), 1),
                  Pair.of(new btf($$1), 1),
                  Pair.of(new bsq(30, 60), 1)
               )
            )
         ),
         Pair.of(3, new bsv(100)),
         Pair.of(3, bui.a(bqb.bx, 4)),
         Pair.of(3, new buo(400, 1600)),
         Pair.of(3, new bsu(ImmutableMap.of(), ImmutableSet.of(bzr.q), bsu.a.a, bsu.b.a, ImmutableList.of(Pair.of(new bvb(), 1)))),
         Pair.of(3, new bsu(ImmutableMap.of(), ImmutableSet.of(bzr.r), bsu.a.a, bsu.b.a, ImmutableList.of(Pair.of(new bvn(), 1)))),
         a(),
         Pair.of(99, bvh.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bsh<? super cjg>>> f(cjj $$0, float $$1) {
      float $$2 = $$1 * 1.5F;
      return ImmutableList.of(
         Pair.of(0, bvl.a()), Pair.of(1, buk.b(bzr.A, $$2, 6, false)), Pair.of(1, buk.b(bzr.y, $$2, 6, false)), Pair.of(3, bvk.a($$2, 2, 2)), b()
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bsh<? super cjg>>> g(cjj $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, buc.a()),
         Pair.of(0, bvc.a(ImmutableList.of(Pair.of(bum.a(bzr.e, $$1 * 1.5F, 2, 150, 200), 6), Pair.of(bvk.a($$1 * 1.5F), 2)))),
         b(),
         Pair.of(99, bub.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bsh<? super cjg>>> h(cjj $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, bvt.a(bvt.a(bvm::b), bvc.a(ImmutableList.of(Pair.of(btp.a($$1), 5), Pair.of(bvk.a($$1 * 1.1F), 2))))),
         Pair.of(0, new bsk(600, 600)),
         Pair.of(2, bvt.a(bvt.a(bvm::a), btg.a(24, $$1 * 1.4F, 1))),
         b(),
         Pair.of(99, bub.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bsh<? super cjg>>> i(cjj $$0, float $$1) {
      int $$2 = 2;
      return ImmutableList.of(Pair.of(0, buh.a(15, 3)), Pair.of(1, btg.a(32, $$1 * 1.25F, 2)), b());
   }

   private static Pair<Integer, bsh<bqo>> a() {
      return Pair.of(
         5,
         new bud(
            ImmutableList.of(
               Pair.of(buf.a(bqb.p, 8.0F), 8),
               Pair.of(buf.a(bqb.bi, 8.0F), 2),
               Pair.of(buf.a(bqb.bx, 8.0F), 2),
               Pair.of(buf.a(bqr.b, 8.0F), 1),
               Pair.of(buf.a(bqr.f, 8.0F), 1),
               Pair.of(buf.a(bqr.d, 8.0F), 1),
               Pair.of(buf.a(bqr.e, 8.0F), 1),
               Pair.of(buf.a(bqr.g, 8.0F), 1),
               Pair.of(buf.a(bqr.a, 8.0F), 1),
               Pair.of(new bsq(30, 60), 2)
            )
         )
      );
   }

   private static Pair<Integer, bsh<bqo>> b() {
      return Pair.of(5, new bud(ImmutableList.of(Pair.of(buf.a(bqb.bi, 8.0F), 2), Pair.of(buf.a(bqb.bx, 8.0F), 2), Pair.of(new bsq(30, 60), 8))));
   }

   private static boolean a(aps $$0, bqo $$1) {
      cle $$2 = $$0.d($$1.dm());
      return $$2 != null && $$2.v() && !$$2.e() && !$$2.f();
   }

   private static boolean b(aps $$0, bqo $$1) {
      cle $$2 = $$0.d($$1.dm());
      return $$2 != null && $$2.e();
   }
}
