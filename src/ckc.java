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

public class ckc {
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
   public static final Map<ckb, Int2ObjectMap<ckc.g[]>> a = ac.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            ckb.g,
            a(
               ImmutableMap.of(
                  1,
                  new ckc.g[]{
                     new ckc.b(csg.pw, 20, 16, 2),
                     new ckc.b(csg.ug, 26, 16, 2),
                     new ckc.b(csg.uf, 22, 16, 2),
                     new ckc.b(csg.vk, 15, 16, 2),
                     new ckc.i(csg.px, 1, 6, 16, 1)
                  },
                  2,
                  new ckc.g[]{new ckc.b(dcx.eZ, 6, 12, 10), new ckc.i(csg.ut, 1, 4, 5), new ckc.i(csg.ot, 1, 4, 16, 5)},
                  3,
                  new ckc.g[]{new ckc.i(csg.rS, 3, 18, 10), new ckc.b(dcx.fa, 4, 12, 20)},
                  4,
                  new ckc.g[]{
                     new ckc.i(dcx.eg, 1, 1, 12, 15),
                     new ckc.j(bpz.p, 100, 15),
                     new ckc.j(bpz.h, 160, 15),
                     new ckc.j(bpz.r, 140, 15),
                     new ckc.j(bpz.o, 120, 15),
                     new ckc.j(bpz.s, 280, 15),
                     new ckc.j(bpz.w, 7, 15)
                  },
                  5,
                  new ckc.g[]{new ckc.i(csg.uk, 3, 3, 30), new ckc.i(csg.st, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            ckb.h,
            a(
               ImmutableMap.of(
                  1,
                  new ckc.g[]{
                     new ckc.b(csg.ps, 20, 16, 2),
                     new ckc.b(csg.ow, 10, 16, 2),
                     new ckc.h(csg.qZ, 6, 1, csg.rd, 6, 16, 1, 0.05F),
                     new ckc.i(csg.qH, 3, 1, 16, 1)
                  },
                  2,
                  new ckc.g[]{new ckc.b(csg.qZ, 15, 16, 10), new ckc.h(csg.ra, 6, 1, csg.re, 6, 16, 5, 0.05F), new ckc.i(csg.wt, 2, 1, 5)},
                  3,
                  new ckc.g[]{new ckc.b(csg.ra, 13, 16, 20), new ckc.e(csg.qV, 3, 3, 10, 0.2F)},
                  4,
                  new ckc.g[]{new ckc.b(csg.rb, 6, 12, 30)},
                  5,
                  new ckc.g[]{
                     new ckc.b(csg.rc, 4, 12, 30),
                     new ckc.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(ckd.c, csg.nU)
                           .put(ckd.g, csg.nW)
                           .put(ckd.e, csg.nW)
                           .put(ckd.a, csg.oa)
                           .put(ckd.b, csg.oa)
                           .put(ckd.d, csg.oc)
                           .put(ckd.f, csg.og)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            ckb.n,
            a(
               ImmutableMap.of(
                  1,
                  new ckc.g[]{
                     new ckc.b(dcx.bA, 18, 16, 2),
                     new ckc.b(dcx.bM, 18, 16, 2),
                     new ckc.b(dcx.bP, 18, 16, 2),
                     new ckc.b(dcx.bH, 18, 16, 2),
                     new ckc.i(csg.rV, 2, 1, 1)
                  },
                  2,
                  new ckc.g[]{
                     new ckc.b(csg.ri, 12, 16, 10),
                     new ckc.b(csg.rp, 12, 16, 10),
                     new ckc.b(csg.rx, 12, 16, 10),
                     new ckc.b(csg.rl, 12, 16, 10),
                     new ckc.b(csg.rn, 12, 16, 10),
                     new ckc.i(dcx.bA, 1, 1, 16, 5),
                     new ckc.i(dcx.bB, 1, 1, 16, 5),
                     new ckc.i(dcx.bC, 1, 1, 16, 5),
                     new ckc.i(dcx.bD, 1, 1, 16, 5),
                     new ckc.i(dcx.bE, 1, 1, 16, 5),
                     new ckc.i(dcx.bF, 1, 1, 16, 5),
                     new ckc.i(dcx.bG, 1, 1, 16, 5),
                     new ckc.i(dcx.bH, 1, 1, 16, 5),
                     new ckc.i(dcx.bI, 1, 1, 16, 5),
                     new ckc.i(dcx.bJ, 1, 1, 16, 5),
                     new ckc.i(dcx.bK, 1, 1, 16, 5),
                     new ckc.i(dcx.bL, 1, 1, 16, 5),
                     new ckc.i(dcx.bM, 1, 1, 16, 5),
                     new ckc.i(dcx.bN, 1, 1, 16, 5),
                     new ckc.i(dcx.bO, 1, 1, 16, 5),
                     new ckc.i(dcx.bP, 1, 1, 16, 5),
                     new ckc.i(dcx.ik, 1, 4, 16, 5),
                     new ckc.i(dcx.il, 1, 4, 16, 5),
                     new ckc.i(dcx.im, 1, 4, 16, 5),
                     new ckc.i(dcx.in, 1, 4, 16, 5),
                     new ckc.i(dcx.io, 1, 4, 16, 5),
                     new ckc.i(dcx.ip, 1, 4, 16, 5),
                     new ckc.i(dcx.iq, 1, 4, 16, 5),
                     new ckc.i(dcx.ir, 1, 4, 16, 5),
                     new ckc.i(dcx.is, 1, 4, 16, 5),
                     new ckc.i(dcx.it, 1, 4, 16, 5),
                     new ckc.i(dcx.iu, 1, 4, 16, 5),
                     new ckc.i(dcx.iv, 1, 4, 16, 5),
                     new ckc.i(dcx.iw, 1, 4, 16, 5),
                     new ckc.i(dcx.ix, 1, 4, 16, 5),
                     new ckc.i(dcx.iy, 1, 4, 16, 5),
                     new ckc.i(dcx.iz, 1, 4, 16, 5)
                  },
                  3,
                  new ckc.g[]{
                     new ckc.b(csg.rm, 12, 16, 20),
                     new ckc.b(csg.rq, 12, 16, 20),
                     new ckc.b(csg.rj, 12, 16, 20),
                     new ckc.b(csg.rw, 12, 16, 20),
                     new ckc.b(csg.ro, 12, 16, 20),
                     new ckc.i(dcx.aZ, 3, 1, 12, 10),
                     new ckc.i(dcx.bd, 3, 1, 12, 10),
                     new ckc.i(dcx.bn, 3, 1, 12, 10),
                     new ckc.i(dcx.bo, 3, 1, 12, 10),
                     new ckc.i(dcx.bk, 3, 1, 12, 10),
                     new ckc.i(dcx.bl, 3, 1, 12, 10),
                     new ckc.i(dcx.bi, 3, 1, 12, 10),
                     new ckc.i(dcx.bg, 3, 1, 12, 10),
                     new ckc.i(dcx.bm, 3, 1, 12, 10),
                     new ckc.i(dcx.bc, 3, 1, 12, 10),
                     new ckc.i(dcx.bh, 3, 1, 12, 10),
                     new ckc.i(dcx.be, 3, 1, 12, 10),
                     new ckc.i(dcx.bb, 3, 1, 12, 10),
                     new ckc.i(dcx.ba, 3, 1, 12, 10),
                     new ckc.i(dcx.bf, 3, 1, 12, 10),
                     new ckc.i(dcx.bj, 3, 1, 12, 10)
                  },
                  4,
                  new ckc.g[]{
                     new ckc.b(csg.ru, 12, 16, 30),
                     new ckc.b(csg.rs, 12, 16, 30),
                     new ckc.b(csg.rt, 12, 16, 30),
                     new ckc.b(csg.rv, 12, 16, 30),
                     new ckc.b(csg.rk, 12, 16, 30),
                     new ckc.b(csg.rr, 12, 16, 30),
                     new ckc.i(csg.uP, 3, 1, 12, 15),
                     new ckc.i(csg.va, 3, 1, 12, 15),
                     new ckc.i(csg.uS, 3, 1, 12, 15),
                     new ckc.i(csg.vd, 3, 1, 12, 15),
                     new ckc.i(csg.uV, 3, 1, 12, 15),
                     new ckc.i(csg.vc, 3, 1, 12, 15),
                     new ckc.i(csg.uU, 3, 1, 12, 15),
                     new ckc.i(csg.uW, 3, 1, 12, 15),
                     new ckc.i(csg.ve, 3, 1, 12, 15),
                     new ckc.i(csg.uZ, 3, 1, 12, 15),
                     new ckc.i(csg.uR, 3, 1, 12, 15),
                     new ckc.i(csg.uY, 3, 1, 12, 15),
                     new ckc.i(csg.vb, 3, 1, 12, 15),
                     new ckc.i(csg.uT, 3, 1, 12, 15),
                     new ckc.i(csg.uQ, 3, 1, 12, 15),
                     new ckc.i(csg.uX, 3, 1, 12, 15)
                  },
                  5,
                  new ckc.g[]{new ckc.i(csg.pZ, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            ckb.i,
            a(
               ImmutableMap.of(
                  1,
                  new ckc.g[]{new ckc.b(csg.pp, 32, 16, 2), new ckc.i(csg.ov, 1, 16, 1), new ckc.h(dcx.L, 10, 1, csg.pW, 10, 12, 1, 0.05F)},
                  2,
                  new ckc.g[]{new ckc.b(csg.pW, 26, 12, 10), new ckc.i(csg.ou, 2, 1, 5)},
                  3,
                  new ckc.g[]{new ckc.b(csg.ps, 14, 16, 20), new ckc.i(csg.vT, 3, 1, 10)},
                  4,
                  new ckc.g[]{new ckc.b(csg.pt, 24, 16, 30), new ckc.e(csg.ou, 2, 3, 15)},
                  5,
                  new ckc.g[]{new ckc.b(csg.mb, 8, 12, 30), new ckc.e(csg.vT, 3, 3, 15), new ckc.k(csg.ov, 5, csg.vq, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            ckb.k,
            a(
               ImmutableMap.builder()
                  .put(1, new ckc.g[]{new ckc.b(csg.qO, 24, 16, 2), new ckc.d(1), new ckc.i(dcx.cl, 9, 1, 12, 1)})
                  .put(2, new ckc.g[]{new ckc.b(csg.qP, 4, 12, 10), new ckc.d(5), new ckc.i(csg.wp, 1, 1, 5)})
                  .put(3, new ckc.g[]{new ckc.b(csg.rf, 5, 12, 20), new ckc.d(10), new ckc.i(csg.cG, 1, 4, 10)})
                  .put(4, new ckc.g[]{new ckc.b(csg.tZ, 2, 12, 30), new ckc.d(15), new ckc.i(csg.qW, 5, 1, 15), new ckc.i(csg.qS, 4, 1, 15)})
                  .put(5, new ckc.g[]{new ckc.i(csg.uL, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            ckb.e,
            a(
               ImmutableMap.of(
                  1,
                  new ckc.g[]{new ckc.b(csg.qO, 24, 16, 2), new ckc.i(csg.uj, 7, 1, 1)},
                  2,
                  new ckc.g[]{new ckc.b(csg.fT, 11, 16, 10), new ckc.l(13, avz.d, "filled_map.monument", ena.a.j, 12, 5)},
                  3,
                  new ckc.g[]{new ckc.b(csg.qS, 1, 12, 20), new ckc.l(14, avz.c, "filled_map.mansion", ena.a.i, 12, 10)},
                  4,
                  new ckc.g[]{
                     new ckc.i(csg.uc, 7, 1, 15),
                     new ckc.i(csg.uP, 3, 1, 15),
                     new ckc.i(csg.va, 3, 1, 15),
                     new ckc.i(csg.uS, 3, 1, 15),
                     new ckc.i(csg.vd, 3, 1, 15),
                     new ckc.i(csg.uV, 3, 1, 15),
                     new ckc.i(csg.vc, 3, 1, 15),
                     new ckc.i(csg.uU, 3, 1, 15),
                     new ckc.i(csg.uW, 3, 1, 15),
                     new ckc.i(csg.ve, 3, 1, 15),
                     new ckc.i(csg.uZ, 3, 1, 15),
                     new ckc.i(csg.uR, 3, 1, 15),
                     new ckc.i(csg.uY, 3, 1, 15),
                     new ckc.i(csg.vb, 3, 1, 15),
                     new ckc.i(csg.uT, 3, 1, 15),
                     new ckc.i(csg.uQ, 3, 1, 15),
                     new ckc.i(csg.uX, 3, 1, 15)
                  },
                  5,
                  new ckc.g[]{new ckc.i(csg.wa, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            ckb.f,
            a(
               ImmutableMap.of(
                  1,
                  new ckc.g[]{new ckc.b(csg.se, 32, 16, 2), new ckc.i(csg.lH, 1, 2, 1)},
                  2,
                  new ckc.g[]{new ckc.b(csg.oI, 3, 12, 10), new ckc.i(csg.oA, 1, 1, 5)},
                  3,
                  new ckc.g[]{new ckc.b(csg.uD, 2, 12, 20), new ckc.i(dcx.ec, 4, 1, 12, 10)},
                  4,
                  new ckc.g[]{new ckc.b(csg.op, 4, 12, 30), new ckc.b(csg.sl, 9, 12, 30), new ckc.i(csg.sf, 5, 1, 15)},
                  5,
                  new ckc.g[]{new ckc.b(csg.sj, 22, 12, 30), new ckc.i(csg.tW, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            ckb.c,
            a(
               ImmutableMap.of(
                  1,
                  new ckc.g[]{
                     new ckc.b(csg.ow, 15, 16, 2),
                     new ckc.i(new csd(csg.pI), 7, 1, 12, 1, 0.2F),
                     new ckc.i(new csd(csg.pJ), 4, 1, 12, 1, 0.2F),
                     new ckc.i(new csd(csg.pG), 5, 1, 12, 1, 0.2F),
                     new ckc.i(new csd(csg.pH), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new ckc.g[]{
                     new ckc.b(csg.oE, 4, 12, 10),
                     new ckc.i(new csd(csg.wo), 36, 1, 12, 5, 0.2F),
                     new ckc.i(new csd(csg.pF), 1, 1, 12, 5, 0.2F),
                     new ckc.i(new csd(csg.pE), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new ckc.g[]{
                     new ckc.b(csg.qA, 1, 12, 20),
                     new ckc.b(csg.oy, 1, 12, 20),
                     new ckc.i(new csd(csg.pC), 1, 1, 12, 10, 0.2F),
                     new ckc.i(new csd(csg.pD), 4, 1, 12, 10, 0.2F),
                     new ckc.i(new csd(csg.vs), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new ckc.g[]{new ckc.e(csg.pM, 14, 3, 15, 0.2F), new ckc.e(csg.pN, 8, 3, 15, 0.2F)},
                  5,
                  new ckc.g[]{new ckc.e(csg.pK, 8, 3, 30, 0.2F), new ckc.e(csg.pL, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            ckb.p,
            a(
               ImmutableMap.of(
                  1,
                  new ckc.g[]{new ckc.b(csg.ow, 15, 16, 2), new ckc.i(new csd(csg.pd), 3, 1, 12, 1, 0.2F), new ckc.e(csg.pa, 2, 3, 1)},
                  2,
                  new ckc.g[]{new ckc.b(csg.oE, 4, 12, 10), new ckc.i(new csd(csg.wo), 36, 1, 12, 5, 0.2F)},
                  3,
                  new ckc.g[]{new ckc.b(csg.pW, 24, 12, 20)},
                  4,
                  new ckc.g[]{new ckc.b(csg.oy, 1, 12, 30), new ckc.e(csg.pi, 12, 3, 15, 0.2F)},
                  5,
                  new ckc.g[]{new ckc.e(csg.pf, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            ckb.o,
            a(
               ImmutableMap.of(
                  1,
                  new ckc.g[]{
                     new ckc.b(csg.ow, 15, 16, 2),
                     new ckc.i(new csd(csg.oT), 1, 1, 12, 1, 0.2F),
                     new ckc.i(new csd(csg.oR), 1, 1, 12, 1, 0.2F),
                     new ckc.i(new csd(csg.oS), 1, 1, 12, 1, 0.2F),
                     new ckc.i(new csd(csg.oU), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new ckc.g[]{new ckc.b(csg.oE, 4, 12, 10), new ckc.i(new csd(csg.wo), 36, 1, 12, 5, 0.2F)},
                  3,
                  new ckc.g[]{
                     new ckc.b(csg.pW, 30, 12, 20),
                     new ckc.e(csg.pd, 1, 3, 10, 0.2F),
                     new ckc.e(csg.pb, 2, 3, 10, 0.2F),
                     new ckc.e(csg.pc, 3, 3, 10, 0.2F),
                     new ckc.i(new csd(csg.pj), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new ckc.g[]{new ckc.b(csg.oy, 1, 12, 30), new ckc.e(csg.pi, 12, 3, 15, 0.2F), new ckc.e(csg.pg, 5, 3, 15, 0.2F)},
                  5,
                  new ckc.g[]{new ckc.e(csg.ph, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            ckb.d,
            a(
               ImmutableMap.of(
                  1,
                  new ckc.g[]{new ckc.b(csg.sc, 14, 16, 2), new ckc.b(csg.pX, 7, 16, 2), new ckc.b(csg.uA, 4, 16, 2), new ckc.i(csg.uC, 1, 1, 1)},
                  2,
                  new ckc.g[]{new ckc.b(csg.ow, 15, 16, 2), new ckc.i(csg.pY, 1, 5, 16, 5), new ckc.i(csg.sd, 1, 8, 16, 5)},
                  3,
                  new ckc.g[]{new ckc.b(csg.uN, 7, 16, 20), new ckc.b(csg.sa, 10, 16, 20)},
                  4,
                  new ckc.g[]{new ckc.b(csg.qN, 10, 12, 30)},
                  5,
                  new ckc.g[]{new ckc.b(csg.wr, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            ckb.j,
            a(
               ImmutableMap.of(
                  1,
                  new ckc.g[]{new ckc.b(csg.qD, 6, 16, 2), new ckc.a(csg.pA, 3), new ckc.a(csg.pz, 7)},
                  2,
                  new ckc.g[]{new ckc.b(csg.pW, 26, 12, 10), new ckc.a(csg.py, 5, 12, 5), new ckc.a(csg.pB, 4, 12, 5)},
                  3,
                  new ckc.g[]{new ckc.b(csg.uE, 9, 12, 20), new ckc.a(csg.pz, 7)},
                  4,
                  new ckc.g[]{new ckc.b(csg.op, 4, 12, 30), new ckc.a(csg.uJ, 6, 12, 15)},
                  5,
                  new ckc.g[]{new ckc.i(new csd(csg.nL), 6, 1, 12, 30, 0.2F), new ckc.a(csg.py, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            ckb.l,
            a(
               ImmutableMap.of(
                  1,
                  new ckc.g[]{new ckc.b(csg.qM, 10, 16, 2), new ckc.i(csg.qL, 1, 10, 16, 1)},
                  2,
                  new ckc.g[]{new ckc.b(dcx.b, 20, 16, 10), new ckc.i(dcx.eK, 1, 4, 16, 5)},
                  3,
                  new ckc.g[]{
                     new ckc.b(dcx.c, 16, 16, 20),
                     new ckc.b(dcx.g, 16, 16, 20),
                     new ckc.b(dcx.e, 16, 16, 20),
                     new ckc.i(dcx.su, 1, 4, 16, 10),
                     new ckc.i(dcx.h, 1, 4, 16, 10),
                     new ckc.i(dcx.f, 1, 4, 16, 10),
                     new ckc.i(dcx.d, 1, 4, 16, 10)
                  },
                  4,
                  new ckc.g[]{
                     new ckc.b(csg.oB, 12, 12, 30),
                     new ckc.i(dcx.hk, 1, 1, 12, 15),
                     new ckc.i(dcx.hj, 1, 1, 12, 15),
                     new ckc.i(dcx.hu, 1, 1, 12, 15),
                     new ckc.i(dcx.hm, 1, 1, 12, 15),
                     new ckc.i(dcx.hq, 1, 1, 12, 15),
                     new ckc.i(dcx.hr, 1, 1, 12, 15),
                     new ckc.i(dcx.hy, 1, 1, 12, 15),
                     new ckc.i(dcx.hx, 1, 1, 12, 15),
                     new ckc.i(dcx.hp, 1, 1, 12, 15),
                     new ckc.i(dcx.hl, 1, 1, 12, 15),
                     new ckc.i(dcx.ho, 1, 1, 12, 15),
                     new ckc.i(dcx.hw, 1, 1, 12, 15),
                     new ckc.i(dcx.hs, 1, 1, 12, 15),
                     new ckc.i(dcx.ht, 1, 1, 12, 15),
                     new ckc.i(dcx.hn, 1, 1, 12, 15),
                     new ckc.i(dcx.hv, 1, 1, 12, 15),
                     new ckc.i(dcx.lh, 1, 1, 12, 15),
                     new ckc.i(dcx.lg, 1, 1, 12, 15),
                     new ckc.i(dcx.lr, 1, 1, 12, 15),
                     new ckc.i(dcx.lj, 1, 1, 12, 15),
                     new ckc.i(dcx.ln, 1, 1, 12, 15),
                     new ckc.i(dcx.lo, 1, 1, 12, 15),
                     new ckc.i(dcx.lv, 1, 1, 12, 15),
                     new ckc.i(dcx.lu, 1, 1, 12, 15),
                     new ckc.i(dcx.lm, 1, 1, 12, 15),
                     new ckc.i(dcx.li, 1, 1, 12, 15),
                     new ckc.i(dcx.ll, 1, 1, 12, 15),
                     new ckc.i(dcx.lt, 1, 1, 12, 15),
                     new ckc.i(dcx.lp, 1, 1, 12, 15),
                     new ckc.i(dcx.lq, 1, 1, 12, 15),
                     new ckc.i(dcx.lk, 1, 1, 12, 15),
                     new ckc.i(dcx.ls, 1, 1, 12, 15)
                  },
                  5,
                  new ckc.g[]{new ckc.i(dcx.hf, 1, 1, 12, 30), new ckc.i(dcx.hd, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<ckc.g[]> b = a(
      ImmutableMap.of(
         1,
         new ckc.g[]{
            new ckc.i(csg.cT, 2, 1, 5, 1),
            new ckc.i(csg.qQ, 4, 1, 5, 1),
            new ckc.i(csg.fu, 2, 1, 5, 1),
            new ckc.i(csg.vR, 5, 1, 5, 1),
            new ckc.i(csg.cO, 1, 1, 12, 1),
            new ckc.i(csg.dJ, 1, 1, 8, 1),
            new ckc.i(csg.fk, 1, 1, 4, 1),
            new ckc.i(csg.dK, 3, 1, 12, 1),
            new ckc.i(csg.eW, 3, 1, 8, 1),
            new ckc.i(csg.dk, 1, 1, 12, 1),
            new ckc.i(csg.dl, 1, 1, 12, 1),
            new ckc.i(csg.dm, 1, 1, 8, 1),
            new ckc.i(csg.dn, 1, 1, 12, 1),
            new ckc.i(csg.do, 1, 1, 12, 1),
            new ckc.i(csg.dp, 1, 1, 12, 1),
            new ckc.i(csg.dq, 1, 1, 12, 1),
            new ckc.i(csg.dr, 1, 1, 12, 1),
            new ckc.i(csg.ds, 1, 1, 12, 1),
            new ckc.i(csg.dt, 1, 1, 12, 1),
            new ckc.i(csg.du, 1, 1, 12, 1),
            new ckc.i(csg.dv, 1, 1, 7, 1),
            new ckc.i(csg.pv, 1, 1, 12, 1),
            new ckc.i(csg.vl, 1, 1, 12, 1),
            new ckc.i(csg.rY, 1, 1, 12, 1),
            new ckc.i(csg.rZ, 1, 1, 12, 1),
            new ckc.i(csg.aa, 5, 1, 8, 1),
            new ckc.i(csg.Y, 5, 1, 8, 1),
            new ckc.i(csg.ac, 5, 1, 8, 1),
            new ckc.i(csg.Z, 5, 1, 8, 1),
            new ckc.i(csg.W, 5, 1, 8, 1),
            new ckc.i(csg.X, 5, 1, 8, 1),
            new ckc.i(csg.ab, 5, 1, 8, 1),
            new ckc.i(csg.ad, 5, 1, 8, 1),
            new ckc.i(csg.rw, 1, 3, 12, 1),
            new ckc.i(csg.ri, 1, 3, 12, 1),
            new ckc.i(csg.rt, 1, 3, 12, 1),
            new ckc.i(csg.ro, 1, 3, 12, 1),
            new ckc.i(csg.rx, 1, 3, 12, 1),
            new ckc.i(csg.rv, 1, 3, 12, 1),
            new ckc.i(csg.rq, 1, 3, 12, 1),
            new ckc.i(csg.rk, 1, 3, 12, 1),
            new ckc.i(csg.rm, 1, 3, 12, 1),
            new ckc.i(csg.rp, 1, 3, 12, 1),
            new ckc.i(csg.rs, 1, 3, 12, 1),
            new ckc.i(csg.rl, 1, 3, 12, 1),
            new ckc.i(csg.rn, 1, 3, 12, 1),
            new ckc.i(csg.rj, 1, 3, 12, 1),
            new ckc.i(csg.ru, 1, 3, 12, 1),
            new ckc.i(csg.rr, 1, 3, 12, 1),
            new ckc.i(csg.kx, 3, 1, 8, 1),
            new ckc.i(csg.ky, 3, 1, 8, 1),
            new ckc.i(csg.kz, 3, 1, 8, 1),
            new ckc.i(csg.kA, 3, 1, 8, 1),
            new ckc.i(csg.kw, 3, 1, 8, 1),
            new ckc.i(csg.fV, 1, 1, 12, 1),
            new ckc.i(csg.dA, 1, 1, 12, 1),
            new ckc.i(csg.dB, 1, 1, 12, 1),
            new ckc.i(csg.gb, 1, 2, 5, 1),
            new ckc.i(csg.dQ, 1, 2, 5, 1),
            new ckc.i(csg.af, 1, 8, 8, 1),
            new ckc.i(csg.ai, 1, 4, 6, 1),
            new ckc.i(csg.xl, 1, 2, 5, 1),
            new ckc.i(csg.F, 1, 2, 5, 1),
            new ckc.i(csg.dN, 1, 2, 5, 1)
         },
         2,
         new ckc.g[]{
            new ckc.i(csg.qI, 5, 1, 4, 1),
            new ckc.i(csg.qF, 5, 1, 4, 1),
            new ckc.i(csg.hV, 3, 1, 6, 1),
            new ckc.i(csg.kV, 6, 1, 6, 1),
            new ckc.i(csg.pu, 1, 1, 8, 1),
            new ckc.i(csg.E, 3, 3, 6, 1)
         }
      )
   );
   private static final ckc.l s = new ckc.l(8, avz.f, "filled_map.village_desert", ena.a.B, 12, 5);
   private static final ckc.l t = new ckc.l(8, avz.e, "filled_map.village_savanna", ena.a.D, 12, 5);
   private static final ckc.l u = new ckc.l(8, avz.g, "filled_map.village_plains", ena.a.C, 12, 5);
   private static final ckc.l v = new ckc.l(8, avz.h, "filled_map.village_taiga", ena.a.F, 12, 5);
   private static final ckc.l w = new ckc.l(8, avz.i, "filled_map.village_snowy", ena.a.E, 12, 5);
   private static final ckc.l x = new ckc.l(8, avz.j, "filled_map.explorer_jungle", ena.a.G, 12, 5);
   private static final ckc.l y = new ckc.l(8, avz.k, "filled_map.explorer_swamp", ena.a.H, 12, 5);
   public static final Map<ckb, Int2ObjectMap<ckc.g[]>> c = Map.of(
      ckb.k,
      a(
         ImmutableMap.builder()
            .put(1, new ckc.g[]{new ckc.b(csg.qO, 24, 16, 2), a(1), new ckc.i(dcx.cl, 9, 1, 12, 1)})
            .put(2, new ckc.g[]{new ckc.b(csg.qP, 4, 12, 10), a(5), new ckc.i(csg.wp, 1, 1, 5)})
            .put(3, new ckc.g[]{new ckc.b(csg.rf, 5, 12, 20), a(10), new ckc.i(csg.cG, 1, 4, 10)})
            .put(4, new ckc.g[]{new ckc.b(csg.tZ, 2, 12, 30), new ckc.i(csg.qW, 5, 1, 15), new ckc.i(csg.qS, 4, 1, 15)})
            .put(5, new ckc.g[]{a(), new ckc.i(csg.uL, 20, 1, 30)})
            .build()
      ),
      ckb.c,
      a(
         ImmutableMap.builder()
            .put(1, new ckc.g[]{new ckc.b(csg.ow, 15, 12, 2), new ckc.b(csg.oE, 5, 12, 2)})
            .put(
               2,
               new ckc.g[]{
                  ckc.m.a(new ckc.i(csg.pJ, 4, 1, 12, 5, 0.05F), ckd.a, ckd.c, ckd.d, ckd.e, ckd.g),
                  ckc.m.a(new ckc.i(csg.pF, 4, 1, 12, 5, 0.05F), ckd.b, ckd.f),
                  ckc.m.a(new ckc.i(csg.pG, 5, 1, 12, 5, 0.05F), ckd.a, ckd.c, ckd.d, ckd.e, ckd.g),
                  ckc.m.a(new ckc.i(csg.pC, 5, 1, 12, 5, 0.05F), ckd.b, ckd.f),
                  ckc.m.a(new ckc.i(csg.pI, 7, 1, 12, 5, 0.05F), ckd.a, ckd.c, ckd.d, ckd.e, ckd.g),
                  ckc.m.a(new ckc.i(csg.pE, 7, 1, 12, 5, 0.05F), ckd.b, ckd.f),
                  ckc.m.a(new ckc.i(csg.pH, 9, 1, 12, 5, 0.05F), ckd.a, ckd.c, ckd.d, ckd.e, ckd.g),
                  ckc.m.a(new ckc.i(csg.pD, 9, 1, 12, 5, 0.05F), ckd.b, ckd.f)
               }
            )
            .put(3, new ckc.g[]{new ckc.b(csg.qA, 1, 12, 20), new ckc.i(csg.vs, 5, 1, 12, 10, 0.05F), new ckc.i(csg.wo, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new ckc.g[]{
                  ckc.m.a(new ckc.i(a(csg.pJ, cxq.h, 1), 8, 1, 3, 15, 0.05F), ckd.a),
                  ckc.m.a(new ckc.i(a(csg.pG, cxq.h, 1), 9, 1, 3, 15, 0.05F), ckd.a),
                  ckc.m.a(new ckc.i(a(csg.pI, cxq.h, 1), 11, 1, 3, 15, 0.05F), ckd.a),
                  ckc.m.a(new ckc.i(a(csg.pH, cxq.h, 1), 13, 1, 3, 15, 0.05F), ckd.a),
                  ckc.m.a(new ckc.i(a(csg.pJ, cxq.a, 1), 8, 1, 3, 15, 0.05F), ckd.c),
                  ckc.m.a(new ckc.i(a(csg.pG, cxq.a, 1), 9, 1, 3, 15, 0.05F), ckd.c),
                  ckc.m.a(new ckc.i(a(csg.pI, cxq.a, 1), 11, 1, 3, 15, 0.05F), ckd.c),
                  ckc.m.a(new ckc.i(a(csg.pH, cxq.a, 1), 13, 1, 3, 15, 0.05F), ckd.c),
                  ckc.m.a(new ckc.i(a(csg.pJ, cxq.k, 1), 2, 1, 3, 15, 0.05F), ckd.d),
                  ckc.m.a(new ckc.i(a(csg.pG, cxq.k, 1), 3, 1, 3, 15, 0.05F), ckd.d),
                  ckc.m.a(new ckc.i(a(csg.pI, cxq.k, 1), 5, 1, 3, 15, 0.05F), ckd.d),
                  ckc.m.a(new ckc.i(a(csg.pH, cxq.k, 1), 7, 1, 3, 15, 0.05F), ckd.d),
                  ckc.m.a(new ckc.i(a(csg.pJ, cxq.j, 1), 8, 1, 3, 15, 0.05F), ckd.e),
                  ckc.m.a(new ckc.i(a(csg.pG, cxq.g, 1), 9, 1, 3, 15, 0.05F), ckd.e),
                  ckc.m.a(new ckc.i(a(csg.pF, cxq.w, 1), 8, 1, 3, 15, 0.05F), ckd.b),
                  ckc.m.a(new ckc.i(a(csg.pC, cxq.w, 1), 9, 1, 3, 15, 0.05F), ckd.b),
                  ckc.m.a(new ckc.i(a(csg.pE, cxq.w, 1), 11, 1, 3, 15, 0.05F), ckd.b),
                  ckc.m.a(new ckc.i(a(csg.pD, cxq.w, 1), 13, 1, 3, 15, 0.05F), ckd.b),
                  ckc.m.a(new ckc.i(a(csg.pF, cxq.L, 1), 8, 1, 3, 15, 0.05F), ckd.f),
                  ckc.m.a(new ckc.i(a(csg.pC, cxq.L, 1), 9, 1, 3, 15, 0.05F), ckd.f),
                  ckc.m.a(new ckc.i(a(csg.pE, cxq.L, 1), 11, 1, 3, 15, 0.05F), ckd.f),
                  ckc.m.a(new ckc.i(a(csg.pD, cxq.L, 1), 13, 1, 3, 15, 0.05F), ckd.f),
                  ckc.m.a(new ckc.h(csg.pN, 1, 4, csg.pM, 1, 3, 15, 0.05F), ckd.g),
                  ckc.m.a(new ckc.h(csg.pM, 1, 4, csg.pL, 1, 3, 15, 0.05F), ckd.g),
                  ckc.m.a(new ckc.h(csg.pK, 1, 4, csg.pN, 1, 3, 15, 0.05F), ckd.g),
                  ckc.m.a(new ckc.h(csg.pL, 1, 2, csg.pK, 1, 3, 15, 0.05F), ckd.g)
               }
            )
            .put(
               5,
               new ckc.g[]{
                  ckc.m.a(new ckc.h(csg.oy, 4, 16, a(csg.pL, cxq.h, 1), 1, 3, 30, 0.05F), ckd.a),
                  ckc.m.a(new ckc.h(csg.oy, 3, 16, a(csg.pM, cxq.h, 1), 1, 3, 30, 0.05F), ckd.a),
                  ckc.m.a(new ckc.h(csg.oy, 3, 16, a(csg.pM, cxq.a, 1), 1, 3, 30, 0.05F), ckd.c),
                  ckc.m.a(new ckc.h(csg.oy, 2, 12, a(csg.pN, cxq.a, 1), 1, 3, 30, 0.05F), ckd.c),
                  ckc.m.a(new ckc.h(csg.oy, 2, 6, a(csg.pK, cxq.k, 1), 1, 3, 30, 0.05F), ckd.d),
                  ckc.m.a(new ckc.h(csg.oy, 3, 8, a(csg.pL, cxq.k, 1), 1, 3, 30, 0.05F), ckd.d),
                  ckc.m.a(new ckc.h(csg.oy, 2, 12, a(csg.pN, cxq.j, 1), 1, 3, 30, 0.05F), ckd.e),
                  ckc.m.a(new ckc.h(csg.oy, 3, 12, a(csg.pK, cxq.g, 1), 1, 3, 30, 0.05F), ckd.e),
                  ckc.m.a(new ckc.i(a(csg.pC, cxq.e, 1), 9, 1, 3, 30, 0.05F), ckd.b),
                  ckc.m.a(new ckc.i(a(csg.pF, cxq.c, 1), 8, 1, 3, 30, 0.05F), ckd.b),
                  ckc.m.a(new ckc.i(a(csg.pC, cxq.f, 1), 9, 1, 3, 30, 0.05F), ckd.f),
                  ckc.m.a(new ckc.i(a(csg.pF, cxq.i, 1), 8, 1, 3, 30, 0.05F), ckd.f),
                  ckc.m.a(new ckc.h(csg.oy, 4, 18, a(csg.pL, cxq.d, 1), 1, 3, 30, 0.05F), ckd.g),
                  ckc.m.a(new ckc.h(csg.oy, 3, 18, a(csg.pM, cxq.d, 1), 1, 3, 30, 0.05F), ckd.g),
                  ckc.m.a(new ckc.b(csg.aN, 1, 12, 30, 42), ckd.g),
                  ckc.m.a(new ckc.b(csg.aK, 1, 12, 30, 4), ckd.a, ckd.b, ckd.c, ckd.d, ckd.e, ckd.f)
               }
            )
            .build()
      ),
      ckb.e,
      a(
         ImmutableMap.of(
            1,
            new ckc.g[]{new ckc.b(csg.qO, 24, 16, 2), new ckc.i(csg.uj, 7, 1, 1)},
            2,
            new ckc.g[]{
               new ckc.b(csg.fT, 11, 16, 10),
               new ckc.m(ImmutableMap.builder().put(ckd.a, t).put(ckd.d, u).put(ckd.c, v).put(ckd.g, w).put(ckd.e, u).put(ckd.b, t).put(ckd.f, w).build()),
               new ckc.m(ImmutableMap.builder().put(ckd.a, u).put(ckd.d, s).put(ckd.c, t).put(ckd.g, u).put(ckd.e, v).put(ckd.b, s).put(ckd.f, v).build()),
               new ckc.m(
                  ImmutableMap.builder().put(ckd.a, x).put(ckd.d, x).put(ckd.c, new ckc.f()).put(ckd.g, y).put(ckd.e, y).put(ckd.b, y).put(ckd.f, x).build()
               )
            },
            3,
            new ckc.g[]{new ckc.b(csg.qS, 1, 12, 20), new ckc.l(13, avz.d, "filled_map.monument", ena.a.j, 12, 10)},
            4,
            new ckc.g[]{
               new ckc.i(csg.uc, 7, 1, 15),
               new ckc.i(csg.uP, 3, 1, 15),
               new ckc.i(csg.va, 3, 1, 15),
               new ckc.i(csg.uS, 3, 1, 15),
               new ckc.i(csg.vd, 3, 1, 15),
               new ckc.i(csg.uV, 3, 1, 15),
               new ckc.i(csg.vc, 3, 1, 15),
               new ckc.i(csg.uU, 3, 1, 15),
               new ckc.i(csg.uW, 3, 1, 15),
               new ckc.i(csg.ve, 3, 1, 15),
               new ckc.i(csg.uZ, 3, 1, 15),
               new ckc.i(csg.uR, 3, 1, 15),
               new ckc.i(csg.uY, 3, 1, 15),
               new ckc.i(csg.vb, 3, 1, 15),
               new ckc.i(csg.uT, 3, 1, 15),
               new ckc.i(csg.uQ, 3, 1, 15),
               new ckc.i(csg.uX, 3, 1, 15)
            },
            5,
            new ckc.g[]{new ckc.i(csg.wa, 8, 1, 30), new ckc.l(14, avz.c, "filled_map.mansion", ena.a.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<ckc.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new ckc.g[]{
               new ckc.b(a(cud.a), 1, 1, 1),
               new ckc.b(csg.qz, 1, 1, 1, 2),
               new ckc.b(csg.qE, 1, 1, 1, 2),
               new ckc.b(csg.sn, 1, 1, 1, 3),
               new ckc.b(csg.uh, 4, 1, 1),
               new ckc.b(csg.hD, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new ckc.g[]{
               new ckc.i(csg.hV, 1, 1, 6, 1),
               new ckc.i(csg.kV, 6, 1, 6, 1),
               new ckc.i(csg.pu, 1, 4, 2, 1),
               new ckc.i(csg.E, 3, 3, 6, 1),
               new ckc.i(dcx.Y, 1, 8, 4, 1),
               new ckc.i(dcx.W, 1, 8, 4, 1),
               new ckc.i(dcx.aa, 1, 8, 4, 1),
               new ckc.i(dcx.X, 1, 8, 4, 1),
               new ckc.i(dcx.U, 1, 8, 4, 1),
               new ckc.i(dcx.V, 1, 8, 4, 1),
               new ckc.i(dcx.Z, 1, 8, 4, 1),
               new ckc.e(csg.pc, 1, 1, 1, 0.2F),
               new ckc.i(b(cud.h), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new ckc.g[]{
               new ckc.i(csg.qI, 3, 1, 4, 1),
               new ckc.i(csg.qF, 3, 1, 4, 1),
               new ckc.i(csg.cT, 2, 1, 5, 1),
               new ckc.i(csg.qQ, 4, 1, 5, 1),
               new ckc.i(csg.fu, 2, 1, 5, 1),
               new ckc.i(csg.vR, 5, 1, 5, 1),
               new ckc.i(csg.cO, 1, 1, 12, 1),
               new ckc.i(csg.dJ, 1, 1, 8, 1),
               new ckc.i(csg.fk, 1, 1, 4, 1),
               new ckc.i(csg.dK, 3, 1, 12, 1),
               new ckc.i(csg.eW, 3, 1, 8, 1),
               new ckc.i(csg.dk, 1, 1, 12, 1),
               new ckc.i(csg.dl, 1, 1, 12, 1),
               new ckc.i(csg.dm, 1, 1, 8, 1),
               new ckc.i(csg.dn, 1, 1, 12, 1),
               new ckc.i(csg.do, 1, 1, 12, 1),
               new ckc.i(csg.dp, 1, 1, 12, 1),
               new ckc.i(csg.dq, 1, 1, 12, 1),
               new ckc.i(csg.dr, 1, 1, 12, 1),
               new ckc.i(csg.ds, 1, 1, 12, 1),
               new ckc.i(csg.dt, 1, 1, 12, 1),
               new ckc.i(csg.du, 1, 1, 12, 1),
               new ckc.i(csg.dv, 1, 1, 7, 1),
               new ckc.i(csg.pv, 1, 1, 12, 1),
               new ckc.i(csg.vl, 1, 1, 12, 1),
               new ckc.i(csg.rY, 1, 1, 12, 1),
               new ckc.i(csg.rZ, 1, 1, 12, 1),
               new ckc.i(csg.aa, 5, 1, 8, 1),
               new ckc.i(csg.Y, 5, 1, 8, 1),
               new ckc.i(csg.ac, 5, 1, 8, 1),
               new ckc.i(csg.Z, 5, 1, 8, 1),
               new ckc.i(csg.W, 5, 1, 8, 1),
               new ckc.i(csg.X, 5, 1, 8, 1),
               new ckc.i(csg.ab, 5, 1, 8, 1),
               new ckc.i(csg.ad, 5, 1, 8, 1),
               new ckc.i(csg.rw, 1, 3, 12, 1),
               new ckc.i(csg.ri, 1, 3, 12, 1),
               new ckc.i(csg.rt, 1, 3, 12, 1),
               new ckc.i(csg.ro, 1, 3, 12, 1),
               new ckc.i(csg.rx, 1, 3, 12, 1),
               new ckc.i(csg.rv, 1, 3, 12, 1),
               new ckc.i(csg.rq, 1, 3, 12, 1),
               new ckc.i(csg.rk, 1, 3, 12, 1),
               new ckc.i(csg.rm, 1, 3, 12, 1),
               new ckc.i(csg.rp, 1, 3, 12, 1),
               new ckc.i(csg.rs, 1, 3, 12, 1),
               new ckc.i(csg.rl, 1, 3, 12, 1),
               new ckc.i(csg.rn, 1, 3, 12, 1),
               new ckc.i(csg.rj, 1, 3, 12, 1),
               new ckc.i(csg.ru, 1, 3, 12, 1),
               new ckc.i(csg.rr, 1, 3, 12, 1),
               new ckc.i(csg.kx, 3, 1, 8, 1),
               new ckc.i(csg.ky, 3, 1, 8, 1),
               new ckc.i(csg.kz, 3, 1, 8, 1),
               new ckc.i(csg.kA, 3, 1, 8, 1),
               new ckc.i(csg.kw, 3, 1, 8, 1),
               new ckc.i(csg.fV, 1, 3, 4, 1),
               new ckc.i(csg.dA, 1, 3, 4, 1),
               new ckc.i(csg.dB, 1, 3, 4, 1),
               new ckc.i(csg.gb, 1, 5, 2, 1),
               new ckc.i(csg.dQ, 1, 2, 5, 1),
               new ckc.i(csg.af, 1, 8, 8, 1),
               new ckc.i(csg.ai, 1, 4, 6, 1),
               new ckc.i(csg.xl, 1, 2, 5, 1),
               new ckc.i(csg.F, 1, 2, 5, 1),
               new ckc.i(csg.dN, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static ckc.g a(int $$0) {
      return new ckc.m(
         ImmutableMap.builder()
            .put(ckd.a, new ckc.d($$0, cxq.b, cxq.h, cxq.B))
            .put(ckd.b, new ckc.d($$0, cxq.c, cxq.e, cxq.y))
            .put(ckd.c, new ckc.d($$0, cxq.z, cxq.o, cxq.p))
            .put(ckd.d, new ckc.d($$0, cxq.q, cxq.k, cxq.t))
            .put(ckd.e, new ckc.d($$0, cxq.g, cxq.s, cxq.j))
            .put(ckd.f, new ckc.d($$0, cxq.i, cxq.f, cxq.M))
            .put(ckd.g, new ckc.d($$0, cxq.d, cxq.r, cxq.A))
            .build()
      );
   }

   private static ckc.g a() {
      return new ckc.m(
         ImmutableMap.builder()
            .put(ckd.a, new ckc.d(30, 3, 3, cxq.u))
            .put(ckd.b, new ckc.d(30, 2, 2, cxq.w))
            .put(ckd.c, new ckc.d(30, 3, 3, cxq.a))
            .put(ckd.d, new ckc.d(30, 3, 3, cxq.n))
            .put(ckd.e, new ckc.d(30, cxq.v))
            .put(ckd.f, new ckc.d(30, cxq.L))
            .put(ckd.g, new ckc.d(30, 2, 2, cxq.x))
            .build()
      );
   }

   private static Int2ObjectMap<ckc.g[]> a(ImmutableMap<Integer, ckc.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static cyq a(iv<cua> $$0) {
      return new cyq(csg.sk).a($$1 -> $$1.a(jz.x, new cuc($$0)));
   }

   private static csd b(iv<cua> $$0) {
      return cuc.a(csg.sk, $$0);
   }

   private static csd a(cry $$0, cxn $$1, int $$2) {
      csd $$3 = new csd($$0);
      $$3.a($$1, $$2);
      return $$3;
   }

   static class a implements ckc.g {
      private final cry a;
      private final int b;
      private final int c;
      private final int d;

      public a(cry $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(cry $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public cys a(bql $$0, ayd $$1) {
         cyq $$2 = new cyq(csg.oz, this.b);
         csd $$3 = new csd(this.a);
         if ($$3.a(avw.ba)) {
            List<cqx> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = cut.a($$3, $$4);
         }

         return new cys($$2, $$3, this.c, this.d, 0.2F);
      }

      private static cqx a(ayd $$0) {
         return cqx.a(cqw.a($$0.a(16)));
      }
   }

   static class b implements ckc.g {
      private final cyq a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(czt $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(czt $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cyq($$0.p(), $$1), $$2, $$3, $$4);
      }

      public b(cyq $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public cys a(bql $$0, ayd $$1) {
         return new cys(this.a, new csd(csg.oz, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements ckc.g {
      private final Map<ckd, cry> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<ckd, cry> $$3) {
         lc.y.s().filter($$1x -> !$$3.containsKey($$1x)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + lc.y.b($$0x));
         });
         this.a = $$3;
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Nullable
      @Override
      public cys a(bql $$0, ayd $$1) {
         if ($$0 instanceof cka $$2) {
            cyq $$3 = new cyq(this.a.get($$2.gA().a()), this.b);
            return new cys($$3, new csd(csg.oz), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements ckc.g {
      private final int a;
      private final List<cxn> b;
      private final int c;
      private final int d;

      public d(int $$0) {
         this($$0, lc.f.s().filter(cxn::i).toArray(cxn[]::new));
      }

      public d(int $$0, cxn... $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, cxn... $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = Arrays.asList($$3);
      }

      @Override
      public cys a(bql $$0, ayd $$1) {
         cxn $$2 = this.b.get($$1.a(this.b.size()));
         int $$3 = Math.max($$2.f(), this.c);
         int $$4 = Math.min($$2.a(), this.d);
         int $$5 = axw.a($$1, $$3, $$4);
         csd $$6 = crb.a(new cxp($$2, $$5));
         int $$7 = 2 + $$1.a(5 + $$5 * 10) + 3 * $$5;
         if ($$2.b()) {
            $$7 *= 2;
         }

         if ($$7 > 64) {
            $$7 = 64;
         }

         return new cys(new cyq(csg.oz, $$7), Optional.of(new cyq(csg.qP)), $$6, 12, this.a, 0.2F);
      }
   }

   static class e implements ckc.g {
      private final csd a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(cry $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(cry $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new csd($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public cys a(bql $$0, ayd $$1) {
         int $$2 = 5 + $$1.a(15);
         csd $$3 = cxo.a($$1, new csd(this.a.f()), $$2, false);
         int $$4 = Math.min(this.b + $$2, 64);
         cyq $$5 = new cyq(csg.oz, $$4);
         return new cys($$5, $$3, this.c, this.d, this.e);
      }
   }

   static class f implements ckc.g {
      @Override
      public cys a(bql $$0, ayd $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      cys a(bql var1, ayd var2);
   }

   static class h implements ckc.g {
      private final cyq a;
      private final int b;
      private final csd c;
      private final int d;
      private final int e;
      private final float f;

      public h(czt $$0, int $$1, int $$2, cry $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new csd($$3), $$4, $$5, $$6, $$7);
      }

      h(czt $$0, int $$1, int $$2, csd $$3, int $$4, int $$5, int $$6, float $$7) {
         this(new cyq($$0, $$1), $$2, $$3.c($$4), $$5, $$6, $$7);
      }

      public h(cyq $$0, int $$1, csd $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public cys a(bql $$0, ayd $$1) {
         return new cys(new cyq(csg.oz, this.b), Optional.of(this.a), this.c.r(), 0, this.d, this.e, this.f, 0);
      }
   }

   static class i implements ckc.g {
      private final csd a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public i(dcv $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new csd($$0), $$1, $$2, $$3, $$4);
      }

      public i(cry $$0, int $$1, int $$2, int $$3) {
         this(new csd($$0), $$1, $$2, 12, $$3);
      }

      public i(cry $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new csd($$0), $$1, $$2, $$3, $$4);
      }

      public i(csd $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(cry $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new csd($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(csd $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.a.e($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
      }

      @Override
      public cys a(bql $$0, ayd $$1) {
         return new cys(new cyq(csg.oz, this.b), this.a.r(), this.c, this.d, this.e);
      }
   }

   static class j implements ckc.g {
      private final cvf a;
      private final int b;
      private final float c;

      public j(iv<bpv> $$0, int $$1, int $$2) {
         this(new cvf(List.of(new cvf.a($$0, $$1))), $$2, 0.05F);
      }

      public j(cvf $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public cys a(bql $$0, ayd $$1) {
         csd $$2 = new csd(csg.vU, 1);
         $$2.b(jz.y, this.a);
         return new cys(new cyq(csg.oz), $$2, 12, this.b, this.c);
      }
   }

   static class k implements ckc.g {
      private final csd a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final cry f;
      private final int g;
      private final float h;

      public k(cry $$0, int $$1, cry $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new csd($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public cys a(bql $$0, ayd $$1) {
         cyq $$2 = new cyq(csg.oz, this.c);
         List<iv<cua>> $$3 = lc.i.h().filter($$0x -> !((cua)$$0x.a()).a().isEmpty() && cub.a($$0x)).collect(Collectors.toList());
         iv<cua> $$4 = ac.a($$3, $$1);
         csd $$5 = new csd(this.a.f(), this.b);
         $$5.b(jz.x, new cuc($$4));
         return new cys($$2, Optional.of(new cyq(this.f, this.g)), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements ckc.g {
      private final int a;
      private final awd<egg> b;
      private final String c;
      private final ena.a d;
      private final int e;
      private final int f;

      public l(int $$0, awd<egg> $$1, String $$2, ena.a $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public cys a(bql $$0, ayd $$1) {
         if (!($$0.dN() instanceof aqe)) {
            return null;
         } else {
            aqe $$2 = (aqe)$$0.dN();
            im $$3 = $$2.a(this.b, $$0.dn(), 100, true);
            if ($$3 != null) {
               csd $$4 = csl.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               csl.a($$2, $$4);
               ene.a($$4, $$3, "+", this.d);
               $$4.b(jz.d, ws.c(this.c));
               return new cys(new cyq(csg.oz, this.a), Optional.of(new cyq(csg.qS)), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static record m(Map<ckd, ckc.g> a) implements ckc.g {
      public static ckc.m a(ckc.g $$0, ckd... $$1) {
         return new ckc.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public cys a(bql $$0, ayd $$1) {
         if ($$0 instanceof cka $$2) {
            ckd $$3 = $$2.gA().a();
            ckc.g $$4 = this.a.get($$3);
            return $$4 == null ? null : $$4.a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
