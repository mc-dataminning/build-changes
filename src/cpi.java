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

public class cpi {
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
   public static final Map<cph, Int2ObjectMap<cpi.g[]>> a = ae.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            cph.g,
            a(
               ImmutableMap.of(
                  1,
                  new cpi.g[]{
                     new cpi.b(cxo.pS, 20, 16, 2),
                     new cpi.b(cxo.uW, 26, 16, 2),
                     new cpi.b(cxo.uV, 22, 16, 2),
                     new cpi.b(cxo.wa, 15, 16, 2),
                     new cpi.i(cxo.pT, 1, 6, 16, 1)
                  },
                  2,
                  new cpi.g[]{new cpi.b(dkg.fn, 6, 12, 10), new cpi.i(cxo.vj, 1, 4, 5), new cpi.i(cxo.oQ, 1, 4, 16, 5)},
                  3,
                  new cpi.g[]{new cpi.i(cxo.sG, 3, 18, 10), new cpi.b(dkg.fo, 4, 12, 20)},
                  4,
                  new cpi.g[]{
                     new cpi.i(dkg.et, 1, 1, 12, 15),
                     new cpi.j(bum.p, 100, 15),
                     new cpi.j(bum.h, 160, 15),
                     new cpi.j(bum.r, 140, 15),
                     new cpi.j(bum.o, 120, 15),
                     new cpi.j(bum.s, 280, 15),
                     new cpi.j(bum.w, 7, 15)
                  },
                  5,
                  new cpi.g[]{new cpi.i(cxo.va, 3, 3, 30), new cpi.i(cxo.th, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            cph.h,
            a(
               ImmutableMap.of(
                  1,
                  new cpi.g[]{
                     new cpi.b(cxo.pO, 20, 16, 2),
                     new cpi.b(cxo.oT, 10, 16, 2),
                     new cpi.h(cxo.rN, 6, 1, cxo.rR, 6, 16, 1, 0.05F),
                     new cpi.i(cxo.rf, 3, 1, 16, 1)
                  },
                  2,
                  new cpi.g[]{new cpi.b(cxo.rN, 15, 16, 10), new cpi.h(cxo.rO, 6, 1, cxo.rS, 6, 16, 5, 0.05F), new cpi.i(cxo.xn, 2, 1, 5)},
                  3,
                  new cpi.g[]{new cpi.b(cxo.rO, 13, 16, 20), new cpi.e(cxo.rJ, 3, 3, 10, 0.2F)},
                  4,
                  new cpi.g[]{new cpi.b(cxo.rP, 6, 12, 30)},
                  5,
                  new cpi.g[]{
                     new cpi.b(cxo.rQ, 4, 12, 30),
                     new cpi.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(cpj.c, cxo.oo)
                           .put(cpj.g, cxo.oq)
                           .put(cpj.e, cxo.oq)
                           .put(cpj.a, cxo.ou)
                           .put(cpj.b, cxo.ou)
                           .put(cpj.d, cxo.ow)
                           .put(cpj.f, cxo.oA)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            cph.n,
            a(
               ImmutableMap.of(
                  1,
                  new cpi.g[]{
                     new cpi.b(dkg.bH, 18, 16, 2),
                     new cpi.b(dkg.bT, 18, 16, 2),
                     new cpi.b(dkg.bW, 18, 16, 2),
                     new cpi.b(dkg.bO, 18, 16, 2),
                     new cpi.i(cxo.sJ, 2, 1, 1)
                  },
                  2,
                  new cpi.g[]{
                     new cpi.b(cxo.rW, 12, 16, 10),
                     new cpi.b(cxo.sd, 12, 16, 10),
                     new cpi.b(cxo.sl, 12, 16, 10),
                     new cpi.b(cxo.rZ, 12, 16, 10),
                     new cpi.b(cxo.sb, 12, 16, 10),
                     new cpi.i(dkg.bH, 1, 1, 16, 5),
                     new cpi.i(dkg.bI, 1, 1, 16, 5),
                     new cpi.i(dkg.bJ, 1, 1, 16, 5),
                     new cpi.i(dkg.bK, 1, 1, 16, 5),
                     new cpi.i(dkg.bL, 1, 1, 16, 5),
                     new cpi.i(dkg.bM, 1, 1, 16, 5),
                     new cpi.i(dkg.bN, 1, 1, 16, 5),
                     new cpi.i(dkg.bO, 1, 1, 16, 5),
                     new cpi.i(dkg.bP, 1, 1, 16, 5),
                     new cpi.i(dkg.bQ, 1, 1, 16, 5),
                     new cpi.i(dkg.bR, 1, 1, 16, 5),
                     new cpi.i(dkg.bS, 1, 1, 16, 5),
                     new cpi.i(dkg.bT, 1, 1, 16, 5),
                     new cpi.i(dkg.bU, 1, 1, 16, 5),
                     new cpi.i(dkg.bV, 1, 1, 16, 5),
                     new cpi.i(dkg.bW, 1, 1, 16, 5),
                     new cpi.i(dkg.iB, 1, 4, 16, 5),
                     new cpi.i(dkg.iC, 1, 4, 16, 5),
                     new cpi.i(dkg.iD, 1, 4, 16, 5),
                     new cpi.i(dkg.iE, 1, 4, 16, 5),
                     new cpi.i(dkg.iF, 1, 4, 16, 5),
                     new cpi.i(dkg.iG, 1, 4, 16, 5),
                     new cpi.i(dkg.iH, 1, 4, 16, 5),
                     new cpi.i(dkg.iI, 1, 4, 16, 5),
                     new cpi.i(dkg.iJ, 1, 4, 16, 5),
                     new cpi.i(dkg.iK, 1, 4, 16, 5),
                     new cpi.i(dkg.iL, 1, 4, 16, 5),
                     new cpi.i(dkg.iM, 1, 4, 16, 5),
                     new cpi.i(dkg.iN, 1, 4, 16, 5),
                     new cpi.i(dkg.iO, 1, 4, 16, 5),
                     new cpi.i(dkg.iP, 1, 4, 16, 5),
                     new cpi.i(dkg.iQ, 1, 4, 16, 5)
                  },
                  3,
                  new cpi.g[]{
                     new cpi.b(cxo.sa, 12, 16, 20),
                     new cpi.b(cxo.se, 12, 16, 20),
                     new cpi.b(cxo.rX, 12, 16, 20),
                     new cpi.b(cxo.sk, 12, 16, 20),
                     new cpi.b(cxo.sc, 12, 16, 20),
                     new cpi.i(dkg.bg, 3, 1, 12, 10),
                     new cpi.i(dkg.bk, 3, 1, 12, 10),
                     new cpi.i(dkg.bu, 3, 1, 12, 10),
                     new cpi.i(dkg.bv, 3, 1, 12, 10),
                     new cpi.i(dkg.br, 3, 1, 12, 10),
                     new cpi.i(dkg.bs, 3, 1, 12, 10),
                     new cpi.i(dkg.bp, 3, 1, 12, 10),
                     new cpi.i(dkg.bn, 3, 1, 12, 10),
                     new cpi.i(dkg.bt, 3, 1, 12, 10),
                     new cpi.i(dkg.bj, 3, 1, 12, 10),
                     new cpi.i(dkg.bo, 3, 1, 12, 10),
                     new cpi.i(dkg.bl, 3, 1, 12, 10),
                     new cpi.i(dkg.bi, 3, 1, 12, 10),
                     new cpi.i(dkg.bh, 3, 1, 12, 10),
                     new cpi.i(dkg.bm, 3, 1, 12, 10),
                     new cpi.i(dkg.bq, 3, 1, 12, 10)
                  },
                  4,
                  new cpi.g[]{
                     new cpi.b(cxo.si, 12, 16, 30),
                     new cpi.b(cxo.sg, 12, 16, 30),
                     new cpi.b(cxo.sh, 12, 16, 30),
                     new cpi.b(cxo.sj, 12, 16, 30),
                     new cpi.b(cxo.rY, 12, 16, 30),
                     new cpi.b(cxo.sf, 12, 16, 30),
                     new cpi.i(cxo.vF, 3, 1, 12, 15),
                     new cpi.i(cxo.vQ, 3, 1, 12, 15),
                     new cpi.i(cxo.vI, 3, 1, 12, 15),
                     new cpi.i(cxo.vT, 3, 1, 12, 15),
                     new cpi.i(cxo.vL, 3, 1, 12, 15),
                     new cpi.i(cxo.vS, 3, 1, 12, 15),
                     new cpi.i(cxo.vK, 3, 1, 12, 15),
                     new cpi.i(cxo.vM, 3, 1, 12, 15),
                     new cpi.i(cxo.vU, 3, 1, 12, 15),
                     new cpi.i(cxo.vP, 3, 1, 12, 15),
                     new cpi.i(cxo.vH, 3, 1, 12, 15),
                     new cpi.i(cxo.vO, 3, 1, 12, 15),
                     new cpi.i(cxo.vR, 3, 1, 12, 15),
                     new cpi.i(cxo.vJ, 3, 1, 12, 15),
                     new cpi.i(cxo.vG, 3, 1, 12, 15),
                     new cpi.i(cxo.vN, 3, 1, 12, 15)
                  },
                  5,
                  new cpi.g[]{new cpi.i(cxo.qv, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            cph.i,
            a(
               ImmutableMap.of(
                  1,
                  new cpi.g[]{new cpi.b(cxo.pM, 32, 16, 2), new cpi.i(cxo.oS, 1, 16, 1), new cpi.h(dkg.O, 10, 1, cxo.qs, 10, 12, 1, 0.05F)},
                  2,
                  new cpi.g[]{new cpi.b(cxo.qs, 26, 12, 10), new cpi.i(cxo.oR, 2, 1, 5)},
                  3,
                  new cpi.g[]{new cpi.b(cxo.pO, 14, 16, 20), new cpi.i(cxo.wL, 3, 1, 10)},
                  4,
                  new cpi.g[]{new cpi.b(cxo.pP, 24, 16, 30), new cpi.e(cxo.oR, 2, 3, 15)},
                  5,
                  new cpi.g[]{new cpi.b(cxo.mp, 8, 12, 30), new cpi.e(cxo.wL, 3, 3, 15), new cpi.k(cxo.oS, 5, cxo.wg, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            cph.k,
            a(
               ImmutableMap.builder()
                  .put(1, new cpi.g[]{new cpi.b(cxo.rm, 24, 16, 2), new cpi.d(1, axx.i), new cpi.i(dkg.cs, 9, 1, 12, 1)})
                  .put(2, new cpi.g[]{new cpi.b(cxo.rn, 4, 12, 10), new cpi.d(5, axx.i), new cpi.i(cxo.xj, 1, 1, 5)})
                  .put(3, new cpi.g[]{new cpi.b(cxo.rT, 5, 12, 20), new cpi.d(10, axx.i), new cpi.i(cxo.cN, 1, 4, 10)})
                  .put(4, new cpi.g[]{new cpi.b(cxo.uO, 2, 12, 30), new cpi.d(15, axx.i), new cpi.i(cxo.rK, 5, 1, 15), new cpi.i(cxo.rq, 4, 1, 15)})
                  .put(5, new cpi.g[]{new cpi.i(cxo.vB, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            cph.e,
            a(
               ImmutableMap.of(
                  1,
                  new cpi.g[]{new cpi.b(cxo.rm, 24, 16, 2), new cpi.i(cxo.uZ, 7, 1, 1)},
                  2,
                  new cpi.g[]{new cpi.b(cxo.gg, 11, 16, 10), new cpi.l(13, ayg.d, "filled_map.monument", evf.j, 12, 5)},
                  3,
                  new cpi.g[]{
                     new cpi.b(cxo.rq, 1, 12, 20),
                     new cpi.l(14, ayg.c, "filled_map.mansion", evf.i, 12, 10),
                     new cpi.l(12, ayg.m, "filled_map.trial_chambers", evf.I, 12, 10)
                  },
                  4,
                  new cpi.g[]{
                     new cpi.i(cxo.uS, 7, 1, 15),
                     new cpi.i(cxo.vF, 3, 1, 15),
                     new cpi.i(cxo.vQ, 3, 1, 15),
                     new cpi.i(cxo.vI, 3, 1, 15),
                     new cpi.i(cxo.vT, 3, 1, 15),
                     new cpi.i(cxo.vL, 3, 1, 15),
                     new cpi.i(cxo.vS, 3, 1, 15),
                     new cpi.i(cxo.vK, 3, 1, 15),
                     new cpi.i(cxo.vM, 3, 1, 15),
                     new cpi.i(cxo.vU, 3, 1, 15),
                     new cpi.i(cxo.vP, 3, 1, 15),
                     new cpi.i(cxo.vH, 3, 1, 15),
                     new cpi.i(cxo.vO, 3, 1, 15),
                     new cpi.i(cxo.vR, 3, 1, 15),
                     new cpi.i(cxo.vJ, 3, 1, 15),
                     new cpi.i(cxo.vG, 3, 1, 15),
                     new cpi.i(cxo.vN, 3, 1, 15)
                  },
                  5,
                  new cpi.g[]{new cpi.i(cxo.wS, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            cph.f,
            a(
               ImmutableMap.of(
                  1,
                  new cpi.g[]{new cpi.b(cxo.sS, 32, 16, 2), new cpi.i(cxo.lV, 1, 2, 1)},
                  2,
                  new cpi.g[]{new cpi.b(cxo.pf, 3, 12, 10), new cpi.i(cxo.oX, 1, 1, 5)},
                  3,
                  new cpi.g[]{new cpi.b(cxo.vt, 2, 12, 20), new cpi.i(dkg.ep, 4, 1, 12, 10)},
                  4,
                  new cpi.g[]{new cpi.b(cxo.oL, 4, 12, 30), new cpi.b(cxo.sY, 9, 12, 30), new cpi.i(cxo.sT, 5, 1, 15)},
                  5,
                  new cpi.g[]{new cpi.b(cxo.sX, 22, 12, 30), new cpi.i(cxo.uL, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            cph.c,
            a(
               ImmutableMap.of(
                  1,
                  new cpi.g[]{
                     new cpi.b(cxo.oT, 15, 16, 2),
                     new cpi.i(new cxk(cxo.qe), 7, 1, 12, 1, 0.2F),
                     new cpi.i(new cxk(cxo.qf), 4, 1, 12, 1, 0.2F),
                     new cpi.i(new cxk(cxo.qc), 5, 1, 12, 1, 0.2F),
                     new cpi.i(new cxk(cxo.qd), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cpi.g[]{
                     new cpi.b(cxo.pb, 4, 12, 10),
                     new cpi.i(new cxk(cxo.xi), 36, 1, 12, 5, 0.2F),
                     new cpi.i(new cxk(cxo.qb), 1, 1, 12, 5, 0.2F),
                     new cpi.i(new cxk(cxo.qa), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new cpi.g[]{
                     new cpi.b(cxo.qY, 1, 12, 20),
                     new cpi.b(cxo.oV, 1, 12, 20),
                     new cpi.i(new cxk(cxo.pY), 1, 1, 12, 10, 0.2F),
                     new cpi.i(new cxk(cxo.pZ), 4, 1, 12, 10, 0.2F),
                     new cpi.i(new cxk(cxo.wi), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new cpi.g[]{new cpi.e(cxo.qi, 14, 3, 15, 0.2F), new cpi.e(cxo.qj, 8, 3, 15, 0.2F)},
                  5,
                  new cpi.g[]{new cpi.e(cxo.qg, 8, 3, 30, 0.2F), new cpi.e(cxo.qh, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cph.p,
            a(
               ImmutableMap.of(
                  1,
                  new cpi.g[]{new cpi.b(cxo.oT, 15, 16, 2), new cpi.i(new cxk(cxo.pA), 3, 1, 12, 1, 0.2F), new cpi.e(cxo.px, 2, 3, 1)},
                  2,
                  new cpi.g[]{new cpi.b(cxo.pb, 4, 12, 10), new cpi.i(new cxk(cxo.xi), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cpi.g[]{new cpi.b(cxo.qs, 24, 12, 20)},
                  4,
                  new cpi.g[]{new cpi.b(cxo.oV, 1, 12, 30), new cpi.e(cxo.pF, 12, 3, 15, 0.2F)},
                  5,
                  new cpi.g[]{new cpi.e(cxo.pC, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cph.o,
            a(
               ImmutableMap.of(
                  1,
                  new cpi.g[]{
                     new cpi.b(cxo.oT, 15, 16, 2),
                     new cpi.i(new cxk(cxo.pq), 1, 1, 12, 1, 0.2F),
                     new cpi.i(new cxk(cxo.po), 1, 1, 12, 1, 0.2F),
                     new cpi.i(new cxk(cxo.pp), 1, 1, 12, 1, 0.2F),
                     new cpi.i(new cxk(cxo.pr), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cpi.g[]{new cpi.b(cxo.pb, 4, 12, 10), new cpi.i(new cxk(cxo.xi), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cpi.g[]{
                     new cpi.b(cxo.qs, 30, 12, 20),
                     new cpi.e(cxo.pA, 1, 3, 10, 0.2F),
                     new cpi.e(cxo.py, 2, 3, 10, 0.2F),
                     new cpi.e(cxo.pz, 3, 3, 10, 0.2F),
                     new cpi.i(new cxk(cxo.pG), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new cpi.g[]{new cpi.b(cxo.oV, 1, 12, 30), new cpi.e(cxo.pF, 12, 3, 15, 0.2F), new cpi.e(cxo.pD, 5, 3, 15, 0.2F)},
                  5,
                  new cpi.g[]{new cpi.e(cxo.pE, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cph.d,
            a(
               ImmutableMap.of(
                  1,
                  new cpi.g[]{new cpi.b(cxo.sQ, 14, 16, 2), new cpi.b(cxo.qt, 7, 16, 2), new cpi.b(cxo.vq, 4, 16, 2), new cpi.i(cxo.vs, 1, 1, 1)},
                  2,
                  new cpi.g[]{new cpi.b(cxo.oT, 15, 16, 2), new cpi.i(cxo.qu, 1, 5, 16, 5), new cpi.i(cxo.sR, 1, 8, 16, 5)},
                  3,
                  new cpi.g[]{new cpi.b(cxo.vD, 7, 16, 20), new cpi.b(cxo.sO, 10, 16, 20)},
                  4,
                  new cpi.g[]{new cpi.b(cxo.rl, 10, 12, 30)},
                  5,
                  new cpi.g[]{new cpi.b(cxo.xl, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            cph.j,
            a(
               ImmutableMap.of(
                  1,
                  new cpi.g[]{new cpi.b(cxo.rb, 6, 16, 2), new cpi.a(cxo.pW, 3), new cpi.a(cxo.pV, 7)},
                  2,
                  new cpi.g[]{new cpi.b(cxo.qs, 26, 12, 10), new cpi.a(cxo.pU, 5, 12, 5), new cpi.a(cxo.pX, 4, 12, 5)},
                  3,
                  new cpi.g[]{new cpi.b(cxo.vu, 9, 12, 20), new cpi.a(cxo.pV, 7)},
                  4,
                  new cpi.g[]{new cpi.b(cxo.oL, 4, 12, 30), new cpi.a(cxo.vz, 6, 12, 15)},
                  5,
                  new cpi.g[]{new cpi.i(new cxk(cxo.oe), 6, 1, 12, 30, 0.2F), new cpi.a(cxo.pU, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            cph.l,
            a(
               ImmutableMap.of(
                  1,
                  new cpi.g[]{new cpi.b(cxo.rk, 10, 16, 2), new cpi.i(cxo.rj, 1, 10, 16, 1)},
                  2,
                  new cpi.g[]{new cpi.b(dkg.b, 20, 16, 10), new cpi.i(dkg.eY, 1, 4, 16, 5)},
                  3,
                  new cpi.g[]{
                     new cpi.b(dkg.c, 16, 16, 20),
                     new cpi.b(dkg.g, 16, 16, 20),
                     new cpi.b(dkg.e, 16, 16, 20),
                     new cpi.i(dkg.sP, 1, 4, 16, 10),
                     new cpi.i(dkg.h, 1, 4, 16, 10),
                     new cpi.i(dkg.f, 1, 4, 16, 10),
                     new cpi.i(dkg.d, 1, 4, 16, 10)
                  },
                  4,
                  new cpi.g[]{
                     new cpi.b(cxo.oY, 12, 12, 30),
                     new cpi.i(dkg.hA, 1, 1, 12, 15),
                     new cpi.i(dkg.hz, 1, 1, 12, 15),
                     new cpi.i(dkg.hK, 1, 1, 12, 15),
                     new cpi.i(dkg.hC, 1, 1, 12, 15),
                     new cpi.i(dkg.hG, 1, 1, 12, 15),
                     new cpi.i(dkg.hH, 1, 1, 12, 15),
                     new cpi.i(dkg.hO, 1, 1, 12, 15),
                     new cpi.i(dkg.hN, 1, 1, 12, 15),
                     new cpi.i(dkg.hF, 1, 1, 12, 15),
                     new cpi.i(dkg.hB, 1, 1, 12, 15),
                     new cpi.i(dkg.hE, 1, 1, 12, 15),
                     new cpi.i(dkg.hM, 1, 1, 12, 15),
                     new cpi.i(dkg.hI, 1, 1, 12, 15),
                     new cpi.i(dkg.hJ, 1, 1, 12, 15),
                     new cpi.i(dkg.hD, 1, 1, 12, 15),
                     new cpi.i(dkg.hL, 1, 1, 12, 15),
                     new cpi.i(dkg.lC, 1, 1, 12, 15),
                     new cpi.i(dkg.lB, 1, 1, 12, 15),
                     new cpi.i(dkg.lM, 1, 1, 12, 15),
                     new cpi.i(dkg.lE, 1, 1, 12, 15),
                     new cpi.i(dkg.lI, 1, 1, 12, 15),
                     new cpi.i(dkg.lJ, 1, 1, 12, 15),
                     new cpi.i(dkg.lQ, 1, 1, 12, 15),
                     new cpi.i(dkg.lP, 1, 1, 12, 15),
                     new cpi.i(dkg.lH, 1, 1, 12, 15),
                     new cpi.i(dkg.lD, 1, 1, 12, 15),
                     new cpi.i(dkg.lG, 1, 1, 12, 15),
                     new cpi.i(dkg.lO, 1, 1, 12, 15),
                     new cpi.i(dkg.lK, 1, 1, 12, 15),
                     new cpi.i(dkg.lL, 1, 1, 12, 15),
                     new cpi.i(dkg.lF, 1, 1, 12, 15),
                     new cpi.i(dkg.lN, 1, 1, 12, 15)
                  },
                  5,
                  new cpi.g[]{new cpi.i(dkg.hv, 1, 1, 12, 30), new cpi.i(dkg.ht, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<cpi.g[]> b = a(
      ImmutableMap.of(
         1,
         new cpi.g[]{
            new cpi.i(cxo.da, 2, 1, 5, 1),
            new cpi.i(cxo.ro, 4, 1, 5, 1),
            new cpi.i(cxo.fH, 2, 1, 5, 1),
            new cpi.i(cxo.wJ, 5, 1, 5, 1),
            new cpi.i(cxo.cV, 1, 1, 12, 1),
            new cpi.i(cxo.dQ, 1, 1, 8, 1),
            new cpi.i(cxo.fx, 1, 1, 4, 1),
            new cpi.i(cxo.dR, 3, 1, 12, 1),
            new cpi.i(cxo.fi, 3, 1, 8, 1),
            new cpi.i(cxo.dr, 1, 1, 12, 1),
            new cpi.i(cxo.ds, 1, 1, 12, 1),
            new cpi.i(cxo.dt, 1, 1, 8, 1),
            new cpi.i(cxo.du, 1, 1, 12, 1),
            new cpi.i(cxo.dv, 1, 1, 12, 1),
            new cpi.i(cxo.dw, 1, 1, 12, 1),
            new cpi.i(cxo.dx, 1, 1, 12, 1),
            new cpi.i(cxo.dy, 1, 1, 12, 1),
            new cpi.i(cxo.dz, 1, 1, 12, 1),
            new cpi.i(cxo.dA, 1, 1, 12, 1),
            new cpi.i(cxo.dB, 1, 1, 12, 1),
            new cpi.i(cxo.dC, 1, 1, 7, 1),
            new cpi.i(cxo.pR, 1, 1, 12, 1),
            new cpi.i(cxo.wb, 1, 1, 12, 1),
            new cpi.i(cxo.sM, 1, 1, 12, 1),
            new cpi.i(cxo.sN, 1, 1, 12, 1),
            new cpi.i(cxo.ab, 5, 1, 8, 1),
            new cpi.i(cxo.Z, 5, 1, 8, 1),
            new cpi.i(cxo.ad, 5, 1, 8, 1),
            new cpi.i(cxo.ae, 5, 1, 8, 1),
            new cpi.i(cxo.aa, 5, 1, 8, 1),
            new cpi.i(cxo.X, 5, 1, 8, 1),
            new cpi.i(cxo.Y, 5, 1, 8, 1),
            new cpi.i(cxo.ac, 5, 1, 8, 1),
            new cpi.i(cxo.af, 5, 1, 8, 1),
            new cpi.i(cxo.sk, 1, 3, 12, 1),
            new cpi.i(cxo.rW, 1, 3, 12, 1),
            new cpi.i(cxo.sh, 1, 3, 12, 1),
            new cpi.i(cxo.sc, 1, 3, 12, 1),
            new cpi.i(cxo.sl, 1, 3, 12, 1),
            new cpi.i(cxo.sj, 1, 3, 12, 1),
            new cpi.i(cxo.se, 1, 3, 12, 1),
            new cpi.i(cxo.rY, 1, 3, 12, 1),
            new cpi.i(cxo.sa, 1, 3, 12, 1),
            new cpi.i(cxo.sd, 1, 3, 12, 1),
            new cpi.i(cxo.sg, 1, 3, 12, 1),
            new cpi.i(cxo.rZ, 1, 3, 12, 1),
            new cpi.i(cxo.sb, 1, 3, 12, 1),
            new cpi.i(cxo.rX, 1, 3, 12, 1),
            new cpi.i(cxo.si, 1, 3, 12, 1),
            new cpi.i(cxo.sf, 1, 3, 12, 1),
            new cpi.i(cxo.kL, 3, 1, 8, 1),
            new cpi.i(cxo.kM, 3, 1, 8, 1),
            new cpi.i(cxo.kN, 3, 1, 8, 1),
            new cpi.i(cxo.kO, 3, 1, 8, 1),
            new cpi.i(cxo.kK, 3, 1, 8, 1),
            new cpi.i(cxo.gi, 1, 1, 12, 1),
            new cpi.i(cxo.dH, 1, 1, 12, 1),
            new cpi.i(cxo.dI, 1, 1, 12, 1),
            new cpi.i(cxo.go, 1, 2, 5, 1),
            new cpi.i(cxo.ea, 1, 2, 5, 1),
            new cpi.i(cxo.ah, 1, 8, 8, 1),
            new cpi.i(cxo.ak, 1, 4, 6, 1),
            new cpi.i(cxo.yf, 1, 2, 5, 1),
            new cpi.i(cxo.F, 1, 2, 5, 1),
            new cpi.i(cxo.dU, 1, 2, 5, 1)
         },
         2,
         new cpi.g[]{
            new cpi.i(cxo.rg, 5, 1, 4, 1),
            new cpi.i(cxo.rd, 5, 1, 4, 1),
            new cpi.i(cxo.ij, 3, 1, 6, 1),
            new cpi.i(cxo.lj, 6, 1, 6, 1),
            new cpi.i(cxo.pQ, 1, 1, 8, 1),
            new cpi.i(cxo.E, 3, 3, 6, 1)
         }
      )
   );
   private static final cpi.l s = new cpi.l(8, ayg.f, "filled_map.village_desert", evf.B, 12, 5);
   private static final cpi.l t = new cpi.l(8, ayg.e, "filled_map.village_savanna", evf.D, 12, 5);
   private static final cpi.l u = new cpi.l(8, ayg.g, "filled_map.village_plains", evf.C, 12, 5);
   private static final cpi.l v = new cpi.l(8, ayg.h, "filled_map.village_taiga", evf.F, 12, 5);
   private static final cpi.l w = new cpi.l(8, ayg.i, "filled_map.village_snowy", evf.E, 12, 5);
   private static final cpi.l x = new cpi.l(8, ayg.j, "filled_map.explorer_jungle", evf.G, 12, 5);
   private static final cpi.l y = new cpi.l(8, ayg.k, "filled_map.explorer_swamp", evf.H, 12, 5);
   public static final Map<cph, Int2ObjectMap<cpi.g[]>> c = Map.of(
      cph.k,
      a(
         ImmutableMap.builder()
            .put(1, new cpi.g[]{new cpi.b(cxo.rm, 24, 16, 2), a(1), new cpi.i(dkg.cs, 9, 1, 12, 1)})
            .put(2, new cpi.g[]{new cpi.b(cxo.rn, 4, 12, 10), a(5), new cpi.i(cxo.xj, 1, 1, 5)})
            .put(3, new cpi.g[]{new cpi.b(cxo.rT, 5, 12, 20), a(10), new cpi.i(cxo.cN, 1, 4, 10)})
            .put(4, new cpi.g[]{new cpi.b(cxo.uO, 2, 12, 30), new cpi.i(cxo.rK, 5, 1, 15), new cpi.i(cxo.rq, 4, 1, 15)})
            .put(5, new cpi.g[]{a(), new cpi.i(cxo.vB, 20, 1, 30)})
            .build()
      ),
      cph.c,
      a(
         ImmutableMap.builder()
            .put(1, new cpi.g[]{new cpi.b(cxo.oT, 15, 12, 2), new cpi.b(cxo.pb, 5, 12, 2)})
            .put(
               2,
               new cpi.g[]{
                  cpi.m.a(new cpi.i(cxo.qf, 4, 1, 12, 5, 0.05F), cpj.a, cpj.c, cpj.d, cpj.e, cpj.g),
                  cpi.m.a(new cpi.i(cxo.qb, 4, 1, 12, 5, 0.05F), cpj.b, cpj.f),
                  cpi.m.a(new cpi.i(cxo.qc, 5, 1, 12, 5, 0.05F), cpj.a, cpj.c, cpj.d, cpj.e, cpj.g),
                  cpi.m.a(new cpi.i(cxo.pY, 5, 1, 12, 5, 0.05F), cpj.b, cpj.f),
                  cpi.m.a(new cpi.i(cxo.qe, 7, 1, 12, 5, 0.05F), cpj.a, cpj.c, cpj.d, cpj.e, cpj.g),
                  cpi.m.a(new cpi.i(cxo.qa, 7, 1, 12, 5, 0.05F), cpj.b, cpj.f),
                  cpi.m.a(new cpi.i(cxo.qd, 9, 1, 12, 5, 0.05F), cpj.a, cpj.c, cpj.d, cpj.e, cpj.g),
                  cpi.m.a(new cpi.i(cxo.pZ, 9, 1, 12, 5, 0.05F), cpj.b, cpj.f)
               }
            )
            .put(3, new cpi.g[]{new cpi.b(cxo.qY, 1, 12, 20), new cpi.i(cxo.wi, 5, 1, 12, 10, 0.05F), new cpi.i(cxo.xi, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new cpi.g[]{
                  cpi.m.a(new cpi.i(cxo.qf, 8, 1, 3, 15, 0.05F, dfe.a), cpj.a),
                  cpi.m.a(new cpi.i(cxo.qc, 9, 1, 3, 15, 0.05F, dfe.d), cpj.a),
                  cpi.m.a(new cpi.i(cxo.qe, 11, 1, 3, 15, 0.05F, dfe.b), cpj.a),
                  cpi.m.a(new cpi.i(cxo.qd, 13, 1, 3, 15, 0.05F, dfe.c), cpj.a),
                  cpi.m.a(new cpi.i(cxo.qf, 8, 1, 3, 15, 0.05F, dfe.g), cpj.c),
                  cpi.m.a(new cpi.i(cxo.qc, 9, 1, 3, 15, 0.05F, dfe.j), cpj.c),
                  cpi.m.a(new cpi.i(cxo.qe, 11, 1, 3, 15, 0.05F, dfe.h), cpj.c),
                  cpi.m.a(new cpi.i(cxo.qd, 13, 1, 3, 15, 0.05F, dfe.i), cpj.c),
                  cpi.m.a(new cpi.i(cxo.qf, 2, 1, 3, 15, 0.05F, dfe.m), cpj.d),
                  cpi.m.a(new cpi.i(cxo.qc, 3, 1, 3, 15, 0.05F, dfe.p), cpj.d),
                  cpi.m.a(new cpi.i(cxo.qe, 5, 1, 3, 15, 0.05F, dfe.n), cpj.d),
                  cpi.m.a(new cpi.i(cxo.qd, 7, 1, 3, 15, 0.05F, dfe.o), cpj.d),
                  cpi.m.a(new cpi.i(cxo.qf, 8, 1, 3, 15, 0.05F, dfe.s), cpj.e),
                  cpi.m.a(new cpi.i(cxo.qc, 9, 1, 3, 15, 0.05F, dfe.t), cpj.e),
                  cpi.m.a(new cpi.i(cxo.qb, 8, 1, 3, 15, 0.05F, dfe.w), cpj.b),
                  cpi.m.a(new cpi.i(cxo.pY, 9, 1, 3, 15, 0.05F, dfe.z), cpj.b),
                  cpi.m.a(new cpi.i(cxo.qa, 11, 1, 3, 15, 0.05F, dfe.x), cpj.b),
                  cpi.m.a(new cpi.i(cxo.pZ, 13, 1, 3, 15, 0.05F, dfe.y), cpj.b),
                  cpi.m.a(new cpi.i(cxo.qb, 8, 1, 3, 15, 0.05F, dfe.C), cpj.f),
                  cpi.m.a(new cpi.i(cxo.pY, 9, 1, 3, 15, 0.05F, dfe.F), cpj.f),
                  cpi.m.a(new cpi.i(cxo.qa, 11, 1, 3, 15, 0.05F, dfe.D), cpj.f),
                  cpi.m.a(new cpi.i(cxo.pZ, 13, 1, 3, 15, 0.05F, dfe.E), cpj.f),
                  cpi.m.a(new cpi.h(cxo.qj, 1, 4, cxo.qi, 1, 3, 15, 0.05F), cpj.g),
                  cpi.m.a(new cpi.h(cxo.qi, 1, 4, cxo.qh, 1, 3, 15, 0.05F), cpj.g),
                  cpi.m.a(new cpi.h(cxo.qg, 1, 4, cxo.qj, 1, 3, 15, 0.05F), cpj.g),
                  cpi.m.a(new cpi.h(cxo.qh, 1, 2, cxo.qg, 1, 3, 15, 0.05F), cpj.g)
               }
            )
            .put(
               5,
               new cpi.g[]{
                  cpi.m.a(new cpi.h(cxo.oV, 4, 16, cxo.qh, 1, 3, 30, 0.05F, dfe.f), cpj.a),
                  cpi.m.a(new cpi.h(cxo.oV, 3, 16, cxo.qi, 1, 3, 30, 0.05F, dfe.e), cpj.a),
                  cpi.m.a(new cpi.h(cxo.oV, 3, 16, cxo.qi, 1, 3, 30, 0.05F, dfe.l), cpj.c),
                  cpi.m.a(new cpi.h(cxo.oV, 2, 12, cxo.qj, 1, 3, 30, 0.05F, dfe.k), cpj.c),
                  cpi.m.a(new cpi.h(cxo.oV, 2, 6, cxo.qg, 1, 3, 30, 0.05F, dfe.r), cpj.d),
                  cpi.m.a(new cpi.h(cxo.oV, 3, 8, cxo.qh, 1, 3, 30, 0.05F, dfe.q), cpj.d),
                  cpi.m.a(new cpi.h(cxo.oV, 2, 12, cxo.qj, 1, 3, 30, 0.05F, dfe.u), cpj.e),
                  cpi.m.a(new cpi.h(cxo.oV, 3, 12, cxo.qg, 1, 3, 30, 0.05F, dfe.v), cpj.e),
                  cpi.m.a(new cpi.i(cxo.pY, 9, 1, 3, 30, 0.05F, dfe.B), cpj.b),
                  cpi.m.a(new cpi.i(cxo.qb, 8, 1, 3, 30, 0.05F, dfe.A), cpj.b),
                  cpi.m.a(new cpi.i(cxo.pY, 9, 1, 3, 30, 0.05F, dfe.H), cpj.f),
                  cpi.m.a(new cpi.i(cxo.qb, 8, 1, 3, 30, 0.05F, dfe.G), cpj.f),
                  cpi.m.a(new cpi.h(cxo.oV, 4, 18, cxo.qh, 1, 3, 30, 0.05F, dfe.J), cpj.g),
                  cpi.m.a(new cpi.h(cxo.oV, 3, 18, cxo.qi, 1, 3, 30, 0.05F, dfe.I), cpj.g),
                  cpi.m.a(new cpi.b(cxo.aP, 1, 12, 30, 42), cpj.g),
                  cpi.m.a(new cpi.b(cxo.aM, 1, 12, 30, 4), cpj.a, cpj.b, cpj.c, cpj.d, cpj.e, cpj.f)
               }
            )
            .build()
      ),
      cph.e,
      a(
         ImmutableMap.of(
            1,
            new cpi.g[]{new cpi.b(cxo.rm, 24, 16, 2), new cpi.i(cxo.uZ, 7, 1, 1)},
            2,
            new cpi.g[]{
               new cpi.b(cxo.gg, 11, 16, 10),
               new cpi.m(ImmutableMap.builder().put(cpj.a, t).put(cpj.d, u).put(cpj.c, v).put(cpj.g, w).put(cpj.e, u).put(cpj.b, t).put(cpj.f, w).build()),
               new cpi.m(ImmutableMap.builder().put(cpj.a, u).put(cpj.d, s).put(cpj.c, t).put(cpj.g, u).put(cpj.e, v).put(cpj.b, s).put(cpj.f, v).build()),
               new cpi.m(
                  ImmutableMap.builder().put(cpj.a, x).put(cpj.d, x).put(cpj.c, new cpi.f()).put(cpj.g, y).put(cpj.e, y).put(cpj.b, y).put(cpj.f, x).build()
               )
            },
            3,
            new cpi.g[]{
               new cpi.b(cxo.rq, 1, 12, 20),
               new cpi.l(13, ayg.d, "filled_map.monument", evf.j, 12, 10),
               new cpi.l(12, ayg.m, "filled_map.trial_chambers", evf.I, 12, 10)
            },
            4,
            new cpi.g[]{
               new cpi.i(cxo.uS, 7, 1, 15),
               new cpi.i(cxo.vF, 3, 1, 15),
               new cpi.i(cxo.vQ, 3, 1, 15),
               new cpi.i(cxo.vI, 3, 1, 15),
               new cpi.i(cxo.vT, 3, 1, 15),
               new cpi.i(cxo.vL, 3, 1, 15),
               new cpi.i(cxo.vS, 3, 1, 15),
               new cpi.i(cxo.vK, 3, 1, 15),
               new cpi.i(cxo.vM, 3, 1, 15),
               new cpi.i(cxo.vU, 3, 1, 15),
               new cpi.i(cxo.vP, 3, 1, 15),
               new cpi.i(cxo.vH, 3, 1, 15),
               new cpi.i(cxo.vO, 3, 1, 15),
               new cpi.i(cxo.vR, 3, 1, 15),
               new cpi.i(cxo.vJ, 3, 1, 15),
               new cpi.i(cxo.vG, 3, 1, 15),
               new cpi.i(cxo.vN, 3, 1, 15)
            },
            5,
            new cpi.g[]{new cpi.i(cxo.wS, 8, 1, 30), new cpi.l(14, ayg.c, "filled_map.mansion", evf.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<cpi.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new cpi.g[]{
               new cpi.b(a(czk.a), 1, 1, 1),
               new cpi.b(cxo.qX, 1, 1, 1, 2),
               new cpi.b(cxo.rc, 1, 1, 1, 2),
               new cpi.b(cxo.tb, 1, 1, 1, 3),
               new cpi.b(cxo.uX, 4, 1, 1),
               new cpi.b(cxo.hR, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cpi.g[]{
               new cpi.i(cxo.ij, 1, 1, 6, 1),
               new cpi.i(cxo.lj, 6, 1, 6, 1),
               new cpi.i(cxo.pQ, 1, 4, 2, 1),
               new cpi.i(cxo.E, 3, 3, 6, 1),
               new cpi.i(dkg.ab, 1, 8, 4, 1),
               new cpi.i(dkg.Z, 1, 8, 4, 1),
               new cpi.i(dkg.ad, 1, 8, 4, 1),
               new cpi.i(dkg.aa, 1, 8, 4, 1),
               new cpi.i(dkg.X, 1, 8, 4, 1),
               new cpi.i(dkg.Y, 1, 8, 4, 1),
               new cpi.i(dkg.ac, 1, 8, 4, 1),
               new cpi.e(cxo.pz, 1, 1, 1, 0.2F),
               new cpi.i(b(czk.h), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cpi.g[]{
               new cpi.i(cxo.rg, 3, 1, 4, 1),
               new cpi.i(cxo.rd, 3, 1, 4, 1),
               new cpi.i(cxo.da, 2, 1, 5, 1),
               new cpi.i(cxo.ro, 4, 1, 5, 1),
               new cpi.i(cxo.fH, 2, 1, 5, 1),
               new cpi.i(cxo.wJ, 5, 1, 5, 1),
               new cpi.i(cxo.cV, 1, 1, 12, 1),
               new cpi.i(cxo.dQ, 1, 1, 8, 1),
               new cpi.i(cxo.fx, 1, 1, 4, 1),
               new cpi.i(cxo.dR, 3, 1, 12, 1),
               new cpi.i(cxo.fi, 3, 1, 8, 1),
               new cpi.i(cxo.dr, 1, 1, 12, 1),
               new cpi.i(cxo.ds, 1, 1, 12, 1),
               new cpi.i(cxo.dt, 1, 1, 8, 1),
               new cpi.i(cxo.du, 1, 1, 12, 1),
               new cpi.i(cxo.dv, 1, 1, 12, 1),
               new cpi.i(cxo.dw, 1, 1, 12, 1),
               new cpi.i(cxo.dx, 1, 1, 12, 1),
               new cpi.i(cxo.dy, 1, 1, 12, 1),
               new cpi.i(cxo.dz, 1, 1, 12, 1),
               new cpi.i(cxo.dA, 1, 1, 12, 1),
               new cpi.i(cxo.dB, 1, 1, 12, 1),
               new cpi.i(cxo.dC, 1, 1, 7, 1),
               new cpi.i(cxo.pR, 1, 1, 12, 1),
               new cpi.i(cxo.wb, 1, 1, 12, 1),
               new cpi.i(cxo.sM, 1, 1, 12, 1),
               new cpi.i(cxo.sN, 1, 1, 12, 1),
               new cpi.i(cxo.ab, 5, 1, 8, 1),
               new cpi.i(cxo.Z, 5, 1, 8, 1),
               new cpi.i(cxo.ad, 5, 1, 8, 1),
               new cpi.i(cxo.ae, 5, 1, 8, 1),
               new cpi.i(cxo.aa, 5, 1, 8, 1),
               new cpi.i(cxo.X, 5, 1, 8, 1),
               new cpi.i(cxo.Y, 5, 1, 8, 1),
               new cpi.i(cxo.ac, 5, 1, 8, 1),
               new cpi.i(cxo.af, 5, 1, 8, 1),
               new cpi.i(cxo.sk, 1, 3, 12, 1),
               new cpi.i(cxo.rW, 1, 3, 12, 1),
               new cpi.i(cxo.sh, 1, 3, 12, 1),
               new cpi.i(cxo.sc, 1, 3, 12, 1),
               new cpi.i(cxo.sl, 1, 3, 12, 1),
               new cpi.i(cxo.sj, 1, 3, 12, 1),
               new cpi.i(cxo.se, 1, 3, 12, 1),
               new cpi.i(cxo.rY, 1, 3, 12, 1),
               new cpi.i(cxo.sa, 1, 3, 12, 1),
               new cpi.i(cxo.sd, 1, 3, 12, 1),
               new cpi.i(cxo.sg, 1, 3, 12, 1),
               new cpi.i(cxo.rZ, 1, 3, 12, 1),
               new cpi.i(cxo.sb, 1, 3, 12, 1),
               new cpi.i(cxo.rX, 1, 3, 12, 1),
               new cpi.i(cxo.si, 1, 3, 12, 1),
               new cpi.i(cxo.sf, 1, 3, 12, 1),
               new cpi.i(cxo.kL, 3, 1, 8, 1),
               new cpi.i(cxo.kM, 3, 1, 8, 1),
               new cpi.i(cxo.kN, 3, 1, 8, 1),
               new cpi.i(cxo.kO, 3, 1, 8, 1),
               new cpi.i(cxo.kK, 3, 1, 8, 1),
               new cpi.i(cxo.gi, 1, 3, 4, 1),
               new cpi.i(cxo.dH, 1, 3, 4, 1),
               new cpi.i(cxo.dI, 1, 3, 4, 1),
               new cpi.i(cxo.go, 1, 5, 2, 1),
               new cpi.i(cxo.ea, 1, 2, 5, 1),
               new cpi.i(cxo.ah, 1, 8, 8, 1),
               new cpi.i(cxo.ak, 1, 4, 6, 1),
               new cpi.i(cxo.yf, 1, 2, 5, 1),
               new cpi.i(cxo.F, 1, 2, 5, 1),
               new cpi.i(cxo.dU, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static cpi.g a(int $$0) {
      return new cpi.m(
         ImmutableMap.builder()
            .put(cpj.a, new cpi.d($$0, axx.w))
            .put(cpj.b, new cpi.d($$0, axx.x))
            .put(cpj.c, new cpi.d($$0, axx.y))
            .put(cpj.d, new cpi.d($$0, axx.z))
            .put(cpj.e, new cpi.d($$0, axx.A))
            .put(cpj.f, new cpi.d($$0, axx.B))
            .put(cpj.g, new cpi.d($$0, axx.C))
            .build()
      );
   }

   private static cpi.g a() {
      return new cpi.m(
         ImmutableMap.builder()
            .put(cpj.a, new cpi.d(30, 3, 3, axx.D))
            .put(cpj.b, new cpi.d(30, 2, 2, axx.E))
            .put(cpj.c, new cpi.d(30, 3, 3, axx.F))
            .put(cpj.d, new cpi.d(30, 3, 3, axx.G))
            .put(cpj.e, new cpi.d(30, axx.H))
            .put(cpj.f, new cpi.d(30, axx.I))
            .put(cpj.g, new cpi.d(30, 2, 2, axx.J))
            .build()
      );
   }

   private static Int2ObjectMap<cpi.g[]> a(ImmutableMap<Integer, cpi.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static dfv a(jq<czh> $$0) {
      return new dfv(cxo.sZ).a($$1 -> $$1.a(ku.Q, new czj($$0)));
   }

   private static cxk b(jq<czh> $$0) {
      return czj.a(cxo.sZ, $$0);
   }

   static class a implements cpi.g {
      private final cxg a;
      private final int b;
      private final int c;
      private final int d;

      public a(cxg $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(cxg $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public dfx a(bvf $$0, bam $$1) {
         dfv $$2 = new dfv(cxo.oW, this.b);
         cxk $$3 = new cxk(this.a);
         if ($$3.a(ayd.bR)) {
            List<cwi> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = czy.a($$3, $$4);
         }

         return new dfx($$2, $$3, this.c, this.d, 0.2F);
      }

      private static cwi a(bam $$0) {
         return cwi.a(cwh.a($$0.a(16)));
      }
   }

   static class b implements cpi.g {
      private final dfv a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(dgz $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(dgz $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new dfv($$0.j(), $$1), $$2, $$3, $$4);
      }

      public b(dfv $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public dfx a(bvf $$0, bam $$1) {
         return new dfx(this.a, new cxk(cxo.oW, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements cpi.g {
      private final Map<cpj, cxg> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<cpj, cxg> $$3) {
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
      public dfx a(bvf $$0, bam $$1) {
         if ($$0 instanceof cpg $$2) {
            dfv $$3 = new dfv(this.a.get($$2.gw().a()), this.b);
            return new dfx($$3, new cxk(cxo.oW), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements cpi.g {
      private final int a;
      private final ayk<ddr> b;
      private final int c;
      private final int d;

      public d(int $$0, ayk<ddr> $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, ayk<ddr> $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = $$3;
      }

      @Override
      public dfx a(bvf $$0, bam $$1) {
         Optional<jq<ddr>> $$2 = $$0.dV().K_().e(mb.aN).a(this.b, $$1);
         int $$9;
         cxk $$8;
         if (!$$2.isEmpty()) {
            jq<ddr> $$3 = $$2.get();
            ddr $$4 = $$3.a();
            int $$5 = Math.max($$4.d(), this.c);
            int $$6 = Math.min($$4.e(), this.d);
            int $$7 = bae.a($$1, $$5, $$6);
            $$8 = ddt.a(new ddu($$3, $$7));
            $$9 = 2 + $$1.a(5 + $$7 * 10) + 3 * $$7;
            if ($$3.a(axx.j)) {
               $$9 *= 2;
            }

            if ($$9 > 64) {
               $$9 = 64;
            }
         } else {
            $$9 = 1;
            $$8 = new cxk(cxo.rn);
         }

         return new dfx(new dfv(cxo.oW, $$9), Optional.of(new dfv(cxo.rn)), $$8, 12, this.a, 0.2F);
      }
   }

   static class e implements cpi.g {
      private final cxk a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(cxg $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(cxg $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new cxk($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public dfx a(bvf $$0, bam $$1) {
         int $$2 = 5 + $$1.a(15);
         ke $$3 = $$0.dV().K_();
         Optional<ju.c<ddr>> $$4 = $$3.e(mb.aN).a(axx.m);
         cxk $$5 = ddt.a($$1, new cxk(this.a.h()), $$2, $$3, $$4);
         int $$6 = Math.min(this.b + $$2, 64);
         dfv $$7 = new dfv(cxo.oW, $$6);
         return new dfx($$7, $$5, this.c, this.d, this.e);
      }
   }

   static class f implements cpi.g {
      @Override
      public dfx a(bvf $$0, bam $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      dfx a(bvf var1, bam var2);
   }

   static class h implements cpi.g {
      private final dfv a;
      private final int b;
      private final cxk c;
      private final int d;
      private final int e;
      private final float f;
      private final Optional<aly<dez>> g;

      public h(dgz $$0, int $$1, int $$2, cxg $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new cxk($$3), $$4, $$5, $$6, $$7);
      }

      private h(dgz $$0, int $$1, int $$2, cxk $$3, int $$4, int $$5, int $$6, float $$7) {
         this(new dfv($$0, $$1), $$2, $$3.c($$4), $$5, $$6, $$7, Optional.empty());
      }

      h(dgz $$0, int $$1, int $$2, dgz $$3, int $$4, int $$5, int $$6, float $$7, aly<dez> $$8) {
         this(new dfv($$0, $$1), $$2, new cxk($$3, $$4), $$5, $$6, $$7, Optional.of($$8));
      }

      public h(dfv $$0, int $$1, cxk $$2, int $$3, int $$4, float $$5, Optional<aly<dez>> $$6) {
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
      public dfx a(bvf $$0, bam $$1) {
         cxk $$2 = this.c.v();
         dha $$3 = $$0.dV();
         this.g.ifPresent($$4 -> ddt.a($$2, $$3.K_(), (aly<dez>)$$4, $$3.d_($$0.dv()), $$1));
         return new dfx(new dfv(cxo.oW, this.b), Optional.of(this.a), $$2, 0, this.d, this.e, this.f);
      }
   }

   static class i implements cpi.g {
      private final cxk a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;
      private final Optional<aly<dez>> f;

      public i(dke $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cxk($$0), $$1, $$2, $$3, $$4);
      }

      public i(cxg $$0, int $$1, int $$2, int $$3) {
         this(new cxk($$0), $$1, $$2, 12, $$3);
      }

      public i(cxg $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cxk($$0), $$1, $$2, $$3, $$4);
      }

      public i(cxk $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(cxg $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new cxk($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(cxg $$0, int $$1, int $$2, int $$3, int $$4, float $$5, aly<dez> $$6) {
         this(new cxk($$0), $$1, $$2, $$3, $$4, $$5, Optional.of($$6));
      }

      public i(cxk $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this($$0, $$1, $$2, $$3, $$4, $$5, Optional.empty());
      }

      public i(cxk $$0, int $$1, int $$2, int $$3, int $$4, float $$5, Optional<aly<dez>> $$6) {
         this.a = $$0;
         this.b = $$1;
         this.a.e($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
         this.f = $$6;
      }

      @Override
      public dfx a(bvf $$0, bam $$1) {
         cxk $$2 = this.a.v();
         dha $$3 = $$0.dV();
         this.f.ifPresent($$4 -> ddt.a($$2, $$3.K_(), (aly<dez>)$$4, $$3.d_($$0.dv()), $$1));
         return new dfx(new dfv(cxo.oW, this.b), $$2, this.c, this.d, this.e);
      }
   }

   static class j implements cpi.g {
      private final dal a;
      private final int b;
      private final float c;

      public j(jq<bui> $$0, int $$1, int $$2) {
         this(new dal(List.of(new dal.a($$0, $$1))), $$2, 0.05F);
      }

      public j(dal $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public dfx a(bvf $$0, bam $$1) {
         cxk $$2 = new cxk(cxo.wM, 1);
         $$2.b(ku.R, this.a);
         return new dfx(new dfv(cxo.oW), $$2, 12, this.b, this.c);
      }
   }

   static class k implements cpi.g {
      private final cxk a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final cxg f;
      private final int g;
      private final float h;

      public k(cxg $$0, int $$1, cxg $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new cxk($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public dfx a(bvf $$0, bam $$1) {
         dfv $$2 = new dfv(cxo.oW, this.c);
         List<jq<czh>> $$3 = ma.h.c().filter($$1x -> !((czh)$$1x.a()).a().isEmpty() && $$0.dV().K().a($$1x)).collect(Collectors.toList());
         jq<czh> $$4 = ae.a($$3, $$1);
         cxk $$5 = new cxk(this.a.h(), this.b);
         $$5.b(ku.Q, new czj($$4));
         return new dfx($$2, Optional.of(new dfv(this.f, this.g)), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements cpi.g {
      private final int a;
      private final ayk<eoc> b;
      private final String c;
      private final jq<eve> d;
      private final int e;
      private final int f;

      public l(int $$0, ayk<eoc> $$1, String $$2, jq<eve> $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public dfx a(bvf $$0, bam $$1) {
         if (!($$0.dV() instanceof ash)) {
            return null;
         } else {
            ash $$2 = (ash)$$0.dV();
            jh $$3 = $$2.a(this.b, $$0.dv(), 100, true);
            if ($$3 != null) {
               cxk $$4 = cxx.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               cxx.a($$2, $$4);
               evj.a($$4, $$3, "+", this.d);
               $$4.b(ku.h, xv.c(this.c));
               return new dfx(new dfv(cxo.oW, this.a), Optional.of(new dfv(cxo.rq)), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static record m(Map<cpj, cpi.g> a) implements cpi.g {
      public static cpi.m a(cpi.g $$0, cpj... $$1) {
         return new cpi.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public dfx a(bvf $$0, bam $$1) {
         if ($$0 instanceof cpg $$2) {
            cpj $$3 = $$2.gw().a();
            cpi.g $$4 = this.a.get($$3);
            return $$4 == null ? null : $$4.a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
