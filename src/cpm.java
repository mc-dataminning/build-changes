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

public class cpm {
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
   public static final Map<cpl, Int2ObjectMap<cpm.g[]>> a = ae.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            cpl.g,
            a(
               ImmutableMap.of(
                  1,
                  new cpm.g[]{
                     new cpm.b(cxs.pS, 20, 16, 2),
                     new cpm.b(cxs.uW, 26, 16, 2),
                     new cpm.b(cxs.uV, 22, 16, 2),
                     new cpm.b(cxs.wa, 15, 16, 2),
                     new cpm.i(cxs.pT, 1, 6, 16, 1)
                  },
                  2,
                  new cpm.g[]{new cpm.b(dkn.fn, 6, 12, 10), new cpm.i(cxs.vj, 1, 4, 5), new cpm.i(cxs.oQ, 1, 4, 16, 5)},
                  3,
                  new cpm.g[]{new cpm.i(cxs.sG, 3, 18, 10), new cpm.b(dkn.fo, 4, 12, 20)},
                  4,
                  new cpm.g[]{
                     new cpm.i(dkn.et, 1, 1, 12, 15),
                     new cpm.j(buq.p, 100, 15),
                     new cpm.j(buq.h, 160, 15),
                     new cpm.j(buq.r, 140, 15),
                     new cpm.j(buq.o, 120, 15),
                     new cpm.j(buq.s, 280, 15),
                     new cpm.j(buq.w, 7, 15)
                  },
                  5,
                  new cpm.g[]{new cpm.i(cxs.va, 3, 3, 30), new cpm.i(cxs.th, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            cpl.h,
            a(
               ImmutableMap.of(
                  1,
                  new cpm.g[]{
                     new cpm.b(cxs.pO, 20, 16, 2),
                     new cpm.b(cxs.oT, 10, 16, 2),
                     new cpm.h(cxs.rN, 6, 1, cxs.rR, 6, 16, 1, 0.05F),
                     new cpm.i(cxs.rf, 3, 1, 16, 1)
                  },
                  2,
                  new cpm.g[]{new cpm.b(cxs.rN, 15, 16, 10), new cpm.h(cxs.rO, 6, 1, cxs.rS, 6, 16, 5, 0.05F), new cpm.i(cxs.xn, 2, 1, 5)},
                  3,
                  new cpm.g[]{new cpm.b(cxs.rO, 13, 16, 20), new cpm.e(cxs.rJ, 3, 3, 10, 0.2F)},
                  4,
                  new cpm.g[]{new cpm.b(cxs.rP, 6, 12, 30)},
                  5,
                  new cpm.g[]{
                     new cpm.b(cxs.rQ, 4, 12, 30),
                     new cpm.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(cpn.c, cxs.oo)
                           .put(cpn.g, cxs.oq)
                           .put(cpn.e, cxs.oq)
                           .put(cpn.a, cxs.ou)
                           .put(cpn.b, cxs.ou)
                           .put(cpn.d, cxs.ow)
                           .put(cpn.f, cxs.oA)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            cpl.n,
            a(
               ImmutableMap.of(
                  1,
                  new cpm.g[]{
                     new cpm.b(dkn.bH, 18, 16, 2),
                     new cpm.b(dkn.bT, 18, 16, 2),
                     new cpm.b(dkn.bW, 18, 16, 2),
                     new cpm.b(dkn.bO, 18, 16, 2),
                     new cpm.i(cxs.sJ, 2, 1, 1)
                  },
                  2,
                  new cpm.g[]{
                     new cpm.b(cxs.rW, 12, 16, 10),
                     new cpm.b(cxs.sd, 12, 16, 10),
                     new cpm.b(cxs.sl, 12, 16, 10),
                     new cpm.b(cxs.rZ, 12, 16, 10),
                     new cpm.b(cxs.sb, 12, 16, 10),
                     new cpm.i(dkn.bH, 1, 1, 16, 5),
                     new cpm.i(dkn.bI, 1, 1, 16, 5),
                     new cpm.i(dkn.bJ, 1, 1, 16, 5),
                     new cpm.i(dkn.bK, 1, 1, 16, 5),
                     new cpm.i(dkn.bL, 1, 1, 16, 5),
                     new cpm.i(dkn.bM, 1, 1, 16, 5),
                     new cpm.i(dkn.bN, 1, 1, 16, 5),
                     new cpm.i(dkn.bO, 1, 1, 16, 5),
                     new cpm.i(dkn.bP, 1, 1, 16, 5),
                     new cpm.i(dkn.bQ, 1, 1, 16, 5),
                     new cpm.i(dkn.bR, 1, 1, 16, 5),
                     new cpm.i(dkn.bS, 1, 1, 16, 5),
                     new cpm.i(dkn.bT, 1, 1, 16, 5),
                     new cpm.i(dkn.bU, 1, 1, 16, 5),
                     new cpm.i(dkn.bV, 1, 1, 16, 5),
                     new cpm.i(dkn.bW, 1, 1, 16, 5),
                     new cpm.i(dkn.iB, 1, 4, 16, 5),
                     new cpm.i(dkn.iC, 1, 4, 16, 5),
                     new cpm.i(dkn.iD, 1, 4, 16, 5),
                     new cpm.i(dkn.iE, 1, 4, 16, 5),
                     new cpm.i(dkn.iF, 1, 4, 16, 5),
                     new cpm.i(dkn.iG, 1, 4, 16, 5),
                     new cpm.i(dkn.iH, 1, 4, 16, 5),
                     new cpm.i(dkn.iI, 1, 4, 16, 5),
                     new cpm.i(dkn.iJ, 1, 4, 16, 5),
                     new cpm.i(dkn.iK, 1, 4, 16, 5),
                     new cpm.i(dkn.iL, 1, 4, 16, 5),
                     new cpm.i(dkn.iM, 1, 4, 16, 5),
                     new cpm.i(dkn.iN, 1, 4, 16, 5),
                     new cpm.i(dkn.iO, 1, 4, 16, 5),
                     new cpm.i(dkn.iP, 1, 4, 16, 5),
                     new cpm.i(dkn.iQ, 1, 4, 16, 5)
                  },
                  3,
                  new cpm.g[]{
                     new cpm.b(cxs.sa, 12, 16, 20),
                     new cpm.b(cxs.se, 12, 16, 20),
                     new cpm.b(cxs.rX, 12, 16, 20),
                     new cpm.b(cxs.sk, 12, 16, 20),
                     new cpm.b(cxs.sc, 12, 16, 20),
                     new cpm.i(dkn.bg, 3, 1, 12, 10),
                     new cpm.i(dkn.bk, 3, 1, 12, 10),
                     new cpm.i(dkn.bu, 3, 1, 12, 10),
                     new cpm.i(dkn.bv, 3, 1, 12, 10),
                     new cpm.i(dkn.br, 3, 1, 12, 10),
                     new cpm.i(dkn.bs, 3, 1, 12, 10),
                     new cpm.i(dkn.bp, 3, 1, 12, 10),
                     new cpm.i(dkn.bn, 3, 1, 12, 10),
                     new cpm.i(dkn.bt, 3, 1, 12, 10),
                     new cpm.i(dkn.bj, 3, 1, 12, 10),
                     new cpm.i(dkn.bo, 3, 1, 12, 10),
                     new cpm.i(dkn.bl, 3, 1, 12, 10),
                     new cpm.i(dkn.bi, 3, 1, 12, 10),
                     new cpm.i(dkn.bh, 3, 1, 12, 10),
                     new cpm.i(dkn.bm, 3, 1, 12, 10),
                     new cpm.i(dkn.bq, 3, 1, 12, 10)
                  },
                  4,
                  new cpm.g[]{
                     new cpm.b(cxs.si, 12, 16, 30),
                     new cpm.b(cxs.sg, 12, 16, 30),
                     new cpm.b(cxs.sh, 12, 16, 30),
                     new cpm.b(cxs.sj, 12, 16, 30),
                     new cpm.b(cxs.rY, 12, 16, 30),
                     new cpm.b(cxs.sf, 12, 16, 30),
                     new cpm.i(cxs.vF, 3, 1, 12, 15),
                     new cpm.i(cxs.vQ, 3, 1, 12, 15),
                     new cpm.i(cxs.vI, 3, 1, 12, 15),
                     new cpm.i(cxs.vT, 3, 1, 12, 15),
                     new cpm.i(cxs.vL, 3, 1, 12, 15),
                     new cpm.i(cxs.vS, 3, 1, 12, 15),
                     new cpm.i(cxs.vK, 3, 1, 12, 15),
                     new cpm.i(cxs.vM, 3, 1, 12, 15),
                     new cpm.i(cxs.vU, 3, 1, 12, 15),
                     new cpm.i(cxs.vP, 3, 1, 12, 15),
                     new cpm.i(cxs.vH, 3, 1, 12, 15),
                     new cpm.i(cxs.vO, 3, 1, 12, 15),
                     new cpm.i(cxs.vR, 3, 1, 12, 15),
                     new cpm.i(cxs.vJ, 3, 1, 12, 15),
                     new cpm.i(cxs.vG, 3, 1, 12, 15),
                     new cpm.i(cxs.vN, 3, 1, 12, 15)
                  },
                  5,
                  new cpm.g[]{new cpm.i(cxs.qv, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            cpl.i,
            a(
               ImmutableMap.of(
                  1,
                  new cpm.g[]{new cpm.b(cxs.pM, 32, 16, 2), new cpm.i(cxs.oS, 1, 16, 1), new cpm.h(dkn.O, 10, 1, cxs.qs, 10, 12, 1, 0.05F)},
                  2,
                  new cpm.g[]{new cpm.b(cxs.qs, 26, 12, 10), new cpm.i(cxs.oR, 2, 1, 5)},
                  3,
                  new cpm.g[]{new cpm.b(cxs.pO, 14, 16, 20), new cpm.i(cxs.wL, 3, 1, 10)},
                  4,
                  new cpm.g[]{new cpm.b(cxs.pP, 24, 16, 30), new cpm.e(cxs.oR, 2, 3, 15)},
                  5,
                  new cpm.g[]{new cpm.b(cxs.mp, 8, 12, 30), new cpm.e(cxs.wL, 3, 3, 15), new cpm.k(cxs.oS, 5, cxs.wg, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            cpl.k,
            a(
               ImmutableMap.builder()
                  .put(1, new cpm.g[]{new cpm.b(cxs.rm, 24, 16, 2), new cpm.d(1, axx.i), new cpm.i(dkn.cs, 9, 1, 12, 1)})
                  .put(2, new cpm.g[]{new cpm.b(cxs.rn, 4, 12, 10), new cpm.d(5, axx.i), new cpm.i(cxs.xj, 1, 1, 5)})
                  .put(3, new cpm.g[]{new cpm.b(cxs.rT, 5, 12, 20), new cpm.d(10, axx.i), new cpm.i(cxs.cN, 1, 4, 10)})
                  .put(4, new cpm.g[]{new cpm.b(cxs.uO, 2, 12, 30), new cpm.d(15, axx.i), new cpm.i(cxs.rK, 5, 1, 15), new cpm.i(cxs.rq, 4, 1, 15)})
                  .put(5, new cpm.g[]{new cpm.i(cxs.vB, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            cpl.e,
            a(
               ImmutableMap.of(
                  1,
                  new cpm.g[]{new cpm.b(cxs.rm, 24, 16, 2), new cpm.i(cxs.uZ, 7, 1, 1)},
                  2,
                  new cpm.g[]{new cpm.b(cxs.gg, 11, 16, 10), new cpm.l(13, ayg.d, "filled_map.monument", evm.j, 12, 5)},
                  3,
                  new cpm.g[]{
                     new cpm.b(cxs.rq, 1, 12, 20),
                     new cpm.l(14, ayg.c, "filled_map.mansion", evm.i, 12, 10),
                     new cpm.l(12, ayg.m, "filled_map.trial_chambers", evm.I, 12, 10)
                  },
                  4,
                  new cpm.g[]{
                     new cpm.i(cxs.uS, 7, 1, 15),
                     new cpm.i(cxs.vF, 3, 1, 15),
                     new cpm.i(cxs.vQ, 3, 1, 15),
                     new cpm.i(cxs.vI, 3, 1, 15),
                     new cpm.i(cxs.vT, 3, 1, 15),
                     new cpm.i(cxs.vL, 3, 1, 15),
                     new cpm.i(cxs.vS, 3, 1, 15),
                     new cpm.i(cxs.vK, 3, 1, 15),
                     new cpm.i(cxs.vM, 3, 1, 15),
                     new cpm.i(cxs.vU, 3, 1, 15),
                     new cpm.i(cxs.vP, 3, 1, 15),
                     new cpm.i(cxs.vH, 3, 1, 15),
                     new cpm.i(cxs.vO, 3, 1, 15),
                     new cpm.i(cxs.vR, 3, 1, 15),
                     new cpm.i(cxs.vJ, 3, 1, 15),
                     new cpm.i(cxs.vG, 3, 1, 15),
                     new cpm.i(cxs.vN, 3, 1, 15)
                  },
                  5,
                  new cpm.g[]{new cpm.i(cxs.wS, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            cpl.f,
            a(
               ImmutableMap.of(
                  1,
                  new cpm.g[]{new cpm.b(cxs.sS, 32, 16, 2), new cpm.i(cxs.lV, 1, 2, 1)},
                  2,
                  new cpm.g[]{new cpm.b(cxs.pf, 3, 12, 10), new cpm.i(cxs.oX, 1, 1, 5)},
                  3,
                  new cpm.g[]{new cpm.b(cxs.vt, 2, 12, 20), new cpm.i(dkn.ep, 4, 1, 12, 10)},
                  4,
                  new cpm.g[]{new cpm.b(cxs.oL, 4, 12, 30), new cpm.b(cxs.sY, 9, 12, 30), new cpm.i(cxs.sT, 5, 1, 15)},
                  5,
                  new cpm.g[]{new cpm.b(cxs.sX, 22, 12, 30), new cpm.i(cxs.uL, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            cpl.c,
            a(
               ImmutableMap.of(
                  1,
                  new cpm.g[]{
                     new cpm.b(cxs.oT, 15, 16, 2),
                     new cpm.i(new cxo(cxs.qe), 7, 1, 12, 1, 0.2F),
                     new cpm.i(new cxo(cxs.qf), 4, 1, 12, 1, 0.2F),
                     new cpm.i(new cxo(cxs.qc), 5, 1, 12, 1, 0.2F),
                     new cpm.i(new cxo(cxs.qd), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cpm.g[]{
                     new cpm.b(cxs.pb, 4, 12, 10),
                     new cpm.i(new cxo(cxs.xi), 36, 1, 12, 5, 0.2F),
                     new cpm.i(new cxo(cxs.qb), 1, 1, 12, 5, 0.2F),
                     new cpm.i(new cxo(cxs.qa), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new cpm.g[]{
                     new cpm.b(cxs.qY, 1, 12, 20),
                     new cpm.b(cxs.oV, 1, 12, 20),
                     new cpm.i(new cxo(cxs.pY), 1, 1, 12, 10, 0.2F),
                     new cpm.i(new cxo(cxs.pZ), 4, 1, 12, 10, 0.2F),
                     new cpm.i(new cxo(cxs.wi), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new cpm.g[]{new cpm.e(cxs.qi, 14, 3, 15, 0.2F), new cpm.e(cxs.qj, 8, 3, 15, 0.2F)},
                  5,
                  new cpm.g[]{new cpm.e(cxs.qg, 8, 3, 30, 0.2F), new cpm.e(cxs.qh, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cpl.p,
            a(
               ImmutableMap.of(
                  1,
                  new cpm.g[]{new cpm.b(cxs.oT, 15, 16, 2), new cpm.i(new cxo(cxs.pA), 3, 1, 12, 1, 0.2F), new cpm.e(cxs.px, 2, 3, 1)},
                  2,
                  new cpm.g[]{new cpm.b(cxs.pb, 4, 12, 10), new cpm.i(new cxo(cxs.xi), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cpm.g[]{new cpm.b(cxs.qs, 24, 12, 20)},
                  4,
                  new cpm.g[]{new cpm.b(cxs.oV, 1, 12, 30), new cpm.e(cxs.pF, 12, 3, 15, 0.2F)},
                  5,
                  new cpm.g[]{new cpm.e(cxs.pC, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cpl.o,
            a(
               ImmutableMap.of(
                  1,
                  new cpm.g[]{
                     new cpm.b(cxs.oT, 15, 16, 2),
                     new cpm.i(new cxo(cxs.pq), 1, 1, 12, 1, 0.2F),
                     new cpm.i(new cxo(cxs.po), 1, 1, 12, 1, 0.2F),
                     new cpm.i(new cxo(cxs.pp), 1, 1, 12, 1, 0.2F),
                     new cpm.i(new cxo(cxs.pr), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cpm.g[]{new cpm.b(cxs.pb, 4, 12, 10), new cpm.i(new cxo(cxs.xi), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cpm.g[]{
                     new cpm.b(cxs.qs, 30, 12, 20),
                     new cpm.e(cxs.pA, 1, 3, 10, 0.2F),
                     new cpm.e(cxs.py, 2, 3, 10, 0.2F),
                     new cpm.e(cxs.pz, 3, 3, 10, 0.2F),
                     new cpm.i(new cxo(cxs.pG), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new cpm.g[]{new cpm.b(cxs.oV, 1, 12, 30), new cpm.e(cxs.pF, 12, 3, 15, 0.2F), new cpm.e(cxs.pD, 5, 3, 15, 0.2F)},
                  5,
                  new cpm.g[]{new cpm.e(cxs.pE, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cpl.d,
            a(
               ImmutableMap.of(
                  1,
                  new cpm.g[]{new cpm.b(cxs.sQ, 14, 16, 2), new cpm.b(cxs.qt, 7, 16, 2), new cpm.b(cxs.vq, 4, 16, 2), new cpm.i(cxs.vs, 1, 1, 1)},
                  2,
                  new cpm.g[]{new cpm.b(cxs.oT, 15, 16, 2), new cpm.i(cxs.qu, 1, 5, 16, 5), new cpm.i(cxs.sR, 1, 8, 16, 5)},
                  3,
                  new cpm.g[]{new cpm.b(cxs.vD, 7, 16, 20), new cpm.b(cxs.sO, 10, 16, 20)},
                  4,
                  new cpm.g[]{new cpm.b(cxs.rl, 10, 12, 30)},
                  5,
                  new cpm.g[]{new cpm.b(cxs.xl, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            cpl.j,
            a(
               ImmutableMap.of(
                  1,
                  new cpm.g[]{new cpm.b(cxs.rb, 6, 16, 2), new cpm.a(cxs.pW, 3), new cpm.a(cxs.pV, 7)},
                  2,
                  new cpm.g[]{new cpm.b(cxs.qs, 26, 12, 10), new cpm.a(cxs.pU, 5, 12, 5), new cpm.a(cxs.pX, 4, 12, 5)},
                  3,
                  new cpm.g[]{new cpm.b(cxs.vu, 9, 12, 20), new cpm.a(cxs.pV, 7)},
                  4,
                  new cpm.g[]{new cpm.b(cxs.oL, 4, 12, 30), new cpm.a(cxs.vz, 6, 12, 15)},
                  5,
                  new cpm.g[]{new cpm.i(new cxo(cxs.oe), 6, 1, 12, 30, 0.2F), new cpm.a(cxs.pU, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            cpl.l,
            a(
               ImmutableMap.of(
                  1,
                  new cpm.g[]{new cpm.b(cxs.rk, 10, 16, 2), new cpm.i(cxs.rj, 1, 10, 16, 1)},
                  2,
                  new cpm.g[]{new cpm.b(dkn.b, 20, 16, 10), new cpm.i(dkn.eY, 1, 4, 16, 5)},
                  3,
                  new cpm.g[]{
                     new cpm.b(dkn.c, 16, 16, 20),
                     new cpm.b(dkn.g, 16, 16, 20),
                     new cpm.b(dkn.e, 16, 16, 20),
                     new cpm.i(dkn.sP, 1, 4, 16, 10),
                     new cpm.i(dkn.h, 1, 4, 16, 10),
                     new cpm.i(dkn.f, 1, 4, 16, 10),
                     new cpm.i(dkn.d, 1, 4, 16, 10)
                  },
                  4,
                  new cpm.g[]{
                     new cpm.b(cxs.oY, 12, 12, 30),
                     new cpm.i(dkn.hA, 1, 1, 12, 15),
                     new cpm.i(dkn.hz, 1, 1, 12, 15),
                     new cpm.i(dkn.hK, 1, 1, 12, 15),
                     new cpm.i(dkn.hC, 1, 1, 12, 15),
                     new cpm.i(dkn.hG, 1, 1, 12, 15),
                     new cpm.i(dkn.hH, 1, 1, 12, 15),
                     new cpm.i(dkn.hO, 1, 1, 12, 15),
                     new cpm.i(dkn.hN, 1, 1, 12, 15),
                     new cpm.i(dkn.hF, 1, 1, 12, 15),
                     new cpm.i(dkn.hB, 1, 1, 12, 15),
                     new cpm.i(dkn.hE, 1, 1, 12, 15),
                     new cpm.i(dkn.hM, 1, 1, 12, 15),
                     new cpm.i(dkn.hI, 1, 1, 12, 15),
                     new cpm.i(dkn.hJ, 1, 1, 12, 15),
                     new cpm.i(dkn.hD, 1, 1, 12, 15),
                     new cpm.i(dkn.hL, 1, 1, 12, 15),
                     new cpm.i(dkn.lC, 1, 1, 12, 15),
                     new cpm.i(dkn.lB, 1, 1, 12, 15),
                     new cpm.i(dkn.lM, 1, 1, 12, 15),
                     new cpm.i(dkn.lE, 1, 1, 12, 15),
                     new cpm.i(dkn.lI, 1, 1, 12, 15),
                     new cpm.i(dkn.lJ, 1, 1, 12, 15),
                     new cpm.i(dkn.lQ, 1, 1, 12, 15),
                     new cpm.i(dkn.lP, 1, 1, 12, 15),
                     new cpm.i(dkn.lH, 1, 1, 12, 15),
                     new cpm.i(dkn.lD, 1, 1, 12, 15),
                     new cpm.i(dkn.lG, 1, 1, 12, 15),
                     new cpm.i(dkn.lO, 1, 1, 12, 15),
                     new cpm.i(dkn.lK, 1, 1, 12, 15),
                     new cpm.i(dkn.lL, 1, 1, 12, 15),
                     new cpm.i(dkn.lF, 1, 1, 12, 15),
                     new cpm.i(dkn.lN, 1, 1, 12, 15)
                  },
                  5,
                  new cpm.g[]{new cpm.i(dkn.hv, 1, 1, 12, 30), new cpm.i(dkn.ht, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<cpm.g[]> b = a(
      ImmutableMap.of(
         1,
         new cpm.g[]{
            new cpm.i(cxs.da, 2, 1, 5, 1),
            new cpm.i(cxs.ro, 4, 1, 5, 1),
            new cpm.i(cxs.fH, 2, 1, 5, 1),
            new cpm.i(cxs.wJ, 5, 1, 5, 1),
            new cpm.i(cxs.cV, 1, 1, 12, 1),
            new cpm.i(cxs.dQ, 1, 1, 8, 1),
            new cpm.i(cxs.fx, 1, 1, 4, 1),
            new cpm.i(cxs.dR, 3, 1, 12, 1),
            new cpm.i(cxs.fi, 3, 1, 8, 1),
            new cpm.i(cxs.dr, 1, 1, 12, 1),
            new cpm.i(cxs.ds, 1, 1, 12, 1),
            new cpm.i(cxs.dt, 1, 1, 8, 1),
            new cpm.i(cxs.du, 1, 1, 12, 1),
            new cpm.i(cxs.dv, 1, 1, 12, 1),
            new cpm.i(cxs.dw, 1, 1, 12, 1),
            new cpm.i(cxs.dx, 1, 1, 12, 1),
            new cpm.i(cxs.dy, 1, 1, 12, 1),
            new cpm.i(cxs.dz, 1, 1, 12, 1),
            new cpm.i(cxs.dA, 1, 1, 12, 1),
            new cpm.i(cxs.dB, 1, 1, 12, 1),
            new cpm.i(cxs.dC, 1, 1, 7, 1),
            new cpm.i(cxs.pR, 1, 1, 12, 1),
            new cpm.i(cxs.wb, 1, 1, 12, 1),
            new cpm.i(cxs.sM, 1, 1, 12, 1),
            new cpm.i(cxs.sN, 1, 1, 12, 1),
            new cpm.i(cxs.ab, 5, 1, 8, 1),
            new cpm.i(cxs.Z, 5, 1, 8, 1),
            new cpm.i(cxs.ad, 5, 1, 8, 1),
            new cpm.i(cxs.aa, 5, 1, 8, 1),
            new cpm.i(cxs.X, 5, 1, 8, 1),
            new cpm.i(cxs.Y, 5, 1, 8, 1),
            new cpm.i(cxs.ac, 5, 1, 8, 1),
            new cpm.i(cxs.af, 5, 1, 8, 1),
            new cpm.i(cxs.sk, 1, 3, 12, 1),
            new cpm.i(cxs.rW, 1, 3, 12, 1),
            new cpm.i(cxs.sh, 1, 3, 12, 1),
            new cpm.i(cxs.sc, 1, 3, 12, 1),
            new cpm.i(cxs.sl, 1, 3, 12, 1),
            new cpm.i(cxs.sj, 1, 3, 12, 1),
            new cpm.i(cxs.se, 1, 3, 12, 1),
            new cpm.i(cxs.rY, 1, 3, 12, 1),
            new cpm.i(cxs.sa, 1, 3, 12, 1),
            new cpm.i(cxs.sd, 1, 3, 12, 1),
            new cpm.i(cxs.sg, 1, 3, 12, 1),
            new cpm.i(cxs.rZ, 1, 3, 12, 1),
            new cpm.i(cxs.sb, 1, 3, 12, 1),
            new cpm.i(cxs.rX, 1, 3, 12, 1),
            new cpm.i(cxs.si, 1, 3, 12, 1),
            new cpm.i(cxs.sf, 1, 3, 12, 1),
            new cpm.i(cxs.kL, 3, 1, 8, 1),
            new cpm.i(cxs.kM, 3, 1, 8, 1),
            new cpm.i(cxs.kN, 3, 1, 8, 1),
            new cpm.i(cxs.kO, 3, 1, 8, 1),
            new cpm.i(cxs.kK, 3, 1, 8, 1),
            new cpm.i(cxs.gi, 1, 1, 12, 1),
            new cpm.i(cxs.dH, 1, 1, 12, 1),
            new cpm.i(cxs.dI, 1, 1, 12, 1),
            new cpm.i(cxs.go, 1, 2, 5, 1),
            new cpm.i(cxs.ea, 1, 2, 5, 1),
            new cpm.i(cxs.ah, 1, 8, 8, 1),
            new cpm.i(cxs.ak, 1, 4, 6, 1),
            new cpm.i(cxs.yf, 1, 2, 5, 1),
            new cpm.i(cxs.F, 1, 2, 5, 1),
            new cpm.i(cxs.dU, 1, 2, 5, 1)
         },
         2,
         new cpm.g[]{
            new cpm.i(cxs.rg, 5, 1, 4, 1),
            new cpm.i(cxs.rd, 5, 1, 4, 1),
            new cpm.i(cxs.ij, 3, 1, 6, 1),
            new cpm.i(cxs.lj, 6, 1, 6, 1),
            new cpm.i(cxs.pQ, 1, 1, 8, 1),
            new cpm.i(cxs.E, 3, 3, 6, 1)
         }
      )
   );
   private static final cpm.l s = new cpm.l(8, ayg.f, "filled_map.village_desert", evm.B, 12, 5);
   private static final cpm.l t = new cpm.l(8, ayg.e, "filled_map.village_savanna", evm.D, 12, 5);
   private static final cpm.l u = new cpm.l(8, ayg.g, "filled_map.village_plains", evm.C, 12, 5);
   private static final cpm.l v = new cpm.l(8, ayg.h, "filled_map.village_taiga", evm.F, 12, 5);
   private static final cpm.l w = new cpm.l(8, ayg.i, "filled_map.village_snowy", evm.E, 12, 5);
   private static final cpm.l x = new cpm.l(8, ayg.j, "filled_map.explorer_jungle", evm.G, 12, 5);
   private static final cpm.l y = new cpm.l(8, ayg.k, "filled_map.explorer_swamp", evm.H, 12, 5);
   public static final Map<cpl, Int2ObjectMap<cpm.g[]>> c = Map.of(
      cpl.k,
      a(
         ImmutableMap.builder()
            .put(1, new cpm.g[]{new cpm.b(cxs.rm, 24, 16, 2), a(1), new cpm.i(dkn.cs, 9, 1, 12, 1)})
            .put(2, new cpm.g[]{new cpm.b(cxs.rn, 4, 12, 10), a(5), new cpm.i(cxs.xj, 1, 1, 5)})
            .put(3, new cpm.g[]{new cpm.b(cxs.rT, 5, 12, 20), a(10), new cpm.i(cxs.cN, 1, 4, 10)})
            .put(4, new cpm.g[]{new cpm.b(cxs.uO, 2, 12, 30), new cpm.i(cxs.rK, 5, 1, 15), new cpm.i(cxs.rq, 4, 1, 15)})
            .put(5, new cpm.g[]{a(), new cpm.i(cxs.vB, 20, 1, 30)})
            .build()
      ),
      cpl.c,
      a(
         ImmutableMap.builder()
            .put(1, new cpm.g[]{new cpm.b(cxs.oT, 15, 12, 2), new cpm.b(cxs.pb, 5, 12, 2)})
            .put(
               2,
               new cpm.g[]{
                  cpm.m.a(new cpm.i(cxs.qf, 4, 1, 12, 5, 0.05F), cpn.a, cpn.c, cpn.d, cpn.e, cpn.g),
                  cpm.m.a(new cpm.i(cxs.qb, 4, 1, 12, 5, 0.05F), cpn.b, cpn.f),
                  cpm.m.a(new cpm.i(cxs.qc, 5, 1, 12, 5, 0.05F), cpn.a, cpn.c, cpn.d, cpn.e, cpn.g),
                  cpm.m.a(new cpm.i(cxs.pY, 5, 1, 12, 5, 0.05F), cpn.b, cpn.f),
                  cpm.m.a(new cpm.i(cxs.qe, 7, 1, 12, 5, 0.05F), cpn.a, cpn.c, cpn.d, cpn.e, cpn.g),
                  cpm.m.a(new cpm.i(cxs.qa, 7, 1, 12, 5, 0.05F), cpn.b, cpn.f),
                  cpm.m.a(new cpm.i(cxs.qd, 9, 1, 12, 5, 0.05F), cpn.a, cpn.c, cpn.d, cpn.e, cpn.g),
                  cpm.m.a(new cpm.i(cxs.pZ, 9, 1, 12, 5, 0.05F), cpn.b, cpn.f)
               }
            )
            .put(3, new cpm.g[]{new cpm.b(cxs.qY, 1, 12, 20), new cpm.i(cxs.wi, 5, 1, 12, 10, 0.05F), new cpm.i(cxs.xi, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new cpm.g[]{
                  cpm.m.a(new cpm.i(cxs.qf, 8, 1, 3, 15, 0.05F, dfl.a), cpn.a),
                  cpm.m.a(new cpm.i(cxs.qc, 9, 1, 3, 15, 0.05F, dfl.d), cpn.a),
                  cpm.m.a(new cpm.i(cxs.qe, 11, 1, 3, 15, 0.05F, dfl.b), cpn.a),
                  cpm.m.a(new cpm.i(cxs.qd, 13, 1, 3, 15, 0.05F, dfl.c), cpn.a),
                  cpm.m.a(new cpm.i(cxs.qf, 8, 1, 3, 15, 0.05F, dfl.g), cpn.c),
                  cpm.m.a(new cpm.i(cxs.qc, 9, 1, 3, 15, 0.05F, dfl.j), cpn.c),
                  cpm.m.a(new cpm.i(cxs.qe, 11, 1, 3, 15, 0.05F, dfl.h), cpn.c),
                  cpm.m.a(new cpm.i(cxs.qd, 13, 1, 3, 15, 0.05F, dfl.i), cpn.c),
                  cpm.m.a(new cpm.i(cxs.qf, 2, 1, 3, 15, 0.05F, dfl.m), cpn.d),
                  cpm.m.a(new cpm.i(cxs.qc, 3, 1, 3, 15, 0.05F, dfl.p), cpn.d),
                  cpm.m.a(new cpm.i(cxs.qe, 5, 1, 3, 15, 0.05F, dfl.n), cpn.d),
                  cpm.m.a(new cpm.i(cxs.qd, 7, 1, 3, 15, 0.05F, dfl.o), cpn.d),
                  cpm.m.a(new cpm.i(cxs.qf, 8, 1, 3, 15, 0.05F, dfl.s), cpn.e),
                  cpm.m.a(new cpm.i(cxs.qc, 9, 1, 3, 15, 0.05F, dfl.t), cpn.e),
                  cpm.m.a(new cpm.i(cxs.qb, 8, 1, 3, 15, 0.05F, dfl.w), cpn.b),
                  cpm.m.a(new cpm.i(cxs.pY, 9, 1, 3, 15, 0.05F, dfl.z), cpn.b),
                  cpm.m.a(new cpm.i(cxs.qa, 11, 1, 3, 15, 0.05F, dfl.x), cpn.b),
                  cpm.m.a(new cpm.i(cxs.pZ, 13, 1, 3, 15, 0.05F, dfl.y), cpn.b),
                  cpm.m.a(new cpm.i(cxs.qb, 8, 1, 3, 15, 0.05F, dfl.C), cpn.f),
                  cpm.m.a(new cpm.i(cxs.pY, 9, 1, 3, 15, 0.05F, dfl.F), cpn.f),
                  cpm.m.a(new cpm.i(cxs.qa, 11, 1, 3, 15, 0.05F, dfl.D), cpn.f),
                  cpm.m.a(new cpm.i(cxs.pZ, 13, 1, 3, 15, 0.05F, dfl.E), cpn.f),
                  cpm.m.a(new cpm.h(cxs.qj, 1, 4, cxs.qi, 1, 3, 15, 0.05F), cpn.g),
                  cpm.m.a(new cpm.h(cxs.qi, 1, 4, cxs.qh, 1, 3, 15, 0.05F), cpn.g),
                  cpm.m.a(new cpm.h(cxs.qg, 1, 4, cxs.qj, 1, 3, 15, 0.05F), cpn.g),
                  cpm.m.a(new cpm.h(cxs.qh, 1, 2, cxs.qg, 1, 3, 15, 0.05F), cpn.g)
               }
            )
            .put(
               5,
               new cpm.g[]{
                  cpm.m.a(new cpm.h(cxs.oV, 4, 16, cxs.qh, 1, 3, 30, 0.05F, dfl.f), cpn.a),
                  cpm.m.a(new cpm.h(cxs.oV, 3, 16, cxs.qi, 1, 3, 30, 0.05F, dfl.e), cpn.a),
                  cpm.m.a(new cpm.h(cxs.oV, 3, 16, cxs.qi, 1, 3, 30, 0.05F, dfl.l), cpn.c),
                  cpm.m.a(new cpm.h(cxs.oV, 2, 12, cxs.qj, 1, 3, 30, 0.05F, dfl.k), cpn.c),
                  cpm.m.a(new cpm.h(cxs.oV, 2, 6, cxs.qg, 1, 3, 30, 0.05F, dfl.r), cpn.d),
                  cpm.m.a(new cpm.h(cxs.oV, 3, 8, cxs.qh, 1, 3, 30, 0.05F, dfl.q), cpn.d),
                  cpm.m.a(new cpm.h(cxs.oV, 2, 12, cxs.qj, 1, 3, 30, 0.05F, dfl.u), cpn.e),
                  cpm.m.a(new cpm.h(cxs.oV, 3, 12, cxs.qg, 1, 3, 30, 0.05F, dfl.v), cpn.e),
                  cpm.m.a(new cpm.i(cxs.pY, 9, 1, 3, 30, 0.05F, dfl.B), cpn.b),
                  cpm.m.a(new cpm.i(cxs.qb, 8, 1, 3, 30, 0.05F, dfl.A), cpn.b),
                  cpm.m.a(new cpm.i(cxs.pY, 9, 1, 3, 30, 0.05F, dfl.H), cpn.f),
                  cpm.m.a(new cpm.i(cxs.qb, 8, 1, 3, 30, 0.05F, dfl.G), cpn.f),
                  cpm.m.a(new cpm.h(cxs.oV, 4, 18, cxs.qh, 1, 3, 30, 0.05F, dfl.J), cpn.g),
                  cpm.m.a(new cpm.h(cxs.oV, 3, 18, cxs.qi, 1, 3, 30, 0.05F, dfl.I), cpn.g),
                  cpm.m.a(new cpm.b(cxs.aP, 1, 12, 30, 42), cpn.g),
                  cpm.m.a(new cpm.b(cxs.aM, 1, 12, 30, 4), cpn.a, cpn.b, cpn.c, cpn.d, cpn.e, cpn.f)
               }
            )
            .build()
      ),
      cpl.e,
      a(
         ImmutableMap.of(
            1,
            new cpm.g[]{new cpm.b(cxs.rm, 24, 16, 2), new cpm.i(cxs.uZ, 7, 1, 1)},
            2,
            new cpm.g[]{
               new cpm.b(cxs.gg, 11, 16, 10),
               new cpm.m(ImmutableMap.builder().put(cpn.a, t).put(cpn.d, u).put(cpn.c, v).put(cpn.g, w).put(cpn.e, u).put(cpn.b, t).put(cpn.f, w).build()),
               new cpm.m(ImmutableMap.builder().put(cpn.a, u).put(cpn.d, s).put(cpn.c, t).put(cpn.g, u).put(cpn.e, v).put(cpn.b, s).put(cpn.f, v).build()),
               new cpm.m(
                  ImmutableMap.builder().put(cpn.a, x).put(cpn.d, x).put(cpn.c, new cpm.f()).put(cpn.g, y).put(cpn.e, y).put(cpn.b, y).put(cpn.f, x).build()
               )
            },
            3,
            new cpm.g[]{
               new cpm.b(cxs.rq, 1, 12, 20),
               new cpm.l(13, ayg.d, "filled_map.monument", evm.j, 12, 10),
               new cpm.l(12, ayg.m, "filled_map.trial_chambers", evm.I, 12, 10)
            },
            4,
            new cpm.g[]{
               new cpm.i(cxs.uS, 7, 1, 15),
               new cpm.i(cxs.vF, 3, 1, 15),
               new cpm.i(cxs.vQ, 3, 1, 15),
               new cpm.i(cxs.vI, 3, 1, 15),
               new cpm.i(cxs.vT, 3, 1, 15),
               new cpm.i(cxs.vL, 3, 1, 15),
               new cpm.i(cxs.vS, 3, 1, 15),
               new cpm.i(cxs.vK, 3, 1, 15),
               new cpm.i(cxs.vM, 3, 1, 15),
               new cpm.i(cxs.vU, 3, 1, 15),
               new cpm.i(cxs.vP, 3, 1, 15),
               new cpm.i(cxs.vH, 3, 1, 15),
               new cpm.i(cxs.vO, 3, 1, 15),
               new cpm.i(cxs.vR, 3, 1, 15),
               new cpm.i(cxs.vJ, 3, 1, 15),
               new cpm.i(cxs.vG, 3, 1, 15),
               new cpm.i(cxs.vN, 3, 1, 15)
            },
            5,
            new cpm.g[]{new cpm.i(cxs.wS, 8, 1, 30), new cpm.l(14, ayg.c, "filled_map.mansion", evm.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<cpm.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new cpm.g[]{
               new cpm.b(a(czo.a), 1, 1, 1),
               new cpm.b(cxs.qX, 1, 1, 1, 2),
               new cpm.b(cxs.rc, 1, 1, 1, 2),
               new cpm.b(cxs.tb, 1, 1, 1, 3),
               new cpm.b(cxs.uX, 4, 1, 1),
               new cpm.b(cxs.hR, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cpm.g[]{
               new cpm.i(cxs.ij, 1, 1, 6, 1),
               new cpm.i(cxs.lj, 6, 1, 6, 1),
               new cpm.i(cxs.pQ, 1, 4, 2, 1),
               new cpm.i(cxs.E, 3, 3, 6, 1),
               new cpm.i(dkn.ab, 1, 8, 4, 1),
               new cpm.i(dkn.Z, 1, 8, 4, 1),
               new cpm.i(dkn.ad, 1, 8, 4, 1),
               new cpm.i(dkn.aa, 1, 8, 4, 1),
               new cpm.i(dkn.X, 1, 8, 4, 1),
               new cpm.i(dkn.Y, 1, 8, 4, 1),
               new cpm.i(dkn.ac, 1, 8, 4, 1),
               new cpm.e(cxs.pz, 1, 1, 1, 0.2F),
               new cpm.i(b(czo.h), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cpm.g[]{
               new cpm.i(cxs.rg, 3, 1, 4, 1),
               new cpm.i(cxs.rd, 3, 1, 4, 1),
               new cpm.i(cxs.da, 2, 1, 5, 1),
               new cpm.i(cxs.ro, 4, 1, 5, 1),
               new cpm.i(cxs.fH, 2, 1, 5, 1),
               new cpm.i(cxs.wJ, 5, 1, 5, 1),
               new cpm.i(cxs.cV, 1, 1, 12, 1),
               new cpm.i(cxs.dQ, 1, 1, 8, 1),
               new cpm.i(cxs.fx, 1, 1, 4, 1),
               new cpm.i(cxs.dR, 3, 1, 12, 1),
               new cpm.i(cxs.fi, 3, 1, 8, 1),
               new cpm.i(cxs.dr, 1, 1, 12, 1),
               new cpm.i(cxs.ds, 1, 1, 12, 1),
               new cpm.i(cxs.dt, 1, 1, 8, 1),
               new cpm.i(cxs.du, 1, 1, 12, 1),
               new cpm.i(cxs.dv, 1, 1, 12, 1),
               new cpm.i(cxs.dw, 1, 1, 12, 1),
               new cpm.i(cxs.dx, 1, 1, 12, 1),
               new cpm.i(cxs.dy, 1, 1, 12, 1),
               new cpm.i(cxs.dz, 1, 1, 12, 1),
               new cpm.i(cxs.dA, 1, 1, 12, 1),
               new cpm.i(cxs.dB, 1, 1, 12, 1),
               new cpm.i(cxs.dC, 1, 1, 7, 1),
               new cpm.i(cxs.pR, 1, 1, 12, 1),
               new cpm.i(cxs.wb, 1, 1, 12, 1),
               new cpm.i(cxs.sM, 1, 1, 12, 1),
               new cpm.i(cxs.sN, 1, 1, 12, 1),
               new cpm.i(cxs.ab, 5, 1, 8, 1),
               new cpm.i(cxs.Z, 5, 1, 8, 1),
               new cpm.i(cxs.ad, 5, 1, 8, 1),
               new cpm.i(cxs.aa, 5, 1, 8, 1),
               new cpm.i(cxs.X, 5, 1, 8, 1),
               new cpm.i(cxs.Y, 5, 1, 8, 1),
               new cpm.i(cxs.ac, 5, 1, 8, 1),
               new cpm.i(cxs.af, 5, 1, 8, 1),
               new cpm.i(cxs.sk, 1, 3, 12, 1),
               new cpm.i(cxs.rW, 1, 3, 12, 1),
               new cpm.i(cxs.sh, 1, 3, 12, 1),
               new cpm.i(cxs.sc, 1, 3, 12, 1),
               new cpm.i(cxs.sl, 1, 3, 12, 1),
               new cpm.i(cxs.sj, 1, 3, 12, 1),
               new cpm.i(cxs.se, 1, 3, 12, 1),
               new cpm.i(cxs.rY, 1, 3, 12, 1),
               new cpm.i(cxs.sa, 1, 3, 12, 1),
               new cpm.i(cxs.sd, 1, 3, 12, 1),
               new cpm.i(cxs.sg, 1, 3, 12, 1),
               new cpm.i(cxs.rZ, 1, 3, 12, 1),
               new cpm.i(cxs.sb, 1, 3, 12, 1),
               new cpm.i(cxs.rX, 1, 3, 12, 1),
               new cpm.i(cxs.si, 1, 3, 12, 1),
               new cpm.i(cxs.sf, 1, 3, 12, 1),
               new cpm.i(cxs.kL, 3, 1, 8, 1),
               new cpm.i(cxs.kM, 3, 1, 8, 1),
               new cpm.i(cxs.kN, 3, 1, 8, 1),
               new cpm.i(cxs.kO, 3, 1, 8, 1),
               new cpm.i(cxs.kK, 3, 1, 8, 1),
               new cpm.i(cxs.gi, 1, 3, 4, 1),
               new cpm.i(cxs.dH, 1, 3, 4, 1),
               new cpm.i(cxs.dI, 1, 3, 4, 1),
               new cpm.i(cxs.go, 1, 5, 2, 1),
               new cpm.i(cxs.ea, 1, 2, 5, 1),
               new cpm.i(cxs.ah, 1, 8, 8, 1),
               new cpm.i(cxs.ak, 1, 4, 6, 1),
               new cpm.i(cxs.yf, 1, 2, 5, 1),
               new cpm.i(cxs.F, 1, 2, 5, 1),
               new cpm.i(cxs.dU, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static cpm.g a(int $$0) {
      return new cpm.m(
         ImmutableMap.builder()
            .put(cpn.a, new cpm.d($$0, axx.w))
            .put(cpn.b, new cpm.d($$0, axx.x))
            .put(cpn.c, new cpm.d($$0, axx.y))
            .put(cpn.d, new cpm.d($$0, axx.z))
            .put(cpn.e, new cpm.d($$0, axx.A))
            .put(cpn.f, new cpm.d($$0, axx.B))
            .put(cpn.g, new cpm.d($$0, axx.C))
            .build()
      );
   }

   private static cpm.g a() {
      return new cpm.m(
         ImmutableMap.builder()
            .put(cpn.a, new cpm.d(30, 3, 3, axx.D))
            .put(cpn.b, new cpm.d(30, 2, 2, axx.E))
            .put(cpn.c, new cpm.d(30, 3, 3, axx.F))
            .put(cpn.d, new cpm.d(30, 3, 3, axx.G))
            .put(cpn.e, new cpm.d(30, axx.H))
            .put(cpn.f, new cpm.d(30, axx.I))
            .put(cpn.g, new cpm.d(30, 2, 2, axx.J))
            .build()
      );
   }

   private static Int2ObjectMap<cpm.g[]> a(ImmutableMap<Integer, cpm.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static dgc a(jq<czl> $$0) {
      return new dgc(cxs.sZ).a($$1 -> $$1.a(ku.Q, new czn($$0)));
   }

   private static cxo b(jq<czl> $$0) {
      return czn.a(cxs.sZ, $$0);
   }

   static class a implements cpm.g {
      private final cxk a;
      private final int b;
      private final int c;
      private final int d;

      public a(cxk $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(cxk $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public dge a(bvj $$0, bam $$1) {
         dgc $$2 = new dgc(cxs.oW, this.b);
         cxo $$3 = new cxo(this.a);
         if ($$3.a(ayd.bR)) {
            List<cwm> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = dac.a($$3, $$4);
         }

         return new dge($$2, $$3, this.c, this.d, 0.2F);
      }

      private static cwm a(bam $$0) {
         return cwm.a(cwl.a($$0.a(16)));
      }
   }

   static class b implements cpm.g {
      private final dgc a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(dhg $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(dhg $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new dgc($$0.j(), $$1), $$2, $$3, $$4);
      }

      public b(dgc $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public dge a(bvj $$0, bam $$1) {
         return new dge(this.a, new cxo(cxs.oW, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements cpm.g {
      private final Map<cpn, cxk> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<cpn, cxk> $$3) {
         ma.w.s().filter($$1x -> !$$3.containsKey($$1x)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + ma.w.b($$0x));
         });
         this.a = $$3;
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Nullable
      @Override
      public dge a(bvj $$0, bam $$1) {
         if ($$0 instanceof cpk $$2) {
            dgc $$3 = new dgc(this.a.get($$2.gy().a()), this.b);
            return new dge($$3, new cxo(cxs.oW), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements cpm.g {
      private final int a;
      private final ayk<ddy> b;
      private final int c;
      private final int d;

      public d(int $$0, ayk<ddy> $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, ayk<ddy> $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = $$3;
      }

      @Override
      public dge a(bvj $$0, bam $$1) {
         Optional<jq<ddy>> $$2 = $$0.dW().K_().e(mb.aO).a(this.b, $$1);
         int $$9;
         cxo $$8;
         if (!$$2.isEmpty()) {
            jq<ddy> $$3 = $$2.get();
            ddy $$4 = $$3.a();
            int $$5 = Math.max($$4.d(), this.c);
            int $$6 = Math.min($$4.e(), this.d);
            int $$7 = bae.a($$1, $$5, $$6);
            $$8 = dea.a(new deb($$3, $$7));
            $$9 = 2 + $$1.a(5 + $$7 * 10) + 3 * $$7;
            if ($$3.a(axx.j)) {
               $$9 *= 2;
            }

            if ($$9 > 64) {
               $$9 = 64;
            }
         } else {
            $$9 = 1;
            $$8 = new cxo(cxs.rn);
         }

         return new dge(new dgc(cxs.oW, $$9), Optional.of(new dgc(cxs.rn)), $$8, 12, this.a, 0.2F);
      }
   }

   static class e implements cpm.g {
      private final cxo a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(cxk $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(cxk $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new cxo($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public dge a(bvj $$0, bam $$1) {
         int $$2 = 5 + $$1.a(15);
         ke $$3 = $$0.dW().K_();
         Optional<ju.c<ddy>> $$4 = $$3.e(mb.aO).a(axx.m);
         cxo $$5 = dea.a($$1, new cxo(this.a.h()), $$2, $$3, $$4);
         int $$6 = Math.min(this.b + $$2, 64);
         dgc $$7 = new dgc(cxs.oW, $$6);
         return new dge($$7, $$5, this.c, this.d, this.e);
      }
   }

   static class f implements cpm.g {
      @Override
      public dge a(bvj $$0, bam $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      dge a(bvj var1, bam var2);
   }

   static class h implements cpm.g {
      private final dgc a;
      private final int b;
      private final cxo c;
      private final int d;
      private final int e;
      private final float f;
      private final Optional<aly<dfg>> g;

      public h(dhg $$0, int $$1, int $$2, cxk $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new cxo($$3), $$4, $$5, $$6, $$7);
      }

      private h(dhg $$0, int $$1, int $$2, cxo $$3, int $$4, int $$5, int $$6, float $$7) {
         this(new dgc($$0, $$1), $$2, $$3.c($$4), $$5, $$6, $$7, Optional.empty());
      }

      h(dhg $$0, int $$1, int $$2, dhg $$3, int $$4, int $$5, int $$6, float $$7, aly<dfg> $$8) {
         this(new dgc($$0, $$1), $$2, new cxo($$3, $$4), $$5, $$6, $$7, Optional.of($$8));
      }

      public h(dgc $$0, int $$1, cxo $$2, int $$3, int $$4, float $$5, Optional<aly<dfg>> $$6) {
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
      public dge a(bvj $$0, bam $$1) {
         cxo $$2 = this.c.v();
         dhh $$3 = $$0.dW();
         this.g.ifPresent($$4 -> dea.a($$2, $$3.K_(), (aly<dfg>)$$4, $$3.d_($$0.dw()), $$1));
         return new dge(new dgc(cxs.oW, this.b), Optional.of(this.a), $$2, 0, this.d, this.e, this.f);
      }
   }

   static class i implements cpm.g {
      private final cxo a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;
      private final Optional<aly<dfg>> f;

      public i(dkl $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cxo($$0), $$1, $$2, $$3, $$4);
      }

      public i(cxk $$0, int $$1, int $$2, int $$3) {
         this(new cxo($$0), $$1, $$2, 12, $$3);
      }

      public i(cxk $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cxo($$0), $$1, $$2, $$3, $$4);
      }

      public i(cxo $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(cxk $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new cxo($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(cxk $$0, int $$1, int $$2, int $$3, int $$4, float $$5, aly<dfg> $$6) {
         this(new cxo($$0), $$1, $$2, $$3, $$4, $$5, Optional.of($$6));
      }

      public i(cxo $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this($$0, $$1, $$2, $$3, $$4, $$5, Optional.empty());
      }

      public i(cxo $$0, int $$1, int $$2, int $$3, int $$4, float $$5, Optional<aly<dfg>> $$6) {
         this.a = $$0;
         this.b = $$1;
         this.a.e($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
         this.f = $$6;
      }

      @Override
      public dge a(bvj $$0, bam $$1) {
         cxo $$2 = this.a.v();
         dhh $$3 = $$0.dW();
         this.f.ifPresent($$4 -> dea.a($$2, $$3.K_(), (aly<dfg>)$$4, $$3.d_($$0.dw()), $$1));
         return new dge(new dgc(cxs.oW, this.b), $$2, this.c, this.d, this.e);
      }
   }

   static class j implements cpm.g {
      private final dap a;
      private final int b;
      private final float c;

      public j(jq<bum> $$0, int $$1, int $$2) {
         this(new dap(List.of(new dap.a($$0, $$1))), $$2, 0.05F);
      }

      public j(dap $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public dge a(bvj $$0, bam $$1) {
         cxo $$2 = new cxo(cxs.wM, 1);
         $$2.b(ku.R, this.a);
         return new dge(new dgc(cxs.oW), $$2, 12, this.b, this.c);
      }
   }

   static class k implements cpm.g {
      private final cxo a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final cxk f;
      private final int g;
      private final float h;

      public k(cxk $$0, int $$1, cxk $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new cxo($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public dge a(bvj $$0, bam $$1) {
         dgc $$2 = new dgc(cxs.oW, this.c);
         List<jq<czl>> $$3 = ma.h.c().filter($$1x -> !((czl)$$1x.a()).a().isEmpty() && $$0.dW().K().a($$1x)).collect(Collectors.toList());
         jq<czl> $$4 = ae.a($$3, $$1);
         cxo $$5 = new cxo(this.a.h(), this.b);
         $$5.b(ku.Q, new czn($$4));
         return new dge($$2, Optional.of(new dgc(this.f, this.g)), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements cpm.g {
      private final int a;
      private final ayk<eoj> b;
      private final String c;
      private final jq<evl> d;
      private final int e;
      private final int f;

      public l(int $$0, ayk<eoj> $$1, String $$2, jq<evl> $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public dge a(bvj $$0, bam $$1) {
         if (!($$0.dW() instanceof ash)) {
            return null;
         } else {
            ash $$2 = (ash)$$0.dW();
            jh $$3 = $$2.a(this.b, $$0.dw(), 100, true);
            if ($$3 != null) {
               cxo $$4 = cyb.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               cyb.a($$2, $$4);
               evq.a($$4, $$3, "+", this.d);
               $$4.b(ku.h, xv.c(this.c));
               return new dge(new dgc(cxs.oW, this.a), Optional.of(new dgc(cxs.rq)), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static record m(Map<cpn, cpm.g> a) implements cpm.g {
      public static cpm.m a(cpm.g $$0, cpn... $$1) {
         return new cpm.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public dge a(bvj $$0, bam $$1) {
         if ($$0 instanceof cpk $$2) {
            cpn $$3 = $$2.gy().a();
            cpm.g $$4 = this.a.get($$3);
            return $$4 == null ? null : $$4.a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
