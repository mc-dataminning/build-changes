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

public class crp {
   private static final int d = 12;
   private static final int e = 16;
   private static final int f = 3;
   private static final int g = 1;
   private static final int h = 2;
   private static final int i = 5;
   private static final int j = 10;
   private static final int k = 10;
   private static final int l = 20;
   private static final int m = 15;
   private static final int n = 30;
   private static final int o = 30;
   private static final float p = 0.05F;
   private static final float q = 0.2F;
   public static final Map<alj<cro>, Int2ObjectMap<crp.g[]>> a = ag.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            cro.g,
            a(
               ImmutableMap.of(
                  1,
                  new crp.g[]{
                     new crp.b(dae.qk, 20, 16, 2),
                     new crp.b(dae.vq, 26, 16, 2),
                     new crp.b(dae.vp, 22, 16, 2),
                     new crp.b(dae.wv, 15, 16, 2),
                     new crp.i(dae.ql, 1, 6, 16, 1)
                  },
                  2,
                  new crp.g[]{new crp.b(dng.fr, 6, 12, 10), new crp.i(dae.vD, 1, 4, 5), new crp.i(dae.pi, 1, 4, 16, 5)},
                  3,
                  new crp.g[]{new crp.i(dae.ta, 3, 18, 10), new crp.b(dng.fs, 4, 12, 20)},
                  4,
                  new crp.g[]{
                     new crp.i(dng.ex, 1, 1, 12, 15),
                     new crp.j(bwb.p, 100, 15),
                     new crp.j(bwb.h, 160, 15),
                     new crp.j(bwb.r, 140, 15),
                     new crp.j(bwb.o, 120, 15),
                     new crp.j(bwb.s, 280, 15),
                     new crp.j(bwb.w, 7, 15)
                  },
                  5,
                  new crp.g[]{new crp.i(dae.vu, 3, 3, 30), new crp.i(dae.tB, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            cro.h,
            a(
               ImmutableMap.of(
                  1,
                  new crp.g[]{
                     new crp.b(dae.qg, 20, 16, 2),
                     new crp.b(dae.pl, 10, 16, 2),
                     new crp.h(dae.sh, 6, 1, dae.sl, 6, 16, 1, 0.05F),
                     new crp.i(dae.rx, 3, 1, 16, 1)
                  },
                  2,
                  new crp.g[]{new crp.b(dae.sh, 15, 16, 10), new crp.h(dae.si, 6, 1, dae.sm, 6, 16, 5, 0.05F), new crp.i(dae.xI, 2, 1, 5)},
                  3,
                  new crp.g[]{new crp.b(dae.si, 13, 16, 20), new crp.e(dae.sd, 3, 3, 10, 0.2F)},
                  4,
                  new crp.g[]{new crp.b(dae.sj, 6, 12, 30)},
                  5,
                  new crp.g[]{
                     new crp.b(dae.sk, 4, 12, 30),
                     new crp.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(crq.c, dae.oE)
                           .put(crq.g, dae.oG)
                           .put(crq.e, dae.oG)
                           .put(crq.a, dae.oK)
                           .put(crq.b, dae.oK)
                           .put(crq.d, dae.oM)
                           .put(crq.f, dae.oQ)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            cro.n,
            a(
               ImmutableMap.of(
                  1,
                  new crp.g[]{
                     new crp.b(dng.bK, 18, 16, 2),
                     new crp.b(dng.bW, 18, 16, 2),
                     new crp.b(dng.bZ, 18, 16, 2),
                     new crp.b(dng.bR, 18, 16, 2),
                     new crp.i(dae.td, 2, 1, 1)
                  },
                  2,
                  new crp.g[]{
                     new crp.b(dae.sq, 12, 16, 10),
                     new crp.b(dae.sx, 12, 16, 10),
                     new crp.b(dae.sF, 12, 16, 10),
                     new crp.b(dae.st, 12, 16, 10),
                     new crp.b(dae.sv, 12, 16, 10),
                     new crp.i(dng.bK, 1, 1, 16, 5),
                     new crp.i(dng.bL, 1, 1, 16, 5),
                     new crp.i(dng.bM, 1, 1, 16, 5),
                     new crp.i(dng.bN, 1, 1, 16, 5),
                     new crp.i(dng.bO, 1, 1, 16, 5),
                     new crp.i(dng.bP, 1, 1, 16, 5),
                     new crp.i(dng.bQ, 1, 1, 16, 5),
                     new crp.i(dng.bR, 1, 1, 16, 5),
                     new crp.i(dng.bS, 1, 1, 16, 5),
                     new crp.i(dng.bT, 1, 1, 16, 5),
                     new crp.i(dng.bU, 1, 1, 16, 5),
                     new crp.i(dng.bV, 1, 1, 16, 5),
                     new crp.i(dng.bW, 1, 1, 16, 5),
                     new crp.i(dng.bX, 1, 1, 16, 5),
                     new crp.i(dng.bY, 1, 1, 16, 5),
                     new crp.i(dng.bZ, 1, 1, 16, 5),
                     new crp.i(dng.iM, 1, 4, 16, 5),
                     new crp.i(dng.iN, 1, 4, 16, 5),
                     new crp.i(dng.iO, 1, 4, 16, 5),
                     new crp.i(dng.iP, 1, 4, 16, 5),
                     new crp.i(dng.iQ, 1, 4, 16, 5),
                     new crp.i(dng.iR, 1, 4, 16, 5),
                     new crp.i(dng.iS, 1, 4, 16, 5),
                     new crp.i(dng.iT, 1, 4, 16, 5),
                     new crp.i(dng.iU, 1, 4, 16, 5),
                     new crp.i(dng.iV, 1, 4, 16, 5),
                     new crp.i(dng.iW, 1, 4, 16, 5),
                     new crp.i(dng.iX, 1, 4, 16, 5),
                     new crp.i(dng.iY, 1, 4, 16, 5),
                     new crp.i(dng.iZ, 1, 4, 16, 5),
                     new crp.i(dng.ja, 1, 4, 16, 5),
                     new crp.i(dng.jb, 1, 4, 16, 5)
                  },
                  3,
                  new crp.g[]{
                     new crp.b(dae.su, 12, 16, 20),
                     new crp.b(dae.sy, 12, 16, 20),
                     new crp.b(dae.sr, 12, 16, 20),
                     new crp.b(dae.sE, 12, 16, 20),
                     new crp.b(dae.sw, 12, 16, 20),
                     new crp.i(dng.bg, 3, 1, 12, 10),
                     new crp.i(dng.bk, 3, 1, 12, 10),
                     new crp.i(dng.bu, 3, 1, 12, 10),
                     new crp.i(dng.bv, 3, 1, 12, 10),
                     new crp.i(dng.br, 3, 1, 12, 10),
                     new crp.i(dng.bs, 3, 1, 12, 10),
                     new crp.i(dng.bp, 3, 1, 12, 10),
                     new crp.i(dng.bn, 3, 1, 12, 10),
                     new crp.i(dng.bt, 3, 1, 12, 10),
                     new crp.i(dng.bj, 3, 1, 12, 10),
                     new crp.i(dng.bo, 3, 1, 12, 10),
                     new crp.i(dng.bl, 3, 1, 12, 10),
                     new crp.i(dng.bi, 3, 1, 12, 10),
                     new crp.i(dng.bh, 3, 1, 12, 10),
                     new crp.i(dng.bm, 3, 1, 12, 10),
                     new crp.i(dng.bq, 3, 1, 12, 10)
                  },
                  4,
                  new crp.g[]{
                     new crp.b(dae.sC, 12, 16, 30),
                     new crp.b(dae.sA, 12, 16, 30),
                     new crp.b(dae.sB, 12, 16, 30),
                     new crp.b(dae.sD, 12, 16, 30),
                     new crp.b(dae.ss, 12, 16, 30),
                     new crp.b(dae.sz, 12, 16, 30),
                     new crp.i(dae.wa, 3, 1, 12, 15),
                     new crp.i(dae.wl, 3, 1, 12, 15),
                     new crp.i(dae.wd, 3, 1, 12, 15),
                     new crp.i(dae.wo, 3, 1, 12, 15),
                     new crp.i(dae.wg, 3, 1, 12, 15),
                     new crp.i(dae.wn, 3, 1, 12, 15),
                     new crp.i(dae.wf, 3, 1, 12, 15),
                     new crp.i(dae.wh, 3, 1, 12, 15),
                     new crp.i(dae.wp, 3, 1, 12, 15),
                     new crp.i(dae.wk, 3, 1, 12, 15),
                     new crp.i(dae.wc, 3, 1, 12, 15),
                     new crp.i(dae.wj, 3, 1, 12, 15),
                     new crp.i(dae.wm, 3, 1, 12, 15),
                     new crp.i(dae.we, 3, 1, 12, 15),
                     new crp.i(dae.wb, 3, 1, 12, 15),
                     new crp.i(dae.wi, 3, 1, 12, 15)
                  },
                  5,
                  new crp.g[]{new crp.i(dae.qN, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            cro.i,
            a(
               ImmutableMap.of(
                  1,
                  new crp.g[]{new crp.b(dae.qe, 32, 16, 2), new crp.i(dae.pk, 1, 16, 1), new crp.h(dng.O, 10, 1, dae.qK, 10, 12, 1, 0.05F)},
                  2,
                  new crp.g[]{new crp.b(dae.qK, 26, 12, 10), new crp.i(dae.pj, 2, 1, 5)},
                  3,
                  new crp.g[]{new crp.b(dae.qg, 14, 16, 20), new crp.i(dae.xg, 3, 1, 10)},
                  4,
                  new crp.g[]{new crp.b(dae.qh, 24, 16, 30), new crp.e(dae.pj, 2, 3, 15)},
                  5,
                  new crp.g[]{new crp.b(dae.mF, 8, 12, 30), new crp.e(dae.xg, 3, 3, 15), new crp.k(dae.pk, 5, dae.wB, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            cro.k,
            a(
               ImmutableMap.builder()
                  .put(1, new crp.g[]{new crp.b(dae.rE, 24, 16, 2), new crp.d(1, axi.i), new crp.i(dng.cv, 9, 1, 12, 1)})
                  .put(2, new crp.g[]{new crp.b(dae.rF, 4, 12, 10), new crp.d(5, axi.i), new crp.i(dae.xE, 1, 1, 5)})
                  .put(3, new crp.g[]{new crp.b(dae.sn, 5, 12, 20), new crp.d(10, axi.i), new crp.i(dae.cN, 1, 4, 10)})
                  .put(4, new crp.g[]{new crp.b(dae.vi, 2, 12, 30), new crp.d(15, axi.i), new crp.i(dae.se, 5, 1, 15), new crp.i(dae.rK, 4, 1, 15)})
                  .put(5, new crp.g[]{new crp.i(dae.vW, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            cro.e,
            a(
               ImmutableMap.of(
                  1,
                  new crp.g[]{new crp.b(dae.rE, 24, 12, 2), new crp.i(dae.vt, 7, 1, 12, 1, 0.05F)},
                  2,
                  new crp.g[]{
                     new crp.b(dae.gp, 11, 12, 10),
                     crp.m.a(new crp.l(8, axr.h, "filled_map.village_taiga", ezh.F, 12, 5), crq.f, crq.e, crq.c),
                     crp.m.a(new crp.l(8, axr.k, "filled_map.explorer_swamp", ezh.H, 12, 5), crq.g, crq.e, crq.b),
                     crp.m.a(new crp.l(8, axr.i, "filled_map.village_snowy", ezh.E, 12, 5), crq.g, crq.f),
                     crp.m.a(new crp.l(8, axr.e, "filled_map.village_savanna", ezh.D, 12, 5), crq.c, crq.b, crq.a),
                     crp.m.a(new crp.l(8, axr.g, "filled_map.village_plains", ezh.C, 12, 5), crq.g, crq.e, crq.d, crq.a),
                     crp.m.a(new crp.l(8, axr.j, "filled_map.explorer_jungle", ezh.G, 12, 5), crq.f, crq.d, crq.a),
                     crp.m.a(new crp.l(8, axr.f, "filled_map.village_desert", ezh.B, 12, 5), crq.d, crq.b)
                  },
                  3,
                  new crp.g[]{
                     new crp.b(dae.rK, 1, 12, 20),
                     new crp.l(13, axr.d, "filled_map.monument", ezh.j, 12, 10),
                     new crp.l(12, axr.m, "filled_map.trial_chambers", ezh.I, 12, 10)
                  },
                  4,
                  new crp.g[]{
                     new crp.i(dae.vm, 7, 1, 12, 15, 0.05F),
                     crp.m.a(new crp.i(dae.wl, 2, 1, 12, 15, 0.05F), crq.e, crq.g),
                     crp.m.a(new crp.i(dae.wa, 2, 1, 12, 15, 0.05F), crq.e, crq.c),
                     crp.m.a(new crp.i(dae.wo, 2, 1, 12, 15, 0.05F), crq.e, crq.d),
                     crp.m.a(new crp.i(dae.wn, 2, 1, 12, 15, 0.05F), crq.a, crq.d, crq.b),
                     crp.m.a(new crp.i(dae.wf, 2, 1, 12, 15, 0.05F), crq.a, crq.g),
                     crp.m.a(new crp.i(dae.wk, 2, 1, 12, 15, 0.05F), crq.g, crq.f),
                     crp.m.a(new crp.i(dae.wj, 2, 1, 12, 15, 0.05F), crq.a, crq.e),
                     crp.m.a(new crp.i(dae.we, 2, 1, 12, 15, 0.05F), crq.c, crq.b),
                     crp.m.a(new crp.i(dae.wb, 2, 1, 12, 15, 0.05F), crq.d, crq.a),
                     crp.m.a(new crp.i(dae.wm, 2, 1, 12, 15, 0.05F), crq.c, crq.b),
                     crp.m.a(new crp.i(dae.wc, 2, 1, 12, 15, 0.05F), crq.d),
                     crp.m.a(new crp.i(dae.wd, 2, 1, 12, 15, 0.05F), crq.e, crq.f),
                     crp.m.a(new crp.i(dae.wg, 2, 1, 12, 15, 0.05F), crq.g, crq.c),
                     crp.m.a(new crp.i(dae.wh, 2, 1, 12, 15, 0.05F), crq.a),
                     crp.m.a(new crp.i(dae.wp, 2, 1, 12, 15, 0.05F), crq.f)
                  },
                  5,
                  new crp.g[]{new crp.i(dae.xn, 8, 1, 12, 30, 0.05F), new crp.l(14, axr.c, "filled_map.mansion", ezh.i, 12, 30)}
               )
            )
         );
         $$0.put(
            cro.f,
            a(
               ImmutableMap.of(
                  1,
                  new crp.g[]{new crp.b(dae.tm, 32, 16, 2), new crp.i(dae.ml, 1, 2, 1)},
                  2,
                  new crp.g[]{new crp.b(dae.px, 3, 12, 10), new crp.i(dae.pp, 1, 1, 5)},
                  3,
                  new crp.g[]{new crp.b(dae.vO, 2, 12, 20), new crp.i(dng.et, 4, 1, 12, 10)},
                  4,
                  new crp.g[]{new crp.b(dae.pd, 4, 12, 30), new crp.b(dae.ts, 9, 12, 30), new crp.i(dae.tn, 5, 1, 15)},
                  5,
                  new crp.g[]{new crp.b(dae.tr, 22, 12, 30), new crp.i(dae.vf, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            cro.c,
            a(
               ImmutableMap.of(
                  1,
                  new crp.g[]{
                     new crp.b(dae.pl, 15, 16, 2),
                     new crp.i(new daa(dae.qw), 7, 1, 12, 1, 0.2F),
                     new crp.i(new daa(dae.qx), 4, 1, 12, 1, 0.2F),
                     new crp.i(new daa(dae.qu), 5, 1, 12, 1, 0.2F),
                     new crp.i(new daa(dae.qv), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new crp.g[]{
                     new crp.b(dae.pt, 4, 12, 10),
                     new crp.i(new daa(dae.xD), 36, 1, 12, 5, 0.2F),
                     new crp.i(new daa(dae.qt), 1, 1, 12, 5, 0.2F),
                     new crp.i(new daa(dae.qs), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new crp.g[]{
                     new crp.b(dae.rq, 1, 12, 20),
                     new crp.b(dae.pn, 1, 12, 20),
                     new crp.i(new daa(dae.qq), 1, 1, 12, 10, 0.2F),
                     new crp.i(new daa(dae.qr), 4, 1, 12, 10, 0.2F),
                     new crp.i(new daa(dae.wD), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new crp.g[]{new crp.e(dae.qA, 14, 3, 15, 0.2F), new crp.e(dae.qB, 8, 3, 15, 0.2F)},
                  5,
                  new crp.g[]{new crp.e(dae.qy, 8, 3, 30, 0.2F), new crp.e(dae.qz, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cro.p,
            a(
               ImmutableMap.of(
                  1,
                  new crp.g[]{new crp.b(dae.pl, 15, 16, 2), new crp.i(new daa(dae.pS), 3, 1, 12, 1, 0.2F), new crp.e(dae.pP, 2, 3, 1)},
                  2,
                  new crp.g[]{new crp.b(dae.pt, 4, 12, 10), new crp.i(new daa(dae.xD), 36, 1, 12, 5, 0.2F)},
                  3,
                  new crp.g[]{new crp.b(dae.qK, 24, 12, 20)},
                  4,
                  new crp.g[]{new crp.b(dae.pn, 1, 12, 30), new crp.e(dae.pX, 12, 3, 15, 0.2F)},
                  5,
                  new crp.g[]{new crp.e(dae.pU, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cro.o,
            a(
               ImmutableMap.of(
                  1,
                  new crp.g[]{
                     new crp.b(dae.pl, 15, 16, 2),
                     new crp.i(new daa(dae.pI), 1, 1, 12, 1, 0.2F),
                     new crp.i(new daa(dae.pG), 1, 1, 12, 1, 0.2F),
                     new crp.i(new daa(dae.pH), 1, 1, 12, 1, 0.2F),
                     new crp.i(new daa(dae.pJ), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new crp.g[]{new crp.b(dae.pt, 4, 12, 10), new crp.i(new daa(dae.xD), 36, 1, 12, 5, 0.2F)},
                  3,
                  new crp.g[]{
                     new crp.b(dae.qK, 30, 12, 20),
                     new crp.e(dae.pS, 1, 3, 10, 0.2F),
                     new crp.e(dae.pQ, 2, 3, 10, 0.2F),
                     new crp.e(dae.pR, 3, 3, 10, 0.2F),
                     new crp.i(new daa(dae.pY), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new crp.g[]{new crp.b(dae.pn, 1, 12, 30), new crp.e(dae.pX, 12, 3, 15, 0.2F), new crp.e(dae.pV, 5, 3, 15, 0.2F)},
                  5,
                  new crp.g[]{new crp.e(dae.pW, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cro.d,
            a(
               ImmutableMap.of(
                  1,
                  new crp.g[]{new crp.b(dae.tk, 14, 16, 2), new crp.b(dae.qL, 7, 16, 2), new crp.b(dae.vL, 4, 16, 2), new crp.i(dae.vN, 1, 1, 1)},
                  2,
                  new crp.g[]{new crp.b(dae.pl, 15, 16, 2), new crp.i(dae.qM, 1, 5, 16, 5), new crp.i(dae.tl, 1, 8, 16, 5)},
                  3,
                  new crp.g[]{new crp.b(dae.vY, 7, 16, 20), new crp.b(dae.ti, 10, 16, 20)},
                  4,
                  new crp.g[]{new crp.b(dae.rD, 10, 12, 30)},
                  5,
                  new crp.g[]{new crp.b(dae.xG, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            cro.j,
            a(
               ImmutableMap.of(
                  1,
                  new crp.g[]{new crp.b(dae.rt, 6, 16, 2), new crp.a(dae.qo, 3), new crp.a(dae.qn, 7)},
                  2,
                  new crp.g[]{new crp.b(dae.qK, 26, 12, 10), new crp.a(dae.qm, 5, 12, 5), new crp.a(dae.qp, 4, 12, 5)},
                  3,
                  new crp.g[]{new crp.b(dae.vP, 9, 12, 20), new crp.a(dae.qn, 7)},
                  4,
                  new crp.g[]{new crp.b(dae.pd, 4, 12, 30), new crp.a(dae.vU, 6, 12, 15)},
                  5,
                  new crp.g[]{new crp.i(new daa(dae.ou), 6, 1, 12, 30, 0.2F), new crp.a(dae.qm, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            cro.l,
            a(
               ImmutableMap.of(
                  1,
                  new crp.g[]{new crp.b(dae.rC, 10, 16, 2), new crp.i(dae.rB, 1, 10, 16, 1)},
                  2,
                  new crp.g[]{new crp.b(dng.b, 20, 16, 10), new crp.i(dng.fc, 1, 4, 16, 5)},
                  3,
                  new crp.g[]{
                     new crp.b(dng.c, 16, 16, 20),
                     new crp.b(dng.g, 16, 16, 20),
                     new crp.b(dng.e, 16, 16, 20),
                     new crp.i(dng.tc, 1, 4, 16, 10),
                     new crp.i(dng.h, 1, 4, 16, 10),
                     new crp.i(dng.f, 1, 4, 16, 10),
                     new crp.i(dng.d, 1, 4, 16, 10)
                  },
                  4,
                  new crp.g[]{
                     new crp.b(dae.pq, 12, 12, 30),
                     new crp.i(dng.hL, 1, 1, 12, 15),
                     new crp.i(dng.hK, 1, 1, 12, 15),
                     new crp.i(dng.hV, 1, 1, 12, 15),
                     new crp.i(dng.hN, 1, 1, 12, 15),
                     new crp.i(dng.hR, 1, 1, 12, 15),
                     new crp.i(dng.hS, 1, 1, 12, 15),
                     new crp.i(dng.hZ, 1, 1, 12, 15),
                     new crp.i(dng.hY, 1, 1, 12, 15),
                     new crp.i(dng.hQ, 1, 1, 12, 15),
                     new crp.i(dng.hM, 1, 1, 12, 15),
                     new crp.i(dng.hP, 1, 1, 12, 15),
                     new crp.i(dng.hX, 1, 1, 12, 15),
                     new crp.i(dng.hT, 1, 1, 12, 15),
                     new crp.i(dng.hU, 1, 1, 12, 15),
                     new crp.i(dng.hO, 1, 1, 12, 15),
                     new crp.i(dng.hW, 1, 1, 12, 15),
                     new crp.i(dng.lN, 1, 1, 12, 15),
                     new crp.i(dng.lM, 1, 1, 12, 15),
                     new crp.i(dng.lX, 1, 1, 12, 15),
                     new crp.i(dng.lP, 1, 1, 12, 15),
                     new crp.i(dng.lT, 1, 1, 12, 15),
                     new crp.i(dng.lU, 1, 1, 12, 15),
                     new crp.i(dng.mb, 1, 1, 12, 15),
                     new crp.i(dng.ma, 1, 1, 12, 15),
                     new crp.i(dng.lS, 1, 1, 12, 15),
                     new crp.i(dng.lO, 1, 1, 12, 15),
                     new crp.i(dng.lR, 1, 1, 12, 15),
                     new crp.i(dng.lZ, 1, 1, 12, 15),
                     new crp.i(dng.lV, 1, 1, 12, 15),
                     new crp.i(dng.lW, 1, 1, 12, 15),
                     new crp.i(dng.lQ, 1, 1, 12, 15),
                     new crp.i(dng.lY, 1, 1, 12, 15)
                  },
                  5,
                  new crp.g[]{new crp.i(dng.hG, 1, 1, 12, 30), new crp.i(dng.hE, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final List<Pair<crp.g[], Integer>> b = ImmutableList.builder()
      .add(
         Pair.of(
            new crp.g[]{
               new crp.b(a(dbx.a), 2, 1, 1),
               new crp.b(dae.rp, 1, 2, 1, 2),
               new crp.b(dae.ru, 1, 2, 1, 2),
               new crp.b(dae.tv, 1, 2, 1, 3),
               new crp.b(dae.vr, 4, 2, 1),
               new crp.b(dae.ih, 1, 2, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new crp.g[]{
               new crp.i(dae.iz, 1, 1, 6, 1),
               new crp.i(dae.lz, 6, 1, 6, 1),
               new crp.i(dae.qi, 1, 4, 2, 1),
               new crp.i(dae.E, 3, 3, 6, 1),
               new crp.i(dng.ab, 1, 8, 4, 1),
               new crp.i(dng.Z, 1, 8, 4, 1),
               new crp.i(dng.ad, 1, 8, 4, 1),
               new crp.i(dng.aa, 1, 8, 4, 1),
               new crp.i(dng.X, 1, 8, 4, 1),
               new crp.i(dng.Y, 1, 8, 4, 1),
               new crp.i(dng.ac, 1, 8, 4, 1),
               new crp.i(dng.af, 1, 8, 4, 1),
               new crp.i(dng.ae, 1, 8, 4, 1),
               new crp.e(dae.pR, 1, 1, 1, 0.2F),
               new crp.i(b(dbx.h), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new crp.g[]{
               new crp.i(dae.ry, 3, 1, 4, 1),
               new crp.i(dae.rv, 3, 1, 4, 1),
               new crp.i(dae.de, 2, 1, 5, 1),
               new crp.i(dae.rG, 4, 1, 5, 1),
               new crp.i(dae.fQ, 2, 1, 5, 1),
               new crp.i(dae.xe, 5, 1, 5, 1),
               new crp.i(dae.cV, 1, 1, 12, 1),
               new crp.i(dae.dW, 1, 1, 8, 1),
               new crp.i(dae.fG, 1, 1, 4, 1),
               new crp.i(dae.dX, 3, 1, 12, 1),
               new crp.i(dae.fq, 3, 1, 8, 1),
               new crp.i(dae.dv, 1, 1, 12, 1),
               new crp.i(dae.dy, 1, 1, 12, 1),
               new crp.i(dae.dz, 1, 1, 8, 1),
               new crp.i(dae.dA, 1, 1, 12, 1),
               new crp.i(dae.dB, 1, 1, 12, 1),
               new crp.i(dae.dC, 1, 1, 12, 1),
               new crp.i(dae.dD, 1, 1, 12, 1),
               new crp.i(dae.dE, 1, 1, 12, 1),
               new crp.i(dae.dF, 1, 1, 12, 1),
               new crp.i(dae.dG, 1, 1, 12, 1),
               new crp.i(dae.dH, 1, 1, 12, 1),
               new crp.i(dae.dI, 1, 1, 7, 1),
               new crp.i(dae.dw, 1, 1, 7, 1),
               new crp.i(dae.qj, 1, 1, 12, 1),
               new crp.i(dae.ww, 1, 1, 12, 1),
               new crp.i(dae.tg, 1, 1, 12, 1),
               new crp.i(dae.th, 1, 1, 12, 1),
               new crp.i(dae.ab, 5, 1, 8, 1),
               new crp.i(dae.Z, 5, 1, 8, 1),
               new crp.i(dae.ad, 5, 1, 8, 1),
               new crp.i(dae.aa, 5, 1, 8, 1),
               new crp.i(dae.X, 5, 1, 8, 1),
               new crp.i(dae.Y, 5, 1, 8, 1),
               new crp.i(dae.ac, 5, 1, 8, 1),
               new crp.i(dae.ae, 5, 1, 8, 1),
               new crp.i(dae.af, 5, 1, 8, 1),
               new crp.i(dae.sE, 1, 3, 12, 1),
               new crp.i(dae.sq, 1, 3, 12, 1),
               new crp.i(dae.sB, 1, 3, 12, 1),
               new crp.i(dae.sw, 1, 3, 12, 1),
               new crp.i(dae.sF, 1, 3, 12, 1),
               new crp.i(dae.sD, 1, 3, 12, 1),
               new crp.i(dae.sy, 1, 3, 12, 1),
               new crp.i(dae.ss, 1, 3, 12, 1),
               new crp.i(dae.su, 1, 3, 12, 1),
               new crp.i(dae.sx, 1, 3, 12, 1),
               new crp.i(dae.sA, 1, 3, 12, 1),
               new crp.i(dae.st, 1, 3, 12, 1),
               new crp.i(dae.sv, 1, 3, 12, 1),
               new crp.i(dae.sr, 1, 3, 12, 1),
               new crp.i(dae.sC, 1, 3, 12, 1),
               new crp.i(dae.sz, 1, 3, 12, 1),
               new crp.i(dae.lb, 3, 1, 8, 1),
               new crp.i(dae.lc, 3, 1, 8, 1),
               new crp.i(dae.ld, 3, 1, 8, 1),
               new crp.i(dae.le, 3, 1, 8, 1),
               new crp.i(dae.la, 3, 1, 8, 1),
               new crp.i(dae.gr, 1, 3, 4, 1),
               new crp.i(dae.ee, 1, 3, 4, 1),
               new crp.i(dae.dN, 1, 3, 4, 1),
               new crp.i(dae.dO, 1, 3, 4, 1),
               new crp.i(dae.gE, 1, 5, 2, 1),
               new crp.i(dae.ei, 1, 2, 5, 1),
               new crp.i(dae.ah, 1, 8, 8, 1),
               new crp.i(dae.ak, 1, 4, 6, 1),
               new crp.i(dae.yA, 1, 2, 5, 1),
               new crp.i(dae.F, 1, 2, 5, 1),
               new crp.i(dae.ec, 1, 2, 5, 1),
               new crp.i(dae.ef, 1, 2, 5, 1),
               new crp.i(dae.dZ, 1, 1, 12, 1),
               new crp.i(dae.dc, 1, 1, 12, 1),
               new crp.i(dae.da, 3, 1, 12, 1)
            },
            5
         )
      )
      .build();
   public static final Map<alj<cro>, Int2ObjectMap<crp.g[]>> c = Map.of(
      cro.k,
      a(
         ImmutableMap.builder()
            .put(1, new crp.g[]{new crp.b(dae.rE, 24, 16, 2), a(1), new crp.i(dng.cv, 9, 1, 12, 1)})
            .put(2, new crp.g[]{new crp.b(dae.rF, 4, 12, 10), a(5), new crp.i(dae.xE, 1, 1, 5)})
            .put(3, new crp.g[]{new crp.b(dae.sn, 5, 12, 20), a(10), new crp.i(dae.cN, 1, 4, 10)})
            .put(4, new crp.g[]{new crp.b(dae.vi, 2, 12, 30), new crp.i(dae.se, 5, 1, 15), new crp.i(dae.rK, 4, 1, 15)})
            .put(5, new crp.g[]{a(), new crp.i(dae.vW, 20, 1, 30)})
            .build()
      ),
      cro.c,
      a(
         ImmutableMap.builder()
            .put(1, new crp.g[]{new crp.b(dae.pl, 15, 12, 2), new crp.b(dae.pt, 5, 12, 2)})
            .put(
               2,
               new crp.g[]{
                  crp.m.a(new crp.i(dae.qx, 4, 1, 12, 5, 0.05F), crq.a, crq.c, crq.d, crq.e, crq.g),
                  crp.m.a(new crp.i(dae.qt, 4, 1, 12, 5, 0.05F), crq.b, crq.f),
                  crp.m.a(new crp.i(dae.qu, 5, 1, 12, 5, 0.05F), crq.a, crq.c, crq.d, crq.e, crq.g),
                  crp.m.a(new crp.i(dae.qq, 5, 1, 12, 5, 0.05F), crq.b, crq.f),
                  crp.m.a(new crp.i(dae.qw, 7, 1, 12, 5, 0.05F), crq.a, crq.c, crq.d, crq.e, crq.g),
                  crp.m.a(new crp.i(dae.qs, 7, 1, 12, 5, 0.05F), crq.b, crq.f),
                  crp.m.a(new crp.i(dae.qv, 9, 1, 12, 5, 0.05F), crq.a, crq.c, crq.d, crq.e, crq.g),
                  crp.m.a(new crp.i(dae.qr, 9, 1, 12, 5, 0.05F), crq.b, crq.f)
               }
            )
            .put(3, new crp.g[]{new crp.b(dae.rq, 1, 12, 20), new crp.i(dae.wD, 5, 1, 12, 10, 0.05F), new crp.i(dae.xD, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new crp.g[]{
                  crp.m.a(new crp.i(dae.qx, 8, 1, 3, 15, 0.05F, dia.a), crq.a),
                  crp.m.a(new crp.i(dae.qu, 9, 1, 3, 15, 0.05F, dia.d), crq.a),
                  crp.m.a(new crp.i(dae.qw, 11, 1, 3, 15, 0.05F, dia.b), crq.a),
                  crp.m.a(new crp.i(dae.qv, 13, 1, 3, 15, 0.05F, dia.c), crq.a),
                  crp.m.a(new crp.i(dae.qx, 8, 1, 3, 15, 0.05F, dia.g), crq.c),
                  crp.m.a(new crp.i(dae.qu, 9, 1, 3, 15, 0.05F, dia.j), crq.c),
                  crp.m.a(new crp.i(dae.qw, 11, 1, 3, 15, 0.05F, dia.h), crq.c),
                  crp.m.a(new crp.i(dae.qv, 13, 1, 3, 15, 0.05F, dia.i), crq.c),
                  crp.m.a(new crp.i(dae.qx, 2, 1, 3, 15, 0.05F, dia.m), crq.d),
                  crp.m.a(new crp.i(dae.qu, 3, 1, 3, 15, 0.05F, dia.p), crq.d),
                  crp.m.a(new crp.i(dae.qw, 5, 1, 3, 15, 0.05F, dia.n), crq.d),
                  crp.m.a(new crp.i(dae.qv, 7, 1, 3, 15, 0.05F, dia.o), crq.d),
                  crp.m.a(new crp.i(dae.qx, 8, 1, 3, 15, 0.05F, dia.s), crq.e),
                  crp.m.a(new crp.i(dae.qu, 9, 1, 3, 15, 0.05F, dia.t), crq.e),
                  crp.m.a(new crp.i(dae.qt, 8, 1, 3, 15, 0.05F, dia.w), crq.b),
                  crp.m.a(new crp.i(dae.qq, 9, 1, 3, 15, 0.05F, dia.z), crq.b),
                  crp.m.a(new crp.i(dae.qs, 11, 1, 3, 15, 0.05F, dia.x), crq.b),
                  crp.m.a(new crp.i(dae.qr, 13, 1, 3, 15, 0.05F, dia.y), crq.b),
                  crp.m.a(new crp.i(dae.qt, 8, 1, 3, 15, 0.05F, dia.C), crq.f),
                  crp.m.a(new crp.i(dae.qq, 9, 1, 3, 15, 0.05F, dia.F), crq.f),
                  crp.m.a(new crp.i(dae.qs, 11, 1, 3, 15, 0.05F, dia.D), crq.f),
                  crp.m.a(new crp.i(dae.qr, 13, 1, 3, 15, 0.05F, dia.E), crq.f),
                  crp.m.a(new crp.h(dae.qB, 1, 4, dae.qA, 1, 3, 15, 0.05F), crq.g),
                  crp.m.a(new crp.h(dae.qA, 1, 4, dae.qz, 1, 3, 15, 0.05F), crq.g),
                  crp.m.a(new crp.h(dae.qy, 1, 4, dae.qB, 1, 3, 15, 0.05F), crq.g),
                  crp.m.a(new crp.h(dae.qz, 1, 2, dae.qy, 1, 3, 15, 0.05F), crq.g)
               }
            )
            .put(
               5,
               new crp.g[]{
                  crp.m.a(new crp.h(dae.pn, 4, 16, dae.qz, 1, 3, 30, 0.05F, dia.f), crq.a),
                  crp.m.a(new crp.h(dae.pn, 3, 16, dae.qA, 1, 3, 30, 0.05F, dia.e), crq.a),
                  crp.m.a(new crp.h(dae.pn, 3, 16, dae.qA, 1, 3, 30, 0.05F, dia.l), crq.c),
                  crp.m.a(new crp.h(dae.pn, 2, 12, dae.qB, 1, 3, 30, 0.05F, dia.k), crq.c),
                  crp.m.a(new crp.h(dae.pn, 2, 6, dae.qy, 1, 3, 30, 0.05F, dia.r), crq.d),
                  crp.m.a(new crp.h(dae.pn, 3, 8, dae.qz, 1, 3, 30, 0.05F, dia.q), crq.d),
                  crp.m.a(new crp.h(dae.pn, 2, 12, dae.qB, 1, 3, 30, 0.05F, dia.u), crq.e),
                  crp.m.a(new crp.h(dae.pn, 3, 12, dae.qy, 1, 3, 30, 0.05F, dia.v), crq.e),
                  crp.m.a(new crp.i(dae.qq, 9, 1, 3, 30, 0.05F, dia.B), crq.b),
                  crp.m.a(new crp.i(dae.qt, 8, 1, 3, 30, 0.05F, dia.A), crq.b),
                  crp.m.a(new crp.i(dae.qq, 9, 1, 3, 30, 0.05F, dia.H), crq.f),
                  crp.m.a(new crp.i(dae.qt, 8, 1, 3, 30, 0.05F, dia.G), crq.f),
                  crp.m.a(new crp.h(dae.pn, 4, 18, dae.qz, 1, 3, 30, 0.05F, dia.J), crq.g),
                  crp.m.a(new crp.h(dae.pn, 3, 18, dae.qA, 1, 3, 30, 0.05F, dia.I), crq.g),
                  crp.m.a(new crp.b(dae.aP, 1, 12, 30, 42), crq.g),
                  crp.m.a(new crp.b(dae.aM, 1, 12, 30, 4), crq.a, crq.b, crq.c, crq.d, crq.e, crq.f)
               }
            )
            .build()
      )
   );

   private static crp.g a(int $$0) {
      return new crp.m(
         ImmutableMap.builder()
            .put(crq.a, new crp.d($$0, axi.w))
            .put(crq.b, new crp.d($$0, axi.x))
            .put(crq.c, new crp.d($$0, axi.y))
            .put(crq.d, new crp.d($$0, axi.z))
            .put(crq.e, new crp.d($$0, axi.A))
            .put(crq.f, new crp.d($$0, axi.B))
            .put(crq.g, new crp.d($$0, axi.C))
            .build()
      );
   }

   private static crp.g a() {
      return new crp.m(
         ImmutableMap.builder()
            .put(crq.a, new crp.d(30, 3, 3, axi.D))
            .put(crq.b, new crp.d(30, 2, 2, axi.E))
            .put(crq.c, new crp.d(30, 3, 3, axi.F))
            .put(crq.d, new crp.d(30, 3, 3, axi.G))
            .put(crq.e, new crp.d(30, axi.H))
            .put(crq.f, new crp.d(30, axi.I))
            .put(crq.g, new crp.d(30, 2, 2, axi.J))
            .build()
      );
   }

   private static Int2ObjectMap<crp.g[]> a(ImmutableMap<Integer, crp.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static dit a(jg<dbu> $$0) {
      return new dit(dae.tt).a($$1 -> $$1.a(kl.R, new dbw($$0)));
   }

   private static daa b(jg<dbu> $$0) {
      return dbw.a(dae.tt, $$0);
   }

   static class a implements crp.g {
      private final czw a;
      private final int b;
      private final int c;
      private final int d;

      public a(czw $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(czw $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public div a(bwv $$0, azz $$1) {
         dit $$2 = new dit(dae.po, this.b);
         daa $$3 = new daa(this.a);
         if ($$3.a(axo.bQ)) {
            List<cyz> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = dcn.a($$3, $$4);
         }

         return new div($$2, $$3, this.c, this.d, 0.2F);
      }

      private static cyz a(azz $$0) {
         return cyz.a(cyy.a($$0.a(16)));
      }
   }

   static class b implements crp.g {
      private final dit a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(djy $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(djy $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new dit($$0.h(), $$1), $$2, $$3, $$4);
      }

      public b(dit $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public div a(bwv $$0, azz $$1) {
         return new div(this.a, new daa(dae.po, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements crp.g {
      private final Map<alj<crq>, czw> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<alj<crq>, czw> $$3) {
         mh.w.j().stream().filter($$1x -> !$$3.containsKey($$1x)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + $$0x);
         });
         this.a = $$3;
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Nullable
      @Override
      public div a(bwv $$0, azz $$1) {
         if ($$0 instanceof crn $$2) {
            alj<crq> $$3 = $$2.gC().a().e().orElse(null);
            if ($$3 == null) {
               return null;
            } else {
               dit $$4 = new dit(this.a.get($$3), this.b);
               return new div($$4, new daa(dae.po), this.c, this.d, 0.05F);
            }
         } else {
            return null;
         }
      }
   }

   static class d implements crp.g {
      private final int a;
      private final axv<dgn> b;
      private final int c;
      private final int d;

      public d(int $$0, axv<dgn> $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, axv<dgn> $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = $$3;
      }

      @Override
      public div a(bwv $$0, azz $$1) {
         Optional<jg<dgn>> $$2 = $$0.dV().J_().f(mi.aR).a(this.b, $$1);
         int $$9;
         daa $$8;
         if (!$$2.isEmpty()) {
            jg<dgn> $$3 = $$2.get();
            dgn $$4 = $$3.a();
            int $$5 = Math.max($$4.d(), this.c);
            int $$6 = Math.min($$4.e(), this.d);
            int $$7 = azq.a($$1, $$5, $$6);
            $$8 = dgp.a(new dgq($$3, $$7));
            $$9 = 2 + $$1.a(5 + $$7 * 10) + 3 * $$7;
            if ($$3.a(axi.j)) {
               $$9 *= 2;
            }

            if ($$9 > 64) {
               $$9 = 64;
            }
         } else {
            $$9 = 1;
            $$8 = new daa(dae.rF);
         }

         return new div(new dit(dae.po, $$9), Optional.of(new dit(dae.rF)), $$8, 12, this.a, 0.2F);
      }
   }

   static class e implements crp.g {
      private final daa a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(czw $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(czw $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new daa($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public div a(bwv $$0, azz $$1) {
         int $$2 = 5 + $$1.a(15);
         ju $$3 = $$0.dV().J_();
         Optional<jk.c<dgn>> $$4 = $$3.f(mi.aR).a(axi.m);
         daa $$5 = dgp.a($$1, new daa(this.a.h()), $$2, $$3, $$4);
         int $$6 = Math.min(this.b + $$2, 64);
         dit $$7 = new dit(dae.po, $$6);
         return new div($$7, $$5, this.c, this.d, this.e);
      }
   }

   static class f implements crp.g {
      private f() {
      }

      @Override
      public div a(bwv $$0, azz $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      div a(bwv var1, azz var2);
   }

   static class h implements crp.g {
      private final dit a;
      private final int b;
      private final daa c;
      private final int d;
      private final int e;
      private final float f;
      private final Optional<alj<dhv>> g;

      public h(djy $$0, int $$1, int $$2, czw $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new daa($$3), $$4, $$5, $$6, $$7);
      }

      private h(djy $$0, int $$1, int $$2, daa $$3, int $$4, int $$5, int $$6, float $$7) {
         this(new dit($$0, $$1), $$2, $$3.c($$4), $$5, $$6, $$7, Optional.empty());
      }

      h(djy $$0, int $$1, int $$2, djy $$3, int $$4, int $$5, int $$6, float $$7, alj<dhv> $$8) {
         this(new dit($$0, $$1), $$2, new daa($$3, $$4), $$5, $$6, $$7, Optional.of($$8));
      }

      public h(dit $$0, int $$1, daa $$2, int $$3, int $$4, float $$5, Optional<alj<dhv>> $$6) {
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
      public div a(bwv $$0, azz $$1) {
         daa $$2 = this.c.v();
         djz $$3 = $$0.dV();
         this.g.ifPresent($$4 -> dgp.a($$2, $$3.J_(), (alj<dhv>)$$4, $$3.d_($$0.dv()), $$1));
         return new div(new dit(dae.po, this.b), Optional.of(this.a), $$2, 0, this.d, this.e, this.f);
      }
   }

   static class i implements crp.g {
      private final daa a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;
      private final Optional<alj<dhv>> f;

      public i(dne $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new daa($$0), $$1, $$2, $$3, $$4);
      }

      public i(czw $$0, int $$1, int $$2, int $$3) {
         this(new daa($$0), $$1, $$2, 12, $$3);
      }

      public i(czw $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new daa($$0), $$1, $$2, $$3, $$4);
      }

      public i(daa $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(czw $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new daa($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(czw $$0, int $$1, int $$2, int $$3, int $$4, float $$5, alj<dhv> $$6) {
         this(new daa($$0), $$1, $$2, $$3, $$4, $$5, Optional.of($$6));
      }

      public i(daa $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this($$0, $$1, $$2, $$3, $$4, $$5, Optional.empty());
      }

      public i(daa $$0, int $$1, int $$2, int $$3, int $$4, float $$5, Optional<alj<dhv>> $$6) {
         this.a = $$0;
         this.b = $$1;
         this.a.e($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
         this.f = $$6;
      }

      @Override
      public div a(bwv $$0, azz $$1) {
         daa $$2 = this.a.v();
         djz $$3 = $$0.dV();
         this.f.ifPresent($$4 -> dgp.a($$2, $$3.J_(), (alj<dhv>)$$4, $$3.d_($$0.dv()), $$1));
         return new div(new dit(dae.po, this.b), $$2, this.c, this.d, this.e);
      }
   }

   static class j implements crp.g {
      private final ddc a;
      private final int b;
      private final float c;

      public j(jg<bvx> $$0, int $$1, int $$2) {
         this(new ddc(List.of(new ddc.a($$0, $$1))), $$2, 0.05F);
      }

      public j(ddc $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public div a(bwv $$0, azz $$1) {
         daa $$2 = new daa(dae.xh, 1);
         $$2.b(kl.T, this.a);
         return new div(new dit(dae.po), $$2, 12, this.b, this.c);
      }
   }

   static class k implements crp.g {
      private final daa a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final czw f;
      private final int g;
      private final float h;

      public k(czw $$0, int $$1, czw $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new daa($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public div a(bwv $$0, azz $$1) {
         dit $$2 = new dit(dae.po, this.c);
         List<jg<dbu>> $$3 = mh.h.c().filter($$1x -> !((dbu)$$1x.a()).a().isEmpty() && $$0.dV().L().a($$1x)).collect(Collectors.toList());
         jg<dbu> $$4 = ag.a($$3, $$1);
         daa $$5 = new daa(this.a.h(), this.b);
         $$5.b(kl.R, new dbw($$4));
         return new div($$2, Optional.of(new dit(this.f, this.g)), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements crp.g {
      private final int a;
      private final axv<esd> b;
      private final String c;
      private final jg<ezg> d;
      private final int e;
      private final int f;

      public l(int $$0, axv<esd> $$1, String $$2, jg<ezg> $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public div a(bwv $$0, azz $$1) {
         if ($$0.dV() instanceof aru $$2) {
            iw $$4 = $$2.a(this.b, $$0.dv(), 100, true);
            if ($$4 != null) {
               daa $$5 = dan.a($$2, $$4.u(), $$4.w(), (byte)2, true, true);
               dan.a($$2, $$5);
               ezl.a($$5, $$4, "+", this.d);
               $$5.b(kl.h, xc.c(this.c));
               return new div(new dit(dae.po, this.a), Optional.of(new dit(dae.rK)), $$5, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         } else {
            return null;
         }
      }
   }

   static record m(Map<alj<crq>, crp.g> a) implements crp.g {
      @SafeVarargs
      public static crp.m a(crp.g $$0, alj<crq>... $$1) {
         return new crp.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public div a(bwv $$0, azz $$1) {
         if ($$0 instanceof crn $$2) {
            alj<crq> $$3 = $$2.gC().a().e().orElse(null);
            if ($$3 == null) {
               return null;
            } else {
               crp.g $$4 = this.a.get($$3);
               return $$4 == null ? null : $$4.a($$0, $$1);
            }
         } else {
            return null;
         }
      }
   }
}
