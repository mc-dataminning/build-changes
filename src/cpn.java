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

public class cpn {
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
   public static final Map<cpm, Int2ObjectMap<cpn.g[]>> a = ae.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            cpm.g,
            a(
               ImmutableMap.of(
                  1,
                  new cpn.g[]{
                     new cpn.b(cxt.pS, 20, 16, 2),
                     new cpn.b(cxt.uW, 26, 16, 2),
                     new cpn.b(cxt.uV, 22, 16, 2),
                     new cpn.b(cxt.wa, 15, 16, 2),
                     new cpn.i(cxt.pT, 1, 6, 16, 1)
                  },
                  2,
                  new cpn.g[]{new cpn.b(dko.fn, 6, 12, 10), new cpn.i(cxt.vj, 1, 4, 5), new cpn.i(cxt.oQ, 1, 4, 16, 5)},
                  3,
                  new cpn.g[]{new cpn.i(cxt.sG, 3, 18, 10), new cpn.b(dko.fo, 4, 12, 20)},
                  4,
                  new cpn.g[]{
                     new cpn.i(dko.et, 1, 1, 12, 15),
                     new cpn.j(bur.p, 100, 15),
                     new cpn.j(bur.h, 160, 15),
                     new cpn.j(bur.r, 140, 15),
                     new cpn.j(bur.o, 120, 15),
                     new cpn.j(bur.s, 280, 15),
                     new cpn.j(bur.w, 7, 15)
                  },
                  5,
                  new cpn.g[]{new cpn.i(cxt.va, 3, 3, 30), new cpn.i(cxt.th, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            cpm.h,
            a(
               ImmutableMap.of(
                  1,
                  new cpn.g[]{
                     new cpn.b(cxt.pO, 20, 16, 2),
                     new cpn.b(cxt.oT, 10, 16, 2),
                     new cpn.h(cxt.rN, 6, 1, cxt.rR, 6, 16, 1, 0.05F),
                     new cpn.i(cxt.rf, 3, 1, 16, 1)
                  },
                  2,
                  new cpn.g[]{new cpn.b(cxt.rN, 15, 16, 10), new cpn.h(cxt.rO, 6, 1, cxt.rS, 6, 16, 5, 0.05F), new cpn.i(cxt.xn, 2, 1, 5)},
                  3,
                  new cpn.g[]{new cpn.b(cxt.rO, 13, 16, 20), new cpn.e(cxt.rJ, 3, 3, 10, 0.2F)},
                  4,
                  new cpn.g[]{new cpn.b(cxt.rP, 6, 12, 30)},
                  5,
                  new cpn.g[]{
                     new cpn.b(cxt.rQ, 4, 12, 30),
                     new cpn.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(cpo.c, cxt.oo)
                           .put(cpo.g, cxt.oq)
                           .put(cpo.e, cxt.oq)
                           .put(cpo.a, cxt.ou)
                           .put(cpo.b, cxt.ou)
                           .put(cpo.d, cxt.ow)
                           .put(cpo.f, cxt.oA)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            cpm.n,
            a(
               ImmutableMap.of(
                  1,
                  new cpn.g[]{
                     new cpn.b(dko.bH, 18, 16, 2),
                     new cpn.b(dko.bT, 18, 16, 2),
                     new cpn.b(dko.bW, 18, 16, 2),
                     new cpn.b(dko.bO, 18, 16, 2),
                     new cpn.i(cxt.sJ, 2, 1, 1)
                  },
                  2,
                  new cpn.g[]{
                     new cpn.b(cxt.rW, 12, 16, 10),
                     new cpn.b(cxt.sd, 12, 16, 10),
                     new cpn.b(cxt.sl, 12, 16, 10),
                     new cpn.b(cxt.rZ, 12, 16, 10),
                     new cpn.b(cxt.sb, 12, 16, 10),
                     new cpn.i(dko.bH, 1, 1, 16, 5),
                     new cpn.i(dko.bI, 1, 1, 16, 5),
                     new cpn.i(dko.bJ, 1, 1, 16, 5),
                     new cpn.i(dko.bK, 1, 1, 16, 5),
                     new cpn.i(dko.bL, 1, 1, 16, 5),
                     new cpn.i(dko.bM, 1, 1, 16, 5),
                     new cpn.i(dko.bN, 1, 1, 16, 5),
                     new cpn.i(dko.bO, 1, 1, 16, 5),
                     new cpn.i(dko.bP, 1, 1, 16, 5),
                     new cpn.i(dko.bQ, 1, 1, 16, 5),
                     new cpn.i(dko.bR, 1, 1, 16, 5),
                     new cpn.i(dko.bS, 1, 1, 16, 5),
                     new cpn.i(dko.bT, 1, 1, 16, 5),
                     new cpn.i(dko.bU, 1, 1, 16, 5),
                     new cpn.i(dko.bV, 1, 1, 16, 5),
                     new cpn.i(dko.bW, 1, 1, 16, 5),
                     new cpn.i(dko.iB, 1, 4, 16, 5),
                     new cpn.i(dko.iC, 1, 4, 16, 5),
                     new cpn.i(dko.iD, 1, 4, 16, 5),
                     new cpn.i(dko.iE, 1, 4, 16, 5),
                     new cpn.i(dko.iF, 1, 4, 16, 5),
                     new cpn.i(dko.iG, 1, 4, 16, 5),
                     new cpn.i(dko.iH, 1, 4, 16, 5),
                     new cpn.i(dko.iI, 1, 4, 16, 5),
                     new cpn.i(dko.iJ, 1, 4, 16, 5),
                     new cpn.i(dko.iK, 1, 4, 16, 5),
                     new cpn.i(dko.iL, 1, 4, 16, 5),
                     new cpn.i(dko.iM, 1, 4, 16, 5),
                     new cpn.i(dko.iN, 1, 4, 16, 5),
                     new cpn.i(dko.iO, 1, 4, 16, 5),
                     new cpn.i(dko.iP, 1, 4, 16, 5),
                     new cpn.i(dko.iQ, 1, 4, 16, 5)
                  },
                  3,
                  new cpn.g[]{
                     new cpn.b(cxt.sa, 12, 16, 20),
                     new cpn.b(cxt.se, 12, 16, 20),
                     new cpn.b(cxt.rX, 12, 16, 20),
                     new cpn.b(cxt.sk, 12, 16, 20),
                     new cpn.b(cxt.sc, 12, 16, 20),
                     new cpn.i(dko.bg, 3, 1, 12, 10),
                     new cpn.i(dko.bk, 3, 1, 12, 10),
                     new cpn.i(dko.bu, 3, 1, 12, 10),
                     new cpn.i(dko.bv, 3, 1, 12, 10),
                     new cpn.i(dko.br, 3, 1, 12, 10),
                     new cpn.i(dko.bs, 3, 1, 12, 10),
                     new cpn.i(dko.bp, 3, 1, 12, 10),
                     new cpn.i(dko.bn, 3, 1, 12, 10),
                     new cpn.i(dko.bt, 3, 1, 12, 10),
                     new cpn.i(dko.bj, 3, 1, 12, 10),
                     new cpn.i(dko.bo, 3, 1, 12, 10),
                     new cpn.i(dko.bl, 3, 1, 12, 10),
                     new cpn.i(dko.bi, 3, 1, 12, 10),
                     new cpn.i(dko.bh, 3, 1, 12, 10),
                     new cpn.i(dko.bm, 3, 1, 12, 10),
                     new cpn.i(dko.bq, 3, 1, 12, 10)
                  },
                  4,
                  new cpn.g[]{
                     new cpn.b(cxt.si, 12, 16, 30),
                     new cpn.b(cxt.sg, 12, 16, 30),
                     new cpn.b(cxt.sh, 12, 16, 30),
                     new cpn.b(cxt.sj, 12, 16, 30),
                     new cpn.b(cxt.rY, 12, 16, 30),
                     new cpn.b(cxt.sf, 12, 16, 30),
                     new cpn.i(cxt.vF, 3, 1, 12, 15),
                     new cpn.i(cxt.vQ, 3, 1, 12, 15),
                     new cpn.i(cxt.vI, 3, 1, 12, 15),
                     new cpn.i(cxt.vT, 3, 1, 12, 15),
                     new cpn.i(cxt.vL, 3, 1, 12, 15),
                     new cpn.i(cxt.vS, 3, 1, 12, 15),
                     new cpn.i(cxt.vK, 3, 1, 12, 15),
                     new cpn.i(cxt.vM, 3, 1, 12, 15),
                     new cpn.i(cxt.vU, 3, 1, 12, 15),
                     new cpn.i(cxt.vP, 3, 1, 12, 15),
                     new cpn.i(cxt.vH, 3, 1, 12, 15),
                     new cpn.i(cxt.vO, 3, 1, 12, 15),
                     new cpn.i(cxt.vR, 3, 1, 12, 15),
                     new cpn.i(cxt.vJ, 3, 1, 12, 15),
                     new cpn.i(cxt.vG, 3, 1, 12, 15),
                     new cpn.i(cxt.vN, 3, 1, 12, 15)
                  },
                  5,
                  new cpn.g[]{new cpn.i(cxt.qv, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            cpm.i,
            a(
               ImmutableMap.of(
                  1,
                  new cpn.g[]{new cpn.b(cxt.pM, 32, 16, 2), new cpn.i(cxt.oS, 1, 16, 1), new cpn.h(dko.O, 10, 1, cxt.qs, 10, 12, 1, 0.05F)},
                  2,
                  new cpn.g[]{new cpn.b(cxt.qs, 26, 12, 10), new cpn.i(cxt.oR, 2, 1, 5)},
                  3,
                  new cpn.g[]{new cpn.b(cxt.pO, 14, 16, 20), new cpn.i(cxt.wL, 3, 1, 10)},
                  4,
                  new cpn.g[]{new cpn.b(cxt.pP, 24, 16, 30), new cpn.e(cxt.oR, 2, 3, 15)},
                  5,
                  new cpn.g[]{new cpn.b(cxt.mp, 8, 12, 30), new cpn.e(cxt.wL, 3, 3, 15), new cpn.k(cxt.oS, 5, cxt.wg, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            cpm.k,
            a(
               ImmutableMap.builder()
                  .put(1, new cpn.g[]{new cpn.b(cxt.rm, 24, 16, 2), new cpn.d(1, axx.i), new cpn.i(dko.cs, 9, 1, 12, 1)})
                  .put(2, new cpn.g[]{new cpn.b(cxt.rn, 4, 12, 10), new cpn.d(5, axx.i), new cpn.i(cxt.xj, 1, 1, 5)})
                  .put(3, new cpn.g[]{new cpn.b(cxt.rT, 5, 12, 20), new cpn.d(10, axx.i), new cpn.i(cxt.cN, 1, 4, 10)})
                  .put(4, new cpn.g[]{new cpn.b(cxt.uO, 2, 12, 30), new cpn.d(15, axx.i), new cpn.i(cxt.rK, 5, 1, 15), new cpn.i(cxt.rq, 4, 1, 15)})
                  .put(5, new cpn.g[]{new cpn.i(cxt.vB, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            cpm.e,
            a(
               ImmutableMap.of(
                  1,
                  new cpn.g[]{new cpn.b(cxt.rm, 24, 16, 2), new cpn.i(cxt.uZ, 7, 1, 1)},
                  2,
                  new cpn.g[]{new cpn.b(cxt.gg, 11, 16, 10), new cpn.l(13, ayg.d, "filled_map.monument", evn.j, 12, 5)},
                  3,
                  new cpn.g[]{
                     new cpn.b(cxt.rq, 1, 12, 20),
                     new cpn.l(14, ayg.c, "filled_map.mansion", evn.i, 12, 10),
                     new cpn.l(12, ayg.m, "filled_map.trial_chambers", evn.I, 12, 10)
                  },
                  4,
                  new cpn.g[]{
                     new cpn.i(cxt.uS, 7, 1, 15),
                     new cpn.i(cxt.vF, 3, 1, 15),
                     new cpn.i(cxt.vQ, 3, 1, 15),
                     new cpn.i(cxt.vI, 3, 1, 15),
                     new cpn.i(cxt.vT, 3, 1, 15),
                     new cpn.i(cxt.vL, 3, 1, 15),
                     new cpn.i(cxt.vS, 3, 1, 15),
                     new cpn.i(cxt.vK, 3, 1, 15),
                     new cpn.i(cxt.vM, 3, 1, 15),
                     new cpn.i(cxt.vU, 3, 1, 15),
                     new cpn.i(cxt.vP, 3, 1, 15),
                     new cpn.i(cxt.vH, 3, 1, 15),
                     new cpn.i(cxt.vO, 3, 1, 15),
                     new cpn.i(cxt.vR, 3, 1, 15),
                     new cpn.i(cxt.vJ, 3, 1, 15),
                     new cpn.i(cxt.vG, 3, 1, 15),
                     new cpn.i(cxt.vN, 3, 1, 15)
                  },
                  5,
                  new cpn.g[]{new cpn.i(cxt.wS, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            cpm.f,
            a(
               ImmutableMap.of(
                  1,
                  new cpn.g[]{new cpn.b(cxt.sS, 32, 16, 2), new cpn.i(cxt.lV, 1, 2, 1)},
                  2,
                  new cpn.g[]{new cpn.b(cxt.pf, 3, 12, 10), new cpn.i(cxt.oX, 1, 1, 5)},
                  3,
                  new cpn.g[]{new cpn.b(cxt.vt, 2, 12, 20), new cpn.i(dko.ep, 4, 1, 12, 10)},
                  4,
                  new cpn.g[]{new cpn.b(cxt.oL, 4, 12, 30), new cpn.b(cxt.sY, 9, 12, 30), new cpn.i(cxt.sT, 5, 1, 15)},
                  5,
                  new cpn.g[]{new cpn.b(cxt.sX, 22, 12, 30), new cpn.i(cxt.uL, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            cpm.c,
            a(
               ImmutableMap.of(
                  1,
                  new cpn.g[]{
                     new cpn.b(cxt.oT, 15, 16, 2),
                     new cpn.i(new cxp(cxt.qe), 7, 1, 12, 1, 0.2F),
                     new cpn.i(new cxp(cxt.qf), 4, 1, 12, 1, 0.2F),
                     new cpn.i(new cxp(cxt.qc), 5, 1, 12, 1, 0.2F),
                     new cpn.i(new cxp(cxt.qd), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cpn.g[]{
                     new cpn.b(cxt.pb, 4, 12, 10),
                     new cpn.i(new cxp(cxt.xi), 36, 1, 12, 5, 0.2F),
                     new cpn.i(new cxp(cxt.qb), 1, 1, 12, 5, 0.2F),
                     new cpn.i(new cxp(cxt.qa), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new cpn.g[]{
                     new cpn.b(cxt.qY, 1, 12, 20),
                     new cpn.b(cxt.oV, 1, 12, 20),
                     new cpn.i(new cxp(cxt.pY), 1, 1, 12, 10, 0.2F),
                     new cpn.i(new cxp(cxt.pZ), 4, 1, 12, 10, 0.2F),
                     new cpn.i(new cxp(cxt.wi), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new cpn.g[]{new cpn.e(cxt.qi, 14, 3, 15, 0.2F), new cpn.e(cxt.qj, 8, 3, 15, 0.2F)},
                  5,
                  new cpn.g[]{new cpn.e(cxt.qg, 8, 3, 30, 0.2F), new cpn.e(cxt.qh, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cpm.p,
            a(
               ImmutableMap.of(
                  1,
                  new cpn.g[]{new cpn.b(cxt.oT, 15, 16, 2), new cpn.i(new cxp(cxt.pA), 3, 1, 12, 1, 0.2F), new cpn.e(cxt.px, 2, 3, 1)},
                  2,
                  new cpn.g[]{new cpn.b(cxt.pb, 4, 12, 10), new cpn.i(new cxp(cxt.xi), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cpn.g[]{new cpn.b(cxt.qs, 24, 12, 20)},
                  4,
                  new cpn.g[]{new cpn.b(cxt.oV, 1, 12, 30), new cpn.e(cxt.pF, 12, 3, 15, 0.2F)},
                  5,
                  new cpn.g[]{new cpn.e(cxt.pC, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cpm.o,
            a(
               ImmutableMap.of(
                  1,
                  new cpn.g[]{
                     new cpn.b(cxt.oT, 15, 16, 2),
                     new cpn.i(new cxp(cxt.pq), 1, 1, 12, 1, 0.2F),
                     new cpn.i(new cxp(cxt.po), 1, 1, 12, 1, 0.2F),
                     new cpn.i(new cxp(cxt.pp), 1, 1, 12, 1, 0.2F),
                     new cpn.i(new cxp(cxt.pr), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cpn.g[]{new cpn.b(cxt.pb, 4, 12, 10), new cpn.i(new cxp(cxt.xi), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cpn.g[]{
                     new cpn.b(cxt.qs, 30, 12, 20),
                     new cpn.e(cxt.pA, 1, 3, 10, 0.2F),
                     new cpn.e(cxt.py, 2, 3, 10, 0.2F),
                     new cpn.e(cxt.pz, 3, 3, 10, 0.2F),
                     new cpn.i(new cxp(cxt.pG), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new cpn.g[]{new cpn.b(cxt.oV, 1, 12, 30), new cpn.e(cxt.pF, 12, 3, 15, 0.2F), new cpn.e(cxt.pD, 5, 3, 15, 0.2F)},
                  5,
                  new cpn.g[]{new cpn.e(cxt.pE, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cpm.d,
            a(
               ImmutableMap.of(
                  1,
                  new cpn.g[]{new cpn.b(cxt.sQ, 14, 16, 2), new cpn.b(cxt.qt, 7, 16, 2), new cpn.b(cxt.vq, 4, 16, 2), new cpn.i(cxt.vs, 1, 1, 1)},
                  2,
                  new cpn.g[]{new cpn.b(cxt.oT, 15, 16, 2), new cpn.i(cxt.qu, 1, 5, 16, 5), new cpn.i(cxt.sR, 1, 8, 16, 5)},
                  3,
                  new cpn.g[]{new cpn.b(cxt.vD, 7, 16, 20), new cpn.b(cxt.sO, 10, 16, 20)},
                  4,
                  new cpn.g[]{new cpn.b(cxt.rl, 10, 12, 30)},
                  5,
                  new cpn.g[]{new cpn.b(cxt.xl, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            cpm.j,
            a(
               ImmutableMap.of(
                  1,
                  new cpn.g[]{new cpn.b(cxt.rb, 6, 16, 2), new cpn.a(cxt.pW, 3), new cpn.a(cxt.pV, 7)},
                  2,
                  new cpn.g[]{new cpn.b(cxt.qs, 26, 12, 10), new cpn.a(cxt.pU, 5, 12, 5), new cpn.a(cxt.pX, 4, 12, 5)},
                  3,
                  new cpn.g[]{new cpn.b(cxt.vu, 9, 12, 20), new cpn.a(cxt.pV, 7)},
                  4,
                  new cpn.g[]{new cpn.b(cxt.oL, 4, 12, 30), new cpn.a(cxt.vz, 6, 12, 15)},
                  5,
                  new cpn.g[]{new cpn.i(new cxp(cxt.oe), 6, 1, 12, 30, 0.2F), new cpn.a(cxt.pU, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            cpm.l,
            a(
               ImmutableMap.of(
                  1,
                  new cpn.g[]{new cpn.b(cxt.rk, 10, 16, 2), new cpn.i(cxt.rj, 1, 10, 16, 1)},
                  2,
                  new cpn.g[]{new cpn.b(dko.b, 20, 16, 10), new cpn.i(dko.eY, 1, 4, 16, 5)},
                  3,
                  new cpn.g[]{
                     new cpn.b(dko.c, 16, 16, 20),
                     new cpn.b(dko.g, 16, 16, 20),
                     new cpn.b(dko.e, 16, 16, 20),
                     new cpn.i(dko.sP, 1, 4, 16, 10),
                     new cpn.i(dko.h, 1, 4, 16, 10),
                     new cpn.i(dko.f, 1, 4, 16, 10),
                     new cpn.i(dko.d, 1, 4, 16, 10)
                  },
                  4,
                  new cpn.g[]{
                     new cpn.b(cxt.oY, 12, 12, 30),
                     new cpn.i(dko.hA, 1, 1, 12, 15),
                     new cpn.i(dko.hz, 1, 1, 12, 15),
                     new cpn.i(dko.hK, 1, 1, 12, 15),
                     new cpn.i(dko.hC, 1, 1, 12, 15),
                     new cpn.i(dko.hG, 1, 1, 12, 15),
                     new cpn.i(dko.hH, 1, 1, 12, 15),
                     new cpn.i(dko.hO, 1, 1, 12, 15),
                     new cpn.i(dko.hN, 1, 1, 12, 15),
                     new cpn.i(dko.hF, 1, 1, 12, 15),
                     new cpn.i(dko.hB, 1, 1, 12, 15),
                     new cpn.i(dko.hE, 1, 1, 12, 15),
                     new cpn.i(dko.hM, 1, 1, 12, 15),
                     new cpn.i(dko.hI, 1, 1, 12, 15),
                     new cpn.i(dko.hJ, 1, 1, 12, 15),
                     new cpn.i(dko.hD, 1, 1, 12, 15),
                     new cpn.i(dko.hL, 1, 1, 12, 15),
                     new cpn.i(dko.lC, 1, 1, 12, 15),
                     new cpn.i(dko.lB, 1, 1, 12, 15),
                     new cpn.i(dko.lM, 1, 1, 12, 15),
                     new cpn.i(dko.lE, 1, 1, 12, 15),
                     new cpn.i(dko.lI, 1, 1, 12, 15),
                     new cpn.i(dko.lJ, 1, 1, 12, 15),
                     new cpn.i(dko.lQ, 1, 1, 12, 15),
                     new cpn.i(dko.lP, 1, 1, 12, 15),
                     new cpn.i(dko.lH, 1, 1, 12, 15),
                     new cpn.i(dko.lD, 1, 1, 12, 15),
                     new cpn.i(dko.lG, 1, 1, 12, 15),
                     new cpn.i(dko.lO, 1, 1, 12, 15),
                     new cpn.i(dko.lK, 1, 1, 12, 15),
                     new cpn.i(dko.lL, 1, 1, 12, 15),
                     new cpn.i(dko.lF, 1, 1, 12, 15),
                     new cpn.i(dko.lN, 1, 1, 12, 15)
                  },
                  5,
                  new cpn.g[]{new cpn.i(dko.hv, 1, 1, 12, 30), new cpn.i(dko.ht, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<cpn.g[]> b = a(
      ImmutableMap.of(
         1,
         new cpn.g[]{
            new cpn.i(cxt.da, 2, 1, 5, 1),
            new cpn.i(cxt.ro, 4, 1, 5, 1),
            new cpn.i(cxt.fH, 2, 1, 5, 1),
            new cpn.i(cxt.wJ, 5, 1, 5, 1),
            new cpn.i(cxt.cV, 1, 1, 12, 1),
            new cpn.i(cxt.dQ, 1, 1, 8, 1),
            new cpn.i(cxt.fx, 1, 1, 4, 1),
            new cpn.i(cxt.dR, 3, 1, 12, 1),
            new cpn.i(cxt.fi, 3, 1, 8, 1),
            new cpn.i(cxt.dr, 1, 1, 12, 1),
            new cpn.i(cxt.ds, 1, 1, 12, 1),
            new cpn.i(cxt.dt, 1, 1, 8, 1),
            new cpn.i(cxt.du, 1, 1, 12, 1),
            new cpn.i(cxt.dv, 1, 1, 12, 1),
            new cpn.i(cxt.dw, 1, 1, 12, 1),
            new cpn.i(cxt.dx, 1, 1, 12, 1),
            new cpn.i(cxt.dy, 1, 1, 12, 1),
            new cpn.i(cxt.dz, 1, 1, 12, 1),
            new cpn.i(cxt.dA, 1, 1, 12, 1),
            new cpn.i(cxt.dB, 1, 1, 12, 1),
            new cpn.i(cxt.dC, 1, 1, 7, 1),
            new cpn.i(cxt.pR, 1, 1, 12, 1),
            new cpn.i(cxt.wb, 1, 1, 12, 1),
            new cpn.i(cxt.sM, 1, 1, 12, 1),
            new cpn.i(cxt.sN, 1, 1, 12, 1),
            new cpn.i(cxt.ab, 5, 1, 8, 1),
            new cpn.i(cxt.Z, 5, 1, 8, 1),
            new cpn.i(cxt.ad, 5, 1, 8, 1),
            new cpn.i(cxt.aa, 5, 1, 8, 1),
            new cpn.i(cxt.X, 5, 1, 8, 1),
            new cpn.i(cxt.Y, 5, 1, 8, 1),
            new cpn.i(cxt.ac, 5, 1, 8, 1),
            new cpn.i(cxt.af, 5, 1, 8, 1),
            new cpn.i(cxt.sk, 1, 3, 12, 1),
            new cpn.i(cxt.rW, 1, 3, 12, 1),
            new cpn.i(cxt.sh, 1, 3, 12, 1),
            new cpn.i(cxt.sc, 1, 3, 12, 1),
            new cpn.i(cxt.sl, 1, 3, 12, 1),
            new cpn.i(cxt.sj, 1, 3, 12, 1),
            new cpn.i(cxt.se, 1, 3, 12, 1),
            new cpn.i(cxt.rY, 1, 3, 12, 1),
            new cpn.i(cxt.sa, 1, 3, 12, 1),
            new cpn.i(cxt.sd, 1, 3, 12, 1),
            new cpn.i(cxt.sg, 1, 3, 12, 1),
            new cpn.i(cxt.rZ, 1, 3, 12, 1),
            new cpn.i(cxt.sb, 1, 3, 12, 1),
            new cpn.i(cxt.rX, 1, 3, 12, 1),
            new cpn.i(cxt.si, 1, 3, 12, 1),
            new cpn.i(cxt.sf, 1, 3, 12, 1),
            new cpn.i(cxt.kL, 3, 1, 8, 1),
            new cpn.i(cxt.kM, 3, 1, 8, 1),
            new cpn.i(cxt.kN, 3, 1, 8, 1),
            new cpn.i(cxt.kO, 3, 1, 8, 1),
            new cpn.i(cxt.kK, 3, 1, 8, 1),
            new cpn.i(cxt.gi, 1, 1, 12, 1),
            new cpn.i(cxt.dH, 1, 1, 12, 1),
            new cpn.i(cxt.dI, 1, 1, 12, 1),
            new cpn.i(cxt.go, 1, 2, 5, 1),
            new cpn.i(cxt.ea, 1, 2, 5, 1),
            new cpn.i(cxt.ah, 1, 8, 8, 1),
            new cpn.i(cxt.ak, 1, 4, 6, 1),
            new cpn.i(cxt.yf, 1, 2, 5, 1),
            new cpn.i(cxt.F, 1, 2, 5, 1),
            new cpn.i(cxt.dU, 1, 2, 5, 1)
         },
         2,
         new cpn.g[]{
            new cpn.i(cxt.rg, 5, 1, 4, 1),
            new cpn.i(cxt.rd, 5, 1, 4, 1),
            new cpn.i(cxt.ij, 3, 1, 6, 1),
            new cpn.i(cxt.lj, 6, 1, 6, 1),
            new cpn.i(cxt.pQ, 1, 1, 8, 1),
            new cpn.i(cxt.E, 3, 3, 6, 1)
         }
      )
   );
   private static final cpn.l s = new cpn.l(8, ayg.f, "filled_map.village_desert", evn.B, 12, 5);
   private static final cpn.l t = new cpn.l(8, ayg.e, "filled_map.village_savanna", evn.D, 12, 5);
   private static final cpn.l u = new cpn.l(8, ayg.g, "filled_map.village_plains", evn.C, 12, 5);
   private static final cpn.l v = new cpn.l(8, ayg.h, "filled_map.village_taiga", evn.F, 12, 5);
   private static final cpn.l w = new cpn.l(8, ayg.i, "filled_map.village_snowy", evn.E, 12, 5);
   private static final cpn.l x = new cpn.l(8, ayg.j, "filled_map.explorer_jungle", evn.G, 12, 5);
   private static final cpn.l y = new cpn.l(8, ayg.k, "filled_map.explorer_swamp", evn.H, 12, 5);
   public static final Map<cpm, Int2ObjectMap<cpn.g[]>> c = Map.of(
      cpm.k,
      a(
         ImmutableMap.builder()
            .put(1, new cpn.g[]{new cpn.b(cxt.rm, 24, 16, 2), a(1), new cpn.i(dko.cs, 9, 1, 12, 1)})
            .put(2, new cpn.g[]{new cpn.b(cxt.rn, 4, 12, 10), a(5), new cpn.i(cxt.xj, 1, 1, 5)})
            .put(3, new cpn.g[]{new cpn.b(cxt.rT, 5, 12, 20), a(10), new cpn.i(cxt.cN, 1, 4, 10)})
            .put(4, new cpn.g[]{new cpn.b(cxt.uO, 2, 12, 30), new cpn.i(cxt.rK, 5, 1, 15), new cpn.i(cxt.rq, 4, 1, 15)})
            .put(5, new cpn.g[]{a(), new cpn.i(cxt.vB, 20, 1, 30)})
            .build()
      ),
      cpm.c,
      a(
         ImmutableMap.builder()
            .put(1, new cpn.g[]{new cpn.b(cxt.oT, 15, 12, 2), new cpn.b(cxt.pb, 5, 12, 2)})
            .put(
               2,
               new cpn.g[]{
                  cpn.m.a(new cpn.i(cxt.qf, 4, 1, 12, 5, 0.05F), cpo.a, cpo.c, cpo.d, cpo.e, cpo.g),
                  cpn.m.a(new cpn.i(cxt.qb, 4, 1, 12, 5, 0.05F), cpo.b, cpo.f),
                  cpn.m.a(new cpn.i(cxt.qc, 5, 1, 12, 5, 0.05F), cpo.a, cpo.c, cpo.d, cpo.e, cpo.g),
                  cpn.m.a(new cpn.i(cxt.pY, 5, 1, 12, 5, 0.05F), cpo.b, cpo.f),
                  cpn.m.a(new cpn.i(cxt.qe, 7, 1, 12, 5, 0.05F), cpo.a, cpo.c, cpo.d, cpo.e, cpo.g),
                  cpn.m.a(new cpn.i(cxt.qa, 7, 1, 12, 5, 0.05F), cpo.b, cpo.f),
                  cpn.m.a(new cpn.i(cxt.qd, 9, 1, 12, 5, 0.05F), cpo.a, cpo.c, cpo.d, cpo.e, cpo.g),
                  cpn.m.a(new cpn.i(cxt.pZ, 9, 1, 12, 5, 0.05F), cpo.b, cpo.f)
               }
            )
            .put(3, new cpn.g[]{new cpn.b(cxt.qY, 1, 12, 20), new cpn.i(cxt.wi, 5, 1, 12, 10, 0.05F), new cpn.i(cxt.xi, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new cpn.g[]{
                  cpn.m.a(new cpn.i(cxt.qf, 8, 1, 3, 15, 0.05F, dfm.a), cpo.a),
                  cpn.m.a(new cpn.i(cxt.qc, 9, 1, 3, 15, 0.05F, dfm.d), cpo.a),
                  cpn.m.a(new cpn.i(cxt.qe, 11, 1, 3, 15, 0.05F, dfm.b), cpo.a),
                  cpn.m.a(new cpn.i(cxt.qd, 13, 1, 3, 15, 0.05F, dfm.c), cpo.a),
                  cpn.m.a(new cpn.i(cxt.qf, 8, 1, 3, 15, 0.05F, dfm.g), cpo.c),
                  cpn.m.a(new cpn.i(cxt.qc, 9, 1, 3, 15, 0.05F, dfm.j), cpo.c),
                  cpn.m.a(new cpn.i(cxt.qe, 11, 1, 3, 15, 0.05F, dfm.h), cpo.c),
                  cpn.m.a(new cpn.i(cxt.qd, 13, 1, 3, 15, 0.05F, dfm.i), cpo.c),
                  cpn.m.a(new cpn.i(cxt.qf, 2, 1, 3, 15, 0.05F, dfm.m), cpo.d),
                  cpn.m.a(new cpn.i(cxt.qc, 3, 1, 3, 15, 0.05F, dfm.p), cpo.d),
                  cpn.m.a(new cpn.i(cxt.qe, 5, 1, 3, 15, 0.05F, dfm.n), cpo.d),
                  cpn.m.a(new cpn.i(cxt.qd, 7, 1, 3, 15, 0.05F, dfm.o), cpo.d),
                  cpn.m.a(new cpn.i(cxt.qf, 8, 1, 3, 15, 0.05F, dfm.s), cpo.e),
                  cpn.m.a(new cpn.i(cxt.qc, 9, 1, 3, 15, 0.05F, dfm.t), cpo.e),
                  cpn.m.a(new cpn.i(cxt.qb, 8, 1, 3, 15, 0.05F, dfm.w), cpo.b),
                  cpn.m.a(new cpn.i(cxt.pY, 9, 1, 3, 15, 0.05F, dfm.z), cpo.b),
                  cpn.m.a(new cpn.i(cxt.qa, 11, 1, 3, 15, 0.05F, dfm.x), cpo.b),
                  cpn.m.a(new cpn.i(cxt.pZ, 13, 1, 3, 15, 0.05F, dfm.y), cpo.b),
                  cpn.m.a(new cpn.i(cxt.qb, 8, 1, 3, 15, 0.05F, dfm.C), cpo.f),
                  cpn.m.a(new cpn.i(cxt.pY, 9, 1, 3, 15, 0.05F, dfm.F), cpo.f),
                  cpn.m.a(new cpn.i(cxt.qa, 11, 1, 3, 15, 0.05F, dfm.D), cpo.f),
                  cpn.m.a(new cpn.i(cxt.pZ, 13, 1, 3, 15, 0.05F, dfm.E), cpo.f),
                  cpn.m.a(new cpn.h(cxt.qj, 1, 4, cxt.qi, 1, 3, 15, 0.05F), cpo.g),
                  cpn.m.a(new cpn.h(cxt.qi, 1, 4, cxt.qh, 1, 3, 15, 0.05F), cpo.g),
                  cpn.m.a(new cpn.h(cxt.qg, 1, 4, cxt.qj, 1, 3, 15, 0.05F), cpo.g),
                  cpn.m.a(new cpn.h(cxt.qh, 1, 2, cxt.qg, 1, 3, 15, 0.05F), cpo.g)
               }
            )
            .put(
               5,
               new cpn.g[]{
                  cpn.m.a(new cpn.h(cxt.oV, 4, 16, cxt.qh, 1, 3, 30, 0.05F, dfm.f), cpo.a),
                  cpn.m.a(new cpn.h(cxt.oV, 3, 16, cxt.qi, 1, 3, 30, 0.05F, dfm.e), cpo.a),
                  cpn.m.a(new cpn.h(cxt.oV, 3, 16, cxt.qi, 1, 3, 30, 0.05F, dfm.l), cpo.c),
                  cpn.m.a(new cpn.h(cxt.oV, 2, 12, cxt.qj, 1, 3, 30, 0.05F, dfm.k), cpo.c),
                  cpn.m.a(new cpn.h(cxt.oV, 2, 6, cxt.qg, 1, 3, 30, 0.05F, dfm.r), cpo.d),
                  cpn.m.a(new cpn.h(cxt.oV, 3, 8, cxt.qh, 1, 3, 30, 0.05F, dfm.q), cpo.d),
                  cpn.m.a(new cpn.h(cxt.oV, 2, 12, cxt.qj, 1, 3, 30, 0.05F, dfm.u), cpo.e),
                  cpn.m.a(new cpn.h(cxt.oV, 3, 12, cxt.qg, 1, 3, 30, 0.05F, dfm.v), cpo.e),
                  cpn.m.a(new cpn.i(cxt.pY, 9, 1, 3, 30, 0.05F, dfm.B), cpo.b),
                  cpn.m.a(new cpn.i(cxt.qb, 8, 1, 3, 30, 0.05F, dfm.A), cpo.b),
                  cpn.m.a(new cpn.i(cxt.pY, 9, 1, 3, 30, 0.05F, dfm.H), cpo.f),
                  cpn.m.a(new cpn.i(cxt.qb, 8, 1, 3, 30, 0.05F, dfm.G), cpo.f),
                  cpn.m.a(new cpn.h(cxt.oV, 4, 18, cxt.qh, 1, 3, 30, 0.05F, dfm.J), cpo.g),
                  cpn.m.a(new cpn.h(cxt.oV, 3, 18, cxt.qi, 1, 3, 30, 0.05F, dfm.I), cpo.g),
                  cpn.m.a(new cpn.b(cxt.aP, 1, 12, 30, 42), cpo.g),
                  cpn.m.a(new cpn.b(cxt.aM, 1, 12, 30, 4), cpo.a, cpo.b, cpo.c, cpo.d, cpo.e, cpo.f)
               }
            )
            .build()
      ),
      cpm.e,
      a(
         ImmutableMap.of(
            1,
            new cpn.g[]{new cpn.b(cxt.rm, 24, 16, 2), new cpn.i(cxt.uZ, 7, 1, 1)},
            2,
            new cpn.g[]{
               new cpn.b(cxt.gg, 11, 16, 10),
               new cpn.m(ImmutableMap.builder().put(cpo.a, t).put(cpo.d, u).put(cpo.c, v).put(cpo.g, w).put(cpo.e, u).put(cpo.b, t).put(cpo.f, w).build()),
               new cpn.m(ImmutableMap.builder().put(cpo.a, u).put(cpo.d, s).put(cpo.c, t).put(cpo.g, u).put(cpo.e, v).put(cpo.b, s).put(cpo.f, v).build()),
               new cpn.m(
                  ImmutableMap.builder().put(cpo.a, x).put(cpo.d, x).put(cpo.c, new cpn.f()).put(cpo.g, y).put(cpo.e, y).put(cpo.b, y).put(cpo.f, x).build()
               )
            },
            3,
            new cpn.g[]{
               new cpn.b(cxt.rq, 1, 12, 20),
               new cpn.l(13, ayg.d, "filled_map.monument", evn.j, 12, 10),
               new cpn.l(12, ayg.m, "filled_map.trial_chambers", evn.I, 12, 10)
            },
            4,
            new cpn.g[]{
               new cpn.i(cxt.uS, 7, 1, 15),
               new cpn.i(cxt.vF, 3, 1, 15),
               new cpn.i(cxt.vQ, 3, 1, 15),
               new cpn.i(cxt.vI, 3, 1, 15),
               new cpn.i(cxt.vT, 3, 1, 15),
               new cpn.i(cxt.vL, 3, 1, 15),
               new cpn.i(cxt.vS, 3, 1, 15),
               new cpn.i(cxt.vK, 3, 1, 15),
               new cpn.i(cxt.vM, 3, 1, 15),
               new cpn.i(cxt.vU, 3, 1, 15),
               new cpn.i(cxt.vP, 3, 1, 15),
               new cpn.i(cxt.vH, 3, 1, 15),
               new cpn.i(cxt.vO, 3, 1, 15),
               new cpn.i(cxt.vR, 3, 1, 15),
               new cpn.i(cxt.vJ, 3, 1, 15),
               new cpn.i(cxt.vG, 3, 1, 15),
               new cpn.i(cxt.vN, 3, 1, 15)
            },
            5,
            new cpn.g[]{new cpn.i(cxt.wS, 8, 1, 30), new cpn.l(14, ayg.c, "filled_map.mansion", evn.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<cpn.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new cpn.g[]{
               new cpn.b(a(czp.a), 1, 1, 1),
               new cpn.b(cxt.qX, 1, 1, 1, 2),
               new cpn.b(cxt.rc, 1, 1, 1, 2),
               new cpn.b(cxt.tb, 1, 1, 1, 3),
               new cpn.b(cxt.uX, 4, 1, 1),
               new cpn.b(cxt.hR, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cpn.g[]{
               new cpn.i(cxt.ij, 1, 1, 6, 1),
               new cpn.i(cxt.lj, 6, 1, 6, 1),
               new cpn.i(cxt.pQ, 1, 4, 2, 1),
               new cpn.i(cxt.E, 3, 3, 6, 1),
               new cpn.i(dko.ab, 1, 8, 4, 1),
               new cpn.i(dko.Z, 1, 8, 4, 1),
               new cpn.i(dko.ad, 1, 8, 4, 1),
               new cpn.i(dko.aa, 1, 8, 4, 1),
               new cpn.i(dko.X, 1, 8, 4, 1),
               new cpn.i(dko.Y, 1, 8, 4, 1),
               new cpn.i(dko.ac, 1, 8, 4, 1),
               new cpn.e(cxt.pz, 1, 1, 1, 0.2F),
               new cpn.i(b(czp.h), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cpn.g[]{
               new cpn.i(cxt.rg, 3, 1, 4, 1),
               new cpn.i(cxt.rd, 3, 1, 4, 1),
               new cpn.i(cxt.da, 2, 1, 5, 1),
               new cpn.i(cxt.ro, 4, 1, 5, 1),
               new cpn.i(cxt.fH, 2, 1, 5, 1),
               new cpn.i(cxt.wJ, 5, 1, 5, 1),
               new cpn.i(cxt.cV, 1, 1, 12, 1),
               new cpn.i(cxt.dQ, 1, 1, 8, 1),
               new cpn.i(cxt.fx, 1, 1, 4, 1),
               new cpn.i(cxt.dR, 3, 1, 12, 1),
               new cpn.i(cxt.fi, 3, 1, 8, 1),
               new cpn.i(cxt.dr, 1, 1, 12, 1),
               new cpn.i(cxt.ds, 1, 1, 12, 1),
               new cpn.i(cxt.dt, 1, 1, 8, 1),
               new cpn.i(cxt.du, 1, 1, 12, 1),
               new cpn.i(cxt.dv, 1, 1, 12, 1),
               new cpn.i(cxt.dw, 1, 1, 12, 1),
               new cpn.i(cxt.dx, 1, 1, 12, 1),
               new cpn.i(cxt.dy, 1, 1, 12, 1),
               new cpn.i(cxt.dz, 1, 1, 12, 1),
               new cpn.i(cxt.dA, 1, 1, 12, 1),
               new cpn.i(cxt.dB, 1, 1, 12, 1),
               new cpn.i(cxt.dC, 1, 1, 7, 1),
               new cpn.i(cxt.pR, 1, 1, 12, 1),
               new cpn.i(cxt.wb, 1, 1, 12, 1),
               new cpn.i(cxt.sM, 1, 1, 12, 1),
               new cpn.i(cxt.sN, 1, 1, 12, 1),
               new cpn.i(cxt.ab, 5, 1, 8, 1),
               new cpn.i(cxt.Z, 5, 1, 8, 1),
               new cpn.i(cxt.ad, 5, 1, 8, 1),
               new cpn.i(cxt.aa, 5, 1, 8, 1),
               new cpn.i(cxt.X, 5, 1, 8, 1),
               new cpn.i(cxt.Y, 5, 1, 8, 1),
               new cpn.i(cxt.ac, 5, 1, 8, 1),
               new cpn.i(cxt.af, 5, 1, 8, 1),
               new cpn.i(cxt.sk, 1, 3, 12, 1),
               new cpn.i(cxt.rW, 1, 3, 12, 1),
               new cpn.i(cxt.sh, 1, 3, 12, 1),
               new cpn.i(cxt.sc, 1, 3, 12, 1),
               new cpn.i(cxt.sl, 1, 3, 12, 1),
               new cpn.i(cxt.sj, 1, 3, 12, 1),
               new cpn.i(cxt.se, 1, 3, 12, 1),
               new cpn.i(cxt.rY, 1, 3, 12, 1),
               new cpn.i(cxt.sa, 1, 3, 12, 1),
               new cpn.i(cxt.sd, 1, 3, 12, 1),
               new cpn.i(cxt.sg, 1, 3, 12, 1),
               new cpn.i(cxt.rZ, 1, 3, 12, 1),
               new cpn.i(cxt.sb, 1, 3, 12, 1),
               new cpn.i(cxt.rX, 1, 3, 12, 1),
               new cpn.i(cxt.si, 1, 3, 12, 1),
               new cpn.i(cxt.sf, 1, 3, 12, 1),
               new cpn.i(cxt.kL, 3, 1, 8, 1),
               new cpn.i(cxt.kM, 3, 1, 8, 1),
               new cpn.i(cxt.kN, 3, 1, 8, 1),
               new cpn.i(cxt.kO, 3, 1, 8, 1),
               new cpn.i(cxt.kK, 3, 1, 8, 1),
               new cpn.i(cxt.gi, 1, 3, 4, 1),
               new cpn.i(cxt.dH, 1, 3, 4, 1),
               new cpn.i(cxt.dI, 1, 3, 4, 1),
               new cpn.i(cxt.go, 1, 5, 2, 1),
               new cpn.i(cxt.ea, 1, 2, 5, 1),
               new cpn.i(cxt.ah, 1, 8, 8, 1),
               new cpn.i(cxt.ak, 1, 4, 6, 1),
               new cpn.i(cxt.yf, 1, 2, 5, 1),
               new cpn.i(cxt.F, 1, 2, 5, 1),
               new cpn.i(cxt.dU, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static cpn.g a(int $$0) {
      return new cpn.m(
         ImmutableMap.builder()
            .put(cpo.a, new cpn.d($$0, axx.w))
            .put(cpo.b, new cpn.d($$0, axx.x))
            .put(cpo.c, new cpn.d($$0, axx.y))
            .put(cpo.d, new cpn.d($$0, axx.z))
            .put(cpo.e, new cpn.d($$0, axx.A))
            .put(cpo.f, new cpn.d($$0, axx.B))
            .put(cpo.g, new cpn.d($$0, axx.C))
            .build()
      );
   }

   private static cpn.g a() {
      return new cpn.m(
         ImmutableMap.builder()
            .put(cpo.a, new cpn.d(30, 3, 3, axx.D))
            .put(cpo.b, new cpn.d(30, 2, 2, axx.E))
            .put(cpo.c, new cpn.d(30, 3, 3, axx.F))
            .put(cpo.d, new cpn.d(30, 3, 3, axx.G))
            .put(cpo.e, new cpn.d(30, axx.H))
            .put(cpo.f, new cpn.d(30, axx.I))
            .put(cpo.g, new cpn.d(30, 2, 2, axx.J))
            .build()
      );
   }

   private static Int2ObjectMap<cpn.g[]> a(ImmutableMap<Integer, cpn.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static dgd a(jq<czm> $$0) {
      return new dgd(cxt.sZ).a($$1 -> $$1.a(ku.Q, new czo($$0)));
   }

   private static cxp b(jq<czm> $$0) {
      return czo.a(cxt.sZ, $$0);
   }

   static class a implements cpn.g {
      private final cxl a;
      private final int b;
      private final int c;
      private final int d;

      public a(cxl $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(cxl $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public dgf a(bvk $$0, bam $$1) {
         dgd $$2 = new dgd(cxt.oW, this.b);
         cxp $$3 = new cxp(this.a);
         if ($$3.a(ayd.bR)) {
            List<cwn> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = dad.a($$3, $$4);
         }

         return new dgf($$2, $$3, this.c, this.d, 0.2F);
      }

      private static cwn a(bam $$0) {
         return cwn.a(cwm.a($$0.a(16)));
      }
   }

   static class b implements cpn.g {
      private final dgd a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(dhh $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(dhh $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new dgd($$0.j(), $$1), $$2, $$3, $$4);
      }

      public b(dgd $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public dgf a(bvk $$0, bam $$1) {
         return new dgf(this.a, new cxp(cxt.oW, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements cpn.g {
      private final Map<cpo, cxl> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<cpo, cxl> $$3) {
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
      public dgf a(bvk $$0, bam $$1) {
         if ($$0 instanceof cpl $$2) {
            dgd $$3 = new dgd(this.a.get($$2.gy().a()), this.b);
            return new dgf($$3, new cxp(cxt.oW), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements cpn.g {
      private final int a;
      private final ayk<ddz> b;
      private final int c;
      private final int d;

      public d(int $$0, ayk<ddz> $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, ayk<ddz> $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = $$3;
      }

      @Override
      public dgf a(bvk $$0, bam $$1) {
         Optional<jq<ddz>> $$2 = $$0.dW().K_().e(mb.aO).a(this.b, $$1);
         int $$9;
         cxp $$8;
         if (!$$2.isEmpty()) {
            jq<ddz> $$3 = $$2.get();
            ddz $$4 = $$3.a();
            int $$5 = Math.max($$4.d(), this.c);
            int $$6 = Math.min($$4.e(), this.d);
            int $$7 = bae.a($$1, $$5, $$6);
            $$8 = deb.a(new dec($$3, $$7));
            $$9 = 2 + $$1.a(5 + $$7 * 10) + 3 * $$7;
            if ($$3.a(axx.j)) {
               $$9 *= 2;
            }

            if ($$9 > 64) {
               $$9 = 64;
            }
         } else {
            $$9 = 1;
            $$8 = new cxp(cxt.rn);
         }

         return new dgf(new dgd(cxt.oW, $$9), Optional.of(new dgd(cxt.rn)), $$8, 12, this.a, 0.2F);
      }
   }

   static class e implements cpn.g {
      private final cxp a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(cxl $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(cxl $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new cxp($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public dgf a(bvk $$0, bam $$1) {
         int $$2 = 5 + $$1.a(15);
         ke $$3 = $$0.dW().K_();
         Optional<ju.c<ddz>> $$4 = $$3.e(mb.aO).a(axx.m);
         cxp $$5 = deb.a($$1, new cxp(this.a.h()), $$2, $$3, $$4);
         int $$6 = Math.min(this.b + $$2, 64);
         dgd $$7 = new dgd(cxt.oW, $$6);
         return new dgf($$7, $$5, this.c, this.d, this.e);
      }
   }

   static class f implements cpn.g {
      @Override
      public dgf a(bvk $$0, bam $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      dgf a(bvk var1, bam var2);
   }

   static class h implements cpn.g {
      private final dgd a;
      private final int b;
      private final cxp c;
      private final int d;
      private final int e;
      private final float f;
      private final Optional<aly<dfh>> g;

      public h(dhh $$0, int $$1, int $$2, cxl $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new cxp($$3), $$4, $$5, $$6, $$7);
      }

      private h(dhh $$0, int $$1, int $$2, cxp $$3, int $$4, int $$5, int $$6, float $$7) {
         this(new dgd($$0, $$1), $$2, $$3.c($$4), $$5, $$6, $$7, Optional.empty());
      }

      h(dhh $$0, int $$1, int $$2, dhh $$3, int $$4, int $$5, int $$6, float $$7, aly<dfh> $$8) {
         this(new dgd($$0, $$1), $$2, new cxp($$3, $$4), $$5, $$6, $$7, Optional.of($$8));
      }

      public h(dgd $$0, int $$1, cxp $$2, int $$3, int $$4, float $$5, Optional<aly<dfh>> $$6) {
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
      public dgf a(bvk $$0, bam $$1) {
         cxp $$2 = this.c.v();
         dhi $$3 = $$0.dW();
         this.g.ifPresent($$4 -> deb.a($$2, $$3.K_(), (aly<dfh>)$$4, $$3.d_($$0.dw()), $$1));
         return new dgf(new dgd(cxt.oW, this.b), Optional.of(this.a), $$2, 0, this.d, this.e, this.f);
      }
   }

   static class i implements cpn.g {
      private final cxp a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;
      private final Optional<aly<dfh>> f;

      public i(dkm $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cxp($$0), $$1, $$2, $$3, $$4);
      }

      public i(cxl $$0, int $$1, int $$2, int $$3) {
         this(new cxp($$0), $$1, $$2, 12, $$3);
      }

      public i(cxl $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cxp($$0), $$1, $$2, $$3, $$4);
      }

      public i(cxp $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(cxl $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new cxp($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(cxl $$0, int $$1, int $$2, int $$3, int $$4, float $$5, aly<dfh> $$6) {
         this(new cxp($$0), $$1, $$2, $$3, $$4, $$5, Optional.of($$6));
      }

      public i(cxp $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this($$0, $$1, $$2, $$3, $$4, $$5, Optional.empty());
      }

      public i(cxp $$0, int $$1, int $$2, int $$3, int $$4, float $$5, Optional<aly<dfh>> $$6) {
         this.a = $$0;
         this.b = $$1;
         this.a.e($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
         this.f = $$6;
      }

      @Override
      public dgf a(bvk $$0, bam $$1) {
         cxp $$2 = this.a.v();
         dhi $$3 = $$0.dW();
         this.f.ifPresent($$4 -> deb.a($$2, $$3.K_(), (aly<dfh>)$$4, $$3.d_($$0.dw()), $$1));
         return new dgf(new dgd(cxt.oW, this.b), $$2, this.c, this.d, this.e);
      }
   }

   static class j implements cpn.g {
      private final daq a;
      private final int b;
      private final float c;

      public j(jq<bun> $$0, int $$1, int $$2) {
         this(new daq(List.of(new daq.a($$0, $$1))), $$2, 0.05F);
      }

      public j(daq $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public dgf a(bvk $$0, bam $$1) {
         cxp $$2 = new cxp(cxt.wM, 1);
         $$2.b(ku.R, this.a);
         return new dgf(new dgd(cxt.oW), $$2, 12, this.b, this.c);
      }
   }

   static class k implements cpn.g {
      private final cxp a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final cxl f;
      private final int g;
      private final float h;

      public k(cxl $$0, int $$1, cxl $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new cxp($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public dgf a(bvk $$0, bam $$1) {
         dgd $$2 = new dgd(cxt.oW, this.c);
         List<jq<czm>> $$3 = ma.h.c().filter($$1x -> !((czm)$$1x.a()).a().isEmpty() && $$0.dW().K().a($$1x)).collect(Collectors.toList());
         jq<czm> $$4 = ae.a($$3, $$1);
         cxp $$5 = new cxp(this.a.h(), this.b);
         $$5.b(ku.Q, new czo($$4));
         return new dgf($$2, Optional.of(new dgd(this.f, this.g)), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements cpn.g {
      private final int a;
      private final ayk<eok> b;
      private final String c;
      private final jq<evm> d;
      private final int e;
      private final int f;

      public l(int $$0, ayk<eok> $$1, String $$2, jq<evm> $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public dgf a(bvk $$0, bam $$1) {
         if (!($$0.dW() instanceof ash)) {
            return null;
         } else {
            ash $$2 = (ash)$$0.dW();
            jh $$3 = $$2.a(this.b, $$0.dw(), 100, true);
            if ($$3 != null) {
               cxp $$4 = cyc.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               cyc.a($$2, $$4);
               evr.a($$4, $$3, "+", this.d);
               $$4.b(ku.h, xv.c(this.c));
               return new dgf(new dgd(cxt.oW, this.a), Optional.of(new dgd(cxt.rq)), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static record m(Map<cpo, cpn.g> a) implements cpn.g {
      public static cpn.m a(cpn.g $$0, cpo... $$1) {
         return new cpn.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public dgf a(bvk $$0, bam $$1) {
         if ($$0 instanceof cpl $$2) {
            cpo $$3 = $$2.gy().a();
            cpn.g $$4 = this.a.get($$3);
            return $$4 == null ? null : $$4.a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
