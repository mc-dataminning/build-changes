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

public class cco {
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
   public static final Map<ccn, Int2ObjectMap<cco.g[]>> a = ac.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            ccn.g,
            a(
               ImmutableMap.of(
                  1,
                  new cco.g[]{
                     new cco.b(ckm.oI, 20, 16, 2),
                     new cco.b(ckm.tm, 26, 16, 2),
                     new cco.b(ckm.tl, 22, 16, 2),
                     new cco.b(ckm.uq, 15, 16, 2),
                     new cco.i(ckm.oJ, 1, 6, 16, 1)
                  },
                  2,
                  new cco.g[]{new cco.b(cuc.eZ, 6, 12, 10), new cco.i(ckm.tz, 1, 4, 5), new cco.i(ckm.nF, 1, 4, 16, 5)},
                  3,
                  new cco.g[]{new cco.i(ckm.re, 3, 18, 10), new cco.b(cuc.fa, 4, 12, 20)},
                  4,
                  new cco.g[]{
                     new cco.i(cuc.eg, 1, 1, 12, 15),
                     new cco.j(bji.p, 100, 15),
                     new cco.j(bji.h, 160, 15),
                     new cco.j(bji.r, 140, 15),
                     new cco.j(bji.o, 120, 15),
                     new cco.j(bji.s, 280, 15),
                     new cco.j(bji.w, 7, 15)
                  },
                  5,
                  new cco.g[]{new cco.i(ckm.tq, 3, 3, 30), new cco.i(ckm.rE, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            ccn.h,
            a(
               ImmutableMap.of(
                  1,
                  new cco.g[]{
                     new cco.b(ckm.oE, 20, 16, 2),
                     new cco.b(ckm.nI, 10, 16, 2),
                     new cco.h(ckm.ql, 6, 1, ckm.qp, 6, 16, 1, 0.05F),
                     new cco.i(ckm.pT, 3, 1, 16, 1)
                  },
                  2,
                  new cco.g[]{new cco.b(ckm.ql, 15, 16, 10), new cco.h(ckm.qm, 6, 1, ckm.qq, 6, 16, 5, 0.05F), new cco.i(ckm.vx, 2, 1, 5)},
                  3,
                  new cco.g[]{new cco.b(ckm.qm, 13, 16, 20), new cco.e(ckm.qh, 3, 3, 10, 0.2F)},
                  4,
                  new cco.g[]{new cco.b(ckm.qn, 6, 12, 30)},
                  5,
                  new cco.g[]{
                     new cco.b(ckm.qo, 4, 12, 30),
                     new cco.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(ccp.c, ckm.ni)
                           .put(ccp.g, ckm.nk)
                           .put(ccp.e, ckm.nk)
                           .put(ccp.a, ckm.no)
                           .put(ccp.b, ckm.no)
                           .put(ccp.d, ckm.nq)
                           .put(ccp.f, ckm.nu)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            ccn.n,
            a(
               ImmutableMap.of(
                  1,
                  new cco.g[]{
                     new cco.b(cuc.bA, 18, 16, 2),
                     new cco.b(cuc.bM, 18, 16, 2),
                     new cco.b(cuc.bP, 18, 16, 2),
                     new cco.b(cuc.bH, 18, 16, 2),
                     new cco.i(ckm.rg, 2, 1, 1)
                  },
                  2,
                  new cco.g[]{
                     new cco.b(ckm.qu, 12, 16, 10),
                     new cco.b(ckm.qB, 12, 16, 10),
                     new cco.b(ckm.qJ, 12, 16, 10),
                     new cco.b(ckm.qx, 12, 16, 10),
                     new cco.b(ckm.qz, 12, 16, 10),
                     new cco.i(cuc.bA, 1, 1, 16, 5),
                     new cco.i(cuc.bB, 1, 1, 16, 5),
                     new cco.i(cuc.bC, 1, 1, 16, 5),
                     new cco.i(cuc.bD, 1, 1, 16, 5),
                     new cco.i(cuc.bE, 1, 1, 16, 5),
                     new cco.i(cuc.bF, 1, 1, 16, 5),
                     new cco.i(cuc.bG, 1, 1, 16, 5),
                     new cco.i(cuc.bH, 1, 1, 16, 5),
                     new cco.i(cuc.bI, 1, 1, 16, 5),
                     new cco.i(cuc.bJ, 1, 1, 16, 5),
                     new cco.i(cuc.bK, 1, 1, 16, 5),
                     new cco.i(cuc.bL, 1, 1, 16, 5),
                     new cco.i(cuc.bM, 1, 1, 16, 5),
                     new cco.i(cuc.bN, 1, 1, 16, 5),
                     new cco.i(cuc.bO, 1, 1, 16, 5),
                     new cco.i(cuc.bP, 1, 1, 16, 5),
                     new cco.i(cuc.ik, 1, 4, 16, 5),
                     new cco.i(cuc.il, 1, 4, 16, 5),
                     new cco.i(cuc.im, 1, 4, 16, 5),
                     new cco.i(cuc.in, 1, 4, 16, 5),
                     new cco.i(cuc.io, 1, 4, 16, 5),
                     new cco.i(cuc.ip, 1, 4, 16, 5),
                     new cco.i(cuc.iq, 1, 4, 16, 5),
                     new cco.i(cuc.ir, 1, 4, 16, 5),
                     new cco.i(cuc.is, 1, 4, 16, 5),
                     new cco.i(cuc.it, 1, 4, 16, 5),
                     new cco.i(cuc.iu, 1, 4, 16, 5),
                     new cco.i(cuc.iv, 1, 4, 16, 5),
                     new cco.i(cuc.iw, 1, 4, 16, 5),
                     new cco.i(cuc.ix, 1, 4, 16, 5),
                     new cco.i(cuc.iy, 1, 4, 16, 5),
                     new cco.i(cuc.iz, 1, 4, 16, 5)
                  },
                  3,
                  new cco.g[]{
                     new cco.b(ckm.qy, 12, 16, 20),
                     new cco.b(ckm.qC, 12, 16, 20),
                     new cco.b(ckm.qv, 12, 16, 20),
                     new cco.b(ckm.qI, 12, 16, 20),
                     new cco.b(ckm.qA, 12, 16, 20),
                     new cco.i(cuc.aZ, 3, 1, 12, 10),
                     new cco.i(cuc.bd, 3, 1, 12, 10),
                     new cco.i(cuc.bn, 3, 1, 12, 10),
                     new cco.i(cuc.bo, 3, 1, 12, 10),
                     new cco.i(cuc.bk, 3, 1, 12, 10),
                     new cco.i(cuc.bl, 3, 1, 12, 10),
                     new cco.i(cuc.bi, 3, 1, 12, 10),
                     new cco.i(cuc.bg, 3, 1, 12, 10),
                     new cco.i(cuc.bm, 3, 1, 12, 10),
                     new cco.i(cuc.bc, 3, 1, 12, 10),
                     new cco.i(cuc.bh, 3, 1, 12, 10),
                     new cco.i(cuc.be, 3, 1, 12, 10),
                     new cco.i(cuc.bb, 3, 1, 12, 10),
                     new cco.i(cuc.ba, 3, 1, 12, 10),
                     new cco.i(cuc.bf, 3, 1, 12, 10),
                     new cco.i(cuc.bj, 3, 1, 12, 10)
                  },
                  4,
                  new cco.g[]{
                     new cco.b(ckm.qG, 12, 16, 30),
                     new cco.b(ckm.qE, 12, 16, 30),
                     new cco.b(ckm.qF, 12, 16, 30),
                     new cco.b(ckm.qH, 12, 16, 30),
                     new cco.b(ckm.qw, 12, 16, 30),
                     new cco.b(ckm.qD, 12, 16, 30),
                     new cco.i(ckm.tV, 3, 1, 12, 15),
                     new cco.i(ckm.ug, 3, 1, 12, 15),
                     new cco.i(ckm.tY, 3, 1, 12, 15),
                     new cco.i(ckm.uj, 3, 1, 12, 15),
                     new cco.i(ckm.ub, 3, 1, 12, 15),
                     new cco.i(ckm.ui, 3, 1, 12, 15),
                     new cco.i(ckm.ua, 3, 1, 12, 15),
                     new cco.i(ckm.uc, 3, 1, 12, 15),
                     new cco.i(ckm.uk, 3, 1, 12, 15),
                     new cco.i(ckm.uf, 3, 1, 12, 15),
                     new cco.i(ckm.tX, 3, 1, 12, 15),
                     new cco.i(ckm.ue, 3, 1, 12, 15),
                     new cco.i(ckm.uh, 3, 1, 12, 15),
                     new cco.i(ckm.tZ, 3, 1, 12, 15),
                     new cco.i(ckm.tW, 3, 1, 12, 15),
                     new cco.i(ckm.ud, 3, 1, 12, 15)
                  },
                  5,
                  new cco.g[]{new cco.i(ckm.pl, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            ccn.i,
            a(
               ImmutableMap.of(
                  1,
                  new cco.g[]{new cco.b(ckm.oB, 32, 16, 2), new cco.i(ckm.nH, 1, 16, 1), new cco.h(cuc.L, 10, 1, ckm.pi, 10, 12, 1, 0.05F)},
                  2,
                  new cco.g[]{new cco.b(ckm.pi, 26, 12, 10), new cco.i(ckm.nG, 2, 1, 5)},
                  3,
                  new cco.g[]{new cco.b(ckm.oE, 14, 16, 20), new cco.i(ckm.uZ, 3, 1, 10)},
                  4,
                  new cco.g[]{new cco.b(ckm.oF, 24, 16, 30), new cco.e(ckm.nG, 2, 3, 15)},
                  5,
                  new cco.g[]{new cco.b(ckm.lF, 8, 12, 30), new cco.e(ckm.uZ, 3, 3, 15), new cco.k(ckm.nH, 5, ckm.uw, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            ccn.k,
            a(
               ImmutableMap.builder()
                  .put(1, new cco.g[]{new cco.b(ckm.qa, 24, 16, 2), new cco.d(1), new cco.i(cuc.cl, 9, 1, 12, 1)})
                  .put(2, new cco.g[]{new cco.b(ckm.qb, 4, 12, 10), new cco.d(5), new cco.i(ckm.vt, 1, 1, 5)})
                  .put(3, new cco.g[]{new cco.b(ckm.qr, 5, 12, 20), new cco.d(10), new cco.i(ckm.ck, 1, 4, 10)})
                  .put(4, new cco.g[]{new cco.b(ckm.tg, 2, 12, 30), new cco.d(15), new cco.i(ckm.qi, 5, 1, 15), new cco.i(ckm.qe, 4, 1, 15)})
                  .put(5, new cco.g[]{new cco.i(ckm.tR, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            ccn.e,
            a(
               ImmutableMap.of(
                  1,
                  new cco.g[]{new cco.b(ckm.qa, 24, 16, 2), new cco.i(ckm.tp, 7, 1, 1)},
                  2,
                  new cco.g[]{new cco.b(ckm.fx, 11, 16, 10), new cco.l(13, ard.d, "filled_map.monument", ecl.a.j, 12, 5)},
                  3,
                  new cco.g[]{new cco.b(ckm.qe, 1, 12, 20), new cco.l(14, ard.c, "filled_map.mansion", ecl.a.i, 12, 10)},
                  4,
                  new cco.g[]{
                     new cco.i(ckm.ti, 7, 1, 15),
                     new cco.i(ckm.tV, 3, 1, 15),
                     new cco.i(ckm.ug, 3, 1, 15),
                     new cco.i(ckm.tY, 3, 1, 15),
                     new cco.i(ckm.uj, 3, 1, 15),
                     new cco.i(ckm.ub, 3, 1, 15),
                     new cco.i(ckm.ui, 3, 1, 15),
                     new cco.i(ckm.ua, 3, 1, 15),
                     new cco.i(ckm.uc, 3, 1, 15),
                     new cco.i(ckm.uk, 3, 1, 15),
                     new cco.i(ckm.uf, 3, 1, 15),
                     new cco.i(ckm.tX, 3, 1, 15),
                     new cco.i(ckm.ue, 3, 1, 15),
                     new cco.i(ckm.uh, 3, 1, 15),
                     new cco.i(ckm.tZ, 3, 1, 15),
                     new cco.i(ckm.tW, 3, 1, 15),
                     new cco.i(ckm.ud, 3, 1, 15)
                  },
                  5,
                  new cco.g[]{new cco.i(ckm.vg, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            ccn.f,
            a(
               ImmutableMap.of(
                  1,
                  new cco.g[]{new cco.b(ckm.rp, 32, 16, 2), new cco.i(ckm.ll, 1, 2, 1)},
                  2,
                  new cco.g[]{new cco.b(ckm.nU, 3, 12, 10), new cco.i(ckm.nM, 1, 1, 5)},
                  3,
                  new cco.g[]{new cco.b(ckm.tJ, 2, 12, 20), new cco.i(cuc.ec, 4, 1, 12, 10)},
                  4,
                  new cco.g[]{new cco.b(ckm.nD, 4, 12, 30), new cco.b(ckm.rw, 9, 12, 30), new cco.i(ckm.rq, 5, 1, 15)},
                  5,
                  new cco.g[]{new cco.b(ckm.ru, 22, 12, 30), new cco.i(ckm.te, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            ccn.c,
            a(
               ImmutableMap.of(
                  1,
                  new cco.g[]{
                     new cco.b(ckm.nI, 15, 16, 2),
                     new cco.i(new ckj(ckm.oU), 7, 1, 12, 1, 0.2F),
                     new cco.i(new ckj(ckm.oV), 4, 1, 12, 1, 0.2F),
                     new cco.i(new ckj(ckm.oS), 5, 1, 12, 1, 0.2F),
                     new cco.i(new ckj(ckm.oT), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cco.g[]{
                     new cco.b(ckm.nQ, 4, 12, 10),
                     new cco.i(new ckj(ckm.vs), 36, 1, 12, 5, 0.2F),
                     new cco.i(new ckj(ckm.oR), 1, 1, 12, 5, 0.2F),
                     new cco.i(new ckj(ckm.oQ), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new cco.g[]{
                     new cco.b(ckm.pM, 1, 12, 20),
                     new cco.b(ckm.nK, 1, 12, 20),
                     new cco.i(new ckj(ckm.oO), 1, 1, 12, 10, 0.2F),
                     new cco.i(new ckj(ckm.oP), 4, 1, 12, 10, 0.2F),
                     new cco.i(new ckj(ckm.uy), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new cco.g[]{new cco.e(ckm.oY, 14, 3, 15, 0.2F), new cco.e(ckm.oZ, 8, 3, 15, 0.2F)},
                  5,
                  new cco.g[]{new cco.e(ckm.oW, 8, 3, 30, 0.2F), new cco.e(ckm.oX, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            ccn.p,
            a(
               ImmutableMap.of(
                  1,
                  new cco.g[]{new cco.b(ckm.nI, 15, 16, 2), new cco.i(new ckj(ckm.op), 3, 1, 12, 1, 0.2F), new cco.e(ckm.om, 2, 3, 1)},
                  2,
                  new cco.g[]{new cco.b(ckm.nQ, 4, 12, 10), new cco.i(new ckj(ckm.vs), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cco.g[]{new cco.b(ckm.pi, 24, 12, 20)},
                  4,
                  new cco.g[]{new cco.b(ckm.nK, 1, 12, 30), new cco.e(ckm.ou, 12, 3, 15, 0.2F)},
                  5,
                  new cco.g[]{new cco.e(ckm.or, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            ccn.o,
            a(
               ImmutableMap.of(
                  1,
                  new cco.g[]{
                     new cco.b(ckm.nI, 15, 16, 2),
                     new cco.i(new ckj(ckm.of), 1, 1, 12, 1, 0.2F),
                     new cco.i(new ckj(ckm.od), 1, 1, 12, 1, 0.2F),
                     new cco.i(new ckj(ckm.oe), 1, 1, 12, 1, 0.2F),
                     new cco.i(new ckj(ckm.og), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cco.g[]{new cco.b(ckm.nQ, 4, 12, 10), new cco.i(new ckj(ckm.vs), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cco.g[]{
                     new cco.b(ckm.pi, 30, 12, 20),
                     new cco.e(ckm.op, 1, 3, 10, 0.2F),
                     new cco.e(ckm.on, 2, 3, 10, 0.2F),
                     new cco.e(ckm.oo, 3, 3, 10, 0.2F),
                     new cco.i(new ckj(ckm.ov), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new cco.g[]{new cco.b(ckm.nK, 1, 12, 30), new cco.e(ckm.ou, 12, 3, 15, 0.2F), new cco.e(ckm.os, 5, 3, 15, 0.2F)},
                  5,
                  new cco.g[]{new cco.e(ckm.ot, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            ccn.d,
            a(
               ImmutableMap.of(
                  1,
                  new cco.g[]{new cco.b(ckm.rn, 14, 16, 2), new cco.b(ckm.pj, 7, 16, 2), new cco.b(ckm.tG, 4, 16, 2), new cco.i(ckm.tI, 1, 1, 1)},
                  2,
                  new cco.g[]{new cco.b(ckm.nI, 15, 16, 2), new cco.i(ckm.pk, 1, 5, 16, 5), new cco.i(ckm.ro, 1, 8, 16, 5)},
                  3,
                  new cco.g[]{new cco.b(ckm.tT, 7, 16, 20), new cco.b(ckm.rl, 10, 16, 20)},
                  4,
                  new cco.g[]{new cco.b(ckm.pZ, 10, 12, 30)},
                  5,
                  new cco.g[]{new cco.b(ckm.vv, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            ccn.j,
            a(
               ImmutableMap.of(
                  1,
                  new cco.g[]{new cco.b(ckm.pP, 6, 16, 2), new cco.a(ckm.oM, 3), new cco.a(ckm.oL, 7)},
                  2,
                  new cco.g[]{new cco.b(ckm.pi, 26, 12, 10), new cco.a(ckm.oK, 5, 12, 5), new cco.a(ckm.oN, 4, 12, 5)},
                  3,
                  new cco.g[]{new cco.b(ckm.tK, 9, 12, 20), new cco.a(ckm.oL, 7)},
                  4,
                  new cco.g[]{new cco.b(ckm.nD, 4, 12, 30), new cco.a(ckm.tP, 6, 12, 15)},
                  5,
                  new cco.g[]{new cco.i(new ckj(ckm.mZ), 6, 1, 12, 30, 0.2F), new cco.a(ckm.oK, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            ccn.l,
            a(
               ImmutableMap.of(
                  1,
                  new cco.g[]{new cco.b(ckm.pY, 10, 16, 2), new cco.i(ckm.pX, 1, 10, 16, 1)},
                  2,
                  new cco.g[]{new cco.b(cuc.b, 20, 16, 10), new cco.i(cuc.eK, 1, 4, 16, 5)},
                  3,
                  new cco.g[]{
                     new cco.b(cuc.c, 16, 16, 20),
                     new cco.b(cuc.g, 16, 16, 20),
                     new cco.b(cuc.e, 16, 16, 20),
                     new cco.i(cuc.rt, 1, 4, 16, 10),
                     new cco.i(cuc.h, 1, 4, 16, 10),
                     new cco.i(cuc.f, 1, 4, 16, 10),
                     new cco.i(cuc.d, 1, 4, 16, 10)
                  },
                  4,
                  new cco.g[]{
                     new cco.b(ckm.nN, 12, 12, 30),
                     new cco.i(cuc.hk, 1, 1, 12, 15),
                     new cco.i(cuc.hj, 1, 1, 12, 15),
                     new cco.i(cuc.hu, 1, 1, 12, 15),
                     new cco.i(cuc.hm, 1, 1, 12, 15),
                     new cco.i(cuc.hq, 1, 1, 12, 15),
                     new cco.i(cuc.hr, 1, 1, 12, 15),
                     new cco.i(cuc.hy, 1, 1, 12, 15),
                     new cco.i(cuc.hx, 1, 1, 12, 15),
                     new cco.i(cuc.hp, 1, 1, 12, 15),
                     new cco.i(cuc.hl, 1, 1, 12, 15),
                     new cco.i(cuc.ho, 1, 1, 12, 15),
                     new cco.i(cuc.hw, 1, 1, 12, 15),
                     new cco.i(cuc.hs, 1, 1, 12, 15),
                     new cco.i(cuc.ht, 1, 1, 12, 15),
                     new cco.i(cuc.hn, 1, 1, 12, 15),
                     new cco.i(cuc.hv, 1, 1, 12, 15),
                     new cco.i(cuc.lh, 1, 1, 12, 15),
                     new cco.i(cuc.lg, 1, 1, 12, 15),
                     new cco.i(cuc.lr, 1, 1, 12, 15),
                     new cco.i(cuc.lj, 1, 1, 12, 15),
                     new cco.i(cuc.ln, 1, 1, 12, 15),
                     new cco.i(cuc.lo, 1, 1, 12, 15),
                     new cco.i(cuc.lv, 1, 1, 12, 15),
                     new cco.i(cuc.lu, 1, 1, 12, 15),
                     new cco.i(cuc.lm, 1, 1, 12, 15),
                     new cco.i(cuc.li, 1, 1, 12, 15),
                     new cco.i(cuc.ll, 1, 1, 12, 15),
                     new cco.i(cuc.lt, 1, 1, 12, 15),
                     new cco.i(cuc.lp, 1, 1, 12, 15),
                     new cco.i(cuc.lq, 1, 1, 12, 15),
                     new cco.i(cuc.lk, 1, 1, 12, 15),
                     new cco.i(cuc.ls, 1, 1, 12, 15)
                  },
                  5,
                  new cco.g[]{new cco.i(cuc.hf, 1, 1, 12, 30), new cco.i(cuc.hd, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<cco.g[]> b = a(
      ImmutableMap.of(
         1,
         new cco.g[]{
            new cco.i(ckm.cx, 2, 1, 5, 1),
            new cco.i(ckm.qc, 4, 1, 5, 1),
            new cco.i(ckm.eY, 2, 1, 5, 1),
            new cco.i(ckm.uX, 5, 1, 5, 1),
            new cco.i(ckm.cs, 1, 1, 12, 1),
            new cco.i(ckm.dn, 1, 1, 8, 1),
            new cco.i(ckm.eO, 1, 1, 4, 1),
            new cco.i(ckm.do, 3, 1, 12, 1),
            new cco.i(ckm.eA, 3, 1, 8, 1),
            new cco.i(ckm.cO, 1, 1, 12, 1),
            new cco.i(ckm.cP, 1, 1, 12, 1),
            new cco.i(ckm.cQ, 1, 1, 8, 1),
            new cco.i(ckm.cR, 1, 1, 12, 1),
            new cco.i(ckm.cS, 1, 1, 12, 1),
            new cco.i(ckm.cT, 1, 1, 12, 1),
            new cco.i(ckm.cU, 1, 1, 12, 1),
            new cco.i(ckm.cV, 1, 1, 12, 1),
            new cco.i(ckm.cW, 1, 1, 12, 1),
            new cco.i(ckm.cX, 1, 1, 12, 1),
            new cco.i(ckm.cY, 1, 1, 12, 1),
            new cco.i(ckm.cZ, 1, 1, 7, 1),
            new cco.i(ckm.oH, 1, 1, 12, 1),
            new cco.i(ckm.ur, 1, 1, 12, 1),
            new cco.i(ckm.rj, 1, 1, 12, 1),
            new cco.i(ckm.rk, 1, 1, 12, 1),
            new cco.i(ckm.N, 5, 1, 8, 1),
            new cco.i(ckm.L, 5, 1, 8, 1),
            new cco.i(ckm.P, 5, 1, 8, 1),
            new cco.i(ckm.M, 5, 1, 8, 1),
            new cco.i(ckm.J, 5, 1, 8, 1),
            new cco.i(ckm.K, 5, 1, 8, 1),
            new cco.i(ckm.O, 5, 1, 8, 1),
            new cco.i(ckm.Q, 5, 1, 8, 1),
            new cco.i(ckm.qI, 1, 3, 12, 1),
            new cco.i(ckm.qu, 1, 3, 12, 1),
            new cco.i(ckm.qF, 1, 3, 12, 1),
            new cco.i(ckm.qA, 1, 3, 12, 1),
            new cco.i(ckm.qJ, 1, 3, 12, 1),
            new cco.i(ckm.qH, 1, 3, 12, 1),
            new cco.i(ckm.qC, 1, 3, 12, 1),
            new cco.i(ckm.qw, 1, 3, 12, 1),
            new cco.i(ckm.qy, 1, 3, 12, 1),
            new cco.i(ckm.qB, 1, 3, 12, 1),
            new cco.i(ckm.qE, 1, 3, 12, 1),
            new cco.i(ckm.qx, 1, 3, 12, 1),
            new cco.i(ckm.qz, 1, 3, 12, 1),
            new cco.i(ckm.qv, 1, 3, 12, 1),
            new cco.i(ckm.qG, 1, 3, 12, 1),
            new cco.i(ckm.qD, 1, 3, 12, 1),
            new cco.i(ckm.kb, 3, 1, 8, 1),
            new cco.i(ckm.kc, 3, 1, 8, 1),
            new cco.i(ckm.kd, 3, 1, 8, 1),
            new cco.i(ckm.ke, 3, 1, 8, 1),
            new cco.i(ckm.ka, 3, 1, 8, 1),
            new cco.i(ckm.fz, 1, 1, 12, 1),
            new cco.i(ckm.de, 1, 1, 12, 1),
            new cco.i(ckm.df, 1, 1, 12, 1),
            new cco.i(ckm.fF, 1, 2, 5, 1),
            new cco.i(ckm.du, 1, 2, 5, 1),
            new cco.i(ckm.S, 1, 8, 8, 1),
            new cco.i(ckm.V, 1, 4, 6, 1),
            new cco.i(ckm.wp, 1, 2, 5, 1),
            new cco.i(ckm.s, 1, 2, 5, 1),
            new cco.i(ckm.dr, 1, 2, 5, 1)
         },
         2,
         new cco.g[]{
            new cco.i(ckm.pU, 5, 1, 4, 1),
            new cco.i(ckm.pR, 5, 1, 4, 1),
            new cco.i(ckm.hz, 3, 1, 6, 1),
            new cco.i(ckm.kz, 6, 1, 6, 1),
            new cco.i(ckm.oG, 1, 1, 8, 1),
            new cco.i(ckm.r, 3, 3, 6, 1)
         }
      )
   );
   private static final cco.l s = new cco.l(8, ard.f, "filled_map.village_desert", ecl.a.B, 12, 5);
   private static final cco.l t = new cco.l(8, ard.e, "filled_map.village_savanna", ecl.a.D, 12, 5);
   private static final cco.l u = new cco.l(8, ard.g, "filled_map.village_plains", ecl.a.C, 12, 5);
   private static final cco.l v = new cco.l(8, ard.h, "filled_map.village_taiga", ecl.a.F, 12, 5);
   private static final cco.l w = new cco.l(8, ard.i, "filled_map.village_snowy", ecl.a.E, 12, 5);
   private static final cco.l x = new cco.l(8, ard.j, "filled_map.explorer_jungle", ecl.a.G, 12, 5);
   private static final cco.l y = new cco.l(8, ard.k, "filled_map.explorer_swamp", ecl.a.H, 12, 5);
   public static final Map<ccn, Int2ObjectMap<cco.g[]>> c = Map.of(
      ccn.k,
      a(
         ImmutableMap.builder()
            .put(1, new cco.g[]{new cco.b(ckm.qa, 24, 16, 2), a(1), new cco.i(cuc.cl, 9, 1, 12, 1)})
            .put(2, new cco.g[]{new cco.b(ckm.qb, 4, 12, 10), a(5), new cco.i(ckm.vt, 1, 1, 5)})
            .put(3, new cco.g[]{new cco.b(ckm.qr, 5, 12, 20), a(10), new cco.i(ckm.ck, 1, 4, 10)})
            .put(4, new cco.g[]{new cco.b(ckm.tg, 2, 12, 30), new cco.i(ckm.qi, 5, 1, 15), new cco.i(ckm.qe, 4, 1, 15)})
            .put(5, new cco.g[]{a(), new cco.i(ckm.tR, 20, 1, 30)})
            .build()
      ),
      ccn.c,
      a(
         ImmutableMap.builder()
            .put(1, new cco.g[]{new cco.b(ckm.nI, 15, 12, 2), new cco.b(ckm.nQ, 5, 12, 2)})
            .put(
               2,
               new cco.g[]{
                  cco.m.a(new cco.i(ckm.oV, 4, 1, 12, 5, 0.05F), ccp.a, ccp.c, ccp.d, ccp.e, ccp.g),
                  cco.m.a(new cco.i(ckm.oR, 4, 1, 12, 5, 0.05F), ccp.b, ccp.f),
                  cco.m.a(new cco.i(ckm.oS, 5, 1, 12, 5, 0.05F), ccp.a, ccp.c, ccp.d, ccp.e, ccp.g),
                  cco.m.a(new cco.i(ckm.oO, 5, 1, 12, 5, 0.05F), ccp.b, ccp.f),
                  cco.m.a(new cco.i(ckm.oU, 7, 1, 12, 5, 0.05F), ccp.a, ccp.c, ccp.d, ccp.e, ccp.g),
                  cco.m.a(new cco.i(ckm.oQ, 7, 1, 12, 5, 0.05F), ccp.b, ccp.f),
                  cco.m.a(new cco.i(ckm.oT, 9, 1, 12, 5, 0.05F), ccp.a, ccp.c, ccp.d, ccp.e, ccp.g),
                  cco.m.a(new cco.i(ckm.oP, 9, 1, 12, 5, 0.05F), ccp.b, ccp.f)
               }
            )
            .put(3, new cco.g[]{new cco.b(ckm.pM, 1, 12, 20), new cco.i(ckm.uy, 5, 1, 12, 10, 0.05F), new cco.i(ckm.vs, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new cco.g[]{
                  cco.m.a(new cco.i(a(ckm.oV, cox.h, 1), 8, 1, 3, 15, 0.05F), ccp.a),
                  cco.m.a(new cco.i(a(ckm.oS, cox.h, 1), 9, 1, 3, 15, 0.05F), ccp.a),
                  cco.m.a(new cco.i(a(ckm.oU, cox.h, 1), 11, 1, 3, 15, 0.05F), ccp.a),
                  cco.m.a(new cco.i(a(ckm.oT, cox.h, 1), 13, 1, 3, 15, 0.05F), ccp.a),
                  cco.m.a(new cco.i(a(ckm.oV, cox.a, 1), 8, 1, 3, 15, 0.05F), ccp.c),
                  cco.m.a(new cco.i(a(ckm.oS, cox.a, 1), 9, 1, 3, 15, 0.05F), ccp.c),
                  cco.m.a(new cco.i(a(ckm.oU, cox.a, 1), 11, 1, 3, 15, 0.05F), ccp.c),
                  cco.m.a(new cco.i(a(ckm.oT, cox.a, 1), 13, 1, 3, 15, 0.05F), ccp.c),
                  cco.m.a(new cco.i(a(ckm.oV, cox.k, 1), 2, 1, 3, 15, 0.05F), ccp.d),
                  cco.m.a(new cco.i(a(ckm.oS, cox.k, 1), 3, 1, 3, 15, 0.05F), ccp.d),
                  cco.m.a(new cco.i(a(ckm.oU, cox.k, 1), 5, 1, 3, 15, 0.05F), ccp.d),
                  cco.m.a(new cco.i(a(ckm.oT, cox.k, 1), 7, 1, 3, 15, 0.05F), ccp.d),
                  cco.m.a(new cco.i(a(ckm.oV, cox.j, 1), 8, 1, 3, 15, 0.05F), ccp.e),
                  cco.m.a(new cco.i(a(ckm.oS, cox.g, 1), 9, 1, 3, 15, 0.05F), ccp.e),
                  cco.m.a(new cco.i(a(ckm.oR, cox.w, 1), 8, 1, 3, 15, 0.05F), ccp.b),
                  cco.m.a(new cco.i(a(ckm.oO, cox.w, 1), 9, 1, 3, 15, 0.05F), ccp.b),
                  cco.m.a(new cco.i(a(ckm.oQ, cox.w, 1), 11, 1, 3, 15, 0.05F), ccp.b),
                  cco.m.a(new cco.i(a(ckm.oP, cox.w, 1), 13, 1, 3, 15, 0.05F), ccp.b),
                  cco.m.a(new cco.i(a(ckm.oR, cox.L, 1), 8, 1, 3, 15, 0.05F), ccp.f),
                  cco.m.a(new cco.i(a(ckm.oO, cox.L, 1), 9, 1, 3, 15, 0.05F), ccp.f),
                  cco.m.a(new cco.i(a(ckm.oQ, cox.L, 1), 11, 1, 3, 15, 0.05F), ccp.f),
                  cco.m.a(new cco.i(a(ckm.oP, cox.L, 1), 13, 1, 3, 15, 0.05F), ccp.f),
                  cco.m.a(new cco.h(ckm.oZ, 1, 4, ckm.oY, 1, 3, 15, 0.05F), ccp.g),
                  cco.m.a(new cco.h(ckm.oY, 1, 4, ckm.oX, 1, 3, 15, 0.05F), ccp.g),
                  cco.m.a(new cco.h(ckm.oW, 1, 4, ckm.oZ, 1, 3, 15, 0.05F), ccp.g),
                  cco.m.a(new cco.h(ckm.oX, 1, 2, ckm.oW, 1, 3, 15, 0.05F), ccp.g)
               }
            )
            .put(
               5,
               new cco.g[]{
                  cco.m.a(new cco.h(ckm.nK, 4, 16, a(ckm.oX, cox.h, 1), 1, 3, 30, 0.05F), ccp.a),
                  cco.m.a(new cco.h(ckm.nK, 3, 16, a(ckm.oY, cox.h, 1), 1, 3, 30, 0.05F), ccp.a),
                  cco.m.a(new cco.h(ckm.nK, 3, 16, a(ckm.oY, cox.a, 1), 1, 3, 30, 0.05F), ccp.c),
                  cco.m.a(new cco.h(ckm.nK, 2, 12, a(ckm.oZ, cox.a, 1), 1, 3, 30, 0.05F), ccp.c),
                  cco.m.a(new cco.h(ckm.nK, 2, 6, a(ckm.oW, cox.k, 1), 1, 3, 30, 0.05F), ccp.d),
                  cco.m.a(new cco.h(ckm.nK, 3, 8, a(ckm.oX, cox.k, 1), 1, 3, 30, 0.05F), ccp.d),
                  cco.m.a(new cco.h(ckm.nK, 2, 12, a(ckm.oZ, cox.j, 1), 1, 3, 30, 0.05F), ccp.e),
                  cco.m.a(new cco.h(ckm.nK, 3, 12, a(ckm.oW, cox.g, 1), 1, 3, 30, 0.05F), ccp.e),
                  cco.m.a(new cco.i(a(ckm.oO, cox.e, 1), 9, 1, 3, 30, 0.05F), ccp.b),
                  cco.m.a(new cco.i(a(ckm.oR, cox.c, 1), 8, 1, 3, 30, 0.05F), ccp.b),
                  cco.m.a(new cco.i(a(ckm.oO, cox.f, 1), 9, 1, 3, 30, 0.05F), ccp.f),
                  cco.m.a(new cco.i(a(ckm.oR, cox.i, 1), 8, 1, 3, 30, 0.05F), ccp.f),
                  cco.m.a(new cco.h(ckm.nK, 4, 18, a(ckm.oX, cox.d, 1), 1, 3, 30, 0.05F), ccp.g),
                  cco.m.a(new cco.h(ckm.nK, 3, 18, a(ckm.oY, cox.d, 1), 1, 3, 30, 0.05F), ccp.g),
                  cco.m.a(new cco.b(ckm.az, 1, 12, 30, 42), ccp.g),
                  cco.m.a(new cco.b(ckm.aw, 1, 12, 30, 4), ccp.a, ccp.b, ccp.c, ccp.d, ccp.e, ccp.f)
               }
            )
            .build()
      ),
      ccn.e,
      a(
         ImmutableMap.of(
            1,
            new cco.g[]{new cco.b(ckm.qa, 24, 16, 2), new cco.i(ckm.tp, 7, 1, 1)},
            2,
            new cco.g[]{
               new cco.b(ckm.fx, 11, 16, 10),
               new cco.m(ImmutableMap.builder().put(ccp.a, t).put(ccp.d, u).put(ccp.c, v).put(ccp.g, w).put(ccp.e, u).put(ccp.b, t).put(ccp.f, w).build()),
               new cco.m(ImmutableMap.builder().put(ccp.a, u).put(ccp.d, s).put(ccp.c, t).put(ccp.g, u).put(ccp.e, v).put(ccp.b, s).put(ccp.f, v).build()),
               new cco.m(
                  ImmutableMap.builder().put(ccp.a, x).put(ccp.d, x).put(ccp.c, new cco.f()).put(ccp.g, y).put(ccp.e, y).put(ccp.b, y).put(ccp.f, x).build()
               )
            },
            3,
            new cco.g[]{new cco.b(ckm.qe, 1, 12, 20), new cco.l(13, ard.d, "filled_map.monument", ecl.a.j, 12, 10)},
            4,
            new cco.g[]{
               new cco.i(ckm.ti, 7, 1, 15),
               new cco.i(ckm.tV, 3, 1, 15),
               new cco.i(ckm.ug, 3, 1, 15),
               new cco.i(ckm.tY, 3, 1, 15),
               new cco.i(ckm.uj, 3, 1, 15),
               new cco.i(ckm.ub, 3, 1, 15),
               new cco.i(ckm.ui, 3, 1, 15),
               new cco.i(ckm.ua, 3, 1, 15),
               new cco.i(ckm.uc, 3, 1, 15),
               new cco.i(ckm.uk, 3, 1, 15),
               new cco.i(ckm.uf, 3, 1, 15),
               new cco.i(ckm.tX, 3, 1, 15),
               new cco.i(ckm.ue, 3, 1, 15),
               new cco.i(ckm.uh, 3, 1, 15),
               new cco.i(ckm.tZ, 3, 1, 15),
               new cco.i(ckm.tW, 3, 1, 15),
               new cco.i(ckm.ud, 3, 1, 15)
            },
            5,
            new cco.g[]{new cco.i(ckm.vg, 8, 1, 30), new cco.l(14, ard.c, "filled_map.mansion", ecl.a.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<cco.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new cco.g[]{
               new cco.b(a(cmj.c), 1, 1, 1),
               new cco.b(ckm.pL, 1, 1, 1, 2),
               new cco.b(ckm.pQ, 1, 1, 1, 2),
               new cco.b(ckm.ry, 1, 1, 1, 3),
               new cco.b(ckm.tn, 4, 1, 1),
               new cco.b(ckm.hh, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cco.g[]{
               new cco.i(ckm.hz, 1, 1, 6, 1),
               new cco.i(ckm.kz, 6, 1, 6, 1),
               new cco.i(ckm.oG, 1, 4, 2, 1),
               new cco.i(ckm.r, 3, 3, 6, 1),
               new cco.i(cuc.Y, 1, 8, 4, 1),
               new cco.i(cuc.W, 1, 8, 4, 1),
               new cco.i(cuc.aa, 1, 8, 4, 1),
               new cco.i(cuc.X, 1, 8, 4, 1),
               new cco.i(cuc.U, 1, 8, 4, 1),
               new cco.i(cuc.V, 1, 8, 4, 1),
               new cco.i(cuc.Z, 1, 8, 4, 1),
               new cco.e(ckm.oo, 1, 1, 1, 0.2F),
               new cco.i(a(cmj.j), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cco.g[]{
               new cco.i(ckm.pU, 3, 1, 4, 1),
               new cco.i(ckm.pR, 3, 1, 4, 1),
               new cco.i(ckm.cx, 2, 1, 5, 1),
               new cco.i(ckm.qc, 4, 1, 5, 1),
               new cco.i(ckm.eY, 2, 1, 5, 1),
               new cco.i(ckm.uX, 5, 1, 5, 1),
               new cco.i(ckm.cs, 1, 1, 12, 1),
               new cco.i(ckm.dn, 1, 1, 8, 1),
               new cco.i(ckm.eO, 1, 1, 4, 1),
               new cco.i(ckm.do, 3, 1, 12, 1),
               new cco.i(ckm.eA, 3, 1, 8, 1),
               new cco.i(ckm.cO, 1, 1, 12, 1),
               new cco.i(ckm.cP, 1, 1, 12, 1),
               new cco.i(ckm.cQ, 1, 1, 8, 1),
               new cco.i(ckm.cR, 1, 1, 12, 1),
               new cco.i(ckm.cS, 1, 1, 12, 1),
               new cco.i(ckm.cT, 1, 1, 12, 1),
               new cco.i(ckm.cU, 1, 1, 12, 1),
               new cco.i(ckm.cV, 1, 1, 12, 1),
               new cco.i(ckm.cW, 1, 1, 12, 1),
               new cco.i(ckm.cX, 1, 1, 12, 1),
               new cco.i(ckm.cY, 1, 1, 12, 1),
               new cco.i(ckm.cZ, 1, 1, 7, 1),
               new cco.i(ckm.oH, 1, 1, 12, 1),
               new cco.i(ckm.ur, 1, 1, 12, 1),
               new cco.i(ckm.rj, 1, 1, 12, 1),
               new cco.i(ckm.rk, 1, 1, 12, 1),
               new cco.i(ckm.N, 5, 1, 8, 1),
               new cco.i(ckm.L, 5, 1, 8, 1),
               new cco.i(ckm.P, 5, 1, 8, 1),
               new cco.i(ckm.M, 5, 1, 8, 1),
               new cco.i(ckm.J, 5, 1, 8, 1),
               new cco.i(ckm.K, 5, 1, 8, 1),
               new cco.i(ckm.O, 5, 1, 8, 1),
               new cco.i(ckm.Q, 5, 1, 8, 1),
               new cco.i(ckm.qI, 1, 3, 12, 1),
               new cco.i(ckm.qu, 1, 3, 12, 1),
               new cco.i(ckm.qF, 1, 3, 12, 1),
               new cco.i(ckm.qA, 1, 3, 12, 1),
               new cco.i(ckm.qJ, 1, 3, 12, 1),
               new cco.i(ckm.qH, 1, 3, 12, 1),
               new cco.i(ckm.qC, 1, 3, 12, 1),
               new cco.i(ckm.qw, 1, 3, 12, 1),
               new cco.i(ckm.qy, 1, 3, 12, 1),
               new cco.i(ckm.qB, 1, 3, 12, 1),
               new cco.i(ckm.qE, 1, 3, 12, 1),
               new cco.i(ckm.qx, 1, 3, 12, 1),
               new cco.i(ckm.qz, 1, 3, 12, 1),
               new cco.i(ckm.qv, 1, 3, 12, 1),
               new cco.i(ckm.qG, 1, 3, 12, 1),
               new cco.i(ckm.qD, 1, 3, 12, 1),
               new cco.i(ckm.kb, 3, 1, 8, 1),
               new cco.i(ckm.kc, 3, 1, 8, 1),
               new cco.i(ckm.kd, 3, 1, 8, 1),
               new cco.i(ckm.ke, 3, 1, 8, 1),
               new cco.i(ckm.ka, 3, 1, 8, 1),
               new cco.i(ckm.fz, 1, 3, 4, 1),
               new cco.i(ckm.de, 1, 3, 4, 1),
               new cco.i(ckm.df, 1, 3, 4, 1),
               new cco.i(ckm.fF, 1, 5, 2, 1),
               new cco.i(ckm.du, 1, 2, 5, 1),
               new cco.i(ckm.S, 1, 8, 8, 1),
               new cco.i(ckm.V, 1, 4, 6, 1),
               new cco.i(ckm.wp, 1, 2, 5, 1),
               new cco.i(ckm.s, 1, 2, 5, 1),
               new cco.i(ckm.dr, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static cco.g a(int $$0) {
      return new cco.m(
         ImmutableMap.builder()
            .put(ccp.a, new cco.d($$0, cox.b, cox.h, cox.B))
            .put(ccp.b, new cco.d($$0, cox.c, cox.e, cox.y))
            .put(ccp.c, new cco.d($$0, cox.z, cox.o, cox.p))
            .put(ccp.d, new cco.d($$0, cox.q, cox.k, cox.t))
            .put(ccp.e, new cco.d($$0, cox.g, cox.s, cox.j))
            .put(ccp.f, new cco.d($$0, cox.i, cox.f, cox.M))
            .put(ccp.g, new cco.d($$0, cox.d, cox.r, cox.A))
            .build()
      );
   }

   private static cco.g a() {
      return new cco.m(
         ImmutableMap.builder()
            .put(ccp.a, new cco.d(30, 3, 3, cox.u))
            .put(ccp.b, new cco.d(30, 2, 2, cox.w))
            .put(ccp.c, new cco.d(30, 3, 3, cox.a))
            .put(ccp.d, new cco.d(30, 3, 3, cox.n))
            .put(ccp.e, new cco.d(30, cox.v))
            .put(ccp.f, new cco.d(30, cox.L))
            .put(ccp.g, new cco.d(30, 2, 2, cox.x))
            .build()
      );
   }

   private static Int2ObjectMap<cco.g[]> a(ImmutableMap<Integer, cco.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static ckj a(cmg $$0) {
      return cmi.a(new ckj(ckm.rv), $$0);
   }

   private static ckj a(cke $$0, cot $$1, int $$2) {
      ckj $$3 = new ckj($$0);
      $$3.a($$1, $$2);
      return $$3;
   }

   static class a implements cco.g {
      private final cke a;
      private final int b;
      private final int c;
      private final int d;

      public a(cke $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(cke $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public cpx a(bjt $$0, ate $$1) {
         ckj $$2 = new ckj(ckm.nL, this.b);
         ckj $$3 = new ckj(this.a);
         if (this.a instanceof ciz) {
            List<ciy> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = cjb.a($$3, $$4);
         }

         return new cpx($$2, $$3, this.c, this.d, 0.2F);
      }

      private static ciy a(ate $$0) {
         return ciy.a(cix.a($$0.a(16)));
      }
   }

   static class b implements cco.g {
      private final ckj a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(cqy $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(cqy $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new ckj($$0.k(), $$1), $$2, $$3, $$4);
      }

      public b(ckj $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public cpx a(bjt $$0, ate $$1) {
         return new cpx(this.a.p(), new ckj(ckm.nL, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements cco.g {
      private final Map<ccp, cke> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<ccp, cke> $$3) {
         jy.z.s().filter($$1x -> !$$3.containsKey($$1x)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + jy.z.b($$0x));
         });
         this.a = $$3;
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Nullable
      @Override
      public cpx a(bjt $$0, ate $$1) {
         if ($$0 instanceof ccm $$2) {
            ckj $$3 = new ckj(this.a.get($$2.gp().a()), this.b);
            return new cpx($$3, new ckj(ckm.nL), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements cco.g {
      private final int a;
      private final List<cot> b;
      private final int c;
      private final int d;

      public d(int $$0) {
         this($$0, jy.g.s().filter(cot::h).toArray(cot[]::new));
      }

      public d(int $$0, cot... $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, cot... $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = Arrays.asList($$3);
      }

      @Override
      public cpx a(bjt $$0, ate $$1) {
         cot $$2 = this.b.get($$1.a(this.b.size()));
         int $$3 = Math.max($$2.e(), this.c);
         int $$4 = Math.min($$2.a(), this.d);
         int $$5 = asy.a($$1, $$3, $$4);
         ckj $$6 = cjf.a(new cow($$2, $$5));
         int $$7 = 2 + $$1.a(5 + $$5 * 10) + 3 * $$5;
         if ($$2.b()) {
            $$7 *= 2;
         }

         if ($$7 > 64) {
            $$7 = 64;
         }

         return new cpx(new ckj(ckm.nL, $$7), new ckj(ckm.qb), $$6, 12, this.a, 0.2F);
      }
   }

   static class e implements cco.g {
      private final ckj a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(cke $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(cke $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new ckj($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public cpx a(bjt $$0, ate $$1) {
         int $$2 = 5 + $$1.a(15);
         ckj $$3 = cov.a($$1, new ckj(this.a.d()), $$2, false);
         int $$4 = Math.min(this.b + $$2, 64);
         ckj $$5 = new ckj(ckm.nL, $$4);
         return new cpx($$5, $$3, this.c, this.d, this.e);
      }
   }

   static class f implements cco.g {
      @Override
      public cpx a(bjt $$0, ate $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      cpx a(bjt var1, ate var2);
   }

   static class h implements cco.g {
      private final ckj a;
      private final int b;
      private final ckj c;
      private final int d;
      private final int e;
      private final float f;

      public h(cqy $$0, int $$1, int $$2, cke $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new ckj($$3), $$4, $$5, $$6, $$7);
      }

      public h(cqy $$0, int $$1, int $$2, ckj $$3, int $$4, int $$5, int $$6, float $$7) {
         this.a = new ckj($$0, $$1);
         this.b = $$2;
         this.c = $$3.c($$4);
         this.d = $$5;
         this.e = $$6;
         this.f = $$7;
      }

      @Nullable
      @Override
      public cpx a(bjt $$0, ate $$1) {
         return new cpx(new ckj(ckm.nL, this.b), this.a.p(), this.c.p(), this.d, this.e, this.f);
      }
   }

   static class i implements cco.g {
      private final ckj a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public i(cua $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new ckj($$0), $$1, $$2, $$3, $$4);
      }

      public i(cke $$0, int $$1, int $$2, int $$3) {
         this(new ckj($$0), $$1, $$2, 12, $$3);
      }

      public i(cke $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new ckj($$0), $$1, $$2, $$3, $$4);
      }

      public i(ckj $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(cke $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new ckj($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(ckj $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.a.f($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
      }

      @Override
      public cpx a(bjt $$0, ate $$1) {
         return new cpx(new ckj(ckm.nL, this.b), this.a.p(), this.c, this.d, this.e);
      }
   }

   static class j implements cco.g {
      private final List<dca.a> a;
      private final int b;
      private final float c;

      public j(bje $$0, int $$1, int $$2) {
         this(List.of(new dca.a($$0, $$1)), $$2, 0.05F);
      }

      public j(List<dca.a> $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public cpx a(bjt $$0, ate $$1) {
         ckj $$2 = new ckj(ckm.va, 1);
         clt.a($$2, this.a);
         return new cpx(new ckj(ckm.nL, 1), $$2, 12, this.b, this.c);
      }
   }

   static class k implements cco.g {
      private final ckj a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final cke f;
      private final int g;
      private final float h;

      public k(cke $$0, int $$1, cke $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new ckj($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public cpx a(bjt $$0, ate $$1) {
         ckj $$2 = new ckj(ckm.nL, this.c);
         List<cmg> $$3 = jy.j.s().filter($$0x -> !$$0x.a().isEmpty() && cmh.a($$0x)).collect(Collectors.toList());
         cmg $$4 = $$3.get($$1.a($$3.size()));
         ckj $$5 = cmi.a(new ckj(this.a.d(), this.b), $$4);
         return new cpx($$2, new ckj(this.f, this.g), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements cco.g {
      private final int a;
      private final arh<dwa> b;
      private final String c;
      private final ecl.a d;
      private final int e;
      private final int f;

      public l(int $$0, arh<dwa> $$1, String $$2, ecl.a $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public cpx a(bjt $$0, ate $$1) {
         if (!($$0.dL() instanceof alq)) {
            return null;
         } else {
            alq $$2 = (alq)$$0.dL();
            ht $$3 = $$2.a(this.b, $$0.dl(), 100, true);
            if ($$3 != null) {
               ckj $$4 = ckq.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               ckq.a($$2, $$4);
               eco.a($$4, $$3, "+", this.d);
               $$4.a(ui.c(this.c));
               return new cpx(new ckj(ckm.nL, this.a), new ckj(ckm.qe), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static record m(Map<ccp, cco.g> a) implements cco.g {
      public static cco.m a(cco.g $$0, ccp... $$1) {
         return new cco.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public cpx a(bjt $$0, ate $$1) {
         if ($$0 instanceof ccm $$2) {
            ccp $$3 = $$2.gp().a();
            cco.g $$4 = this.a.get($$3);
            return $$4 == null ? null : $$4.a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
