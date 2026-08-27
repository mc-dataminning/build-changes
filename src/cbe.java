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

public class cbe {
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
   public static final Map<cbd, Int2ObjectMap<cbe.f[]>> a = ac.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            cbd.g,
            a(
               ImmutableMap.of(
                  1,
                  new cbe.f[]{
                     new cbe.b(cjb.oI, 20, 16, 2),
                     new cbe.b(cjb.tm, 26, 16, 2),
                     new cbe.b(cjb.tl, 22, 16, 2),
                     new cbe.b(cjb.uq, 15, 16, 2),
                     new cbe.h(cjb.oJ, 1, 6, 16, 1)
                  },
                  2,
                  new cbe.f[]{new cbe.b(csn.dV, 6, 12, 10), new cbe.h(cjb.tz, 1, 4, 5), new cbe.h(cjb.nF, 1, 4, 16, 5)},
                  3,
                  new cbe.f[]{new cbe.h(cjb.re, 3, 18, 10), new cbe.b(csn.fa, 4, 12, 20)},
                  4,
                  new cbe.f[]{
                     new cbe.h(csn.eh, 1, 1, 12, 15),
                     new cbe.i(bhx.p, 100, 15),
                     new cbe.i(bhx.h, 160, 15),
                     new cbe.i(bhx.r, 140, 15),
                     new cbe.i(bhx.o, 120, 15),
                     new cbe.i(bhx.s, 280, 15),
                     new cbe.i(bhx.w, 7, 15)
                  },
                  5,
                  new cbe.f[]{new cbe.h(cjb.tq, 3, 3, 30), new cbe.h(cjb.rE, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            cbd.h,
            a(
               ImmutableMap.of(
                  1,
                  new cbe.f[]{
                     new cbe.b(cjb.oE, 20, 16, 2), new cbe.b(cjb.nI, 10, 16, 2), new cbe.g(cjb.ql, 6, cjb.qp, 6, 16, 1), new cbe.h(cjb.pT, 3, 1, 16, 1)
                  },
                  2,
                  new cbe.f[]{new cbe.b(cjb.ql, 15, 16, 10), new cbe.g(cjb.qm, 6, cjb.qq, 6, 16, 5), new cbe.h(cjb.vx, 2, 1, 5)},
                  3,
                  new cbe.f[]{new cbe.b(cjb.qm, 13, 16, 20), new cbe.e(cjb.qh, 3, 3, 10, 0.2F)},
                  4,
                  new cbe.f[]{new cbe.b(cjb.qn, 6, 12, 30)},
                  5,
                  new cbe.f[]{
                     new cbe.b(cjb.qo, 4, 12, 30),
                     new cbe.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(cbf.c, cjb.ni)
                           .put(cbf.g, cjb.nk)
                           .put(cbf.e, cjb.nk)
                           .put(cbf.a, cjb.no)
                           .put(cbf.b, cjb.no)
                           .put(cbf.d, cjb.nq)
                           .put(cbf.f, cjb.nu)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            cbd.n,
            a(
               ImmutableMap.of(
                  1,
                  new cbe.f[]{
                     new cbe.b(csn.bA, 18, 16, 2),
                     new cbe.b(csn.bM, 18, 16, 2),
                     new cbe.b(csn.bP, 18, 16, 2),
                     new cbe.b(csn.bH, 18, 16, 2),
                     new cbe.h(cjb.rg, 2, 1, 1)
                  },
                  2,
                  new cbe.f[]{
                     new cbe.b(cjb.qu, 12, 16, 10),
                     new cbe.b(cjb.qB, 12, 16, 10),
                     new cbe.b(cjb.qJ, 12, 16, 10),
                     new cbe.b(cjb.qx, 12, 16, 10),
                     new cbe.b(cjb.qz, 12, 16, 10),
                     new cbe.h(csn.bA, 1, 1, 16, 5),
                     new cbe.h(csn.bB, 1, 1, 16, 5),
                     new cbe.h(csn.bC, 1, 1, 16, 5),
                     new cbe.h(csn.bD, 1, 1, 16, 5),
                     new cbe.h(csn.bE, 1, 1, 16, 5),
                     new cbe.h(csn.bF, 1, 1, 16, 5),
                     new cbe.h(csn.bG, 1, 1, 16, 5),
                     new cbe.h(csn.bH, 1, 1, 16, 5),
                     new cbe.h(csn.bI, 1, 1, 16, 5),
                     new cbe.h(csn.bJ, 1, 1, 16, 5),
                     new cbe.h(csn.bK, 1, 1, 16, 5),
                     new cbe.h(csn.bL, 1, 1, 16, 5),
                     new cbe.h(csn.bM, 1, 1, 16, 5),
                     new cbe.h(csn.bN, 1, 1, 16, 5),
                     new cbe.h(csn.bO, 1, 1, 16, 5),
                     new cbe.h(csn.bP, 1, 1, 16, 5),
                     new cbe.h(csn.ik, 1, 4, 16, 5),
                     new cbe.h(csn.il, 1, 4, 16, 5),
                     new cbe.h(csn.im, 1, 4, 16, 5),
                     new cbe.h(csn.in, 1, 4, 16, 5),
                     new cbe.h(csn.io, 1, 4, 16, 5),
                     new cbe.h(csn.ip, 1, 4, 16, 5),
                     new cbe.h(csn.iq, 1, 4, 16, 5),
                     new cbe.h(csn.ir, 1, 4, 16, 5),
                     new cbe.h(csn.is, 1, 4, 16, 5),
                     new cbe.h(csn.it, 1, 4, 16, 5),
                     new cbe.h(csn.iu, 1, 4, 16, 5),
                     new cbe.h(csn.iv, 1, 4, 16, 5),
                     new cbe.h(csn.iw, 1, 4, 16, 5),
                     new cbe.h(csn.ix, 1, 4, 16, 5),
                     new cbe.h(csn.iy, 1, 4, 16, 5),
                     new cbe.h(csn.iz, 1, 4, 16, 5)
                  },
                  3,
                  new cbe.f[]{
                     new cbe.b(cjb.qy, 12, 16, 20),
                     new cbe.b(cjb.qC, 12, 16, 20),
                     new cbe.b(cjb.qv, 12, 16, 20),
                     new cbe.b(cjb.qI, 12, 16, 20),
                     new cbe.b(cjb.qA, 12, 16, 20),
                     new cbe.h(csn.aZ, 3, 1, 12, 10),
                     new cbe.h(csn.bd, 3, 1, 12, 10),
                     new cbe.h(csn.bn, 3, 1, 12, 10),
                     new cbe.h(csn.bo, 3, 1, 12, 10),
                     new cbe.h(csn.bk, 3, 1, 12, 10),
                     new cbe.h(csn.bl, 3, 1, 12, 10),
                     new cbe.h(csn.bi, 3, 1, 12, 10),
                     new cbe.h(csn.bg, 3, 1, 12, 10),
                     new cbe.h(csn.bm, 3, 1, 12, 10),
                     new cbe.h(csn.bc, 3, 1, 12, 10),
                     new cbe.h(csn.bh, 3, 1, 12, 10),
                     new cbe.h(csn.be, 3, 1, 12, 10),
                     new cbe.h(csn.bb, 3, 1, 12, 10),
                     new cbe.h(csn.ba, 3, 1, 12, 10),
                     new cbe.h(csn.bf, 3, 1, 12, 10),
                     new cbe.h(csn.bj, 3, 1, 12, 10)
                  },
                  4,
                  new cbe.f[]{
                     new cbe.b(cjb.qG, 12, 16, 30),
                     new cbe.b(cjb.qE, 12, 16, 30),
                     new cbe.b(cjb.qF, 12, 16, 30),
                     new cbe.b(cjb.qH, 12, 16, 30),
                     new cbe.b(cjb.qw, 12, 16, 30),
                     new cbe.b(cjb.qD, 12, 16, 30),
                     new cbe.h(cjb.tV, 3, 1, 12, 15),
                     new cbe.h(cjb.ug, 3, 1, 12, 15),
                     new cbe.h(cjb.tY, 3, 1, 12, 15),
                     new cbe.h(cjb.uj, 3, 1, 12, 15),
                     new cbe.h(cjb.ub, 3, 1, 12, 15),
                     new cbe.h(cjb.ui, 3, 1, 12, 15),
                     new cbe.h(cjb.ua, 3, 1, 12, 15),
                     new cbe.h(cjb.uc, 3, 1, 12, 15),
                     new cbe.h(cjb.uk, 3, 1, 12, 15),
                     new cbe.h(cjb.uf, 3, 1, 12, 15),
                     new cbe.h(cjb.tX, 3, 1, 12, 15),
                     new cbe.h(cjb.ue, 3, 1, 12, 15),
                     new cbe.h(cjb.uh, 3, 1, 12, 15),
                     new cbe.h(cjb.tZ, 3, 1, 12, 15),
                     new cbe.h(cjb.tW, 3, 1, 12, 15),
                     new cbe.h(cjb.ud, 3, 1, 12, 15)
                  },
                  5,
                  new cbe.f[]{new cbe.h(cjb.pl, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            cbd.i,
            a(
               ImmutableMap.of(
                  1,
                  new cbe.f[]{new cbe.b(cjb.oB, 32, 16, 2), new cbe.h(cjb.nH, 1, 16, 1), new cbe.g(csn.L, 10, cjb.pi, 10, 12, 1)},
                  2,
                  new cbe.f[]{new cbe.b(cjb.pi, 26, 12, 10), new cbe.h(cjb.nG, 2, 1, 5)},
                  3,
                  new cbe.f[]{new cbe.b(cjb.oE, 14, 16, 20), new cbe.h(cjb.uZ, 3, 1, 10)},
                  4,
                  new cbe.f[]{new cbe.b(cjb.oF, 24, 16, 30), new cbe.e(cjb.nG, 2, 3, 15)},
                  5,
                  new cbe.f[]{new cbe.b(cjb.lF, 8, 12, 30), new cbe.e(cjb.uZ, 3, 3, 15), new cbe.j(cjb.nH, 5, cjb.uw, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            cbd.k,
            a(
               ImmutableMap.builder()
                  .put(1, new cbe.f[]{new cbe.b(cjb.qa, 24, 16, 2), new cbe.d(1), new cbe.h(csn.cl, 9, 1, 12, 1)})
                  .put(2, new cbe.f[]{new cbe.b(cjb.qb, 4, 12, 10), new cbe.d(5), new cbe.h(cjb.vt, 1, 1, 5)})
                  .put(3, new cbe.f[]{new cbe.b(cjb.qr, 5, 12, 20), new cbe.d(10), new cbe.h(cjb.ck, 1, 4, 10)})
                  .put(4, new cbe.f[]{new cbe.b(cjb.tg, 2, 12, 30), new cbe.d(15), new cbe.h(cjb.qi, 5, 1, 15), new cbe.h(cjb.qe, 4, 1, 15)})
                  .put(5, new cbe.f[]{new cbe.h(cjb.tR, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            cbd.e,
            a(
               ImmutableMap.of(
                  1,
                  new cbe.f[]{new cbe.b(cjb.qa, 24, 16, 2), new cbe.h(cjb.tp, 7, 1, 1)},
                  2,
                  new cbe.f[]{new cbe.b(cjb.fx, 11, 16, 10), new cbe.k(13, apw.d, "filled_map.monument", ebk.a.j, 12, 5)},
                  3,
                  new cbe.f[]{new cbe.b(cjb.qe, 1, 12, 20), new cbe.k(14, apw.c, "filled_map.mansion", ebk.a.i, 12, 10)},
                  4,
                  new cbe.f[]{
                     new cbe.h(cjb.ti, 7, 1, 15),
                     new cbe.h(cjb.tV, 3, 1, 15),
                     new cbe.h(cjb.ug, 3, 1, 15),
                     new cbe.h(cjb.tY, 3, 1, 15),
                     new cbe.h(cjb.uj, 3, 1, 15),
                     new cbe.h(cjb.ub, 3, 1, 15),
                     new cbe.h(cjb.ui, 3, 1, 15),
                     new cbe.h(cjb.ua, 3, 1, 15),
                     new cbe.h(cjb.uc, 3, 1, 15),
                     new cbe.h(cjb.uk, 3, 1, 15),
                     new cbe.h(cjb.uf, 3, 1, 15),
                     new cbe.h(cjb.tX, 3, 1, 15),
                     new cbe.h(cjb.ue, 3, 1, 15),
                     new cbe.h(cjb.uh, 3, 1, 15),
                     new cbe.h(cjb.tZ, 3, 1, 15),
                     new cbe.h(cjb.tW, 3, 1, 15),
                     new cbe.h(cjb.ud, 3, 1, 15)
                  },
                  5,
                  new cbe.f[]{new cbe.h(cjb.vg, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            cbd.f,
            a(
               ImmutableMap.of(
                  1,
                  new cbe.f[]{new cbe.b(cjb.rp, 32, 16, 2), new cbe.h(cjb.ll, 1, 2, 1)},
                  2,
                  new cbe.f[]{new cbe.b(cjb.nU, 3, 12, 10), new cbe.h(cjb.nM, 1, 1, 5)},
                  3,
                  new cbe.f[]{new cbe.b(cjb.tJ, 2, 12, 20), new cbe.h(csn.ed, 4, 1, 12, 10)},
                  4,
                  new cbe.f[]{new cbe.b(cjb.nD, 4, 12, 30), new cbe.b(cjb.rw, 9, 12, 30), new cbe.h(cjb.rq, 5, 1, 15)},
                  5,
                  new cbe.f[]{new cbe.b(cjb.ru, 22, 12, 30), new cbe.h(cjb.te, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            cbd.c,
            a(
               ImmutableMap.of(
                  1,
                  new cbe.f[]{
                     new cbe.b(cjb.nI, 15, 16, 2),
                     new cbe.h(new ciy(cjb.oU), 7, 1, 12, 1, 0.2F),
                     new cbe.h(new ciy(cjb.oV), 4, 1, 12, 1, 0.2F),
                     new cbe.h(new ciy(cjb.oS), 5, 1, 12, 1, 0.2F),
                     new cbe.h(new ciy(cjb.oT), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cbe.f[]{
                     new cbe.b(cjb.nQ, 4, 12, 10),
                     new cbe.h(new ciy(cjb.vs), 36, 1, 12, 5, 0.2F),
                     new cbe.h(new ciy(cjb.oR), 1, 1, 12, 5, 0.2F),
                     new cbe.h(new ciy(cjb.oQ), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new cbe.f[]{
                     new cbe.b(cjb.pM, 1, 12, 20),
                     new cbe.b(cjb.nK, 1, 12, 20),
                     new cbe.h(new ciy(cjb.oO), 1, 1, 12, 10, 0.2F),
                     new cbe.h(new ciy(cjb.oP), 4, 1, 12, 10, 0.2F),
                     new cbe.h(new ciy(cjb.uy), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new cbe.f[]{new cbe.e(cjb.oY, 14, 3, 15, 0.2F), new cbe.e(cjb.oZ, 8, 3, 15, 0.2F)},
                  5,
                  new cbe.f[]{new cbe.e(cjb.oW, 8, 3, 30, 0.2F), new cbe.e(cjb.oX, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cbd.p,
            a(
               ImmutableMap.of(
                  1,
                  new cbe.f[]{new cbe.b(cjb.nI, 15, 16, 2), new cbe.h(new ciy(cjb.op), 3, 1, 12, 1, 0.2F), new cbe.e(cjb.om, 2, 3, 1)},
                  2,
                  new cbe.f[]{new cbe.b(cjb.nQ, 4, 12, 10), new cbe.h(new ciy(cjb.vs), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cbe.f[]{new cbe.b(cjb.pi, 24, 12, 20)},
                  4,
                  new cbe.f[]{new cbe.b(cjb.nK, 1, 12, 30), new cbe.e(cjb.ou, 12, 3, 15, 0.2F)},
                  5,
                  new cbe.f[]{new cbe.e(cjb.or, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cbd.o,
            a(
               ImmutableMap.of(
                  1,
                  new cbe.f[]{
                     new cbe.b(cjb.nI, 15, 16, 2),
                     new cbe.h(new ciy(cjb.of), 1, 1, 12, 1, 0.2F),
                     new cbe.h(new ciy(cjb.od), 1, 1, 12, 1, 0.2F),
                     new cbe.h(new ciy(cjb.oe), 1, 1, 12, 1, 0.2F),
                     new cbe.h(new ciy(cjb.og), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cbe.f[]{new cbe.b(cjb.nQ, 4, 12, 10), new cbe.h(new ciy(cjb.vs), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cbe.f[]{
                     new cbe.b(cjb.pi, 30, 12, 20),
                     new cbe.e(cjb.op, 1, 3, 10, 0.2F),
                     new cbe.e(cjb.on, 2, 3, 10, 0.2F),
                     new cbe.e(cjb.oo, 3, 3, 10, 0.2F),
                     new cbe.h(new ciy(cjb.ov), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new cbe.f[]{new cbe.b(cjb.nK, 1, 12, 30), new cbe.e(cjb.ou, 12, 3, 15, 0.2F), new cbe.e(cjb.os, 5, 3, 15, 0.2F)},
                  5,
                  new cbe.f[]{new cbe.e(cjb.ot, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cbd.d,
            a(
               ImmutableMap.of(
                  1,
                  new cbe.f[]{new cbe.b(cjb.rn, 14, 16, 2), new cbe.b(cjb.pj, 7, 16, 2), new cbe.b(cjb.tG, 4, 16, 2), new cbe.h(cjb.tI, 1, 1, 1)},
                  2,
                  new cbe.f[]{new cbe.b(cjb.nI, 15, 16, 2), new cbe.h(cjb.pk, 1, 5, 16, 5), new cbe.h(cjb.ro, 1, 8, 16, 5)},
                  3,
                  new cbe.f[]{new cbe.b(cjb.tT, 7, 16, 20), new cbe.b(cjb.rl, 10, 16, 20)},
                  4,
                  new cbe.f[]{new cbe.b(cjb.pZ, 10, 12, 30)},
                  5,
                  new cbe.f[]{new cbe.b(cjb.vv, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            cbd.j,
            a(
               ImmutableMap.of(
                  1,
                  new cbe.f[]{new cbe.b(cjb.pP, 6, 16, 2), new cbe.a(cjb.oM, 3), new cbe.a(cjb.oL, 7)},
                  2,
                  new cbe.f[]{new cbe.b(cjb.pi, 26, 12, 10), new cbe.a(cjb.oK, 5, 12, 5), new cbe.a(cjb.oN, 4, 12, 5)},
                  3,
                  new cbe.f[]{new cbe.b(cjb.tK, 9, 12, 20), new cbe.a(cjb.oL, 7)},
                  4,
                  new cbe.f[]{new cbe.b(cjb.nD, 4, 12, 30), new cbe.a(cjb.tP, 6, 12, 15)},
                  5,
                  new cbe.f[]{new cbe.h(new ciy(cjb.mZ), 6, 1, 12, 30, 0.2F), new cbe.a(cjb.oK, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            cbd.l,
            a(
               ImmutableMap.of(
                  1,
                  new cbe.f[]{new cbe.b(cjb.pY, 10, 16, 2), new cbe.h(cjb.pX, 1, 10, 16, 1)},
                  2,
                  new cbe.f[]{new cbe.b(csn.b, 20, 16, 10), new cbe.h(csn.eL, 1, 4, 16, 5)},
                  3,
                  new cbe.f[]{
                     new cbe.b(csn.c, 16, 16, 20),
                     new cbe.b(csn.g, 16, 16, 20),
                     new cbe.b(csn.e, 16, 16, 20),
                     new cbe.h(csn.rt, 1, 4, 16, 10),
                     new cbe.h(csn.h, 1, 4, 16, 10),
                     new cbe.h(csn.f, 1, 4, 16, 10),
                     new cbe.h(csn.d, 1, 4, 16, 10)
                  },
                  4,
                  new cbe.f[]{
                     new cbe.b(cjb.nN, 12, 12, 30),
                     new cbe.h(csn.hk, 1, 1, 12, 15),
                     new cbe.h(csn.hj, 1, 1, 12, 15),
                     new cbe.h(csn.hu, 1, 1, 12, 15),
                     new cbe.h(csn.hm, 1, 1, 12, 15),
                     new cbe.h(csn.hq, 1, 1, 12, 15),
                     new cbe.h(csn.hr, 1, 1, 12, 15),
                     new cbe.h(csn.hy, 1, 1, 12, 15),
                     new cbe.h(csn.hx, 1, 1, 12, 15),
                     new cbe.h(csn.hp, 1, 1, 12, 15),
                     new cbe.h(csn.hl, 1, 1, 12, 15),
                     new cbe.h(csn.ho, 1, 1, 12, 15),
                     new cbe.h(csn.hw, 1, 1, 12, 15),
                     new cbe.h(csn.hs, 1, 1, 12, 15),
                     new cbe.h(csn.ht, 1, 1, 12, 15),
                     new cbe.h(csn.hn, 1, 1, 12, 15),
                     new cbe.h(csn.hv, 1, 1, 12, 15),
                     new cbe.h(csn.lh, 1, 1, 12, 15),
                     new cbe.h(csn.lg, 1, 1, 12, 15),
                     new cbe.h(csn.lr, 1, 1, 12, 15),
                     new cbe.h(csn.lj, 1, 1, 12, 15),
                     new cbe.h(csn.ln, 1, 1, 12, 15),
                     new cbe.h(csn.lo, 1, 1, 12, 15),
                     new cbe.h(csn.lv, 1, 1, 12, 15),
                     new cbe.h(csn.lu, 1, 1, 12, 15),
                     new cbe.h(csn.lm, 1, 1, 12, 15),
                     new cbe.h(csn.li, 1, 1, 12, 15),
                     new cbe.h(csn.ll, 1, 1, 12, 15),
                     new cbe.h(csn.lt, 1, 1, 12, 15),
                     new cbe.h(csn.lp, 1, 1, 12, 15),
                     new cbe.h(csn.lq, 1, 1, 12, 15),
                     new cbe.h(csn.lk, 1, 1, 12, 15),
                     new cbe.h(csn.ls, 1, 1, 12, 15)
                  },
                  5,
                  new cbe.f[]{new cbe.h(csn.hf, 1, 1, 12, 30), new cbe.h(csn.hd, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<cbe.f[]> b = a(
      ImmutableMap.of(
         1,
         new cbe.f[]{
            new cbe.h(cjb.cx, 2, 1, 5, 1),
            new cbe.h(cjb.qc, 4, 1, 5, 1),
            new cbe.h(cjb.eY, 2, 1, 5, 1),
            new cbe.h(cjb.uX, 5, 1, 5, 1),
            new cbe.h(cjb.cs, 1, 1, 12, 1),
            new cbe.h(cjb.dn, 1, 1, 8, 1),
            new cbe.h(cjb.eO, 1, 1, 4, 1),
            new cbe.h(cjb.do, 3, 1, 12, 1),
            new cbe.h(cjb.eA, 3, 1, 8, 1),
            new cbe.h(cjb.cO, 1, 1, 12, 1),
            new cbe.h(cjb.cP, 1, 1, 12, 1),
            new cbe.h(cjb.cQ, 1, 1, 8, 1),
            new cbe.h(cjb.cR, 1, 1, 12, 1),
            new cbe.h(cjb.cS, 1, 1, 12, 1),
            new cbe.h(cjb.cT, 1, 1, 12, 1),
            new cbe.h(cjb.cU, 1, 1, 12, 1),
            new cbe.h(cjb.cV, 1, 1, 12, 1),
            new cbe.h(cjb.cW, 1, 1, 12, 1),
            new cbe.h(cjb.cX, 1, 1, 12, 1),
            new cbe.h(cjb.cY, 1, 1, 12, 1),
            new cbe.h(cjb.cZ, 1, 1, 7, 1),
            new cbe.h(cjb.oH, 1, 1, 12, 1),
            new cbe.h(cjb.ur, 1, 1, 12, 1),
            new cbe.h(cjb.rj, 1, 1, 12, 1),
            new cbe.h(cjb.rk, 1, 1, 12, 1),
            new cbe.h(cjb.N, 5, 1, 8, 1),
            new cbe.h(cjb.L, 5, 1, 8, 1),
            new cbe.h(cjb.P, 5, 1, 8, 1),
            new cbe.h(cjb.M, 5, 1, 8, 1),
            new cbe.h(cjb.J, 5, 1, 8, 1),
            new cbe.h(cjb.K, 5, 1, 8, 1),
            new cbe.h(cjb.O, 5, 1, 8, 1),
            new cbe.h(cjb.Q, 5, 1, 8, 1),
            new cbe.h(cjb.qI, 1, 3, 12, 1),
            new cbe.h(cjb.qu, 1, 3, 12, 1),
            new cbe.h(cjb.qF, 1, 3, 12, 1),
            new cbe.h(cjb.qA, 1, 3, 12, 1),
            new cbe.h(cjb.qJ, 1, 3, 12, 1),
            new cbe.h(cjb.qH, 1, 3, 12, 1),
            new cbe.h(cjb.qC, 1, 3, 12, 1),
            new cbe.h(cjb.qw, 1, 3, 12, 1),
            new cbe.h(cjb.qy, 1, 3, 12, 1),
            new cbe.h(cjb.qB, 1, 3, 12, 1),
            new cbe.h(cjb.qE, 1, 3, 12, 1),
            new cbe.h(cjb.qx, 1, 3, 12, 1),
            new cbe.h(cjb.qz, 1, 3, 12, 1),
            new cbe.h(cjb.qv, 1, 3, 12, 1),
            new cbe.h(cjb.qG, 1, 3, 12, 1),
            new cbe.h(cjb.qD, 1, 3, 12, 1),
            new cbe.h(cjb.kb, 3, 1, 8, 1),
            new cbe.h(cjb.kc, 3, 1, 8, 1),
            new cbe.h(cjb.kd, 3, 1, 8, 1),
            new cbe.h(cjb.ke, 3, 1, 8, 1),
            new cbe.h(cjb.ka, 3, 1, 8, 1),
            new cbe.h(cjb.fz, 1, 1, 12, 1),
            new cbe.h(cjb.de, 1, 1, 12, 1),
            new cbe.h(cjb.df, 1, 1, 12, 1),
            new cbe.h(cjb.fF, 1, 2, 5, 1),
            new cbe.h(cjb.du, 1, 2, 5, 1),
            new cbe.h(cjb.S, 1, 8, 8, 1),
            new cbe.h(cjb.V, 1, 4, 6, 1),
            new cbe.h(cjb.wp, 1, 2, 5, 1),
            new cbe.h(cjb.s, 1, 2, 5, 1),
            new cbe.h(cjb.dr, 1, 2, 5, 1)
         },
         2,
         new cbe.f[]{
            new cbe.h(cjb.pU, 5, 1, 4, 1),
            new cbe.h(cjb.pR, 5, 1, 4, 1),
            new cbe.h(cjb.hz, 3, 1, 6, 1),
            new cbe.h(cjb.kz, 6, 1, 6, 1),
            new cbe.h(cjb.oG, 1, 1, 8, 1),
            new cbe.h(cjb.r, 3, 3, 6, 1)
         }
      )
   );
   public static final Map<cbd, Int2ObjectMap<cbe.f[]>> c = Map.of(
      cbd.k,
      a(
         ImmutableMap.builder()
            .put(1, new cbe.f[]{new cbe.b(cjb.qa, 24, 16, 2), a(1), new cbe.h(csn.cl, 9, 1, 12, 1)})
            .put(2, new cbe.f[]{new cbe.b(cjb.qb, 4, 12, 10), a(5), new cbe.h(cjb.vt, 1, 1, 5)})
            .put(3, new cbe.f[]{new cbe.b(cjb.qr, 5, 12, 20), a(10), new cbe.h(cjb.ck, 1, 4, 10)})
            .put(4, new cbe.f[]{new cbe.b(cjb.tg, 2, 12, 30), new cbe.h(cjb.qi, 5, 1, 15), new cbe.h(cjb.qe, 4, 1, 15)})
            .put(5, new cbe.f[]{a(), new cbe.h(cjb.tR, 20, 1, 30)})
            .build()
      )
   );
   public static final List<Pair<cbe.f[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new cbe.f[]{
               new cbe.b(a(cky.c), 1, 1, 1),
               new cbe.b(cjb.pL, 1, 1, 1, 2),
               new cbe.b(cjb.pQ, 1, 1, 1, 2),
               new cbe.b(cjb.ry, 1, 1, 1, 3),
               new cbe.b(cjb.tn, 4, 1, 1),
               new cbe.b(cjb.hh, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cbe.f[]{
               new cbe.h(cjb.hz, 1, 1, 6, 1),
               new cbe.h(cjb.kz, 6, 1, 6, 1),
               new cbe.h(cjb.oG, 1, 4, 2, 1),
               new cbe.h(cjb.r, 3, 3, 6, 1),
               new cbe.h(csn.Y, 1, 8, 4, 1),
               new cbe.h(csn.W, 1, 8, 4, 1),
               new cbe.h(csn.aa, 1, 8, 4, 1),
               new cbe.h(csn.X, 1, 8, 4, 1),
               new cbe.h(csn.U, 1, 8, 4, 1),
               new cbe.h(csn.V, 1, 8, 4, 1),
               new cbe.h(csn.Z, 1, 8, 4, 1),
               new cbe.e(cjb.oo, 1, 1, 1, 0.2F),
               new cbe.h(a(cky.j), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cbe.f[]{
               new cbe.h(cjb.pU, 3, 1, 4, 1),
               new cbe.h(cjb.pR, 3, 1, 4, 1),
               new cbe.h(cjb.cx, 2, 1, 5, 1),
               new cbe.h(cjb.qc, 4, 1, 5, 1),
               new cbe.h(cjb.eY, 2, 1, 5, 1),
               new cbe.h(cjb.uX, 5, 1, 5, 1),
               new cbe.h(cjb.cs, 1, 1, 12, 1),
               new cbe.h(cjb.dn, 1, 1, 8, 1),
               new cbe.h(cjb.eO, 1, 1, 4, 1),
               new cbe.h(cjb.do, 3, 1, 12, 1),
               new cbe.h(cjb.eA, 3, 1, 8, 1),
               new cbe.h(cjb.cO, 1, 1, 12, 1),
               new cbe.h(cjb.cP, 1, 1, 12, 1),
               new cbe.h(cjb.cQ, 1, 1, 8, 1),
               new cbe.h(cjb.cR, 1, 1, 12, 1),
               new cbe.h(cjb.cS, 1, 1, 12, 1),
               new cbe.h(cjb.cT, 1, 1, 12, 1),
               new cbe.h(cjb.cU, 1, 1, 12, 1),
               new cbe.h(cjb.cV, 1, 1, 12, 1),
               new cbe.h(cjb.cW, 1, 1, 12, 1),
               new cbe.h(cjb.cX, 1, 1, 12, 1),
               new cbe.h(cjb.cY, 1, 1, 12, 1),
               new cbe.h(cjb.cZ, 1, 1, 7, 1),
               new cbe.h(cjb.oH, 1, 1, 12, 1),
               new cbe.h(cjb.ur, 1, 1, 12, 1),
               new cbe.h(cjb.rj, 1, 1, 12, 1),
               new cbe.h(cjb.rk, 1, 1, 12, 1),
               new cbe.h(cjb.N, 5, 1, 8, 1),
               new cbe.h(cjb.L, 5, 1, 8, 1),
               new cbe.h(cjb.P, 5, 1, 8, 1),
               new cbe.h(cjb.M, 5, 1, 8, 1),
               new cbe.h(cjb.J, 5, 1, 8, 1),
               new cbe.h(cjb.K, 5, 1, 8, 1),
               new cbe.h(cjb.O, 5, 1, 8, 1),
               new cbe.h(cjb.Q, 5, 1, 8, 1),
               new cbe.h(cjb.qI, 1, 3, 12, 1),
               new cbe.h(cjb.qu, 1, 3, 12, 1),
               new cbe.h(cjb.qF, 1, 3, 12, 1),
               new cbe.h(cjb.qA, 1, 3, 12, 1),
               new cbe.h(cjb.qJ, 1, 3, 12, 1),
               new cbe.h(cjb.qH, 1, 3, 12, 1),
               new cbe.h(cjb.qC, 1, 3, 12, 1),
               new cbe.h(cjb.qw, 1, 3, 12, 1),
               new cbe.h(cjb.qy, 1, 3, 12, 1),
               new cbe.h(cjb.qB, 1, 3, 12, 1),
               new cbe.h(cjb.qE, 1, 3, 12, 1),
               new cbe.h(cjb.qx, 1, 3, 12, 1),
               new cbe.h(cjb.qz, 1, 3, 12, 1),
               new cbe.h(cjb.qv, 1, 3, 12, 1),
               new cbe.h(cjb.qG, 1, 3, 12, 1),
               new cbe.h(cjb.qD, 1, 3, 12, 1),
               new cbe.h(cjb.kb, 3, 1, 8, 1),
               new cbe.h(cjb.kc, 3, 1, 8, 1),
               new cbe.h(cjb.kd, 3, 1, 8, 1),
               new cbe.h(cjb.ke, 3, 1, 8, 1),
               new cbe.h(cjb.ka, 3, 1, 8, 1),
               new cbe.h(cjb.fz, 1, 3, 4, 1),
               new cbe.h(cjb.de, 1, 3, 4, 1),
               new cbe.h(cjb.df, 1, 3, 4, 1),
               new cbe.h(cjb.fF, 1, 5, 2, 1),
               new cbe.h(cjb.du, 1, 2, 5, 1),
               new cbe.h(cjb.S, 1, 8, 8, 1),
               new cbe.h(cjb.V, 1, 4, 6, 1),
               new cbe.h(cjb.wp, 1, 2, 5, 1),
               new cbe.h(cjb.s, 1, 2, 5, 1),
               new cbe.h(cjb.dr, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static cbe.f a(int $$0) {
      return new cbe.l(
         ImmutableMap.builder()
            .put(cbf.a, new cbe.d($$0, cnj.b, cnj.h, cnj.B))
            .put(cbf.b, new cbe.d($$0, cnj.c, cnj.e, cnj.y))
            .put(cbf.c, new cbe.d($$0, cnj.z, cnj.o, cnj.p))
            .put(cbf.d, new cbe.d($$0, cnj.q, cnj.k, cnj.t))
            .put(cbf.e, new cbe.d($$0, cnj.g, cnj.s, cnj.j))
            .put(cbf.f, new cbe.d($$0, cnj.i, cnj.f, cnj.M))
            .put(cbf.g, new cbe.d($$0, cnj.d, cnj.r, cnj.A))
            .build()
      );
   }

   private static cbe.f a() {
      return new cbe.l(
         ImmutableMap.builder()
            .put(cbf.a, new cbe.d(30, 3, 3, cnj.u))
            .put(cbf.b, new cbe.d(30, 2, 2, cnj.w))
            .put(cbf.c, new cbe.d(30, 3, 3, cnj.a))
            .put(cbf.d, new cbe.d(30, 3, 3, cnj.n))
            .put(cbf.e, new cbe.d(30, cnj.v))
            .put(cbf.f, new cbe.d(30, cnj.L))
            .put(cbf.g, new cbe.d(30, 2, 2, cnj.x))
            .build()
      );
   }

   private static Int2ObjectMap<cbe.f[]> a(ImmutableMap<Integer, cbe.f[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static ciy a(ckv $$0) {
      return ckx.a(new ciy(cjb.rv), $$0);
   }

   static class a implements cbe.f {
      private final cit a;
      private final int b;
      private final int c;
      private final int d;

      public a(cit $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(cit $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public coj a(bii $$0, aru $$1) {
         ciy $$2 = new ciy(cjb.nL, this.b);
         ciy $$3 = new ciy(this.a);
         if (this.a instanceof cho) {
            List<chn> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = chq.a($$3, $$4);
         }

         return new coj($$2, $$3, this.c, this.d, 0.2F);
      }

      private static chn a(aru $$0) {
         return chn.a(chm.a($$0.a(16)));
      }
   }

   static class b implements cbe.f {
      private final ciy a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(cpl $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(cpl $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new ciy($$0.k(), $$1), $$2, $$3, $$4);
      }

      public b(ciy $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public coj a(bii $$0, aru $$1) {
         return new coj(this.a.p(), new ciy(cjb.nL, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements cbe.f {
      private final Map<cbf, cit> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<cbf, cit> $$3) {
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
      public coj a(bii $$0, aru $$1) {
         if ($$0 instanceof cbc $$2) {
            ciy $$3 = new ciy(this.a.get($$2.gk().a()), this.b);
            return new coj($$3, new ciy(cjb.nL), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements cbe.f {
      private final int a;
      private final List<cnf> b;
      private final int c;
      private final int d;

      public d(int $$0) {
         this($$0, jb.g.s().filter(cnf::h).toArray(cnf[]::new));
      }

      public d(int $$0, cnf... $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, cnf... $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = Arrays.asList($$3);
      }

      @Override
      public coj a(bii $$0, aru $$1) {
         cnf $$2 = this.b.get($$1.a(this.b.size()));
         int $$3 = Math.max($$2.e(), this.c);
         int $$4 = Math.min($$2.a(), this.d);
         int $$5 = arp.a($$1, $$3, $$4);
         ciy $$6 = chu.a(new cni($$2, $$5));
         int $$7 = 2 + $$1.a(5 + $$5 * 10) + 3 * $$5;
         if ($$2.b()) {
            $$7 *= 2;
         }

         if ($$7 > 64) {
            $$7 = 64;
         }

         return new coj(new ciy(cjb.nL, $$7), new ciy(cjb.qb), $$6, 12, this.a, 0.2F);
      }
   }

   static class e implements cbe.f {
      private final ciy a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(cit $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(cit $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new ciy($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public coj a(bii $$0, aru $$1) {
         int $$2 = 5 + $$1.a(15);
         ciy $$3 = cnh.a($$1, new ciy(this.a.d()), $$2, false);
         int $$4 = Math.min(this.b + $$2, 64);
         ciy $$5 = new ciy(cjb.nL, $$4);
         return new coj($$5, $$3, this.c, this.d, this.e);
      }
   }

   public interface f {
      @Nullable
      coj a(bii var1, aru var2);
   }

   static class g implements cbe.f {
      private final ciy a;
      private final int b;
      private final int c;
      private final ciy d;
      private final int e;
      private final int f;
      private final int g;
      private final float h;

      public g(cpl $$0, int $$1, cit $$2, int $$3, int $$4, int $$5) {
         this($$0, $$1, 1, $$2, $$3, $$4, $$5);
      }

      public g(cpl $$0, int $$1, int $$2, cit $$3, int $$4, int $$5, int $$6) {
         this.a = new ciy($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = new ciy($$3);
         this.e = $$4;
         this.f = $$5;
         this.g = $$6;
         this.h = 0.05F;
      }

      @Nullable
      @Override
      public coj a(bii $$0, aru $$1) {
         return new coj(new ciy(cjb.nL, this.c), new ciy(this.a.d(), this.b), new ciy(this.d.d(), this.e), this.f, this.g, this.h);
      }
   }

   static class h implements cbe.f {
      private final ciy a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public h(csm $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new ciy($$0), $$1, $$2, $$3, $$4);
      }

      public h(cit $$0, int $$1, int $$2, int $$3) {
         this(new ciy($$0), $$1, $$2, 12, $$3);
      }

      public h(cit $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new ciy($$0), $$1, $$2, $$3, $$4);
      }

      public h(ciy $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public h(ciy $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.a.f($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
      }

      @Override
      public coj a(bii $$0, aru $$1) {
         return new coj(new ciy(cjb.nL, this.b), this.a.p(), this.c, this.d, this.e);
      }
   }

   static class i implements cbe.f {
      private final List<dap.a> a;
      private final int b;
      private final float c;

      public i(bht $$0, int $$1, int $$2) {
         this(List.of(new dap.a($$0, $$1)), $$2, 0.05F);
      }

      public i(List<dap.a> $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public coj a(bii $$0, aru $$1) {
         ciy $$2 = new ciy(cjb.va, 1);
         cki.a($$2, this.a);
         return new coj(new ciy(cjb.nL, 1), $$2, 12, this.b, this.c);
      }
   }

   static class j implements cbe.f {
      private final ciy a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final cit f;
      private final int g;
      private final float h;

      public j(cit $$0, int $$1, cit $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new ciy($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public coj a(bii $$0, aru $$1) {
         ciy $$2 = new ciy(cjb.nL, this.c);
         List<ckv> $$3 = jb.j.s().filter($$0x -> !$$0x.a().isEmpty() && ckw.a($$0x)).collect(Collectors.toList());
         ckv $$4 = $$3.get($$1.a($$3.size()));
         ciy $$5 = ckx.a(new ciy(this.a.d(), this.b), $$4);
         return new coj($$2, new ciy(this.f, this.g), $$5, this.d, this.e, this.h);
      }
   }

   static class k implements cbe.f {
      private final int a;
      private final aqa<duz> b;
      private final String c;
      private final ebk.a d;
      private final int e;
      private final int f;

      public k(int $$0, aqa<duz> $$1, String $$2, ebk.a $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public coj a(bii $$0, aru $$1) {
         if (!($$0.dK() instanceof akk)) {
            return null;
         } else {
            akk $$2 = (akk)$$0.dK();
            gu $$3 = $$2.a(this.b, $$0.dk(), 100, true);
            if ($$3 != null) {
               ciy $$4 = cjf.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               cjf.a($$2, $$4);
               ebn.a($$4, $$3, "+", this.d);
               $$4.a(tf.c(this.c));
               return new coj(new ciy(cjb.nL, this.a), new ciy(cjb.qe), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static class l implements cbe.f {
      private final Map<cbf, cbe.f> a;

      public l(Map<cbf, cbe.f> $$0) {
         jb.z.s().filter($$1 -> !$$0.containsKey($$1)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + jb.z.b($$0x));
         });
         this.a = $$0;
      }

      @Nullable
      @Override
      public coj a(bii $$0, aru $$1) {
         if ($$0 instanceof cbc $$2) {
            cbf $$3 = $$2.gk().a();
            return this.a.get($$3).a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
