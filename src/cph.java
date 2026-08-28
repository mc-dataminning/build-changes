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

public class cph {
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
   public static final Map<cpg, Int2ObjectMap<cph.g[]>> a = af.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            cpg.g,
            a(
               ImmutableMap.of(
                  1,
                  new cph.g[]{
                     new cph.b(cxl.qd, 20, 16, 2),
                     new cph.b(cxl.vh, 26, 16, 2),
                     new cph.b(cxl.vg, 22, 16, 2),
                     new cph.b(cxl.wm, 15, 16, 2),
                     new cph.i(cxl.qe, 1, 6, 16, 1)
                  },
                  2,
                  new cph.g[]{new cph.b(dkg.fn, 6, 12, 10), new cph.i(cxl.vu, 1, 4, 5), new cph.i(cxl.pb, 1, 4, 16, 5)},
                  3,
                  new cph.g[]{new cph.i(cxl.sR, 3, 18, 10), new cph.b(dkg.fo, 4, 12, 20)},
                  4,
                  new cph.g[]{
                     new cph.i(dkg.et, 1, 1, 12, 15),
                     new cph.j(bug.p, 100, 15),
                     new cph.j(bug.h, 160, 15),
                     new cph.j(bug.r, 140, 15),
                     new cph.j(bug.o, 120, 15),
                     new cph.j(bug.s, 280, 15),
                     new cph.j(bug.w, 7, 15)
                  },
                  5,
                  new cph.g[]{new cph.i(cxl.vl, 3, 3, 30), new cph.i(cxl.ts, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            cpg.h,
            a(
               ImmutableMap.of(
                  1,
                  new cph.g[]{
                     new cph.b(cxl.pZ, 20, 16, 2),
                     new cph.b(cxl.pe, 10, 16, 2),
                     new cph.h(cxl.rY, 6, 1, cxl.sc, 6, 16, 1, 0.05F),
                     new cph.i(cxl.rq, 3, 1, 16, 1)
                  },
                  2,
                  new cph.g[]{new cph.b(cxl.rY, 15, 16, 10), new cph.h(cxl.rZ, 6, 1, cxl.sd, 6, 16, 5, 0.05F), new cph.i(cxl.xz, 2, 1, 5)},
                  3,
                  new cph.g[]{new cph.b(cxl.rZ, 13, 16, 20), new cph.e(cxl.rU, 3, 3, 10, 0.2F)},
                  4,
                  new cph.g[]{new cph.b(cxl.sa, 6, 12, 30)},
                  5,
                  new cph.g[]{
                     new cph.b(cxl.sb, 4, 12, 30),
                     new cph.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(cpi.c, cxl.oz)
                           .put(cpi.g, cxl.oB)
                           .put(cpi.e, cxl.oB)
                           .put(cpi.a, cxl.oF)
                           .put(cpi.b, cxl.oF)
                           .put(cpi.d, cxl.oH)
                           .put(cpi.f, cxl.oL)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            cpg.n,
            a(
               ImmutableMap.of(
                  1,
                  new cph.g[]{
                     new cph.b(dkg.bH, 18, 16, 2),
                     new cph.b(dkg.bT, 18, 16, 2),
                     new cph.b(dkg.bW, 18, 16, 2),
                     new cph.b(dkg.bO, 18, 16, 2),
                     new cph.i(cxl.sU, 2, 1, 1)
                  },
                  2,
                  new cph.g[]{
                     new cph.b(cxl.sh, 12, 16, 10),
                     new cph.b(cxl.so, 12, 16, 10),
                     new cph.b(cxl.sw, 12, 16, 10),
                     new cph.b(cxl.sk, 12, 16, 10),
                     new cph.b(cxl.sm, 12, 16, 10),
                     new cph.i(dkg.bH, 1, 1, 16, 5),
                     new cph.i(dkg.bI, 1, 1, 16, 5),
                     new cph.i(dkg.bJ, 1, 1, 16, 5),
                     new cph.i(dkg.bK, 1, 1, 16, 5),
                     new cph.i(dkg.bL, 1, 1, 16, 5),
                     new cph.i(dkg.bM, 1, 1, 16, 5),
                     new cph.i(dkg.bN, 1, 1, 16, 5),
                     new cph.i(dkg.bO, 1, 1, 16, 5),
                     new cph.i(dkg.bP, 1, 1, 16, 5),
                     new cph.i(dkg.bQ, 1, 1, 16, 5),
                     new cph.i(dkg.bR, 1, 1, 16, 5),
                     new cph.i(dkg.bS, 1, 1, 16, 5),
                     new cph.i(dkg.bT, 1, 1, 16, 5),
                     new cph.i(dkg.bU, 1, 1, 16, 5),
                     new cph.i(dkg.bV, 1, 1, 16, 5),
                     new cph.i(dkg.bW, 1, 1, 16, 5),
                     new cph.i(dkg.iI, 1, 4, 16, 5),
                     new cph.i(dkg.iJ, 1, 4, 16, 5),
                     new cph.i(dkg.iK, 1, 4, 16, 5),
                     new cph.i(dkg.iL, 1, 4, 16, 5),
                     new cph.i(dkg.iM, 1, 4, 16, 5),
                     new cph.i(dkg.iN, 1, 4, 16, 5),
                     new cph.i(dkg.iO, 1, 4, 16, 5),
                     new cph.i(dkg.iP, 1, 4, 16, 5),
                     new cph.i(dkg.iQ, 1, 4, 16, 5),
                     new cph.i(dkg.iR, 1, 4, 16, 5),
                     new cph.i(dkg.iS, 1, 4, 16, 5),
                     new cph.i(dkg.iT, 1, 4, 16, 5),
                     new cph.i(dkg.iU, 1, 4, 16, 5),
                     new cph.i(dkg.iV, 1, 4, 16, 5),
                     new cph.i(dkg.iW, 1, 4, 16, 5),
                     new cph.i(dkg.iX, 1, 4, 16, 5)
                  },
                  3,
                  new cph.g[]{
                     new cph.b(cxl.sl, 12, 16, 20),
                     new cph.b(cxl.sp, 12, 16, 20),
                     new cph.b(cxl.si, 12, 16, 20),
                     new cph.b(cxl.sv, 12, 16, 20),
                     new cph.b(cxl.sn, 12, 16, 20),
                     new cph.i(dkg.bg, 3, 1, 12, 10),
                     new cph.i(dkg.bk, 3, 1, 12, 10),
                     new cph.i(dkg.bu, 3, 1, 12, 10),
                     new cph.i(dkg.bv, 3, 1, 12, 10),
                     new cph.i(dkg.br, 3, 1, 12, 10),
                     new cph.i(dkg.bs, 3, 1, 12, 10),
                     new cph.i(dkg.bp, 3, 1, 12, 10),
                     new cph.i(dkg.bn, 3, 1, 12, 10),
                     new cph.i(dkg.bt, 3, 1, 12, 10),
                     new cph.i(dkg.bj, 3, 1, 12, 10),
                     new cph.i(dkg.bo, 3, 1, 12, 10),
                     new cph.i(dkg.bl, 3, 1, 12, 10),
                     new cph.i(dkg.bi, 3, 1, 12, 10),
                     new cph.i(dkg.bh, 3, 1, 12, 10),
                     new cph.i(dkg.bm, 3, 1, 12, 10),
                     new cph.i(dkg.bq, 3, 1, 12, 10)
                  },
                  4,
                  new cph.g[]{
                     new cph.b(cxl.st, 12, 16, 30),
                     new cph.b(cxl.sr, 12, 16, 30),
                     new cph.b(cxl.ss, 12, 16, 30),
                     new cph.b(cxl.su, 12, 16, 30),
                     new cph.b(cxl.sj, 12, 16, 30),
                     new cph.b(cxl.sq, 12, 16, 30),
                     new cph.i(cxl.vR, 3, 1, 12, 15),
                     new cph.i(cxl.wc, 3, 1, 12, 15),
                     new cph.i(cxl.vU, 3, 1, 12, 15),
                     new cph.i(cxl.wf, 3, 1, 12, 15),
                     new cph.i(cxl.vX, 3, 1, 12, 15),
                     new cph.i(cxl.we, 3, 1, 12, 15),
                     new cph.i(cxl.vW, 3, 1, 12, 15),
                     new cph.i(cxl.vY, 3, 1, 12, 15),
                     new cph.i(cxl.wg, 3, 1, 12, 15),
                     new cph.i(cxl.wb, 3, 1, 12, 15),
                     new cph.i(cxl.vT, 3, 1, 12, 15),
                     new cph.i(cxl.wa, 3, 1, 12, 15),
                     new cph.i(cxl.wd, 3, 1, 12, 15),
                     new cph.i(cxl.vV, 3, 1, 12, 15),
                     new cph.i(cxl.vS, 3, 1, 12, 15),
                     new cph.i(cxl.vZ, 3, 1, 12, 15)
                  },
                  5,
                  new cph.g[]{new cph.i(cxl.qG, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            cpg.i,
            a(
               ImmutableMap.of(
                  1,
                  new cph.g[]{new cph.b(cxl.pX, 32, 16, 2), new cph.i(cxl.pd, 1, 16, 1), new cph.h(dkg.O, 10, 1, cxl.qD, 10, 12, 1, 0.05F)},
                  2,
                  new cph.g[]{new cph.b(cxl.qD, 26, 12, 10), new cph.i(cxl.pc, 2, 1, 5)},
                  3,
                  new cph.g[]{new cph.b(cxl.pZ, 14, 16, 20), new cph.i(cxl.wX, 3, 1, 10)},
                  4,
                  new cph.g[]{new cph.b(cxl.qa, 24, 16, 30), new cph.e(cxl.pc, 2, 3, 15)},
                  5,
                  new cph.g[]{new cph.b(cxl.mA, 8, 12, 30), new cph.e(cxl.wX, 3, 3, 15), new cph.k(cxl.pd, 5, cxl.ws, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            cpg.k,
            a(
               ImmutableMap.builder()
                  .put(1, new cph.g[]{new cph.b(cxl.rx, 24, 16, 2), new cph.d(1, aws.i), new cph.i(dkg.cs, 9, 1, 12, 1)})
                  .put(2, new cph.g[]{new cph.b(cxl.ry, 4, 12, 10), new cph.d(5, aws.i), new cph.i(cxl.xv, 1, 1, 5)})
                  .put(3, new cph.g[]{new cph.b(cxl.se, 5, 12, 20), new cph.d(10, aws.i), new cph.i(cxl.cN, 1, 4, 10)})
                  .put(4, new cph.g[]{new cph.b(cxl.uZ, 2, 12, 30), new cph.d(15, aws.i), new cph.i(cxl.rV, 5, 1, 15), new cph.i(cxl.rB, 4, 1, 15)})
                  .put(5, new cph.g[]{new cph.i(cxl.vN, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            cpg.e,
            a(
               ImmutableMap.of(
                  1,
                  new cph.g[]{new cph.b(cxl.rx, 24, 16, 2), new cph.i(cxl.vk, 7, 1, 1)},
                  2,
                  new cph.g[]{new cph.b(cxl.gk, 11, 16, 10), new cph.l(13, axb.d, "filled_map.monument", evm.j, 12, 5)},
                  3,
                  new cph.g[]{
                     new cph.b(cxl.rB, 1, 12, 20),
                     new cph.l(14, axb.c, "filled_map.mansion", evm.i, 12, 10),
                     new cph.l(12, axb.m, "filled_map.trial_chambers", evm.I, 12, 10)
                  },
                  4,
                  new cph.g[]{
                     new cph.i(cxl.vd, 7, 1, 15),
                     new cph.i(cxl.vR, 3, 1, 15),
                     new cph.i(cxl.wc, 3, 1, 15),
                     new cph.i(cxl.vU, 3, 1, 15),
                     new cph.i(cxl.wf, 3, 1, 15),
                     new cph.i(cxl.vX, 3, 1, 15),
                     new cph.i(cxl.we, 3, 1, 15),
                     new cph.i(cxl.vW, 3, 1, 15),
                     new cph.i(cxl.vY, 3, 1, 15),
                     new cph.i(cxl.wg, 3, 1, 15),
                     new cph.i(cxl.wb, 3, 1, 15),
                     new cph.i(cxl.vT, 3, 1, 15),
                     new cph.i(cxl.wa, 3, 1, 15),
                     new cph.i(cxl.wd, 3, 1, 15),
                     new cph.i(cxl.vV, 3, 1, 15),
                     new cph.i(cxl.vS, 3, 1, 15),
                     new cph.i(cxl.vZ, 3, 1, 15)
                  },
                  5,
                  new cph.g[]{new cph.i(cxl.xe, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            cpg.f,
            a(
               ImmutableMap.of(
                  1,
                  new cph.g[]{new cph.b(cxl.td, 32, 16, 2), new cph.i(cxl.mg, 1, 2, 1)},
                  2,
                  new cph.g[]{new cph.b(cxl.pq, 3, 12, 10), new cph.i(cxl.pi, 1, 1, 5)},
                  3,
                  new cph.g[]{new cph.b(cxl.vF, 2, 12, 20), new cph.i(dkg.ep, 4, 1, 12, 10)},
                  4,
                  new cph.g[]{new cph.b(cxl.oW, 4, 12, 30), new cph.b(cxl.tj, 9, 12, 30), new cph.i(cxl.te, 5, 1, 15)},
                  5,
                  new cph.g[]{new cph.b(cxl.ti, 22, 12, 30), new cph.i(cxl.uW, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            cpg.c,
            a(
               ImmutableMap.of(
                  1,
                  new cph.g[]{
                     new cph.b(cxl.pe, 15, 16, 2),
                     new cph.i(new cxh(cxl.qp), 7, 1, 12, 1, 0.2F),
                     new cph.i(new cxh(cxl.qq), 4, 1, 12, 1, 0.2F),
                     new cph.i(new cxh(cxl.qn), 5, 1, 12, 1, 0.2F),
                     new cph.i(new cxh(cxl.qo), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cph.g[]{
                     new cph.b(cxl.pm, 4, 12, 10),
                     new cph.i(new cxh(cxl.xu), 36, 1, 12, 5, 0.2F),
                     new cph.i(new cxh(cxl.qm), 1, 1, 12, 5, 0.2F),
                     new cph.i(new cxh(cxl.ql), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new cph.g[]{
                     new cph.b(cxl.rj, 1, 12, 20),
                     new cph.b(cxl.pg, 1, 12, 20),
                     new cph.i(new cxh(cxl.qj), 1, 1, 12, 10, 0.2F),
                     new cph.i(new cxh(cxl.qk), 4, 1, 12, 10, 0.2F),
                     new cph.i(new cxh(cxl.wu), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new cph.g[]{new cph.e(cxl.qt, 14, 3, 15, 0.2F), new cph.e(cxl.qu, 8, 3, 15, 0.2F)},
                  5,
                  new cph.g[]{new cph.e(cxl.qr, 8, 3, 30, 0.2F), new cph.e(cxl.qs, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cpg.p,
            a(
               ImmutableMap.of(
                  1,
                  new cph.g[]{new cph.b(cxl.pe, 15, 16, 2), new cph.i(new cxh(cxl.pL), 3, 1, 12, 1, 0.2F), new cph.e(cxl.pI, 2, 3, 1)},
                  2,
                  new cph.g[]{new cph.b(cxl.pm, 4, 12, 10), new cph.i(new cxh(cxl.xu), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cph.g[]{new cph.b(cxl.qD, 24, 12, 20)},
                  4,
                  new cph.g[]{new cph.b(cxl.pg, 1, 12, 30), new cph.e(cxl.pQ, 12, 3, 15, 0.2F)},
                  5,
                  new cph.g[]{new cph.e(cxl.pN, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cpg.o,
            a(
               ImmutableMap.of(
                  1,
                  new cph.g[]{
                     new cph.b(cxl.pe, 15, 16, 2),
                     new cph.i(new cxh(cxl.pB), 1, 1, 12, 1, 0.2F),
                     new cph.i(new cxh(cxl.pz), 1, 1, 12, 1, 0.2F),
                     new cph.i(new cxh(cxl.pA), 1, 1, 12, 1, 0.2F),
                     new cph.i(new cxh(cxl.pC), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cph.g[]{new cph.b(cxl.pm, 4, 12, 10), new cph.i(new cxh(cxl.xu), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cph.g[]{
                     new cph.b(cxl.qD, 30, 12, 20),
                     new cph.e(cxl.pL, 1, 3, 10, 0.2F),
                     new cph.e(cxl.pJ, 2, 3, 10, 0.2F),
                     new cph.e(cxl.pK, 3, 3, 10, 0.2F),
                     new cph.i(new cxh(cxl.pR), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new cph.g[]{new cph.b(cxl.pg, 1, 12, 30), new cph.e(cxl.pQ, 12, 3, 15, 0.2F), new cph.e(cxl.pO, 5, 3, 15, 0.2F)},
                  5,
                  new cph.g[]{new cph.e(cxl.pP, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cpg.d,
            a(
               ImmutableMap.of(
                  1,
                  new cph.g[]{new cph.b(cxl.tb, 14, 16, 2), new cph.b(cxl.qE, 7, 16, 2), new cph.b(cxl.vC, 4, 16, 2), new cph.i(cxl.vE, 1, 1, 1)},
                  2,
                  new cph.g[]{new cph.b(cxl.pe, 15, 16, 2), new cph.i(cxl.qF, 1, 5, 16, 5), new cph.i(cxl.tc, 1, 8, 16, 5)},
                  3,
                  new cph.g[]{new cph.b(cxl.vP, 7, 16, 20), new cph.b(cxl.sZ, 10, 16, 20)},
                  4,
                  new cph.g[]{new cph.b(cxl.rw, 10, 12, 30)},
                  5,
                  new cph.g[]{new cph.b(cxl.xx, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            cpg.j,
            a(
               ImmutableMap.of(
                  1,
                  new cph.g[]{new cph.b(cxl.rm, 6, 16, 2), new cph.a(cxl.qh, 3), new cph.a(cxl.qg, 7)},
                  2,
                  new cph.g[]{new cph.b(cxl.qD, 26, 12, 10), new cph.a(cxl.qf, 5, 12, 5), new cph.a(cxl.qi, 4, 12, 5)},
                  3,
                  new cph.g[]{new cph.b(cxl.vG, 9, 12, 20), new cph.a(cxl.qg, 7)},
                  4,
                  new cph.g[]{new cph.b(cxl.oW, 4, 12, 30), new cph.a(cxl.vL, 6, 12, 15)},
                  5,
                  new cph.g[]{new cph.i(new cxh(cxl.op), 6, 1, 12, 30, 0.2F), new cph.a(cxl.qf, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            cpg.l,
            a(
               ImmutableMap.of(
                  1,
                  new cph.g[]{new cph.b(cxl.rv, 10, 16, 2), new cph.i(cxl.ru, 1, 10, 16, 1)},
                  2,
                  new cph.g[]{new cph.b(dkg.b, 20, 16, 10), new cph.i(dkg.eY, 1, 4, 16, 5)},
                  3,
                  new cph.g[]{
                     new cph.b(dkg.c, 16, 16, 20),
                     new cph.b(dkg.g, 16, 16, 20),
                     new cph.b(dkg.e, 16, 16, 20),
                     new cph.i(dkg.sW, 1, 4, 16, 10),
                     new cph.i(dkg.h, 1, 4, 16, 10),
                     new cph.i(dkg.f, 1, 4, 16, 10),
                     new cph.i(dkg.d, 1, 4, 16, 10)
                  },
                  4,
                  new cph.g[]{
                     new cph.b(cxl.pj, 12, 12, 30),
                     new cph.i(dkg.hH, 1, 1, 12, 15),
                     new cph.i(dkg.hG, 1, 1, 12, 15),
                     new cph.i(dkg.hR, 1, 1, 12, 15),
                     new cph.i(dkg.hJ, 1, 1, 12, 15),
                     new cph.i(dkg.hN, 1, 1, 12, 15),
                     new cph.i(dkg.hO, 1, 1, 12, 15),
                     new cph.i(dkg.hV, 1, 1, 12, 15),
                     new cph.i(dkg.hU, 1, 1, 12, 15),
                     new cph.i(dkg.hM, 1, 1, 12, 15),
                     new cph.i(dkg.hI, 1, 1, 12, 15),
                     new cph.i(dkg.hL, 1, 1, 12, 15),
                     new cph.i(dkg.hT, 1, 1, 12, 15),
                     new cph.i(dkg.hP, 1, 1, 12, 15),
                     new cph.i(dkg.hQ, 1, 1, 12, 15),
                     new cph.i(dkg.hK, 1, 1, 12, 15),
                     new cph.i(dkg.hS, 1, 1, 12, 15),
                     new cph.i(dkg.lJ, 1, 1, 12, 15),
                     new cph.i(dkg.lI, 1, 1, 12, 15),
                     new cph.i(dkg.lT, 1, 1, 12, 15),
                     new cph.i(dkg.lL, 1, 1, 12, 15),
                     new cph.i(dkg.lP, 1, 1, 12, 15),
                     new cph.i(dkg.lQ, 1, 1, 12, 15),
                     new cph.i(dkg.lX, 1, 1, 12, 15),
                     new cph.i(dkg.lW, 1, 1, 12, 15),
                     new cph.i(dkg.lO, 1, 1, 12, 15),
                     new cph.i(dkg.lK, 1, 1, 12, 15),
                     new cph.i(dkg.lN, 1, 1, 12, 15),
                     new cph.i(dkg.lV, 1, 1, 12, 15),
                     new cph.i(dkg.lR, 1, 1, 12, 15),
                     new cph.i(dkg.lS, 1, 1, 12, 15),
                     new cph.i(dkg.lM, 1, 1, 12, 15),
                     new cph.i(dkg.lU, 1, 1, 12, 15)
                  },
                  5,
                  new cph.g[]{new cph.i(dkg.hC, 1, 1, 12, 30), new cph.i(dkg.hA, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<cph.g[]> b = a(
      ImmutableMap.of(
         1,
         new cph.g[]{
            new cph.i(cxl.da, 2, 1, 5, 1),
            new cph.i(cxl.rz, 4, 1, 5, 1),
            new cph.i(cxl.fL, 2, 1, 5, 1),
            new cph.i(cxl.wV, 5, 1, 5, 1),
            new cph.i(cxl.cV, 1, 1, 12, 1),
            new cph.i(cxl.dS, 1, 1, 8, 1),
            new cph.i(cxl.fB, 1, 1, 4, 1),
            new cph.i(cxl.dT, 3, 1, 12, 1),
            new cph.i(cxl.fm, 3, 1, 8, 1),
            new cph.i(cxl.dr, 1, 1, 12, 1),
            new cph.i(cxl.du, 1, 1, 12, 1),
            new cph.i(cxl.dv, 1, 1, 8, 1),
            new cph.i(cxl.dw, 1, 1, 12, 1),
            new cph.i(cxl.dx, 1, 1, 12, 1),
            new cph.i(cxl.dy, 1, 1, 12, 1),
            new cph.i(cxl.dz, 1, 1, 12, 1),
            new cph.i(cxl.dA, 1, 1, 12, 1),
            new cph.i(cxl.dB, 1, 1, 12, 1),
            new cph.i(cxl.dC, 1, 1, 12, 1),
            new cph.i(cxl.dD, 1, 1, 12, 1),
            new cph.i(cxl.dE, 1, 1, 7, 1),
            new cph.i(cxl.ds, 1, 1, 7, 1),
            new cph.i(cxl.qc, 1, 1, 12, 1),
            new cph.i(cxl.wn, 1, 1, 12, 1),
            new cph.i(cxl.sX, 1, 1, 12, 1),
            new cph.i(cxl.sY, 1, 1, 12, 1),
            new cph.i(cxl.ab, 5, 1, 8, 1),
            new cph.i(cxl.Z, 5, 1, 8, 1),
            new cph.i(cxl.ad, 5, 1, 8, 1),
            new cph.i(cxl.aa, 5, 1, 8, 1),
            new cph.i(cxl.X, 5, 1, 8, 1),
            new cph.i(cxl.Y, 5, 1, 8, 1),
            new cph.i(cxl.ac, 5, 1, 8, 1),
            new cph.i(cxl.ae, 5, 1, 8, 1),
            new cph.i(cxl.af, 5, 1, 8, 1),
            new cph.i(cxl.sv, 1, 3, 12, 1),
            new cph.i(cxl.sh, 1, 3, 12, 1),
            new cph.i(cxl.ss, 1, 3, 12, 1),
            new cph.i(cxl.sn, 1, 3, 12, 1),
            new cph.i(cxl.sw, 1, 3, 12, 1),
            new cph.i(cxl.su, 1, 3, 12, 1),
            new cph.i(cxl.sp, 1, 3, 12, 1),
            new cph.i(cxl.sj, 1, 3, 12, 1),
            new cph.i(cxl.sl, 1, 3, 12, 1),
            new cph.i(cxl.so, 1, 3, 12, 1),
            new cph.i(cxl.sr, 1, 3, 12, 1),
            new cph.i(cxl.sk, 1, 3, 12, 1),
            new cph.i(cxl.sm, 1, 3, 12, 1),
            new cph.i(cxl.si, 1, 3, 12, 1),
            new cph.i(cxl.st, 1, 3, 12, 1),
            new cph.i(cxl.sq, 1, 3, 12, 1),
            new cph.i(cxl.kW, 3, 1, 8, 1),
            new cph.i(cxl.kX, 3, 1, 8, 1),
            new cph.i(cxl.kY, 3, 1, 8, 1),
            new cph.i(cxl.kZ, 3, 1, 8, 1),
            new cph.i(cxl.kV, 3, 1, 8, 1),
            new cph.i(cxl.gm, 1, 1, 12, 1),
            new cph.i(cxl.ea, 1, 1, 12, 1),
            new cph.i(cxl.dJ, 1, 1, 12, 1),
            new cph.i(cxl.dK, 1, 1, 12, 1),
            new cph.i(cxl.gz, 1, 2, 5, 1),
            new cph.i(cxl.ee, 1, 2, 5, 1),
            new cph.i(cxl.ah, 1, 8, 8, 1),
            new cph.i(cxl.ak, 1, 4, 6, 1),
            new cph.i(cxl.yr, 1, 2, 5, 1),
            new cph.i(cxl.F, 1, 2, 5, 1),
            new cph.i(cxl.dY, 1, 2, 5, 1),
            new cph.i(cxl.eb, 1, 2, 5, 1)
         },
         2,
         new cph.g[]{
            new cph.i(cxl.rr, 5, 1, 4, 1),
            new cph.i(cxl.ro, 5, 1, 4, 1),
            new cph.i(cxl.iu, 3, 1, 6, 1),
            new cph.i(cxl.lu, 6, 1, 6, 1),
            new cph.i(cxl.qb, 1, 1, 8, 1),
            new cph.i(cxl.E, 3, 3, 6, 1)
         }
      )
   );
   private static final cph.l s = new cph.l(8, axb.f, "filled_map.village_desert", evm.B, 12, 5);
   private static final cph.l t = new cph.l(8, axb.e, "filled_map.village_savanna", evm.D, 12, 5);
   private static final cph.l u = new cph.l(8, axb.g, "filled_map.village_plains", evm.C, 12, 5);
   private static final cph.l v = new cph.l(8, axb.h, "filled_map.village_taiga", evm.F, 12, 5);
   private static final cph.l w = new cph.l(8, axb.i, "filled_map.village_snowy", evm.E, 12, 5);
   private static final cph.l x = new cph.l(8, axb.j, "filled_map.explorer_jungle", evm.G, 12, 5);
   private static final cph.l y = new cph.l(8, axb.k, "filled_map.explorer_swamp", evm.H, 12, 5);
   public static final Map<cpg, Int2ObjectMap<cph.g[]>> c = Map.of(
      cpg.k,
      a(
         ImmutableMap.builder()
            .put(1, new cph.g[]{new cph.b(cxl.rx, 24, 16, 2), a(1), new cph.i(dkg.cs, 9, 1, 12, 1)})
            .put(2, new cph.g[]{new cph.b(cxl.ry, 4, 12, 10), a(5), new cph.i(cxl.xv, 1, 1, 5)})
            .put(3, new cph.g[]{new cph.b(cxl.se, 5, 12, 20), a(10), new cph.i(cxl.cN, 1, 4, 10)})
            .put(4, new cph.g[]{new cph.b(cxl.uZ, 2, 12, 30), new cph.i(cxl.rV, 5, 1, 15), new cph.i(cxl.rB, 4, 1, 15)})
            .put(5, new cph.g[]{a(), new cph.i(cxl.vN, 20, 1, 30)})
            .build()
      ),
      cpg.c,
      a(
         ImmutableMap.builder()
            .put(1, new cph.g[]{new cph.b(cxl.pe, 15, 12, 2), new cph.b(cxl.pm, 5, 12, 2)})
            .put(
               2,
               new cph.g[]{
                  cph.m.a(new cph.i(cxl.qq, 4, 1, 12, 5, 0.05F), cpi.a, cpi.c, cpi.d, cpi.e, cpi.g),
                  cph.m.a(new cph.i(cxl.qm, 4, 1, 12, 5, 0.05F), cpi.b, cpi.f),
                  cph.m.a(new cph.i(cxl.qn, 5, 1, 12, 5, 0.05F), cpi.a, cpi.c, cpi.d, cpi.e, cpi.g),
                  cph.m.a(new cph.i(cxl.qj, 5, 1, 12, 5, 0.05F), cpi.b, cpi.f),
                  cph.m.a(new cph.i(cxl.qp, 7, 1, 12, 5, 0.05F), cpi.a, cpi.c, cpi.d, cpi.e, cpi.g),
                  cph.m.a(new cph.i(cxl.ql, 7, 1, 12, 5, 0.05F), cpi.b, cpi.f),
                  cph.m.a(new cph.i(cxl.qo, 9, 1, 12, 5, 0.05F), cpi.a, cpi.c, cpi.d, cpi.e, cpi.g),
                  cph.m.a(new cph.i(cxl.qk, 9, 1, 12, 5, 0.05F), cpi.b, cpi.f)
               }
            )
            .put(3, new cph.g[]{new cph.b(cxl.rj, 1, 12, 20), new cph.i(cxl.wu, 5, 1, 12, 10, 0.05F), new cph.i(cxl.xu, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new cph.g[]{
                  cph.m.a(new cph.i(cxl.qq, 8, 1, 3, 15, 0.05F, dfe.a), cpi.a),
                  cph.m.a(new cph.i(cxl.qn, 9, 1, 3, 15, 0.05F, dfe.d), cpi.a),
                  cph.m.a(new cph.i(cxl.qp, 11, 1, 3, 15, 0.05F, dfe.b), cpi.a),
                  cph.m.a(new cph.i(cxl.qo, 13, 1, 3, 15, 0.05F, dfe.c), cpi.a),
                  cph.m.a(new cph.i(cxl.qq, 8, 1, 3, 15, 0.05F, dfe.g), cpi.c),
                  cph.m.a(new cph.i(cxl.qn, 9, 1, 3, 15, 0.05F, dfe.j), cpi.c),
                  cph.m.a(new cph.i(cxl.qp, 11, 1, 3, 15, 0.05F, dfe.h), cpi.c),
                  cph.m.a(new cph.i(cxl.qo, 13, 1, 3, 15, 0.05F, dfe.i), cpi.c),
                  cph.m.a(new cph.i(cxl.qq, 2, 1, 3, 15, 0.05F, dfe.m), cpi.d),
                  cph.m.a(new cph.i(cxl.qn, 3, 1, 3, 15, 0.05F, dfe.p), cpi.d),
                  cph.m.a(new cph.i(cxl.qp, 5, 1, 3, 15, 0.05F, dfe.n), cpi.d),
                  cph.m.a(new cph.i(cxl.qo, 7, 1, 3, 15, 0.05F, dfe.o), cpi.d),
                  cph.m.a(new cph.i(cxl.qq, 8, 1, 3, 15, 0.05F, dfe.s), cpi.e),
                  cph.m.a(new cph.i(cxl.qn, 9, 1, 3, 15, 0.05F, dfe.t), cpi.e),
                  cph.m.a(new cph.i(cxl.qm, 8, 1, 3, 15, 0.05F, dfe.w), cpi.b),
                  cph.m.a(new cph.i(cxl.qj, 9, 1, 3, 15, 0.05F, dfe.z), cpi.b),
                  cph.m.a(new cph.i(cxl.ql, 11, 1, 3, 15, 0.05F, dfe.x), cpi.b),
                  cph.m.a(new cph.i(cxl.qk, 13, 1, 3, 15, 0.05F, dfe.y), cpi.b),
                  cph.m.a(new cph.i(cxl.qm, 8, 1, 3, 15, 0.05F, dfe.C), cpi.f),
                  cph.m.a(new cph.i(cxl.qj, 9, 1, 3, 15, 0.05F, dfe.F), cpi.f),
                  cph.m.a(new cph.i(cxl.ql, 11, 1, 3, 15, 0.05F, dfe.D), cpi.f),
                  cph.m.a(new cph.i(cxl.qk, 13, 1, 3, 15, 0.05F, dfe.E), cpi.f),
                  cph.m.a(new cph.h(cxl.qu, 1, 4, cxl.qt, 1, 3, 15, 0.05F), cpi.g),
                  cph.m.a(new cph.h(cxl.qt, 1, 4, cxl.qs, 1, 3, 15, 0.05F), cpi.g),
                  cph.m.a(new cph.h(cxl.qr, 1, 4, cxl.qu, 1, 3, 15, 0.05F), cpi.g),
                  cph.m.a(new cph.h(cxl.qs, 1, 2, cxl.qr, 1, 3, 15, 0.05F), cpi.g)
               }
            )
            .put(
               5,
               new cph.g[]{
                  cph.m.a(new cph.h(cxl.pg, 4, 16, cxl.qs, 1, 3, 30, 0.05F, dfe.f), cpi.a),
                  cph.m.a(new cph.h(cxl.pg, 3, 16, cxl.qt, 1, 3, 30, 0.05F, dfe.e), cpi.a),
                  cph.m.a(new cph.h(cxl.pg, 3, 16, cxl.qt, 1, 3, 30, 0.05F, dfe.l), cpi.c),
                  cph.m.a(new cph.h(cxl.pg, 2, 12, cxl.qu, 1, 3, 30, 0.05F, dfe.k), cpi.c),
                  cph.m.a(new cph.h(cxl.pg, 2, 6, cxl.qr, 1, 3, 30, 0.05F, dfe.r), cpi.d),
                  cph.m.a(new cph.h(cxl.pg, 3, 8, cxl.qs, 1, 3, 30, 0.05F, dfe.q), cpi.d),
                  cph.m.a(new cph.h(cxl.pg, 2, 12, cxl.qu, 1, 3, 30, 0.05F, dfe.u), cpi.e),
                  cph.m.a(new cph.h(cxl.pg, 3, 12, cxl.qr, 1, 3, 30, 0.05F, dfe.v), cpi.e),
                  cph.m.a(new cph.i(cxl.qj, 9, 1, 3, 30, 0.05F, dfe.B), cpi.b),
                  cph.m.a(new cph.i(cxl.qm, 8, 1, 3, 30, 0.05F, dfe.A), cpi.b),
                  cph.m.a(new cph.i(cxl.qj, 9, 1, 3, 30, 0.05F, dfe.H), cpi.f),
                  cph.m.a(new cph.i(cxl.qm, 8, 1, 3, 30, 0.05F, dfe.G), cpi.f),
                  cph.m.a(new cph.h(cxl.pg, 4, 18, cxl.qs, 1, 3, 30, 0.05F, dfe.J), cpi.g),
                  cph.m.a(new cph.h(cxl.pg, 3, 18, cxl.qt, 1, 3, 30, 0.05F, dfe.I), cpi.g),
                  cph.m.a(new cph.b(cxl.aP, 1, 12, 30, 42), cpi.g),
                  cph.m.a(new cph.b(cxl.aM, 1, 12, 30, 4), cpi.a, cpi.b, cpi.c, cpi.d, cpi.e, cpi.f)
               }
            )
            .build()
      ),
      cpg.e,
      a(
         ImmutableMap.of(
            1,
            new cph.g[]{new cph.b(cxl.rx, 24, 16, 2), new cph.i(cxl.vk, 7, 1, 1)},
            2,
            new cph.g[]{
               new cph.b(cxl.gk, 11, 16, 10),
               new cph.m(ImmutableMap.builder().put(cpi.a, t).put(cpi.d, u).put(cpi.c, v).put(cpi.g, w).put(cpi.e, u).put(cpi.b, t).put(cpi.f, w).build()),
               new cph.m(ImmutableMap.builder().put(cpi.a, u).put(cpi.d, s).put(cpi.c, t).put(cpi.g, u).put(cpi.e, v).put(cpi.b, s).put(cpi.f, v).build()),
               new cph.m(
                  ImmutableMap.builder().put(cpi.a, x).put(cpi.d, x).put(cpi.c, new cph.f()).put(cpi.g, y).put(cpi.e, y).put(cpi.b, y).put(cpi.f, x).build()
               )
            },
            3,
            new cph.g[]{
               new cph.b(cxl.rB, 1, 12, 20),
               new cph.l(13, axb.d, "filled_map.monument", evm.j, 12, 10),
               new cph.l(12, axb.m, "filled_map.trial_chambers", evm.I, 12, 10)
            },
            4,
            new cph.g[]{
               new cph.i(cxl.vd, 7, 1, 15),
               new cph.i(cxl.vR, 3, 1, 15),
               new cph.i(cxl.wc, 3, 1, 15),
               new cph.i(cxl.vU, 3, 1, 15),
               new cph.i(cxl.wf, 3, 1, 15),
               new cph.i(cxl.vX, 3, 1, 15),
               new cph.i(cxl.we, 3, 1, 15),
               new cph.i(cxl.vW, 3, 1, 15),
               new cph.i(cxl.vY, 3, 1, 15),
               new cph.i(cxl.wg, 3, 1, 15),
               new cph.i(cxl.wb, 3, 1, 15),
               new cph.i(cxl.vT, 3, 1, 15),
               new cph.i(cxl.wa, 3, 1, 15),
               new cph.i(cxl.wd, 3, 1, 15),
               new cph.i(cxl.vV, 3, 1, 15),
               new cph.i(cxl.vS, 3, 1, 15),
               new cph.i(cxl.vZ, 3, 1, 15)
            },
            5,
            new cph.g[]{new cph.i(cxl.xe, 8, 1, 30), new cph.l(14, axb.c, "filled_map.mansion", evm.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<cph.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new cph.g[]{
               new cph.b(a(czf.a), 1, 1, 1),
               new cph.b(cxl.ri, 1, 1, 1, 2),
               new cph.b(cxl.rn, 1, 1, 1, 2),
               new cph.b(cxl.tm, 1, 1, 1, 3),
               new cph.b(cxl.vi, 4, 1, 1),
               new cph.b(cxl.ic, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cph.g[]{
               new cph.i(cxl.iu, 1, 1, 6, 1),
               new cph.i(cxl.lu, 6, 1, 6, 1),
               new cph.i(cxl.qb, 1, 4, 2, 1),
               new cph.i(cxl.E, 3, 3, 6, 1),
               new cph.i(dkg.ab, 1, 8, 4, 1),
               new cph.i(dkg.Z, 1, 8, 4, 1),
               new cph.i(dkg.ad, 1, 8, 4, 1),
               new cph.i(dkg.aa, 1, 8, 4, 1),
               new cph.i(dkg.X, 1, 8, 4, 1),
               new cph.i(dkg.Y, 1, 8, 4, 1),
               new cph.i(dkg.ac, 1, 8, 4, 1),
               new cph.e(cxl.pK, 1, 1, 1, 0.2F),
               new cph.i(b(czf.h), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cph.g[]{
               new cph.i(cxl.rr, 3, 1, 4, 1),
               new cph.i(cxl.ro, 3, 1, 4, 1),
               new cph.i(cxl.da, 2, 1, 5, 1),
               new cph.i(cxl.rz, 4, 1, 5, 1),
               new cph.i(cxl.fL, 2, 1, 5, 1),
               new cph.i(cxl.wV, 5, 1, 5, 1),
               new cph.i(cxl.cV, 1, 1, 12, 1),
               new cph.i(cxl.dS, 1, 1, 8, 1),
               new cph.i(cxl.fB, 1, 1, 4, 1),
               new cph.i(cxl.dT, 3, 1, 12, 1),
               new cph.i(cxl.fm, 3, 1, 8, 1),
               new cph.i(cxl.dr, 1, 1, 12, 1),
               new cph.i(cxl.du, 1, 1, 12, 1),
               new cph.i(cxl.dv, 1, 1, 8, 1),
               new cph.i(cxl.dw, 1, 1, 12, 1),
               new cph.i(cxl.dx, 1, 1, 12, 1),
               new cph.i(cxl.dy, 1, 1, 12, 1),
               new cph.i(cxl.dz, 1, 1, 12, 1),
               new cph.i(cxl.dA, 1, 1, 12, 1),
               new cph.i(cxl.dB, 1, 1, 12, 1),
               new cph.i(cxl.dC, 1, 1, 12, 1),
               new cph.i(cxl.dD, 1, 1, 12, 1),
               new cph.i(cxl.dE, 1, 1, 7, 1),
               new cph.i(cxl.ds, 1, 1, 7, 1),
               new cph.i(cxl.qc, 1, 1, 12, 1),
               new cph.i(cxl.wn, 1, 1, 12, 1),
               new cph.i(cxl.sX, 1, 1, 12, 1),
               new cph.i(cxl.sY, 1, 1, 12, 1),
               new cph.i(cxl.ab, 5, 1, 8, 1),
               new cph.i(cxl.Z, 5, 1, 8, 1),
               new cph.i(cxl.ad, 5, 1, 8, 1),
               new cph.i(cxl.aa, 5, 1, 8, 1),
               new cph.i(cxl.X, 5, 1, 8, 1),
               new cph.i(cxl.Y, 5, 1, 8, 1),
               new cph.i(cxl.ac, 5, 1, 8, 1),
               new cph.i(cxl.ae, 5, 1, 8, 1),
               new cph.i(cxl.af, 5, 1, 8, 1),
               new cph.i(cxl.sv, 1, 3, 12, 1),
               new cph.i(cxl.sh, 1, 3, 12, 1),
               new cph.i(cxl.ss, 1, 3, 12, 1),
               new cph.i(cxl.sn, 1, 3, 12, 1),
               new cph.i(cxl.sw, 1, 3, 12, 1),
               new cph.i(cxl.su, 1, 3, 12, 1),
               new cph.i(cxl.sp, 1, 3, 12, 1),
               new cph.i(cxl.sj, 1, 3, 12, 1),
               new cph.i(cxl.sl, 1, 3, 12, 1),
               new cph.i(cxl.so, 1, 3, 12, 1),
               new cph.i(cxl.sr, 1, 3, 12, 1),
               new cph.i(cxl.sk, 1, 3, 12, 1),
               new cph.i(cxl.sm, 1, 3, 12, 1),
               new cph.i(cxl.si, 1, 3, 12, 1),
               new cph.i(cxl.st, 1, 3, 12, 1),
               new cph.i(cxl.sq, 1, 3, 12, 1),
               new cph.i(cxl.kW, 3, 1, 8, 1),
               new cph.i(cxl.kX, 3, 1, 8, 1),
               new cph.i(cxl.kY, 3, 1, 8, 1),
               new cph.i(cxl.kZ, 3, 1, 8, 1),
               new cph.i(cxl.kV, 3, 1, 8, 1),
               new cph.i(cxl.gm, 1, 3, 4, 1),
               new cph.i(cxl.ea, 1, 3, 4, 1),
               new cph.i(cxl.dJ, 1, 3, 4, 1),
               new cph.i(cxl.dK, 1, 3, 4, 1),
               new cph.i(cxl.gz, 1, 5, 2, 1),
               new cph.i(cxl.ee, 1, 2, 5, 1),
               new cph.i(cxl.ah, 1, 8, 8, 1),
               new cph.i(cxl.ak, 1, 4, 6, 1),
               new cph.i(cxl.yr, 1, 2, 5, 1),
               new cph.i(cxl.F, 1, 2, 5, 1),
               new cph.i(cxl.dY, 1, 2, 5, 1),
               new cph.i(cxl.eb, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static cph.g a(int $$0) {
      return new cph.m(
         ImmutableMap.builder()
            .put(cpi.a, new cph.d($$0, aws.w))
            .put(cpi.b, new cph.d($$0, aws.x))
            .put(cpi.c, new cph.d($$0, aws.y))
            .put(cpi.d, new cph.d($$0, aws.z))
            .put(cpi.e, new cph.d($$0, aws.A))
            .put(cpi.f, new cph.d($$0, aws.B))
            .put(cpi.g, new cph.d($$0, aws.C))
            .build()
      );
   }

   private static cph.g a() {
      return new cph.m(
         ImmutableMap.builder()
            .put(cpi.a, new cph.d(30, 3, 3, aws.D))
            .put(cpi.b, new cph.d(30, 2, 2, aws.E))
            .put(cpi.c, new cph.d(30, 3, 3, aws.F))
            .put(cpi.d, new cph.d(30, 3, 3, aws.G))
            .put(cpi.e, new cph.d(30, aws.H))
            .put(cpi.f, new cph.d(30, aws.I))
            .put(cpi.g, new cph.d(30, 2, 2, aws.J))
            .build()
      );
   }

   private static Int2ObjectMap<cph.g[]> a(ImmutableMap<Integer, cph.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static dfv a(jr<czc> $$0) {
      return new dfv(cxl.tk).a($$1 -> $$1.a(kv.R, new cze($$0)));
   }

   private static cxh b(jr<czc> $$0) {
      return cze.a(cxl.tk, $$0);
   }

   static class a implements cph.g {
      private final cxd a;
      private final int b;
      private final int c;
      private final int d;

      public a(cxd $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(cxd $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public dfx a(bva $$0, azh $$1) {
         dfv $$2 = new dfv(cxl.ph, this.b);
         cxh $$3 = new cxh(this.a);
         if ($$3.a(awy.bO)) {
            List<cwf> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = czt.a($$3, $$4);
         }

         return new dfx($$2, $$3, this.c, this.d, 0.2F);
      }

      private static cwf a(azh $$0) {
         return cwf.a(cwe.a($$0.a(16)));
      }
   }

   static class b implements cph.g {
      private final dfv a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(dgy $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(dgy $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new dfv($$0.i(), $$1), $$2, $$3, $$4);
      }

      public b(dfv $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public dfx a(bva $$0, azh $$1) {
         return new dfx(this.a, new cxh(cxl.ph, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements cph.g {
      private final Map<cpi, cxd> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<cpi, cxd> $$3) {
         mb.w.s().filter($$1x -> !$$3.containsKey($$1x)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + mb.w.b($$0x));
         });
         this.a = $$3;
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Nullable
      @Override
      public dfx a(bva $$0, azh $$1) {
         if ($$0 instanceof cpf $$2) {
            dfv $$3 = new dfv(this.a.get($$2.gA().a()), this.b);
            return new dfx($$3, new cxh(cxl.ph), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements cph.g {
      private final int a;
      private final axf<ddr> b;
      private final int c;
      private final int d;

      public d(int $$0, axf<ddr> $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, axf<ddr> $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = $$3;
      }

      @Override
      public dfx a(bva $$0, azh $$1) {
         Optional<jr<ddr>> $$2 = $$0.dU().F_().e(mc.aP).a(this.b, $$1);
         int $$9;
         cxh $$8;
         if (!$$2.isEmpty()) {
            jr<ddr> $$3 = $$2.get();
            ddr $$4 = $$3.a();
            int $$5 = Math.max($$4.d(), this.c);
            int $$6 = Math.min($$4.e(), this.d);
            int $$7 = ayz.a($$1, $$5, $$6);
            $$8 = ddt.a(new ddu($$3, $$7));
            $$9 = 2 + $$1.a(5 + $$7 * 10) + 3 * $$7;
            if ($$3.a(aws.j)) {
               $$9 *= 2;
            }

            if ($$9 > 64) {
               $$9 = 64;
            }
         } else {
            $$9 = 1;
            $$8 = new cxh(cxl.ry);
         }

         return new dfx(new dfv(cxl.ph, $$9), Optional.of(new dfv(cxl.ry)), $$8, 12, this.a, 0.2F);
      }
   }

   static class e implements cph.g {
      private final cxh a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(cxd $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(cxd $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new cxh($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public dfx a(bva $$0, azh $$1) {
         int $$2 = 5 + $$1.a(15);
         kf $$3 = $$0.dU().F_();
         Optional<jv.c<ddr>> $$4 = $$3.e(mc.aP).a(aws.m);
         cxh $$5 = ddt.a($$1, new cxh(this.a.h()), $$2, $$3, $$4);
         int $$6 = Math.min(this.b + $$2, 64);
         dfv $$7 = new dfv(cxl.ph, $$6);
         return new dfx($$7, $$5, this.c, this.d, this.e);
      }
   }

   static class f implements cph.g {
      @Override
      public dfx a(bva $$0, azh $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      dfx a(bva var1, azh var2);
   }

   static class h implements cph.g {
      private final dfv a;
      private final int b;
      private final cxh c;
      private final int d;
      private final int e;
      private final float f;
      private final Optional<akt<dez>> g;

      public h(dgy $$0, int $$1, int $$2, cxd $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new cxh($$3), $$4, $$5, $$6, $$7);
      }

      private h(dgy $$0, int $$1, int $$2, cxh $$3, int $$4, int $$5, int $$6, float $$7) {
         this(new dfv($$0, $$1), $$2, $$3.c($$4), $$5, $$6, $$7, Optional.empty());
      }

      h(dgy $$0, int $$1, int $$2, dgy $$3, int $$4, int $$5, int $$6, float $$7, akt<dez> $$8) {
         this(new dfv($$0, $$1), $$2, new cxh($$3, $$4), $$5, $$6, $$7, Optional.of($$8));
      }

      public h(dfv $$0, int $$1, cxh $$2, int $$3, int $$4, float $$5, Optional<akt<dez>> $$6) {
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
      public dfx a(bva $$0, azh $$1) {
         cxh $$2 = this.c.v();
         dgz $$3 = $$0.dU();
         this.g.ifPresent($$4 -> ddt.a($$2, $$3.F_(), (akt<dez>)$$4, $$3.d_($$0.du()), $$1));
         return new dfx(new dfv(cxl.ph, this.b), Optional.of(this.a), $$2, 0, this.d, this.e, this.f);
      }
   }

   static class i implements cph.g {
      private final cxh a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;
      private final Optional<akt<dez>> f;

      public i(dke $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cxh($$0), $$1, $$2, $$3, $$4);
      }

      public i(cxd $$0, int $$1, int $$2, int $$3) {
         this(new cxh($$0), $$1, $$2, 12, $$3);
      }

      public i(cxd $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cxh($$0), $$1, $$2, $$3, $$4);
      }

      public i(cxh $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(cxd $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new cxh($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(cxd $$0, int $$1, int $$2, int $$3, int $$4, float $$5, akt<dez> $$6) {
         this(new cxh($$0), $$1, $$2, $$3, $$4, $$5, Optional.of($$6));
      }

      public i(cxh $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this($$0, $$1, $$2, $$3, $$4, $$5, Optional.empty());
      }

      public i(cxh $$0, int $$1, int $$2, int $$3, int $$4, float $$5, Optional<akt<dez>> $$6) {
         this.a = $$0;
         this.b = $$1;
         this.a.e($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
         this.f = $$6;
      }

      @Override
      public dfx a(bva $$0, azh $$1) {
         cxh $$2 = this.a.v();
         dgz $$3 = $$0.dU();
         this.f.ifPresent($$4 -> ddt.a($$2, $$3.F_(), (akt<dez>)$$4, $$3.d_($$0.du()), $$1));
         return new dfx(new dfv(cxl.ph, this.b), $$2, this.c, this.d, this.e);
      }
   }

   static class j implements cph.g {
      private final dag a;
      private final int b;
      private final float c;

      public j(jr<buc> $$0, int $$1, int $$2) {
         this(new dag(List.of(new dag.a($$0, $$1))), $$2, 0.05F);
      }

      public j(dag $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public dfx a(bva $$0, azh $$1) {
         cxh $$2 = new cxh(cxl.wY, 1);
         $$2.b(kv.T, this.a);
         return new dfx(new dfv(cxl.ph), $$2, 12, this.b, this.c);
      }
   }

   static class k implements cph.g {
      private final cxh a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final cxd f;
      private final int g;
      private final float h;

      public k(cxd $$0, int $$1, cxd $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new cxh($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public dfx a(bva $$0, azh $$1) {
         dfv $$2 = new dfv(cxl.ph, this.c);
         List<jr<czc>> $$3 = mb.h.c().filter($$1x -> !((czc)$$1x.a()).a().isEmpty() && $$0.dU().L().a($$1x)).collect(Collectors.toList());
         jr<czc> $$4 = af.a($$3, $$1);
         cxh $$5 = new cxh(this.a.h(), this.b);
         $$5.b(kv.R, new cze($$4));
         return new dfx($$2, Optional.of(new dfv(this.f, this.g)), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements cph.g {
      private final int a;
      private final axf<eoj> b;
      private final String c;
      private final jr<evl> d;
      private final int e;
      private final int f;

      public l(int $$0, axf<eoj> $$1, String $$2, jr<evl> $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public dfx a(bva $$0, azh $$1) {
         if (!($$0.dU() instanceof ard)) {
            return null;
         } else {
            ard $$2 = (ard)$$0.dU();
            ji $$3 = $$2.a(this.b, $$0.du(), 100, true);
            if ($$3 != null) {
               cxh $$4 = cxu.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               cxu.a($$2, $$4);
               evq.a($$4, $$3, "+", this.d);
               $$4.b(kv.h, wp.c(this.c));
               return new dfx(new dfv(cxl.ph, this.a), Optional.of(new dfv(cxl.rB)), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static record m(Map<cpi, cph.g> a) implements cph.g {
      public static cph.m a(cph.g $$0, cpi... $$1) {
         return new cph.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public dfx a(bva $$0, azh $$1) {
         if ($$0 instanceof cpf $$2) {
            cpi $$3 = $$2.gA().a();
            cph.g $$4 = this.a.get($$3);
            return $$4 == null ? null : $$4.a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
