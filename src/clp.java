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
   public static final Map<clo, Int2ObjectMap<clp.g[]>> a = ac.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            clo.g,
            a(
               ImmutableMap.of(
                  1,
                  new clp.g[]{
                     new clp.b(ctt.pw, 20, 16, 2),
                     new clp.b(ctt.ug, 26, 16, 2),
                     new clp.b(ctt.uf, 22, 16, 2),
                     new clp.b(ctt.vk, 15, 16, 2),
                     new clp.i(ctt.px, 1, 6, 16, 1)
                  },
                  2,
                  new clp.g[]{new clp.b(dec.eZ, 6, 12, 10), new clp.i(ctt.ut, 1, 4, 5), new clp.i(ctt.ot, 1, 4, 16, 5)},
                  3,
                  new clp.g[]{new clp.i(ctt.rS, 3, 18, 10), new clp.b(dec.fa, 4, 12, 20)},
                  4,
                  new clp.g[]{
                     new clp.i(dec.eg, 1, 1, 12, 15),
                     new clp.j(brg.p, 100, 15),
                     new clp.j(brg.h, 160, 15),
                     new clp.j(brg.r, 140, 15),
                     new clp.j(brg.o, 120, 15),
                     new clp.j(brg.s, 280, 15),
                     new clp.j(brg.w, 7, 15)
                  },
                  5,
                  new clp.g[]{new clp.i(ctt.uk, 3, 3, 30), new clp.i(ctt.st, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            clo.h,
            a(
               ImmutableMap.of(
                  1,
                  new clp.g[]{
                     new clp.b(ctt.ps, 20, 16, 2),
                     new clp.b(ctt.ow, 10, 16, 2),
                     new clp.h(ctt.qZ, 6, 1, ctt.rd, 6, 16, 1, 0.05F),
                     new clp.i(ctt.qH, 3, 1, 16, 1)
                  },
                  2,
                  new clp.g[]{new clp.b(ctt.qZ, 15, 16, 10), new clp.h(ctt.ra, 6, 1, ctt.re, 6, 16, 5, 0.05F), new clp.i(ctt.wt, 2, 1, 5)},
                  3,
                  new clp.g[]{new clp.b(ctt.ra, 13, 16, 20), new clp.e(ctt.qV, 3, 3, 10, 0.2F)},
                  4,
                  new clp.g[]{new clp.b(ctt.rb, 6, 12, 30)},
                  5,
                  new clp.g[]{
                     new clp.b(ctt.rc, 4, 12, 30),
                     new clp.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(clq.c, ctt.nU)
                           .put(clq.g, ctt.nW)
                           .put(clq.e, ctt.nW)
                           .put(clq.a, ctt.oa)
                           .put(clq.b, ctt.oa)
                           .put(clq.d, ctt.oc)
                           .put(clq.f, ctt.og)
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
                     new clp.b(dec.bA, 18, 16, 2),
                     new clp.b(dec.bM, 18, 16, 2),
                     new clp.b(dec.bP, 18, 16, 2),
                     new clp.b(dec.bH, 18, 16, 2),
                     new clp.i(ctt.rV, 2, 1, 1)
                  },
                  2,
                  new clp.g[]{
                     new clp.b(ctt.ri, 12, 16, 10),
                     new clp.b(ctt.rp, 12, 16, 10),
                     new clp.b(ctt.rx, 12, 16, 10),
                     new clp.b(ctt.rl, 12, 16, 10),
                     new clp.b(ctt.rn, 12, 16, 10),
                     new clp.i(dec.bA, 1, 1, 16, 5),
                     new clp.i(dec.bB, 1, 1, 16, 5),
                     new clp.i(dec.bC, 1, 1, 16, 5),
                     new clp.i(dec.bD, 1, 1, 16, 5),
                     new clp.i(dec.bE, 1, 1, 16, 5),
                     new clp.i(dec.bF, 1, 1, 16, 5),
                     new clp.i(dec.bG, 1, 1, 16, 5),
                     new clp.i(dec.bH, 1, 1, 16, 5),
                     new clp.i(dec.bI, 1, 1, 16, 5),
                     new clp.i(dec.bJ, 1, 1, 16, 5),
                     new clp.i(dec.bK, 1, 1, 16, 5),
                     new clp.i(dec.bL, 1, 1, 16, 5),
                     new clp.i(dec.bM, 1, 1, 16, 5),
                     new clp.i(dec.bN, 1, 1, 16, 5),
                     new clp.i(dec.bO, 1, 1, 16, 5),
                     new clp.i(dec.bP, 1, 1, 16, 5),
                     new clp.i(dec.ik, 1, 4, 16, 5),
                     new clp.i(dec.il, 1, 4, 16, 5),
                     new clp.i(dec.im, 1, 4, 16, 5),
                     new clp.i(dec.in, 1, 4, 16, 5),
                     new clp.i(dec.io, 1, 4, 16, 5),
                     new clp.i(dec.ip, 1, 4, 16, 5),
                     new clp.i(dec.iq, 1, 4, 16, 5),
                     new clp.i(dec.ir, 1, 4, 16, 5),
                     new clp.i(dec.is, 1, 4, 16, 5),
                     new clp.i(dec.it, 1, 4, 16, 5),
                     new clp.i(dec.iu, 1, 4, 16, 5),
                     new clp.i(dec.iv, 1, 4, 16, 5),
                     new clp.i(dec.iw, 1, 4, 16, 5),
                     new clp.i(dec.ix, 1, 4, 16, 5),
                     new clp.i(dec.iy, 1, 4, 16, 5),
                     new clp.i(dec.iz, 1, 4, 16, 5)
                  },
                  3,
                  new clp.g[]{
                     new clp.b(ctt.rm, 12, 16, 20),
                     new clp.b(ctt.rq, 12, 16, 20),
                     new clp.b(ctt.rj, 12, 16, 20),
                     new clp.b(ctt.rw, 12, 16, 20),
                     new clp.b(ctt.ro, 12, 16, 20),
                     new clp.i(dec.aZ, 3, 1, 12, 10),
                     new clp.i(dec.bd, 3, 1, 12, 10),
                     new clp.i(dec.bn, 3, 1, 12, 10),
                     new clp.i(dec.bo, 3, 1, 12, 10),
                     new clp.i(dec.bk, 3, 1, 12, 10),
                     new clp.i(dec.bl, 3, 1, 12, 10),
                     new clp.i(dec.bi, 3, 1, 12, 10),
                     new clp.i(dec.bg, 3, 1, 12, 10),
                     new clp.i(dec.bm, 3, 1, 12, 10),
                     new clp.i(dec.bc, 3, 1, 12, 10),
                     new clp.i(dec.bh, 3, 1, 12, 10),
                     new clp.i(dec.be, 3, 1, 12, 10),
                     new clp.i(dec.bb, 3, 1, 12, 10),
                     new clp.i(dec.ba, 3, 1, 12, 10),
                     new clp.i(dec.bf, 3, 1, 12, 10),
                     new clp.i(dec.bj, 3, 1, 12, 10)
                  },
                  4,
                  new clp.g[]{
                     new clp.b(ctt.ru, 12, 16, 30),
                     new clp.b(ctt.rs, 12, 16, 30),
                     new clp.b(ctt.rt, 12, 16, 30),
                     new clp.b(ctt.rv, 12, 16, 30),
                     new clp.b(ctt.rk, 12, 16, 30),
                     new clp.b(ctt.rr, 12, 16, 30),
                     new clp.i(ctt.uP, 3, 1, 12, 15),
                     new clp.i(ctt.va, 3, 1, 12, 15),
                     new clp.i(ctt.uS, 3, 1, 12, 15),
                     new clp.i(ctt.vd, 3, 1, 12, 15),
                     new clp.i(ctt.uV, 3, 1, 12, 15),
                     new clp.i(ctt.vc, 3, 1, 12, 15),
                     new clp.i(ctt.uU, 3, 1, 12, 15),
                     new clp.i(ctt.uW, 3, 1, 12, 15),
                     new clp.i(ctt.ve, 3, 1, 12, 15),
                     new clp.i(ctt.uZ, 3, 1, 12, 15),
                     new clp.i(ctt.uR, 3, 1, 12, 15),
                     new clp.i(ctt.uY, 3, 1, 12, 15),
                     new clp.i(ctt.vb, 3, 1, 12, 15),
                     new clp.i(ctt.uT, 3, 1, 12, 15),
                     new clp.i(ctt.uQ, 3, 1, 12, 15),
                     new clp.i(ctt.uX, 3, 1, 12, 15)
                  },
                  5,
                  new clp.g[]{new clp.i(ctt.pZ, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            clo.i,
            a(
               ImmutableMap.of(
                  1,
                  new clp.g[]{new clp.b(ctt.pp, 32, 16, 2), new clp.i(ctt.ov, 1, 16, 1), new clp.h(dec.L, 10, 1, ctt.pW, 10, 12, 1, 0.05F)},
                  2,
                  new clp.g[]{new clp.b(ctt.pW, 26, 12, 10), new clp.i(ctt.ou, 2, 1, 5)},
                  3,
                  new clp.g[]{new clp.b(ctt.ps, 14, 16, 20), new clp.i(ctt.vT, 3, 1, 10)},
                  4,
                  new clp.g[]{new clp.b(ctt.pt, 24, 16, 30), new clp.e(ctt.ou, 2, 3, 15)},
                  5,
                  new clp.g[]{new clp.b(ctt.mb, 8, 12, 30), new clp.e(ctt.vT, 3, 3, 15), new clp.k(ctt.ov, 5, ctt.vq, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            clo.k,
            a(
               ImmutableMap.builder()
                  .put(1, new clp.g[]{new clp.b(ctt.qO, 24, 16, 2), new clp.d(1), new clp.i(dec.cl, 9, 1, 12, 1)})
                  .put(2, new clp.g[]{new clp.b(ctt.qP, 4, 12, 10), new clp.d(5), new clp.i(ctt.wp, 1, 1, 5)})
                  .put(3, new clp.g[]{new clp.b(ctt.rf, 5, 12, 20), new clp.d(10), new clp.i(ctt.cG, 1, 4, 10)})
                  .put(4, new clp.g[]{new clp.b(ctt.tZ, 2, 12, 30), new clp.d(15), new clp.i(ctt.qW, 5, 1, 15), new clp.i(ctt.qS, 4, 1, 15)})
                  .put(5, new clp.g[]{new clp.i(ctt.uL, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            clo.e,
            a(
               ImmutableMap.of(
                  1,
                  new clp.g[]{new clp.b(ctt.qO, 24, 16, 2), new clp.i(ctt.uj, 7, 1, 1)},
                  2,
                  new clp.g[]{new clp.b(ctt.fT, 11, 16, 10), new clp.l(13, awi.d, "filled_map.monument", eoh.j, 12, 5)},
                  3,
                  new clp.g[]{
                     new clp.b(ctt.qS, 1, 12, 20),
                     new clp.l(14, awi.c, "filled_map.mansion", eoh.i, 12, 10),
                     new clp.l(12, awi.m, "filled_map.trial_chambers", eoh.I, 12, 10)
                  },
                  4,
                  new clp.g[]{
                     new clp.i(ctt.uc, 7, 1, 15),
                     new clp.i(ctt.uP, 3, 1, 15),
                     new clp.i(ctt.va, 3, 1, 15),
                     new clp.i(ctt.uS, 3, 1, 15),
                     new clp.i(ctt.vd, 3, 1, 15),
                     new clp.i(ctt.uV, 3, 1, 15),
                     new clp.i(ctt.vc, 3, 1, 15),
                     new clp.i(ctt.uU, 3, 1, 15),
                     new clp.i(ctt.uW, 3, 1, 15),
                     new clp.i(ctt.ve, 3, 1, 15),
                     new clp.i(ctt.uZ, 3, 1, 15),
                     new clp.i(ctt.uR, 3, 1, 15),
                     new clp.i(ctt.uY, 3, 1, 15),
                     new clp.i(ctt.vb, 3, 1, 15),
                     new clp.i(ctt.uT, 3, 1, 15),
                     new clp.i(ctt.uQ, 3, 1, 15),
                     new clp.i(ctt.uX, 3, 1, 15)
                  },
                  5,
                  new clp.g[]{new clp.i(ctt.wa, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            clo.f,
            a(
               ImmutableMap.of(
                  1,
                  new clp.g[]{new clp.b(ctt.se, 32, 16, 2), new clp.i(ctt.lH, 1, 2, 1)},
                  2,
                  new clp.g[]{new clp.b(ctt.oI, 3, 12, 10), new clp.i(ctt.oA, 1, 1, 5)},
                  3,
                  new clp.g[]{new clp.b(ctt.uD, 2, 12, 20), new clp.i(dec.ec, 4, 1, 12, 10)},
                  4,
                  new clp.g[]{new clp.b(ctt.op, 4, 12, 30), new clp.b(ctt.sl, 9, 12, 30), new clp.i(ctt.sf, 5, 1, 15)},
                  5,
                  new clp.g[]{new clp.b(ctt.sj, 22, 12, 30), new clp.i(ctt.tW, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            clo.c,
            a(
               ImmutableMap.of(
                  1,
                  new clp.g[]{
                     new clp.b(ctt.ow, 15, 16, 2),
                     new clp.i(new ctq(ctt.pI), 7, 1, 12, 1, 0.2F),
                     new clp.i(new ctq(ctt.pJ), 4, 1, 12, 1, 0.2F),
                     new clp.i(new ctq(ctt.pG), 5, 1, 12, 1, 0.2F),
                     new clp.i(new ctq(ctt.pH), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new clp.g[]{
                     new clp.b(ctt.oE, 4, 12, 10),
                     new clp.i(new ctq(ctt.wo), 36, 1, 12, 5, 0.2F),
                     new clp.i(new ctq(ctt.pF), 1, 1, 12, 5, 0.2F),
                     new clp.i(new ctq(ctt.pE), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new clp.g[]{
                     new clp.b(ctt.qA, 1, 12, 20),
                     new clp.b(ctt.oy, 1, 12, 20),
                     new clp.i(new ctq(ctt.pC), 1, 1, 12, 10, 0.2F),
                     new clp.i(new ctq(ctt.pD), 4, 1, 12, 10, 0.2F),
                     new clp.i(new ctq(ctt.vs), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new clp.g[]{new clp.e(ctt.pM, 14, 3, 15, 0.2F), new clp.e(ctt.pN, 8, 3, 15, 0.2F)},
                  5,
                  new clp.g[]{new clp.e(ctt.pK, 8, 3, 30, 0.2F), new clp.e(ctt.pL, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            clo.p,
            a(
               ImmutableMap.of(
                  1,
                  new clp.g[]{new clp.b(ctt.ow, 15, 16, 2), new clp.i(new ctq(ctt.pd), 3, 1, 12, 1, 0.2F), new clp.e(ctt.pa, 2, 3, 1)},
                  2,
                  new clp.g[]{new clp.b(ctt.oE, 4, 12, 10), new clp.i(new ctq(ctt.wo), 36, 1, 12, 5, 0.2F)},
                  3,
                  new clp.g[]{new clp.b(ctt.pW, 24, 12, 20)},
                  4,
                  new clp.g[]{new clp.b(ctt.oy, 1, 12, 30), new clp.e(ctt.pi, 12, 3, 15, 0.2F)},
                  5,
                  new clp.g[]{new clp.e(ctt.pf, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            clo.o,
            a(
               ImmutableMap.of(
                  1,
                  new clp.g[]{
                     new clp.b(ctt.ow, 15, 16, 2),
                     new clp.i(new ctq(ctt.oT), 1, 1, 12, 1, 0.2F),
                     new clp.i(new ctq(ctt.oR), 1, 1, 12, 1, 0.2F),
                     new clp.i(new ctq(ctt.oS), 1, 1, 12, 1, 0.2F),
                     new clp.i(new ctq(ctt.oU), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new clp.g[]{new clp.b(ctt.oE, 4, 12, 10), new clp.i(new ctq(ctt.wo), 36, 1, 12, 5, 0.2F)},
                  3,
                  new clp.g[]{
                     new clp.b(ctt.pW, 30, 12, 20),
                     new clp.e(ctt.pd, 1, 3, 10, 0.2F),
                     new clp.e(ctt.pb, 2, 3, 10, 0.2F),
                     new clp.e(ctt.pc, 3, 3, 10, 0.2F),
                     new clp.i(new ctq(ctt.pj), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new clp.g[]{new clp.b(ctt.oy, 1, 12, 30), new clp.e(ctt.pi, 12, 3, 15, 0.2F), new clp.e(ctt.pg, 5, 3, 15, 0.2F)},
                  5,
                  new clp.g[]{new clp.e(ctt.ph, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            clo.d,
            a(
               ImmutableMap.of(
                  1,
                  new clp.g[]{new clp.b(ctt.sc, 14, 16, 2), new clp.b(ctt.pX, 7, 16, 2), new clp.b(ctt.uA, 4, 16, 2), new clp.i(ctt.uC, 1, 1, 1)},
                  2,
                  new clp.g[]{new clp.b(ctt.ow, 15, 16, 2), new clp.i(ctt.pY, 1, 5, 16, 5), new clp.i(ctt.sd, 1, 8, 16, 5)},
                  3,
                  new clp.g[]{new clp.b(ctt.uN, 7, 16, 20), new clp.b(ctt.sa, 10, 16, 20)},
                  4,
                  new clp.g[]{new clp.b(ctt.qN, 10, 12, 30)},
                  5,
                  new clp.g[]{new clp.b(ctt.wr, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            clo.j,
            a(
               ImmutableMap.of(
                  1,
                  new clp.g[]{new clp.b(ctt.qD, 6, 16, 2), new clp.a(ctt.pA, 3), new clp.a(ctt.pz, 7)},
                  2,
                  new clp.g[]{new clp.b(ctt.pW, 26, 12, 10), new clp.a(ctt.py, 5, 12, 5), new clp.a(ctt.pB, 4, 12, 5)},
                  3,
                  new clp.g[]{new clp.b(ctt.uE, 9, 12, 20), new clp.a(ctt.pz, 7)},
                  4,
                  new clp.g[]{new clp.b(ctt.op, 4, 12, 30), new clp.a(ctt.uJ, 6, 12, 15)},
                  5,
                  new clp.g[]{new clp.i(new ctq(ctt.nL), 6, 1, 12, 30, 0.2F), new clp.a(ctt.py, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            clo.l,
            a(
               ImmutableMap.of(
                  1,
                  new clp.g[]{new clp.b(ctt.qM, 10, 16, 2), new clp.i(ctt.qL, 1, 10, 16, 1)},
                  2,
                  new clp.g[]{new clp.b(dec.b, 20, 16, 10), new clp.i(dec.eK, 1, 4, 16, 5)},
                  3,
                  new clp.g[]{
                     new clp.b(dec.c, 16, 16, 20),
                     new clp.b(dec.g, 16, 16, 20),
                     new clp.b(dec.e, 16, 16, 20),
                     new clp.i(dec.su, 1, 4, 16, 10),
                     new clp.i(dec.h, 1, 4, 16, 10),
                     new clp.i(dec.f, 1, 4, 16, 10),
                     new clp.i(dec.d, 1, 4, 16, 10)
                  },
                  4,
                  new clp.g[]{
                     new clp.b(ctt.oB, 12, 12, 30),
                     new clp.i(dec.hk, 1, 1, 12, 15),
                     new clp.i(dec.hj, 1, 1, 12, 15),
                     new clp.i(dec.hu, 1, 1, 12, 15),
                     new clp.i(dec.hm, 1, 1, 12, 15),
                     new clp.i(dec.hq, 1, 1, 12, 15),
                     new clp.i(dec.hr, 1, 1, 12, 15),
                     new clp.i(dec.hy, 1, 1, 12, 15),
                     new clp.i(dec.hx, 1, 1, 12, 15),
                     new clp.i(dec.hp, 1, 1, 12, 15),
                     new clp.i(dec.hl, 1, 1, 12, 15),
                     new clp.i(dec.ho, 1, 1, 12, 15),
                     new clp.i(dec.hw, 1, 1, 12, 15),
                     new clp.i(dec.hs, 1, 1, 12, 15),
                     new clp.i(dec.ht, 1, 1, 12, 15),
                     new clp.i(dec.hn, 1, 1, 12, 15),
                     new clp.i(dec.hv, 1, 1, 12, 15),
                     new clp.i(dec.lh, 1, 1, 12, 15),
                     new clp.i(dec.lg, 1, 1, 12, 15),
                     new clp.i(dec.lr, 1, 1, 12, 15),
                     new clp.i(dec.lj, 1, 1, 12, 15),
                     new clp.i(dec.ln, 1, 1, 12, 15),
                     new clp.i(dec.lo, 1, 1, 12, 15),
                     new clp.i(dec.lv, 1, 1, 12, 15),
                     new clp.i(dec.lu, 1, 1, 12, 15),
                     new clp.i(dec.lm, 1, 1, 12, 15),
                     new clp.i(dec.li, 1, 1, 12, 15),
                     new clp.i(dec.ll, 1, 1, 12, 15),
                     new clp.i(dec.lt, 1, 1, 12, 15),
                     new clp.i(dec.lp, 1, 1, 12, 15),
                     new clp.i(dec.lq, 1, 1, 12, 15),
                     new clp.i(dec.lk, 1, 1, 12, 15),
                     new clp.i(dec.ls, 1, 1, 12, 15)
                  },
                  5,
                  new clp.g[]{new clp.i(dec.hf, 1, 1, 12, 30), new clp.i(dec.hd, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<clp.g[]> b = a(
      ImmutableMap.of(
         1,
         new clp.g[]{
            new clp.i(ctt.cT, 2, 1, 5, 1),
            new clp.i(ctt.qQ, 4, 1, 5, 1),
            new clp.i(ctt.fu, 2, 1, 5, 1),
            new clp.i(ctt.vR, 5, 1, 5, 1),
            new clp.i(ctt.cO, 1, 1, 12, 1),
            new clp.i(ctt.dJ, 1, 1, 8, 1),
            new clp.i(ctt.fk, 1, 1, 4, 1),
            new clp.i(ctt.dK, 3, 1, 12, 1),
            new clp.i(ctt.eW, 3, 1, 8, 1),
            new clp.i(ctt.dk, 1, 1, 12, 1),
            new clp.i(ctt.dl, 1, 1, 12, 1),
            new clp.i(ctt.dm, 1, 1, 8, 1),
            new clp.i(ctt.dn, 1, 1, 12, 1),
            new clp.i(ctt.do, 1, 1, 12, 1),
            new clp.i(ctt.dp, 1, 1, 12, 1),
            new clp.i(ctt.dq, 1, 1, 12, 1),
            new clp.i(ctt.dr, 1, 1, 12, 1),
            new clp.i(ctt.ds, 1, 1, 12, 1),
            new clp.i(ctt.dt, 1, 1, 12, 1),
            new clp.i(ctt.du, 1, 1, 12, 1),
            new clp.i(ctt.dv, 1, 1, 7, 1),
            new clp.i(ctt.pv, 1, 1, 12, 1),
            new clp.i(ctt.vl, 1, 1, 12, 1),
            new clp.i(ctt.rY, 1, 1, 12, 1),
            new clp.i(ctt.rZ, 1, 1, 12, 1),
            new clp.i(ctt.aa, 5, 1, 8, 1),
            new clp.i(ctt.Y, 5, 1, 8, 1),
            new clp.i(ctt.ac, 5, 1, 8, 1),
            new clp.i(ctt.Z, 5, 1, 8, 1),
            new clp.i(ctt.W, 5, 1, 8, 1),
            new clp.i(ctt.X, 5, 1, 8, 1),
            new clp.i(ctt.ab, 5, 1, 8, 1),
            new clp.i(ctt.ad, 5, 1, 8, 1),
            new clp.i(ctt.rw, 1, 3, 12, 1),
            new clp.i(ctt.ri, 1, 3, 12, 1),
            new clp.i(ctt.rt, 1, 3, 12, 1),
            new clp.i(ctt.ro, 1, 3, 12, 1),
            new clp.i(ctt.rx, 1, 3, 12, 1),
            new clp.i(ctt.rv, 1, 3, 12, 1),
            new clp.i(ctt.rq, 1, 3, 12, 1),
            new clp.i(ctt.rk, 1, 3, 12, 1),
            new clp.i(ctt.rm, 1, 3, 12, 1),
            new clp.i(ctt.rp, 1, 3, 12, 1),
            new clp.i(ctt.rs, 1, 3, 12, 1),
            new clp.i(ctt.rl, 1, 3, 12, 1),
            new clp.i(ctt.rn, 1, 3, 12, 1),
            new clp.i(ctt.rj, 1, 3, 12, 1),
            new clp.i(ctt.ru, 1, 3, 12, 1),
            new clp.i(ctt.rr, 1, 3, 12, 1),
            new clp.i(ctt.kx, 3, 1, 8, 1),
            new clp.i(ctt.ky, 3, 1, 8, 1),
            new clp.i(ctt.kz, 3, 1, 8, 1),
            new clp.i(ctt.kA, 3, 1, 8, 1),
            new clp.i(ctt.kw, 3, 1, 8, 1),
            new clp.i(ctt.fV, 1, 1, 12, 1),
            new clp.i(ctt.dA, 1, 1, 12, 1),
            new clp.i(ctt.dB, 1, 1, 12, 1),
            new clp.i(ctt.gb, 1, 2, 5, 1),
            new clp.i(ctt.dQ, 1, 2, 5, 1),
            new clp.i(ctt.af, 1, 8, 8, 1),
            new clp.i(ctt.ai, 1, 4, 6, 1),
            new clp.i(ctt.xl, 1, 2, 5, 1),
            new clp.i(ctt.F, 1, 2, 5, 1),
            new clp.i(ctt.dN, 1, 2, 5, 1)
         },
         2,
         new clp.g[]{
            new clp.i(ctt.qI, 5, 1, 4, 1),
            new clp.i(ctt.qF, 5, 1, 4, 1),
            new clp.i(ctt.hV, 3, 1, 6, 1),
            new clp.i(ctt.kV, 6, 1, 6, 1),
            new clp.i(ctt.pu, 1, 1, 8, 1),
            new clp.i(ctt.E, 3, 3, 6, 1)
         }
      )
   );
   private static final clp.l s = new clp.l(8, awi.f, "filled_map.village_desert", eoh.B, 12, 5);
   private static final clp.l t = new clp.l(8, awi.e, "filled_map.village_savanna", eoh.D, 12, 5);
   private static final clp.l u = new clp.l(8, awi.g, "filled_map.village_plains", eoh.C, 12, 5);
   private static final clp.l v = new clp.l(8, awi.h, "filled_map.village_taiga", eoh.F, 12, 5);
   private static final clp.l w = new clp.l(8, awi.i, "filled_map.village_snowy", eoh.E, 12, 5);
   private static final clp.l x = new clp.l(8, awi.j, "filled_map.explorer_jungle", eoh.G, 12, 5);
   private static final clp.l y = new clp.l(8, awi.k, "filled_map.explorer_swamp", eoh.H, 12, 5);
   public static final Map<clo, Int2ObjectMap<clp.g[]>> c = Map.of(
      clo.k,
      a(
         ImmutableMap.builder()
            .put(1, new clp.g[]{new clp.b(ctt.qO, 24, 16, 2), a(1), new clp.i(dec.cl, 9, 1, 12, 1)})
            .put(2, new clp.g[]{new clp.b(ctt.qP, 4, 12, 10), a(5), new clp.i(ctt.wp, 1, 1, 5)})
            .put(3, new clp.g[]{new clp.b(ctt.rf, 5, 12, 20), a(10), new clp.i(ctt.cG, 1, 4, 10)})
            .put(4, new clp.g[]{new clp.b(ctt.tZ, 2, 12, 30), new clp.i(ctt.qW, 5, 1, 15), new clp.i(ctt.qS, 4, 1, 15)})
            .put(5, new clp.g[]{a(), new clp.i(ctt.uL, 20, 1, 30)})
            .build()
      ),
      clo.c,
      a(
         ImmutableMap.builder()
            .put(1, new clp.g[]{new clp.b(ctt.ow, 15, 12, 2), new clp.b(ctt.oE, 5, 12, 2)})
            .put(
               2,
               new clp.g[]{
                  clp.m.a(new clp.i(ctt.pJ, 4, 1, 12, 5, 0.05F), clq.a, clq.c, clq.d, clq.e, clq.g),
                  clp.m.a(new clp.i(ctt.pF, 4, 1, 12, 5, 0.05F), clq.b, clq.f),
                  clp.m.a(new clp.i(ctt.pG, 5, 1, 12, 5, 0.05F), clq.a, clq.c, clq.d, clq.e, clq.g),
                  clp.m.a(new clp.i(ctt.pC, 5, 1, 12, 5, 0.05F), clq.b, clq.f),
                  clp.m.a(new clp.i(ctt.pI, 7, 1, 12, 5, 0.05F), clq.a, clq.c, clq.d, clq.e, clq.g),
                  clp.m.a(new clp.i(ctt.pE, 7, 1, 12, 5, 0.05F), clq.b, clq.f),
                  clp.m.a(new clp.i(ctt.pH, 9, 1, 12, 5, 0.05F), clq.a, clq.c, clq.d, clq.e, clq.g),
                  clp.m.a(new clp.i(ctt.pD, 9, 1, 12, 5, 0.05F), clq.b, clq.f)
               }
            )
            .put(3, new clp.g[]{new clp.b(ctt.qA, 1, 12, 20), new clp.i(ctt.vs, 5, 1, 12, 10, 0.05F), new clp.i(ctt.wo, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new clp.g[]{
                  clp.m.a(new clp.i(a(ctt.pJ, cze.h, 1), 8, 1, 3, 15, 0.05F), clq.a),
                  clp.m.a(new clp.i(a(ctt.pG, cze.h, 1), 9, 1, 3, 15, 0.05F), clq.a),
                  clp.m.a(new clp.i(a(ctt.pI, cze.h, 1), 11, 1, 3, 15, 0.05F), clq.a),
                  clp.m.a(new clp.i(a(ctt.pH, cze.h, 1), 13, 1, 3, 15, 0.05F), clq.a),
                  clp.m.a(new clp.i(a(ctt.pJ, cze.a, 1), 8, 1, 3, 15, 0.05F), clq.c),
                  clp.m.a(new clp.i(a(ctt.pG, cze.a, 1), 9, 1, 3, 15, 0.05F), clq.c),
                  clp.m.a(new clp.i(a(ctt.pI, cze.a, 1), 11, 1, 3, 15, 0.05F), clq.c),
                  clp.m.a(new clp.i(a(ctt.pH, cze.a, 1), 13, 1, 3, 15, 0.05F), clq.c),
                  clp.m.a(new clp.i(a(ctt.pJ, cze.k, 1), 2, 1, 3, 15, 0.05F), clq.d),
                  clp.m.a(new clp.i(a(ctt.pG, cze.k, 1), 3, 1, 3, 15, 0.05F), clq.d),
                  clp.m.a(new clp.i(a(ctt.pI, cze.k, 1), 5, 1, 3, 15, 0.05F), clq.d),
                  clp.m.a(new clp.i(a(ctt.pH, cze.k, 1), 7, 1, 3, 15, 0.05F), clq.d),
                  clp.m.a(new clp.i(a(ctt.pJ, cze.j, 1), 8, 1, 3, 15, 0.05F), clq.e),
                  clp.m.a(new clp.i(a(ctt.pG, cze.g, 1), 9, 1, 3, 15, 0.05F), clq.e),
                  clp.m.a(new clp.i(a(ctt.pF, cze.w, 1), 8, 1, 3, 15, 0.05F), clq.b),
                  clp.m.a(new clp.i(a(ctt.pC, cze.w, 1), 9, 1, 3, 15, 0.05F), clq.b),
                  clp.m.a(new clp.i(a(ctt.pE, cze.w, 1), 11, 1, 3, 15, 0.05F), clq.b),
                  clp.m.a(new clp.i(a(ctt.pD, cze.w, 1), 13, 1, 3, 15, 0.05F), clq.b),
                  clp.m.a(new clp.i(a(ctt.pF, cze.O, 1), 8, 1, 3, 15, 0.05F), clq.f),
                  clp.m.a(new clp.i(a(ctt.pC, cze.O, 1), 9, 1, 3, 15, 0.05F), clq.f),
                  clp.m.a(new clp.i(a(ctt.pE, cze.O, 1), 11, 1, 3, 15, 0.05F), clq.f),
                  clp.m.a(new clp.i(a(ctt.pD, cze.O, 1), 13, 1, 3, 15, 0.05F), clq.f),
                  clp.m.a(new clp.h(ctt.pN, 1, 4, ctt.pM, 1, 3, 15, 0.05F), clq.g),
                  clp.m.a(new clp.h(ctt.pM, 1, 4, ctt.pL, 1, 3, 15, 0.05F), clq.g),
                  clp.m.a(new clp.h(ctt.pK, 1, 4, ctt.pN, 1, 3, 15, 0.05F), clq.g),
                  clp.m.a(new clp.h(ctt.pL, 1, 2, ctt.pK, 1, 3, 15, 0.05F), clq.g)
               }
            )
            .put(
               5,
               new clp.g[]{
                  clp.m.a(new clp.h(ctt.oy, 4, 16, a(ctt.pL, cze.h, 1), 1, 3, 30, 0.05F), clq.a),
                  clp.m.a(new clp.h(ctt.oy, 3, 16, a(ctt.pM, cze.h, 1), 1, 3, 30, 0.05F), clq.a),
                  clp.m.a(new clp.h(ctt.oy, 3, 16, a(ctt.pM, cze.a, 1), 1, 3, 30, 0.05F), clq.c),
                  clp.m.a(new clp.h(ctt.oy, 2, 12, a(ctt.pN, cze.a, 1), 1, 3, 30, 0.05F), clq.c),
                  clp.m.a(new clp.h(ctt.oy, 2, 6, a(ctt.pK, cze.k, 1), 1, 3, 30, 0.05F), clq.d),
                  clp.m.a(new clp.h(ctt.oy, 3, 8, a(ctt.pL, cze.k, 1), 1, 3, 30, 0.05F), clq.d),
                  clp.m.a(new clp.h(ctt.oy, 2, 12, a(ctt.pN, cze.j, 1), 1, 3, 30, 0.05F), clq.e),
                  clp.m.a(new clp.h(ctt.oy, 3, 12, a(ctt.pK, cze.g, 1), 1, 3, 30, 0.05F), clq.e),
                  clp.m.a(new clp.i(a(ctt.pC, cze.e, 1), 9, 1, 3, 30, 0.05F), clq.b),
                  clp.m.a(new clp.i(a(ctt.pF, cze.c, 1), 8, 1, 3, 30, 0.05F), clq.b),
                  clp.m.a(new clp.i(a(ctt.pC, cze.f, 1), 9, 1, 3, 30, 0.05F), clq.f),
                  clp.m.a(new clp.i(a(ctt.pF, cze.i, 1), 8, 1, 3, 30, 0.05F), clq.f),
                  clp.m.a(new clp.h(ctt.oy, 4, 18, a(ctt.pL, cze.d, 1), 1, 3, 30, 0.05F), clq.g),
                  clp.m.a(new clp.h(ctt.oy, 3, 18, a(ctt.pM, cze.d, 1), 1, 3, 30, 0.05F), clq.g),
                  clp.m.a(new clp.b(ctt.aN, 1, 12, 30, 42), clq.g),
                  clp.m.a(new clp.b(ctt.aK, 1, 12, 30, 4), clq.a, clq.b, clq.c, clq.d, clq.e, clq.f)
               }
            )
            .build()
      ),
      clo.e,
      a(
         ImmutableMap.of(
            1,
            new clp.g[]{new clp.b(ctt.qO, 24, 16, 2), new clp.i(ctt.uj, 7, 1, 1)},
            2,
            new clp.g[]{
               new clp.b(ctt.fT, 11, 16, 10),
               new clp.m(ImmutableMap.builder().put(clq.a, t).put(clq.d, u).put(clq.c, v).put(clq.g, w).put(clq.e, u).put(clq.b, t).put(clq.f, w).build()),
               new clp.m(ImmutableMap.builder().put(clq.a, u).put(clq.d, s).put(clq.c, t).put(clq.g, u).put(clq.e, v).put(clq.b, s).put(clq.f, v).build()),
               new clp.m(
                  ImmutableMap.builder().put(clq.a, x).put(clq.d, x).put(clq.c, new clp.f()).put(clq.g, y).put(clq.e, y).put(clq.b, y).put(clq.f, x).build()
               )
            },
            3,
            new clp.g[]{
               new clp.b(ctt.qS, 1, 12, 20),
               new clp.l(13, awi.d, "filled_map.monument", eoh.j, 12, 10),
               new clp.l(12, awi.m, "filled_map.trial_chambers", eoh.I, 12, 10)
            },
            4,
            new clp.g[]{
               new clp.i(ctt.uc, 7, 1, 15),
               new clp.i(ctt.uP, 3, 1, 15),
               new clp.i(ctt.va, 3, 1, 15),
               new clp.i(ctt.uS, 3, 1, 15),
               new clp.i(ctt.vd, 3, 1, 15),
               new clp.i(ctt.uV, 3, 1, 15),
               new clp.i(ctt.vc, 3, 1, 15),
               new clp.i(ctt.uU, 3, 1, 15),
               new clp.i(ctt.uW, 3, 1, 15),
               new clp.i(ctt.ve, 3, 1, 15),
               new clp.i(ctt.uZ, 3, 1, 15),
               new clp.i(ctt.uR, 3, 1, 15),
               new clp.i(ctt.uY, 3, 1, 15),
               new clp.i(ctt.vb, 3, 1, 15),
               new clp.i(ctt.uT, 3, 1, 15),
               new clp.i(ctt.uQ, 3, 1, 15),
               new clp.i(ctt.uX, 3, 1, 15)
            },
            5,
            new clp.g[]{new clp.i(ctt.wa, 8, 1, 30), new clp.l(14, awi.c, "filled_map.mansion", eoh.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<clp.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new clp.g[]{
               new clp.b(a(cvs.a), 1, 1, 1),
               new clp.b(ctt.qz, 1, 1, 1, 2),
               new clp.b(ctt.qE, 1, 1, 1, 2),
               new clp.b(ctt.sn, 1, 1, 1, 3),
               new clp.b(ctt.uh, 4, 1, 1),
               new clp.b(ctt.hD, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new clp.g[]{
               new clp.i(ctt.hV, 1, 1, 6, 1),
               new clp.i(ctt.kV, 6, 1, 6, 1),
               new clp.i(ctt.pu, 1, 4, 2, 1),
               new clp.i(ctt.E, 3, 3, 6, 1),
               new clp.i(dec.Y, 1, 8, 4, 1),
               new clp.i(dec.W, 1, 8, 4, 1),
               new clp.i(dec.aa, 1, 8, 4, 1),
               new clp.i(dec.X, 1, 8, 4, 1),
               new clp.i(dec.U, 1, 8, 4, 1),
               new clp.i(dec.V, 1, 8, 4, 1),
               new clp.i(dec.Z, 1, 8, 4, 1),
               new clp.e(ctt.pc, 1, 1, 1, 0.2F),
               new clp.i(b(cvs.h), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new clp.g[]{
               new clp.i(ctt.qI, 3, 1, 4, 1),
               new clp.i(ctt.qF, 3, 1, 4, 1),
               new clp.i(ctt.cT, 2, 1, 5, 1),
               new clp.i(ctt.qQ, 4, 1, 5, 1),
               new clp.i(ctt.fu, 2, 1, 5, 1),
               new clp.i(ctt.vR, 5, 1, 5, 1),
               new clp.i(ctt.cO, 1, 1, 12, 1),
               new clp.i(ctt.dJ, 1, 1, 8, 1),
               new clp.i(ctt.fk, 1, 1, 4, 1),
               new clp.i(ctt.dK, 3, 1, 12, 1),
               new clp.i(ctt.eW, 3, 1, 8, 1),
               new clp.i(ctt.dk, 1, 1, 12, 1),
               new clp.i(ctt.dl, 1, 1, 12, 1),
               new clp.i(ctt.dm, 1, 1, 8, 1),
               new clp.i(ctt.dn, 1, 1, 12, 1),
               new clp.i(ctt.do, 1, 1, 12, 1),
               new clp.i(ctt.dp, 1, 1, 12, 1),
               new clp.i(ctt.dq, 1, 1, 12, 1),
               new clp.i(ctt.dr, 1, 1, 12, 1),
               new clp.i(ctt.ds, 1, 1, 12, 1),
               new clp.i(ctt.dt, 1, 1, 12, 1),
               new clp.i(ctt.du, 1, 1, 12, 1),
               new clp.i(ctt.dv, 1, 1, 7, 1),
               new clp.i(ctt.pv, 1, 1, 12, 1),
               new clp.i(ctt.vl, 1, 1, 12, 1),
               new clp.i(ctt.rY, 1, 1, 12, 1),
               new clp.i(ctt.rZ, 1, 1, 12, 1),
               new clp.i(ctt.aa, 5, 1, 8, 1),
               new clp.i(ctt.Y, 5, 1, 8, 1),
               new clp.i(ctt.ac, 5, 1, 8, 1),
               new clp.i(ctt.Z, 5, 1, 8, 1),
               new clp.i(ctt.W, 5, 1, 8, 1),
               new clp.i(ctt.X, 5, 1, 8, 1),
               new clp.i(ctt.ab, 5, 1, 8, 1),
               new clp.i(ctt.ad, 5, 1, 8, 1),
               new clp.i(ctt.rw, 1, 3, 12, 1),
               new clp.i(ctt.ri, 1, 3, 12, 1),
               new clp.i(ctt.rt, 1, 3, 12, 1),
               new clp.i(ctt.ro, 1, 3, 12, 1),
               new clp.i(ctt.rx, 1, 3, 12, 1),
               new clp.i(ctt.rv, 1, 3, 12, 1),
               new clp.i(ctt.rq, 1, 3, 12, 1),
               new clp.i(ctt.rk, 1, 3, 12, 1),
               new clp.i(ctt.rm, 1, 3, 12, 1),
               new clp.i(ctt.rp, 1, 3, 12, 1),
               new clp.i(ctt.rs, 1, 3, 12, 1),
               new clp.i(ctt.rl, 1, 3, 12, 1),
               new clp.i(ctt.rn, 1, 3, 12, 1),
               new clp.i(ctt.rj, 1, 3, 12, 1),
               new clp.i(ctt.ru, 1, 3, 12, 1),
               new clp.i(ctt.rr, 1, 3, 12, 1),
               new clp.i(ctt.kx, 3, 1, 8, 1),
               new clp.i(ctt.ky, 3, 1, 8, 1),
               new clp.i(ctt.kz, 3, 1, 8, 1),
               new clp.i(ctt.kA, 3, 1, 8, 1),
               new clp.i(ctt.kw, 3, 1, 8, 1),
               new clp.i(ctt.fV, 1, 3, 4, 1),
               new clp.i(ctt.dA, 1, 3, 4, 1),
               new clp.i(ctt.dB, 1, 3, 4, 1),
               new clp.i(ctt.gb, 1, 5, 2, 1),
               new clp.i(ctt.dQ, 1, 2, 5, 1),
               new clp.i(ctt.af, 1, 8, 8, 1),
               new clp.i(ctt.ai, 1, 4, 6, 1),
               new clp.i(ctt.xl, 1, 2, 5, 1),
               new clp.i(ctt.F, 1, 2, 5, 1),
               new clp.i(ctt.dN, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static clp.g a(int $$0) {
      return new clp.m(
         ImmutableMap.builder()
            .put(clq.a, new clp.d($$0, cze.b, cze.h, cze.B))
            .put(clq.b, new clp.d($$0, cze.c, cze.e, cze.y))
            .put(clq.c, new clp.d($$0, cze.z, cze.o, cze.p))
            .put(clq.d, new clp.d($$0, cze.q, cze.k, cze.t))
            .put(clq.e, new clp.d($$0, cze.g, cze.s, cze.j))
            .put(clq.f, new clp.d($$0, cze.i, cze.f, cze.P))
            .put(clq.g, new clp.d($$0, cze.d, cze.r, cze.A))
            .build()
      );
   }

   private static clp.g a() {
      return new clp.m(
         ImmutableMap.builder()
            .put(clq.a, new clp.d(30, 3, 3, cze.u))
            .put(clq.b, new clp.d(30, 2, 2, cze.w))
            .put(clq.c, new clp.d(30, 3, 3, cze.a))
            .put(clq.d, new clp.d(30, 3, 3, cze.n))
            .put(clq.e, new clp.d(30, cze.v))
            .put(clq.f, new clp.d(30, cze.O))
            .put(clq.g, new clp.d(30, 2, 2, cze.x))
            .build()
      );
   }

   private static Int2ObjectMap<clp.g[]> a(ImmutableMap<Integer, clp.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static czv a(ix<cvp> $$0) {
      return new czv(ctt.sk).a($$1 -> $$1.a(kb.F, new cvr($$0)));
   }

   private static ctq b(ix<cvp> $$0) {
      return cvr.a(ctt.sk, $$0);
   }

   private static ctq a(ctl $$0, czb $$1, int $$2) {
      ctq $$3 = new ctq($$0);
      $$3.a($$1, $$2);
      return $$3;
   }

   static class a implements clp.g {
      private final ctl a;
      private final int b;
      private final int c;
      private final int d;

      public a(ctl $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(ctl $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public czx a(brw $$0, aym $$1) {
         czv $$2 = new czv(ctt.oz, this.b);
         ctq $$3 = new ctq(this.a);
         if ($$3.a(awf.bz)) {
            List<csk> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = cwi.a($$3, $$4);
         }

         return new czx($$2, $$3, this.c, this.d, 0.2F);
      }

      private static csk a(aym $$0) {
         return csk.a(csj.a($$0.a(16)));
      }
   }

   static class b implements clp.g {
      private final czv a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(day $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(day $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new czv($$0.r(), $$1), $$2, $$3, $$4);
      }

      public b(czv $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public czx a(brw $$0, aym $$1) {
         return new czx(this.a, new ctq(ctt.oz, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements clp.g {
      private final Map<clq, ctl> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<clq, ctl> $$3) {
         le.y.s().filter($$1x -> !$$3.containsKey($$1x)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + le.y.b($$0x));
         });
         this.a = $$3;
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Nullable
      @Override
      public czx a(brw $$0, aym $$1) {
         if ($$0 instanceof cln $$2) {
            czv $$3 = new czv(this.a.get($$2.gA().a()), this.b);
            return new czx($$3, new ctq(ctt.oz), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements clp.g {
      private final int a;
      private final List<czb> b;
      private final int c;
      private final int d;

      public d(int $$0) {
         this($$0, le.f.s().filter(czb::k).toArray(czb[]::new));
      }

      public d(int $$0, czb... $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, czb... $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = Arrays.asList($$3);
      }

      @Override
      public czx a(brw $$0, aym $$1) {
         czb $$2 = this.b.get($$1.a(this.b.size()));
         int $$3 = Math.max($$2.f(), this.c);
         int $$4 = Math.min($$2.g(), this.d);
         int $$5 = ayf.a($$1, $$3, $$4);
         ctq $$6 = cso.a(new czd($$2, $$5));
         int $$7 = 2 + $$1.a(5 + $$5 * 10) + 3 * $$5;
         if ($$2.a()) {
            $$7 *= 2;
         }

         if ($$7 > 64) {
            $$7 = 64;
         }

         return new czx(new czv(ctt.oz, $$7), Optional.of(new czv(ctt.qP)), $$6, 12, this.a, 0.2F);
      }
   }

   static class e implements clp.g {
      private final ctq a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(ctl $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(ctl $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new ctq($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public czx a(brw $$0, aym $$1) {
         int $$2 = 5 + $$1.a(15);
         ctq $$3 = czc.a($$0.dP().J(), $$1, new ctq(this.a.g()), $$2, false);
         int $$4 = Math.min(this.b + $$2, 64);
         czv $$5 = new czv(ctt.oz, $$4);
         return new czx($$5, $$3, this.c, this.d, this.e);
      }
   }

   static class f implements clp.g {
      @Override
      public czx a(brw $$0, aym $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      czx a(brw var1, aym var2);
   }

   static class h implements clp.g {
      private final czv a;
      private final int b;
      private final ctq c;
      private final int d;
      private final int e;
      private final float f;

      public h(day $$0, int $$1, int $$2, ctl $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new ctq($$3), $$4, $$5, $$6, $$7);
      }

      h(day $$0, int $$1, int $$2, ctq $$3, int $$4, int $$5, int $$6, float $$7) {
         this(new czv($$0, $$1), $$2, $$3.c($$4), $$5, $$6, $$7);
      }

      public h(czv $$0, int $$1, ctq $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public czx a(brw $$0, aym $$1) {
         return new czx(new czv(ctt.oz, this.b), Optional.of(this.a), this.c.s(), 0, this.d, this.e, this.f, 0);
      }
   }

   static class i implements clp.g {
      private final ctq a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public i(dea $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new ctq($$0), $$1, $$2, $$3, $$4);
      }

      public i(ctl $$0, int $$1, int $$2, int $$3) {
         this(new ctq($$0), $$1, $$2, 12, $$3);
      }

      public i(ctl $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new ctq($$0), $$1, $$2, $$3, $$4);
      }

      public i(ctq $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(ctl $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new ctq($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(ctq $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.a.e($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
      }

      @Override
      public czx a(brw $$0, aym $$1) {
         return new czx(new czv(ctt.oz, this.b), this.a.s(), this.c, this.d, this.e);
      }
   }

   static class j implements clp.g {
      private final cwu a;
      private final int b;
      private final float c;

      public j(ix<brc> $$0, int $$1, int $$2) {
         this(new cwu(List.of(new cwu.a($$0, $$1))), $$2, 0.05F);
      }

      public j(cwu $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public czx a(brw $$0, aym $$1) {
         ctq $$2 = new ctq(ctt.vU, 1);
         $$2.b(kb.G, this.a);
         return new czx(new czv(ctt.oz), $$2, 12, this.b, this.c);
      }
   }

   static class k implements clp.g {
      private final ctq a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final ctl f;
      private final int g;
      private final float h;

      public k(ctl $$0, int $$1, ctl $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new ctq($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public czx a(brw $$0, aym $$1) {
         czv $$2 = new czv(ctt.oz, this.c);
         List<ix<cvp>> $$3 = le.i.h().filter($$0x -> !((cvp)$$0x.a()).a().isEmpty() && cvq.a($$0x)).collect(Collectors.toList());
         ix<cvp> $$4 = ac.a($$3, $$1);
         ctq $$5 = new ctq(this.a.g(), this.b);
         $$5.b(kb.F, new cvr($$4));
         return new czx($$2, Optional.of(new czv(this.f, this.g)), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements clp.g {
      private final int a;
      private final awm<ehl> b;
      private final String c;
      private final ix<eog> d;
      private final int e;
      private final int f;

      public l(int $$0, awm<ehl> $$1, String $$2, ix<eog> $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public czx a(brw $$0, aym $$1) {
         if (!($$0.dP() instanceof aqn)) {
            return null;
         } else {
            aqn $$2 = (aqn)$$0.dP();
            io $$3 = $$2.a(this.b, $$0.dp(), 100, true);
            if ($$3 != null) {
               ctq $$4 = cty.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               cty.a($$2, $$4);
               eol.a($$4, $$3, "+", this.d);
               $$4.b(kb.g, wx.c(this.c));
               return new czx(new czv(ctt.oz, this.a), Optional.of(new czv(ctt.qS)), $$4, this.e, this.f, 0.2F);
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
      public czx a(brw $$0, aym $$1) {
         if ($$0 instanceof cln $$2) {
            clq $$3 = $$2.gA().a();
            clp.g $$4 = this.a.get($$3);
            return $$4 == null ? null : $$4.a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
