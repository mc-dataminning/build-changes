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

public class cbg {
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
   public static final Map<cbf, Int2ObjectMap<cbg.f[]>> a = ac.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            cbf.g,
            a(
               ImmutableMap.of(
                  1,
                  new cbg.f[]{
                     new cbg.b(cjd.oI, 20, 16, 2),
                     new cbg.b(cjd.tm, 26, 16, 2),
                     new cbg.b(cjd.tl, 22, 16, 2),
                     new cbg.b(cjd.uq, 15, 16, 2),
                     new cbg.h(cjd.oJ, 1, 6, 16, 1)
                  },
                  2,
                  new cbg.f[]{new cbg.b(csr.dV, 6, 12, 10), new cbg.h(cjd.tz, 1, 4, 5), new cbg.h(cjd.nF, 1, 4, 16, 5)},
                  3,
                  new cbg.f[]{new cbg.h(cjd.re, 3, 18, 10), new cbg.b(csr.fa, 4, 12, 20)},
                  4,
                  new cbg.f[]{
                     new cbg.h(csr.eh, 1, 1, 12, 15),
                     new cbg.i(bia.p, 100, 15),
                     new cbg.i(bia.h, 160, 15),
                     new cbg.i(bia.r, 140, 15),
                     new cbg.i(bia.o, 120, 15),
                     new cbg.i(bia.s, 280, 15),
                     new cbg.i(bia.w, 7, 15)
                  },
                  5,
                  new cbg.f[]{new cbg.h(cjd.tq, 3, 3, 30), new cbg.h(cjd.rE, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            cbf.h,
            a(
               ImmutableMap.of(
                  1,
                  new cbg.f[]{
                     new cbg.b(cjd.oE, 20, 16, 2), new cbg.b(cjd.nI, 10, 16, 2), new cbg.g(cjd.ql, 6, cjd.qp, 6, 16, 1), new cbg.h(cjd.pT, 3, 1, 16, 1)
                  },
                  2,
                  new cbg.f[]{new cbg.b(cjd.ql, 15, 16, 10), new cbg.g(cjd.qm, 6, cjd.qq, 6, 16, 5), new cbg.h(cjd.vx, 2, 1, 5)},
                  3,
                  new cbg.f[]{new cbg.b(cjd.qm, 13, 16, 20), new cbg.e(cjd.qh, 3, 3, 10, 0.2F)},
                  4,
                  new cbg.f[]{new cbg.b(cjd.qn, 6, 12, 30)},
                  5,
                  new cbg.f[]{
                     new cbg.b(cjd.qo, 4, 12, 30),
                     new cbg.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(cbh.c, cjd.ni)
                           .put(cbh.g, cjd.nk)
                           .put(cbh.e, cjd.nk)
                           .put(cbh.a, cjd.no)
                           .put(cbh.b, cjd.no)
                           .put(cbh.d, cjd.nq)
                           .put(cbh.f, cjd.nu)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            cbf.n,
            a(
               ImmutableMap.of(
                  1,
                  new cbg.f[]{
                     new cbg.b(csr.bA, 18, 16, 2),
                     new cbg.b(csr.bM, 18, 16, 2),
                     new cbg.b(csr.bP, 18, 16, 2),
                     new cbg.b(csr.bH, 18, 16, 2),
                     new cbg.h(cjd.rg, 2, 1, 1)
                  },
                  2,
                  new cbg.f[]{
                     new cbg.b(cjd.qu, 12, 16, 10),
                     new cbg.b(cjd.qB, 12, 16, 10),
                     new cbg.b(cjd.qJ, 12, 16, 10),
                     new cbg.b(cjd.qx, 12, 16, 10),
                     new cbg.b(cjd.qz, 12, 16, 10),
                     new cbg.h(csr.bA, 1, 1, 16, 5),
                     new cbg.h(csr.bB, 1, 1, 16, 5),
                     new cbg.h(csr.bC, 1, 1, 16, 5),
                     new cbg.h(csr.bD, 1, 1, 16, 5),
                     new cbg.h(csr.bE, 1, 1, 16, 5),
                     new cbg.h(csr.bF, 1, 1, 16, 5),
                     new cbg.h(csr.bG, 1, 1, 16, 5),
                     new cbg.h(csr.bH, 1, 1, 16, 5),
                     new cbg.h(csr.bI, 1, 1, 16, 5),
                     new cbg.h(csr.bJ, 1, 1, 16, 5),
                     new cbg.h(csr.bK, 1, 1, 16, 5),
                     new cbg.h(csr.bL, 1, 1, 16, 5),
                     new cbg.h(csr.bM, 1, 1, 16, 5),
                     new cbg.h(csr.bN, 1, 1, 16, 5),
                     new cbg.h(csr.bO, 1, 1, 16, 5),
                     new cbg.h(csr.bP, 1, 1, 16, 5),
                     new cbg.h(csr.ik, 1, 4, 16, 5),
                     new cbg.h(csr.il, 1, 4, 16, 5),
                     new cbg.h(csr.im, 1, 4, 16, 5),
                     new cbg.h(csr.in, 1, 4, 16, 5),
                     new cbg.h(csr.io, 1, 4, 16, 5),
                     new cbg.h(csr.ip, 1, 4, 16, 5),
                     new cbg.h(csr.iq, 1, 4, 16, 5),
                     new cbg.h(csr.ir, 1, 4, 16, 5),
                     new cbg.h(csr.is, 1, 4, 16, 5),
                     new cbg.h(csr.it, 1, 4, 16, 5),
                     new cbg.h(csr.iu, 1, 4, 16, 5),
                     new cbg.h(csr.iv, 1, 4, 16, 5),
                     new cbg.h(csr.iw, 1, 4, 16, 5),
                     new cbg.h(csr.ix, 1, 4, 16, 5),
                     new cbg.h(csr.iy, 1, 4, 16, 5),
                     new cbg.h(csr.iz, 1, 4, 16, 5)
                  },
                  3,
                  new cbg.f[]{
                     new cbg.b(cjd.qy, 12, 16, 20),
                     new cbg.b(cjd.qC, 12, 16, 20),
                     new cbg.b(cjd.qv, 12, 16, 20),
                     new cbg.b(cjd.qI, 12, 16, 20),
                     new cbg.b(cjd.qA, 12, 16, 20),
                     new cbg.h(csr.aZ, 3, 1, 12, 10),
                     new cbg.h(csr.bd, 3, 1, 12, 10),
                     new cbg.h(csr.bn, 3, 1, 12, 10),
                     new cbg.h(csr.bo, 3, 1, 12, 10),
                     new cbg.h(csr.bk, 3, 1, 12, 10),
                     new cbg.h(csr.bl, 3, 1, 12, 10),
                     new cbg.h(csr.bi, 3, 1, 12, 10),
                     new cbg.h(csr.bg, 3, 1, 12, 10),
                     new cbg.h(csr.bm, 3, 1, 12, 10),
                     new cbg.h(csr.bc, 3, 1, 12, 10),
                     new cbg.h(csr.bh, 3, 1, 12, 10),
                     new cbg.h(csr.be, 3, 1, 12, 10),
                     new cbg.h(csr.bb, 3, 1, 12, 10),
                     new cbg.h(csr.ba, 3, 1, 12, 10),
                     new cbg.h(csr.bf, 3, 1, 12, 10),
                     new cbg.h(csr.bj, 3, 1, 12, 10)
                  },
                  4,
                  new cbg.f[]{
                     new cbg.b(cjd.qG, 12, 16, 30),
                     new cbg.b(cjd.qE, 12, 16, 30),
                     new cbg.b(cjd.qF, 12, 16, 30),
                     new cbg.b(cjd.qH, 12, 16, 30),
                     new cbg.b(cjd.qw, 12, 16, 30),
                     new cbg.b(cjd.qD, 12, 16, 30),
                     new cbg.h(cjd.tV, 3, 1, 12, 15),
                     new cbg.h(cjd.ug, 3, 1, 12, 15),
                     new cbg.h(cjd.tY, 3, 1, 12, 15),
                     new cbg.h(cjd.uj, 3, 1, 12, 15),
                     new cbg.h(cjd.ub, 3, 1, 12, 15),
                     new cbg.h(cjd.ui, 3, 1, 12, 15),
                     new cbg.h(cjd.ua, 3, 1, 12, 15),
                     new cbg.h(cjd.uc, 3, 1, 12, 15),
                     new cbg.h(cjd.uk, 3, 1, 12, 15),
                     new cbg.h(cjd.uf, 3, 1, 12, 15),
                     new cbg.h(cjd.tX, 3, 1, 12, 15),
                     new cbg.h(cjd.ue, 3, 1, 12, 15),
                     new cbg.h(cjd.uh, 3, 1, 12, 15),
                     new cbg.h(cjd.tZ, 3, 1, 12, 15),
                     new cbg.h(cjd.tW, 3, 1, 12, 15),
                     new cbg.h(cjd.ud, 3, 1, 12, 15)
                  },
                  5,
                  new cbg.f[]{new cbg.h(cjd.pl, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            cbf.i,
            a(
               ImmutableMap.of(
                  1,
                  new cbg.f[]{new cbg.b(cjd.oB, 32, 16, 2), new cbg.h(cjd.nH, 1, 16, 1), new cbg.g(csr.L, 10, cjd.pi, 10, 12, 1)},
                  2,
                  new cbg.f[]{new cbg.b(cjd.pi, 26, 12, 10), new cbg.h(cjd.nG, 2, 1, 5)},
                  3,
                  new cbg.f[]{new cbg.b(cjd.oE, 14, 16, 20), new cbg.h(cjd.uZ, 3, 1, 10)},
                  4,
                  new cbg.f[]{new cbg.b(cjd.oF, 24, 16, 30), new cbg.e(cjd.nG, 2, 3, 15)},
                  5,
                  new cbg.f[]{new cbg.b(cjd.lF, 8, 12, 30), new cbg.e(cjd.uZ, 3, 3, 15), new cbg.j(cjd.nH, 5, cjd.uw, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            cbf.k,
            a(
               ImmutableMap.builder()
                  .put(1, new cbg.f[]{new cbg.b(cjd.qa, 24, 16, 2), new cbg.d(1), new cbg.h(csr.cl, 9, 1, 12, 1)})
                  .put(2, new cbg.f[]{new cbg.b(cjd.qb, 4, 12, 10), new cbg.d(5), new cbg.h(cjd.vt, 1, 1, 5)})
                  .put(3, new cbg.f[]{new cbg.b(cjd.qr, 5, 12, 20), new cbg.d(10), new cbg.h(cjd.ck, 1, 4, 10)})
                  .put(4, new cbg.f[]{new cbg.b(cjd.tg, 2, 12, 30), new cbg.d(15), new cbg.h(cjd.qi, 5, 1, 15), new cbg.h(cjd.qe, 4, 1, 15)})
                  .put(5, new cbg.f[]{new cbg.h(cjd.tR, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            cbf.e,
            a(
               ImmutableMap.of(
                  1,
                  new cbg.f[]{new cbg.b(cjd.qa, 24, 16, 2), new cbg.h(cjd.tp, 7, 1, 1)},
                  2,
                  new cbg.f[]{new cbg.b(cjd.fx, 11, 16, 10), new cbg.k(13, apz.d, "filled_map.monument", ebo.a.j, 12, 5)},
                  3,
                  new cbg.f[]{new cbg.b(cjd.qe, 1, 12, 20), new cbg.k(14, apz.c, "filled_map.mansion", ebo.a.i, 12, 10)},
                  4,
                  new cbg.f[]{
                     new cbg.h(cjd.ti, 7, 1, 15),
                     new cbg.h(cjd.tV, 3, 1, 15),
                     new cbg.h(cjd.ug, 3, 1, 15),
                     new cbg.h(cjd.tY, 3, 1, 15),
                     new cbg.h(cjd.uj, 3, 1, 15),
                     new cbg.h(cjd.ub, 3, 1, 15),
                     new cbg.h(cjd.ui, 3, 1, 15),
                     new cbg.h(cjd.ua, 3, 1, 15),
                     new cbg.h(cjd.uc, 3, 1, 15),
                     new cbg.h(cjd.uk, 3, 1, 15),
                     new cbg.h(cjd.uf, 3, 1, 15),
                     new cbg.h(cjd.tX, 3, 1, 15),
                     new cbg.h(cjd.ue, 3, 1, 15),
                     new cbg.h(cjd.uh, 3, 1, 15),
                     new cbg.h(cjd.tZ, 3, 1, 15),
                     new cbg.h(cjd.tW, 3, 1, 15),
                     new cbg.h(cjd.ud, 3, 1, 15)
                  },
                  5,
                  new cbg.f[]{new cbg.h(cjd.vg, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            cbf.f,
            a(
               ImmutableMap.of(
                  1,
                  new cbg.f[]{new cbg.b(cjd.rp, 32, 16, 2), new cbg.h(cjd.ll, 1, 2, 1)},
                  2,
                  new cbg.f[]{new cbg.b(cjd.nU, 3, 12, 10), new cbg.h(cjd.nM, 1, 1, 5)},
                  3,
                  new cbg.f[]{new cbg.b(cjd.tJ, 2, 12, 20), new cbg.h(csr.ed, 4, 1, 12, 10)},
                  4,
                  new cbg.f[]{new cbg.b(cjd.nD, 4, 12, 30), new cbg.b(cjd.rw, 9, 12, 30), new cbg.h(cjd.rq, 5, 1, 15)},
                  5,
                  new cbg.f[]{new cbg.b(cjd.ru, 22, 12, 30), new cbg.h(cjd.te, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            cbf.c,
            a(
               ImmutableMap.of(
                  1,
                  new cbg.f[]{
                     new cbg.b(cjd.nI, 15, 16, 2),
                     new cbg.h(new cja(cjd.oU), 7, 1, 12, 1, 0.2F),
                     new cbg.h(new cja(cjd.oV), 4, 1, 12, 1, 0.2F),
                     new cbg.h(new cja(cjd.oS), 5, 1, 12, 1, 0.2F),
                     new cbg.h(new cja(cjd.oT), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cbg.f[]{
                     new cbg.b(cjd.nQ, 4, 12, 10),
                     new cbg.h(new cja(cjd.vs), 36, 1, 12, 5, 0.2F),
                     new cbg.h(new cja(cjd.oR), 1, 1, 12, 5, 0.2F),
                     new cbg.h(new cja(cjd.oQ), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new cbg.f[]{
                     new cbg.b(cjd.pM, 1, 12, 20),
                     new cbg.b(cjd.nK, 1, 12, 20),
                     new cbg.h(new cja(cjd.oO), 1, 1, 12, 10, 0.2F),
                     new cbg.h(new cja(cjd.oP), 4, 1, 12, 10, 0.2F),
                     new cbg.h(new cja(cjd.uy), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new cbg.f[]{new cbg.e(cjd.oY, 14, 3, 15, 0.2F), new cbg.e(cjd.oZ, 8, 3, 15, 0.2F)},
                  5,
                  new cbg.f[]{new cbg.e(cjd.oW, 8, 3, 30, 0.2F), new cbg.e(cjd.oX, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cbf.p,
            a(
               ImmutableMap.of(
                  1,
                  new cbg.f[]{new cbg.b(cjd.nI, 15, 16, 2), new cbg.h(new cja(cjd.op), 3, 1, 12, 1, 0.2F), new cbg.e(cjd.om, 2, 3, 1)},
                  2,
                  new cbg.f[]{new cbg.b(cjd.nQ, 4, 12, 10), new cbg.h(new cja(cjd.vs), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cbg.f[]{new cbg.b(cjd.pi, 24, 12, 20)},
                  4,
                  new cbg.f[]{new cbg.b(cjd.nK, 1, 12, 30), new cbg.e(cjd.ou, 12, 3, 15, 0.2F)},
                  5,
                  new cbg.f[]{new cbg.e(cjd.or, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cbf.o,
            a(
               ImmutableMap.of(
                  1,
                  new cbg.f[]{
                     new cbg.b(cjd.nI, 15, 16, 2),
                     new cbg.h(new cja(cjd.of), 1, 1, 12, 1, 0.2F),
                     new cbg.h(new cja(cjd.od), 1, 1, 12, 1, 0.2F),
                     new cbg.h(new cja(cjd.oe), 1, 1, 12, 1, 0.2F),
                     new cbg.h(new cja(cjd.og), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cbg.f[]{new cbg.b(cjd.nQ, 4, 12, 10), new cbg.h(new cja(cjd.vs), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cbg.f[]{
                     new cbg.b(cjd.pi, 30, 12, 20),
                     new cbg.e(cjd.op, 1, 3, 10, 0.2F),
                     new cbg.e(cjd.on, 2, 3, 10, 0.2F),
                     new cbg.e(cjd.oo, 3, 3, 10, 0.2F),
                     new cbg.h(new cja(cjd.ov), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new cbg.f[]{new cbg.b(cjd.nK, 1, 12, 30), new cbg.e(cjd.ou, 12, 3, 15, 0.2F), new cbg.e(cjd.os, 5, 3, 15, 0.2F)},
                  5,
                  new cbg.f[]{new cbg.e(cjd.ot, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cbf.d,
            a(
               ImmutableMap.of(
                  1,
                  new cbg.f[]{new cbg.b(cjd.rn, 14, 16, 2), new cbg.b(cjd.pj, 7, 16, 2), new cbg.b(cjd.tG, 4, 16, 2), new cbg.h(cjd.tI, 1, 1, 1)},
                  2,
                  new cbg.f[]{new cbg.b(cjd.nI, 15, 16, 2), new cbg.h(cjd.pk, 1, 5, 16, 5), new cbg.h(cjd.ro, 1, 8, 16, 5)},
                  3,
                  new cbg.f[]{new cbg.b(cjd.tT, 7, 16, 20), new cbg.b(cjd.rl, 10, 16, 20)},
                  4,
                  new cbg.f[]{new cbg.b(cjd.pZ, 10, 12, 30)},
                  5,
                  new cbg.f[]{new cbg.b(cjd.vv, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            cbf.j,
            a(
               ImmutableMap.of(
                  1,
                  new cbg.f[]{new cbg.b(cjd.pP, 6, 16, 2), new cbg.a(cjd.oM, 3), new cbg.a(cjd.oL, 7)},
                  2,
                  new cbg.f[]{new cbg.b(cjd.pi, 26, 12, 10), new cbg.a(cjd.oK, 5, 12, 5), new cbg.a(cjd.oN, 4, 12, 5)},
                  3,
                  new cbg.f[]{new cbg.b(cjd.tK, 9, 12, 20), new cbg.a(cjd.oL, 7)},
                  4,
                  new cbg.f[]{new cbg.b(cjd.nD, 4, 12, 30), new cbg.a(cjd.tP, 6, 12, 15)},
                  5,
                  new cbg.f[]{new cbg.h(new cja(cjd.mZ), 6, 1, 12, 30, 0.2F), new cbg.a(cjd.oK, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            cbf.l,
            a(
               ImmutableMap.of(
                  1,
                  new cbg.f[]{new cbg.b(cjd.pY, 10, 16, 2), new cbg.h(cjd.pX, 1, 10, 16, 1)},
                  2,
                  new cbg.f[]{new cbg.b(csr.b, 20, 16, 10), new cbg.h(csr.eL, 1, 4, 16, 5)},
                  3,
                  new cbg.f[]{
                     new cbg.b(csr.c, 16, 16, 20),
                     new cbg.b(csr.g, 16, 16, 20),
                     new cbg.b(csr.e, 16, 16, 20),
                     new cbg.h(csr.rt, 1, 4, 16, 10),
                     new cbg.h(csr.h, 1, 4, 16, 10),
                     new cbg.h(csr.f, 1, 4, 16, 10),
                     new cbg.h(csr.d, 1, 4, 16, 10)
                  },
                  4,
                  new cbg.f[]{
                     new cbg.b(cjd.nN, 12, 12, 30),
                     new cbg.h(csr.hk, 1, 1, 12, 15),
                     new cbg.h(csr.hj, 1, 1, 12, 15),
                     new cbg.h(csr.hu, 1, 1, 12, 15),
                     new cbg.h(csr.hm, 1, 1, 12, 15),
                     new cbg.h(csr.hq, 1, 1, 12, 15),
                     new cbg.h(csr.hr, 1, 1, 12, 15),
                     new cbg.h(csr.hy, 1, 1, 12, 15),
                     new cbg.h(csr.hx, 1, 1, 12, 15),
                     new cbg.h(csr.hp, 1, 1, 12, 15),
                     new cbg.h(csr.hl, 1, 1, 12, 15),
                     new cbg.h(csr.ho, 1, 1, 12, 15),
                     new cbg.h(csr.hw, 1, 1, 12, 15),
                     new cbg.h(csr.hs, 1, 1, 12, 15),
                     new cbg.h(csr.ht, 1, 1, 12, 15),
                     new cbg.h(csr.hn, 1, 1, 12, 15),
                     new cbg.h(csr.hv, 1, 1, 12, 15),
                     new cbg.h(csr.lh, 1, 1, 12, 15),
                     new cbg.h(csr.lg, 1, 1, 12, 15),
                     new cbg.h(csr.lr, 1, 1, 12, 15),
                     new cbg.h(csr.lj, 1, 1, 12, 15),
                     new cbg.h(csr.ln, 1, 1, 12, 15),
                     new cbg.h(csr.lo, 1, 1, 12, 15),
                     new cbg.h(csr.lv, 1, 1, 12, 15),
                     new cbg.h(csr.lu, 1, 1, 12, 15),
                     new cbg.h(csr.lm, 1, 1, 12, 15),
                     new cbg.h(csr.li, 1, 1, 12, 15),
                     new cbg.h(csr.ll, 1, 1, 12, 15),
                     new cbg.h(csr.lt, 1, 1, 12, 15),
                     new cbg.h(csr.lp, 1, 1, 12, 15),
                     new cbg.h(csr.lq, 1, 1, 12, 15),
                     new cbg.h(csr.lk, 1, 1, 12, 15),
                     new cbg.h(csr.ls, 1, 1, 12, 15)
                  },
                  5,
                  new cbg.f[]{new cbg.h(csr.hf, 1, 1, 12, 30), new cbg.h(csr.hd, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<cbg.f[]> b = a(
      ImmutableMap.of(
         1,
         new cbg.f[]{
            new cbg.h(cjd.cx, 2, 1, 5, 1),
            new cbg.h(cjd.qc, 4, 1, 5, 1),
            new cbg.h(cjd.eY, 2, 1, 5, 1),
            new cbg.h(cjd.uX, 5, 1, 5, 1),
            new cbg.h(cjd.cs, 1, 1, 12, 1),
            new cbg.h(cjd.dn, 1, 1, 8, 1),
            new cbg.h(cjd.eO, 1, 1, 4, 1),
            new cbg.h(cjd.do, 3, 1, 12, 1),
            new cbg.h(cjd.eA, 3, 1, 8, 1),
            new cbg.h(cjd.cO, 1, 1, 12, 1),
            new cbg.h(cjd.cP, 1, 1, 12, 1),
            new cbg.h(cjd.cQ, 1, 1, 8, 1),
            new cbg.h(cjd.cR, 1, 1, 12, 1),
            new cbg.h(cjd.cS, 1, 1, 12, 1),
            new cbg.h(cjd.cT, 1, 1, 12, 1),
            new cbg.h(cjd.cU, 1, 1, 12, 1),
            new cbg.h(cjd.cV, 1, 1, 12, 1),
            new cbg.h(cjd.cW, 1, 1, 12, 1),
            new cbg.h(cjd.cX, 1, 1, 12, 1),
            new cbg.h(cjd.cY, 1, 1, 12, 1),
            new cbg.h(cjd.cZ, 1, 1, 7, 1),
            new cbg.h(cjd.oH, 1, 1, 12, 1),
            new cbg.h(cjd.ur, 1, 1, 12, 1),
            new cbg.h(cjd.rj, 1, 1, 12, 1),
            new cbg.h(cjd.rk, 1, 1, 12, 1),
            new cbg.h(cjd.N, 5, 1, 8, 1),
            new cbg.h(cjd.L, 5, 1, 8, 1),
            new cbg.h(cjd.P, 5, 1, 8, 1),
            new cbg.h(cjd.M, 5, 1, 8, 1),
            new cbg.h(cjd.J, 5, 1, 8, 1),
            new cbg.h(cjd.K, 5, 1, 8, 1),
            new cbg.h(cjd.O, 5, 1, 8, 1),
            new cbg.h(cjd.Q, 5, 1, 8, 1),
            new cbg.h(cjd.qI, 1, 3, 12, 1),
            new cbg.h(cjd.qu, 1, 3, 12, 1),
            new cbg.h(cjd.qF, 1, 3, 12, 1),
            new cbg.h(cjd.qA, 1, 3, 12, 1),
            new cbg.h(cjd.qJ, 1, 3, 12, 1),
            new cbg.h(cjd.qH, 1, 3, 12, 1),
            new cbg.h(cjd.qC, 1, 3, 12, 1),
            new cbg.h(cjd.qw, 1, 3, 12, 1),
            new cbg.h(cjd.qy, 1, 3, 12, 1),
            new cbg.h(cjd.qB, 1, 3, 12, 1),
            new cbg.h(cjd.qE, 1, 3, 12, 1),
            new cbg.h(cjd.qx, 1, 3, 12, 1),
            new cbg.h(cjd.qz, 1, 3, 12, 1),
            new cbg.h(cjd.qv, 1, 3, 12, 1),
            new cbg.h(cjd.qG, 1, 3, 12, 1),
            new cbg.h(cjd.qD, 1, 3, 12, 1),
            new cbg.h(cjd.kb, 3, 1, 8, 1),
            new cbg.h(cjd.kc, 3, 1, 8, 1),
            new cbg.h(cjd.kd, 3, 1, 8, 1),
            new cbg.h(cjd.ke, 3, 1, 8, 1),
            new cbg.h(cjd.ka, 3, 1, 8, 1),
            new cbg.h(cjd.fz, 1, 1, 12, 1),
            new cbg.h(cjd.de, 1, 1, 12, 1),
            new cbg.h(cjd.df, 1, 1, 12, 1),
            new cbg.h(cjd.fF, 1, 2, 5, 1),
            new cbg.h(cjd.du, 1, 2, 5, 1),
            new cbg.h(cjd.S, 1, 8, 8, 1),
            new cbg.h(cjd.V, 1, 4, 6, 1),
            new cbg.h(cjd.wp, 1, 2, 5, 1),
            new cbg.h(cjd.s, 1, 2, 5, 1),
            new cbg.h(cjd.dr, 1, 2, 5, 1)
         },
         2,
         new cbg.f[]{
            new cbg.h(cjd.pU, 5, 1, 4, 1),
            new cbg.h(cjd.pR, 5, 1, 4, 1),
            new cbg.h(cjd.hz, 3, 1, 6, 1),
            new cbg.h(cjd.kz, 6, 1, 6, 1),
            new cbg.h(cjd.oG, 1, 1, 8, 1),
            new cbg.h(cjd.r, 3, 3, 6, 1)
         }
      )
   );
   public static final Map<cbf, Int2ObjectMap<cbg.f[]>> c = Map.of(
      cbf.k,
      a(
         ImmutableMap.builder()
            .put(1, new cbg.f[]{new cbg.b(cjd.qa, 24, 16, 2), a(1), new cbg.h(csr.cl, 9, 1, 12, 1)})
            .put(2, new cbg.f[]{new cbg.b(cjd.qb, 4, 12, 10), a(5), new cbg.h(cjd.vt, 1, 1, 5)})
            .put(3, new cbg.f[]{new cbg.b(cjd.qr, 5, 12, 20), a(10), new cbg.h(cjd.ck, 1, 4, 10)})
            .put(4, new cbg.f[]{new cbg.b(cjd.tg, 2, 12, 30), new cbg.h(cjd.qi, 5, 1, 15), new cbg.h(cjd.qe, 4, 1, 15)})
            .put(5, new cbg.f[]{a(), new cbg.h(cjd.tR, 20, 1, 30)})
            .build()
      )
   );
   public static final List<Pair<cbg.f[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new cbg.f[]{
               new cbg.b(a(cla.c), 1, 1, 1),
               new cbg.b(cjd.pL, 1, 1, 1, 2),
               new cbg.b(cjd.pQ, 1, 1, 1, 2),
               new cbg.b(cjd.ry, 1, 1, 1, 3),
               new cbg.b(cjd.tn, 4, 1, 1),
               new cbg.b(cjd.hh, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cbg.f[]{
               new cbg.h(cjd.hz, 1, 1, 6, 1),
               new cbg.h(cjd.kz, 6, 1, 6, 1),
               new cbg.h(cjd.oG, 1, 4, 2, 1),
               new cbg.h(cjd.r, 3, 3, 6, 1),
               new cbg.h(csr.Y, 1, 8, 4, 1),
               new cbg.h(csr.W, 1, 8, 4, 1),
               new cbg.h(csr.aa, 1, 8, 4, 1),
               new cbg.h(csr.X, 1, 8, 4, 1),
               new cbg.h(csr.U, 1, 8, 4, 1),
               new cbg.h(csr.V, 1, 8, 4, 1),
               new cbg.h(csr.Z, 1, 8, 4, 1),
               new cbg.e(cjd.oo, 1, 1, 1, 0.2F),
               new cbg.h(a(cla.j), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cbg.f[]{
               new cbg.h(cjd.pU, 3, 1, 4, 1),
               new cbg.h(cjd.pR, 3, 1, 4, 1),
               new cbg.h(cjd.cx, 2, 1, 5, 1),
               new cbg.h(cjd.qc, 4, 1, 5, 1),
               new cbg.h(cjd.eY, 2, 1, 5, 1),
               new cbg.h(cjd.uX, 5, 1, 5, 1),
               new cbg.h(cjd.cs, 1, 1, 12, 1),
               new cbg.h(cjd.dn, 1, 1, 8, 1),
               new cbg.h(cjd.eO, 1, 1, 4, 1),
               new cbg.h(cjd.do, 3, 1, 12, 1),
               new cbg.h(cjd.eA, 3, 1, 8, 1),
               new cbg.h(cjd.cO, 1, 1, 12, 1),
               new cbg.h(cjd.cP, 1, 1, 12, 1),
               new cbg.h(cjd.cQ, 1, 1, 8, 1),
               new cbg.h(cjd.cR, 1, 1, 12, 1),
               new cbg.h(cjd.cS, 1, 1, 12, 1),
               new cbg.h(cjd.cT, 1, 1, 12, 1),
               new cbg.h(cjd.cU, 1, 1, 12, 1),
               new cbg.h(cjd.cV, 1, 1, 12, 1),
               new cbg.h(cjd.cW, 1, 1, 12, 1),
               new cbg.h(cjd.cX, 1, 1, 12, 1),
               new cbg.h(cjd.cY, 1, 1, 12, 1),
               new cbg.h(cjd.cZ, 1, 1, 7, 1),
               new cbg.h(cjd.oH, 1, 1, 12, 1),
               new cbg.h(cjd.ur, 1, 1, 12, 1),
               new cbg.h(cjd.rj, 1, 1, 12, 1),
               new cbg.h(cjd.rk, 1, 1, 12, 1),
               new cbg.h(cjd.N, 5, 1, 8, 1),
               new cbg.h(cjd.L, 5, 1, 8, 1),
               new cbg.h(cjd.P, 5, 1, 8, 1),
               new cbg.h(cjd.M, 5, 1, 8, 1),
               new cbg.h(cjd.J, 5, 1, 8, 1),
               new cbg.h(cjd.K, 5, 1, 8, 1),
               new cbg.h(cjd.O, 5, 1, 8, 1),
               new cbg.h(cjd.Q, 5, 1, 8, 1),
               new cbg.h(cjd.qI, 1, 3, 12, 1),
               new cbg.h(cjd.qu, 1, 3, 12, 1),
               new cbg.h(cjd.qF, 1, 3, 12, 1),
               new cbg.h(cjd.qA, 1, 3, 12, 1),
               new cbg.h(cjd.qJ, 1, 3, 12, 1),
               new cbg.h(cjd.qH, 1, 3, 12, 1),
               new cbg.h(cjd.qC, 1, 3, 12, 1),
               new cbg.h(cjd.qw, 1, 3, 12, 1),
               new cbg.h(cjd.qy, 1, 3, 12, 1),
               new cbg.h(cjd.qB, 1, 3, 12, 1),
               new cbg.h(cjd.qE, 1, 3, 12, 1),
               new cbg.h(cjd.qx, 1, 3, 12, 1),
               new cbg.h(cjd.qz, 1, 3, 12, 1),
               new cbg.h(cjd.qv, 1, 3, 12, 1),
               new cbg.h(cjd.qG, 1, 3, 12, 1),
               new cbg.h(cjd.qD, 1, 3, 12, 1),
               new cbg.h(cjd.kb, 3, 1, 8, 1),
               new cbg.h(cjd.kc, 3, 1, 8, 1),
               new cbg.h(cjd.kd, 3, 1, 8, 1),
               new cbg.h(cjd.ke, 3, 1, 8, 1),
               new cbg.h(cjd.ka, 3, 1, 8, 1),
               new cbg.h(cjd.fz, 1, 3, 4, 1),
               new cbg.h(cjd.de, 1, 3, 4, 1),
               new cbg.h(cjd.df, 1, 3, 4, 1),
               new cbg.h(cjd.fF, 1, 5, 2, 1),
               new cbg.h(cjd.du, 1, 2, 5, 1),
               new cbg.h(cjd.S, 1, 8, 8, 1),
               new cbg.h(cjd.V, 1, 4, 6, 1),
               new cbg.h(cjd.wp, 1, 2, 5, 1),
               new cbg.h(cjd.s, 1, 2, 5, 1),
               new cbg.h(cjd.dr, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static cbg.f a(int $$0) {
      return new cbg.l(
         ImmutableMap.builder()
            .put(cbh.a, new cbg.d($$0, cnn.b, cnn.h, cnn.B))
            .put(cbh.b, new cbg.d($$0, cnn.c, cnn.e, cnn.y))
            .put(cbh.c, new cbg.d($$0, cnn.z, cnn.o, cnn.p))
            .put(cbh.d, new cbg.d($$0, cnn.q, cnn.k, cnn.t))
            .put(cbh.e, new cbg.d($$0, cnn.g, cnn.s, cnn.j))
            .put(cbh.f, new cbg.d($$0, cnn.i, cnn.f, cnn.M))
            .put(cbh.g, new cbg.d($$0, cnn.d, cnn.r, cnn.A))
            .build()
      );
   }

   private static cbg.f a() {
      return new cbg.l(
         ImmutableMap.builder()
            .put(cbh.a, new cbg.d(30, 3, 3, cnn.u))
            .put(cbh.b, new cbg.d(30, 2, 2, cnn.w))
            .put(cbh.c, new cbg.d(30, 3, 3, cnn.a))
            .put(cbh.d, new cbg.d(30, 3, 3, cnn.n))
            .put(cbh.e, new cbg.d(30, cnn.v))
            .put(cbh.f, new cbg.d(30, cnn.L))
            .put(cbh.g, new cbg.d(30, 2, 2, cnn.x))
            .build()
      );
   }

   private static Int2ObjectMap<cbg.f[]> a(ImmutableMap<Integer, cbg.f[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static cja a(ckx $$0) {
      return ckz.a(new cja(cjd.rv), $$0);
   }

   static class a implements cbg.f {
      private final civ a;
      private final int b;
      private final int c;
      private final int d;

      public a(civ $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(civ $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public coo a(bil $$0, arx $$1) {
         cja $$2 = new cja(cjd.nL, this.b);
         cja $$3 = new cja(this.a);
         if (this.a instanceof chq) {
            List<chp> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = chs.a($$3, $$4);
         }

         return new coo($$2, $$3, this.c, this.d, 0.2F);
      }

      private static chp a(arx $$0) {
         return chp.a(cho.a($$0.a(16)));
      }
   }

   static class b implements cbg.f {
      private final cja a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(cpp $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(cpp $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cja($$0.k(), $$1), $$2, $$3, $$4);
      }

      public b(cja $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public coo a(bil $$0, arx $$1) {
         return new coo(this.a.p(), new cja(cjd.nL, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements cbg.f {
      private final Map<cbh, civ> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<cbh, civ> $$3) {
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
      public coo a(bil $$0, arx $$1) {
         if ($$0 instanceof cbe $$2) {
            cja $$3 = new cja(this.a.get($$2.gl().a()), this.b);
            return new coo($$3, new cja(cjd.nL), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements cbg.f {
      private final int a;
      private final List<cnj> b;
      private final int c;
      private final int d;

      public d(int $$0) {
         this($$0, jd.g.s().filter(cnj::h).toArray(cnj[]::new));
      }

      public d(int $$0, cnj... $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, cnj... $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = Arrays.asList($$3);
      }

      @Override
      public coo a(bil $$0, arx $$1) {
         cnj $$2 = this.b.get($$1.a(this.b.size()));
         int $$3 = Math.max($$2.e(), this.c);
         int $$4 = Math.min($$2.a(), this.d);
         int $$5 = ars.a($$1, $$3, $$4);
         cja $$6 = chw.a(new cnm($$2, $$5));
         int $$7 = 2 + $$1.a(5 + $$5 * 10) + 3 * $$5;
         if ($$2.b()) {
            $$7 *= 2;
         }

         if ($$7 > 64) {
            $$7 = 64;
         }

         return new coo(new cja(cjd.nL, $$7), new cja(cjd.qb), $$6, 12, this.a, 0.2F);
      }
   }

   static class e implements cbg.f {
      private final cja a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(civ $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(civ $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new cja($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public coo a(bil $$0, arx $$1) {
         int $$2 = 5 + $$1.a(15);
         cja $$3 = cnl.a($$1, new cja(this.a.d()), $$2, false);
         int $$4 = Math.min(this.b + $$2, 64);
         cja $$5 = new cja(cjd.nL, $$4);
         return new coo($$5, $$3, this.c, this.d, this.e);
      }
   }

   public interface f {
      @Nullable
      coo a(bil var1, arx var2);
   }

   static class g implements cbg.f {
      private final cja a;
      private final int b;
      private final int c;
      private final cja d;
      private final int e;
      private final int f;
      private final int g;
      private final float h;

      public g(cpp $$0, int $$1, civ $$2, int $$3, int $$4, int $$5) {
         this($$0, $$1, 1, $$2, $$3, $$4, $$5);
      }

      public g(cpp $$0, int $$1, int $$2, civ $$3, int $$4, int $$5, int $$6) {
         this.a = new cja($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = new cja($$3);
         this.e = $$4;
         this.f = $$5;
         this.g = $$6;
         this.h = 0.05F;
      }

      @Nullable
      @Override
      public coo a(bil $$0, arx $$1) {
         return new coo(new cja(cjd.nL, this.c), new cja(this.a.d(), this.b), new cja(this.d.d(), this.e), this.f, this.g, this.h);
      }
   }

   static class h implements cbg.f {
      private final cja a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public h(csq $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cja($$0), $$1, $$2, $$3, $$4);
      }

      public h(civ $$0, int $$1, int $$2, int $$3) {
         this(new cja($$0), $$1, $$2, 12, $$3);
      }

      public h(civ $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cja($$0), $$1, $$2, $$3, $$4);
      }

      public h(cja $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public h(cja $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.a.f($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
      }

      @Override
      public coo a(bil $$0, arx $$1) {
         return new coo(new cja(cjd.nL, this.b), this.a.p(), this.c, this.d, this.e);
      }
   }

   static class i implements cbg.f {
      private final List<dat.a> a;
      private final int b;
      private final float c;

      public i(bhw $$0, int $$1, int $$2) {
         this(List.of(new dat.a($$0, $$1)), $$2, 0.05F);
      }

      public i(List<dat.a> $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public coo a(bil $$0, arx $$1) {
         cja $$2 = new cja(cjd.va, 1);
         ckk.a($$2, this.a);
         return new coo(new cja(cjd.nL, 1), $$2, 12, this.b, this.c);
      }
   }

   static class j implements cbg.f {
      private final cja a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final civ f;
      private final int g;
      private final float h;

      public j(civ $$0, int $$1, civ $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new cja($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public coo a(bil $$0, arx $$1) {
         cja $$2 = new cja(cjd.nL, this.c);
         List<ckx> $$3 = jd.j.s().filter($$0x -> !$$0x.a().isEmpty() && cky.a($$0x)).collect(Collectors.toList());
         ckx $$4 = $$3.get($$1.a($$3.size()));
         cja $$5 = ckz.a(new cja(this.a.d(), this.b), $$4);
         return new coo($$2, new cja(this.f, this.g), $$5, this.d, this.e, this.h);
      }
   }

   static class k implements cbg.f {
      private final int a;
      private final aqd<dvd> b;
      private final String c;
      private final ebo.a d;
      private final int e;
      private final int f;

      public k(int $$0, aqd<dvd> $$1, String $$2, ebo.a $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public coo a(bil $$0, arx $$1) {
         if (!($$0.dK() instanceof akn)) {
            return null;
         } else {
            akn $$2 = (akn)$$0.dK();
            gw $$3 = $$2.a(this.b, $$0.dk(), 100, true);
            if ($$3 != null) {
               cja $$4 = cjh.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               cjh.a($$2, $$4);
               ebr.a($$4, $$3, "+", this.d);
               $$4.a(ti.c(this.c));
               return new coo(new cja(cjd.nL, this.a), new cja(cjd.qe), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static class l implements cbg.f {
      private final Map<cbh, cbg.f> a;

      public l(Map<cbh, cbg.f> $$0) {
         jd.z.s().filter($$1 -> !$$0.containsKey($$1)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + jd.z.b($$0x));
         });
         this.a = $$0;
      }

      @Nullable
      @Override
      public coo a(bil $$0, arx $$1) {
         if ($$0 instanceof cbe $$2) {
            cbh $$3 = $$2.gl().a();
            return this.a.get($$3).a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
