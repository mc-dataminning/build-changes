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

public class cbn {
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
   public static final Map<cbm, Int2ObjectMap<cbn.g[]>> a = ac.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            cbm.g,
            a(
               ImmutableMap.of(
                  1,
                  new cbn.g[]{
                     new cbn.b(cjk.oI, 20, 16, 2),
                     new cbn.b(cjk.tm, 26, 16, 2),
                     new cbn.b(cjk.tl, 22, 16, 2),
                     new cbn.b(cjk.uq, 15, 16, 2),
                     new cbn.i(cjk.oJ, 1, 6, 16, 1)
                  },
                  2,
                  new cbn.g[]{new cbn.b(csy.dV, 6, 12, 10), new cbn.i(cjk.tz, 1, 4, 5), new cbn.i(cjk.nF, 1, 4, 16, 5)},
                  3,
                  new cbn.g[]{new cbn.i(cjk.re, 3, 18, 10), new cbn.b(csy.fa, 4, 12, 20)},
                  4,
                  new cbn.g[]{
                     new cbn.i(csy.eh, 1, 1, 12, 15),
                     new cbn.j(bih.p, 100, 15),
                     new cbn.j(bih.h, 160, 15),
                     new cbn.j(bih.r, 140, 15),
                     new cbn.j(bih.o, 120, 15),
                     new cbn.j(bih.s, 280, 15),
                     new cbn.j(bih.w, 7, 15)
                  },
                  5,
                  new cbn.g[]{new cbn.i(cjk.tq, 3, 3, 30), new cbn.i(cjk.rE, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            cbm.h,
            a(
               ImmutableMap.of(
                  1,
                  new cbn.g[]{
                     new cbn.b(cjk.oE, 20, 16, 2),
                     new cbn.b(cjk.nI, 10, 16, 2),
                     new cbn.h(cjk.ql, 6, 1, cjk.qp, 6, 16, 1, 0.05F),
                     new cbn.i(cjk.pT, 3, 1, 16, 1)
                  },
                  2,
                  new cbn.g[]{new cbn.b(cjk.ql, 15, 16, 10), new cbn.h(cjk.qm, 6, 1, cjk.qq, 6, 16, 5, 0.05F), new cbn.i(cjk.vx, 2, 1, 5)},
                  3,
                  new cbn.g[]{new cbn.b(cjk.qm, 13, 16, 20), new cbn.e(cjk.qh, 3, 3, 10, 0.2F)},
                  4,
                  new cbn.g[]{new cbn.b(cjk.qn, 6, 12, 30)},
                  5,
                  new cbn.g[]{
                     new cbn.b(cjk.qo, 4, 12, 30),
                     new cbn.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(cbo.c, cjk.ni)
                           .put(cbo.g, cjk.nk)
                           .put(cbo.e, cjk.nk)
                           .put(cbo.a, cjk.no)
                           .put(cbo.b, cjk.no)
                           .put(cbo.d, cjk.nq)
                           .put(cbo.f, cjk.nu)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            cbm.n,
            a(
               ImmutableMap.of(
                  1,
                  new cbn.g[]{
                     new cbn.b(csy.bA, 18, 16, 2),
                     new cbn.b(csy.bM, 18, 16, 2),
                     new cbn.b(csy.bP, 18, 16, 2),
                     new cbn.b(csy.bH, 18, 16, 2),
                     new cbn.i(cjk.rg, 2, 1, 1)
                  },
                  2,
                  new cbn.g[]{
                     new cbn.b(cjk.qu, 12, 16, 10),
                     new cbn.b(cjk.qB, 12, 16, 10),
                     new cbn.b(cjk.qJ, 12, 16, 10),
                     new cbn.b(cjk.qx, 12, 16, 10),
                     new cbn.b(cjk.qz, 12, 16, 10),
                     new cbn.i(csy.bA, 1, 1, 16, 5),
                     new cbn.i(csy.bB, 1, 1, 16, 5),
                     new cbn.i(csy.bC, 1, 1, 16, 5),
                     new cbn.i(csy.bD, 1, 1, 16, 5),
                     new cbn.i(csy.bE, 1, 1, 16, 5),
                     new cbn.i(csy.bF, 1, 1, 16, 5),
                     new cbn.i(csy.bG, 1, 1, 16, 5),
                     new cbn.i(csy.bH, 1, 1, 16, 5),
                     new cbn.i(csy.bI, 1, 1, 16, 5),
                     new cbn.i(csy.bJ, 1, 1, 16, 5),
                     new cbn.i(csy.bK, 1, 1, 16, 5),
                     new cbn.i(csy.bL, 1, 1, 16, 5),
                     new cbn.i(csy.bM, 1, 1, 16, 5),
                     new cbn.i(csy.bN, 1, 1, 16, 5),
                     new cbn.i(csy.bO, 1, 1, 16, 5),
                     new cbn.i(csy.bP, 1, 1, 16, 5),
                     new cbn.i(csy.ik, 1, 4, 16, 5),
                     new cbn.i(csy.il, 1, 4, 16, 5),
                     new cbn.i(csy.im, 1, 4, 16, 5),
                     new cbn.i(csy.in, 1, 4, 16, 5),
                     new cbn.i(csy.io, 1, 4, 16, 5),
                     new cbn.i(csy.ip, 1, 4, 16, 5),
                     new cbn.i(csy.iq, 1, 4, 16, 5),
                     new cbn.i(csy.ir, 1, 4, 16, 5),
                     new cbn.i(csy.is, 1, 4, 16, 5),
                     new cbn.i(csy.it, 1, 4, 16, 5),
                     new cbn.i(csy.iu, 1, 4, 16, 5),
                     new cbn.i(csy.iv, 1, 4, 16, 5),
                     new cbn.i(csy.iw, 1, 4, 16, 5),
                     new cbn.i(csy.ix, 1, 4, 16, 5),
                     new cbn.i(csy.iy, 1, 4, 16, 5),
                     new cbn.i(csy.iz, 1, 4, 16, 5)
                  },
                  3,
                  new cbn.g[]{
                     new cbn.b(cjk.qy, 12, 16, 20),
                     new cbn.b(cjk.qC, 12, 16, 20),
                     new cbn.b(cjk.qv, 12, 16, 20),
                     new cbn.b(cjk.qI, 12, 16, 20),
                     new cbn.b(cjk.qA, 12, 16, 20),
                     new cbn.i(csy.aZ, 3, 1, 12, 10),
                     new cbn.i(csy.bd, 3, 1, 12, 10),
                     new cbn.i(csy.bn, 3, 1, 12, 10),
                     new cbn.i(csy.bo, 3, 1, 12, 10),
                     new cbn.i(csy.bk, 3, 1, 12, 10),
                     new cbn.i(csy.bl, 3, 1, 12, 10),
                     new cbn.i(csy.bi, 3, 1, 12, 10),
                     new cbn.i(csy.bg, 3, 1, 12, 10),
                     new cbn.i(csy.bm, 3, 1, 12, 10),
                     new cbn.i(csy.bc, 3, 1, 12, 10),
                     new cbn.i(csy.bh, 3, 1, 12, 10),
                     new cbn.i(csy.be, 3, 1, 12, 10),
                     new cbn.i(csy.bb, 3, 1, 12, 10),
                     new cbn.i(csy.ba, 3, 1, 12, 10),
                     new cbn.i(csy.bf, 3, 1, 12, 10),
                     new cbn.i(csy.bj, 3, 1, 12, 10)
                  },
                  4,
                  new cbn.g[]{
                     new cbn.b(cjk.qG, 12, 16, 30),
                     new cbn.b(cjk.qE, 12, 16, 30),
                     new cbn.b(cjk.qF, 12, 16, 30),
                     new cbn.b(cjk.qH, 12, 16, 30),
                     new cbn.b(cjk.qw, 12, 16, 30),
                     new cbn.b(cjk.qD, 12, 16, 30),
                     new cbn.i(cjk.tV, 3, 1, 12, 15),
                     new cbn.i(cjk.ug, 3, 1, 12, 15),
                     new cbn.i(cjk.tY, 3, 1, 12, 15),
                     new cbn.i(cjk.uj, 3, 1, 12, 15),
                     new cbn.i(cjk.ub, 3, 1, 12, 15),
                     new cbn.i(cjk.ui, 3, 1, 12, 15),
                     new cbn.i(cjk.ua, 3, 1, 12, 15),
                     new cbn.i(cjk.uc, 3, 1, 12, 15),
                     new cbn.i(cjk.uk, 3, 1, 12, 15),
                     new cbn.i(cjk.uf, 3, 1, 12, 15),
                     new cbn.i(cjk.tX, 3, 1, 12, 15),
                     new cbn.i(cjk.ue, 3, 1, 12, 15),
                     new cbn.i(cjk.uh, 3, 1, 12, 15),
                     new cbn.i(cjk.tZ, 3, 1, 12, 15),
                     new cbn.i(cjk.tW, 3, 1, 12, 15),
                     new cbn.i(cjk.ud, 3, 1, 12, 15)
                  },
                  5,
                  new cbn.g[]{new cbn.i(cjk.pl, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            cbm.i,
            a(
               ImmutableMap.of(
                  1,
                  new cbn.g[]{new cbn.b(cjk.oB, 32, 16, 2), new cbn.i(cjk.nH, 1, 16, 1), new cbn.h(csy.L, 10, 1, cjk.pi, 10, 12, 1, 0.05F)},
                  2,
                  new cbn.g[]{new cbn.b(cjk.pi, 26, 12, 10), new cbn.i(cjk.nG, 2, 1, 5)},
                  3,
                  new cbn.g[]{new cbn.b(cjk.oE, 14, 16, 20), new cbn.i(cjk.uZ, 3, 1, 10)},
                  4,
                  new cbn.g[]{new cbn.b(cjk.oF, 24, 16, 30), new cbn.e(cjk.nG, 2, 3, 15)},
                  5,
                  new cbn.g[]{new cbn.b(cjk.lF, 8, 12, 30), new cbn.e(cjk.uZ, 3, 3, 15), new cbn.k(cjk.nH, 5, cjk.uw, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            cbm.k,
            a(
               ImmutableMap.builder()
                  .put(1, new cbn.g[]{new cbn.b(cjk.qa, 24, 16, 2), new cbn.d(1), new cbn.i(csy.cl, 9, 1, 12, 1)})
                  .put(2, new cbn.g[]{new cbn.b(cjk.qb, 4, 12, 10), new cbn.d(5), new cbn.i(cjk.vt, 1, 1, 5)})
                  .put(3, new cbn.g[]{new cbn.b(cjk.qr, 5, 12, 20), new cbn.d(10), new cbn.i(cjk.ck, 1, 4, 10)})
                  .put(4, new cbn.g[]{new cbn.b(cjk.tg, 2, 12, 30), new cbn.d(15), new cbn.i(cjk.qi, 5, 1, 15), new cbn.i(cjk.qe, 4, 1, 15)})
                  .put(5, new cbn.g[]{new cbn.i(cjk.tR, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            cbm.e,
            a(
               ImmutableMap.of(
                  1,
                  new cbn.g[]{new cbn.b(cjk.qa, 24, 16, 2), new cbn.i(cjk.tp, 7, 1, 1)},
                  2,
                  new cbn.g[]{new cbn.b(cjk.fx, 11, 16, 10), new cbn.l(13, aqf.d, "filled_map.monument", ebv.a.j, 12, 5)},
                  3,
                  new cbn.g[]{new cbn.b(cjk.qe, 1, 12, 20), new cbn.l(14, aqf.c, "filled_map.mansion", ebv.a.i, 12, 10)},
                  4,
                  new cbn.g[]{
                     new cbn.i(cjk.ti, 7, 1, 15),
                     new cbn.i(cjk.tV, 3, 1, 15),
                     new cbn.i(cjk.ug, 3, 1, 15),
                     new cbn.i(cjk.tY, 3, 1, 15),
                     new cbn.i(cjk.uj, 3, 1, 15),
                     new cbn.i(cjk.ub, 3, 1, 15),
                     new cbn.i(cjk.ui, 3, 1, 15),
                     new cbn.i(cjk.ua, 3, 1, 15),
                     new cbn.i(cjk.uc, 3, 1, 15),
                     new cbn.i(cjk.uk, 3, 1, 15),
                     new cbn.i(cjk.uf, 3, 1, 15),
                     new cbn.i(cjk.tX, 3, 1, 15),
                     new cbn.i(cjk.ue, 3, 1, 15),
                     new cbn.i(cjk.uh, 3, 1, 15),
                     new cbn.i(cjk.tZ, 3, 1, 15),
                     new cbn.i(cjk.tW, 3, 1, 15),
                     new cbn.i(cjk.ud, 3, 1, 15)
                  },
                  5,
                  new cbn.g[]{new cbn.i(cjk.vg, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            cbm.f,
            a(
               ImmutableMap.of(
                  1,
                  new cbn.g[]{new cbn.b(cjk.rp, 32, 16, 2), new cbn.i(cjk.ll, 1, 2, 1)},
                  2,
                  new cbn.g[]{new cbn.b(cjk.nU, 3, 12, 10), new cbn.i(cjk.nM, 1, 1, 5)},
                  3,
                  new cbn.g[]{new cbn.b(cjk.tJ, 2, 12, 20), new cbn.i(csy.ed, 4, 1, 12, 10)},
                  4,
                  new cbn.g[]{new cbn.b(cjk.nD, 4, 12, 30), new cbn.b(cjk.rw, 9, 12, 30), new cbn.i(cjk.rq, 5, 1, 15)},
                  5,
                  new cbn.g[]{new cbn.b(cjk.ru, 22, 12, 30), new cbn.i(cjk.te, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            cbm.c,
            a(
               ImmutableMap.of(
                  1,
                  new cbn.g[]{
                     new cbn.b(cjk.nI, 15, 16, 2),
                     new cbn.i(new cjh(cjk.oU), 7, 1, 12, 1, 0.2F),
                     new cbn.i(new cjh(cjk.oV), 4, 1, 12, 1, 0.2F),
                     new cbn.i(new cjh(cjk.oS), 5, 1, 12, 1, 0.2F),
                     new cbn.i(new cjh(cjk.oT), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cbn.g[]{
                     new cbn.b(cjk.nQ, 4, 12, 10),
                     new cbn.i(new cjh(cjk.vs), 36, 1, 12, 5, 0.2F),
                     new cbn.i(new cjh(cjk.oR), 1, 1, 12, 5, 0.2F),
                     new cbn.i(new cjh(cjk.oQ), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new cbn.g[]{
                     new cbn.b(cjk.pM, 1, 12, 20),
                     new cbn.b(cjk.nK, 1, 12, 20),
                     new cbn.i(new cjh(cjk.oO), 1, 1, 12, 10, 0.2F),
                     new cbn.i(new cjh(cjk.oP), 4, 1, 12, 10, 0.2F),
                     new cbn.i(new cjh(cjk.uy), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new cbn.g[]{new cbn.e(cjk.oY, 14, 3, 15, 0.2F), new cbn.e(cjk.oZ, 8, 3, 15, 0.2F)},
                  5,
                  new cbn.g[]{new cbn.e(cjk.oW, 8, 3, 30, 0.2F), new cbn.e(cjk.oX, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cbm.p,
            a(
               ImmutableMap.of(
                  1,
                  new cbn.g[]{new cbn.b(cjk.nI, 15, 16, 2), new cbn.i(new cjh(cjk.op), 3, 1, 12, 1, 0.2F), new cbn.e(cjk.om, 2, 3, 1)},
                  2,
                  new cbn.g[]{new cbn.b(cjk.nQ, 4, 12, 10), new cbn.i(new cjh(cjk.vs), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cbn.g[]{new cbn.b(cjk.pi, 24, 12, 20)},
                  4,
                  new cbn.g[]{new cbn.b(cjk.nK, 1, 12, 30), new cbn.e(cjk.ou, 12, 3, 15, 0.2F)},
                  5,
                  new cbn.g[]{new cbn.e(cjk.or, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cbm.o,
            a(
               ImmutableMap.of(
                  1,
                  new cbn.g[]{
                     new cbn.b(cjk.nI, 15, 16, 2),
                     new cbn.i(new cjh(cjk.of), 1, 1, 12, 1, 0.2F),
                     new cbn.i(new cjh(cjk.od), 1, 1, 12, 1, 0.2F),
                     new cbn.i(new cjh(cjk.oe), 1, 1, 12, 1, 0.2F),
                     new cbn.i(new cjh(cjk.og), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cbn.g[]{new cbn.b(cjk.nQ, 4, 12, 10), new cbn.i(new cjh(cjk.vs), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cbn.g[]{
                     new cbn.b(cjk.pi, 30, 12, 20),
                     new cbn.e(cjk.op, 1, 3, 10, 0.2F),
                     new cbn.e(cjk.on, 2, 3, 10, 0.2F),
                     new cbn.e(cjk.oo, 3, 3, 10, 0.2F),
                     new cbn.i(new cjh(cjk.ov), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new cbn.g[]{new cbn.b(cjk.nK, 1, 12, 30), new cbn.e(cjk.ou, 12, 3, 15, 0.2F), new cbn.e(cjk.os, 5, 3, 15, 0.2F)},
                  5,
                  new cbn.g[]{new cbn.e(cjk.ot, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cbm.d,
            a(
               ImmutableMap.of(
                  1,
                  new cbn.g[]{new cbn.b(cjk.rn, 14, 16, 2), new cbn.b(cjk.pj, 7, 16, 2), new cbn.b(cjk.tG, 4, 16, 2), new cbn.i(cjk.tI, 1, 1, 1)},
                  2,
                  new cbn.g[]{new cbn.b(cjk.nI, 15, 16, 2), new cbn.i(cjk.pk, 1, 5, 16, 5), new cbn.i(cjk.ro, 1, 8, 16, 5)},
                  3,
                  new cbn.g[]{new cbn.b(cjk.tT, 7, 16, 20), new cbn.b(cjk.rl, 10, 16, 20)},
                  4,
                  new cbn.g[]{new cbn.b(cjk.pZ, 10, 12, 30)},
                  5,
                  new cbn.g[]{new cbn.b(cjk.vv, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            cbm.j,
            a(
               ImmutableMap.of(
                  1,
                  new cbn.g[]{new cbn.b(cjk.pP, 6, 16, 2), new cbn.a(cjk.oM, 3), new cbn.a(cjk.oL, 7)},
                  2,
                  new cbn.g[]{new cbn.b(cjk.pi, 26, 12, 10), new cbn.a(cjk.oK, 5, 12, 5), new cbn.a(cjk.oN, 4, 12, 5)},
                  3,
                  new cbn.g[]{new cbn.b(cjk.tK, 9, 12, 20), new cbn.a(cjk.oL, 7)},
                  4,
                  new cbn.g[]{new cbn.b(cjk.nD, 4, 12, 30), new cbn.a(cjk.tP, 6, 12, 15)},
                  5,
                  new cbn.g[]{new cbn.i(new cjh(cjk.mZ), 6, 1, 12, 30, 0.2F), new cbn.a(cjk.oK, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            cbm.l,
            a(
               ImmutableMap.of(
                  1,
                  new cbn.g[]{new cbn.b(cjk.pY, 10, 16, 2), new cbn.i(cjk.pX, 1, 10, 16, 1)},
                  2,
                  new cbn.g[]{new cbn.b(csy.b, 20, 16, 10), new cbn.i(csy.eL, 1, 4, 16, 5)},
                  3,
                  new cbn.g[]{
                     new cbn.b(csy.c, 16, 16, 20),
                     new cbn.b(csy.g, 16, 16, 20),
                     new cbn.b(csy.e, 16, 16, 20),
                     new cbn.i(csy.rt, 1, 4, 16, 10),
                     new cbn.i(csy.h, 1, 4, 16, 10),
                     new cbn.i(csy.f, 1, 4, 16, 10),
                     new cbn.i(csy.d, 1, 4, 16, 10)
                  },
                  4,
                  new cbn.g[]{
                     new cbn.b(cjk.nN, 12, 12, 30),
                     new cbn.i(csy.hk, 1, 1, 12, 15),
                     new cbn.i(csy.hj, 1, 1, 12, 15),
                     new cbn.i(csy.hu, 1, 1, 12, 15),
                     new cbn.i(csy.hm, 1, 1, 12, 15),
                     new cbn.i(csy.hq, 1, 1, 12, 15),
                     new cbn.i(csy.hr, 1, 1, 12, 15),
                     new cbn.i(csy.hy, 1, 1, 12, 15),
                     new cbn.i(csy.hx, 1, 1, 12, 15),
                     new cbn.i(csy.hp, 1, 1, 12, 15),
                     new cbn.i(csy.hl, 1, 1, 12, 15),
                     new cbn.i(csy.ho, 1, 1, 12, 15),
                     new cbn.i(csy.hw, 1, 1, 12, 15),
                     new cbn.i(csy.hs, 1, 1, 12, 15),
                     new cbn.i(csy.ht, 1, 1, 12, 15),
                     new cbn.i(csy.hn, 1, 1, 12, 15),
                     new cbn.i(csy.hv, 1, 1, 12, 15),
                     new cbn.i(csy.lh, 1, 1, 12, 15),
                     new cbn.i(csy.lg, 1, 1, 12, 15),
                     new cbn.i(csy.lr, 1, 1, 12, 15),
                     new cbn.i(csy.lj, 1, 1, 12, 15),
                     new cbn.i(csy.ln, 1, 1, 12, 15),
                     new cbn.i(csy.lo, 1, 1, 12, 15),
                     new cbn.i(csy.lv, 1, 1, 12, 15),
                     new cbn.i(csy.lu, 1, 1, 12, 15),
                     new cbn.i(csy.lm, 1, 1, 12, 15),
                     new cbn.i(csy.li, 1, 1, 12, 15),
                     new cbn.i(csy.ll, 1, 1, 12, 15),
                     new cbn.i(csy.lt, 1, 1, 12, 15),
                     new cbn.i(csy.lp, 1, 1, 12, 15),
                     new cbn.i(csy.lq, 1, 1, 12, 15),
                     new cbn.i(csy.lk, 1, 1, 12, 15),
                     new cbn.i(csy.ls, 1, 1, 12, 15)
                  },
                  5,
                  new cbn.g[]{new cbn.i(csy.hf, 1, 1, 12, 30), new cbn.i(csy.hd, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<cbn.g[]> b = a(
      ImmutableMap.of(
         1,
         new cbn.g[]{
            new cbn.i(cjk.cx, 2, 1, 5, 1),
            new cbn.i(cjk.qc, 4, 1, 5, 1),
            new cbn.i(cjk.eY, 2, 1, 5, 1),
            new cbn.i(cjk.uX, 5, 1, 5, 1),
            new cbn.i(cjk.cs, 1, 1, 12, 1),
            new cbn.i(cjk.dn, 1, 1, 8, 1),
            new cbn.i(cjk.eO, 1, 1, 4, 1),
            new cbn.i(cjk.do, 3, 1, 12, 1),
            new cbn.i(cjk.eA, 3, 1, 8, 1),
            new cbn.i(cjk.cO, 1, 1, 12, 1),
            new cbn.i(cjk.cP, 1, 1, 12, 1),
            new cbn.i(cjk.cQ, 1, 1, 8, 1),
            new cbn.i(cjk.cR, 1, 1, 12, 1),
            new cbn.i(cjk.cS, 1, 1, 12, 1),
            new cbn.i(cjk.cT, 1, 1, 12, 1),
            new cbn.i(cjk.cU, 1, 1, 12, 1),
            new cbn.i(cjk.cV, 1, 1, 12, 1),
            new cbn.i(cjk.cW, 1, 1, 12, 1),
            new cbn.i(cjk.cX, 1, 1, 12, 1),
            new cbn.i(cjk.cY, 1, 1, 12, 1),
            new cbn.i(cjk.cZ, 1, 1, 7, 1),
            new cbn.i(cjk.oH, 1, 1, 12, 1),
            new cbn.i(cjk.ur, 1, 1, 12, 1),
            new cbn.i(cjk.rj, 1, 1, 12, 1),
            new cbn.i(cjk.rk, 1, 1, 12, 1),
            new cbn.i(cjk.N, 5, 1, 8, 1),
            new cbn.i(cjk.L, 5, 1, 8, 1),
            new cbn.i(cjk.P, 5, 1, 8, 1),
            new cbn.i(cjk.M, 5, 1, 8, 1),
            new cbn.i(cjk.J, 5, 1, 8, 1),
            new cbn.i(cjk.K, 5, 1, 8, 1),
            new cbn.i(cjk.O, 5, 1, 8, 1),
            new cbn.i(cjk.Q, 5, 1, 8, 1),
            new cbn.i(cjk.qI, 1, 3, 12, 1),
            new cbn.i(cjk.qu, 1, 3, 12, 1),
            new cbn.i(cjk.qF, 1, 3, 12, 1),
            new cbn.i(cjk.qA, 1, 3, 12, 1),
            new cbn.i(cjk.qJ, 1, 3, 12, 1),
            new cbn.i(cjk.qH, 1, 3, 12, 1),
            new cbn.i(cjk.qC, 1, 3, 12, 1),
            new cbn.i(cjk.qw, 1, 3, 12, 1),
            new cbn.i(cjk.qy, 1, 3, 12, 1),
            new cbn.i(cjk.qB, 1, 3, 12, 1),
            new cbn.i(cjk.qE, 1, 3, 12, 1),
            new cbn.i(cjk.qx, 1, 3, 12, 1),
            new cbn.i(cjk.qz, 1, 3, 12, 1),
            new cbn.i(cjk.qv, 1, 3, 12, 1),
            new cbn.i(cjk.qG, 1, 3, 12, 1),
            new cbn.i(cjk.qD, 1, 3, 12, 1),
            new cbn.i(cjk.kb, 3, 1, 8, 1),
            new cbn.i(cjk.kc, 3, 1, 8, 1),
            new cbn.i(cjk.kd, 3, 1, 8, 1),
            new cbn.i(cjk.ke, 3, 1, 8, 1),
            new cbn.i(cjk.ka, 3, 1, 8, 1),
            new cbn.i(cjk.fz, 1, 1, 12, 1),
            new cbn.i(cjk.de, 1, 1, 12, 1),
            new cbn.i(cjk.df, 1, 1, 12, 1),
            new cbn.i(cjk.fF, 1, 2, 5, 1),
            new cbn.i(cjk.du, 1, 2, 5, 1),
            new cbn.i(cjk.S, 1, 8, 8, 1),
            new cbn.i(cjk.V, 1, 4, 6, 1),
            new cbn.i(cjk.wp, 1, 2, 5, 1),
            new cbn.i(cjk.s, 1, 2, 5, 1),
            new cbn.i(cjk.dr, 1, 2, 5, 1)
         },
         2,
         new cbn.g[]{
            new cbn.i(cjk.pU, 5, 1, 4, 1),
            new cbn.i(cjk.pR, 5, 1, 4, 1),
            new cbn.i(cjk.hz, 3, 1, 6, 1),
            new cbn.i(cjk.kz, 6, 1, 6, 1),
            new cbn.i(cjk.oG, 1, 1, 8, 1),
            new cbn.i(cjk.r, 3, 3, 6, 1)
         }
      )
   );
   private static final cbn.l s = new cbn.l(8, aqf.f, "filled_map.village_desert", ebv.a.B, 12, 5);
   private static final cbn.l t = new cbn.l(8, aqf.e, "filled_map.village_savanna", ebv.a.D, 12, 5);
   private static final cbn.l u = new cbn.l(8, aqf.g, "filled_map.village_plains", ebv.a.C, 12, 5);
   private static final cbn.l v = new cbn.l(8, aqf.h, "filled_map.village_taiga", ebv.a.F, 12, 5);
   private static final cbn.l w = new cbn.l(8, aqf.i, "filled_map.village_snowy", ebv.a.E, 12, 5);
   private static final cbn.l x = new cbn.l(8, aqf.j, "filled_map.explorer_jungle", ebv.a.G, 12, 5);
   private static final cbn.l y = new cbn.l(8, aqf.k, "filled_map.explorer_swamp", ebv.a.H, 12, 5);
   public static final Map<cbm, Int2ObjectMap<cbn.g[]>> c = Map.of(
      cbm.k,
      a(
         ImmutableMap.builder()
            .put(1, new cbn.g[]{new cbn.b(cjk.qa, 24, 16, 2), a(1), new cbn.i(csy.cl, 9, 1, 12, 1)})
            .put(2, new cbn.g[]{new cbn.b(cjk.qb, 4, 12, 10), a(5), new cbn.i(cjk.vt, 1, 1, 5)})
            .put(3, new cbn.g[]{new cbn.b(cjk.qr, 5, 12, 20), a(10), new cbn.i(cjk.ck, 1, 4, 10)})
            .put(4, new cbn.g[]{new cbn.b(cjk.tg, 2, 12, 30), new cbn.i(cjk.qi, 5, 1, 15), new cbn.i(cjk.qe, 4, 1, 15)})
            .put(5, new cbn.g[]{a(), new cbn.i(cjk.tR, 20, 1, 30)})
            .build()
      ),
      cbm.c,
      a(
         ImmutableMap.builder()
            .put(1, new cbn.g[]{new cbn.b(cjk.nI, 15, 12, 2), new cbn.b(cjk.nQ, 5, 12, 2)})
            .put(
               2,
               new cbn.g[]{
                  cbn.m.a(new cbn.i(cjk.oV, 4, 1, 12, 5, 0.05F), cbo.a, cbo.c, cbo.d, cbo.e, cbo.g),
                  cbn.m.a(new cbn.i(cjk.oR, 4, 1, 12, 5, 0.05F), cbo.b, cbo.f),
                  cbn.m.a(new cbn.i(cjk.oS, 5, 1, 12, 5, 0.05F), cbo.a, cbo.c, cbo.d, cbo.e, cbo.g),
                  cbn.m.a(new cbn.i(cjk.oO, 5, 1, 12, 5, 0.05F), cbo.b, cbo.f),
                  cbn.m.a(new cbn.i(cjk.oU, 7, 1, 12, 5, 0.05F), cbo.a, cbo.c, cbo.d, cbo.e, cbo.g),
                  cbn.m.a(new cbn.i(cjk.oQ, 7, 1, 12, 5, 0.05F), cbo.b, cbo.f),
                  cbn.m.a(new cbn.i(cjk.oT, 9, 1, 12, 5, 0.05F), cbo.a, cbo.c, cbo.d, cbo.e, cbo.g),
                  cbn.m.a(new cbn.i(cjk.oP, 9, 1, 12, 5, 0.05F), cbo.b, cbo.f)
               }
            )
            .put(3, new cbn.g[]{new cbn.b(cjk.pM, 1, 12, 20), new cbn.i(cjk.uy, 5, 1, 12, 10, 0.05F), new cbn.i(cjk.vs, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new cbn.g[]{
                  cbn.m.a(new cbn.i(a(cjk.oV, cnu.h, 1), 8, 1, 3, 15, 0.05F), cbo.a),
                  cbn.m.a(new cbn.i(a(cjk.oS, cnu.h, 1), 9, 1, 3, 15, 0.05F), cbo.a),
                  cbn.m.a(new cbn.i(a(cjk.oU, cnu.h, 1), 11, 1, 3, 15, 0.05F), cbo.a),
                  cbn.m.a(new cbn.i(a(cjk.oT, cnu.h, 1), 13, 1, 3, 15, 0.05F), cbo.a),
                  cbn.m.a(new cbn.i(a(cjk.oV, cnu.a, 1), 8, 1, 3, 15, 0.05F), cbo.c),
                  cbn.m.a(new cbn.i(a(cjk.oS, cnu.a, 1), 9, 1, 3, 15, 0.05F), cbo.c),
                  cbn.m.a(new cbn.i(a(cjk.oU, cnu.a, 1), 11, 1, 3, 15, 0.05F), cbo.c),
                  cbn.m.a(new cbn.i(a(cjk.oT, cnu.a, 1), 13, 1, 3, 15, 0.05F), cbo.c),
                  cbn.m.a(new cbn.i(a(cjk.oV, cnu.k, 1), 2, 1, 3, 15, 0.05F), cbo.d),
                  cbn.m.a(new cbn.i(a(cjk.oS, cnu.k, 1), 3, 1, 3, 15, 0.05F), cbo.d),
                  cbn.m.a(new cbn.i(a(cjk.oU, cnu.k, 1), 5, 1, 3, 15, 0.05F), cbo.d),
                  cbn.m.a(new cbn.i(a(cjk.oT, cnu.k, 1), 7, 1, 3, 15, 0.05F), cbo.d),
                  cbn.m.a(new cbn.i(a(cjk.oV, cnu.j, 1), 8, 1, 3, 15, 0.05F), cbo.e),
                  cbn.m.a(new cbn.i(a(cjk.oS, cnu.g, 1), 9, 1, 3, 15, 0.05F), cbo.e),
                  cbn.m.a(new cbn.i(a(cjk.oR, cnu.w, 1), 8, 1, 3, 15, 0.05F), cbo.b),
                  cbn.m.a(new cbn.i(a(cjk.oO, cnu.w, 1), 9, 1, 3, 15, 0.05F), cbo.b),
                  cbn.m.a(new cbn.i(a(cjk.oQ, cnu.w, 1), 11, 1, 3, 15, 0.05F), cbo.b),
                  cbn.m.a(new cbn.i(a(cjk.oP, cnu.w, 1), 13, 1, 3, 15, 0.05F), cbo.b),
                  cbn.m.a(new cbn.i(a(cjk.oR, cnu.L, 1), 8, 1, 3, 15, 0.05F), cbo.f),
                  cbn.m.a(new cbn.i(a(cjk.oO, cnu.L, 1), 9, 1, 3, 15, 0.05F), cbo.f),
                  cbn.m.a(new cbn.i(a(cjk.oQ, cnu.L, 1), 11, 1, 3, 15, 0.05F), cbo.f),
                  cbn.m.a(new cbn.i(a(cjk.oP, cnu.L, 1), 13, 1, 3, 15, 0.05F), cbo.f),
                  cbn.m.a(new cbn.h(cjk.oZ, 1, 4, cjk.oY, 1, 3, 15, 0.05F), cbo.g),
                  cbn.m.a(new cbn.h(cjk.oY, 1, 4, cjk.oX, 1, 3, 15, 0.05F), cbo.g),
                  cbn.m.a(new cbn.h(cjk.oW, 1, 4, cjk.oZ, 1, 3, 15, 0.05F), cbo.g),
                  cbn.m.a(new cbn.h(cjk.oX, 1, 2, cjk.oW, 1, 3, 15, 0.05F), cbo.g)
               }
            )
            .put(
               5,
               new cbn.g[]{
                  cbn.m.a(new cbn.h(cjk.nK, 4, 16, a(cjk.oX, cnu.h, 1), 1, 3, 30, 0.05F), cbo.a),
                  cbn.m.a(new cbn.h(cjk.nK, 3, 16, a(cjk.oY, cnu.h, 1), 1, 3, 30, 0.05F), cbo.a),
                  cbn.m.a(new cbn.h(cjk.nK, 3, 16, a(cjk.oY, cnu.a, 1), 1, 3, 30, 0.05F), cbo.c),
                  cbn.m.a(new cbn.h(cjk.nK, 2, 12, a(cjk.oZ, cnu.a, 1), 1, 3, 30, 0.05F), cbo.c),
                  cbn.m.a(new cbn.h(cjk.nK, 2, 6, a(cjk.oW, cnu.k, 1), 1, 3, 30, 0.05F), cbo.d),
                  cbn.m.a(new cbn.h(cjk.nK, 3, 8, a(cjk.oX, cnu.k, 1), 1, 3, 30, 0.05F), cbo.d),
                  cbn.m.a(new cbn.h(cjk.nK, 2, 12, a(cjk.oZ, cnu.j, 1), 1, 3, 30, 0.05F), cbo.e),
                  cbn.m.a(new cbn.h(cjk.nK, 3, 12, a(cjk.oW, cnu.g, 1), 1, 3, 30, 0.05F), cbo.e),
                  cbn.m.a(new cbn.i(a(cjk.oO, cnu.e, 1), 9, 1, 3, 30, 0.05F), cbo.b),
                  cbn.m.a(new cbn.i(a(cjk.oR, cnu.c, 1), 8, 1, 3, 30, 0.05F), cbo.b),
                  cbn.m.a(new cbn.i(a(cjk.oO, cnu.f, 1), 9, 1, 3, 30, 0.05F), cbo.f),
                  cbn.m.a(new cbn.i(a(cjk.oR, cnu.i, 1), 8, 1, 3, 30, 0.05F), cbo.f),
                  cbn.m.a(new cbn.h(cjk.nK, 4, 18, a(cjk.oX, cnu.d, 1), 1, 3, 30, 0.05F), cbo.g),
                  cbn.m.a(new cbn.h(cjk.nK, 3, 18, a(cjk.oY, cnu.d, 1), 1, 3, 30, 0.05F), cbo.g),
                  cbn.m.a(new cbn.b(cjk.az, 1, 12, 30, 42), cbo.g),
                  cbn.m.a(new cbn.b(cjk.aw, 1, 12, 30, 4), cbo.a, cbo.b, cbo.c, cbo.d, cbo.e, cbo.f)
               }
            )
            .build()
      ),
      cbm.e,
      a(
         ImmutableMap.of(
            1,
            new cbn.g[]{new cbn.b(cjk.qa, 24, 16, 2), new cbn.i(cjk.tp, 7, 1, 1)},
            2,
            new cbn.g[]{
               new cbn.b(cjk.fx, 11, 16, 10),
               new cbn.m(ImmutableMap.builder().put(cbo.a, t).put(cbo.d, u).put(cbo.c, v).put(cbo.g, w).put(cbo.e, u).put(cbo.b, t).put(cbo.f, w).build()),
               new cbn.m(ImmutableMap.builder().put(cbo.a, u).put(cbo.d, s).put(cbo.c, t).put(cbo.g, u).put(cbo.e, v).put(cbo.b, s).put(cbo.f, v).build()),
               new cbn.m(
                  ImmutableMap.builder().put(cbo.a, x).put(cbo.d, x).put(cbo.c, new cbn.f()).put(cbo.g, y).put(cbo.e, y).put(cbo.b, y).put(cbo.f, x).build()
               )
            },
            3,
            new cbn.g[]{new cbn.b(cjk.qe, 1, 12, 20), new cbn.l(13, aqf.d, "filled_map.monument", ebv.a.j, 12, 10)},
            4,
            new cbn.g[]{
               new cbn.i(cjk.ti, 7, 1, 15),
               new cbn.i(cjk.tV, 3, 1, 15),
               new cbn.i(cjk.ug, 3, 1, 15),
               new cbn.i(cjk.tY, 3, 1, 15),
               new cbn.i(cjk.uj, 3, 1, 15),
               new cbn.i(cjk.ub, 3, 1, 15),
               new cbn.i(cjk.ui, 3, 1, 15),
               new cbn.i(cjk.ua, 3, 1, 15),
               new cbn.i(cjk.uc, 3, 1, 15),
               new cbn.i(cjk.uk, 3, 1, 15),
               new cbn.i(cjk.uf, 3, 1, 15),
               new cbn.i(cjk.tX, 3, 1, 15),
               new cbn.i(cjk.ue, 3, 1, 15),
               new cbn.i(cjk.uh, 3, 1, 15),
               new cbn.i(cjk.tZ, 3, 1, 15),
               new cbn.i(cjk.tW, 3, 1, 15),
               new cbn.i(cjk.ud, 3, 1, 15)
            },
            5,
            new cbn.g[]{new cbn.i(cjk.vg, 8, 1, 30), new cbn.l(14, aqf.c, "filled_map.mansion", ebv.a.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<cbn.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new cbn.g[]{
               new cbn.b(a(clh.c), 1, 1, 1),
               new cbn.b(cjk.pL, 1, 1, 1, 2),
               new cbn.b(cjk.pQ, 1, 1, 1, 2),
               new cbn.b(cjk.ry, 1, 1, 1, 3),
               new cbn.b(cjk.tn, 4, 1, 1),
               new cbn.b(cjk.hh, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cbn.g[]{
               new cbn.i(cjk.hz, 1, 1, 6, 1),
               new cbn.i(cjk.kz, 6, 1, 6, 1),
               new cbn.i(cjk.oG, 1, 4, 2, 1),
               new cbn.i(cjk.r, 3, 3, 6, 1),
               new cbn.i(csy.Y, 1, 8, 4, 1),
               new cbn.i(csy.W, 1, 8, 4, 1),
               new cbn.i(csy.aa, 1, 8, 4, 1),
               new cbn.i(csy.X, 1, 8, 4, 1),
               new cbn.i(csy.U, 1, 8, 4, 1),
               new cbn.i(csy.V, 1, 8, 4, 1),
               new cbn.i(csy.Z, 1, 8, 4, 1),
               new cbn.e(cjk.oo, 1, 1, 1, 0.2F),
               new cbn.i(a(clh.j), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cbn.g[]{
               new cbn.i(cjk.pU, 3, 1, 4, 1),
               new cbn.i(cjk.pR, 3, 1, 4, 1),
               new cbn.i(cjk.cx, 2, 1, 5, 1),
               new cbn.i(cjk.qc, 4, 1, 5, 1),
               new cbn.i(cjk.eY, 2, 1, 5, 1),
               new cbn.i(cjk.uX, 5, 1, 5, 1),
               new cbn.i(cjk.cs, 1, 1, 12, 1),
               new cbn.i(cjk.dn, 1, 1, 8, 1),
               new cbn.i(cjk.eO, 1, 1, 4, 1),
               new cbn.i(cjk.do, 3, 1, 12, 1),
               new cbn.i(cjk.eA, 3, 1, 8, 1),
               new cbn.i(cjk.cO, 1, 1, 12, 1),
               new cbn.i(cjk.cP, 1, 1, 12, 1),
               new cbn.i(cjk.cQ, 1, 1, 8, 1),
               new cbn.i(cjk.cR, 1, 1, 12, 1),
               new cbn.i(cjk.cS, 1, 1, 12, 1),
               new cbn.i(cjk.cT, 1, 1, 12, 1),
               new cbn.i(cjk.cU, 1, 1, 12, 1),
               new cbn.i(cjk.cV, 1, 1, 12, 1),
               new cbn.i(cjk.cW, 1, 1, 12, 1),
               new cbn.i(cjk.cX, 1, 1, 12, 1),
               new cbn.i(cjk.cY, 1, 1, 12, 1),
               new cbn.i(cjk.cZ, 1, 1, 7, 1),
               new cbn.i(cjk.oH, 1, 1, 12, 1),
               new cbn.i(cjk.ur, 1, 1, 12, 1),
               new cbn.i(cjk.rj, 1, 1, 12, 1),
               new cbn.i(cjk.rk, 1, 1, 12, 1),
               new cbn.i(cjk.N, 5, 1, 8, 1),
               new cbn.i(cjk.L, 5, 1, 8, 1),
               new cbn.i(cjk.P, 5, 1, 8, 1),
               new cbn.i(cjk.M, 5, 1, 8, 1),
               new cbn.i(cjk.J, 5, 1, 8, 1),
               new cbn.i(cjk.K, 5, 1, 8, 1),
               new cbn.i(cjk.O, 5, 1, 8, 1),
               new cbn.i(cjk.Q, 5, 1, 8, 1),
               new cbn.i(cjk.qI, 1, 3, 12, 1),
               new cbn.i(cjk.qu, 1, 3, 12, 1),
               new cbn.i(cjk.qF, 1, 3, 12, 1),
               new cbn.i(cjk.qA, 1, 3, 12, 1),
               new cbn.i(cjk.qJ, 1, 3, 12, 1),
               new cbn.i(cjk.qH, 1, 3, 12, 1),
               new cbn.i(cjk.qC, 1, 3, 12, 1),
               new cbn.i(cjk.qw, 1, 3, 12, 1),
               new cbn.i(cjk.qy, 1, 3, 12, 1),
               new cbn.i(cjk.qB, 1, 3, 12, 1),
               new cbn.i(cjk.qE, 1, 3, 12, 1),
               new cbn.i(cjk.qx, 1, 3, 12, 1),
               new cbn.i(cjk.qz, 1, 3, 12, 1),
               new cbn.i(cjk.qv, 1, 3, 12, 1),
               new cbn.i(cjk.qG, 1, 3, 12, 1),
               new cbn.i(cjk.qD, 1, 3, 12, 1),
               new cbn.i(cjk.kb, 3, 1, 8, 1),
               new cbn.i(cjk.kc, 3, 1, 8, 1),
               new cbn.i(cjk.kd, 3, 1, 8, 1),
               new cbn.i(cjk.ke, 3, 1, 8, 1),
               new cbn.i(cjk.ka, 3, 1, 8, 1),
               new cbn.i(cjk.fz, 1, 3, 4, 1),
               new cbn.i(cjk.de, 1, 3, 4, 1),
               new cbn.i(cjk.df, 1, 3, 4, 1),
               new cbn.i(cjk.fF, 1, 5, 2, 1),
               new cbn.i(cjk.du, 1, 2, 5, 1),
               new cbn.i(cjk.S, 1, 8, 8, 1),
               new cbn.i(cjk.V, 1, 4, 6, 1),
               new cbn.i(cjk.wp, 1, 2, 5, 1),
               new cbn.i(cjk.s, 1, 2, 5, 1),
               new cbn.i(cjk.dr, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static cbn.g a(int $$0) {
      return new cbn.m(
         ImmutableMap.builder()
            .put(cbo.a, new cbn.d($$0, cnu.b, cnu.h, cnu.B))
            .put(cbo.b, new cbn.d($$0, cnu.c, cnu.e, cnu.y))
            .put(cbo.c, new cbn.d($$0, cnu.z, cnu.o, cnu.p))
            .put(cbo.d, new cbn.d($$0, cnu.q, cnu.k, cnu.t))
            .put(cbo.e, new cbn.d($$0, cnu.g, cnu.s, cnu.j))
            .put(cbo.f, new cbn.d($$0, cnu.i, cnu.f, cnu.M))
            .put(cbo.g, new cbn.d($$0, cnu.d, cnu.r, cnu.A))
            .build()
      );
   }

   private static cbn.g a() {
      return new cbn.m(
         ImmutableMap.builder()
            .put(cbo.a, new cbn.d(30, 3, 3, cnu.u))
            .put(cbo.b, new cbn.d(30, 2, 2, cnu.w))
            .put(cbo.c, new cbn.d(30, 3, 3, cnu.a))
            .put(cbo.d, new cbn.d(30, 3, 3, cnu.n))
            .put(cbo.e, new cbn.d(30, cnu.v))
            .put(cbo.f, new cbn.d(30, cnu.L))
            .put(cbo.g, new cbn.d(30, 2, 2, cnu.x))
            .build()
      );
   }

   private static Int2ObjectMap<cbn.g[]> a(ImmutableMap<Integer, cbn.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static cjh a(cle $$0) {
      return clg.a(new cjh(cjk.rv), $$0);
   }

   private static cjh a(cjc $$0, cnq $$1, int $$2) {
      cjh $$3 = new cjh($$0);
      $$3.a($$1, $$2);
      return $$3;
   }

   static class a implements cbn.g {
      private final cjc a;
      private final int b;
      private final int c;
      private final int d;

      public a(cjc $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(cjc $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public cov a(bis $$0, ase $$1) {
         cjh $$2 = new cjh(cjk.nL, this.b);
         cjh $$3 = new cjh(this.a);
         if (this.a instanceof chx) {
            List<chw> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = chz.a($$3, $$4);
         }

         return new cov($$2, $$3, this.c, this.d, 0.2F);
      }

      private static chw a(ase $$0) {
         return chw.a(chv.a($$0.a(16)));
      }
   }

   static class b implements cbn.g {
      private final cjh a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(cpw $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(cpw $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cjh($$0.k(), $$1), $$2, $$3, $$4);
      }

      public b(cjh $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public cov a(bis $$0, ase $$1) {
         return new cov(this.a.p(), new cjh(cjk.nL, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements cbn.g {
      private final Map<cbo, cjc> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<cbo, cjc> $$3) {
         jd.z.s().filter($$1x -> !$$3.containsKey($$1x)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + jd.z.b($$0x));
         });
         this.a = $$3;
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Nullable
      @Override
      public cov a(bis $$0, ase $$1) {
         if ($$0 instanceof cbl $$2) {
            cjh $$3 = new cjh(this.a.get($$2.go().a()), this.b);
            return new cov($$3, new cjh(cjk.nL), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements cbn.g {
      private final int a;
      private final List<cnq> b;
      private final int c;
      private final int d;

      public d(int $$0) {
         this($$0, jd.g.s().filter(cnq::h).toArray(cnq[]::new));
      }

      public d(int $$0, cnq... $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, cnq... $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = Arrays.asList($$3);
      }

      @Override
      public cov a(bis $$0, ase $$1) {
         cnq $$2 = this.b.get($$1.a(this.b.size()));
         int $$3 = Math.max($$2.e(), this.c);
         int $$4 = Math.min($$2.a(), this.d);
         int $$5 = ary.a($$1, $$3, $$4);
         cjh $$6 = cid.a(new cnt($$2, $$5));
         int $$7 = 2 + $$1.a(5 + $$5 * 10) + 3 * $$5;
         if ($$2.b()) {
            $$7 *= 2;
         }

         if ($$7 > 64) {
            $$7 = 64;
         }

         return new cov(new cjh(cjk.nL, $$7), new cjh(cjk.qb), $$6, 12, this.a, 0.2F);
      }
   }

   static class e implements cbn.g {
      private final cjh a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(cjc $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(cjc $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new cjh($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public cov a(bis $$0, ase $$1) {
         int $$2 = 5 + $$1.a(15);
         cjh $$3 = cns.a($$1, new cjh(this.a.d()), $$2, false);
         int $$4 = Math.min(this.b + $$2, 64);
         cjh $$5 = new cjh(cjk.nL, $$4);
         return new cov($$5, $$3, this.c, this.d, this.e);
      }
   }

   static class f implements cbn.g {
      @Override
      public cov a(bis $$0, ase $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      cov a(bis var1, ase var2);
   }

   static class h implements cbn.g {
      private final cjh a;
      private final int b;
      private final cjh c;
      private final int d;
      private final int e;
      private final float f;

      public h(cpw $$0, int $$1, int $$2, cjc $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new cjh($$3), $$4, $$5, $$6, $$7);
      }

      public h(cpw $$0, int $$1, int $$2, cjh $$3, int $$4, int $$5, int $$6, float $$7) {
         this.a = new cjh($$0, $$1);
         this.b = $$2;
         this.c = $$3.c($$4);
         this.d = $$5;
         this.e = $$6;
         this.f = $$7;
      }

      @Nullable
      @Override
      public cov a(bis $$0, ase $$1) {
         return new cov(new cjh(cjk.nL, this.b), this.a.p(), this.c.p(), this.d, this.e, this.f);
      }
   }

   static class i implements cbn.g {
      private final cjh a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public i(csx $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cjh($$0), $$1, $$2, $$3, $$4);
      }

      public i(cjc $$0, int $$1, int $$2, int $$3) {
         this(new cjh($$0), $$1, $$2, 12, $$3);
      }

      public i(cjc $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cjh($$0), $$1, $$2, $$3, $$4);
      }

      public i(cjh $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(cjc $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new cjh($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(cjh $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.a.f($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
      }

      @Override
      public cov a(bis $$0, ase $$1) {
         return new cov(new cjh(cjk.nL, this.b), this.a.p(), this.c, this.d, this.e);
      }
   }

   static class j implements cbn.g {
      private final List<dba.a> a;
      private final int b;
      private final float c;

      public j(bid $$0, int $$1, int $$2) {
         this(List.of(new dba.a($$0, $$1)), $$2, 0.05F);
      }

      public j(List<dba.a> $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public cov a(bis $$0, ase $$1) {
         cjh $$2 = new cjh(cjk.va, 1);
         ckr.a($$2, this.a);
         return new cov(new cjh(cjk.nL, 1), $$2, 12, this.b, this.c);
      }
   }

   static class k implements cbn.g {
      private final cjh a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final cjc f;
      private final int g;
      private final float h;

      public k(cjc $$0, int $$1, cjc $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new cjh($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public cov a(bis $$0, ase $$1) {
         cjh $$2 = new cjh(cjk.nL, this.c);
         List<cle> $$3 = jd.j.s().filter($$0x -> !$$0x.a().isEmpty() && clf.a($$0x)).collect(Collectors.toList());
         cle $$4 = $$3.get($$1.a($$3.size()));
         cjh $$5 = clg.a(new cjh(this.a.d(), this.b), $$4);
         return new cov($$2, new cjh(this.f, this.g), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements cbn.g {
      private final int a;
      private final aqj<dvk> b;
      private final String c;
      private final ebv.a d;
      private final int e;
      private final int f;

      public l(int $$0, aqj<dvk> $$1, String $$2, ebv.a $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public cov a(bis $$0, ase $$1) {
         if (!($$0.dL() instanceof aks)) {
            return null;
         } else {
            aks $$2 = (aks)$$0.dL();
            gw $$3 = $$2.a(this.b, $$0.dl(), 100, true);
            if ($$3 != null) {
               cjh $$4 = cjo.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               cjo.a($$2, $$4);
               eby.a($$4, $$3, "+", this.d);
               $$4.a(tn.c(this.c));
               return new cov(new cjh(cjk.nL, this.a), new cjh(cjk.qe), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static record m(Map<cbo, cbn.g> a) implements cbn.g {
      public static cbn.m a(cbn.g $$0, cbo... $$1) {
         return new cbn.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public cov a(bis $$0, ase $$1) {
         if ($$0 instanceof cbl $$2) {
            cbo $$3 = $$2.go().a();
            cbn.g $$4 = this.a.get($$3);
            return $$4 == null ? null : $$4.a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
