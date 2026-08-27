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

public class cfh {
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
   public static final Map<cfg, Int2ObjectMap<cfh.g[]>> a = ac.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            cfg.g,
            a(
               ImmutableMap.of(
                  1,
                  new cfh.g[]{
                     new cfh.b(cnj.pv, 20, 16, 2),
                     new cfh.b(cnj.uc, 26, 16, 2),
                     new cfh.b(cnj.ub, 22, 16, 2),
                     new cfh.b(cnj.vg, 15, 16, 2),
                     new cfh.i(cnj.pw, 1, 6, 16, 1)
                  },
                  2,
                  new cfh.g[]{new cfh.b(cxa.eZ, 6, 12, 10), new cfh.i(cnj.up, 1, 4, 5), new cfh.i(cnj.os, 1, 4, 16, 5)},
                  3,
                  new cfh.g[]{new cfh.i(cnj.rR, 3, 18, 10), new cfh.b(cxa.fa, 4, 12, 20)},
                  4,
                  new cfh.g[]{
                     new cfh.i(cxa.eg, 1, 1, 12, 15),
                     new cfh.j(bll.p, 100, 15),
                     new cfh.j(bll.h, 160, 15),
                     new cfh.j(bll.r, 140, 15),
                     new cfh.j(bll.o, 120, 15),
                     new cfh.j(bll.s, 280, 15),
                     new cfh.j(bll.w, 7, 15)
                  },
                  5,
                  new cfh.g[]{new cfh.i(cnj.ug, 3, 3, 30), new cfh.i(cnj.ss, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            cfg.h,
            a(
               ImmutableMap.of(
                  1,
                  new cfh.g[]{
                     new cfh.b(cnj.pr, 20, 16, 2),
                     new cfh.b(cnj.ov, 10, 16, 2),
                     new cfh.h(cnj.qY, 6, 1, cnj.rc, 6, 16, 1, 0.05F),
                     new cfh.i(cnj.qG, 3, 1, 16, 1)
                  },
                  2,
                  new cfh.g[]{new cfh.b(cnj.qY, 15, 16, 10), new cfh.h(cnj.qZ, 6, 1, cnj.rd, 6, 16, 5, 0.05F), new cfh.i(cnj.wn, 2, 1, 5)},
                  3,
                  new cfh.g[]{new cfh.b(cnj.qZ, 13, 16, 20), new cfh.e(cnj.qU, 3, 3, 10, 0.2F)},
                  4,
                  new cfh.g[]{new cfh.b(cnj.ra, 6, 12, 30)},
                  5,
                  new cfh.g[]{
                     new cfh.b(cnj.rb, 4, 12, 30),
                     new cfh.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(cfi.c, cnj.nT)
                           .put(cfi.g, cnj.nV)
                           .put(cfi.e, cnj.nV)
                           .put(cfi.a, cnj.nZ)
                           .put(cfi.b, cnj.nZ)
                           .put(cfi.d, cnj.ob)
                           .put(cfi.f, cnj.of)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            cfg.n,
            a(
               ImmutableMap.of(
                  1,
                  new cfh.g[]{
                     new cfh.b(cxa.bA, 18, 16, 2),
                     new cfh.b(cxa.bM, 18, 16, 2),
                     new cfh.b(cxa.bP, 18, 16, 2),
                     new cfh.b(cxa.bH, 18, 16, 2),
                     new cfh.i(cnj.rU, 2, 1, 1)
                  },
                  2,
                  new cfh.g[]{
                     new cfh.b(cnj.rh, 12, 16, 10),
                     new cfh.b(cnj.ro, 12, 16, 10),
                     new cfh.b(cnj.rw, 12, 16, 10),
                     new cfh.b(cnj.rk, 12, 16, 10),
                     new cfh.b(cnj.rm, 12, 16, 10),
                     new cfh.i(cxa.bA, 1, 1, 16, 5),
                     new cfh.i(cxa.bB, 1, 1, 16, 5),
                     new cfh.i(cxa.bC, 1, 1, 16, 5),
                     new cfh.i(cxa.bD, 1, 1, 16, 5),
                     new cfh.i(cxa.bE, 1, 1, 16, 5),
                     new cfh.i(cxa.bF, 1, 1, 16, 5),
                     new cfh.i(cxa.bG, 1, 1, 16, 5),
                     new cfh.i(cxa.bH, 1, 1, 16, 5),
                     new cfh.i(cxa.bI, 1, 1, 16, 5),
                     new cfh.i(cxa.bJ, 1, 1, 16, 5),
                     new cfh.i(cxa.bK, 1, 1, 16, 5),
                     new cfh.i(cxa.bL, 1, 1, 16, 5),
                     new cfh.i(cxa.bM, 1, 1, 16, 5),
                     new cfh.i(cxa.bN, 1, 1, 16, 5),
                     new cfh.i(cxa.bO, 1, 1, 16, 5),
                     new cfh.i(cxa.bP, 1, 1, 16, 5),
                     new cfh.i(cxa.ik, 1, 4, 16, 5),
                     new cfh.i(cxa.il, 1, 4, 16, 5),
                     new cfh.i(cxa.im, 1, 4, 16, 5),
                     new cfh.i(cxa.in, 1, 4, 16, 5),
                     new cfh.i(cxa.io, 1, 4, 16, 5),
                     new cfh.i(cxa.ip, 1, 4, 16, 5),
                     new cfh.i(cxa.iq, 1, 4, 16, 5),
                     new cfh.i(cxa.ir, 1, 4, 16, 5),
                     new cfh.i(cxa.is, 1, 4, 16, 5),
                     new cfh.i(cxa.it, 1, 4, 16, 5),
                     new cfh.i(cxa.iu, 1, 4, 16, 5),
                     new cfh.i(cxa.iv, 1, 4, 16, 5),
                     new cfh.i(cxa.iw, 1, 4, 16, 5),
                     new cfh.i(cxa.ix, 1, 4, 16, 5),
                     new cfh.i(cxa.iy, 1, 4, 16, 5),
                     new cfh.i(cxa.iz, 1, 4, 16, 5)
                  },
                  3,
                  new cfh.g[]{
                     new cfh.b(cnj.rl, 12, 16, 20),
                     new cfh.b(cnj.rp, 12, 16, 20),
                     new cfh.b(cnj.ri, 12, 16, 20),
                     new cfh.b(cnj.rv, 12, 16, 20),
                     new cfh.b(cnj.rn, 12, 16, 20),
                     new cfh.i(cxa.aZ, 3, 1, 12, 10),
                     new cfh.i(cxa.bd, 3, 1, 12, 10),
                     new cfh.i(cxa.bn, 3, 1, 12, 10),
                     new cfh.i(cxa.bo, 3, 1, 12, 10),
                     new cfh.i(cxa.bk, 3, 1, 12, 10),
                     new cfh.i(cxa.bl, 3, 1, 12, 10),
                     new cfh.i(cxa.bi, 3, 1, 12, 10),
                     new cfh.i(cxa.bg, 3, 1, 12, 10),
                     new cfh.i(cxa.bm, 3, 1, 12, 10),
                     new cfh.i(cxa.bc, 3, 1, 12, 10),
                     new cfh.i(cxa.bh, 3, 1, 12, 10),
                     new cfh.i(cxa.be, 3, 1, 12, 10),
                     new cfh.i(cxa.bb, 3, 1, 12, 10),
                     new cfh.i(cxa.ba, 3, 1, 12, 10),
                     new cfh.i(cxa.bf, 3, 1, 12, 10),
                     new cfh.i(cxa.bj, 3, 1, 12, 10)
                  },
                  4,
                  new cfh.g[]{
                     new cfh.b(cnj.rt, 12, 16, 30),
                     new cfh.b(cnj.rr, 12, 16, 30),
                     new cfh.b(cnj.rs, 12, 16, 30),
                     new cfh.b(cnj.ru, 12, 16, 30),
                     new cfh.b(cnj.rj, 12, 16, 30),
                     new cfh.b(cnj.rq, 12, 16, 30),
                     new cfh.i(cnj.uL, 3, 1, 12, 15),
                     new cfh.i(cnj.uW, 3, 1, 12, 15),
                     new cfh.i(cnj.uO, 3, 1, 12, 15),
                     new cfh.i(cnj.uZ, 3, 1, 12, 15),
                     new cfh.i(cnj.uR, 3, 1, 12, 15),
                     new cfh.i(cnj.uY, 3, 1, 12, 15),
                     new cfh.i(cnj.uQ, 3, 1, 12, 15),
                     new cfh.i(cnj.uS, 3, 1, 12, 15),
                     new cfh.i(cnj.va, 3, 1, 12, 15),
                     new cfh.i(cnj.uV, 3, 1, 12, 15),
                     new cfh.i(cnj.uN, 3, 1, 12, 15),
                     new cfh.i(cnj.uU, 3, 1, 12, 15),
                     new cfh.i(cnj.uX, 3, 1, 12, 15),
                     new cfh.i(cnj.uP, 3, 1, 12, 15),
                     new cfh.i(cnj.uM, 3, 1, 12, 15),
                     new cfh.i(cnj.uT, 3, 1, 12, 15)
                  },
                  5,
                  new cfh.g[]{new cfh.i(cnj.pY, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            cfg.i,
            a(
               ImmutableMap.of(
                  1,
                  new cfh.g[]{new cfh.b(cnj.po, 32, 16, 2), new cfh.i(cnj.ou, 1, 16, 1), new cfh.h(cxa.L, 10, 1, cnj.pV, 10, 12, 1, 0.05F)},
                  2,
                  new cfh.g[]{new cfh.b(cnj.pV, 26, 12, 10), new cfh.i(cnj.ot, 2, 1, 5)},
                  3,
                  new cfh.g[]{new cfh.b(cnj.pr, 14, 16, 20), new cfh.i(cnj.vP, 3, 1, 10)},
                  4,
                  new cfh.g[]{new cfh.b(cnj.ps, 24, 16, 30), new cfh.e(cnj.ot, 2, 3, 15)},
                  5,
                  new cfh.g[]{new cfh.b(cnj.ma, 8, 12, 30), new cfh.e(cnj.vP, 3, 3, 15), new cfh.k(cnj.ou, 5, cnj.vm, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            cfg.k,
            a(
               ImmutableMap.builder()
                  .put(1, new cfh.g[]{new cfh.b(cnj.qN, 24, 16, 2), new cfh.d(1), new cfh.i(cxa.cl, 9, 1, 12, 1)})
                  .put(2, new cfh.g[]{new cfh.b(cnj.qO, 4, 12, 10), new cfh.d(5), new cfh.i(cnj.wj, 1, 1, 5)})
                  .put(3, new cfh.g[]{new cfh.b(cnj.re, 5, 12, 20), new cfh.d(10), new cfh.i(cnj.cF, 1, 4, 10)})
                  .put(4, new cfh.g[]{new cfh.b(cnj.tW, 2, 12, 30), new cfh.d(15), new cfh.i(cnj.qV, 5, 1, 15), new cfh.i(cnj.qR, 4, 1, 15)})
                  .put(5, new cfh.g[]{new cfh.i(cnj.uH, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            cfg.e,
            a(
               ImmutableMap.of(
                  1,
                  new cfh.g[]{new cfh.b(cnj.qN, 24, 16, 2), new cfh.i(cnj.uf, 7, 1, 1)},
                  2,
                  new cfh.g[]{new cfh.b(cnj.fS, 11, 16, 10), new cfh.l(13, ast.d, "filled_map.monument", egg.a.j, 12, 5)},
                  3,
                  new cfh.g[]{new cfh.b(cnj.qR, 1, 12, 20), new cfh.l(14, ast.c, "filled_map.mansion", egg.a.i, 12, 10)},
                  4,
                  new cfh.g[]{
                     new cfh.i(cnj.tY, 7, 1, 15),
                     new cfh.i(cnj.uL, 3, 1, 15),
                     new cfh.i(cnj.uW, 3, 1, 15),
                     new cfh.i(cnj.uO, 3, 1, 15),
                     new cfh.i(cnj.uZ, 3, 1, 15),
                     new cfh.i(cnj.uR, 3, 1, 15),
                     new cfh.i(cnj.uY, 3, 1, 15),
                     new cfh.i(cnj.uQ, 3, 1, 15),
                     new cfh.i(cnj.uS, 3, 1, 15),
                     new cfh.i(cnj.va, 3, 1, 15),
                     new cfh.i(cnj.uV, 3, 1, 15),
                     new cfh.i(cnj.uN, 3, 1, 15),
                     new cfh.i(cnj.uU, 3, 1, 15),
                     new cfh.i(cnj.uX, 3, 1, 15),
                     new cfh.i(cnj.uP, 3, 1, 15),
                     new cfh.i(cnj.uM, 3, 1, 15),
                     new cfh.i(cnj.uT, 3, 1, 15)
                  },
                  5,
                  new cfh.g[]{new cfh.i(cnj.vW, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            cfg.f,
            a(
               ImmutableMap.of(
                  1,
                  new cfh.g[]{new cfh.b(cnj.sd, 32, 16, 2), new cfh.i(cnj.lG, 1, 2, 1)},
                  2,
                  new cfh.g[]{new cfh.b(cnj.oH, 3, 12, 10), new cfh.i(cnj.oz, 1, 1, 5)},
                  3,
                  new cfh.g[]{new cfh.b(cnj.uz, 2, 12, 20), new cfh.i(cxa.ec, 4, 1, 12, 10)},
                  4,
                  new cfh.g[]{new cfh.b(cnj.oo, 4, 12, 30), new cfh.b(cnj.sk, 9, 12, 30), new cfh.i(cnj.se, 5, 1, 15)},
                  5,
                  new cfh.g[]{new cfh.b(cnj.si, 22, 12, 30), new cfh.i(cnj.tU, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            cfg.c,
            a(
               ImmutableMap.of(
                  1,
                  new cfh.g[]{
                     new cfh.b(cnj.ov, 15, 16, 2),
                     new cfh.i(new cng(cnj.pH), 7, 1, 12, 1, 0.2F),
                     new cfh.i(new cng(cnj.pI), 4, 1, 12, 1, 0.2F),
                     new cfh.i(new cng(cnj.pF), 5, 1, 12, 1, 0.2F),
                     new cfh.i(new cng(cnj.pG), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cfh.g[]{
                     new cfh.b(cnj.oD, 4, 12, 10),
                     new cfh.i(new cng(cnj.wi), 36, 1, 12, 5, 0.2F),
                     new cfh.i(new cng(cnj.pE), 1, 1, 12, 5, 0.2F),
                     new cfh.i(new cng(cnj.pD), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new cfh.g[]{
                     new cfh.b(cnj.qz, 1, 12, 20),
                     new cfh.b(cnj.ox, 1, 12, 20),
                     new cfh.i(new cng(cnj.pB), 1, 1, 12, 10, 0.2F),
                     new cfh.i(new cng(cnj.pC), 4, 1, 12, 10, 0.2F),
                     new cfh.i(new cng(cnj.vo), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new cfh.g[]{new cfh.e(cnj.pL, 14, 3, 15, 0.2F), new cfh.e(cnj.pM, 8, 3, 15, 0.2F)},
                  5,
                  new cfh.g[]{new cfh.e(cnj.pJ, 8, 3, 30, 0.2F), new cfh.e(cnj.pK, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cfg.p,
            a(
               ImmutableMap.of(
                  1,
                  new cfh.g[]{new cfh.b(cnj.ov, 15, 16, 2), new cfh.i(new cng(cnj.pc), 3, 1, 12, 1, 0.2F), new cfh.e(cnj.oZ, 2, 3, 1)},
                  2,
                  new cfh.g[]{new cfh.b(cnj.oD, 4, 12, 10), new cfh.i(new cng(cnj.wi), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cfh.g[]{new cfh.b(cnj.pV, 24, 12, 20)},
                  4,
                  new cfh.g[]{new cfh.b(cnj.ox, 1, 12, 30), new cfh.e(cnj.ph, 12, 3, 15, 0.2F)},
                  5,
                  new cfh.g[]{new cfh.e(cnj.pe, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cfg.o,
            a(
               ImmutableMap.of(
                  1,
                  new cfh.g[]{
                     new cfh.b(cnj.ov, 15, 16, 2),
                     new cfh.i(new cng(cnj.oS), 1, 1, 12, 1, 0.2F),
                     new cfh.i(new cng(cnj.oQ), 1, 1, 12, 1, 0.2F),
                     new cfh.i(new cng(cnj.oR), 1, 1, 12, 1, 0.2F),
                     new cfh.i(new cng(cnj.oT), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cfh.g[]{new cfh.b(cnj.oD, 4, 12, 10), new cfh.i(new cng(cnj.wi), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cfh.g[]{
                     new cfh.b(cnj.pV, 30, 12, 20),
                     new cfh.e(cnj.pc, 1, 3, 10, 0.2F),
                     new cfh.e(cnj.pa, 2, 3, 10, 0.2F),
                     new cfh.e(cnj.pb, 3, 3, 10, 0.2F),
                     new cfh.i(new cng(cnj.pi), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new cfh.g[]{new cfh.b(cnj.ox, 1, 12, 30), new cfh.e(cnj.ph, 12, 3, 15, 0.2F), new cfh.e(cnj.pf, 5, 3, 15, 0.2F)},
                  5,
                  new cfh.g[]{new cfh.e(cnj.pg, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cfg.d,
            a(
               ImmutableMap.of(
                  1,
                  new cfh.g[]{new cfh.b(cnj.sb, 14, 16, 2), new cfh.b(cnj.pW, 7, 16, 2), new cfh.b(cnj.uw, 4, 16, 2), new cfh.i(cnj.uy, 1, 1, 1)},
                  2,
                  new cfh.g[]{new cfh.b(cnj.ov, 15, 16, 2), new cfh.i(cnj.pX, 1, 5, 16, 5), new cfh.i(cnj.sc, 1, 8, 16, 5)},
                  3,
                  new cfh.g[]{new cfh.b(cnj.uJ, 7, 16, 20), new cfh.b(cnj.rZ, 10, 16, 20)},
                  4,
                  new cfh.g[]{new cfh.b(cnj.qM, 10, 12, 30)},
                  5,
                  new cfh.g[]{new cfh.b(cnj.wl, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            cfg.j,
            a(
               ImmutableMap.of(
                  1,
                  new cfh.g[]{new cfh.b(cnj.qC, 6, 16, 2), new cfh.a(cnj.pz, 3), new cfh.a(cnj.py, 7)},
                  2,
                  new cfh.g[]{new cfh.b(cnj.pV, 26, 12, 10), new cfh.a(cnj.px, 5, 12, 5), new cfh.a(cnj.pA, 4, 12, 5)},
                  3,
                  new cfh.g[]{new cfh.b(cnj.uA, 9, 12, 20), new cfh.a(cnj.py, 7)},
                  4,
                  new cfh.g[]{new cfh.b(cnj.oo, 4, 12, 30), new cfh.a(cnj.uF, 6, 12, 15)},
                  5,
                  new cfh.g[]{new cfh.i(new cng(cnj.nK), 6, 1, 12, 30, 0.2F), new cfh.a(cnj.px, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            cfg.l,
            a(
               ImmutableMap.of(
                  1,
                  new cfh.g[]{new cfh.b(cnj.qL, 10, 16, 2), new cfh.i(cnj.qK, 1, 10, 16, 1)},
                  2,
                  new cfh.g[]{new cfh.b(cxa.b, 20, 16, 10), new cfh.i(cxa.eK, 1, 4, 16, 5)},
                  3,
                  new cfh.g[]{
                     new cfh.b(cxa.c, 16, 16, 20),
                     new cfh.b(cxa.g, 16, 16, 20),
                     new cfh.b(cxa.e, 16, 16, 20),
                     new cfh.i(cxa.su, 1, 4, 16, 10),
                     new cfh.i(cxa.h, 1, 4, 16, 10),
                     new cfh.i(cxa.f, 1, 4, 16, 10),
                     new cfh.i(cxa.d, 1, 4, 16, 10)
                  },
                  4,
                  new cfh.g[]{
                     new cfh.b(cnj.oA, 12, 12, 30),
                     new cfh.i(cxa.hk, 1, 1, 12, 15),
                     new cfh.i(cxa.hj, 1, 1, 12, 15),
                     new cfh.i(cxa.hu, 1, 1, 12, 15),
                     new cfh.i(cxa.hm, 1, 1, 12, 15),
                     new cfh.i(cxa.hq, 1, 1, 12, 15),
                     new cfh.i(cxa.hr, 1, 1, 12, 15),
                     new cfh.i(cxa.hy, 1, 1, 12, 15),
                     new cfh.i(cxa.hx, 1, 1, 12, 15),
                     new cfh.i(cxa.hp, 1, 1, 12, 15),
                     new cfh.i(cxa.hl, 1, 1, 12, 15),
                     new cfh.i(cxa.ho, 1, 1, 12, 15),
                     new cfh.i(cxa.hw, 1, 1, 12, 15),
                     new cfh.i(cxa.hs, 1, 1, 12, 15),
                     new cfh.i(cxa.ht, 1, 1, 12, 15),
                     new cfh.i(cxa.hn, 1, 1, 12, 15),
                     new cfh.i(cxa.hv, 1, 1, 12, 15),
                     new cfh.i(cxa.lh, 1, 1, 12, 15),
                     new cfh.i(cxa.lg, 1, 1, 12, 15),
                     new cfh.i(cxa.lr, 1, 1, 12, 15),
                     new cfh.i(cxa.lj, 1, 1, 12, 15),
                     new cfh.i(cxa.ln, 1, 1, 12, 15),
                     new cfh.i(cxa.lo, 1, 1, 12, 15),
                     new cfh.i(cxa.lv, 1, 1, 12, 15),
                     new cfh.i(cxa.lu, 1, 1, 12, 15),
                     new cfh.i(cxa.lm, 1, 1, 12, 15),
                     new cfh.i(cxa.li, 1, 1, 12, 15),
                     new cfh.i(cxa.ll, 1, 1, 12, 15),
                     new cfh.i(cxa.lt, 1, 1, 12, 15),
                     new cfh.i(cxa.lp, 1, 1, 12, 15),
                     new cfh.i(cxa.lq, 1, 1, 12, 15),
                     new cfh.i(cxa.lk, 1, 1, 12, 15),
                     new cfh.i(cxa.ls, 1, 1, 12, 15)
                  },
                  5,
                  new cfh.g[]{new cfh.i(cxa.hf, 1, 1, 12, 30), new cfh.i(cxa.hd, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<cfh.g[]> b = a(
      ImmutableMap.of(
         1,
         new cfh.g[]{
            new cfh.i(cnj.cS, 2, 1, 5, 1),
            new cfh.i(cnj.qP, 4, 1, 5, 1),
            new cfh.i(cnj.ft, 2, 1, 5, 1),
            new cfh.i(cnj.vN, 5, 1, 5, 1),
            new cfh.i(cnj.cN, 1, 1, 12, 1),
            new cfh.i(cnj.dI, 1, 1, 8, 1),
            new cfh.i(cnj.fj, 1, 1, 4, 1),
            new cfh.i(cnj.dJ, 3, 1, 12, 1),
            new cfh.i(cnj.eV, 3, 1, 8, 1),
            new cfh.i(cnj.dj, 1, 1, 12, 1),
            new cfh.i(cnj.dk, 1, 1, 12, 1),
            new cfh.i(cnj.dl, 1, 1, 8, 1),
            new cfh.i(cnj.dm, 1, 1, 12, 1),
            new cfh.i(cnj.dn, 1, 1, 12, 1),
            new cfh.i(cnj.do, 1, 1, 12, 1),
            new cfh.i(cnj.dp, 1, 1, 12, 1),
            new cfh.i(cnj.dq, 1, 1, 12, 1),
            new cfh.i(cnj.dr, 1, 1, 12, 1),
            new cfh.i(cnj.ds, 1, 1, 12, 1),
            new cfh.i(cnj.dt, 1, 1, 12, 1),
            new cfh.i(cnj.du, 1, 1, 7, 1),
            new cfh.i(cnj.pu, 1, 1, 12, 1),
            new cfh.i(cnj.vh, 1, 1, 12, 1),
            new cfh.i(cnj.rX, 1, 1, 12, 1),
            new cfh.i(cnj.rY, 1, 1, 12, 1),
            new cfh.i(cnj.aa, 5, 1, 8, 1),
            new cfh.i(cnj.Y, 5, 1, 8, 1),
            new cfh.i(cnj.ac, 5, 1, 8, 1),
            new cfh.i(cnj.Z, 5, 1, 8, 1),
            new cfh.i(cnj.W, 5, 1, 8, 1),
            new cfh.i(cnj.X, 5, 1, 8, 1),
            new cfh.i(cnj.ab, 5, 1, 8, 1),
            new cfh.i(cnj.ad, 5, 1, 8, 1),
            new cfh.i(cnj.rv, 1, 3, 12, 1),
            new cfh.i(cnj.rh, 1, 3, 12, 1),
            new cfh.i(cnj.rs, 1, 3, 12, 1),
            new cfh.i(cnj.rn, 1, 3, 12, 1),
            new cfh.i(cnj.rw, 1, 3, 12, 1),
            new cfh.i(cnj.ru, 1, 3, 12, 1),
            new cfh.i(cnj.rp, 1, 3, 12, 1),
            new cfh.i(cnj.rj, 1, 3, 12, 1),
            new cfh.i(cnj.rl, 1, 3, 12, 1),
            new cfh.i(cnj.ro, 1, 3, 12, 1),
            new cfh.i(cnj.rr, 1, 3, 12, 1),
            new cfh.i(cnj.rk, 1, 3, 12, 1),
            new cfh.i(cnj.rm, 1, 3, 12, 1),
            new cfh.i(cnj.ri, 1, 3, 12, 1),
            new cfh.i(cnj.rt, 1, 3, 12, 1),
            new cfh.i(cnj.rq, 1, 3, 12, 1),
            new cfh.i(cnj.kw, 3, 1, 8, 1),
            new cfh.i(cnj.kx, 3, 1, 8, 1),
            new cfh.i(cnj.ky, 3, 1, 8, 1),
            new cfh.i(cnj.kz, 3, 1, 8, 1),
            new cfh.i(cnj.kv, 3, 1, 8, 1),
            new cfh.i(cnj.fU, 1, 1, 12, 1),
            new cfh.i(cnj.dz, 1, 1, 12, 1),
            new cfh.i(cnj.dA, 1, 1, 12, 1),
            new cfh.i(cnj.ga, 1, 2, 5, 1),
            new cfh.i(cnj.dP, 1, 2, 5, 1),
            new cfh.i(cnj.af, 1, 8, 8, 1),
            new cfh.i(cnj.ai, 1, 4, 6, 1),
            new cfh.i(cnj.xf, 1, 2, 5, 1),
            new cfh.i(cnj.F, 1, 2, 5, 1),
            new cfh.i(cnj.dM, 1, 2, 5, 1)
         },
         2,
         new cfh.g[]{
            new cfh.i(cnj.qH, 5, 1, 4, 1),
            new cfh.i(cnj.qE, 5, 1, 4, 1),
            new cfh.i(cnj.hU, 3, 1, 6, 1),
            new cfh.i(cnj.kU, 6, 1, 6, 1),
            new cfh.i(cnj.pt, 1, 1, 8, 1),
            new cfh.i(cnj.E, 3, 3, 6, 1)
         }
      )
   );
   private static final cfh.l s = new cfh.l(8, ast.f, "filled_map.village_desert", egg.a.B, 12, 5);
   private static final cfh.l t = new cfh.l(8, ast.e, "filled_map.village_savanna", egg.a.D, 12, 5);
   private static final cfh.l u = new cfh.l(8, ast.g, "filled_map.village_plains", egg.a.C, 12, 5);
   private static final cfh.l v = new cfh.l(8, ast.h, "filled_map.village_taiga", egg.a.F, 12, 5);
   private static final cfh.l w = new cfh.l(8, ast.i, "filled_map.village_snowy", egg.a.E, 12, 5);
   private static final cfh.l x = new cfh.l(8, ast.j, "filled_map.explorer_jungle", egg.a.G, 12, 5);
   private static final cfh.l y = new cfh.l(8, ast.k, "filled_map.explorer_swamp", egg.a.H, 12, 5);
   public static final Map<cfg, Int2ObjectMap<cfh.g[]>> c = Map.of(
      cfg.k,
      a(
         ImmutableMap.builder()
            .put(1, new cfh.g[]{new cfh.b(cnj.qN, 24, 16, 2), a(1), new cfh.i(cxa.cl, 9, 1, 12, 1)})
            .put(2, new cfh.g[]{new cfh.b(cnj.qO, 4, 12, 10), a(5), new cfh.i(cnj.wj, 1, 1, 5)})
            .put(3, new cfh.g[]{new cfh.b(cnj.re, 5, 12, 20), a(10), new cfh.i(cnj.cF, 1, 4, 10)})
            .put(4, new cfh.g[]{new cfh.b(cnj.tW, 2, 12, 30), new cfh.i(cnj.qV, 5, 1, 15), new cfh.i(cnj.qR, 4, 1, 15)})
            .put(5, new cfh.g[]{a(), new cfh.i(cnj.uH, 20, 1, 30)})
            .build()
      ),
      cfg.c,
      a(
         ImmutableMap.builder()
            .put(1, new cfh.g[]{new cfh.b(cnj.ov, 15, 12, 2), new cfh.b(cnj.oD, 5, 12, 2)})
            .put(
               2,
               new cfh.g[]{
                  cfh.m.a(new cfh.i(cnj.pI, 4, 1, 12, 5, 0.05F), cfi.a, cfi.c, cfi.d, cfi.e, cfi.g),
                  cfh.m.a(new cfh.i(cnj.pE, 4, 1, 12, 5, 0.05F), cfi.b, cfi.f),
                  cfh.m.a(new cfh.i(cnj.pF, 5, 1, 12, 5, 0.05F), cfi.a, cfi.c, cfi.d, cfi.e, cfi.g),
                  cfh.m.a(new cfh.i(cnj.pB, 5, 1, 12, 5, 0.05F), cfi.b, cfi.f),
                  cfh.m.a(new cfh.i(cnj.pH, 7, 1, 12, 5, 0.05F), cfi.a, cfi.c, cfi.d, cfi.e, cfi.g),
                  cfh.m.a(new cfh.i(cnj.pD, 7, 1, 12, 5, 0.05F), cfi.b, cfi.f),
                  cfh.m.a(new cfh.i(cnj.pG, 9, 1, 12, 5, 0.05F), cfi.a, cfi.c, cfi.d, cfi.e, cfi.g),
                  cfh.m.a(new cfh.i(cnj.pC, 9, 1, 12, 5, 0.05F), cfi.b, cfi.f)
               }
            )
            .put(3, new cfh.g[]{new cfh.b(cnj.qz, 1, 12, 20), new cfh.i(cnj.vo, 5, 1, 12, 10, 0.05F), new cfh.i(cnj.wi, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new cfh.g[]{
                  cfh.m.a(new cfh.i(a(cnj.pI, crv.h, 1), 8, 1, 3, 15, 0.05F), cfi.a),
                  cfh.m.a(new cfh.i(a(cnj.pF, crv.h, 1), 9, 1, 3, 15, 0.05F), cfi.a),
                  cfh.m.a(new cfh.i(a(cnj.pH, crv.h, 1), 11, 1, 3, 15, 0.05F), cfi.a),
                  cfh.m.a(new cfh.i(a(cnj.pG, crv.h, 1), 13, 1, 3, 15, 0.05F), cfi.a),
                  cfh.m.a(new cfh.i(a(cnj.pI, crv.a, 1), 8, 1, 3, 15, 0.05F), cfi.c),
                  cfh.m.a(new cfh.i(a(cnj.pF, crv.a, 1), 9, 1, 3, 15, 0.05F), cfi.c),
                  cfh.m.a(new cfh.i(a(cnj.pH, crv.a, 1), 11, 1, 3, 15, 0.05F), cfi.c),
                  cfh.m.a(new cfh.i(a(cnj.pG, crv.a, 1), 13, 1, 3, 15, 0.05F), cfi.c),
                  cfh.m.a(new cfh.i(a(cnj.pI, crv.k, 1), 2, 1, 3, 15, 0.05F), cfi.d),
                  cfh.m.a(new cfh.i(a(cnj.pF, crv.k, 1), 3, 1, 3, 15, 0.05F), cfi.d),
                  cfh.m.a(new cfh.i(a(cnj.pH, crv.k, 1), 5, 1, 3, 15, 0.05F), cfi.d),
                  cfh.m.a(new cfh.i(a(cnj.pG, crv.k, 1), 7, 1, 3, 15, 0.05F), cfi.d),
                  cfh.m.a(new cfh.i(a(cnj.pI, crv.j, 1), 8, 1, 3, 15, 0.05F), cfi.e),
                  cfh.m.a(new cfh.i(a(cnj.pF, crv.g, 1), 9, 1, 3, 15, 0.05F), cfi.e),
                  cfh.m.a(new cfh.i(a(cnj.pE, crv.w, 1), 8, 1, 3, 15, 0.05F), cfi.b),
                  cfh.m.a(new cfh.i(a(cnj.pB, crv.w, 1), 9, 1, 3, 15, 0.05F), cfi.b),
                  cfh.m.a(new cfh.i(a(cnj.pD, crv.w, 1), 11, 1, 3, 15, 0.05F), cfi.b),
                  cfh.m.a(new cfh.i(a(cnj.pC, crv.w, 1), 13, 1, 3, 15, 0.05F), cfi.b),
                  cfh.m.a(new cfh.i(a(cnj.pE, crv.L, 1), 8, 1, 3, 15, 0.05F), cfi.f),
                  cfh.m.a(new cfh.i(a(cnj.pB, crv.L, 1), 9, 1, 3, 15, 0.05F), cfi.f),
                  cfh.m.a(new cfh.i(a(cnj.pD, crv.L, 1), 11, 1, 3, 15, 0.05F), cfi.f),
                  cfh.m.a(new cfh.i(a(cnj.pC, crv.L, 1), 13, 1, 3, 15, 0.05F), cfi.f),
                  cfh.m.a(new cfh.h(cnj.pM, 1, 4, cnj.pL, 1, 3, 15, 0.05F), cfi.g),
                  cfh.m.a(new cfh.h(cnj.pL, 1, 4, cnj.pK, 1, 3, 15, 0.05F), cfi.g),
                  cfh.m.a(new cfh.h(cnj.pJ, 1, 4, cnj.pM, 1, 3, 15, 0.05F), cfi.g),
                  cfh.m.a(new cfh.h(cnj.pK, 1, 2, cnj.pJ, 1, 3, 15, 0.05F), cfi.g)
               }
            )
            .put(
               5,
               new cfh.g[]{
                  cfh.m.a(new cfh.h(cnj.ox, 4, 16, a(cnj.pK, crv.h, 1), 1, 3, 30, 0.05F), cfi.a),
                  cfh.m.a(new cfh.h(cnj.ox, 3, 16, a(cnj.pL, crv.h, 1), 1, 3, 30, 0.05F), cfi.a),
                  cfh.m.a(new cfh.h(cnj.ox, 3, 16, a(cnj.pL, crv.a, 1), 1, 3, 30, 0.05F), cfi.c),
                  cfh.m.a(new cfh.h(cnj.ox, 2, 12, a(cnj.pM, crv.a, 1), 1, 3, 30, 0.05F), cfi.c),
                  cfh.m.a(new cfh.h(cnj.ox, 2, 6, a(cnj.pJ, crv.k, 1), 1, 3, 30, 0.05F), cfi.d),
                  cfh.m.a(new cfh.h(cnj.ox, 3, 8, a(cnj.pK, crv.k, 1), 1, 3, 30, 0.05F), cfi.d),
                  cfh.m.a(new cfh.h(cnj.ox, 2, 12, a(cnj.pM, crv.j, 1), 1, 3, 30, 0.05F), cfi.e),
                  cfh.m.a(new cfh.h(cnj.ox, 3, 12, a(cnj.pJ, crv.g, 1), 1, 3, 30, 0.05F), cfi.e),
                  cfh.m.a(new cfh.i(a(cnj.pB, crv.e, 1), 9, 1, 3, 30, 0.05F), cfi.b),
                  cfh.m.a(new cfh.i(a(cnj.pE, crv.c, 1), 8, 1, 3, 30, 0.05F), cfi.b),
                  cfh.m.a(new cfh.i(a(cnj.pB, crv.f, 1), 9, 1, 3, 30, 0.05F), cfi.f),
                  cfh.m.a(new cfh.i(a(cnj.pE, crv.i, 1), 8, 1, 3, 30, 0.05F), cfi.f),
                  cfh.m.a(new cfh.h(cnj.ox, 4, 18, a(cnj.pK, crv.d, 1), 1, 3, 30, 0.05F), cfi.g),
                  cfh.m.a(new cfh.h(cnj.ox, 3, 18, a(cnj.pL, crv.d, 1), 1, 3, 30, 0.05F), cfi.g),
                  cfh.m.a(new cfh.b(cnj.aM, 1, 12, 30, 42), cfi.g),
                  cfh.m.a(new cfh.b(cnj.aJ, 1, 12, 30, 4), cfi.a, cfi.b, cfi.c, cfi.d, cfi.e, cfi.f)
               }
            )
            .build()
      ),
      cfg.e,
      a(
         ImmutableMap.of(
            1,
            new cfh.g[]{new cfh.b(cnj.qN, 24, 16, 2), new cfh.i(cnj.uf, 7, 1, 1)},
            2,
            new cfh.g[]{
               new cfh.b(cnj.fS, 11, 16, 10),
               new cfh.m(ImmutableMap.builder().put(cfi.a, t).put(cfi.d, u).put(cfi.c, v).put(cfi.g, w).put(cfi.e, u).put(cfi.b, t).put(cfi.f, w).build()),
               new cfh.m(ImmutableMap.builder().put(cfi.a, u).put(cfi.d, s).put(cfi.c, t).put(cfi.g, u).put(cfi.e, v).put(cfi.b, s).put(cfi.f, v).build()),
               new cfh.m(
                  ImmutableMap.builder().put(cfi.a, x).put(cfi.d, x).put(cfi.c, new cfh.f()).put(cfi.g, y).put(cfi.e, y).put(cfi.b, y).put(cfi.f, x).build()
               )
            },
            3,
            new cfh.g[]{new cfh.b(cnj.qR, 1, 12, 20), new cfh.l(13, ast.d, "filled_map.monument", egg.a.j, 12, 10)},
            4,
            new cfh.g[]{
               new cfh.i(cnj.tY, 7, 1, 15),
               new cfh.i(cnj.uL, 3, 1, 15),
               new cfh.i(cnj.uW, 3, 1, 15),
               new cfh.i(cnj.uO, 3, 1, 15),
               new cfh.i(cnj.uZ, 3, 1, 15),
               new cfh.i(cnj.uR, 3, 1, 15),
               new cfh.i(cnj.uY, 3, 1, 15),
               new cfh.i(cnj.uQ, 3, 1, 15),
               new cfh.i(cnj.uS, 3, 1, 15),
               new cfh.i(cnj.va, 3, 1, 15),
               new cfh.i(cnj.uV, 3, 1, 15),
               new cfh.i(cnj.uN, 3, 1, 15),
               new cfh.i(cnj.uU, 3, 1, 15),
               new cfh.i(cnj.uX, 3, 1, 15),
               new cfh.i(cnj.uP, 3, 1, 15),
               new cfh.i(cnj.uM, 3, 1, 15),
               new cfh.i(cnj.uT, 3, 1, 15)
            },
            5,
            new cfh.g[]{new cfh.i(cnj.vW, 8, 1, 30), new cfh.l(14, ast.c, "filled_map.mansion", egg.a.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<cfh.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new cfh.g[]{
               new cfh.b(a(cph.c), 1, 1, 1),
               new cfh.b(cnj.qy, 1, 1, 1, 2),
               new cfh.b(cnj.qD, 1, 1, 1, 2),
               new cfh.b(cnj.sm, 1, 1, 1, 3),
               new cfh.b(cnj.ud, 4, 1, 1),
               new cfh.b(cnj.hC, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cfh.g[]{
               new cfh.i(cnj.hU, 1, 1, 6, 1),
               new cfh.i(cnj.kU, 6, 1, 6, 1),
               new cfh.i(cnj.pt, 1, 4, 2, 1),
               new cfh.i(cnj.E, 3, 3, 6, 1),
               new cfh.i(cxa.Y, 1, 8, 4, 1),
               new cfh.i(cxa.W, 1, 8, 4, 1),
               new cfh.i(cxa.aa, 1, 8, 4, 1),
               new cfh.i(cxa.X, 1, 8, 4, 1),
               new cfh.i(cxa.U, 1, 8, 4, 1),
               new cfh.i(cxa.V, 1, 8, 4, 1),
               new cfh.i(cxa.Z, 1, 8, 4, 1),
               new cfh.e(cnj.pb, 1, 1, 1, 0.2F),
               new cfh.i(a(cph.j), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cfh.g[]{
               new cfh.i(cnj.qH, 3, 1, 4, 1),
               new cfh.i(cnj.qE, 3, 1, 4, 1),
               new cfh.i(cnj.cS, 2, 1, 5, 1),
               new cfh.i(cnj.qP, 4, 1, 5, 1),
               new cfh.i(cnj.ft, 2, 1, 5, 1),
               new cfh.i(cnj.vN, 5, 1, 5, 1),
               new cfh.i(cnj.cN, 1, 1, 12, 1),
               new cfh.i(cnj.dI, 1, 1, 8, 1),
               new cfh.i(cnj.fj, 1, 1, 4, 1),
               new cfh.i(cnj.dJ, 3, 1, 12, 1),
               new cfh.i(cnj.eV, 3, 1, 8, 1),
               new cfh.i(cnj.dj, 1, 1, 12, 1),
               new cfh.i(cnj.dk, 1, 1, 12, 1),
               new cfh.i(cnj.dl, 1, 1, 8, 1),
               new cfh.i(cnj.dm, 1, 1, 12, 1),
               new cfh.i(cnj.dn, 1, 1, 12, 1),
               new cfh.i(cnj.do, 1, 1, 12, 1),
               new cfh.i(cnj.dp, 1, 1, 12, 1),
               new cfh.i(cnj.dq, 1, 1, 12, 1),
               new cfh.i(cnj.dr, 1, 1, 12, 1),
               new cfh.i(cnj.ds, 1, 1, 12, 1),
               new cfh.i(cnj.dt, 1, 1, 12, 1),
               new cfh.i(cnj.du, 1, 1, 7, 1),
               new cfh.i(cnj.pu, 1, 1, 12, 1),
               new cfh.i(cnj.vh, 1, 1, 12, 1),
               new cfh.i(cnj.rX, 1, 1, 12, 1),
               new cfh.i(cnj.rY, 1, 1, 12, 1),
               new cfh.i(cnj.aa, 5, 1, 8, 1),
               new cfh.i(cnj.Y, 5, 1, 8, 1),
               new cfh.i(cnj.ac, 5, 1, 8, 1),
               new cfh.i(cnj.Z, 5, 1, 8, 1),
               new cfh.i(cnj.W, 5, 1, 8, 1),
               new cfh.i(cnj.X, 5, 1, 8, 1),
               new cfh.i(cnj.ab, 5, 1, 8, 1),
               new cfh.i(cnj.ad, 5, 1, 8, 1),
               new cfh.i(cnj.rv, 1, 3, 12, 1),
               new cfh.i(cnj.rh, 1, 3, 12, 1),
               new cfh.i(cnj.rs, 1, 3, 12, 1),
               new cfh.i(cnj.rn, 1, 3, 12, 1),
               new cfh.i(cnj.rw, 1, 3, 12, 1),
               new cfh.i(cnj.ru, 1, 3, 12, 1),
               new cfh.i(cnj.rp, 1, 3, 12, 1),
               new cfh.i(cnj.rj, 1, 3, 12, 1),
               new cfh.i(cnj.rl, 1, 3, 12, 1),
               new cfh.i(cnj.ro, 1, 3, 12, 1),
               new cfh.i(cnj.rr, 1, 3, 12, 1),
               new cfh.i(cnj.rk, 1, 3, 12, 1),
               new cfh.i(cnj.rm, 1, 3, 12, 1),
               new cfh.i(cnj.ri, 1, 3, 12, 1),
               new cfh.i(cnj.rt, 1, 3, 12, 1),
               new cfh.i(cnj.rq, 1, 3, 12, 1),
               new cfh.i(cnj.kw, 3, 1, 8, 1),
               new cfh.i(cnj.kx, 3, 1, 8, 1),
               new cfh.i(cnj.ky, 3, 1, 8, 1),
               new cfh.i(cnj.kz, 3, 1, 8, 1),
               new cfh.i(cnj.kv, 3, 1, 8, 1),
               new cfh.i(cnj.fU, 1, 3, 4, 1),
               new cfh.i(cnj.dz, 1, 3, 4, 1),
               new cfh.i(cnj.dA, 1, 3, 4, 1),
               new cfh.i(cnj.ga, 1, 5, 2, 1),
               new cfh.i(cnj.dP, 1, 2, 5, 1),
               new cfh.i(cnj.af, 1, 8, 8, 1),
               new cfh.i(cnj.ai, 1, 4, 6, 1),
               new cfh.i(cnj.xf, 1, 2, 5, 1),
               new cfh.i(cnj.F, 1, 2, 5, 1),
               new cfh.i(cnj.dM, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static cfh.g a(int $$0) {
      return new cfh.m(
         ImmutableMap.builder()
            .put(cfi.a, new cfh.d($$0, crv.b, crv.h, crv.B))
            .put(cfi.b, new cfh.d($$0, crv.c, crv.e, crv.y))
            .put(cfi.c, new cfh.d($$0, crv.z, crv.o, crv.p))
            .put(cfi.d, new cfh.d($$0, crv.q, crv.k, crv.t))
            .put(cfi.e, new cfh.d($$0, crv.g, crv.s, crv.j))
            .put(cfi.f, new cfh.d($$0, crv.i, crv.f, crv.M))
            .put(cfi.g, new cfh.d($$0, crv.d, crv.r, crv.A))
            .build()
      );
   }

   private static cfh.g a() {
      return new cfh.m(
         ImmutableMap.builder()
            .put(cfi.a, new cfh.d(30, 3, 3, crv.u))
            .put(cfi.b, new cfh.d(30, 2, 2, crv.w))
            .put(cfi.c, new cfh.d(30, 3, 3, crv.a))
            .put(cfi.d, new cfh.d(30, 3, 3, crv.n))
            .put(cfi.e, new cfh.d(30, crv.v))
            .put(cfi.f, new cfh.d(30, crv.L))
            .put(cfi.g, new cfh.d(30, 2, 2, crv.x))
            .build()
      );
   }

   private static Int2ObjectMap<cfh.g[]> a(ImmutableMap<Integer, cfh.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static cng a(ih<cpe> $$0) {
      return cpg.a(new cng(cnj.sj), $$0);
   }

   private static cng a(cnb $$0, crr $$1, int $$2) {
      cng $$3 = new cng($$0);
      $$3.a($$1, $$2);
      return $$3;
   }

   static class a implements cfh.g {
      private final cnb a;
      private final int b;
      private final int c;
      private final int d;

      public a(cnb $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(cnb $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public csv a(blw $$0, auw $$1) {
         cng $$2 = new cng(cnj.oy, this.b);
         cng $$3 = new cng(this.a);
         if (this.a instanceof cly) {
            List<clw> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = clz.a($$3, $$4);
         }

         return new csv($$2, $$3, this.c, this.d, 0.2F);
      }

      private static clw a(auw $$0) {
         return clw.a(clv.a($$0.a(16)));
      }
   }

   static class b implements cfh.g {
      private final cng a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(ctw $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(ctw $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cng($$0.j(), $$1), $$2, $$3, $$4);
      }

      public b(cng $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public csv a(blw $$0, auw $$1) {
         return new csv(this.a.p(), new cng(cnj.oy, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements cfh.g {
      private final Map<cfi, cnb> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<cfi, cnb> $$3) {
         kd.y.s().filter($$1x -> !$$3.containsKey($$1x)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + kd.y.b($$0x));
         });
         this.a = $$3;
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Nullable
      @Override
      public csv a(blw $$0, auw $$1) {
         if ($$0 instanceof cff $$2) {
            cng $$3 = new cng(this.a.get($$2.gq().a()), this.b);
            return new csv($$3, new cng(cnj.oy), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements cfh.g {
      private final int a;
      private final List<crr> b;
      private final int c;
      private final int d;

      public d(int $$0) {
         this($$0, kd.f.s().filter(crr::h).toArray(crr[]::new));
      }

      public d(int $$0, crr... $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, crr... $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = Arrays.asList($$3);
      }

      @Override
      public csv a(blw $$0, auw $$1) {
         crr $$2 = this.b.get($$1.a(this.b.size()));
         int $$3 = Math.max($$2.e(), this.c);
         int $$4 = Math.min($$2.a(), this.d);
         int $$5 = aup.a($$1, $$3, $$4);
         cng $$6 = cmd.a(new cru($$2, $$5));
         int $$7 = 2 + $$1.a(5 + $$5 * 10) + 3 * $$5;
         if ($$2.b()) {
            $$7 *= 2;
         }

         if ($$7 > 64) {
            $$7 = 64;
         }

         return new csv(new cng(cnj.oy, $$7), new cng(cnj.qO), $$6, 12, this.a, 0.2F);
      }
   }

   static class e implements cfh.g {
      private final cng a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(cnb $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(cnb $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new cng($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public csv a(blw $$0, auw $$1) {
         int $$2 = 5 + $$1.a(15);
         cng $$3 = crt.a($$1, new cng(this.a.d()), $$2, false);
         int $$4 = Math.min(this.b + $$2, 64);
         cng $$5 = new cng(cnj.oy, $$4);
         return new csv($$5, $$3, this.c, this.d, this.e);
      }
   }

   static class f implements cfh.g {
      @Override
      public csv a(blw $$0, auw $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      csv a(blw var1, auw var2);
   }

   static class h implements cfh.g {
      private final cng a;
      private final int b;
      private final cng c;
      private final int d;
      private final int e;
      private final float f;

      public h(ctw $$0, int $$1, int $$2, cnb $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new cng($$3), $$4, $$5, $$6, $$7);
      }

      public h(ctw $$0, int $$1, int $$2, cng $$3, int $$4, int $$5, int $$6, float $$7) {
         this.a = new cng($$0, $$1);
         this.b = $$2;
         this.c = $$3.c($$4);
         this.d = $$5;
         this.e = $$6;
         this.f = $$7;
      }

      @Nullable
      @Override
      public csv a(blw $$0, auw $$1) {
         return new csv(new cng(cnj.oy, this.b), this.a.p(), this.c.p(), this.d, this.e, this.f);
      }
   }

   static class i implements cfh.g {
      private final cng a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public i(cwy $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cng($$0), $$1, $$2, $$3, $$4);
      }

      public i(cnb $$0, int $$1, int $$2, int $$3) {
         this(new cng($$0), $$1, $$2, 12, $$3);
      }

      public i(cnb $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cng($$0), $$1, $$2, $$3, $$4);
      }

      public i(cng $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(cnb $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new cng($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(cng $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.a.f($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
      }

      @Override
      public csv a(blw $$0, auw $$1) {
         return new csv(new cng(cnj.oy, this.b), this.a.p(), this.c, this.d, this.e);
      }
   }

   static class j implements cfh.g {
      private final List<dez.a> a;
      private final int b;
      private final float c;

      public j(ih<blh> $$0, int $$1, int $$2) {
         this(List.of(new dez.a($$0, $$1)), $$2, 0.05F);
      }

      public j(List<dez.a> $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public csv a(blw $$0, auw $$1) {
         cng $$2 = new cng(cnj.vQ, 1);
         cor.a($$2, this.a);
         return new csv(new cng(cnj.oy, 1), $$2, 12, this.b, this.c);
      }
   }

   static class k implements cfh.g {
      private final cng a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final cnb f;
      private final int g;
      private final float h;

      public k(cnb $$0, int $$1, cnb $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new cng($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public csv a(blw $$0, auw $$1) {
         cng $$2 = new cng(cnj.oy, this.c);
         List<ih<cpe>> $$3 = kd.i.h().filter($$0x -> !((cpe)$$0x.a()).a().isEmpty() && cpf.a($$0x)).collect(Collectors.toList());
         ih<cpe> $$4 = ac.a($$3, $$1);
         cng $$5 = cpg.a(new cng(this.a.d(), this.b), $$4);
         return new csv($$2, new cng(this.f, this.g), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements cfh.g {
      private final int a;
      private final asx<dzo> b;
      private final String c;
      private final egg.a d;
      private final int e;
      private final int f;

      public l(int $$0, asx<dzo> $$1, String $$2, egg.a $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public csv a(blw $$0, auw $$1) {
         if (!($$0.dL() instanceof ane)) {
            return null;
         } else {
            ane $$2 = (ane)$$0.dL();
            hx $$3 = $$2.a(this.b, $$0.dl(), 100, true);
            if ($$3 != null) {
               cng $$4 = cnn.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               cnn.a($$2, $$4);
               egj.a($$4, $$3, "+", this.d);
               $$4.a(vg.c(this.c));
               return new csv(new cng(cnj.oy, this.a), new cng(cnj.qR), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static record m(Map<cfi, cfh.g> a) implements cfh.g {
      public static cfh.m a(cfh.g $$0, cfi... $$1) {
         return new cfh.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public csv a(blw $$0, auw $$1) {
         if ($$0 instanceof cff $$2) {
            cfi $$3 = $$2.gq().a();
            cfh.g $$4 = this.a.get($$3);
            return $$4 == null ? null : $$4.a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
