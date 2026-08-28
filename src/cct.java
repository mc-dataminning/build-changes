import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cct {
   private static final float d = 0.4F;
   public static final int a = 5;
   public static final int b = 2;
   public static final float c = 0.5F;

   public static ImmutableList<Pair<Integer, ? extends bzo<? super crl>>> a(jg<cro> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, new cch(0.8F)),
         Pair.of(0, cal.a()),
         Pair.of(0, new cat(45, 90)),
         Pair.of(0, new ccv()),
         Pair.of(0, ccw.a()),
         Pair.of(0, cbg.a()),
         Pair.of(0, cbq.a()),
         Pair.of(0, ccq.a($$0.a().b(), cgy.c)),
         Pair.of(0, ccq.a($$0.a().c(), cgy.d)),
         Pair.of(1, new cax()),
         Pair.of(2, cba.a()),
         Pair.of(3, new cas($$1)),
         new Pair[]{
            Pair.of(5, cah.a($$1, false, 4)),
            Pair.of(6, bzg.a($$0.a().c(), cgy.c, cgy.d, true, Optional.empty(), ($$0x, $$1x) -> true)),
            Pair.of(7, new caf($$1)),
            Pair.of(8, ccz.a($$1)),
            Pair.of(10, bzg.a($$0x -> $$0x.a(cjc.n), cgy.b, false, Optional.of((byte)14), cct::a)),
            Pair.of(10, bzg.a($$0x -> $$0x.a(cjc.o), cgy.e, true, Optional.of((byte)14))),
            Pair.of(10, bzj.a()),
            Pair.of(10, cbh.a())
         }
      );
   }

   private static boolean a(aru $$0, iw $$1) {
      ebg $$2 = $$0.a_($$1);
      return $$2.a(axg.T) && !$$2.c(dmx.c);
   }

   public static ImmutableList<Pair<Integer, ? extends bzo<? super crl>>> b(jg<cro> $$0, float $$1) {
      ccy $$2;
      if ($$0.a(cro.g)) {
         $$2 = new ccx();
      } else {
         $$2 = new ccy();
      }

      return ImmutableList.of(
         b(),
         Pair.of(
            5,
            new cbk(
               ImmutableList.of(
                  Pair.of($$2, 7),
                  Pair.of(cce.a(cgy.c, 0.4F, 4), 2),
                  Pair.of(ccf.a(cgy.c, 0.4F, 1, 10), 5),
                  Pair.of(ccg.a(cgy.f, $$1, 1, 6, cgy.c), 5),
                  Pair.of(new cai(), $$0.a(cro.g) ? 2 : 5),
                  Pair.of(new ccp(), $$0.a(cro.g) ? 4 : 7)
               )
            )
         ),
         Pair.of(10, new cbv(400, 1600)),
         Pair.of(10, cbp.a(bxe.bT, 4)),
         Pair.of(2, cbt.a(cgy.c, $$1, 9, 100, 1200)),
         Pair.of(3, new cac(100)),
         Pair.of(99, cco.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzo<? super crl>>> a(float $$0) {
      return ImmutableList.of(
         Pair.of(0, new cax(80, 120)),
         a(),
         Pair.of(5, caz.a()),
         Pair.of(
            5,
            new cbk(
               ImmutableMap.of(cgy.i, cgz.b),
               ImmutableList.of(
                  Pair.of(cak.a(bxe.bE, 8, cgy.r, $$0, 2), 2),
                  Pair.of(cak.a(bxe.v, 8, cgy.r, $$0, 2), 1),
                  Pair.of(ccr.a($$0), 1),
                  Pair.of(cbu.a($$0, 2), 1),
                  Pair.of(new cam($$0), 2),
                  Pair.of(new bzx(20, 40), 2)
               )
            )
         ),
         Pair.of(99, cco.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzo<? super crl>>> c(jg<cro> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, cbt.a(cgy.b, $$1, 1, 150, 1200)),
         Pair.of(3, ccq.a($$0x -> $$0x.a(cjc.n), cgy.b)),
         Pair.of(3, new cbx()),
         Pair.of(
            5,
            new cbk(
               ImmutableMap.of(cgy.b, cgz.b),
               ImmutableList.of(Pair.of(cbl.a($$1), 1), Pair.of(caj.a($$1), 4), Pair.of(cae.a($$1, 4), 2), Pair.of(new bzx(20, 40), 2))
            )
         ),
         b(),
         Pair.of(99, cco.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzo<? super crl>>> d(jg<cro> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, ccj.a(ImmutableList.of(Pair.of(cce.a(cgy.e, 0.4F, 40), 2), Pair.of(cby.a(), 2)))),
         Pair.of(10, new cbv(400, 1600)),
         Pair.of(10, cbp.a(bxe.bT, 4)),
         Pair.of(2, cbt.a(cgy.e, $$1, 6, 100, 200)),
         Pair.of(3, new cac(100)),
         Pair.of(3, ccq.a($$0x -> $$0x.a(cjc.o), cgy.e)),
         Pair.of(3, new cab(ImmutableMap.of(), ImmutableSet.of(cgy.r), cab.a.a, cab.b.a, ImmutableList.of(Pair.of(new cci(), 1)))),
         a(),
         Pair.of(99, cco.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzo<? super crl>>> e(jg<cro> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(
            2,
            new cbk(
               ImmutableList.of(
                  Pair.of(cak.a(bxe.bE, 8, cgy.r, $$1, 2), 2),
                  Pair.of(cak.a(bxe.bE, 8, bwl::X_, bwl::X_, cgy.s, $$1, 2), 1),
                  Pair.of(cak.a(bxe.v, 8, cgy.r, $$1, 2), 1),
                  Pair.of(ccr.a($$1), 1),
                  Pair.of(cbu.a($$1, 2), 1),
                  Pair.of(new cam($$1), 1),
                  Pair.of(new bzx(30, 60), 1)
               )
            )
         ),
         Pair.of(3, new cac(100)),
         Pair.of(3, cbp.a(bxe.bT, 4)),
         Pair.of(3, new cbv(400, 1600)),
         Pair.of(3, new cab(ImmutableMap.of(), ImmutableSet.of(cgy.r), cab.a.a, cab.b.a, ImmutableList.of(Pair.of(new cci(), 1)))),
         Pair.of(3, new cab(ImmutableMap.of(), ImmutableSet.of(cgy.s), cab.a.a, cab.b.a, ImmutableList.of(Pair.of(new ccu(), 1)))),
         a(),
         Pair.of(99, cco.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzo<? super crl>>> f(jg<cro> $$0, float $$1) {
      float $$2 = $$1 * 1.5F;
      return ImmutableList.of(
         Pair.of(0, ccs.a()), Pair.of(1, cbr.b(cgy.B, $$2, 6, false)), Pair.of(1, cbr.b(cgy.z, $$2, 6, false)), Pair.of(3, ccr.a($$2, 2, 2)), b()
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzo<? super crl>>> g(jg<cro> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, cbj.a()),
         Pair.of(0, ccj.a(ImmutableList.of(Pair.of(cbt.a(cgy.e, $$1 * 1.5F, 2, 150, 200), 6), Pair.of(ccr.a($$1 * 1.5F), 2)))),
         b(),
         Pair.of(99, cbi.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzo<? super crl>>> h(jg<cro> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, cda.a(cda.a(cct::b), ccj.a(ImmutableList.of(Pair.of(caw.a($$1), 5), Pair.of(ccr.a($$1 * 1.1F), 2))))),
         Pair.of(0, new bzr(600, 600)),
         Pair.of(2, cda.a(cda.a(cct::a), can.a(24, $$1 * 1.4F, 1))),
         b(),
         Pair.of(99, cbi.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzo<? super crl>>> i(jg<cro> $$0, float $$1) {
      int $$2 = 2;
      return ImmutableList.of(Pair.of(0, cbo.a(15, 3)), Pair.of(1, can.a(32, $$1 * 1.25F, 2)), b());
   }

   private static Pair<Integer, bzo<bxw>> a() {
      return Pair.of(
         5,
         new cbk(
            ImmutableList.of(
               Pair.of(cbm.a(bxe.v, 8.0F), 8),
               Pair.of(cbm.a(bxe.bE, 8.0F), 2),
               Pair.of(cbm.a(bxe.bT, 8.0F), 2),
               Pair.of(cbm.a(bxz.b, 8.0F), 1),
               Pair.of(cbm.a(bxz.f, 8.0F), 1),
               Pair.of(cbm.a(bxz.d, 8.0F), 1),
               Pair.of(cbm.a(bxz.e, 8.0F), 1),
               Pair.of(cbm.a(bxz.g, 8.0F), 1),
               Pair.of(cbm.a(bxz.a, 8.0F), 1),
               Pair.of(new bzx(30, 60), 2)
            )
         )
      );
   }

   private static Pair<Integer, bzo<bxw>> b() {
      return Pair.of(5, new cbk(ImmutableList.of(Pair.of(cbm.a(bxe.bE, 8.0F), 2), Pair.of(cbm.a(bxe.bT, 8.0F), 2), Pair.of(new bzx(30, 60), 8))));
   }

   private static boolean a(aru $$0, bxw $$1) {
      ctp $$2 = $$0.d($$1.dv());
      return $$2 != null && $$2.r() && !$$2.e() && !$$2.f();
   }

   private static boolean b(aru $$0, bxw $$1) {
      ctp $$2 = $$0.d($$1.dv());
      return $$2 != null && $$2.e();
   }
}
