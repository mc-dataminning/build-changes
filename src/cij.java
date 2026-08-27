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

public class cij {
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
   public static final Map<cii, Int2ObjectMap<cij.g[]>> a = ac.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            cii.g,
            a(
               ImmutableMap.of(
                  1,
                  new cij.g[]{
                     new cij.b(cqn.pv, 20, 16, 2),
                     new cij.b(cqn.ud, 26, 16, 2),
                     new cij.b(cqn.uc, 22, 16, 2),
                     new cij.b(cqn.vh, 15, 16, 2),
                     new cij.i(cqn.pw, 1, 6, 16, 1)
                  },
                  2,
                  new cij.g[]{new cij.b(dac.eZ, 6, 12, 10), new cij.i(cqn.uq, 1, 4, 5), new cij.i(cqn.os, 1, 4, 16, 5)},
                  3,
                  new cij.g[]{new cij.i(cqn.rR, 3, 18, 10), new cij.b(dac.fa, 4, 12, 20)},
                  4,
                  new cij.g[]{
                     new cij.i(dac.eg, 1, 1, 12, 15),
                     new cij.j(bol.p, 100, 15),
                     new cij.j(bol.h, 160, 15),
                     new cij.j(bol.r, 140, 15),
                     new cij.j(bol.o, 120, 15),
                     new cij.j(bol.s, 280, 15),
                     new cij.j(bol.w, 7, 15)
                  },
                  5,
                  new cij.g[]{new cij.i(cqn.uh, 3, 3, 30), new cij.i(cqn.ss, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            cii.h,
            a(
               ImmutableMap.of(
                  1,
                  new cij.g[]{
                     new cij.b(cqn.pr, 20, 16, 2),
                     new cij.b(cqn.ov, 10, 16, 2),
                     new cij.h(cqn.qY, 6, 1, cqn.rc, 6, 16, 1, 0.05F),
                     new cij.i(cqn.qG, 3, 1, 16, 1)
                  },
                  2,
                  new cij.g[]{new cij.b(cqn.qY, 15, 16, 10), new cij.h(cqn.qZ, 6, 1, cqn.rd, 6, 16, 5, 0.05F), new cij.i(cqn.wo, 2, 1, 5)},
                  3,
                  new cij.g[]{new cij.b(cqn.qZ, 13, 16, 20), new cij.e(cqn.qU, 3, 3, 10, 0.2F)},
                  4,
                  new cij.g[]{new cij.b(cqn.ra, 6, 12, 30)},
                  5,
                  new cij.g[]{
                     new cij.b(cqn.rb, 4, 12, 30),
                     new cij.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(cik.c, cqn.nT)
                           .put(cik.g, cqn.nV)
                           .put(cik.e, cqn.nV)
                           .put(cik.a, cqn.nZ)
                           .put(cik.b, cqn.nZ)
                           .put(cik.d, cqn.ob)
                           .put(cik.f, cqn.of)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            cii.n,
            a(
               ImmutableMap.of(
                  1,
                  new cij.g[]{
                     new cij.b(dac.bA, 18, 16, 2),
                     new cij.b(dac.bM, 18, 16, 2),
                     new cij.b(dac.bP, 18, 16, 2),
                     new cij.b(dac.bH, 18, 16, 2),
                     new cij.i(cqn.rU, 2, 1, 1)
                  },
                  2,
                  new cij.g[]{
                     new cij.b(cqn.rh, 12, 16, 10),
                     new cij.b(cqn.ro, 12, 16, 10),
                     new cij.b(cqn.rw, 12, 16, 10),
                     new cij.b(cqn.rk, 12, 16, 10),
                     new cij.b(cqn.rm, 12, 16, 10),
                     new cij.i(dac.bA, 1, 1, 16, 5),
                     new cij.i(dac.bB, 1, 1, 16, 5),
                     new cij.i(dac.bC, 1, 1, 16, 5),
                     new cij.i(dac.bD, 1, 1, 16, 5),
                     new cij.i(dac.bE, 1, 1, 16, 5),
                     new cij.i(dac.bF, 1, 1, 16, 5),
                     new cij.i(dac.bG, 1, 1, 16, 5),
                     new cij.i(dac.bH, 1, 1, 16, 5),
                     new cij.i(dac.bI, 1, 1, 16, 5),
                     new cij.i(dac.bJ, 1, 1, 16, 5),
                     new cij.i(dac.bK, 1, 1, 16, 5),
                     new cij.i(dac.bL, 1, 1, 16, 5),
                     new cij.i(dac.bM, 1, 1, 16, 5),
                     new cij.i(dac.bN, 1, 1, 16, 5),
                     new cij.i(dac.bO, 1, 1, 16, 5),
                     new cij.i(dac.bP, 1, 1, 16, 5),
                     new cij.i(dac.ik, 1, 4, 16, 5),
                     new cij.i(dac.il, 1, 4, 16, 5),
                     new cij.i(dac.im, 1, 4, 16, 5),
                     new cij.i(dac.in, 1, 4, 16, 5),
                     new cij.i(dac.io, 1, 4, 16, 5),
                     new cij.i(dac.ip, 1, 4, 16, 5),
                     new cij.i(dac.iq, 1, 4, 16, 5),
                     new cij.i(dac.ir, 1, 4, 16, 5),
                     new cij.i(dac.is, 1, 4, 16, 5),
                     new cij.i(dac.it, 1, 4, 16, 5),
                     new cij.i(dac.iu, 1, 4, 16, 5),
                     new cij.i(dac.iv, 1, 4, 16, 5),
                     new cij.i(dac.iw, 1, 4, 16, 5),
                     new cij.i(dac.ix, 1, 4, 16, 5),
                     new cij.i(dac.iy, 1, 4, 16, 5),
                     new cij.i(dac.iz, 1, 4, 16, 5)
                  },
                  3,
                  new cij.g[]{
                     new cij.b(cqn.rl, 12, 16, 20),
                     new cij.b(cqn.rp, 12, 16, 20),
                     new cij.b(cqn.ri, 12, 16, 20),
                     new cij.b(cqn.rv, 12, 16, 20),
                     new cij.b(cqn.rn, 12, 16, 20),
                     new cij.i(dac.aZ, 3, 1, 12, 10),
                     new cij.i(dac.bd, 3, 1, 12, 10),
                     new cij.i(dac.bn, 3, 1, 12, 10),
                     new cij.i(dac.bo, 3, 1, 12, 10),
                     new cij.i(dac.bk, 3, 1, 12, 10),
                     new cij.i(dac.bl, 3, 1, 12, 10),
                     new cij.i(dac.bi, 3, 1, 12, 10),
                     new cij.i(dac.bg, 3, 1, 12, 10),
                     new cij.i(dac.bm, 3, 1, 12, 10),
                     new cij.i(dac.bc, 3, 1, 12, 10),
                     new cij.i(dac.bh, 3, 1, 12, 10),
                     new cij.i(dac.be, 3, 1, 12, 10),
                     new cij.i(dac.bb, 3, 1, 12, 10),
                     new cij.i(dac.ba, 3, 1, 12, 10),
                     new cij.i(dac.bf, 3, 1, 12, 10),
                     new cij.i(dac.bj, 3, 1, 12, 10)
                  },
                  4,
                  new cij.g[]{
                     new cij.b(cqn.rt, 12, 16, 30),
                     new cij.b(cqn.rr, 12, 16, 30),
                     new cij.b(cqn.rs, 12, 16, 30),
                     new cij.b(cqn.ru, 12, 16, 30),
                     new cij.b(cqn.rj, 12, 16, 30),
                     new cij.b(cqn.rq, 12, 16, 30),
                     new cij.i(cqn.uM, 3, 1, 12, 15),
                     new cij.i(cqn.uX, 3, 1, 12, 15),
                     new cij.i(cqn.uP, 3, 1, 12, 15),
                     new cij.i(cqn.va, 3, 1, 12, 15),
                     new cij.i(cqn.uS, 3, 1, 12, 15),
                     new cij.i(cqn.uZ, 3, 1, 12, 15),
                     new cij.i(cqn.uR, 3, 1, 12, 15),
                     new cij.i(cqn.uT, 3, 1, 12, 15),
                     new cij.i(cqn.vb, 3, 1, 12, 15),
                     new cij.i(cqn.uW, 3, 1, 12, 15),
                     new cij.i(cqn.uO, 3, 1, 12, 15),
                     new cij.i(cqn.uV, 3, 1, 12, 15),
                     new cij.i(cqn.uY, 3, 1, 12, 15),
                     new cij.i(cqn.uQ, 3, 1, 12, 15),
                     new cij.i(cqn.uN, 3, 1, 12, 15),
                     new cij.i(cqn.uU, 3, 1, 12, 15)
                  },
                  5,
                  new cij.g[]{new cij.i(cqn.pY, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            cii.i,
            a(
               ImmutableMap.of(
                  1,
                  new cij.g[]{new cij.b(cqn.po, 32, 16, 2), new cij.i(cqn.ou, 1, 16, 1), new cij.h(dac.L, 10, 1, cqn.pV, 10, 12, 1, 0.05F)},
                  2,
                  new cij.g[]{new cij.b(cqn.pV, 26, 12, 10), new cij.i(cqn.ot, 2, 1, 5)},
                  3,
                  new cij.g[]{new cij.b(cqn.pr, 14, 16, 20), new cij.i(cqn.vQ, 3, 1, 10)},
                  4,
                  new cij.g[]{new cij.b(cqn.ps, 24, 16, 30), new cij.e(cqn.ot, 2, 3, 15)},
                  5,
                  new cij.g[]{new cij.b(cqn.ma, 8, 12, 30), new cij.e(cqn.vQ, 3, 3, 15), new cij.k(cqn.ou, 5, cqn.vn, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            cii.k,
            a(
               ImmutableMap.builder()
                  .put(1, new cij.g[]{new cij.b(cqn.qN, 24, 16, 2), new cij.d(1), new cij.i(dac.cl, 9, 1, 12, 1)})
                  .put(2, new cij.g[]{new cij.b(cqn.qO, 4, 12, 10), new cij.d(5), new cij.i(cqn.wk, 1, 1, 5)})
                  .put(3, new cij.g[]{new cij.b(cqn.re, 5, 12, 20), new cij.d(10), new cij.i(cqn.cF, 1, 4, 10)})
                  .put(4, new cij.g[]{new cij.b(cqn.tX, 2, 12, 30), new cij.d(15), new cij.i(cqn.qV, 5, 1, 15), new cij.i(cqn.qR, 4, 1, 15)})
                  .put(5, new cij.g[]{new cij.i(cqn.uI, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            cii.e,
            a(
               ImmutableMap.of(
                  1,
                  new cij.g[]{new cij.b(cqn.qN, 24, 16, 2), new cij.i(cqn.ug, 7, 1, 1)},
                  2,
                  new cij.g[]{new cij.b(cqn.fS, 11, 16, 10), new cij.l(13, auz.d, "filled_map.monument", eju.a.j, 12, 5)},
                  3,
                  new cij.g[]{new cij.b(cqn.qR, 1, 12, 20), new cij.l(14, auz.c, "filled_map.mansion", eju.a.i, 12, 10)},
                  4,
                  new cij.g[]{
                     new cij.i(cqn.tZ, 7, 1, 15),
                     new cij.i(cqn.uM, 3, 1, 15),
                     new cij.i(cqn.uX, 3, 1, 15),
                     new cij.i(cqn.uP, 3, 1, 15),
                     new cij.i(cqn.va, 3, 1, 15),
                     new cij.i(cqn.uS, 3, 1, 15),
                     new cij.i(cqn.uZ, 3, 1, 15),
                     new cij.i(cqn.uR, 3, 1, 15),
                     new cij.i(cqn.uT, 3, 1, 15),
                     new cij.i(cqn.vb, 3, 1, 15),
                     new cij.i(cqn.uW, 3, 1, 15),
                     new cij.i(cqn.uO, 3, 1, 15),
                     new cij.i(cqn.uV, 3, 1, 15),
                     new cij.i(cqn.uY, 3, 1, 15),
                     new cij.i(cqn.uQ, 3, 1, 15),
                     new cij.i(cqn.uN, 3, 1, 15),
                     new cij.i(cqn.uU, 3, 1, 15)
                  },
                  5,
                  new cij.g[]{new cij.i(cqn.vX, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            cii.f,
            a(
               ImmutableMap.of(
                  1,
                  new cij.g[]{new cij.b(cqn.sd, 32, 16, 2), new cij.i(cqn.lG, 1, 2, 1)},
                  2,
                  new cij.g[]{new cij.b(cqn.oH, 3, 12, 10), new cij.i(cqn.oz, 1, 1, 5)},
                  3,
                  new cij.g[]{new cij.b(cqn.uA, 2, 12, 20), new cij.i(dac.ec, 4, 1, 12, 10)},
                  4,
                  new cij.g[]{new cij.b(cqn.oo, 4, 12, 30), new cij.b(cqn.sk, 9, 12, 30), new cij.i(cqn.se, 5, 1, 15)},
                  5,
                  new cij.g[]{new cij.b(cqn.si, 22, 12, 30), new cij.i(cqn.tU, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            cii.c,
            a(
               ImmutableMap.of(
                  1,
                  new cij.g[]{
                     new cij.b(cqn.ov, 15, 16, 2),
                     new cij.i(new cqk(cqn.pH), 7, 1, 12, 1, 0.2F),
                     new cij.i(new cqk(cqn.pI), 4, 1, 12, 1, 0.2F),
                     new cij.i(new cqk(cqn.pF), 5, 1, 12, 1, 0.2F),
                     new cij.i(new cqk(cqn.pG), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cij.g[]{
                     new cij.b(cqn.oD, 4, 12, 10),
                     new cij.i(new cqk(cqn.wj), 36, 1, 12, 5, 0.2F),
                     new cij.i(new cqk(cqn.pE), 1, 1, 12, 5, 0.2F),
                     new cij.i(new cqk(cqn.pD), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new cij.g[]{
                     new cij.b(cqn.qz, 1, 12, 20),
                     new cij.b(cqn.ox, 1, 12, 20),
                     new cij.i(new cqk(cqn.pB), 1, 1, 12, 10, 0.2F),
                     new cij.i(new cqk(cqn.pC), 4, 1, 12, 10, 0.2F),
                     new cij.i(new cqk(cqn.vp), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new cij.g[]{new cij.e(cqn.pL, 14, 3, 15, 0.2F), new cij.e(cqn.pM, 8, 3, 15, 0.2F)},
                  5,
                  new cij.g[]{new cij.e(cqn.pJ, 8, 3, 30, 0.2F), new cij.e(cqn.pK, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cii.p,
            a(
               ImmutableMap.of(
                  1,
                  new cij.g[]{new cij.b(cqn.ov, 15, 16, 2), new cij.i(new cqk(cqn.pc), 3, 1, 12, 1, 0.2F), new cij.e(cqn.oZ, 2, 3, 1)},
                  2,
                  new cij.g[]{new cij.b(cqn.oD, 4, 12, 10), new cij.i(new cqk(cqn.wj), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cij.g[]{new cij.b(cqn.pV, 24, 12, 20)},
                  4,
                  new cij.g[]{new cij.b(cqn.ox, 1, 12, 30), new cij.e(cqn.ph, 12, 3, 15, 0.2F)},
                  5,
                  new cij.g[]{new cij.e(cqn.pe, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cii.o,
            a(
               ImmutableMap.of(
                  1,
                  new cij.g[]{
                     new cij.b(cqn.ov, 15, 16, 2),
                     new cij.i(new cqk(cqn.oS), 1, 1, 12, 1, 0.2F),
                     new cij.i(new cqk(cqn.oQ), 1, 1, 12, 1, 0.2F),
                     new cij.i(new cqk(cqn.oR), 1, 1, 12, 1, 0.2F),
                     new cij.i(new cqk(cqn.oT), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cij.g[]{new cij.b(cqn.oD, 4, 12, 10), new cij.i(new cqk(cqn.wj), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cij.g[]{
                     new cij.b(cqn.pV, 30, 12, 20),
                     new cij.e(cqn.pc, 1, 3, 10, 0.2F),
                     new cij.e(cqn.pa, 2, 3, 10, 0.2F),
                     new cij.e(cqn.pb, 3, 3, 10, 0.2F),
                     new cij.i(new cqk(cqn.pi), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new cij.g[]{new cij.b(cqn.ox, 1, 12, 30), new cij.e(cqn.ph, 12, 3, 15, 0.2F), new cij.e(cqn.pf, 5, 3, 15, 0.2F)},
                  5,
                  new cij.g[]{new cij.e(cqn.pg, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cii.d,
            a(
               ImmutableMap.of(
                  1,
                  new cij.g[]{new cij.b(cqn.sb, 14, 16, 2), new cij.b(cqn.pW, 7, 16, 2), new cij.b(cqn.ux, 4, 16, 2), new cij.i(cqn.uz, 1, 1, 1)},
                  2,
                  new cij.g[]{new cij.b(cqn.ov, 15, 16, 2), new cij.i(cqn.pX, 1, 5, 16, 5), new cij.i(cqn.sc, 1, 8, 16, 5)},
                  3,
                  new cij.g[]{new cij.b(cqn.uK, 7, 16, 20), new cij.b(cqn.rZ, 10, 16, 20)},
                  4,
                  new cij.g[]{new cij.b(cqn.qM, 10, 12, 30)},
                  5,
                  new cij.g[]{new cij.b(cqn.wm, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            cii.j,
            a(
               ImmutableMap.of(
                  1,
                  new cij.g[]{new cij.b(cqn.qC, 6, 16, 2), new cij.a(cqn.pz, 3), new cij.a(cqn.py, 7)},
                  2,
                  new cij.g[]{new cij.b(cqn.pV, 26, 12, 10), new cij.a(cqn.px, 5, 12, 5), new cij.a(cqn.pA, 4, 12, 5)},
                  3,
                  new cij.g[]{new cij.b(cqn.uB, 9, 12, 20), new cij.a(cqn.py, 7)},
                  4,
                  new cij.g[]{new cij.b(cqn.oo, 4, 12, 30), new cij.a(cqn.uG, 6, 12, 15)},
                  5,
                  new cij.g[]{new cij.i(new cqk(cqn.nK), 6, 1, 12, 30, 0.2F), new cij.a(cqn.px, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            cii.l,
            a(
               ImmutableMap.of(
                  1,
                  new cij.g[]{new cij.b(cqn.qL, 10, 16, 2), new cij.i(cqn.qK, 1, 10, 16, 1)},
                  2,
                  new cij.g[]{new cij.b(dac.b, 20, 16, 10), new cij.i(dac.eK, 1, 4, 16, 5)},
                  3,
                  new cij.g[]{
                     new cij.b(dac.c, 16, 16, 20),
                     new cij.b(dac.g, 16, 16, 20),
                     new cij.b(dac.e, 16, 16, 20),
                     new cij.i(dac.su, 1, 4, 16, 10),
                     new cij.i(dac.h, 1, 4, 16, 10),
                     new cij.i(dac.f, 1, 4, 16, 10),
                     new cij.i(dac.d, 1, 4, 16, 10)
                  },
                  4,
                  new cij.g[]{
                     new cij.b(cqn.oA, 12, 12, 30),
                     new cij.i(dac.hk, 1, 1, 12, 15),
                     new cij.i(dac.hj, 1, 1, 12, 15),
                     new cij.i(dac.hu, 1, 1, 12, 15),
                     new cij.i(dac.hm, 1, 1, 12, 15),
                     new cij.i(dac.hq, 1, 1, 12, 15),
                     new cij.i(dac.hr, 1, 1, 12, 15),
                     new cij.i(dac.hy, 1, 1, 12, 15),
                     new cij.i(dac.hx, 1, 1, 12, 15),
                     new cij.i(dac.hp, 1, 1, 12, 15),
                     new cij.i(dac.hl, 1, 1, 12, 15),
                     new cij.i(dac.ho, 1, 1, 12, 15),
                     new cij.i(dac.hw, 1, 1, 12, 15),
                     new cij.i(dac.hs, 1, 1, 12, 15),
                     new cij.i(dac.ht, 1, 1, 12, 15),
                     new cij.i(dac.hn, 1, 1, 12, 15),
                     new cij.i(dac.hv, 1, 1, 12, 15),
                     new cij.i(dac.lh, 1, 1, 12, 15),
                     new cij.i(dac.lg, 1, 1, 12, 15),
                     new cij.i(dac.lr, 1, 1, 12, 15),
                     new cij.i(dac.lj, 1, 1, 12, 15),
                     new cij.i(dac.ln, 1, 1, 12, 15),
                     new cij.i(dac.lo, 1, 1, 12, 15),
                     new cij.i(dac.lv, 1, 1, 12, 15),
                     new cij.i(dac.lu, 1, 1, 12, 15),
                     new cij.i(dac.lm, 1, 1, 12, 15),
                     new cij.i(dac.li, 1, 1, 12, 15),
                     new cij.i(dac.ll, 1, 1, 12, 15),
                     new cij.i(dac.lt, 1, 1, 12, 15),
                     new cij.i(dac.lp, 1, 1, 12, 15),
                     new cij.i(dac.lq, 1, 1, 12, 15),
                     new cij.i(dac.lk, 1, 1, 12, 15),
                     new cij.i(dac.ls, 1, 1, 12, 15)
                  },
                  5,
                  new cij.g[]{new cij.i(dac.hf, 1, 1, 12, 30), new cij.i(dac.hd, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<cij.g[]> b = a(
      ImmutableMap.of(
         1,
         new cij.g[]{
            new cij.i(cqn.cS, 2, 1, 5, 1),
            new cij.i(cqn.qP, 4, 1, 5, 1),
            new cij.i(cqn.ft, 2, 1, 5, 1),
            new cij.i(cqn.vO, 5, 1, 5, 1),
            new cij.i(cqn.cN, 1, 1, 12, 1),
            new cij.i(cqn.dI, 1, 1, 8, 1),
            new cij.i(cqn.fj, 1, 1, 4, 1),
            new cij.i(cqn.dJ, 3, 1, 12, 1),
            new cij.i(cqn.eV, 3, 1, 8, 1),
            new cij.i(cqn.dj, 1, 1, 12, 1),
            new cij.i(cqn.dk, 1, 1, 12, 1),
            new cij.i(cqn.dl, 1, 1, 8, 1),
            new cij.i(cqn.dm, 1, 1, 12, 1),
            new cij.i(cqn.dn, 1, 1, 12, 1),
            new cij.i(cqn.do, 1, 1, 12, 1),
            new cij.i(cqn.dp, 1, 1, 12, 1),
            new cij.i(cqn.dq, 1, 1, 12, 1),
            new cij.i(cqn.dr, 1, 1, 12, 1),
            new cij.i(cqn.ds, 1, 1, 12, 1),
            new cij.i(cqn.dt, 1, 1, 12, 1),
            new cij.i(cqn.du, 1, 1, 7, 1),
            new cij.i(cqn.pu, 1, 1, 12, 1),
            new cij.i(cqn.vi, 1, 1, 12, 1),
            new cij.i(cqn.rX, 1, 1, 12, 1),
            new cij.i(cqn.rY, 1, 1, 12, 1),
            new cij.i(cqn.aa, 5, 1, 8, 1),
            new cij.i(cqn.Y, 5, 1, 8, 1),
            new cij.i(cqn.ac, 5, 1, 8, 1),
            new cij.i(cqn.Z, 5, 1, 8, 1),
            new cij.i(cqn.W, 5, 1, 8, 1),
            new cij.i(cqn.X, 5, 1, 8, 1),
            new cij.i(cqn.ab, 5, 1, 8, 1),
            new cij.i(cqn.ad, 5, 1, 8, 1),
            new cij.i(cqn.rv, 1, 3, 12, 1),
            new cij.i(cqn.rh, 1, 3, 12, 1),
            new cij.i(cqn.rs, 1, 3, 12, 1),
            new cij.i(cqn.rn, 1, 3, 12, 1),
            new cij.i(cqn.rw, 1, 3, 12, 1),
            new cij.i(cqn.ru, 1, 3, 12, 1),
            new cij.i(cqn.rp, 1, 3, 12, 1),
            new cij.i(cqn.rj, 1, 3, 12, 1),
            new cij.i(cqn.rl, 1, 3, 12, 1),
            new cij.i(cqn.ro, 1, 3, 12, 1),
            new cij.i(cqn.rr, 1, 3, 12, 1),
            new cij.i(cqn.rk, 1, 3, 12, 1),
            new cij.i(cqn.rm, 1, 3, 12, 1),
            new cij.i(cqn.ri, 1, 3, 12, 1),
            new cij.i(cqn.rt, 1, 3, 12, 1),
            new cij.i(cqn.rq, 1, 3, 12, 1),
            new cij.i(cqn.kw, 3, 1, 8, 1),
            new cij.i(cqn.kx, 3, 1, 8, 1),
            new cij.i(cqn.ky, 3, 1, 8, 1),
            new cij.i(cqn.kz, 3, 1, 8, 1),
            new cij.i(cqn.kv, 3, 1, 8, 1),
            new cij.i(cqn.fU, 1, 1, 12, 1),
            new cij.i(cqn.dz, 1, 1, 12, 1),
            new cij.i(cqn.dA, 1, 1, 12, 1),
            new cij.i(cqn.ga, 1, 2, 5, 1),
            new cij.i(cqn.dP, 1, 2, 5, 1),
            new cij.i(cqn.af, 1, 8, 8, 1),
            new cij.i(cqn.ai, 1, 4, 6, 1),
            new cij.i(cqn.xg, 1, 2, 5, 1),
            new cij.i(cqn.F, 1, 2, 5, 1),
            new cij.i(cqn.dM, 1, 2, 5, 1)
         },
         2,
         new cij.g[]{
            new cij.i(cqn.qH, 5, 1, 4, 1),
            new cij.i(cqn.qE, 5, 1, 4, 1),
            new cij.i(cqn.hU, 3, 1, 6, 1),
            new cij.i(cqn.kU, 6, 1, 6, 1),
            new cij.i(cqn.pt, 1, 1, 8, 1),
            new cij.i(cqn.E, 3, 3, 6, 1)
         }
      )
   );
   private static final cij.l s = new cij.l(8, auz.f, "filled_map.village_desert", eju.a.B, 12, 5);
   private static final cij.l t = new cij.l(8, auz.e, "filled_map.village_savanna", eju.a.D, 12, 5);
   private static final cij.l u = new cij.l(8, auz.g, "filled_map.village_plains", eju.a.C, 12, 5);
   private static final cij.l v = new cij.l(8, auz.h, "filled_map.village_taiga", eju.a.F, 12, 5);
   private static final cij.l w = new cij.l(8, auz.i, "filled_map.village_snowy", eju.a.E, 12, 5);
   private static final cij.l x = new cij.l(8, auz.j, "filled_map.explorer_jungle", eju.a.G, 12, 5);
   private static final cij.l y = new cij.l(8, auz.k, "filled_map.explorer_swamp", eju.a.H, 12, 5);
   public static final Map<cii, Int2ObjectMap<cij.g[]>> c = Map.of(
      cii.k,
      a(
         ImmutableMap.builder()
            .put(1, new cij.g[]{new cij.b(cqn.qN, 24, 16, 2), a(1), new cij.i(dac.cl, 9, 1, 12, 1)})
            .put(2, new cij.g[]{new cij.b(cqn.qO, 4, 12, 10), a(5), new cij.i(cqn.wk, 1, 1, 5)})
            .put(3, new cij.g[]{new cij.b(cqn.re, 5, 12, 20), a(10), new cij.i(cqn.cF, 1, 4, 10)})
            .put(4, new cij.g[]{new cij.b(cqn.tX, 2, 12, 30), new cij.i(cqn.qV, 5, 1, 15), new cij.i(cqn.qR, 4, 1, 15)})
            .put(5, new cij.g[]{a(), new cij.i(cqn.uI, 20, 1, 30)})
            .build()
      ),
      cii.c,
      a(
         ImmutableMap.builder()
            .put(1, new cij.g[]{new cij.b(cqn.ov, 15, 12, 2), new cij.b(cqn.oD, 5, 12, 2)})
            .put(
               2,
               new cij.g[]{
                  cij.m.a(new cij.i(cqn.pI, 4, 1, 12, 5, 0.05F), cik.a, cik.c, cik.d, cik.e, cik.g),
                  cij.m.a(new cij.i(cqn.pE, 4, 1, 12, 5, 0.05F), cik.b, cik.f),
                  cij.m.a(new cij.i(cqn.pF, 5, 1, 12, 5, 0.05F), cik.a, cik.c, cik.d, cik.e, cik.g),
                  cij.m.a(new cij.i(cqn.pB, 5, 1, 12, 5, 0.05F), cik.b, cik.f),
                  cij.m.a(new cij.i(cqn.pH, 7, 1, 12, 5, 0.05F), cik.a, cik.c, cik.d, cik.e, cik.g),
                  cij.m.a(new cij.i(cqn.pD, 7, 1, 12, 5, 0.05F), cik.b, cik.f),
                  cij.m.a(new cij.i(cqn.pG, 9, 1, 12, 5, 0.05F), cik.a, cik.c, cik.d, cik.e, cik.g),
                  cij.m.a(new cij.i(cqn.pC, 9, 1, 12, 5, 0.05F), cik.b, cik.f)
               }
            )
            .put(3, new cij.g[]{new cij.b(cqn.qz, 1, 12, 20), new cij.i(cqn.vp, 5, 1, 12, 10, 0.05F), new cij.i(cqn.wj, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new cij.g[]{
                  cij.m.a(new cij.i(a(cqn.pI, cux.h, 1), 8, 1, 3, 15, 0.05F), cik.a),
                  cij.m.a(new cij.i(a(cqn.pF, cux.h, 1), 9, 1, 3, 15, 0.05F), cik.a),
                  cij.m.a(new cij.i(a(cqn.pH, cux.h, 1), 11, 1, 3, 15, 0.05F), cik.a),
                  cij.m.a(new cij.i(a(cqn.pG, cux.h, 1), 13, 1, 3, 15, 0.05F), cik.a),
                  cij.m.a(new cij.i(a(cqn.pI, cux.a, 1), 8, 1, 3, 15, 0.05F), cik.c),
                  cij.m.a(new cij.i(a(cqn.pF, cux.a, 1), 9, 1, 3, 15, 0.05F), cik.c),
                  cij.m.a(new cij.i(a(cqn.pH, cux.a, 1), 11, 1, 3, 15, 0.05F), cik.c),
                  cij.m.a(new cij.i(a(cqn.pG, cux.a, 1), 13, 1, 3, 15, 0.05F), cik.c),
                  cij.m.a(new cij.i(a(cqn.pI, cux.k, 1), 2, 1, 3, 15, 0.05F), cik.d),
                  cij.m.a(new cij.i(a(cqn.pF, cux.k, 1), 3, 1, 3, 15, 0.05F), cik.d),
                  cij.m.a(new cij.i(a(cqn.pH, cux.k, 1), 5, 1, 3, 15, 0.05F), cik.d),
                  cij.m.a(new cij.i(a(cqn.pG, cux.k, 1), 7, 1, 3, 15, 0.05F), cik.d),
                  cij.m.a(new cij.i(a(cqn.pI, cux.j, 1), 8, 1, 3, 15, 0.05F), cik.e),
                  cij.m.a(new cij.i(a(cqn.pF, cux.g, 1), 9, 1, 3, 15, 0.05F), cik.e),
                  cij.m.a(new cij.i(a(cqn.pE, cux.w, 1), 8, 1, 3, 15, 0.05F), cik.b),
                  cij.m.a(new cij.i(a(cqn.pB, cux.w, 1), 9, 1, 3, 15, 0.05F), cik.b),
                  cij.m.a(new cij.i(a(cqn.pD, cux.w, 1), 11, 1, 3, 15, 0.05F), cik.b),
                  cij.m.a(new cij.i(a(cqn.pC, cux.w, 1), 13, 1, 3, 15, 0.05F), cik.b),
                  cij.m.a(new cij.i(a(cqn.pE, cux.L, 1), 8, 1, 3, 15, 0.05F), cik.f),
                  cij.m.a(new cij.i(a(cqn.pB, cux.L, 1), 9, 1, 3, 15, 0.05F), cik.f),
                  cij.m.a(new cij.i(a(cqn.pD, cux.L, 1), 11, 1, 3, 15, 0.05F), cik.f),
                  cij.m.a(new cij.i(a(cqn.pC, cux.L, 1), 13, 1, 3, 15, 0.05F), cik.f),
                  cij.m.a(new cij.h(cqn.pM, 1, 4, cqn.pL, 1, 3, 15, 0.05F, true), cik.g),
                  cij.m.a(new cij.h(cqn.pL, 1, 4, cqn.pK, 1, 3, 15, 0.05F, true), cik.g),
                  cij.m.a(new cij.h(cqn.pJ, 1, 4, cqn.pM, 1, 3, 15, 0.05F, true), cik.g),
                  cij.m.a(new cij.h(cqn.pK, 1, 2, cqn.pJ, 1, 3, 15, 0.05F, true), cik.g)
               }
            )
            .put(
               5,
               new cij.g[]{
                  cij.m.a(new cij.h(cqn.ox, 4, 16, a(cqn.pK, cux.h, 1), 1, 3, 30, 0.05F), cik.a),
                  cij.m.a(new cij.h(cqn.ox, 3, 16, a(cqn.pL, cux.h, 1), 1, 3, 30, 0.05F), cik.a),
                  cij.m.a(new cij.h(cqn.ox, 3, 16, a(cqn.pL, cux.a, 1), 1, 3, 30, 0.05F), cik.c),
                  cij.m.a(new cij.h(cqn.ox, 2, 12, a(cqn.pM, cux.a, 1), 1, 3, 30, 0.05F), cik.c),
                  cij.m.a(new cij.h(cqn.ox, 2, 6, a(cqn.pJ, cux.k, 1), 1, 3, 30, 0.05F), cik.d),
                  cij.m.a(new cij.h(cqn.ox, 3, 8, a(cqn.pK, cux.k, 1), 1, 3, 30, 0.05F), cik.d),
                  cij.m.a(new cij.h(cqn.ox, 2, 12, a(cqn.pM, cux.j, 1), 1, 3, 30, 0.05F), cik.e),
                  cij.m.a(new cij.h(cqn.ox, 3, 12, a(cqn.pJ, cux.g, 1), 1, 3, 30, 0.05F), cik.e),
                  cij.m.a(new cij.i(a(cqn.pB, cux.e, 1), 9, 1, 3, 30, 0.05F), cik.b),
                  cij.m.a(new cij.i(a(cqn.pE, cux.c, 1), 8, 1, 3, 30, 0.05F), cik.b),
                  cij.m.a(new cij.i(a(cqn.pB, cux.f, 1), 9, 1, 3, 30, 0.05F), cik.f),
                  cij.m.a(new cij.i(a(cqn.pE, cux.i, 1), 8, 1, 3, 30, 0.05F), cik.f),
                  cij.m.a(new cij.h(cqn.ox, 4, 18, a(cqn.pK, cux.d, 1), 1, 3, 30, 0.05F), cik.g),
                  cij.m.a(new cij.h(cqn.ox, 3, 18, a(cqn.pL, cux.d, 1), 1, 3, 30, 0.05F), cik.g),
                  cij.m.a(new cij.b(cqn.aM, 1, 12, 30, 42), cik.g),
                  cij.m.a(new cij.b(cqn.aJ, 1, 12, 30, 4), cik.a, cik.b, cik.c, cik.d, cik.e, cik.f)
               }
            )
            .build()
      ),
      cii.e,
      a(
         ImmutableMap.of(
            1,
            new cij.g[]{new cij.b(cqn.qN, 24, 16, 2), new cij.i(cqn.ug, 7, 1, 1)},
            2,
            new cij.g[]{
               new cij.b(cqn.fS, 11, 16, 10),
               new cij.m(ImmutableMap.builder().put(cik.a, t).put(cik.d, u).put(cik.c, v).put(cik.g, w).put(cik.e, u).put(cik.b, t).put(cik.f, w).build()),
               new cij.m(ImmutableMap.builder().put(cik.a, u).put(cik.d, s).put(cik.c, t).put(cik.g, u).put(cik.e, v).put(cik.b, s).put(cik.f, v).build()),
               new cij.m(
                  ImmutableMap.builder().put(cik.a, x).put(cik.d, x).put(cik.c, new cij.f()).put(cik.g, y).put(cik.e, y).put(cik.b, y).put(cik.f, x).build()
               )
            },
            3,
            new cij.g[]{new cij.b(cqn.qR, 1, 12, 20), new cij.l(13, auz.d, "filled_map.monument", eju.a.j, 12, 10)},
            4,
            new cij.g[]{
               new cij.i(cqn.tZ, 7, 1, 15),
               new cij.i(cqn.uM, 3, 1, 15),
               new cij.i(cqn.uX, 3, 1, 15),
               new cij.i(cqn.uP, 3, 1, 15),
               new cij.i(cqn.va, 3, 1, 15),
               new cij.i(cqn.uS, 3, 1, 15),
               new cij.i(cqn.uZ, 3, 1, 15),
               new cij.i(cqn.uR, 3, 1, 15),
               new cij.i(cqn.uT, 3, 1, 15),
               new cij.i(cqn.vb, 3, 1, 15),
               new cij.i(cqn.uW, 3, 1, 15),
               new cij.i(cqn.uO, 3, 1, 15),
               new cij.i(cqn.uV, 3, 1, 15),
               new cij.i(cqn.uY, 3, 1, 15),
               new cij.i(cqn.uQ, 3, 1, 15),
               new cij.i(cqn.uN, 3, 1, 15),
               new cij.i(cqn.uU, 3, 1, 15)
            },
            5,
            new cij.g[]{new cij.i(cqn.vX, 8, 1, 30), new cij.l(14, auz.c, "filled_map.mansion", eju.a.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<cij.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new cij.g[]{
               new cij.b(a(csk.c), 1, 1, 1),
               new cij.b(cqn.qy, 1, 1, 1, 2),
               new cij.b(cqn.qD, 1, 1, 1, 2),
               new cij.b(cqn.sm, 1, 1, 1, 3),
               new cij.b(cqn.ue, 4, 1, 1),
               new cij.b(cqn.hC, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cij.g[]{
               new cij.i(cqn.hU, 1, 1, 6, 1),
               new cij.i(cqn.kU, 6, 1, 6, 1),
               new cij.i(cqn.pt, 1, 4, 2, 1),
               new cij.i(cqn.E, 3, 3, 6, 1),
               new cij.i(dac.Y, 1, 8, 4, 1),
               new cij.i(dac.W, 1, 8, 4, 1),
               new cij.i(dac.aa, 1, 8, 4, 1),
               new cij.i(dac.X, 1, 8, 4, 1),
               new cij.i(dac.U, 1, 8, 4, 1),
               new cij.i(dac.V, 1, 8, 4, 1),
               new cij.i(dac.Z, 1, 8, 4, 1),
               new cij.e(cqn.pb, 1, 1, 1, 0.2F),
               new cij.i(a(csk.j), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cij.g[]{
               new cij.i(cqn.qH, 3, 1, 4, 1),
               new cij.i(cqn.qE, 3, 1, 4, 1),
               new cij.i(cqn.cS, 2, 1, 5, 1),
               new cij.i(cqn.qP, 4, 1, 5, 1),
               new cij.i(cqn.ft, 2, 1, 5, 1),
               new cij.i(cqn.vO, 5, 1, 5, 1),
               new cij.i(cqn.cN, 1, 1, 12, 1),
               new cij.i(cqn.dI, 1, 1, 8, 1),
               new cij.i(cqn.fj, 1, 1, 4, 1),
               new cij.i(cqn.dJ, 3, 1, 12, 1),
               new cij.i(cqn.eV, 3, 1, 8, 1),
               new cij.i(cqn.dj, 1, 1, 12, 1),
               new cij.i(cqn.dk, 1, 1, 12, 1),
               new cij.i(cqn.dl, 1, 1, 8, 1),
               new cij.i(cqn.dm, 1, 1, 12, 1),
               new cij.i(cqn.dn, 1, 1, 12, 1),
               new cij.i(cqn.do, 1, 1, 12, 1),
               new cij.i(cqn.dp, 1, 1, 12, 1),
               new cij.i(cqn.dq, 1, 1, 12, 1),
               new cij.i(cqn.dr, 1, 1, 12, 1),
               new cij.i(cqn.ds, 1, 1, 12, 1),
               new cij.i(cqn.dt, 1, 1, 12, 1),
               new cij.i(cqn.du, 1, 1, 7, 1),
               new cij.i(cqn.pu, 1, 1, 12, 1),
               new cij.i(cqn.vi, 1, 1, 12, 1),
               new cij.i(cqn.rX, 1, 1, 12, 1),
               new cij.i(cqn.rY, 1, 1, 12, 1),
               new cij.i(cqn.aa, 5, 1, 8, 1),
               new cij.i(cqn.Y, 5, 1, 8, 1),
               new cij.i(cqn.ac, 5, 1, 8, 1),
               new cij.i(cqn.Z, 5, 1, 8, 1),
               new cij.i(cqn.W, 5, 1, 8, 1),
               new cij.i(cqn.X, 5, 1, 8, 1),
               new cij.i(cqn.ab, 5, 1, 8, 1),
               new cij.i(cqn.ad, 5, 1, 8, 1),
               new cij.i(cqn.rv, 1, 3, 12, 1),
               new cij.i(cqn.rh, 1, 3, 12, 1),
               new cij.i(cqn.rs, 1, 3, 12, 1),
               new cij.i(cqn.rn, 1, 3, 12, 1),
               new cij.i(cqn.rw, 1, 3, 12, 1),
               new cij.i(cqn.ru, 1, 3, 12, 1),
               new cij.i(cqn.rp, 1, 3, 12, 1),
               new cij.i(cqn.rj, 1, 3, 12, 1),
               new cij.i(cqn.rl, 1, 3, 12, 1),
               new cij.i(cqn.ro, 1, 3, 12, 1),
               new cij.i(cqn.rr, 1, 3, 12, 1),
               new cij.i(cqn.rk, 1, 3, 12, 1),
               new cij.i(cqn.rm, 1, 3, 12, 1),
               new cij.i(cqn.ri, 1, 3, 12, 1),
               new cij.i(cqn.rt, 1, 3, 12, 1),
               new cij.i(cqn.rq, 1, 3, 12, 1),
               new cij.i(cqn.kw, 3, 1, 8, 1),
               new cij.i(cqn.kx, 3, 1, 8, 1),
               new cij.i(cqn.ky, 3, 1, 8, 1),
               new cij.i(cqn.kz, 3, 1, 8, 1),
               new cij.i(cqn.kv, 3, 1, 8, 1),
               new cij.i(cqn.fU, 1, 3, 4, 1),
               new cij.i(cqn.dz, 1, 3, 4, 1),
               new cij.i(cqn.dA, 1, 3, 4, 1),
               new cij.i(cqn.ga, 1, 5, 2, 1),
               new cij.i(cqn.dP, 1, 2, 5, 1),
               new cij.i(cqn.af, 1, 8, 8, 1),
               new cij.i(cqn.ai, 1, 4, 6, 1),
               new cij.i(cqn.xg, 1, 2, 5, 1),
               new cij.i(cqn.F, 1, 2, 5, 1),
               new cij.i(cqn.dM, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static cij.g a(int $$0) {
      return new cij.m(
         ImmutableMap.builder()
            .put(cik.a, new cij.d($$0, cux.b, cux.h, cux.B))
            .put(cik.b, new cij.d($$0, cux.c, cux.e, cux.y))
            .put(cik.c, new cij.d($$0, cux.z, cux.o, cux.p))
            .put(cik.d, new cij.d($$0, cux.q, cux.k, cux.t))
            .put(cik.e, new cij.d($$0, cux.g, cux.s, cux.j))
            .put(cik.f, new cij.d($$0, cux.i, cux.f, cux.M))
            .put(cik.g, new cij.d($$0, cux.d, cux.r, cux.A))
            .build()
      );
   }

   private static cij.g a() {
      return new cij.m(
         ImmutableMap.builder()
            .put(cik.a, new cij.d(30, 3, 3, cux.u))
            .put(cik.b, new cij.d(30, 2, 2, cux.w))
            .put(cik.c, new cij.d(30, 3, 3, cux.a))
            .put(cik.d, new cij.d(30, 3, 3, cux.n))
            .put(cik.e, new cij.d(30, cux.v))
            .put(cik.f, new cij.d(30, cux.L))
            .put(cik.g, new cij.d(30, 2, 2, cux.x))
            .build()
      );
   }

   private static Int2ObjectMap<cij.g[]> a(ImmutableMap<Integer, cij.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static cqk a(il<csh> $$0) {
      return csj.a(new cqk(cqn.sj), $$0);
   }

   private static cqk a(cqf $$0, cuu $$1, int $$2) {
      cqk $$3 = new cqk($$0);
      $$3.a($$1, $$2);
      return $$3;
   }

   static class a implements cij.g {
      private final cqf a;
      private final int b;
      private final int c;
      private final int d;

      public a(cqf $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(cqf $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public cvx a(bow $$0, axd $$1) {
         cqk $$2 = new cqk(cqn.oy, this.b);
         cqk $$3 = new cqk(this.a);
         if ($$3.a(auv.ba)) {
            List<cpc> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = cpd.a($$3, $$4);
         }

         return new cvx($$2, $$3, this.c, this.d, 0.2F);
      }

      private static cpc a(axd $$0) {
         return cpc.a(cpb.a($$0.a(16)));
      }
   }

   static class b implements cij.g {
      private final cqk a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(cwy $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(cwy $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cqk($$0.l(), $$1), $$2, $$3, $$4);
      }

      public b(cqk $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public cvx a(bow $$0, axd $$1) {
         return new cvx(this.a.q(), new cqk(cqn.oy, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements cij.g {
      private final Map<cik, cqf> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<cik, cqf> $$3) {
         ki.y.s().filter($$1x -> !$$3.containsKey($$1x)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + ki.y.b($$0x));
         });
         this.a = $$3;
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Nullable
      @Override
      public cvx a(bow $$0, axd $$1) {
         if ($$0 instanceof cih $$2) {
            cqk $$3 = new cqk(this.a.get($$2.gy().a()), this.b);
            return new cvx($$3, new cqk(cqn.oy), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements cij.g {
      private final int a;
      private final List<cuu> b;
      private final int c;
      private final int d;

      public d(int $$0) {
         this($$0, ki.f.s().filter(cuu::i).toArray(cuu[]::new));
      }

      public d(int $$0, cuu... $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, cuu... $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = Arrays.asList($$3);
      }

      @Override
      public cvx a(bow $$0, axd $$1) {
         cuu $$2 = this.b.get($$1.a(this.b.size()));
         int $$3 = Math.max($$2.f(), this.c);
         int $$4 = Math.min($$2.a(), this.d);
         int $$5 = aww.a($$1, $$3, $$4);
         cqk $$6 = cph.a(new cuw($$2, $$5));
         int $$7 = 2 + $$1.a(5 + $$5 * 10) + 3 * $$5;
         if ($$2.b()) {
            $$7 *= 2;
         }

         if ($$7 > 64) {
            $$7 = 64;
         }

         return new cvx(new cqk(cqn.oy, $$7), new cqk(cqn.qO), $$6, 12, this.a, 0.2F);
      }
   }

   static class e implements cij.g {
      private final cqk a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(cqf $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(cqf $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new cqk($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public cvx a(bow $$0, axd $$1) {
         int $$2 = 5 + $$1.a(15);
         cqk $$3 = cuv.a($$1, new cqk(this.a.d()), $$2, false);
         int $$4 = Math.min(this.b + $$2, 64);
         cqk $$5 = new cqk(cqn.oy, $$4);
         return new cvx($$5, $$3, this.c, this.d, this.e);
      }
   }

   static class f implements cij.g {
      @Override
      public cvx a(bow $$0, axd $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      cvx a(bow var1, axd var2);
   }

   static class h implements cij.g {
      private final cqk a;
      private final int b;
      private final cqk c;
      private final int d;
      private final int e;
      private final float f;
      private final boolean g;

      public h(cwy $$0, int $$1, int $$2, cqf $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new cqk($$3), $$4, $$5, $$6, $$7, false);
      }

      public h(cwy $$0, int $$1, int $$2, cqf $$3, int $$4, int $$5, int $$6, float $$7, boolean $$8) {
         this($$0, $$1, $$2, new cqk($$3), $$4, $$5, $$6, $$7, $$8);
      }

      public h(cwy $$0, int $$1, int $$2, cqk $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, false);
      }

      private h(cwy $$0, int $$1, int $$2, cqk $$3, int $$4, int $$5, int $$6, float $$7, boolean $$8) {
         this.a = new cqk($$0, $$1);
         this.b = $$2;
         this.c = $$3.c($$4);
         this.d = $$5;
         this.e = $$6;
         this.f = $$7;
         this.g = $$8;
      }

      @Nullable
      @Override
      public cvx a(bow $$0, axd $$1) {
         return new cvx(new cqk(cqn.oy, this.b), this.a.q(), this.c.q(), 0, this.d, this.e, this.f, 0, this.g);
      }
   }

   static class i implements cij.g {
      private final cqk a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public i(daa $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cqk($$0), $$1, $$2, $$3, $$4);
      }

      public i(cqf $$0, int $$1, int $$2, int $$3) {
         this(new cqk($$0), $$1, $$2, 12, $$3);
      }

      public i(cqf $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cqk($$0), $$1, $$2, $$3, $$4);
      }

      public i(cqk $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(cqf $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new cqk($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(cqk $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.a.f($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
      }

      @Override
      public cvx a(bow $$0, axd $$1) {
         return new cvx(new cqk(cqn.oy, this.b), this.a.q(), this.c, this.d, this.e);
      }
   }

   static class j implements cij.g {
      private final List<dib.a> a;
      private final int b;
      private final float c;

      public j(il<boh> $$0, int $$1, int $$2) {
         this(List.of(new dib.a($$0, $$1)), $$2, 0.05F);
      }

      public j(List<dib.a> $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public cvx a(bow $$0, axd $$1) {
         cqk $$2 = new cqk(cqn.vR, 1);
         cru.a($$2, this.a);
         return new cvx(new cqk(cqn.oy, 1), $$2, 12, this.b, this.c);
      }
   }

   static class k implements cij.g {
      private final cqk a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final cqf f;
      private final int g;
      private final float h;

      public k(cqf $$0, int $$1, cqf $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new cqk($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public cvx a(bow $$0, axd $$1) {
         cqk $$2 = new cqk(cqn.oy, this.c);
         List<il<csh>> $$3 = ki.i.h().filter($$0x -> !((csh)$$0x.a()).a().isEmpty() && csi.a($$0x)).collect(Collectors.toList());
         il<csh> $$4 = ac.a($$3, $$1);
         cqk $$5 = csj.a(new cqk(this.a.d(), this.b), $$4);
         return new cvx($$2, new cqk(this.f, this.g), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements cij.g {
      private final int a;
      private final avd<edc> b;
      private final String c;
      private final eju.a d;
      private final int e;
      private final int f;

      public l(int $$0, avd<edc> $$1, String $$2, eju.a $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public cvx a(bow $$0, axd $$1) {
         if (!($$0.dM() instanceof apf)) {
            return null;
         } else {
            apf $$2 = (apf)$$0.dM();
            ib $$3 = $$2.a(this.b, $$0.dm(), 100, true);
            if ($$3 != null) {
               cqk $$4 = cqr.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               cqr.a($$2, $$4);
               ejy.a($$4, $$3, "+", this.d);
               $$4.a(vu.c(this.c));
               return new cvx(new cqk(cqn.oy, this.a), new cqk(cqn.qR), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static record m(Map<cik, cij.g> a) implements cij.g {
      public static cij.m a(cij.g $$0, cik... $$1) {
         return new cij.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public cvx a(bow $$0, axd $$1) {
         if ($$0 instanceof cih $$2) {
            cik $$3 = $$2.gy().a();
            cij.g $$4 = this.a.get($$3);
            return $$4 == null ? null : $$4.a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
