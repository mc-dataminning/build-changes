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

public class cqi {
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
   public static final Map<ald<cqh>, Int2ObjectMap<cqi.g[]>> a = af.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            cqh.g,
            a(
               ImmutableMap.of(
                  1,
                  new cqi.g[]{
                     new cqi.b(cyw.qf, 20, 16, 2),
                     new cqi.b(cyw.vj, 26, 16, 2),
                     new cqi.b(cyw.vi, 22, 16, 2),
                     new cqi.b(cyw.wo, 15, 16, 2),
                     new cqi.i(cyw.qg, 1, 6, 16, 1)
                  },
                  2,
                  new cqi.g[]{new cqi.b(dlw.fn, 6, 12, 10), new cqi.i(cyw.vw, 1, 4, 5), new cqi.i(cyw.pd, 1, 4, 16, 5)},
                  3,
                  new cqi.g[]{new cqi.i(cyw.sT, 3, 18, 10), new cqi.b(dlw.fo, 4, 12, 20)},
                  4,
                  new cqi.g[]{
                     new cqi.i(dlw.et, 1, 1, 12, 15),
                     new cqi.j(bvg.p, 100, 15),
                     new cqi.j(bvg.h, 160, 15),
                     new cqi.j(bvg.r, 140, 15),
                     new cqi.j(bvg.o, 120, 15),
                     new cqi.j(bvg.s, 280, 15),
                     new cqi.j(bvg.w, 7, 15)
                  },
                  5,
                  new cqi.g[]{new cqi.i(cyw.vn, 3, 3, 30), new cqi.i(cyw.tu, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            cqh.h,
            a(
               ImmutableMap.of(
                  1,
                  new cqi.g[]{
                     new cqi.b(cyw.qb, 20, 16, 2),
                     new cqi.b(cyw.pg, 10, 16, 2),
                     new cqi.h(cyw.sa, 6, 1, cyw.se, 6, 16, 1, 0.05F),
                     new cqi.i(cyw.rs, 3, 1, 16, 1)
                  },
                  2,
                  new cqi.g[]{new cqi.b(cyw.sa, 15, 16, 10), new cqi.h(cyw.sb, 6, 1, cyw.sf, 6, 16, 5, 0.05F), new cqi.i(cyw.xB, 2, 1, 5)},
                  3,
                  new cqi.g[]{new cqi.b(cyw.sb, 13, 16, 20), new cqi.e(cyw.rW, 3, 3, 10, 0.2F)},
                  4,
                  new cqi.g[]{new cqi.b(cyw.sc, 6, 12, 30)},
                  5,
                  new cqi.g[]{
                     new cqi.b(cyw.sd, 4, 12, 30),
                     new cqi.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(cqj.c, cyw.oz)
                           .put(cqj.g, cyw.oB)
                           .put(cqj.e, cyw.oB)
                           .put(cqj.a, cyw.oF)
                           .put(cqj.b, cyw.oF)
                           .put(cqj.d, cyw.oH)
                           .put(cqj.f, cyw.oL)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            cqh.n,
            a(
               ImmutableMap.of(
                  1,
                  new cqi.g[]{
                     new cqi.b(dlw.bH, 18, 16, 2),
                     new cqi.b(dlw.bT, 18, 16, 2),
                     new cqi.b(dlw.bW, 18, 16, 2),
                     new cqi.b(dlw.bO, 18, 16, 2),
                     new cqi.i(cyw.sW, 2, 1, 1)
                  },
                  2,
                  new cqi.g[]{
                     new cqi.b(cyw.sj, 12, 16, 10),
                     new cqi.b(cyw.sq, 12, 16, 10),
                     new cqi.b(cyw.sy, 12, 16, 10),
                     new cqi.b(cyw.sm, 12, 16, 10),
                     new cqi.b(cyw.so, 12, 16, 10),
                     new cqi.i(dlw.bH, 1, 1, 16, 5),
                     new cqi.i(dlw.bI, 1, 1, 16, 5),
                     new cqi.i(dlw.bJ, 1, 1, 16, 5),
                     new cqi.i(dlw.bK, 1, 1, 16, 5),
                     new cqi.i(dlw.bL, 1, 1, 16, 5),
                     new cqi.i(dlw.bM, 1, 1, 16, 5),
                     new cqi.i(dlw.bN, 1, 1, 16, 5),
                     new cqi.i(dlw.bO, 1, 1, 16, 5),
                     new cqi.i(dlw.bP, 1, 1, 16, 5),
                     new cqi.i(dlw.bQ, 1, 1, 16, 5),
                     new cqi.i(dlw.bR, 1, 1, 16, 5),
                     new cqi.i(dlw.bS, 1, 1, 16, 5),
                     new cqi.i(dlw.bT, 1, 1, 16, 5),
                     new cqi.i(dlw.bU, 1, 1, 16, 5),
                     new cqi.i(dlw.bV, 1, 1, 16, 5),
                     new cqi.i(dlw.bW, 1, 1, 16, 5),
                     new cqi.i(dlw.iI, 1, 4, 16, 5),
                     new cqi.i(dlw.iJ, 1, 4, 16, 5),
                     new cqi.i(dlw.iK, 1, 4, 16, 5),
                     new cqi.i(dlw.iL, 1, 4, 16, 5),
                     new cqi.i(dlw.iM, 1, 4, 16, 5),
                     new cqi.i(dlw.iN, 1, 4, 16, 5),
                     new cqi.i(dlw.iO, 1, 4, 16, 5),
                     new cqi.i(dlw.iP, 1, 4, 16, 5),
                     new cqi.i(dlw.iQ, 1, 4, 16, 5),
                     new cqi.i(dlw.iR, 1, 4, 16, 5),
                     new cqi.i(dlw.iS, 1, 4, 16, 5),
                     new cqi.i(dlw.iT, 1, 4, 16, 5),
                     new cqi.i(dlw.iU, 1, 4, 16, 5),
                     new cqi.i(dlw.iV, 1, 4, 16, 5),
                     new cqi.i(dlw.iW, 1, 4, 16, 5),
                     new cqi.i(dlw.iX, 1, 4, 16, 5)
                  },
                  3,
                  new cqi.g[]{
                     new cqi.b(cyw.sn, 12, 16, 20),
                     new cqi.b(cyw.sr, 12, 16, 20),
                     new cqi.b(cyw.sk, 12, 16, 20),
                     new cqi.b(cyw.sx, 12, 16, 20),
                     new cqi.b(cyw.sp, 12, 16, 20),
                     new cqi.i(dlw.bg, 3, 1, 12, 10),
                     new cqi.i(dlw.bk, 3, 1, 12, 10),
                     new cqi.i(dlw.bu, 3, 1, 12, 10),
                     new cqi.i(dlw.bv, 3, 1, 12, 10),
                     new cqi.i(dlw.br, 3, 1, 12, 10),
                     new cqi.i(dlw.bs, 3, 1, 12, 10),
                     new cqi.i(dlw.bp, 3, 1, 12, 10),
                     new cqi.i(dlw.bn, 3, 1, 12, 10),
                     new cqi.i(dlw.bt, 3, 1, 12, 10),
                     new cqi.i(dlw.bj, 3, 1, 12, 10),
                     new cqi.i(dlw.bo, 3, 1, 12, 10),
                     new cqi.i(dlw.bl, 3, 1, 12, 10),
                     new cqi.i(dlw.bi, 3, 1, 12, 10),
                     new cqi.i(dlw.bh, 3, 1, 12, 10),
                     new cqi.i(dlw.bm, 3, 1, 12, 10),
                     new cqi.i(dlw.bq, 3, 1, 12, 10)
                  },
                  4,
                  new cqi.g[]{
                     new cqi.b(cyw.sv, 12, 16, 30),
                     new cqi.b(cyw.st, 12, 16, 30),
                     new cqi.b(cyw.su, 12, 16, 30),
                     new cqi.b(cyw.sw, 12, 16, 30),
                     new cqi.b(cyw.sl, 12, 16, 30),
                     new cqi.b(cyw.ss, 12, 16, 30),
                     new cqi.i(cyw.vT, 3, 1, 12, 15),
                     new cqi.i(cyw.we, 3, 1, 12, 15),
                     new cqi.i(cyw.vW, 3, 1, 12, 15),
                     new cqi.i(cyw.wh, 3, 1, 12, 15),
                     new cqi.i(cyw.vZ, 3, 1, 12, 15),
                     new cqi.i(cyw.wg, 3, 1, 12, 15),
                     new cqi.i(cyw.vY, 3, 1, 12, 15),
                     new cqi.i(cyw.wa, 3, 1, 12, 15),
                     new cqi.i(cyw.wi, 3, 1, 12, 15),
                     new cqi.i(cyw.wd, 3, 1, 12, 15),
                     new cqi.i(cyw.vV, 3, 1, 12, 15),
                     new cqi.i(cyw.wc, 3, 1, 12, 15),
                     new cqi.i(cyw.wf, 3, 1, 12, 15),
                     new cqi.i(cyw.vX, 3, 1, 12, 15),
                     new cqi.i(cyw.vU, 3, 1, 12, 15),
                     new cqi.i(cyw.wb, 3, 1, 12, 15)
                  },
                  5,
                  new cqi.g[]{new cqi.i(cyw.qI, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            cqh.i,
            a(
               ImmutableMap.of(
                  1,
                  new cqi.g[]{new cqi.b(cyw.pZ, 32, 16, 2), new cqi.i(cyw.pf, 1, 16, 1), new cqi.h(dlw.O, 10, 1, cyw.qF, 10, 12, 1, 0.05F)},
                  2,
                  new cqi.g[]{new cqi.b(cyw.qF, 26, 12, 10), new cqi.i(cyw.pe, 2, 1, 5)},
                  3,
                  new cqi.g[]{new cqi.b(cyw.qb, 14, 16, 20), new cqi.i(cyw.wZ, 3, 1, 10)},
                  4,
                  new cqi.g[]{new cqi.b(cyw.qc, 24, 16, 30), new cqi.e(cyw.pe, 2, 3, 15)},
                  5,
                  new cqi.g[]{new cqi.b(cyw.mA, 8, 12, 30), new cqi.e(cyw.wZ, 3, 3, 15), new cqi.k(cyw.pf, 5, cyw.wu, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            cqh.k,
            a(
               ImmutableMap.builder()
                  .put(1, new cqi.g[]{new cqi.b(cyw.rz, 24, 16, 2), new cqi.d(1, axc.i), new cqi.i(dlw.cs, 9, 1, 12, 1)})
                  .put(2, new cqi.g[]{new cqi.b(cyw.rA, 4, 12, 10), new cqi.d(5, axc.i), new cqi.i(cyw.xx, 1, 1, 5)})
                  .put(3, new cqi.g[]{new cqi.b(cyw.sg, 5, 12, 20), new cqi.d(10, axc.i), new cqi.i(cyw.cN, 1, 4, 10)})
                  .put(4, new cqi.g[]{new cqi.b(cyw.vb, 2, 12, 30), new cqi.d(15, axc.i), new cqi.i(cyw.rX, 5, 1, 15), new cqi.i(cyw.rD, 4, 1, 15)})
                  .put(5, new cqi.g[]{new cqi.i(cyw.vP, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            cqh.e,
            a(
               ImmutableMap.of(
                  1,
                  new cqi.g[]{new cqi.b(cyw.rz, 24, 16, 2), new cqi.i(cyw.vm, 7, 1, 1)},
                  2,
                  new cqi.g[]{new cqi.b(cyw.gk, 11, 16, 10), new cqi.l(13, axl.d, "filled_map.monument", exl.j, 12, 5)},
                  3,
                  new cqi.g[]{
                     new cqi.b(cyw.rD, 1, 12, 20),
                     new cqi.l(14, axl.c, "filled_map.mansion", exl.i, 12, 10),
                     new cqi.l(12, axl.m, "filled_map.trial_chambers", exl.I, 12, 10)
                  },
                  4,
                  new cqi.g[]{
                     new cqi.i(cyw.vf, 7, 1, 15),
                     new cqi.i(cyw.vT, 3, 1, 15),
                     new cqi.i(cyw.we, 3, 1, 15),
                     new cqi.i(cyw.vW, 3, 1, 15),
                     new cqi.i(cyw.wh, 3, 1, 15),
                     new cqi.i(cyw.vZ, 3, 1, 15),
                     new cqi.i(cyw.wg, 3, 1, 15),
                     new cqi.i(cyw.vY, 3, 1, 15),
                     new cqi.i(cyw.wa, 3, 1, 15),
                     new cqi.i(cyw.wi, 3, 1, 15),
                     new cqi.i(cyw.wd, 3, 1, 15),
                     new cqi.i(cyw.vV, 3, 1, 15),
                     new cqi.i(cyw.wc, 3, 1, 15),
                     new cqi.i(cyw.wf, 3, 1, 15),
                     new cqi.i(cyw.vX, 3, 1, 15),
                     new cqi.i(cyw.vU, 3, 1, 15),
                     new cqi.i(cyw.wb, 3, 1, 15)
                  },
                  5,
                  new cqi.g[]{new cqi.i(cyw.xg, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            cqh.f,
            a(
               ImmutableMap.of(
                  1,
                  new cqi.g[]{new cqi.b(cyw.tf, 32, 16, 2), new cqi.i(cyw.mg, 1, 2, 1)},
                  2,
                  new cqi.g[]{new cqi.b(cyw.ps, 3, 12, 10), new cqi.i(cyw.pk, 1, 1, 5)},
                  3,
                  new cqi.g[]{new cqi.b(cyw.vH, 2, 12, 20), new cqi.i(dlw.ep, 4, 1, 12, 10)},
                  4,
                  new cqi.g[]{new cqi.b(cyw.oY, 4, 12, 30), new cqi.b(cyw.tl, 9, 12, 30), new cqi.i(cyw.tg, 5, 1, 15)},
                  5,
                  new cqi.g[]{new cqi.b(cyw.tk, 22, 12, 30), new cqi.i(cyw.uY, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            cqh.c,
            a(
               ImmutableMap.of(
                  1,
                  new cqi.g[]{
                     new cqi.b(cyw.pg, 15, 16, 2),
                     new cqi.i(new cys(cyw.qr), 7, 1, 12, 1, 0.2F),
                     new cqi.i(new cys(cyw.qs), 4, 1, 12, 1, 0.2F),
                     new cqi.i(new cys(cyw.qp), 5, 1, 12, 1, 0.2F),
                     new cqi.i(new cys(cyw.qq), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cqi.g[]{
                     new cqi.b(cyw.po, 4, 12, 10),
                     new cqi.i(new cys(cyw.xw), 36, 1, 12, 5, 0.2F),
                     new cqi.i(new cys(cyw.qo), 1, 1, 12, 5, 0.2F),
                     new cqi.i(new cys(cyw.qn), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new cqi.g[]{
                     new cqi.b(cyw.rl, 1, 12, 20),
                     new cqi.b(cyw.pi, 1, 12, 20),
                     new cqi.i(new cys(cyw.ql), 1, 1, 12, 10, 0.2F),
                     new cqi.i(new cys(cyw.qm), 4, 1, 12, 10, 0.2F),
                     new cqi.i(new cys(cyw.ww), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new cqi.g[]{new cqi.e(cyw.qv, 14, 3, 15, 0.2F), new cqi.e(cyw.qw, 8, 3, 15, 0.2F)},
                  5,
                  new cqi.g[]{new cqi.e(cyw.qt, 8, 3, 30, 0.2F), new cqi.e(cyw.qu, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cqh.p,
            a(
               ImmutableMap.of(
                  1,
                  new cqi.g[]{new cqi.b(cyw.pg, 15, 16, 2), new cqi.i(new cys(cyw.pN), 3, 1, 12, 1, 0.2F), new cqi.e(cyw.pK, 2, 3, 1)},
                  2,
                  new cqi.g[]{new cqi.b(cyw.po, 4, 12, 10), new cqi.i(new cys(cyw.xw), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cqi.g[]{new cqi.b(cyw.qF, 24, 12, 20)},
                  4,
                  new cqi.g[]{new cqi.b(cyw.pi, 1, 12, 30), new cqi.e(cyw.pS, 12, 3, 15, 0.2F)},
                  5,
                  new cqi.g[]{new cqi.e(cyw.pP, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cqh.o,
            a(
               ImmutableMap.of(
                  1,
                  new cqi.g[]{
                     new cqi.b(cyw.pg, 15, 16, 2),
                     new cqi.i(new cys(cyw.pD), 1, 1, 12, 1, 0.2F),
                     new cqi.i(new cys(cyw.pB), 1, 1, 12, 1, 0.2F),
                     new cqi.i(new cys(cyw.pC), 1, 1, 12, 1, 0.2F),
                     new cqi.i(new cys(cyw.pE), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cqi.g[]{new cqi.b(cyw.po, 4, 12, 10), new cqi.i(new cys(cyw.xw), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cqi.g[]{
                     new cqi.b(cyw.qF, 30, 12, 20),
                     new cqi.e(cyw.pN, 1, 3, 10, 0.2F),
                     new cqi.e(cyw.pL, 2, 3, 10, 0.2F),
                     new cqi.e(cyw.pM, 3, 3, 10, 0.2F),
                     new cqi.i(new cys(cyw.pT), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new cqi.g[]{new cqi.b(cyw.pi, 1, 12, 30), new cqi.e(cyw.pS, 12, 3, 15, 0.2F), new cqi.e(cyw.pQ, 5, 3, 15, 0.2F)},
                  5,
                  new cqi.g[]{new cqi.e(cyw.pR, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cqh.d,
            a(
               ImmutableMap.of(
                  1,
                  new cqi.g[]{new cqi.b(cyw.td, 14, 16, 2), new cqi.b(cyw.qG, 7, 16, 2), new cqi.b(cyw.vE, 4, 16, 2), new cqi.i(cyw.vG, 1, 1, 1)},
                  2,
                  new cqi.g[]{new cqi.b(cyw.pg, 15, 16, 2), new cqi.i(cyw.qH, 1, 5, 16, 5), new cqi.i(cyw.te, 1, 8, 16, 5)},
                  3,
                  new cqi.g[]{new cqi.b(cyw.vR, 7, 16, 20), new cqi.b(cyw.tb, 10, 16, 20)},
                  4,
                  new cqi.g[]{new cqi.b(cyw.ry, 10, 12, 30)},
                  5,
                  new cqi.g[]{new cqi.b(cyw.xz, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            cqh.j,
            a(
               ImmutableMap.of(
                  1,
                  new cqi.g[]{new cqi.b(cyw.ro, 6, 16, 2), new cqi.a(cyw.qj, 3), new cqi.a(cyw.qi, 7)},
                  2,
                  new cqi.g[]{new cqi.b(cyw.qF, 26, 12, 10), new cqi.a(cyw.qh, 5, 12, 5), new cqi.a(cyw.qk, 4, 12, 5)},
                  3,
                  new cqi.g[]{new cqi.b(cyw.vI, 9, 12, 20), new cqi.a(cyw.qi, 7)},
                  4,
                  new cqi.g[]{new cqi.b(cyw.oY, 4, 12, 30), new cqi.a(cyw.vN, 6, 12, 15)},
                  5,
                  new cqi.g[]{new cqi.i(new cys(cyw.op), 6, 1, 12, 30, 0.2F), new cqi.a(cyw.qh, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            cqh.l,
            a(
               ImmutableMap.of(
                  1,
                  new cqi.g[]{new cqi.b(cyw.rx, 10, 16, 2), new cqi.i(cyw.rw, 1, 10, 16, 1)},
                  2,
                  new cqi.g[]{new cqi.b(dlw.b, 20, 16, 10), new cqi.i(dlw.eY, 1, 4, 16, 5)},
                  3,
                  new cqi.g[]{
                     new cqi.b(dlw.c, 16, 16, 20),
                     new cqi.b(dlw.g, 16, 16, 20),
                     new cqi.b(dlw.e, 16, 16, 20),
                     new cqi.i(dlw.sY, 1, 4, 16, 10),
                     new cqi.i(dlw.h, 1, 4, 16, 10),
                     new cqi.i(dlw.f, 1, 4, 16, 10),
                     new cqi.i(dlw.d, 1, 4, 16, 10)
                  },
                  4,
                  new cqi.g[]{
                     new cqi.b(cyw.pl, 12, 12, 30),
                     new cqi.i(dlw.hH, 1, 1, 12, 15),
                     new cqi.i(dlw.hG, 1, 1, 12, 15),
                     new cqi.i(dlw.hR, 1, 1, 12, 15),
                     new cqi.i(dlw.hJ, 1, 1, 12, 15),
                     new cqi.i(dlw.hN, 1, 1, 12, 15),
                     new cqi.i(dlw.hO, 1, 1, 12, 15),
                     new cqi.i(dlw.hV, 1, 1, 12, 15),
                     new cqi.i(dlw.hU, 1, 1, 12, 15),
                     new cqi.i(dlw.hM, 1, 1, 12, 15),
                     new cqi.i(dlw.hI, 1, 1, 12, 15),
                     new cqi.i(dlw.hL, 1, 1, 12, 15),
                     new cqi.i(dlw.hT, 1, 1, 12, 15),
                     new cqi.i(dlw.hP, 1, 1, 12, 15),
                     new cqi.i(dlw.hQ, 1, 1, 12, 15),
                     new cqi.i(dlw.hK, 1, 1, 12, 15),
                     new cqi.i(dlw.hS, 1, 1, 12, 15),
                     new cqi.i(dlw.lJ, 1, 1, 12, 15),
                     new cqi.i(dlw.lI, 1, 1, 12, 15),
                     new cqi.i(dlw.lT, 1, 1, 12, 15),
                     new cqi.i(dlw.lL, 1, 1, 12, 15),
                     new cqi.i(dlw.lP, 1, 1, 12, 15),
                     new cqi.i(dlw.lQ, 1, 1, 12, 15),
                     new cqi.i(dlw.lX, 1, 1, 12, 15),
                     new cqi.i(dlw.lW, 1, 1, 12, 15),
                     new cqi.i(dlw.lO, 1, 1, 12, 15),
                     new cqi.i(dlw.lK, 1, 1, 12, 15),
                     new cqi.i(dlw.lN, 1, 1, 12, 15),
                     new cqi.i(dlw.lV, 1, 1, 12, 15),
                     new cqi.i(dlw.lR, 1, 1, 12, 15),
                     new cqi.i(dlw.lS, 1, 1, 12, 15),
                     new cqi.i(dlw.lM, 1, 1, 12, 15),
                     new cqi.i(dlw.lU, 1, 1, 12, 15)
                  },
                  5,
                  new cqi.g[]{new cqi.i(dlw.hC, 1, 1, 12, 30), new cqi.i(dlw.hA, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<cqi.g[]> b = a(
      ImmutableMap.of(
         1,
         new cqi.g[]{
            new cqi.i(cyw.da, 2, 1, 5, 1),
            new cqi.i(cyw.rB, 4, 1, 5, 1),
            new cqi.i(cyw.fL, 2, 1, 5, 1),
            new cqi.i(cyw.wX, 5, 1, 5, 1),
            new cqi.i(cyw.cV, 1, 1, 12, 1),
            new cqi.i(cyw.dS, 1, 1, 8, 1),
            new cqi.i(cyw.fB, 1, 1, 4, 1),
            new cqi.i(cyw.dT, 3, 1, 12, 1),
            new cqi.i(cyw.fm, 3, 1, 8, 1),
            new cqi.i(cyw.dr, 1, 1, 12, 1),
            new cqi.i(cyw.du, 1, 1, 12, 1),
            new cqi.i(cyw.dv, 1, 1, 8, 1),
            new cqi.i(cyw.dw, 1, 1, 12, 1),
            new cqi.i(cyw.dx, 1, 1, 12, 1),
            new cqi.i(cyw.dy, 1, 1, 12, 1),
            new cqi.i(cyw.dz, 1, 1, 12, 1),
            new cqi.i(cyw.dA, 1, 1, 12, 1),
            new cqi.i(cyw.dB, 1, 1, 12, 1),
            new cqi.i(cyw.dC, 1, 1, 12, 1),
            new cqi.i(cyw.dD, 1, 1, 12, 1),
            new cqi.i(cyw.dE, 1, 1, 7, 1),
            new cqi.i(cyw.ds, 1, 1, 7, 1),
            new cqi.i(cyw.qe, 1, 1, 12, 1),
            new cqi.i(cyw.wp, 1, 1, 12, 1),
            new cqi.i(cyw.sZ, 1, 1, 12, 1),
            new cqi.i(cyw.ta, 1, 1, 12, 1),
            new cqi.i(cyw.ab, 5, 1, 8, 1),
            new cqi.i(cyw.Z, 5, 1, 8, 1),
            new cqi.i(cyw.ad, 5, 1, 8, 1),
            new cqi.i(cyw.aa, 5, 1, 8, 1),
            new cqi.i(cyw.X, 5, 1, 8, 1),
            new cqi.i(cyw.Y, 5, 1, 8, 1),
            new cqi.i(cyw.ac, 5, 1, 8, 1),
            new cqi.i(cyw.ae, 5, 1, 8, 1),
            new cqi.i(cyw.af, 5, 1, 8, 1),
            new cqi.i(cyw.sx, 1, 3, 12, 1),
            new cqi.i(cyw.sj, 1, 3, 12, 1),
            new cqi.i(cyw.su, 1, 3, 12, 1),
            new cqi.i(cyw.sp, 1, 3, 12, 1),
            new cqi.i(cyw.sy, 1, 3, 12, 1),
            new cqi.i(cyw.sw, 1, 3, 12, 1),
            new cqi.i(cyw.sr, 1, 3, 12, 1),
            new cqi.i(cyw.sl, 1, 3, 12, 1),
            new cqi.i(cyw.sn, 1, 3, 12, 1),
            new cqi.i(cyw.sq, 1, 3, 12, 1),
            new cqi.i(cyw.st, 1, 3, 12, 1),
            new cqi.i(cyw.sm, 1, 3, 12, 1),
            new cqi.i(cyw.so, 1, 3, 12, 1),
            new cqi.i(cyw.sk, 1, 3, 12, 1),
            new cqi.i(cyw.sv, 1, 3, 12, 1),
            new cqi.i(cyw.ss, 1, 3, 12, 1),
            new cqi.i(cyw.kW, 3, 1, 8, 1),
            new cqi.i(cyw.kX, 3, 1, 8, 1),
            new cqi.i(cyw.kY, 3, 1, 8, 1),
            new cqi.i(cyw.kZ, 3, 1, 8, 1),
            new cqi.i(cyw.kV, 3, 1, 8, 1),
            new cqi.i(cyw.gm, 1, 1, 12, 1),
            new cqi.i(cyw.ea, 1, 1, 12, 1),
            new cqi.i(cyw.dJ, 1, 1, 12, 1),
            new cqi.i(cyw.dK, 1, 1, 12, 1),
            new cqi.i(cyw.gz, 1, 2, 5, 1),
            new cqi.i(cyw.ee, 1, 2, 5, 1),
            new cqi.i(cyw.ah, 1, 8, 8, 1),
            new cqi.i(cyw.ak, 1, 4, 6, 1),
            new cqi.i(cyw.yt, 1, 2, 5, 1),
            new cqi.i(cyw.F, 1, 2, 5, 1),
            new cqi.i(cyw.dY, 1, 2, 5, 1),
            new cqi.i(cyw.eb, 1, 2, 5, 1)
         },
         2,
         new cqi.g[]{
            new cqi.i(cyw.rt, 5, 1, 4, 1),
            new cqi.i(cyw.rq, 5, 1, 4, 1),
            new cqi.i(cyw.iu, 3, 1, 6, 1),
            new cqi.i(cyw.lu, 6, 1, 6, 1),
            new cqi.i(cyw.qd, 1, 1, 8, 1),
            new cqi.i(cyw.E, 3, 3, 6, 1)
         }
      )
   );
   private static final cqi.l s = new cqi.l(8, axl.f, "filled_map.village_desert", exl.B, 12, 5);
   private static final cqi.l t = new cqi.l(8, axl.e, "filled_map.village_savanna", exl.D, 12, 5);
   private static final cqi.l u = new cqi.l(8, axl.g, "filled_map.village_plains", exl.C, 12, 5);
   private static final cqi.l v = new cqi.l(8, axl.h, "filled_map.village_taiga", exl.F, 12, 5);
   private static final cqi.l w = new cqi.l(8, axl.i, "filled_map.village_snowy", exl.E, 12, 5);
   private static final cqi.l x = new cqi.l(8, axl.j, "filled_map.explorer_jungle", exl.G, 12, 5);
   private static final cqi.l y = new cqi.l(8, axl.k, "filled_map.explorer_swamp", exl.H, 12, 5);
   public static final Map<ald<cqh>, Int2ObjectMap<cqi.g[]>> c = Map.of(
      cqh.k,
      a(
         ImmutableMap.builder()
            .put(1, new cqi.g[]{new cqi.b(cyw.rz, 24, 16, 2), a(1), new cqi.i(dlw.cs, 9, 1, 12, 1)})
            .put(2, new cqi.g[]{new cqi.b(cyw.rA, 4, 12, 10), a(5), new cqi.i(cyw.xx, 1, 1, 5)})
            .put(3, new cqi.g[]{new cqi.b(cyw.sg, 5, 12, 20), a(10), new cqi.i(cyw.cN, 1, 4, 10)})
            .put(4, new cqi.g[]{new cqi.b(cyw.vb, 2, 12, 30), new cqi.i(cyw.rX, 5, 1, 15), new cqi.i(cyw.rD, 4, 1, 15)})
            .put(5, new cqi.g[]{a(), new cqi.i(cyw.vP, 20, 1, 30)})
            .build()
      ),
      cqh.c,
      a(
         ImmutableMap.builder()
            .put(1, new cqi.g[]{new cqi.b(cyw.pg, 15, 12, 2), new cqi.b(cyw.po, 5, 12, 2)})
            .put(
               2,
               new cqi.g[]{
                  cqi.m.a(new cqi.i(cyw.qs, 4, 1, 12, 5, 0.05F), cqj.a, cqj.c, cqj.d, cqj.e, cqj.g),
                  cqi.m.a(new cqi.i(cyw.qo, 4, 1, 12, 5, 0.05F), cqj.b, cqj.f),
                  cqi.m.a(new cqi.i(cyw.qp, 5, 1, 12, 5, 0.05F), cqj.a, cqj.c, cqj.d, cqj.e, cqj.g),
                  cqi.m.a(new cqi.i(cyw.ql, 5, 1, 12, 5, 0.05F), cqj.b, cqj.f),
                  cqi.m.a(new cqi.i(cyw.qr, 7, 1, 12, 5, 0.05F), cqj.a, cqj.c, cqj.d, cqj.e, cqj.g),
                  cqi.m.a(new cqi.i(cyw.qn, 7, 1, 12, 5, 0.05F), cqj.b, cqj.f),
                  cqi.m.a(new cqi.i(cyw.qq, 9, 1, 12, 5, 0.05F), cqj.a, cqj.c, cqj.d, cqj.e, cqj.g),
                  cqi.m.a(new cqi.i(cyw.qm, 9, 1, 12, 5, 0.05F), cqj.b, cqj.f)
               }
            )
            .put(3, new cqi.g[]{new cqi.b(cyw.rl, 1, 12, 20), new cqi.i(cyw.ww, 5, 1, 12, 10, 0.05F), new cqi.i(cyw.xw, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new cqi.g[]{
                  cqi.m.a(new cqi.i(cyw.qs, 8, 1, 3, 15, 0.05F, dgs.a), cqj.a),
                  cqi.m.a(new cqi.i(cyw.qp, 9, 1, 3, 15, 0.05F, dgs.d), cqj.a),
                  cqi.m.a(new cqi.i(cyw.qr, 11, 1, 3, 15, 0.05F, dgs.b), cqj.a),
                  cqi.m.a(new cqi.i(cyw.qq, 13, 1, 3, 15, 0.05F, dgs.c), cqj.a),
                  cqi.m.a(new cqi.i(cyw.qs, 8, 1, 3, 15, 0.05F, dgs.g), cqj.c),
                  cqi.m.a(new cqi.i(cyw.qp, 9, 1, 3, 15, 0.05F, dgs.j), cqj.c),
                  cqi.m.a(new cqi.i(cyw.qr, 11, 1, 3, 15, 0.05F, dgs.h), cqj.c),
                  cqi.m.a(new cqi.i(cyw.qq, 13, 1, 3, 15, 0.05F, dgs.i), cqj.c),
                  cqi.m.a(new cqi.i(cyw.qs, 2, 1, 3, 15, 0.05F, dgs.m), cqj.d),
                  cqi.m.a(new cqi.i(cyw.qp, 3, 1, 3, 15, 0.05F, dgs.p), cqj.d),
                  cqi.m.a(new cqi.i(cyw.qr, 5, 1, 3, 15, 0.05F, dgs.n), cqj.d),
                  cqi.m.a(new cqi.i(cyw.qq, 7, 1, 3, 15, 0.05F, dgs.o), cqj.d),
                  cqi.m.a(new cqi.i(cyw.qs, 8, 1, 3, 15, 0.05F, dgs.s), cqj.e),
                  cqi.m.a(new cqi.i(cyw.qp, 9, 1, 3, 15, 0.05F, dgs.t), cqj.e),
                  cqi.m.a(new cqi.i(cyw.qo, 8, 1, 3, 15, 0.05F, dgs.w), cqj.b),
                  cqi.m.a(new cqi.i(cyw.ql, 9, 1, 3, 15, 0.05F, dgs.z), cqj.b),
                  cqi.m.a(new cqi.i(cyw.qn, 11, 1, 3, 15, 0.05F, dgs.x), cqj.b),
                  cqi.m.a(new cqi.i(cyw.qm, 13, 1, 3, 15, 0.05F, dgs.y), cqj.b),
                  cqi.m.a(new cqi.i(cyw.qo, 8, 1, 3, 15, 0.05F, dgs.C), cqj.f),
                  cqi.m.a(new cqi.i(cyw.ql, 9, 1, 3, 15, 0.05F, dgs.F), cqj.f),
                  cqi.m.a(new cqi.i(cyw.qn, 11, 1, 3, 15, 0.05F, dgs.D), cqj.f),
                  cqi.m.a(new cqi.i(cyw.qm, 13, 1, 3, 15, 0.05F, dgs.E), cqj.f),
                  cqi.m.a(new cqi.h(cyw.qw, 1, 4, cyw.qv, 1, 3, 15, 0.05F), cqj.g),
                  cqi.m.a(new cqi.h(cyw.qv, 1, 4, cyw.qu, 1, 3, 15, 0.05F), cqj.g),
                  cqi.m.a(new cqi.h(cyw.qt, 1, 4, cyw.qw, 1, 3, 15, 0.05F), cqj.g),
                  cqi.m.a(new cqi.h(cyw.qu, 1, 2, cyw.qt, 1, 3, 15, 0.05F), cqj.g)
               }
            )
            .put(
               5,
               new cqi.g[]{
                  cqi.m.a(new cqi.h(cyw.pi, 4, 16, cyw.qu, 1, 3, 30, 0.05F, dgs.f), cqj.a),
                  cqi.m.a(new cqi.h(cyw.pi, 3, 16, cyw.qv, 1, 3, 30, 0.05F, dgs.e), cqj.a),
                  cqi.m.a(new cqi.h(cyw.pi, 3, 16, cyw.qv, 1, 3, 30, 0.05F, dgs.l), cqj.c),
                  cqi.m.a(new cqi.h(cyw.pi, 2, 12, cyw.qw, 1, 3, 30, 0.05F, dgs.k), cqj.c),
                  cqi.m.a(new cqi.h(cyw.pi, 2, 6, cyw.qt, 1, 3, 30, 0.05F, dgs.r), cqj.d),
                  cqi.m.a(new cqi.h(cyw.pi, 3, 8, cyw.qu, 1, 3, 30, 0.05F, dgs.q), cqj.d),
                  cqi.m.a(new cqi.h(cyw.pi, 2, 12, cyw.qw, 1, 3, 30, 0.05F, dgs.u), cqj.e),
                  cqi.m.a(new cqi.h(cyw.pi, 3, 12, cyw.qt, 1, 3, 30, 0.05F, dgs.v), cqj.e),
                  cqi.m.a(new cqi.i(cyw.ql, 9, 1, 3, 30, 0.05F, dgs.B), cqj.b),
                  cqi.m.a(new cqi.i(cyw.qo, 8, 1, 3, 30, 0.05F, dgs.A), cqj.b),
                  cqi.m.a(new cqi.i(cyw.ql, 9, 1, 3, 30, 0.05F, dgs.H), cqj.f),
                  cqi.m.a(new cqi.i(cyw.qo, 8, 1, 3, 30, 0.05F, dgs.G), cqj.f),
                  cqi.m.a(new cqi.h(cyw.pi, 4, 18, cyw.qu, 1, 3, 30, 0.05F, dgs.J), cqj.g),
                  cqi.m.a(new cqi.h(cyw.pi, 3, 18, cyw.qv, 1, 3, 30, 0.05F, dgs.I), cqj.g),
                  cqi.m.a(new cqi.b(cyw.aP, 1, 12, 30, 42), cqj.g),
                  cqi.m.a(new cqi.b(cyw.aM, 1, 12, 30, 4), cqj.a, cqj.b, cqj.c, cqj.d, cqj.e, cqj.f)
               }
            )
            .build()
      ),
      cqh.e,
      a(
         ImmutableMap.of(
            1,
            new cqi.g[]{new cqi.b(cyw.rz, 24, 16, 2), new cqi.i(cyw.vm, 7, 1, 1)},
            2,
            new cqi.g[]{
               new cqi.b(cyw.gk, 11, 16, 10),
               new cqi.m(ImmutableMap.builder().put(cqj.a, t).put(cqj.d, u).put(cqj.c, v).put(cqj.g, w).put(cqj.e, u).put(cqj.b, t).put(cqj.f, w).build()),
               new cqi.m(ImmutableMap.builder().put(cqj.a, u).put(cqj.d, s).put(cqj.c, t).put(cqj.g, u).put(cqj.e, v).put(cqj.b, s).put(cqj.f, v).build()),
               new cqi.m(
                  ImmutableMap.builder().put(cqj.a, x).put(cqj.d, x).put(cqj.c, new cqi.f()).put(cqj.g, y).put(cqj.e, y).put(cqj.b, y).put(cqj.f, x).build()
               )
            },
            3,
            new cqi.g[]{
               new cqi.b(cyw.rD, 1, 12, 20),
               new cqi.l(13, axl.d, "filled_map.monument", exl.j, 12, 10),
               new cqi.l(12, axl.m, "filled_map.trial_chambers", exl.I, 12, 10)
            },
            4,
            new cqi.g[]{
               new cqi.i(cyw.vf, 7, 1, 15),
               new cqi.i(cyw.vT, 3, 1, 15),
               new cqi.i(cyw.we, 3, 1, 15),
               new cqi.i(cyw.vW, 3, 1, 15),
               new cqi.i(cyw.wh, 3, 1, 15),
               new cqi.i(cyw.vZ, 3, 1, 15),
               new cqi.i(cyw.wg, 3, 1, 15),
               new cqi.i(cyw.vY, 3, 1, 15),
               new cqi.i(cyw.wa, 3, 1, 15),
               new cqi.i(cyw.wi, 3, 1, 15),
               new cqi.i(cyw.wd, 3, 1, 15),
               new cqi.i(cyw.vV, 3, 1, 15),
               new cqi.i(cyw.wc, 3, 1, 15),
               new cqi.i(cyw.wf, 3, 1, 15),
               new cqi.i(cyw.vX, 3, 1, 15),
               new cqi.i(cyw.vU, 3, 1, 15),
               new cqi.i(cyw.wb, 3, 1, 15)
            },
            5,
            new cqi.g[]{new cqi.i(cyw.xg, 8, 1, 30), new cqi.l(14, axl.c, "filled_map.mansion", exl.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<cqi.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new cqi.g[]{
               new cqi.b(a(dap.a), 1, 1, 1),
               new cqi.b(cyw.rk, 1, 1, 1, 2),
               new cqi.b(cyw.rp, 1, 1, 1, 2),
               new cqi.b(cyw.to, 1, 1, 1, 3),
               new cqi.b(cyw.vk, 4, 1, 1),
               new cqi.b(cyw.ic, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cqi.g[]{
               new cqi.i(cyw.iu, 1, 1, 6, 1),
               new cqi.i(cyw.lu, 6, 1, 6, 1),
               new cqi.i(cyw.qd, 1, 4, 2, 1),
               new cqi.i(cyw.E, 3, 3, 6, 1),
               new cqi.i(dlw.ab, 1, 8, 4, 1),
               new cqi.i(dlw.Z, 1, 8, 4, 1),
               new cqi.i(dlw.ad, 1, 8, 4, 1),
               new cqi.i(dlw.aa, 1, 8, 4, 1),
               new cqi.i(dlw.X, 1, 8, 4, 1),
               new cqi.i(dlw.Y, 1, 8, 4, 1),
               new cqi.i(dlw.ac, 1, 8, 4, 1),
               new cqi.e(cyw.pM, 1, 1, 1, 0.2F),
               new cqi.i(b(dap.h), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cqi.g[]{
               new cqi.i(cyw.rt, 3, 1, 4, 1),
               new cqi.i(cyw.rq, 3, 1, 4, 1),
               new cqi.i(cyw.da, 2, 1, 5, 1),
               new cqi.i(cyw.rB, 4, 1, 5, 1),
               new cqi.i(cyw.fL, 2, 1, 5, 1),
               new cqi.i(cyw.wX, 5, 1, 5, 1),
               new cqi.i(cyw.cV, 1, 1, 12, 1),
               new cqi.i(cyw.dS, 1, 1, 8, 1),
               new cqi.i(cyw.fB, 1, 1, 4, 1),
               new cqi.i(cyw.dT, 3, 1, 12, 1),
               new cqi.i(cyw.fm, 3, 1, 8, 1),
               new cqi.i(cyw.dr, 1, 1, 12, 1),
               new cqi.i(cyw.du, 1, 1, 12, 1),
               new cqi.i(cyw.dv, 1, 1, 8, 1),
               new cqi.i(cyw.dw, 1, 1, 12, 1),
               new cqi.i(cyw.dx, 1, 1, 12, 1),
               new cqi.i(cyw.dy, 1, 1, 12, 1),
               new cqi.i(cyw.dz, 1, 1, 12, 1),
               new cqi.i(cyw.dA, 1, 1, 12, 1),
               new cqi.i(cyw.dB, 1, 1, 12, 1),
               new cqi.i(cyw.dC, 1, 1, 12, 1),
               new cqi.i(cyw.dD, 1, 1, 12, 1),
               new cqi.i(cyw.dE, 1, 1, 7, 1),
               new cqi.i(cyw.ds, 1, 1, 7, 1),
               new cqi.i(cyw.qe, 1, 1, 12, 1),
               new cqi.i(cyw.wp, 1, 1, 12, 1),
               new cqi.i(cyw.sZ, 1, 1, 12, 1),
               new cqi.i(cyw.ta, 1, 1, 12, 1),
               new cqi.i(cyw.ab, 5, 1, 8, 1),
               new cqi.i(cyw.Z, 5, 1, 8, 1),
               new cqi.i(cyw.ad, 5, 1, 8, 1),
               new cqi.i(cyw.aa, 5, 1, 8, 1),
               new cqi.i(cyw.X, 5, 1, 8, 1),
               new cqi.i(cyw.Y, 5, 1, 8, 1),
               new cqi.i(cyw.ac, 5, 1, 8, 1),
               new cqi.i(cyw.ae, 5, 1, 8, 1),
               new cqi.i(cyw.af, 5, 1, 8, 1),
               new cqi.i(cyw.sx, 1, 3, 12, 1),
               new cqi.i(cyw.sj, 1, 3, 12, 1),
               new cqi.i(cyw.su, 1, 3, 12, 1),
               new cqi.i(cyw.sp, 1, 3, 12, 1),
               new cqi.i(cyw.sy, 1, 3, 12, 1),
               new cqi.i(cyw.sw, 1, 3, 12, 1),
               new cqi.i(cyw.sr, 1, 3, 12, 1),
               new cqi.i(cyw.sl, 1, 3, 12, 1),
               new cqi.i(cyw.sn, 1, 3, 12, 1),
               new cqi.i(cyw.sq, 1, 3, 12, 1),
               new cqi.i(cyw.st, 1, 3, 12, 1),
               new cqi.i(cyw.sm, 1, 3, 12, 1),
               new cqi.i(cyw.so, 1, 3, 12, 1),
               new cqi.i(cyw.sk, 1, 3, 12, 1),
               new cqi.i(cyw.sv, 1, 3, 12, 1),
               new cqi.i(cyw.ss, 1, 3, 12, 1),
               new cqi.i(cyw.kW, 3, 1, 8, 1),
               new cqi.i(cyw.kX, 3, 1, 8, 1),
               new cqi.i(cyw.kY, 3, 1, 8, 1),
               new cqi.i(cyw.kZ, 3, 1, 8, 1),
               new cqi.i(cyw.kV, 3, 1, 8, 1),
               new cqi.i(cyw.gm, 1, 3, 4, 1),
               new cqi.i(cyw.ea, 1, 3, 4, 1),
               new cqi.i(cyw.dJ, 1, 3, 4, 1),
               new cqi.i(cyw.dK, 1, 3, 4, 1),
               new cqi.i(cyw.gz, 1, 5, 2, 1),
               new cqi.i(cyw.ee, 1, 2, 5, 1),
               new cqi.i(cyw.ah, 1, 8, 8, 1),
               new cqi.i(cyw.ak, 1, 4, 6, 1),
               new cqi.i(cyw.yt, 1, 2, 5, 1),
               new cqi.i(cyw.F, 1, 2, 5, 1),
               new cqi.i(cyw.dY, 1, 2, 5, 1),
               new cqi.i(cyw.eb, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static cqi.g a(int $$0) {
      return new cqi.m(
         ImmutableMap.builder()
            .put(cqj.a, new cqi.d($$0, axc.w))
            .put(cqj.b, new cqi.d($$0, axc.x))
            .put(cqj.c, new cqi.d($$0, axc.y))
            .put(cqj.d, new cqi.d($$0, axc.z))
            .put(cqj.e, new cqi.d($$0, axc.A))
            .put(cqj.f, new cqi.d($$0, axc.B))
            .put(cqj.g, new cqi.d($$0, axc.C))
            .build()
      );
   }

   private static cqi.g a() {
      return new cqi.m(
         ImmutableMap.builder()
            .put(cqj.a, new cqi.d(30, 3, 3, axc.D))
            .put(cqj.b, new cqi.d(30, 2, 2, axc.E))
            .put(cqj.c, new cqi.d(30, 3, 3, axc.F))
            .put(cqj.d, new cqi.d(30, 3, 3, axc.G))
            .put(cqj.e, new cqi.d(30, axc.H))
            .put(cqj.f, new cqi.d(30, axc.I))
            .put(cqj.g, new cqi.d(30, 2, 2, axc.J))
            .build()
      );
   }

   private static Int2ObjectMap<cqi.g[]> a(ImmutableMap<Integer, cqi.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static dhl a(je<dam> $$0) {
      return new dhl(cyw.tm).a($$1 -> $$1.a(kj.R, new dao($$0)));
   }

   private static cys b(je<dam> $$0) {
      return dao.a(cyw.tm, $$0);
   }

   static class a implements cqi.g {
      private final cyo a;
      private final int b;
      private final int c;
      private final int d;

      public a(cyo $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(cyo $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public dhn a(bwa $$0, azt $$1) {
         dhl $$2 = new dhl(cyw.pj, this.b);
         cys $$3 = new cys(this.a);
         if ($$3.a(axi.bO)) {
            List<cxr> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = dbf.a($$3, $$4);
         }

         return new dhn($$2, $$3, this.c, this.d, 0.2F);
      }

      private static cxr a(azt $$0) {
         return cxr.a(cxq.a($$0.a(16)));
      }
   }

   static class b implements cqi.g {
      private final dhl a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(dio $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(dio $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new dhl($$0.h(), $$1), $$2, $$3, $$4);
      }

      public b(dhl $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public dhn a(bwa $$0, azt $$1) {
         return new dhn(this.a, new cys(cyw.pj, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements cqi.g {
      private final Map<ald<cqj>, cyo> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<ald<cqj>, cyo> $$3) {
         mf.w.j().stream().filter($$1x -> !$$3.containsKey($$1x)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + $$0x);
         });
         this.a = $$3;
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Nullable
      @Override
      public dhn a(bwa $$0, azt $$1) {
         if ($$0 instanceof cqg $$2) {
            ald<cqj> $$3 = $$2.gy().a().e().orElse(null);
            if ($$3 == null) {
               return null;
            } else {
               dhl $$4 = new dhl(this.a.get($$3), this.b);
               return new dhn($$4, new cys(cyw.pj), this.c, this.d, 0.05F);
            }
         } else {
            return null;
         }
      }
   }

   static class d implements cqi.g {
      private final int a;
      private final axp<dff> b;
      private final int c;
      private final int d;

      public d(int $$0, axp<dff> $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, axp<dff> $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = $$3;
      }

      @Override
      public dhn a(bwa $$0, azt $$1) {
         Optional<je<dff>> $$2 = $$0.dV().F_().f(mg.aP).a(this.b, $$1);
         int $$9;
         cys $$8;
         if (!$$2.isEmpty()) {
            je<dff> $$3 = $$2.get();
            dff $$4 = $$3.a();
            int $$5 = Math.max($$4.d(), this.c);
            int $$6 = Math.min($$4.e(), this.d);
            int $$7 = azk.a($$1, $$5, $$6);
            $$8 = dfh.a(new dfi($$3, $$7));
            $$9 = 2 + $$1.a(5 + $$7 * 10) + 3 * $$7;
            if ($$3.a(axc.j)) {
               $$9 *= 2;
            }

            if ($$9 > 64) {
               $$9 = 64;
            }
         } else {
            $$9 = 1;
            $$8 = new cys(cyw.rA);
         }

         return new dhn(new dhl(cyw.pj, $$9), Optional.of(new dhl(cyw.rA)), $$8, 12, this.a, 0.2F);
      }
   }

   static class e implements cqi.g {
      private final cys a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(cyo $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(cyo $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new cys($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public dhn a(bwa $$0, azt $$1) {
         int $$2 = 5 + $$1.a(15);
         js $$3 = $$0.dV().F_();
         Optional<ji.c<dff>> $$4 = $$3.f(mg.aP).a(axc.m);
         cys $$5 = dfh.a($$1, new cys(this.a.h()), $$2, $$3, $$4);
         int $$6 = Math.min(this.b + $$2, 64);
         dhl $$7 = new dhl(cyw.pj, $$6);
         return new dhn($$7, $$5, this.c, this.d, this.e);
      }
   }

   static class f implements cqi.g {
      @Override
      public dhn a(bwa $$0, azt $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      dhn a(bwa var1, azt var2);
   }

   static class h implements cqi.g {
      private final dhl a;
      private final int b;
      private final cys c;
      private final int d;
      private final int e;
      private final float f;
      private final Optional<ald<dgn>> g;

      public h(dio $$0, int $$1, int $$2, cyo $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new cys($$3), $$4, $$5, $$6, $$7);
      }

      private h(dio $$0, int $$1, int $$2, cys $$3, int $$4, int $$5, int $$6, float $$7) {
         this(new dhl($$0, $$1), $$2, $$3.c($$4), $$5, $$6, $$7, Optional.empty());
      }

      h(dio $$0, int $$1, int $$2, dio $$3, int $$4, int $$5, int $$6, float $$7, ald<dgn> $$8) {
         this(new dhl($$0, $$1), $$2, new cys($$3, $$4), $$5, $$6, $$7, Optional.of($$8));
      }

      public h(dhl $$0, int $$1, cys $$2, int $$3, int $$4, float $$5, Optional<ald<dgn>> $$6) {
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
      public dhn a(bwa $$0, azt $$1) {
         cys $$2 = this.c.v();
         dip $$3 = $$0.dV();
         this.g.ifPresent($$4 -> dfh.a($$2, $$3.F_(), (ald<dgn>)$$4, $$3.d_($$0.dv()), $$1));
         return new dhn(new dhl(cyw.pj, this.b), Optional.of(this.a), $$2, 0, this.d, this.e, this.f);
      }
   }

   static class i implements cqi.g {
      private final cys a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;
      private final Optional<ald<dgn>> f;

      public i(dlu $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cys($$0), $$1, $$2, $$3, $$4);
      }

      public i(cyo $$0, int $$1, int $$2, int $$3) {
         this(new cys($$0), $$1, $$2, 12, $$3);
      }

      public i(cyo $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cys($$0), $$1, $$2, $$3, $$4);
      }

      public i(cys $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(cyo $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new cys($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(cyo $$0, int $$1, int $$2, int $$3, int $$4, float $$5, ald<dgn> $$6) {
         this(new cys($$0), $$1, $$2, $$3, $$4, $$5, Optional.of($$6));
      }

      public i(cys $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this($$0, $$1, $$2, $$3, $$4, $$5, Optional.empty());
      }

      public i(cys $$0, int $$1, int $$2, int $$3, int $$4, float $$5, Optional<ald<dgn>> $$6) {
         this.a = $$0;
         this.b = $$1;
         this.a.e($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
         this.f = $$6;
      }

      @Override
      public dhn a(bwa $$0, azt $$1) {
         cys $$2 = this.a.v();
         dip $$3 = $$0.dV();
         this.f.ifPresent($$4 -> dfh.a($$2, $$3.F_(), (ald<dgn>)$$4, $$3.d_($$0.dv()), $$1));
         return new dhn(new dhl(cyw.pj, this.b), $$2, this.c, this.d, this.e);
      }
   }

   static class j implements cqi.g {
      private final dbu a;
      private final int b;
      private final float c;

      public j(je<bvc> $$0, int $$1, int $$2) {
         this(new dbu(List.of(new dbu.a($$0, $$1))), $$2, 0.05F);
      }

      public j(dbu $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public dhn a(bwa $$0, azt $$1) {
         cys $$2 = new cys(cyw.xa, 1);
         $$2.b(kj.T, this.a);
         return new dhn(new dhl(cyw.pj), $$2, 12, this.b, this.c);
      }
   }

   static class k implements cqi.g {
      private final cys a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final cyo f;
      private final int g;
      private final float h;

      public k(cyo $$0, int $$1, cyo $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new cys($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public dhn a(bwa $$0, azt $$1) {
         dhl $$2 = new dhl(cyw.pj, this.c);
         List<je<dam>> $$3 = mf.h.c().filter($$1x -> !((dam)$$1x.a()).a().isEmpty() && $$0.dV().L().a($$1x)).collect(Collectors.toList());
         je<dam> $$4 = af.a($$3, $$1);
         cys $$5 = new cys(this.a.h(), this.b);
         $$5.b(kj.R, new dao($$4));
         return new dhn($$2, Optional.of(new dhl(this.f, this.g)), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements cqi.g {
      private final int a;
      private final axp<eqi> b;
      private final String c;
      private final je<exk> d;
      private final int e;
      private final int f;

      public l(int $$0, axp<eqi> $$1, String $$2, je<exk> $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public dhn a(bwa $$0, azt $$1) {
         if ($$0.dV() instanceof aro $$2) {
            iu $$4 = $$2.a(this.b, $$0.dv(), 100, true);
            if ($$4 != null) {
               cys $$5 = czf.a($$2, $$4.u(), $$4.w(), (byte)2, true, true);
               czf.a($$2, $$5);
               exp.a($$5, $$4, "+", this.d);
               $$5.b(kj.h, ww.c(this.c));
               return new dhn(new dhl(cyw.pj, this.a), Optional.of(new dhl(cyw.rD)), $$5, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         } else {
            return null;
         }
      }
   }

   static record m(Map<ald<cqj>, cqi.g> a) implements cqi.g {
      @SafeVarargs
      public static cqi.m a(cqi.g $$0, ald<cqj>... $$1) {
         return new cqi.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public dhn a(bwa $$0, azt $$1) {
         if ($$0 instanceof cqg $$2) {
            ald<cqj> $$3 = $$2.gy().a().e().orElse(null);
            if ($$3 == null) {
               return null;
            } else {
               cqi.g $$4 = this.a.get($$3);
               return $$4 == null ? null : $$4.a($$0, $$1);
            }
         } else {
            return null;
         }
      }
   }
}
