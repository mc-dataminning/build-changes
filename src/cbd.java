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

public class cbd {
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
   public static final Map<cbc, Int2ObjectMap<cbd.f[]>> a = ac.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            cbc.g,
            a(
               ImmutableMap.of(
                  1,
                  new cbd.f[]{
                     new cbd.b(cja.oI, 20, 16, 2),
                     new cbd.b(cja.tm, 26, 16, 2),
                     new cbd.b(cja.tl, 22, 16, 2),
                     new cbd.b(cja.uq, 15, 16, 2),
                     new cbd.h(cja.oJ, 1, 6, 16, 1)
                  },
                  2,
                  new cbd.f[]{new cbd.b(csm.dV, 6, 12, 10), new cbd.h(cja.tz, 1, 4, 5), new cbd.h(cja.nF, 1, 4, 16, 5)},
                  3,
                  new cbd.f[]{new cbd.h(cja.re, 3, 18, 10), new cbd.b(csm.fa, 4, 12, 20)},
                  4,
                  new cbd.f[]{
                     new cbd.h(csm.eh, 1, 1, 12, 15),
                     new cbd.i(bhx.p, 100, 15),
                     new cbd.i(bhx.h, 160, 15),
                     new cbd.i(bhx.r, 140, 15),
                     new cbd.i(bhx.o, 120, 15),
                     new cbd.i(bhx.s, 280, 15),
                     new cbd.i(bhx.w, 7, 15)
                  },
                  5,
                  new cbd.f[]{new cbd.h(cja.tq, 3, 3, 30), new cbd.h(cja.rE, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            cbc.h,
            a(
               ImmutableMap.of(
                  1,
                  new cbd.f[]{
                     new cbd.b(cja.oE, 20, 16, 2), new cbd.b(cja.nI, 10, 16, 2), new cbd.g(cja.ql, 6, cja.qp, 6, 16, 1), new cbd.h(cja.pT, 3, 1, 16, 1)
                  },
                  2,
                  new cbd.f[]{new cbd.b(cja.ql, 15, 16, 10), new cbd.g(cja.qm, 6, cja.qq, 6, 16, 5), new cbd.h(cja.vx, 2, 1, 5)},
                  3,
                  new cbd.f[]{new cbd.b(cja.qm, 13, 16, 20), new cbd.e(cja.qh, 3, 3, 10, 0.2F)},
                  4,
                  new cbd.f[]{new cbd.b(cja.qn, 6, 12, 30)},
                  5,
                  new cbd.f[]{
                     new cbd.b(cja.qo, 4, 12, 30),
                     new cbd.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(cbe.c, cja.ni)
                           .put(cbe.g, cja.nk)
                           .put(cbe.e, cja.nk)
                           .put(cbe.a, cja.no)
                           .put(cbe.b, cja.no)
                           .put(cbe.d, cja.nq)
                           .put(cbe.f, cja.nu)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            cbc.n,
            a(
               ImmutableMap.of(
                  1,
                  new cbd.f[]{
                     new cbd.b(csm.bA, 18, 16, 2),
                     new cbd.b(csm.bM, 18, 16, 2),
                     new cbd.b(csm.bP, 18, 16, 2),
                     new cbd.b(csm.bH, 18, 16, 2),
                     new cbd.h(cja.rg, 2, 1, 1)
                  },
                  2,
                  new cbd.f[]{
                     new cbd.b(cja.qu, 12, 16, 10),
                     new cbd.b(cja.qB, 12, 16, 10),
                     new cbd.b(cja.qJ, 12, 16, 10),
                     new cbd.b(cja.qx, 12, 16, 10),
                     new cbd.b(cja.qz, 12, 16, 10),
                     new cbd.h(csm.bA, 1, 1, 16, 5),
                     new cbd.h(csm.bB, 1, 1, 16, 5),
                     new cbd.h(csm.bC, 1, 1, 16, 5),
                     new cbd.h(csm.bD, 1, 1, 16, 5),
                     new cbd.h(csm.bE, 1, 1, 16, 5),
                     new cbd.h(csm.bF, 1, 1, 16, 5),
                     new cbd.h(csm.bG, 1, 1, 16, 5),
                     new cbd.h(csm.bH, 1, 1, 16, 5),
                     new cbd.h(csm.bI, 1, 1, 16, 5),
                     new cbd.h(csm.bJ, 1, 1, 16, 5),
                     new cbd.h(csm.bK, 1, 1, 16, 5),
                     new cbd.h(csm.bL, 1, 1, 16, 5),
                     new cbd.h(csm.bM, 1, 1, 16, 5),
                     new cbd.h(csm.bN, 1, 1, 16, 5),
                     new cbd.h(csm.bO, 1, 1, 16, 5),
                     new cbd.h(csm.bP, 1, 1, 16, 5),
                     new cbd.h(csm.ik, 1, 4, 16, 5),
                     new cbd.h(csm.il, 1, 4, 16, 5),
                     new cbd.h(csm.im, 1, 4, 16, 5),
                     new cbd.h(csm.in, 1, 4, 16, 5),
                     new cbd.h(csm.io, 1, 4, 16, 5),
                     new cbd.h(csm.ip, 1, 4, 16, 5),
                     new cbd.h(csm.iq, 1, 4, 16, 5),
                     new cbd.h(csm.ir, 1, 4, 16, 5),
                     new cbd.h(csm.is, 1, 4, 16, 5),
                     new cbd.h(csm.it, 1, 4, 16, 5),
                     new cbd.h(csm.iu, 1, 4, 16, 5),
                     new cbd.h(csm.iv, 1, 4, 16, 5),
                     new cbd.h(csm.iw, 1, 4, 16, 5),
                     new cbd.h(csm.ix, 1, 4, 16, 5),
                     new cbd.h(csm.iy, 1, 4, 16, 5),
                     new cbd.h(csm.iz, 1, 4, 16, 5)
                  },
                  3,
                  new cbd.f[]{
                     new cbd.b(cja.qy, 12, 16, 20),
                     new cbd.b(cja.qC, 12, 16, 20),
                     new cbd.b(cja.qv, 12, 16, 20),
                     new cbd.b(cja.qI, 12, 16, 20),
                     new cbd.b(cja.qA, 12, 16, 20),
                     new cbd.h(csm.aZ, 3, 1, 12, 10),
                     new cbd.h(csm.bd, 3, 1, 12, 10),
                     new cbd.h(csm.bn, 3, 1, 12, 10),
                     new cbd.h(csm.bo, 3, 1, 12, 10),
                     new cbd.h(csm.bk, 3, 1, 12, 10),
                     new cbd.h(csm.bl, 3, 1, 12, 10),
                     new cbd.h(csm.bi, 3, 1, 12, 10),
                     new cbd.h(csm.bg, 3, 1, 12, 10),
                     new cbd.h(csm.bm, 3, 1, 12, 10),
                     new cbd.h(csm.bc, 3, 1, 12, 10),
                     new cbd.h(csm.bh, 3, 1, 12, 10),
                     new cbd.h(csm.be, 3, 1, 12, 10),
                     new cbd.h(csm.bb, 3, 1, 12, 10),
                     new cbd.h(csm.ba, 3, 1, 12, 10),
                     new cbd.h(csm.bf, 3, 1, 12, 10),
                     new cbd.h(csm.bj, 3, 1, 12, 10)
                  },
                  4,
                  new cbd.f[]{
                     new cbd.b(cja.qG, 12, 16, 30),
                     new cbd.b(cja.qE, 12, 16, 30),
                     new cbd.b(cja.qF, 12, 16, 30),
                     new cbd.b(cja.qH, 12, 16, 30),
                     new cbd.b(cja.qw, 12, 16, 30),
                     new cbd.b(cja.qD, 12, 16, 30),
                     new cbd.h(cja.tV, 3, 1, 12, 15),
                     new cbd.h(cja.ug, 3, 1, 12, 15),
                     new cbd.h(cja.tY, 3, 1, 12, 15),
                     new cbd.h(cja.uj, 3, 1, 12, 15),
                     new cbd.h(cja.ub, 3, 1, 12, 15),
                     new cbd.h(cja.ui, 3, 1, 12, 15),
                     new cbd.h(cja.ua, 3, 1, 12, 15),
                     new cbd.h(cja.uc, 3, 1, 12, 15),
                     new cbd.h(cja.uk, 3, 1, 12, 15),
                     new cbd.h(cja.uf, 3, 1, 12, 15),
                     new cbd.h(cja.tX, 3, 1, 12, 15),
                     new cbd.h(cja.ue, 3, 1, 12, 15),
                     new cbd.h(cja.uh, 3, 1, 12, 15),
                     new cbd.h(cja.tZ, 3, 1, 12, 15),
                     new cbd.h(cja.tW, 3, 1, 12, 15),
                     new cbd.h(cja.ud, 3, 1, 12, 15)
                  },
                  5,
                  new cbd.f[]{new cbd.h(cja.pl, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            cbc.i,
            a(
               ImmutableMap.of(
                  1,
                  new cbd.f[]{new cbd.b(cja.oB, 32, 16, 2), new cbd.h(cja.nH, 1, 16, 1), new cbd.g(csm.L, 10, cja.pi, 10, 12, 1)},
                  2,
                  new cbd.f[]{new cbd.b(cja.pi, 26, 12, 10), new cbd.h(cja.nG, 2, 1, 5)},
                  3,
                  new cbd.f[]{new cbd.b(cja.oE, 14, 16, 20), new cbd.h(cja.uZ, 3, 1, 10)},
                  4,
                  new cbd.f[]{new cbd.b(cja.oF, 24, 16, 30), new cbd.e(cja.nG, 2, 3, 15)},
                  5,
                  new cbd.f[]{new cbd.b(cja.lF, 8, 12, 30), new cbd.e(cja.uZ, 3, 3, 15), new cbd.j(cja.nH, 5, cja.uw, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            cbc.k,
            a(
               ImmutableMap.builder()
                  .put(1, new cbd.f[]{new cbd.b(cja.qa, 24, 16, 2), new cbd.d(1), new cbd.h(csm.cl, 9, 1, 12, 1)})
                  .put(2, new cbd.f[]{new cbd.b(cja.qb, 4, 12, 10), new cbd.d(5), new cbd.h(cja.vt, 1, 1, 5)})
                  .put(3, new cbd.f[]{new cbd.b(cja.qr, 5, 12, 20), new cbd.d(10), new cbd.h(cja.ck, 1, 4, 10)})
                  .put(4, new cbd.f[]{new cbd.b(cja.tg, 2, 12, 30), new cbd.d(15), new cbd.h(cja.qi, 5, 1, 15), new cbd.h(cja.qe, 4, 1, 15)})
                  .put(5, new cbd.f[]{new cbd.h(cja.tR, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            cbc.e,
            a(
               ImmutableMap.of(
                  1,
                  new cbd.f[]{new cbd.b(cja.qa, 24, 16, 2), new cbd.h(cja.tp, 7, 1, 1)},
                  2,
                  new cbd.f[]{new cbd.b(cja.fx, 11, 16, 10), new cbd.k(13, apw.d, "filled_map.monument", ebj.a.j, 12, 5)},
                  3,
                  new cbd.f[]{new cbd.b(cja.qe, 1, 12, 20), new cbd.k(14, apw.c, "filled_map.mansion", ebj.a.i, 12, 10)},
                  4,
                  new cbd.f[]{
                     new cbd.h(cja.ti, 7, 1, 15),
                     new cbd.h(cja.tV, 3, 1, 15),
                     new cbd.h(cja.ug, 3, 1, 15),
                     new cbd.h(cja.tY, 3, 1, 15),
                     new cbd.h(cja.uj, 3, 1, 15),
                     new cbd.h(cja.ub, 3, 1, 15),
                     new cbd.h(cja.ui, 3, 1, 15),
                     new cbd.h(cja.ua, 3, 1, 15),
                     new cbd.h(cja.uc, 3, 1, 15),
                     new cbd.h(cja.uk, 3, 1, 15),
                     new cbd.h(cja.uf, 3, 1, 15),
                     new cbd.h(cja.tX, 3, 1, 15),
                     new cbd.h(cja.ue, 3, 1, 15),
                     new cbd.h(cja.uh, 3, 1, 15),
                     new cbd.h(cja.tZ, 3, 1, 15),
                     new cbd.h(cja.tW, 3, 1, 15),
                     new cbd.h(cja.ud, 3, 1, 15)
                  },
                  5,
                  new cbd.f[]{new cbd.h(cja.vg, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            cbc.f,
            a(
               ImmutableMap.of(
                  1,
                  new cbd.f[]{new cbd.b(cja.rp, 32, 16, 2), new cbd.h(cja.ll, 1, 2, 1)},
                  2,
                  new cbd.f[]{new cbd.b(cja.nU, 3, 12, 10), new cbd.h(cja.nM, 1, 1, 5)},
                  3,
                  new cbd.f[]{new cbd.b(cja.tJ, 2, 12, 20), new cbd.h(csm.ed, 4, 1, 12, 10)},
                  4,
                  new cbd.f[]{new cbd.b(cja.nD, 4, 12, 30), new cbd.b(cja.rw, 9, 12, 30), new cbd.h(cja.rq, 5, 1, 15)},
                  5,
                  new cbd.f[]{new cbd.b(cja.ru, 22, 12, 30), new cbd.h(cja.te, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            cbc.c,
            a(
               ImmutableMap.of(
                  1,
                  new cbd.f[]{
                     new cbd.b(cja.nI, 15, 16, 2),
                     new cbd.h(new cix(cja.oU), 7, 1, 12, 1, 0.2F),
                     new cbd.h(new cix(cja.oV), 4, 1, 12, 1, 0.2F),
                     new cbd.h(new cix(cja.oS), 5, 1, 12, 1, 0.2F),
                     new cbd.h(new cix(cja.oT), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cbd.f[]{
                     new cbd.b(cja.nQ, 4, 12, 10),
                     new cbd.h(new cix(cja.vs), 36, 1, 12, 5, 0.2F),
                     new cbd.h(new cix(cja.oR), 1, 1, 12, 5, 0.2F),
                     new cbd.h(new cix(cja.oQ), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new cbd.f[]{
                     new cbd.b(cja.pM, 1, 12, 20),
                     new cbd.b(cja.nK, 1, 12, 20),
                     new cbd.h(new cix(cja.oO), 1, 1, 12, 10, 0.2F),
                     new cbd.h(new cix(cja.oP), 4, 1, 12, 10, 0.2F),
                     new cbd.h(new cix(cja.uy), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new cbd.f[]{new cbd.e(cja.oY, 14, 3, 15, 0.2F), new cbd.e(cja.oZ, 8, 3, 15, 0.2F)},
                  5,
                  new cbd.f[]{new cbd.e(cja.oW, 8, 3, 30, 0.2F), new cbd.e(cja.oX, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cbc.p,
            a(
               ImmutableMap.of(
                  1,
                  new cbd.f[]{new cbd.b(cja.nI, 15, 16, 2), new cbd.h(new cix(cja.op), 3, 1, 12, 1, 0.2F), new cbd.e(cja.om, 2, 3, 1)},
                  2,
                  new cbd.f[]{new cbd.b(cja.nQ, 4, 12, 10), new cbd.h(new cix(cja.vs), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cbd.f[]{new cbd.b(cja.pi, 24, 12, 20)},
                  4,
                  new cbd.f[]{new cbd.b(cja.nK, 1, 12, 30), new cbd.e(cja.ou, 12, 3, 15, 0.2F)},
                  5,
                  new cbd.f[]{new cbd.e(cja.or, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cbc.o,
            a(
               ImmutableMap.of(
                  1,
                  new cbd.f[]{
                     new cbd.b(cja.nI, 15, 16, 2),
                     new cbd.h(new cix(cja.of), 1, 1, 12, 1, 0.2F),
                     new cbd.h(new cix(cja.od), 1, 1, 12, 1, 0.2F),
                     new cbd.h(new cix(cja.oe), 1, 1, 12, 1, 0.2F),
                     new cbd.h(new cix(cja.og), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cbd.f[]{new cbd.b(cja.nQ, 4, 12, 10), new cbd.h(new cix(cja.vs), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cbd.f[]{
                     new cbd.b(cja.pi, 30, 12, 20),
                     new cbd.e(cja.op, 1, 3, 10, 0.2F),
                     new cbd.e(cja.on, 2, 3, 10, 0.2F),
                     new cbd.e(cja.oo, 3, 3, 10, 0.2F),
                     new cbd.h(new cix(cja.ov), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new cbd.f[]{new cbd.b(cja.nK, 1, 12, 30), new cbd.e(cja.ou, 12, 3, 15, 0.2F), new cbd.e(cja.os, 5, 3, 15, 0.2F)},
                  5,
                  new cbd.f[]{new cbd.e(cja.ot, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cbc.d,
            a(
               ImmutableMap.of(
                  1,
                  new cbd.f[]{new cbd.b(cja.rn, 14, 16, 2), new cbd.b(cja.pj, 7, 16, 2), new cbd.b(cja.tG, 4, 16, 2), new cbd.h(cja.tI, 1, 1, 1)},
                  2,
                  new cbd.f[]{new cbd.b(cja.nI, 15, 16, 2), new cbd.h(cja.pk, 1, 5, 16, 5), new cbd.h(cja.ro, 1, 8, 16, 5)},
                  3,
                  new cbd.f[]{new cbd.b(cja.tT, 7, 16, 20), new cbd.b(cja.rl, 10, 16, 20)},
                  4,
                  new cbd.f[]{new cbd.b(cja.pZ, 10, 12, 30)},
                  5,
                  new cbd.f[]{new cbd.b(cja.vv, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            cbc.j,
            a(
               ImmutableMap.of(
                  1,
                  new cbd.f[]{new cbd.b(cja.pP, 6, 16, 2), new cbd.a(cja.oM, 3), new cbd.a(cja.oL, 7)},
                  2,
                  new cbd.f[]{new cbd.b(cja.pi, 26, 12, 10), new cbd.a(cja.oK, 5, 12, 5), new cbd.a(cja.oN, 4, 12, 5)},
                  3,
                  new cbd.f[]{new cbd.b(cja.tK, 9, 12, 20), new cbd.a(cja.oL, 7)},
                  4,
                  new cbd.f[]{new cbd.b(cja.nD, 4, 12, 30), new cbd.a(cja.tP, 6, 12, 15)},
                  5,
                  new cbd.f[]{new cbd.h(new cix(cja.mZ), 6, 1, 12, 30, 0.2F), new cbd.a(cja.oK, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            cbc.l,
            a(
               ImmutableMap.of(
                  1,
                  new cbd.f[]{new cbd.b(cja.pY, 10, 16, 2), new cbd.h(cja.pX, 1, 10, 16, 1)},
                  2,
                  new cbd.f[]{new cbd.b(csm.b, 20, 16, 10), new cbd.h(csm.eL, 1, 4, 16, 5)},
                  3,
                  new cbd.f[]{
                     new cbd.b(csm.c, 16, 16, 20),
                     new cbd.b(csm.g, 16, 16, 20),
                     new cbd.b(csm.e, 16, 16, 20),
                     new cbd.h(csm.rt, 1, 4, 16, 10),
                     new cbd.h(csm.h, 1, 4, 16, 10),
                     new cbd.h(csm.f, 1, 4, 16, 10),
                     new cbd.h(csm.d, 1, 4, 16, 10)
                  },
                  4,
                  new cbd.f[]{
                     new cbd.b(cja.nN, 12, 12, 30),
                     new cbd.h(csm.hk, 1, 1, 12, 15),
                     new cbd.h(csm.hj, 1, 1, 12, 15),
                     new cbd.h(csm.hu, 1, 1, 12, 15),
                     new cbd.h(csm.hm, 1, 1, 12, 15),
                     new cbd.h(csm.hq, 1, 1, 12, 15),
                     new cbd.h(csm.hr, 1, 1, 12, 15),
                     new cbd.h(csm.hy, 1, 1, 12, 15),
                     new cbd.h(csm.hx, 1, 1, 12, 15),
                     new cbd.h(csm.hp, 1, 1, 12, 15),
                     new cbd.h(csm.hl, 1, 1, 12, 15),
                     new cbd.h(csm.ho, 1, 1, 12, 15),
                     new cbd.h(csm.hw, 1, 1, 12, 15),
                     new cbd.h(csm.hs, 1, 1, 12, 15),
                     new cbd.h(csm.ht, 1, 1, 12, 15),
                     new cbd.h(csm.hn, 1, 1, 12, 15),
                     new cbd.h(csm.hv, 1, 1, 12, 15),
                     new cbd.h(csm.lh, 1, 1, 12, 15),
                     new cbd.h(csm.lg, 1, 1, 12, 15),
                     new cbd.h(csm.lr, 1, 1, 12, 15),
                     new cbd.h(csm.lj, 1, 1, 12, 15),
                     new cbd.h(csm.ln, 1, 1, 12, 15),
                     new cbd.h(csm.lo, 1, 1, 12, 15),
                     new cbd.h(csm.lv, 1, 1, 12, 15),
                     new cbd.h(csm.lu, 1, 1, 12, 15),
                     new cbd.h(csm.lm, 1, 1, 12, 15),
                     new cbd.h(csm.li, 1, 1, 12, 15),
                     new cbd.h(csm.ll, 1, 1, 12, 15),
                     new cbd.h(csm.lt, 1, 1, 12, 15),
                     new cbd.h(csm.lp, 1, 1, 12, 15),
                     new cbd.h(csm.lq, 1, 1, 12, 15),
                     new cbd.h(csm.lk, 1, 1, 12, 15),
                     new cbd.h(csm.ls, 1, 1, 12, 15)
                  },
                  5,
                  new cbd.f[]{new cbd.h(csm.hf, 1, 1, 12, 30), new cbd.h(csm.hd, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<cbd.f[]> b = a(
      ImmutableMap.of(
         1,
         new cbd.f[]{
            new cbd.h(cja.cx, 2, 1, 5, 1),
            new cbd.h(cja.qc, 4, 1, 5, 1),
            new cbd.h(cja.eY, 2, 1, 5, 1),
            new cbd.h(cja.uX, 5, 1, 5, 1),
            new cbd.h(cja.cs, 1, 1, 12, 1),
            new cbd.h(cja.dn, 1, 1, 8, 1),
            new cbd.h(cja.eO, 1, 1, 4, 1),
            new cbd.h(cja.do, 3, 1, 12, 1),
            new cbd.h(cja.eA, 3, 1, 8, 1),
            new cbd.h(cja.cO, 1, 1, 12, 1),
            new cbd.h(cja.cP, 1, 1, 12, 1),
            new cbd.h(cja.cQ, 1, 1, 8, 1),
            new cbd.h(cja.cR, 1, 1, 12, 1),
            new cbd.h(cja.cS, 1, 1, 12, 1),
            new cbd.h(cja.cT, 1, 1, 12, 1),
            new cbd.h(cja.cU, 1, 1, 12, 1),
            new cbd.h(cja.cV, 1, 1, 12, 1),
            new cbd.h(cja.cW, 1, 1, 12, 1),
            new cbd.h(cja.cX, 1, 1, 12, 1),
            new cbd.h(cja.cY, 1, 1, 12, 1),
            new cbd.h(cja.cZ, 1, 1, 7, 1),
            new cbd.h(cja.oH, 1, 1, 12, 1),
            new cbd.h(cja.ur, 1, 1, 12, 1),
            new cbd.h(cja.rj, 1, 1, 12, 1),
            new cbd.h(cja.rk, 1, 1, 12, 1),
            new cbd.h(cja.N, 5, 1, 8, 1),
            new cbd.h(cja.L, 5, 1, 8, 1),
            new cbd.h(cja.P, 5, 1, 8, 1),
            new cbd.h(cja.M, 5, 1, 8, 1),
            new cbd.h(cja.J, 5, 1, 8, 1),
            new cbd.h(cja.K, 5, 1, 8, 1),
            new cbd.h(cja.O, 5, 1, 8, 1),
            new cbd.h(cja.Q, 5, 1, 8, 1),
            new cbd.h(cja.qI, 1, 3, 12, 1),
            new cbd.h(cja.qu, 1, 3, 12, 1),
            new cbd.h(cja.qF, 1, 3, 12, 1),
            new cbd.h(cja.qA, 1, 3, 12, 1),
            new cbd.h(cja.qJ, 1, 3, 12, 1),
            new cbd.h(cja.qH, 1, 3, 12, 1),
            new cbd.h(cja.qC, 1, 3, 12, 1),
            new cbd.h(cja.qw, 1, 3, 12, 1),
            new cbd.h(cja.qy, 1, 3, 12, 1),
            new cbd.h(cja.qB, 1, 3, 12, 1),
            new cbd.h(cja.qE, 1, 3, 12, 1),
            new cbd.h(cja.qx, 1, 3, 12, 1),
            new cbd.h(cja.qz, 1, 3, 12, 1),
            new cbd.h(cja.qv, 1, 3, 12, 1),
            new cbd.h(cja.qG, 1, 3, 12, 1),
            new cbd.h(cja.qD, 1, 3, 12, 1),
            new cbd.h(cja.kb, 3, 1, 8, 1),
            new cbd.h(cja.kc, 3, 1, 8, 1),
            new cbd.h(cja.kd, 3, 1, 8, 1),
            new cbd.h(cja.ke, 3, 1, 8, 1),
            new cbd.h(cja.ka, 3, 1, 8, 1),
            new cbd.h(cja.fz, 1, 1, 12, 1),
            new cbd.h(cja.de, 1, 1, 12, 1),
            new cbd.h(cja.df, 1, 1, 12, 1),
            new cbd.h(cja.fF, 1, 2, 5, 1),
            new cbd.h(cja.du, 1, 2, 5, 1),
            new cbd.h(cja.S, 1, 8, 8, 1),
            new cbd.h(cja.V, 1, 4, 6, 1),
            new cbd.h(cja.wp, 1, 2, 5, 1),
            new cbd.h(cja.s, 1, 2, 5, 1),
            new cbd.h(cja.dr, 1, 2, 5, 1)
         },
         2,
         new cbd.f[]{
            new cbd.h(cja.pU, 5, 1, 4, 1),
            new cbd.h(cja.pR, 5, 1, 4, 1),
            new cbd.h(cja.hz, 3, 1, 6, 1),
            new cbd.h(cja.kz, 6, 1, 6, 1),
            new cbd.h(cja.oG, 1, 1, 8, 1),
            new cbd.h(cja.r, 3, 3, 6, 1)
         }
      )
   );
   public static final Map<cbc, Int2ObjectMap<cbd.f[]>> c = Map.of(
      cbc.k,
      a(
         ImmutableMap.builder()
            .put(1, new cbd.f[]{new cbd.b(cja.qa, 24, 16, 2), a(1), new cbd.h(csm.cl, 9, 1, 12, 1)})
            .put(2, new cbd.f[]{new cbd.b(cja.qb, 4, 12, 10), a(5), new cbd.h(cja.vt, 1, 1, 5)})
            .put(3, new cbd.f[]{new cbd.b(cja.qr, 5, 12, 20), a(10), new cbd.h(cja.ck, 1, 4, 10)})
            .put(4, new cbd.f[]{new cbd.b(cja.tg, 2, 12, 30), new cbd.h(cja.qi, 5, 1, 15), new cbd.h(cja.qe, 4, 1, 15)})
            .put(5, new cbd.f[]{a(), new cbd.h(cja.tR, 20, 1, 30)})
            .build()
      )
   );
   public static final List<Pair<cbd.f[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new cbd.f[]{
               new cbd.b(a(ckx.c), 1, 1, 1),
               new cbd.b(cja.pL, 1, 1, 1, 2),
               new cbd.b(cja.pQ, 1, 1, 1, 2),
               new cbd.b(cja.ry, 1, 1, 1, 3),
               new cbd.b(cja.tn, 4, 1, 1),
               new cbd.b(cja.hh, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cbd.f[]{
               new cbd.h(cja.hz, 1, 1, 6, 1),
               new cbd.h(cja.kz, 6, 1, 6, 1),
               new cbd.h(cja.oG, 1, 4, 2, 1),
               new cbd.h(cja.r, 3, 3, 6, 1),
               new cbd.h(csm.Y, 1, 8, 4, 1),
               new cbd.h(csm.W, 1, 8, 4, 1),
               new cbd.h(csm.aa, 1, 8, 4, 1),
               new cbd.h(csm.X, 1, 8, 4, 1),
               new cbd.h(csm.U, 1, 8, 4, 1),
               new cbd.h(csm.V, 1, 8, 4, 1),
               new cbd.h(csm.Z, 1, 8, 4, 1),
               new cbd.e(cja.oo, 1, 1, 1, 0.2F),
               new cbd.h(a(ckx.j), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cbd.f[]{
               new cbd.h(cja.pU, 3, 1, 4, 1),
               new cbd.h(cja.pR, 3, 1, 4, 1),
               new cbd.h(cja.cx, 2, 1, 5, 1),
               new cbd.h(cja.qc, 4, 1, 5, 1),
               new cbd.h(cja.eY, 2, 1, 5, 1),
               new cbd.h(cja.uX, 5, 1, 5, 1),
               new cbd.h(cja.cs, 1, 1, 12, 1),
               new cbd.h(cja.dn, 1, 1, 8, 1),
               new cbd.h(cja.eO, 1, 1, 4, 1),
               new cbd.h(cja.do, 3, 1, 12, 1),
               new cbd.h(cja.eA, 3, 1, 8, 1),
               new cbd.h(cja.cO, 1, 1, 12, 1),
               new cbd.h(cja.cP, 1, 1, 12, 1),
               new cbd.h(cja.cQ, 1, 1, 8, 1),
               new cbd.h(cja.cR, 1, 1, 12, 1),
               new cbd.h(cja.cS, 1, 1, 12, 1),
               new cbd.h(cja.cT, 1, 1, 12, 1),
               new cbd.h(cja.cU, 1, 1, 12, 1),
               new cbd.h(cja.cV, 1, 1, 12, 1),
               new cbd.h(cja.cW, 1, 1, 12, 1),
               new cbd.h(cja.cX, 1, 1, 12, 1),
               new cbd.h(cja.cY, 1, 1, 12, 1),
               new cbd.h(cja.cZ, 1, 1, 7, 1),
               new cbd.h(cja.oH, 1, 1, 12, 1),
               new cbd.h(cja.ur, 1, 1, 12, 1),
               new cbd.h(cja.rj, 1, 1, 12, 1),
               new cbd.h(cja.rk, 1, 1, 12, 1),
               new cbd.h(cja.N, 5, 1, 8, 1),
               new cbd.h(cja.L, 5, 1, 8, 1),
               new cbd.h(cja.P, 5, 1, 8, 1),
               new cbd.h(cja.M, 5, 1, 8, 1),
               new cbd.h(cja.J, 5, 1, 8, 1),
               new cbd.h(cja.K, 5, 1, 8, 1),
               new cbd.h(cja.O, 5, 1, 8, 1),
               new cbd.h(cja.Q, 5, 1, 8, 1),
               new cbd.h(cja.qI, 1, 3, 12, 1),
               new cbd.h(cja.qu, 1, 3, 12, 1),
               new cbd.h(cja.qF, 1, 3, 12, 1),
               new cbd.h(cja.qA, 1, 3, 12, 1),
               new cbd.h(cja.qJ, 1, 3, 12, 1),
               new cbd.h(cja.qH, 1, 3, 12, 1),
               new cbd.h(cja.qC, 1, 3, 12, 1),
               new cbd.h(cja.qw, 1, 3, 12, 1),
               new cbd.h(cja.qy, 1, 3, 12, 1),
               new cbd.h(cja.qB, 1, 3, 12, 1),
               new cbd.h(cja.qE, 1, 3, 12, 1),
               new cbd.h(cja.qx, 1, 3, 12, 1),
               new cbd.h(cja.qz, 1, 3, 12, 1),
               new cbd.h(cja.qv, 1, 3, 12, 1),
               new cbd.h(cja.qG, 1, 3, 12, 1),
               new cbd.h(cja.qD, 1, 3, 12, 1),
               new cbd.h(cja.kb, 3, 1, 8, 1),
               new cbd.h(cja.kc, 3, 1, 8, 1),
               new cbd.h(cja.kd, 3, 1, 8, 1),
               new cbd.h(cja.ke, 3, 1, 8, 1),
               new cbd.h(cja.ka, 3, 1, 8, 1),
               new cbd.h(cja.fz, 1, 3, 4, 1),
               new cbd.h(cja.de, 1, 3, 4, 1),
               new cbd.h(cja.df, 1, 3, 4, 1),
               new cbd.h(cja.fF, 1, 5, 2, 1),
               new cbd.h(cja.du, 1, 2, 5, 1),
               new cbd.h(cja.S, 1, 8, 8, 1),
               new cbd.h(cja.V, 1, 4, 6, 1),
               new cbd.h(cja.wp, 1, 2, 5, 1),
               new cbd.h(cja.s, 1, 2, 5, 1),
               new cbd.h(cja.dr, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static cbd.f a(int $$0) {
      return new cbd.l(
         ImmutableMap.builder()
            .put(cbe.a, new cbd.d($$0, cni.b, cni.h, cni.B))
            .put(cbe.b, new cbd.d($$0, cni.c, cni.e, cni.y))
            .put(cbe.c, new cbd.d($$0, cni.z, cni.o, cni.p))
            .put(cbe.d, new cbd.d($$0, cni.q, cni.k, cni.t))
            .put(cbe.e, new cbd.d($$0, cni.g, cni.s, cni.j))
            .put(cbe.f, new cbd.d($$0, cni.i, cni.f, cni.M))
            .put(cbe.g, new cbd.d($$0, cni.d, cni.r, cni.A))
            .build()
      );
   }

   private static cbd.f a() {
      return new cbd.l(
         ImmutableMap.builder()
            .put(cbe.a, new cbd.d(30, 3, 3, cni.u))
            .put(cbe.b, new cbd.d(30, 2, 2, cni.w))
            .put(cbe.c, new cbd.d(30, 3, 3, cni.a))
            .put(cbe.d, new cbd.d(30, 3, 3, cni.n))
            .put(cbe.e, new cbd.d(30, cni.v))
            .put(cbe.f, new cbd.d(30, cni.L))
            .put(cbe.g, new cbd.d(30, 2, 2, cni.x))
            .build()
      );
   }

   private static Int2ObjectMap<cbd.f[]> a(ImmutableMap<Integer, cbd.f[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static cix a(cku $$0) {
      return ckw.a(new cix(cja.rv), $$0);
   }

   static class a implements cbd.f {
      private final cis a;
      private final int b;
      private final int c;
      private final int d;

      public a(cis $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(cis $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public coi a(bii $$0, aru $$1) {
         cix $$2 = new cix(cja.nL, this.b);
         cix $$3 = new cix(this.a);
         if (this.a instanceof chn) {
            List<chm> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = chp.a($$3, $$4);
         }

         return new coi($$2, $$3, this.c, this.d, 0.2F);
      }

      private static chm a(aru $$0) {
         return chm.a(chl.a($$0.a(16)));
      }
   }

   static class b implements cbd.f {
      private final cix a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(cpk $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(cpk $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cix($$0.k(), $$1), $$2, $$3, $$4);
      }

      public b(cix $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public coi a(bii $$0, aru $$1) {
         return new coi(this.a.p(), new cix(cja.nL, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements cbd.f {
      private final Map<cbe, cis> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<cbe, cis> $$3) {
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
      public coi a(bii $$0, aru $$1) {
         if ($$0 instanceof cbb $$2) {
            cix $$3 = new cix(this.a.get($$2.gl().a()), this.b);
            return new coi($$3, new cix(cja.nL), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements cbd.f {
      private final int a;
      private final List<cne> b;
      private final int c;
      private final int d;

      public d(int $$0) {
         this($$0, jb.g.s().filter(cne::h).toArray(cne[]::new));
      }

      public d(int $$0, cne... $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, cne... $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = Arrays.asList($$3);
      }

      @Override
      public coi a(bii $$0, aru $$1) {
         cne $$2 = this.b.get($$1.a(this.b.size()));
         int $$3 = Math.max($$2.e(), this.c);
         int $$4 = Math.min($$2.a(), this.d);
         int $$5 = arp.a($$1, $$3, $$4);
         cix $$6 = cht.a(new cnh($$2, $$5));
         int $$7 = 2 + $$1.a(5 + $$5 * 10) + 3 * $$5;
         if ($$2.b()) {
            $$7 *= 2;
         }

         if ($$7 > 64) {
            $$7 = 64;
         }

         return new coi(new cix(cja.nL, $$7), new cix(cja.qb), $$6, 12, this.a, 0.2F);
      }
   }

   static class e implements cbd.f {
      private final cix a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(cis $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(cis $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new cix($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public coi a(bii $$0, aru $$1) {
         int $$2 = 5 + $$1.a(15);
         cix $$3 = cng.a($$1, new cix(this.a.d()), $$2, false);
         int $$4 = Math.min(this.b + $$2, 64);
         cix $$5 = new cix(cja.nL, $$4);
         return new coi($$5, $$3, this.c, this.d, this.e);
      }
   }

   public interface f {
      @Nullable
      coi a(bii var1, aru var2);
   }

   static class g implements cbd.f {
      private final cix a;
      private final int b;
      private final int c;
      private final cix d;
      private final int e;
      private final int f;
      private final int g;
      private final float h;

      public g(cpk $$0, int $$1, cis $$2, int $$3, int $$4, int $$5) {
         this($$0, $$1, 1, $$2, $$3, $$4, $$5);
      }

      public g(cpk $$0, int $$1, int $$2, cis $$3, int $$4, int $$5, int $$6) {
         this.a = new cix($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = new cix($$3);
         this.e = $$4;
         this.f = $$5;
         this.g = $$6;
         this.h = 0.05F;
      }

      @Nullable
      @Override
      public coi a(bii $$0, aru $$1) {
         return new coi(new cix(cja.nL, this.c), new cix(this.a.d(), this.b), new cix(this.d.d(), this.e), this.f, this.g, this.h);
      }
   }

   static class h implements cbd.f {
      private final cix a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public h(csl $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cix($$0), $$1, $$2, $$3, $$4);
      }

      public h(cis $$0, int $$1, int $$2, int $$3) {
         this(new cix($$0), $$1, $$2, 12, $$3);
      }

      public h(cis $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cix($$0), $$1, $$2, $$3, $$4);
      }

      public h(cix $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public h(cix $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.a.f($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
      }

      @Override
      public coi a(bii $$0, aru $$1) {
         return new coi(new cix(cja.nL, this.b), this.a.p(), this.c, this.d, this.e);
      }
   }

   static class i implements cbd.f {
      private final List<dao.a> a;
      private final int b;
      private final float c;

      public i(bht $$0, int $$1, int $$2) {
         this(List.of(new dao.a($$0, $$1)), $$2, 0.05F);
      }

      public i(List<dao.a> $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public coi a(bii $$0, aru $$1) {
         cix $$2 = new cix(cja.va, 1);
         ckh.a($$2, this.a);
         return new coi(new cix(cja.nL, 1), $$2, 12, this.b, this.c);
      }
   }

   static class j implements cbd.f {
      private final cix a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final cis f;
      private final int g;
      private final float h;

      public j(cis $$0, int $$1, cis $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new cix($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public coi a(bii $$0, aru $$1) {
         cix $$2 = new cix(cja.nL, this.c);
         List<cku> $$3 = jb.j.s().filter($$0x -> !$$0x.a().isEmpty() && ckv.a($$0x)).collect(Collectors.toList());
         cku $$4 = $$3.get($$1.a($$3.size()));
         cix $$5 = ckw.a(new cix(this.a.d(), this.b), $$4);
         return new coi($$2, new cix(this.f, this.g), $$5, this.d, this.e, this.h);
      }
   }

   static class k implements cbd.f {
      private final int a;
      private final aqa<duy> b;
      private final String c;
      private final ebj.a d;
      private final int e;
      private final int f;

      public k(int $$0, aqa<duy> $$1, String $$2, ebj.a $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public coi a(bii $$0, aru $$1) {
         if (!($$0.dK() instanceof akk)) {
            return null;
         } else {
            akk $$2 = (akk)$$0.dK();
            gu $$3 = $$2.a(this.b, $$0.dk(), 100, true);
            if ($$3 != null) {
               cix $$4 = cje.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               cje.a($$2, $$4);
               ebm.a($$4, $$3, "+", this.d);
               $$4.a(tf.c(this.c));
               return new coi(new cix(cja.nL, this.a), new cix(cja.qe), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static class l implements cbd.f {
      private final Map<cbe, cbd.f> a;

      public l(Map<cbe, cbd.f> $$0) {
         jb.z.s().filter($$1 -> !$$0.containsKey($$1)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + jb.z.b($$0x));
         });
         this.a = $$0;
      }

      @Nullable
      @Override
      public coi a(bii $$0, aru $$1) {
         if ($$0 instanceof cbb $$2) {
            cbe $$3 = $$2.gl().a();
            return this.a.get($$3).a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
