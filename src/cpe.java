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

public class cpe {
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
   public static final Map<cpd, Int2ObjectMap<cpe.g[]>> a = ae.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            cpd.g,
            a(
               ImmutableMap.of(
                  1,
                  new cpe.g[]{
                     new cpe.b(cxk.qb, 20, 16, 2),
                     new cpe.b(cxk.vf, 26, 16, 2),
                     new cpe.b(cxk.ve, 22, 16, 2),
                     new cpe.b(cxk.wk, 15, 16, 2),
                     new cpe.i(cxk.qc, 1, 6, 16, 1)
                  },
                  2,
                  new cpe.g[]{new cpe.b(dkf.fn, 6, 12, 10), new cpe.i(cxk.vs, 1, 4, 5), new cpe.i(cxk.oZ, 1, 4, 16, 5)},
                  3,
                  new cpe.g[]{new cpe.i(cxk.sP, 3, 18, 10), new cpe.b(dkf.fo, 4, 12, 20)},
                  4,
                  new cpe.g[]{
                     new cpe.i(dkf.et, 1, 1, 12, 15),
                     new cpe.j(bui.p, 100, 15),
                     new cpe.j(bui.h, 160, 15),
                     new cpe.j(bui.r, 140, 15),
                     new cpe.j(bui.o, 120, 15),
                     new cpe.j(bui.s, 280, 15),
                     new cpe.j(bui.w, 7, 15)
                  },
                  5,
                  new cpe.g[]{new cpe.i(cxk.vj, 3, 3, 30), new cpe.i(cxk.tq, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            cpd.h,
            a(
               ImmutableMap.of(
                  1,
                  new cpe.g[]{
                     new cpe.b(cxk.pX, 20, 16, 2),
                     new cpe.b(cxk.pc, 10, 16, 2),
                     new cpe.h(cxk.rW, 6, 1, cxk.sa, 6, 16, 1, 0.05F),
                     new cpe.i(cxk.ro, 3, 1, 16, 1)
                  },
                  2,
                  new cpe.g[]{new cpe.b(cxk.rW, 15, 16, 10), new cpe.h(cxk.rX, 6, 1, cxk.sb, 6, 16, 5, 0.05F), new cpe.i(cxk.xx, 2, 1, 5)},
                  3,
                  new cpe.g[]{new cpe.b(cxk.rX, 13, 16, 20), new cpe.e(cxk.rS, 3, 3, 10, 0.2F)},
                  4,
                  new cpe.g[]{new cpe.b(cxk.rY, 6, 12, 30)},
                  5,
                  new cpe.g[]{
                     new cpe.b(cxk.rZ, 4, 12, 30),
                     new cpe.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(cpf.c, cxk.ox)
                           .put(cpf.g, cxk.oz)
                           .put(cpf.e, cxk.oz)
                           .put(cpf.a, cxk.oD)
                           .put(cpf.b, cxk.oD)
                           .put(cpf.d, cxk.oF)
                           .put(cpf.f, cxk.oJ)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            cpd.n,
            a(
               ImmutableMap.of(
                  1,
                  new cpe.g[]{
                     new cpe.b(dkf.bH, 18, 16, 2),
                     new cpe.b(dkf.bT, 18, 16, 2),
                     new cpe.b(dkf.bW, 18, 16, 2),
                     new cpe.b(dkf.bO, 18, 16, 2),
                     new cpe.i(cxk.sS, 2, 1, 1)
                  },
                  2,
                  new cpe.g[]{
                     new cpe.b(cxk.sf, 12, 16, 10),
                     new cpe.b(cxk.sm, 12, 16, 10),
                     new cpe.b(cxk.su, 12, 16, 10),
                     new cpe.b(cxk.si, 12, 16, 10),
                     new cpe.b(cxk.sk, 12, 16, 10),
                     new cpe.i(dkf.bH, 1, 1, 16, 5),
                     new cpe.i(dkf.bI, 1, 1, 16, 5),
                     new cpe.i(dkf.bJ, 1, 1, 16, 5),
                     new cpe.i(dkf.bK, 1, 1, 16, 5),
                     new cpe.i(dkf.bL, 1, 1, 16, 5),
                     new cpe.i(dkf.bM, 1, 1, 16, 5),
                     new cpe.i(dkf.bN, 1, 1, 16, 5),
                     new cpe.i(dkf.bO, 1, 1, 16, 5),
                     new cpe.i(dkf.bP, 1, 1, 16, 5),
                     new cpe.i(dkf.bQ, 1, 1, 16, 5),
                     new cpe.i(dkf.bR, 1, 1, 16, 5),
                     new cpe.i(dkf.bS, 1, 1, 16, 5),
                     new cpe.i(dkf.bT, 1, 1, 16, 5),
                     new cpe.i(dkf.bU, 1, 1, 16, 5),
                     new cpe.i(dkf.bV, 1, 1, 16, 5),
                     new cpe.i(dkf.bW, 1, 1, 16, 5),
                     new cpe.i(dkf.iI, 1, 4, 16, 5),
                     new cpe.i(dkf.iJ, 1, 4, 16, 5),
                     new cpe.i(dkf.iK, 1, 4, 16, 5),
                     new cpe.i(dkf.iL, 1, 4, 16, 5),
                     new cpe.i(dkf.iM, 1, 4, 16, 5),
                     new cpe.i(dkf.iN, 1, 4, 16, 5),
                     new cpe.i(dkf.iO, 1, 4, 16, 5),
                     new cpe.i(dkf.iP, 1, 4, 16, 5),
                     new cpe.i(dkf.iQ, 1, 4, 16, 5),
                     new cpe.i(dkf.iR, 1, 4, 16, 5),
                     new cpe.i(dkf.iS, 1, 4, 16, 5),
                     new cpe.i(dkf.iT, 1, 4, 16, 5),
                     new cpe.i(dkf.iU, 1, 4, 16, 5),
                     new cpe.i(dkf.iV, 1, 4, 16, 5),
                     new cpe.i(dkf.iW, 1, 4, 16, 5),
                     new cpe.i(dkf.iX, 1, 4, 16, 5)
                  },
                  3,
                  new cpe.g[]{
                     new cpe.b(cxk.sj, 12, 16, 20),
                     new cpe.b(cxk.sn, 12, 16, 20),
                     new cpe.b(cxk.sg, 12, 16, 20),
                     new cpe.b(cxk.st, 12, 16, 20),
                     new cpe.b(cxk.sl, 12, 16, 20),
                     new cpe.i(dkf.bg, 3, 1, 12, 10),
                     new cpe.i(dkf.bk, 3, 1, 12, 10),
                     new cpe.i(dkf.bu, 3, 1, 12, 10),
                     new cpe.i(dkf.bv, 3, 1, 12, 10),
                     new cpe.i(dkf.br, 3, 1, 12, 10),
                     new cpe.i(dkf.bs, 3, 1, 12, 10),
                     new cpe.i(dkf.bp, 3, 1, 12, 10),
                     new cpe.i(dkf.bn, 3, 1, 12, 10),
                     new cpe.i(dkf.bt, 3, 1, 12, 10),
                     new cpe.i(dkf.bj, 3, 1, 12, 10),
                     new cpe.i(dkf.bo, 3, 1, 12, 10),
                     new cpe.i(dkf.bl, 3, 1, 12, 10),
                     new cpe.i(dkf.bi, 3, 1, 12, 10),
                     new cpe.i(dkf.bh, 3, 1, 12, 10),
                     new cpe.i(dkf.bm, 3, 1, 12, 10),
                     new cpe.i(dkf.bq, 3, 1, 12, 10)
                  },
                  4,
                  new cpe.g[]{
                     new cpe.b(cxk.sr, 12, 16, 30),
                     new cpe.b(cxk.sp, 12, 16, 30),
                     new cpe.b(cxk.sq, 12, 16, 30),
                     new cpe.b(cxk.ss, 12, 16, 30),
                     new cpe.b(cxk.sh, 12, 16, 30),
                     new cpe.b(cxk.so, 12, 16, 30),
                     new cpe.i(cxk.vP, 3, 1, 12, 15),
                     new cpe.i(cxk.wa, 3, 1, 12, 15),
                     new cpe.i(cxk.vS, 3, 1, 12, 15),
                     new cpe.i(cxk.wd, 3, 1, 12, 15),
                     new cpe.i(cxk.vV, 3, 1, 12, 15),
                     new cpe.i(cxk.wc, 3, 1, 12, 15),
                     new cpe.i(cxk.vU, 3, 1, 12, 15),
                     new cpe.i(cxk.vW, 3, 1, 12, 15),
                     new cpe.i(cxk.we, 3, 1, 12, 15),
                     new cpe.i(cxk.vZ, 3, 1, 12, 15),
                     new cpe.i(cxk.vR, 3, 1, 12, 15),
                     new cpe.i(cxk.vY, 3, 1, 12, 15),
                     new cpe.i(cxk.wb, 3, 1, 12, 15),
                     new cpe.i(cxk.vT, 3, 1, 12, 15),
                     new cpe.i(cxk.vQ, 3, 1, 12, 15),
                     new cpe.i(cxk.vX, 3, 1, 12, 15)
                  },
                  5,
                  new cpe.g[]{new cpe.i(cxk.qE, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            cpd.i,
            a(
               ImmutableMap.of(
                  1,
                  new cpe.g[]{new cpe.b(cxk.pV, 32, 16, 2), new cpe.i(cxk.pb, 1, 16, 1), new cpe.h(dkf.O, 10, 1, cxk.qB, 10, 12, 1, 0.05F)},
                  2,
                  new cpe.g[]{new cpe.b(cxk.qB, 26, 12, 10), new cpe.i(cxk.pa, 2, 1, 5)},
                  3,
                  new cpe.g[]{new cpe.b(cxk.pX, 14, 16, 20), new cpe.i(cxk.wV, 3, 1, 10)},
                  4,
                  new cpe.g[]{new cpe.b(cxk.pY, 24, 16, 30), new cpe.e(cxk.pa, 2, 3, 15)},
                  5,
                  new cpe.g[]{new cpe.b(cxk.my, 8, 12, 30), new cpe.e(cxk.wV, 3, 3, 15), new cpe.k(cxk.pb, 5, cxk.wq, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            cpd.k,
            a(
               ImmutableMap.builder()
                  .put(1, new cpe.g[]{new cpe.b(cxk.rv, 24, 16, 2), new cpe.d(1, axn.i), new cpe.i(dkf.cs, 9, 1, 12, 1)})
                  .put(2, new cpe.g[]{new cpe.b(cxk.rw, 4, 12, 10), new cpe.d(5, axn.i), new cpe.i(cxk.xt, 1, 1, 5)})
                  .put(3, new cpe.g[]{new cpe.b(cxk.sc, 5, 12, 20), new cpe.d(10, axn.i), new cpe.i(cxk.cN, 1, 4, 10)})
                  .put(4, new cpe.g[]{new cpe.b(cxk.uX, 2, 12, 30), new cpe.d(15, axn.i), new cpe.i(cxk.rT, 5, 1, 15), new cpe.i(cxk.rz, 4, 1, 15)})
                  .put(5, new cpe.g[]{new cpe.i(cxk.vL, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            cpd.e,
            a(
               ImmutableMap.of(
                  1,
                  new cpe.g[]{new cpe.b(cxk.rv, 24, 16, 2), new cpe.i(cxk.vi, 7, 1, 1)},
                  2,
                  new cpe.g[]{new cpe.b(cxk.gi, 11, 16, 10), new cpe.l(13, axw.d, "filled_map.monument", evg.j, 12, 5)},
                  3,
                  new cpe.g[]{
                     new cpe.b(cxk.rz, 1, 12, 20),
                     new cpe.l(14, axw.c, "filled_map.mansion", evg.i, 12, 10),
                     new cpe.l(12, axw.m, "filled_map.trial_chambers", evg.I, 12, 10)
                  },
                  4,
                  new cpe.g[]{
                     new cpe.i(cxk.vb, 7, 1, 15),
                     new cpe.i(cxk.vP, 3, 1, 15),
                     new cpe.i(cxk.wa, 3, 1, 15),
                     new cpe.i(cxk.vS, 3, 1, 15),
                     new cpe.i(cxk.wd, 3, 1, 15),
                     new cpe.i(cxk.vV, 3, 1, 15),
                     new cpe.i(cxk.wc, 3, 1, 15),
                     new cpe.i(cxk.vU, 3, 1, 15),
                     new cpe.i(cxk.vW, 3, 1, 15),
                     new cpe.i(cxk.we, 3, 1, 15),
                     new cpe.i(cxk.vZ, 3, 1, 15),
                     new cpe.i(cxk.vR, 3, 1, 15),
                     new cpe.i(cxk.vY, 3, 1, 15),
                     new cpe.i(cxk.wb, 3, 1, 15),
                     new cpe.i(cxk.vT, 3, 1, 15),
                     new cpe.i(cxk.vQ, 3, 1, 15),
                     new cpe.i(cxk.vX, 3, 1, 15)
                  },
                  5,
                  new cpe.g[]{new cpe.i(cxk.xc, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            cpd.f,
            a(
               ImmutableMap.of(
                  1,
                  new cpe.g[]{new cpe.b(cxk.tb, 32, 16, 2), new cpe.i(cxk.me, 1, 2, 1)},
                  2,
                  new cpe.g[]{new cpe.b(cxk.po, 3, 12, 10), new cpe.i(cxk.pg, 1, 1, 5)},
                  3,
                  new cpe.g[]{new cpe.b(cxk.vD, 2, 12, 20), new cpe.i(dkf.ep, 4, 1, 12, 10)},
                  4,
                  new cpe.g[]{new cpe.b(cxk.oU, 4, 12, 30), new cpe.b(cxk.th, 9, 12, 30), new cpe.i(cxk.tc, 5, 1, 15)},
                  5,
                  new cpe.g[]{new cpe.b(cxk.tg, 22, 12, 30), new cpe.i(cxk.uU, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            cpd.c,
            a(
               ImmutableMap.of(
                  1,
                  new cpe.g[]{
                     new cpe.b(cxk.pc, 15, 16, 2),
                     new cpe.i(new cxg(cxk.qn), 7, 1, 12, 1, 0.2F),
                     new cpe.i(new cxg(cxk.qo), 4, 1, 12, 1, 0.2F),
                     new cpe.i(new cxg(cxk.ql), 5, 1, 12, 1, 0.2F),
                     new cpe.i(new cxg(cxk.qm), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cpe.g[]{
                     new cpe.b(cxk.pk, 4, 12, 10),
                     new cpe.i(new cxg(cxk.xs), 36, 1, 12, 5, 0.2F),
                     new cpe.i(new cxg(cxk.qk), 1, 1, 12, 5, 0.2F),
                     new cpe.i(new cxg(cxk.qj), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new cpe.g[]{
                     new cpe.b(cxk.rh, 1, 12, 20),
                     new cpe.b(cxk.pe, 1, 12, 20),
                     new cpe.i(new cxg(cxk.qh), 1, 1, 12, 10, 0.2F),
                     new cpe.i(new cxg(cxk.qi), 4, 1, 12, 10, 0.2F),
                     new cpe.i(new cxg(cxk.ws), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new cpe.g[]{new cpe.e(cxk.qr, 14, 3, 15, 0.2F), new cpe.e(cxk.qs, 8, 3, 15, 0.2F)},
                  5,
                  new cpe.g[]{new cpe.e(cxk.qp, 8, 3, 30, 0.2F), new cpe.e(cxk.qq, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cpd.p,
            a(
               ImmutableMap.of(
                  1,
                  new cpe.g[]{new cpe.b(cxk.pc, 15, 16, 2), new cpe.i(new cxg(cxk.pJ), 3, 1, 12, 1, 0.2F), new cpe.e(cxk.pG, 2, 3, 1)},
                  2,
                  new cpe.g[]{new cpe.b(cxk.pk, 4, 12, 10), new cpe.i(new cxg(cxk.xs), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cpe.g[]{new cpe.b(cxk.qB, 24, 12, 20)},
                  4,
                  new cpe.g[]{new cpe.b(cxk.pe, 1, 12, 30), new cpe.e(cxk.pO, 12, 3, 15, 0.2F)},
                  5,
                  new cpe.g[]{new cpe.e(cxk.pL, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cpd.o,
            a(
               ImmutableMap.of(
                  1,
                  new cpe.g[]{
                     new cpe.b(cxk.pc, 15, 16, 2),
                     new cpe.i(new cxg(cxk.pz), 1, 1, 12, 1, 0.2F),
                     new cpe.i(new cxg(cxk.px), 1, 1, 12, 1, 0.2F),
                     new cpe.i(new cxg(cxk.py), 1, 1, 12, 1, 0.2F),
                     new cpe.i(new cxg(cxk.pA), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cpe.g[]{new cpe.b(cxk.pk, 4, 12, 10), new cpe.i(new cxg(cxk.xs), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cpe.g[]{
                     new cpe.b(cxk.qB, 30, 12, 20),
                     new cpe.e(cxk.pJ, 1, 3, 10, 0.2F),
                     new cpe.e(cxk.pH, 2, 3, 10, 0.2F),
                     new cpe.e(cxk.pI, 3, 3, 10, 0.2F),
                     new cpe.i(new cxg(cxk.pP), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new cpe.g[]{new cpe.b(cxk.pe, 1, 12, 30), new cpe.e(cxk.pO, 12, 3, 15, 0.2F), new cpe.e(cxk.pM, 5, 3, 15, 0.2F)},
                  5,
                  new cpe.g[]{new cpe.e(cxk.pN, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cpd.d,
            a(
               ImmutableMap.of(
                  1,
                  new cpe.g[]{new cpe.b(cxk.sZ, 14, 16, 2), new cpe.b(cxk.qC, 7, 16, 2), new cpe.b(cxk.vA, 4, 16, 2), new cpe.i(cxk.vC, 1, 1, 1)},
                  2,
                  new cpe.g[]{new cpe.b(cxk.pc, 15, 16, 2), new cpe.i(cxk.qD, 1, 5, 16, 5), new cpe.i(cxk.ta, 1, 8, 16, 5)},
                  3,
                  new cpe.g[]{new cpe.b(cxk.vN, 7, 16, 20), new cpe.b(cxk.sX, 10, 16, 20)},
                  4,
                  new cpe.g[]{new cpe.b(cxk.ru, 10, 12, 30)},
                  5,
                  new cpe.g[]{new cpe.b(cxk.xv, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            cpd.j,
            a(
               ImmutableMap.of(
                  1,
                  new cpe.g[]{new cpe.b(cxk.rk, 6, 16, 2), new cpe.a(cxk.qf, 3), new cpe.a(cxk.qe, 7)},
                  2,
                  new cpe.g[]{new cpe.b(cxk.qB, 26, 12, 10), new cpe.a(cxk.qd, 5, 12, 5), new cpe.a(cxk.qg, 4, 12, 5)},
                  3,
                  new cpe.g[]{new cpe.b(cxk.vE, 9, 12, 20), new cpe.a(cxk.qe, 7)},
                  4,
                  new cpe.g[]{new cpe.b(cxk.oU, 4, 12, 30), new cpe.a(cxk.vJ, 6, 12, 15)},
                  5,
                  new cpe.g[]{new cpe.i(new cxg(cxk.on), 6, 1, 12, 30, 0.2F), new cpe.a(cxk.qd, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            cpd.l,
            a(
               ImmutableMap.of(
                  1,
                  new cpe.g[]{new cpe.b(cxk.rt, 10, 16, 2), new cpe.i(cxk.rs, 1, 10, 16, 1)},
                  2,
                  new cpe.g[]{new cpe.b(dkf.b, 20, 16, 10), new cpe.i(dkf.eY, 1, 4, 16, 5)},
                  3,
                  new cpe.g[]{
                     new cpe.b(dkf.c, 16, 16, 20),
                     new cpe.b(dkf.g, 16, 16, 20),
                     new cpe.b(dkf.e, 16, 16, 20),
                     new cpe.i(dkf.sW, 1, 4, 16, 10),
                     new cpe.i(dkf.h, 1, 4, 16, 10),
                     new cpe.i(dkf.f, 1, 4, 16, 10),
                     new cpe.i(dkf.d, 1, 4, 16, 10)
                  },
                  4,
                  new cpe.g[]{
                     new cpe.b(cxk.ph, 12, 12, 30),
                     new cpe.i(dkf.hH, 1, 1, 12, 15),
                     new cpe.i(dkf.hG, 1, 1, 12, 15),
                     new cpe.i(dkf.hR, 1, 1, 12, 15),
                     new cpe.i(dkf.hJ, 1, 1, 12, 15),
                     new cpe.i(dkf.hN, 1, 1, 12, 15),
                     new cpe.i(dkf.hO, 1, 1, 12, 15),
                     new cpe.i(dkf.hV, 1, 1, 12, 15),
                     new cpe.i(dkf.hU, 1, 1, 12, 15),
                     new cpe.i(dkf.hM, 1, 1, 12, 15),
                     new cpe.i(dkf.hI, 1, 1, 12, 15),
                     new cpe.i(dkf.hL, 1, 1, 12, 15),
                     new cpe.i(dkf.hT, 1, 1, 12, 15),
                     new cpe.i(dkf.hP, 1, 1, 12, 15),
                     new cpe.i(dkf.hQ, 1, 1, 12, 15),
                     new cpe.i(dkf.hK, 1, 1, 12, 15),
                     new cpe.i(dkf.hS, 1, 1, 12, 15),
                     new cpe.i(dkf.lJ, 1, 1, 12, 15),
                     new cpe.i(dkf.lI, 1, 1, 12, 15),
                     new cpe.i(dkf.lT, 1, 1, 12, 15),
                     new cpe.i(dkf.lL, 1, 1, 12, 15),
                     new cpe.i(dkf.lP, 1, 1, 12, 15),
                     new cpe.i(dkf.lQ, 1, 1, 12, 15),
                     new cpe.i(dkf.lX, 1, 1, 12, 15),
                     new cpe.i(dkf.lW, 1, 1, 12, 15),
                     new cpe.i(dkf.lO, 1, 1, 12, 15),
                     new cpe.i(dkf.lK, 1, 1, 12, 15),
                     new cpe.i(dkf.lN, 1, 1, 12, 15),
                     new cpe.i(dkf.lV, 1, 1, 12, 15),
                     new cpe.i(dkf.lR, 1, 1, 12, 15),
                     new cpe.i(dkf.lS, 1, 1, 12, 15),
                     new cpe.i(dkf.lM, 1, 1, 12, 15),
                     new cpe.i(dkf.lU, 1, 1, 12, 15)
                  },
                  5,
                  new cpe.g[]{new cpe.i(dkf.hC, 1, 1, 12, 30), new cpe.i(dkf.hA, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<cpe.g[]> b = a(
      ImmutableMap.of(
         1,
         new cpe.g[]{
            new cpe.i(cxk.da, 2, 1, 5, 1),
            new cpe.i(cxk.rx, 4, 1, 5, 1),
            new cpe.i(cxk.fJ, 2, 1, 5, 1),
            new cpe.i(cxk.wT, 5, 1, 5, 1),
            new cpe.i(cxk.cV, 1, 1, 12, 1),
            new cpe.i(cxk.dS, 1, 1, 8, 1),
            new cpe.i(cxk.fz, 1, 1, 4, 1),
            new cpe.i(cxk.dT, 3, 1, 12, 1),
            new cpe.i(cxk.fk, 3, 1, 8, 1),
            new cpe.i(cxk.dr, 1, 1, 12, 1),
            new cpe.i(cxk.du, 1, 1, 12, 1),
            new cpe.i(cxk.dv, 1, 1, 8, 1),
            new cpe.i(cxk.dw, 1, 1, 12, 1),
            new cpe.i(cxk.dx, 1, 1, 12, 1),
            new cpe.i(cxk.dy, 1, 1, 12, 1),
            new cpe.i(cxk.dz, 1, 1, 12, 1),
            new cpe.i(cxk.dA, 1, 1, 12, 1),
            new cpe.i(cxk.dB, 1, 1, 12, 1),
            new cpe.i(cxk.dC, 1, 1, 12, 1),
            new cpe.i(cxk.dD, 1, 1, 12, 1),
            new cpe.i(cxk.dE, 1, 1, 7, 1),
            new cpe.i(cxk.ds, 1, 1, 7, 1),
            new cpe.i(cxk.qa, 1, 1, 12, 1),
            new cpe.i(cxk.wl, 1, 1, 12, 1),
            new cpe.i(cxk.sV, 1, 1, 12, 1),
            new cpe.i(cxk.sW, 1, 1, 12, 1),
            new cpe.i(cxk.ab, 5, 1, 8, 1),
            new cpe.i(cxk.Z, 5, 1, 8, 1),
            new cpe.i(cxk.ad, 5, 1, 8, 1),
            new cpe.i(cxk.ae, 5, 1, 8, 1),
            new cpe.i(cxk.aa, 5, 1, 8, 1),
            new cpe.i(cxk.X, 5, 1, 8, 1),
            new cpe.i(cxk.Y, 5, 1, 8, 1),
            new cpe.i(cxk.ac, 5, 1, 8, 1),
            new cpe.i(cxk.ae, 5, 1, 8, 1),
            new cpe.i(cxk.af, 5, 1, 8, 1),
            new cpe.i(cxk.st, 1, 3, 12, 1),
            new cpe.i(cxk.sf, 1, 3, 12, 1),
            new cpe.i(cxk.sq, 1, 3, 12, 1),
            new cpe.i(cxk.sl, 1, 3, 12, 1),
            new cpe.i(cxk.su, 1, 3, 12, 1),
            new cpe.i(cxk.ss, 1, 3, 12, 1),
            new cpe.i(cxk.sn, 1, 3, 12, 1),
            new cpe.i(cxk.sh, 1, 3, 12, 1),
            new cpe.i(cxk.sj, 1, 3, 12, 1),
            new cpe.i(cxk.sm, 1, 3, 12, 1),
            new cpe.i(cxk.sp, 1, 3, 12, 1),
            new cpe.i(cxk.si, 1, 3, 12, 1),
            new cpe.i(cxk.sk, 1, 3, 12, 1),
            new cpe.i(cxk.sg, 1, 3, 12, 1),
            new cpe.i(cxk.sr, 1, 3, 12, 1),
            new cpe.i(cxk.so, 1, 3, 12, 1),
            new cpe.i(cxk.kU, 3, 1, 8, 1),
            new cpe.i(cxk.kV, 3, 1, 8, 1),
            new cpe.i(cxk.kW, 3, 1, 8, 1),
            new cpe.i(cxk.kX, 3, 1, 8, 1),
            new cpe.i(cxk.kT, 3, 1, 8, 1),
            new cpe.i(cxk.gk, 1, 1, 12, 1),
            new cpe.i(cxk.dY, 1, 1, 12, 1),
            new cpe.i(cxk.dJ, 1, 1, 12, 1),
            new cpe.i(cxk.dK, 1, 1, 12, 1),
            new cpe.i(cxk.gx, 1, 2, 5, 1),
            new cpe.i(cxk.ec, 1, 2, 5, 1),
            new cpe.i(cxk.ah, 1, 8, 8, 1),
            new cpe.i(cxk.ak, 1, 4, 6, 1),
            new cpe.i(cxk.yp, 1, 2, 5, 1),
            new cpe.i(cxk.F, 1, 2, 5, 1),
            new cpe.i(cxk.dW, 1, 2, 5, 1),
            new cpe.i(cxk.dZ, 1, 2, 5, 1)
         },
         2,
         new cpe.g[]{
            new cpe.i(cxk.rp, 5, 1, 4, 1),
            new cpe.i(cxk.rm, 5, 1, 4, 1),
            new cpe.i(cxk.is, 3, 1, 6, 1),
            new cpe.i(cxk.ls, 6, 1, 6, 1),
            new cpe.i(cxk.pZ, 1, 1, 8, 1),
            new cpe.i(cxk.E, 3, 3, 6, 1)
         }
      )
   );
   private static final cpe.l s = new cpe.l(8, axw.f, "filled_map.village_desert", evg.B, 12, 5);
   private static final cpe.l t = new cpe.l(8, axw.e, "filled_map.village_savanna", evg.D, 12, 5);
   private static final cpe.l u = new cpe.l(8, axw.g, "filled_map.village_plains", evg.C, 12, 5);
   private static final cpe.l v = new cpe.l(8, axw.h, "filled_map.village_taiga", evg.F, 12, 5);
   private static final cpe.l w = new cpe.l(8, axw.i, "filled_map.village_snowy", evg.E, 12, 5);
   private static final cpe.l x = new cpe.l(8, axw.j, "filled_map.explorer_jungle", evg.G, 12, 5);
   private static final cpe.l y = new cpe.l(8, axw.k, "filled_map.explorer_swamp", evg.H, 12, 5);
   public static final Map<cpd, Int2ObjectMap<cpe.g[]>> c = Map.of(
      cpd.k,
      a(
         ImmutableMap.builder()
            .put(1, new cpe.g[]{new cpe.b(cxk.rv, 24, 16, 2), a(1), new cpe.i(dkf.cs, 9, 1, 12, 1)})
            .put(2, new cpe.g[]{new cpe.b(cxk.rw, 4, 12, 10), a(5), new cpe.i(cxk.xt, 1, 1, 5)})
            .put(3, new cpe.g[]{new cpe.b(cxk.sc, 5, 12, 20), a(10), new cpe.i(cxk.cN, 1, 4, 10)})
            .put(4, new cpe.g[]{new cpe.b(cxk.uX, 2, 12, 30), new cpe.i(cxk.rT, 5, 1, 15), new cpe.i(cxk.rz, 4, 1, 15)})
            .put(5, new cpe.g[]{a(), new cpe.i(cxk.vL, 20, 1, 30)})
            .build()
      ),
      cpd.c,
      a(
         ImmutableMap.builder()
            .put(1, new cpe.g[]{new cpe.b(cxk.pc, 15, 12, 2), new cpe.b(cxk.pk, 5, 12, 2)})
            .put(
               2,
               new cpe.g[]{
                  cpe.m.a(new cpe.i(cxk.qo, 4, 1, 12, 5, 0.05F), cpf.a, cpf.c, cpf.d, cpf.e, cpf.g),
                  cpe.m.a(new cpe.i(cxk.qk, 4, 1, 12, 5, 0.05F), cpf.b, cpf.f),
                  cpe.m.a(new cpe.i(cxk.ql, 5, 1, 12, 5, 0.05F), cpf.a, cpf.c, cpf.d, cpf.e, cpf.g),
                  cpe.m.a(new cpe.i(cxk.qh, 5, 1, 12, 5, 0.05F), cpf.b, cpf.f),
                  cpe.m.a(new cpe.i(cxk.qn, 7, 1, 12, 5, 0.05F), cpf.a, cpf.c, cpf.d, cpf.e, cpf.g),
                  cpe.m.a(new cpe.i(cxk.qj, 7, 1, 12, 5, 0.05F), cpf.b, cpf.f),
                  cpe.m.a(new cpe.i(cxk.qm, 9, 1, 12, 5, 0.05F), cpf.a, cpf.c, cpf.d, cpf.e, cpf.g),
                  cpe.m.a(new cpe.i(cxk.qi, 9, 1, 12, 5, 0.05F), cpf.b, cpf.f)
               }
            )
            .put(3, new cpe.g[]{new cpe.b(cxk.rh, 1, 12, 20), new cpe.i(cxk.ws, 5, 1, 12, 10, 0.05F), new cpe.i(cxk.xs, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new cpe.g[]{
                  cpe.m.a(new cpe.i(cxk.qo, 8, 1, 3, 15, 0.05F, dfd.a), cpf.a),
                  cpe.m.a(new cpe.i(cxk.ql, 9, 1, 3, 15, 0.05F, dfd.d), cpf.a),
                  cpe.m.a(new cpe.i(cxk.qn, 11, 1, 3, 15, 0.05F, dfd.b), cpf.a),
                  cpe.m.a(new cpe.i(cxk.qm, 13, 1, 3, 15, 0.05F, dfd.c), cpf.a),
                  cpe.m.a(new cpe.i(cxk.qo, 8, 1, 3, 15, 0.05F, dfd.g), cpf.c),
                  cpe.m.a(new cpe.i(cxk.ql, 9, 1, 3, 15, 0.05F, dfd.j), cpf.c),
                  cpe.m.a(new cpe.i(cxk.qn, 11, 1, 3, 15, 0.05F, dfd.h), cpf.c),
                  cpe.m.a(new cpe.i(cxk.qm, 13, 1, 3, 15, 0.05F, dfd.i), cpf.c),
                  cpe.m.a(new cpe.i(cxk.qo, 2, 1, 3, 15, 0.05F, dfd.m), cpf.d),
                  cpe.m.a(new cpe.i(cxk.ql, 3, 1, 3, 15, 0.05F, dfd.p), cpf.d),
                  cpe.m.a(new cpe.i(cxk.qn, 5, 1, 3, 15, 0.05F, dfd.n), cpf.d),
                  cpe.m.a(new cpe.i(cxk.qm, 7, 1, 3, 15, 0.05F, dfd.o), cpf.d),
                  cpe.m.a(new cpe.i(cxk.qo, 8, 1, 3, 15, 0.05F, dfd.s), cpf.e),
                  cpe.m.a(new cpe.i(cxk.ql, 9, 1, 3, 15, 0.05F, dfd.t), cpf.e),
                  cpe.m.a(new cpe.i(cxk.qk, 8, 1, 3, 15, 0.05F, dfd.w), cpf.b),
                  cpe.m.a(new cpe.i(cxk.qh, 9, 1, 3, 15, 0.05F, dfd.z), cpf.b),
                  cpe.m.a(new cpe.i(cxk.qj, 11, 1, 3, 15, 0.05F, dfd.x), cpf.b),
                  cpe.m.a(new cpe.i(cxk.qi, 13, 1, 3, 15, 0.05F, dfd.y), cpf.b),
                  cpe.m.a(new cpe.i(cxk.qk, 8, 1, 3, 15, 0.05F, dfd.C), cpf.f),
                  cpe.m.a(new cpe.i(cxk.qh, 9, 1, 3, 15, 0.05F, dfd.F), cpf.f),
                  cpe.m.a(new cpe.i(cxk.qj, 11, 1, 3, 15, 0.05F, dfd.D), cpf.f),
                  cpe.m.a(new cpe.i(cxk.qi, 13, 1, 3, 15, 0.05F, dfd.E), cpf.f),
                  cpe.m.a(new cpe.h(cxk.qs, 1, 4, cxk.qr, 1, 3, 15, 0.05F), cpf.g),
                  cpe.m.a(new cpe.h(cxk.qr, 1, 4, cxk.qq, 1, 3, 15, 0.05F), cpf.g),
                  cpe.m.a(new cpe.h(cxk.qp, 1, 4, cxk.qs, 1, 3, 15, 0.05F), cpf.g),
                  cpe.m.a(new cpe.h(cxk.qq, 1, 2, cxk.qp, 1, 3, 15, 0.05F), cpf.g)
               }
            )
            .put(
               5,
               new cpe.g[]{
                  cpe.m.a(new cpe.h(cxk.pe, 4, 16, cxk.qq, 1, 3, 30, 0.05F, dfd.f), cpf.a),
                  cpe.m.a(new cpe.h(cxk.pe, 3, 16, cxk.qr, 1, 3, 30, 0.05F, dfd.e), cpf.a),
                  cpe.m.a(new cpe.h(cxk.pe, 3, 16, cxk.qr, 1, 3, 30, 0.05F, dfd.l), cpf.c),
                  cpe.m.a(new cpe.h(cxk.pe, 2, 12, cxk.qs, 1, 3, 30, 0.05F, dfd.k), cpf.c),
                  cpe.m.a(new cpe.h(cxk.pe, 2, 6, cxk.qp, 1, 3, 30, 0.05F, dfd.r), cpf.d),
                  cpe.m.a(new cpe.h(cxk.pe, 3, 8, cxk.qq, 1, 3, 30, 0.05F, dfd.q), cpf.d),
                  cpe.m.a(new cpe.h(cxk.pe, 2, 12, cxk.qs, 1, 3, 30, 0.05F, dfd.u), cpf.e),
                  cpe.m.a(new cpe.h(cxk.pe, 3, 12, cxk.qp, 1, 3, 30, 0.05F, dfd.v), cpf.e),
                  cpe.m.a(new cpe.i(cxk.qh, 9, 1, 3, 30, 0.05F, dfd.B), cpf.b),
                  cpe.m.a(new cpe.i(cxk.qk, 8, 1, 3, 30, 0.05F, dfd.A), cpf.b),
                  cpe.m.a(new cpe.i(cxk.qh, 9, 1, 3, 30, 0.05F, dfd.H), cpf.f),
                  cpe.m.a(new cpe.i(cxk.qk, 8, 1, 3, 30, 0.05F, dfd.G), cpf.f),
                  cpe.m.a(new cpe.h(cxk.pe, 4, 18, cxk.qq, 1, 3, 30, 0.05F, dfd.J), cpf.g),
                  cpe.m.a(new cpe.h(cxk.pe, 3, 18, cxk.qr, 1, 3, 30, 0.05F, dfd.I), cpf.g),
                  cpe.m.a(new cpe.b(cxk.aP, 1, 12, 30, 42), cpf.g),
                  cpe.m.a(new cpe.b(cxk.aM, 1, 12, 30, 4), cpf.a, cpf.b, cpf.c, cpf.d, cpf.e, cpf.f)
               }
            )
            .build()
      ),
      cpd.e,
      a(
         ImmutableMap.of(
            1,
            new cpe.g[]{new cpe.b(cxk.rv, 24, 16, 2), new cpe.i(cxk.vi, 7, 1, 1)},
            2,
            new cpe.g[]{
               new cpe.b(cxk.gi, 11, 16, 10),
               new cpe.m(ImmutableMap.builder().put(cpf.a, t).put(cpf.d, u).put(cpf.c, v).put(cpf.g, w).put(cpf.e, u).put(cpf.b, t).put(cpf.f, w).build()),
               new cpe.m(ImmutableMap.builder().put(cpf.a, u).put(cpf.d, s).put(cpf.c, t).put(cpf.g, u).put(cpf.e, v).put(cpf.b, s).put(cpf.f, v).build()),
               new cpe.m(
                  ImmutableMap.builder().put(cpf.a, x).put(cpf.d, x).put(cpf.c, new cpe.f()).put(cpf.g, y).put(cpf.e, y).put(cpf.b, y).put(cpf.f, x).build()
               )
            },
            3,
            new cpe.g[]{
               new cpe.b(cxk.rz, 1, 12, 20),
               new cpe.l(13, axw.d, "filled_map.monument", evg.j, 12, 10),
               new cpe.l(12, axw.m, "filled_map.trial_chambers", evg.I, 12, 10)
            },
            4,
            new cpe.g[]{
               new cpe.i(cxk.vb, 7, 1, 15),
               new cpe.i(cxk.vP, 3, 1, 15),
               new cpe.i(cxk.wa, 3, 1, 15),
               new cpe.i(cxk.vS, 3, 1, 15),
               new cpe.i(cxk.wd, 3, 1, 15),
               new cpe.i(cxk.vV, 3, 1, 15),
               new cpe.i(cxk.wc, 3, 1, 15),
               new cpe.i(cxk.vU, 3, 1, 15),
               new cpe.i(cxk.vW, 3, 1, 15),
               new cpe.i(cxk.we, 3, 1, 15),
               new cpe.i(cxk.vZ, 3, 1, 15),
               new cpe.i(cxk.vR, 3, 1, 15),
               new cpe.i(cxk.vY, 3, 1, 15),
               new cpe.i(cxk.wb, 3, 1, 15),
               new cpe.i(cxk.vT, 3, 1, 15),
               new cpe.i(cxk.vQ, 3, 1, 15),
               new cpe.i(cxk.vX, 3, 1, 15)
            },
            5,
            new cpe.g[]{new cpe.i(cxk.xc, 8, 1, 30), new cpe.l(14, axw.c, "filled_map.mansion", evg.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<cpe.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new cpe.g[]{
               new cpe.b(a(czg.a), 1, 1, 1),
               new cpe.b(cxk.rg, 1, 1, 1, 2),
               new cpe.b(cxk.rl, 1, 1, 1, 2),
               new cpe.b(cxk.tk, 1, 1, 1, 3),
               new cpe.b(cxk.vg, 4, 1, 1),
               new cpe.b(cxk.ia, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cpe.g[]{
               new cpe.i(cxk.is, 1, 1, 6, 1),
               new cpe.i(cxk.ls, 6, 1, 6, 1),
               new cpe.i(cxk.pZ, 1, 4, 2, 1),
               new cpe.i(cxk.E, 3, 3, 6, 1),
               new cpe.i(dkf.ab, 1, 8, 4, 1),
               new cpe.i(dkf.Z, 1, 8, 4, 1),
               new cpe.i(dkf.ad, 1, 8, 4, 1),
               new cpe.i(dkf.aa, 1, 8, 4, 1),
               new cpe.i(dkf.X, 1, 8, 4, 1),
               new cpe.i(dkf.Y, 1, 8, 4, 1),
               new cpe.i(dkf.ac, 1, 8, 4, 1),
               new cpe.e(cxk.pI, 1, 1, 1, 0.2F),
               new cpe.i(b(czg.h), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cpe.g[]{
               new cpe.i(cxk.rp, 3, 1, 4, 1),
               new cpe.i(cxk.rm, 3, 1, 4, 1),
               new cpe.i(cxk.da, 2, 1, 5, 1),
               new cpe.i(cxk.rx, 4, 1, 5, 1),
               new cpe.i(cxk.fJ, 2, 1, 5, 1),
               new cpe.i(cxk.wT, 5, 1, 5, 1),
               new cpe.i(cxk.cV, 1, 1, 12, 1),
               new cpe.i(cxk.dS, 1, 1, 8, 1),
               new cpe.i(cxk.fz, 1, 1, 4, 1),
               new cpe.i(cxk.dT, 3, 1, 12, 1),
               new cpe.i(cxk.fk, 3, 1, 8, 1),
               new cpe.i(cxk.dr, 1, 1, 12, 1),
               new cpe.i(cxk.du, 1, 1, 12, 1),
               new cpe.i(cxk.dv, 1, 1, 8, 1),
               new cpe.i(cxk.dw, 1, 1, 12, 1),
               new cpe.i(cxk.dx, 1, 1, 12, 1),
               new cpe.i(cxk.dy, 1, 1, 12, 1),
               new cpe.i(cxk.dz, 1, 1, 12, 1),
               new cpe.i(cxk.dA, 1, 1, 12, 1),
               new cpe.i(cxk.dB, 1, 1, 12, 1),
               new cpe.i(cxk.dC, 1, 1, 12, 1),
               new cpe.i(cxk.dD, 1, 1, 12, 1),
               new cpe.i(cxk.dE, 1, 1, 7, 1),
               new cpe.i(cxk.ds, 1, 1, 7, 1),
               new cpe.i(cxk.qa, 1, 1, 12, 1),
               new cpe.i(cxk.wl, 1, 1, 12, 1),
               new cpe.i(cxk.sV, 1, 1, 12, 1),
               new cpe.i(cxk.sW, 1, 1, 12, 1),
               new cpe.i(cxk.ab, 5, 1, 8, 1),
               new cpe.i(cxk.Z, 5, 1, 8, 1),
               new cpe.i(cxk.ad, 5, 1, 8, 1),
               new cpe.i(cxk.ae, 5, 1, 8, 1),
               new cpe.i(cxk.aa, 5, 1, 8, 1),
               new cpe.i(cxk.X, 5, 1, 8, 1),
               new cpe.i(cxk.Y, 5, 1, 8, 1),
               new cpe.i(cxk.ac, 5, 1, 8, 1),
               new cpe.i(cxk.ae, 5, 1, 8, 1),
               new cpe.i(cxk.af, 5, 1, 8, 1),
               new cpe.i(cxk.st, 1, 3, 12, 1),
               new cpe.i(cxk.sf, 1, 3, 12, 1),
               new cpe.i(cxk.sq, 1, 3, 12, 1),
               new cpe.i(cxk.sl, 1, 3, 12, 1),
               new cpe.i(cxk.su, 1, 3, 12, 1),
               new cpe.i(cxk.ss, 1, 3, 12, 1),
               new cpe.i(cxk.sn, 1, 3, 12, 1),
               new cpe.i(cxk.sh, 1, 3, 12, 1),
               new cpe.i(cxk.sj, 1, 3, 12, 1),
               new cpe.i(cxk.sm, 1, 3, 12, 1),
               new cpe.i(cxk.sp, 1, 3, 12, 1),
               new cpe.i(cxk.si, 1, 3, 12, 1),
               new cpe.i(cxk.sk, 1, 3, 12, 1),
               new cpe.i(cxk.sg, 1, 3, 12, 1),
               new cpe.i(cxk.sr, 1, 3, 12, 1),
               new cpe.i(cxk.so, 1, 3, 12, 1),
               new cpe.i(cxk.kU, 3, 1, 8, 1),
               new cpe.i(cxk.kV, 3, 1, 8, 1),
               new cpe.i(cxk.kW, 3, 1, 8, 1),
               new cpe.i(cxk.kX, 3, 1, 8, 1),
               new cpe.i(cxk.kT, 3, 1, 8, 1),
               new cpe.i(cxk.gk, 1, 3, 4, 1),
               new cpe.i(cxk.dY, 1, 3, 4, 1),
               new cpe.i(cxk.dJ, 1, 3, 4, 1),
               new cpe.i(cxk.dK, 1, 3, 4, 1),
               new cpe.i(cxk.gx, 1, 5, 2, 1),
               new cpe.i(cxk.ec, 1, 2, 5, 1),
               new cpe.i(cxk.ah, 1, 8, 8, 1),
               new cpe.i(cxk.ak, 1, 4, 6, 1),
               new cpe.i(cxk.yp, 1, 2, 5, 1),
               new cpe.i(cxk.F, 1, 2, 5, 1),
               new cpe.i(cxk.dW, 1, 2, 5, 1),
               new cpe.i(cxk.dZ, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static cpe.g a(int $$0) {
      return new cpe.m(
         ImmutableMap.builder()
            .put(cpf.a, new cpe.d($$0, axn.w))
            .put(cpf.b, new cpe.d($$0, axn.x))
            .put(cpf.c, new cpe.d($$0, axn.y))
            .put(cpf.d, new cpe.d($$0, axn.z))
            .put(cpf.e, new cpe.d($$0, axn.A))
            .put(cpf.f, new cpe.d($$0, axn.B))
            .put(cpf.g, new cpe.d($$0, axn.C))
            .build()
      );
   }

   private static cpe.g a() {
      return new cpe.m(
         ImmutableMap.builder()
            .put(cpf.a, new cpe.d(30, 3, 3, axn.D))
            .put(cpf.b, new cpe.d(30, 2, 2, axn.E))
            .put(cpf.c, new cpe.d(30, 3, 3, axn.F))
            .put(cpf.d, new cpe.d(30, 3, 3, axn.G))
            .put(cpf.e, new cpe.d(30, axn.H))
            .put(cpf.f, new cpe.d(30, axn.I))
            .put(cpf.g, new cpe.d(30, 2, 2, axn.J))
            .build()
      );
   }

   private static Int2ObjectMap<cpe.g[]> a(ImmutableMap<Integer, cpe.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static dfu a(jq<czd> $$0) {
      return new dfu(cxk.ti).a($$1 -> $$1.a(ku.Q, new czf($$0)));
   }

   private static cxg b(jq<czd> $$0) {
      return czf.a(cxk.ti, $$0);
   }

   static class a implements cpe.g {
      private final cxc a;
      private final int b;
      private final int c;
      private final int d;

      public a(cxc $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(cxc $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public dfw a(bvb $$0, bac $$1) {
         dfu $$2 = new dfu(cxk.pf, this.b);
         cxg $$3 = new cxg(this.a);
         if ($$3.a(axt.bR)) {
            List<cwe> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = czu.a($$3, $$4);
         }

         return new dfw($$2, $$3, this.c, this.d, 0.2F);
      }

      private static cwe a(bac $$0) {
         return cwe.a(cwd.a($$0.a(16)));
      }
   }

   static class b implements cpe.g {
      private final dfu a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(dgy $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(dgy $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new dfu($$0.j(), $$1), $$2, $$3, $$4);
      }

      public b(dfu $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public dfw a(bvb $$0, bac $$1) {
         return new dfw(this.a, new cxg(cxk.pf, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements cpe.g {
      private final Map<cpf, cxc> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<cpf, cxc> $$3) {
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
      public dfw a(bvb $$0, bac $$1) {
         if ($$0 instanceof cpc $$2) {
            dfu $$3 = new dfu(this.a.get($$2.gy().a()), this.b);
            return new dfw($$3, new cxg(cxk.pf), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements cpe.g {
      private final int a;
      private final aya<ddq> b;
      private final int c;
      private final int d;

      public d(int $$0, aya<ddq> $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, aya<ddq> $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = $$3;
      }

      @Override
      public dfw a(bvb $$0, bac $$1) {
         Optional<jq<ddq>> $$2 = $$0.dW().K_().e(mb.aO).a(this.b, $$1);
         int $$9;
         cxg $$8;
         if (!$$2.isEmpty()) {
            jq<ddq> $$3 = $$2.get();
            ddq $$4 = $$3.a();
            int $$5 = Math.max($$4.d(), this.c);
            int $$6 = Math.min($$4.e(), this.d);
            int $$7 = azu.a($$1, $$5, $$6);
            $$8 = dds.a(new ddt($$3, $$7));
            $$9 = 2 + $$1.a(5 + $$7 * 10) + 3 * $$7;
            if ($$3.a(axn.j)) {
               $$9 *= 2;
            }

            if ($$9 > 64) {
               $$9 = 64;
            }
         } else {
            $$9 = 1;
            $$8 = new cxg(cxk.rw);
         }

         return new dfw(new dfu(cxk.pf, $$9), Optional.of(new dfu(cxk.rw)), $$8, 12, this.a, 0.2F);
      }
   }

   static class e implements cpe.g {
      private final cxg a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(cxc $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(cxc $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new cxg($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public dfw a(bvb $$0, bac $$1) {
         int $$2 = 5 + $$1.a(15);
         ke $$3 = $$0.dW().K_();
         Optional<ju.c<ddq>> $$4 = $$3.e(mb.aO).a(axn.m);
         cxg $$5 = dds.a($$1, new cxg(this.a.h()), $$2, $$3, $$4);
         int $$6 = Math.min(this.b + $$2, 64);
         dfu $$7 = new dfu(cxk.pf, $$6);
         return new dfw($$7, $$5, this.c, this.d, this.e);
      }
   }

   static class f implements cpe.g {
      @Override
      public dfw a(bvb $$0, bac $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      dfw a(bvb var1, bac var2);
   }

   static class h implements cpe.g {
      private final dfu a;
      private final int b;
      private final cxg c;
      private final int d;
      private final int e;
      private final float f;
      private final Optional<alo<dey>> g;

      public h(dgy $$0, int $$1, int $$2, cxc $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new cxg($$3), $$4, $$5, $$6, $$7);
      }

      private h(dgy $$0, int $$1, int $$2, cxg $$3, int $$4, int $$5, int $$6, float $$7) {
         this(new dfu($$0, $$1), $$2, $$3.c($$4), $$5, $$6, $$7, Optional.empty());
      }

      h(dgy $$0, int $$1, int $$2, dgy $$3, int $$4, int $$5, int $$6, float $$7, alo<dey> $$8) {
         this(new dfu($$0, $$1), $$2, new cxg($$3, $$4), $$5, $$6, $$7, Optional.of($$8));
      }

      public h(dfu $$0, int $$1, cxg $$2, int $$3, int $$4, float $$5, Optional<alo<dey>> $$6) {
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
      public dfw a(bvb $$0, bac $$1) {
         cxg $$2 = this.c.v();
         dgz $$3 = $$0.dW();
         this.g.ifPresent($$4 -> dds.a($$2, $$3.K_(), (alo<dey>)$$4, $$3.d_($$0.dw()), $$1));
         return new dfw(new dfu(cxk.pf, this.b), Optional.of(this.a), $$2, 0, this.d, this.e, this.f);
      }
   }

   static class i implements cpe.g {
      private final cxg a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;
      private final Optional<alo<dey>> f;

      public i(dkd $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cxg($$0), $$1, $$2, $$3, $$4);
      }

      public i(cxc $$0, int $$1, int $$2, int $$3) {
         this(new cxg($$0), $$1, $$2, 12, $$3);
      }

      public i(cxc $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cxg($$0), $$1, $$2, $$3, $$4);
      }

      public i(cxg $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(cxc $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new cxg($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(cxc $$0, int $$1, int $$2, int $$3, int $$4, float $$5, alo<dey> $$6) {
         this(new cxg($$0), $$1, $$2, $$3, $$4, $$5, Optional.of($$6));
      }

      public i(cxg $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this($$0, $$1, $$2, $$3, $$4, $$5, Optional.empty());
      }

      public i(cxg $$0, int $$1, int $$2, int $$3, int $$4, float $$5, Optional<alo<dey>> $$6) {
         this.a = $$0;
         this.b = $$1;
         this.a.e($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
         this.f = $$6;
      }

      @Override
      public dfw a(bvb $$0, bac $$1) {
         cxg $$2 = this.a.v();
         dgz $$3 = $$0.dW();
         this.f.ifPresent($$4 -> dds.a($$2, $$3.K_(), (alo<dey>)$$4, $$3.d_($$0.dw()), $$1));
         return new dfw(new dfu(cxk.pf, this.b), $$2, this.c, this.d, this.e);
      }
   }

   static class j implements cpe.g {
      private final dah a;
      private final int b;
      private final float c;

      public j(jq<bue> $$0, int $$1, int $$2) {
         this(new dah(List.of(new dah.a($$0, $$1))), $$2, 0.05F);
      }

      public j(dah $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public dfw a(bvb $$0, bac $$1) {
         cxg $$2 = new cxg(cxk.wW, 1);
         $$2.b(ku.R, this.a);
         return new dfw(new dfu(cxk.pf), $$2, 12, this.b, this.c);
      }
   }

   static class k implements cpe.g {
      private final cxg a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final cxc f;
      private final int g;
      private final float h;

      public k(cxc $$0, int $$1, cxc $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new cxg($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public dfw a(bvb $$0, bac $$1) {
         dfu $$2 = new dfu(cxk.pf, this.c);
         List<jq<czd>> $$3 = ma.h.c().filter($$1x -> !((czd)$$1x.a()).a().isEmpty() && $$0.dW().L().a($$1x)).collect(Collectors.toList());
         jq<czd> $$4 = ae.a($$3, $$1);
         cxg $$5 = new cxg(this.a.h(), this.b);
         $$5.b(ku.Q, new czf($$4));
         return new dfw($$2, Optional.of(new dfu(this.f, this.g)), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements cpe.g {
      private final int a;
      private final aya<eod> b;
      private final String c;
      private final jq<evf> d;
      private final int e;
      private final int f;

      public l(int $$0, aya<eod> $$1, String $$2, jq<evf> $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public dfw a(bvb $$0, bac $$1) {
         if (!($$0.dW() instanceof arx)) {
            return null;
         } else {
            arx $$2 = (arx)$$0.dW();
            jh $$3 = $$2.a(this.b, $$0.dw(), 100, true);
            if ($$3 != null) {
               cxg $$4 = cxt.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               cxt.a($$2, $$4);
               evk.a($$4, $$3, "+", this.d);
               $$4.b(ku.h, xk.c(this.c));
               return new dfw(new dfu(cxk.pf, this.a), Optional.of(new dfu(cxk.rz)), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static record m(Map<cpf, cpe.g> a) implements cpe.g {
      public static cpe.m a(cpe.g $$0, cpf... $$1) {
         return new cpe.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public dfw a(bvb $$0, bac $$1) {
         if ($$0 instanceof cpc $$2) {
            cpf $$3 = $$2.gy().a();
            cpe.g $$4 = this.a.get($$3);
            return $$4 == null ? null : $$4.a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
