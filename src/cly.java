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

public class cly {
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
   public static final Map<clx, Int2ObjectMap<cly.g[]>> a = ac.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            clx.g,
            a(
               ImmutableMap.of(
                  1,
                  new cly.g[]{
                     new cly.b(cud.pw, 20, 16, 2),
                     new cly.b(cud.ug, 26, 16, 2),
                     new cly.b(cud.uf, 22, 16, 2),
                     new cly.b(cud.vk, 15, 16, 2),
                     new cly.i(cud.px, 1, 6, 16, 1)
                  },
                  2,
                  new cly.g[]{new cly.b(dfh.eZ, 6, 12, 10), new cly.i(cud.ut, 1, 4, 5), new cly.i(cud.ot, 1, 4, 16, 5)},
                  3,
                  new cly.g[]{new cly.i(cud.rS, 3, 18, 10), new cly.b(dfh.fa, 4, 12, 20)},
                  4,
                  new cly.g[]{
                     new cly.i(dfh.eg, 1, 1, 12, 15),
                     new cly.j(brn.p, 100, 15),
                     new cly.j(brn.h, 160, 15),
                     new cly.j(brn.r, 140, 15),
                     new cly.j(brn.o, 120, 15),
                     new cly.j(brn.s, 280, 15),
                     new cly.j(brn.w, 7, 15)
                  },
                  5,
                  new cly.g[]{new cly.i(cud.uk, 3, 3, 30), new cly.i(cud.st, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            clx.h,
            a(
               ImmutableMap.of(
                  1,
                  new cly.g[]{
                     new cly.b(cud.ps, 20, 16, 2),
                     new cly.b(cud.ow, 10, 16, 2),
                     new cly.h(cud.qZ, 6, 1, cud.rd, 6, 16, 1, 0.05F),
                     new cly.i(cud.qH, 3, 1, 16, 1)
                  },
                  2,
                  new cly.g[]{new cly.b(cud.qZ, 15, 16, 10), new cly.h(cud.ra, 6, 1, cud.re, 6, 16, 5, 0.05F), new cly.i(cud.ww, 2, 1, 5)},
                  3,
                  new cly.g[]{new cly.b(cud.ra, 13, 16, 20), new cly.e(cud.qV, 3, 3, 10, 0.2F)},
                  4,
                  new cly.g[]{new cly.b(cud.rb, 6, 12, 30)},
                  5,
                  new cly.g[]{
                     new cly.b(cud.rc, 4, 12, 30),
                     new cly.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(clz.c, cud.nU)
                           .put(clz.g, cud.nW)
                           .put(clz.e, cud.nW)
                           .put(clz.a, cud.oa)
                           .put(clz.b, cud.oa)
                           .put(clz.d, cud.oc)
                           .put(clz.f, cud.og)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            clx.n,
            a(
               ImmutableMap.of(
                  1,
                  new cly.g[]{
                     new cly.b(dfh.bA, 18, 16, 2),
                     new cly.b(dfh.bM, 18, 16, 2),
                     new cly.b(dfh.bP, 18, 16, 2),
                     new cly.b(dfh.bH, 18, 16, 2),
                     new cly.i(cud.rV, 2, 1, 1)
                  },
                  2,
                  new cly.g[]{
                     new cly.b(cud.ri, 12, 16, 10),
                     new cly.b(cud.rp, 12, 16, 10),
                     new cly.b(cud.rx, 12, 16, 10),
                     new cly.b(cud.rl, 12, 16, 10),
                     new cly.b(cud.rn, 12, 16, 10),
                     new cly.i(dfh.bA, 1, 1, 16, 5),
                     new cly.i(dfh.bB, 1, 1, 16, 5),
                     new cly.i(dfh.bC, 1, 1, 16, 5),
                     new cly.i(dfh.bD, 1, 1, 16, 5),
                     new cly.i(dfh.bE, 1, 1, 16, 5),
                     new cly.i(dfh.bF, 1, 1, 16, 5),
                     new cly.i(dfh.bG, 1, 1, 16, 5),
                     new cly.i(dfh.bH, 1, 1, 16, 5),
                     new cly.i(dfh.bI, 1, 1, 16, 5),
                     new cly.i(dfh.bJ, 1, 1, 16, 5),
                     new cly.i(dfh.bK, 1, 1, 16, 5),
                     new cly.i(dfh.bL, 1, 1, 16, 5),
                     new cly.i(dfh.bM, 1, 1, 16, 5),
                     new cly.i(dfh.bN, 1, 1, 16, 5),
                     new cly.i(dfh.bO, 1, 1, 16, 5),
                     new cly.i(dfh.bP, 1, 1, 16, 5),
                     new cly.i(dfh.ik, 1, 4, 16, 5),
                     new cly.i(dfh.il, 1, 4, 16, 5),
                     new cly.i(dfh.im, 1, 4, 16, 5),
                     new cly.i(dfh.in, 1, 4, 16, 5),
                     new cly.i(dfh.io, 1, 4, 16, 5),
                     new cly.i(dfh.ip, 1, 4, 16, 5),
                     new cly.i(dfh.iq, 1, 4, 16, 5),
                     new cly.i(dfh.ir, 1, 4, 16, 5),
                     new cly.i(dfh.is, 1, 4, 16, 5),
                     new cly.i(dfh.it, 1, 4, 16, 5),
                     new cly.i(dfh.iu, 1, 4, 16, 5),
                     new cly.i(dfh.iv, 1, 4, 16, 5),
                     new cly.i(dfh.iw, 1, 4, 16, 5),
                     new cly.i(dfh.ix, 1, 4, 16, 5),
                     new cly.i(dfh.iy, 1, 4, 16, 5),
                     new cly.i(dfh.iz, 1, 4, 16, 5)
                  },
                  3,
                  new cly.g[]{
                     new cly.b(cud.rm, 12, 16, 20),
                     new cly.b(cud.rq, 12, 16, 20),
                     new cly.b(cud.rj, 12, 16, 20),
                     new cly.b(cud.rw, 12, 16, 20),
                     new cly.b(cud.ro, 12, 16, 20),
                     new cly.i(dfh.aZ, 3, 1, 12, 10),
                     new cly.i(dfh.bd, 3, 1, 12, 10),
                     new cly.i(dfh.bn, 3, 1, 12, 10),
                     new cly.i(dfh.bo, 3, 1, 12, 10),
                     new cly.i(dfh.bk, 3, 1, 12, 10),
                     new cly.i(dfh.bl, 3, 1, 12, 10),
                     new cly.i(dfh.bi, 3, 1, 12, 10),
                     new cly.i(dfh.bg, 3, 1, 12, 10),
                     new cly.i(dfh.bm, 3, 1, 12, 10),
                     new cly.i(dfh.bc, 3, 1, 12, 10),
                     new cly.i(dfh.bh, 3, 1, 12, 10),
                     new cly.i(dfh.be, 3, 1, 12, 10),
                     new cly.i(dfh.bb, 3, 1, 12, 10),
                     new cly.i(dfh.ba, 3, 1, 12, 10),
                     new cly.i(dfh.bf, 3, 1, 12, 10),
                     new cly.i(dfh.bj, 3, 1, 12, 10)
                  },
                  4,
                  new cly.g[]{
                     new cly.b(cud.ru, 12, 16, 30),
                     new cly.b(cud.rs, 12, 16, 30),
                     new cly.b(cud.rt, 12, 16, 30),
                     new cly.b(cud.rv, 12, 16, 30),
                     new cly.b(cud.rk, 12, 16, 30),
                     new cly.b(cud.rr, 12, 16, 30),
                     new cly.i(cud.uP, 3, 1, 12, 15),
                     new cly.i(cud.va, 3, 1, 12, 15),
                     new cly.i(cud.uS, 3, 1, 12, 15),
                     new cly.i(cud.vd, 3, 1, 12, 15),
                     new cly.i(cud.uV, 3, 1, 12, 15),
                     new cly.i(cud.vc, 3, 1, 12, 15),
                     new cly.i(cud.uU, 3, 1, 12, 15),
                     new cly.i(cud.uW, 3, 1, 12, 15),
                     new cly.i(cud.ve, 3, 1, 12, 15),
                     new cly.i(cud.uZ, 3, 1, 12, 15),
                     new cly.i(cud.uR, 3, 1, 12, 15),
                     new cly.i(cud.uY, 3, 1, 12, 15),
                     new cly.i(cud.vb, 3, 1, 12, 15),
                     new cly.i(cud.uT, 3, 1, 12, 15),
                     new cly.i(cud.uQ, 3, 1, 12, 15),
                     new cly.i(cud.uX, 3, 1, 12, 15)
                  },
                  5,
                  new cly.g[]{new cly.i(cud.pZ, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            clx.i,
            a(
               ImmutableMap.of(
                  1,
                  new cly.g[]{new cly.b(cud.pp, 32, 16, 2), new cly.i(cud.ov, 1, 16, 1), new cly.h(dfh.L, 10, 1, cud.pW, 10, 12, 1, 0.05F)},
                  2,
                  new cly.g[]{new cly.b(cud.pW, 26, 12, 10), new cly.i(cud.ou, 2, 1, 5)},
                  3,
                  new cly.g[]{new cly.b(cud.ps, 14, 16, 20), new cly.i(cud.vW, 3, 1, 10)},
                  4,
                  new cly.g[]{new cly.b(cud.pt, 24, 16, 30), new cly.e(cud.ou, 2, 3, 15)},
                  5,
                  new cly.g[]{new cly.b(cud.mb, 8, 12, 30), new cly.e(cud.vW, 3, 3, 15), new cly.k(cud.ov, 5, cud.vq, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            clx.k,
            a(
               ImmutableMap.builder()
                  .put(1, new cly.g[]{new cly.b(cud.qO, 24, 16, 2), new cly.d(1, avx.i), new cly.i(dfh.cl, 9, 1, 12, 1)})
                  .put(2, new cly.g[]{new cly.b(cud.qP, 4, 12, 10), new cly.d(5, avx.i), new cly.i(cud.ws, 1, 1, 5)})
                  .put(3, new cly.g[]{new cly.b(cud.rf, 5, 12, 20), new cly.d(10, avx.i), new cly.i(cud.cG, 1, 4, 10)})
                  .put(4, new cly.g[]{new cly.b(cud.tZ, 2, 12, 30), new cly.d(15, avx.i), new cly.i(cud.qW, 5, 1, 15), new cly.i(cud.qS, 4, 1, 15)})
                  .put(5, new cly.g[]{new cly.i(cud.uL, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            clx.e,
            a(
               ImmutableMap.of(
                  1,
                  new cly.g[]{new cly.b(cud.qO, 24, 16, 2), new cly.i(cud.uj, 7, 1, 1)},
                  2,
                  new cly.g[]{new cly.b(cud.fT, 11, 16, 10), new cly.l(13, awg.d, "filled_map.monument", epm.j, 12, 5)},
                  3,
                  new cly.g[]{
                     new cly.b(cud.qS, 1, 12, 20),
                     new cly.l(14, awg.c, "filled_map.mansion", epm.i, 12, 10),
                     new cly.l(12, awg.m, "filled_map.trial_chambers", epm.I, 12, 10)
                  },
                  4,
                  new cly.g[]{
                     new cly.i(cud.uc, 7, 1, 15),
                     new cly.i(cud.uP, 3, 1, 15),
                     new cly.i(cud.va, 3, 1, 15),
                     new cly.i(cud.uS, 3, 1, 15),
                     new cly.i(cud.vd, 3, 1, 15),
                     new cly.i(cud.uV, 3, 1, 15),
                     new cly.i(cud.vc, 3, 1, 15),
                     new cly.i(cud.uU, 3, 1, 15),
                     new cly.i(cud.uW, 3, 1, 15),
                     new cly.i(cud.ve, 3, 1, 15),
                     new cly.i(cud.uZ, 3, 1, 15),
                     new cly.i(cud.uR, 3, 1, 15),
                     new cly.i(cud.uY, 3, 1, 15),
                     new cly.i(cud.vb, 3, 1, 15),
                     new cly.i(cud.uT, 3, 1, 15),
                     new cly.i(cud.uQ, 3, 1, 15),
                     new cly.i(cud.uX, 3, 1, 15)
                  },
                  5,
                  new cly.g[]{new cly.i(cud.wd, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            clx.f,
            a(
               ImmutableMap.of(
                  1,
                  new cly.g[]{new cly.b(cud.se, 32, 16, 2), new cly.i(cud.lH, 1, 2, 1)},
                  2,
                  new cly.g[]{new cly.b(cud.oI, 3, 12, 10), new cly.i(cud.oA, 1, 1, 5)},
                  3,
                  new cly.g[]{new cly.b(cud.uD, 2, 12, 20), new cly.i(dfh.ec, 4, 1, 12, 10)},
                  4,
                  new cly.g[]{new cly.b(cud.op, 4, 12, 30), new cly.b(cud.sl, 9, 12, 30), new cly.i(cud.sf, 5, 1, 15)},
                  5,
                  new cly.g[]{new cly.b(cud.sj, 22, 12, 30), new cly.i(cud.tW, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            clx.c,
            a(
               ImmutableMap.of(
                  1,
                  new cly.g[]{
                     new cly.b(cud.ow, 15, 16, 2),
                     new cly.i(new cua(cud.pI), 7, 1, 12, 1, 0.2F),
                     new cly.i(new cua(cud.pJ), 4, 1, 12, 1, 0.2F),
                     new cly.i(new cua(cud.pG), 5, 1, 12, 1, 0.2F),
                     new cly.i(new cua(cud.pH), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cly.g[]{
                     new cly.b(cud.oE, 4, 12, 10),
                     new cly.i(new cua(cud.wr), 36, 1, 12, 5, 0.2F),
                     new cly.i(new cua(cud.pF), 1, 1, 12, 5, 0.2F),
                     new cly.i(new cua(cud.pE), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new cly.g[]{
                     new cly.b(cud.qA, 1, 12, 20),
                     new cly.b(cud.oy, 1, 12, 20),
                     new cly.i(new cua(cud.pC), 1, 1, 12, 10, 0.2F),
                     new cly.i(new cua(cud.pD), 4, 1, 12, 10, 0.2F),
                     new cly.i(new cua(cud.vs), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new cly.g[]{new cly.e(cud.pM, 14, 3, 15, 0.2F), new cly.e(cud.pN, 8, 3, 15, 0.2F)},
                  5,
                  new cly.g[]{new cly.e(cud.pK, 8, 3, 30, 0.2F), new cly.e(cud.pL, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            clx.p,
            a(
               ImmutableMap.of(
                  1,
                  new cly.g[]{new cly.b(cud.ow, 15, 16, 2), new cly.i(new cua(cud.pd), 3, 1, 12, 1, 0.2F), new cly.e(cud.pa, 2, 3, 1)},
                  2,
                  new cly.g[]{new cly.b(cud.oE, 4, 12, 10), new cly.i(new cua(cud.wr), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cly.g[]{new cly.b(cud.pW, 24, 12, 20)},
                  4,
                  new cly.g[]{new cly.b(cud.oy, 1, 12, 30), new cly.e(cud.pi, 12, 3, 15, 0.2F)},
                  5,
                  new cly.g[]{new cly.e(cud.pf, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            clx.o,
            a(
               ImmutableMap.of(
                  1,
                  new cly.g[]{
                     new cly.b(cud.ow, 15, 16, 2),
                     new cly.i(new cua(cud.oT), 1, 1, 12, 1, 0.2F),
                     new cly.i(new cua(cud.oR), 1, 1, 12, 1, 0.2F),
                     new cly.i(new cua(cud.oS), 1, 1, 12, 1, 0.2F),
                     new cly.i(new cua(cud.oU), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cly.g[]{new cly.b(cud.oE, 4, 12, 10), new cly.i(new cua(cud.wr), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cly.g[]{
                     new cly.b(cud.pW, 30, 12, 20),
                     new cly.e(cud.pd, 1, 3, 10, 0.2F),
                     new cly.e(cud.pb, 2, 3, 10, 0.2F),
                     new cly.e(cud.pc, 3, 3, 10, 0.2F),
                     new cly.i(new cua(cud.pj), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new cly.g[]{new cly.b(cud.oy, 1, 12, 30), new cly.e(cud.pi, 12, 3, 15, 0.2F), new cly.e(cud.pg, 5, 3, 15, 0.2F)},
                  5,
                  new cly.g[]{new cly.e(cud.ph, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            clx.d,
            a(
               ImmutableMap.of(
                  1,
                  new cly.g[]{new cly.b(cud.sc, 14, 16, 2), new cly.b(cud.pX, 7, 16, 2), new cly.b(cud.uA, 4, 16, 2), new cly.i(cud.uC, 1, 1, 1)},
                  2,
                  new cly.g[]{new cly.b(cud.ow, 15, 16, 2), new cly.i(cud.pY, 1, 5, 16, 5), new cly.i(cud.sd, 1, 8, 16, 5)},
                  3,
                  new cly.g[]{new cly.b(cud.uN, 7, 16, 20), new cly.b(cud.sa, 10, 16, 20)},
                  4,
                  new cly.g[]{new cly.b(cud.qN, 10, 12, 30)},
                  5,
                  new cly.g[]{new cly.b(cud.wu, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            clx.j,
            a(
               ImmutableMap.of(
                  1,
                  new cly.g[]{new cly.b(cud.qD, 6, 16, 2), new cly.a(cud.pA, 3), new cly.a(cud.pz, 7)},
                  2,
                  new cly.g[]{new cly.b(cud.pW, 26, 12, 10), new cly.a(cud.py, 5, 12, 5), new cly.a(cud.pB, 4, 12, 5)},
                  3,
                  new cly.g[]{new cly.b(cud.uE, 9, 12, 20), new cly.a(cud.pz, 7)},
                  4,
                  new cly.g[]{new cly.b(cud.op, 4, 12, 30), new cly.a(cud.uJ, 6, 12, 15)},
                  5,
                  new cly.g[]{new cly.i(new cua(cud.nL), 6, 1, 12, 30, 0.2F), new cly.a(cud.py, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            clx.l,
            a(
               ImmutableMap.of(
                  1,
                  new cly.g[]{new cly.b(cud.qM, 10, 16, 2), new cly.i(cud.qL, 1, 10, 16, 1)},
                  2,
                  new cly.g[]{new cly.b(dfh.b, 20, 16, 10), new cly.i(dfh.eK, 1, 4, 16, 5)},
                  3,
                  new cly.g[]{
                     new cly.b(dfh.c, 16, 16, 20),
                     new cly.b(dfh.g, 16, 16, 20),
                     new cly.b(dfh.e, 16, 16, 20),
                     new cly.i(dfh.su, 1, 4, 16, 10),
                     new cly.i(dfh.h, 1, 4, 16, 10),
                     new cly.i(dfh.f, 1, 4, 16, 10),
                     new cly.i(dfh.d, 1, 4, 16, 10)
                  },
                  4,
                  new cly.g[]{
                     new cly.b(cud.oB, 12, 12, 30),
                     new cly.i(dfh.hk, 1, 1, 12, 15),
                     new cly.i(dfh.hj, 1, 1, 12, 15),
                     new cly.i(dfh.hu, 1, 1, 12, 15),
                     new cly.i(dfh.hm, 1, 1, 12, 15),
                     new cly.i(dfh.hq, 1, 1, 12, 15),
                     new cly.i(dfh.hr, 1, 1, 12, 15),
                     new cly.i(dfh.hy, 1, 1, 12, 15),
                     new cly.i(dfh.hx, 1, 1, 12, 15),
                     new cly.i(dfh.hp, 1, 1, 12, 15),
                     new cly.i(dfh.hl, 1, 1, 12, 15),
                     new cly.i(dfh.ho, 1, 1, 12, 15),
                     new cly.i(dfh.hw, 1, 1, 12, 15),
                     new cly.i(dfh.hs, 1, 1, 12, 15),
                     new cly.i(dfh.ht, 1, 1, 12, 15),
                     new cly.i(dfh.hn, 1, 1, 12, 15),
                     new cly.i(dfh.hv, 1, 1, 12, 15),
                     new cly.i(dfh.lh, 1, 1, 12, 15),
                     new cly.i(dfh.lg, 1, 1, 12, 15),
                     new cly.i(dfh.lr, 1, 1, 12, 15),
                     new cly.i(dfh.lj, 1, 1, 12, 15),
                     new cly.i(dfh.ln, 1, 1, 12, 15),
                     new cly.i(dfh.lo, 1, 1, 12, 15),
                     new cly.i(dfh.lv, 1, 1, 12, 15),
                     new cly.i(dfh.lu, 1, 1, 12, 15),
                     new cly.i(dfh.lm, 1, 1, 12, 15),
                     new cly.i(dfh.li, 1, 1, 12, 15),
                     new cly.i(dfh.ll, 1, 1, 12, 15),
                     new cly.i(dfh.lt, 1, 1, 12, 15),
                     new cly.i(dfh.lp, 1, 1, 12, 15),
                     new cly.i(dfh.lq, 1, 1, 12, 15),
                     new cly.i(dfh.lk, 1, 1, 12, 15),
                     new cly.i(dfh.ls, 1, 1, 12, 15)
                  },
                  5,
                  new cly.g[]{new cly.i(dfh.hf, 1, 1, 12, 30), new cly.i(dfh.hd, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<cly.g[]> b = a(
      ImmutableMap.of(
         1,
         new cly.g[]{
            new cly.i(cud.cT, 2, 1, 5, 1),
            new cly.i(cud.qQ, 4, 1, 5, 1),
            new cly.i(cud.fu, 2, 1, 5, 1),
            new cly.i(cud.vU, 5, 1, 5, 1),
            new cly.i(cud.cO, 1, 1, 12, 1),
            new cly.i(cud.dJ, 1, 1, 8, 1),
            new cly.i(cud.fk, 1, 1, 4, 1),
            new cly.i(cud.dK, 3, 1, 12, 1),
            new cly.i(cud.eW, 3, 1, 8, 1),
            new cly.i(cud.dk, 1, 1, 12, 1),
            new cly.i(cud.dl, 1, 1, 12, 1),
            new cly.i(cud.dm, 1, 1, 8, 1),
            new cly.i(cud.dn, 1, 1, 12, 1),
            new cly.i(cud.do, 1, 1, 12, 1),
            new cly.i(cud.dp, 1, 1, 12, 1),
            new cly.i(cud.dq, 1, 1, 12, 1),
            new cly.i(cud.dr, 1, 1, 12, 1),
            new cly.i(cud.ds, 1, 1, 12, 1),
            new cly.i(cud.dt, 1, 1, 12, 1),
            new cly.i(cud.du, 1, 1, 12, 1),
            new cly.i(cud.dv, 1, 1, 7, 1),
            new cly.i(cud.pv, 1, 1, 12, 1),
            new cly.i(cud.vl, 1, 1, 12, 1),
            new cly.i(cud.rY, 1, 1, 12, 1),
            new cly.i(cud.rZ, 1, 1, 12, 1),
            new cly.i(cud.aa, 5, 1, 8, 1),
            new cly.i(cud.Y, 5, 1, 8, 1),
            new cly.i(cud.ac, 5, 1, 8, 1),
            new cly.i(cud.Z, 5, 1, 8, 1),
            new cly.i(cud.W, 5, 1, 8, 1),
            new cly.i(cud.X, 5, 1, 8, 1),
            new cly.i(cud.ab, 5, 1, 8, 1),
            new cly.i(cud.ad, 5, 1, 8, 1),
            new cly.i(cud.rw, 1, 3, 12, 1),
            new cly.i(cud.ri, 1, 3, 12, 1),
            new cly.i(cud.rt, 1, 3, 12, 1),
            new cly.i(cud.ro, 1, 3, 12, 1),
            new cly.i(cud.rx, 1, 3, 12, 1),
            new cly.i(cud.rv, 1, 3, 12, 1),
            new cly.i(cud.rq, 1, 3, 12, 1),
            new cly.i(cud.rk, 1, 3, 12, 1),
            new cly.i(cud.rm, 1, 3, 12, 1),
            new cly.i(cud.rp, 1, 3, 12, 1),
            new cly.i(cud.rs, 1, 3, 12, 1),
            new cly.i(cud.rl, 1, 3, 12, 1),
            new cly.i(cud.rn, 1, 3, 12, 1),
            new cly.i(cud.rj, 1, 3, 12, 1),
            new cly.i(cud.ru, 1, 3, 12, 1),
            new cly.i(cud.rr, 1, 3, 12, 1),
            new cly.i(cud.kx, 3, 1, 8, 1),
            new cly.i(cud.ky, 3, 1, 8, 1),
            new cly.i(cud.kz, 3, 1, 8, 1),
            new cly.i(cud.kA, 3, 1, 8, 1),
            new cly.i(cud.kw, 3, 1, 8, 1),
            new cly.i(cud.fV, 1, 1, 12, 1),
            new cly.i(cud.dA, 1, 1, 12, 1),
            new cly.i(cud.dB, 1, 1, 12, 1),
            new cly.i(cud.gb, 1, 2, 5, 1),
            new cly.i(cud.dQ, 1, 2, 5, 1),
            new cly.i(cud.af, 1, 8, 8, 1),
            new cly.i(cud.ai, 1, 4, 6, 1),
            new cly.i(cud.xo, 1, 2, 5, 1),
            new cly.i(cud.F, 1, 2, 5, 1),
            new cly.i(cud.dN, 1, 2, 5, 1)
         },
         2,
         new cly.g[]{
            new cly.i(cud.qI, 5, 1, 4, 1),
            new cly.i(cud.qF, 5, 1, 4, 1),
            new cly.i(cud.hV, 3, 1, 6, 1),
            new cly.i(cud.kV, 6, 1, 6, 1),
            new cly.i(cud.pu, 1, 1, 8, 1),
            new cly.i(cud.E, 3, 3, 6, 1)
         }
      )
   );
   private static final cly.l s = new cly.l(8, awg.f, "filled_map.village_desert", epm.B, 12, 5);
   private static final cly.l t = new cly.l(8, awg.e, "filled_map.village_savanna", epm.D, 12, 5);
   private static final cly.l u = new cly.l(8, awg.g, "filled_map.village_plains", epm.C, 12, 5);
   private static final cly.l v = new cly.l(8, awg.h, "filled_map.village_taiga", epm.F, 12, 5);
   private static final cly.l w = new cly.l(8, awg.i, "filled_map.village_snowy", epm.E, 12, 5);
   private static final cly.l x = new cly.l(8, awg.j, "filled_map.explorer_jungle", epm.G, 12, 5);
   private static final cly.l y = new cly.l(8, awg.k, "filled_map.explorer_swamp", epm.H, 12, 5);
   public static final Map<clx, Int2ObjectMap<cly.g[]>> c = Map.of(
      clx.k,
      a(
         ImmutableMap.builder()
            .put(1, new cly.g[]{new cly.b(cud.qO, 24, 16, 2), a(1), new cly.i(dfh.cl, 9, 1, 12, 1)})
            .put(2, new cly.g[]{new cly.b(cud.qP, 4, 12, 10), a(5), new cly.i(cud.ws, 1, 1, 5)})
            .put(3, new cly.g[]{new cly.b(cud.rf, 5, 12, 20), a(10), new cly.i(cud.cG, 1, 4, 10)})
            .put(4, new cly.g[]{new cly.b(cud.tZ, 2, 12, 30), new cly.i(cud.qW, 5, 1, 15), new cly.i(cud.qS, 4, 1, 15)})
            .put(5, new cly.g[]{a(), new cly.i(cud.uL, 20, 1, 30)})
            .build()
      ),
      clx.c,
      a(
         ImmutableMap.builder()
            .put(1, new cly.g[]{new cly.b(cud.ow, 15, 12, 2), new cly.b(cud.oE, 5, 12, 2)})
            .put(
               2,
               new cly.g[]{
                  cly.m.a(new cly.i(cud.pJ, 4, 1, 12, 5, 0.05F), clz.a, clz.c, clz.d, clz.e, clz.g),
                  cly.m.a(new cly.i(cud.pF, 4, 1, 12, 5, 0.05F), clz.b, clz.f),
                  cly.m.a(new cly.i(cud.pG, 5, 1, 12, 5, 0.05F), clz.a, clz.c, clz.d, clz.e, clz.g),
                  cly.m.a(new cly.i(cud.pC, 5, 1, 12, 5, 0.05F), clz.b, clz.f),
                  cly.m.a(new cly.i(cud.pI, 7, 1, 12, 5, 0.05F), clz.a, clz.c, clz.d, clz.e, clz.g),
                  cly.m.a(new cly.i(cud.pE, 7, 1, 12, 5, 0.05F), clz.b, clz.f),
                  cly.m.a(new cly.i(cud.pH, 9, 1, 12, 5, 0.05F), clz.a, clz.c, clz.d, clz.e, clz.g),
                  cly.m.a(new cly.i(cud.pD, 9, 1, 12, 5, 0.05F), clz.b, clz.f)
               }
            )
            .put(3, new cly.g[]{new cly.b(cud.qA, 1, 12, 20), new cly.i(cud.vs, 5, 1, 12, 10, 0.05F), new cly.i(cud.wr, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new cly.g[]{
                  cly.m.a(new cly.i(cud.pJ, 8, 1, 3, 15, 0.05F, dav.a), clz.a),
                  cly.m.a(new cly.i(cud.pG, 9, 1, 3, 15, 0.05F, dav.d), clz.a),
                  cly.m.a(new cly.i(cud.pI, 11, 1, 3, 15, 0.05F, dav.b), clz.a),
                  cly.m.a(new cly.i(cud.pH, 13, 1, 3, 15, 0.05F, dav.c), clz.a),
                  cly.m.a(new cly.i(cud.pJ, 8, 1, 3, 15, 0.05F, dav.g), clz.c),
                  cly.m.a(new cly.i(cud.pG, 9, 1, 3, 15, 0.05F, dav.j), clz.c),
                  cly.m.a(new cly.i(cud.pI, 11, 1, 3, 15, 0.05F, dav.h), clz.c),
                  cly.m.a(new cly.i(cud.pH, 13, 1, 3, 15, 0.05F, dav.i), clz.c),
                  cly.m.a(new cly.i(cud.pJ, 2, 1, 3, 15, 0.05F, dav.m), clz.d),
                  cly.m.a(new cly.i(cud.pG, 3, 1, 3, 15, 0.05F, dav.p), clz.d),
                  cly.m.a(new cly.i(cud.pI, 5, 1, 3, 15, 0.05F, dav.n), clz.d),
                  cly.m.a(new cly.i(cud.pH, 7, 1, 3, 15, 0.05F, dav.o), clz.d),
                  cly.m.a(new cly.i(cud.pJ, 8, 1, 3, 15, 0.05F, dav.s), clz.e),
                  cly.m.a(new cly.i(cud.pG, 9, 1, 3, 15, 0.05F, dav.t), clz.e),
                  cly.m.a(new cly.i(cud.pF, 8, 1, 3, 15, 0.05F, dav.w), clz.b),
                  cly.m.a(new cly.i(cud.pC, 9, 1, 3, 15, 0.05F, dav.z), clz.b),
                  cly.m.a(new cly.i(cud.pE, 11, 1, 3, 15, 0.05F, dav.x), clz.b),
                  cly.m.a(new cly.i(cud.pD, 13, 1, 3, 15, 0.05F, dav.y), clz.b),
                  cly.m.a(new cly.i(cud.pF, 8, 1, 3, 15, 0.05F, dav.C), clz.f),
                  cly.m.a(new cly.i(cud.pC, 9, 1, 3, 15, 0.05F, dav.F), clz.f),
                  cly.m.a(new cly.i(cud.pE, 11, 1, 3, 15, 0.05F, dav.D), clz.f),
                  cly.m.a(new cly.i(cud.pD, 13, 1, 3, 15, 0.05F, dav.E), clz.f),
                  cly.m.a(new cly.h(cud.pN, 1, 4, cud.pM, 1, 3, 15, 0.05F), clz.g),
                  cly.m.a(new cly.h(cud.pM, 1, 4, cud.pL, 1, 3, 15, 0.05F), clz.g),
                  cly.m.a(new cly.h(cud.pK, 1, 4, cud.pN, 1, 3, 15, 0.05F), clz.g),
                  cly.m.a(new cly.h(cud.pL, 1, 2, cud.pK, 1, 3, 15, 0.05F), clz.g)
               }
            )
            .put(
               5,
               new cly.g[]{
                  cly.m.a(new cly.h(cud.oy, 4, 16, cud.pL, 1, 3, 30, 0.05F, dav.f), clz.a),
                  cly.m.a(new cly.h(cud.oy, 3, 16, cud.pM, 1, 3, 30, 0.05F, dav.e), clz.a),
                  cly.m.a(new cly.h(cud.oy, 3, 16, cud.pM, 1, 3, 30, 0.05F, dav.l), clz.c),
                  cly.m.a(new cly.h(cud.oy, 2, 12, cud.pN, 1, 3, 30, 0.05F, dav.k), clz.c),
                  cly.m.a(new cly.h(cud.oy, 2, 6, cud.pK, 1, 3, 30, 0.05F, dav.r), clz.d),
                  cly.m.a(new cly.h(cud.oy, 3, 8, cud.pL, 1, 3, 30, 0.05F, dav.q), clz.d),
                  cly.m.a(new cly.h(cud.oy, 2, 12, cud.pN, 1, 3, 30, 0.05F, dav.u), clz.e),
                  cly.m.a(new cly.h(cud.oy, 3, 12, cud.pK, 1, 3, 30, 0.05F, dav.v), clz.e),
                  cly.m.a(new cly.i(cud.pC, 9, 1, 3, 30, 0.05F, dav.B), clz.b),
                  cly.m.a(new cly.i(cud.pF, 8, 1, 3, 30, 0.05F, dav.A), clz.b),
                  cly.m.a(new cly.i(cud.pC, 9, 1, 3, 30, 0.05F, dav.H), clz.f),
                  cly.m.a(new cly.i(cud.pF, 8, 1, 3, 30, 0.05F, dav.G), clz.f),
                  cly.m.a(new cly.h(cud.oy, 4, 18, cud.pL, 1, 3, 30, 0.05F, dav.J), clz.g),
                  cly.m.a(new cly.h(cud.oy, 3, 18, cud.pM, 1, 3, 30, 0.05F, dav.I), clz.g),
                  cly.m.a(new cly.b(cud.aN, 1, 12, 30, 42), clz.g),
                  cly.m.a(new cly.b(cud.aK, 1, 12, 30, 4), clz.a, clz.b, clz.c, clz.d, clz.e, clz.f)
               }
            )
            .build()
      ),
      clx.e,
      a(
         ImmutableMap.of(
            1,
            new cly.g[]{new cly.b(cud.qO, 24, 16, 2), new cly.i(cud.uj, 7, 1, 1)},
            2,
            new cly.g[]{
               new cly.b(cud.fT, 11, 16, 10),
               new cly.m(ImmutableMap.builder().put(clz.a, t).put(clz.d, u).put(clz.c, v).put(clz.g, w).put(clz.e, u).put(clz.b, t).put(clz.f, w).build()),
               new cly.m(ImmutableMap.builder().put(clz.a, u).put(clz.d, s).put(clz.c, t).put(clz.g, u).put(clz.e, v).put(clz.b, s).put(clz.f, v).build()),
               new cly.m(
                  ImmutableMap.builder().put(clz.a, x).put(clz.d, x).put(clz.c, new cly.f()).put(clz.g, y).put(clz.e, y).put(clz.b, y).put(clz.f, x).build()
               )
            },
            3,
            new cly.g[]{
               new cly.b(cud.qS, 1, 12, 20),
               new cly.l(13, awg.d, "filled_map.monument", epm.j, 12, 10),
               new cly.l(12, awg.m, "filled_map.trial_chambers", epm.I, 12, 10)
            },
            4,
            new cly.g[]{
               new cly.i(cud.uc, 7, 1, 15),
               new cly.i(cud.uP, 3, 1, 15),
               new cly.i(cud.va, 3, 1, 15),
               new cly.i(cud.uS, 3, 1, 15),
               new cly.i(cud.vd, 3, 1, 15),
               new cly.i(cud.uV, 3, 1, 15),
               new cly.i(cud.vc, 3, 1, 15),
               new cly.i(cud.uU, 3, 1, 15),
               new cly.i(cud.uW, 3, 1, 15),
               new cly.i(cud.ve, 3, 1, 15),
               new cly.i(cud.uZ, 3, 1, 15),
               new cly.i(cud.uR, 3, 1, 15),
               new cly.i(cud.uY, 3, 1, 15),
               new cly.i(cud.vb, 3, 1, 15),
               new cly.i(cud.uT, 3, 1, 15),
               new cly.i(cud.uQ, 3, 1, 15),
               new cly.i(cud.uX, 3, 1, 15)
            },
            5,
            new cly.g[]{new cly.i(cud.wd, 8, 1, 30), new cly.l(14, awg.c, "filled_map.mansion", epm.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<cly.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new cly.g[]{
               new cly.b(a(cwc.a), 1, 1, 1),
               new cly.b(cud.qz, 1, 1, 1, 2),
               new cly.b(cud.qE, 1, 1, 1, 2),
               new cly.b(cud.sn, 1, 1, 1, 3),
               new cly.b(cud.uh, 4, 1, 1),
               new cly.b(cud.hD, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cly.g[]{
               new cly.i(cud.hV, 1, 1, 6, 1),
               new cly.i(cud.kV, 6, 1, 6, 1),
               new cly.i(cud.pu, 1, 4, 2, 1),
               new cly.i(cud.E, 3, 3, 6, 1),
               new cly.i(dfh.Y, 1, 8, 4, 1),
               new cly.i(dfh.W, 1, 8, 4, 1),
               new cly.i(dfh.aa, 1, 8, 4, 1),
               new cly.i(dfh.X, 1, 8, 4, 1),
               new cly.i(dfh.U, 1, 8, 4, 1),
               new cly.i(dfh.V, 1, 8, 4, 1),
               new cly.i(dfh.Z, 1, 8, 4, 1),
               new cly.e(cud.pc, 1, 1, 1, 0.2F),
               new cly.i(b(cwc.h), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cly.g[]{
               new cly.i(cud.qI, 3, 1, 4, 1),
               new cly.i(cud.qF, 3, 1, 4, 1),
               new cly.i(cud.cT, 2, 1, 5, 1),
               new cly.i(cud.qQ, 4, 1, 5, 1),
               new cly.i(cud.fu, 2, 1, 5, 1),
               new cly.i(cud.vU, 5, 1, 5, 1),
               new cly.i(cud.cO, 1, 1, 12, 1),
               new cly.i(cud.dJ, 1, 1, 8, 1),
               new cly.i(cud.fk, 1, 1, 4, 1),
               new cly.i(cud.dK, 3, 1, 12, 1),
               new cly.i(cud.eW, 3, 1, 8, 1),
               new cly.i(cud.dk, 1, 1, 12, 1),
               new cly.i(cud.dl, 1, 1, 12, 1),
               new cly.i(cud.dm, 1, 1, 8, 1),
               new cly.i(cud.dn, 1, 1, 12, 1),
               new cly.i(cud.do, 1, 1, 12, 1),
               new cly.i(cud.dp, 1, 1, 12, 1),
               new cly.i(cud.dq, 1, 1, 12, 1),
               new cly.i(cud.dr, 1, 1, 12, 1),
               new cly.i(cud.ds, 1, 1, 12, 1),
               new cly.i(cud.dt, 1, 1, 12, 1),
               new cly.i(cud.du, 1, 1, 12, 1),
               new cly.i(cud.dv, 1, 1, 7, 1),
               new cly.i(cud.pv, 1, 1, 12, 1),
               new cly.i(cud.vl, 1, 1, 12, 1),
               new cly.i(cud.rY, 1, 1, 12, 1),
               new cly.i(cud.rZ, 1, 1, 12, 1),
               new cly.i(cud.aa, 5, 1, 8, 1),
               new cly.i(cud.Y, 5, 1, 8, 1),
               new cly.i(cud.ac, 5, 1, 8, 1),
               new cly.i(cud.Z, 5, 1, 8, 1),
               new cly.i(cud.W, 5, 1, 8, 1),
               new cly.i(cud.X, 5, 1, 8, 1),
               new cly.i(cud.ab, 5, 1, 8, 1),
               new cly.i(cud.ad, 5, 1, 8, 1),
               new cly.i(cud.rw, 1, 3, 12, 1),
               new cly.i(cud.ri, 1, 3, 12, 1),
               new cly.i(cud.rt, 1, 3, 12, 1),
               new cly.i(cud.ro, 1, 3, 12, 1),
               new cly.i(cud.rx, 1, 3, 12, 1),
               new cly.i(cud.rv, 1, 3, 12, 1),
               new cly.i(cud.rq, 1, 3, 12, 1),
               new cly.i(cud.rk, 1, 3, 12, 1),
               new cly.i(cud.rm, 1, 3, 12, 1),
               new cly.i(cud.rp, 1, 3, 12, 1),
               new cly.i(cud.rs, 1, 3, 12, 1),
               new cly.i(cud.rl, 1, 3, 12, 1),
               new cly.i(cud.rn, 1, 3, 12, 1),
               new cly.i(cud.rj, 1, 3, 12, 1),
               new cly.i(cud.ru, 1, 3, 12, 1),
               new cly.i(cud.rr, 1, 3, 12, 1),
               new cly.i(cud.kx, 3, 1, 8, 1),
               new cly.i(cud.ky, 3, 1, 8, 1),
               new cly.i(cud.kz, 3, 1, 8, 1),
               new cly.i(cud.kA, 3, 1, 8, 1),
               new cly.i(cud.kw, 3, 1, 8, 1),
               new cly.i(cud.fV, 1, 3, 4, 1),
               new cly.i(cud.dA, 1, 3, 4, 1),
               new cly.i(cud.dB, 1, 3, 4, 1),
               new cly.i(cud.gb, 1, 5, 2, 1),
               new cly.i(cud.dQ, 1, 2, 5, 1),
               new cly.i(cud.af, 1, 8, 8, 1),
               new cly.i(cud.ai, 1, 4, 6, 1),
               new cly.i(cud.xo, 1, 2, 5, 1),
               new cly.i(cud.F, 1, 2, 5, 1),
               new cly.i(cud.dN, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static cly.g a(int $$0) {
      return new cly.m(
         ImmutableMap.builder()
            .put(clz.a, new cly.d($$0, avx.w))
            .put(clz.b, new cly.d($$0, avx.x))
            .put(clz.c, new cly.d($$0, avx.y))
            .put(clz.d, new cly.d($$0, avx.z))
            .put(clz.e, new cly.d($$0, avx.A))
            .put(clz.f, new cly.d($$0, avx.B))
            .put(clz.g, new cly.d($$0, avx.C))
            .build()
      );
   }

   private static cly.g a() {
      return new cly.m(
         ImmutableMap.builder()
            .put(clz.a, new cly.d(30, 3, 3, avx.D))
            .put(clz.b, new cly.d(30, 2, 2, avx.E))
            .put(clz.c, new cly.d(30, 3, 3, avx.F))
            .put(clz.d, new cly.d(30, 3, 3, avx.G))
            .put(clz.e, new cly.d(30, avx.H))
            .put(clz.f, new cly.d(30, avx.I))
            .put(clz.g, new cly.d(30, 2, 2, avx.J))
            .build()
      );
   }

   private static Int2ObjectMap<cly.g[]> a(ImmutableMap<Integer, cly.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static daz a(jj<cvz> $$0) {
      return new daz(cud.sk).a($$1 -> $$1.a(kn.G, new cwb($$0)));
   }

   private static cua b(jj<cvz> $$0) {
      return cwb.a(cud.sk, $$0);
   }

   static class a implements cly.g {
      private final ctv a;
      private final int b;
      private final int c;
      private final int d;

      public a(ctv $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(ctv $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public dbb a(bsd $$0, aym $$1) {
         daz $$2 = new daz(cud.oz, this.b);
         cua $$3 = new cua(this.a);
         if ($$3.a(awd.by)) {
            List<csu> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = cwr.a($$3, $$4);
         }

         return new dbb($$2, $$3, this.c, this.d, 0.2F);
      }

      private static csu a(aym $$0) {
         return csu.a(cst.a($$0.a(16)));
      }
   }

   static class b implements cly.g {
      private final daz a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(dcc $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(dcc $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new daz($$0.r(), $$1), $$2, $$3, $$4);
      }

      public b(daz $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public dbb a(bsd $$0, aym $$1) {
         return new dbb(this.a, new cua(cud.oz, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements cly.g {
      private final Map<clz, ctv> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<clz, ctv> $$3) {
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
      public dbb a(bsd $$0, aym $$1) {
         if ($$0 instanceof clw $$2) {
            daz $$3 = new daz(this.a.get($$2.gy().a()), this.b);
            return new dbb($$3, new cua(cud.oz), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements cly.g {
      private final int a;
      private final awk<czj> b;
      private final int c;
      private final int d;

      public d(int $$0, awk<czj> $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, awk<czj> $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = $$3;
      }

      @Override
      public dbb a(bsd $$0, aym $$1) {
         Optional<jj<czj>> $$2 = $$0.dP().H_().d(lr.aK).a(this.b, $$1);
         int $$9;
         cua $$8;
         if (!$$2.isEmpty()) {
            jj<czj> $$3 = $$2.get();
            czj $$4 = $$3.a();
            int $$5 = Math.max($$4.d(), this.c);
            int $$6 = Math.min($$4.e(), this.d);
            int $$7 = aye.a($$1, $$5, $$6);
            $$8 = csy.a(new czm($$3, $$7));
            $$9 = 2 + $$1.a(5 + $$7 * 10) + 3 * $$7;
            if ($$3.a(avx.j)) {
               $$9 *= 2;
            }

            if ($$9 > 64) {
               $$9 = 64;
            }
         } else {
            $$9 = 1;
            $$8 = new cua(cud.qP);
         }

         return new dbb(new daz(cud.oz, $$9), Optional.of(new daz(cud.qP)), $$8, 12, this.a, 0.2F);
      }
   }

   static class e implements cly.g {
      private final cua a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(ctv $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(ctv $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new cua($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public dbb a(bsd $$0, aym $$1) {
         int $$2 = 5 + $$1.a(15);
         jx $$3 = $$0.dP().H_();
         Optional<jn.c<czj>> $$4 = $$3.d(lr.aK).b(avx.m);
         cua $$5 = czl.a($$1, new cua(this.a.g()), $$2, $$3, $$4);
         int $$6 = Math.min(this.b + $$2, 64);
         daz $$7 = new daz(cud.oz, $$6);
         return new dbb($$7, $$5, this.c, this.d, this.e);
      }
   }

   static class f implements cly.g {
      @Override
      public dbb a(bsd $$0, aym $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      dbb a(bsd var1, aym var2);
   }

   static class h implements cly.g {
      private final daz a;
      private final int b;
      private final cua c;
      private final int d;
      private final int e;
      private final float f;
      private final Optional<akj<daq>> g;

      public h(dcc $$0, int $$1, int $$2, ctv $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new cua($$3), $$4, $$5, $$6, $$7);
      }

      private h(dcc $$0, int $$1, int $$2, cua $$3, int $$4, int $$5, int $$6, float $$7) {
         this(new daz($$0, $$1), $$2, $$3.c($$4), $$5, $$6, $$7, Optional.empty());
      }

      h(dcc $$0, int $$1, int $$2, dcc $$3, int $$4, int $$5, int $$6, float $$7, akj<daq> $$8) {
         this(new daz($$0, $$1), $$2, new cua($$3, $$4), $$5, $$6, $$7, Optional.of($$8));
      }

      public h(daz $$0, int $$1, cua $$2, int $$3, int $$4, float $$5, Optional<akj<daq>> $$6) {
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
      public dbb a(bsd $$0, aym $$1) {
         cua $$2 = this.c.s();
         this.g.ifPresent($$3 -> czl.a($$2, (akj<daq>)$$3, $$0.dP(), $$0.dp(), $$1));
         return new dbb(new daz(cud.oz, this.b), Optional.of(this.a), $$2, 0, this.d, this.e, this.f);
      }
   }

   static class i implements cly.g {
      private final cua a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;
      private final Optional<akj<daq>> f;

      public i(dff $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cua($$0), $$1, $$2, $$3, $$4);
      }

      public i(ctv $$0, int $$1, int $$2, int $$3) {
         this(new cua($$0), $$1, $$2, 12, $$3);
      }

      public i(ctv $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cua($$0), $$1, $$2, $$3, $$4);
      }

      public i(cua $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(ctv $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new cua($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(ctv $$0, int $$1, int $$2, int $$3, int $$4, float $$5, akj<daq> $$6) {
         this(new cua($$0), $$1, $$2, $$3, $$4, $$5, Optional.of($$6));
      }

      public i(cua $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this($$0, $$1, $$2, $$3, $$4, $$5, Optional.empty());
      }

      public i(cua $$0, int $$1, int $$2, int $$3, int $$4, float $$5, Optional<akj<daq>> $$6) {
         this.a = $$0;
         this.b = $$1;
         this.a.e($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
         this.f = $$6;
      }

      @Override
      public dbb a(bsd $$0, aym $$1) {
         cua $$2 = this.a.s();
         this.f.ifPresent($$3 -> czl.a($$2, (akj<daq>)$$3, $$0.dP(), $$0.dp(), $$1));
         return new dbb(new daz(cud.oz, this.b), $$2, this.c, this.d, this.e);
      }
   }

   static class j implements cly.g {
      private final cxd a;
      private final int b;
      private final float c;

      public j(jj<brj> $$0, int $$1, int $$2) {
         this(new cxd(List.of(new cxd.a($$0, $$1))), $$2, 0.05F);
      }

      public j(cxd $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public dbb a(bsd $$0, aym $$1) {
         cua $$2 = new cua(cud.vX, 1);
         $$2.b(kn.H, this.a);
         return new dbb(new daz(cud.oz), $$2, 12, this.b, this.c);
      }
   }

   static class k implements cly.g {
      private final cua a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final ctv f;
      private final int g;
      private final float h;

      public k(ctv $$0, int $$1, ctv $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new cua($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public dbb a(bsd $$0, aym $$1) {
         daz $$2 = new daz(cud.oz, this.c);
         List<jj<cvz>> $$3 = lq.h.i().filter($$1x -> !((cvz)$$1x.a()).a().isEmpty() && $$0.dP().K().a($$1x)).collect(Collectors.toList());
         jj<cvz> $$4 = ac.a($$3, $$1);
         cua $$5 = new cua(this.a.g(), this.b);
         $$5.b(kn.G, new cwb($$4));
         return new dbb($$2, Optional.of(new daz(this.f, this.g)), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements cly.g {
      private final int a;
      private final awk<eiq> b;
      private final String c;
      private final jj<epl> d;
      private final int e;
      private final int f;

      public l(int $$0, awk<eiq> $$1, String $$2, jj<epl> $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public dbb a(bsd $$0, aym $$1) {
         if (!($$0.dP() instanceof aqk)) {
            return null;
         } else {
            aqk $$2 = (aqk)$$0.dP();
            ja $$3 = $$2.a(this.b, $$0.dp(), 100, true);
            if ($$3 != null) {
               cua $$4 = cui.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               cui.a($$2, $$4);
               epq.a($$4, $$3, "+", this.d);
               $$4.b(kn.h, wu.c(this.c));
               return new dbb(new daz(cud.oz, this.a), Optional.of(new daz(cud.qS)), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static record m(Map<clz, cly.g> a) implements cly.g {
      public static cly.m a(cly.g $$0, clz... $$1) {
         return new cly.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public dbb a(bsd $$0, aym $$1) {
         if ($$0 instanceof clw $$2) {
            clz $$3 = $$2.gy().a();
            cly.g $$4 = this.a.get($$3);
            return $$4 == null ? null : $$4.a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
