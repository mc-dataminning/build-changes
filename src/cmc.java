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

public class cmc {
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
   public static final Map<cmb, Int2ObjectMap<cmc.g[]>> a = ac.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            cmb.g,
            a(
               ImmutableMap.of(
                  1,
                  new cmc.g[]{
                     new cmc.b(cug.pw, 20, 16, 2),
                     new cmc.b(cug.ug, 26, 16, 2),
                     new cmc.b(cug.uf, 22, 16, 2),
                     new cmc.b(cug.vk, 15, 16, 2),
                     new cmc.i(cug.px, 1, 6, 16, 1)
                  },
                  2,
                  new cmc.g[]{new cmc.b(dfk.eZ, 6, 12, 10), new cmc.i(cug.ut, 1, 4, 5), new cmc.i(cug.ou, 1, 4, 16, 5)},
                  3,
                  new cmc.g[]{new cmc.i(cug.rS, 3, 18, 10), new cmc.b(dfk.fa, 4, 12, 20)},
                  4,
                  new cmc.g[]{
                     new cmc.i(dfk.eg, 1, 1, 12, 15),
                     new cmc.j(brr.p, 100, 15),
                     new cmc.j(brr.h, 160, 15),
                     new cmc.j(brr.r, 140, 15),
                     new cmc.j(brr.o, 120, 15),
                     new cmc.j(brr.s, 280, 15),
                     new cmc.j(brr.w, 7, 15)
                  },
                  5,
                  new cmc.g[]{new cmc.i(cug.uk, 3, 3, 30), new cmc.i(cug.st, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            cmb.h,
            a(
               ImmutableMap.of(
                  1,
                  new cmc.g[]{
                     new cmc.b(cug.ps, 20, 16, 2),
                     new cmc.b(cug.ox, 10, 16, 2),
                     new cmc.h(cug.qZ, 6, 1, cug.rd, 6, 16, 1, 0.05F),
                     new cmc.i(cug.qH, 3, 1, 16, 1)
                  },
                  2,
                  new cmc.g[]{new cmc.b(cug.qZ, 15, 16, 10), new cmc.h(cug.ra, 6, 1, cug.re, 6, 16, 5, 0.05F), new cmc.i(cug.ww, 2, 1, 5)},
                  3,
                  new cmc.g[]{new cmc.b(cug.ra, 13, 16, 20), new cmc.e(cug.qV, 3, 3, 10, 0.2F)},
                  4,
                  new cmc.g[]{new cmc.b(cug.rb, 6, 12, 30)},
                  5,
                  new cmc.g[]{
                     new cmc.b(cug.rc, 4, 12, 30),
                     new cmc.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(cmd.c, cug.nU)
                           .put(cmd.g, cug.nW)
                           .put(cmd.e, cug.nW)
                           .put(cmd.a, cug.oa)
                           .put(cmd.b, cug.oa)
                           .put(cmd.d, cug.oc)
                           .put(cmd.f, cug.og)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            cmb.n,
            a(
               ImmutableMap.of(
                  1,
                  new cmc.g[]{
                     new cmc.b(dfk.bA, 18, 16, 2),
                     new cmc.b(dfk.bM, 18, 16, 2),
                     new cmc.b(dfk.bP, 18, 16, 2),
                     new cmc.b(dfk.bH, 18, 16, 2),
                     new cmc.i(cug.rV, 2, 1, 1)
                  },
                  2,
                  new cmc.g[]{
                     new cmc.b(cug.ri, 12, 16, 10),
                     new cmc.b(cug.rp, 12, 16, 10),
                     new cmc.b(cug.rx, 12, 16, 10),
                     new cmc.b(cug.rl, 12, 16, 10),
                     new cmc.b(cug.rn, 12, 16, 10),
                     new cmc.i(dfk.bA, 1, 1, 16, 5),
                     new cmc.i(dfk.bB, 1, 1, 16, 5),
                     new cmc.i(dfk.bC, 1, 1, 16, 5),
                     new cmc.i(dfk.bD, 1, 1, 16, 5),
                     new cmc.i(dfk.bE, 1, 1, 16, 5),
                     new cmc.i(dfk.bF, 1, 1, 16, 5),
                     new cmc.i(dfk.bG, 1, 1, 16, 5),
                     new cmc.i(dfk.bH, 1, 1, 16, 5),
                     new cmc.i(dfk.bI, 1, 1, 16, 5),
                     new cmc.i(dfk.bJ, 1, 1, 16, 5),
                     new cmc.i(dfk.bK, 1, 1, 16, 5),
                     new cmc.i(dfk.bL, 1, 1, 16, 5),
                     new cmc.i(dfk.bM, 1, 1, 16, 5),
                     new cmc.i(dfk.bN, 1, 1, 16, 5),
                     new cmc.i(dfk.bO, 1, 1, 16, 5),
                     new cmc.i(dfk.bP, 1, 1, 16, 5),
                     new cmc.i(dfk.ik, 1, 4, 16, 5),
                     new cmc.i(dfk.il, 1, 4, 16, 5),
                     new cmc.i(dfk.im, 1, 4, 16, 5),
                     new cmc.i(dfk.in, 1, 4, 16, 5),
                     new cmc.i(dfk.io, 1, 4, 16, 5),
                     new cmc.i(dfk.ip, 1, 4, 16, 5),
                     new cmc.i(dfk.iq, 1, 4, 16, 5),
                     new cmc.i(dfk.ir, 1, 4, 16, 5),
                     new cmc.i(dfk.is, 1, 4, 16, 5),
                     new cmc.i(dfk.it, 1, 4, 16, 5),
                     new cmc.i(dfk.iu, 1, 4, 16, 5),
                     new cmc.i(dfk.iv, 1, 4, 16, 5),
                     new cmc.i(dfk.iw, 1, 4, 16, 5),
                     new cmc.i(dfk.ix, 1, 4, 16, 5),
                     new cmc.i(dfk.iy, 1, 4, 16, 5),
                     new cmc.i(dfk.iz, 1, 4, 16, 5)
                  },
                  3,
                  new cmc.g[]{
                     new cmc.b(cug.rm, 12, 16, 20),
                     new cmc.b(cug.rq, 12, 16, 20),
                     new cmc.b(cug.rj, 12, 16, 20),
                     new cmc.b(cug.rw, 12, 16, 20),
                     new cmc.b(cug.ro, 12, 16, 20),
                     new cmc.i(dfk.aZ, 3, 1, 12, 10),
                     new cmc.i(dfk.bd, 3, 1, 12, 10),
                     new cmc.i(dfk.bn, 3, 1, 12, 10),
                     new cmc.i(dfk.bo, 3, 1, 12, 10),
                     new cmc.i(dfk.bk, 3, 1, 12, 10),
                     new cmc.i(dfk.bl, 3, 1, 12, 10),
                     new cmc.i(dfk.bi, 3, 1, 12, 10),
                     new cmc.i(dfk.bg, 3, 1, 12, 10),
                     new cmc.i(dfk.bm, 3, 1, 12, 10),
                     new cmc.i(dfk.bc, 3, 1, 12, 10),
                     new cmc.i(dfk.bh, 3, 1, 12, 10),
                     new cmc.i(dfk.be, 3, 1, 12, 10),
                     new cmc.i(dfk.bb, 3, 1, 12, 10),
                     new cmc.i(dfk.ba, 3, 1, 12, 10),
                     new cmc.i(dfk.bf, 3, 1, 12, 10),
                     new cmc.i(dfk.bj, 3, 1, 12, 10)
                  },
                  4,
                  new cmc.g[]{
                     new cmc.b(cug.ru, 12, 16, 30),
                     new cmc.b(cug.rs, 12, 16, 30),
                     new cmc.b(cug.rt, 12, 16, 30),
                     new cmc.b(cug.rv, 12, 16, 30),
                     new cmc.b(cug.rk, 12, 16, 30),
                     new cmc.b(cug.rr, 12, 16, 30),
                     new cmc.i(cug.uP, 3, 1, 12, 15),
                     new cmc.i(cug.va, 3, 1, 12, 15),
                     new cmc.i(cug.uS, 3, 1, 12, 15),
                     new cmc.i(cug.vd, 3, 1, 12, 15),
                     new cmc.i(cug.uV, 3, 1, 12, 15),
                     new cmc.i(cug.vc, 3, 1, 12, 15),
                     new cmc.i(cug.uU, 3, 1, 12, 15),
                     new cmc.i(cug.uW, 3, 1, 12, 15),
                     new cmc.i(cug.ve, 3, 1, 12, 15),
                     new cmc.i(cug.uZ, 3, 1, 12, 15),
                     new cmc.i(cug.uR, 3, 1, 12, 15),
                     new cmc.i(cug.uY, 3, 1, 12, 15),
                     new cmc.i(cug.vb, 3, 1, 12, 15),
                     new cmc.i(cug.uT, 3, 1, 12, 15),
                     new cmc.i(cug.uQ, 3, 1, 12, 15),
                     new cmc.i(cug.uX, 3, 1, 12, 15)
                  },
                  5,
                  new cmc.g[]{new cmc.i(cug.pZ, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            cmb.i,
            a(
               ImmutableMap.of(
                  1,
                  new cmc.g[]{new cmc.b(cug.pq, 32, 16, 2), new cmc.i(cug.ow, 1, 16, 1), new cmc.h(dfk.L, 10, 1, cug.pW, 10, 12, 1, 0.05F)},
                  2,
                  new cmc.g[]{new cmc.b(cug.pW, 26, 12, 10), new cmc.i(cug.ov, 2, 1, 5)},
                  3,
                  new cmc.g[]{new cmc.b(cug.ps, 14, 16, 20), new cmc.i(cug.vW, 3, 1, 10)},
                  4,
                  new cmc.g[]{new cmc.b(cug.pt, 24, 16, 30), new cmc.e(cug.ov, 2, 3, 15)},
                  5,
                  new cmc.g[]{new cmc.b(cug.mb, 8, 12, 30), new cmc.e(cug.vW, 3, 3, 15), new cmc.k(cug.ow, 5, cug.vq, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            cmb.k,
            a(
               ImmutableMap.builder()
                  .put(1, new cmc.g[]{new cmc.b(cug.qO, 24, 16, 2), new cmc.d(1, avz.i), new cmc.i(dfk.cl, 9, 1, 12, 1)})
                  .put(2, new cmc.g[]{new cmc.b(cug.qP, 4, 12, 10), new cmc.d(5, avz.i), new cmc.i(cug.ws, 1, 1, 5)})
                  .put(3, new cmc.g[]{new cmc.b(cug.rf, 5, 12, 20), new cmc.d(10, avz.i), new cmc.i(cug.cG, 1, 4, 10)})
                  .put(4, new cmc.g[]{new cmc.b(cug.tZ, 2, 12, 30), new cmc.d(15, avz.i), new cmc.i(cug.qW, 5, 1, 15), new cmc.i(cug.qS, 4, 1, 15)})
                  .put(5, new cmc.g[]{new cmc.i(cug.uL, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            cmb.e,
            a(
               ImmutableMap.of(
                  1,
                  new cmc.g[]{new cmc.b(cug.qO, 24, 16, 2), new cmc.i(cug.uj, 7, 1, 1)},
                  2,
                  new cmc.g[]{new cmc.b(cug.fT, 11, 16, 10), new cmc.l(13, awi.d, "filled_map.monument", epu.j, 12, 5)},
                  3,
                  new cmc.g[]{
                     new cmc.b(cug.qS, 1, 12, 20),
                     new cmc.l(14, awi.c, "filled_map.mansion", epu.i, 12, 10),
                     new cmc.l(12, awi.m, "filled_map.trial_chambers", epu.I, 12, 10)
                  },
                  4,
                  new cmc.g[]{
                     new cmc.i(cug.uc, 7, 1, 15),
                     new cmc.i(cug.uP, 3, 1, 15),
                     new cmc.i(cug.va, 3, 1, 15),
                     new cmc.i(cug.uS, 3, 1, 15),
                     new cmc.i(cug.vd, 3, 1, 15),
                     new cmc.i(cug.uV, 3, 1, 15),
                     new cmc.i(cug.vc, 3, 1, 15),
                     new cmc.i(cug.uU, 3, 1, 15),
                     new cmc.i(cug.uW, 3, 1, 15),
                     new cmc.i(cug.ve, 3, 1, 15),
                     new cmc.i(cug.uZ, 3, 1, 15),
                     new cmc.i(cug.uR, 3, 1, 15),
                     new cmc.i(cug.uY, 3, 1, 15),
                     new cmc.i(cug.vb, 3, 1, 15),
                     new cmc.i(cug.uT, 3, 1, 15),
                     new cmc.i(cug.uQ, 3, 1, 15),
                     new cmc.i(cug.uX, 3, 1, 15)
                  },
                  5,
                  new cmc.g[]{new cmc.i(cug.wd, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            cmb.f,
            a(
               ImmutableMap.of(
                  1,
                  new cmc.g[]{new cmc.b(cug.se, 32, 16, 2), new cmc.i(cug.lH, 1, 2, 1)},
                  2,
                  new cmc.g[]{new cmc.b(cug.oJ, 3, 12, 10), new cmc.i(cug.oB, 1, 1, 5)},
                  3,
                  new cmc.g[]{new cmc.b(cug.uD, 2, 12, 20), new cmc.i(dfk.ec, 4, 1, 12, 10)},
                  4,
                  new cmc.g[]{new cmc.b(cug.op, 4, 12, 30), new cmc.b(cug.sl, 9, 12, 30), new cmc.i(cug.sf, 5, 1, 15)},
                  5,
                  new cmc.g[]{new cmc.b(cug.sj, 22, 12, 30), new cmc.i(cug.tW, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            cmb.c,
            a(
               ImmutableMap.of(
                  1,
                  new cmc.g[]{
                     new cmc.b(cug.ox, 15, 16, 2),
                     new cmc.i(new cud(cug.pI), 7, 1, 12, 1, 0.2F),
                     new cmc.i(new cud(cug.pJ), 4, 1, 12, 1, 0.2F),
                     new cmc.i(new cud(cug.pG), 5, 1, 12, 1, 0.2F),
                     new cmc.i(new cud(cug.pH), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cmc.g[]{
                     new cmc.b(cug.oF, 4, 12, 10),
                     new cmc.i(new cud(cug.wr), 36, 1, 12, 5, 0.2F),
                     new cmc.i(new cud(cug.pF), 1, 1, 12, 5, 0.2F),
                     new cmc.i(new cud(cug.pE), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new cmc.g[]{
                     new cmc.b(cug.qA, 1, 12, 20),
                     new cmc.b(cug.oz, 1, 12, 20),
                     new cmc.i(new cud(cug.pC), 1, 1, 12, 10, 0.2F),
                     new cmc.i(new cud(cug.pD), 4, 1, 12, 10, 0.2F),
                     new cmc.i(new cud(cug.vs), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new cmc.g[]{new cmc.e(cug.pM, 14, 3, 15, 0.2F), new cmc.e(cug.pN, 8, 3, 15, 0.2F)},
                  5,
                  new cmc.g[]{new cmc.e(cug.pK, 8, 3, 30, 0.2F), new cmc.e(cug.pL, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cmb.p,
            a(
               ImmutableMap.of(
                  1,
                  new cmc.g[]{new cmc.b(cug.ox, 15, 16, 2), new cmc.i(new cud(cug.pe), 3, 1, 12, 1, 0.2F), new cmc.e(cug.pb, 2, 3, 1)},
                  2,
                  new cmc.g[]{new cmc.b(cug.oF, 4, 12, 10), new cmc.i(new cud(cug.wr), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cmc.g[]{new cmc.b(cug.pW, 24, 12, 20)},
                  4,
                  new cmc.g[]{new cmc.b(cug.oz, 1, 12, 30), new cmc.e(cug.pj, 12, 3, 15, 0.2F)},
                  5,
                  new cmc.g[]{new cmc.e(cug.pg, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cmb.o,
            a(
               ImmutableMap.of(
                  1,
                  new cmc.g[]{
                     new cmc.b(cug.ox, 15, 16, 2),
                     new cmc.i(new cud(cug.oU), 1, 1, 12, 1, 0.2F),
                     new cmc.i(new cud(cug.oS), 1, 1, 12, 1, 0.2F),
                     new cmc.i(new cud(cug.oT), 1, 1, 12, 1, 0.2F),
                     new cmc.i(new cud(cug.oV), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cmc.g[]{new cmc.b(cug.oF, 4, 12, 10), new cmc.i(new cud(cug.wr), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cmc.g[]{
                     new cmc.b(cug.pW, 30, 12, 20),
                     new cmc.e(cug.pe, 1, 3, 10, 0.2F),
                     new cmc.e(cug.pc, 2, 3, 10, 0.2F),
                     new cmc.e(cug.pd, 3, 3, 10, 0.2F),
                     new cmc.i(new cud(cug.pk), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new cmc.g[]{new cmc.b(cug.oz, 1, 12, 30), new cmc.e(cug.pj, 12, 3, 15, 0.2F), new cmc.e(cug.ph, 5, 3, 15, 0.2F)},
                  5,
                  new cmc.g[]{new cmc.e(cug.pi, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cmb.d,
            a(
               ImmutableMap.of(
                  1,
                  new cmc.g[]{new cmc.b(cug.sc, 14, 16, 2), new cmc.b(cug.pX, 7, 16, 2), new cmc.b(cug.uA, 4, 16, 2), new cmc.i(cug.uC, 1, 1, 1)},
                  2,
                  new cmc.g[]{new cmc.b(cug.ox, 15, 16, 2), new cmc.i(cug.pY, 1, 5, 16, 5), new cmc.i(cug.sd, 1, 8, 16, 5)},
                  3,
                  new cmc.g[]{new cmc.b(cug.uN, 7, 16, 20), new cmc.b(cug.sa, 10, 16, 20)},
                  4,
                  new cmc.g[]{new cmc.b(cug.qN, 10, 12, 30)},
                  5,
                  new cmc.g[]{new cmc.b(cug.wu, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            cmb.j,
            a(
               ImmutableMap.of(
                  1,
                  new cmc.g[]{new cmc.b(cug.qD, 6, 16, 2), new cmc.a(cug.pA, 3), new cmc.a(cug.pz, 7)},
                  2,
                  new cmc.g[]{new cmc.b(cug.pW, 26, 12, 10), new cmc.a(cug.py, 5, 12, 5), new cmc.a(cug.pB, 4, 12, 5)},
                  3,
                  new cmc.g[]{new cmc.b(cug.uE, 9, 12, 20), new cmc.a(cug.pz, 7)},
                  4,
                  new cmc.g[]{new cmc.b(cug.op, 4, 12, 30), new cmc.a(cug.uJ, 6, 12, 15)},
                  5,
                  new cmc.g[]{new cmc.i(new cud(cug.nL), 6, 1, 12, 30, 0.2F), new cmc.a(cug.py, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            cmb.l,
            a(
               ImmutableMap.of(
                  1,
                  new cmc.g[]{new cmc.b(cug.qM, 10, 16, 2), new cmc.i(cug.qL, 1, 10, 16, 1)},
                  2,
                  new cmc.g[]{new cmc.b(dfk.b, 20, 16, 10), new cmc.i(dfk.eK, 1, 4, 16, 5)},
                  3,
                  new cmc.g[]{
                     new cmc.b(dfk.c, 16, 16, 20),
                     new cmc.b(dfk.g, 16, 16, 20),
                     new cmc.b(dfk.e, 16, 16, 20),
                     new cmc.i(dfk.su, 1, 4, 16, 10),
                     new cmc.i(dfk.h, 1, 4, 16, 10),
                     new cmc.i(dfk.f, 1, 4, 16, 10),
                     new cmc.i(dfk.d, 1, 4, 16, 10)
                  },
                  4,
                  new cmc.g[]{
                     new cmc.b(cug.oC, 12, 12, 30),
                     new cmc.i(dfk.hk, 1, 1, 12, 15),
                     new cmc.i(dfk.hj, 1, 1, 12, 15),
                     new cmc.i(dfk.hu, 1, 1, 12, 15),
                     new cmc.i(dfk.hm, 1, 1, 12, 15),
                     new cmc.i(dfk.hq, 1, 1, 12, 15),
                     new cmc.i(dfk.hr, 1, 1, 12, 15),
                     new cmc.i(dfk.hy, 1, 1, 12, 15),
                     new cmc.i(dfk.hx, 1, 1, 12, 15),
                     new cmc.i(dfk.hp, 1, 1, 12, 15),
                     new cmc.i(dfk.hl, 1, 1, 12, 15),
                     new cmc.i(dfk.ho, 1, 1, 12, 15),
                     new cmc.i(dfk.hw, 1, 1, 12, 15),
                     new cmc.i(dfk.hs, 1, 1, 12, 15),
                     new cmc.i(dfk.ht, 1, 1, 12, 15),
                     new cmc.i(dfk.hn, 1, 1, 12, 15),
                     new cmc.i(dfk.hv, 1, 1, 12, 15),
                     new cmc.i(dfk.lh, 1, 1, 12, 15),
                     new cmc.i(dfk.lg, 1, 1, 12, 15),
                     new cmc.i(dfk.lr, 1, 1, 12, 15),
                     new cmc.i(dfk.lj, 1, 1, 12, 15),
                     new cmc.i(dfk.ln, 1, 1, 12, 15),
                     new cmc.i(dfk.lo, 1, 1, 12, 15),
                     new cmc.i(dfk.lv, 1, 1, 12, 15),
                     new cmc.i(dfk.lu, 1, 1, 12, 15),
                     new cmc.i(dfk.lm, 1, 1, 12, 15),
                     new cmc.i(dfk.li, 1, 1, 12, 15),
                     new cmc.i(dfk.ll, 1, 1, 12, 15),
                     new cmc.i(dfk.lt, 1, 1, 12, 15),
                     new cmc.i(dfk.lp, 1, 1, 12, 15),
                     new cmc.i(dfk.lq, 1, 1, 12, 15),
                     new cmc.i(dfk.lk, 1, 1, 12, 15),
                     new cmc.i(dfk.ls, 1, 1, 12, 15)
                  },
                  5,
                  new cmc.g[]{new cmc.i(dfk.hf, 1, 1, 12, 30), new cmc.i(dfk.hd, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<cmc.g[]> b = a(
      ImmutableMap.of(
         1,
         new cmc.g[]{
            new cmc.i(cug.cT, 2, 1, 5, 1),
            new cmc.i(cug.qQ, 4, 1, 5, 1),
            new cmc.i(cug.fu, 2, 1, 5, 1),
            new cmc.i(cug.vU, 5, 1, 5, 1),
            new cmc.i(cug.cO, 1, 1, 12, 1),
            new cmc.i(cug.dJ, 1, 1, 8, 1),
            new cmc.i(cug.fk, 1, 1, 4, 1),
            new cmc.i(cug.dK, 3, 1, 12, 1),
            new cmc.i(cug.eW, 3, 1, 8, 1),
            new cmc.i(cug.dk, 1, 1, 12, 1),
            new cmc.i(cug.dl, 1, 1, 12, 1),
            new cmc.i(cug.dm, 1, 1, 8, 1),
            new cmc.i(cug.dn, 1, 1, 12, 1),
            new cmc.i(cug.do, 1, 1, 12, 1),
            new cmc.i(cug.dp, 1, 1, 12, 1),
            new cmc.i(cug.dq, 1, 1, 12, 1),
            new cmc.i(cug.dr, 1, 1, 12, 1),
            new cmc.i(cug.ds, 1, 1, 12, 1),
            new cmc.i(cug.dt, 1, 1, 12, 1),
            new cmc.i(cug.du, 1, 1, 12, 1),
            new cmc.i(cug.dv, 1, 1, 7, 1),
            new cmc.i(cug.pv, 1, 1, 12, 1),
            new cmc.i(cug.vl, 1, 1, 12, 1),
            new cmc.i(cug.rY, 1, 1, 12, 1),
            new cmc.i(cug.rZ, 1, 1, 12, 1),
            new cmc.i(cug.aa, 5, 1, 8, 1),
            new cmc.i(cug.Y, 5, 1, 8, 1),
            new cmc.i(cug.ac, 5, 1, 8, 1),
            new cmc.i(cug.Z, 5, 1, 8, 1),
            new cmc.i(cug.W, 5, 1, 8, 1),
            new cmc.i(cug.X, 5, 1, 8, 1),
            new cmc.i(cug.ab, 5, 1, 8, 1),
            new cmc.i(cug.ad, 5, 1, 8, 1),
            new cmc.i(cug.rw, 1, 3, 12, 1),
            new cmc.i(cug.ri, 1, 3, 12, 1),
            new cmc.i(cug.rt, 1, 3, 12, 1),
            new cmc.i(cug.ro, 1, 3, 12, 1),
            new cmc.i(cug.rx, 1, 3, 12, 1),
            new cmc.i(cug.rv, 1, 3, 12, 1),
            new cmc.i(cug.rq, 1, 3, 12, 1),
            new cmc.i(cug.rk, 1, 3, 12, 1),
            new cmc.i(cug.rm, 1, 3, 12, 1),
            new cmc.i(cug.rp, 1, 3, 12, 1),
            new cmc.i(cug.rs, 1, 3, 12, 1),
            new cmc.i(cug.rl, 1, 3, 12, 1),
            new cmc.i(cug.rn, 1, 3, 12, 1),
            new cmc.i(cug.rj, 1, 3, 12, 1),
            new cmc.i(cug.ru, 1, 3, 12, 1),
            new cmc.i(cug.rr, 1, 3, 12, 1),
            new cmc.i(cug.kx, 3, 1, 8, 1),
            new cmc.i(cug.ky, 3, 1, 8, 1),
            new cmc.i(cug.kz, 3, 1, 8, 1),
            new cmc.i(cug.kA, 3, 1, 8, 1),
            new cmc.i(cug.kw, 3, 1, 8, 1),
            new cmc.i(cug.fV, 1, 1, 12, 1),
            new cmc.i(cug.dA, 1, 1, 12, 1),
            new cmc.i(cug.dB, 1, 1, 12, 1),
            new cmc.i(cug.gb, 1, 2, 5, 1),
            new cmc.i(cug.dQ, 1, 2, 5, 1),
            new cmc.i(cug.af, 1, 8, 8, 1),
            new cmc.i(cug.ai, 1, 4, 6, 1),
            new cmc.i(cug.xo, 1, 2, 5, 1),
            new cmc.i(cug.F, 1, 2, 5, 1),
            new cmc.i(cug.dN, 1, 2, 5, 1)
         },
         2,
         new cmc.g[]{
            new cmc.i(cug.qI, 5, 1, 4, 1),
            new cmc.i(cug.qF, 5, 1, 4, 1),
            new cmc.i(cug.hV, 3, 1, 6, 1),
            new cmc.i(cug.kV, 6, 1, 6, 1),
            new cmc.i(cug.pu, 1, 1, 8, 1),
            new cmc.i(cug.E, 3, 3, 6, 1)
         }
      )
   );
   private static final cmc.l s = new cmc.l(8, awi.f, "filled_map.village_desert", epu.B, 12, 5);
   private static final cmc.l t = new cmc.l(8, awi.e, "filled_map.village_savanna", epu.D, 12, 5);
   private static final cmc.l u = new cmc.l(8, awi.g, "filled_map.village_plains", epu.C, 12, 5);
   private static final cmc.l v = new cmc.l(8, awi.h, "filled_map.village_taiga", epu.F, 12, 5);
   private static final cmc.l w = new cmc.l(8, awi.i, "filled_map.village_snowy", epu.E, 12, 5);
   private static final cmc.l x = new cmc.l(8, awi.j, "filled_map.explorer_jungle", epu.G, 12, 5);
   private static final cmc.l y = new cmc.l(8, awi.k, "filled_map.explorer_swamp", epu.H, 12, 5);
   public static final Map<cmb, Int2ObjectMap<cmc.g[]>> c = Map.of(
      cmb.k,
      a(
         ImmutableMap.builder()
            .put(1, new cmc.g[]{new cmc.b(cug.qO, 24, 16, 2), a(1), new cmc.i(dfk.cl, 9, 1, 12, 1)})
            .put(2, new cmc.g[]{new cmc.b(cug.qP, 4, 12, 10), a(5), new cmc.i(cug.ws, 1, 1, 5)})
            .put(3, new cmc.g[]{new cmc.b(cug.rf, 5, 12, 20), a(10), new cmc.i(cug.cG, 1, 4, 10)})
            .put(4, new cmc.g[]{new cmc.b(cug.tZ, 2, 12, 30), new cmc.i(cug.qW, 5, 1, 15), new cmc.i(cug.qS, 4, 1, 15)})
            .put(5, new cmc.g[]{a(), new cmc.i(cug.uL, 20, 1, 30)})
            .build()
      ),
      cmb.c,
      a(
         ImmutableMap.builder()
            .put(1, new cmc.g[]{new cmc.b(cug.ox, 15, 12, 2), new cmc.b(cug.oF, 5, 12, 2)})
            .put(
               2,
               new cmc.g[]{
                  cmc.m.a(new cmc.i(cug.pJ, 4, 1, 12, 5, 0.05F), cmd.a, cmd.c, cmd.d, cmd.e, cmd.g),
                  cmc.m.a(new cmc.i(cug.pF, 4, 1, 12, 5, 0.05F), cmd.b, cmd.f),
                  cmc.m.a(new cmc.i(cug.pG, 5, 1, 12, 5, 0.05F), cmd.a, cmd.c, cmd.d, cmd.e, cmd.g),
                  cmc.m.a(new cmc.i(cug.pC, 5, 1, 12, 5, 0.05F), cmd.b, cmd.f),
                  cmc.m.a(new cmc.i(cug.pI, 7, 1, 12, 5, 0.05F), cmd.a, cmd.c, cmd.d, cmd.e, cmd.g),
                  cmc.m.a(new cmc.i(cug.pE, 7, 1, 12, 5, 0.05F), cmd.b, cmd.f),
                  cmc.m.a(new cmc.i(cug.pH, 9, 1, 12, 5, 0.05F), cmd.a, cmd.c, cmd.d, cmd.e, cmd.g),
                  cmc.m.a(new cmc.i(cug.pD, 9, 1, 12, 5, 0.05F), cmd.b, cmd.f)
               }
            )
            .put(3, new cmc.g[]{new cmc.b(cug.qA, 1, 12, 20), new cmc.i(cug.vs, 5, 1, 12, 10, 0.05F), new cmc.i(cug.wr, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new cmc.g[]{
                  cmc.m.a(new cmc.i(cug.pJ, 8, 1, 3, 15, 0.05F, day.a), cmd.a),
                  cmc.m.a(new cmc.i(cug.pG, 9, 1, 3, 15, 0.05F, day.d), cmd.a),
                  cmc.m.a(new cmc.i(cug.pI, 11, 1, 3, 15, 0.05F, day.b), cmd.a),
                  cmc.m.a(new cmc.i(cug.pH, 13, 1, 3, 15, 0.05F, day.c), cmd.a),
                  cmc.m.a(new cmc.i(cug.pJ, 8, 1, 3, 15, 0.05F, day.g), cmd.c),
                  cmc.m.a(new cmc.i(cug.pG, 9, 1, 3, 15, 0.05F, day.j), cmd.c),
                  cmc.m.a(new cmc.i(cug.pI, 11, 1, 3, 15, 0.05F, day.h), cmd.c),
                  cmc.m.a(new cmc.i(cug.pH, 13, 1, 3, 15, 0.05F, day.i), cmd.c),
                  cmc.m.a(new cmc.i(cug.pJ, 2, 1, 3, 15, 0.05F, day.m), cmd.d),
                  cmc.m.a(new cmc.i(cug.pG, 3, 1, 3, 15, 0.05F, day.p), cmd.d),
                  cmc.m.a(new cmc.i(cug.pI, 5, 1, 3, 15, 0.05F, day.n), cmd.d),
                  cmc.m.a(new cmc.i(cug.pH, 7, 1, 3, 15, 0.05F, day.o), cmd.d),
                  cmc.m.a(new cmc.i(cug.pJ, 8, 1, 3, 15, 0.05F, day.s), cmd.e),
                  cmc.m.a(new cmc.i(cug.pG, 9, 1, 3, 15, 0.05F, day.t), cmd.e),
                  cmc.m.a(new cmc.i(cug.pF, 8, 1, 3, 15, 0.05F, day.w), cmd.b),
                  cmc.m.a(new cmc.i(cug.pC, 9, 1, 3, 15, 0.05F, day.z), cmd.b),
                  cmc.m.a(new cmc.i(cug.pE, 11, 1, 3, 15, 0.05F, day.x), cmd.b),
                  cmc.m.a(new cmc.i(cug.pD, 13, 1, 3, 15, 0.05F, day.y), cmd.b),
                  cmc.m.a(new cmc.i(cug.pF, 8, 1, 3, 15, 0.05F, day.C), cmd.f),
                  cmc.m.a(new cmc.i(cug.pC, 9, 1, 3, 15, 0.05F, day.F), cmd.f),
                  cmc.m.a(new cmc.i(cug.pE, 11, 1, 3, 15, 0.05F, day.D), cmd.f),
                  cmc.m.a(new cmc.i(cug.pD, 13, 1, 3, 15, 0.05F, day.E), cmd.f),
                  cmc.m.a(new cmc.h(cug.pN, 1, 4, cug.pM, 1, 3, 15, 0.05F), cmd.g),
                  cmc.m.a(new cmc.h(cug.pM, 1, 4, cug.pL, 1, 3, 15, 0.05F), cmd.g),
                  cmc.m.a(new cmc.h(cug.pK, 1, 4, cug.pN, 1, 3, 15, 0.05F), cmd.g),
                  cmc.m.a(new cmc.h(cug.pL, 1, 2, cug.pK, 1, 3, 15, 0.05F), cmd.g)
               }
            )
            .put(
               5,
               new cmc.g[]{
                  cmc.m.a(new cmc.h(cug.oz, 4, 16, cug.pL, 1, 3, 30, 0.05F, day.f), cmd.a),
                  cmc.m.a(new cmc.h(cug.oz, 3, 16, cug.pM, 1, 3, 30, 0.05F, day.e), cmd.a),
                  cmc.m.a(new cmc.h(cug.oz, 3, 16, cug.pM, 1, 3, 30, 0.05F, day.l), cmd.c),
                  cmc.m.a(new cmc.h(cug.oz, 2, 12, cug.pN, 1, 3, 30, 0.05F, day.k), cmd.c),
                  cmc.m.a(new cmc.h(cug.oz, 2, 6, cug.pK, 1, 3, 30, 0.05F, day.r), cmd.d),
                  cmc.m.a(new cmc.h(cug.oz, 3, 8, cug.pL, 1, 3, 30, 0.05F, day.q), cmd.d),
                  cmc.m.a(new cmc.h(cug.oz, 2, 12, cug.pN, 1, 3, 30, 0.05F, day.u), cmd.e),
                  cmc.m.a(new cmc.h(cug.oz, 3, 12, cug.pK, 1, 3, 30, 0.05F, day.v), cmd.e),
                  cmc.m.a(new cmc.i(cug.pC, 9, 1, 3, 30, 0.05F, day.B), cmd.b),
                  cmc.m.a(new cmc.i(cug.pF, 8, 1, 3, 30, 0.05F, day.A), cmd.b),
                  cmc.m.a(new cmc.i(cug.pC, 9, 1, 3, 30, 0.05F, day.H), cmd.f),
                  cmc.m.a(new cmc.i(cug.pF, 8, 1, 3, 30, 0.05F, day.G), cmd.f),
                  cmc.m.a(new cmc.h(cug.oz, 4, 18, cug.pL, 1, 3, 30, 0.05F, day.J), cmd.g),
                  cmc.m.a(new cmc.h(cug.oz, 3, 18, cug.pM, 1, 3, 30, 0.05F, day.I), cmd.g),
                  cmc.m.a(new cmc.b(cug.aN, 1, 12, 30, 42), cmd.g),
                  cmc.m.a(new cmc.b(cug.aK, 1, 12, 30, 4), cmd.a, cmd.b, cmd.c, cmd.d, cmd.e, cmd.f)
               }
            )
            .build()
      ),
      cmb.e,
      a(
         ImmutableMap.of(
            1,
            new cmc.g[]{new cmc.b(cug.qO, 24, 16, 2), new cmc.i(cug.uj, 7, 1, 1)},
            2,
            new cmc.g[]{
               new cmc.b(cug.fT, 11, 16, 10),
               new cmc.m(ImmutableMap.builder().put(cmd.a, t).put(cmd.d, u).put(cmd.c, v).put(cmd.g, w).put(cmd.e, u).put(cmd.b, t).put(cmd.f, w).build()),
               new cmc.m(ImmutableMap.builder().put(cmd.a, u).put(cmd.d, s).put(cmd.c, t).put(cmd.g, u).put(cmd.e, v).put(cmd.b, s).put(cmd.f, v).build()),
               new cmc.m(
                  ImmutableMap.builder().put(cmd.a, x).put(cmd.d, x).put(cmd.c, new cmc.f()).put(cmd.g, y).put(cmd.e, y).put(cmd.b, y).put(cmd.f, x).build()
               )
            },
            3,
            new cmc.g[]{
               new cmc.b(cug.qS, 1, 12, 20),
               new cmc.l(13, awi.d, "filled_map.monument", epu.j, 12, 10),
               new cmc.l(12, awi.m, "filled_map.trial_chambers", epu.I, 12, 10)
            },
            4,
            new cmc.g[]{
               new cmc.i(cug.uc, 7, 1, 15),
               new cmc.i(cug.uP, 3, 1, 15),
               new cmc.i(cug.va, 3, 1, 15),
               new cmc.i(cug.uS, 3, 1, 15),
               new cmc.i(cug.vd, 3, 1, 15),
               new cmc.i(cug.uV, 3, 1, 15),
               new cmc.i(cug.vc, 3, 1, 15),
               new cmc.i(cug.uU, 3, 1, 15),
               new cmc.i(cug.uW, 3, 1, 15),
               new cmc.i(cug.ve, 3, 1, 15),
               new cmc.i(cug.uZ, 3, 1, 15),
               new cmc.i(cug.uR, 3, 1, 15),
               new cmc.i(cug.uY, 3, 1, 15),
               new cmc.i(cug.vb, 3, 1, 15),
               new cmc.i(cug.uT, 3, 1, 15),
               new cmc.i(cug.uQ, 3, 1, 15),
               new cmc.i(cug.uX, 3, 1, 15)
            },
            5,
            new cmc.g[]{new cmc.i(cug.wd, 8, 1, 30), new cmc.l(14, awi.c, "filled_map.mansion", epu.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<cmc.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new cmc.g[]{
               new cmc.b(a(cwf.a), 1, 1, 1),
               new cmc.b(cug.qz, 1, 1, 1, 2),
               new cmc.b(cug.qE, 1, 1, 1, 2),
               new cmc.b(cug.sn, 1, 1, 1, 3),
               new cmc.b(cug.uh, 4, 1, 1),
               new cmc.b(cug.hD, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cmc.g[]{
               new cmc.i(cug.hV, 1, 1, 6, 1),
               new cmc.i(cug.kV, 6, 1, 6, 1),
               new cmc.i(cug.pu, 1, 4, 2, 1),
               new cmc.i(cug.E, 3, 3, 6, 1),
               new cmc.i(dfk.Y, 1, 8, 4, 1),
               new cmc.i(dfk.W, 1, 8, 4, 1),
               new cmc.i(dfk.aa, 1, 8, 4, 1),
               new cmc.i(dfk.X, 1, 8, 4, 1),
               new cmc.i(dfk.U, 1, 8, 4, 1),
               new cmc.i(dfk.V, 1, 8, 4, 1),
               new cmc.i(dfk.Z, 1, 8, 4, 1),
               new cmc.e(cug.pd, 1, 1, 1, 0.2F),
               new cmc.i(b(cwf.h), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cmc.g[]{
               new cmc.i(cug.qI, 3, 1, 4, 1),
               new cmc.i(cug.qF, 3, 1, 4, 1),
               new cmc.i(cug.cT, 2, 1, 5, 1),
               new cmc.i(cug.qQ, 4, 1, 5, 1),
               new cmc.i(cug.fu, 2, 1, 5, 1),
               new cmc.i(cug.vU, 5, 1, 5, 1),
               new cmc.i(cug.cO, 1, 1, 12, 1),
               new cmc.i(cug.dJ, 1, 1, 8, 1),
               new cmc.i(cug.fk, 1, 1, 4, 1),
               new cmc.i(cug.dK, 3, 1, 12, 1),
               new cmc.i(cug.eW, 3, 1, 8, 1),
               new cmc.i(cug.dk, 1, 1, 12, 1),
               new cmc.i(cug.dl, 1, 1, 12, 1),
               new cmc.i(cug.dm, 1, 1, 8, 1),
               new cmc.i(cug.dn, 1, 1, 12, 1),
               new cmc.i(cug.do, 1, 1, 12, 1),
               new cmc.i(cug.dp, 1, 1, 12, 1),
               new cmc.i(cug.dq, 1, 1, 12, 1),
               new cmc.i(cug.dr, 1, 1, 12, 1),
               new cmc.i(cug.ds, 1, 1, 12, 1),
               new cmc.i(cug.dt, 1, 1, 12, 1),
               new cmc.i(cug.du, 1, 1, 12, 1),
               new cmc.i(cug.dv, 1, 1, 7, 1),
               new cmc.i(cug.pv, 1, 1, 12, 1),
               new cmc.i(cug.vl, 1, 1, 12, 1),
               new cmc.i(cug.rY, 1, 1, 12, 1),
               new cmc.i(cug.rZ, 1, 1, 12, 1),
               new cmc.i(cug.aa, 5, 1, 8, 1),
               new cmc.i(cug.Y, 5, 1, 8, 1),
               new cmc.i(cug.ac, 5, 1, 8, 1),
               new cmc.i(cug.Z, 5, 1, 8, 1),
               new cmc.i(cug.W, 5, 1, 8, 1),
               new cmc.i(cug.X, 5, 1, 8, 1),
               new cmc.i(cug.ab, 5, 1, 8, 1),
               new cmc.i(cug.ad, 5, 1, 8, 1),
               new cmc.i(cug.rw, 1, 3, 12, 1),
               new cmc.i(cug.ri, 1, 3, 12, 1),
               new cmc.i(cug.rt, 1, 3, 12, 1),
               new cmc.i(cug.ro, 1, 3, 12, 1),
               new cmc.i(cug.rx, 1, 3, 12, 1),
               new cmc.i(cug.rv, 1, 3, 12, 1),
               new cmc.i(cug.rq, 1, 3, 12, 1),
               new cmc.i(cug.rk, 1, 3, 12, 1),
               new cmc.i(cug.rm, 1, 3, 12, 1),
               new cmc.i(cug.rp, 1, 3, 12, 1),
               new cmc.i(cug.rs, 1, 3, 12, 1),
               new cmc.i(cug.rl, 1, 3, 12, 1),
               new cmc.i(cug.rn, 1, 3, 12, 1),
               new cmc.i(cug.rj, 1, 3, 12, 1),
               new cmc.i(cug.ru, 1, 3, 12, 1),
               new cmc.i(cug.rr, 1, 3, 12, 1),
               new cmc.i(cug.kx, 3, 1, 8, 1),
               new cmc.i(cug.ky, 3, 1, 8, 1),
               new cmc.i(cug.kz, 3, 1, 8, 1),
               new cmc.i(cug.kA, 3, 1, 8, 1),
               new cmc.i(cug.kw, 3, 1, 8, 1),
               new cmc.i(cug.fV, 1, 3, 4, 1),
               new cmc.i(cug.dA, 1, 3, 4, 1),
               new cmc.i(cug.dB, 1, 3, 4, 1),
               new cmc.i(cug.gb, 1, 5, 2, 1),
               new cmc.i(cug.dQ, 1, 2, 5, 1),
               new cmc.i(cug.af, 1, 8, 8, 1),
               new cmc.i(cug.ai, 1, 4, 6, 1),
               new cmc.i(cug.xo, 1, 2, 5, 1),
               new cmc.i(cug.F, 1, 2, 5, 1),
               new cmc.i(cug.dN, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static cmc.g a(int $$0) {
      return new cmc.m(
         ImmutableMap.builder()
            .put(cmd.a, new cmc.d($$0, avz.w))
            .put(cmd.b, new cmc.d($$0, avz.x))
            .put(cmd.c, new cmc.d($$0, avz.y))
            .put(cmd.d, new cmc.d($$0, avz.z))
            .put(cmd.e, new cmc.d($$0, avz.A))
            .put(cmd.f, new cmc.d($$0, avz.B))
            .put(cmd.g, new cmc.d($$0, avz.C))
            .build()
      );
   }

   private static cmc.g a() {
      return new cmc.m(
         ImmutableMap.builder()
            .put(cmd.a, new cmc.d(30, 3, 3, avz.D))
            .put(cmd.b, new cmc.d(30, 2, 2, avz.E))
            .put(cmd.c, new cmc.d(30, 3, 3, avz.F))
            .put(cmd.d, new cmc.d(30, 3, 3, avz.G))
            .put(cmd.e, new cmc.d(30, avz.H))
            .put(cmd.f, new cmc.d(30, avz.I))
            .put(cmd.g, new cmc.d(30, 2, 2, avz.J))
            .build()
      );
   }

   private static Int2ObjectMap<cmc.g[]> a(ImmutableMap<Integer, cmc.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static dbc a(jj<cwc> $$0) {
      return new dbc(cug.sk).a($$1 -> $$1.a(kn.G, new cwe($$0)));
   }

   private static cud b(jj<cwc> $$0) {
      return cwe.a(cug.sk, $$0);
   }

   static class a implements cmc.g {
      private final cty a;
      private final int b;
      private final int c;
      private final int d;

      public a(cty $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(cty $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public dbe a(bsh $$0, ayo $$1) {
         dbc $$2 = new dbc(cug.oA, this.b);
         cud $$3 = new cud(this.a);
         if ($$3.a(awf.by)) {
            List<csx> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = cwu.a($$3, $$4);
         }

         return new dbe($$2, $$3, this.c, this.d, 0.2F);
      }

      private static csx a(ayo $$0) {
         return csx.a(csw.a($$0.a(16)));
      }
   }

   static class b implements cmc.g {
      private final dbc a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(dcf $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(dcf $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new dbc($$0.r(), $$1), $$2, $$3, $$4);
      }

      public b(dbc $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public dbe a(bsh $$0, ayo $$1) {
         return new dbe(this.a, new cud(cug.oA, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements cmc.g {
      private final Map<cmd, cty> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<cmd, cty> $$3) {
         lq.w.t().filter($$1x -> !$$3.containsKey($$1x)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + lq.w.b($$0x));
         });
         this.a = $$3;
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Nullable
      @Override
      public dbe a(bsh $$0, ayo $$1) {
         if ($$0 instanceof cma $$2) {
            dbc $$3 = new dbc(this.a.get($$2.gy().a()), this.b);
            return new dbe($$3, new cud(cug.oA), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements cmc.g {
      private final int a;
      private final awm<czm> b;
      private final int c;
      private final int d;

      public d(int $$0, awm<czm> $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, awm<czm> $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = $$3;
      }

      @Override
      public dbe a(bsh $$0, ayo $$1) {
         Optional<jj<czm>> $$2 = $$0.dR().H_().d(lr.aK).a(this.b, $$1);
         int $$9;
         cud $$8;
         if (!$$2.isEmpty()) {
            jj<czm> $$3 = $$2.get();
            czm $$4 = $$3.a();
            int $$5 = Math.max($$4.d(), this.c);
            int $$6 = Math.min($$4.e(), this.d);
            int $$7 = ayg.a($$1, $$5, $$6);
            $$8 = ctb.a(new czp($$3, $$7));
            $$9 = 2 + $$1.a(5 + $$7 * 10) + 3 * $$7;
            if ($$3.a(avz.j)) {
               $$9 *= 2;
            }

            if ($$9 > 64) {
               $$9 = 64;
            }
         } else {
            $$9 = 1;
            $$8 = new cud(cug.qP);
         }

         return new dbe(new dbc(cug.oA, $$9), Optional.of(new dbc(cug.qP)), $$8, 12, this.a, 0.2F);
      }
   }

   static class e implements cmc.g {
      private final cud a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(cty $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(cty $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new cud($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public dbe a(bsh $$0, ayo $$1) {
         int $$2 = 5 + $$1.a(15);
         jx $$3 = $$0.dR().H_();
         Optional<jn.c<czm>> $$4 = $$3.d(lr.aK).b(avz.m);
         cud $$5 = czo.a($$1, new cud(this.a.g()), $$2, $$3, $$4);
         int $$6 = Math.min(this.b + $$2, 64);
         dbc $$7 = new dbc(cug.oA, $$6);
         return new dbe($$7, $$5, this.c, this.d, this.e);
      }
   }

   static class f implements cmc.g {
      @Override
      public dbe a(bsh $$0, ayo $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      dbe a(bsh var1, ayo var2);
   }

   static class h implements cmc.g {
      private final dbc a;
      private final int b;
      private final cud c;
      private final int d;
      private final int e;
      private final float f;
      private final Optional<akj<dat>> g;

      public h(dcf $$0, int $$1, int $$2, cty $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new cud($$3), $$4, $$5, $$6, $$7);
      }

      private h(dcf $$0, int $$1, int $$2, cud $$3, int $$4, int $$5, int $$6, float $$7) {
         this(new dbc($$0, $$1), $$2, $$3.c($$4), $$5, $$6, $$7, Optional.empty());
      }

      h(dcf $$0, int $$1, int $$2, dcf $$3, int $$4, int $$5, int $$6, float $$7, akj<dat> $$8) {
         this(new dbc($$0, $$1), $$2, new cud($$3, $$4), $$5, $$6, $$7, Optional.of($$8));
      }

      public h(dbc $$0, int $$1, cud $$2, int $$3, int $$4, float $$5, Optional<akj<dat>> $$6) {
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
      public dbe a(bsh $$0, ayo $$1) {
         cud $$2 = this.c.s();
         dcg $$3 = $$0.dR();
         this.g.ifPresent($$4 -> czo.a($$2, $$3.H_(), (akj<dat>)$$4, $$3.d_($$0.dr()), $$1));
         return new dbe(new dbc(cug.oA, this.b), Optional.of(this.a), $$2, 0, this.d, this.e, this.f);
      }
   }

   static class i implements cmc.g {
      private final cud a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;
      private final Optional<akj<dat>> f;

      public i(dfi $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cud($$0), $$1, $$2, $$3, $$4);
      }

      public i(cty $$0, int $$1, int $$2, int $$3) {
         this(new cud($$0), $$1, $$2, 12, $$3);
      }

      public i(cty $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cud($$0), $$1, $$2, $$3, $$4);
      }

      public i(cud $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(cty $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new cud($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(cty $$0, int $$1, int $$2, int $$3, int $$4, float $$5, akj<dat> $$6) {
         this(new cud($$0), $$1, $$2, $$3, $$4, $$5, Optional.of($$6));
      }

      public i(cud $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this($$0, $$1, $$2, $$3, $$4, $$5, Optional.empty());
      }

      public i(cud $$0, int $$1, int $$2, int $$3, int $$4, float $$5, Optional<akj<dat>> $$6) {
         this.a = $$0;
         this.b = $$1;
         this.a.e($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
         this.f = $$6;
      }

      @Override
      public dbe a(bsh $$0, ayo $$1) {
         cud $$2 = this.a.s();
         dcg $$3 = $$0.dR();
         this.f.ifPresent($$4 -> czo.a($$2, $$3.H_(), (akj<dat>)$$4, $$3.d_($$0.dr()), $$1));
         return new dbe(new dbc(cug.oA, this.b), $$2, this.c, this.d, this.e);
      }
   }

   static class j implements cmc.g {
      private final cxg a;
      private final int b;
      private final float c;

      public j(jj<brn> $$0, int $$1, int $$2) {
         this(new cxg(List.of(new cxg.a($$0, $$1))), $$2, 0.05F);
      }

      public j(cxg $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public dbe a(bsh $$0, ayo $$1) {
         cud $$2 = new cud(cug.vX, 1);
         $$2.b(kn.H, this.a);
         return new dbe(new dbc(cug.oA), $$2, 12, this.b, this.c);
      }
   }

   static class k implements cmc.g {
      private final cud a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final cty f;
      private final int g;
      private final float h;

      public k(cty $$0, int $$1, cty $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new cud($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public dbe a(bsh $$0, ayo $$1) {
         dbc $$2 = new dbc(cug.oA, this.c);
         List<jj<cwc>> $$3 = lq.h.i().filter($$1x -> !((cwc)$$1x.a()).a().isEmpty() && $$0.dR().K().a($$1x)).collect(Collectors.toList());
         jj<cwc> $$4 = ac.a($$3, $$1);
         cud $$5 = new cud(this.a.g(), this.b);
         $$5.b(kn.G, new cwe($$4));
         return new dbe($$2, Optional.of(new dbc(this.f, this.g)), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements cmc.g {
      private final int a;
      private final awm<eix> b;
      private final String c;
      private final jj<ept> d;
      private final int e;
      private final int f;

      public l(int $$0, awm<eix> $$1, String $$2, jj<ept> $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public dbe a(bsh $$0, ayo $$1) {
         if (!($$0.dR() instanceof aqm)) {
            return null;
         } else {
            aqm $$2 = (aqm)$$0.dR();
            ja $$3 = $$2.a(this.b, $$0.dr(), 100, true);
            if ($$3 != null) {
               cud $$4 = cul.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               cul.a($$2, $$4);
               epy.a($$4, $$3, "+", this.d);
               $$4.b(kn.h, wu.c(this.c));
               return new dbe(new dbc(cug.oA, this.a), Optional.of(new dbc(cug.qS)), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static record m(Map<cmd, cmc.g> a) implements cmc.g {
      public static cmc.m a(cmc.g $$0, cmd... $$1) {
         return new cmc.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public dbe a(bsh $$0, ayo $$1) {
         if ($$0 instanceof cma $$2) {
            cmd $$3 = $$2.gy().a();
            cmc.g $$4 = this.a.get($$3);
            return $$4 == null ? null : $$4.a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
