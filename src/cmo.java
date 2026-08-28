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

public class cmo {
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
   public static final Map<cmn, Int2ObjectMap<cmo.g[]>> a = ac.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            cmn.g,
            a(
               ImmutableMap.of(
                  1,
                  new cmo.g[]{
                     new cmo.b(cus.pw, 20, 16, 2),
                     new cmo.b(cus.ug, 26, 16, 2),
                     new cmo.b(cus.uf, 22, 16, 2),
                     new cmo.b(cus.vk, 15, 16, 2),
                     new cmo.i(cus.px, 1, 6, 16, 1)
                  },
                  2,
                  new cmo.g[]{new cmo.b(dfb.eZ, 6, 12, 10), new cmo.i(cus.ut, 1, 4, 5), new cmo.i(cus.ot, 1, 4, 16, 5)},
                  3,
                  new cmo.g[]{new cmo.i(cus.rS, 3, 18, 10), new cmo.b(dfb.fa, 4, 12, 20)},
                  4,
                  new cmo.g[]{
                     new cmo.i(dfb.eg, 1, 1, 12, 15),
                     new cmo.j(bse.p, 100, 15),
                     new cmo.j(bse.h, 160, 15),
                     new cmo.j(bse.r, 140, 15),
                     new cmo.j(bse.o, 120, 15),
                     new cmo.j(bse.s, 280, 15),
                     new cmo.j(bse.w, 7, 15)
                  },
                  5,
                  new cmo.g[]{new cmo.i(cus.uk, 3, 3, 30), new cmo.i(cus.st, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            cmn.h,
            a(
               ImmutableMap.of(
                  1,
                  new cmo.g[]{
                     new cmo.b(cus.ps, 20, 16, 2),
                     new cmo.b(cus.ow, 10, 16, 2),
                     new cmo.h(cus.qZ, 6, 1, cus.rd, 6, 16, 1, 0.05F),
                     new cmo.i(cus.qH, 3, 1, 16, 1)
                  },
                  2,
                  new cmo.g[]{new cmo.b(cus.qZ, 15, 16, 10), new cmo.h(cus.ra, 6, 1, cus.re, 6, 16, 5, 0.05F), new cmo.i(cus.wt, 2, 1, 5)},
                  3,
                  new cmo.g[]{new cmo.b(cus.ra, 13, 16, 20), new cmo.e(cus.qV, 3, 3, 10, 0.2F)},
                  4,
                  new cmo.g[]{new cmo.b(cus.rb, 6, 12, 30)},
                  5,
                  new cmo.g[]{
                     new cmo.b(cus.rc, 4, 12, 30),
                     new cmo.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(cmp.c, cus.nU)
                           .put(cmp.g, cus.nW)
                           .put(cmp.e, cus.nW)
                           .put(cmp.a, cus.oa)
                           .put(cmp.b, cus.oa)
                           .put(cmp.d, cus.oc)
                           .put(cmp.f, cus.og)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            cmn.n,
            a(
               ImmutableMap.of(
                  1,
                  new cmo.g[]{
                     new cmo.b(dfb.bA, 18, 16, 2),
                     new cmo.b(dfb.bM, 18, 16, 2),
                     new cmo.b(dfb.bP, 18, 16, 2),
                     new cmo.b(dfb.bH, 18, 16, 2),
                     new cmo.i(cus.rV, 2, 1, 1)
                  },
                  2,
                  new cmo.g[]{
                     new cmo.b(cus.ri, 12, 16, 10),
                     new cmo.b(cus.rp, 12, 16, 10),
                     new cmo.b(cus.rx, 12, 16, 10),
                     new cmo.b(cus.rl, 12, 16, 10),
                     new cmo.b(cus.rn, 12, 16, 10),
                     new cmo.i(dfb.bA, 1, 1, 16, 5),
                     new cmo.i(dfb.bB, 1, 1, 16, 5),
                     new cmo.i(dfb.bC, 1, 1, 16, 5),
                     new cmo.i(dfb.bD, 1, 1, 16, 5),
                     new cmo.i(dfb.bE, 1, 1, 16, 5),
                     new cmo.i(dfb.bF, 1, 1, 16, 5),
                     new cmo.i(dfb.bG, 1, 1, 16, 5),
                     new cmo.i(dfb.bH, 1, 1, 16, 5),
                     new cmo.i(dfb.bI, 1, 1, 16, 5),
                     new cmo.i(dfb.bJ, 1, 1, 16, 5),
                     new cmo.i(dfb.bK, 1, 1, 16, 5),
                     new cmo.i(dfb.bL, 1, 1, 16, 5),
                     new cmo.i(dfb.bM, 1, 1, 16, 5),
                     new cmo.i(dfb.bN, 1, 1, 16, 5),
                     new cmo.i(dfb.bO, 1, 1, 16, 5),
                     new cmo.i(dfb.bP, 1, 1, 16, 5),
                     new cmo.i(dfb.ik, 1, 4, 16, 5),
                     new cmo.i(dfb.il, 1, 4, 16, 5),
                     new cmo.i(dfb.im, 1, 4, 16, 5),
                     new cmo.i(dfb.in, 1, 4, 16, 5),
                     new cmo.i(dfb.io, 1, 4, 16, 5),
                     new cmo.i(dfb.ip, 1, 4, 16, 5),
                     new cmo.i(dfb.iq, 1, 4, 16, 5),
                     new cmo.i(dfb.ir, 1, 4, 16, 5),
                     new cmo.i(dfb.is, 1, 4, 16, 5),
                     new cmo.i(dfb.it, 1, 4, 16, 5),
                     new cmo.i(dfb.iu, 1, 4, 16, 5),
                     new cmo.i(dfb.iv, 1, 4, 16, 5),
                     new cmo.i(dfb.iw, 1, 4, 16, 5),
                     new cmo.i(dfb.ix, 1, 4, 16, 5),
                     new cmo.i(dfb.iy, 1, 4, 16, 5),
                     new cmo.i(dfb.iz, 1, 4, 16, 5)
                  },
                  3,
                  new cmo.g[]{
                     new cmo.b(cus.rm, 12, 16, 20),
                     new cmo.b(cus.rq, 12, 16, 20),
                     new cmo.b(cus.rj, 12, 16, 20),
                     new cmo.b(cus.rw, 12, 16, 20),
                     new cmo.b(cus.ro, 12, 16, 20),
                     new cmo.i(dfb.aZ, 3, 1, 12, 10),
                     new cmo.i(dfb.bd, 3, 1, 12, 10),
                     new cmo.i(dfb.bn, 3, 1, 12, 10),
                     new cmo.i(dfb.bo, 3, 1, 12, 10),
                     new cmo.i(dfb.bk, 3, 1, 12, 10),
                     new cmo.i(dfb.bl, 3, 1, 12, 10),
                     new cmo.i(dfb.bi, 3, 1, 12, 10),
                     new cmo.i(dfb.bg, 3, 1, 12, 10),
                     new cmo.i(dfb.bm, 3, 1, 12, 10),
                     new cmo.i(dfb.bc, 3, 1, 12, 10),
                     new cmo.i(dfb.bh, 3, 1, 12, 10),
                     new cmo.i(dfb.be, 3, 1, 12, 10),
                     new cmo.i(dfb.bb, 3, 1, 12, 10),
                     new cmo.i(dfb.ba, 3, 1, 12, 10),
                     new cmo.i(dfb.bf, 3, 1, 12, 10),
                     new cmo.i(dfb.bj, 3, 1, 12, 10)
                  },
                  4,
                  new cmo.g[]{
                     new cmo.b(cus.ru, 12, 16, 30),
                     new cmo.b(cus.rs, 12, 16, 30),
                     new cmo.b(cus.rt, 12, 16, 30),
                     new cmo.b(cus.rv, 12, 16, 30),
                     new cmo.b(cus.rk, 12, 16, 30),
                     new cmo.b(cus.rr, 12, 16, 30),
                     new cmo.i(cus.uP, 3, 1, 12, 15),
                     new cmo.i(cus.va, 3, 1, 12, 15),
                     new cmo.i(cus.uS, 3, 1, 12, 15),
                     new cmo.i(cus.vd, 3, 1, 12, 15),
                     new cmo.i(cus.uV, 3, 1, 12, 15),
                     new cmo.i(cus.vc, 3, 1, 12, 15),
                     new cmo.i(cus.uU, 3, 1, 12, 15),
                     new cmo.i(cus.uW, 3, 1, 12, 15),
                     new cmo.i(cus.ve, 3, 1, 12, 15),
                     new cmo.i(cus.uZ, 3, 1, 12, 15),
                     new cmo.i(cus.uR, 3, 1, 12, 15),
                     new cmo.i(cus.uY, 3, 1, 12, 15),
                     new cmo.i(cus.vb, 3, 1, 12, 15),
                     new cmo.i(cus.uT, 3, 1, 12, 15),
                     new cmo.i(cus.uQ, 3, 1, 12, 15),
                     new cmo.i(cus.uX, 3, 1, 12, 15)
                  },
                  5,
                  new cmo.g[]{new cmo.i(cus.pZ, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            cmn.i,
            a(
               ImmutableMap.of(
                  1,
                  new cmo.g[]{new cmo.b(cus.pp, 32, 16, 2), new cmo.i(cus.ov, 1, 16, 1), new cmo.h(dfb.L, 10, 1, cus.pW, 10, 12, 1, 0.05F)},
                  2,
                  new cmo.g[]{new cmo.b(cus.pW, 26, 12, 10), new cmo.i(cus.ou, 2, 1, 5)},
                  3,
                  new cmo.g[]{new cmo.b(cus.ps, 14, 16, 20), new cmo.i(cus.vT, 3, 1, 10)},
                  4,
                  new cmo.g[]{new cmo.b(cus.pt, 24, 16, 30), new cmo.e(cus.ou, 2, 3, 15)},
                  5,
                  new cmo.g[]{new cmo.b(cus.mb, 8, 12, 30), new cmo.e(cus.vT, 3, 3, 15), new cmo.k(cus.ov, 5, cus.vq, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            cmn.k,
            a(
               ImmutableMap.builder()
                  .put(1, new cmo.g[]{new cmo.b(cus.qO, 24, 16, 2), new cmo.d(1), new cmo.i(dfb.cl, 9, 1, 12, 1)})
                  .put(2, new cmo.g[]{new cmo.b(cus.qP, 4, 12, 10), new cmo.d(5), new cmo.i(cus.wp, 1, 1, 5)})
                  .put(3, new cmo.g[]{new cmo.b(cus.rf, 5, 12, 20), new cmo.d(10), new cmo.i(cus.cG, 1, 4, 10)})
                  .put(4, new cmo.g[]{new cmo.b(cus.tZ, 2, 12, 30), new cmo.d(15), new cmo.i(cus.qW, 5, 1, 15), new cmo.i(cus.qS, 4, 1, 15)})
                  .put(5, new cmo.g[]{new cmo.i(cus.uL, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            cmn.e,
            a(
               ImmutableMap.of(
                  1,
                  new cmo.g[]{new cmo.b(cus.qO, 24, 16, 2), new cmo.i(cus.uj, 7, 1, 1)},
                  2,
                  new cmo.g[]{new cmo.b(cus.fT, 11, 16, 10), new cmo.l(13, axb.d, "filled_map.monument", epg.j, 12, 5)},
                  3,
                  new cmo.g[]{
                     new cmo.b(cus.qS, 1, 12, 20),
                     new cmo.l(14, axb.c, "filled_map.mansion", epg.i, 12, 10),
                     new cmo.l(12, axb.m, "filled_map.trial_chambers", epg.I, 12, 10)
                  },
                  4,
                  new cmo.g[]{
                     new cmo.i(cus.uc, 7, 1, 15),
                     new cmo.i(cus.uP, 3, 1, 15),
                     new cmo.i(cus.va, 3, 1, 15),
                     new cmo.i(cus.uS, 3, 1, 15),
                     new cmo.i(cus.vd, 3, 1, 15),
                     new cmo.i(cus.uV, 3, 1, 15),
                     new cmo.i(cus.vc, 3, 1, 15),
                     new cmo.i(cus.uU, 3, 1, 15),
                     new cmo.i(cus.uW, 3, 1, 15),
                     new cmo.i(cus.ve, 3, 1, 15),
                     new cmo.i(cus.uZ, 3, 1, 15),
                     new cmo.i(cus.uR, 3, 1, 15),
                     new cmo.i(cus.uY, 3, 1, 15),
                     new cmo.i(cus.vb, 3, 1, 15),
                     new cmo.i(cus.uT, 3, 1, 15),
                     new cmo.i(cus.uQ, 3, 1, 15),
                     new cmo.i(cus.uX, 3, 1, 15)
                  },
                  5,
                  new cmo.g[]{new cmo.i(cus.wa, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            cmn.f,
            a(
               ImmutableMap.of(
                  1,
                  new cmo.g[]{new cmo.b(cus.se, 32, 16, 2), new cmo.i(cus.lH, 1, 2, 1)},
                  2,
                  new cmo.g[]{new cmo.b(cus.oI, 3, 12, 10), new cmo.i(cus.oA, 1, 1, 5)},
                  3,
                  new cmo.g[]{new cmo.b(cus.uD, 2, 12, 20), new cmo.i(dfb.ec, 4, 1, 12, 10)},
                  4,
                  new cmo.g[]{new cmo.b(cus.op, 4, 12, 30), new cmo.b(cus.sl, 9, 12, 30), new cmo.i(cus.sf, 5, 1, 15)},
                  5,
                  new cmo.g[]{new cmo.b(cus.sj, 22, 12, 30), new cmo.i(cus.tW, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            cmn.c,
            a(
               ImmutableMap.of(
                  1,
                  new cmo.g[]{
                     new cmo.b(cus.ow, 15, 16, 2),
                     new cmo.i(new cup(cus.pI), 7, 1, 12, 1, 0.2F),
                     new cmo.i(new cup(cus.pJ), 4, 1, 12, 1, 0.2F),
                     new cmo.i(new cup(cus.pG), 5, 1, 12, 1, 0.2F),
                     new cmo.i(new cup(cus.pH), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cmo.g[]{
                     new cmo.b(cus.oE, 4, 12, 10),
                     new cmo.i(new cup(cus.wo), 36, 1, 12, 5, 0.2F),
                     new cmo.i(new cup(cus.pF), 1, 1, 12, 5, 0.2F),
                     new cmo.i(new cup(cus.pE), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new cmo.g[]{
                     new cmo.b(cus.qA, 1, 12, 20),
                     new cmo.b(cus.oy, 1, 12, 20),
                     new cmo.i(new cup(cus.pC), 1, 1, 12, 10, 0.2F),
                     new cmo.i(new cup(cus.pD), 4, 1, 12, 10, 0.2F),
                     new cmo.i(new cup(cus.vs), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new cmo.g[]{new cmo.e(cus.pM, 14, 3, 15, 0.2F), new cmo.e(cus.pN, 8, 3, 15, 0.2F)},
                  5,
                  new cmo.g[]{new cmo.e(cus.pK, 8, 3, 30, 0.2F), new cmo.e(cus.pL, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cmn.p,
            a(
               ImmutableMap.of(
                  1,
                  new cmo.g[]{new cmo.b(cus.ow, 15, 16, 2), new cmo.i(new cup(cus.pd), 3, 1, 12, 1, 0.2F), new cmo.e(cus.pa, 2, 3, 1)},
                  2,
                  new cmo.g[]{new cmo.b(cus.oE, 4, 12, 10), new cmo.i(new cup(cus.wo), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cmo.g[]{new cmo.b(cus.pW, 24, 12, 20)},
                  4,
                  new cmo.g[]{new cmo.b(cus.oy, 1, 12, 30), new cmo.e(cus.pi, 12, 3, 15, 0.2F)},
                  5,
                  new cmo.g[]{new cmo.e(cus.pf, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cmn.o,
            a(
               ImmutableMap.of(
                  1,
                  new cmo.g[]{
                     new cmo.b(cus.ow, 15, 16, 2),
                     new cmo.i(new cup(cus.oT), 1, 1, 12, 1, 0.2F),
                     new cmo.i(new cup(cus.oR), 1, 1, 12, 1, 0.2F),
                     new cmo.i(new cup(cus.oS), 1, 1, 12, 1, 0.2F),
                     new cmo.i(new cup(cus.oU), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cmo.g[]{new cmo.b(cus.oE, 4, 12, 10), new cmo.i(new cup(cus.wo), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cmo.g[]{
                     new cmo.b(cus.pW, 30, 12, 20),
                     new cmo.e(cus.pd, 1, 3, 10, 0.2F),
                     new cmo.e(cus.pb, 2, 3, 10, 0.2F),
                     new cmo.e(cus.pc, 3, 3, 10, 0.2F),
                     new cmo.i(new cup(cus.pj), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new cmo.g[]{new cmo.b(cus.oy, 1, 12, 30), new cmo.e(cus.pi, 12, 3, 15, 0.2F), new cmo.e(cus.pg, 5, 3, 15, 0.2F)},
                  5,
                  new cmo.g[]{new cmo.e(cus.ph, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cmn.d,
            a(
               ImmutableMap.of(
                  1,
                  new cmo.g[]{new cmo.b(cus.sc, 14, 16, 2), new cmo.b(cus.pX, 7, 16, 2), new cmo.b(cus.uA, 4, 16, 2), new cmo.i(cus.uC, 1, 1, 1)},
                  2,
                  new cmo.g[]{new cmo.b(cus.ow, 15, 16, 2), new cmo.i(cus.pY, 1, 5, 16, 5), new cmo.i(cus.sd, 1, 8, 16, 5)},
                  3,
                  new cmo.g[]{new cmo.b(cus.uN, 7, 16, 20), new cmo.b(cus.sa, 10, 16, 20)},
                  4,
                  new cmo.g[]{new cmo.b(cus.qN, 10, 12, 30)},
                  5,
                  new cmo.g[]{new cmo.b(cus.wr, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            cmn.j,
            a(
               ImmutableMap.of(
                  1,
                  new cmo.g[]{new cmo.b(cus.qD, 6, 16, 2), new cmo.a(cus.pA, 3), new cmo.a(cus.pz, 7)},
                  2,
                  new cmo.g[]{new cmo.b(cus.pW, 26, 12, 10), new cmo.a(cus.py, 5, 12, 5), new cmo.a(cus.pB, 4, 12, 5)},
                  3,
                  new cmo.g[]{new cmo.b(cus.uE, 9, 12, 20), new cmo.a(cus.pz, 7)},
                  4,
                  new cmo.g[]{new cmo.b(cus.op, 4, 12, 30), new cmo.a(cus.uJ, 6, 12, 15)},
                  5,
                  new cmo.g[]{new cmo.i(new cup(cus.nL), 6, 1, 12, 30, 0.2F), new cmo.a(cus.py, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            cmn.l,
            a(
               ImmutableMap.of(
                  1,
                  new cmo.g[]{new cmo.b(cus.qM, 10, 16, 2), new cmo.i(cus.qL, 1, 10, 16, 1)},
                  2,
                  new cmo.g[]{new cmo.b(dfb.b, 20, 16, 10), new cmo.i(dfb.eK, 1, 4, 16, 5)},
                  3,
                  new cmo.g[]{
                     new cmo.b(dfb.c, 16, 16, 20),
                     new cmo.b(dfb.g, 16, 16, 20),
                     new cmo.b(dfb.e, 16, 16, 20),
                     new cmo.i(dfb.su, 1, 4, 16, 10),
                     new cmo.i(dfb.h, 1, 4, 16, 10),
                     new cmo.i(dfb.f, 1, 4, 16, 10),
                     new cmo.i(dfb.d, 1, 4, 16, 10)
                  },
                  4,
                  new cmo.g[]{
                     new cmo.b(cus.oB, 12, 12, 30),
                     new cmo.i(dfb.hk, 1, 1, 12, 15),
                     new cmo.i(dfb.hj, 1, 1, 12, 15),
                     new cmo.i(dfb.hu, 1, 1, 12, 15),
                     new cmo.i(dfb.hm, 1, 1, 12, 15),
                     new cmo.i(dfb.hq, 1, 1, 12, 15),
                     new cmo.i(dfb.hr, 1, 1, 12, 15),
                     new cmo.i(dfb.hy, 1, 1, 12, 15),
                     new cmo.i(dfb.hx, 1, 1, 12, 15),
                     new cmo.i(dfb.hp, 1, 1, 12, 15),
                     new cmo.i(dfb.hl, 1, 1, 12, 15),
                     new cmo.i(dfb.ho, 1, 1, 12, 15),
                     new cmo.i(dfb.hw, 1, 1, 12, 15),
                     new cmo.i(dfb.hs, 1, 1, 12, 15),
                     new cmo.i(dfb.ht, 1, 1, 12, 15),
                     new cmo.i(dfb.hn, 1, 1, 12, 15),
                     new cmo.i(dfb.hv, 1, 1, 12, 15),
                     new cmo.i(dfb.lh, 1, 1, 12, 15),
                     new cmo.i(dfb.lg, 1, 1, 12, 15),
                     new cmo.i(dfb.lr, 1, 1, 12, 15),
                     new cmo.i(dfb.lj, 1, 1, 12, 15),
                     new cmo.i(dfb.ln, 1, 1, 12, 15),
                     new cmo.i(dfb.lo, 1, 1, 12, 15),
                     new cmo.i(dfb.lv, 1, 1, 12, 15),
                     new cmo.i(dfb.lu, 1, 1, 12, 15),
                     new cmo.i(dfb.lm, 1, 1, 12, 15),
                     new cmo.i(dfb.li, 1, 1, 12, 15),
                     new cmo.i(dfb.ll, 1, 1, 12, 15),
                     new cmo.i(dfb.lt, 1, 1, 12, 15),
                     new cmo.i(dfb.lp, 1, 1, 12, 15),
                     new cmo.i(dfb.lq, 1, 1, 12, 15),
                     new cmo.i(dfb.lk, 1, 1, 12, 15),
                     new cmo.i(dfb.ls, 1, 1, 12, 15)
                  },
                  5,
                  new cmo.g[]{new cmo.i(dfb.hf, 1, 1, 12, 30), new cmo.i(dfb.hd, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<cmo.g[]> b = a(
      ImmutableMap.of(
         1,
         new cmo.g[]{
            new cmo.i(cus.cT, 2, 1, 5, 1),
            new cmo.i(cus.qQ, 4, 1, 5, 1),
            new cmo.i(cus.fu, 2, 1, 5, 1),
            new cmo.i(cus.vR, 5, 1, 5, 1),
            new cmo.i(cus.cO, 1, 1, 12, 1),
            new cmo.i(cus.dJ, 1, 1, 8, 1),
            new cmo.i(cus.fk, 1, 1, 4, 1),
            new cmo.i(cus.dK, 3, 1, 12, 1),
            new cmo.i(cus.eW, 3, 1, 8, 1),
            new cmo.i(cus.dk, 1, 1, 12, 1),
            new cmo.i(cus.dl, 1, 1, 12, 1),
            new cmo.i(cus.dm, 1, 1, 8, 1),
            new cmo.i(cus.dn, 1, 1, 12, 1),
            new cmo.i(cus.do, 1, 1, 12, 1),
            new cmo.i(cus.dp, 1, 1, 12, 1),
            new cmo.i(cus.dq, 1, 1, 12, 1),
            new cmo.i(cus.dr, 1, 1, 12, 1),
            new cmo.i(cus.ds, 1, 1, 12, 1),
            new cmo.i(cus.dt, 1, 1, 12, 1),
            new cmo.i(cus.du, 1, 1, 12, 1),
            new cmo.i(cus.dv, 1, 1, 7, 1),
            new cmo.i(cus.pv, 1, 1, 12, 1),
            new cmo.i(cus.vl, 1, 1, 12, 1),
            new cmo.i(cus.rY, 1, 1, 12, 1),
            new cmo.i(cus.rZ, 1, 1, 12, 1),
            new cmo.i(cus.aa, 5, 1, 8, 1),
            new cmo.i(cus.Y, 5, 1, 8, 1),
            new cmo.i(cus.ac, 5, 1, 8, 1),
            new cmo.i(cus.Z, 5, 1, 8, 1),
            new cmo.i(cus.W, 5, 1, 8, 1),
            new cmo.i(cus.X, 5, 1, 8, 1),
            new cmo.i(cus.ab, 5, 1, 8, 1),
            new cmo.i(cus.ad, 5, 1, 8, 1),
            new cmo.i(cus.rw, 1, 3, 12, 1),
            new cmo.i(cus.ri, 1, 3, 12, 1),
            new cmo.i(cus.rt, 1, 3, 12, 1),
            new cmo.i(cus.ro, 1, 3, 12, 1),
            new cmo.i(cus.rx, 1, 3, 12, 1),
            new cmo.i(cus.rv, 1, 3, 12, 1),
            new cmo.i(cus.rq, 1, 3, 12, 1),
            new cmo.i(cus.rk, 1, 3, 12, 1),
            new cmo.i(cus.rm, 1, 3, 12, 1),
            new cmo.i(cus.rp, 1, 3, 12, 1),
            new cmo.i(cus.rs, 1, 3, 12, 1),
            new cmo.i(cus.rl, 1, 3, 12, 1),
            new cmo.i(cus.rn, 1, 3, 12, 1),
            new cmo.i(cus.rj, 1, 3, 12, 1),
            new cmo.i(cus.ru, 1, 3, 12, 1),
            new cmo.i(cus.rr, 1, 3, 12, 1),
            new cmo.i(cus.kx, 3, 1, 8, 1),
            new cmo.i(cus.ky, 3, 1, 8, 1),
            new cmo.i(cus.kz, 3, 1, 8, 1),
            new cmo.i(cus.kA, 3, 1, 8, 1),
            new cmo.i(cus.kw, 3, 1, 8, 1),
            new cmo.i(cus.fV, 1, 1, 12, 1),
            new cmo.i(cus.dA, 1, 1, 12, 1),
            new cmo.i(cus.dB, 1, 1, 12, 1),
            new cmo.i(cus.gb, 1, 2, 5, 1),
            new cmo.i(cus.dQ, 1, 2, 5, 1),
            new cmo.i(cus.af, 1, 8, 8, 1),
            new cmo.i(cus.ai, 1, 4, 6, 1),
            new cmo.i(cus.xl, 1, 2, 5, 1),
            new cmo.i(cus.F, 1, 2, 5, 1),
            new cmo.i(cus.dN, 1, 2, 5, 1)
         },
         2,
         new cmo.g[]{
            new cmo.i(cus.qI, 5, 1, 4, 1),
            new cmo.i(cus.qF, 5, 1, 4, 1),
            new cmo.i(cus.hV, 3, 1, 6, 1),
            new cmo.i(cus.kV, 6, 1, 6, 1),
            new cmo.i(cus.pu, 1, 1, 8, 1),
            new cmo.i(cus.E, 3, 3, 6, 1)
         }
      )
   );
   private static final cmo.l s = new cmo.l(8, axb.f, "filled_map.village_desert", epg.B, 12, 5);
   private static final cmo.l t = new cmo.l(8, axb.e, "filled_map.village_savanna", epg.D, 12, 5);
   private static final cmo.l u = new cmo.l(8, axb.g, "filled_map.village_plains", epg.C, 12, 5);
   private static final cmo.l v = new cmo.l(8, axb.h, "filled_map.village_taiga", epg.F, 12, 5);
   private static final cmo.l w = new cmo.l(8, axb.i, "filled_map.village_snowy", epg.E, 12, 5);
   private static final cmo.l x = new cmo.l(8, axb.j, "filled_map.explorer_jungle", epg.G, 12, 5);
   private static final cmo.l y = new cmo.l(8, axb.k, "filled_map.explorer_swamp", epg.H, 12, 5);
   public static final Map<cmn, Int2ObjectMap<cmo.g[]>> c = Map.of(
      cmn.k,
      a(
         ImmutableMap.builder()
            .put(1, new cmo.g[]{new cmo.b(cus.qO, 24, 16, 2), a(1), new cmo.i(dfb.cl, 9, 1, 12, 1)})
            .put(2, new cmo.g[]{new cmo.b(cus.qP, 4, 12, 10), a(5), new cmo.i(cus.wp, 1, 1, 5)})
            .put(3, new cmo.g[]{new cmo.b(cus.rf, 5, 12, 20), a(10), new cmo.i(cus.cG, 1, 4, 10)})
            .put(4, new cmo.g[]{new cmo.b(cus.tZ, 2, 12, 30), new cmo.i(cus.qW, 5, 1, 15), new cmo.i(cus.qS, 4, 1, 15)})
            .put(5, new cmo.g[]{a(), new cmo.i(cus.uL, 20, 1, 30)})
            .build()
      ),
      cmn.c,
      a(
         ImmutableMap.builder()
            .put(1, new cmo.g[]{new cmo.b(cus.ow, 15, 12, 2), new cmo.b(cus.oE, 5, 12, 2)})
            .put(
               2,
               new cmo.g[]{
                  cmo.m.a(new cmo.i(cus.pJ, 4, 1, 12, 5, 0.05F), cmp.a, cmp.c, cmp.d, cmp.e, cmp.g),
                  cmo.m.a(new cmo.i(cus.pF, 4, 1, 12, 5, 0.05F), cmp.b, cmp.f),
                  cmo.m.a(new cmo.i(cus.pG, 5, 1, 12, 5, 0.05F), cmp.a, cmp.c, cmp.d, cmp.e, cmp.g),
                  cmo.m.a(new cmo.i(cus.pC, 5, 1, 12, 5, 0.05F), cmp.b, cmp.f),
                  cmo.m.a(new cmo.i(cus.pI, 7, 1, 12, 5, 0.05F), cmp.a, cmp.c, cmp.d, cmp.e, cmp.g),
                  cmo.m.a(new cmo.i(cus.pE, 7, 1, 12, 5, 0.05F), cmp.b, cmp.f),
                  cmo.m.a(new cmo.i(cus.pH, 9, 1, 12, 5, 0.05F), cmp.a, cmp.c, cmp.d, cmp.e, cmp.g),
                  cmo.m.a(new cmo.i(cus.pD, 9, 1, 12, 5, 0.05F), cmp.b, cmp.f)
               }
            )
            .put(3, new cmo.g[]{new cmo.b(cus.qA, 1, 12, 20), new cmo.i(cus.vs, 5, 1, 12, 10, 0.05F), new cmo.i(cus.wo, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new cmo.g[]{
                  cmo.m.a(new cmo.i(a(cus.pJ, dad.h, 1), 8, 1, 3, 15, 0.05F), cmp.a),
                  cmo.m.a(new cmo.i(a(cus.pG, dad.h, 1), 9, 1, 3, 15, 0.05F), cmp.a),
                  cmo.m.a(new cmo.i(a(cus.pI, dad.h, 1), 11, 1, 3, 15, 0.05F), cmp.a),
                  cmo.m.a(new cmo.i(a(cus.pH, dad.h, 1), 13, 1, 3, 15, 0.05F), cmp.a),
                  cmo.m.a(new cmo.i(a(cus.pJ, dad.a, 1), 8, 1, 3, 15, 0.05F), cmp.c),
                  cmo.m.a(new cmo.i(a(cus.pG, dad.a, 1), 9, 1, 3, 15, 0.05F), cmp.c),
                  cmo.m.a(new cmo.i(a(cus.pI, dad.a, 1), 11, 1, 3, 15, 0.05F), cmp.c),
                  cmo.m.a(new cmo.i(a(cus.pH, dad.a, 1), 13, 1, 3, 15, 0.05F), cmp.c),
                  cmo.m.a(new cmo.i(a(cus.pJ, dad.k, 1), 2, 1, 3, 15, 0.05F), cmp.d),
                  cmo.m.a(new cmo.i(a(cus.pG, dad.k, 1), 3, 1, 3, 15, 0.05F), cmp.d),
                  cmo.m.a(new cmo.i(a(cus.pI, dad.k, 1), 5, 1, 3, 15, 0.05F), cmp.d),
                  cmo.m.a(new cmo.i(a(cus.pH, dad.k, 1), 7, 1, 3, 15, 0.05F), cmp.d),
                  cmo.m.a(new cmo.i(a(cus.pJ, dad.j, 1), 8, 1, 3, 15, 0.05F), cmp.e),
                  cmo.m.a(new cmo.i(a(cus.pG, dad.g, 1), 9, 1, 3, 15, 0.05F), cmp.e),
                  cmo.m.a(new cmo.i(a(cus.pF, dad.w, 1), 8, 1, 3, 15, 0.05F), cmp.b),
                  cmo.m.a(new cmo.i(a(cus.pC, dad.w, 1), 9, 1, 3, 15, 0.05F), cmp.b),
                  cmo.m.a(new cmo.i(a(cus.pE, dad.w, 1), 11, 1, 3, 15, 0.05F), cmp.b),
                  cmo.m.a(new cmo.i(a(cus.pD, dad.w, 1), 13, 1, 3, 15, 0.05F), cmp.b),
                  cmo.m.a(new cmo.i(a(cus.pF, dad.O, 1), 8, 1, 3, 15, 0.05F), cmp.f),
                  cmo.m.a(new cmo.i(a(cus.pC, dad.O, 1), 9, 1, 3, 15, 0.05F), cmp.f),
                  cmo.m.a(new cmo.i(a(cus.pE, dad.O, 1), 11, 1, 3, 15, 0.05F), cmp.f),
                  cmo.m.a(new cmo.i(a(cus.pD, dad.O, 1), 13, 1, 3, 15, 0.05F), cmp.f),
                  cmo.m.a(new cmo.h(cus.pN, 1, 4, cus.pM, 1, 3, 15, 0.05F), cmp.g),
                  cmo.m.a(new cmo.h(cus.pM, 1, 4, cus.pL, 1, 3, 15, 0.05F), cmp.g),
                  cmo.m.a(new cmo.h(cus.pK, 1, 4, cus.pN, 1, 3, 15, 0.05F), cmp.g),
                  cmo.m.a(new cmo.h(cus.pL, 1, 2, cus.pK, 1, 3, 15, 0.05F), cmp.g)
               }
            )
            .put(
               5,
               new cmo.g[]{
                  cmo.m.a(new cmo.h(cus.oy, 4, 16, a(cus.pL, dad.h, 1), 1, 3, 30, 0.05F), cmp.a),
                  cmo.m.a(new cmo.h(cus.oy, 3, 16, a(cus.pM, dad.h, 1), 1, 3, 30, 0.05F), cmp.a),
                  cmo.m.a(new cmo.h(cus.oy, 3, 16, a(cus.pM, dad.a, 1), 1, 3, 30, 0.05F), cmp.c),
                  cmo.m.a(new cmo.h(cus.oy, 2, 12, a(cus.pN, dad.a, 1), 1, 3, 30, 0.05F), cmp.c),
                  cmo.m.a(new cmo.h(cus.oy, 2, 6, a(cus.pK, dad.k, 1), 1, 3, 30, 0.05F), cmp.d),
                  cmo.m.a(new cmo.h(cus.oy, 3, 8, a(cus.pL, dad.k, 1), 1, 3, 30, 0.05F), cmp.d),
                  cmo.m.a(new cmo.h(cus.oy, 2, 12, a(cus.pN, dad.j, 1), 1, 3, 30, 0.05F), cmp.e),
                  cmo.m.a(new cmo.h(cus.oy, 3, 12, a(cus.pK, dad.g, 1), 1, 3, 30, 0.05F), cmp.e),
                  cmo.m.a(new cmo.i(a(cus.pC, dad.e, 1), 9, 1, 3, 30, 0.05F), cmp.b),
                  cmo.m.a(new cmo.i(a(cus.pF, dad.c, 1), 8, 1, 3, 30, 0.05F), cmp.b),
                  cmo.m.a(new cmo.i(a(cus.pC, dad.f, 1), 9, 1, 3, 30, 0.05F), cmp.f),
                  cmo.m.a(new cmo.i(a(cus.pF, dad.i, 1), 8, 1, 3, 30, 0.05F), cmp.f),
                  cmo.m.a(new cmo.h(cus.oy, 4, 18, a(cus.pL, dad.d, 1), 1, 3, 30, 0.05F), cmp.g),
                  cmo.m.a(new cmo.h(cus.oy, 3, 18, a(cus.pM, dad.d, 1), 1, 3, 30, 0.05F), cmp.g),
                  cmo.m.a(new cmo.b(cus.aN, 1, 12, 30, 42), cmp.g),
                  cmo.m.a(new cmo.b(cus.aK, 1, 12, 30, 4), cmp.a, cmp.b, cmp.c, cmp.d, cmp.e, cmp.f)
               }
            )
            .build()
      ),
      cmn.e,
      a(
         ImmutableMap.of(
            1,
            new cmo.g[]{new cmo.b(cus.qO, 24, 16, 2), new cmo.i(cus.uj, 7, 1, 1)},
            2,
            new cmo.g[]{
               new cmo.b(cus.fT, 11, 16, 10),
               new cmo.m(ImmutableMap.builder().put(cmp.a, t).put(cmp.d, u).put(cmp.c, v).put(cmp.g, w).put(cmp.e, u).put(cmp.b, t).put(cmp.f, w).build()),
               new cmo.m(ImmutableMap.builder().put(cmp.a, u).put(cmp.d, s).put(cmp.c, t).put(cmp.g, u).put(cmp.e, v).put(cmp.b, s).put(cmp.f, v).build()),
               new cmo.m(
                  ImmutableMap.builder().put(cmp.a, x).put(cmp.d, x).put(cmp.c, new cmo.f()).put(cmp.g, y).put(cmp.e, y).put(cmp.b, y).put(cmp.f, x).build()
               )
            },
            3,
            new cmo.g[]{
               new cmo.b(cus.qS, 1, 12, 20),
               new cmo.l(13, axb.d, "filled_map.monument", epg.j, 12, 10),
               new cmo.l(12, axb.m, "filled_map.trial_chambers", epg.I, 12, 10)
            },
            4,
            new cmo.g[]{
               new cmo.i(cus.uc, 7, 1, 15),
               new cmo.i(cus.uP, 3, 1, 15),
               new cmo.i(cus.va, 3, 1, 15),
               new cmo.i(cus.uS, 3, 1, 15),
               new cmo.i(cus.vd, 3, 1, 15),
               new cmo.i(cus.uV, 3, 1, 15),
               new cmo.i(cus.vc, 3, 1, 15),
               new cmo.i(cus.uU, 3, 1, 15),
               new cmo.i(cus.uW, 3, 1, 15),
               new cmo.i(cus.ve, 3, 1, 15),
               new cmo.i(cus.uZ, 3, 1, 15),
               new cmo.i(cus.uR, 3, 1, 15),
               new cmo.i(cus.uY, 3, 1, 15),
               new cmo.i(cus.vb, 3, 1, 15),
               new cmo.i(cus.uT, 3, 1, 15),
               new cmo.i(cus.uQ, 3, 1, 15),
               new cmo.i(cus.uX, 3, 1, 15)
            },
            5,
            new cmo.g[]{new cmo.i(cus.wa, 8, 1, 30), new cmo.l(14, axb.c, "filled_map.mansion", epg.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<cmo.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new cmo.g[]{
               new cmo.b(a(cwr.a), 1, 1, 1),
               new cmo.b(cus.qz, 1, 1, 1, 2),
               new cmo.b(cus.qE, 1, 1, 1, 2),
               new cmo.b(cus.sn, 1, 1, 1, 3),
               new cmo.b(cus.uh, 4, 1, 1),
               new cmo.b(cus.hD, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cmo.g[]{
               new cmo.i(cus.hV, 1, 1, 6, 1),
               new cmo.i(cus.kV, 6, 1, 6, 1),
               new cmo.i(cus.pu, 1, 4, 2, 1),
               new cmo.i(cus.E, 3, 3, 6, 1),
               new cmo.i(dfb.Y, 1, 8, 4, 1),
               new cmo.i(dfb.W, 1, 8, 4, 1),
               new cmo.i(dfb.aa, 1, 8, 4, 1),
               new cmo.i(dfb.X, 1, 8, 4, 1),
               new cmo.i(dfb.U, 1, 8, 4, 1),
               new cmo.i(dfb.V, 1, 8, 4, 1),
               new cmo.i(dfb.Z, 1, 8, 4, 1),
               new cmo.e(cus.pc, 1, 1, 1, 0.2F),
               new cmo.i(b(cwr.h), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cmo.g[]{
               new cmo.i(cus.qI, 3, 1, 4, 1),
               new cmo.i(cus.qF, 3, 1, 4, 1),
               new cmo.i(cus.cT, 2, 1, 5, 1),
               new cmo.i(cus.qQ, 4, 1, 5, 1),
               new cmo.i(cus.fu, 2, 1, 5, 1),
               new cmo.i(cus.vR, 5, 1, 5, 1),
               new cmo.i(cus.cO, 1, 1, 12, 1),
               new cmo.i(cus.dJ, 1, 1, 8, 1),
               new cmo.i(cus.fk, 1, 1, 4, 1),
               new cmo.i(cus.dK, 3, 1, 12, 1),
               new cmo.i(cus.eW, 3, 1, 8, 1),
               new cmo.i(cus.dk, 1, 1, 12, 1),
               new cmo.i(cus.dl, 1, 1, 12, 1),
               new cmo.i(cus.dm, 1, 1, 8, 1),
               new cmo.i(cus.dn, 1, 1, 12, 1),
               new cmo.i(cus.do, 1, 1, 12, 1),
               new cmo.i(cus.dp, 1, 1, 12, 1),
               new cmo.i(cus.dq, 1, 1, 12, 1),
               new cmo.i(cus.dr, 1, 1, 12, 1),
               new cmo.i(cus.ds, 1, 1, 12, 1),
               new cmo.i(cus.dt, 1, 1, 12, 1),
               new cmo.i(cus.du, 1, 1, 12, 1),
               new cmo.i(cus.dv, 1, 1, 7, 1),
               new cmo.i(cus.pv, 1, 1, 12, 1),
               new cmo.i(cus.vl, 1, 1, 12, 1),
               new cmo.i(cus.rY, 1, 1, 12, 1),
               new cmo.i(cus.rZ, 1, 1, 12, 1),
               new cmo.i(cus.aa, 5, 1, 8, 1),
               new cmo.i(cus.Y, 5, 1, 8, 1),
               new cmo.i(cus.ac, 5, 1, 8, 1),
               new cmo.i(cus.Z, 5, 1, 8, 1),
               new cmo.i(cus.W, 5, 1, 8, 1),
               new cmo.i(cus.X, 5, 1, 8, 1),
               new cmo.i(cus.ab, 5, 1, 8, 1),
               new cmo.i(cus.ad, 5, 1, 8, 1),
               new cmo.i(cus.rw, 1, 3, 12, 1),
               new cmo.i(cus.ri, 1, 3, 12, 1),
               new cmo.i(cus.rt, 1, 3, 12, 1),
               new cmo.i(cus.ro, 1, 3, 12, 1),
               new cmo.i(cus.rx, 1, 3, 12, 1),
               new cmo.i(cus.rv, 1, 3, 12, 1),
               new cmo.i(cus.rq, 1, 3, 12, 1),
               new cmo.i(cus.rk, 1, 3, 12, 1),
               new cmo.i(cus.rm, 1, 3, 12, 1),
               new cmo.i(cus.rp, 1, 3, 12, 1),
               new cmo.i(cus.rs, 1, 3, 12, 1),
               new cmo.i(cus.rl, 1, 3, 12, 1),
               new cmo.i(cus.rn, 1, 3, 12, 1),
               new cmo.i(cus.rj, 1, 3, 12, 1),
               new cmo.i(cus.ru, 1, 3, 12, 1),
               new cmo.i(cus.rr, 1, 3, 12, 1),
               new cmo.i(cus.kx, 3, 1, 8, 1),
               new cmo.i(cus.ky, 3, 1, 8, 1),
               new cmo.i(cus.kz, 3, 1, 8, 1),
               new cmo.i(cus.kA, 3, 1, 8, 1),
               new cmo.i(cus.kw, 3, 1, 8, 1),
               new cmo.i(cus.fV, 1, 3, 4, 1),
               new cmo.i(cus.dA, 1, 3, 4, 1),
               new cmo.i(cus.dB, 1, 3, 4, 1),
               new cmo.i(cus.gb, 1, 5, 2, 1),
               new cmo.i(cus.dQ, 1, 2, 5, 1),
               new cmo.i(cus.af, 1, 8, 8, 1),
               new cmo.i(cus.ai, 1, 4, 6, 1),
               new cmo.i(cus.xl, 1, 2, 5, 1),
               new cmo.i(cus.F, 1, 2, 5, 1),
               new cmo.i(cus.dN, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static cmo.g a(int $$0) {
      return new cmo.m(
         ImmutableMap.builder()
            .put(cmp.a, new cmo.d($$0, dad.b, dad.h, dad.B))
            .put(cmp.b, new cmo.d($$0, dad.c, dad.e, dad.y))
            .put(cmp.c, new cmo.d($$0, dad.z, dad.o, dad.p))
            .put(cmp.d, new cmo.d($$0, dad.q, dad.k, dad.t))
            .put(cmp.e, new cmo.d($$0, dad.g, dad.s, dad.j))
            .put(cmp.f, new cmo.d($$0, dad.i, dad.f, dad.P))
            .put(cmp.g, new cmo.d($$0, dad.d, dad.r, dad.A))
            .build()
      );
   }

   private static cmo.g a() {
      return new cmo.m(
         ImmutableMap.builder()
            .put(cmp.a, new cmo.d(30, 3, 3, dad.u))
            .put(cmp.b, new cmo.d(30, 2, 2, dad.w))
            .put(cmp.c, new cmo.d(30, 3, 3, dad.a))
            .put(cmp.d, new cmo.d(30, 3, 3, dad.n))
            .put(cmp.e, new cmo.d(30, dad.v))
            .put(cmp.f, new cmo.d(30, dad.O))
            .put(cmp.g, new cmo.d(30, 2, 2, dad.x))
            .build()
      );
   }

   private static Int2ObjectMap<cmo.g[]> a(ImmutableMap<Integer, cmo.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static dau a(ji<cwo> $$0) {
      return new dau(cus.sk).a($$1 -> $$1.a(km.G, new cwq($$0)));
   }

   private static cup b(ji<cwo> $$0) {
      return cwq.a(cus.sk, $$0);
   }

   private static cup a(cuk $$0, daa $$1, int $$2) {
      cup $$3 = new cup($$0);
      $$3.a($$1, $$2);
      return $$3;
   }

   static class a implements cmo.g {
      private final cuk a;
      private final int b;
      private final int c;
      private final int d;

      public a(cuk $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(cuk $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public daw a(bsu $$0, azh $$1) {
         dau $$2 = new dau(cus.oz, this.b);
         cup $$3 = new cup(this.a);
         if ($$3.a(awy.by)) {
            List<ctj> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = cxh.a($$3, $$4);
         }

         return new daw($$2, $$3, this.c, this.d, 0.2F);
      }

      private static ctj a(azh $$0) {
         return ctj.a(cti.a($$0.a(16)));
      }
   }

   static class b implements cmo.g {
      private final dau a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(dbx $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(dbx $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new dau($$0.r(), $$1), $$2, $$3, $$4);
      }

      public b(dau $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public daw a(bsu $$0, azh $$1) {
         return new daw(this.a, new cup(cus.oz, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements cmo.g {
      private final Map<cmp, cuk> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<cmp, cuk> $$3) {
         lp.y.s().filter($$1x -> !$$3.containsKey($$1x)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + lp.y.b($$0x));
         });
         this.a = $$3;
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Nullable
      @Override
      public daw a(bsu $$0, azh $$1) {
         if ($$0 instanceof cmm $$2) {
            dau $$3 = new dau(this.a.get($$2.gB().a()), this.b);
            return new daw($$3, new cup(cus.oz), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements cmo.g {
      private final int a;
      private final List<daa> b;
      private final int c;
      private final int d;

      public d(int $$0) {
         this($$0, lp.f.s().filter(daa::k).toArray(daa[]::new));
      }

      public d(int $$0, daa... $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, daa... $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = Arrays.asList($$3);
      }

      @Override
      public daw a(bsu $$0, azh $$1) {
         daa $$2 = this.b.get($$1.a(this.b.size()));
         int $$3 = Math.max($$2.f(), this.c);
         int $$4 = Math.min($$2.g(), this.d);
         int $$5 = ayz.a($$1, $$3, $$4);
         cup $$6 = ctn.a(new dac($$2, $$5));
         int $$7 = 2 + $$1.a(5 + $$5 * 10) + 3 * $$5;
         if ($$2.a()) {
            $$7 *= 2;
         }

         if ($$7 > 64) {
            $$7 = 64;
         }

         return new daw(new dau(cus.oz, $$7), Optional.of(new dau(cus.qP)), $$6, 12, this.a, 0.2F);
      }
   }

   static class e implements cmo.g {
      private final cup a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(cuk $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(cuk $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new cup($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public daw a(bsu $$0, azh $$1) {
         int $$2 = 5 + $$1.a(15);
         cup $$3 = dab.a($$0.dP().J(), $$1, new cup(this.a.g()), $$2, false);
         int $$4 = Math.min(this.b + $$2, 64);
         dau $$5 = new dau(cus.oz, $$4);
         return new daw($$5, $$3, this.c, this.d, this.e);
      }
   }

   static class f implements cmo.g {
      @Override
      public daw a(bsu $$0, azh $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      daw a(bsu var1, azh var2);
   }

   static class h implements cmo.g {
      private final dau a;
      private final int b;
      private final cup c;
      private final int d;
      private final int e;
      private final float f;

      public h(dbx $$0, int $$1, int $$2, cuk $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new cup($$3), $$4, $$5, $$6, $$7);
      }

      h(dbx $$0, int $$1, int $$2, cup $$3, int $$4, int $$5, int $$6, float $$7) {
         this(new dau($$0, $$1), $$2, $$3.c($$4), $$5, $$6, $$7);
      }

      public h(dau $$0, int $$1, cup $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public daw a(bsu $$0, azh $$1) {
         return new daw(new dau(cus.oz, this.b), Optional.of(this.a), this.c.s(), 0, this.d, this.e, this.f, 0);
      }
   }

   static class i implements cmo.g {
      private final cup a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public i(dez $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cup($$0), $$1, $$2, $$3, $$4);
      }

      public i(cuk $$0, int $$1, int $$2, int $$3) {
         this(new cup($$0), $$1, $$2, 12, $$3);
      }

      public i(cuk $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cup($$0), $$1, $$2, $$3, $$4);
      }

      public i(cup $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(cuk $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new cup($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(cup $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.a.e($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
      }

      @Override
      public daw a(bsu $$0, azh $$1) {
         return new daw(new dau(cus.oz, this.b), this.a.s(), this.c, this.d, this.e);
      }
   }

   static class j implements cmo.g {
      private final cxt a;
      private final int b;
      private final float c;

      public j(ji<bsa> $$0, int $$1, int $$2) {
         this(new cxt(List.of(new cxt.a($$0, $$1))), $$2, 0.05F);
      }

      public j(cxt $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public daw a(bsu $$0, azh $$1) {
         cup $$2 = new cup(cus.vU, 1);
         $$2.b(km.H, this.a);
         return new daw(new dau(cus.oz), $$2, 12, this.b, this.c);
      }
   }

   static class k implements cmo.g {
      private final cup a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final cuk f;
      private final int g;
      private final float h;

      public k(cuk $$0, int $$1, cuk $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new cup($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public daw a(bsu $$0, azh $$1) {
         dau $$2 = new dau(cus.oz, this.c);
         List<ji<cwo>> $$3 = lp.i.h().filter($$1x -> !((cwo)$$1x.a()).a().isEmpty() && $$0.dP().K().a($$1x)).collect(Collectors.toList());
         ji<cwo> $$4 = ac.a($$3, $$1);
         cup $$5 = new cup(this.a.g(), this.b);
         $$5.b(km.G, new cwq($$4));
         return new daw($$2, Optional.of(new dau(this.f, this.g)), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements cmo.g {
      private final int a;
      private final axf<eik> b;
      private final String c;
      private final ji<epf> d;
      private final int e;
      private final int f;

      public l(int $$0, axf<eik> $$1, String $$2, ji<epf> $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public daw a(bsu $$0, azh $$1) {
         if (!($$0.dP() instanceof arf)) {
            return null;
         } else {
            arf $$2 = (arf)$$0.dP();
            iz $$3 = $$2.a(this.b, $$0.dp(), 100, true);
            if ($$3 != null) {
               cup $$4 = cux.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               cux.a($$2, $$4);
               epk.a($$4, $$3, "+", this.d);
               $$4.b(km.h, xp.c(this.c));
               return new daw(new dau(cus.oz, this.a), Optional.of(new dau(cus.qS)), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static record m(Map<cmp, cmo.g> a) implements cmo.g {
      public static cmo.m a(cmo.g $$0, cmp... $$1) {
         return new cmo.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public daw a(bsu $$0, azh $$1) {
         if ($$0 instanceof cmm $$2) {
            cmp $$3 = $$2.gB().a();
            cmo.g $$4 = this.a.get($$3);
            return $$4 == null ? null : $$4.a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
