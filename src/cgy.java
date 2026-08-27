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

public class cgy {
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
   public static final Map<cgx, Int2ObjectMap<cgy.g[]>> a = ac.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            cgx.g,
            a(
               ImmutableMap.of(
                  1,
                  new cgy.g[]{
                     new cgy.b(cpc.pv, 20, 16, 2),
                     new cgy.b(cpc.uc, 26, 16, 2),
                     new cgy.b(cpc.ub, 22, 16, 2),
                     new cgy.b(cpc.vg, 15, 16, 2),
                     new cgy.i(cpc.pw, 1, 6, 16, 1)
                  },
                  2,
                  new cgy.g[]{new cgy.b(cyq.eZ, 6, 12, 10), new cgy.i(cpc.up, 1, 4, 5), new cgy.i(cpc.os, 1, 4, 16, 5)},
                  3,
                  new cgy.g[]{new cgy.i(cpc.rR, 3, 18, 10), new cgy.b(cyq.fa, 4, 12, 20)},
                  4,
                  new cgy.g[]{
                     new cgy.i(cyq.eg, 1, 1, 12, 15),
                     new cgy.j(bnd.p, 100, 15),
                     new cgy.j(bnd.h, 160, 15),
                     new cgy.j(bnd.r, 140, 15),
                     new cgy.j(bnd.o, 120, 15),
                     new cgy.j(bnd.s, 280, 15),
                     new cgy.j(bnd.w, 7, 15)
                  },
                  5,
                  new cgy.g[]{new cgy.i(cpc.ug, 3, 3, 30), new cgy.i(cpc.ss, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            cgx.h,
            a(
               ImmutableMap.of(
                  1,
                  new cgy.g[]{
                     new cgy.b(cpc.pr, 20, 16, 2),
                     new cgy.b(cpc.ov, 10, 16, 2),
                     new cgy.h(cpc.qY, 6, 1, cpc.rc, 6, 16, 1, 0.05F),
                     new cgy.i(cpc.qG, 3, 1, 16, 1)
                  },
                  2,
                  new cgy.g[]{new cgy.b(cpc.qY, 15, 16, 10), new cgy.h(cpc.qZ, 6, 1, cpc.rd, 6, 16, 5, 0.05F), new cgy.i(cpc.wn, 2, 1, 5)},
                  3,
                  new cgy.g[]{new cgy.b(cpc.qZ, 13, 16, 20), new cgy.e(cpc.qU, 3, 3, 10, 0.2F)},
                  4,
                  new cgy.g[]{new cgy.b(cpc.ra, 6, 12, 30)},
                  5,
                  new cgy.g[]{
                     new cgy.b(cpc.rb, 4, 12, 30),
                     new cgy.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(cgz.c, cpc.nT)
                           .put(cgz.g, cpc.nV)
                           .put(cgz.e, cpc.nV)
                           .put(cgz.a, cpc.nZ)
                           .put(cgz.b, cpc.nZ)
                           .put(cgz.d, cpc.ob)
                           .put(cgz.f, cpc.of)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            cgx.n,
            a(
               ImmutableMap.of(
                  1,
                  new cgy.g[]{
                     new cgy.b(cyq.bA, 18, 16, 2),
                     new cgy.b(cyq.bM, 18, 16, 2),
                     new cgy.b(cyq.bP, 18, 16, 2),
                     new cgy.b(cyq.bH, 18, 16, 2),
                     new cgy.i(cpc.rU, 2, 1, 1)
                  },
                  2,
                  new cgy.g[]{
                     new cgy.b(cpc.rh, 12, 16, 10),
                     new cgy.b(cpc.ro, 12, 16, 10),
                     new cgy.b(cpc.rw, 12, 16, 10),
                     new cgy.b(cpc.rk, 12, 16, 10),
                     new cgy.b(cpc.rm, 12, 16, 10),
                     new cgy.i(cyq.bA, 1, 1, 16, 5),
                     new cgy.i(cyq.bB, 1, 1, 16, 5),
                     new cgy.i(cyq.bC, 1, 1, 16, 5),
                     new cgy.i(cyq.bD, 1, 1, 16, 5),
                     new cgy.i(cyq.bE, 1, 1, 16, 5),
                     new cgy.i(cyq.bF, 1, 1, 16, 5),
                     new cgy.i(cyq.bG, 1, 1, 16, 5),
                     new cgy.i(cyq.bH, 1, 1, 16, 5),
                     new cgy.i(cyq.bI, 1, 1, 16, 5),
                     new cgy.i(cyq.bJ, 1, 1, 16, 5),
                     new cgy.i(cyq.bK, 1, 1, 16, 5),
                     new cgy.i(cyq.bL, 1, 1, 16, 5),
                     new cgy.i(cyq.bM, 1, 1, 16, 5),
                     new cgy.i(cyq.bN, 1, 1, 16, 5),
                     new cgy.i(cyq.bO, 1, 1, 16, 5),
                     new cgy.i(cyq.bP, 1, 1, 16, 5),
                     new cgy.i(cyq.ik, 1, 4, 16, 5),
                     new cgy.i(cyq.il, 1, 4, 16, 5),
                     new cgy.i(cyq.im, 1, 4, 16, 5),
                     new cgy.i(cyq.in, 1, 4, 16, 5),
                     new cgy.i(cyq.io, 1, 4, 16, 5),
                     new cgy.i(cyq.ip, 1, 4, 16, 5),
                     new cgy.i(cyq.iq, 1, 4, 16, 5),
                     new cgy.i(cyq.ir, 1, 4, 16, 5),
                     new cgy.i(cyq.is, 1, 4, 16, 5),
                     new cgy.i(cyq.it, 1, 4, 16, 5),
                     new cgy.i(cyq.iu, 1, 4, 16, 5),
                     new cgy.i(cyq.iv, 1, 4, 16, 5),
                     new cgy.i(cyq.iw, 1, 4, 16, 5),
                     new cgy.i(cyq.ix, 1, 4, 16, 5),
                     new cgy.i(cyq.iy, 1, 4, 16, 5),
                     new cgy.i(cyq.iz, 1, 4, 16, 5)
                  },
                  3,
                  new cgy.g[]{
                     new cgy.b(cpc.rl, 12, 16, 20),
                     new cgy.b(cpc.rp, 12, 16, 20),
                     new cgy.b(cpc.ri, 12, 16, 20),
                     new cgy.b(cpc.rv, 12, 16, 20),
                     new cgy.b(cpc.rn, 12, 16, 20),
                     new cgy.i(cyq.aZ, 3, 1, 12, 10),
                     new cgy.i(cyq.bd, 3, 1, 12, 10),
                     new cgy.i(cyq.bn, 3, 1, 12, 10),
                     new cgy.i(cyq.bo, 3, 1, 12, 10),
                     new cgy.i(cyq.bk, 3, 1, 12, 10),
                     new cgy.i(cyq.bl, 3, 1, 12, 10),
                     new cgy.i(cyq.bi, 3, 1, 12, 10),
                     new cgy.i(cyq.bg, 3, 1, 12, 10),
                     new cgy.i(cyq.bm, 3, 1, 12, 10),
                     new cgy.i(cyq.bc, 3, 1, 12, 10),
                     new cgy.i(cyq.bh, 3, 1, 12, 10),
                     new cgy.i(cyq.be, 3, 1, 12, 10),
                     new cgy.i(cyq.bb, 3, 1, 12, 10),
                     new cgy.i(cyq.ba, 3, 1, 12, 10),
                     new cgy.i(cyq.bf, 3, 1, 12, 10),
                     new cgy.i(cyq.bj, 3, 1, 12, 10)
                  },
                  4,
                  new cgy.g[]{
                     new cgy.b(cpc.rt, 12, 16, 30),
                     new cgy.b(cpc.rr, 12, 16, 30),
                     new cgy.b(cpc.rs, 12, 16, 30),
                     new cgy.b(cpc.ru, 12, 16, 30),
                     new cgy.b(cpc.rj, 12, 16, 30),
                     new cgy.b(cpc.rq, 12, 16, 30),
                     new cgy.i(cpc.uL, 3, 1, 12, 15),
                     new cgy.i(cpc.uW, 3, 1, 12, 15),
                     new cgy.i(cpc.uO, 3, 1, 12, 15),
                     new cgy.i(cpc.uZ, 3, 1, 12, 15),
                     new cgy.i(cpc.uR, 3, 1, 12, 15),
                     new cgy.i(cpc.uY, 3, 1, 12, 15),
                     new cgy.i(cpc.uQ, 3, 1, 12, 15),
                     new cgy.i(cpc.uS, 3, 1, 12, 15),
                     new cgy.i(cpc.va, 3, 1, 12, 15),
                     new cgy.i(cpc.uV, 3, 1, 12, 15),
                     new cgy.i(cpc.uN, 3, 1, 12, 15),
                     new cgy.i(cpc.uU, 3, 1, 12, 15),
                     new cgy.i(cpc.uX, 3, 1, 12, 15),
                     new cgy.i(cpc.uP, 3, 1, 12, 15),
                     new cgy.i(cpc.uM, 3, 1, 12, 15),
                     new cgy.i(cpc.uT, 3, 1, 12, 15)
                  },
                  5,
                  new cgy.g[]{new cgy.i(cpc.pY, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            cgx.i,
            a(
               ImmutableMap.of(
                  1,
                  new cgy.g[]{new cgy.b(cpc.po, 32, 16, 2), new cgy.i(cpc.ou, 1, 16, 1), new cgy.h(cyq.L, 10, 1, cpc.pV, 10, 12, 1, 0.05F)},
                  2,
                  new cgy.g[]{new cgy.b(cpc.pV, 26, 12, 10), new cgy.i(cpc.ot, 2, 1, 5)},
                  3,
                  new cgy.g[]{new cgy.b(cpc.pr, 14, 16, 20), new cgy.i(cpc.vP, 3, 1, 10)},
                  4,
                  new cgy.g[]{new cgy.b(cpc.ps, 24, 16, 30), new cgy.e(cpc.ot, 2, 3, 15)},
                  5,
                  new cgy.g[]{new cgy.b(cpc.ma, 8, 12, 30), new cgy.e(cpc.vP, 3, 3, 15), new cgy.k(cpc.ou, 5, cpc.vm, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            cgx.k,
            a(
               ImmutableMap.builder()
                  .put(1, new cgy.g[]{new cgy.b(cpc.qN, 24, 16, 2), new cgy.d(1), new cgy.i(cyq.cl, 9, 1, 12, 1)})
                  .put(2, new cgy.g[]{new cgy.b(cpc.qO, 4, 12, 10), new cgy.d(5), new cgy.i(cpc.wj, 1, 1, 5)})
                  .put(3, new cgy.g[]{new cgy.b(cpc.re, 5, 12, 20), new cgy.d(10), new cgy.i(cpc.cF, 1, 4, 10)})
                  .put(4, new cgy.g[]{new cgy.b(cpc.tW, 2, 12, 30), new cgy.d(15), new cgy.i(cpc.qV, 5, 1, 15), new cgy.i(cpc.qR, 4, 1, 15)})
                  .put(5, new cgy.g[]{new cgy.i(cpc.uH, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            cgx.e,
            a(
               ImmutableMap.of(
                  1,
                  new cgy.g[]{new cgy.b(cpc.qN, 24, 16, 2), new cgy.i(cpc.uf, 7, 1, 1)},
                  2,
                  new cgy.g[]{new cgy.b(cpc.fS, 11, 16, 10), new cgy.l(13, auk.d, "filled_map.monument", ehw.a.j, 12, 5)},
                  3,
                  new cgy.g[]{new cgy.b(cpc.qR, 1, 12, 20), new cgy.l(14, auk.c, "filled_map.mansion", ehw.a.i, 12, 10)},
                  4,
                  new cgy.g[]{
                     new cgy.i(cpc.tY, 7, 1, 15),
                     new cgy.i(cpc.uL, 3, 1, 15),
                     new cgy.i(cpc.uW, 3, 1, 15),
                     new cgy.i(cpc.uO, 3, 1, 15),
                     new cgy.i(cpc.uZ, 3, 1, 15),
                     new cgy.i(cpc.uR, 3, 1, 15),
                     new cgy.i(cpc.uY, 3, 1, 15),
                     new cgy.i(cpc.uQ, 3, 1, 15),
                     new cgy.i(cpc.uS, 3, 1, 15),
                     new cgy.i(cpc.va, 3, 1, 15),
                     new cgy.i(cpc.uV, 3, 1, 15),
                     new cgy.i(cpc.uN, 3, 1, 15),
                     new cgy.i(cpc.uU, 3, 1, 15),
                     new cgy.i(cpc.uX, 3, 1, 15),
                     new cgy.i(cpc.uP, 3, 1, 15),
                     new cgy.i(cpc.uM, 3, 1, 15),
                     new cgy.i(cpc.uT, 3, 1, 15)
                  },
                  5,
                  new cgy.g[]{new cgy.i(cpc.vW, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            cgx.f,
            a(
               ImmutableMap.of(
                  1,
                  new cgy.g[]{new cgy.b(cpc.sd, 32, 16, 2), new cgy.i(cpc.lG, 1, 2, 1)},
                  2,
                  new cgy.g[]{new cgy.b(cpc.oH, 3, 12, 10), new cgy.i(cpc.oz, 1, 1, 5)},
                  3,
                  new cgy.g[]{new cgy.b(cpc.uz, 2, 12, 20), new cgy.i(cyq.ec, 4, 1, 12, 10)},
                  4,
                  new cgy.g[]{new cgy.b(cpc.oo, 4, 12, 30), new cgy.b(cpc.sk, 9, 12, 30), new cgy.i(cpc.se, 5, 1, 15)},
                  5,
                  new cgy.g[]{new cgy.b(cpc.si, 22, 12, 30), new cgy.i(cpc.tU, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            cgx.c,
            a(
               ImmutableMap.of(
                  1,
                  new cgy.g[]{
                     new cgy.b(cpc.ov, 15, 16, 2),
                     new cgy.i(new coz(cpc.pH), 7, 1, 12, 1, 0.2F),
                     new cgy.i(new coz(cpc.pI), 4, 1, 12, 1, 0.2F),
                     new cgy.i(new coz(cpc.pF), 5, 1, 12, 1, 0.2F),
                     new cgy.i(new coz(cpc.pG), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cgy.g[]{
                     new cgy.b(cpc.oD, 4, 12, 10),
                     new cgy.i(new coz(cpc.wi), 36, 1, 12, 5, 0.2F),
                     new cgy.i(new coz(cpc.pE), 1, 1, 12, 5, 0.2F),
                     new cgy.i(new coz(cpc.pD), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new cgy.g[]{
                     new cgy.b(cpc.qz, 1, 12, 20),
                     new cgy.b(cpc.ox, 1, 12, 20),
                     new cgy.i(new coz(cpc.pB), 1, 1, 12, 10, 0.2F),
                     new cgy.i(new coz(cpc.pC), 4, 1, 12, 10, 0.2F),
                     new cgy.i(new coz(cpc.vo), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new cgy.g[]{new cgy.e(cpc.pL, 14, 3, 15, 0.2F), new cgy.e(cpc.pM, 8, 3, 15, 0.2F)},
                  5,
                  new cgy.g[]{new cgy.e(cpc.pJ, 8, 3, 30, 0.2F), new cgy.e(cpc.pK, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cgx.p,
            a(
               ImmutableMap.of(
                  1,
                  new cgy.g[]{new cgy.b(cpc.ov, 15, 16, 2), new cgy.i(new coz(cpc.pc), 3, 1, 12, 1, 0.2F), new cgy.e(cpc.oZ, 2, 3, 1)},
                  2,
                  new cgy.g[]{new cgy.b(cpc.oD, 4, 12, 10), new cgy.i(new coz(cpc.wi), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cgy.g[]{new cgy.b(cpc.pV, 24, 12, 20)},
                  4,
                  new cgy.g[]{new cgy.b(cpc.ox, 1, 12, 30), new cgy.e(cpc.ph, 12, 3, 15, 0.2F)},
                  5,
                  new cgy.g[]{new cgy.e(cpc.pe, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cgx.o,
            a(
               ImmutableMap.of(
                  1,
                  new cgy.g[]{
                     new cgy.b(cpc.ov, 15, 16, 2),
                     new cgy.i(new coz(cpc.oS), 1, 1, 12, 1, 0.2F),
                     new cgy.i(new coz(cpc.oQ), 1, 1, 12, 1, 0.2F),
                     new cgy.i(new coz(cpc.oR), 1, 1, 12, 1, 0.2F),
                     new cgy.i(new coz(cpc.oT), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cgy.g[]{new cgy.b(cpc.oD, 4, 12, 10), new cgy.i(new coz(cpc.wi), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cgy.g[]{
                     new cgy.b(cpc.pV, 30, 12, 20),
                     new cgy.e(cpc.pc, 1, 3, 10, 0.2F),
                     new cgy.e(cpc.pa, 2, 3, 10, 0.2F),
                     new cgy.e(cpc.pb, 3, 3, 10, 0.2F),
                     new cgy.i(new coz(cpc.pi), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new cgy.g[]{new cgy.b(cpc.ox, 1, 12, 30), new cgy.e(cpc.ph, 12, 3, 15, 0.2F), new cgy.e(cpc.pf, 5, 3, 15, 0.2F)},
                  5,
                  new cgy.g[]{new cgy.e(cpc.pg, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cgx.d,
            a(
               ImmutableMap.of(
                  1,
                  new cgy.g[]{new cgy.b(cpc.sb, 14, 16, 2), new cgy.b(cpc.pW, 7, 16, 2), new cgy.b(cpc.uw, 4, 16, 2), new cgy.i(cpc.uy, 1, 1, 1)},
                  2,
                  new cgy.g[]{new cgy.b(cpc.ov, 15, 16, 2), new cgy.i(cpc.pX, 1, 5, 16, 5), new cgy.i(cpc.sc, 1, 8, 16, 5)},
                  3,
                  new cgy.g[]{new cgy.b(cpc.uJ, 7, 16, 20), new cgy.b(cpc.rZ, 10, 16, 20)},
                  4,
                  new cgy.g[]{new cgy.b(cpc.qM, 10, 12, 30)},
                  5,
                  new cgy.g[]{new cgy.b(cpc.wl, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            cgx.j,
            a(
               ImmutableMap.of(
                  1,
                  new cgy.g[]{new cgy.b(cpc.qC, 6, 16, 2), new cgy.a(cpc.pz, 3), new cgy.a(cpc.py, 7)},
                  2,
                  new cgy.g[]{new cgy.b(cpc.pV, 26, 12, 10), new cgy.a(cpc.px, 5, 12, 5), new cgy.a(cpc.pA, 4, 12, 5)},
                  3,
                  new cgy.g[]{new cgy.b(cpc.uA, 9, 12, 20), new cgy.a(cpc.py, 7)},
                  4,
                  new cgy.g[]{new cgy.b(cpc.oo, 4, 12, 30), new cgy.a(cpc.uF, 6, 12, 15)},
                  5,
                  new cgy.g[]{new cgy.i(new coz(cpc.nK), 6, 1, 12, 30, 0.2F), new cgy.a(cpc.px, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            cgx.l,
            a(
               ImmutableMap.of(
                  1,
                  new cgy.g[]{new cgy.b(cpc.qL, 10, 16, 2), new cgy.i(cpc.qK, 1, 10, 16, 1)},
                  2,
                  new cgy.g[]{new cgy.b(cyq.b, 20, 16, 10), new cgy.i(cyq.eK, 1, 4, 16, 5)},
                  3,
                  new cgy.g[]{
                     new cgy.b(cyq.c, 16, 16, 20),
                     new cgy.b(cyq.g, 16, 16, 20),
                     new cgy.b(cyq.e, 16, 16, 20),
                     new cgy.i(cyq.su, 1, 4, 16, 10),
                     new cgy.i(cyq.h, 1, 4, 16, 10),
                     new cgy.i(cyq.f, 1, 4, 16, 10),
                     new cgy.i(cyq.d, 1, 4, 16, 10)
                  },
                  4,
                  new cgy.g[]{
                     new cgy.b(cpc.oA, 12, 12, 30),
                     new cgy.i(cyq.hk, 1, 1, 12, 15),
                     new cgy.i(cyq.hj, 1, 1, 12, 15),
                     new cgy.i(cyq.hu, 1, 1, 12, 15),
                     new cgy.i(cyq.hm, 1, 1, 12, 15),
                     new cgy.i(cyq.hq, 1, 1, 12, 15),
                     new cgy.i(cyq.hr, 1, 1, 12, 15),
                     new cgy.i(cyq.hy, 1, 1, 12, 15),
                     new cgy.i(cyq.hx, 1, 1, 12, 15),
                     new cgy.i(cyq.hp, 1, 1, 12, 15),
                     new cgy.i(cyq.hl, 1, 1, 12, 15),
                     new cgy.i(cyq.ho, 1, 1, 12, 15),
                     new cgy.i(cyq.hw, 1, 1, 12, 15),
                     new cgy.i(cyq.hs, 1, 1, 12, 15),
                     new cgy.i(cyq.ht, 1, 1, 12, 15),
                     new cgy.i(cyq.hn, 1, 1, 12, 15),
                     new cgy.i(cyq.hv, 1, 1, 12, 15),
                     new cgy.i(cyq.lh, 1, 1, 12, 15),
                     new cgy.i(cyq.lg, 1, 1, 12, 15),
                     new cgy.i(cyq.lr, 1, 1, 12, 15),
                     new cgy.i(cyq.lj, 1, 1, 12, 15),
                     new cgy.i(cyq.ln, 1, 1, 12, 15),
                     new cgy.i(cyq.lo, 1, 1, 12, 15),
                     new cgy.i(cyq.lv, 1, 1, 12, 15),
                     new cgy.i(cyq.lu, 1, 1, 12, 15),
                     new cgy.i(cyq.lm, 1, 1, 12, 15),
                     new cgy.i(cyq.li, 1, 1, 12, 15),
                     new cgy.i(cyq.ll, 1, 1, 12, 15),
                     new cgy.i(cyq.lt, 1, 1, 12, 15),
                     new cgy.i(cyq.lp, 1, 1, 12, 15),
                     new cgy.i(cyq.lq, 1, 1, 12, 15),
                     new cgy.i(cyq.lk, 1, 1, 12, 15),
                     new cgy.i(cyq.ls, 1, 1, 12, 15)
                  },
                  5,
                  new cgy.g[]{new cgy.i(cyq.hf, 1, 1, 12, 30), new cgy.i(cyq.hd, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<cgy.g[]> b = a(
      ImmutableMap.of(
         1,
         new cgy.g[]{
            new cgy.i(cpc.cS, 2, 1, 5, 1),
            new cgy.i(cpc.qP, 4, 1, 5, 1),
            new cgy.i(cpc.ft, 2, 1, 5, 1),
            new cgy.i(cpc.vN, 5, 1, 5, 1),
            new cgy.i(cpc.cN, 1, 1, 12, 1),
            new cgy.i(cpc.dI, 1, 1, 8, 1),
            new cgy.i(cpc.fj, 1, 1, 4, 1),
            new cgy.i(cpc.dJ, 3, 1, 12, 1),
            new cgy.i(cpc.eV, 3, 1, 8, 1),
            new cgy.i(cpc.dj, 1, 1, 12, 1),
            new cgy.i(cpc.dk, 1, 1, 12, 1),
            new cgy.i(cpc.dl, 1, 1, 8, 1),
            new cgy.i(cpc.dm, 1, 1, 12, 1),
            new cgy.i(cpc.dn, 1, 1, 12, 1),
            new cgy.i(cpc.do, 1, 1, 12, 1),
            new cgy.i(cpc.dp, 1, 1, 12, 1),
            new cgy.i(cpc.dq, 1, 1, 12, 1),
            new cgy.i(cpc.dr, 1, 1, 12, 1),
            new cgy.i(cpc.ds, 1, 1, 12, 1),
            new cgy.i(cpc.dt, 1, 1, 12, 1),
            new cgy.i(cpc.du, 1, 1, 7, 1),
            new cgy.i(cpc.pu, 1, 1, 12, 1),
            new cgy.i(cpc.vh, 1, 1, 12, 1),
            new cgy.i(cpc.rX, 1, 1, 12, 1),
            new cgy.i(cpc.rY, 1, 1, 12, 1),
            new cgy.i(cpc.aa, 5, 1, 8, 1),
            new cgy.i(cpc.Y, 5, 1, 8, 1),
            new cgy.i(cpc.ac, 5, 1, 8, 1),
            new cgy.i(cpc.Z, 5, 1, 8, 1),
            new cgy.i(cpc.W, 5, 1, 8, 1),
            new cgy.i(cpc.X, 5, 1, 8, 1),
            new cgy.i(cpc.ab, 5, 1, 8, 1),
            new cgy.i(cpc.ad, 5, 1, 8, 1),
            new cgy.i(cpc.rv, 1, 3, 12, 1),
            new cgy.i(cpc.rh, 1, 3, 12, 1),
            new cgy.i(cpc.rs, 1, 3, 12, 1),
            new cgy.i(cpc.rn, 1, 3, 12, 1),
            new cgy.i(cpc.rw, 1, 3, 12, 1),
            new cgy.i(cpc.ru, 1, 3, 12, 1),
            new cgy.i(cpc.rp, 1, 3, 12, 1),
            new cgy.i(cpc.rj, 1, 3, 12, 1),
            new cgy.i(cpc.rl, 1, 3, 12, 1),
            new cgy.i(cpc.ro, 1, 3, 12, 1),
            new cgy.i(cpc.rr, 1, 3, 12, 1),
            new cgy.i(cpc.rk, 1, 3, 12, 1),
            new cgy.i(cpc.rm, 1, 3, 12, 1),
            new cgy.i(cpc.ri, 1, 3, 12, 1),
            new cgy.i(cpc.rt, 1, 3, 12, 1),
            new cgy.i(cpc.rq, 1, 3, 12, 1),
            new cgy.i(cpc.kw, 3, 1, 8, 1),
            new cgy.i(cpc.kx, 3, 1, 8, 1),
            new cgy.i(cpc.ky, 3, 1, 8, 1),
            new cgy.i(cpc.kz, 3, 1, 8, 1),
            new cgy.i(cpc.kv, 3, 1, 8, 1),
            new cgy.i(cpc.fU, 1, 1, 12, 1),
            new cgy.i(cpc.dz, 1, 1, 12, 1),
            new cgy.i(cpc.dA, 1, 1, 12, 1),
            new cgy.i(cpc.ga, 1, 2, 5, 1),
            new cgy.i(cpc.dP, 1, 2, 5, 1),
            new cgy.i(cpc.af, 1, 8, 8, 1),
            new cgy.i(cpc.ai, 1, 4, 6, 1),
            new cgy.i(cpc.xf, 1, 2, 5, 1),
            new cgy.i(cpc.F, 1, 2, 5, 1),
            new cgy.i(cpc.dM, 1, 2, 5, 1)
         },
         2,
         new cgy.g[]{
            new cgy.i(cpc.qH, 5, 1, 4, 1),
            new cgy.i(cpc.qE, 5, 1, 4, 1),
            new cgy.i(cpc.hU, 3, 1, 6, 1),
            new cgy.i(cpc.kU, 6, 1, 6, 1),
            new cgy.i(cpc.pt, 1, 1, 8, 1),
            new cgy.i(cpc.E, 3, 3, 6, 1)
         }
      )
   );
   private static final cgy.l s = new cgy.l(8, auk.f, "filled_map.village_desert", ehw.a.B, 12, 5);
   private static final cgy.l t = new cgy.l(8, auk.e, "filled_map.village_savanna", ehw.a.D, 12, 5);
   private static final cgy.l u = new cgy.l(8, auk.g, "filled_map.village_plains", ehw.a.C, 12, 5);
   private static final cgy.l v = new cgy.l(8, auk.h, "filled_map.village_taiga", ehw.a.F, 12, 5);
   private static final cgy.l w = new cgy.l(8, auk.i, "filled_map.village_snowy", ehw.a.E, 12, 5);
   private static final cgy.l x = new cgy.l(8, auk.j, "filled_map.explorer_jungle", ehw.a.G, 12, 5);
   private static final cgy.l y = new cgy.l(8, auk.k, "filled_map.explorer_swamp", ehw.a.H, 12, 5);
   public static final Map<cgx, Int2ObjectMap<cgy.g[]>> c = Map.of(
      cgx.k,
      a(
         ImmutableMap.builder()
            .put(1, new cgy.g[]{new cgy.b(cpc.qN, 24, 16, 2), a(1), new cgy.i(cyq.cl, 9, 1, 12, 1)})
            .put(2, new cgy.g[]{new cgy.b(cpc.qO, 4, 12, 10), a(5), new cgy.i(cpc.wj, 1, 1, 5)})
            .put(3, new cgy.g[]{new cgy.b(cpc.re, 5, 12, 20), a(10), new cgy.i(cpc.cF, 1, 4, 10)})
            .put(4, new cgy.g[]{new cgy.b(cpc.tW, 2, 12, 30), new cgy.i(cpc.qV, 5, 1, 15), new cgy.i(cpc.qR, 4, 1, 15)})
            .put(5, new cgy.g[]{a(), new cgy.i(cpc.uH, 20, 1, 30)})
            .build()
      ),
      cgx.c,
      a(
         ImmutableMap.builder()
            .put(1, new cgy.g[]{new cgy.b(cpc.ov, 15, 12, 2), new cgy.b(cpc.oD, 5, 12, 2)})
            .put(
               2,
               new cgy.g[]{
                  cgy.m.a(new cgy.i(cpc.pI, 4, 1, 12, 5, 0.05F), cgz.a, cgz.c, cgz.d, cgz.e, cgz.g),
                  cgy.m.a(new cgy.i(cpc.pE, 4, 1, 12, 5, 0.05F), cgz.b, cgz.f),
                  cgy.m.a(new cgy.i(cpc.pF, 5, 1, 12, 5, 0.05F), cgz.a, cgz.c, cgz.d, cgz.e, cgz.g),
                  cgy.m.a(new cgy.i(cpc.pB, 5, 1, 12, 5, 0.05F), cgz.b, cgz.f),
                  cgy.m.a(new cgy.i(cpc.pH, 7, 1, 12, 5, 0.05F), cgz.a, cgz.c, cgz.d, cgz.e, cgz.g),
                  cgy.m.a(new cgy.i(cpc.pD, 7, 1, 12, 5, 0.05F), cgz.b, cgz.f),
                  cgy.m.a(new cgy.i(cpc.pG, 9, 1, 12, 5, 0.05F), cgz.a, cgz.c, cgz.d, cgz.e, cgz.g),
                  cgy.m.a(new cgy.i(cpc.pC, 9, 1, 12, 5, 0.05F), cgz.b, cgz.f)
               }
            )
            .put(3, new cgy.g[]{new cgy.b(cpc.qz, 1, 12, 20), new cgy.i(cpc.vo, 5, 1, 12, 10, 0.05F), new cgy.i(cpc.wi, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new cgy.g[]{
                  cgy.m.a(new cgy.i(a(cpc.pI, ctl.h, 1), 8, 1, 3, 15, 0.05F), cgz.a),
                  cgy.m.a(new cgy.i(a(cpc.pF, ctl.h, 1), 9, 1, 3, 15, 0.05F), cgz.a),
                  cgy.m.a(new cgy.i(a(cpc.pH, ctl.h, 1), 11, 1, 3, 15, 0.05F), cgz.a),
                  cgy.m.a(new cgy.i(a(cpc.pG, ctl.h, 1), 13, 1, 3, 15, 0.05F), cgz.a),
                  cgy.m.a(new cgy.i(a(cpc.pI, ctl.a, 1), 8, 1, 3, 15, 0.05F), cgz.c),
                  cgy.m.a(new cgy.i(a(cpc.pF, ctl.a, 1), 9, 1, 3, 15, 0.05F), cgz.c),
                  cgy.m.a(new cgy.i(a(cpc.pH, ctl.a, 1), 11, 1, 3, 15, 0.05F), cgz.c),
                  cgy.m.a(new cgy.i(a(cpc.pG, ctl.a, 1), 13, 1, 3, 15, 0.05F), cgz.c),
                  cgy.m.a(new cgy.i(a(cpc.pI, ctl.k, 1), 2, 1, 3, 15, 0.05F), cgz.d),
                  cgy.m.a(new cgy.i(a(cpc.pF, ctl.k, 1), 3, 1, 3, 15, 0.05F), cgz.d),
                  cgy.m.a(new cgy.i(a(cpc.pH, ctl.k, 1), 5, 1, 3, 15, 0.05F), cgz.d),
                  cgy.m.a(new cgy.i(a(cpc.pG, ctl.k, 1), 7, 1, 3, 15, 0.05F), cgz.d),
                  cgy.m.a(new cgy.i(a(cpc.pI, ctl.j, 1), 8, 1, 3, 15, 0.05F), cgz.e),
                  cgy.m.a(new cgy.i(a(cpc.pF, ctl.g, 1), 9, 1, 3, 15, 0.05F), cgz.e),
                  cgy.m.a(new cgy.i(a(cpc.pE, ctl.w, 1), 8, 1, 3, 15, 0.05F), cgz.b),
                  cgy.m.a(new cgy.i(a(cpc.pB, ctl.w, 1), 9, 1, 3, 15, 0.05F), cgz.b),
                  cgy.m.a(new cgy.i(a(cpc.pD, ctl.w, 1), 11, 1, 3, 15, 0.05F), cgz.b),
                  cgy.m.a(new cgy.i(a(cpc.pC, ctl.w, 1), 13, 1, 3, 15, 0.05F), cgz.b),
                  cgy.m.a(new cgy.i(a(cpc.pE, ctl.L, 1), 8, 1, 3, 15, 0.05F), cgz.f),
                  cgy.m.a(new cgy.i(a(cpc.pB, ctl.L, 1), 9, 1, 3, 15, 0.05F), cgz.f),
                  cgy.m.a(new cgy.i(a(cpc.pD, ctl.L, 1), 11, 1, 3, 15, 0.05F), cgz.f),
                  cgy.m.a(new cgy.i(a(cpc.pC, ctl.L, 1), 13, 1, 3, 15, 0.05F), cgz.f),
                  cgy.m.a(new cgy.h(cpc.pM, 1, 4, cpc.pL, 1, 3, 15, 0.05F, true), cgz.g),
                  cgy.m.a(new cgy.h(cpc.pL, 1, 4, cpc.pK, 1, 3, 15, 0.05F, true), cgz.g),
                  cgy.m.a(new cgy.h(cpc.pJ, 1, 4, cpc.pM, 1, 3, 15, 0.05F, true), cgz.g),
                  cgy.m.a(new cgy.h(cpc.pK, 1, 2, cpc.pJ, 1, 3, 15, 0.05F, true), cgz.g)
               }
            )
            .put(
               5,
               new cgy.g[]{
                  cgy.m.a(new cgy.h(cpc.ox, 4, 16, a(cpc.pK, ctl.h, 1), 1, 3, 30, 0.05F), cgz.a),
                  cgy.m.a(new cgy.h(cpc.ox, 3, 16, a(cpc.pL, ctl.h, 1), 1, 3, 30, 0.05F), cgz.a),
                  cgy.m.a(new cgy.h(cpc.ox, 3, 16, a(cpc.pL, ctl.a, 1), 1, 3, 30, 0.05F), cgz.c),
                  cgy.m.a(new cgy.h(cpc.ox, 2, 12, a(cpc.pM, ctl.a, 1), 1, 3, 30, 0.05F), cgz.c),
                  cgy.m.a(new cgy.h(cpc.ox, 2, 6, a(cpc.pJ, ctl.k, 1), 1, 3, 30, 0.05F), cgz.d),
                  cgy.m.a(new cgy.h(cpc.ox, 3, 8, a(cpc.pK, ctl.k, 1), 1, 3, 30, 0.05F), cgz.d),
                  cgy.m.a(new cgy.h(cpc.ox, 2, 12, a(cpc.pM, ctl.j, 1), 1, 3, 30, 0.05F), cgz.e),
                  cgy.m.a(new cgy.h(cpc.ox, 3, 12, a(cpc.pJ, ctl.g, 1), 1, 3, 30, 0.05F), cgz.e),
                  cgy.m.a(new cgy.i(a(cpc.pB, ctl.e, 1), 9, 1, 3, 30, 0.05F), cgz.b),
                  cgy.m.a(new cgy.i(a(cpc.pE, ctl.c, 1), 8, 1, 3, 30, 0.05F), cgz.b),
                  cgy.m.a(new cgy.i(a(cpc.pB, ctl.f, 1), 9, 1, 3, 30, 0.05F), cgz.f),
                  cgy.m.a(new cgy.i(a(cpc.pE, ctl.i, 1), 8, 1, 3, 30, 0.05F), cgz.f),
                  cgy.m.a(new cgy.h(cpc.ox, 4, 18, a(cpc.pK, ctl.d, 1), 1, 3, 30, 0.05F), cgz.g),
                  cgy.m.a(new cgy.h(cpc.ox, 3, 18, a(cpc.pL, ctl.d, 1), 1, 3, 30, 0.05F), cgz.g),
                  cgy.m.a(new cgy.b(cpc.aM, 1, 12, 30, 42), cgz.g),
                  cgy.m.a(new cgy.b(cpc.aJ, 1, 12, 30, 4), cgz.a, cgz.b, cgz.c, cgz.d, cgz.e, cgz.f)
               }
            )
            .build()
      ),
      cgx.e,
      a(
         ImmutableMap.of(
            1,
            new cgy.g[]{new cgy.b(cpc.qN, 24, 16, 2), new cgy.i(cpc.uf, 7, 1, 1)},
            2,
            new cgy.g[]{
               new cgy.b(cpc.fS, 11, 16, 10),
               new cgy.m(ImmutableMap.builder().put(cgz.a, t).put(cgz.d, u).put(cgz.c, v).put(cgz.g, w).put(cgz.e, u).put(cgz.b, t).put(cgz.f, w).build()),
               new cgy.m(ImmutableMap.builder().put(cgz.a, u).put(cgz.d, s).put(cgz.c, t).put(cgz.g, u).put(cgz.e, v).put(cgz.b, s).put(cgz.f, v).build()),
               new cgy.m(
                  ImmutableMap.builder().put(cgz.a, x).put(cgz.d, x).put(cgz.c, new cgy.f()).put(cgz.g, y).put(cgz.e, y).put(cgz.b, y).put(cgz.f, x).build()
               )
            },
            3,
            new cgy.g[]{new cgy.b(cpc.qR, 1, 12, 20), new cgy.l(13, auk.d, "filled_map.monument", ehw.a.j, 12, 10)},
            4,
            new cgy.g[]{
               new cgy.i(cpc.tY, 7, 1, 15),
               new cgy.i(cpc.uL, 3, 1, 15),
               new cgy.i(cpc.uW, 3, 1, 15),
               new cgy.i(cpc.uO, 3, 1, 15),
               new cgy.i(cpc.uZ, 3, 1, 15),
               new cgy.i(cpc.uR, 3, 1, 15),
               new cgy.i(cpc.uY, 3, 1, 15),
               new cgy.i(cpc.uQ, 3, 1, 15),
               new cgy.i(cpc.uS, 3, 1, 15),
               new cgy.i(cpc.va, 3, 1, 15),
               new cgy.i(cpc.uV, 3, 1, 15),
               new cgy.i(cpc.uN, 3, 1, 15),
               new cgy.i(cpc.uU, 3, 1, 15),
               new cgy.i(cpc.uX, 3, 1, 15),
               new cgy.i(cpc.uP, 3, 1, 15),
               new cgy.i(cpc.uM, 3, 1, 15),
               new cgy.i(cpc.uT, 3, 1, 15)
            },
            5,
            new cgy.g[]{new cgy.i(cpc.vW, 8, 1, 30), new cgy.l(14, auk.c, "filled_map.mansion", ehw.a.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<cgy.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new cgy.g[]{
               new cgy.b(a(cqy.c), 1, 1, 1),
               new cgy.b(cpc.qy, 1, 1, 1, 2),
               new cgy.b(cpc.qD, 1, 1, 1, 2),
               new cgy.b(cpc.sm, 1, 1, 1, 3),
               new cgy.b(cpc.ud, 4, 1, 1),
               new cgy.b(cpc.hC, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cgy.g[]{
               new cgy.i(cpc.hU, 1, 1, 6, 1),
               new cgy.i(cpc.kU, 6, 1, 6, 1),
               new cgy.i(cpc.pt, 1, 4, 2, 1),
               new cgy.i(cpc.E, 3, 3, 6, 1),
               new cgy.i(cyq.Y, 1, 8, 4, 1),
               new cgy.i(cyq.W, 1, 8, 4, 1),
               new cgy.i(cyq.aa, 1, 8, 4, 1),
               new cgy.i(cyq.X, 1, 8, 4, 1),
               new cgy.i(cyq.U, 1, 8, 4, 1),
               new cgy.i(cyq.V, 1, 8, 4, 1),
               new cgy.i(cyq.Z, 1, 8, 4, 1),
               new cgy.e(cpc.pb, 1, 1, 1, 0.2F),
               new cgy.i(a(cqy.j), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cgy.g[]{
               new cgy.i(cpc.qH, 3, 1, 4, 1),
               new cgy.i(cpc.qE, 3, 1, 4, 1),
               new cgy.i(cpc.cS, 2, 1, 5, 1),
               new cgy.i(cpc.qP, 4, 1, 5, 1),
               new cgy.i(cpc.ft, 2, 1, 5, 1),
               new cgy.i(cpc.vN, 5, 1, 5, 1),
               new cgy.i(cpc.cN, 1, 1, 12, 1),
               new cgy.i(cpc.dI, 1, 1, 8, 1),
               new cgy.i(cpc.fj, 1, 1, 4, 1),
               new cgy.i(cpc.dJ, 3, 1, 12, 1),
               new cgy.i(cpc.eV, 3, 1, 8, 1),
               new cgy.i(cpc.dj, 1, 1, 12, 1),
               new cgy.i(cpc.dk, 1, 1, 12, 1),
               new cgy.i(cpc.dl, 1, 1, 8, 1),
               new cgy.i(cpc.dm, 1, 1, 12, 1),
               new cgy.i(cpc.dn, 1, 1, 12, 1),
               new cgy.i(cpc.do, 1, 1, 12, 1),
               new cgy.i(cpc.dp, 1, 1, 12, 1),
               new cgy.i(cpc.dq, 1, 1, 12, 1),
               new cgy.i(cpc.dr, 1, 1, 12, 1),
               new cgy.i(cpc.ds, 1, 1, 12, 1),
               new cgy.i(cpc.dt, 1, 1, 12, 1),
               new cgy.i(cpc.du, 1, 1, 7, 1),
               new cgy.i(cpc.pu, 1, 1, 12, 1),
               new cgy.i(cpc.vh, 1, 1, 12, 1),
               new cgy.i(cpc.rX, 1, 1, 12, 1),
               new cgy.i(cpc.rY, 1, 1, 12, 1),
               new cgy.i(cpc.aa, 5, 1, 8, 1),
               new cgy.i(cpc.Y, 5, 1, 8, 1),
               new cgy.i(cpc.ac, 5, 1, 8, 1),
               new cgy.i(cpc.Z, 5, 1, 8, 1),
               new cgy.i(cpc.W, 5, 1, 8, 1),
               new cgy.i(cpc.X, 5, 1, 8, 1),
               new cgy.i(cpc.ab, 5, 1, 8, 1),
               new cgy.i(cpc.ad, 5, 1, 8, 1),
               new cgy.i(cpc.rv, 1, 3, 12, 1),
               new cgy.i(cpc.rh, 1, 3, 12, 1),
               new cgy.i(cpc.rs, 1, 3, 12, 1),
               new cgy.i(cpc.rn, 1, 3, 12, 1),
               new cgy.i(cpc.rw, 1, 3, 12, 1),
               new cgy.i(cpc.ru, 1, 3, 12, 1),
               new cgy.i(cpc.rp, 1, 3, 12, 1),
               new cgy.i(cpc.rj, 1, 3, 12, 1),
               new cgy.i(cpc.rl, 1, 3, 12, 1),
               new cgy.i(cpc.ro, 1, 3, 12, 1),
               new cgy.i(cpc.rr, 1, 3, 12, 1),
               new cgy.i(cpc.rk, 1, 3, 12, 1),
               new cgy.i(cpc.rm, 1, 3, 12, 1),
               new cgy.i(cpc.ri, 1, 3, 12, 1),
               new cgy.i(cpc.rt, 1, 3, 12, 1),
               new cgy.i(cpc.rq, 1, 3, 12, 1),
               new cgy.i(cpc.kw, 3, 1, 8, 1),
               new cgy.i(cpc.kx, 3, 1, 8, 1),
               new cgy.i(cpc.ky, 3, 1, 8, 1),
               new cgy.i(cpc.kz, 3, 1, 8, 1),
               new cgy.i(cpc.kv, 3, 1, 8, 1),
               new cgy.i(cpc.fU, 1, 3, 4, 1),
               new cgy.i(cpc.dz, 1, 3, 4, 1),
               new cgy.i(cpc.dA, 1, 3, 4, 1),
               new cgy.i(cpc.ga, 1, 5, 2, 1),
               new cgy.i(cpc.dP, 1, 2, 5, 1),
               new cgy.i(cpc.af, 1, 8, 8, 1),
               new cgy.i(cpc.ai, 1, 4, 6, 1),
               new cgy.i(cpc.xf, 1, 2, 5, 1),
               new cgy.i(cpc.F, 1, 2, 5, 1),
               new cgy.i(cpc.dM, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static cgy.g a(int $$0) {
      return new cgy.m(
         ImmutableMap.builder()
            .put(cgz.a, new cgy.d($$0, ctl.b, ctl.h, ctl.B))
            .put(cgz.b, new cgy.d($$0, ctl.c, ctl.e, ctl.y))
            .put(cgz.c, new cgy.d($$0, ctl.z, ctl.o, ctl.p))
            .put(cgz.d, new cgy.d($$0, ctl.q, ctl.k, ctl.t))
            .put(cgz.e, new cgy.d($$0, ctl.g, ctl.s, ctl.j))
            .put(cgz.f, new cgy.d($$0, ctl.i, ctl.f, ctl.M))
            .put(cgz.g, new cgy.d($$0, ctl.d, ctl.r, ctl.A))
            .build()
      );
   }

   private static cgy.g a() {
      return new cgy.m(
         ImmutableMap.builder()
            .put(cgz.a, new cgy.d(30, 3, 3, ctl.u))
            .put(cgz.b, new cgy.d(30, 2, 2, ctl.w))
            .put(cgz.c, new cgy.d(30, 3, 3, ctl.a))
            .put(cgz.d, new cgy.d(30, 3, 3, ctl.n))
            .put(cgz.e, new cgy.d(30, ctl.v))
            .put(cgz.f, new cgy.d(30, ctl.L))
            .put(cgz.g, new cgy.d(30, 2, 2, ctl.x))
            .build()
      );
   }

   private static Int2ObjectMap<cgy.g[]> a(ImmutableMap<Integer, cgy.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static coz a(ij<cqv> $$0) {
      return cqx.a(new coz(cpc.sj), $$0);
   }

   private static coz a(cou $$0, cti $$1, int $$2) {
      coz $$3 = new coz($$0);
      $$3.a($$1, $$2);
      return $$3;
   }

   static class a implements cgy.g {
      private final cou a;
      private final int b;
      private final int c;
      private final int d;

      public a(cou $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(cou $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public cul a(bno $$0, awo $$1) {
         coz $$2 = new coz(cpc.oy, this.b);
         coz $$3 = new coz(this.a);
         if (this.a instanceof cnq) {
            List<cno> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = cnr.a($$3, $$4);
         }

         return new cul($$2, $$3, this.c, this.d, 0.2F);
      }

      private static cno a(awo $$0) {
         return cno.a(cnn.a($$0.a(16)));
      }
   }

   static class b implements cgy.g {
      private final coz a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(cvm $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(cvm $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new coz($$0.j(), $$1), $$2, $$3, $$4);
      }

      public b(coz $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public cul a(bno $$0, awo $$1) {
         return new cul(this.a.q(), new coz(cpc.oy, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements cgy.g {
      private final Map<cgz, cou> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<cgz, cou> $$3) {
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
      public cul a(bno $$0, awo $$1) {
         if ($$0 instanceof cgw $$2) {
            coz $$3 = new coz(this.a.get($$2.gr().a()), this.b);
            return new cul($$3, new coz(cpc.oy), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements cgy.g {
      private final int a;
      private final List<cti> b;
      private final int c;
      private final int d;

      public d(int $$0) {
         this($$0, kf.f.s().filter(cti::i).toArray(cti[]::new));
      }

      public d(int $$0, cti... $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, cti... $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = Arrays.asList($$3);
      }

      @Override
      public cul a(bno $$0, awo $$1) {
         cti $$2 = this.b.get($$1.a(this.b.size()));
         int $$3 = Math.max($$2.f(), this.c);
         int $$4 = Math.min($$2.a(), this.d);
         int $$5 = awh.a($$1, $$3, $$4);
         coz $$6 = cnv.a(new ctk($$2, $$5));
         int $$7 = 2 + $$1.a(5 + $$5 * 10) + 3 * $$5;
         if ($$2.b()) {
            $$7 *= 2;
         }

         if ($$7 > 64) {
            $$7 = 64;
         }

         return new cul(new coz(cpc.oy, $$7), new coz(cpc.qO), $$6, 12, this.a, 0.2F);
      }
   }

   static class e implements cgy.g {
      private final coz a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(cou $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(cou $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new coz($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public cul a(bno $$0, awo $$1) {
         int $$2 = 5 + $$1.a(15);
         coz $$3 = ctj.a($$1, new coz(this.a.d()), $$2, false);
         int $$4 = Math.min(this.b + $$2, 64);
         coz $$5 = new coz(cpc.oy, $$4);
         return new cul($$5, $$3, this.c, this.d, this.e);
      }
   }

   static class f implements cgy.g {
      @Override
      public cul a(bno $$0, awo $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      cul a(bno var1, awo var2);
   }

   static class h implements cgy.g {
      private final coz a;
      private final int b;
      private final coz c;
      private final int d;
      private final int e;
      private final float f;
      private final boolean g;

      public h(cvm $$0, int $$1, int $$2, cou $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new coz($$3), $$4, $$5, $$6, $$7, false);
      }

      public h(cvm $$0, int $$1, int $$2, cou $$3, int $$4, int $$5, int $$6, float $$7, boolean $$8) {
         this($$0, $$1, $$2, new coz($$3), $$4, $$5, $$6, $$7, $$8);
      }

      public h(cvm $$0, int $$1, int $$2, coz $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, false);
      }

      private h(cvm $$0, int $$1, int $$2, coz $$3, int $$4, int $$5, int $$6, float $$7, boolean $$8) {
         this.a = new coz($$0, $$1);
         this.b = $$2;
         this.c = $$3.c($$4);
         this.d = $$5;
         this.e = $$6;
         this.f = $$7;
         this.g = $$8;
      }

      @Nullable
      @Override
      public cul a(bno $$0, awo $$1) {
         return new cul(new coz(cpc.oy, this.b), this.a.q(), this.c.q(), 0, this.d, this.e, this.f, 0, this.g);
      }
   }

   static class i implements cgy.g {
      private final coz a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public i(cyo $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new coz($$0), $$1, $$2, $$3, $$4);
      }

      public i(cou $$0, int $$1, int $$2, int $$3) {
         this(new coz($$0), $$1, $$2, 12, $$3);
      }

      public i(cou $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new coz($$0), $$1, $$2, $$3, $$4);
      }

      public i(coz $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(cou $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new coz($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(coz $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.a.f($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
      }

      @Override
      public cul a(bno $$0, awo $$1) {
         return new cul(new coz(cpc.oy, this.b), this.a.q(), this.c, this.d, this.e);
      }
   }

   static class j implements cgy.g {
      private final List<dgp.a> a;
      private final int b;
      private final float c;

      public j(ij<bmz> $$0, int $$1, int $$2) {
         this(List.of(new dgp.a($$0, $$1)), $$2, 0.05F);
      }

      public j(List<dgp.a> $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public cul a(bno $$0, awo $$1) {
         coz $$2 = new coz(cpc.vQ, 1);
         cqj.a($$2, this.a);
         return new cul(new coz(cpc.oy, 1), $$2, 12, this.b, this.c);
      }
   }

   static class k implements cgy.g {
      private final coz a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final cou f;
      private final int g;
      private final float h;

      public k(cou $$0, int $$1, cou $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new coz($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public cul a(bno $$0, awo $$1) {
         coz $$2 = new coz(cpc.oy, this.c);
         List<ij<cqv>> $$3 = kf.i.h().filter($$0x -> !((cqv)$$0x.a()).a().isEmpty() && cqw.a($$0x)).collect(Collectors.toList());
         ij<cqv> $$4 = ac.a($$3, $$1);
         coz $$5 = cqx.a(new coz(this.a.d(), this.b), $$4);
         return new cul($$2, new coz(this.f, this.g), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements cgy.g {
      private final int a;
      private final auo<ebe> b;
      private final String c;
      private final ehw.a d;
      private final int e;
      private final int f;

      public l(int $$0, auo<ebe> $$1, String $$2, ehw.a $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public cul a(bno $$0, awo $$1) {
         if (!($$0.dM() instanceof aov)) {
            return null;
         } else {
            aov $$2 = (aov)$$0.dM();
            hz $$3 = $$2.a(this.b, $$0.dm(), 100, true);
            if ($$3 != null) {
               coz $$4 = cpg.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               cpg.a($$2, $$4);
               ehz.a($$4, $$3, "+", this.d);
               $$4.a(vq.c(this.c));
               return new cul(new coz(cpc.oy, this.a), new coz(cpc.qR), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static record m(Map<cgz, cgy.g> a) implements cgy.g {
      public static cgy.m a(cgy.g $$0, cgz... $$1) {
         return new cgy.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public cul a(bno $$0, awo $$1) {
         if ($$0 instanceof cgw $$2) {
            cgz $$3 = $$2.gr().a();
            cgy.g $$4 = this.a.get($$3);
            return $$4 == null ? null : $$4.a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
