import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class chc {
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
   public static final Map<chb, Int2ObjectMap<chc.g[]>> a = ac.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            chb.g,
            a(
               ImmutableMap.of(
                  1,
                  new chc.g[]{
                     new chc.b(cpg.pv, 20, 16, 2),
                     new chc.b(cpg.uc, 26, 16, 2),
                     new chc.b(cpg.ub, 22, 16, 2),
                     new chc.b(cpg.vg, 15, 16, 2),
                     new chc.i(cpg.pw, 1, 6, 16, 1)
                  },
                  2,
                  new chc.g[]{new chc.b(cyu.eZ, 6, 12, 10), new chc.i(cpg.up, 1, 4, 5), new chc.i(cpg.os, 1, 4, 16, 5)},
                  3,
                  new chc.g[]{new chc.i(cpg.rR, 3, 18, 10), new chc.b(cyu.fa, 4, 12, 20)},
                  4,
                  new chc.g[]{
                     new chc.i(cyu.eg, 1, 1, 12, 15),
                     new chc.j(bnf.p, 100, 15),
                     new chc.j(bnf.h, 160, 15),
                     new chc.j(bnf.r, 140, 15),
                     new chc.j(bnf.o, 120, 15),
                     new chc.j(bnf.s, 280, 15),
                     new chc.j(bnf.w, 7, 15)
                  },
                  5,
                  new chc.g[]{new chc.i(cpg.ug, 3, 3, 30), new chc.i(cpg.ss, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            chb.h,
            a(
               ImmutableMap.of(
                  1,
                  new chc.g[]{
                     new chc.b(cpg.pr, 20, 16, 2),
                     new chc.b(cpg.ov, 10, 16, 2),
                     new chc.h(cpg.qY, 6, 1, cpg.rc, 6, 16, 1, 0.05F),
                     new chc.i(cpg.qG, 3, 1, 16, 1)
                  },
                  2,
                  new chc.g[]{new chc.b(cpg.qY, 15, 16, 10), new chc.h(cpg.qZ, 6, 1, cpg.rd, 6, 16, 5, 0.05F), new chc.i(cpg.wn, 2, 1, 5)},
                  3,
                  new chc.g[]{new chc.b(cpg.qZ, 13, 16, 20), new chc.e(cpg.qU, 3, 3, 10, 0.2F)},
                  4,
                  new chc.g[]{new chc.b(cpg.ra, 6, 12, 30)},
                  5,
                  new chc.g[]{
                     new chc.b(cpg.rb, 4, 12, 30),
                     new chc.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(chd.c, cpg.nT)
                           .put(chd.g, cpg.nV)
                           .put(chd.e, cpg.nV)
                           .put(chd.a, cpg.nZ)
                           .put(chd.b, cpg.nZ)
                           .put(chd.d, cpg.ob)
                           .put(chd.f, cpg.of)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            chb.n,
            a(
               ImmutableMap.of(
                  1,
                  new chc.g[]{
                     new chc.b(cyu.bA, 18, 16, 2),
                     new chc.b(cyu.bM, 18, 16, 2),
                     new chc.b(cyu.bP, 18, 16, 2),
                     new chc.b(cyu.bH, 18, 16, 2),
                     new chc.i(cpg.rU, 2, 1, 1)
                  },
                  2,
                  new chc.g[]{
                     new chc.b(cpg.rh, 12, 16, 10),
                     new chc.b(cpg.ro, 12, 16, 10),
                     new chc.b(cpg.rw, 12, 16, 10),
                     new chc.b(cpg.rk, 12, 16, 10),
                     new chc.b(cpg.rm, 12, 16, 10),
                     new chc.i(cyu.bA, 1, 1, 16, 5),
                     new chc.i(cyu.bB, 1, 1, 16, 5),
                     new chc.i(cyu.bC, 1, 1, 16, 5),
                     new chc.i(cyu.bD, 1, 1, 16, 5),
                     new chc.i(cyu.bE, 1, 1, 16, 5),
                     new chc.i(cyu.bF, 1, 1, 16, 5),
                     new chc.i(cyu.bG, 1, 1, 16, 5),
                     new chc.i(cyu.bH, 1, 1, 16, 5),
                     new chc.i(cyu.bI, 1, 1, 16, 5),
                     new chc.i(cyu.bJ, 1, 1, 16, 5),
                     new chc.i(cyu.bK, 1, 1, 16, 5),
                     new chc.i(cyu.bL, 1, 1, 16, 5),
                     new chc.i(cyu.bM, 1, 1, 16, 5),
                     new chc.i(cyu.bN, 1, 1, 16, 5),
                     new chc.i(cyu.bO, 1, 1, 16, 5),
                     new chc.i(cyu.bP, 1, 1, 16, 5),
                     new chc.i(cyu.ik, 1, 4, 16, 5),
                     new chc.i(cyu.il, 1, 4, 16, 5),
                     new chc.i(cyu.im, 1, 4, 16, 5),
                     new chc.i(cyu.in, 1, 4, 16, 5),
                     new chc.i(cyu.io, 1, 4, 16, 5),
                     new chc.i(cyu.ip, 1, 4, 16, 5),
                     new chc.i(cyu.iq, 1, 4, 16, 5),
                     new chc.i(cyu.ir, 1, 4, 16, 5),
                     new chc.i(cyu.is, 1, 4, 16, 5),
                     new chc.i(cyu.it, 1, 4, 16, 5),
                     new chc.i(cyu.iu, 1, 4, 16, 5),
                     new chc.i(cyu.iv, 1, 4, 16, 5),
                     new chc.i(cyu.iw, 1, 4, 16, 5),
                     new chc.i(cyu.ix, 1, 4, 16, 5),
                     new chc.i(cyu.iy, 1, 4, 16, 5),
                     new chc.i(cyu.iz, 1, 4, 16, 5)
                  },
                  3,
                  new chc.g[]{
                     new chc.b(cpg.rl, 12, 16, 20),
                     new chc.b(cpg.rp, 12, 16, 20),
                     new chc.b(cpg.ri, 12, 16, 20),
                     new chc.b(cpg.rv, 12, 16, 20),
                     new chc.b(cpg.rn, 12, 16, 20),
                     new chc.i(cyu.aZ, 3, 1, 12, 10),
                     new chc.i(cyu.bd, 3, 1, 12, 10),
                     new chc.i(cyu.bn, 3, 1, 12, 10),
                     new chc.i(cyu.bo, 3, 1, 12, 10),
                     new chc.i(cyu.bk, 3, 1, 12, 10),
                     new chc.i(cyu.bl, 3, 1, 12, 10),
                     new chc.i(cyu.bi, 3, 1, 12, 10),
                     new chc.i(cyu.bg, 3, 1, 12, 10),
                     new chc.i(cyu.bm, 3, 1, 12, 10),
                     new chc.i(cyu.bc, 3, 1, 12, 10),
                     new chc.i(cyu.bh, 3, 1, 12, 10),
                     new chc.i(cyu.be, 3, 1, 12, 10),
                     new chc.i(cyu.bb, 3, 1, 12, 10),
                     new chc.i(cyu.ba, 3, 1, 12, 10),
                     new chc.i(cyu.bf, 3, 1, 12, 10),
                     new chc.i(cyu.bj, 3, 1, 12, 10)
                  },
                  4,
                  new chc.g[]{
                     new chc.b(cpg.rt, 12, 16, 30),
                     new chc.b(cpg.rr, 12, 16, 30),
                     new chc.b(cpg.rs, 12, 16, 30),
                     new chc.b(cpg.ru, 12, 16, 30),
                     new chc.b(cpg.rj, 12, 16, 30),
                     new chc.b(cpg.rq, 12, 16, 30),
                     new chc.i(cpg.uL, 3, 1, 12, 15),
                     new chc.i(cpg.uW, 3, 1, 12, 15),
                     new chc.i(cpg.uO, 3, 1, 12, 15),
                     new chc.i(cpg.uZ, 3, 1, 12, 15),
                     new chc.i(cpg.uR, 3, 1, 12, 15),
                     new chc.i(cpg.uY, 3, 1, 12, 15),
                     new chc.i(cpg.uQ, 3, 1, 12, 15),
                     new chc.i(cpg.uS, 3, 1, 12, 15),
                     new chc.i(cpg.va, 3, 1, 12, 15),
                     new chc.i(cpg.uV, 3, 1, 12, 15),
                     new chc.i(cpg.uN, 3, 1, 12, 15),
                     new chc.i(cpg.uU, 3, 1, 12, 15),
                     new chc.i(cpg.uX, 3, 1, 12, 15),
                     new chc.i(cpg.uP, 3, 1, 12, 15),
                     new chc.i(cpg.uM, 3, 1, 12, 15),
                     new chc.i(cpg.uT, 3, 1, 12, 15)
                  },
                  5,
                  new chc.g[]{new chc.i(cpg.pY, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            chb.i,
            a(
               ImmutableMap.of(
                  1,
                  new chc.g[]{new chc.b(cpg.po, 32, 16, 2), new chc.i(cpg.ou, 1, 16, 1), new chc.h(cyu.L, 10, 1, cpg.pV, 10, 12, 1, 0.05F)},
                  2,
                  new chc.g[]{new chc.b(cpg.pV, 26, 12, 10), new chc.i(cpg.ot, 2, 1, 5)},
                  3,
                  new chc.g[]{new chc.b(cpg.pr, 14, 16, 20), new chc.i(cpg.vP, 3, 1, 10)},
                  4,
                  new chc.g[]{new chc.b(cpg.ps, 24, 16, 30), new chc.e(cpg.ot, 2, 3, 15)},
                  5,
                  new chc.g[]{new chc.b(cpg.ma, 8, 12, 30), new chc.e(cpg.vP, 3, 3, 15), new chc.k(cpg.ou, 5, cpg.vm, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            chb.k,
            a(
               ImmutableMap.builder()
                  .put(1, new chc.g[]{new chc.b(cpg.qN, 24, 16, 2), new chc.d(1), new chc.i(cyu.cl, 9, 1, 12, 1)})
                  .put(2, new chc.g[]{new chc.b(cpg.qO, 4, 12, 10), new chc.d(5), new chc.i(cpg.wj, 1, 1, 5)})
                  .put(3, new chc.g[]{new chc.b(cpg.re, 5, 12, 20), new chc.d(10), new chc.i(cpg.cF, 1, 4, 10)})
                  .put(4, new chc.g[]{new chc.b(cpg.tW, 2, 12, 30), new chc.d(15), new chc.i(cpg.qV, 5, 1, 15), new chc.i(cpg.qR, 4, 1, 15)})
                  .put(5, new chc.g[]{new chc.i(cpg.uH, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            chb.e,
            a(
               ImmutableMap.of(
                  1,
                  new chc.g[]{new chc.b(cpg.qN, 24, 16, 2), new chc.i(cpg.uf, 7, 1, 1)},
                  2,
                  new chc.g[]{new chc.b(cpg.fS, 11, 16, 10), new chc.l(13, aul.d, "filled_map.monument", eid.a.j, 12, 5)},
                  3,
                  new chc.g[]{new chc.b(cpg.qR, 1, 12, 20), new chc.l(14, aul.c, "filled_map.mansion", eid.a.i, 12, 10)},
                  4,
                  new chc.g[]{
                     new chc.i(cpg.tY, 7, 1, 15),
                     new chc.i(cpg.uL, 3, 1, 15),
                     new chc.i(cpg.uW, 3, 1, 15),
                     new chc.i(cpg.uO, 3, 1, 15),
                     new chc.i(cpg.uZ, 3, 1, 15),
                     new chc.i(cpg.uR, 3, 1, 15),
                     new chc.i(cpg.uY, 3, 1, 15),
                     new chc.i(cpg.uQ, 3, 1, 15),
                     new chc.i(cpg.uS, 3, 1, 15),
                     new chc.i(cpg.va, 3, 1, 15),
                     new chc.i(cpg.uV, 3, 1, 15),
                     new chc.i(cpg.uN, 3, 1, 15),
                     new chc.i(cpg.uU, 3, 1, 15),
                     new chc.i(cpg.uX, 3, 1, 15),
                     new chc.i(cpg.uP, 3, 1, 15),
                     new chc.i(cpg.uM, 3, 1, 15),
                     new chc.i(cpg.uT, 3, 1, 15)
                  },
                  5,
                  new chc.g[]{new chc.i(cpg.vW, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            chb.f,
            a(
               ImmutableMap.of(
                  1,
                  new chc.g[]{new chc.b(cpg.sd, 32, 16, 2), new chc.i(cpg.lG, 1, 2, 1)},
                  2,
                  new chc.g[]{new chc.b(cpg.oH, 3, 12, 10), new chc.i(cpg.oz, 1, 1, 5)},
                  3,
                  new chc.g[]{new chc.b(cpg.uz, 2, 12, 20), new chc.i(cyu.ec, 4, 1, 12, 10)},
                  4,
                  new chc.g[]{new chc.b(cpg.oo, 4, 12, 30), new chc.b(cpg.sk, 9, 12, 30), new chc.i(cpg.se, 5, 1, 15)},
                  5,
                  new chc.g[]{new chc.b(cpg.si, 22, 12, 30), new chc.i(cpg.tU, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            chb.c,
            a(
               ImmutableMap.of(
                  1,
                  new chc.g[]{
                     new chc.b(cpg.ov, 15, 16, 2),
                     new chc.i(new cpd(cpg.pH), 7, 1, 12, 1, 0.2F),
                     new chc.i(new cpd(cpg.pI), 4, 1, 12, 1, 0.2F),
                     new chc.i(new cpd(cpg.pF), 5, 1, 12, 1, 0.2F),
                     new chc.i(new cpd(cpg.pG), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new chc.g[]{
                     new chc.b(cpg.oD, 4, 12, 10),
                     new chc.i(new cpd(cpg.wi), 36, 1, 12, 5, 0.2F),
                     new chc.i(new cpd(cpg.pE), 1, 1, 12, 5, 0.2F),
                     new chc.i(new cpd(cpg.pD), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new chc.g[]{
                     new chc.b(cpg.qz, 1, 12, 20),
                     new chc.b(cpg.ox, 1, 12, 20),
                     new chc.i(new cpd(cpg.pB), 1, 1, 12, 10, 0.2F),
                     new chc.i(new cpd(cpg.pC), 4, 1, 12, 10, 0.2F),
                     new chc.i(new cpd(cpg.vo), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new chc.g[]{new chc.e(cpg.pL, 14, 3, 15, 0.2F), new chc.e(cpg.pM, 8, 3, 15, 0.2F)},
                  5,
                  new chc.g[]{new chc.e(cpg.pJ, 8, 3, 30, 0.2F), new chc.e(cpg.pK, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            chb.p,
            a(
               ImmutableMap.of(
                  1,
                  new chc.g[]{new chc.b(cpg.ov, 15, 16, 2), new chc.i(new cpd(cpg.pc), 3, 1, 12, 1, 0.2F), new chc.e(cpg.oZ, 2, 3, 1)},
                  2,
                  new chc.g[]{new chc.b(cpg.oD, 4, 12, 10), new chc.i(new cpd(cpg.wi), 36, 1, 12, 5, 0.2F)},
                  3,
                  new chc.g[]{new chc.b(cpg.pV, 24, 12, 20)},
                  4,
                  new chc.g[]{new chc.b(cpg.ox, 1, 12, 30), new chc.e(cpg.ph, 12, 3, 15, 0.2F)},
                  5,
                  new chc.g[]{new chc.e(cpg.pe, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            chb.o,
            a(
               ImmutableMap.of(
                  1,
                  new chc.g[]{
                     new chc.b(cpg.ov, 15, 16, 2),
                     new chc.i(new cpd(cpg.oS), 1, 1, 12, 1, 0.2F),
                     new chc.i(new cpd(cpg.oQ), 1, 1, 12, 1, 0.2F),
                     new chc.i(new cpd(cpg.oR), 1, 1, 12, 1, 0.2F),
                     new chc.i(new cpd(cpg.oT), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new chc.g[]{new chc.b(cpg.oD, 4, 12, 10), new chc.i(new cpd(cpg.wi), 36, 1, 12, 5, 0.2F)},
                  3,
                  new chc.g[]{
                     new chc.b(cpg.pV, 30, 12, 20),
                     new chc.e(cpg.pc, 1, 3, 10, 0.2F),
                     new chc.e(cpg.pa, 2, 3, 10, 0.2F),
                     new chc.e(cpg.pb, 3, 3, 10, 0.2F),
                     new chc.i(new cpd(cpg.pi), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new chc.g[]{new chc.b(cpg.ox, 1, 12, 30), new chc.e(cpg.ph, 12, 3, 15, 0.2F), new chc.e(cpg.pf, 5, 3, 15, 0.2F)},
                  5,
                  new chc.g[]{new chc.e(cpg.pg, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            chb.d,
            a(
               ImmutableMap.of(
                  1,
                  new chc.g[]{new chc.b(cpg.sb, 14, 16, 2), new chc.b(cpg.pW, 7, 16, 2), new chc.b(cpg.uw, 4, 16, 2), new chc.i(cpg.uy, 1, 1, 1)},
                  2,
                  new chc.g[]{new chc.b(cpg.ov, 15, 16, 2), new chc.i(cpg.pX, 1, 5, 16, 5), new chc.i(cpg.sc, 1, 8, 16, 5)},
                  3,
                  new chc.g[]{new chc.b(cpg.uJ, 7, 16, 20), new chc.b(cpg.rZ, 10, 16, 20)},
                  4,
                  new chc.g[]{new chc.b(cpg.qM, 10, 12, 30)},
                  5,
                  new chc.g[]{new chc.b(cpg.wl, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            chb.j,
            a(
               ImmutableMap.of(
                  1,
                  new chc.g[]{new chc.b(cpg.qC, 6, 16, 2), new chc.a(cpg.pz, 3), new chc.a(cpg.py, 7)},
                  2,
                  new chc.g[]{new chc.b(cpg.pV, 26, 12, 10), new chc.a(cpg.px, 5, 12, 5), new chc.a(cpg.pA, 4, 12, 5)},
                  3,
                  new chc.g[]{new chc.b(cpg.uA, 9, 12, 20), new chc.a(cpg.py, 7)},
                  4,
                  new chc.g[]{new chc.b(cpg.oo, 4, 12, 30), new chc.a(cpg.uF, 6, 12, 15)},
                  5,
                  new chc.g[]{new chc.i(new cpd(cpg.nK), 6, 1, 12, 30, 0.2F), new chc.a(cpg.px, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            chb.l,
            a(
               ImmutableMap.of(
                  1,
                  new chc.g[]{new chc.b(cpg.qL, 10, 16, 2), new chc.i(cpg.qK, 1, 10, 16, 1)},
                  2,
                  new chc.g[]{new chc.b(cyu.b, 20, 16, 10), new chc.i(cyu.eK, 1, 4, 16, 5)},
                  3,
                  new chc.g[]{
                     new chc.b(cyu.c, 16, 16, 20),
                     new chc.b(cyu.g, 16, 16, 20),
                     new chc.b(cyu.e, 16, 16, 20),
                     new chc.i(cyu.su, 1, 4, 16, 10),
                     new chc.i(cyu.h, 1, 4, 16, 10),
                     new chc.i(cyu.f, 1, 4, 16, 10),
                     new chc.i(cyu.d, 1, 4, 16, 10)
                  },
                  4,
                  new chc.g[]{
                     new chc.b(cpg.oA, 12, 12, 30),
                     new chc.i(cyu.hk, 1, 1, 12, 15),
                     new chc.i(cyu.hj, 1, 1, 12, 15),
                     new chc.i(cyu.hu, 1, 1, 12, 15),
                     new chc.i(cyu.hm, 1, 1, 12, 15),
                     new chc.i(cyu.hq, 1, 1, 12, 15),
                     new chc.i(cyu.hr, 1, 1, 12, 15),
                     new chc.i(cyu.hy, 1, 1, 12, 15),
                     new chc.i(cyu.hx, 1, 1, 12, 15),
                     new chc.i(cyu.hp, 1, 1, 12, 15),
                     new chc.i(cyu.hl, 1, 1, 12, 15),
                     new chc.i(cyu.ho, 1, 1, 12, 15),
                     new chc.i(cyu.hw, 1, 1, 12, 15),
                     new chc.i(cyu.hs, 1, 1, 12, 15),
                     new chc.i(cyu.ht, 1, 1, 12, 15),
                     new chc.i(cyu.hn, 1, 1, 12, 15),
                     new chc.i(cyu.hv, 1, 1, 12, 15),
                     new chc.i(cyu.lh, 1, 1, 12, 15),
                     new chc.i(cyu.lg, 1, 1, 12, 15),
                     new chc.i(cyu.lr, 1, 1, 12, 15),
                     new chc.i(cyu.lj, 1, 1, 12, 15),
                     new chc.i(cyu.ln, 1, 1, 12, 15),
                     new chc.i(cyu.lo, 1, 1, 12, 15),
                     new chc.i(cyu.lv, 1, 1, 12, 15),
                     new chc.i(cyu.lu, 1, 1, 12, 15),
                     new chc.i(cyu.lm, 1, 1, 12, 15),
                     new chc.i(cyu.li, 1, 1, 12, 15),
                     new chc.i(cyu.ll, 1, 1, 12, 15),
                     new chc.i(cyu.lt, 1, 1, 12, 15),
                     new chc.i(cyu.lp, 1, 1, 12, 15),
                     new chc.i(cyu.lq, 1, 1, 12, 15),
                     new chc.i(cyu.lk, 1, 1, 12, 15),
                     new chc.i(cyu.ls, 1, 1, 12, 15)
                  },
                  5,
                  new chc.g[]{new chc.i(cyu.hf, 1, 1, 12, 30), new chc.i(cyu.hd, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<chc.g[]> b = a(
      ImmutableMap.of(
         1,
         new chc.g[]{
            new chc.i(cpg.cS, 2, 1, 5, 1),
            new chc.i(cpg.qP, 4, 1, 5, 1),
            new chc.i(cpg.ft, 2, 1, 5, 1),
            new chc.i(cpg.vN, 5, 1, 5, 1),
            new chc.i(cpg.cN, 1, 1, 12, 1),
            new chc.i(cpg.dI, 1, 1, 8, 1),
            new chc.i(cpg.fj, 1, 1, 4, 1),
            new chc.i(cpg.dJ, 3, 1, 12, 1),
            new chc.i(cpg.eV, 3, 1, 8, 1),
            new chc.i(cpg.dj, 1, 1, 12, 1),
            new chc.i(cpg.dk, 1, 1, 12, 1),
            new chc.i(cpg.dl, 1, 1, 8, 1),
            new chc.i(cpg.dm, 1, 1, 12, 1),
            new chc.i(cpg.dn, 1, 1, 12, 1),
            new chc.i(cpg.do, 1, 1, 12, 1),
            new chc.i(cpg.dp, 1, 1, 12, 1),
            new chc.i(cpg.dq, 1, 1, 12, 1),
            new chc.i(cpg.dr, 1, 1, 12, 1),
            new chc.i(cpg.ds, 1, 1, 12, 1),
            new chc.i(cpg.dt, 1, 1, 12, 1),
            new chc.i(cpg.du, 1, 1, 7, 1),
            new chc.i(cpg.pu, 1, 1, 12, 1),
            new chc.i(cpg.vh, 1, 1, 12, 1),
            new chc.i(cpg.rX, 1, 1, 12, 1),
            new chc.i(cpg.rY, 1, 1, 12, 1),
            new chc.i(cpg.aa, 5, 1, 8, 1),
            new chc.i(cpg.Y, 5, 1, 8, 1),
            new chc.i(cpg.ac, 5, 1, 8, 1),
            new chc.i(cpg.Z, 5, 1, 8, 1),
            new chc.i(cpg.W, 5, 1, 8, 1),
            new chc.i(cpg.X, 5, 1, 8, 1),
            new chc.i(cpg.ab, 5, 1, 8, 1),
            new chc.i(cpg.ad, 5, 1, 8, 1),
            new chc.i(cpg.rv, 1, 3, 12, 1),
            new chc.i(cpg.rh, 1, 3, 12, 1),
            new chc.i(cpg.rs, 1, 3, 12, 1),
            new chc.i(cpg.rn, 1, 3, 12, 1),
            new chc.i(cpg.rw, 1, 3, 12, 1),
            new chc.i(cpg.ru, 1, 3, 12, 1),
            new chc.i(cpg.rp, 1, 3, 12, 1),
            new chc.i(cpg.rj, 1, 3, 12, 1),
            new chc.i(cpg.rl, 1, 3, 12, 1),
            new chc.i(cpg.ro, 1, 3, 12, 1),
            new chc.i(cpg.rr, 1, 3, 12, 1),
            new chc.i(cpg.rk, 1, 3, 12, 1),
            new chc.i(cpg.rm, 1, 3, 12, 1),
            new chc.i(cpg.ri, 1, 3, 12, 1),
            new chc.i(cpg.rt, 1, 3, 12, 1),
            new chc.i(cpg.rq, 1, 3, 12, 1),
            new chc.i(cpg.kw, 3, 1, 8, 1),
            new chc.i(cpg.kx, 3, 1, 8, 1),
            new chc.i(cpg.ky, 3, 1, 8, 1),
            new chc.i(cpg.kz, 3, 1, 8, 1),
            new chc.i(cpg.kv, 3, 1, 8, 1),
            new chc.i(cpg.fU, 1, 1, 12, 1),
            new chc.i(cpg.dz, 1, 1, 12, 1),
            new chc.i(cpg.dA, 1, 1, 12, 1),
            new chc.i(cpg.ga, 1, 2, 5, 1),
            new chc.i(cpg.dP, 1, 2, 5, 1),
            new chc.i(cpg.af, 1, 8, 8, 1),
            new chc.i(cpg.ai, 1, 4, 6, 1),
            new chc.i(cpg.xf, 1, 2, 5, 1),
            new chc.i(cpg.F, 1, 2, 5, 1),
            new chc.i(cpg.dM, 1, 2, 5, 1)
         },
         2,
         new chc.g[]{
            new chc.i(cpg.qH, 5, 1, 4, 1),
            new chc.i(cpg.qE, 5, 1, 4, 1),
            new chc.i(cpg.hU, 3, 1, 6, 1),
            new chc.i(cpg.kU, 6, 1, 6, 1),
            new chc.i(cpg.pt, 1, 1, 8, 1),
            new chc.i(cpg.E, 3, 3, 6, 1)
         }
      )
   );
   private static final chc.l s = new chc.l(8, aul.f, "filled_map.village_desert", eid.a.B, 12, 5);
   private static final chc.l t = new chc.l(8, aul.e, "filled_map.village_savanna", eid.a.D, 12, 5);
   private static final chc.l u = new chc.l(8, aul.g, "filled_map.village_plains", eid.a.C, 12, 5);
   private static final chc.l v = new chc.l(8, aul.h, "filled_map.village_taiga", eid.a.F, 12, 5);
   private static final chc.l w = new chc.l(8, aul.i, "filled_map.village_snowy", eid.a.E, 12, 5);
   private static final chc.l x = new chc.l(8, aul.j, "filled_map.explorer_jungle", eid.a.G, 12, 5);
   private static final chc.l y = new chc.l(8, aul.k, "filled_map.explorer_swamp", eid.a.H, 12, 5);
   public static final Map<chb, Int2ObjectMap<chc.g[]>> c = Map.of(
      chb.k,
      a(
         ImmutableMap.builder()
            .put(1, new chc.g[]{new chc.b(cpg.qN, 24, 16, 2), a(1), new chc.i(cyu.cl, 9, 1, 12, 1)})
            .put(2, new chc.g[]{new chc.b(cpg.qO, 4, 12, 10), a(5), new chc.i(cpg.wj, 1, 1, 5)})
            .put(3, new chc.g[]{new chc.b(cpg.re, 5, 12, 20), a(10), new chc.i(cpg.cF, 1, 4, 10)})
            .put(4, new chc.g[]{new chc.b(cpg.tW, 2, 12, 30), new chc.i(cpg.qV, 5, 1, 15), new chc.i(cpg.qR, 4, 1, 15)})
            .put(5, new chc.g[]{a(), new chc.i(cpg.uH, 20, 1, 30)})
            .build()
      ),
      chb.c,
      a(
         ImmutableMap.builder()
            .put(1, new chc.g[]{new chc.b(cpg.ov, 15, 12, 2), new chc.b(cpg.oD, 5, 12, 2)})
            .put(
               2,
               new chc.g[]{
                  chc.m.a(new chc.i(cpg.pI, 4, 1, 12, 5, 0.05F), chd.a, chd.c, chd.d, chd.e, chd.g),
                  chc.m.a(new chc.i(cpg.pE, 4, 1, 12, 5, 0.05F), chd.b, chd.f),
                  chc.m.a(new chc.i(cpg.pF, 5, 1, 12, 5, 0.05F), chd.a, chd.c, chd.d, chd.e, chd.g),
                  chc.m.a(new chc.i(cpg.pB, 5, 1, 12, 5, 0.05F), chd.b, chd.f),
                  chc.m.a(new chc.i(cpg.pH, 7, 1, 12, 5, 0.05F), chd.a, chd.c, chd.d, chd.e, chd.g),
                  chc.m.a(new chc.i(cpg.pD, 7, 1, 12, 5, 0.05F), chd.b, chd.f),
                  chc.m.a(new chc.i(cpg.pG, 9, 1, 12, 5, 0.05F), chd.a, chd.c, chd.d, chd.e, chd.g),
                  chc.m.a(new chc.i(cpg.pC, 9, 1, 12, 5, 0.05F), chd.b, chd.f)
               }
            )
            .put(3, new chc.g[]{new chc.b(cpg.qz, 1, 12, 20), new chc.i(cpg.vo, 5, 1, 12, 10, 0.05F), new chc.i(cpg.wi, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new chc.g[]{
                  chc.m.a(new chc.i(a(cpg.pI, ctp.h, 1), 8, 1, 3, 15, 0.05F), chd.a),
                  chc.m.a(new chc.i(a(cpg.pF, ctp.h, 1), 9, 1, 3, 15, 0.05F), chd.a),
                  chc.m.a(new chc.i(a(cpg.pH, ctp.h, 1), 11, 1, 3, 15, 0.05F), chd.a),
                  chc.m.a(new chc.i(a(cpg.pG, ctp.h, 1), 13, 1, 3, 15, 0.05F), chd.a),
                  chc.m.a(new chc.i(a(cpg.pI, ctp.a, 1), 8, 1, 3, 15, 0.05F), chd.c),
                  chc.m.a(new chc.i(a(cpg.pF, ctp.a, 1), 9, 1, 3, 15, 0.05F), chd.c),
                  chc.m.a(new chc.i(a(cpg.pH, ctp.a, 1), 11, 1, 3, 15, 0.05F), chd.c),
                  chc.m.a(new chc.i(a(cpg.pG, ctp.a, 1), 13, 1, 3, 15, 0.05F), chd.c),
                  chc.m.a(new chc.i(a(cpg.pI, ctp.k, 1), 2, 1, 3, 15, 0.05F), chd.d),
                  chc.m.a(new chc.i(a(cpg.pF, ctp.k, 1), 3, 1, 3, 15, 0.05F), chd.d),
                  chc.m.a(new chc.i(a(cpg.pH, ctp.k, 1), 5, 1, 3, 15, 0.05F), chd.d),
                  chc.m.a(new chc.i(a(cpg.pG, ctp.k, 1), 7, 1, 3, 15, 0.05F), chd.d),
                  chc.m.a(new chc.i(a(cpg.pI, ctp.j, 1), 8, 1, 3, 15, 0.05F), chd.e),
                  chc.m.a(new chc.i(a(cpg.pF, ctp.g, 1), 9, 1, 3, 15, 0.05F), chd.e),
                  chc.m.a(new chc.i(a(cpg.pE, ctp.w, 1), 8, 1, 3, 15, 0.05F), chd.b),
                  chc.m.a(new chc.i(a(cpg.pB, ctp.w, 1), 9, 1, 3, 15, 0.05F), chd.b),
                  chc.m.a(new chc.i(a(cpg.pD, ctp.w, 1), 11, 1, 3, 15, 0.05F), chd.b),
                  chc.m.a(new chc.i(a(cpg.pC, ctp.w, 1), 13, 1, 3, 15, 0.05F), chd.b),
                  chc.m.a(new chc.i(a(cpg.pE, ctp.L, 1), 8, 1, 3, 15, 0.05F), chd.f),
                  chc.m.a(new chc.i(a(cpg.pB, ctp.L, 1), 9, 1, 3, 15, 0.05F), chd.f),
                  chc.m.a(new chc.i(a(cpg.pD, ctp.L, 1), 11, 1, 3, 15, 0.05F), chd.f),
                  chc.m.a(new chc.i(a(cpg.pC, ctp.L, 1), 13, 1, 3, 15, 0.05F), chd.f),
                  chc.m.a(new chc.h(cpg.pM, 1, 4, cpg.pL, 1, 3, 15, 0.05F, true), chd.g),
                  chc.m.a(new chc.h(cpg.pL, 1, 4, cpg.pK, 1, 3, 15, 0.05F, true), chd.g),
                  chc.m.a(new chc.h(cpg.pJ, 1, 4, cpg.pM, 1, 3, 15, 0.05F, true), chd.g),
                  chc.m.a(new chc.h(cpg.pK, 1, 2, cpg.pJ, 1, 3, 15, 0.05F, true), chd.g)
               }
            )
            .put(
               5,
               new chc.g[]{
                  chc.m.a(new chc.h(cpg.ox, 4, 16, a(cpg.pK, ctp.h, 1), 1, 3, 30, 0.05F), chd.a),
                  chc.m.a(new chc.h(cpg.ox, 3, 16, a(cpg.pL, ctp.h, 1), 1, 3, 30, 0.05F), chd.a),
                  chc.m.a(new chc.h(cpg.ox, 3, 16, a(cpg.pL, ctp.a, 1), 1, 3, 30, 0.05F), chd.c),
                  chc.m.a(new chc.h(cpg.ox, 2, 12, a(cpg.pM, ctp.a, 1), 1, 3, 30, 0.05F), chd.c),
                  chc.m.a(new chc.h(cpg.ox, 2, 6, a(cpg.pJ, ctp.k, 1), 1, 3, 30, 0.05F), chd.d),
                  chc.m.a(new chc.h(cpg.ox, 3, 8, a(cpg.pK, ctp.k, 1), 1, 3, 30, 0.05F), chd.d),
                  chc.m.a(new chc.h(cpg.ox, 2, 12, a(cpg.pM, ctp.j, 1), 1, 3, 30, 0.05F), chd.e),
                  chc.m.a(new chc.h(cpg.ox, 3, 12, a(cpg.pJ, ctp.g, 1), 1, 3, 30, 0.05F), chd.e),
                  chc.m.a(new chc.i(a(cpg.pB, ctp.e, 1), 9, 1, 3, 30, 0.05F), chd.b),
                  chc.m.a(new chc.i(a(cpg.pE, ctp.c, 1), 8, 1, 3, 30, 0.05F), chd.b),
                  chc.m.a(new chc.i(a(cpg.pB, ctp.f, 1), 9, 1, 3, 30, 0.05F), chd.f),
                  chc.m.a(new chc.i(a(cpg.pE, ctp.i, 1), 8, 1, 3, 30, 0.05F), chd.f),
                  chc.m.a(new chc.h(cpg.ox, 4, 18, a(cpg.pK, ctp.d, 1), 1, 3, 30, 0.05F), chd.g),
                  chc.m.a(new chc.h(cpg.ox, 3, 18, a(cpg.pL, ctp.d, 1), 1, 3, 30, 0.05F), chd.g),
                  chc.m.a(new chc.b(cpg.aM, 1, 12, 30, 42), chd.g),
                  chc.m.a(new chc.b(cpg.aJ, 1, 12, 30, 4), chd.a, chd.b, chd.c, chd.d, chd.e, chd.f)
               }
            )
            .build()
      ),
      chb.e,
      a(
         ImmutableMap.of(
            1,
            new chc.g[]{new chc.b(cpg.qN, 24, 16, 2), new chc.i(cpg.uf, 7, 1, 1)},
            2,
            new chc.g[]{
               new chc.b(cpg.fS, 11, 16, 10),
               new chc.m(ImmutableMap.builder().put(chd.a, t).put(chd.d, u).put(chd.c, v).put(chd.g, w).put(chd.e, u).put(chd.b, t).put(chd.f, w).build()),
               new chc.m(ImmutableMap.builder().put(chd.a, u).put(chd.d, s).put(chd.c, t).put(chd.g, u).put(chd.e, v).put(chd.b, s).put(chd.f, v).build()),
               new chc.m(
                  ImmutableMap.builder().put(chd.a, x).put(chd.d, x).put(chd.c, new chc.f()).put(chd.g, y).put(chd.e, y).put(chd.b, y).put(chd.f, x).build()
               )
            },
            3,
            new chc.g[]{new chc.b(cpg.qR, 1, 12, 20), new chc.l(13, aul.d, "filled_map.monument", eid.a.j, 12, 10)},
            4,
            new chc.g[]{
               new chc.i(cpg.tY, 7, 1, 15),
               new chc.i(cpg.uL, 3, 1, 15),
               new chc.i(cpg.uW, 3, 1, 15),
               new chc.i(cpg.uO, 3, 1, 15),
               new chc.i(cpg.uZ, 3, 1, 15),
               new chc.i(cpg.uR, 3, 1, 15),
               new chc.i(cpg.uY, 3, 1, 15),
               new chc.i(cpg.uQ, 3, 1, 15),
               new chc.i(cpg.uS, 3, 1, 15),
               new chc.i(cpg.va, 3, 1, 15),
               new chc.i(cpg.uV, 3, 1, 15),
               new chc.i(cpg.uN, 3, 1, 15),
               new chc.i(cpg.uU, 3, 1, 15),
               new chc.i(cpg.uX, 3, 1, 15),
               new chc.i(cpg.uP, 3, 1, 15),
               new chc.i(cpg.uM, 3, 1, 15),
               new chc.i(cpg.uT, 3, 1, 15)
            },
            5,
            new chc.g[]{new chc.i(cpg.vW, 8, 1, 30), new chc.l(14, aul.c, "filled_map.mansion", eid.a.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<chc.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new chc.g[]{
               new chc.b(a(crc.c), 1, 1, 1),
               new chc.b(cpg.qy, 1, 1, 1, 2),
               new chc.b(cpg.qD, 1, 1, 1, 2),
               new chc.b(cpg.sm, 1, 1, 1, 3),
               new chc.b(cpg.ud, 4, 1, 1),
               new chc.b(cpg.hC, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new chc.g[]{
               new chc.i(cpg.hU, 1, 1, 6, 1),
               new chc.i(cpg.kU, 6, 1, 6, 1),
               new chc.i(cpg.pt, 1, 4, 2, 1),
               new chc.i(cpg.E, 3, 3, 6, 1),
               new chc.i(cyu.Y, 1, 8, 4, 1),
               new chc.i(cyu.W, 1, 8, 4, 1),
               new chc.i(cyu.aa, 1, 8, 4, 1),
               new chc.i(cyu.X, 1, 8, 4, 1),
               new chc.i(cyu.U, 1, 8, 4, 1),
               new chc.i(cyu.V, 1, 8, 4, 1),
               new chc.i(cyu.Z, 1, 8, 4, 1),
               new chc.e(cpg.pb, 1, 1, 1, 0.2F),
               new chc.i(a(crc.j), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new chc.g[]{
               new chc.i(cpg.qH, 3, 1, 4, 1),
               new chc.i(cpg.qE, 3, 1, 4, 1),
               new chc.i(cpg.cS, 2, 1, 5, 1),
               new chc.i(cpg.qP, 4, 1, 5, 1),
               new chc.i(cpg.ft, 2, 1, 5, 1),
               new chc.i(cpg.vN, 5, 1, 5, 1),
               new chc.i(cpg.cN, 1, 1, 12, 1),
               new chc.i(cpg.dI, 1, 1, 8, 1),
               new chc.i(cpg.fj, 1, 1, 4, 1),
               new chc.i(cpg.dJ, 3, 1, 12, 1),
               new chc.i(cpg.eV, 3, 1, 8, 1),
               new chc.i(cpg.dj, 1, 1, 12, 1),
               new chc.i(cpg.dk, 1, 1, 12, 1),
               new chc.i(cpg.dl, 1, 1, 8, 1),
               new chc.i(cpg.dm, 1, 1, 12, 1),
               new chc.i(cpg.dn, 1, 1, 12, 1),
               new chc.i(cpg.do, 1, 1, 12, 1),
               new chc.i(cpg.dp, 1, 1, 12, 1),
               new chc.i(cpg.dq, 1, 1, 12, 1),
               new chc.i(cpg.dr, 1, 1, 12, 1),
               new chc.i(cpg.ds, 1, 1, 12, 1),
               new chc.i(cpg.dt, 1, 1, 12, 1),
               new chc.i(cpg.du, 1, 1, 7, 1),
               new chc.i(cpg.pu, 1, 1, 12, 1),
               new chc.i(cpg.vh, 1, 1, 12, 1),
               new chc.i(cpg.rX, 1, 1, 12, 1),
               new chc.i(cpg.rY, 1, 1, 12, 1),
               new chc.i(cpg.aa, 5, 1, 8, 1),
               new chc.i(cpg.Y, 5, 1, 8, 1),
               new chc.i(cpg.ac, 5, 1, 8, 1),
               new chc.i(cpg.Z, 5, 1, 8, 1),
               new chc.i(cpg.W, 5, 1, 8, 1),
               new chc.i(cpg.X, 5, 1, 8, 1),
               new chc.i(cpg.ab, 5, 1, 8, 1),
               new chc.i(cpg.ad, 5, 1, 8, 1),
               new chc.i(cpg.rv, 1, 3, 12, 1),
               new chc.i(cpg.rh, 1, 3, 12, 1),
               new chc.i(cpg.rs, 1, 3, 12, 1),
               new chc.i(cpg.rn, 1, 3, 12, 1),
               new chc.i(cpg.rw, 1, 3, 12, 1),
               new chc.i(cpg.ru, 1, 3, 12, 1),
               new chc.i(cpg.rp, 1, 3, 12, 1),
               new chc.i(cpg.rj, 1, 3, 12, 1),
               new chc.i(cpg.rl, 1, 3, 12, 1),
               new chc.i(cpg.ro, 1, 3, 12, 1),
               new chc.i(cpg.rr, 1, 3, 12, 1),
               new chc.i(cpg.rk, 1, 3, 12, 1),
               new chc.i(cpg.rm, 1, 3, 12, 1),
               new chc.i(cpg.ri, 1, 3, 12, 1),
               new chc.i(cpg.rt, 1, 3, 12, 1),
               new chc.i(cpg.rq, 1, 3, 12, 1),
               new chc.i(cpg.kw, 3, 1, 8, 1),
               new chc.i(cpg.kx, 3, 1, 8, 1),
               new chc.i(cpg.ky, 3, 1, 8, 1),
               new chc.i(cpg.kz, 3, 1, 8, 1),
               new chc.i(cpg.kv, 3, 1, 8, 1),
               new chc.i(cpg.fU, 1, 3, 4, 1),
               new chc.i(cpg.dz, 1, 3, 4, 1),
               new chc.i(cpg.dA, 1, 3, 4, 1),
               new chc.i(cpg.ga, 1, 5, 2, 1),
               new chc.i(cpg.dP, 1, 2, 5, 1),
               new chc.i(cpg.af, 1, 8, 8, 1),
               new chc.i(cpg.ai, 1, 4, 6, 1),
               new chc.i(cpg.xf, 1, 2, 5, 1),
               new chc.i(cpg.F, 1, 2, 5, 1),
               new chc.i(cpg.dM, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static chc.g a(int $$0) {
      return new chc.m(
         ImmutableMap.builder()
            .put(chd.a, new chc.d($$0, ctp.b, ctp.h, ctp.B))
            .put(chd.b, new chc.d($$0, ctp.c, ctp.e, ctp.y))
            .put(chd.c, new chc.d($$0, ctp.z, ctp.o, ctp.p))
            .put(chd.d, new chc.d($$0, ctp.q, ctp.k, ctp.t))
            .put(chd.e, new chc.d($$0, ctp.g, ctp.s, ctp.j))
            .put(chd.f, new chc.d($$0, ctp.i, ctp.f, ctp.M))
            .put(chd.g, new chc.d($$0, ctp.d, ctp.r, ctp.A))
            .build()
      );
   }

   private static chc.g a() {
      return new chc.m(
         ImmutableMap.builder()
            .put(chd.a, new chc.d(30, 3, 3, ctp.u))
            .put(chd.b, new chc.d(30, 2, 2, ctp.w))
            .put(chd.c, new chc.d(30, 3, 3, ctp.a))
            .put(chd.d, new chc.d(30, 3, 3, ctp.n))
            .put(chd.e, new chc.d(30, ctp.v))
            .put(chd.f, new chc.d(30, ctp.L))
            .put(chd.g, new chc.d(30, 2, 2, ctp.x))
            .build()
      );
   }

   private static Int2ObjectMap<chc.g[]> a(ImmutableMap<Integer, chc.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static cpd a(ij<cqz> $$0) {
      return crb.a(new cpd(cpg.sj), $$0);
   }

   private static cpd a(coy $$0, ctm $$1, int $$2) {
      cpd $$3 = new cpd($$0);
      $$3.a($$1, $$2);
      return $$3;
   }

   static class a implements chc.g {
      private final coy a;
      private final int b;
      private final int c;
      private final int d;

      public a(coy $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(coy $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public cup a(bnq $$0, awp $$1) {
         cpd $$2 = new cpd(cpg.oy, this.b);
         cpd $$3 = new cpd(this.a);
         if (this.a instanceof cnu) {
            List<cns> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = cnv.a($$3, $$4);
         }

         return new cup($$2, $$3, this.c, this.d, 0.2F);
      }

      private static cns a(awp $$0) {
         return cns.a(cnr.a($$0.a(16)));
      }
   }

   static class b implements chc.g {
      private final cpd a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(cvq $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(cvq $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cpd($$0.j(), $$1), $$2, $$3, $$4);
      }

      public b(cpd $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public cup a(bnq $$0, awp $$1) {
         return new cup(this.a.q(), new cpd(cpg.oy, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements chc.g {
      private final Map<chd, coy> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<chd, coy> $$3) {
         kf.y.s().filter($$1x -> !$$3.containsKey($$1x)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + kf.y.b($$0x));
         });
         this.a = $$3;
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Nullable
      @Override
      public cup a(bnq $$0, awp $$1) {
         if ($$0 instanceof cha $$2) {
            cpd $$3 = new cpd(this.a.get($$2.gr().a()), this.b);
            return new cup($$3, new cpd(cpg.oy), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements chc.g {
      private final int a;
      private final List<ctm> b;
      private final int c;
      private final int d;

      public d(int $$0) {
         this($$0, kf.f.s().filter(ctm::i).toArray(ctm[]::new));
      }

      public d(int $$0, ctm... $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, ctm... $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = Arrays.asList($$3);
      }

      @Override
      public cup a(bnq $$0, awp $$1) {
         ctm $$2 = this.b.get($$1.a(this.b.size()));
         int $$3 = Math.max($$2.f(), this.c);
         int $$4 = Math.min($$2.a(), this.d);
         int $$5 = awi.a($$1, $$3, $$4);
         cpd $$6 = cnz.a(new cto($$2, $$5));
         int $$7 = 2 + $$1.a(5 + $$5 * 10) + 3 * $$5;
         if ($$2.b()) {
            $$7 *= 2;
         }

         if ($$7 > 64) {
            $$7 = 64;
         }

         return new cup(new cpd(cpg.oy, $$7), new cpd(cpg.qO), $$6, 12, this.a, 0.2F);
      }
   }

   static class e implements chc.g {
      private final cpd a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(coy $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(coy $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new cpd($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public cup a(bnq $$0, awp $$1) {
         int $$2 = 5 + $$1.a(15);
         cpd $$3 = ctn.a($$1, new cpd(this.a.d()), $$2, false);
         int $$4 = Math.min(this.b + $$2, 64);
         cpd $$5 = new cpd(cpg.oy, $$4);
         return new cup($$5, $$3, this.c, this.d, this.e);
      }
   }

   static class f implements chc.g {
      @Override
      public cup a(bnq $$0, awp $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      cup a(bnq var1, awp var2);
   }

   static class h implements chc.g {
      private final cpd a;
      private final int b;
      private final cpd c;
      private final int d;
      private final int e;
      private final float f;
      private final boolean g;

      public h(cvq $$0, int $$1, int $$2, coy $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new cpd($$3), $$4, $$5, $$6, $$7, false);
      }

      public h(cvq $$0, int $$1, int $$2, coy $$3, int $$4, int $$5, int $$6, float $$7, boolean $$8) {
         this($$0, $$1, $$2, new cpd($$3), $$4, $$5, $$6, $$7, $$8);
      }

      public h(cvq $$0, int $$1, int $$2, cpd $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, false);
      }

      private h(cvq $$0, int $$1, int $$2, cpd $$3, int $$4, int $$5, int $$6, float $$7, boolean $$8) {
         this.a = new cpd($$0, $$1);
         this.b = $$2;
         this.c = $$3.c($$4);
         this.d = $$5;
         this.e = $$6;
         this.f = $$7;
         this.g = $$8;
      }

      @Nullable
      @Override
      public cup a(bnq $$0, awp $$1) {
         return new cup(new cpd(cpg.oy, this.b), this.a.q(), this.c.q(), 0, this.d, this.e, this.f, 0, this.g);
      }
   }

   static class i implements chc.g {
      private final cpd a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public i(cys $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cpd($$0), $$1, $$2, $$3, $$4);
      }

      public i(coy $$0, int $$1, int $$2, int $$3) {
         this(new cpd($$0), $$1, $$2, 12, $$3);
      }

      public i(coy $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cpd($$0), $$1, $$2, $$3, $$4);
      }

      public i(cpd $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(coy $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new cpd($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(cpd $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.a.f($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
      }

      @Override
      public cup a(bnq $$0, awp $$1) {
         return new cup(new cpd(cpg.oy, this.b), this.a.q(), this.c, this.d, this.e);
      }
   }

   static class j implements chc.g {
      private final List<dgt.a> a;
      private final int b;
      private final float c;

      public j(ij<bnb> $$0, int $$1, int $$2) {
         this(List.of(new dgt.a($$0, $$1)), $$2, 0.05F);
      }

      public j(List<dgt.a> $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public cup a(bnq $$0, awp $$1) {
         cpd $$2 = new cpd(cpg.vQ, 1);
         cqn.a($$2, this.a);
         return new cup(new cpd(cpg.oy, 1), $$2, 12, this.b, this.c);
      }
   }

   static class k implements chc.g {
      private final cpd a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final coy f;
      private final int g;
      private final float h;

      public k(coy $$0, int $$1, coy $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new cpd($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public cup a(bnq $$0, awp $$1) {
         cpd $$2 = new cpd(cpg.oy, this.c);
         List<ij<cqz>> $$3 = kf.i.h().filter($$0x -> !((cqz)$$0x.a()).a().isEmpty() && cra.a($$0x)).collect(Collectors.toList());
         ij<cqz> $$4 = ac.a($$3, $$1);
         cpd $$5 = crb.a(new cpd(this.a.d(), this.b), $$4);
         return new cup($$2, new cpd(this.f, this.g), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements chc.g {
      private final int a;
      private final aup<ebl> b;
      private final String c;
      private final eid.a d;
      private final int e;
      private final int f;

      public l(int $$0, aup<ebl> $$1, String $$2, eid.a $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public cup a(bnq $$0, awp $$1) {
         if (!($$0.dM() instanceof aow)) {
            return null;
         } else {
            aow $$2 = (aow)$$0.dM();
            hz $$3 = $$2.a(this.b, $$0.dm(), 100, true);
            if ($$3 != null) {
               cpd $$4 = cpk.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               cpk.a($$2, $$4);
               eig.a($$4, $$3, "+", this.d);
               $$4.a(vq.c(this.c));
               return new cup(new cpd(cpg.oy, this.a), new cpd(cpg.qR), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static record m(Map<chd, chc.g> a) implements chc.g {
      public static chc.m a(chc.g $$0, chd... $$1) {
         return new chc.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public cup a(bnq $$0, awp $$1) {
         if ($$0 instanceof cha $$2) {
            chd $$3 = $$2.gr().a();
            chc.g $$4 = this.a.get($$3);
            return $$4 == null ? null : $$4.a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
