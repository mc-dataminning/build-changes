import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cbc {
   private static final int e = 12;
   private static final int f = 16;
   private static final int g = 3;
   private static final int h = 1;
   private static final int i = 2;
   private static final int j = 5;
   private static final int k = 10;
   private static final int l = 10;
   private static final int m = 20;
   private static final int n = 15;
   private static final int o = 30;
   private static final int p = 30;
   private static final float q = 0.05F;
   private static final float r = 0.2F;
   public static final Map<cbb, Int2ObjectMap<cbc.f[]>> a = ac.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            cbb.g,
            a(
               ImmutableMap.of(
                  1,
                  new cbc.f[]{
                     new cbc.b(ciz.oI, 20, 16, 2),
                     new cbc.b(ciz.tm, 26, 16, 2),
                     new cbc.b(ciz.tl, 22, 16, 2),
                     new cbc.b(ciz.uq, 15, 16, 2),
                     new cbc.h(ciz.oJ, 1, 6, 16, 1)
                  },
                  2,
                  new cbc.f[]{new cbc.b(csl.dV, 6, 12, 10), new cbc.h(ciz.tz, 1, 4, 5), new cbc.h(ciz.nF, 1, 4, 16, 5)},
                  3,
                  new cbc.f[]{new cbc.h(ciz.re, 3, 18, 10), new cbc.b(csl.fa, 4, 12, 20)},
                  4,
                  new cbc.f[]{
                     new cbc.h(csl.eh, 1, 1, 12, 15),
                     new cbc.i(bhv.p, 100, 15),
                     new cbc.i(bhv.h, 160, 15),
                     new cbc.i(bhv.r, 140, 15),
                     new cbc.i(bhv.o, 120, 15),
                     new cbc.i(bhv.s, 280, 15),
                     new cbc.i(bhv.w, 7, 15)
                  },
                  5,
                  new cbc.f[]{new cbc.h(ciz.tq, 3, 3, 30), new cbc.h(ciz.rE, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            cbb.h,
            a(
               ImmutableMap.of(
                  1,
                  new cbc.f[]{
                     new cbc.b(ciz.oE, 20, 16, 2), new cbc.b(ciz.nI, 10, 16, 2), new cbc.g(ciz.ql, 6, ciz.qp, 6, 16, 1), new cbc.h(ciz.pT, 3, 1, 16, 1)
                  },
                  2,
                  new cbc.f[]{new cbc.b(ciz.ql, 15, 16, 10), new cbc.g(ciz.qm, 6, ciz.qq, 6, 16, 5), new cbc.h(ciz.vx, 2, 1, 5)},
                  3,
                  new cbc.f[]{new cbc.b(ciz.qm, 13, 16, 20), new cbc.e(ciz.qh, 3, 3, 10, 0.2F)},
                  4,
                  new cbc.f[]{new cbc.b(ciz.qn, 6, 12, 30)},
                  5,
                  new cbc.f[]{
                     new cbc.b(ciz.qo, 4, 12, 30),
                     new cbc.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(cbd.c, ciz.ni)
                           .put(cbd.g, ciz.nk)
                           .put(cbd.e, ciz.nk)
                           .put(cbd.a, ciz.no)
                           .put(cbd.b, ciz.no)
                           .put(cbd.d, ciz.nq)
                           .put(cbd.f, ciz.nu)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            cbb.n,
            a(
               ImmutableMap.of(
                  1,
                  new cbc.f[]{
                     new cbc.b(csl.bA, 18, 16, 2),
                     new cbc.b(csl.bM, 18, 16, 2),
                     new cbc.b(csl.bP, 18, 16, 2),
                     new cbc.b(csl.bH, 18, 16, 2),
                     new cbc.h(ciz.rg, 2, 1, 1)
                  },
                  2,
                  new cbc.f[]{
                     new cbc.b(ciz.qu, 12, 16, 10),
                     new cbc.b(ciz.qB, 12, 16, 10),
                     new cbc.b(ciz.qJ, 12, 16, 10),
                     new cbc.b(ciz.qx, 12, 16, 10),
                     new cbc.b(ciz.qz, 12, 16, 10),
                     new cbc.h(csl.bA, 1, 1, 16, 5),
                     new cbc.h(csl.bB, 1, 1, 16, 5),
                     new cbc.h(csl.bC, 1, 1, 16, 5),
                     new cbc.h(csl.bD, 1, 1, 16, 5),
                     new cbc.h(csl.bE, 1, 1, 16, 5),
                     new cbc.h(csl.bF, 1, 1, 16, 5),
                     new cbc.h(csl.bG, 1, 1, 16, 5),
                     new cbc.h(csl.bH, 1, 1, 16, 5),
                     new cbc.h(csl.bI, 1, 1, 16, 5),
                     new cbc.h(csl.bJ, 1, 1, 16, 5),
                     new cbc.h(csl.bK, 1, 1, 16, 5),
                     new cbc.h(csl.bL, 1, 1, 16, 5),
                     new cbc.h(csl.bM, 1, 1, 16, 5),
                     new cbc.h(csl.bN, 1, 1, 16, 5),
                     new cbc.h(csl.bO, 1, 1, 16, 5),
                     new cbc.h(csl.bP, 1, 1, 16, 5),
                     new cbc.h(csl.ik, 1, 4, 16, 5),
                     new cbc.h(csl.il, 1, 4, 16, 5),
                     new cbc.h(csl.im, 1, 4, 16, 5),
                     new cbc.h(csl.in, 1, 4, 16, 5),
                     new cbc.h(csl.io, 1, 4, 16, 5),
                     new cbc.h(csl.ip, 1, 4, 16, 5),
                     new cbc.h(csl.iq, 1, 4, 16, 5),
                     new cbc.h(csl.ir, 1, 4, 16, 5),
                     new cbc.h(csl.is, 1, 4, 16, 5),
                     new cbc.h(csl.it, 1, 4, 16, 5),
                     new cbc.h(csl.iu, 1, 4, 16, 5),
                     new cbc.h(csl.iv, 1, 4, 16, 5),
                     new cbc.h(csl.iw, 1, 4, 16, 5),
                     new cbc.h(csl.ix, 1, 4, 16, 5),
                     new cbc.h(csl.iy, 1, 4, 16, 5),
                     new cbc.h(csl.iz, 1, 4, 16, 5)
                  },
                  3,
                  new cbc.f[]{
                     new cbc.b(ciz.qy, 12, 16, 20),
                     new cbc.b(ciz.qC, 12, 16, 20),
                     new cbc.b(ciz.qv, 12, 16, 20),
                     new cbc.b(ciz.qI, 12, 16, 20),
                     new cbc.b(ciz.qA, 12, 16, 20),
                     new cbc.h(csl.aZ, 3, 1, 12, 10),
                     new cbc.h(csl.bd, 3, 1, 12, 10),
                     new cbc.h(csl.bn, 3, 1, 12, 10),
                     new cbc.h(csl.bo, 3, 1, 12, 10),
                     new cbc.h(csl.bk, 3, 1, 12, 10),
                     new cbc.h(csl.bl, 3, 1, 12, 10),
                     new cbc.h(csl.bi, 3, 1, 12, 10),
                     new cbc.h(csl.bg, 3, 1, 12, 10),
                     new cbc.h(csl.bm, 3, 1, 12, 10),
                     new cbc.h(csl.bc, 3, 1, 12, 10),
                     new cbc.h(csl.bh, 3, 1, 12, 10),
                     new cbc.h(csl.be, 3, 1, 12, 10),
                     new cbc.h(csl.bb, 3, 1, 12, 10),
                     new cbc.h(csl.ba, 3, 1, 12, 10),
                     new cbc.h(csl.bf, 3, 1, 12, 10),
                     new cbc.h(csl.bj, 3, 1, 12, 10)
                  },
                  4,
                  new cbc.f[]{
                     new cbc.b(ciz.qG, 12, 16, 30),
                     new cbc.b(ciz.qE, 12, 16, 30),
                     new cbc.b(ciz.qF, 12, 16, 30),
                     new cbc.b(ciz.qH, 12, 16, 30),
                     new cbc.b(ciz.qw, 12, 16, 30),
                     new cbc.b(ciz.qD, 12, 16, 30),
                     new cbc.h(ciz.tV, 3, 1, 12, 15),
                     new cbc.h(ciz.ug, 3, 1, 12, 15),
                     new cbc.h(ciz.tY, 3, 1, 12, 15),
                     new cbc.h(ciz.uj, 3, 1, 12, 15),
                     new cbc.h(ciz.ub, 3, 1, 12, 15),
                     new cbc.h(ciz.ui, 3, 1, 12, 15),
                     new cbc.h(ciz.ua, 3, 1, 12, 15),
                     new cbc.h(ciz.uc, 3, 1, 12, 15),
                     new cbc.h(ciz.uk, 3, 1, 12, 15),
                     new cbc.h(ciz.uf, 3, 1, 12, 15),
                     new cbc.h(ciz.tX, 3, 1, 12, 15),
                     new cbc.h(ciz.ue, 3, 1, 12, 15),
                     new cbc.h(ciz.uh, 3, 1, 12, 15),
                     new cbc.h(ciz.tZ, 3, 1, 12, 15),
                     new cbc.h(ciz.tW, 3, 1, 12, 15),
                     new cbc.h(ciz.ud, 3, 1, 12, 15)
                  },
                  5,
                  new cbc.f[]{new cbc.h(ciz.pl, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            cbb.i,
            a(
               ImmutableMap.of(
                  1,
                  new cbc.f[]{new cbc.b(ciz.oB, 32, 16, 2), new cbc.h(ciz.nH, 1, 16, 1), new cbc.g(csl.L, 10, ciz.pi, 10, 12, 1)},
                  2,
                  new cbc.f[]{new cbc.b(ciz.pi, 26, 12, 10), new cbc.h(ciz.nG, 2, 1, 5)},
                  3,
                  new cbc.f[]{new cbc.b(ciz.oE, 14, 16, 20), new cbc.h(ciz.uZ, 3, 1, 10)},
                  4,
                  new cbc.f[]{new cbc.b(ciz.oF, 24, 16, 30), new cbc.e(ciz.nG, 2, 3, 15)},
                  5,
                  new cbc.f[]{new cbc.b(ciz.lF, 8, 12, 30), new cbc.e(ciz.uZ, 3, 3, 15), new cbc.j(ciz.nH, 5, ciz.uw, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            cbb.k,
            a(
               ImmutableMap.builder()
                  .put(1, new cbc.f[]{new cbc.b(ciz.qa, 24, 16, 2), new cbc.d(1), new cbc.h(csl.cl, 9, 1, 12, 1)})
                  .put(2, new cbc.f[]{new cbc.b(ciz.qb, 4, 12, 10), new cbc.d(5), new cbc.h(ciz.vt, 1, 1, 5)})
                  .put(3, new cbc.f[]{new cbc.b(ciz.qr, 5, 12, 20), new cbc.d(10), new cbc.h(ciz.ck, 1, 4, 10)})
                  .put(4, new cbc.f[]{new cbc.b(ciz.tg, 2, 12, 30), new cbc.d(15), new cbc.h(ciz.qi, 5, 1, 15), new cbc.h(ciz.qe, 4, 1, 15)})
                  .put(5, new cbc.f[]{new cbc.h(ciz.tR, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            cbb.e,
            a(
               ImmutableMap.of(
                  1,
                  new cbc.f[]{new cbc.b(ciz.qa, 24, 16, 2), new cbc.h(ciz.tp, 7, 1, 1)},
                  2,
                  new cbc.f[]{new cbc.b(ciz.fx, 11, 16, 10), new cbc.k(13, apu.d, "filled_map.monument", ebi.a.j, 12, 5)},
                  3,
                  new cbc.f[]{new cbc.b(ciz.qe, 1, 12, 20), new cbc.k(14, apu.c, "filled_map.mansion", ebi.a.i, 12, 10)},
                  4,
                  new cbc.f[]{
                     new cbc.h(ciz.ti, 7, 1, 15),
                     new cbc.h(ciz.tV, 3, 1, 15),
                     new cbc.h(ciz.ug, 3, 1, 15),
                     new cbc.h(ciz.tY, 3, 1, 15),
                     new cbc.h(ciz.uj, 3, 1, 15),
                     new cbc.h(ciz.ub, 3, 1, 15),
                     new cbc.h(ciz.ui, 3, 1, 15),
                     new cbc.h(ciz.ua, 3, 1, 15),
                     new cbc.h(ciz.uc, 3, 1, 15),
                     new cbc.h(ciz.uk, 3, 1, 15),
                     new cbc.h(ciz.uf, 3, 1, 15),
                     new cbc.h(ciz.tX, 3, 1, 15),
                     new cbc.h(ciz.ue, 3, 1, 15),
                     new cbc.h(ciz.uh, 3, 1, 15),
                     new cbc.h(ciz.tZ, 3, 1, 15),
                     new cbc.h(ciz.tW, 3, 1, 15),
                     new cbc.h(ciz.ud, 3, 1, 15)
                  },
                  5,
                  new cbc.f[]{new cbc.h(ciz.vg, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            cbb.f,
            a(
               ImmutableMap.of(
                  1,
                  new cbc.f[]{new cbc.b(ciz.rp, 32, 16, 2), new cbc.h(ciz.ll, 1, 2, 1)},
                  2,
                  new cbc.f[]{new cbc.b(ciz.nU, 3, 12, 10), new cbc.h(ciz.nM, 1, 1, 5)},
                  3,
                  new cbc.f[]{new cbc.b(ciz.tJ, 2, 12, 20), new cbc.h(csl.ed, 4, 1, 12, 10)},
                  4,
                  new cbc.f[]{new cbc.b(ciz.nD, 4, 12, 30), new cbc.b(ciz.rw, 9, 12, 30), new cbc.h(ciz.rq, 5, 1, 15)},
                  5,
                  new cbc.f[]{new cbc.b(ciz.ru, 22, 12, 30), new cbc.h(ciz.te, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            cbb.c,
            a(
               ImmutableMap.of(
                  1,
                  new cbc.f[]{
                     new cbc.b(ciz.nI, 15, 16, 2),
                     new cbc.h(new ciw(ciz.oU), 7, 1, 12, 1, 0.2F),
                     new cbc.h(new ciw(ciz.oV), 4, 1, 12, 1, 0.2F),
                     new cbc.h(new ciw(ciz.oS), 5, 1, 12, 1, 0.2F),
                     new cbc.h(new ciw(ciz.oT), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cbc.f[]{
                     new cbc.b(ciz.nQ, 4, 12, 10),
                     new cbc.h(new ciw(ciz.vs), 36, 1, 12, 5, 0.2F),
                     new cbc.h(new ciw(ciz.oR), 1, 1, 12, 5, 0.2F),
                     new cbc.h(new ciw(ciz.oQ), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new cbc.f[]{
                     new cbc.b(ciz.pM, 1, 12, 20),
                     new cbc.b(ciz.nK, 1, 12, 20),
                     new cbc.h(new ciw(ciz.oO), 1, 1, 12, 10, 0.2F),
                     new cbc.h(new ciw(ciz.oP), 4, 1, 12, 10, 0.2F),
                     new cbc.h(new ciw(ciz.uy), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new cbc.f[]{new cbc.e(ciz.oY, 14, 3, 15, 0.2F), new cbc.e(ciz.oZ, 8, 3, 15, 0.2F)},
                  5,
                  new cbc.f[]{new cbc.e(ciz.oW, 8, 3, 30, 0.2F), new cbc.e(ciz.oX, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cbb.p,
            a(
               ImmutableMap.of(
                  1,
                  new cbc.f[]{new cbc.b(ciz.nI, 15, 16, 2), new cbc.h(new ciw(ciz.op), 3, 1, 12, 1, 0.2F), new cbc.e(ciz.om, 2, 3, 1)},
                  2,
                  new cbc.f[]{new cbc.b(ciz.nQ, 4, 12, 10), new cbc.h(new ciw(ciz.vs), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cbc.f[]{new cbc.b(ciz.pi, 24, 12, 20)},
                  4,
                  new cbc.f[]{new cbc.b(ciz.nK, 1, 12, 30), new cbc.e(ciz.ou, 12, 3, 15, 0.2F)},
                  5,
                  new cbc.f[]{new cbc.e(ciz.or, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cbb.o,
            a(
               ImmutableMap.of(
                  1,
                  new cbc.f[]{
                     new cbc.b(ciz.nI, 15, 16, 2),
                     new cbc.h(new ciw(ciz.of), 1, 1, 12, 1, 0.2F),
                     new cbc.h(new ciw(ciz.od), 1, 1, 12, 1, 0.2F),
                     new cbc.h(new ciw(ciz.oe), 1, 1, 12, 1, 0.2F),
                     new cbc.h(new ciw(ciz.og), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cbc.f[]{new cbc.b(ciz.nQ, 4, 12, 10), new cbc.h(new ciw(ciz.vs), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cbc.f[]{
                     new cbc.b(ciz.pi, 30, 12, 20),
                     new cbc.e(ciz.op, 1, 3, 10, 0.2F),
                     new cbc.e(ciz.on, 2, 3, 10, 0.2F),
                     new cbc.e(ciz.oo, 3, 3, 10, 0.2F),
                     new cbc.h(new ciw(ciz.ov), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new cbc.f[]{new cbc.b(ciz.nK, 1, 12, 30), new cbc.e(ciz.ou, 12, 3, 15, 0.2F), new cbc.e(ciz.os, 5, 3, 15, 0.2F)},
                  5,
                  new cbc.f[]{new cbc.e(ciz.ot, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cbb.d,
            a(
               ImmutableMap.of(
                  1,
                  new cbc.f[]{new cbc.b(ciz.rn, 14, 16, 2), new cbc.b(ciz.pj, 7, 16, 2), new cbc.b(ciz.tG, 4, 16, 2), new cbc.h(ciz.tI, 1, 1, 1)},
                  2,
                  new cbc.f[]{new cbc.b(ciz.nI, 15, 16, 2), new cbc.h(ciz.pk, 1, 5, 16, 5), new cbc.h(ciz.ro, 1, 8, 16, 5)},
                  3,
                  new cbc.f[]{new cbc.b(ciz.tT, 7, 16, 20), new cbc.b(ciz.rl, 10, 16, 20)},
                  4,
                  new cbc.f[]{new cbc.b(ciz.pZ, 10, 12, 30)},
                  5,
                  new cbc.f[]{new cbc.b(ciz.vv, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            cbb.j,
            a(
               ImmutableMap.of(
                  1,
                  new cbc.f[]{new cbc.b(ciz.pP, 6, 16, 2), new cbc.a(ciz.oM, 3), new cbc.a(ciz.oL, 7)},
                  2,
                  new cbc.f[]{new cbc.b(ciz.pi, 26, 12, 10), new cbc.a(ciz.oK, 5, 12, 5), new cbc.a(ciz.oN, 4, 12, 5)},
                  3,
                  new cbc.f[]{new cbc.b(ciz.tK, 9, 12, 20), new cbc.a(ciz.oL, 7)},
                  4,
                  new cbc.f[]{new cbc.b(ciz.nD, 4, 12, 30), new cbc.a(ciz.tP, 6, 12, 15)},
                  5,
                  new cbc.f[]{new cbc.h(new ciw(ciz.mZ), 6, 1, 12, 30, 0.2F), new cbc.a(ciz.oK, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            cbb.l,
            a(
               ImmutableMap.of(
                  1,
                  new cbc.f[]{new cbc.b(ciz.pY, 10, 16, 2), new cbc.h(ciz.pX, 1, 10, 16, 1)},
                  2,
                  new cbc.f[]{new cbc.b(csl.b, 20, 16, 10), new cbc.h(csl.eL, 1, 4, 16, 5)},
                  3,
                  new cbc.f[]{
                     new cbc.b(csl.c, 16, 16, 20),
                     new cbc.b(csl.g, 16, 16, 20),
                     new cbc.b(csl.e, 16, 16, 20),
                     new cbc.h(csl.rt, 1, 4, 16, 10),
                     new cbc.h(csl.h, 1, 4, 16, 10),
                     new cbc.h(csl.f, 1, 4, 16, 10),
                     new cbc.h(csl.d, 1, 4, 16, 10)
                  },
                  4,
                  new cbc.f[]{
                     new cbc.b(ciz.nN, 12, 12, 30),
                     new cbc.h(csl.hk, 1, 1, 12, 15),
                     new cbc.h(csl.hj, 1, 1, 12, 15),
                     new cbc.h(csl.hu, 1, 1, 12, 15),
                     new cbc.h(csl.hm, 1, 1, 12, 15),
                     new cbc.h(csl.hq, 1, 1, 12, 15),
                     new cbc.h(csl.hr, 1, 1, 12, 15),
                     new cbc.h(csl.hy, 1, 1, 12, 15),
                     new cbc.h(csl.hx, 1, 1, 12, 15),
                     new cbc.h(csl.hp, 1, 1, 12, 15),
                     new cbc.h(csl.hl, 1, 1, 12, 15),
                     new cbc.h(csl.ho, 1, 1, 12, 15),
                     new cbc.h(csl.hw, 1, 1, 12, 15),
                     new cbc.h(csl.hs, 1, 1, 12, 15),
                     new cbc.h(csl.ht, 1, 1, 12, 15),
                     new cbc.h(csl.hn, 1, 1, 12, 15),
                     new cbc.h(csl.hv, 1, 1, 12, 15),
                     new cbc.h(csl.lh, 1, 1, 12, 15),
                     new cbc.h(csl.lg, 1, 1, 12, 15),
                     new cbc.h(csl.lr, 1, 1, 12, 15),
                     new cbc.h(csl.lj, 1, 1, 12, 15),
                     new cbc.h(csl.ln, 1, 1, 12, 15),
                     new cbc.h(csl.lo, 1, 1, 12, 15),
                     new cbc.h(csl.lv, 1, 1, 12, 15),
                     new cbc.h(csl.lu, 1, 1, 12, 15),
                     new cbc.h(csl.lm, 1, 1, 12, 15),
                     new cbc.h(csl.li, 1, 1, 12, 15),
                     new cbc.h(csl.ll, 1, 1, 12, 15),
                     new cbc.h(csl.lt, 1, 1, 12, 15),
                     new cbc.h(csl.lp, 1, 1, 12, 15),
                     new cbc.h(csl.lq, 1, 1, 12, 15),
                     new cbc.h(csl.lk, 1, 1, 12, 15),
                     new cbc.h(csl.ls, 1, 1, 12, 15)
                  },
                  5,
                  new cbc.f[]{new cbc.h(csl.hf, 1, 1, 12, 30), new cbc.h(csl.hd, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<cbc.f[]> b = a(
      ImmutableMap.of(
         1,
         new cbc.f[]{
            new cbc.h(ciz.cx, 2, 1, 5, 1),
            new cbc.h(ciz.qc, 4, 1, 5, 1),
            new cbc.h(ciz.eY, 2, 1, 5, 1),
            new cbc.h(ciz.uX, 5, 1, 5, 1),
            new cbc.h(ciz.cs, 1, 1, 12, 1),
            new cbc.h(ciz.dn, 1, 1, 8, 1),
            new cbc.h(ciz.eO, 1, 1, 4, 1),
            new cbc.h(ciz.do, 3, 1, 12, 1),
            new cbc.h(ciz.eA, 3, 1, 8, 1),
            new cbc.h(ciz.cO, 1, 1, 12, 1),
            new cbc.h(ciz.cP, 1, 1, 12, 1),
            new cbc.h(ciz.cQ, 1, 1, 8, 1),
            new cbc.h(ciz.cR, 1, 1, 12, 1),
            new cbc.h(ciz.cS, 1, 1, 12, 1),
            new cbc.h(ciz.cT, 1, 1, 12, 1),
            new cbc.h(ciz.cU, 1, 1, 12, 1),
            new cbc.h(ciz.cV, 1, 1, 12, 1),
            new cbc.h(ciz.cW, 1, 1, 12, 1),
            new cbc.h(ciz.cX, 1, 1, 12, 1),
            new cbc.h(ciz.cY, 1, 1, 12, 1),
            new cbc.h(ciz.cZ, 1, 1, 7, 1),
            new cbc.h(ciz.oH, 1, 1, 12, 1),
            new cbc.h(ciz.ur, 1, 1, 12, 1),
            new cbc.h(ciz.rj, 1, 1, 12, 1),
            new cbc.h(ciz.rk, 1, 1, 12, 1),
            new cbc.h(ciz.N, 5, 1, 8, 1),
            new cbc.h(ciz.L, 5, 1, 8, 1),
            new cbc.h(ciz.P, 5, 1, 8, 1),
            new cbc.h(ciz.M, 5, 1, 8, 1),
            new cbc.h(ciz.J, 5, 1, 8, 1),
            new cbc.h(ciz.K, 5, 1, 8, 1),
            new cbc.h(ciz.O, 5, 1, 8, 1),
            new cbc.h(ciz.Q, 5, 1, 8, 1),
            new cbc.h(ciz.qI, 1, 3, 12, 1),
            new cbc.h(ciz.qu, 1, 3, 12, 1),
            new cbc.h(ciz.qF, 1, 3, 12, 1),
            new cbc.h(ciz.qA, 1, 3, 12, 1),
            new cbc.h(ciz.qJ, 1, 3, 12, 1),
            new cbc.h(ciz.qH, 1, 3, 12, 1),
            new cbc.h(ciz.qC, 1, 3, 12, 1),
            new cbc.h(ciz.qw, 1, 3, 12, 1),
            new cbc.h(ciz.qy, 1, 3, 12, 1),
            new cbc.h(ciz.qB, 1, 3, 12, 1),
            new cbc.h(ciz.qE, 1, 3, 12, 1),
            new cbc.h(ciz.qx, 1, 3, 12, 1),
            new cbc.h(ciz.qz, 1, 3, 12, 1),
            new cbc.h(ciz.qv, 1, 3, 12, 1),
            new cbc.h(ciz.qG, 1, 3, 12, 1),
            new cbc.h(ciz.qD, 1, 3, 12, 1),
            new cbc.h(ciz.kb, 3, 1, 8, 1),
            new cbc.h(ciz.kc, 3, 1, 8, 1),
            new cbc.h(ciz.kd, 3, 1, 8, 1),
            new cbc.h(ciz.ke, 3, 1, 8, 1),
            new cbc.h(ciz.ka, 3, 1, 8, 1),
            new cbc.h(ciz.fz, 1, 1, 12, 1),
            new cbc.h(ciz.de, 1, 1, 12, 1),
            new cbc.h(ciz.df, 1, 1, 12, 1),
            new cbc.h(ciz.fF, 1, 2, 5, 1),
            new cbc.h(ciz.du, 1, 2, 5, 1),
            new cbc.h(ciz.S, 1, 8, 8, 1),
            new cbc.h(ciz.V, 1, 4, 6, 1),
            new cbc.h(ciz.wp, 1, 2, 5, 1),
            new cbc.h(ciz.s, 1, 2, 5, 1),
            new cbc.h(ciz.dr, 1, 2, 5, 1)
         },
         2,
         new cbc.f[]{
            new cbc.h(ciz.pU, 5, 1, 4, 1),
            new cbc.h(ciz.pR, 5, 1, 4, 1),
            new cbc.h(ciz.hz, 3, 1, 6, 1),
            new cbc.h(ciz.kz, 6, 1, 6, 1),
            new cbc.h(ciz.oG, 1, 1, 8, 1),
            new cbc.h(ciz.r, 3, 3, 6, 1)
         }
      )
   );
   public static final Map<cbb, Int2ObjectMap<cbc.f[]>> c = Map.of(
      cbb.k,
      a(
         ImmutableMap.builder()
            .put(1, new cbc.f[]{new cbc.b(ciz.qa, 24, 16, 2), a(1), new cbc.h(csl.cl, 9, 1, 12, 1)})
            .put(2, new cbc.f[]{new cbc.b(ciz.qb, 4, 12, 10), a(5), new cbc.h(ciz.vt, 1, 1, 5)})
            .put(3, new cbc.f[]{new cbc.b(ciz.qr, 5, 12, 20), a(10), new cbc.h(ciz.ck, 1, 4, 10)})
            .put(4, new cbc.f[]{new cbc.b(ciz.tg, 2, 12, 30), new cbc.h(ciz.qi, 5, 1, 15), new cbc.h(ciz.qe, 4, 1, 15)})
            .put(5, new cbc.f[]{a(), new cbc.h(ciz.tR, 20, 1, 30)})
            .build()
      )
   );
   public static final List<Pair<cbc.f[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new cbc.f[]{
               new cbc.b(a(ckw.c), 1, 1, 1),
               new cbc.b(ciz.pL, 1, 1, 1, 2),
               new cbc.b(ciz.pQ, 1, 1, 1, 2),
               new cbc.b(ciz.ry, 1, 1, 1, 3),
               new cbc.b(ciz.tn, 4, 1, 1),
               new cbc.b(ciz.hh, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cbc.f[]{
               new cbc.h(ciz.hz, 1, 1, 6, 1),
               new cbc.h(ciz.kz, 6, 1, 6, 1),
               new cbc.h(ciz.oG, 1, 4, 2, 1),
               new cbc.h(ciz.r, 3, 3, 6, 1),
               new cbc.h(csl.Y, 1, 8, 4, 1),
               new cbc.h(csl.W, 1, 8, 4, 1),
               new cbc.h(csl.aa, 1, 8, 4, 1),
               new cbc.h(csl.X, 1, 8, 4, 1),
               new cbc.h(csl.U, 1, 8, 4, 1),
               new cbc.h(csl.V, 1, 8, 4, 1),
               new cbc.h(csl.Z, 1, 8, 4, 1),
               new cbc.e(ciz.oo, 1, 1, 1, 0.2F),
               new cbc.h(a(ckw.j), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cbc.f[]{
               new cbc.h(ciz.pU, 3, 1, 4, 1),
               new cbc.h(ciz.pR, 3, 1, 4, 1),
               new cbc.h(ciz.cx, 2, 1, 5, 1),
               new cbc.h(ciz.qc, 4, 1, 5, 1),
               new cbc.h(ciz.eY, 2, 1, 5, 1),
               new cbc.h(ciz.uX, 5, 1, 5, 1),
               new cbc.h(ciz.cs, 1, 1, 12, 1),
               new cbc.h(ciz.dn, 1, 1, 8, 1),
               new cbc.h(ciz.eO, 1, 1, 4, 1),
               new cbc.h(ciz.do, 3, 1, 12, 1),
               new cbc.h(ciz.eA, 3, 1, 8, 1),
               new cbc.h(ciz.cO, 1, 1, 12, 1),
               new cbc.h(ciz.cP, 1, 1, 12, 1),
               new cbc.h(ciz.cQ, 1, 1, 8, 1),
               new cbc.h(ciz.cR, 1, 1, 12, 1),
               new cbc.h(ciz.cS, 1, 1, 12, 1),
               new cbc.h(ciz.cT, 1, 1, 12, 1),
               new cbc.h(ciz.cU, 1, 1, 12, 1),
               new cbc.h(ciz.cV, 1, 1, 12, 1),
               new cbc.h(ciz.cW, 1, 1, 12, 1),
               new cbc.h(ciz.cX, 1, 1, 12, 1),
               new cbc.h(ciz.cY, 1, 1, 12, 1),
               new cbc.h(ciz.cZ, 1, 1, 7, 1),
               new cbc.h(ciz.oH, 1, 1, 12, 1),
               new cbc.h(ciz.ur, 1, 1, 12, 1),
               new cbc.h(ciz.rj, 1, 1, 12, 1),
               new cbc.h(ciz.rk, 1, 1, 12, 1),
               new cbc.h(ciz.N, 5, 1, 8, 1),
               new cbc.h(ciz.L, 5, 1, 8, 1),
               new cbc.h(ciz.P, 5, 1, 8, 1),
               new cbc.h(ciz.M, 5, 1, 8, 1),
               new cbc.h(ciz.J, 5, 1, 8, 1),
               new cbc.h(ciz.K, 5, 1, 8, 1),
               new cbc.h(ciz.O, 5, 1, 8, 1),
               new cbc.h(ciz.Q, 5, 1, 8, 1),
               new cbc.h(ciz.qI, 1, 3, 12, 1),
               new cbc.h(ciz.qu, 1, 3, 12, 1),
               new cbc.h(ciz.qF, 1, 3, 12, 1),
               new cbc.h(ciz.qA, 1, 3, 12, 1),
               new cbc.h(ciz.qJ, 1, 3, 12, 1),
               new cbc.h(ciz.qH, 1, 3, 12, 1),
               new cbc.h(ciz.qC, 1, 3, 12, 1),
               new cbc.h(ciz.qw, 1, 3, 12, 1),
               new cbc.h(ciz.qy, 1, 3, 12, 1),
               new cbc.h(ciz.qB, 1, 3, 12, 1),
               new cbc.h(ciz.qE, 1, 3, 12, 1),
               new cbc.h(ciz.qx, 1, 3, 12, 1),
               new cbc.h(ciz.qz, 1, 3, 12, 1),
               new cbc.h(ciz.qv, 1, 3, 12, 1),
               new cbc.h(ciz.qG, 1, 3, 12, 1),
               new cbc.h(ciz.qD, 1, 3, 12, 1),
               new cbc.h(ciz.kb, 3, 1, 8, 1),
               new cbc.h(ciz.kc, 3, 1, 8, 1),
               new cbc.h(ciz.kd, 3, 1, 8, 1),
               new cbc.h(ciz.ke, 3, 1, 8, 1),
               new cbc.h(ciz.ka, 3, 1, 8, 1),
               new cbc.h(ciz.fz, 1, 3, 4, 1),
               new cbc.h(ciz.de, 1, 3, 4, 1),
               new cbc.h(ciz.df, 1, 3, 4, 1),
               new cbc.h(ciz.fF, 1, 5, 2, 1),
               new cbc.h(ciz.du, 1, 2, 5, 1),
               new cbc.h(ciz.S, 1, 8, 8, 1),
               new cbc.h(ciz.V, 1, 4, 6, 1),
               new cbc.h(ciz.wp, 1, 2, 5, 1),
               new cbc.h(ciz.s, 1, 2, 5, 1),
               new cbc.h(ciz.dr, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static cbc.f a(int $$0) {
      return new cbc.l(
         ImmutableMap.builder()
            .put(cbd.a, new cbc.d($$0, cnh.b, cnh.h, cnh.B))
            .put(cbd.b, new cbc.d($$0, cnh.c, cnh.e, cnh.y))
            .put(cbd.c, new cbc.d($$0, cnh.z, cnh.o, cnh.p))
            .put(cbd.d, new cbc.d($$0, cnh.q, cnh.k, cnh.t))
            .put(cbd.e, new cbc.d($$0, cnh.g, cnh.s, cnh.j))
            .put(cbd.f, new cbc.d($$0, cnh.i, cnh.f, cnh.M))
            .put(cbd.g, new cbc.d($$0, cnh.d, cnh.r, cnh.A))
            .build()
      );
   }

   private static cbc.f a() {
      return new cbc.l(
         ImmutableMap.builder()
            .put(cbd.a, new cbc.d(30, 3, 3, cnh.u))
            .put(cbd.b, new cbc.d(30, 2, 2, cnh.w))
            .put(cbd.c, new cbc.d(30, 3, 3, cnh.a))
            .put(cbd.d, new cbc.d(30, 3, 3, cnh.n))
            .put(cbd.e, new cbc.d(30, cnh.v))
            .put(cbd.f, new cbc.d(30, cnh.L))
            .put(cbd.g, new cbc.d(30, 2, 2, cnh.x))
            .build()
      );
   }

   private static Int2ObjectMap<cbc.f[]> a(ImmutableMap<Integer, cbc.f[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static ciw a(ckt $$0) {
      return ckv.a(new ciw(ciz.rv), $$0);
   }

   static class a implements cbc.f {
      private final cir a;
      private final int b;
      private final int c;
      private final int d;

      public a(cir $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(cir $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public coh a(big $$0, art $$1) {
         ciw $$2 = new ciw(ciz.nL, this.b);
         ciw $$3 = new ciw(this.a);
         if (this.a instanceof chm) {
            List<chl> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = cho.a($$3, $$4);
         }

         return new coh($$2, $$3, this.c, this.d, 0.2F);
      }

      private static chl a(art $$0) {
         return chl.a(chk.a($$0.a(16)));
      }
   }

   static class b implements cbc.f {
      private final ciw a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(cpj $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(cpj $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new ciw($$0.k(), $$1), $$2, $$3, $$4);
      }

      public b(ciw $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public coh a(big $$0, art $$1) {
         return new coh(this.a.p(), new ciw(ciz.nL, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements cbc.f {
      private final Map<cbd, cir> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<cbd, cir> $$3) {
         jc.z.s().filter($$1x -> !$$3.containsKey($$1x)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + jc.z.b($$0x));
         });
         this.a = $$3;
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Nullable
      @Override
      public coh a(big $$0, art $$1) {
         if ($$0 instanceof cba $$2) {
            ciw $$3 = new ciw(this.a.get($$2.gk().a()), this.b);
            return new coh($$3, new ciw(ciz.nL), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements cbc.f {
      private final int a;
      private final List<cnd> b;
      private final int c;
      private final int d;

      public d(int $$0) {
         this($$0, jc.g.s().filter(cnd::h).toArray(cnd[]::new));
      }

      public d(int $$0, cnd... $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, cnd... $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = Arrays.asList($$3);
      }

      @Override
      public coh a(big $$0, art $$1) {
         cnd $$2 = this.b.get($$1.a(this.b.size()));
         int $$3 = Math.max($$2.e(), this.c);
         int $$4 = Math.min($$2.a(), this.d);
         int $$5 = aro.a($$1, $$3, $$4);
         ciw $$6 = chs.a(new cng($$2, $$5));
         int $$7 = 2 + $$1.a(5 + $$5 * 10) + 3 * $$5;
         if ($$2.b()) {
            $$7 *= 2;
         }

         if ($$7 > 64) {
            $$7 = 64;
         }

         return new coh(new ciw(ciz.nL, $$7), new ciw(ciz.qb), $$6, 12, this.a, 0.2F);
      }
   }

   static class e implements cbc.f {
      private final ciw a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(cir $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(cir $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new ciw($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public coh a(big $$0, art $$1) {
         int $$2 = 5 + $$1.a(15);
         ciw $$3 = cnf.a($$1, new ciw(this.a.d()), $$2, false);
         int $$4 = Math.min(this.b + $$2, 64);
         ciw $$5 = new ciw(ciz.nL, $$4);
         return new coh($$5, $$3, this.c, this.d, this.e);
      }
   }

   public interface f {
      @Nullable
      coh a(big var1, art var2);
   }

   static class g implements cbc.f {
      private final ciw a;
      private final int b;
      private final int c;
      private final ciw d;
      private final int e;
      private final int f;
      private final int g;
      private final float h;

      public g(cpj $$0, int $$1, cir $$2, int $$3, int $$4, int $$5) {
         this($$0, $$1, 1, $$2, $$3, $$4, $$5);
      }

      public g(cpj $$0, int $$1, int $$2, cir $$3, int $$4, int $$5, int $$6) {
         this.a = new ciw($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = new ciw($$3);
         this.e = $$4;
         this.f = $$5;
         this.g = $$6;
         this.h = 0.05F;
      }

      @Nullable
      @Override
      public coh a(big $$0, art $$1) {
         return new coh(new ciw(ciz.nL, this.c), new ciw(this.a.d(), this.b), new ciw(this.d.d(), this.e), this.f, this.g, this.h);
      }
   }

   static class h implements cbc.f {
      private final ciw a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public h(csk $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new ciw($$0), $$1, $$2, $$3, $$4);
      }

      public h(cir $$0, int $$1, int $$2, int $$3) {
         this(new ciw($$0), $$1, $$2, 12, $$3);
      }

      public h(cir $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new ciw($$0), $$1, $$2, $$3, $$4);
      }

      public h(ciw $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public h(ciw $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.a.f($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
      }

      @Override
      public coh a(big $$0, art $$1) {
         return new coh(new ciw(ciz.nL, this.b), this.a.p(), this.c, this.d, this.e);
      }
   }

   static class i implements cbc.f {
      final bhr a;
      final int b;
      final int c;
      private final float d;

      public i(bhr $$0, int $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = 0.05F;
      }

      @Nullable
      @Override
      public coh a(big $$0, art $$1) {
         ciw $$2 = new ciw(ciz.va, 1);
         ckg.a($$2, this.a, this.b);
         return new coh(new ciw(ciz.nL, 1), $$2, 12, this.c, this.d);
      }
   }

   static class j implements cbc.f {
      private final ciw a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final cir f;
      private final int g;
      private final float h;

      public j(cir $$0, int $$1, cir $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new ciw($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public coh a(big $$0, art $$1) {
         ciw $$2 = new ciw(ciz.nL, this.c);
         List<ckt> $$3 = jc.j.s().filter($$0x -> !$$0x.a().isEmpty() && cku.a($$0x)).collect(Collectors.toList());
         ckt $$4 = $$3.get($$1.a($$3.size()));
         ciw $$5 = ckv.a(new ciw(this.a.d(), this.b), $$4);
         return new coh($$2, new ciw(this.f, this.g), $$5, this.d, this.e, this.h);
      }
   }

   static class k implements cbc.f {
      private final int a;
      private final apy<dux> b;
      private final String c;
      private final ebi.a d;
      private final int e;
      private final int f;

      public k(int $$0, apy<dux> $$1, String $$2, ebi.a $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public coh a(big $$0, art $$1) {
         if (!($$0.dK() instanceof aki)) {
            return null;
         } else {
            aki $$2 = (aki)$$0.dK();
            gv $$3 = $$2.a(this.b, $$0.dk(), 100, true);
            if ($$3 != null) {
               ciw $$4 = cjd.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               cjd.a($$2, $$4);
               ebl.a($$4, $$3, "+", this.d);
               $$4.a(te.c(this.c));
               return new coh(new ciw(ciz.nL, this.a), new ciw(ciz.qe), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static class l implements cbc.f {
      private final Map<cbd, cbc.f> a;

      public l(Map<cbd, cbc.f> $$0) {
         jc.z.s().filter($$1 -> !$$0.containsKey($$1)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + jc.z.b($$0x));
         });
         this.a = $$0;
      }

      @Nullable
      @Override
      public coh a(big $$0, art $$1) {
         if ($$0 instanceof cba $$2) {
            cbd $$3 = $$2.gk().a();
            return this.a.get($$3).a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
