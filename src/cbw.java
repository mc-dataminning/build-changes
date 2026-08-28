import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cbw {
   private static final float d = 0.4F;
   public static final int a = 5;
   public static final int b = 2;
   public static final float c = 0.5F;

   public static ImmutableList<Pair<Integer, ? extends byr<? super cqe>>> a(je<cqh> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, new cbk(0.8F)),
         Pair.of(0, bzo.a()),
         Pair.of(0, new bzw(45, 90)),
         Pair.of(0, new cby()),
         Pair.of(0, cbz.a()),
         Pair.of(0, caj.a()),
         Pair.of(0, cat.a()),
         Pair.of(0, cbt.a($$0.a().b(), cgb.c)),
         Pair.of(0, cbt.a($$0.a().c(), cgb.d)),
         Pair.of(1, new caa()),
         Pair.of(2, cad.a()),
         Pair.of(3, new bzv($$1)),
         new Pair[]{
            Pair.of(5, bzk.a($$1, false, 4)),
            Pair.of(6, byj.a($$0.a().c(), cgb.c, cgb.d, true, Optional.empty(), ($$0x, $$1x) -> true)),
            Pair.of(7, new bzi($$1)),
            Pair.of(8, ccc.a($$1)),
            Pair.of(10, byj.a($$0x -> $$0x.a(cif.n), cgb.b, false, Optional.of((byte)14), cbw::a)),
            Pair.of(10, byj.a($$0x -> $$0x.a(cif.o), cgb.e, true, Optional.of((byte)14))),
            Pair.of(10, bym.a()),
            Pair.of(10, cak.a())
         }
      );
   }

   private static boolean a(aro $$0, iu $$1) {
      dzo $$2 = $$0.a_($$1);
      return $$2.a(axa.T) && !$$2.c(dln.c);
   }

   public static ImmutableList<Pair<Integer, ? extends byr<? super cqe>>> b(je<cqh> $$0, float $$1) {
      ccb $$2;
      if ($$0.a(cqh.g)) {
         $$2 = new cca();
      } else {
         $$2 = new ccb();
      }

      return ImmutableList.of(
         b(),
         Pair.of(
            5,
            new can(
               ImmutableList.of(
                  Pair.of($$2, 7),
                  Pair.of(cbh.a(cgb.c, 0.4F, 4), 2),
                  Pair.of(cbi.a(cgb.c, 0.4F, 1, 10), 5),
                  Pair.of(cbj.a(cgb.f, $$1, 1, 6, cgb.c), 5),
                  Pair.of(new bzl(), $$0.a(cqh.g) ? 2 : 5),
                  Pair.of(new cbs(), $$0.a(cqh.g) ? 4 : 7)
               )
            )
         ),
         Pair.of(10, new cay(400, 1600)),
         Pair.of(10, cas.a(bwj.bS, 4)),
         Pair.of(2, caw.a(cgb.c, $$1, 9, 100, 1200)),
         Pair.of(3, new bzf(100)),
         Pair.of(99, cbr.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byr<? super cqe>>> a(float $$0) {
      return ImmutableList.of(
         Pair.of(0, new caa(80, 120)),
         a(),
         Pair.of(5, cac.a()),
         Pair.of(
            5,
            new can(
               ImmutableMap.of(cgb.i, cgc.b),
               ImmutableList.of(
                  Pair.of(bzn.a(bwj.bD, 8, cgb.r, $$0, 2), 2),
                  Pair.of(bzn.a(bwj.u, 8, cgb.r, $$0, 2), 1),
                  Pair.of(cbu.a($$0), 1),
                  Pair.of(cax.a($$0, 2), 1),
                  Pair.of(new bzp($$0), 2),
                  Pair.of(new bza(20, 40), 2)
               )
            )
         ),
         Pair.of(99, cbr.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byr<? super cqe>>> c(je<cqh> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, caw.a(cgb.b, $$1, 1, 150, 1200)),
         Pair.of(3, cbt.a($$0x -> $$0x.a(cif.n), cgb.b)),
         Pair.of(3, new cba()),
         Pair.of(
            5,
            new can(
               ImmutableMap.of(cgb.b, cgc.b),
               ImmutableList.of(Pair.of(cao.a($$1), 1), Pair.of(bzm.a($$1), 4), Pair.of(bzh.a($$1, 4), 2), Pair.of(new bza(20, 40), 2))
            )
         ),
         b(),
         Pair.of(99, cbr.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byr<? super cqe>>> d(je<cqh> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, cbm.a(ImmutableList.of(Pair.of(cbh.a(cgb.e, 0.4F, 40), 2), Pair.of(cbb.a(), 2)))),
         Pair.of(10, new cay(400, 1600)),
         Pair.of(10, cas.a(bwj.bS, 4)),
         Pair.of(2, caw.a(cgb.e, $$1, 6, 100, 200)),
         Pair.of(3, new bzf(100)),
         Pair.of(3, cbt.a($$0x -> $$0x.a(cif.o), cgb.e)),
         Pair.of(3, new bze(ImmutableMap.of(), ImmutableSet.of(cgb.r), bze.a.a, bze.b.a, ImmutableList.of(Pair.of(new cbl(), 1)))),
         a(),
         Pair.of(99, cbr.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byr<? super cqe>>> e(je<cqh> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(
            2,
            new can(
               ImmutableList.of(
                  Pair.of(bzn.a(bwj.bD, 8, cgb.r, $$1, 2), 2),
                  Pair.of(bzn.a(bwj.bD, 8, bvq::S_, bvq::S_, cgb.s, $$1, 2), 1),
                  Pair.of(bzn.a(bwj.u, 8, cgb.r, $$1, 2), 1),
                  Pair.of(cbu.a($$1), 1),
                  Pair.of(cax.a($$1, 2), 1),
                  Pair.of(new bzp($$1), 1),
                  Pair.of(new bza(30, 60), 1)
               )
            )
         ),
         Pair.of(3, new bzf(100)),
         Pair.of(3, cas.a(bwj.bS, 4)),
         Pair.of(3, new cay(400, 1600)),
         Pair.of(3, new bze(ImmutableMap.of(), ImmutableSet.of(cgb.r), bze.a.a, bze.b.a, ImmutableList.of(Pair.of(new cbl(), 1)))),
         Pair.of(3, new bze(ImmutableMap.of(), ImmutableSet.of(cgb.s), bze.a.a, bze.b.a, ImmutableList.of(Pair.of(new cbx(), 1)))),
         a(),
         Pair.of(99, cbr.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byr<? super cqe>>> f(je<cqh> $$0, float $$1) {
      float $$2 = $$1 * 1.5F;
      return ImmutableList.of(
         Pair.of(0, cbv.a()), Pair.of(1, cau.b(cgb.B, $$2, 6, false)), Pair.of(1, cau.b(cgb.z, $$2, 6, false)), Pair.of(3, cbu.a($$2, 2, 2)), b()
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byr<? super cqe>>> g(je<cqh> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, cam.a()),
         Pair.of(0, cbm.a(ImmutableList.of(Pair.of(caw.a(cgb.e, $$1 * 1.5F, 2, 150, 200), 6), Pair.of(cbu.a($$1 * 1.5F), 2)))),
         b(),
         Pair.of(99, cal.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byr<? super cqe>>> h(je<cqh> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, ccd.a(ccd.a(cbw::b), cbm.a(ImmutableList.of(Pair.of(bzz.a($$1), 5), Pair.of(cbu.a($$1 * 1.1F), 2))))),
         Pair.of(0, new byu(600, 600)),
         Pair.of(2, ccd.a(ccd.a(cbw::a), bzq.a(24, $$1 * 1.4F, 1))),
         b(),
         Pair.of(99, cal.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byr<? super cqe>>> i(je<cqh> $$0, float $$1) {
      int $$2 = 2;
      return ImmutableList.of(Pair.of(0, car.a(15, 3)), Pair.of(1, bzq.a(32, $$1 * 1.25F, 2)), b());
   }

   private static Pair<Integer, byr<bwz>> a() {
      return Pair.of(
         5,
         new can(
            ImmutableList.of(
               Pair.of(cap.a(bwj.u, 8.0F), 8),
               Pair.of(cap.a(bwj.bD, 8.0F), 2),
               Pair.of(cap.a(bwj.bS, 8.0F), 2),
               Pair.of(cap.a(bxc.b, 8.0F), 1),
               Pair.of(cap.a(bxc.f, 8.0F), 1),
               Pair.of(cap.a(bxc.d, 8.0F), 1),
               Pair.of(cap.a(bxc.e, 8.0F), 1),
               Pair.of(cap.a(bxc.g, 8.0F), 1),
               Pair.of(cap.a(bxc.a, 8.0F), 1),
               Pair.of(new bza(30, 60), 2)
            )
         )
      );
   }

   private static Pair<Integer, byr<bwz>> b() {
      return Pair.of(5, new can(ImmutableList.of(Pair.of(cap.a(bwj.bD, 8.0F), 2), Pair.of(cap.a(bwj.bS, 8.0F), 2), Pair.of(new bza(30, 60), 8))));
   }

   private static boolean a(aro $$0, bwz $$1) {
      csh $$2 = $$0.d($$1.dv());
      return $$2 != null && $$2.u() && !$$2.e() && !$$2.f();
   }

   private static boolean b(aro $$0, bwz $$1) {
      csh $$2 = $$0.d($$1.dv());
      return $$2 != null && $$2.e();
   }
}
