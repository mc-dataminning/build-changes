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

public class cbr {
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
   public static final Map<cbq, Int2ObjectMap<cbr.g[]>> a = ac.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            cbq.g,
            a(
               ImmutableMap.of(
                  1,
                  new cbr.g[]{
                     new cbr.b(cjo.oI, 20, 16, 2),
                     new cbr.b(cjo.tm, 26, 16, 2),
                     new cbr.b(cjo.tl, 22, 16, 2),
                     new cbr.b(cjo.uq, 15, 16, 2),
                     new cbr.i(cjo.oJ, 1, 6, 16, 1)
                  },
                  2,
                  new cbr.g[]{new cbr.b(cte.eZ, 6, 12, 10), new cbr.i(cjo.tz, 1, 4, 5), new cbr.i(cjo.nF, 1, 4, 16, 5)},
                  3,
                  new cbr.g[]{new cbr.i(cjo.re, 3, 18, 10), new cbr.b(cte.fa, 4, 12, 20)},
                  4,
                  new cbr.g[]{
                     new cbr.i(cte.eg, 1, 1, 12, 15),
                     new cbr.j(bil.p, 100, 15),
                     new cbr.j(bil.h, 160, 15),
                     new cbr.j(bil.r, 140, 15),
                     new cbr.j(bil.o, 120, 15),
                     new cbr.j(bil.s, 280, 15),
                     new cbr.j(bil.w, 7, 15)
                  },
                  5,
                  new cbr.g[]{new cbr.i(cjo.tq, 3, 3, 30), new cbr.i(cjo.rE, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            cbq.h,
            a(
               ImmutableMap.of(
                  1,
                  new cbr.g[]{
                     new cbr.b(cjo.oE, 20, 16, 2),
                     new cbr.b(cjo.nI, 10, 16, 2),
                     new cbr.h(cjo.ql, 6, 1, cjo.qp, 6, 16, 1, 0.05F),
                     new cbr.i(cjo.pT, 3, 1, 16, 1)
                  },
                  2,
                  new cbr.g[]{new cbr.b(cjo.ql, 15, 16, 10), new cbr.h(cjo.qm, 6, 1, cjo.qq, 6, 16, 5, 0.05F), new cbr.i(cjo.vx, 2, 1, 5)},
                  3,
                  new cbr.g[]{new cbr.b(cjo.qm, 13, 16, 20), new cbr.e(cjo.qh, 3, 3, 10, 0.2F)},
                  4,
                  new cbr.g[]{new cbr.b(cjo.qn, 6, 12, 30)},
                  5,
                  new cbr.g[]{
                     new cbr.b(cjo.qo, 4, 12, 30),
                     new cbr.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(cbs.c, cjo.ni)
                           .put(cbs.g, cjo.nk)
                           .put(cbs.e, cjo.nk)
                           .put(cbs.a, cjo.no)
                           .put(cbs.b, cjo.no)
                           .put(cbs.d, cjo.nq)
                           .put(cbs.f, cjo.nu)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            cbq.n,
            a(
               ImmutableMap.of(
                  1,
                  new cbr.g[]{
                     new cbr.b(cte.bA, 18, 16, 2),
                     new cbr.b(cte.bM, 18, 16, 2),
                     new cbr.b(cte.bP, 18, 16, 2),
                     new cbr.b(cte.bH, 18, 16, 2),
                     new cbr.i(cjo.rg, 2, 1, 1)
                  },
                  2,
                  new cbr.g[]{
                     new cbr.b(cjo.qu, 12, 16, 10),
                     new cbr.b(cjo.qB, 12, 16, 10),
                     new cbr.b(cjo.qJ, 12, 16, 10),
                     new cbr.b(cjo.qx, 12, 16, 10),
                     new cbr.b(cjo.qz, 12, 16, 10),
                     new cbr.i(cte.bA, 1, 1, 16, 5),
                     new cbr.i(cte.bB, 1, 1, 16, 5),
                     new cbr.i(cte.bC, 1, 1, 16, 5),
                     new cbr.i(cte.bD, 1, 1, 16, 5),
                     new cbr.i(cte.bE, 1, 1, 16, 5),
                     new cbr.i(cte.bF, 1, 1, 16, 5),
                     new cbr.i(cte.bG, 1, 1, 16, 5),
                     new cbr.i(cte.bH, 1, 1, 16, 5),
                     new cbr.i(cte.bI, 1, 1, 16, 5),
                     new cbr.i(cte.bJ, 1, 1, 16, 5),
                     new cbr.i(cte.bK, 1, 1, 16, 5),
                     new cbr.i(cte.bL, 1, 1, 16, 5),
                     new cbr.i(cte.bM, 1, 1, 16, 5),
                     new cbr.i(cte.bN, 1, 1, 16, 5),
                     new cbr.i(cte.bO, 1, 1, 16, 5),
                     new cbr.i(cte.bP, 1, 1, 16, 5),
                     new cbr.i(cte.ik, 1, 4, 16, 5),
                     new cbr.i(cte.il, 1, 4, 16, 5),
                     new cbr.i(cte.im, 1, 4, 16, 5),
                     new cbr.i(cte.in, 1, 4, 16, 5),
                     new cbr.i(cte.io, 1, 4, 16, 5),
                     new cbr.i(cte.ip, 1, 4, 16, 5),
                     new cbr.i(cte.iq, 1, 4, 16, 5),
                     new cbr.i(cte.ir, 1, 4, 16, 5),
                     new cbr.i(cte.is, 1, 4, 16, 5),
                     new cbr.i(cte.it, 1, 4, 16, 5),
                     new cbr.i(cte.iu, 1, 4, 16, 5),
                     new cbr.i(cte.iv, 1, 4, 16, 5),
                     new cbr.i(cte.iw, 1, 4, 16, 5),
                     new cbr.i(cte.ix, 1, 4, 16, 5),
                     new cbr.i(cte.iy, 1, 4, 16, 5),
                     new cbr.i(cte.iz, 1, 4, 16, 5)
                  },
                  3,
                  new cbr.g[]{
                     new cbr.b(cjo.qy, 12, 16, 20),
                     new cbr.b(cjo.qC, 12, 16, 20),
                     new cbr.b(cjo.qv, 12, 16, 20),
                     new cbr.b(cjo.qI, 12, 16, 20),
                     new cbr.b(cjo.qA, 12, 16, 20),
                     new cbr.i(cte.aZ, 3, 1, 12, 10),
                     new cbr.i(cte.bd, 3, 1, 12, 10),
                     new cbr.i(cte.bn, 3, 1, 12, 10),
                     new cbr.i(cte.bo, 3, 1, 12, 10),
                     new cbr.i(cte.bk, 3, 1, 12, 10),
                     new cbr.i(cte.bl, 3, 1, 12, 10),
                     new cbr.i(cte.bi, 3, 1, 12, 10),
                     new cbr.i(cte.bg, 3, 1, 12, 10),
                     new cbr.i(cte.bm, 3, 1, 12, 10),
                     new cbr.i(cte.bc, 3, 1, 12, 10),
                     new cbr.i(cte.bh, 3, 1, 12, 10),
                     new cbr.i(cte.be, 3, 1, 12, 10),
                     new cbr.i(cte.bb, 3, 1, 12, 10),
                     new cbr.i(cte.ba, 3, 1, 12, 10),
                     new cbr.i(cte.bf, 3, 1, 12, 10),
                     new cbr.i(cte.bj, 3, 1, 12, 10)
                  },
                  4,
                  new cbr.g[]{
                     new cbr.b(cjo.qG, 12, 16, 30),
                     new cbr.b(cjo.qE, 12, 16, 30),
                     new cbr.b(cjo.qF, 12, 16, 30),
                     new cbr.b(cjo.qH, 12, 16, 30),
                     new cbr.b(cjo.qw, 12, 16, 30),
                     new cbr.b(cjo.qD, 12, 16, 30),
                     new cbr.i(cjo.tV, 3, 1, 12, 15),
                     new cbr.i(cjo.ug, 3, 1, 12, 15),
                     new cbr.i(cjo.tY, 3, 1, 12, 15),
                     new cbr.i(cjo.uj, 3, 1, 12, 15),
                     new cbr.i(cjo.ub, 3, 1, 12, 15),
                     new cbr.i(cjo.ui, 3, 1, 12, 15),
                     new cbr.i(cjo.ua, 3, 1, 12, 15),
                     new cbr.i(cjo.uc, 3, 1, 12, 15),
                     new cbr.i(cjo.uk, 3, 1, 12, 15),
                     new cbr.i(cjo.uf, 3, 1, 12, 15),
                     new cbr.i(cjo.tX, 3, 1, 12, 15),
                     new cbr.i(cjo.ue, 3, 1, 12, 15),
                     new cbr.i(cjo.uh, 3, 1, 12, 15),
                     new cbr.i(cjo.tZ, 3, 1, 12, 15),
                     new cbr.i(cjo.tW, 3, 1, 12, 15),
                     new cbr.i(cjo.ud, 3, 1, 12, 15)
                  },
                  5,
                  new cbr.g[]{new cbr.i(cjo.pl, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            cbq.i,
            a(
               ImmutableMap.of(
                  1,
                  new cbr.g[]{new cbr.b(cjo.oB, 32, 16, 2), new cbr.i(cjo.nH, 1, 16, 1), new cbr.h(cte.L, 10, 1, cjo.pi, 10, 12, 1, 0.05F)},
                  2,
                  new cbr.g[]{new cbr.b(cjo.pi, 26, 12, 10), new cbr.i(cjo.nG, 2, 1, 5)},
                  3,
                  new cbr.g[]{new cbr.b(cjo.oE, 14, 16, 20), new cbr.i(cjo.uZ, 3, 1, 10)},
                  4,
                  new cbr.g[]{new cbr.b(cjo.oF, 24, 16, 30), new cbr.e(cjo.nG, 2, 3, 15)},
                  5,
                  new cbr.g[]{new cbr.b(cjo.lF, 8, 12, 30), new cbr.e(cjo.uZ, 3, 3, 15), new cbr.k(cjo.nH, 5, cjo.uw, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            cbq.k,
            a(
               ImmutableMap.builder()
                  .put(1, new cbr.g[]{new cbr.b(cjo.qa, 24, 16, 2), new cbr.d(1), new cbr.i(cte.cl, 9, 1, 12, 1)})
                  .put(2, new cbr.g[]{new cbr.b(cjo.qb, 4, 12, 10), new cbr.d(5), new cbr.i(cjo.vt, 1, 1, 5)})
                  .put(3, new cbr.g[]{new cbr.b(cjo.qr, 5, 12, 20), new cbr.d(10), new cbr.i(cjo.ck, 1, 4, 10)})
                  .put(4, new cbr.g[]{new cbr.b(cjo.tg, 2, 12, 30), new cbr.d(15), new cbr.i(cjo.qi, 5, 1, 15), new cbr.i(cjo.qe, 4, 1, 15)})
                  .put(5, new cbr.g[]{new cbr.i(cjo.tR, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            cbq.e,
            a(
               ImmutableMap.of(
                  1,
                  new cbr.g[]{new cbr.b(cjo.qa, 24, 16, 2), new cbr.i(cjo.tp, 7, 1, 1)},
                  2,
                  new cbr.g[]{new cbr.b(cjo.fx, 11, 16, 10), new cbr.l(13, aqg.d, "filled_map.monument", ebn.a.j, 12, 5)},
                  3,
                  new cbr.g[]{new cbr.b(cjo.qe, 1, 12, 20), new cbr.l(14, aqg.c, "filled_map.mansion", ebn.a.i, 12, 10)},
                  4,
                  new cbr.g[]{
                     new cbr.i(cjo.ti, 7, 1, 15),
                     new cbr.i(cjo.tV, 3, 1, 15),
                     new cbr.i(cjo.ug, 3, 1, 15),
                     new cbr.i(cjo.tY, 3, 1, 15),
                     new cbr.i(cjo.uj, 3, 1, 15),
                     new cbr.i(cjo.ub, 3, 1, 15),
                     new cbr.i(cjo.ui, 3, 1, 15),
                     new cbr.i(cjo.ua, 3, 1, 15),
                     new cbr.i(cjo.uc, 3, 1, 15),
                     new cbr.i(cjo.uk, 3, 1, 15),
                     new cbr.i(cjo.uf, 3, 1, 15),
                     new cbr.i(cjo.tX, 3, 1, 15),
                     new cbr.i(cjo.ue, 3, 1, 15),
                     new cbr.i(cjo.uh, 3, 1, 15),
                     new cbr.i(cjo.tZ, 3, 1, 15),
                     new cbr.i(cjo.tW, 3, 1, 15),
                     new cbr.i(cjo.ud, 3, 1, 15)
                  },
                  5,
                  new cbr.g[]{new cbr.i(cjo.vg, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            cbq.f,
            a(
               ImmutableMap.of(
                  1,
                  new cbr.g[]{new cbr.b(cjo.rp, 32, 16, 2), new cbr.i(cjo.ll, 1, 2, 1)},
                  2,
                  new cbr.g[]{new cbr.b(cjo.nU, 3, 12, 10), new cbr.i(cjo.nM, 1, 1, 5)},
                  3,
                  new cbr.g[]{new cbr.b(cjo.tJ, 2, 12, 20), new cbr.i(cte.ec, 4, 1, 12, 10)},
                  4,
                  new cbr.g[]{new cbr.b(cjo.nD, 4, 12, 30), new cbr.b(cjo.rw, 9, 12, 30), new cbr.i(cjo.rq, 5, 1, 15)},
                  5,
                  new cbr.g[]{new cbr.b(cjo.ru, 22, 12, 30), new cbr.i(cjo.te, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            cbq.c,
            a(
               ImmutableMap.of(
                  1,
                  new cbr.g[]{
                     new cbr.b(cjo.nI, 15, 16, 2),
                     new cbr.i(new cjl(cjo.oU), 7, 1, 12, 1, 0.2F),
                     new cbr.i(new cjl(cjo.oV), 4, 1, 12, 1, 0.2F),
                     new cbr.i(new cjl(cjo.oS), 5, 1, 12, 1, 0.2F),
                     new cbr.i(new cjl(cjo.oT), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cbr.g[]{
                     new cbr.b(cjo.nQ, 4, 12, 10),
                     new cbr.i(new cjl(cjo.vs), 36, 1, 12, 5, 0.2F),
                     new cbr.i(new cjl(cjo.oR), 1, 1, 12, 5, 0.2F),
                     new cbr.i(new cjl(cjo.oQ), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new cbr.g[]{
                     new cbr.b(cjo.pM, 1, 12, 20),
                     new cbr.b(cjo.nK, 1, 12, 20),
                     new cbr.i(new cjl(cjo.oO), 1, 1, 12, 10, 0.2F),
                     new cbr.i(new cjl(cjo.oP), 4, 1, 12, 10, 0.2F),
                     new cbr.i(new cjl(cjo.uy), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new cbr.g[]{new cbr.e(cjo.oY, 14, 3, 15, 0.2F), new cbr.e(cjo.oZ, 8, 3, 15, 0.2F)},
                  5,
                  new cbr.g[]{new cbr.e(cjo.oW, 8, 3, 30, 0.2F), new cbr.e(cjo.oX, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cbq.p,
            a(
               ImmutableMap.of(
                  1,
                  new cbr.g[]{new cbr.b(cjo.nI, 15, 16, 2), new cbr.i(new cjl(cjo.op), 3, 1, 12, 1, 0.2F), new cbr.e(cjo.om, 2, 3, 1)},
                  2,
                  new cbr.g[]{new cbr.b(cjo.nQ, 4, 12, 10), new cbr.i(new cjl(cjo.vs), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cbr.g[]{new cbr.b(cjo.pi, 24, 12, 20)},
                  4,
                  new cbr.g[]{new cbr.b(cjo.nK, 1, 12, 30), new cbr.e(cjo.ou, 12, 3, 15, 0.2F)},
                  5,
                  new cbr.g[]{new cbr.e(cjo.or, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cbq.o,
            a(
               ImmutableMap.of(
                  1,
                  new cbr.g[]{
                     new cbr.b(cjo.nI, 15, 16, 2),
                     new cbr.i(new cjl(cjo.of), 1, 1, 12, 1, 0.2F),
                     new cbr.i(new cjl(cjo.od), 1, 1, 12, 1, 0.2F),
                     new cbr.i(new cjl(cjo.oe), 1, 1, 12, 1, 0.2F),
                     new cbr.i(new cjl(cjo.og), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cbr.g[]{new cbr.b(cjo.nQ, 4, 12, 10), new cbr.i(new cjl(cjo.vs), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cbr.g[]{
                     new cbr.b(cjo.pi, 30, 12, 20),
                     new cbr.e(cjo.op, 1, 3, 10, 0.2F),
                     new cbr.e(cjo.on, 2, 3, 10, 0.2F),
                     new cbr.e(cjo.oo, 3, 3, 10, 0.2F),
                     new cbr.i(new cjl(cjo.ov), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new cbr.g[]{new cbr.b(cjo.nK, 1, 12, 30), new cbr.e(cjo.ou, 12, 3, 15, 0.2F), new cbr.e(cjo.os, 5, 3, 15, 0.2F)},
                  5,
                  new cbr.g[]{new cbr.e(cjo.ot, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cbq.d,
            a(
               ImmutableMap.of(
                  1,
                  new cbr.g[]{new cbr.b(cjo.rn, 14, 16, 2), new cbr.b(cjo.pj, 7, 16, 2), new cbr.b(cjo.tG, 4, 16, 2), new cbr.i(cjo.tI, 1, 1, 1)},
                  2,
                  new cbr.g[]{new cbr.b(cjo.nI, 15, 16, 2), new cbr.i(cjo.pk, 1, 5, 16, 5), new cbr.i(cjo.ro, 1, 8, 16, 5)},
                  3,
                  new cbr.g[]{new cbr.b(cjo.tT, 7, 16, 20), new cbr.b(cjo.rl, 10, 16, 20)},
                  4,
                  new cbr.g[]{new cbr.b(cjo.pZ, 10, 12, 30)},
                  5,
                  new cbr.g[]{new cbr.b(cjo.vv, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            cbq.j,
            a(
               ImmutableMap.of(
                  1,
                  new cbr.g[]{new cbr.b(cjo.pP, 6, 16, 2), new cbr.a(cjo.oM, 3), new cbr.a(cjo.oL, 7)},
                  2,
                  new cbr.g[]{new cbr.b(cjo.pi, 26, 12, 10), new cbr.a(cjo.oK, 5, 12, 5), new cbr.a(cjo.oN, 4, 12, 5)},
                  3,
                  new cbr.g[]{new cbr.b(cjo.tK, 9, 12, 20), new cbr.a(cjo.oL, 7)},
                  4,
                  new cbr.g[]{new cbr.b(cjo.nD, 4, 12, 30), new cbr.a(cjo.tP, 6, 12, 15)},
                  5,
                  new cbr.g[]{new cbr.i(new cjl(cjo.mZ), 6, 1, 12, 30, 0.2F), new cbr.a(cjo.oK, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            cbq.l,
            a(
               ImmutableMap.of(
                  1,
                  new cbr.g[]{new cbr.b(cjo.pY, 10, 16, 2), new cbr.i(cjo.pX, 1, 10, 16, 1)},
                  2,
                  new cbr.g[]{new cbr.b(cte.b, 20, 16, 10), new cbr.i(cte.eK, 1, 4, 16, 5)},
                  3,
                  new cbr.g[]{
                     new cbr.b(cte.c, 16, 16, 20),
                     new cbr.b(cte.g, 16, 16, 20),
                     new cbr.b(cte.e, 16, 16, 20),
                     new cbr.i(cte.rt, 1, 4, 16, 10),
                     new cbr.i(cte.h, 1, 4, 16, 10),
                     new cbr.i(cte.f, 1, 4, 16, 10),
                     new cbr.i(cte.d, 1, 4, 16, 10)
                  },
                  4,
                  new cbr.g[]{
                     new cbr.b(cjo.nN, 12, 12, 30),
                     new cbr.i(cte.hk, 1, 1, 12, 15),
                     new cbr.i(cte.hj, 1, 1, 12, 15),
                     new cbr.i(cte.hu, 1, 1, 12, 15),
                     new cbr.i(cte.hm, 1, 1, 12, 15),
                     new cbr.i(cte.hq, 1, 1, 12, 15),
                     new cbr.i(cte.hr, 1, 1, 12, 15),
                     new cbr.i(cte.hy, 1, 1, 12, 15),
                     new cbr.i(cte.hx, 1, 1, 12, 15),
                     new cbr.i(cte.hp, 1, 1, 12, 15),
                     new cbr.i(cte.hl, 1, 1, 12, 15),
                     new cbr.i(cte.ho, 1, 1, 12, 15),
                     new cbr.i(cte.hw, 1, 1, 12, 15),
                     new cbr.i(cte.hs, 1, 1, 12, 15),
                     new cbr.i(cte.ht, 1, 1, 12, 15),
                     new cbr.i(cte.hn, 1, 1, 12, 15),
                     new cbr.i(cte.hv, 1, 1, 12, 15),
                     new cbr.i(cte.lh, 1, 1, 12, 15),
                     new cbr.i(cte.lg, 1, 1, 12, 15),
                     new cbr.i(cte.lr, 1, 1, 12, 15),
                     new cbr.i(cte.lj, 1, 1, 12, 15),
                     new cbr.i(cte.ln, 1, 1, 12, 15),
                     new cbr.i(cte.lo, 1, 1, 12, 15),
                     new cbr.i(cte.lv, 1, 1, 12, 15),
                     new cbr.i(cte.lu, 1, 1, 12, 15),
                     new cbr.i(cte.lm, 1, 1, 12, 15),
                     new cbr.i(cte.li, 1, 1, 12, 15),
                     new cbr.i(cte.ll, 1, 1, 12, 15),
                     new cbr.i(cte.lt, 1, 1, 12, 15),
                     new cbr.i(cte.lp, 1, 1, 12, 15),
                     new cbr.i(cte.lq, 1, 1, 12, 15),
                     new cbr.i(cte.lk, 1, 1, 12, 15),
                     new cbr.i(cte.ls, 1, 1, 12, 15)
                  },
                  5,
                  new cbr.g[]{new cbr.i(cte.hf, 1, 1, 12, 30), new cbr.i(cte.hd, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<cbr.g[]> b = a(
      ImmutableMap.of(
         1,
         new cbr.g[]{
            new cbr.i(cjo.cx, 2, 1, 5, 1),
            new cbr.i(cjo.qc, 4, 1, 5, 1),
            new cbr.i(cjo.eY, 2, 1, 5, 1),
            new cbr.i(cjo.uX, 5, 1, 5, 1),
            new cbr.i(cjo.cs, 1, 1, 12, 1),
            new cbr.i(cjo.dn, 1, 1, 8, 1),
            new cbr.i(cjo.eO, 1, 1, 4, 1),
            new cbr.i(cjo.do, 3, 1, 12, 1),
            new cbr.i(cjo.eA, 3, 1, 8, 1),
            new cbr.i(cjo.cO, 1, 1, 12, 1),
            new cbr.i(cjo.cP, 1, 1, 12, 1),
            new cbr.i(cjo.cQ, 1, 1, 8, 1),
            new cbr.i(cjo.cR, 1, 1, 12, 1),
            new cbr.i(cjo.cS, 1, 1, 12, 1),
            new cbr.i(cjo.cT, 1, 1, 12, 1),
            new cbr.i(cjo.cU, 1, 1, 12, 1),
            new cbr.i(cjo.cV, 1, 1, 12, 1),
            new cbr.i(cjo.cW, 1, 1, 12, 1),
            new cbr.i(cjo.cX, 1, 1, 12, 1),
            new cbr.i(cjo.cY, 1, 1, 12, 1),
            new cbr.i(cjo.cZ, 1, 1, 7, 1),
            new cbr.i(cjo.oH, 1, 1, 12, 1),
            new cbr.i(cjo.ur, 1, 1, 12, 1),
            new cbr.i(cjo.rj, 1, 1, 12, 1),
            new cbr.i(cjo.rk, 1, 1, 12, 1),
            new cbr.i(cjo.N, 5, 1, 8, 1),
            new cbr.i(cjo.L, 5, 1, 8, 1),
            new cbr.i(cjo.P, 5, 1, 8, 1),
            new cbr.i(cjo.M, 5, 1, 8, 1),
            new cbr.i(cjo.J, 5, 1, 8, 1),
            new cbr.i(cjo.K, 5, 1, 8, 1),
            new cbr.i(cjo.O, 5, 1, 8, 1),
            new cbr.i(cjo.Q, 5, 1, 8, 1),
            new cbr.i(cjo.qI, 1, 3, 12, 1),
            new cbr.i(cjo.qu, 1, 3, 12, 1),
            new cbr.i(cjo.qF, 1, 3, 12, 1),
            new cbr.i(cjo.qA, 1, 3, 12, 1),
            new cbr.i(cjo.qJ, 1, 3, 12, 1),
            new cbr.i(cjo.qH, 1, 3, 12, 1),
            new cbr.i(cjo.qC, 1, 3, 12, 1),
            new cbr.i(cjo.qw, 1, 3, 12, 1),
            new cbr.i(cjo.qy, 1, 3, 12, 1),
            new cbr.i(cjo.qB, 1, 3, 12, 1),
            new cbr.i(cjo.qE, 1, 3, 12, 1),
            new cbr.i(cjo.qx, 1, 3, 12, 1),
            new cbr.i(cjo.qz, 1, 3, 12, 1),
            new cbr.i(cjo.qv, 1, 3, 12, 1),
            new cbr.i(cjo.qG, 1, 3, 12, 1),
            new cbr.i(cjo.qD, 1, 3, 12, 1),
            new cbr.i(cjo.kb, 3, 1, 8, 1),
            new cbr.i(cjo.kc, 3, 1, 8, 1),
            new cbr.i(cjo.kd, 3, 1, 8, 1),
            new cbr.i(cjo.ke, 3, 1, 8, 1),
            new cbr.i(cjo.ka, 3, 1, 8, 1),
            new cbr.i(cjo.fz, 1, 1, 12, 1),
            new cbr.i(cjo.de, 1, 1, 12, 1),
            new cbr.i(cjo.df, 1, 1, 12, 1),
            new cbr.i(cjo.fF, 1, 2, 5, 1),
            new cbr.i(cjo.du, 1, 2, 5, 1),
            new cbr.i(cjo.S, 1, 8, 8, 1),
            new cbr.i(cjo.V, 1, 4, 6, 1),
            new cbr.i(cjo.wp, 1, 2, 5, 1),
            new cbr.i(cjo.s, 1, 2, 5, 1),
            new cbr.i(cjo.dr, 1, 2, 5, 1)
         },
         2,
         new cbr.g[]{
            new cbr.i(cjo.pU, 5, 1, 4, 1),
            new cbr.i(cjo.pR, 5, 1, 4, 1),
            new cbr.i(cjo.hz, 3, 1, 6, 1),
            new cbr.i(cjo.kz, 6, 1, 6, 1),
            new cbr.i(cjo.oG, 1, 1, 8, 1),
            new cbr.i(cjo.r, 3, 3, 6, 1)
         }
      )
   );
   private static final cbr.l s = new cbr.l(8, aqg.f, "filled_map.village_desert", ebn.a.B, 12, 5);
   private static final cbr.l t = new cbr.l(8, aqg.e, "filled_map.village_savanna", ebn.a.D, 12, 5);
   private static final cbr.l u = new cbr.l(8, aqg.g, "filled_map.village_plains", ebn.a.C, 12, 5);
   private static final cbr.l v = new cbr.l(8, aqg.h, "filled_map.village_taiga", ebn.a.F, 12, 5);
   private static final cbr.l w = new cbr.l(8, aqg.i, "filled_map.village_snowy", ebn.a.E, 12, 5);
   private static final cbr.l x = new cbr.l(8, aqg.j, "filled_map.explorer_jungle", ebn.a.G, 12, 5);
   private static final cbr.l y = new cbr.l(8, aqg.k, "filled_map.explorer_swamp", ebn.a.H, 12, 5);
   public static final Map<cbq, Int2ObjectMap<cbr.g[]>> c = Map.of(
      cbq.k,
      a(
         ImmutableMap.builder()
            .put(1, new cbr.g[]{new cbr.b(cjo.qa, 24, 16, 2), a(1), new cbr.i(cte.cl, 9, 1, 12, 1)})
            .put(2, new cbr.g[]{new cbr.b(cjo.qb, 4, 12, 10), a(5), new cbr.i(cjo.vt, 1, 1, 5)})
            .put(3, new cbr.g[]{new cbr.b(cjo.qr, 5, 12, 20), a(10), new cbr.i(cjo.ck, 1, 4, 10)})
            .put(4, new cbr.g[]{new cbr.b(cjo.tg, 2, 12, 30), new cbr.i(cjo.qi, 5, 1, 15), new cbr.i(cjo.qe, 4, 1, 15)})
            .put(5, new cbr.g[]{a(), new cbr.i(cjo.tR, 20, 1, 30)})
            .build()
      ),
      cbq.c,
      a(
         ImmutableMap.builder()
            .put(1, new cbr.g[]{new cbr.b(cjo.nI, 15, 12, 2), new cbr.b(cjo.nQ, 5, 12, 2)})
            .put(
               2,
               new cbr.g[]{
                  cbr.m.a(new cbr.i(cjo.oV, 4, 1, 12, 5, 0.05F), cbs.a, cbs.c, cbs.d, cbs.e, cbs.g),
                  cbr.m.a(new cbr.i(cjo.oR, 4, 1, 12, 5, 0.05F), cbs.b, cbs.f),
                  cbr.m.a(new cbr.i(cjo.oS, 5, 1, 12, 5, 0.05F), cbs.a, cbs.c, cbs.d, cbs.e, cbs.g),
                  cbr.m.a(new cbr.i(cjo.oO, 5, 1, 12, 5, 0.05F), cbs.b, cbs.f),
                  cbr.m.a(new cbr.i(cjo.oU, 7, 1, 12, 5, 0.05F), cbs.a, cbs.c, cbs.d, cbs.e, cbs.g),
                  cbr.m.a(new cbr.i(cjo.oQ, 7, 1, 12, 5, 0.05F), cbs.b, cbs.f),
                  cbr.m.a(new cbr.i(cjo.oT, 9, 1, 12, 5, 0.05F), cbs.a, cbs.c, cbs.d, cbs.e, cbs.g),
                  cbr.m.a(new cbr.i(cjo.oP, 9, 1, 12, 5, 0.05F), cbs.b, cbs.f)
               }
            )
            .put(3, new cbr.g[]{new cbr.b(cjo.pM, 1, 12, 20), new cbr.i(cjo.uy, 5, 1, 12, 10, 0.05F), new cbr.i(cjo.vs, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new cbr.g[]{
                  cbr.m.a(new cbr.i(a(cjo.oV, cny.h, 1), 8, 1, 3, 15, 0.05F), cbs.a),
                  cbr.m.a(new cbr.i(a(cjo.oS, cny.h, 1), 9, 1, 3, 15, 0.05F), cbs.a),
                  cbr.m.a(new cbr.i(a(cjo.oU, cny.h, 1), 11, 1, 3, 15, 0.05F), cbs.a),
                  cbr.m.a(new cbr.i(a(cjo.oT, cny.h, 1), 13, 1, 3, 15, 0.05F), cbs.a),
                  cbr.m.a(new cbr.i(a(cjo.oV, cny.a, 1), 8, 1, 3, 15, 0.05F), cbs.c),
                  cbr.m.a(new cbr.i(a(cjo.oS, cny.a, 1), 9, 1, 3, 15, 0.05F), cbs.c),
                  cbr.m.a(new cbr.i(a(cjo.oU, cny.a, 1), 11, 1, 3, 15, 0.05F), cbs.c),
                  cbr.m.a(new cbr.i(a(cjo.oT, cny.a, 1), 13, 1, 3, 15, 0.05F), cbs.c),
                  cbr.m.a(new cbr.i(a(cjo.oV, cny.k, 1), 2, 1, 3, 15, 0.05F), cbs.d),
                  cbr.m.a(new cbr.i(a(cjo.oS, cny.k, 1), 3, 1, 3, 15, 0.05F), cbs.d),
                  cbr.m.a(new cbr.i(a(cjo.oU, cny.k, 1), 5, 1, 3, 15, 0.05F), cbs.d),
                  cbr.m.a(new cbr.i(a(cjo.oT, cny.k, 1), 7, 1, 3, 15, 0.05F), cbs.d),
                  cbr.m.a(new cbr.i(a(cjo.oV, cny.j, 1), 8, 1, 3, 15, 0.05F), cbs.e),
                  cbr.m.a(new cbr.i(a(cjo.oS, cny.g, 1), 9, 1, 3, 15, 0.05F), cbs.e),
                  cbr.m.a(new cbr.i(a(cjo.oR, cny.w, 1), 8, 1, 3, 15, 0.05F), cbs.b),
                  cbr.m.a(new cbr.i(a(cjo.oO, cny.w, 1), 9, 1, 3, 15, 0.05F), cbs.b),
                  cbr.m.a(new cbr.i(a(cjo.oQ, cny.w, 1), 11, 1, 3, 15, 0.05F), cbs.b),
                  cbr.m.a(new cbr.i(a(cjo.oP, cny.w, 1), 13, 1, 3, 15, 0.05F), cbs.b),
                  cbr.m.a(new cbr.i(a(cjo.oR, cny.L, 1), 8, 1, 3, 15, 0.05F), cbs.f),
                  cbr.m.a(new cbr.i(a(cjo.oO, cny.L, 1), 9, 1, 3, 15, 0.05F), cbs.f),
                  cbr.m.a(new cbr.i(a(cjo.oQ, cny.L, 1), 11, 1, 3, 15, 0.05F), cbs.f),
                  cbr.m.a(new cbr.i(a(cjo.oP, cny.L, 1), 13, 1, 3, 15, 0.05F), cbs.f),
                  cbr.m.a(new cbr.h(cjo.oZ, 1, 4, cjo.oY, 1, 3, 15, 0.05F), cbs.g),
                  cbr.m.a(new cbr.h(cjo.oY, 1, 4, cjo.oX, 1, 3, 15, 0.05F), cbs.g),
                  cbr.m.a(new cbr.h(cjo.oW, 1, 4, cjo.oZ, 1, 3, 15, 0.05F), cbs.g),
                  cbr.m.a(new cbr.h(cjo.oX, 1, 2, cjo.oW, 1, 3, 15, 0.05F), cbs.g)
               }
            )
            .put(
               5,
               new cbr.g[]{
                  cbr.m.a(new cbr.h(cjo.nK, 4, 16, a(cjo.oX, cny.h, 1), 1, 3, 30, 0.05F), cbs.a),
                  cbr.m.a(new cbr.h(cjo.nK, 3, 16, a(cjo.oY, cny.h, 1), 1, 3, 30, 0.05F), cbs.a),
                  cbr.m.a(new cbr.h(cjo.nK, 3, 16, a(cjo.oY, cny.a, 1), 1, 3, 30, 0.05F), cbs.c),
                  cbr.m.a(new cbr.h(cjo.nK, 2, 12, a(cjo.oZ, cny.a, 1), 1, 3, 30, 0.05F), cbs.c),
                  cbr.m.a(new cbr.h(cjo.nK, 2, 6, a(cjo.oW, cny.k, 1), 1, 3, 30, 0.05F), cbs.d),
                  cbr.m.a(new cbr.h(cjo.nK, 3, 8, a(cjo.oX, cny.k, 1), 1, 3, 30, 0.05F), cbs.d),
                  cbr.m.a(new cbr.h(cjo.nK, 2, 12, a(cjo.oZ, cny.j, 1), 1, 3, 30, 0.05F), cbs.e),
                  cbr.m.a(new cbr.h(cjo.nK, 3, 12, a(cjo.oW, cny.g, 1), 1, 3, 30, 0.05F), cbs.e),
                  cbr.m.a(new cbr.i(a(cjo.oO, cny.e, 1), 9, 1, 3, 30, 0.05F), cbs.b),
                  cbr.m.a(new cbr.i(a(cjo.oR, cny.c, 1), 8, 1, 3, 30, 0.05F), cbs.b),
                  cbr.m.a(new cbr.i(a(cjo.oO, cny.f, 1), 9, 1, 3, 30, 0.05F), cbs.f),
                  cbr.m.a(new cbr.i(a(cjo.oR, cny.i, 1), 8, 1, 3, 30, 0.05F), cbs.f),
                  cbr.m.a(new cbr.h(cjo.nK, 4, 18, a(cjo.oX, cny.d, 1), 1, 3, 30, 0.05F), cbs.g),
                  cbr.m.a(new cbr.h(cjo.nK, 3, 18, a(cjo.oY, cny.d, 1), 1, 3, 30, 0.05F), cbs.g),
                  cbr.m.a(new cbr.b(cjo.az, 1, 12, 30, 42), cbs.g),
                  cbr.m.a(new cbr.b(cjo.aw, 1, 12, 30, 4), cbs.a, cbs.b, cbs.c, cbs.d, cbs.e, cbs.f)
               }
            )
            .build()
      ),
      cbq.e,
      a(
         ImmutableMap.of(
            1,
            new cbr.g[]{new cbr.b(cjo.qa, 24, 16, 2), new cbr.i(cjo.tp, 7, 1, 1)},
            2,
            new cbr.g[]{
               new cbr.b(cjo.fx, 11, 16, 10),
               new cbr.m(ImmutableMap.builder().put(cbs.a, t).put(cbs.d, u).put(cbs.c, v).put(cbs.g, w).put(cbs.e, u).put(cbs.b, t).put(cbs.f, w).build()),
               new cbr.m(ImmutableMap.builder().put(cbs.a, u).put(cbs.d, s).put(cbs.c, t).put(cbs.g, u).put(cbs.e, v).put(cbs.b, s).put(cbs.f, v).build()),
               new cbr.m(
                  ImmutableMap.builder().put(cbs.a, x).put(cbs.d, x).put(cbs.c, new cbr.f()).put(cbs.g, y).put(cbs.e, y).put(cbs.b, y).put(cbs.f, x).build()
               )
            },
            3,
            new cbr.g[]{new cbr.b(cjo.qe, 1, 12, 20), new cbr.l(13, aqg.d, "filled_map.monument", ebn.a.j, 12, 10)},
            4,
            new cbr.g[]{
               new cbr.i(cjo.ti, 7, 1, 15),
               new cbr.i(cjo.tV, 3, 1, 15),
               new cbr.i(cjo.ug, 3, 1, 15),
               new cbr.i(cjo.tY, 3, 1, 15),
               new cbr.i(cjo.uj, 3, 1, 15),
               new cbr.i(cjo.ub, 3, 1, 15),
               new cbr.i(cjo.ui, 3, 1, 15),
               new cbr.i(cjo.ua, 3, 1, 15),
               new cbr.i(cjo.uc, 3, 1, 15),
               new cbr.i(cjo.uk, 3, 1, 15),
               new cbr.i(cjo.uf, 3, 1, 15),
               new cbr.i(cjo.tX, 3, 1, 15),
               new cbr.i(cjo.ue, 3, 1, 15),
               new cbr.i(cjo.uh, 3, 1, 15),
               new cbr.i(cjo.tZ, 3, 1, 15),
               new cbr.i(cjo.tW, 3, 1, 15),
               new cbr.i(cjo.ud, 3, 1, 15)
            },
            5,
            new cbr.g[]{new cbr.i(cjo.vg, 8, 1, 30), new cbr.l(14, aqg.c, "filled_map.mansion", ebn.a.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<cbr.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new cbr.g[]{
               new cbr.b(a(cll.c), 1, 1, 1),
               new cbr.b(cjo.pL, 1, 1, 1, 2),
               new cbr.b(cjo.pQ, 1, 1, 1, 2),
               new cbr.b(cjo.ry, 1, 1, 1, 3),
               new cbr.b(cjo.tn, 4, 1, 1),
               new cbr.b(cjo.hh, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cbr.g[]{
               new cbr.i(cjo.hz, 1, 1, 6, 1),
               new cbr.i(cjo.kz, 6, 1, 6, 1),
               new cbr.i(cjo.oG, 1, 4, 2, 1),
               new cbr.i(cjo.r, 3, 3, 6, 1),
               new cbr.i(cte.Y, 1, 8, 4, 1),
               new cbr.i(cte.W, 1, 8, 4, 1),
               new cbr.i(cte.aa, 1, 8, 4, 1),
               new cbr.i(cte.X, 1, 8, 4, 1),
               new cbr.i(cte.U, 1, 8, 4, 1),
               new cbr.i(cte.V, 1, 8, 4, 1),
               new cbr.i(cte.Z, 1, 8, 4, 1),
               new cbr.e(cjo.oo, 1, 1, 1, 0.2F),
               new cbr.i(a(cll.j), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cbr.g[]{
               new cbr.i(cjo.pU, 3, 1, 4, 1),
               new cbr.i(cjo.pR, 3, 1, 4, 1),
               new cbr.i(cjo.cx, 2, 1, 5, 1),
               new cbr.i(cjo.qc, 4, 1, 5, 1),
               new cbr.i(cjo.eY, 2, 1, 5, 1),
               new cbr.i(cjo.uX, 5, 1, 5, 1),
               new cbr.i(cjo.cs, 1, 1, 12, 1),
               new cbr.i(cjo.dn, 1, 1, 8, 1),
               new cbr.i(cjo.eO, 1, 1, 4, 1),
               new cbr.i(cjo.do, 3, 1, 12, 1),
               new cbr.i(cjo.eA, 3, 1, 8, 1),
               new cbr.i(cjo.cO, 1, 1, 12, 1),
               new cbr.i(cjo.cP, 1, 1, 12, 1),
               new cbr.i(cjo.cQ, 1, 1, 8, 1),
               new cbr.i(cjo.cR, 1, 1, 12, 1),
               new cbr.i(cjo.cS, 1, 1, 12, 1),
               new cbr.i(cjo.cT, 1, 1, 12, 1),
               new cbr.i(cjo.cU, 1, 1, 12, 1),
               new cbr.i(cjo.cV, 1, 1, 12, 1),
               new cbr.i(cjo.cW, 1, 1, 12, 1),
               new cbr.i(cjo.cX, 1, 1, 12, 1),
               new cbr.i(cjo.cY, 1, 1, 12, 1),
               new cbr.i(cjo.cZ, 1, 1, 7, 1),
               new cbr.i(cjo.oH, 1, 1, 12, 1),
               new cbr.i(cjo.ur, 1, 1, 12, 1),
               new cbr.i(cjo.rj, 1, 1, 12, 1),
               new cbr.i(cjo.rk, 1, 1, 12, 1),
               new cbr.i(cjo.N, 5, 1, 8, 1),
               new cbr.i(cjo.L, 5, 1, 8, 1),
               new cbr.i(cjo.P, 5, 1, 8, 1),
               new cbr.i(cjo.M, 5, 1, 8, 1),
               new cbr.i(cjo.J, 5, 1, 8, 1),
               new cbr.i(cjo.K, 5, 1, 8, 1),
               new cbr.i(cjo.O, 5, 1, 8, 1),
               new cbr.i(cjo.Q, 5, 1, 8, 1),
               new cbr.i(cjo.qI, 1, 3, 12, 1),
               new cbr.i(cjo.qu, 1, 3, 12, 1),
               new cbr.i(cjo.qF, 1, 3, 12, 1),
               new cbr.i(cjo.qA, 1, 3, 12, 1),
               new cbr.i(cjo.qJ, 1, 3, 12, 1),
               new cbr.i(cjo.qH, 1, 3, 12, 1),
               new cbr.i(cjo.qC, 1, 3, 12, 1),
               new cbr.i(cjo.qw, 1, 3, 12, 1),
               new cbr.i(cjo.qy, 1, 3, 12, 1),
               new cbr.i(cjo.qB, 1, 3, 12, 1),
               new cbr.i(cjo.qE, 1, 3, 12, 1),
               new cbr.i(cjo.qx, 1, 3, 12, 1),
               new cbr.i(cjo.qz, 1, 3, 12, 1),
               new cbr.i(cjo.qv, 1, 3, 12, 1),
               new cbr.i(cjo.qG, 1, 3, 12, 1),
               new cbr.i(cjo.qD, 1, 3, 12, 1),
               new cbr.i(cjo.kb, 3, 1, 8, 1),
               new cbr.i(cjo.kc, 3, 1, 8, 1),
               new cbr.i(cjo.kd, 3, 1, 8, 1),
               new cbr.i(cjo.ke, 3, 1, 8, 1),
               new cbr.i(cjo.ka, 3, 1, 8, 1),
               new cbr.i(cjo.fz, 1, 3, 4, 1),
               new cbr.i(cjo.de, 1, 3, 4, 1),
               new cbr.i(cjo.df, 1, 3, 4, 1),
               new cbr.i(cjo.fF, 1, 5, 2, 1),
               new cbr.i(cjo.du, 1, 2, 5, 1),
               new cbr.i(cjo.S, 1, 8, 8, 1),
               new cbr.i(cjo.V, 1, 4, 6, 1),
               new cbr.i(cjo.wp, 1, 2, 5, 1),
               new cbr.i(cjo.s, 1, 2, 5, 1),
               new cbr.i(cjo.dr, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static cbr.g a(int $$0) {
      return new cbr.m(
         ImmutableMap.builder()
            .put(cbs.a, new cbr.d($$0, cny.b, cny.h, cny.B))
            .put(cbs.b, new cbr.d($$0, cny.c, cny.e, cny.y))
            .put(cbs.c, new cbr.d($$0, cny.z, cny.o, cny.p))
            .put(cbs.d, new cbr.d($$0, cny.q, cny.k, cny.t))
            .put(cbs.e, new cbr.d($$0, cny.g, cny.s, cny.j))
            .put(cbs.f, new cbr.d($$0, cny.i, cny.f, cny.M))
            .put(cbs.g, new cbr.d($$0, cny.d, cny.r, cny.A))
            .build()
      );
   }

   private static cbr.g a() {
      return new cbr.m(
         ImmutableMap.builder()
            .put(cbs.a, new cbr.d(30, 3, 3, cny.u))
            .put(cbs.b, new cbr.d(30, 2, 2, cny.w))
            .put(cbs.c, new cbr.d(30, 3, 3, cny.a))
            .put(cbs.d, new cbr.d(30, 3, 3, cny.n))
            .put(cbs.e, new cbr.d(30, cny.v))
            .put(cbs.f, new cbr.d(30, cny.L))
            .put(cbs.g, new cbr.d(30, 2, 2, cny.x))
            .build()
      );
   }

   private static Int2ObjectMap<cbr.g[]> a(ImmutableMap<Integer, cbr.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static cjl a(cli $$0) {
      return clk.a(new cjl(cjo.rv), $$0);
   }

   private static cjl a(cjg $$0, cnu $$1, int $$2) {
      cjl $$3 = new cjl($$0);
      $$3.a($$1, $$2);
      return $$3;
   }

   static class a implements cbr.g {
      private final cjg a;
      private final int b;
      private final int c;
      private final int d;

      public a(cjg $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(cjg $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public coz a(biw $$0, ash $$1) {
         cjl $$2 = new cjl(cjo.nL, this.b);
         cjl $$3 = new cjl(this.a);
         if (this.a instanceof cib) {
            List<cia> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = cid.a($$3, $$4);
         }

         return new coz($$2, $$3, this.c, this.d, 0.2F);
      }

      private static cia a(ash $$0) {
         return cia.a(chz.a($$0.a(16)));
      }
   }

   static class b implements cbr.g {
      private final cjl a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(cqa $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(cqa $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cjl($$0.k(), $$1), $$2, $$3, $$4);
      }

      public b(cjl $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public coz a(biw $$0, ash $$1) {
         return new coz(this.a.p(), new cjl(cjo.nL, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements cbr.g {
      private final Map<cbs, cjg> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<cbs, cjg> $$3) {
         jb.z.s().filter($$1x -> !$$3.containsKey($$1x)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + jb.z.b($$0x));
         });
         this.a = $$3;
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Nullable
      @Override
      public coz a(biw $$0, ash $$1) {
         if ($$0 instanceof cbp $$2) {
            cjl $$3 = new cjl(this.a.get($$2.gp().a()), this.b);
            return new coz($$3, new cjl(cjo.nL), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements cbr.g {
      private final int a;
      private final List<cnu> b;
      private final int c;
      private final int d;

      public d(int $$0) {
         this($$0, jb.g.s().filter(cnu::h).toArray(cnu[]::new));
      }

      public d(int $$0, cnu... $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, cnu... $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = Arrays.asList($$3);
      }

      @Override
      public coz a(biw $$0, ash $$1) {
         cnu $$2 = this.b.get($$1.a(this.b.size()));
         int $$3 = Math.max($$2.e(), this.c);
         int $$4 = Math.min($$2.a(), this.d);
         int $$5 = asb.a($$1, $$3, $$4);
         cjl $$6 = cih.a(new cnx($$2, $$5));
         int $$7 = 2 + $$1.a(5 + $$5 * 10) + 3 * $$5;
         if ($$2.b()) {
            $$7 *= 2;
         }

         if ($$7 > 64) {
            $$7 = 64;
         }

         return new coz(new cjl(cjo.nL, $$7), new cjl(cjo.qb), $$6, 12, this.a, 0.2F);
      }
   }

   static class e implements cbr.g {
      private final cjl a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(cjg $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(cjg $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new cjl($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public coz a(biw $$0, ash $$1) {
         int $$2 = 5 + $$1.a(15);
         cjl $$3 = cnw.a($$1, new cjl(this.a.d()), $$2, false);
         int $$4 = Math.min(this.b + $$2, 64);
         cjl $$5 = new cjl(cjo.nL, $$4);
         return new coz($$5, $$3, this.c, this.d, this.e);
      }
   }

   static class f implements cbr.g {
      @Override
      public coz a(biw $$0, ash $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      coz a(biw var1, ash var2);
   }

   static class h implements cbr.g {
      private final cjl a;
      private final int b;
      private final cjl c;
      private final int d;
      private final int e;
      private final float f;

      public h(cqa $$0, int $$1, int $$2, cjg $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new cjl($$3), $$4, $$5, $$6, $$7);
      }

      public h(cqa $$0, int $$1, int $$2, cjl $$3, int $$4, int $$5, int $$6, float $$7) {
         this.a = new cjl($$0, $$1);
         this.b = $$2;
         this.c = $$3.c($$4);
         this.d = $$5;
         this.e = $$6;
         this.f = $$7;
      }

      @Nullable
      @Override
      public coz a(biw $$0, ash $$1) {
         return new coz(new cjl(cjo.nL, this.b), this.a.p(), this.c.p(), this.d, this.e, this.f);
      }
   }

   static class i implements cbr.g {
      private final cjl a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public i(ctc $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cjl($$0), $$1, $$2, $$3, $$4);
      }

      public i(cjg $$0, int $$1, int $$2, int $$3) {
         this(new cjl($$0), $$1, $$2, 12, $$3);
      }

      public i(cjg $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cjl($$0), $$1, $$2, $$3, $$4);
      }

      public i(cjl $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(cjg $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new cjl($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(cjl $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.a.f($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
      }

      @Override
      public coz a(biw $$0, ash $$1) {
         return new coz(new cjl(cjo.nL, this.b), this.a.p(), this.c, this.d, this.e);
      }
   }

   static class j implements cbr.g {
      private final List<dbc.a> a;
      private final int b;
      private final float c;

      public j(bih $$0, int $$1, int $$2) {
         this(List.of(new dbc.a($$0, $$1)), $$2, 0.05F);
      }

      public j(List<dbc.a> $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public coz a(biw $$0, ash $$1) {
         cjl $$2 = new cjl(cjo.va, 1);
         ckv.a($$2, this.a);
         return new coz(new cjl(cjo.nL, 1), $$2, 12, this.b, this.c);
      }
   }

   static class k implements cbr.g {
      private final cjl a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final cjg f;
      private final int g;
      private final float h;

      public k(cjg $$0, int $$1, cjg $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new cjl($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public coz a(biw $$0, ash $$1) {
         cjl $$2 = new cjl(cjo.nL, this.c);
         List<cli> $$3 = jb.j.s().filter($$0x -> !$$0x.a().isEmpty() && clj.a($$0x)).collect(Collectors.toList());
         cli $$4 = $$3.get($$1.a($$3.size()));
         cjl $$5 = clk.a(new cjl(this.a.d(), this.b), $$4);
         return new coz($$2, new cjl(this.f, this.g), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements cbr.g {
      private final int a;
      private final aqk<dvc> b;
      private final String c;
      private final ebn.a d;
      private final int e;
      private final int f;

      public l(int $$0, aqk<dvc> $$1, String $$2, ebn.a $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public coz a(biw $$0, ash $$1) {
         if (!($$0.dL() instanceof akt)) {
            return null;
         } else {
            akt $$2 = (akt)$$0.dL();
            gw $$3 = $$2.a(this.b, $$0.dl(), 100, true);
            if ($$3 != null) {
               cjl $$4 = cjs.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               cjs.a($$2, $$4);
               ebq.a($$4, $$3, "+", this.d);
               $$4.a(tl.c(this.c));
               return new coz(new cjl(cjo.nL, this.a), new cjl(cjo.qe), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static record m(Map<cbs, cbr.g> a) implements cbr.g {
      public static cbr.m a(cbr.g $$0, cbs... $$1) {
         return new cbr.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public coz a(biw $$0, ash $$1) {
         if ($$0 instanceof cbp $$2) {
            cbs $$3 = $$2.gp().a();
            cbr.g $$4 = this.a.get($$3);
            return $$4 == null ? null : $$4.a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
