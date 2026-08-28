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

public class cmn {
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
   public static final Map<cmm, Int2ObjectMap<cmn.g[]>> a = ac.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            cmm.g,
            a(
               ImmutableMap.of(
                  1,
                  new cmn.g[]{
                     new cmn.b(cur.pw, 20, 16, 2),
                     new cmn.b(cur.ug, 26, 16, 2),
                     new cmn.b(cur.uf, 22, 16, 2),
                     new cmn.b(cur.vk, 15, 16, 2),
                     new cmn.i(cur.px, 1, 6, 16, 1)
                  },
                  2,
                  new cmn.g[]{new cmn.b(dfa.eZ, 6, 12, 10), new cmn.i(cur.ut, 1, 4, 5), new cmn.i(cur.ot, 1, 4, 16, 5)},
                  3,
                  new cmn.g[]{new cmn.i(cur.rS, 3, 18, 10), new cmn.b(dfa.fa, 4, 12, 20)},
                  4,
                  new cmn.g[]{
                     new cmn.i(dfa.eg, 1, 1, 12, 15),
                     new cmn.j(bsd.p, 100, 15),
                     new cmn.j(bsd.h, 160, 15),
                     new cmn.j(bsd.r, 140, 15),
                     new cmn.j(bsd.o, 120, 15),
                     new cmn.j(bsd.s, 280, 15),
                     new cmn.j(bsd.w, 7, 15)
                  },
                  5,
                  new cmn.g[]{new cmn.i(cur.uk, 3, 3, 30), new cmn.i(cur.st, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            cmm.h,
            a(
               ImmutableMap.of(
                  1,
                  new cmn.g[]{
                     new cmn.b(cur.ps, 20, 16, 2),
                     new cmn.b(cur.ow, 10, 16, 2),
                     new cmn.h(cur.qZ, 6, 1, cur.rd, 6, 16, 1, 0.05F),
                     new cmn.i(cur.qH, 3, 1, 16, 1)
                  },
                  2,
                  new cmn.g[]{new cmn.b(cur.qZ, 15, 16, 10), new cmn.h(cur.ra, 6, 1, cur.re, 6, 16, 5, 0.05F), new cmn.i(cur.wt, 2, 1, 5)},
                  3,
                  new cmn.g[]{new cmn.b(cur.ra, 13, 16, 20), new cmn.e(cur.qV, 3, 3, 10, 0.2F)},
                  4,
                  new cmn.g[]{new cmn.b(cur.rb, 6, 12, 30)},
                  5,
                  new cmn.g[]{
                     new cmn.b(cur.rc, 4, 12, 30),
                     new cmn.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(cmo.c, cur.nU)
                           .put(cmo.g, cur.nW)
                           .put(cmo.e, cur.nW)
                           .put(cmo.a, cur.oa)
                           .put(cmo.b, cur.oa)
                           .put(cmo.d, cur.oc)
                           .put(cmo.f, cur.og)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            cmm.n,
            a(
               ImmutableMap.of(
                  1,
                  new cmn.g[]{
                     new cmn.b(dfa.bA, 18, 16, 2),
                     new cmn.b(dfa.bM, 18, 16, 2),
                     new cmn.b(dfa.bP, 18, 16, 2),
                     new cmn.b(dfa.bH, 18, 16, 2),
                     new cmn.i(cur.rV, 2, 1, 1)
                  },
                  2,
                  new cmn.g[]{
                     new cmn.b(cur.ri, 12, 16, 10),
                     new cmn.b(cur.rp, 12, 16, 10),
                     new cmn.b(cur.rx, 12, 16, 10),
                     new cmn.b(cur.rl, 12, 16, 10),
                     new cmn.b(cur.rn, 12, 16, 10),
                     new cmn.i(dfa.bA, 1, 1, 16, 5),
                     new cmn.i(dfa.bB, 1, 1, 16, 5),
                     new cmn.i(dfa.bC, 1, 1, 16, 5),
                     new cmn.i(dfa.bD, 1, 1, 16, 5),
                     new cmn.i(dfa.bE, 1, 1, 16, 5),
                     new cmn.i(dfa.bF, 1, 1, 16, 5),
                     new cmn.i(dfa.bG, 1, 1, 16, 5),
                     new cmn.i(dfa.bH, 1, 1, 16, 5),
                     new cmn.i(dfa.bI, 1, 1, 16, 5),
                     new cmn.i(dfa.bJ, 1, 1, 16, 5),
                     new cmn.i(dfa.bK, 1, 1, 16, 5),
                     new cmn.i(dfa.bL, 1, 1, 16, 5),
                     new cmn.i(dfa.bM, 1, 1, 16, 5),
                     new cmn.i(dfa.bN, 1, 1, 16, 5),
                     new cmn.i(dfa.bO, 1, 1, 16, 5),
                     new cmn.i(dfa.bP, 1, 1, 16, 5),
                     new cmn.i(dfa.ik, 1, 4, 16, 5),
                     new cmn.i(dfa.il, 1, 4, 16, 5),
                     new cmn.i(dfa.im, 1, 4, 16, 5),
                     new cmn.i(dfa.in, 1, 4, 16, 5),
                     new cmn.i(dfa.io, 1, 4, 16, 5),
                     new cmn.i(dfa.ip, 1, 4, 16, 5),
                     new cmn.i(dfa.iq, 1, 4, 16, 5),
                     new cmn.i(dfa.ir, 1, 4, 16, 5),
                     new cmn.i(dfa.is, 1, 4, 16, 5),
                     new cmn.i(dfa.it, 1, 4, 16, 5),
                     new cmn.i(dfa.iu, 1, 4, 16, 5),
                     new cmn.i(dfa.iv, 1, 4, 16, 5),
                     new cmn.i(dfa.iw, 1, 4, 16, 5),
                     new cmn.i(dfa.ix, 1, 4, 16, 5),
                     new cmn.i(dfa.iy, 1, 4, 16, 5),
                     new cmn.i(dfa.iz, 1, 4, 16, 5)
                  },
                  3,
                  new cmn.g[]{
                     new cmn.b(cur.rm, 12, 16, 20),
                     new cmn.b(cur.rq, 12, 16, 20),
                     new cmn.b(cur.rj, 12, 16, 20),
                     new cmn.b(cur.rw, 12, 16, 20),
                     new cmn.b(cur.ro, 12, 16, 20),
                     new cmn.i(dfa.aZ, 3, 1, 12, 10),
                     new cmn.i(dfa.bd, 3, 1, 12, 10),
                     new cmn.i(dfa.bn, 3, 1, 12, 10),
                     new cmn.i(dfa.bo, 3, 1, 12, 10),
                     new cmn.i(dfa.bk, 3, 1, 12, 10),
                     new cmn.i(dfa.bl, 3, 1, 12, 10),
                     new cmn.i(dfa.bi, 3, 1, 12, 10),
                     new cmn.i(dfa.bg, 3, 1, 12, 10),
                     new cmn.i(dfa.bm, 3, 1, 12, 10),
                     new cmn.i(dfa.bc, 3, 1, 12, 10),
                     new cmn.i(dfa.bh, 3, 1, 12, 10),
                     new cmn.i(dfa.be, 3, 1, 12, 10),
                     new cmn.i(dfa.bb, 3, 1, 12, 10),
                     new cmn.i(dfa.ba, 3, 1, 12, 10),
                     new cmn.i(dfa.bf, 3, 1, 12, 10),
                     new cmn.i(dfa.bj, 3, 1, 12, 10)
                  },
                  4,
                  new cmn.g[]{
                     new cmn.b(cur.ru, 12, 16, 30),
                     new cmn.b(cur.rs, 12, 16, 30),
                     new cmn.b(cur.rt, 12, 16, 30),
                     new cmn.b(cur.rv, 12, 16, 30),
                     new cmn.b(cur.rk, 12, 16, 30),
                     new cmn.b(cur.rr, 12, 16, 30),
                     new cmn.i(cur.uP, 3, 1, 12, 15),
                     new cmn.i(cur.va, 3, 1, 12, 15),
                     new cmn.i(cur.uS, 3, 1, 12, 15),
                     new cmn.i(cur.vd, 3, 1, 12, 15),
                     new cmn.i(cur.uV, 3, 1, 12, 15),
                     new cmn.i(cur.vc, 3, 1, 12, 15),
                     new cmn.i(cur.uU, 3, 1, 12, 15),
                     new cmn.i(cur.uW, 3, 1, 12, 15),
                     new cmn.i(cur.ve, 3, 1, 12, 15),
                     new cmn.i(cur.uZ, 3, 1, 12, 15),
                     new cmn.i(cur.uR, 3, 1, 12, 15),
                     new cmn.i(cur.uY, 3, 1, 12, 15),
                     new cmn.i(cur.vb, 3, 1, 12, 15),
                     new cmn.i(cur.uT, 3, 1, 12, 15),
                     new cmn.i(cur.uQ, 3, 1, 12, 15),
                     new cmn.i(cur.uX, 3, 1, 12, 15)
                  },
                  5,
                  new cmn.g[]{new cmn.i(cur.pZ, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            cmm.i,
            a(
               ImmutableMap.of(
                  1,
                  new cmn.g[]{new cmn.b(cur.pp, 32, 16, 2), new cmn.i(cur.ov, 1, 16, 1), new cmn.h(dfa.L, 10, 1, cur.pW, 10, 12, 1, 0.05F)},
                  2,
                  new cmn.g[]{new cmn.b(cur.pW, 26, 12, 10), new cmn.i(cur.ou, 2, 1, 5)},
                  3,
                  new cmn.g[]{new cmn.b(cur.ps, 14, 16, 20), new cmn.i(cur.vT, 3, 1, 10)},
                  4,
                  new cmn.g[]{new cmn.b(cur.pt, 24, 16, 30), new cmn.e(cur.ou, 2, 3, 15)},
                  5,
                  new cmn.g[]{new cmn.b(cur.mb, 8, 12, 30), new cmn.e(cur.vT, 3, 3, 15), new cmn.k(cur.ov, 5, cur.vq, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            cmm.k,
            a(
               ImmutableMap.builder()
                  .put(1, new cmn.g[]{new cmn.b(cur.qO, 24, 16, 2), new cmn.d(1), new cmn.i(dfa.cl, 9, 1, 12, 1)})
                  .put(2, new cmn.g[]{new cmn.b(cur.qP, 4, 12, 10), new cmn.d(5), new cmn.i(cur.wp, 1, 1, 5)})
                  .put(3, new cmn.g[]{new cmn.b(cur.rf, 5, 12, 20), new cmn.d(10), new cmn.i(cur.cG, 1, 4, 10)})
                  .put(4, new cmn.g[]{new cmn.b(cur.tZ, 2, 12, 30), new cmn.d(15), new cmn.i(cur.qW, 5, 1, 15), new cmn.i(cur.qS, 4, 1, 15)})
                  .put(5, new cmn.g[]{new cmn.i(cur.uL, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            cmm.e,
            a(
               ImmutableMap.of(
                  1,
                  new cmn.g[]{new cmn.b(cur.qO, 24, 16, 2), new cmn.i(cur.uj, 7, 1, 1)},
                  2,
                  new cmn.g[]{new cmn.b(cur.fT, 11, 16, 10), new cmn.l(13, axa.d, "filled_map.monument", epf.j, 12, 5)},
                  3,
                  new cmn.g[]{
                     new cmn.b(cur.qS, 1, 12, 20),
                     new cmn.l(14, axa.c, "filled_map.mansion", epf.i, 12, 10),
                     new cmn.l(12, axa.m, "filled_map.trial_chambers", epf.I, 12, 10)
                  },
                  4,
                  new cmn.g[]{
                     new cmn.i(cur.uc, 7, 1, 15),
                     new cmn.i(cur.uP, 3, 1, 15),
                     new cmn.i(cur.va, 3, 1, 15),
                     new cmn.i(cur.uS, 3, 1, 15),
                     new cmn.i(cur.vd, 3, 1, 15),
                     new cmn.i(cur.uV, 3, 1, 15),
                     new cmn.i(cur.vc, 3, 1, 15),
                     new cmn.i(cur.uU, 3, 1, 15),
                     new cmn.i(cur.uW, 3, 1, 15),
                     new cmn.i(cur.ve, 3, 1, 15),
                     new cmn.i(cur.uZ, 3, 1, 15),
                     new cmn.i(cur.uR, 3, 1, 15),
                     new cmn.i(cur.uY, 3, 1, 15),
                     new cmn.i(cur.vb, 3, 1, 15),
                     new cmn.i(cur.uT, 3, 1, 15),
                     new cmn.i(cur.uQ, 3, 1, 15),
                     new cmn.i(cur.uX, 3, 1, 15)
                  },
                  5,
                  new cmn.g[]{new cmn.i(cur.wa, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            cmm.f,
            a(
               ImmutableMap.of(
                  1,
                  new cmn.g[]{new cmn.b(cur.se, 32, 16, 2), new cmn.i(cur.lH, 1, 2, 1)},
                  2,
                  new cmn.g[]{new cmn.b(cur.oI, 3, 12, 10), new cmn.i(cur.oA, 1, 1, 5)},
                  3,
                  new cmn.g[]{new cmn.b(cur.uD, 2, 12, 20), new cmn.i(dfa.ec, 4, 1, 12, 10)},
                  4,
                  new cmn.g[]{new cmn.b(cur.op, 4, 12, 30), new cmn.b(cur.sl, 9, 12, 30), new cmn.i(cur.sf, 5, 1, 15)},
                  5,
                  new cmn.g[]{new cmn.b(cur.sj, 22, 12, 30), new cmn.i(cur.tW, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            cmm.c,
            a(
               ImmutableMap.of(
                  1,
                  new cmn.g[]{
                     new cmn.b(cur.ow, 15, 16, 2),
                     new cmn.i(new cuo(cur.pI), 7, 1, 12, 1, 0.2F),
                     new cmn.i(new cuo(cur.pJ), 4, 1, 12, 1, 0.2F),
                     new cmn.i(new cuo(cur.pG), 5, 1, 12, 1, 0.2F),
                     new cmn.i(new cuo(cur.pH), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cmn.g[]{
                     new cmn.b(cur.oE, 4, 12, 10),
                     new cmn.i(new cuo(cur.wo), 36, 1, 12, 5, 0.2F),
                     new cmn.i(new cuo(cur.pF), 1, 1, 12, 5, 0.2F),
                     new cmn.i(new cuo(cur.pE), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new cmn.g[]{
                     new cmn.b(cur.qA, 1, 12, 20),
                     new cmn.b(cur.oy, 1, 12, 20),
                     new cmn.i(new cuo(cur.pC), 1, 1, 12, 10, 0.2F),
                     new cmn.i(new cuo(cur.pD), 4, 1, 12, 10, 0.2F),
                     new cmn.i(new cuo(cur.vs), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new cmn.g[]{new cmn.e(cur.pM, 14, 3, 15, 0.2F), new cmn.e(cur.pN, 8, 3, 15, 0.2F)},
                  5,
                  new cmn.g[]{new cmn.e(cur.pK, 8, 3, 30, 0.2F), new cmn.e(cur.pL, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cmm.p,
            a(
               ImmutableMap.of(
                  1,
                  new cmn.g[]{new cmn.b(cur.ow, 15, 16, 2), new cmn.i(new cuo(cur.pd), 3, 1, 12, 1, 0.2F), new cmn.e(cur.pa, 2, 3, 1)},
                  2,
                  new cmn.g[]{new cmn.b(cur.oE, 4, 12, 10), new cmn.i(new cuo(cur.wo), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cmn.g[]{new cmn.b(cur.pW, 24, 12, 20)},
                  4,
                  new cmn.g[]{new cmn.b(cur.oy, 1, 12, 30), new cmn.e(cur.pi, 12, 3, 15, 0.2F)},
                  5,
                  new cmn.g[]{new cmn.e(cur.pf, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cmm.o,
            a(
               ImmutableMap.of(
                  1,
                  new cmn.g[]{
                     new cmn.b(cur.ow, 15, 16, 2),
                     new cmn.i(new cuo(cur.oT), 1, 1, 12, 1, 0.2F),
                     new cmn.i(new cuo(cur.oR), 1, 1, 12, 1, 0.2F),
                     new cmn.i(new cuo(cur.oS), 1, 1, 12, 1, 0.2F),
                     new cmn.i(new cuo(cur.oU), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cmn.g[]{new cmn.b(cur.oE, 4, 12, 10), new cmn.i(new cuo(cur.wo), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cmn.g[]{
                     new cmn.b(cur.pW, 30, 12, 20),
                     new cmn.e(cur.pd, 1, 3, 10, 0.2F),
                     new cmn.e(cur.pb, 2, 3, 10, 0.2F),
                     new cmn.e(cur.pc, 3, 3, 10, 0.2F),
                     new cmn.i(new cuo(cur.pj), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new cmn.g[]{new cmn.b(cur.oy, 1, 12, 30), new cmn.e(cur.pi, 12, 3, 15, 0.2F), new cmn.e(cur.pg, 5, 3, 15, 0.2F)},
                  5,
                  new cmn.g[]{new cmn.e(cur.ph, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cmm.d,
            a(
               ImmutableMap.of(
                  1,
                  new cmn.g[]{new cmn.b(cur.sc, 14, 16, 2), new cmn.b(cur.pX, 7, 16, 2), new cmn.b(cur.uA, 4, 16, 2), new cmn.i(cur.uC, 1, 1, 1)},
                  2,
                  new cmn.g[]{new cmn.b(cur.ow, 15, 16, 2), new cmn.i(cur.pY, 1, 5, 16, 5), new cmn.i(cur.sd, 1, 8, 16, 5)},
                  3,
                  new cmn.g[]{new cmn.b(cur.uN, 7, 16, 20), new cmn.b(cur.sa, 10, 16, 20)},
                  4,
                  new cmn.g[]{new cmn.b(cur.qN, 10, 12, 30)},
                  5,
                  new cmn.g[]{new cmn.b(cur.wr, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            cmm.j,
            a(
               ImmutableMap.of(
                  1,
                  new cmn.g[]{new cmn.b(cur.qD, 6, 16, 2), new cmn.a(cur.pA, 3), new cmn.a(cur.pz, 7)},
                  2,
                  new cmn.g[]{new cmn.b(cur.pW, 26, 12, 10), new cmn.a(cur.py, 5, 12, 5), new cmn.a(cur.pB, 4, 12, 5)},
                  3,
                  new cmn.g[]{new cmn.b(cur.uE, 9, 12, 20), new cmn.a(cur.pz, 7)},
                  4,
                  new cmn.g[]{new cmn.b(cur.op, 4, 12, 30), new cmn.a(cur.uJ, 6, 12, 15)},
                  5,
                  new cmn.g[]{new cmn.i(new cuo(cur.nL), 6, 1, 12, 30, 0.2F), new cmn.a(cur.py, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            cmm.l,
            a(
               ImmutableMap.of(
                  1,
                  new cmn.g[]{new cmn.b(cur.qM, 10, 16, 2), new cmn.i(cur.qL, 1, 10, 16, 1)},
                  2,
                  new cmn.g[]{new cmn.b(dfa.b, 20, 16, 10), new cmn.i(dfa.eK, 1, 4, 16, 5)},
                  3,
                  new cmn.g[]{
                     new cmn.b(dfa.c, 16, 16, 20),
                     new cmn.b(dfa.g, 16, 16, 20),
                     new cmn.b(dfa.e, 16, 16, 20),
                     new cmn.i(dfa.su, 1, 4, 16, 10),
                     new cmn.i(dfa.h, 1, 4, 16, 10),
                     new cmn.i(dfa.f, 1, 4, 16, 10),
                     new cmn.i(dfa.d, 1, 4, 16, 10)
                  },
                  4,
                  new cmn.g[]{
                     new cmn.b(cur.oB, 12, 12, 30),
                     new cmn.i(dfa.hk, 1, 1, 12, 15),
                     new cmn.i(dfa.hj, 1, 1, 12, 15),
                     new cmn.i(dfa.hu, 1, 1, 12, 15),
                     new cmn.i(dfa.hm, 1, 1, 12, 15),
                     new cmn.i(dfa.hq, 1, 1, 12, 15),
                     new cmn.i(dfa.hr, 1, 1, 12, 15),
                     new cmn.i(dfa.hy, 1, 1, 12, 15),
                     new cmn.i(dfa.hx, 1, 1, 12, 15),
                     new cmn.i(dfa.hp, 1, 1, 12, 15),
                     new cmn.i(dfa.hl, 1, 1, 12, 15),
                     new cmn.i(dfa.ho, 1, 1, 12, 15),
                     new cmn.i(dfa.hw, 1, 1, 12, 15),
                     new cmn.i(dfa.hs, 1, 1, 12, 15),
                     new cmn.i(dfa.ht, 1, 1, 12, 15),
                     new cmn.i(dfa.hn, 1, 1, 12, 15),
                     new cmn.i(dfa.hv, 1, 1, 12, 15),
                     new cmn.i(dfa.lh, 1, 1, 12, 15),
                     new cmn.i(dfa.lg, 1, 1, 12, 15),
                     new cmn.i(dfa.lr, 1, 1, 12, 15),
                     new cmn.i(dfa.lj, 1, 1, 12, 15),
                     new cmn.i(dfa.ln, 1, 1, 12, 15),
                     new cmn.i(dfa.lo, 1, 1, 12, 15),
                     new cmn.i(dfa.lv, 1, 1, 12, 15),
                     new cmn.i(dfa.lu, 1, 1, 12, 15),
                     new cmn.i(dfa.lm, 1, 1, 12, 15),
                     new cmn.i(dfa.li, 1, 1, 12, 15),
                     new cmn.i(dfa.ll, 1, 1, 12, 15),
                     new cmn.i(dfa.lt, 1, 1, 12, 15),
                     new cmn.i(dfa.lp, 1, 1, 12, 15),
                     new cmn.i(dfa.lq, 1, 1, 12, 15),
                     new cmn.i(dfa.lk, 1, 1, 12, 15),
                     new cmn.i(dfa.ls, 1, 1, 12, 15)
                  },
                  5,
                  new cmn.g[]{new cmn.i(dfa.hf, 1, 1, 12, 30), new cmn.i(dfa.hd, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<cmn.g[]> b = a(
      ImmutableMap.of(
         1,
         new cmn.g[]{
            new cmn.i(cur.cT, 2, 1, 5, 1),
            new cmn.i(cur.qQ, 4, 1, 5, 1),
            new cmn.i(cur.fu, 2, 1, 5, 1),
            new cmn.i(cur.vR, 5, 1, 5, 1),
            new cmn.i(cur.cO, 1, 1, 12, 1),
            new cmn.i(cur.dJ, 1, 1, 8, 1),
            new cmn.i(cur.fk, 1, 1, 4, 1),
            new cmn.i(cur.dK, 3, 1, 12, 1),
            new cmn.i(cur.eW, 3, 1, 8, 1),
            new cmn.i(cur.dk, 1, 1, 12, 1),
            new cmn.i(cur.dl, 1, 1, 12, 1),
            new cmn.i(cur.dm, 1, 1, 8, 1),
            new cmn.i(cur.dn, 1, 1, 12, 1),
            new cmn.i(cur.do, 1, 1, 12, 1),
            new cmn.i(cur.dp, 1, 1, 12, 1),
            new cmn.i(cur.dq, 1, 1, 12, 1),
            new cmn.i(cur.dr, 1, 1, 12, 1),
            new cmn.i(cur.ds, 1, 1, 12, 1),
            new cmn.i(cur.dt, 1, 1, 12, 1),
            new cmn.i(cur.du, 1, 1, 12, 1),
            new cmn.i(cur.dv, 1, 1, 7, 1),
            new cmn.i(cur.pv, 1, 1, 12, 1),
            new cmn.i(cur.vl, 1, 1, 12, 1),
            new cmn.i(cur.rY, 1, 1, 12, 1),
            new cmn.i(cur.rZ, 1, 1, 12, 1),
            new cmn.i(cur.aa, 5, 1, 8, 1),
            new cmn.i(cur.Y, 5, 1, 8, 1),
            new cmn.i(cur.ac, 5, 1, 8, 1),
            new cmn.i(cur.Z, 5, 1, 8, 1),
            new cmn.i(cur.W, 5, 1, 8, 1),
            new cmn.i(cur.X, 5, 1, 8, 1),
            new cmn.i(cur.ab, 5, 1, 8, 1),
            new cmn.i(cur.ad, 5, 1, 8, 1),
            new cmn.i(cur.rw, 1, 3, 12, 1),
            new cmn.i(cur.ri, 1, 3, 12, 1),
            new cmn.i(cur.rt, 1, 3, 12, 1),
            new cmn.i(cur.ro, 1, 3, 12, 1),
            new cmn.i(cur.rx, 1, 3, 12, 1),
            new cmn.i(cur.rv, 1, 3, 12, 1),
            new cmn.i(cur.rq, 1, 3, 12, 1),
            new cmn.i(cur.rk, 1, 3, 12, 1),
            new cmn.i(cur.rm, 1, 3, 12, 1),
            new cmn.i(cur.rp, 1, 3, 12, 1),
            new cmn.i(cur.rs, 1, 3, 12, 1),
            new cmn.i(cur.rl, 1, 3, 12, 1),
            new cmn.i(cur.rn, 1, 3, 12, 1),
            new cmn.i(cur.rj, 1, 3, 12, 1),
            new cmn.i(cur.ru, 1, 3, 12, 1),
            new cmn.i(cur.rr, 1, 3, 12, 1),
            new cmn.i(cur.kx, 3, 1, 8, 1),
            new cmn.i(cur.ky, 3, 1, 8, 1),
            new cmn.i(cur.kz, 3, 1, 8, 1),
            new cmn.i(cur.kA, 3, 1, 8, 1),
            new cmn.i(cur.kw, 3, 1, 8, 1),
            new cmn.i(cur.fV, 1, 1, 12, 1),
            new cmn.i(cur.dA, 1, 1, 12, 1),
            new cmn.i(cur.dB, 1, 1, 12, 1),
            new cmn.i(cur.gb, 1, 2, 5, 1),
            new cmn.i(cur.dQ, 1, 2, 5, 1),
            new cmn.i(cur.af, 1, 8, 8, 1),
            new cmn.i(cur.ai, 1, 4, 6, 1),
            new cmn.i(cur.xl, 1, 2, 5, 1),
            new cmn.i(cur.F, 1, 2, 5, 1),
            new cmn.i(cur.dN, 1, 2, 5, 1)
         },
         2,
         new cmn.g[]{
            new cmn.i(cur.qI, 5, 1, 4, 1),
            new cmn.i(cur.qF, 5, 1, 4, 1),
            new cmn.i(cur.hV, 3, 1, 6, 1),
            new cmn.i(cur.kV, 6, 1, 6, 1),
            new cmn.i(cur.pu, 1, 1, 8, 1),
            new cmn.i(cur.E, 3, 3, 6, 1)
         }
      )
   );
   private static final cmn.l s = new cmn.l(8, axa.f, "filled_map.village_desert", epf.B, 12, 5);
   private static final cmn.l t = new cmn.l(8, axa.e, "filled_map.village_savanna", epf.D, 12, 5);
   private static final cmn.l u = new cmn.l(8, axa.g, "filled_map.village_plains", epf.C, 12, 5);
   private static final cmn.l v = new cmn.l(8, axa.h, "filled_map.village_taiga", epf.F, 12, 5);
   private static final cmn.l w = new cmn.l(8, axa.i, "filled_map.village_snowy", epf.E, 12, 5);
   private static final cmn.l x = new cmn.l(8, axa.j, "filled_map.explorer_jungle", epf.G, 12, 5);
   private static final cmn.l y = new cmn.l(8, axa.k, "filled_map.explorer_swamp", epf.H, 12, 5);
   public static final Map<cmm, Int2ObjectMap<cmn.g[]>> c = Map.of(
      cmm.k,
      a(
         ImmutableMap.builder()
            .put(1, new cmn.g[]{new cmn.b(cur.qO, 24, 16, 2), a(1), new cmn.i(dfa.cl, 9, 1, 12, 1)})
            .put(2, new cmn.g[]{new cmn.b(cur.qP, 4, 12, 10), a(5), new cmn.i(cur.wp, 1, 1, 5)})
            .put(3, new cmn.g[]{new cmn.b(cur.rf, 5, 12, 20), a(10), new cmn.i(cur.cG, 1, 4, 10)})
            .put(4, new cmn.g[]{new cmn.b(cur.tZ, 2, 12, 30), new cmn.i(cur.qW, 5, 1, 15), new cmn.i(cur.qS, 4, 1, 15)})
            .put(5, new cmn.g[]{a(), new cmn.i(cur.uL, 20, 1, 30)})
            .build()
      ),
      cmm.c,
      a(
         ImmutableMap.builder()
            .put(1, new cmn.g[]{new cmn.b(cur.ow, 15, 12, 2), new cmn.b(cur.oE, 5, 12, 2)})
            .put(
               2,
               new cmn.g[]{
                  cmn.m.a(new cmn.i(cur.pJ, 4, 1, 12, 5, 0.05F), cmo.a, cmo.c, cmo.d, cmo.e, cmo.g),
                  cmn.m.a(new cmn.i(cur.pF, 4, 1, 12, 5, 0.05F), cmo.b, cmo.f),
                  cmn.m.a(new cmn.i(cur.pG, 5, 1, 12, 5, 0.05F), cmo.a, cmo.c, cmo.d, cmo.e, cmo.g),
                  cmn.m.a(new cmn.i(cur.pC, 5, 1, 12, 5, 0.05F), cmo.b, cmo.f),
                  cmn.m.a(new cmn.i(cur.pI, 7, 1, 12, 5, 0.05F), cmo.a, cmo.c, cmo.d, cmo.e, cmo.g),
                  cmn.m.a(new cmn.i(cur.pE, 7, 1, 12, 5, 0.05F), cmo.b, cmo.f),
                  cmn.m.a(new cmn.i(cur.pH, 9, 1, 12, 5, 0.05F), cmo.a, cmo.c, cmo.d, cmo.e, cmo.g),
                  cmn.m.a(new cmn.i(cur.pD, 9, 1, 12, 5, 0.05F), cmo.b, cmo.f)
               }
            )
            .put(3, new cmn.g[]{new cmn.b(cur.qA, 1, 12, 20), new cmn.i(cur.vs, 5, 1, 12, 10, 0.05F), new cmn.i(cur.wo, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new cmn.g[]{
                  cmn.m.a(new cmn.i(a(cur.pJ, dac.h, 1), 8, 1, 3, 15, 0.05F), cmo.a),
                  cmn.m.a(new cmn.i(a(cur.pG, dac.h, 1), 9, 1, 3, 15, 0.05F), cmo.a),
                  cmn.m.a(new cmn.i(a(cur.pI, dac.h, 1), 11, 1, 3, 15, 0.05F), cmo.a),
                  cmn.m.a(new cmn.i(a(cur.pH, dac.h, 1), 13, 1, 3, 15, 0.05F), cmo.a),
                  cmn.m.a(new cmn.i(a(cur.pJ, dac.a, 1), 8, 1, 3, 15, 0.05F), cmo.c),
                  cmn.m.a(new cmn.i(a(cur.pG, dac.a, 1), 9, 1, 3, 15, 0.05F), cmo.c),
                  cmn.m.a(new cmn.i(a(cur.pI, dac.a, 1), 11, 1, 3, 15, 0.05F), cmo.c),
                  cmn.m.a(new cmn.i(a(cur.pH, dac.a, 1), 13, 1, 3, 15, 0.05F), cmo.c),
                  cmn.m.a(new cmn.i(a(cur.pJ, dac.k, 1), 2, 1, 3, 15, 0.05F), cmo.d),
                  cmn.m.a(new cmn.i(a(cur.pG, dac.k, 1), 3, 1, 3, 15, 0.05F), cmo.d),
                  cmn.m.a(new cmn.i(a(cur.pI, dac.k, 1), 5, 1, 3, 15, 0.05F), cmo.d),
                  cmn.m.a(new cmn.i(a(cur.pH, dac.k, 1), 7, 1, 3, 15, 0.05F), cmo.d),
                  cmn.m.a(new cmn.i(a(cur.pJ, dac.j, 1), 8, 1, 3, 15, 0.05F), cmo.e),
                  cmn.m.a(new cmn.i(a(cur.pG, dac.g, 1), 9, 1, 3, 15, 0.05F), cmo.e),
                  cmn.m.a(new cmn.i(a(cur.pF, dac.w, 1), 8, 1, 3, 15, 0.05F), cmo.b),
                  cmn.m.a(new cmn.i(a(cur.pC, dac.w, 1), 9, 1, 3, 15, 0.05F), cmo.b),
                  cmn.m.a(new cmn.i(a(cur.pE, dac.w, 1), 11, 1, 3, 15, 0.05F), cmo.b),
                  cmn.m.a(new cmn.i(a(cur.pD, dac.w, 1), 13, 1, 3, 15, 0.05F), cmo.b),
                  cmn.m.a(new cmn.i(a(cur.pF, dac.O, 1), 8, 1, 3, 15, 0.05F), cmo.f),
                  cmn.m.a(new cmn.i(a(cur.pC, dac.O, 1), 9, 1, 3, 15, 0.05F), cmo.f),
                  cmn.m.a(new cmn.i(a(cur.pE, dac.O, 1), 11, 1, 3, 15, 0.05F), cmo.f),
                  cmn.m.a(new cmn.i(a(cur.pD, dac.O, 1), 13, 1, 3, 15, 0.05F), cmo.f),
                  cmn.m.a(new cmn.h(cur.pN, 1, 4, cur.pM, 1, 3, 15, 0.05F), cmo.g),
                  cmn.m.a(new cmn.h(cur.pM, 1, 4, cur.pL, 1, 3, 15, 0.05F), cmo.g),
                  cmn.m.a(new cmn.h(cur.pK, 1, 4, cur.pN, 1, 3, 15, 0.05F), cmo.g),
                  cmn.m.a(new cmn.h(cur.pL, 1, 2, cur.pK, 1, 3, 15, 0.05F), cmo.g)
               }
            )
            .put(
               5,
               new cmn.g[]{
                  cmn.m.a(new cmn.h(cur.oy, 4, 16, a(cur.pL, dac.h, 1), 1, 3, 30, 0.05F), cmo.a),
                  cmn.m.a(new cmn.h(cur.oy, 3, 16, a(cur.pM, dac.h, 1), 1, 3, 30, 0.05F), cmo.a),
                  cmn.m.a(new cmn.h(cur.oy, 3, 16, a(cur.pM, dac.a, 1), 1, 3, 30, 0.05F), cmo.c),
                  cmn.m.a(new cmn.h(cur.oy, 2, 12, a(cur.pN, dac.a, 1), 1, 3, 30, 0.05F), cmo.c),
                  cmn.m.a(new cmn.h(cur.oy, 2, 6, a(cur.pK, dac.k, 1), 1, 3, 30, 0.05F), cmo.d),
                  cmn.m.a(new cmn.h(cur.oy, 3, 8, a(cur.pL, dac.k, 1), 1, 3, 30, 0.05F), cmo.d),
                  cmn.m.a(new cmn.h(cur.oy, 2, 12, a(cur.pN, dac.j, 1), 1, 3, 30, 0.05F), cmo.e),
                  cmn.m.a(new cmn.h(cur.oy, 3, 12, a(cur.pK, dac.g, 1), 1, 3, 30, 0.05F), cmo.e),
                  cmn.m.a(new cmn.i(a(cur.pC, dac.e, 1), 9, 1, 3, 30, 0.05F), cmo.b),
                  cmn.m.a(new cmn.i(a(cur.pF, dac.c, 1), 8, 1, 3, 30, 0.05F), cmo.b),
                  cmn.m.a(new cmn.i(a(cur.pC, dac.f, 1), 9, 1, 3, 30, 0.05F), cmo.f),
                  cmn.m.a(new cmn.i(a(cur.pF, dac.i, 1), 8, 1, 3, 30, 0.05F), cmo.f),
                  cmn.m.a(new cmn.h(cur.oy, 4, 18, a(cur.pL, dac.d, 1), 1, 3, 30, 0.05F), cmo.g),
                  cmn.m.a(new cmn.h(cur.oy, 3, 18, a(cur.pM, dac.d, 1), 1, 3, 30, 0.05F), cmo.g),
                  cmn.m.a(new cmn.b(cur.aN, 1, 12, 30, 42), cmo.g),
                  cmn.m.a(new cmn.b(cur.aK, 1, 12, 30, 4), cmo.a, cmo.b, cmo.c, cmo.d, cmo.e, cmo.f)
               }
            )
            .build()
      ),
      cmm.e,
      a(
         ImmutableMap.of(
            1,
            new cmn.g[]{new cmn.b(cur.qO, 24, 16, 2), new cmn.i(cur.uj, 7, 1, 1)},
            2,
            new cmn.g[]{
               new cmn.b(cur.fT, 11, 16, 10),
               new cmn.m(ImmutableMap.builder().put(cmo.a, t).put(cmo.d, u).put(cmo.c, v).put(cmo.g, w).put(cmo.e, u).put(cmo.b, t).put(cmo.f, w).build()),
               new cmn.m(ImmutableMap.builder().put(cmo.a, u).put(cmo.d, s).put(cmo.c, t).put(cmo.g, u).put(cmo.e, v).put(cmo.b, s).put(cmo.f, v).build()),
               new cmn.m(
                  ImmutableMap.builder().put(cmo.a, x).put(cmo.d, x).put(cmo.c, new cmn.f()).put(cmo.g, y).put(cmo.e, y).put(cmo.b, y).put(cmo.f, x).build()
               )
            },
            3,
            new cmn.g[]{
               new cmn.b(cur.qS, 1, 12, 20),
               new cmn.l(13, axa.d, "filled_map.monument", epf.j, 12, 10),
               new cmn.l(12, axa.m, "filled_map.trial_chambers", epf.I, 12, 10)
            },
            4,
            new cmn.g[]{
               new cmn.i(cur.uc, 7, 1, 15),
               new cmn.i(cur.uP, 3, 1, 15),
               new cmn.i(cur.va, 3, 1, 15),
               new cmn.i(cur.uS, 3, 1, 15),
               new cmn.i(cur.vd, 3, 1, 15),
               new cmn.i(cur.uV, 3, 1, 15),
               new cmn.i(cur.vc, 3, 1, 15),
               new cmn.i(cur.uU, 3, 1, 15),
               new cmn.i(cur.uW, 3, 1, 15),
               new cmn.i(cur.ve, 3, 1, 15),
               new cmn.i(cur.uZ, 3, 1, 15),
               new cmn.i(cur.uR, 3, 1, 15),
               new cmn.i(cur.uY, 3, 1, 15),
               new cmn.i(cur.vb, 3, 1, 15),
               new cmn.i(cur.uT, 3, 1, 15),
               new cmn.i(cur.uQ, 3, 1, 15),
               new cmn.i(cur.uX, 3, 1, 15)
            },
            5,
            new cmn.g[]{new cmn.i(cur.wa, 8, 1, 30), new cmn.l(14, axa.c, "filled_map.mansion", epf.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<cmn.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new cmn.g[]{
               new cmn.b(a(cwq.a), 1, 1, 1),
               new cmn.b(cur.qz, 1, 1, 1, 2),
               new cmn.b(cur.qE, 1, 1, 1, 2),
               new cmn.b(cur.sn, 1, 1, 1, 3),
               new cmn.b(cur.uh, 4, 1, 1),
               new cmn.b(cur.hD, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cmn.g[]{
               new cmn.i(cur.hV, 1, 1, 6, 1),
               new cmn.i(cur.kV, 6, 1, 6, 1),
               new cmn.i(cur.pu, 1, 4, 2, 1),
               new cmn.i(cur.E, 3, 3, 6, 1),
               new cmn.i(dfa.Y, 1, 8, 4, 1),
               new cmn.i(dfa.W, 1, 8, 4, 1),
               new cmn.i(dfa.aa, 1, 8, 4, 1),
               new cmn.i(dfa.X, 1, 8, 4, 1),
               new cmn.i(dfa.U, 1, 8, 4, 1),
               new cmn.i(dfa.V, 1, 8, 4, 1),
               new cmn.i(dfa.Z, 1, 8, 4, 1),
               new cmn.e(cur.pc, 1, 1, 1, 0.2F),
               new cmn.i(b(cwq.h), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cmn.g[]{
               new cmn.i(cur.qI, 3, 1, 4, 1),
               new cmn.i(cur.qF, 3, 1, 4, 1),
               new cmn.i(cur.cT, 2, 1, 5, 1),
               new cmn.i(cur.qQ, 4, 1, 5, 1),
               new cmn.i(cur.fu, 2, 1, 5, 1),
               new cmn.i(cur.vR, 5, 1, 5, 1),
               new cmn.i(cur.cO, 1, 1, 12, 1),
               new cmn.i(cur.dJ, 1, 1, 8, 1),
               new cmn.i(cur.fk, 1, 1, 4, 1),
               new cmn.i(cur.dK, 3, 1, 12, 1),
               new cmn.i(cur.eW, 3, 1, 8, 1),
               new cmn.i(cur.dk, 1, 1, 12, 1),
               new cmn.i(cur.dl, 1, 1, 12, 1),
               new cmn.i(cur.dm, 1, 1, 8, 1),
               new cmn.i(cur.dn, 1, 1, 12, 1),
               new cmn.i(cur.do, 1, 1, 12, 1),
               new cmn.i(cur.dp, 1, 1, 12, 1),
               new cmn.i(cur.dq, 1, 1, 12, 1),
               new cmn.i(cur.dr, 1, 1, 12, 1),
               new cmn.i(cur.ds, 1, 1, 12, 1),
               new cmn.i(cur.dt, 1, 1, 12, 1),
               new cmn.i(cur.du, 1, 1, 12, 1),
               new cmn.i(cur.dv, 1, 1, 7, 1),
               new cmn.i(cur.pv, 1, 1, 12, 1),
               new cmn.i(cur.vl, 1, 1, 12, 1),
               new cmn.i(cur.rY, 1, 1, 12, 1),
               new cmn.i(cur.rZ, 1, 1, 12, 1),
               new cmn.i(cur.aa, 5, 1, 8, 1),
               new cmn.i(cur.Y, 5, 1, 8, 1),
               new cmn.i(cur.ac, 5, 1, 8, 1),
               new cmn.i(cur.Z, 5, 1, 8, 1),
               new cmn.i(cur.W, 5, 1, 8, 1),
               new cmn.i(cur.X, 5, 1, 8, 1),
               new cmn.i(cur.ab, 5, 1, 8, 1),
               new cmn.i(cur.ad, 5, 1, 8, 1),
               new cmn.i(cur.rw, 1, 3, 12, 1),
               new cmn.i(cur.ri, 1, 3, 12, 1),
               new cmn.i(cur.rt, 1, 3, 12, 1),
               new cmn.i(cur.ro, 1, 3, 12, 1),
               new cmn.i(cur.rx, 1, 3, 12, 1),
               new cmn.i(cur.rv, 1, 3, 12, 1),
               new cmn.i(cur.rq, 1, 3, 12, 1),
               new cmn.i(cur.rk, 1, 3, 12, 1),
               new cmn.i(cur.rm, 1, 3, 12, 1),
               new cmn.i(cur.rp, 1, 3, 12, 1),
               new cmn.i(cur.rs, 1, 3, 12, 1),
               new cmn.i(cur.rl, 1, 3, 12, 1),
               new cmn.i(cur.rn, 1, 3, 12, 1),
               new cmn.i(cur.rj, 1, 3, 12, 1),
               new cmn.i(cur.ru, 1, 3, 12, 1),
               new cmn.i(cur.rr, 1, 3, 12, 1),
               new cmn.i(cur.kx, 3, 1, 8, 1),
               new cmn.i(cur.ky, 3, 1, 8, 1),
               new cmn.i(cur.kz, 3, 1, 8, 1),
               new cmn.i(cur.kA, 3, 1, 8, 1),
               new cmn.i(cur.kw, 3, 1, 8, 1),
               new cmn.i(cur.fV, 1, 3, 4, 1),
               new cmn.i(cur.dA, 1, 3, 4, 1),
               new cmn.i(cur.dB, 1, 3, 4, 1),
               new cmn.i(cur.gb, 1, 5, 2, 1),
               new cmn.i(cur.dQ, 1, 2, 5, 1),
               new cmn.i(cur.af, 1, 8, 8, 1),
               new cmn.i(cur.ai, 1, 4, 6, 1),
               new cmn.i(cur.xl, 1, 2, 5, 1),
               new cmn.i(cur.F, 1, 2, 5, 1),
               new cmn.i(cur.dN, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static cmn.g a(int $$0) {
      return new cmn.m(
         ImmutableMap.builder()
            .put(cmo.a, new cmn.d($$0, dac.b, dac.h, dac.B))
            .put(cmo.b, new cmn.d($$0, dac.c, dac.e, dac.y))
            .put(cmo.c, new cmn.d($$0, dac.z, dac.o, dac.p))
            .put(cmo.d, new cmn.d($$0, dac.q, dac.k, dac.t))
            .put(cmo.e, new cmn.d($$0, dac.g, dac.s, dac.j))
            .put(cmo.f, new cmn.d($$0, dac.i, dac.f, dac.P))
            .put(cmo.g, new cmn.d($$0, dac.d, dac.r, dac.A))
            .build()
      );
   }

   private static cmn.g a() {
      return new cmn.m(
         ImmutableMap.builder()
            .put(cmo.a, new cmn.d(30, 3, 3, dac.u))
            .put(cmo.b, new cmn.d(30, 2, 2, dac.w))
            .put(cmo.c, new cmn.d(30, 3, 3, dac.a))
            .put(cmo.d, new cmn.d(30, 3, 3, dac.n))
            .put(cmo.e, new cmn.d(30, dac.v))
            .put(cmo.f, new cmn.d(30, dac.O))
            .put(cmo.g, new cmn.d(30, 2, 2, dac.x))
            .build()
      );
   }

   private static Int2ObjectMap<cmn.g[]> a(ImmutableMap<Integer, cmn.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static dat a(ji<cwn> $$0) {
      return new dat(cur.sk).a($$1 -> $$1.a(km.G, new cwp($$0)));
   }

   private static cuo b(ji<cwn> $$0) {
      return cwp.a(cur.sk, $$0);
   }

   private static cuo a(cuj $$0, czz $$1, int $$2) {
      cuo $$3 = new cuo($$0);
      $$3.a($$1, $$2);
      return $$3;
   }

   static class a implements cmn.g {
      private final cuj a;
      private final int b;
      private final int c;
      private final int d;

      public a(cuj $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(cuj $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public dav a(bst $$0, azg $$1) {
         dat $$2 = new dat(cur.oz, this.b);
         cuo $$3 = new cuo(this.a);
         if ($$3.a(awx.by)) {
            List<cti> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = cxg.a($$3, $$4);
         }

         return new dav($$2, $$3, this.c, this.d, 0.2F);
      }

      private static cti a(azg $$0) {
         return cti.a(cth.a($$0.a(16)));
      }
   }

   static class b implements cmn.g {
      private final dat a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(dbw $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(dbw $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new dat($$0.r(), $$1), $$2, $$3, $$4);
      }

      public b(dat $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public dav a(bst $$0, azg $$1) {
         return new dav(this.a, new cuo(cur.oz, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements cmn.g {
      private final Map<cmo, cuj> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<cmo, cuj> $$3) {
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
      public dav a(bst $$0, azg $$1) {
         if ($$0 instanceof cml $$2) {
            dat $$3 = new dat(this.a.get($$2.gB().a()), this.b);
            return new dav($$3, new cuo(cur.oz), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements cmn.g {
      private final int a;
      private final List<czz> b;
      private final int c;
      private final int d;

      public d(int $$0) {
         this($$0, lp.f.s().filter(czz::k).toArray(czz[]::new));
      }

      public d(int $$0, czz... $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, czz... $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = Arrays.asList($$3);
      }

      @Override
      public dav a(bst $$0, azg $$1) {
         czz $$2 = this.b.get($$1.a(this.b.size()));
         int $$3 = Math.max($$2.f(), this.c);
         int $$4 = Math.min($$2.g(), this.d);
         int $$5 = ayy.a($$1, $$3, $$4);
         cuo $$6 = ctm.a(new dab($$2, $$5));
         int $$7 = 2 + $$1.a(5 + $$5 * 10) + 3 * $$5;
         if ($$2.a()) {
            $$7 *= 2;
         }

         if ($$7 > 64) {
            $$7 = 64;
         }

         return new dav(new dat(cur.oz, $$7), Optional.of(new dat(cur.qP)), $$6, 12, this.a, 0.2F);
      }
   }

   static class e implements cmn.g {
      private final cuo a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(cuj $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(cuj $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new cuo($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public dav a(bst $$0, azg $$1) {
         int $$2 = 5 + $$1.a(15);
         cuo $$3 = daa.a($$0.dP().J(), $$1, new cuo(this.a.g()), $$2, false);
         int $$4 = Math.min(this.b + $$2, 64);
         dat $$5 = new dat(cur.oz, $$4);
         return new dav($$5, $$3, this.c, this.d, this.e);
      }
   }

   static class f implements cmn.g {
      @Override
      public dav a(bst $$0, azg $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      dav a(bst var1, azg var2);
   }

   static class h implements cmn.g {
      private final dat a;
      private final int b;
      private final cuo c;
      private final int d;
      private final int e;
      private final float f;

      public h(dbw $$0, int $$1, int $$2, cuj $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new cuo($$3), $$4, $$5, $$6, $$7);
      }

      h(dbw $$0, int $$1, int $$2, cuo $$3, int $$4, int $$5, int $$6, float $$7) {
         this(new dat($$0, $$1), $$2, $$3.c($$4), $$5, $$6, $$7);
      }

      public h(dat $$0, int $$1, cuo $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public dav a(bst $$0, azg $$1) {
         return new dav(new dat(cur.oz, this.b), Optional.of(this.a), this.c.s(), 0, this.d, this.e, this.f, 0);
      }
   }

   static class i implements cmn.g {
      private final cuo a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public i(dey $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cuo($$0), $$1, $$2, $$3, $$4);
      }

      public i(cuj $$0, int $$1, int $$2, int $$3) {
         this(new cuo($$0), $$1, $$2, 12, $$3);
      }

      public i(cuj $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cuo($$0), $$1, $$2, $$3, $$4);
      }

      public i(cuo $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(cuj $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new cuo($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(cuo $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.a.e($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
      }

      @Override
      public dav a(bst $$0, azg $$1) {
         return new dav(new dat(cur.oz, this.b), this.a.s(), this.c, this.d, this.e);
      }
   }

   static class j implements cmn.g {
      private final cxs a;
      private final int b;
      private final float c;

      public j(ji<brz> $$0, int $$1, int $$2) {
         this(new cxs(List.of(new cxs.a($$0, $$1))), $$2, 0.05F);
      }

      public j(cxs $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public dav a(bst $$0, azg $$1) {
         cuo $$2 = new cuo(cur.vU, 1);
         $$2.b(km.H, this.a);
         return new dav(new dat(cur.oz), $$2, 12, this.b, this.c);
      }
   }

   static class k implements cmn.g {
      private final cuo a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final cuj f;
      private final int g;
      private final float h;

      public k(cuj $$0, int $$1, cuj $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new cuo($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public dav a(bst $$0, azg $$1) {
         dat $$2 = new dat(cur.oz, this.c);
         List<ji<cwn>> $$3 = lp.i.h().filter($$1x -> !((cwn)$$1x.a()).a().isEmpty() && $$0.dP().K().a($$1x)).collect(Collectors.toList());
         ji<cwn> $$4 = ac.a($$3, $$1);
         cuo $$5 = new cuo(this.a.g(), this.b);
         $$5.b(km.G, new cwp($$4));
         return new dav($$2, Optional.of(new dat(this.f, this.g)), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements cmn.g {
      private final int a;
      private final axe<eij> b;
      private final String c;
      private final ji<epe> d;
      private final int e;
      private final int f;

      public l(int $$0, axe<eij> $$1, String $$2, ji<epe> $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public dav a(bst $$0, azg $$1) {
         if (!($$0.dP() instanceof are)) {
            return null;
         } else {
            are $$2 = (are)$$0.dP();
            iz $$3 = $$2.a(this.b, $$0.dp(), 100, true);
            if ($$3 != null) {
               cuo $$4 = cuw.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               cuw.a($$2, $$4);
               epj.a($$4, $$3, "+", this.d);
               $$4.b(km.h, xo.c(this.c));
               return new dav(new dat(cur.oz, this.a), Optional.of(new dat(cur.qS)), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static record m(Map<cmo, cmn.g> a) implements cmn.g {
      public static cmn.m a(cmn.g $$0, cmo... $$1) {
         return new cmn.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public dav a(bst $$0, azg $$1) {
         if ($$0 instanceof cml $$2) {
            cmo $$3 = $$2.gB().a();
            cmn.g $$4 = this.a.get($$3);
            return $$4 == null ? null : $$4.a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
