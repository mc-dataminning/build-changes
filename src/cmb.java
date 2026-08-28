import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cmb {
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
   public static final Map<cma, Int2ObjectMap<cmb.g[]>> a = ac.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            cma.g,
            a(
               ImmutableMap.of(
                  1,
                  new cmb.g[]{
                     new cmb.b(cuf.pw, 20, 16, 2),
                     new cmb.b(cuf.ug, 26, 16, 2),
                     new cmb.b(cuf.uf, 22, 16, 2),
                     new cmb.b(cuf.vk, 15, 16, 2),
                     new cmb.i(cuf.px, 1, 6, 16, 1)
                  },
                  2,
                  new cmb.g[]{new cmb.b(dfj.eZ, 6, 12, 10), new cmb.i(cuf.ut, 1, 4, 5), new cmb.i(cuf.ou, 1, 4, 16, 5)},
                  3,
                  new cmb.g[]{new cmb.i(cuf.rS, 3, 18, 10), new cmb.b(dfj.fa, 4, 12, 20)},
                  4,
                  new cmb.g[]{
                     new cmb.i(dfj.eg, 1, 1, 12, 15),
                     new cmb.j(brq.p, 100, 15),
                     new cmb.j(brq.h, 160, 15),
                     new cmb.j(brq.r, 140, 15),
                     new cmb.j(brq.o, 120, 15),
                     new cmb.j(brq.s, 280, 15),
                     new cmb.j(brq.w, 7, 15)
                  },
                  5,
                  new cmb.g[]{new cmb.i(cuf.uk, 3, 3, 30), new cmb.i(cuf.st, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            cma.h,
            a(
               ImmutableMap.of(
                  1,
                  new cmb.g[]{
                     new cmb.b(cuf.ps, 20, 16, 2),
                     new cmb.b(cuf.ox, 10, 16, 2),
                     new cmb.h(cuf.qZ, 6, 1, cuf.rd, 6, 16, 1, 0.05F),
                     new cmb.i(cuf.qH, 3, 1, 16, 1)
                  },
                  2,
                  new cmb.g[]{new cmb.b(cuf.qZ, 15, 16, 10), new cmb.h(cuf.ra, 6, 1, cuf.re, 6, 16, 5, 0.05F), new cmb.i(cuf.ww, 2, 1, 5)},
                  3,
                  new cmb.g[]{new cmb.b(cuf.ra, 13, 16, 20), new cmb.e(cuf.qV, 3, 3, 10, 0.2F)},
                  4,
                  new cmb.g[]{new cmb.b(cuf.rb, 6, 12, 30)},
                  5,
                  new cmb.g[]{
                     new cmb.b(cuf.rc, 4, 12, 30),
                     new cmb.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(cmc.c, cuf.nU)
                           .put(cmc.g, cuf.nW)
                           .put(cmc.e, cuf.nW)
                           .put(cmc.a, cuf.oa)
                           .put(cmc.b, cuf.oa)
                           .put(cmc.d, cuf.oc)
                           .put(cmc.f, cuf.og)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            cma.n,
            a(
               ImmutableMap.of(
                  1,
                  new cmb.g[]{
                     new cmb.b(dfj.bA, 18, 16, 2),
                     new cmb.b(dfj.bM, 18, 16, 2),
                     new cmb.b(dfj.bP, 18, 16, 2),
                     new cmb.b(dfj.bH, 18, 16, 2),
                     new cmb.i(cuf.rV, 2, 1, 1)
                  },
                  2,
                  new cmb.g[]{
                     new cmb.b(cuf.ri, 12, 16, 10),
                     new cmb.b(cuf.rp, 12, 16, 10),
                     new cmb.b(cuf.rx, 12, 16, 10),
                     new cmb.b(cuf.rl, 12, 16, 10),
                     new cmb.b(cuf.rn, 12, 16, 10),
                     new cmb.i(dfj.bA, 1, 1, 16, 5),
                     new cmb.i(dfj.bB, 1, 1, 16, 5),
                     new cmb.i(dfj.bC, 1, 1, 16, 5),
                     new cmb.i(dfj.bD, 1, 1, 16, 5),
                     new cmb.i(dfj.bE, 1, 1, 16, 5),
                     new cmb.i(dfj.bF, 1, 1, 16, 5),
                     new cmb.i(dfj.bG, 1, 1, 16, 5),
                     new cmb.i(dfj.bH, 1, 1, 16, 5),
                     new cmb.i(dfj.bI, 1, 1, 16, 5),
                     new cmb.i(dfj.bJ, 1, 1, 16, 5),
                     new cmb.i(dfj.bK, 1, 1, 16, 5),
                     new cmb.i(dfj.bL, 1, 1, 16, 5),
                     new cmb.i(dfj.bM, 1, 1, 16, 5),
                     new cmb.i(dfj.bN, 1, 1, 16, 5),
                     new cmb.i(dfj.bO, 1, 1, 16, 5),
                     new cmb.i(dfj.bP, 1, 1, 16, 5),
                     new cmb.i(dfj.ik, 1, 4, 16, 5),
                     new cmb.i(dfj.il, 1, 4, 16, 5),
                     new cmb.i(dfj.im, 1, 4, 16, 5),
                     new cmb.i(dfj.in, 1, 4, 16, 5),
                     new cmb.i(dfj.io, 1, 4, 16, 5),
                     new cmb.i(dfj.ip, 1, 4, 16, 5),
                     new cmb.i(dfj.iq, 1, 4, 16, 5),
                     new cmb.i(dfj.ir, 1, 4, 16, 5),
                     new cmb.i(dfj.is, 1, 4, 16, 5),
                     new cmb.i(dfj.it, 1, 4, 16, 5),
                     new cmb.i(dfj.iu, 1, 4, 16, 5),
                     new cmb.i(dfj.iv, 1, 4, 16, 5),
                     new cmb.i(dfj.iw, 1, 4, 16, 5),
                     new cmb.i(dfj.ix, 1, 4, 16, 5),
                     new cmb.i(dfj.iy, 1, 4, 16, 5),
                     new cmb.i(dfj.iz, 1, 4, 16, 5)
                  },
                  3,
                  new cmb.g[]{
                     new cmb.b(cuf.rm, 12, 16, 20),
                     new cmb.b(cuf.rq, 12, 16, 20),
                     new cmb.b(cuf.rj, 12, 16, 20),
                     new cmb.b(cuf.rw, 12, 16, 20),
                     new cmb.b(cuf.ro, 12, 16, 20),
                     new cmb.i(dfj.aZ, 3, 1, 12, 10),
                     new cmb.i(dfj.bd, 3, 1, 12, 10),
                     new cmb.i(dfj.bn, 3, 1, 12, 10),
                     new cmb.i(dfj.bo, 3, 1, 12, 10),
                     new cmb.i(dfj.bk, 3, 1, 12, 10),
                     new cmb.i(dfj.bl, 3, 1, 12, 10),
                     new cmb.i(dfj.bi, 3, 1, 12, 10),
                     new cmb.i(dfj.bg, 3, 1, 12, 10),
                     new cmb.i(dfj.bm, 3, 1, 12, 10),
                     new cmb.i(dfj.bc, 3, 1, 12, 10),
                     new cmb.i(dfj.bh, 3, 1, 12, 10),
                     new cmb.i(dfj.be, 3, 1, 12, 10),
                     new cmb.i(dfj.bb, 3, 1, 12, 10),
                     new cmb.i(dfj.ba, 3, 1, 12, 10),
                     new cmb.i(dfj.bf, 3, 1, 12, 10),
                     new cmb.i(dfj.bj, 3, 1, 12, 10)
                  },
                  4,
                  new cmb.g[]{
                     new cmb.b(cuf.ru, 12, 16, 30),
                     new cmb.b(cuf.rs, 12, 16, 30),
                     new cmb.b(cuf.rt, 12, 16, 30),
                     new cmb.b(cuf.rv, 12, 16, 30),
                     new cmb.b(cuf.rk, 12, 16, 30),
                     new cmb.b(cuf.rr, 12, 16, 30),
                     new cmb.i(cuf.uP, 3, 1, 12, 15),
                     new cmb.i(cuf.va, 3, 1, 12, 15),
                     new cmb.i(cuf.uS, 3, 1, 12, 15),
                     new cmb.i(cuf.vd, 3, 1, 12, 15),
                     new cmb.i(cuf.uV, 3, 1, 12, 15),
                     new cmb.i(cuf.vc, 3, 1, 12, 15),
                     new cmb.i(cuf.uU, 3, 1, 12, 15),
                     new cmb.i(cuf.uW, 3, 1, 12, 15),
                     new cmb.i(cuf.ve, 3, 1, 12, 15),
                     new cmb.i(cuf.uZ, 3, 1, 12, 15),
                     new cmb.i(cuf.uR, 3, 1, 12, 15),
                     new cmb.i(cuf.uY, 3, 1, 12, 15),
                     new cmb.i(cuf.vb, 3, 1, 12, 15),
                     new cmb.i(cuf.uT, 3, 1, 12, 15),
                     new cmb.i(cuf.uQ, 3, 1, 12, 15),
                     new cmb.i(cuf.uX, 3, 1, 12, 15)
                  },
                  5,
                  new cmb.g[]{new cmb.i(cuf.pZ, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            cma.i,
            a(
               ImmutableMap.of(
                  1,
                  new cmb.g[]{new cmb.b(cuf.pq, 32, 16, 2), new cmb.i(cuf.ow, 1, 16, 1), new cmb.h(dfj.L, 10, 1, cuf.pW, 10, 12, 1, 0.05F)},
                  2,
                  new cmb.g[]{new cmb.b(cuf.pW, 26, 12, 10), new cmb.i(cuf.ov, 2, 1, 5)},
                  3,
                  new cmb.g[]{new cmb.b(cuf.ps, 14, 16, 20), new cmb.i(cuf.vW, 3, 1, 10)},
                  4,
                  new cmb.g[]{new cmb.b(cuf.pt, 24, 16, 30), new cmb.e(cuf.ov, 2, 3, 15)},
                  5,
                  new cmb.g[]{new cmb.b(cuf.mb, 8, 12, 30), new cmb.e(cuf.vW, 3, 3, 15), new cmb.k(cuf.ow, 5, cuf.vq, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            cma.k,
            a(
               ImmutableMap.builder()
                  .put(1, new cmb.g[]{new cmb.b(cuf.qO, 24, 16, 2), new cmb.d(1, avz.i), new cmb.i(dfj.cl, 9, 1, 12, 1)})
                  .put(2, new cmb.g[]{new cmb.b(cuf.qP, 4, 12, 10), new cmb.d(5, avz.i), new cmb.i(cuf.ws, 1, 1, 5)})
                  .put(3, new cmb.g[]{new cmb.b(cuf.rf, 5, 12, 20), new cmb.d(10, avz.i), new cmb.i(cuf.cG, 1, 4, 10)})
                  .put(4, new cmb.g[]{new cmb.b(cuf.tZ, 2, 12, 30), new cmb.d(15, avz.i), new cmb.i(cuf.qW, 5, 1, 15), new cmb.i(cuf.qS, 4, 1, 15)})
                  .put(5, new cmb.g[]{new cmb.i(cuf.uL, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            cma.e,
            a(
               ImmutableMap.of(
                  1,
                  new cmb.g[]{new cmb.b(cuf.qO, 24, 16, 2), new cmb.i(cuf.uj, 7, 1, 1)},
                  2,
                  new cmb.g[]{new cmb.b(cuf.fT, 11, 16, 10), new cmb.l(13, awi.d, "filled_map.monument", eps.j, 12, 5)},
                  3,
                  new cmb.g[]{
                     new cmb.b(cuf.qS, 1, 12, 20),
                     new cmb.l(14, awi.c, "filled_map.mansion", eps.i, 12, 10),
                     new cmb.l(12, awi.m, "filled_map.trial_chambers", eps.I, 12, 10)
                  },
                  4,
                  new cmb.g[]{
                     new cmb.i(cuf.uc, 7, 1, 15),
                     new cmb.i(cuf.uP, 3, 1, 15),
                     new cmb.i(cuf.va, 3, 1, 15),
                     new cmb.i(cuf.uS, 3, 1, 15),
                     new cmb.i(cuf.vd, 3, 1, 15),
                     new cmb.i(cuf.uV, 3, 1, 15),
                     new cmb.i(cuf.vc, 3, 1, 15),
                     new cmb.i(cuf.uU, 3, 1, 15),
                     new cmb.i(cuf.uW, 3, 1, 15),
                     new cmb.i(cuf.ve, 3, 1, 15),
                     new cmb.i(cuf.uZ, 3, 1, 15),
                     new cmb.i(cuf.uR, 3, 1, 15),
                     new cmb.i(cuf.uY, 3, 1, 15),
                     new cmb.i(cuf.vb, 3, 1, 15),
                     new cmb.i(cuf.uT, 3, 1, 15),
                     new cmb.i(cuf.uQ, 3, 1, 15),
                     new cmb.i(cuf.uX, 3, 1, 15)
                  },
                  5,
                  new cmb.g[]{new cmb.i(cuf.wd, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            cma.f,
            a(
               ImmutableMap.of(
                  1,
                  new cmb.g[]{new cmb.b(cuf.se, 32, 16, 2), new cmb.i(cuf.lH, 1, 2, 1)},
                  2,
                  new cmb.g[]{new cmb.b(cuf.oJ, 3, 12, 10), new cmb.i(cuf.oB, 1, 1, 5)},
                  3,
                  new cmb.g[]{new cmb.b(cuf.uD, 2, 12, 20), new cmb.i(dfj.ec, 4, 1, 12, 10)},
                  4,
                  new cmb.g[]{new cmb.b(cuf.op, 4, 12, 30), new cmb.b(cuf.sl, 9, 12, 30), new cmb.i(cuf.sf, 5, 1, 15)},
                  5,
                  new cmb.g[]{new cmb.b(cuf.sj, 22, 12, 30), new cmb.i(cuf.tW, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            cma.c,
            a(
               ImmutableMap.of(
                  1,
                  new cmb.g[]{
                     new cmb.b(cuf.ox, 15, 16, 2),
                     new cmb.i(new cuc(cuf.pI), 7, 1, 12, 1, 0.2F),
                     new cmb.i(new cuc(cuf.pJ), 4, 1, 12, 1, 0.2F),
                     new cmb.i(new cuc(cuf.pG), 5, 1, 12, 1, 0.2F),
                     new cmb.i(new cuc(cuf.pH), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cmb.g[]{
                     new cmb.b(cuf.oF, 4, 12, 10),
                     new cmb.i(new cuc(cuf.wr), 36, 1, 12, 5, 0.2F),
                     new cmb.i(new cuc(cuf.pF), 1, 1, 12, 5, 0.2F),
                     new cmb.i(new cuc(cuf.pE), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new cmb.g[]{
                     new cmb.b(cuf.qA, 1, 12, 20),
                     new cmb.b(cuf.oz, 1, 12, 20),
                     new cmb.i(new cuc(cuf.pC), 1, 1, 12, 10, 0.2F),
                     new cmb.i(new cuc(cuf.pD), 4, 1, 12, 10, 0.2F),
                     new cmb.i(new cuc(cuf.vs), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new cmb.g[]{new cmb.e(cuf.pM, 14, 3, 15, 0.2F), new cmb.e(cuf.pN, 8, 3, 15, 0.2F)},
                  5,
                  new cmb.g[]{new cmb.e(cuf.pK, 8, 3, 30, 0.2F), new cmb.e(cuf.pL, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cma.p,
            a(
               ImmutableMap.of(
                  1,
                  new cmb.g[]{new cmb.b(cuf.ox, 15, 16, 2), new cmb.i(new cuc(cuf.pe), 3, 1, 12, 1, 0.2F), new cmb.e(cuf.pb, 2, 3, 1)},
                  2,
                  new cmb.g[]{new cmb.b(cuf.oF, 4, 12, 10), new cmb.i(new cuc(cuf.wr), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cmb.g[]{new cmb.b(cuf.pW, 24, 12, 20)},
                  4,
                  new cmb.g[]{new cmb.b(cuf.oz, 1, 12, 30), new cmb.e(cuf.pj, 12, 3, 15, 0.2F)},
                  5,
                  new cmb.g[]{new cmb.e(cuf.pg, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cma.o,
            a(
               ImmutableMap.of(
                  1,
                  new cmb.g[]{
                     new cmb.b(cuf.ox, 15, 16, 2),
                     new cmb.i(new cuc(cuf.oU), 1, 1, 12, 1, 0.2F),
                     new cmb.i(new cuc(cuf.oS), 1, 1, 12, 1, 0.2F),
                     new cmb.i(new cuc(cuf.oT), 1, 1, 12, 1, 0.2F),
                     new cmb.i(new cuc(cuf.oV), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cmb.g[]{new cmb.b(cuf.oF, 4, 12, 10), new cmb.i(new cuc(cuf.wr), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cmb.g[]{
                     new cmb.b(cuf.pW, 30, 12, 20),
                     new cmb.e(cuf.pe, 1, 3, 10, 0.2F),
                     new cmb.e(cuf.pc, 2, 3, 10, 0.2F),
                     new cmb.e(cuf.pd, 3, 3, 10, 0.2F),
                     new cmb.i(new cuc(cuf.pk), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new cmb.g[]{new cmb.b(cuf.oz, 1, 12, 30), new cmb.e(cuf.pj, 12, 3, 15, 0.2F), new cmb.e(cuf.ph, 5, 3, 15, 0.2F)},
                  5,
                  new cmb.g[]{new cmb.e(cuf.pi, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cma.d,
            a(
               ImmutableMap.of(
                  1,
                  new cmb.g[]{new cmb.b(cuf.sc, 14, 16, 2), new cmb.b(cuf.pX, 7, 16, 2), new cmb.b(cuf.uA, 4, 16, 2), new cmb.i(cuf.uC, 1, 1, 1)},
                  2,
                  new cmb.g[]{new cmb.b(cuf.ox, 15, 16, 2), new cmb.i(cuf.pY, 1, 5, 16, 5), new cmb.i(cuf.sd, 1, 8, 16, 5)},
                  3,
                  new cmb.g[]{new cmb.b(cuf.uN, 7, 16, 20), new cmb.b(cuf.sa, 10, 16, 20)},
                  4,
                  new cmb.g[]{new cmb.b(cuf.qN, 10, 12, 30)},
                  5,
                  new cmb.g[]{new cmb.b(cuf.wu, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            cma.j,
            a(
               ImmutableMap.of(
                  1,
                  new cmb.g[]{new cmb.b(cuf.qD, 6, 16, 2), new cmb.a(cuf.pA, 3), new cmb.a(cuf.pz, 7)},
                  2,
                  new cmb.g[]{new cmb.b(cuf.pW, 26, 12, 10), new cmb.a(cuf.py, 5, 12, 5), new cmb.a(cuf.pB, 4, 12, 5)},
                  3,
                  new cmb.g[]{new cmb.b(cuf.uE, 9, 12, 20), new cmb.a(cuf.pz, 7)},
                  4,
                  new cmb.g[]{new cmb.b(cuf.op, 4, 12, 30), new cmb.a(cuf.uJ, 6, 12, 15)},
                  5,
                  new cmb.g[]{new cmb.i(new cuc(cuf.nL), 6, 1, 12, 30, 0.2F), new cmb.a(cuf.py, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            cma.l,
            a(
               ImmutableMap.of(
                  1,
                  new cmb.g[]{new cmb.b(cuf.qM, 10, 16, 2), new cmb.i(cuf.qL, 1, 10, 16, 1)},
                  2,
                  new cmb.g[]{new cmb.b(dfj.b, 20, 16, 10), new cmb.i(dfj.eK, 1, 4, 16, 5)},
                  3,
                  new cmb.g[]{
                     new cmb.b(dfj.c, 16, 16, 20),
                     new cmb.b(dfj.g, 16, 16, 20),
                     new cmb.b(dfj.e, 16, 16, 20),
                     new cmb.i(dfj.su, 1, 4, 16, 10),
                     new cmb.i(dfj.h, 1, 4, 16, 10),
                     new cmb.i(dfj.f, 1, 4, 16, 10),
                     new cmb.i(dfj.d, 1, 4, 16, 10)
                  },
                  4,
                  new cmb.g[]{
                     new cmb.b(cuf.oC, 12, 12, 30),
                     new cmb.i(dfj.hk, 1, 1, 12, 15),
                     new cmb.i(dfj.hj, 1, 1, 12, 15),
                     new cmb.i(dfj.hu, 1, 1, 12, 15),
                     new cmb.i(dfj.hm, 1, 1, 12, 15),
                     new cmb.i(dfj.hq, 1, 1, 12, 15),
                     new cmb.i(dfj.hr, 1, 1, 12, 15),
                     new cmb.i(dfj.hy, 1, 1, 12, 15),
                     new cmb.i(dfj.hx, 1, 1, 12, 15),
                     new cmb.i(dfj.hp, 1, 1, 12, 15),
                     new cmb.i(dfj.hl, 1, 1, 12, 15),
                     new cmb.i(dfj.ho, 1, 1, 12, 15),
                     new cmb.i(dfj.hw, 1, 1, 12, 15),
                     new cmb.i(dfj.hs, 1, 1, 12, 15),
                     new cmb.i(dfj.ht, 1, 1, 12, 15),
                     new cmb.i(dfj.hn, 1, 1, 12, 15),
                     new cmb.i(dfj.hv, 1, 1, 12, 15),
                     new cmb.i(dfj.lh, 1, 1, 12, 15),
                     new cmb.i(dfj.lg, 1, 1, 12, 15),
                     new cmb.i(dfj.lr, 1, 1, 12, 15),
                     new cmb.i(dfj.lj, 1, 1, 12, 15),
                     new cmb.i(dfj.ln, 1, 1, 12, 15),
                     new cmb.i(dfj.lo, 1, 1, 12, 15),
                     new cmb.i(dfj.lv, 1, 1, 12, 15),
                     new cmb.i(dfj.lu, 1, 1, 12, 15),
                     new cmb.i(dfj.lm, 1, 1, 12, 15),
                     new cmb.i(dfj.li, 1, 1, 12, 15),
                     new cmb.i(dfj.ll, 1, 1, 12, 15),
                     new cmb.i(dfj.lt, 1, 1, 12, 15),
                     new cmb.i(dfj.lp, 1, 1, 12, 15),
                     new cmb.i(dfj.lq, 1, 1, 12, 15),
                     new cmb.i(dfj.lk, 1, 1, 12, 15),
                     new cmb.i(dfj.ls, 1, 1, 12, 15)
                  },
                  5,
                  new cmb.g[]{new cmb.i(dfj.hf, 1, 1, 12, 30), new cmb.i(dfj.hd, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<cmb.g[]> b = a(
      ImmutableMap.of(
         1,
         new cmb.g[]{
            new cmb.i(cuf.cT, 2, 1, 5, 1),
            new cmb.i(cuf.qQ, 4, 1, 5, 1),
            new cmb.i(cuf.fu, 2, 1, 5, 1),
            new cmb.i(cuf.vU, 5, 1, 5, 1),
            new cmb.i(cuf.cO, 1, 1, 12, 1),
            new cmb.i(cuf.dJ, 1, 1, 8, 1),
            new cmb.i(cuf.fk, 1, 1, 4, 1),
            new cmb.i(cuf.dK, 3, 1, 12, 1),
            new cmb.i(cuf.eW, 3, 1, 8, 1),
            new cmb.i(cuf.dk, 1, 1, 12, 1),
            new cmb.i(cuf.dl, 1, 1, 12, 1),
            new cmb.i(cuf.dm, 1, 1, 8, 1),
            new cmb.i(cuf.dn, 1, 1, 12, 1),
            new cmb.i(cuf.do, 1, 1, 12, 1),
            new cmb.i(cuf.dp, 1, 1, 12, 1),
            new cmb.i(cuf.dq, 1, 1, 12, 1),
            new cmb.i(cuf.dr, 1, 1, 12, 1),
            new cmb.i(cuf.ds, 1, 1, 12, 1),
            new cmb.i(cuf.dt, 1, 1, 12, 1),
            new cmb.i(cuf.du, 1, 1, 12, 1),
            new cmb.i(cuf.dv, 1, 1, 7, 1),
            new cmb.i(cuf.pv, 1, 1, 12, 1),
            new cmb.i(cuf.vl, 1, 1, 12, 1),
            new cmb.i(cuf.rY, 1, 1, 12, 1),
            new cmb.i(cuf.rZ, 1, 1, 12, 1),
            new cmb.i(cuf.aa, 5, 1, 8, 1),
            new cmb.i(cuf.Y, 5, 1, 8, 1),
            new cmb.i(cuf.ac, 5, 1, 8, 1),
            new cmb.i(cuf.Z, 5, 1, 8, 1),
            new cmb.i(cuf.W, 5, 1, 8, 1),
            new cmb.i(cuf.X, 5, 1, 8, 1),
            new cmb.i(cuf.ab, 5, 1, 8, 1),
            new cmb.i(cuf.ad, 5, 1, 8, 1),
            new cmb.i(cuf.rw, 1, 3, 12, 1),
            new cmb.i(cuf.ri, 1, 3, 12, 1),
            new cmb.i(cuf.rt, 1, 3, 12, 1),
            new cmb.i(cuf.ro, 1, 3, 12, 1),
            new cmb.i(cuf.rx, 1, 3, 12, 1),
            new cmb.i(cuf.rv, 1, 3, 12, 1),
            new cmb.i(cuf.rq, 1, 3, 12, 1),
            new cmb.i(cuf.rk, 1, 3, 12, 1),
            new cmb.i(cuf.rm, 1, 3, 12, 1),
            new cmb.i(cuf.rp, 1, 3, 12, 1),
            new cmb.i(cuf.rs, 1, 3, 12, 1),
            new cmb.i(cuf.rl, 1, 3, 12, 1),
            new cmb.i(cuf.rn, 1, 3, 12, 1),
            new cmb.i(cuf.rj, 1, 3, 12, 1),
            new cmb.i(cuf.ru, 1, 3, 12, 1),
            new cmb.i(cuf.rr, 1, 3, 12, 1),
            new cmb.i(cuf.kx, 3, 1, 8, 1),
            new cmb.i(cuf.ky, 3, 1, 8, 1),
            new cmb.i(cuf.kz, 3, 1, 8, 1),
            new cmb.i(cuf.kA, 3, 1, 8, 1),
            new cmb.i(cuf.kw, 3, 1, 8, 1),
            new cmb.i(cuf.fV, 1, 1, 12, 1),
            new cmb.i(cuf.dA, 1, 1, 12, 1),
            new cmb.i(cuf.dB, 1, 1, 12, 1),
            new cmb.i(cuf.gb, 1, 2, 5, 1),
            new cmb.i(cuf.dQ, 1, 2, 5, 1),
            new cmb.i(cuf.af, 1, 8, 8, 1),
            new cmb.i(cuf.ai, 1, 4, 6, 1),
            new cmb.i(cuf.xo, 1, 2, 5, 1),
            new cmb.i(cuf.F, 1, 2, 5, 1),
            new cmb.i(cuf.dN, 1, 2, 5, 1)
         },
         2,
         new cmb.g[]{
            new cmb.i(cuf.qI, 5, 1, 4, 1),
            new cmb.i(cuf.qF, 5, 1, 4, 1),
            new cmb.i(cuf.hV, 3, 1, 6, 1),
            new cmb.i(cuf.kV, 6, 1, 6, 1),
            new cmb.i(cuf.pu, 1, 1, 8, 1),
            new cmb.i(cuf.E, 3, 3, 6, 1)
         }
      )
   );
   private static final cmb.l s = new cmb.l(8, awi.f, "filled_map.village_desert", eps.B, 12, 5);
   private static final cmb.l t = new cmb.l(8, awi.e, "filled_map.village_savanna", eps.D, 12, 5);
   private static final cmb.l u = new cmb.l(8, awi.g, "filled_map.village_plains", eps.C, 12, 5);
   private static final cmb.l v = new cmb.l(8, awi.h, "filled_map.village_taiga", eps.F, 12, 5);
   private static final cmb.l w = new cmb.l(8, awi.i, "filled_map.village_snowy", eps.E, 12, 5);
   private static final cmb.l x = new cmb.l(8, awi.j, "filled_map.explorer_jungle", eps.G, 12, 5);
   private static final cmb.l y = new cmb.l(8, awi.k, "filled_map.explorer_swamp", eps.H, 12, 5);
   public static final Map<cma, Int2ObjectMap<cmb.g[]>> c = Map.of(
      cma.k,
      a(
         ImmutableMap.builder()
            .put(1, new cmb.g[]{new cmb.b(cuf.qO, 24, 16, 2), a(1), new cmb.i(dfj.cl, 9, 1, 12, 1)})
            .put(2, new cmb.g[]{new cmb.b(cuf.qP, 4, 12, 10), a(5), new cmb.i(cuf.ws, 1, 1, 5)})
            .put(3, new cmb.g[]{new cmb.b(cuf.rf, 5, 12, 20), a(10), new cmb.i(cuf.cG, 1, 4, 10)})
            .put(4, new cmb.g[]{new cmb.b(cuf.tZ, 2, 12, 30), new cmb.i(cuf.qW, 5, 1, 15), new cmb.i(cuf.qS, 4, 1, 15)})
            .put(5, new cmb.g[]{a(), new cmb.i(cuf.uL, 20, 1, 30)})
            .build()
      ),
      cma.c,
      a(
         ImmutableMap.builder()
            .put(1, new cmb.g[]{new cmb.b(cuf.ox, 15, 12, 2), new cmb.b(cuf.oF, 5, 12, 2)})
            .put(
               2,
               new cmb.g[]{
                  cmb.m.a(new cmb.i(cuf.pJ, 4, 1, 12, 5, 0.05F), cmc.a, cmc.c, cmc.d, cmc.e, cmc.g),
                  cmb.m.a(new cmb.i(cuf.pF, 4, 1, 12, 5, 0.05F), cmc.b, cmc.f),
                  cmb.m.a(new cmb.i(cuf.pG, 5, 1, 12, 5, 0.05F), cmc.a, cmc.c, cmc.d, cmc.e, cmc.g),
                  cmb.m.a(new cmb.i(cuf.pC, 5, 1, 12, 5, 0.05F), cmc.b, cmc.f),
                  cmb.m.a(new cmb.i(cuf.pI, 7, 1, 12, 5, 0.05F), cmc.a, cmc.c, cmc.d, cmc.e, cmc.g),
                  cmb.m.a(new cmb.i(cuf.pE, 7, 1, 12, 5, 0.05F), cmc.b, cmc.f),
                  cmb.m.a(new cmb.i(cuf.pH, 9, 1, 12, 5, 0.05F), cmc.a, cmc.c, cmc.d, cmc.e, cmc.g),
                  cmb.m.a(new cmb.i(cuf.pD, 9, 1, 12, 5, 0.05F), cmc.b, cmc.f)
               }
            )
            .put(3, new cmb.g[]{new cmb.b(cuf.qA, 1, 12, 20), new cmb.i(cuf.vs, 5, 1, 12, 10, 0.05F), new cmb.i(cuf.wr, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new cmb.g[]{
                  cmb.m.a(new cmb.i(cuf.pJ, 8, 1, 3, 15, 0.05F, dax.a), cmc.a),
                  cmb.m.a(new cmb.i(cuf.pG, 9, 1, 3, 15, 0.05F, dax.d), cmc.a),
                  cmb.m.a(new cmb.i(cuf.pI, 11, 1, 3, 15, 0.05F, dax.b), cmc.a),
                  cmb.m.a(new cmb.i(cuf.pH, 13, 1, 3, 15, 0.05F, dax.c), cmc.a),
                  cmb.m.a(new cmb.i(cuf.pJ, 8, 1, 3, 15, 0.05F, dax.g), cmc.c),
                  cmb.m.a(new cmb.i(cuf.pG, 9, 1, 3, 15, 0.05F, dax.j), cmc.c),
                  cmb.m.a(new cmb.i(cuf.pI, 11, 1, 3, 15, 0.05F, dax.h), cmc.c),
                  cmb.m.a(new cmb.i(cuf.pH, 13, 1, 3, 15, 0.05F, dax.i), cmc.c),
                  cmb.m.a(new cmb.i(cuf.pJ, 2, 1, 3, 15, 0.05F, dax.m), cmc.d),
                  cmb.m.a(new cmb.i(cuf.pG, 3, 1, 3, 15, 0.05F, dax.p), cmc.d),
                  cmb.m.a(new cmb.i(cuf.pI, 5, 1, 3, 15, 0.05F, dax.n), cmc.d),
                  cmb.m.a(new cmb.i(cuf.pH, 7, 1, 3, 15, 0.05F, dax.o), cmc.d),
                  cmb.m.a(new cmb.i(cuf.pJ, 8, 1, 3, 15, 0.05F, dax.s), cmc.e),
                  cmb.m.a(new cmb.i(cuf.pG, 9, 1, 3, 15, 0.05F, dax.t), cmc.e),
                  cmb.m.a(new cmb.i(cuf.pF, 8, 1, 3, 15, 0.05F, dax.w), cmc.b),
                  cmb.m.a(new cmb.i(cuf.pC, 9, 1, 3, 15, 0.05F, dax.z), cmc.b),
                  cmb.m.a(new cmb.i(cuf.pE, 11, 1, 3, 15, 0.05F, dax.x), cmc.b),
                  cmb.m.a(new cmb.i(cuf.pD, 13, 1, 3, 15, 0.05F, dax.y), cmc.b),
                  cmb.m.a(new cmb.i(cuf.pF, 8, 1, 3, 15, 0.05F, dax.C), cmc.f),
                  cmb.m.a(new cmb.i(cuf.pC, 9, 1, 3, 15, 0.05F, dax.F), cmc.f),
                  cmb.m.a(new cmb.i(cuf.pE, 11, 1, 3, 15, 0.05F, dax.D), cmc.f),
                  cmb.m.a(new cmb.i(cuf.pD, 13, 1, 3, 15, 0.05F, dax.E), cmc.f),
                  cmb.m.a(new cmb.h(cuf.pN, 1, 4, cuf.pM, 1, 3, 15, 0.05F), cmc.g),
                  cmb.m.a(new cmb.h(cuf.pM, 1, 4, cuf.pL, 1, 3, 15, 0.05F), cmc.g),
                  cmb.m.a(new cmb.h(cuf.pK, 1, 4, cuf.pN, 1, 3, 15, 0.05F), cmc.g),
                  cmb.m.a(new cmb.h(cuf.pL, 1, 2, cuf.pK, 1, 3, 15, 0.05F), cmc.g)
               }
            )
            .put(
               5,
               new cmb.g[]{
                  cmb.m.a(new cmb.h(cuf.oz, 4, 16, cuf.pL, 1, 3, 30, 0.05F, dax.f), cmc.a),
                  cmb.m.a(new cmb.h(cuf.oz, 3, 16, cuf.pM, 1, 3, 30, 0.05F, dax.e), cmc.a),
                  cmb.m.a(new cmb.h(cuf.oz, 3, 16, cuf.pM, 1, 3, 30, 0.05F, dax.l), cmc.c),
                  cmb.m.a(new cmb.h(cuf.oz, 2, 12, cuf.pN, 1, 3, 30, 0.05F, dax.k), cmc.c),
                  cmb.m.a(new cmb.h(cuf.oz, 2, 6, cuf.pK, 1, 3, 30, 0.05F, dax.r), cmc.d),
                  cmb.m.a(new cmb.h(cuf.oz, 3, 8, cuf.pL, 1, 3, 30, 0.05F, dax.q), cmc.d),
                  cmb.m.a(new cmb.h(cuf.oz, 2, 12, cuf.pN, 1, 3, 30, 0.05F, dax.u), cmc.e),
                  cmb.m.a(new cmb.h(cuf.oz, 3, 12, cuf.pK, 1, 3, 30, 0.05F, dax.v), cmc.e),
                  cmb.m.a(new cmb.i(cuf.pC, 9, 1, 3, 30, 0.05F, dax.B), cmc.b),
                  cmb.m.a(new cmb.i(cuf.pF, 8, 1, 3, 30, 0.05F, dax.A), cmc.b),
                  cmb.m.a(new cmb.i(cuf.pC, 9, 1, 3, 30, 0.05F, dax.H), cmc.f),
                  cmb.m.a(new cmb.i(cuf.pF, 8, 1, 3, 30, 0.05F, dax.G), cmc.f),
                  cmb.m.a(new cmb.h(cuf.oz, 4, 18, cuf.pL, 1, 3, 30, 0.05F, dax.J), cmc.g),
                  cmb.m.a(new cmb.h(cuf.oz, 3, 18, cuf.pM, 1, 3, 30, 0.05F, dax.I), cmc.g),
                  cmb.m.a(new cmb.b(cuf.aN, 1, 12, 30, 42), cmc.g),
                  cmb.m.a(new cmb.b(cuf.aK, 1, 12, 30, 4), cmc.a, cmc.b, cmc.c, cmc.d, cmc.e, cmc.f)
               }
            )
            .build()
      ),
      cma.e,
      a(
         ImmutableMap.of(
            1,
            new cmb.g[]{new cmb.b(cuf.qO, 24, 16, 2), new cmb.i(cuf.uj, 7, 1, 1)},
            2,
            new cmb.g[]{
               new cmb.b(cuf.fT, 11, 16, 10),
               new cmb.m(ImmutableMap.builder().put(cmc.a, t).put(cmc.d, u).put(cmc.c, v).put(cmc.g, w).put(cmc.e, u).put(cmc.b, t).put(cmc.f, w).build()),
               new cmb.m(ImmutableMap.builder().put(cmc.a, u).put(cmc.d, s).put(cmc.c, t).put(cmc.g, u).put(cmc.e, v).put(cmc.b, s).put(cmc.f, v).build()),
               new cmb.m(
                  ImmutableMap.builder().put(cmc.a, x).put(cmc.d, x).put(cmc.c, new cmb.f()).put(cmc.g, y).put(cmc.e, y).put(cmc.b, y).put(cmc.f, x).build()
               )
            },
            3,
            new cmb.g[]{
               new cmb.b(cuf.qS, 1, 12, 20),
               new cmb.l(13, awi.d, "filled_map.monument", eps.j, 12, 10),
               new cmb.l(12, awi.m, "filled_map.trial_chambers", eps.I, 12, 10)
            },
            4,
            new cmb.g[]{
               new cmb.i(cuf.uc, 7, 1, 15),
               new cmb.i(cuf.uP, 3, 1, 15),
               new cmb.i(cuf.va, 3, 1, 15),
               new cmb.i(cuf.uS, 3, 1, 15),
               new cmb.i(cuf.vd, 3, 1, 15),
               new cmb.i(cuf.uV, 3, 1, 15),
               new cmb.i(cuf.vc, 3, 1, 15),
               new cmb.i(cuf.uU, 3, 1, 15),
               new cmb.i(cuf.uW, 3, 1, 15),
               new cmb.i(cuf.ve, 3, 1, 15),
               new cmb.i(cuf.uZ, 3, 1, 15),
               new cmb.i(cuf.uR, 3, 1, 15),
               new cmb.i(cuf.uY, 3, 1, 15),
               new cmb.i(cuf.vb, 3, 1, 15),
               new cmb.i(cuf.uT, 3, 1, 15),
               new cmb.i(cuf.uQ, 3, 1, 15),
               new cmb.i(cuf.uX, 3, 1, 15)
            },
            5,
            new cmb.g[]{new cmb.i(cuf.wd, 8, 1, 30), new cmb.l(14, awi.c, "filled_map.mansion", eps.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<cmb.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new cmb.g[]{
               new cmb.b(a(cwe.a), 1, 1, 1),
               new cmb.b(cuf.qz, 1, 1, 1, 2),
               new cmb.b(cuf.qE, 1, 1, 1, 2),
               new cmb.b(cuf.sn, 1, 1, 1, 3),
               new cmb.b(cuf.uh, 4, 1, 1),
               new cmb.b(cuf.hD, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cmb.g[]{
               new cmb.i(cuf.hV, 1, 1, 6, 1),
               new cmb.i(cuf.kV, 6, 1, 6, 1),
               new cmb.i(cuf.pu, 1, 4, 2, 1),
               new cmb.i(cuf.E, 3, 3, 6, 1),
               new cmb.i(dfj.Y, 1, 8, 4, 1),
               new cmb.i(dfj.W, 1, 8, 4, 1),
               new cmb.i(dfj.aa, 1, 8, 4, 1),
               new cmb.i(dfj.X, 1, 8, 4, 1),
               new cmb.i(dfj.U, 1, 8, 4, 1),
               new cmb.i(dfj.V, 1, 8, 4, 1),
               new cmb.i(dfj.Z, 1, 8, 4, 1),
               new cmb.e(cuf.pd, 1, 1, 1, 0.2F),
               new cmb.i(b(cwe.h), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cmb.g[]{
               new cmb.i(cuf.qI, 3, 1, 4, 1),
               new cmb.i(cuf.qF, 3, 1, 4, 1),
               new cmb.i(cuf.cT, 2, 1, 5, 1),
               new cmb.i(cuf.qQ, 4, 1, 5, 1),
               new cmb.i(cuf.fu, 2, 1, 5, 1),
               new cmb.i(cuf.vU, 5, 1, 5, 1),
               new cmb.i(cuf.cO, 1, 1, 12, 1),
               new cmb.i(cuf.dJ, 1, 1, 8, 1),
               new cmb.i(cuf.fk, 1, 1, 4, 1),
               new cmb.i(cuf.dK, 3, 1, 12, 1),
               new cmb.i(cuf.eW, 3, 1, 8, 1),
               new cmb.i(cuf.dk, 1, 1, 12, 1),
               new cmb.i(cuf.dl, 1, 1, 12, 1),
               new cmb.i(cuf.dm, 1, 1, 8, 1),
               new cmb.i(cuf.dn, 1, 1, 12, 1),
               new cmb.i(cuf.do, 1, 1, 12, 1),
               new cmb.i(cuf.dp, 1, 1, 12, 1),
               new cmb.i(cuf.dq, 1, 1, 12, 1),
               new cmb.i(cuf.dr, 1, 1, 12, 1),
               new cmb.i(cuf.ds, 1, 1, 12, 1),
               new cmb.i(cuf.dt, 1, 1, 12, 1),
               new cmb.i(cuf.du, 1, 1, 12, 1),
               new cmb.i(cuf.dv, 1, 1, 7, 1),
               new cmb.i(cuf.pv, 1, 1, 12, 1),
               new cmb.i(cuf.vl, 1, 1, 12, 1),
               new cmb.i(cuf.rY, 1, 1, 12, 1),
               new cmb.i(cuf.rZ, 1, 1, 12, 1),
               new cmb.i(cuf.aa, 5, 1, 8, 1),
               new cmb.i(cuf.Y, 5, 1, 8, 1),
               new cmb.i(cuf.ac, 5, 1, 8, 1),
               new cmb.i(cuf.Z, 5, 1, 8, 1),
               new cmb.i(cuf.W, 5, 1, 8, 1),
               new cmb.i(cuf.X, 5, 1, 8, 1),
               new cmb.i(cuf.ab, 5, 1, 8, 1),
               new cmb.i(cuf.ad, 5, 1, 8, 1),
               new cmb.i(cuf.rw, 1, 3, 12, 1),
               new cmb.i(cuf.ri, 1, 3, 12, 1),
               new cmb.i(cuf.rt, 1, 3, 12, 1),
               new cmb.i(cuf.ro, 1, 3, 12, 1),
               new cmb.i(cuf.rx, 1, 3, 12, 1),
               new cmb.i(cuf.rv, 1, 3, 12, 1),
               new cmb.i(cuf.rq, 1, 3, 12, 1),
               new cmb.i(cuf.rk, 1, 3, 12, 1),
               new cmb.i(cuf.rm, 1, 3, 12, 1),
               new cmb.i(cuf.rp, 1, 3, 12, 1),
               new cmb.i(cuf.rs, 1, 3, 12, 1),
               new cmb.i(cuf.rl, 1, 3, 12, 1),
               new cmb.i(cuf.rn, 1, 3, 12, 1),
               new cmb.i(cuf.rj, 1, 3, 12, 1),
               new cmb.i(cuf.ru, 1, 3, 12, 1),
               new cmb.i(cuf.rr, 1, 3, 12, 1),
               new cmb.i(cuf.kx, 3, 1, 8, 1),
               new cmb.i(cuf.ky, 3, 1, 8, 1),
               new cmb.i(cuf.kz, 3, 1, 8, 1),
               new cmb.i(cuf.kA, 3, 1, 8, 1),
               new cmb.i(cuf.kw, 3, 1, 8, 1),
               new cmb.i(cuf.fV, 1, 3, 4, 1),
               new cmb.i(cuf.dA, 1, 3, 4, 1),
               new cmb.i(cuf.dB, 1, 3, 4, 1),
               new cmb.i(cuf.gb, 1, 5, 2, 1),
               new cmb.i(cuf.dQ, 1, 2, 5, 1),
               new cmb.i(cuf.af, 1, 8, 8, 1),
               new cmb.i(cuf.ai, 1, 4, 6, 1),
               new cmb.i(cuf.xo, 1, 2, 5, 1),
               new cmb.i(cuf.F, 1, 2, 5, 1),
               new cmb.i(cuf.dN, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static cmb.g a(int $$0) {
      return new cmb.m(
         ImmutableMap.builder()
            .put(cmc.a, new cmb.d($$0, avz.w))
            .put(cmc.b, new cmb.d($$0, avz.x))
            .put(cmc.c, new cmb.d($$0, avz.y))
            .put(cmc.d, new cmb.d($$0, avz.z))
            .put(cmc.e, new cmb.d($$0, avz.A))
            .put(cmc.f, new cmb.d($$0, avz.B))
            .put(cmc.g, new cmb.d($$0, avz.C))
            .build()
      );
   }

   private static cmb.g a() {
      return new cmb.m(
         ImmutableMap.builder()
            .put(cmc.a, new cmb.d(30, 3, 3, avz.D))
            .put(cmc.b, new cmb.d(30, 2, 2, avz.E))
            .put(cmc.c, new cmb.d(30, 3, 3, avz.F))
            .put(cmc.d, new cmb.d(30, 3, 3, avz.G))
            .put(cmc.e, new cmb.d(30, avz.H))
            .put(cmc.f, new cmb.d(30, avz.I))
            .put(cmc.g, new cmb.d(30, 2, 2, avz.J))
            .build()
      );
   }

   private static Int2ObjectMap<cmb.g[]> a(ImmutableMap<Integer, cmb.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static dbb a(jj<cwb> $$0) {
      return new dbb(cuf.sk).a($$1 -> $$1.a(kn.G, new cwd($$0)));
   }

   private static cuc b(jj<cwb> $$0) {
      return cwd.a(cuf.sk, $$0);
   }

   static class a implements cmb.g {
      private final ctx a;
      private final int b;
      private final int c;
      private final int d;

      public a(ctx $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(ctx $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public dbd a(bsg $$0, ayo $$1) {
         dbb $$2 = new dbb(cuf.oA, this.b);
         cuc $$3 = new cuc(this.a);
         if ($$3.a(awf.by)) {
            List<csw> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = cwt.a($$3, $$4);
         }

         return new dbd($$2, $$3, this.c, this.d, 0.2F);
      }

      private static csw a(ayo $$0) {
         return csw.a(csv.a($$0.a(16)));
      }
   }

   static class b implements cmb.g {
      private final dbb a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(dce $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(dce $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new dbb($$0.r(), $$1), $$2, $$3, $$4);
      }

      public b(dbb $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public dbd a(bsg $$0, ayo $$1) {
         return new dbd(this.a, new cuc(cuf.oA, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements cmb.g {
      private final Map<cmc, ctx> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<cmc, ctx> $$3) {
         lq.w.t().filter($$1x -> !$$3.containsKey($$1x)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + lq.w.b($$0x));
         });
         this.a = $$3;
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Nullable
      @Override
      public dbd a(bsg $$0, ayo $$1) {
         if ($$0 instanceof clz $$2) {
            dbb $$3 = new dbb(this.a.get($$2.gz().a()), this.b);
            return new dbd($$3, new cuc(cuf.oA), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements cmb.g {
      private final int a;
      private final awm<czl> b;
      private final int c;
      private final int d;

      public d(int $$0, awm<czl> $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, awm<czl> $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = $$3;
      }

      @Override
      public dbd a(bsg $$0, ayo $$1) {
         Optional<jj<czl>> $$2 = $$0.dQ().H_().d(lr.aK).a(this.b, $$1);
         int $$9;
         cuc $$8;
         if (!$$2.isEmpty()) {
            jj<czl> $$3 = $$2.get();
            czl $$4 = $$3.a();
            int $$5 = Math.max($$4.d(), this.c);
            int $$6 = Math.min($$4.e(), this.d);
            int $$7 = ayg.a($$1, $$5, $$6);
            $$8 = cta.a(new czo($$3, $$7));
            $$9 = 2 + $$1.a(5 + $$7 * 10) + 3 * $$7;
            if ($$3.a(avz.j)) {
               $$9 *= 2;
            }

            if ($$9 > 64) {
               $$9 = 64;
            }
         } else {
            $$9 = 1;
            $$8 = new cuc(cuf.qP);
         }

         return new dbd(new dbb(cuf.oA, $$9), Optional.of(new dbb(cuf.qP)), $$8, 12, this.a, 0.2F);
      }
   }

   static class e implements cmb.g {
      private final cuc a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(ctx $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(ctx $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new cuc($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public dbd a(bsg $$0, ayo $$1) {
         int $$2 = 5 + $$1.a(15);
         jx $$3 = $$0.dQ().H_();
         Optional<jn.c<czl>> $$4 = $$3.d(lr.aK).b(avz.m);
         cuc $$5 = czn.a($$1, new cuc(this.a.g()), $$2, $$3, $$4);
         int $$6 = Math.min(this.b + $$2, 64);
         dbb $$7 = new dbb(cuf.oA, $$6);
         return new dbd($$7, $$5, this.c, this.d, this.e);
      }
   }

   static class f implements cmb.g {
      @Override
      public dbd a(bsg $$0, ayo $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      dbd a(bsg var1, ayo var2);
   }

   static class h implements cmb.g {
      private final dbb a;
      private final int b;
      private final cuc c;
      private final int d;
      private final int e;
      private final float f;
      private final Optional<akj<das>> g;

      public h(dce $$0, int $$1, int $$2, ctx $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new cuc($$3), $$4, $$5, $$6, $$7);
      }

      private h(dce $$0, int $$1, int $$2, cuc $$3, int $$4, int $$5, int $$6, float $$7) {
         this(new dbb($$0, $$1), $$2, $$3.c($$4), $$5, $$6, $$7, Optional.empty());
      }

      h(dce $$0, int $$1, int $$2, dce $$3, int $$4, int $$5, int $$6, float $$7, akj<das> $$8) {
         this(new dbb($$0, $$1), $$2, new cuc($$3, $$4), $$5, $$6, $$7, Optional.of($$8));
      }

      public h(dbb $$0, int $$1, cuc $$2, int $$3, int $$4, float $$5, Optional<akj<das>> $$6) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
         this.g = $$6;
      }

      @Nullable
      @Override
      public dbd a(bsg $$0, ayo $$1) {
         cuc $$2 = this.c.s();
         this.g.ifPresent($$3 -> czn.a($$2, (akj<das>)$$3, $$0.dQ(), $$0.dq(), $$1));
         return new dbd(new dbb(cuf.oA, this.b), Optional.of(this.a), $$2, 0, this.d, this.e, this.f);
      }
   }

   static class i implements cmb.g {
      private final cuc a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;
      private final Optional<akj<das>> f;

      public i(dfh $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cuc($$0), $$1, $$2, $$3, $$4);
      }

      public i(ctx $$0, int $$1, int $$2, int $$3) {
         this(new cuc($$0), $$1, $$2, 12, $$3);
      }

      public i(ctx $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cuc($$0), $$1, $$2, $$3, $$4);
      }

      public i(cuc $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(ctx $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new cuc($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(ctx $$0, int $$1, int $$2, int $$3, int $$4, float $$5, akj<das> $$6) {
         this(new cuc($$0), $$1, $$2, $$3, $$4, $$5, Optional.of($$6));
      }

      public i(cuc $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this($$0, $$1, $$2, $$3, $$4, $$5, Optional.empty());
      }

      public i(cuc $$0, int $$1, int $$2, int $$3, int $$4, float $$5, Optional<akj<das>> $$6) {
         this.a = $$0;
         this.b = $$1;
         this.a.e($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
         this.f = $$6;
      }

      @Override
      public dbd a(bsg $$0, ayo $$1) {
         cuc $$2 = this.a.s();
         this.f.ifPresent($$3 -> czn.a($$2, (akj<das>)$$3, $$0.dQ(), $$0.dq(), $$1));
         return new dbd(new dbb(cuf.oA, this.b), $$2, this.c, this.d, this.e);
      }
   }

   static class j implements cmb.g {
      private final cxf a;
      private final int b;
      private final float c;

      public j(jj<brm> $$0, int $$1, int $$2) {
         this(new cxf(List.of(new cxf.a($$0, $$1))), $$2, 0.05F);
      }

      public j(cxf $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public dbd a(bsg $$0, ayo $$1) {
         cuc $$2 = new cuc(cuf.vX, 1);
         $$2.b(kn.H, this.a);
         return new dbd(new dbb(cuf.oA), $$2, 12, this.b, this.c);
      }
   }

   static class k implements cmb.g {
      private final cuc a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final ctx f;
      private final int g;
      private final float h;

      public k(ctx $$0, int $$1, ctx $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new cuc($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public dbd a(bsg $$0, ayo $$1) {
         dbb $$2 = new dbb(cuf.oA, this.c);
         List<jj<cwb>> $$3 = lq.h.i().filter($$1x -> !((cwb)$$1x.a()).a().isEmpty() && $$0.dQ().K().a($$1x)).collect(Collectors.toList());
         jj<cwb> $$4 = ac.a($$3, $$1);
         cuc $$5 = new cuc(this.a.g(), this.b);
         $$5.b(kn.G, new cwd($$4));
         return new dbd($$2, Optional.of(new dbb(this.f, this.g)), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements cmb.g {
      private final int a;
      private final awm<eiw> b;
      private final String c;
      private final jj<epr> d;
      private final int e;
      private final int f;

      public l(int $$0, awm<eiw> $$1, String $$2, jj<epr> $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public dbd a(bsg $$0, ayo $$1) {
         if (!($$0.dQ() instanceof aqm)) {
            return null;
         } else {
            aqm $$2 = (aqm)$$0.dQ();
            ja $$3 = $$2.a(this.b, $$0.dq(), 100, true);
            if ($$3 != null) {
               cuc $$4 = cuk.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               cuk.a($$2, $$4);
               epw.a($$4, $$3, "+", this.d);
               $$4.b(kn.h, wu.c(this.c));
               return new dbd(new dbb(cuf.oA, this.a), Optional.of(new dbb(cuf.qS)), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static record m(Map<cmc, cmb.g> a) implements cmb.g {
      public static cmb.m a(cmb.g $$0, cmc... $$1) {
         return new cmb.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public dbd a(bsg $$0, ayo $$1) {
         if ($$0 instanceof clz $$2) {
            cmc $$3 = $$2.gz().a();
            cmb.g $$4 = this.a.get($$3);
            return $$4 == null ? null : $$4.a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
