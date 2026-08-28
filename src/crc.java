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

public class crc {
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
   public static final Map<alf<crb>, Int2ObjectMap<crc.g[]>> a = ag.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            crb.g,
            a(
               ImmutableMap.of(
                  1,
                  new crc.g[]{
                     new crc.b(czr.qk, 20, 16, 2),
                     new crc.b(czr.vq, 26, 16, 2),
                     new crc.b(czr.vp, 22, 16, 2),
                     new crc.b(czr.wv, 15, 16, 2),
                     new crc.i(czr.ql, 1, 6, 16, 1)
                  },
                  2,
                  new crc.g[]{new crc.b(dmt.fr, 6, 12, 10), new crc.i(czr.vD, 1, 4, 5), new crc.i(czr.pi, 1, 4, 16, 5)},
                  3,
                  new crc.g[]{new crc.i(czr.ta, 3, 18, 10), new crc.b(dmt.fs, 4, 12, 20)},
                  4,
                  new crc.g[]{
                     new crc.i(dmt.ex, 1, 1, 12, 15),
                     new crc.j(bvo.p, 100, 15),
                     new crc.j(bvo.h, 160, 15),
                     new crc.j(bvo.r, 140, 15),
                     new crc.j(bvo.o, 120, 15),
                     new crc.j(bvo.s, 280, 15),
                     new crc.j(bvo.w, 7, 15)
                  },
                  5,
                  new crc.g[]{new crc.i(czr.vu, 3, 3, 30), new crc.i(czr.tB, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            crb.h,
            a(
               ImmutableMap.of(
                  1,
                  new crc.g[]{
                     new crc.b(czr.qg, 20, 16, 2),
                     new crc.b(czr.pl, 10, 16, 2),
                     new crc.h(czr.sh, 6, 1, czr.sl, 6, 16, 1, 0.05F),
                     new crc.i(czr.rx, 3, 1, 16, 1)
                  },
                  2,
                  new crc.g[]{new crc.b(czr.sh, 15, 16, 10), new crc.h(czr.si, 6, 1, czr.sm, 6, 16, 5, 0.05F), new crc.i(czr.xI, 2, 1, 5)},
                  3,
                  new crc.g[]{new crc.b(czr.si, 13, 16, 20), new crc.e(czr.sd, 3, 3, 10, 0.2F)},
                  4,
                  new crc.g[]{new crc.b(czr.sj, 6, 12, 30)},
                  5,
                  new crc.g[]{
                     new crc.b(czr.sk, 4, 12, 30),
                     new crc.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(crd.c, czr.oE)
                           .put(crd.g, czr.oG)
                           .put(crd.e, czr.oG)
                           .put(crd.a, czr.oK)
                           .put(crd.b, czr.oK)
                           .put(crd.d, czr.oM)
                           .put(crd.f, czr.oQ)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            crb.n,
            a(
               ImmutableMap.of(
                  1,
                  new crc.g[]{
                     new crc.b(dmt.bK, 18, 16, 2),
                     new crc.b(dmt.bW, 18, 16, 2),
                     new crc.b(dmt.bZ, 18, 16, 2),
                     new crc.b(dmt.bR, 18, 16, 2),
                     new crc.i(czr.td, 2, 1, 1)
                  },
                  2,
                  new crc.g[]{
                     new crc.b(czr.sq, 12, 16, 10),
                     new crc.b(czr.sx, 12, 16, 10),
                     new crc.b(czr.sF, 12, 16, 10),
                     new crc.b(czr.st, 12, 16, 10),
                     new crc.b(czr.sv, 12, 16, 10),
                     new crc.i(dmt.bK, 1, 1, 16, 5),
                     new crc.i(dmt.bL, 1, 1, 16, 5),
                     new crc.i(dmt.bM, 1, 1, 16, 5),
                     new crc.i(dmt.bN, 1, 1, 16, 5),
                     new crc.i(dmt.bO, 1, 1, 16, 5),
                     new crc.i(dmt.bP, 1, 1, 16, 5),
                     new crc.i(dmt.bQ, 1, 1, 16, 5),
                     new crc.i(dmt.bR, 1, 1, 16, 5),
                     new crc.i(dmt.bS, 1, 1, 16, 5),
                     new crc.i(dmt.bT, 1, 1, 16, 5),
                     new crc.i(dmt.bU, 1, 1, 16, 5),
                     new crc.i(dmt.bV, 1, 1, 16, 5),
                     new crc.i(dmt.bW, 1, 1, 16, 5),
                     new crc.i(dmt.bX, 1, 1, 16, 5),
                     new crc.i(dmt.bY, 1, 1, 16, 5),
                     new crc.i(dmt.bZ, 1, 1, 16, 5),
                     new crc.i(dmt.iM, 1, 4, 16, 5),
                     new crc.i(dmt.iN, 1, 4, 16, 5),
                     new crc.i(dmt.iO, 1, 4, 16, 5),
                     new crc.i(dmt.iP, 1, 4, 16, 5),
                     new crc.i(dmt.iQ, 1, 4, 16, 5),
                     new crc.i(dmt.iR, 1, 4, 16, 5),
                     new crc.i(dmt.iS, 1, 4, 16, 5),
                     new crc.i(dmt.iT, 1, 4, 16, 5),
                     new crc.i(dmt.iU, 1, 4, 16, 5),
                     new crc.i(dmt.iV, 1, 4, 16, 5),
                     new crc.i(dmt.iW, 1, 4, 16, 5),
                     new crc.i(dmt.iX, 1, 4, 16, 5),
                     new crc.i(dmt.iY, 1, 4, 16, 5),
                     new crc.i(dmt.iZ, 1, 4, 16, 5),
                     new crc.i(dmt.ja, 1, 4, 16, 5),
                     new crc.i(dmt.jb, 1, 4, 16, 5)
                  },
                  3,
                  new crc.g[]{
                     new crc.b(czr.su, 12, 16, 20),
                     new crc.b(czr.sy, 12, 16, 20),
                     new crc.b(czr.sr, 12, 16, 20),
                     new crc.b(czr.sE, 12, 16, 20),
                     new crc.b(czr.sw, 12, 16, 20),
                     new crc.i(dmt.bg, 3, 1, 12, 10),
                     new crc.i(dmt.bk, 3, 1, 12, 10),
                     new crc.i(dmt.bu, 3, 1, 12, 10),
                     new crc.i(dmt.bv, 3, 1, 12, 10),
                     new crc.i(dmt.br, 3, 1, 12, 10),
                     new crc.i(dmt.bs, 3, 1, 12, 10),
                     new crc.i(dmt.bp, 3, 1, 12, 10),
                     new crc.i(dmt.bn, 3, 1, 12, 10),
                     new crc.i(dmt.bt, 3, 1, 12, 10),
                     new crc.i(dmt.bj, 3, 1, 12, 10),
                     new crc.i(dmt.bo, 3, 1, 12, 10),
                     new crc.i(dmt.bl, 3, 1, 12, 10),
                     new crc.i(dmt.bi, 3, 1, 12, 10),
                     new crc.i(dmt.bh, 3, 1, 12, 10),
                     new crc.i(dmt.bm, 3, 1, 12, 10),
                     new crc.i(dmt.bq, 3, 1, 12, 10)
                  },
                  4,
                  new crc.g[]{
                     new crc.b(czr.sC, 12, 16, 30),
                     new crc.b(czr.sA, 12, 16, 30),
                     new crc.b(czr.sB, 12, 16, 30),
                     new crc.b(czr.sD, 12, 16, 30),
                     new crc.b(czr.ss, 12, 16, 30),
                     new crc.b(czr.sz, 12, 16, 30),
                     new crc.i(czr.wa, 3, 1, 12, 15),
                     new crc.i(czr.wl, 3, 1, 12, 15),
                     new crc.i(czr.wd, 3, 1, 12, 15),
                     new crc.i(czr.wo, 3, 1, 12, 15),
                     new crc.i(czr.wg, 3, 1, 12, 15),
                     new crc.i(czr.wn, 3, 1, 12, 15),
                     new crc.i(czr.wf, 3, 1, 12, 15),
                     new crc.i(czr.wh, 3, 1, 12, 15),
                     new crc.i(czr.wp, 3, 1, 12, 15),
                     new crc.i(czr.wk, 3, 1, 12, 15),
                     new crc.i(czr.wc, 3, 1, 12, 15),
                     new crc.i(czr.wj, 3, 1, 12, 15),
                     new crc.i(czr.wm, 3, 1, 12, 15),
                     new crc.i(czr.we, 3, 1, 12, 15),
                     new crc.i(czr.wb, 3, 1, 12, 15),
                     new crc.i(czr.wi, 3, 1, 12, 15)
                  },
                  5,
                  new crc.g[]{new crc.i(czr.qN, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            crb.i,
            a(
               ImmutableMap.of(
                  1,
                  new crc.g[]{new crc.b(czr.qe, 32, 16, 2), new crc.i(czr.pk, 1, 16, 1), new crc.h(dmt.O, 10, 1, czr.qK, 10, 12, 1, 0.05F)},
                  2,
                  new crc.g[]{new crc.b(czr.qK, 26, 12, 10), new crc.i(czr.pj, 2, 1, 5)},
                  3,
                  new crc.g[]{new crc.b(czr.qg, 14, 16, 20), new crc.i(czr.xg, 3, 1, 10)},
                  4,
                  new crc.g[]{new crc.b(czr.qh, 24, 16, 30), new crc.e(czr.pj, 2, 3, 15)},
                  5,
                  new crc.g[]{new crc.b(czr.mF, 8, 12, 30), new crc.e(czr.xg, 3, 3, 15), new crc.k(czr.pk, 5, czr.wB, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            crb.k,
            a(
               ImmutableMap.builder()
                  .put(1, new crc.g[]{new crc.b(czr.rE, 24, 16, 2), new crc.d(1, axe.i), new crc.i(dmt.cv, 9, 1, 12, 1)})
                  .put(2, new crc.g[]{new crc.b(czr.rF, 4, 12, 10), new crc.d(5, axe.i), new crc.i(czr.xE, 1, 1, 5)})
                  .put(3, new crc.g[]{new crc.b(czr.sn, 5, 12, 20), new crc.d(10, axe.i), new crc.i(czr.cN, 1, 4, 10)})
                  .put(4, new crc.g[]{new crc.b(czr.vi, 2, 12, 30), new crc.d(15, axe.i), new crc.i(czr.se, 5, 1, 15), new crc.i(czr.rK, 4, 1, 15)})
                  .put(5, new crc.g[]{new crc.i(czr.vW, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            crb.e,
            a(
               ImmutableMap.of(
                  1,
                  new crc.g[]{new crc.b(czr.rE, 24, 12, 2), new crc.i(czr.vt, 7, 1, 12, 1, 0.05F)},
                  2,
                  new crc.g[]{
                     new crc.b(czr.gp, 11, 12, 10),
                     crc.m.a(new crc.l(8, axn.h, "filled_map.village_taiga", eyr.F, 12, 5), crd.f, crd.e, crd.c),
                     crc.m.a(new crc.l(8, axn.k, "filled_map.explorer_swamp", eyr.H, 12, 5), crd.g, crd.e, crd.b),
                     crc.m.a(new crc.l(8, axn.i, "filled_map.village_snowy", eyr.E, 12, 5), crd.g, crd.f),
                     crc.m.a(new crc.l(8, axn.e, "filled_map.village_savanna", eyr.D, 12, 5), crd.c, crd.b, crd.a),
                     crc.m.a(new crc.l(8, axn.g, "filled_map.village_plains", eyr.C, 12, 5), crd.g, crd.e, crd.d, crd.a),
                     crc.m.a(new crc.l(8, axn.j, "filled_map.explorer_jungle", eyr.G, 12, 5), crd.f, crd.d, crd.a),
                     crc.m.a(new crc.l(8, axn.f, "filled_map.village_desert", eyr.B, 12, 5), crd.d, crd.b)
                  },
                  3,
                  new crc.g[]{
                     new crc.b(czr.rK, 1, 12, 20),
                     new crc.l(13, axn.d, "filled_map.monument", eyr.j, 12, 10),
                     new crc.l(12, axn.m, "filled_map.trial_chambers", eyr.I, 12, 10)
                  },
                  4,
                  new crc.g[]{
                     new crc.i(czr.vm, 7, 1, 12, 15, 0.05F),
                     crc.m.a(new crc.i(czr.wl, 2, 1, 12, 15, 0.05F), crd.e, crd.g),
                     crc.m.a(new crc.i(czr.wa, 2, 1, 12, 15, 0.05F), crd.e, crd.c),
                     crc.m.a(new crc.i(czr.wo, 2, 1, 12, 15, 0.05F), crd.e, crd.d),
                     crc.m.a(new crc.i(czr.wn, 2, 1, 12, 15, 0.05F), crd.a, crd.d, crd.b),
                     crc.m.a(new crc.i(czr.wf, 2, 1, 12, 15, 0.05F), crd.a, crd.g),
                     crc.m.a(new crc.i(czr.wk, 2, 1, 12, 15, 0.05F), crd.g, crd.f),
                     crc.m.a(new crc.i(czr.wj, 2, 1, 12, 15, 0.05F), crd.a, crd.e),
                     crc.m.a(new crc.i(czr.we, 2, 1, 12, 15, 0.05F), crd.c, crd.b),
                     crc.m.a(new crc.i(czr.wb, 2, 1, 12, 15, 0.05F), crd.d, crd.a),
                     crc.m.a(new crc.i(czr.wm, 2, 1, 12, 15, 0.05F), crd.c, crd.b),
                     crc.m.a(new crc.i(czr.wc, 2, 1, 12, 15, 0.05F), crd.d),
                     crc.m.a(new crc.i(czr.wd, 2, 1, 12, 15, 0.05F), crd.e, crd.f),
                     crc.m.a(new crc.i(czr.wg, 2, 1, 12, 15, 0.05F), crd.g, crd.c),
                     crc.m.a(new crc.i(czr.wh, 2, 1, 12, 15, 0.05F), crd.a),
                     crc.m.a(new crc.i(czr.wp, 2, 1, 12, 15, 0.05F), crd.f)
                  },
                  5,
                  new crc.g[]{new crc.i(czr.xn, 8, 1, 12, 30, 0.05F), new crc.l(14, axn.c, "filled_map.mansion", eyr.i, 12, 30)}
               )
            )
         );
         $$0.put(
            crb.f,
            a(
               ImmutableMap.of(
                  1,
                  new crc.g[]{new crc.b(czr.tm, 32, 16, 2), new crc.i(czr.ml, 1, 2, 1)},
                  2,
                  new crc.g[]{new crc.b(czr.px, 3, 12, 10), new crc.i(czr.pp, 1, 1, 5)},
                  3,
                  new crc.g[]{new crc.b(czr.vO, 2, 12, 20), new crc.i(dmt.et, 4, 1, 12, 10)},
                  4,
                  new crc.g[]{new crc.b(czr.pd, 4, 12, 30), new crc.b(czr.ts, 9, 12, 30), new crc.i(czr.tn, 5, 1, 15)},
                  5,
                  new crc.g[]{new crc.b(czr.tr, 22, 12, 30), new crc.i(czr.vf, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            crb.c,
            a(
               ImmutableMap.of(
                  1,
                  new crc.g[]{
                     new crc.b(czr.pl, 15, 16, 2),
                     new crc.i(new czn(czr.qw), 7, 1, 12, 1, 0.2F),
                     new crc.i(new czn(czr.qx), 4, 1, 12, 1, 0.2F),
                     new crc.i(new czn(czr.qu), 5, 1, 12, 1, 0.2F),
                     new crc.i(new czn(czr.qv), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new crc.g[]{
                     new crc.b(czr.pt, 4, 12, 10),
                     new crc.i(new czn(czr.xD), 36, 1, 12, 5, 0.2F),
                     new crc.i(new czn(czr.qt), 1, 1, 12, 5, 0.2F),
                     new crc.i(new czn(czr.qs), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new crc.g[]{
                     new crc.b(czr.rq, 1, 12, 20),
                     new crc.b(czr.pn, 1, 12, 20),
                     new crc.i(new czn(czr.qq), 1, 1, 12, 10, 0.2F),
                     new crc.i(new czn(czr.qr), 4, 1, 12, 10, 0.2F),
                     new crc.i(new czn(czr.wD), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new crc.g[]{new crc.e(czr.qA, 14, 3, 15, 0.2F), new crc.e(czr.qB, 8, 3, 15, 0.2F)},
                  5,
                  new crc.g[]{new crc.e(czr.qy, 8, 3, 30, 0.2F), new crc.e(czr.qz, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            crb.p,
            a(
               ImmutableMap.of(
                  1,
                  new crc.g[]{new crc.b(czr.pl, 15, 16, 2), new crc.i(new czn(czr.pS), 3, 1, 12, 1, 0.2F), new crc.e(czr.pP, 2, 3, 1)},
                  2,
                  new crc.g[]{new crc.b(czr.pt, 4, 12, 10), new crc.i(new czn(czr.xD), 36, 1, 12, 5, 0.2F)},
                  3,
                  new crc.g[]{new crc.b(czr.qK, 24, 12, 20)},
                  4,
                  new crc.g[]{new crc.b(czr.pn, 1, 12, 30), new crc.e(czr.pX, 12, 3, 15, 0.2F)},
                  5,
                  new crc.g[]{new crc.e(czr.pU, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            crb.o,
            a(
               ImmutableMap.of(
                  1,
                  new crc.g[]{
                     new crc.b(czr.pl, 15, 16, 2),
                     new crc.i(new czn(czr.pI), 1, 1, 12, 1, 0.2F),
                     new crc.i(new czn(czr.pG), 1, 1, 12, 1, 0.2F),
                     new crc.i(new czn(czr.pH), 1, 1, 12, 1, 0.2F),
                     new crc.i(new czn(czr.pJ), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new crc.g[]{new crc.b(czr.pt, 4, 12, 10), new crc.i(new czn(czr.xD), 36, 1, 12, 5, 0.2F)},
                  3,
                  new crc.g[]{
                     new crc.b(czr.qK, 30, 12, 20),
                     new crc.e(czr.pS, 1, 3, 10, 0.2F),
                     new crc.e(czr.pQ, 2, 3, 10, 0.2F),
                     new crc.e(czr.pR, 3, 3, 10, 0.2F),
                     new crc.i(new czn(czr.pY), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new crc.g[]{new crc.b(czr.pn, 1, 12, 30), new crc.e(czr.pX, 12, 3, 15, 0.2F), new crc.e(czr.pV, 5, 3, 15, 0.2F)},
                  5,
                  new crc.g[]{new crc.e(czr.pW, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            crb.d,
            a(
               ImmutableMap.of(
                  1,
                  new crc.g[]{new crc.b(czr.tk, 14, 16, 2), new crc.b(czr.qL, 7, 16, 2), new crc.b(czr.vL, 4, 16, 2), new crc.i(czr.vN, 1, 1, 1)},
                  2,
                  new crc.g[]{new crc.b(czr.pl, 15, 16, 2), new crc.i(czr.qM, 1, 5, 16, 5), new crc.i(czr.tl, 1, 8, 16, 5)},
                  3,
                  new crc.g[]{new crc.b(czr.vY, 7, 16, 20), new crc.b(czr.ti, 10, 16, 20)},
                  4,
                  new crc.g[]{new crc.b(czr.rD, 10, 12, 30)},
                  5,
                  new crc.g[]{new crc.b(czr.xG, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            crb.j,
            a(
               ImmutableMap.of(
                  1,
                  new crc.g[]{new crc.b(czr.rt, 6, 16, 2), new crc.a(czr.qo, 3), new crc.a(czr.qn, 7)},
                  2,
                  new crc.g[]{new crc.b(czr.qK, 26, 12, 10), new crc.a(czr.qm, 5, 12, 5), new crc.a(czr.qp, 4, 12, 5)},
                  3,
                  new crc.g[]{new crc.b(czr.vP, 9, 12, 20), new crc.a(czr.qn, 7)},
                  4,
                  new crc.g[]{new crc.b(czr.pd, 4, 12, 30), new crc.a(czr.vU, 6, 12, 15)},
                  5,
                  new crc.g[]{new crc.i(new czn(czr.ou), 6, 1, 12, 30, 0.2F), new crc.a(czr.qm, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            crb.l,
            a(
               ImmutableMap.of(
                  1,
                  new crc.g[]{new crc.b(czr.rC, 10, 16, 2), new crc.i(czr.rB, 1, 10, 16, 1)},
                  2,
                  new crc.g[]{new crc.b(dmt.b, 20, 16, 10), new crc.i(dmt.fc, 1, 4, 16, 5)},
                  3,
                  new crc.g[]{
                     new crc.b(dmt.c, 16, 16, 20),
                     new crc.b(dmt.g, 16, 16, 20),
                     new crc.b(dmt.e, 16, 16, 20),
                     new crc.i(dmt.tc, 1, 4, 16, 10),
                     new crc.i(dmt.h, 1, 4, 16, 10),
                     new crc.i(dmt.f, 1, 4, 16, 10),
                     new crc.i(dmt.d, 1, 4, 16, 10)
                  },
                  4,
                  new crc.g[]{
                     new crc.b(czr.pq, 12, 12, 30),
                     new crc.i(dmt.hL, 1, 1, 12, 15),
                     new crc.i(dmt.hK, 1, 1, 12, 15),
                     new crc.i(dmt.hV, 1, 1, 12, 15),
                     new crc.i(dmt.hN, 1, 1, 12, 15),
                     new crc.i(dmt.hR, 1, 1, 12, 15),
                     new crc.i(dmt.hS, 1, 1, 12, 15),
                     new crc.i(dmt.hZ, 1, 1, 12, 15),
                     new crc.i(dmt.hY, 1, 1, 12, 15),
                     new crc.i(dmt.hQ, 1, 1, 12, 15),
                     new crc.i(dmt.hM, 1, 1, 12, 15),
                     new crc.i(dmt.hP, 1, 1, 12, 15),
                     new crc.i(dmt.hX, 1, 1, 12, 15),
                     new crc.i(dmt.hT, 1, 1, 12, 15),
                     new crc.i(dmt.hU, 1, 1, 12, 15),
                     new crc.i(dmt.hO, 1, 1, 12, 15),
                     new crc.i(dmt.hW, 1, 1, 12, 15),
                     new crc.i(dmt.lN, 1, 1, 12, 15),
                     new crc.i(dmt.lM, 1, 1, 12, 15),
                     new crc.i(dmt.lX, 1, 1, 12, 15),
                     new crc.i(dmt.lP, 1, 1, 12, 15),
                     new crc.i(dmt.lT, 1, 1, 12, 15),
                     new crc.i(dmt.lU, 1, 1, 12, 15),
                     new crc.i(dmt.mb, 1, 1, 12, 15),
                     new crc.i(dmt.ma, 1, 1, 12, 15),
                     new crc.i(dmt.lS, 1, 1, 12, 15),
                     new crc.i(dmt.lO, 1, 1, 12, 15),
                     new crc.i(dmt.lR, 1, 1, 12, 15),
                     new crc.i(dmt.lZ, 1, 1, 12, 15),
                     new crc.i(dmt.lV, 1, 1, 12, 15),
                     new crc.i(dmt.lW, 1, 1, 12, 15),
                     new crc.i(dmt.lQ, 1, 1, 12, 15),
                     new crc.i(dmt.lY, 1, 1, 12, 15)
                  },
                  5,
                  new crc.g[]{new crc.i(dmt.hG, 1, 1, 12, 30), new crc.i(dmt.hE, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final List<Pair<crc.g[], Integer>> b = ImmutableList.builder()
      .add(
         Pair.of(
            new crc.g[]{
               new crc.b(a(dbk.a), 2, 1, 1),
               new crc.b(czr.rp, 1, 2, 1, 2),
               new crc.b(czr.ru, 1, 2, 1, 2),
               new crc.b(czr.tv, 1, 2, 1, 3),
               new crc.b(czr.vr, 4, 2, 1),
               new crc.b(czr.ih, 1, 2, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new crc.g[]{
               new crc.i(czr.iz, 1, 1, 6, 1),
               new crc.i(czr.lz, 6, 1, 6, 1),
               new crc.i(czr.qi, 1, 4, 2, 1),
               new crc.i(czr.E, 3, 3, 6, 1),
               new crc.i(dmt.ab, 1, 8, 4, 1),
               new crc.i(dmt.Z, 1, 8, 4, 1),
               new crc.i(dmt.ad, 1, 8, 4, 1),
               new crc.i(dmt.aa, 1, 8, 4, 1),
               new crc.i(dmt.X, 1, 8, 4, 1),
               new crc.i(dmt.Y, 1, 8, 4, 1),
               new crc.i(dmt.ac, 1, 8, 4, 1),
               new crc.i(dmt.af, 1, 8, 4, 1),
               new crc.i(dmt.ae, 1, 8, 4, 1),
               new crc.e(czr.pR, 1, 1, 1, 0.2F),
               new crc.i(b(dbk.h), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new crc.g[]{
               new crc.i(czr.ry, 3, 1, 4, 1),
               new crc.i(czr.rv, 3, 1, 4, 1),
               new crc.i(czr.de, 2, 1, 5, 1),
               new crc.i(czr.rG, 4, 1, 5, 1),
               new crc.i(czr.fQ, 2, 1, 5, 1),
               new crc.i(czr.xe, 5, 1, 5, 1),
               new crc.i(czr.cV, 1, 1, 12, 1),
               new crc.i(czr.dW, 1, 1, 8, 1),
               new crc.i(czr.fG, 1, 1, 4, 1),
               new crc.i(czr.dX, 3, 1, 12, 1),
               new crc.i(czr.fq, 3, 1, 8, 1),
               new crc.i(czr.dv, 1, 1, 12, 1),
               new crc.i(czr.dy, 1, 1, 12, 1),
               new crc.i(czr.dz, 1, 1, 8, 1),
               new crc.i(czr.dA, 1, 1, 12, 1),
               new crc.i(czr.dB, 1, 1, 12, 1),
               new crc.i(czr.dC, 1, 1, 12, 1),
               new crc.i(czr.dD, 1, 1, 12, 1),
               new crc.i(czr.dE, 1, 1, 12, 1),
               new crc.i(czr.dF, 1, 1, 12, 1),
               new crc.i(czr.dG, 1, 1, 12, 1),
               new crc.i(czr.dH, 1, 1, 12, 1),
               new crc.i(czr.dI, 1, 1, 7, 1),
               new crc.i(czr.dw, 1, 1, 7, 1),
               new crc.i(czr.qj, 1, 1, 12, 1),
               new crc.i(czr.ww, 1, 1, 12, 1),
               new crc.i(czr.tg, 1, 1, 12, 1),
               new crc.i(czr.th, 1, 1, 12, 1),
               new crc.i(czr.ab, 5, 1, 8, 1),
               new crc.i(czr.Z, 5, 1, 8, 1),
               new crc.i(czr.ad, 5, 1, 8, 1),
               new crc.i(czr.aa, 5, 1, 8, 1),
               new crc.i(czr.X, 5, 1, 8, 1),
               new crc.i(czr.Y, 5, 1, 8, 1),
               new crc.i(czr.ac, 5, 1, 8, 1),
               new crc.i(czr.ae, 5, 1, 8, 1),
               new crc.i(czr.af, 5, 1, 8, 1),
               new crc.i(czr.sE, 1, 3, 12, 1),
               new crc.i(czr.sq, 1, 3, 12, 1),
               new crc.i(czr.sB, 1, 3, 12, 1),
               new crc.i(czr.sw, 1, 3, 12, 1),
               new crc.i(czr.sF, 1, 3, 12, 1),
               new crc.i(czr.sD, 1, 3, 12, 1),
               new crc.i(czr.sy, 1, 3, 12, 1),
               new crc.i(czr.ss, 1, 3, 12, 1),
               new crc.i(czr.su, 1, 3, 12, 1),
               new crc.i(czr.sx, 1, 3, 12, 1),
               new crc.i(czr.sA, 1, 3, 12, 1),
               new crc.i(czr.st, 1, 3, 12, 1),
               new crc.i(czr.sv, 1, 3, 12, 1),
               new crc.i(czr.sr, 1, 3, 12, 1),
               new crc.i(czr.sC, 1, 3, 12, 1),
               new crc.i(czr.sz, 1, 3, 12, 1),
               new crc.i(czr.lb, 3, 1, 8, 1),
               new crc.i(czr.lc, 3, 1, 8, 1),
               new crc.i(czr.ld, 3, 1, 8, 1),
               new crc.i(czr.le, 3, 1, 8, 1),
               new crc.i(czr.la, 3, 1, 8, 1),
               new crc.i(czr.gr, 1, 3, 4, 1),
               new crc.i(czr.ee, 1, 3, 4, 1),
               new crc.i(czr.dN, 1, 3, 4, 1),
               new crc.i(czr.dO, 1, 3, 4, 1),
               new crc.i(czr.gE, 1, 5, 2, 1),
               new crc.i(czr.ei, 1, 2, 5, 1),
               new crc.i(czr.ah, 1, 8, 8, 1),
               new crc.i(czr.ak, 1, 4, 6, 1),
               new crc.i(czr.yA, 1, 2, 5, 1),
               new crc.i(czr.F, 1, 2, 5, 1),
               new crc.i(czr.ec, 1, 2, 5, 1),
               new crc.i(czr.ef, 1, 2, 5, 1),
               new crc.i(czr.dZ, 1, 1, 12, 1),
               new crc.i(czr.dc, 1, 1, 12, 1),
               new crc.i(czr.da, 3, 1, 12, 1)
            },
            5
         )
      )
      .build();
   public static final Map<alf<crb>, Int2ObjectMap<crc.g[]>> c = Map.of(
      crb.k,
      a(
         ImmutableMap.builder()
            .put(1, new crc.g[]{new crc.b(czr.rE, 24, 16, 2), a(1), new crc.i(dmt.cv, 9, 1, 12, 1)})
            .put(2, new crc.g[]{new crc.b(czr.rF, 4, 12, 10), a(5), new crc.i(czr.xE, 1, 1, 5)})
            .put(3, new crc.g[]{new crc.b(czr.sn, 5, 12, 20), a(10), new crc.i(czr.cN, 1, 4, 10)})
            .put(4, new crc.g[]{new crc.b(czr.vi, 2, 12, 30), new crc.i(czr.se, 5, 1, 15), new crc.i(czr.rK, 4, 1, 15)})
            .put(5, new crc.g[]{a(), new crc.i(czr.vW, 20, 1, 30)})
            .build()
      ),
      crb.c,
      a(
         ImmutableMap.builder()
            .put(1, new crc.g[]{new crc.b(czr.pl, 15, 12, 2), new crc.b(czr.pt, 5, 12, 2)})
            .put(
               2,
               new crc.g[]{
                  crc.m.a(new crc.i(czr.qx, 4, 1, 12, 5, 0.05F), crd.a, crd.c, crd.d, crd.e, crd.g),
                  crc.m.a(new crc.i(czr.qt, 4, 1, 12, 5, 0.05F), crd.b, crd.f),
                  crc.m.a(new crc.i(czr.qu, 5, 1, 12, 5, 0.05F), crd.a, crd.c, crd.d, crd.e, crd.g),
                  crc.m.a(new crc.i(czr.qq, 5, 1, 12, 5, 0.05F), crd.b, crd.f),
                  crc.m.a(new crc.i(czr.qw, 7, 1, 12, 5, 0.05F), crd.a, crd.c, crd.d, crd.e, crd.g),
                  crc.m.a(new crc.i(czr.qs, 7, 1, 12, 5, 0.05F), crd.b, crd.f),
                  crc.m.a(new crc.i(czr.qv, 9, 1, 12, 5, 0.05F), crd.a, crd.c, crd.d, crd.e, crd.g),
                  crc.m.a(new crc.i(czr.qr, 9, 1, 12, 5, 0.05F), crd.b, crd.f)
               }
            )
            .put(3, new crc.g[]{new crc.b(czr.rq, 1, 12, 20), new crc.i(czr.wD, 5, 1, 12, 10, 0.05F), new crc.i(czr.xD, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new crc.g[]{
                  crc.m.a(new crc.i(czr.qx, 8, 1, 3, 15, 0.05F, dhn.a), crd.a),
                  crc.m.a(new crc.i(czr.qu, 9, 1, 3, 15, 0.05F, dhn.d), crd.a),
                  crc.m.a(new crc.i(czr.qw, 11, 1, 3, 15, 0.05F, dhn.b), crd.a),
                  crc.m.a(new crc.i(czr.qv, 13, 1, 3, 15, 0.05F, dhn.c), crd.a),
                  crc.m.a(new crc.i(czr.qx, 8, 1, 3, 15, 0.05F, dhn.g), crd.c),
                  crc.m.a(new crc.i(czr.qu, 9, 1, 3, 15, 0.05F, dhn.j), crd.c),
                  crc.m.a(new crc.i(czr.qw, 11, 1, 3, 15, 0.05F, dhn.h), crd.c),
                  crc.m.a(new crc.i(czr.qv, 13, 1, 3, 15, 0.05F, dhn.i), crd.c),
                  crc.m.a(new crc.i(czr.qx, 2, 1, 3, 15, 0.05F, dhn.m), crd.d),
                  crc.m.a(new crc.i(czr.qu, 3, 1, 3, 15, 0.05F, dhn.p), crd.d),
                  crc.m.a(new crc.i(czr.qw, 5, 1, 3, 15, 0.05F, dhn.n), crd.d),
                  crc.m.a(new crc.i(czr.qv, 7, 1, 3, 15, 0.05F, dhn.o), crd.d),
                  crc.m.a(new crc.i(czr.qx, 8, 1, 3, 15, 0.05F, dhn.s), crd.e),
                  crc.m.a(new crc.i(czr.qu, 9, 1, 3, 15, 0.05F, dhn.t), crd.e),
                  crc.m.a(new crc.i(czr.qt, 8, 1, 3, 15, 0.05F, dhn.w), crd.b),
                  crc.m.a(new crc.i(czr.qq, 9, 1, 3, 15, 0.05F, dhn.z), crd.b),
                  crc.m.a(new crc.i(czr.qs, 11, 1, 3, 15, 0.05F, dhn.x), crd.b),
                  crc.m.a(new crc.i(czr.qr, 13, 1, 3, 15, 0.05F, dhn.y), crd.b),
                  crc.m.a(new crc.i(czr.qt, 8, 1, 3, 15, 0.05F, dhn.C), crd.f),
                  crc.m.a(new crc.i(czr.qq, 9, 1, 3, 15, 0.05F, dhn.F), crd.f),
                  crc.m.a(new crc.i(czr.qs, 11, 1, 3, 15, 0.05F, dhn.D), crd.f),
                  crc.m.a(new crc.i(czr.qr, 13, 1, 3, 15, 0.05F, dhn.E), crd.f),
                  crc.m.a(new crc.h(czr.qB, 1, 4, czr.qA, 1, 3, 15, 0.05F), crd.g),
                  crc.m.a(new crc.h(czr.qA, 1, 4, czr.qz, 1, 3, 15, 0.05F), crd.g),
                  crc.m.a(new crc.h(czr.qy, 1, 4, czr.qB, 1, 3, 15, 0.05F), crd.g),
                  crc.m.a(new crc.h(czr.qz, 1, 2, czr.qy, 1, 3, 15, 0.05F), crd.g)
               }
            )
            .put(
               5,
               new crc.g[]{
                  crc.m.a(new crc.h(czr.pn, 4, 16, czr.qz, 1, 3, 30, 0.05F, dhn.f), crd.a),
                  crc.m.a(new crc.h(czr.pn, 3, 16, czr.qA, 1, 3, 30, 0.05F, dhn.e), crd.a),
                  crc.m.a(new crc.h(czr.pn, 3, 16, czr.qA, 1, 3, 30, 0.05F, dhn.l), crd.c),
                  crc.m.a(new crc.h(czr.pn, 2, 12, czr.qB, 1, 3, 30, 0.05F, dhn.k), crd.c),
                  crc.m.a(new crc.h(czr.pn, 2, 6, czr.qy, 1, 3, 30, 0.05F, dhn.r), crd.d),
                  crc.m.a(new crc.h(czr.pn, 3, 8, czr.qz, 1, 3, 30, 0.05F, dhn.q), crd.d),
                  crc.m.a(new crc.h(czr.pn, 2, 12, czr.qB, 1, 3, 30, 0.05F, dhn.u), crd.e),
                  crc.m.a(new crc.h(czr.pn, 3, 12, czr.qy, 1, 3, 30, 0.05F, dhn.v), crd.e),
                  crc.m.a(new crc.i(czr.qq, 9, 1, 3, 30, 0.05F, dhn.B), crd.b),
                  crc.m.a(new crc.i(czr.qt, 8, 1, 3, 30, 0.05F, dhn.A), crd.b),
                  crc.m.a(new crc.i(czr.qq, 9, 1, 3, 30, 0.05F, dhn.H), crd.f),
                  crc.m.a(new crc.i(czr.qt, 8, 1, 3, 30, 0.05F, dhn.G), crd.f),
                  crc.m.a(new crc.h(czr.pn, 4, 18, czr.qz, 1, 3, 30, 0.05F, dhn.J), crd.g),
                  crc.m.a(new crc.h(czr.pn, 3, 18, czr.qA, 1, 3, 30, 0.05F, dhn.I), crd.g),
                  crc.m.a(new crc.b(czr.aP, 1, 12, 30, 42), crd.g),
                  crc.m.a(new crc.b(czr.aM, 1, 12, 30, 4), crd.a, crd.b, crd.c, crd.d, crd.e, crd.f)
               }
            )
            .build()
      )
   );

   private static crc.g a(int $$0) {
      return new crc.m(
         ImmutableMap.builder()
            .put(crd.a, new crc.d($$0, axe.w))
            .put(crd.b, new crc.d($$0, axe.x))
            .put(crd.c, new crc.d($$0, axe.y))
            .put(crd.d, new crc.d($$0, axe.z))
            .put(crd.e, new crc.d($$0, axe.A))
            .put(crd.f, new crc.d($$0, axe.B))
            .put(crd.g, new crc.d($$0, axe.C))
            .build()
      );
   }

   private static crc.g a() {
      return new crc.m(
         ImmutableMap.builder()
            .put(crd.a, new crc.d(30, 3, 3, axe.D))
            .put(crd.b, new crc.d(30, 2, 2, axe.E))
            .put(crd.c, new crc.d(30, 3, 3, axe.F))
            .put(crd.d, new crc.d(30, 3, 3, axe.G))
            .put(crd.e, new crc.d(30, axe.H))
            .put(crd.f, new crc.d(30, axe.I))
            .put(crd.g, new crc.d(30, 2, 2, axe.J))
            .build()
      );
   }

   private static Int2ObjectMap<crc.g[]> a(ImmutableMap<Integer, crc.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static dig a(jf<dbh> $$0) {
      return new dig(czr.tt).a($$1 -> $$1.a(kk.R, new dbj($$0)));
   }

   private static czn b(jf<dbh> $$0) {
      return dbj.a(czr.tt, $$0);
   }

   static class a implements crc.g {
      private final czj a;
      private final int b;
      private final int c;
      private final int d;

      public a(czj $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(czj $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public dii a(bwi $$0, azv $$1) {
         dig $$2 = new dig(czr.po, this.b);
         czn $$3 = new czn(this.a);
         if ($$3.a(axk.bP)) {
            List<cym> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = dca.a($$3, $$4);
         }

         return new dii($$2, $$3, this.c, this.d, 0.2F);
      }

      private static cym a(azv $$0) {
         return cym.a(cyl.a($$0.a(16)));
      }
   }

   static class b implements crc.g {
      private final dig a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(djl $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(djl $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new dig($$0.h(), $$1), $$2, $$3, $$4);
      }

      public b(dig $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public dii a(bwi $$0, azv $$1) {
         return new dii(this.a, new czn(czr.po, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements crc.g {
      private final Map<alf<crd>, czj> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<alf<crd>, czj> $$3) {
         mg.w.j().stream().filter($$1x -> !$$3.containsKey($$1x)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + $$0x);
         });
         this.a = $$3;
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Nullable
      @Override
      public dii a(bwi $$0, azv $$1) {
         if ($$0 instanceof cra $$2) {
            alf<crd> $$3 = $$2.gB().a().e().orElse(null);
            if ($$3 == null) {
               return null;
            } else {
               dig $$4 = new dig(this.a.get($$3), this.b);
               return new dii($$4, new czn(czr.po), this.c, this.d, 0.05F);
            }
         } else {
            return null;
         }
      }
   }

   static class d implements crc.g {
      private final int a;
      private final axr<dga> b;
      private final int c;
      private final int d;

      public d(int $$0, axr<dga> $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, axr<dga> $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = $$3;
      }

      @Override
      public dii a(bwi $$0, azv $$1) {
         Optional<jf<dga>> $$2 = $$0.dU().F_().f(mh.aR).a(this.b, $$1);
         int $$9;
         czn $$8;
         if (!$$2.isEmpty()) {
            jf<dga> $$3 = $$2.get();
            dga $$4 = $$3.a();
            int $$5 = Math.max($$4.d(), this.c);
            int $$6 = Math.min($$4.e(), this.d);
            int $$7 = azm.a($$1, $$5, $$6);
            $$8 = dgc.a(new dgd($$3, $$7));
            $$9 = 2 + $$1.a(5 + $$7 * 10) + 3 * $$7;
            if ($$3.a(axe.j)) {
               $$9 *= 2;
            }

            if ($$9 > 64) {
               $$9 = 64;
            }
         } else {
            $$9 = 1;
            $$8 = new czn(czr.rF);
         }

         return new dii(new dig(czr.po, $$9), Optional.of(new dig(czr.rF)), $$8, 12, this.a, 0.2F);
      }
   }

   static class e implements crc.g {
      private final czn a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(czj $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(czj $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new czn($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public dii a(bwi $$0, azv $$1) {
         int $$2 = 5 + $$1.a(15);
         jt $$3 = $$0.dU().F_();
         Optional<jj.c<dga>> $$4 = $$3.f(mh.aR).a(axe.m);
         czn $$5 = dgc.a($$1, new czn(this.a.h()), $$2, $$3, $$4);
         int $$6 = Math.min(this.b + $$2, 64);
         dig $$7 = new dig(czr.po, $$6);
         return new dii($$7, $$5, this.c, this.d, this.e);
      }
   }

   static class f implements crc.g {
      private f() {
      }

      @Override
      public dii a(bwi $$0, azv $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      dii a(bwi var1, azv var2);
   }

   static class h implements crc.g {
      private final dig a;
      private final int b;
      private final czn c;
      private final int d;
      private final int e;
      private final float f;
      private final Optional<alf<dhi>> g;

      public h(djl $$0, int $$1, int $$2, czj $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new czn($$3), $$4, $$5, $$6, $$7);
      }

      private h(djl $$0, int $$1, int $$2, czn $$3, int $$4, int $$5, int $$6, float $$7) {
         this(new dig($$0, $$1), $$2, $$3.c($$4), $$5, $$6, $$7, Optional.empty());
      }

      h(djl $$0, int $$1, int $$2, djl $$3, int $$4, int $$5, int $$6, float $$7, alf<dhi> $$8) {
         this(new dig($$0, $$1), $$2, new czn($$3, $$4), $$5, $$6, $$7, Optional.of($$8));
      }

      public h(dig $$0, int $$1, czn $$2, int $$3, int $$4, float $$5, Optional<alf<dhi>> $$6) {
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
      public dii a(bwi $$0, azv $$1) {
         czn $$2 = this.c.v();
         djm $$3 = $$0.dU();
         this.g.ifPresent($$4 -> dgc.a($$2, $$3.F_(), (alf<dhi>)$$4, $$3.d_($$0.du()), $$1));
         return new dii(new dig(czr.po, this.b), Optional.of(this.a), $$2, 0, this.d, this.e, this.f);
      }
   }

   static class i implements crc.g {
      private final czn a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;
      private final Optional<alf<dhi>> f;

      public i(dmr $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new czn($$0), $$1, $$2, $$3, $$4);
      }

      public i(czj $$0, int $$1, int $$2, int $$3) {
         this(new czn($$0), $$1, $$2, 12, $$3);
      }

      public i(czj $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new czn($$0), $$1, $$2, $$3, $$4);
      }

      public i(czn $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(czj $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new czn($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(czj $$0, int $$1, int $$2, int $$3, int $$4, float $$5, alf<dhi> $$6) {
         this(new czn($$0), $$1, $$2, $$3, $$4, $$5, Optional.of($$6));
      }

      public i(czn $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this($$0, $$1, $$2, $$3, $$4, $$5, Optional.empty());
      }

      public i(czn $$0, int $$1, int $$2, int $$3, int $$4, float $$5, Optional<alf<dhi>> $$6) {
         this.a = $$0;
         this.b = $$1;
         this.a.e($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
         this.f = $$6;
      }

      @Override
      public dii a(bwi $$0, azv $$1) {
         czn $$2 = this.a.v();
         djm $$3 = $$0.dU();
         this.f.ifPresent($$4 -> dgc.a($$2, $$3.F_(), (alf<dhi>)$$4, $$3.d_($$0.du()), $$1));
         return new dii(new dig(czr.po, this.b), $$2, this.c, this.d, this.e);
      }
   }

   static class j implements crc.g {
      private final dcp a;
      private final int b;
      private final float c;

      public j(jf<bvk> $$0, int $$1, int $$2) {
         this(new dcp(List.of(new dcp.a($$0, $$1))), $$2, 0.05F);
      }

      public j(dcp $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public dii a(bwi $$0, azv $$1) {
         czn $$2 = new czn(czr.xh, 1);
         $$2.b(kk.T, this.a);
         return new dii(new dig(czr.po), $$2, 12, this.b, this.c);
      }
   }

   static class k implements crc.g {
      private final czn a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final czj f;
      private final int g;
      private final float h;

      public k(czj $$0, int $$1, czj $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new czn($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public dii a(bwi $$0, azv $$1) {
         dig $$2 = new dig(czr.po, this.c);
         List<jf<dbh>> $$3 = mg.h.c().filter($$1x -> !((dbh)$$1x.a()).a().isEmpty() && $$0.dU().L().a($$1x)).collect(Collectors.toList());
         jf<dbh> $$4 = ag.a($$3, $$1);
         czn $$5 = new czn(this.a.h(), this.b);
         $$5.b(kk.R, new dbj($$4));
         return new dii($$2, Optional.of(new dig(this.f, this.g)), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements crc.g {
      private final int a;
      private final axr<ern> b;
      private final String c;
      private final jf<eyq> d;
      private final int e;
      private final int f;

      public l(int $$0, axr<ern> $$1, String $$2, jf<eyq> $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public dii a(bwi $$0, azv $$1) {
         if ($$0.dU() instanceof arq $$2) {
            iv $$4 = $$2.a(this.b, $$0.du(), 100, true);
            if ($$4 != null) {
               czn $$5 = daa.a($$2, $$4.u(), $$4.w(), (byte)2, true, true);
               daa.a($$2, $$5);
               eyv.a($$5, $$4, "+", this.d);
               $$5.b(kk.h, wy.c(this.c));
               return new dii(new dig(czr.po, this.a), Optional.of(new dig(czr.rK)), $$5, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         } else {
            return null;
         }
      }
   }

   static record m(Map<alf<crd>, crc.g> a) implements crc.g {
      @SafeVarargs
      public static crc.m a(crc.g $$0, alf<crd>... $$1) {
         return new crc.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public dii a(bwi $$0, azv $$1) {
         if ($$0 instanceof cra $$2) {
            alf<crd> $$3 = $$2.gB().a().e().orElse(null);
            if ($$3 == null) {
               return null;
            } else {
               crc.g $$4 = this.a.get($$3);
               return $$4 == null ? null : $$4.a($$0, $$1);
            }
         } else {
            return null;
         }
      }
   }
}
