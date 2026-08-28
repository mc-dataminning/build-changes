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

public class coj {
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
   public static final Map<coi, Int2ObjectMap<coj.g[]>> a = ae.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            coi.g,
            a(
               ImmutableMap.of(
                  1,
                  new coj.g[]{
                     new coj.b(cwq.px, 20, 16, 2),
                     new coj.b(cwq.uy, 26, 16, 2),
                     new coj.b(cwq.ux, 22, 16, 2),
                     new coj.b(cwq.vC, 15, 16, 2),
                     new coj.i(cwq.py, 1, 6, 16, 1)
                  },
                  2,
                  new coj.g[]{new coj.b(dis.eZ, 6, 12, 10), new coj.i(cwq.uL, 1, 4, 5), new coj.i(cwq.ov, 1, 4, 16, 5)},
                  3,
                  new coj.g[]{new coj.i(cwq.sj, 3, 18, 10), new coj.b(dis.fa, 4, 12, 20)},
                  4,
                  new coj.g[]{
                     new coj.i(dis.eg, 1, 1, 12, 15),
                     new coj.j(bts.p, 100, 15),
                     new coj.j(bts.h, 160, 15),
                     new coj.j(bts.r, 140, 15),
                     new coj.j(bts.o, 120, 15),
                     new coj.j(bts.s, 280, 15),
                     new coj.j(bts.w, 7, 15)
                  },
                  5,
                  new coj.g[]{new coj.i(cwq.uC, 3, 3, 30), new coj.i(cwq.sK, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            coi.h,
            a(
               ImmutableMap.of(
                  1,
                  new coj.g[]{
                     new coj.b(cwq.pt, 20, 16, 2),
                     new coj.b(cwq.oy, 10, 16, 2),
                     new coj.h(cwq.rq, 6, 1, cwq.ru, 6, 16, 1, 0.05F),
                     new coj.i(cwq.qI, 3, 1, 16, 1)
                  },
                  2,
                  new coj.g[]{new coj.b(cwq.rq, 15, 16, 10), new coj.h(cwq.rr, 6, 1, cwq.rv, 6, 16, 5, 0.05F), new coj.i(cwq.wP, 2, 1, 5)},
                  3,
                  new coj.g[]{new coj.b(cwq.rr, 13, 16, 20), new coj.e(cwq.rm, 3, 3, 10, 0.2F)},
                  4,
                  new coj.g[]{new coj.b(cwq.rs, 6, 12, 30)},
                  5,
                  new coj.g[]{
                     new coj.b(cwq.rt, 4, 12, 30),
                     new coj.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(cok.c, cwq.nV)
                           .put(cok.g, cwq.nX)
                           .put(cok.e, cwq.nX)
                           .put(cok.a, cwq.ob)
                           .put(cok.b, cwq.ob)
                           .put(cok.d, cwq.od)
                           .put(cok.f, cwq.oh)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            coi.n,
            a(
               ImmutableMap.of(
                  1,
                  new coj.g[]{
                     new coj.b(dis.bA, 18, 16, 2),
                     new coj.b(dis.bM, 18, 16, 2),
                     new coj.b(dis.bP, 18, 16, 2),
                     new coj.b(dis.bH, 18, 16, 2),
                     new coj.i(cwq.sm, 2, 1, 1)
                  },
                  2,
                  new coj.g[]{
                     new coj.b(cwq.rz, 12, 16, 10),
                     new coj.b(cwq.rG, 12, 16, 10),
                     new coj.b(cwq.rO, 12, 16, 10),
                     new coj.b(cwq.rC, 12, 16, 10),
                     new coj.b(cwq.rE, 12, 16, 10),
                     new coj.i(dis.bA, 1, 1, 16, 5),
                     new coj.i(dis.bB, 1, 1, 16, 5),
                     new coj.i(dis.bC, 1, 1, 16, 5),
                     new coj.i(dis.bD, 1, 1, 16, 5),
                     new coj.i(dis.bE, 1, 1, 16, 5),
                     new coj.i(dis.bF, 1, 1, 16, 5),
                     new coj.i(dis.bG, 1, 1, 16, 5),
                     new coj.i(dis.bH, 1, 1, 16, 5),
                     new coj.i(dis.bI, 1, 1, 16, 5),
                     new coj.i(dis.bJ, 1, 1, 16, 5),
                     new coj.i(dis.bK, 1, 1, 16, 5),
                     new coj.i(dis.bL, 1, 1, 16, 5),
                     new coj.i(dis.bM, 1, 1, 16, 5),
                     new coj.i(dis.bN, 1, 1, 16, 5),
                     new coj.i(dis.bO, 1, 1, 16, 5),
                     new coj.i(dis.bP, 1, 1, 16, 5),
                     new coj.i(dis.ik, 1, 4, 16, 5),
                     new coj.i(dis.il, 1, 4, 16, 5),
                     new coj.i(dis.im, 1, 4, 16, 5),
                     new coj.i(dis.in, 1, 4, 16, 5),
                     new coj.i(dis.io, 1, 4, 16, 5),
                     new coj.i(dis.ip, 1, 4, 16, 5),
                     new coj.i(dis.iq, 1, 4, 16, 5),
                     new coj.i(dis.ir, 1, 4, 16, 5),
                     new coj.i(dis.is, 1, 4, 16, 5),
                     new coj.i(dis.it, 1, 4, 16, 5),
                     new coj.i(dis.iu, 1, 4, 16, 5),
                     new coj.i(dis.iv, 1, 4, 16, 5),
                     new coj.i(dis.iw, 1, 4, 16, 5),
                     new coj.i(dis.ix, 1, 4, 16, 5),
                     new coj.i(dis.iy, 1, 4, 16, 5),
                     new coj.i(dis.iz, 1, 4, 16, 5)
                  },
                  3,
                  new coj.g[]{
                     new coj.b(cwq.rD, 12, 16, 20),
                     new coj.b(cwq.rH, 12, 16, 20),
                     new coj.b(cwq.rA, 12, 16, 20),
                     new coj.b(cwq.rN, 12, 16, 20),
                     new coj.b(cwq.rF, 12, 16, 20),
                     new coj.i(dis.aZ, 3, 1, 12, 10),
                     new coj.i(dis.bd, 3, 1, 12, 10),
                     new coj.i(dis.bn, 3, 1, 12, 10),
                     new coj.i(dis.bo, 3, 1, 12, 10),
                     new coj.i(dis.bk, 3, 1, 12, 10),
                     new coj.i(dis.bl, 3, 1, 12, 10),
                     new coj.i(dis.bi, 3, 1, 12, 10),
                     new coj.i(dis.bg, 3, 1, 12, 10),
                     new coj.i(dis.bm, 3, 1, 12, 10),
                     new coj.i(dis.bc, 3, 1, 12, 10),
                     new coj.i(dis.bh, 3, 1, 12, 10),
                     new coj.i(dis.be, 3, 1, 12, 10),
                     new coj.i(dis.bb, 3, 1, 12, 10),
                     new coj.i(dis.ba, 3, 1, 12, 10),
                     new coj.i(dis.bf, 3, 1, 12, 10),
                     new coj.i(dis.bj, 3, 1, 12, 10)
                  },
                  4,
                  new coj.g[]{
                     new coj.b(cwq.rL, 12, 16, 30),
                     new coj.b(cwq.rJ, 12, 16, 30),
                     new coj.b(cwq.rK, 12, 16, 30),
                     new coj.b(cwq.rM, 12, 16, 30),
                     new coj.b(cwq.rB, 12, 16, 30),
                     new coj.b(cwq.rI, 12, 16, 30),
                     new coj.i(cwq.vh, 3, 1, 12, 15),
                     new coj.i(cwq.vs, 3, 1, 12, 15),
                     new coj.i(cwq.vk, 3, 1, 12, 15),
                     new coj.i(cwq.vv, 3, 1, 12, 15),
                     new coj.i(cwq.vn, 3, 1, 12, 15),
                     new coj.i(cwq.vu, 3, 1, 12, 15),
                     new coj.i(cwq.vm, 3, 1, 12, 15),
                     new coj.i(cwq.vo, 3, 1, 12, 15),
                     new coj.i(cwq.vw, 3, 1, 12, 15),
                     new coj.i(cwq.vr, 3, 1, 12, 15),
                     new coj.i(cwq.vj, 3, 1, 12, 15),
                     new coj.i(cwq.vq, 3, 1, 12, 15),
                     new coj.i(cwq.vt, 3, 1, 12, 15),
                     new coj.i(cwq.vl, 3, 1, 12, 15),
                     new coj.i(cwq.vi, 3, 1, 12, 15),
                     new coj.i(cwq.vp, 3, 1, 12, 15)
                  },
                  5,
                  new coj.g[]{new coj.i(cwq.qa, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            coi.i,
            a(
               ImmutableMap.of(
                  1,
                  new coj.g[]{new coj.b(cwq.pr, 32, 16, 2), new coj.i(cwq.ox, 1, 16, 1), new coj.h(dis.L, 10, 1, cwq.pX, 10, 12, 1, 0.05F)},
                  2,
                  new coj.g[]{new coj.b(cwq.pX, 26, 12, 10), new coj.i(cwq.ow, 2, 1, 5)},
                  3,
                  new coj.g[]{new coj.b(cwq.pt, 14, 16, 20), new coj.i(cwq.wn, 3, 1, 10)},
                  4,
                  new coj.g[]{new coj.b(cwq.pu, 24, 16, 30), new coj.e(cwq.ow, 2, 3, 15)},
                  5,
                  new coj.g[]{new coj.b(cwq.mb, 8, 12, 30), new coj.e(cwq.wn, 3, 3, 15), new coj.k(cwq.ox, 5, cwq.vI, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            coi.k,
            a(
               ImmutableMap.builder()
                  .put(1, new coj.g[]{new coj.b(cwq.qP, 24, 16, 2), new coj.d(1, axf.i), new coj.i(dis.cl, 9, 1, 12, 1)})
                  .put(2, new coj.g[]{new coj.b(cwq.qQ, 4, 12, 10), new coj.d(5, axf.i), new coj.i(cwq.wL, 1, 1, 5)})
                  .put(3, new coj.g[]{new coj.b(cwq.rw, 5, 12, 20), new coj.d(10, axf.i), new coj.i(cwq.cG, 1, 4, 10)})
                  .put(4, new coj.g[]{new coj.b(cwq.uq, 2, 12, 30), new coj.d(15, axf.i), new coj.i(cwq.rn, 5, 1, 15), new coj.i(cwq.qT, 4, 1, 15)})
                  .put(5, new coj.g[]{new coj.i(cwq.vd, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            coi.e,
            a(
               ImmutableMap.of(
                  1,
                  new coj.g[]{new coj.b(cwq.qP, 24, 16, 2), new coj.i(cwq.uB, 7, 1, 1)},
                  2,
                  new coj.g[]{new coj.b(cwq.fT, 11, 16, 10), new coj.l(13, axo.d, "filled_map.monument", etl.j, 12, 5)},
                  3,
                  new coj.g[]{
                     new coj.b(cwq.qT, 1, 12, 20),
                     new coj.l(14, axo.c, "filled_map.mansion", etl.i, 12, 10),
                     new coj.l(12, axo.m, "filled_map.trial_chambers", etl.I, 12, 10)
                  },
                  4,
                  new coj.g[]{
                     new coj.i(cwq.uu, 7, 1, 15),
                     new coj.i(cwq.vh, 3, 1, 15),
                     new coj.i(cwq.vs, 3, 1, 15),
                     new coj.i(cwq.vk, 3, 1, 15),
                     new coj.i(cwq.vv, 3, 1, 15),
                     new coj.i(cwq.vn, 3, 1, 15),
                     new coj.i(cwq.vu, 3, 1, 15),
                     new coj.i(cwq.vm, 3, 1, 15),
                     new coj.i(cwq.vo, 3, 1, 15),
                     new coj.i(cwq.vw, 3, 1, 15),
                     new coj.i(cwq.vr, 3, 1, 15),
                     new coj.i(cwq.vj, 3, 1, 15),
                     new coj.i(cwq.vq, 3, 1, 15),
                     new coj.i(cwq.vt, 3, 1, 15),
                     new coj.i(cwq.vl, 3, 1, 15),
                     new coj.i(cwq.vi, 3, 1, 15),
                     new coj.i(cwq.vp, 3, 1, 15)
                  },
                  5,
                  new coj.g[]{new coj.i(cwq.wu, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            coi.f,
            a(
               ImmutableMap.of(
                  1,
                  new coj.g[]{new coj.b(cwq.sv, 32, 16, 2), new coj.i(cwq.lH, 1, 2, 1)},
                  2,
                  new coj.g[]{new coj.b(cwq.oK, 3, 12, 10), new coj.i(cwq.oC, 1, 1, 5)},
                  3,
                  new coj.g[]{new coj.b(cwq.uV, 2, 12, 20), new coj.i(dis.ec, 4, 1, 12, 10)},
                  4,
                  new coj.g[]{new coj.b(cwq.oq, 4, 12, 30), new coj.b(cwq.sB, 9, 12, 30), new coj.i(cwq.sw, 5, 1, 15)},
                  5,
                  new coj.g[]{new coj.b(cwq.sA, 22, 12, 30), new coj.i(cwq.un, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            coi.c,
            a(
               ImmutableMap.of(
                  1,
                  new coj.g[]{
                     new coj.b(cwq.oy, 15, 16, 2),
                     new coj.i(new cwm(cwq.pJ), 7, 1, 12, 1, 0.2F),
                     new coj.i(new cwm(cwq.pK), 4, 1, 12, 1, 0.2F),
                     new coj.i(new cwm(cwq.pH), 5, 1, 12, 1, 0.2F),
                     new coj.i(new cwm(cwq.pI), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new coj.g[]{
                     new coj.b(cwq.oG, 4, 12, 10),
                     new coj.i(new cwm(cwq.wK), 36, 1, 12, 5, 0.2F),
                     new coj.i(new cwm(cwq.pG), 1, 1, 12, 5, 0.2F),
                     new coj.i(new cwm(cwq.pF), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new coj.g[]{
                     new coj.b(cwq.qB, 1, 12, 20),
                     new coj.b(cwq.oA, 1, 12, 20),
                     new coj.i(new cwm(cwq.pD), 1, 1, 12, 10, 0.2F),
                     new coj.i(new cwm(cwq.pE), 4, 1, 12, 10, 0.2F),
                     new coj.i(new cwm(cwq.vK), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new coj.g[]{new coj.e(cwq.pN, 14, 3, 15, 0.2F), new coj.e(cwq.pO, 8, 3, 15, 0.2F)},
                  5,
                  new coj.g[]{new coj.e(cwq.pL, 8, 3, 30, 0.2F), new coj.e(cwq.pM, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            coi.p,
            a(
               ImmutableMap.of(
                  1,
                  new coj.g[]{new coj.b(cwq.oy, 15, 16, 2), new coj.i(new cwm(cwq.pf), 3, 1, 12, 1, 0.2F), new coj.e(cwq.pc, 2, 3, 1)},
                  2,
                  new coj.g[]{new coj.b(cwq.oG, 4, 12, 10), new coj.i(new cwm(cwq.wK), 36, 1, 12, 5, 0.2F)},
                  3,
                  new coj.g[]{new coj.b(cwq.pX, 24, 12, 20)},
                  4,
                  new coj.g[]{new coj.b(cwq.oA, 1, 12, 30), new coj.e(cwq.pk, 12, 3, 15, 0.2F)},
                  5,
                  new coj.g[]{new coj.e(cwq.ph, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            coi.o,
            a(
               ImmutableMap.of(
                  1,
                  new coj.g[]{
                     new coj.b(cwq.oy, 15, 16, 2),
                     new coj.i(new cwm(cwq.oV), 1, 1, 12, 1, 0.2F),
                     new coj.i(new cwm(cwq.oT), 1, 1, 12, 1, 0.2F),
                     new coj.i(new cwm(cwq.oU), 1, 1, 12, 1, 0.2F),
                     new coj.i(new cwm(cwq.oW), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new coj.g[]{new coj.b(cwq.oG, 4, 12, 10), new coj.i(new cwm(cwq.wK), 36, 1, 12, 5, 0.2F)},
                  3,
                  new coj.g[]{
                     new coj.b(cwq.pX, 30, 12, 20),
                     new coj.e(cwq.pf, 1, 3, 10, 0.2F),
                     new coj.e(cwq.pd, 2, 3, 10, 0.2F),
                     new coj.e(cwq.pe, 3, 3, 10, 0.2F),
                     new coj.i(new cwm(cwq.pl), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new coj.g[]{new coj.b(cwq.oA, 1, 12, 30), new coj.e(cwq.pk, 12, 3, 15, 0.2F), new coj.e(cwq.pi, 5, 3, 15, 0.2F)},
                  5,
                  new coj.g[]{new coj.e(cwq.pj, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            coi.d,
            a(
               ImmutableMap.of(
                  1,
                  new coj.g[]{new coj.b(cwq.st, 14, 16, 2), new coj.b(cwq.pY, 7, 16, 2), new coj.b(cwq.uS, 4, 16, 2), new coj.i(cwq.uU, 1, 1, 1)},
                  2,
                  new coj.g[]{new coj.b(cwq.oy, 15, 16, 2), new coj.i(cwq.pZ, 1, 5, 16, 5), new coj.i(cwq.su, 1, 8, 16, 5)},
                  3,
                  new coj.g[]{new coj.b(cwq.vf, 7, 16, 20), new coj.b(cwq.sr, 10, 16, 20)},
                  4,
                  new coj.g[]{new coj.b(cwq.qO, 10, 12, 30)},
                  5,
                  new coj.g[]{new coj.b(cwq.wN, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            coi.j,
            a(
               ImmutableMap.of(
                  1,
                  new coj.g[]{new coj.b(cwq.qE, 6, 16, 2), new coj.a(cwq.pB, 3), new coj.a(cwq.pA, 7)},
                  2,
                  new coj.g[]{new coj.b(cwq.pX, 26, 12, 10), new coj.a(cwq.pz, 5, 12, 5), new coj.a(cwq.pC, 4, 12, 5)},
                  3,
                  new coj.g[]{new coj.b(cwq.uW, 9, 12, 20), new coj.a(cwq.pA, 7)},
                  4,
                  new coj.g[]{new coj.b(cwq.oq, 4, 12, 30), new coj.a(cwq.vb, 6, 12, 15)},
                  5,
                  new coj.g[]{new coj.i(new cwm(cwq.nL), 6, 1, 12, 30, 0.2F), new coj.a(cwq.pz, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            coi.l,
            a(
               ImmutableMap.of(
                  1,
                  new coj.g[]{new coj.b(cwq.qN, 10, 16, 2), new coj.i(cwq.qM, 1, 10, 16, 1)},
                  2,
                  new coj.g[]{new coj.b(dis.b, 20, 16, 10), new coj.i(dis.eK, 1, 4, 16, 5)},
                  3,
                  new coj.g[]{
                     new coj.b(dis.c, 16, 16, 20),
                     new coj.b(dis.g, 16, 16, 20),
                     new coj.b(dis.e, 16, 16, 20),
                     new coj.i(dis.su, 1, 4, 16, 10),
                     new coj.i(dis.h, 1, 4, 16, 10),
                     new coj.i(dis.f, 1, 4, 16, 10),
                     new coj.i(dis.d, 1, 4, 16, 10)
                  },
                  4,
                  new coj.g[]{
                     new coj.b(cwq.oD, 12, 12, 30),
                     new coj.i(dis.hk, 1, 1, 12, 15),
                     new coj.i(dis.hj, 1, 1, 12, 15),
                     new coj.i(dis.hu, 1, 1, 12, 15),
                     new coj.i(dis.hm, 1, 1, 12, 15),
                     new coj.i(dis.hq, 1, 1, 12, 15),
                     new coj.i(dis.hr, 1, 1, 12, 15),
                     new coj.i(dis.hy, 1, 1, 12, 15),
                     new coj.i(dis.hx, 1, 1, 12, 15),
                     new coj.i(dis.hp, 1, 1, 12, 15),
                     new coj.i(dis.hl, 1, 1, 12, 15),
                     new coj.i(dis.ho, 1, 1, 12, 15),
                     new coj.i(dis.hw, 1, 1, 12, 15),
                     new coj.i(dis.hs, 1, 1, 12, 15),
                     new coj.i(dis.ht, 1, 1, 12, 15),
                     new coj.i(dis.hn, 1, 1, 12, 15),
                     new coj.i(dis.hv, 1, 1, 12, 15),
                     new coj.i(dis.lh, 1, 1, 12, 15),
                     new coj.i(dis.lg, 1, 1, 12, 15),
                     new coj.i(dis.lr, 1, 1, 12, 15),
                     new coj.i(dis.lj, 1, 1, 12, 15),
                     new coj.i(dis.ln, 1, 1, 12, 15),
                     new coj.i(dis.lo, 1, 1, 12, 15),
                     new coj.i(dis.lv, 1, 1, 12, 15),
                     new coj.i(dis.lu, 1, 1, 12, 15),
                     new coj.i(dis.lm, 1, 1, 12, 15),
                     new coj.i(dis.li, 1, 1, 12, 15),
                     new coj.i(dis.ll, 1, 1, 12, 15),
                     new coj.i(dis.lt, 1, 1, 12, 15),
                     new coj.i(dis.lp, 1, 1, 12, 15),
                     new coj.i(dis.lq, 1, 1, 12, 15),
                     new coj.i(dis.lk, 1, 1, 12, 15),
                     new coj.i(dis.ls, 1, 1, 12, 15)
                  },
                  5,
                  new coj.g[]{new coj.i(dis.hf, 1, 1, 12, 30), new coj.i(dis.hd, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<coj.g[]> b = a(
      ImmutableMap.of(
         1,
         new coj.g[]{
            new coj.i(cwq.cT, 2, 1, 5, 1),
            new coj.i(cwq.qR, 4, 1, 5, 1),
            new coj.i(cwq.fu, 2, 1, 5, 1),
            new coj.i(cwq.wl, 5, 1, 5, 1),
            new coj.i(cwq.cO, 1, 1, 12, 1),
            new coj.i(cwq.dJ, 1, 1, 8, 1),
            new coj.i(cwq.fk, 1, 1, 4, 1),
            new coj.i(cwq.dK, 3, 1, 12, 1),
            new coj.i(cwq.eW, 3, 1, 8, 1),
            new coj.i(cwq.dk, 1, 1, 12, 1),
            new coj.i(cwq.dl, 1, 1, 12, 1),
            new coj.i(cwq.dm, 1, 1, 8, 1),
            new coj.i(cwq.dn, 1, 1, 12, 1),
            new coj.i(cwq.do, 1, 1, 12, 1),
            new coj.i(cwq.dp, 1, 1, 12, 1),
            new coj.i(cwq.dq, 1, 1, 12, 1),
            new coj.i(cwq.dr, 1, 1, 12, 1),
            new coj.i(cwq.ds, 1, 1, 12, 1),
            new coj.i(cwq.dt, 1, 1, 12, 1),
            new coj.i(cwq.du, 1, 1, 12, 1),
            new coj.i(cwq.dv, 1, 1, 7, 1),
            new coj.i(cwq.pw, 1, 1, 12, 1),
            new coj.i(cwq.vD, 1, 1, 12, 1),
            new coj.i(cwq.sp, 1, 1, 12, 1),
            new coj.i(cwq.sq, 1, 1, 12, 1),
            new coj.i(cwq.aa, 5, 1, 8, 1),
            new coj.i(cwq.Y, 5, 1, 8, 1),
            new coj.i(cwq.ac, 5, 1, 8, 1),
            new coj.i(cwq.Z, 5, 1, 8, 1),
            new coj.i(cwq.W, 5, 1, 8, 1),
            new coj.i(cwq.X, 5, 1, 8, 1),
            new coj.i(cwq.ab, 5, 1, 8, 1),
            new coj.i(cwq.ad, 5, 1, 8, 1),
            new coj.i(cwq.rN, 1, 3, 12, 1),
            new coj.i(cwq.rz, 1, 3, 12, 1),
            new coj.i(cwq.rK, 1, 3, 12, 1),
            new coj.i(cwq.rF, 1, 3, 12, 1),
            new coj.i(cwq.rO, 1, 3, 12, 1),
            new coj.i(cwq.rM, 1, 3, 12, 1),
            new coj.i(cwq.rH, 1, 3, 12, 1),
            new coj.i(cwq.rB, 1, 3, 12, 1),
            new coj.i(cwq.rD, 1, 3, 12, 1),
            new coj.i(cwq.rG, 1, 3, 12, 1),
            new coj.i(cwq.rJ, 1, 3, 12, 1),
            new coj.i(cwq.rC, 1, 3, 12, 1),
            new coj.i(cwq.rE, 1, 3, 12, 1),
            new coj.i(cwq.rA, 1, 3, 12, 1),
            new coj.i(cwq.rL, 1, 3, 12, 1),
            new coj.i(cwq.rI, 1, 3, 12, 1),
            new coj.i(cwq.kx, 3, 1, 8, 1),
            new coj.i(cwq.ky, 3, 1, 8, 1),
            new coj.i(cwq.kz, 3, 1, 8, 1),
            new coj.i(cwq.kA, 3, 1, 8, 1),
            new coj.i(cwq.kw, 3, 1, 8, 1),
            new coj.i(cwq.fV, 1, 1, 12, 1),
            new coj.i(cwq.dA, 1, 1, 12, 1),
            new coj.i(cwq.dB, 1, 1, 12, 1),
            new coj.i(cwq.gb, 1, 2, 5, 1),
            new coj.i(cwq.dQ, 1, 2, 5, 1),
            new coj.i(cwq.af, 1, 8, 8, 1),
            new coj.i(cwq.ai, 1, 4, 6, 1),
            new coj.i(cwq.xH, 1, 2, 5, 1),
            new coj.i(cwq.F, 1, 2, 5, 1),
            new coj.i(cwq.dN, 1, 2, 5, 1)
         },
         2,
         new coj.g[]{
            new coj.i(cwq.qJ, 5, 1, 4, 1),
            new coj.i(cwq.qG, 5, 1, 4, 1),
            new coj.i(cwq.hV, 3, 1, 6, 1),
            new coj.i(cwq.kV, 6, 1, 6, 1),
            new coj.i(cwq.pv, 1, 1, 8, 1),
            new coj.i(cwq.E, 3, 3, 6, 1)
         }
      )
   );
   private static final coj.l s = new coj.l(8, axo.f, "filled_map.village_desert", etl.B, 12, 5);
   private static final coj.l t = new coj.l(8, axo.e, "filled_map.village_savanna", etl.D, 12, 5);
   private static final coj.l u = new coj.l(8, axo.g, "filled_map.village_plains", etl.C, 12, 5);
   private static final coj.l v = new coj.l(8, axo.h, "filled_map.village_taiga", etl.F, 12, 5);
   private static final coj.l w = new coj.l(8, axo.i, "filled_map.village_snowy", etl.E, 12, 5);
   private static final coj.l x = new coj.l(8, axo.j, "filled_map.explorer_jungle", etl.G, 12, 5);
   private static final coj.l y = new coj.l(8, axo.k, "filled_map.explorer_swamp", etl.H, 12, 5);
   public static final Map<coi, Int2ObjectMap<coj.g[]>> c = Map.of(
      coi.k,
      a(
         ImmutableMap.builder()
            .put(1, new coj.g[]{new coj.b(cwq.qP, 24, 16, 2), a(1), new coj.i(dis.cl, 9, 1, 12, 1)})
            .put(2, new coj.g[]{new coj.b(cwq.qQ, 4, 12, 10), a(5), new coj.i(cwq.wL, 1, 1, 5)})
            .put(3, new coj.g[]{new coj.b(cwq.rw, 5, 12, 20), a(10), new coj.i(cwq.cG, 1, 4, 10)})
            .put(4, new coj.g[]{new coj.b(cwq.uq, 2, 12, 30), new coj.i(cwq.rn, 5, 1, 15), new coj.i(cwq.qT, 4, 1, 15)})
            .put(5, new coj.g[]{a(), new coj.i(cwq.vd, 20, 1, 30)})
            .build()
      ),
      coi.c,
      a(
         ImmutableMap.builder()
            .put(1, new coj.g[]{new coj.b(cwq.oy, 15, 12, 2), new coj.b(cwq.oG, 5, 12, 2)})
            .put(
               2,
               new coj.g[]{
                  coj.m.a(new coj.i(cwq.pK, 4, 1, 12, 5, 0.05F), cok.a, cok.c, cok.d, cok.e, cok.g),
                  coj.m.a(new coj.i(cwq.pG, 4, 1, 12, 5, 0.05F), cok.b, cok.f),
                  coj.m.a(new coj.i(cwq.pH, 5, 1, 12, 5, 0.05F), cok.a, cok.c, cok.d, cok.e, cok.g),
                  coj.m.a(new coj.i(cwq.pD, 5, 1, 12, 5, 0.05F), cok.b, cok.f),
                  coj.m.a(new coj.i(cwq.pJ, 7, 1, 12, 5, 0.05F), cok.a, cok.c, cok.d, cok.e, cok.g),
                  coj.m.a(new coj.i(cwq.pF, 7, 1, 12, 5, 0.05F), cok.b, cok.f),
                  coj.m.a(new coj.i(cwq.pI, 9, 1, 12, 5, 0.05F), cok.a, cok.c, cok.d, cok.e, cok.g),
                  coj.m.a(new coj.i(cwq.pE, 9, 1, 12, 5, 0.05F), cok.b, cok.f)
               }
            )
            .put(3, new coj.g[]{new coj.b(cwq.qB, 1, 12, 20), new coj.i(cwq.vK, 5, 1, 12, 10, 0.05F), new coj.i(cwq.wK, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new coj.g[]{
                  coj.m.a(new coj.i(cwq.pK, 8, 1, 3, 15, 0.05F, ddq.a), cok.a),
                  coj.m.a(new coj.i(cwq.pH, 9, 1, 3, 15, 0.05F, ddq.d), cok.a),
                  coj.m.a(new coj.i(cwq.pJ, 11, 1, 3, 15, 0.05F, ddq.b), cok.a),
                  coj.m.a(new coj.i(cwq.pI, 13, 1, 3, 15, 0.05F, ddq.c), cok.a),
                  coj.m.a(new coj.i(cwq.pK, 8, 1, 3, 15, 0.05F, ddq.g), cok.c),
                  coj.m.a(new coj.i(cwq.pH, 9, 1, 3, 15, 0.05F, ddq.j), cok.c),
                  coj.m.a(new coj.i(cwq.pJ, 11, 1, 3, 15, 0.05F, ddq.h), cok.c),
                  coj.m.a(new coj.i(cwq.pI, 13, 1, 3, 15, 0.05F, ddq.i), cok.c),
                  coj.m.a(new coj.i(cwq.pK, 2, 1, 3, 15, 0.05F, ddq.m), cok.d),
                  coj.m.a(new coj.i(cwq.pH, 3, 1, 3, 15, 0.05F, ddq.p), cok.d),
                  coj.m.a(new coj.i(cwq.pJ, 5, 1, 3, 15, 0.05F, ddq.n), cok.d),
                  coj.m.a(new coj.i(cwq.pI, 7, 1, 3, 15, 0.05F, ddq.o), cok.d),
                  coj.m.a(new coj.i(cwq.pK, 8, 1, 3, 15, 0.05F, ddq.s), cok.e),
                  coj.m.a(new coj.i(cwq.pH, 9, 1, 3, 15, 0.05F, ddq.t), cok.e),
                  coj.m.a(new coj.i(cwq.pG, 8, 1, 3, 15, 0.05F, ddq.w), cok.b),
                  coj.m.a(new coj.i(cwq.pD, 9, 1, 3, 15, 0.05F, ddq.z), cok.b),
                  coj.m.a(new coj.i(cwq.pF, 11, 1, 3, 15, 0.05F, ddq.x), cok.b),
                  coj.m.a(new coj.i(cwq.pE, 13, 1, 3, 15, 0.05F, ddq.y), cok.b),
                  coj.m.a(new coj.i(cwq.pG, 8, 1, 3, 15, 0.05F, ddq.C), cok.f),
                  coj.m.a(new coj.i(cwq.pD, 9, 1, 3, 15, 0.05F, ddq.F), cok.f),
                  coj.m.a(new coj.i(cwq.pF, 11, 1, 3, 15, 0.05F, ddq.D), cok.f),
                  coj.m.a(new coj.i(cwq.pE, 13, 1, 3, 15, 0.05F, ddq.E), cok.f),
                  coj.m.a(new coj.h(cwq.pO, 1, 4, cwq.pN, 1, 3, 15, 0.05F), cok.g),
                  coj.m.a(new coj.h(cwq.pN, 1, 4, cwq.pM, 1, 3, 15, 0.05F), cok.g),
                  coj.m.a(new coj.h(cwq.pL, 1, 4, cwq.pO, 1, 3, 15, 0.05F), cok.g),
                  coj.m.a(new coj.h(cwq.pM, 1, 2, cwq.pL, 1, 3, 15, 0.05F), cok.g)
               }
            )
            .put(
               5,
               new coj.g[]{
                  coj.m.a(new coj.h(cwq.oA, 4, 16, cwq.pM, 1, 3, 30, 0.05F, ddq.f), cok.a),
                  coj.m.a(new coj.h(cwq.oA, 3, 16, cwq.pN, 1, 3, 30, 0.05F, ddq.e), cok.a),
                  coj.m.a(new coj.h(cwq.oA, 3, 16, cwq.pN, 1, 3, 30, 0.05F, ddq.l), cok.c),
                  coj.m.a(new coj.h(cwq.oA, 2, 12, cwq.pO, 1, 3, 30, 0.05F, ddq.k), cok.c),
                  coj.m.a(new coj.h(cwq.oA, 2, 6, cwq.pL, 1, 3, 30, 0.05F, ddq.r), cok.d),
                  coj.m.a(new coj.h(cwq.oA, 3, 8, cwq.pM, 1, 3, 30, 0.05F, ddq.q), cok.d),
                  coj.m.a(new coj.h(cwq.oA, 2, 12, cwq.pO, 1, 3, 30, 0.05F, ddq.u), cok.e),
                  coj.m.a(new coj.h(cwq.oA, 3, 12, cwq.pL, 1, 3, 30, 0.05F, ddq.v), cok.e),
                  coj.m.a(new coj.i(cwq.pD, 9, 1, 3, 30, 0.05F, ddq.B), cok.b),
                  coj.m.a(new coj.i(cwq.pG, 8, 1, 3, 30, 0.05F, ddq.A), cok.b),
                  coj.m.a(new coj.i(cwq.pD, 9, 1, 3, 30, 0.05F, ddq.H), cok.f),
                  coj.m.a(new coj.i(cwq.pG, 8, 1, 3, 30, 0.05F, ddq.G), cok.f),
                  coj.m.a(new coj.h(cwq.oA, 4, 18, cwq.pM, 1, 3, 30, 0.05F, ddq.J), cok.g),
                  coj.m.a(new coj.h(cwq.oA, 3, 18, cwq.pN, 1, 3, 30, 0.05F, ddq.I), cok.g),
                  coj.m.a(new coj.b(cwq.aN, 1, 12, 30, 42), cok.g),
                  coj.m.a(new coj.b(cwq.aK, 1, 12, 30, 4), cok.a, cok.b, cok.c, cok.d, cok.e, cok.f)
               }
            )
            .build()
      ),
      coi.e,
      a(
         ImmutableMap.of(
            1,
            new coj.g[]{new coj.b(cwq.qP, 24, 16, 2), new coj.i(cwq.uB, 7, 1, 1)},
            2,
            new coj.g[]{
               new coj.b(cwq.fT, 11, 16, 10),
               new coj.m(ImmutableMap.builder().put(cok.a, t).put(cok.d, u).put(cok.c, v).put(cok.g, w).put(cok.e, u).put(cok.b, t).put(cok.f, w).build()),
               new coj.m(ImmutableMap.builder().put(cok.a, u).put(cok.d, s).put(cok.c, t).put(cok.g, u).put(cok.e, v).put(cok.b, s).put(cok.f, v).build()),
               new coj.m(
                  ImmutableMap.builder().put(cok.a, x).put(cok.d, x).put(cok.c, new coj.f()).put(cok.g, y).put(cok.e, y).put(cok.b, y).put(cok.f, x).build()
               )
            },
            3,
            new coj.g[]{
               new coj.b(cwq.qT, 1, 12, 20),
               new coj.l(13, axo.d, "filled_map.monument", etl.j, 12, 10),
               new coj.l(12, axo.m, "filled_map.trial_chambers", etl.I, 12, 10)
            },
            4,
            new coj.g[]{
               new coj.i(cwq.uu, 7, 1, 15),
               new coj.i(cwq.vh, 3, 1, 15),
               new coj.i(cwq.vs, 3, 1, 15),
               new coj.i(cwq.vk, 3, 1, 15),
               new coj.i(cwq.vv, 3, 1, 15),
               new coj.i(cwq.vn, 3, 1, 15),
               new coj.i(cwq.vu, 3, 1, 15),
               new coj.i(cwq.vm, 3, 1, 15),
               new coj.i(cwq.vo, 3, 1, 15),
               new coj.i(cwq.vw, 3, 1, 15),
               new coj.i(cwq.vr, 3, 1, 15),
               new coj.i(cwq.vj, 3, 1, 15),
               new coj.i(cwq.vq, 3, 1, 15),
               new coj.i(cwq.vt, 3, 1, 15),
               new coj.i(cwq.vl, 3, 1, 15),
               new coj.i(cwq.vi, 3, 1, 15),
               new coj.i(cwq.vp, 3, 1, 15)
            },
            5,
            new coj.g[]{new coj.i(cwq.wu, 8, 1, 30), new coj.l(14, axo.c, "filled_map.mansion", etl.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<coj.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new coj.g[]{
               new coj.b(a(cym.a), 1, 1, 1),
               new coj.b(cwq.qA, 1, 1, 1, 2),
               new coj.b(cwq.qF, 1, 1, 1, 2),
               new coj.b(cwq.sE, 1, 1, 1, 3),
               new coj.b(cwq.uz, 4, 1, 1),
               new coj.b(cwq.hD, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new coj.g[]{
               new coj.i(cwq.hV, 1, 1, 6, 1),
               new coj.i(cwq.kV, 6, 1, 6, 1),
               new coj.i(cwq.pv, 1, 4, 2, 1),
               new coj.i(cwq.E, 3, 3, 6, 1),
               new coj.i(dis.Y, 1, 8, 4, 1),
               new coj.i(dis.W, 1, 8, 4, 1),
               new coj.i(dis.aa, 1, 8, 4, 1),
               new coj.i(dis.X, 1, 8, 4, 1),
               new coj.i(dis.U, 1, 8, 4, 1),
               new coj.i(dis.V, 1, 8, 4, 1),
               new coj.i(dis.Z, 1, 8, 4, 1),
               new coj.e(cwq.pe, 1, 1, 1, 0.2F),
               new coj.i(b(cym.h), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new coj.g[]{
               new coj.i(cwq.qJ, 3, 1, 4, 1),
               new coj.i(cwq.qG, 3, 1, 4, 1),
               new coj.i(cwq.cT, 2, 1, 5, 1),
               new coj.i(cwq.qR, 4, 1, 5, 1),
               new coj.i(cwq.fu, 2, 1, 5, 1),
               new coj.i(cwq.wl, 5, 1, 5, 1),
               new coj.i(cwq.cO, 1, 1, 12, 1),
               new coj.i(cwq.dJ, 1, 1, 8, 1),
               new coj.i(cwq.fk, 1, 1, 4, 1),
               new coj.i(cwq.dK, 3, 1, 12, 1),
               new coj.i(cwq.eW, 3, 1, 8, 1),
               new coj.i(cwq.dk, 1, 1, 12, 1),
               new coj.i(cwq.dl, 1, 1, 12, 1),
               new coj.i(cwq.dm, 1, 1, 8, 1),
               new coj.i(cwq.dn, 1, 1, 12, 1),
               new coj.i(cwq.do, 1, 1, 12, 1),
               new coj.i(cwq.dp, 1, 1, 12, 1),
               new coj.i(cwq.dq, 1, 1, 12, 1),
               new coj.i(cwq.dr, 1, 1, 12, 1),
               new coj.i(cwq.ds, 1, 1, 12, 1),
               new coj.i(cwq.dt, 1, 1, 12, 1),
               new coj.i(cwq.du, 1, 1, 12, 1),
               new coj.i(cwq.dv, 1, 1, 7, 1),
               new coj.i(cwq.pw, 1, 1, 12, 1),
               new coj.i(cwq.vD, 1, 1, 12, 1),
               new coj.i(cwq.sp, 1, 1, 12, 1),
               new coj.i(cwq.sq, 1, 1, 12, 1),
               new coj.i(cwq.aa, 5, 1, 8, 1),
               new coj.i(cwq.Y, 5, 1, 8, 1),
               new coj.i(cwq.ac, 5, 1, 8, 1),
               new coj.i(cwq.Z, 5, 1, 8, 1),
               new coj.i(cwq.W, 5, 1, 8, 1),
               new coj.i(cwq.X, 5, 1, 8, 1),
               new coj.i(cwq.ab, 5, 1, 8, 1),
               new coj.i(cwq.ad, 5, 1, 8, 1),
               new coj.i(cwq.rN, 1, 3, 12, 1),
               new coj.i(cwq.rz, 1, 3, 12, 1),
               new coj.i(cwq.rK, 1, 3, 12, 1),
               new coj.i(cwq.rF, 1, 3, 12, 1),
               new coj.i(cwq.rO, 1, 3, 12, 1),
               new coj.i(cwq.rM, 1, 3, 12, 1),
               new coj.i(cwq.rH, 1, 3, 12, 1),
               new coj.i(cwq.rB, 1, 3, 12, 1),
               new coj.i(cwq.rD, 1, 3, 12, 1),
               new coj.i(cwq.rG, 1, 3, 12, 1),
               new coj.i(cwq.rJ, 1, 3, 12, 1),
               new coj.i(cwq.rC, 1, 3, 12, 1),
               new coj.i(cwq.rE, 1, 3, 12, 1),
               new coj.i(cwq.rA, 1, 3, 12, 1),
               new coj.i(cwq.rL, 1, 3, 12, 1),
               new coj.i(cwq.rI, 1, 3, 12, 1),
               new coj.i(cwq.kx, 3, 1, 8, 1),
               new coj.i(cwq.ky, 3, 1, 8, 1),
               new coj.i(cwq.kz, 3, 1, 8, 1),
               new coj.i(cwq.kA, 3, 1, 8, 1),
               new coj.i(cwq.kw, 3, 1, 8, 1),
               new coj.i(cwq.fV, 1, 3, 4, 1),
               new coj.i(cwq.dA, 1, 3, 4, 1),
               new coj.i(cwq.dB, 1, 3, 4, 1),
               new coj.i(cwq.gb, 1, 5, 2, 1),
               new coj.i(cwq.dQ, 1, 2, 5, 1),
               new coj.i(cwq.af, 1, 8, 8, 1),
               new coj.i(cwq.ai, 1, 4, 6, 1),
               new coj.i(cwq.xH, 1, 2, 5, 1),
               new coj.i(cwq.F, 1, 2, 5, 1),
               new coj.i(cwq.dN, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static coj.g a(int $$0) {
      return new coj.m(
         ImmutableMap.builder()
            .put(cok.a, new coj.d($$0, axf.w))
            .put(cok.b, new coj.d($$0, axf.x))
            .put(cok.c, new coj.d($$0, axf.y))
            .put(cok.d, new coj.d($$0, axf.z))
            .put(cok.e, new coj.d($$0, axf.A))
            .put(cok.f, new coj.d($$0, axf.B))
            .put(cok.g, new coj.d($$0, axf.C))
            .build()
      );
   }

   private static coj.g a() {
      return new coj.m(
         ImmutableMap.builder()
            .put(cok.a, new coj.d(30, 3, 3, axf.D))
            .put(cok.b, new coj.d(30, 2, 2, axf.E))
            .put(cok.c, new coj.d(30, 3, 3, axf.F))
            .put(cok.d, new coj.d(30, 3, 3, axf.G))
            .put(cok.e, new coj.d(30, axf.H))
            .put(cok.f, new coj.d(30, axf.I))
            .put(cok.g, new coj.d(30, 2, 2, axf.J))
            .build()
      );
   }

   private static Int2ObjectMap<coj.g[]> a(ImmutableMap<Integer, coj.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static deh a(jq<cyj> $$0) {
      return new deh(cwq.sC).a($$1 -> $$1.a(ku.Q, new cyl($$0)));
   }

   private static cwm b(jq<cyj> $$0) {
      return cyl.a(cwq.sC, $$0);
   }

   static class a implements coj.g {
      private final cwi a;
      private final int b;
      private final int c;
      private final int d;

      public a(cwi $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(cwi $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public dej a(bul $$0, azu $$1) {
         deh $$2 = new deh(cwq.oB, this.b);
         cwm $$3 = new cwm(this.a);
         if ($$3.a(axl.bQ)) {
            List<cvk> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = cza.a($$3, $$4);
         }

         return new dej($$2, $$3, this.c, this.d, 0.2F);
      }

      private static cvk a(azu $$0) {
         return cvk.a(cvj.a($$0.a(16)));
      }
   }

   static class b implements coj.g {
      private final deh a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(dfl $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(dfl $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new deh($$0.j(), $$1), $$2, $$3, $$4);
      }

      public b(deh $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public dej a(bul $$0, azu $$1) {
         return new dej(this.a, new cwm(cwq.oB, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements coj.g {
      private final Map<cok, cwi> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<cok, cwi> $$3) {
         lz.w.s().filter($$1x -> !$$3.containsKey($$1x)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + lz.w.b($$0x));
         });
         this.a = $$3;
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Nullable
      @Override
      public dej a(bul $$0, azu $$1) {
         if ($$0 instanceof coh $$2) {
            deh $$3 = new deh(this.a.get($$2.gx().a()), this.b);
            return new dej($$3, new cwm(cwq.oB), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements coj.g {
      private final int a;
      private final axs<dcd> b;
      private final int c;
      private final int d;

      public d(int $$0, axs<dcd> $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, axs<dcd> $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = $$3;
      }

      @Override
      public dej a(bul $$0, azu $$1) {
         Optional<jq<dcd>> $$2 = $$0.dV().J_().e(ma.aM).a(this.b, $$1);
         int $$9;
         cwm $$8;
         if (!$$2.isEmpty()) {
            jq<dcd> $$3 = $$2.get();
            dcd $$4 = $$3.a();
            int $$5 = Math.max($$4.d(), this.c);
            int $$6 = Math.min($$4.e(), this.d);
            int $$7 = azm.a($$1, $$5, $$6);
            $$8 = dcf.a(new dcg($$3, $$7));
            $$9 = 2 + $$1.a(5 + $$7 * 10) + 3 * $$7;
            if ($$3.a(axf.j)) {
               $$9 *= 2;
            }

            if ($$9 > 64) {
               $$9 = 64;
            }
         } else {
            $$9 = 1;
            $$8 = new cwm(cwq.qQ);
         }

         return new dej(new deh(cwq.oB, $$9), Optional.of(new deh(cwq.qQ)), $$8, 12, this.a, 0.2F);
      }
   }

   static class e implements coj.g {
      private final cwm a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(cwi $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(cwi $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new cwm($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public dej a(bul $$0, azu $$1) {
         int $$2 = 5 + $$1.a(15);
         ke $$3 = $$0.dV().J_();
         Optional<ju.c<dcd>> $$4 = $$3.e(ma.aM).a(axf.m);
         cwm $$5 = dcf.a($$1, new cwm(this.a.h()), $$2, $$3, $$4);
         int $$6 = Math.min(this.b + $$2, 64);
         deh $$7 = new deh(cwq.oB, $$6);
         return new dej($$7, $$5, this.c, this.d, this.e);
      }
   }

   static class f implements coj.g {
      @Override
      public dej a(bul $$0, azu $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      dej a(bul var1, azu var2);
   }

   static class h implements coj.g {
      private final deh a;
      private final int b;
      private final cwm c;
      private final int d;
      private final int e;
      private final float f;
      private final Optional<ali<ddl>> g;

      public h(dfl $$0, int $$1, int $$2, cwi $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new cwm($$3), $$4, $$5, $$6, $$7);
      }

      private h(dfl $$0, int $$1, int $$2, cwm $$3, int $$4, int $$5, int $$6, float $$7) {
         this(new deh($$0, $$1), $$2, $$3.c($$4), $$5, $$6, $$7, Optional.empty());
      }

      h(dfl $$0, int $$1, int $$2, dfl $$3, int $$4, int $$5, int $$6, float $$7, ali<ddl> $$8) {
         this(new deh($$0, $$1), $$2, new cwm($$3, $$4), $$5, $$6, $$7, Optional.of($$8));
      }

      public h(deh $$0, int $$1, cwm $$2, int $$3, int $$4, float $$5, Optional<ali<ddl>> $$6) {
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
      public dej a(bul $$0, azu $$1) {
         cwm $$2 = this.c.v();
         dfm $$3 = $$0.dV();
         this.g.ifPresent($$4 -> dcf.a($$2, $$3.J_(), (ali<ddl>)$$4, $$3.d_($$0.dv()), $$1));
         return new dej(new deh(cwq.oB, this.b), Optional.of(this.a), $$2, 0, this.d, this.e, this.f);
      }
   }

   static class i implements coj.g {
      private final cwm a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;
      private final Optional<ali<ddl>> f;

      public i(diq $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cwm($$0), $$1, $$2, $$3, $$4);
      }

      public i(cwi $$0, int $$1, int $$2, int $$3) {
         this(new cwm($$0), $$1, $$2, 12, $$3);
      }

      public i(cwi $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cwm($$0), $$1, $$2, $$3, $$4);
      }

      public i(cwm $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(cwi $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new cwm($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(cwi $$0, int $$1, int $$2, int $$3, int $$4, float $$5, ali<ddl> $$6) {
         this(new cwm($$0), $$1, $$2, $$3, $$4, $$5, Optional.of($$6));
      }

      public i(cwm $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this($$0, $$1, $$2, $$3, $$4, $$5, Optional.empty());
      }

      public i(cwm $$0, int $$1, int $$2, int $$3, int $$4, float $$5, Optional<ali<ddl>> $$6) {
         this.a = $$0;
         this.b = $$1;
         this.a.e($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
         this.f = $$6;
      }

      @Override
      public dej a(bul $$0, azu $$1) {
         cwm $$2 = this.a.v();
         dfm $$3 = $$0.dV();
         this.f.ifPresent($$4 -> dcf.a($$2, $$3.J_(), (ali<ddl>)$$4, $$3.d_($$0.dv()), $$1));
         return new dej(new deh(cwq.oB, this.b), $$2, this.c, this.d, this.e);
      }
   }

   static class j implements coj.g {
      private final czn a;
      private final int b;
      private final float c;

      public j(jq<bto> $$0, int $$1, int $$2) {
         this(new czn(List.of(new czn.a($$0, $$1))), $$2, 0.05F);
      }

      public j(czn $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public dej a(bul $$0, azu $$1) {
         cwm $$2 = new cwm(cwq.wo, 1);
         $$2.b(ku.R, this.a);
         return new dej(new deh(cwq.oB), $$2, 12, this.b, this.c);
      }
   }

   static class k implements coj.g {
      private final cwm a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final cwi f;
      private final int g;
      private final float h;

      public k(cwi $$0, int $$1, cwi $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new cwm($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public dej a(bul $$0, azu $$1) {
         deh $$2 = new deh(cwq.oB, this.c);
         List<jq<cyj>> $$3 = lz.h.c().filter($$1x -> !((cyj)$$1x.a()).a().isEmpty() && $$0.dV().K().a($$1x)).collect(Collectors.toList());
         jq<cyj> $$4 = ae.a($$3, $$1);
         cwm $$5 = new cwm(this.a.h(), this.b);
         $$5.b(ku.Q, new cyl($$4));
         return new dej($$2, Optional.of(new deh(this.f, this.g)), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements coj.g {
      private final int a;
      private final axs<emi> b;
      private final String c;
      private final jq<etk> d;
      private final int e;
      private final int f;

      public l(int $$0, axs<emi> $$1, String $$2, jq<etk> $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public dej a(bul $$0, azu $$1) {
         if (!($$0.dV() instanceof arp)) {
            return null;
         } else {
            arp $$2 = (arp)$$0.dV();
            jh $$3 = $$2.a(this.b, $$0.dv(), 100, true);
            if ($$3 != null) {
               cwm $$4 = cwz.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               cwz.a($$2, $$4);
               etp.a($$4, $$3, "+", this.d);
               $$4.b(ku.h, xj.c(this.c));
               return new dej(new deh(cwq.oB, this.a), Optional.of(new deh(cwq.qT)), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static record m(Map<cok, coj.g> a) implements coj.g {
      public static coj.m a(coj.g $$0, cok... $$1) {
         return new coj.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public dej a(bul $$0, azu $$1) {
         if ($$0 instanceof coh $$2) {
            cok $$3 = $$2.gx().a();
            coj.g $$4 = this.a.get($$3);
            return $$4 == null ? null : $$4.a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
