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

public class clp {
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
   public static final Map<clo, Int2ObjectMap<clp.g[]>> a = ad.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            clo.g,
            a(
               ImmutableMap.of(
                  1,
                  new clp.g[]{
                     new clp.b(cuk.qP, 20, 16, 2),
                     new clp.b(cuk.vI, 26, 16, 2),
                     new clp.b(cuk.vH, 22, 16, 2),
                     new clp.b(cuk.wV, 15, 16, 2),
                     new clp.i(cuk.qQ, 1, 6, 16, 1)
                  },
                  2,
                  new clp.g[]{new clp.b(dfe.fR, 6, 12, 10), new clp.i(cuk.we, 1, 4, 5), new clp.i(cuk.pJ, 1, 4, 16, 5)},
                  3,
                  new clp.g[]{new clp.i(cuk.tp, 3, 18, 10), new clp.b(dfe.fS, 4, 12, 20)},
                  4,
                  new clp.g[]{
                     new clp.i(dfe.eY, 1, 1, 12, 15),
                     new clp.j(brj.p, 100, 15),
                     new clp.j(brj.h, 160, 15),
                     new clp.j(brj.r, 140, 15),
                     new clp.j(brj.o, 120, 15),
                     new clp.j(brj.s, 280, 15),
                     new clp.j(brj.w, 7, 15)
                  },
                  5,
                  new clp.g[]{new clp.i(cuk.vV, 3, 3, 30), new clp.i(cuk.tQ, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            clo.h,
            a(
               ImmutableMap.of(
                  1,
                  new clp.g[]{
                     new clp.b(cuk.qL, 20, 16, 2),
                     new clp.b(cuk.pM, 10, 16, 2),
                     new clp.h(cuk.sw, 6, 1, cuk.sA, 6, 16, 1, 0.05F),
                     new clp.i(cuk.se, 3, 1, 16, 1)
                  },
                  2,
                  new clp.g[]{new clp.b(cuk.sw, 15, 16, 10), new clp.h(cuk.sx, 6, 1, cuk.sB, 6, 16, 5, 0.05F), new clp.i(cuk.yf, 2, 1, 5)},
                  3,
                  new clp.g[]{new clp.b(cuk.sx, 13, 16, 20), new clp.e(cuk.ss, 3, 3, 10, 0.2F)},
                  4,
                  new clp.g[]{new clp.b(cuk.sy, 6, 12, 30)},
                  5,
                  new clp.g[]{
                     new clp.b(cuk.sz, 4, 12, 30),
                     new clp.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(clq.c, cuk.pk)
                           .put(clq.g, cuk.pm)
                           .put(clq.e, cuk.pm)
                           .put(clq.a, cuk.pq)
                           .put(clq.b, cuk.pq)
                           .put(clq.d, cuk.ps)
                           .put(clq.f, cuk.pw)
                           .put(clq.h, cuk.pA)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            clo.n,
            a(
               ImmutableMap.of(
                  1,
                  new clp.g[]{
                     new clp.b(dfe.ck, 18, 16, 2),
                     new clp.b(dfe.cw, 18, 16, 2),
                     new clp.b(dfe.cz, 18, 16, 2),
                     new clp.b(dfe.cr, 18, 16, 2),
                     new clp.i(cuk.ts, 2, 1, 1)
                  },
                  2,
                  new clp.g[]{
                     new clp.b(cuk.sF, 12, 16, 10),
                     new clp.b(cuk.sM, 12, 16, 10),
                     new clp.b(cuk.sU, 12, 16, 10),
                     new clp.b(cuk.sI, 12, 16, 10),
                     new clp.b(cuk.sK, 12, 16, 10),
                     new clp.i(dfe.ck, 1, 1, 16, 5),
                     new clp.i(dfe.cl, 1, 1, 16, 5),
                     new clp.i(dfe.cm, 1, 1, 16, 5),
                     new clp.i(dfe.cn, 1, 1, 16, 5),
                     new clp.i(dfe.co, 1, 1, 16, 5),
                     new clp.i(dfe.cp, 1, 1, 16, 5),
                     new clp.i(dfe.cq, 1, 1, 16, 5),
                     new clp.i(dfe.cr, 1, 1, 16, 5),
                     new clp.i(dfe.cs, 1, 1, 16, 5),
                     new clp.i(dfe.ct, 1, 1, 16, 5),
                     new clp.i(dfe.cu, 1, 1, 16, 5),
                     new clp.i(dfe.cv, 1, 1, 16, 5),
                     new clp.i(dfe.cw, 1, 1, 16, 5),
                     new clp.i(dfe.cx, 1, 1, 16, 5),
                     new clp.i(dfe.cy, 1, 1, 16, 5),
                     new clp.i(dfe.cz, 1, 1, 16, 5),
                     new clp.i(dfe.je, 1, 4, 16, 5),
                     new clp.i(dfe.jf, 1, 4, 16, 5),
                     new clp.i(dfe.jg, 1, 4, 16, 5),
                     new clp.i(dfe.jh, 1, 4, 16, 5),
                     new clp.i(dfe.ji, 1, 4, 16, 5),
                     new clp.i(dfe.jj, 1, 4, 16, 5),
                     new clp.i(dfe.jk, 1, 4, 16, 5),
                     new clp.i(dfe.jl, 1, 4, 16, 5),
                     new clp.i(dfe.jm, 1, 4, 16, 5),
                     new clp.i(dfe.jn, 1, 4, 16, 5),
                     new clp.i(dfe.jo, 1, 4, 16, 5),
                     new clp.i(dfe.jp, 1, 4, 16, 5),
                     new clp.i(dfe.jq, 1, 4, 16, 5),
                     new clp.i(dfe.jr, 1, 4, 16, 5),
                     new clp.i(dfe.js, 1, 4, 16, 5),
                     new clp.i(dfe.jt, 1, 4, 16, 5)
                  },
                  3,
                  new clp.g[]{
                     new clp.b(cuk.sJ, 12, 16, 20),
                     new clp.b(cuk.sN, 12, 16, 20),
                     new clp.b(cuk.sG, 12, 16, 20),
                     new clp.b(cuk.sT, 12, 16, 20),
                     new clp.b(cuk.sL, 12, 16, 20),
                     new clp.i(dfe.bJ, 3, 1, 12, 10),
                     new clp.i(dfe.bN, 3, 1, 12, 10),
                     new clp.i(dfe.bX, 3, 1, 12, 10),
                     new clp.i(dfe.bY, 3, 1, 12, 10),
                     new clp.i(dfe.bU, 3, 1, 12, 10),
                     new clp.i(dfe.bV, 3, 1, 12, 10),
                     new clp.i(dfe.bS, 3, 1, 12, 10),
                     new clp.i(dfe.bQ, 3, 1, 12, 10),
                     new clp.i(dfe.bW, 3, 1, 12, 10),
                     new clp.i(dfe.bM, 3, 1, 12, 10),
                     new clp.i(dfe.bR, 3, 1, 12, 10),
                     new clp.i(dfe.bO, 3, 1, 12, 10),
                     new clp.i(dfe.bL, 3, 1, 12, 10),
                     new clp.i(dfe.bK, 3, 1, 12, 10),
                     new clp.i(dfe.bP, 3, 1, 12, 10),
                     new clp.i(dfe.bT, 3, 1, 12, 10)
                  },
                  4,
                  new clp.g[]{
                     new clp.b(cuk.sR, 12, 16, 30),
                     new clp.b(cuk.sP, 12, 16, 30),
                     new clp.b(cuk.sQ, 12, 16, 30),
                     new clp.b(cuk.sS, 12, 16, 30),
                     new clp.b(cuk.sH, 12, 16, 30),
                     new clp.b(cuk.sO, 12, 16, 30),
                     new clp.i(cuk.wA, 3, 1, 12, 15),
                     new clp.i(cuk.wL, 3, 1, 12, 15),
                     new clp.i(cuk.wD, 3, 1, 12, 15),
                     new clp.i(cuk.wO, 3, 1, 12, 15),
                     new clp.i(cuk.wG, 3, 1, 12, 15),
                     new clp.i(cuk.wN, 3, 1, 12, 15),
                     new clp.i(cuk.wF, 3, 1, 12, 15),
                     new clp.i(cuk.wH, 3, 1, 12, 15),
                     new clp.i(cuk.wP, 3, 1, 12, 15),
                     new clp.i(cuk.wK, 3, 1, 12, 15),
                     new clp.i(cuk.wC, 3, 1, 12, 15),
                     new clp.i(cuk.wJ, 3, 1, 12, 15),
                     new clp.i(cuk.wM, 3, 1, 12, 15),
                     new clp.i(cuk.wE, 3, 1, 12, 15),
                     new clp.i(cuk.wB, 3, 1, 12, 15),
                     new clp.i(cuk.wI, 3, 1, 12, 15)
                  },
                  5,
                  new clp.g[]{new clp.i(cuk.ru, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            clo.i,
            a(
               ImmutableMap.of(
                  1,
                  new clp.g[]{new clp.b(cuk.qI, 32, 16, 2), new clp.i(cuk.pL, 1, 16, 1), new clp.h(dfe.ar, 10, 1, cuk.rr, 10, 12, 1, 0.05F)},
                  2,
                  new clp.g[]{new clp.b(cuk.rr, 26, 12, 10), new clp.i(cuk.pK, 2, 1, 5)},
                  3,
                  new clp.g[]{new clp.b(cuk.qL, 14, 16, 20), new clp.i(cuk.xE, 3, 1, 10)},
                  4,
                  new clp.g[]{new clp.b(cuk.qM, 24, 16, 30), new clp.e(cuk.pK, 2, 3, 15)},
                  5,
                  new clp.g[]{new clp.b(cuk.nr, 8, 12, 30), new clp.e(cuk.xE, 3, 3, 15), new clp.k(cuk.pL, 5, cuk.xb, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            clo.k,
            a(
               ImmutableMap.builder()
                  .put(1, new clp.g[]{new clp.b(cuk.sl, 24, 16, 2), new clp.d(1), new clp.i(dfe.cW, 9, 1, 12, 1)})
                  .put(2, new clp.g[]{new clp.b(cuk.sm, 4, 12, 10), new clp.d(5), new clp.i(cuk.yb, 1, 1, 5)})
                  .put(3, new clp.g[]{new clp.b(cuk.sC, 5, 12, 20), new clp.d(10), new clp.i(cuk.dN, 1, 4, 10)})
                  .put(4, new clp.g[]{new clp.b(cuk.vB, 2, 12, 30), new clp.d(15), new clp.i(cuk.st, 5, 1, 15), new clp.i(cuk.sp, 4, 1, 15)})
                  .put(5, new clp.g[]{new clp.i(cuk.ww, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            clo.e,
            a(
               ImmutableMap.of(
                  1,
                  new clp.g[]{new clp.b(cuk.sl, 24, 16, 2), new clp.i(cuk.vU, 7, 1, 1)},
                  2,
                  new clp.g[]{new clp.b(cuk.hg, 11, 16, 10), new clp.l(13, awp.d, "filled_map.monument", eqp.j, 12, 5)},
                  3,
                  new clp.g[]{
                     new clp.b(cuk.sp, 1, 12, 20),
                     new clp.l(14, awp.c, "filled_map.mansion", eqp.i, 12, 10),
                     new clp.l(12, awp.m, "filled_map.trial_chambers", eqp.I, 12, 10)
                  },
                  4,
                  new clp.g[]{
                     new clp.i(cuk.vE, 7, 1, 15),
                     new clp.i(cuk.wA, 3, 1, 15),
                     new clp.i(cuk.wL, 3, 1, 15),
                     new clp.i(cuk.wD, 3, 1, 15),
                     new clp.i(cuk.wO, 3, 1, 15),
                     new clp.i(cuk.wG, 3, 1, 15),
                     new clp.i(cuk.wN, 3, 1, 15),
                     new clp.i(cuk.wF, 3, 1, 15),
                     new clp.i(cuk.wH, 3, 1, 15),
                     new clp.i(cuk.wP, 3, 1, 15),
                     new clp.i(cuk.wK, 3, 1, 15),
                     new clp.i(cuk.wC, 3, 1, 15),
                     new clp.i(cuk.wJ, 3, 1, 15),
                     new clp.i(cuk.wM, 3, 1, 15),
                     new clp.i(cuk.wE, 3, 1, 15),
                     new clp.i(cuk.wB, 3, 1, 15),
                     new clp.i(cuk.wI, 3, 1, 15)
                  },
                  5,
                  new clp.g[]{new clp.i(cuk.xL, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            clo.f,
            a(
               ImmutableMap.of(
                  1,
                  new clp.g[]{new clp.b(cuk.tB, 32, 16, 2), new clp.i(cuk.mW, 1, 2, 1)},
                  2,
                  new clp.g[]{new clp.b(cuk.qb, 3, 12, 10), new clp.i(cuk.pQ, 1, 1, 5)},
                  3,
                  new clp.g[]{new clp.b(cuk.wo, 2, 12, 20), new clp.i(dfe.eQ, 4, 1, 12, 10)},
                  4,
                  new clp.g[]{new clp.b(cuk.pF, 4, 12, 30), new clp.b(cuk.tI, 9, 12, 30), new clp.i(cuk.tC, 5, 1, 15)},
                  5,
                  new clp.g[]{new clp.b(cuk.tG, 22, 12, 30), new clp.i(cuk.vy, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            clo.c,
            a(
               ImmutableMap.of(
                  1,
                  new clp.g[]{
                     new clp.b(cuk.pM, 15, 16, 2),
                     new clp.i(new cuh(cuk.rb), 7, 1, 12, 1, 0.2F),
                     new clp.i(new cuh(cuk.rc), 4, 1, 12, 1, 0.2F),
                     new clp.i(new cuh(cuk.qZ), 5, 1, 12, 1, 0.2F),
                     new clp.i(new cuh(cuk.ra), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new clp.g[]{
                     new clp.b(cuk.pX, 4, 12, 10),
                     new clp.i(new cuh(cuk.ya), 36, 1, 12, 5, 0.2F),
                     new clp.i(new cuh(cuk.qY), 1, 1, 12, 5, 0.2F),
                     new clp.i(new cuh(cuk.qX), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new clp.g[]{
                     new clp.b(cuk.rX, 1, 12, 20),
                     new clp.b(cuk.pO, 1, 12, 20),
                     new clp.i(new cuh(cuk.qV), 1, 1, 12, 10, 0.2F),
                     new clp.i(new cuh(cuk.qW), 4, 1, 12, 10, 0.2F),
                     new clp.i(new cuh(cuk.xd), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new clp.g[]{new clp.e(cuk.rf, 14, 3, 15, 0.2F), new clp.e(cuk.rg, 8, 3, 15, 0.2F)},
                  5,
                  new clp.g[]{new clp.e(cuk.rd, 8, 3, 30, 0.2F), new clp.e(cuk.re, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            clo.p,
            a(
               ImmutableMap.of(
                  1,
                  new clp.g[]{new clp.b(cuk.pM, 15, 16, 2), new clp.i(new cuh(cuk.qw), 3, 1, 12, 1, 0.2F), new clp.e(cuk.qt, 2, 3, 1)},
                  2,
                  new clp.g[]{new clp.b(cuk.pX, 4, 12, 10), new clp.i(new cuh(cuk.ya), 36, 1, 12, 5, 0.2F)},
                  3,
                  new clp.g[]{new clp.b(cuk.rr, 24, 12, 20)},
                  4,
                  new clp.g[]{new clp.b(cuk.pO, 1, 12, 30), new clp.e(cuk.qB, 12, 3, 15, 0.2F)},
                  5,
                  new clp.g[]{new clp.e(cuk.qy, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            clo.o,
            a(
               ImmutableMap.of(
                  1,
                  new clp.g[]{
                     new clp.b(cuk.pM, 15, 16, 2),
                     new clp.i(new cuh(cuk.qm), 1, 1, 12, 1, 0.2F),
                     new clp.i(new cuh(cuk.qk), 1, 1, 12, 1, 0.2F),
                     new clp.i(new cuh(cuk.ql), 1, 1, 12, 1, 0.2F),
                     new clp.i(new cuh(cuk.qn), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new clp.g[]{new clp.b(cuk.pX, 4, 12, 10), new clp.i(new cuh(cuk.ya), 36, 1, 12, 5, 0.2F)},
                  3,
                  new clp.g[]{
                     new clp.b(cuk.rr, 30, 12, 20),
                     new clp.e(cuk.qw, 1, 3, 10, 0.2F),
                     new clp.e(cuk.qu, 2, 3, 10, 0.2F),
                     new clp.e(cuk.qv, 3, 3, 10, 0.2F),
                     new clp.i(new cuh(cuk.qC), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new clp.g[]{new clp.b(cuk.pO, 1, 12, 30), new clp.e(cuk.qB, 12, 3, 15, 0.2F), new clp.e(cuk.qz, 5, 3, 15, 0.2F)},
                  5,
                  new clp.g[]{new clp.e(cuk.qA, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            clo.d,
            a(
               ImmutableMap.of(
                  1,
                  new clp.g[]{new clp.b(cuk.tz, 14, 16, 2), new clp.b(cuk.rs, 7, 16, 2), new clp.b(cuk.wl, 4, 16, 2), new clp.i(cuk.wn, 1, 1, 1)},
                  2,
                  new clp.g[]{new clp.b(cuk.pM, 15, 16, 2), new clp.i(cuk.rt, 1, 5, 16, 5), new clp.i(cuk.tA, 1, 8, 16, 5)},
                  3,
                  new clp.g[]{new clp.b(cuk.wy, 7, 16, 20), new clp.b(cuk.tx, 10, 16, 20)},
                  4,
                  new clp.g[]{new clp.b(cuk.sk, 10, 12, 30)},
                  5,
                  new clp.g[]{new clp.b(cuk.yd, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            clo.j,
            a(
               ImmutableMap.of(
                  1,
                  new clp.g[]{new clp.b(cuk.sa, 6, 16, 2), new clp.a(cuk.qT, 3), new clp.a(cuk.qS, 7)},
                  2,
                  new clp.g[]{new clp.b(cuk.rr, 26, 12, 10), new clp.a(cuk.qR, 5, 12, 5), new clp.a(cuk.qU, 4, 12, 5)},
                  3,
                  new clp.g[]{new clp.b(cuk.wp, 9, 12, 20), new clp.a(cuk.qS, 7)},
                  4,
                  new clp.g[]{new clp.b(cuk.pF, 4, 12, 30), new clp.a(cuk.wu, 6, 12, 15)},
                  5,
                  new clp.g[]{new clp.i(new cuh(cuk.pb), 6, 1, 12, 30, 0.2F), new clp.a(cuk.qR, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            clo.l,
            a(
               ImmutableMap.of(
                  1,
                  new clp.g[]{new clp.b(cuk.sj, 10, 16, 2), new clp.i(cuk.si, 1, 10, 16, 1)},
                  2,
                  new clp.g[]{new clp.b(dfe.b, 20, 16, 10), new clp.i(dfe.fC, 1, 4, 16, 5)},
                  3,
                  new clp.g[]{
                     new clp.b(dfe.d, 16, 16, 20),
                     new clp.b(dfe.h, 16, 16, 20),
                     new clp.b(dfe.f, 16, 16, 20),
                     new clp.i(dfe.tR, 1, 4, 16, 10),
                     new clp.i(dfe.i, 1, 4, 16, 10),
                     new clp.i(dfe.g, 1, 4, 16, 10),
                     new clp.i(dfe.e, 1, 4, 16, 10)
                  },
                  4,
                  new clp.g[]{
                     new clp.b(cuk.pU, 12, 12, 30),
                     new clp.i(dfe.ie, 1, 1, 12, 15),
                     new clp.i(dfe.id, 1, 1, 12, 15),
                     new clp.i(dfe.io, 1, 1, 12, 15),
                     new clp.i(dfe.ig, 1, 1, 12, 15),
                     new clp.i(dfe.ik, 1, 1, 12, 15),
                     new clp.i(dfe.il, 1, 1, 12, 15),
                     new clp.i(dfe.is, 1, 1, 12, 15),
                     new clp.i(dfe.ir, 1, 1, 12, 15),
                     new clp.i(dfe.ij, 1, 1, 12, 15),
                     new clp.i(dfe.if, 1, 1, 12, 15),
                     new clp.i(dfe.ii, 1, 1, 12, 15),
                     new clp.i(dfe.iq, 1, 1, 12, 15),
                     new clp.i(dfe.im, 1, 1, 12, 15),
                     new clp.i(dfe.in, 1, 1, 12, 15),
                     new clp.i(dfe.ih, 1, 1, 12, 15),
                     new clp.i(dfe.ip, 1, 1, 12, 15),
                     new clp.i(dfe.mf, 1, 1, 12, 15),
                     new clp.i(dfe.me, 1, 1, 12, 15),
                     new clp.i(dfe.mp, 1, 1, 12, 15),
                     new clp.i(dfe.mh, 1, 1, 12, 15),
                     new clp.i(dfe.ml, 1, 1, 12, 15),
                     new clp.i(dfe.mm, 1, 1, 12, 15),
                     new clp.i(dfe.mt, 1, 1, 12, 15),
                     new clp.i(dfe.ms, 1, 1, 12, 15),
                     new clp.i(dfe.mk, 1, 1, 12, 15),
                     new clp.i(dfe.mg, 1, 1, 12, 15),
                     new clp.i(dfe.mj, 1, 1, 12, 15),
                     new clp.i(dfe.mr, 1, 1, 12, 15),
                     new clp.i(dfe.mn, 1, 1, 12, 15),
                     new clp.i(dfe.mo, 1, 1, 12, 15),
                     new clp.i(dfe.mi, 1, 1, 12, 15),
                     new clp.i(dfe.mq, 1, 1, 12, 15)
                  },
                  5,
                  new clp.g[]{new clp.i(dfe.hZ, 1, 1, 12, 30), new clp.i(dfe.hX, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<clp.g[]> b = a(
      ImmutableMap.of(
         1,
         new clp.g[]{
            new clp.i(cuk.ea, 2, 1, 5, 1),
            new clp.i(cuk.sn, 4, 1, 5, 1),
            new clp.i(cuk.gH, 2, 1, 5, 1),
            new clp.i(cuk.xC, 5, 1, 5, 1),
            new clp.i(cuk.dV, 1, 1, 12, 1),
            new clp.i(cuk.eR, 1, 1, 8, 1),
            new clp.i(cuk.gv, 1, 1, 4, 1),
            new clp.i(cuk.eS, 3, 1, 12, 1),
            new clp.i(cuk.gh, 3, 1, 8, 1),
            new clp.i(cuk.er, 1, 1, 12, 1),
            new clp.i(cuk.es, 1, 1, 12, 1),
            new clp.i(cuk.et, 1, 1, 8, 1),
            new clp.i(cuk.eu, 1, 1, 12, 1),
            new clp.i(cuk.ev, 1, 1, 12, 1),
            new clp.i(cuk.ew, 1, 1, 12, 1),
            new clp.i(cuk.ex, 1, 1, 12, 1),
            new clp.i(cuk.ey, 1, 1, 12, 1),
            new clp.i(cuk.ez, 1, 1, 12, 1),
            new clp.i(cuk.eA, 1, 1, 12, 1),
            new clp.i(cuk.eB, 1, 1, 12, 1),
            new clp.i(cuk.eC, 1, 1, 7, 1),
            new clp.i(cuk.qO, 1, 1, 12, 1),
            new clp.i(cuk.wW, 1, 1, 12, 1),
            new clp.i(cuk.tv, 1, 1, 12, 1),
            new clp.i(cuk.tw, 1, 1, 12, 1),
            new clp.i(cuk.aG, 5, 1, 8, 1),
            new clp.i(cuk.aE, 5, 1, 8, 1),
            new clp.i(cuk.aI, 5, 1, 8, 1),
            new clp.i(cuk.aF, 5, 1, 8, 1),
            new clp.i(cuk.aC, 5, 1, 8, 1),
            new clp.i(cuk.aD, 5, 1, 8, 1),
            new clp.i(cuk.aH, 5, 1, 8, 1),
            new clp.i(cuk.aJ, 5, 1, 8, 1),
            new clp.i(cuk.sT, 1, 3, 12, 1),
            new clp.i(cuk.sF, 1, 3, 12, 1),
            new clp.i(cuk.sQ, 1, 3, 12, 1),
            new clp.i(cuk.sL, 1, 3, 12, 1),
            new clp.i(cuk.sU, 1, 3, 12, 1),
            new clp.i(cuk.sS, 1, 3, 12, 1),
            new clp.i(cuk.sN, 1, 3, 12, 1),
            new clp.i(cuk.sH, 1, 3, 12, 1),
            new clp.i(cuk.sJ, 1, 3, 12, 1),
            new clp.i(cuk.sM, 1, 3, 12, 1),
            new clp.i(cuk.sP, 1, 3, 12, 1),
            new clp.i(cuk.sI, 1, 3, 12, 1),
            new clp.i(cuk.sK, 1, 3, 12, 1),
            new clp.i(cuk.sG, 1, 3, 12, 1),
            new clp.i(cuk.sR, 1, 3, 12, 1),
            new clp.i(cuk.sO, 1, 3, 12, 1),
            new clp.i(cuk.lM, 3, 1, 8, 1),
            new clp.i(cuk.lN, 3, 1, 8, 1),
            new clp.i(cuk.lO, 3, 1, 8, 1),
            new clp.i(cuk.lP, 3, 1, 8, 1),
            new clp.i(cuk.lL, 3, 1, 8, 1),
            new clp.i(cuk.hi, 1, 1, 12, 1),
            new clp.i(cuk.eI, 1, 1, 12, 1),
            new clp.i(cuk.eJ, 1, 1, 12, 1),
            new clp.i(cuk.ho, 1, 2, 5, 1),
            new clp.i(cuk.eY, 1, 2, 5, 1),
            new clp.i(cuk.aM, 1, 8, 8, 1),
            new clp.i(cuk.aP, 1, 4, 6, 1),
            new clp.i(cuk.yY, 1, 2, 5, 1),
            new clp.i(cuk.K, 1, 2, 5, 1),
            new clp.i(cuk.eV, 1, 2, 5, 1)
         },
         2,
         new clp.g[]{
            new clp.i(cuk.sf, 5, 1, 4, 1),
            new clp.i(cuk.sc, 5, 1, 4, 1),
            new clp.i(cuk.jj, 3, 1, 6, 1),
            new clp.i(cuk.mk, 6, 1, 6, 1),
            new clp.i(cuk.qN, 1, 1, 8, 1),
            new clp.i(cuk.J, 3, 3, 6, 1)
         }
      )
   );
   private static final clp.l s = new clp.l(8, awp.f, "filled_map.village_desert", eqp.B, 12, 5);
   private static final clp.l t = new clp.l(8, awp.e, "filled_map.village_savanna", eqp.D, 12, 5);
   private static final clp.l u = new clp.l(8, awp.g, "filled_map.village_plains", eqp.C, 12, 5);
   private static final clp.l v = new clp.l(8, awp.h, "filled_map.village_taiga", eqp.F, 12, 5);
   private static final clp.l w = new clp.l(8, awp.i, "filled_map.village_snowy", eqp.E, 12, 5);
   private static final clp.l x = new clp.l(8, awp.j, "filled_map.explorer_jungle", eqp.G, 12, 5);
   private static final clp.l y = new clp.l(8, awp.k, "filled_map.explorer_swamp", eqp.H, 12, 5);
   public static final Map<clo, Int2ObjectMap<clp.g[]>> c = Map.of(
      clo.k,
      a(
         ImmutableMap.builder()
            .put(1, new clp.g[]{new clp.b(cuk.sl, 24, 16, 2), a(1), new clp.i(dfe.cW, 9, 1, 12, 1)})
            .put(2, new clp.g[]{new clp.b(cuk.sm, 4, 12, 10), a(5), new clp.i(cuk.yb, 1, 1, 5)})
            .put(3, new clp.g[]{new clp.b(cuk.sC, 5, 12, 20), a(10), new clp.i(cuk.dN, 1, 4, 10)})
            .put(4, new clp.g[]{new clp.b(cuk.vB, 2, 12, 30), new clp.i(cuk.st, 5, 1, 15), new clp.i(cuk.sp, 4, 1, 15)})
            .put(5, new clp.g[]{a(), new clp.i(cuk.ww, 20, 1, 30)})
            .build()
      ),
      clo.c,
      a(
         ImmutableMap.builder()
            .put(1, new clp.g[]{new clp.b(cuk.pM, 15, 12, 2), new clp.b(cuk.pX, 5, 12, 2)})
            .put(
               2,
               new clp.g[]{
                  clp.m.a(new clp.i(cuk.rc, 4, 1, 12, 5, 0.05F), clq.a, clq.c, clq.d, clq.e, clq.g, clq.h),
                  clp.m.a(new clp.i(cuk.qY, 4, 1, 12, 5, 0.05F), clq.b, clq.f),
                  clp.m.a(new clp.i(cuk.qZ, 5, 1, 12, 5, 0.05F), clq.a, clq.c, clq.d, clq.e, clq.g, clq.h),
                  clp.m.a(new clp.i(cuk.qV, 5, 1, 12, 5, 0.05F), clq.b, clq.f),
                  clp.m.a(new clp.i(cuk.rb, 7, 1, 12, 5, 0.05F), clq.a, clq.c, clq.d, clq.e, clq.g, clq.h),
                  clp.m.a(new clp.i(cuk.qX, 7, 1, 12, 5, 0.05F), clq.b, clq.f),
                  clp.m.a(new clp.i(cuk.ra, 9, 1, 12, 5, 0.05F), clq.a, clq.c, clq.d, clq.e, clq.g, clq.h),
                  clp.m.a(new clp.i(cuk.qW, 9, 1, 12, 5, 0.05F), clq.b, clq.f)
               }
            )
            .put(3, new clp.g[]{new clp.b(cuk.rX, 1, 12, 20), new clp.i(cuk.xd, 5, 1, 12, 10, 0.05F), new clp.i(cuk.ya, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new clp.g[]{
                  clp.m.a(new clp.i(a(cuk.rc, dag.h, 1), 8, 1, 3, 15, 0.05F), clq.a),
                  clp.m.a(new clp.i(a(cuk.qZ, dag.h, 1), 9, 1, 3, 15, 0.05F), clq.a),
                  clp.m.a(new clp.i(a(cuk.rb, dag.h, 1), 11, 1, 3, 15, 0.05F), clq.a),
                  clp.m.a(new clp.i(a(cuk.ra, dag.h, 1), 13, 1, 3, 15, 0.05F), clq.a),
                  clp.m.a(new clp.i(a(cuk.rc, dag.a, 1), 8, 1, 3, 15, 0.05F), clq.c, clq.h),
                  clp.m.a(new clp.i(a(cuk.qZ, dag.a, 1), 9, 1, 3, 15, 0.05F), clq.c, clq.h),
                  clp.m.a(new clp.i(a(cuk.rb, dag.a, 1), 11, 1, 3, 15, 0.05F), clq.c, clq.h),
                  clp.m.a(new clp.i(a(cuk.ra, dag.a, 1), 13, 1, 3, 15, 0.05F), clq.c, clq.h),
                  clp.m.a(new clp.i(a(cuk.rc, dag.k, 1), 2, 1, 3, 15, 0.05F), clq.d),
                  clp.m.a(new clp.i(a(cuk.qZ, dag.k, 1), 3, 1, 3, 15, 0.05F), clq.d),
                  clp.m.a(new clp.i(a(cuk.rb, dag.k, 1), 5, 1, 3, 15, 0.05F), clq.d),
                  clp.m.a(new clp.i(a(cuk.ra, dag.k, 1), 7, 1, 3, 15, 0.05F), clq.d),
                  clp.m.a(new clp.i(a(cuk.rc, dag.j, 1), 8, 1, 3, 15, 0.05F), clq.e),
                  clp.m.a(new clp.i(a(cuk.qZ, dag.g, 1), 9, 1, 3, 15, 0.05F), clq.e),
                  clp.m.a(new clp.i(a(cuk.qY, dag.w, 1), 8, 1, 3, 15, 0.05F), clq.b),
                  clp.m.a(new clp.i(a(cuk.qV, dag.w, 1), 9, 1, 3, 15, 0.05F), clq.b),
                  clp.m.a(new clp.i(a(cuk.qX, dag.w, 1), 11, 1, 3, 15, 0.05F), clq.b),
                  clp.m.a(new clp.i(a(cuk.qW, dag.w, 1), 13, 1, 3, 15, 0.05F), clq.b),
                  clp.m.a(new clp.i(a(cuk.qY, dag.M, 1), 8, 1, 3, 15, 0.05F), clq.f),
                  clp.m.a(new clp.i(a(cuk.qV, dag.M, 1), 9, 1, 3, 15, 0.05F), clq.f),
                  clp.m.a(new clp.i(a(cuk.qX, dag.M, 1), 11, 1, 3, 15, 0.05F), clq.f),
                  clp.m.a(new clp.i(a(cuk.qW, dag.M, 1), 13, 1, 3, 15, 0.05F), clq.f),
                  clp.m.a(new clp.h(cuk.rg, 1, 4, cuk.rf, 1, 3, 15, 0.05F), clq.g),
                  clp.m.a(new clp.h(cuk.rf, 1, 4, cuk.re, 1, 3, 15, 0.05F), clq.g),
                  clp.m.a(new clp.h(cuk.rd, 1, 4, cuk.rg, 1, 3, 15, 0.05F), clq.g),
                  clp.m.a(new clp.h(cuk.re, 1, 2, cuk.rd, 1, 3, 15, 0.05F), clq.g)
               }
            )
            .put(
               5,
               new clp.g[]{
                  clp.m.a(new clp.h(cuk.pO, 4, 16, a(cuk.re, dag.h, 1), 1, 3, 30, 0.05F), clq.a),
                  clp.m.a(new clp.h(cuk.pO, 3, 16, a(cuk.rf, dag.h, 1), 1, 3, 30, 0.05F), clq.a),
                  clp.m.a(new clp.h(cuk.pO, 3, 16, a(cuk.rf, dag.a, 1), 1, 3, 30, 0.05F), clq.c, clq.h),
                  clp.m.a(new clp.h(cuk.pO, 2, 12, a(cuk.rg, dag.a, 1), 1, 3, 30, 0.05F), clq.c, clq.h),
                  clp.m.a(new clp.h(cuk.pO, 2, 6, a(cuk.rd, dag.k, 1), 1, 3, 30, 0.05F), clq.d),
                  clp.m.a(new clp.h(cuk.pO, 3, 8, a(cuk.re, dag.k, 1), 1, 3, 30, 0.05F), clq.d),
                  clp.m.a(new clp.h(cuk.pO, 2, 12, a(cuk.rg, dag.j, 1), 1, 3, 30, 0.05F), clq.e),
                  clp.m.a(new clp.h(cuk.pO, 3, 12, a(cuk.rd, dag.g, 1), 1, 3, 30, 0.05F), clq.e),
                  clp.m.a(new clp.i(a(cuk.qV, dag.e, 1), 9, 1, 3, 30, 0.05F), clq.b),
                  clp.m.a(new clp.i(a(cuk.qY, dag.c, 1), 8, 1, 3, 30, 0.05F), clq.b),
                  clp.m.a(new clp.i(a(cuk.qV, dag.f, 1), 9, 1, 3, 30, 0.05F), clq.f),
                  clp.m.a(new clp.i(a(cuk.qY, dag.i, 1), 8, 1, 3, 30, 0.05F), clq.f),
                  clp.m.a(new clp.h(cuk.pO, 4, 18, a(cuk.re, dag.d, 1), 1, 3, 30, 0.05F), clq.g),
                  clp.m.a(new clp.h(cuk.pO, 3, 18, a(cuk.rf, dag.d, 1), 1, 3, 30, 0.05F), clq.g),
                  clp.m.a(new clp.b(cuk.bD, 1, 12, 30, 42), clq.g),
                  clp.m.a(new clp.b(cuk.bA, 1, 12, 30, 4), clq.a, clq.b, clq.c, clq.d, clq.e, clq.f, clq.h)
               }
            )
            .build()
      ),
      clo.e,
      a(
         ImmutableMap.of(
            1,
            new clp.g[]{new clp.b(cuk.sl, 24, 16, 2), new clp.i(cuk.vU, 7, 1, 1)},
            2,
            new clp.g[]{
               new clp.b(cuk.hg, 11, 16, 10),
               new clp.m(
                  ImmutableMap.builder()
                     .put(clq.a, t)
                     .put(clq.d, u)
                     .put(clq.c, v)
                     .put(clq.g, w)
                     .put(clq.e, u)
                     .put(clq.b, t)
                     .put(clq.f, w)
                     .put(clq.h, u)
                     .build()
               ),
               new clp.m(
                  ImmutableMap.builder()
                     .put(clq.a, u)
                     .put(clq.d, s)
                     .put(clq.c, t)
                     .put(clq.g, u)
                     .put(clq.e, v)
                     .put(clq.b, s)
                     .put(clq.f, v)
                     .put(clq.h, u)
                     .build()
               ),
               new clp.m(
                  ImmutableMap.builder()
                     .put(clq.a, x)
                     .put(clq.d, x)
                     .put(clq.c, new clp.f())
                     .put(clq.g, y)
                     .put(clq.e, y)
                     .put(clq.b, y)
                     .put(clq.f, x)
                     .put(clq.h, u)
                     .build()
               )
            },
            3,
            new clp.g[]{
               new clp.b(cuk.sp, 1, 12, 20),
               new clp.l(13, awp.d, "filled_map.monument", eqp.j, 12, 10),
               new clp.l(12, awp.m, "filled_map.trial_chambers", eqp.I, 12, 10)
            },
            4,
            new clp.g[]{
               new clp.i(cuk.vE, 7, 1, 15),
               new clp.i(cuk.wA, 3, 1, 15),
               new clp.i(cuk.wL, 3, 1, 15),
               new clp.i(cuk.wD, 3, 1, 15),
               new clp.i(cuk.wO, 3, 1, 15),
               new clp.i(cuk.wG, 3, 1, 15),
               new clp.i(cuk.wN, 3, 1, 15),
               new clp.i(cuk.wF, 3, 1, 15),
               new clp.i(cuk.wH, 3, 1, 15),
               new clp.i(cuk.wP, 3, 1, 15),
               new clp.i(cuk.wK, 3, 1, 15),
               new clp.i(cuk.wC, 3, 1, 15),
               new clp.i(cuk.wJ, 3, 1, 15),
               new clp.i(cuk.wM, 3, 1, 15),
               new clp.i(cuk.wE, 3, 1, 15),
               new clp.i(cuk.wB, 3, 1, 15),
               new clp.i(cuk.wI, 3, 1, 15)
            },
            5,
            new clp.g[]{new clp.i(cuk.xL, 8, 1, 30), new clp.l(14, awp.c, "filled_map.mansion", eqp.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<clp.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new clp.g[]{
               new clp.b(a(cws.a), 1, 1, 1),
               new clp.b(cuk.rW, 1, 1, 1, 2),
               new clp.b(cuk.sb, 1, 1, 1, 2),
               new clp.b(cuk.tK, 1, 1, 1, 3),
               new clp.b(cuk.vJ, 4, 1, 1),
               new clp.b(cuk.iR, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new clp.g[]{
               new clp.i(cuk.jj, 1, 1, 6, 1),
               new clp.i(cuk.mk, 6, 1, 6, 1),
               new clp.i(cuk.qN, 1, 4, 2, 1),
               new clp.i(cuk.J, 3, 3, 6, 1),
               new clp.i(dfe.aG, 1, 8, 4, 1),
               new clp.i(dfe.aE, 1, 8, 4, 1),
               new clp.i(dfe.aI, 1, 8, 4, 1),
               new clp.i(dfe.aF, 1, 8, 4, 1),
               new clp.i(dfe.aC, 1, 8, 4, 1),
               new clp.i(dfe.aD, 1, 8, 4, 1),
               new clp.i(dfe.aH, 1, 8, 4, 1),
               new clp.e(cuk.qv, 1, 1, 1, 0.2F),
               new clp.i(b(cws.j), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new clp.g[]{
               new clp.i(cuk.sf, 3, 1, 4, 1),
               new clp.i(cuk.sc, 3, 1, 4, 1),
               new clp.i(cuk.ea, 2, 1, 5, 1),
               new clp.i(cuk.sn, 4, 1, 5, 1),
               new clp.i(cuk.gH, 2, 1, 5, 1),
               new clp.i(cuk.xC, 5, 1, 5, 1),
               new clp.i(cuk.dV, 1, 1, 12, 1),
               new clp.i(cuk.eR, 1, 1, 8, 1),
               new clp.i(cuk.gv, 1, 1, 4, 1),
               new clp.i(cuk.eS, 3, 1, 12, 1),
               new clp.i(cuk.gh, 3, 1, 8, 1),
               new clp.i(cuk.er, 1, 1, 12, 1),
               new clp.i(cuk.es, 1, 1, 12, 1),
               new clp.i(cuk.et, 1, 1, 8, 1),
               new clp.i(cuk.eu, 1, 1, 12, 1),
               new clp.i(cuk.ev, 1, 1, 12, 1),
               new clp.i(cuk.ew, 1, 1, 12, 1),
               new clp.i(cuk.ex, 1, 1, 12, 1),
               new clp.i(cuk.ey, 1, 1, 12, 1),
               new clp.i(cuk.ez, 1, 1, 12, 1),
               new clp.i(cuk.eA, 1, 1, 12, 1),
               new clp.i(cuk.eB, 1, 1, 12, 1),
               new clp.i(cuk.eC, 1, 1, 7, 1),
               new clp.i(cuk.qO, 1, 1, 12, 1),
               new clp.i(cuk.wW, 1, 1, 12, 1),
               new clp.i(cuk.tv, 1, 1, 12, 1),
               new clp.i(cuk.tw, 1, 1, 12, 1),
               new clp.i(cuk.aG, 5, 1, 8, 1),
               new clp.i(cuk.aE, 5, 1, 8, 1),
               new clp.i(cuk.aI, 5, 1, 8, 1),
               new clp.i(cuk.aF, 5, 1, 8, 1),
               new clp.i(cuk.aC, 5, 1, 8, 1),
               new clp.i(cuk.aD, 5, 1, 8, 1),
               new clp.i(cuk.aH, 5, 1, 8, 1),
               new clp.i(cuk.aJ, 5, 1, 8, 1),
               new clp.i(cuk.sT, 1, 3, 12, 1),
               new clp.i(cuk.sF, 1, 3, 12, 1),
               new clp.i(cuk.sQ, 1, 3, 12, 1),
               new clp.i(cuk.sL, 1, 3, 12, 1),
               new clp.i(cuk.sU, 1, 3, 12, 1),
               new clp.i(cuk.sS, 1, 3, 12, 1),
               new clp.i(cuk.sN, 1, 3, 12, 1),
               new clp.i(cuk.sH, 1, 3, 12, 1),
               new clp.i(cuk.sJ, 1, 3, 12, 1),
               new clp.i(cuk.sM, 1, 3, 12, 1),
               new clp.i(cuk.sP, 1, 3, 12, 1),
               new clp.i(cuk.sI, 1, 3, 12, 1),
               new clp.i(cuk.sK, 1, 3, 12, 1),
               new clp.i(cuk.sG, 1, 3, 12, 1),
               new clp.i(cuk.sR, 1, 3, 12, 1),
               new clp.i(cuk.sO, 1, 3, 12, 1),
               new clp.i(cuk.lM, 3, 1, 8, 1),
               new clp.i(cuk.lN, 3, 1, 8, 1),
               new clp.i(cuk.lO, 3, 1, 8, 1),
               new clp.i(cuk.lP, 3, 1, 8, 1),
               new clp.i(cuk.lL, 3, 1, 8, 1),
               new clp.i(cuk.hi, 1, 3, 4, 1),
               new clp.i(cuk.eI, 1, 3, 4, 1),
               new clp.i(cuk.eJ, 1, 3, 4, 1),
               new clp.i(cuk.ho, 1, 5, 2, 1),
               new clp.i(cuk.eY, 1, 2, 5, 1),
               new clp.i(cuk.aM, 1, 8, 8, 1),
               new clp.i(cuk.aP, 1, 4, 6, 1),
               new clp.i(cuk.yY, 1, 2, 5, 1),
               new clp.i(cuk.K, 1, 2, 5, 1),
               new clp.i(cuk.eV, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static clp.g a(int $$0) {
      return new clp.m(
         ImmutableMap.builder()
            .put(clq.a, new clp.d($$0, dag.b, dag.h, dag.C))
            .put(clq.b, new clp.d($$0, dag.c, dag.e, dag.z))
            .put(clq.c, new clp.d($$0, dag.A, dag.o, dag.p))
            .put(clq.d, new clp.d($$0, dag.q, dag.k, dag.t))
            .put(clq.e, new clp.d($$0, dag.g, dag.s, dag.j))
            .put(clq.f, new clp.d($$0, dag.i, dag.f, dag.N))
            .put(clq.g, new clp.d($$0, dag.d, dag.r, dag.B))
            .put(clq.h, new clp.d($$0, dag.F, dag.G, dag.J))
            .build()
      );
   }

   private static clp.g a() {
      return new clp.m(
         ImmutableMap.builder()
            .put(clq.a, new clp.d(30, 3, 3, dag.u))
            .put(clq.b, new clp.d(30, 2, 2, dag.w))
            .put(clq.c, new clp.d(30, 3, 3, dag.a))
            .put(clq.d, new clp.d(30, 3, 3, dag.n))
            .put(clq.e, new clp.d(30, dag.v))
            .put(clq.f, new clp.d(30, dag.M))
            .put(clq.g, new clp.d(30, 2, 2, dag.x))
            .put(clq.h, new clp.d(30, 2, 2, dag.D))
            .build()
      );
   }

   private static Int2ObjectMap<clp.g[]> a(ImmutableMap<Integer, clp.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static daw a(ja<cwp> $$0) {
      return new daw(cuk.tH).a($$1 -> $$1.a(ke.E, new cwr($$0)));
   }

   private static cuh b(ja<cwp> $$0) {
      return cwr.a(cuk.tH, $$0);
   }

   private static cuh a(cuc $$0, dad $$1, int $$2) {
      cuh $$3 = new cuh($$0);
      $$3.a($$1, $$2);
      return $$3;
   }

   static class a implements clp.g {
      private final cuc a;
      private final int b;
      private final int c;
      private final int d;

      public a(cuc $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(cuc $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public day a(brv $$0, ayt $$1) {
         daw $$2 = new daw(cuk.pR, this.b);
         cuh $$3 = new cuh(this.a);
         if ($$3.a(awm.bA)) {
            List<csz> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = cxi.a($$3, $$4);
         }

         return new day($$2, $$3, this.c, this.d, 0.2F);
      }

      private static csz a(ayt $$0) {
         return csz.a(csy.a($$0.a(16)));
      }
   }

   static class b implements clp.g {
      private final daw a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(dbz $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(dbz $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new daw($$0.q(), $$1), $$2, $$3, $$4);
      }

      public b(daw $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public day a(brv $$0, ayt $$1) {
         return new day(this.a, new cuh(cuk.vT, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements clp.g {
      private final Map<clq, cuc> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<clq, cuc> $$3) {
         lh.y.s().filter($$1x -> !$$3.containsKey($$1x)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + lh.y.b($$0x));
         });
         this.a = $$3;
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Nullable
      @Override
      public day a(brv $$0, ayt $$1) {
         if ($$0 instanceof cln $$2) {
            daw $$3 = new daw(this.a.get($$2.gL().a()), this.b);
            return new day($$3, new cuh(cuk.vT), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements clp.g {
      private final int a;
      private final List<dad> b;
      private final int c;
      private final int d;

      public d(int $$0) {
         this($$0, lh.f.s().filter(dad::j).toArray(dad[]::new));
      }

      public d(int $$0, dad... $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, dad... $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = Arrays.asList($$3);
      }

      @Override
      public day a(brv $$0, ayt $$1) {
         dad $$2 = this.b.get($$1.a(this.b.size()));
         int $$3 = Math.max($$2.f(), this.c);
         int $$4 = Math.min($$2.g(), this.d);
         int $$5 = aym.a($$1, $$3, $$4);
         cuh $$6 = ctd.a(new daf($$2, $$5));
         int $$7 = 2 + $$1.a(5 + $$5 * 10) + 3 * $$5;
         if ($$2.a()) {
            $$7 *= 2;
         }

         if ($$7 > 64) {
            $$7 = 64;
         }

         return new day(new daw(cuk.pR, $$7), Optional.of(new daw(cuk.sm)), $$6, 12, this.a, 0.2F);
      }
   }

   static class e implements clp.g {
      private final cuh a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(cuc $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(cuc $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new cuh($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public day a(brv $$0, ayt $$1) {
         int $$2 = 5 + $$1.a(15);
         cuh $$3 = dae.a($$1, new cuh(this.a.f()), $$2, false);
         int $$4 = Math.min(this.b + $$2, 64);
         daw $$5 = new daw(cuk.pR, $$4);
         return new day($$5, $$3, this.c, this.d, this.e);
      }
   }

   static class f implements clp.g {
      @Override
      public day a(brv $$0, ayt $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      day a(brv var1, ayt var2);
   }

   static class h implements clp.g {
      private final daw a;
      private final int b;
      private final cuh c;
      private final int d;
      private final int e;
      private final float f;

      public h(dbz $$0, int $$1, int $$2, cuc $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new cuh($$3), $$4, $$5, $$6, $$7);
      }

      h(dbz $$0, int $$1, int $$2, cuh $$3, int $$4, int $$5, int $$6, float $$7) {
         this(new daw($$0, $$1), $$2, $$3.c($$4), $$5, $$6, $$7);
      }

      public h(daw $$0, int $$1, cuh $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public day a(brv $$0, ayt $$1) {
         return new day(new daw(cuk.pR, this.b), Optional.of(this.a), this.c.r(), 0, this.d, this.e, this.f, 0);
      }
   }

   static class i implements clp.g {
      private final cuh a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public i(dfc $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cuh($$0), $$1, $$2, $$3, $$4);
      }

      public i(cuc $$0, int $$1, int $$2, int $$3) {
         this(new cuh($$0), $$1, $$2, 12, $$3);
      }

      public i(cuc $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cuh($$0), $$1, $$2, $$3, $$4);
      }

      public i(cuh $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(cuc $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new cuh($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(cuh $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.a.e($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
      }

      @Override
      public day a(brv $$0, ayt $$1) {
         return new day(new daw(cuk.pR, this.b), this.a.r(), this.c, this.d, this.e);
      }
   }

   static class j implements clp.g {
      private final cxv a;
      private final int b;
      private final float c;

      public j(ja<brf> $$0, int $$1, int $$2) {
         this(new cxv(List.of(new cxv.a($$0, $$1))), $$2, 0.05F);
      }

      public j(cxv $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public day a(brv $$0, ayt $$1) {
         cuh $$2 = new cuh(cuk.xF, 1);
         $$2.b(ke.F, this.a);
         return new day(new daw(cuk.pR), $$2, 12, this.b, this.c);
      }
   }

   static class k implements clp.g {
      private final cuh a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final cuc f;
      private final int g;
      private final float h;

      public k(cuc $$0, int $$1, cuc $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new cuh($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public day a(brv $$0, ayt $$1) {
         daw $$2 = new daw(cuk.pR, this.c);
         List<ja<cwp>> $$3 = lh.i.h().filter($$0x -> !((cwp)$$0x.a()).a().isEmpty() && cwq.a($$0x)).collect(Collectors.toList());
         ja<cwp> $$4 = ad.a($$3, $$1);
         cuh $$5 = new cuh(this.a.f(), this.b);
         $$5.b(ke.E, new cwr($$4));
         return new day($$2, Optional.of(new daw(this.f, this.g)), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements clp.g {
      private final int a;
      private final awt<ejt> b;
      private final String c;
      private final ja<eqo> d;
      private final int e;
      private final int f;

      public l(int $$0, awt<ejt> $$1, String $$2, ja<eqo> $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public day a(brv $$0, ayt $$1) {
         if (!($$0.dU() instanceof aqt)) {
            return null;
         } else {
            aqt $$2 = (aqt)$$0.dU();
            ir $$3 = $$2.a(this.b, $$0.du(), 100, true);
            if ($$3 != null) {
               cuh $$4 = cuq.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               cuq.a($$2, $$4);
               eqt.a($$4, $$3, "+", this.d);
               $$4.b(ke.f, xe.c(this.c));
               return new day(new daw(cuk.pR, this.a), Optional.of(new daw(cuk.sp)), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static record m(Map<clq, clp.g> a) implements clp.g {
      public static clp.m a(clp.g $$0, clq... $$1) {
         return new clp.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public day a(brv $$0, ayt $$1) {
         if ($$0 instanceof cln $$2) {
            clq $$3 = $$2.gL().a();
            clp.g $$4 = this.a.get($$3);
            return $$4 == null ? null : $$4.a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
