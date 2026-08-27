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

public class cjr {
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
   public static final Map<cjq, Int2ObjectMap<cjr.g[]>> a = ac.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            cjq.g,
            a(
               ImmutableMap.of(
                  1,
                  new cjr.g[]{
                     new cjr.b(crv.pv, 20, 16, 2),
                     new cjr.b(crv.ue, 26, 16, 2),
                     new cjr.b(crv.ud, 22, 16, 2),
                     new cjr.b(crv.vi, 15, 16, 2),
                     new cjr.i(crv.pw, 1, 6, 16, 1)
                  },
                  2,
                  new cjr.g[]{new cjr.b(dcj.eZ, 6, 12, 10), new cjr.i(crv.ur, 1, 4, 5), new cjr.i(crv.os, 1, 4, 16, 5)},
                  3,
                  new cjr.g[]{new cjr.i(crv.rR, 3, 18, 10), new cjr.b(dcj.fa, 4, 12, 20)},
                  4,
                  new cjr.g[]{
                     new cjr.i(dcj.eg, 1, 1, 12, 15),
                     new cjr.j(bpo.p, 100, 15),
                     new cjr.j(bpo.h, 160, 15),
                     new cjr.j(bpo.r, 140, 15),
                     new cjr.j(bpo.o, 120, 15),
                     new cjr.j(bpo.s, 280, 15),
                     new cjr.j(bpo.w, 7, 15)
                  },
                  5,
                  new cjr.g[]{new cjr.i(crv.ui, 3, 3, 30), new cjr.i(crv.ss, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            cjq.h,
            a(
               ImmutableMap.of(
                  1,
                  new cjr.g[]{
                     new cjr.b(crv.pr, 20, 16, 2),
                     new cjr.b(crv.ov, 10, 16, 2),
                     new cjr.h(crv.qY, 6, 1, crv.rc, 6, 16, 1, 0.05F),
                     new cjr.i(crv.qG, 3, 1, 16, 1)
                  },
                  2,
                  new cjr.g[]{new cjr.b(crv.qY, 15, 16, 10), new cjr.h(crv.qZ, 6, 1, crv.rd, 6, 16, 5, 0.05F), new cjr.i(crv.wp, 2, 1, 5)},
                  3,
                  new cjr.g[]{new cjr.b(crv.qZ, 13, 16, 20), new cjr.e(crv.qU, 3, 3, 10, 0.2F)},
                  4,
                  new cjr.g[]{new cjr.b(crv.ra, 6, 12, 30)},
                  5,
                  new cjr.g[]{
                     new cjr.b(crv.rb, 4, 12, 30),
                     new cjr.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(cjs.c, crv.nT)
                           .put(cjs.g, crv.nV)
                           .put(cjs.e, crv.nV)
                           .put(cjs.a, crv.nZ)
                           .put(cjs.b, crv.nZ)
                           .put(cjs.d, crv.ob)
                           .put(cjs.f, crv.of)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            cjq.n,
            a(
               ImmutableMap.of(
                  1,
                  new cjr.g[]{
                     new cjr.b(dcj.bA, 18, 16, 2),
                     new cjr.b(dcj.bM, 18, 16, 2),
                     new cjr.b(dcj.bP, 18, 16, 2),
                     new cjr.b(dcj.bH, 18, 16, 2),
                     new cjr.i(crv.rU, 2, 1, 1)
                  },
                  2,
                  new cjr.g[]{
                     new cjr.b(crv.rh, 12, 16, 10),
                     new cjr.b(crv.ro, 12, 16, 10),
                     new cjr.b(crv.rw, 12, 16, 10),
                     new cjr.b(crv.rk, 12, 16, 10),
                     new cjr.b(crv.rm, 12, 16, 10),
                     new cjr.i(dcj.bA, 1, 1, 16, 5),
                     new cjr.i(dcj.bB, 1, 1, 16, 5),
                     new cjr.i(dcj.bC, 1, 1, 16, 5),
                     new cjr.i(dcj.bD, 1, 1, 16, 5),
                     new cjr.i(dcj.bE, 1, 1, 16, 5),
                     new cjr.i(dcj.bF, 1, 1, 16, 5),
                     new cjr.i(dcj.bG, 1, 1, 16, 5),
                     new cjr.i(dcj.bH, 1, 1, 16, 5),
                     new cjr.i(dcj.bI, 1, 1, 16, 5),
                     new cjr.i(dcj.bJ, 1, 1, 16, 5),
                     new cjr.i(dcj.bK, 1, 1, 16, 5),
                     new cjr.i(dcj.bL, 1, 1, 16, 5),
                     new cjr.i(dcj.bM, 1, 1, 16, 5),
                     new cjr.i(dcj.bN, 1, 1, 16, 5),
                     new cjr.i(dcj.bO, 1, 1, 16, 5),
                     new cjr.i(dcj.bP, 1, 1, 16, 5),
                     new cjr.i(dcj.ik, 1, 4, 16, 5),
                     new cjr.i(dcj.il, 1, 4, 16, 5),
                     new cjr.i(dcj.im, 1, 4, 16, 5),
                     new cjr.i(dcj.in, 1, 4, 16, 5),
                     new cjr.i(dcj.io, 1, 4, 16, 5),
                     new cjr.i(dcj.ip, 1, 4, 16, 5),
                     new cjr.i(dcj.iq, 1, 4, 16, 5),
                     new cjr.i(dcj.ir, 1, 4, 16, 5),
                     new cjr.i(dcj.is, 1, 4, 16, 5),
                     new cjr.i(dcj.it, 1, 4, 16, 5),
                     new cjr.i(dcj.iu, 1, 4, 16, 5),
                     new cjr.i(dcj.iv, 1, 4, 16, 5),
                     new cjr.i(dcj.iw, 1, 4, 16, 5),
                     new cjr.i(dcj.ix, 1, 4, 16, 5),
                     new cjr.i(dcj.iy, 1, 4, 16, 5),
                     new cjr.i(dcj.iz, 1, 4, 16, 5)
                  },
                  3,
                  new cjr.g[]{
                     new cjr.b(crv.rl, 12, 16, 20),
                     new cjr.b(crv.rp, 12, 16, 20),
                     new cjr.b(crv.ri, 12, 16, 20),
                     new cjr.b(crv.rv, 12, 16, 20),
                     new cjr.b(crv.rn, 12, 16, 20),
                     new cjr.i(dcj.aZ, 3, 1, 12, 10),
                     new cjr.i(dcj.bd, 3, 1, 12, 10),
                     new cjr.i(dcj.bn, 3, 1, 12, 10),
                     new cjr.i(dcj.bo, 3, 1, 12, 10),
                     new cjr.i(dcj.bk, 3, 1, 12, 10),
                     new cjr.i(dcj.bl, 3, 1, 12, 10),
                     new cjr.i(dcj.bi, 3, 1, 12, 10),
                     new cjr.i(dcj.bg, 3, 1, 12, 10),
                     new cjr.i(dcj.bm, 3, 1, 12, 10),
                     new cjr.i(dcj.bc, 3, 1, 12, 10),
                     new cjr.i(dcj.bh, 3, 1, 12, 10),
                     new cjr.i(dcj.be, 3, 1, 12, 10),
                     new cjr.i(dcj.bb, 3, 1, 12, 10),
                     new cjr.i(dcj.ba, 3, 1, 12, 10),
                     new cjr.i(dcj.bf, 3, 1, 12, 10),
                     new cjr.i(dcj.bj, 3, 1, 12, 10)
                  },
                  4,
                  new cjr.g[]{
                     new cjr.b(crv.rt, 12, 16, 30),
                     new cjr.b(crv.rr, 12, 16, 30),
                     new cjr.b(crv.rs, 12, 16, 30),
                     new cjr.b(crv.ru, 12, 16, 30),
                     new cjr.b(crv.rj, 12, 16, 30),
                     new cjr.b(crv.rq, 12, 16, 30),
                     new cjr.i(crv.uN, 3, 1, 12, 15),
                     new cjr.i(crv.uY, 3, 1, 12, 15),
                     new cjr.i(crv.uQ, 3, 1, 12, 15),
                     new cjr.i(crv.vb, 3, 1, 12, 15),
                     new cjr.i(crv.uT, 3, 1, 12, 15),
                     new cjr.i(crv.va, 3, 1, 12, 15),
                     new cjr.i(crv.uS, 3, 1, 12, 15),
                     new cjr.i(crv.uU, 3, 1, 12, 15),
                     new cjr.i(crv.vc, 3, 1, 12, 15),
                     new cjr.i(crv.uX, 3, 1, 12, 15),
                     new cjr.i(crv.uP, 3, 1, 12, 15),
                     new cjr.i(crv.uW, 3, 1, 12, 15),
                     new cjr.i(crv.uZ, 3, 1, 12, 15),
                     new cjr.i(crv.uR, 3, 1, 12, 15),
                     new cjr.i(crv.uO, 3, 1, 12, 15),
                     new cjr.i(crv.uV, 3, 1, 12, 15)
                  },
                  5,
                  new cjr.g[]{new cjr.i(crv.pY, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            cjq.i,
            a(
               ImmutableMap.of(
                  1,
                  new cjr.g[]{new cjr.b(crv.po, 32, 16, 2), new cjr.i(crv.ou, 1, 16, 1), new cjr.h(dcj.L, 10, 1, crv.pV, 10, 12, 1, 0.05F)},
                  2,
                  new cjr.g[]{new cjr.b(crv.pV, 26, 12, 10), new cjr.i(crv.ot, 2, 1, 5)},
                  3,
                  new cjr.g[]{new cjr.b(crv.pr, 14, 16, 20), new cjr.i(crv.vR, 3, 1, 10)},
                  4,
                  new cjr.g[]{new cjr.b(crv.ps, 24, 16, 30), new cjr.e(crv.ot, 2, 3, 15)},
                  5,
                  new cjr.g[]{new cjr.b(crv.ma, 8, 12, 30), new cjr.e(crv.vR, 3, 3, 15), new cjr.k(crv.ou, 5, crv.vo, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            cjq.k,
            a(
               ImmutableMap.builder()
                  .put(1, new cjr.g[]{new cjr.b(crv.qN, 24, 16, 2), new cjr.d(1), new cjr.i(dcj.cl, 9, 1, 12, 1)})
                  .put(2, new cjr.g[]{new cjr.b(crv.qO, 4, 12, 10), new cjr.d(5), new cjr.i(crv.wl, 1, 1, 5)})
                  .put(3, new cjr.g[]{new cjr.b(crv.re, 5, 12, 20), new cjr.d(10), new cjr.i(crv.cF, 1, 4, 10)})
                  .put(4, new cjr.g[]{new cjr.b(crv.tY, 2, 12, 30), new cjr.d(15), new cjr.i(crv.qV, 5, 1, 15), new cjr.i(crv.qR, 4, 1, 15)})
                  .put(5, new cjr.g[]{new cjr.i(crv.uJ, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            cjq.e,
            a(
               ImmutableMap.of(
                  1,
                  new cjr.g[]{new cjr.b(crv.qN, 24, 16, 2), new cjr.i(crv.uh, 7, 1, 1)},
                  2,
                  new cjr.g[]{new cjr.b(crv.fS, 11, 16, 10), new cjr.l(13, avp.d, "filled_map.monument", emk.a.j, 12, 5)},
                  3,
                  new cjr.g[]{new cjr.b(crv.qR, 1, 12, 20), new cjr.l(14, avp.c, "filled_map.mansion", emk.a.i, 12, 10)},
                  4,
                  new cjr.g[]{
                     new cjr.i(crv.ua, 7, 1, 15),
                     new cjr.i(crv.uN, 3, 1, 15),
                     new cjr.i(crv.uY, 3, 1, 15),
                     new cjr.i(crv.uQ, 3, 1, 15),
                     new cjr.i(crv.vb, 3, 1, 15),
                     new cjr.i(crv.uT, 3, 1, 15),
                     new cjr.i(crv.va, 3, 1, 15),
                     new cjr.i(crv.uS, 3, 1, 15),
                     new cjr.i(crv.uU, 3, 1, 15),
                     new cjr.i(crv.vc, 3, 1, 15),
                     new cjr.i(crv.uX, 3, 1, 15),
                     new cjr.i(crv.uP, 3, 1, 15),
                     new cjr.i(crv.uW, 3, 1, 15),
                     new cjr.i(crv.uZ, 3, 1, 15),
                     new cjr.i(crv.uR, 3, 1, 15),
                     new cjr.i(crv.uO, 3, 1, 15),
                     new cjr.i(crv.uV, 3, 1, 15)
                  },
                  5,
                  new cjr.g[]{new cjr.i(crv.vY, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            cjq.f,
            a(
               ImmutableMap.of(
                  1,
                  new cjr.g[]{new cjr.b(crv.sd, 32, 16, 2), new cjr.i(crv.lG, 1, 2, 1)},
                  2,
                  new cjr.g[]{new cjr.b(crv.oH, 3, 12, 10), new cjr.i(crv.oz, 1, 1, 5)},
                  3,
                  new cjr.g[]{new cjr.b(crv.uB, 2, 12, 20), new cjr.i(dcj.ec, 4, 1, 12, 10)},
                  4,
                  new cjr.g[]{new cjr.b(crv.oo, 4, 12, 30), new cjr.b(crv.sk, 9, 12, 30), new cjr.i(crv.se, 5, 1, 15)},
                  5,
                  new cjr.g[]{new cjr.b(crv.si, 22, 12, 30), new cjr.i(crv.tV, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            cjq.c,
            a(
               ImmutableMap.of(
                  1,
                  new cjr.g[]{
                     new cjr.b(crv.ov, 15, 16, 2),
                     new cjr.i(new crs(crv.pH), 7, 1, 12, 1, 0.2F),
                     new cjr.i(new crs(crv.pI), 4, 1, 12, 1, 0.2F),
                     new cjr.i(new crs(crv.pF), 5, 1, 12, 1, 0.2F),
                     new cjr.i(new crs(crv.pG), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cjr.g[]{
                     new cjr.b(crv.oD, 4, 12, 10),
                     new cjr.i(new crs(crv.wk), 36, 1, 12, 5, 0.2F),
                     new cjr.i(new crs(crv.pE), 1, 1, 12, 5, 0.2F),
                     new cjr.i(new crs(crv.pD), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new cjr.g[]{
                     new cjr.b(crv.qz, 1, 12, 20),
                     new cjr.b(crv.ox, 1, 12, 20),
                     new cjr.i(new crs(crv.pB), 1, 1, 12, 10, 0.2F),
                     new cjr.i(new crs(crv.pC), 4, 1, 12, 10, 0.2F),
                     new cjr.i(new crs(crv.vq), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new cjr.g[]{new cjr.e(crv.pL, 14, 3, 15, 0.2F), new cjr.e(crv.pM, 8, 3, 15, 0.2F)},
                  5,
                  new cjr.g[]{new cjr.e(crv.pJ, 8, 3, 30, 0.2F), new cjr.e(crv.pK, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cjq.p,
            a(
               ImmutableMap.of(
                  1,
                  new cjr.g[]{new cjr.b(crv.ov, 15, 16, 2), new cjr.i(new crs(crv.pc), 3, 1, 12, 1, 0.2F), new cjr.e(crv.oZ, 2, 3, 1)},
                  2,
                  new cjr.g[]{new cjr.b(crv.oD, 4, 12, 10), new cjr.i(new crs(crv.wk), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cjr.g[]{new cjr.b(crv.pV, 24, 12, 20)},
                  4,
                  new cjr.g[]{new cjr.b(crv.ox, 1, 12, 30), new cjr.e(crv.ph, 12, 3, 15, 0.2F)},
                  5,
                  new cjr.g[]{new cjr.e(crv.pe, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cjq.o,
            a(
               ImmutableMap.of(
                  1,
                  new cjr.g[]{
                     new cjr.b(crv.ov, 15, 16, 2),
                     new cjr.i(new crs(crv.oS), 1, 1, 12, 1, 0.2F),
                     new cjr.i(new crs(crv.oQ), 1, 1, 12, 1, 0.2F),
                     new cjr.i(new crs(crv.oR), 1, 1, 12, 1, 0.2F),
                     new cjr.i(new crs(crv.oT), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cjr.g[]{new cjr.b(crv.oD, 4, 12, 10), new cjr.i(new crs(crv.wk), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cjr.g[]{
                     new cjr.b(crv.pV, 30, 12, 20),
                     new cjr.e(crv.pc, 1, 3, 10, 0.2F),
                     new cjr.e(crv.pa, 2, 3, 10, 0.2F),
                     new cjr.e(crv.pb, 3, 3, 10, 0.2F),
                     new cjr.i(new crs(crv.pi), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new cjr.g[]{new cjr.b(crv.ox, 1, 12, 30), new cjr.e(crv.ph, 12, 3, 15, 0.2F), new cjr.e(crv.pf, 5, 3, 15, 0.2F)},
                  5,
                  new cjr.g[]{new cjr.e(crv.pg, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cjq.d,
            a(
               ImmutableMap.of(
                  1,
                  new cjr.g[]{new cjr.b(crv.sb, 14, 16, 2), new cjr.b(crv.pW, 7, 16, 2), new cjr.b(crv.uy, 4, 16, 2), new cjr.i(crv.uA, 1, 1, 1)},
                  2,
                  new cjr.g[]{new cjr.b(crv.ov, 15, 16, 2), new cjr.i(crv.pX, 1, 5, 16, 5), new cjr.i(crv.sc, 1, 8, 16, 5)},
                  3,
                  new cjr.g[]{new cjr.b(crv.uL, 7, 16, 20), new cjr.b(crv.rZ, 10, 16, 20)},
                  4,
                  new cjr.g[]{new cjr.b(crv.qM, 10, 12, 30)},
                  5,
                  new cjr.g[]{new cjr.b(crv.wn, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            cjq.j,
            a(
               ImmutableMap.of(
                  1,
                  new cjr.g[]{new cjr.b(crv.qC, 6, 16, 2), new cjr.a(crv.pz, 3), new cjr.a(crv.py, 7)},
                  2,
                  new cjr.g[]{new cjr.b(crv.pV, 26, 12, 10), new cjr.a(crv.px, 5, 12, 5), new cjr.a(crv.pA, 4, 12, 5)},
                  3,
                  new cjr.g[]{new cjr.b(crv.uC, 9, 12, 20), new cjr.a(crv.py, 7)},
                  4,
                  new cjr.g[]{new cjr.b(crv.oo, 4, 12, 30), new cjr.a(crv.uH, 6, 12, 15)},
                  5,
                  new cjr.g[]{new cjr.i(new crs(crv.nK), 6, 1, 12, 30, 0.2F), new cjr.a(crv.px, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            cjq.l,
            a(
               ImmutableMap.of(
                  1,
                  new cjr.g[]{new cjr.b(crv.qL, 10, 16, 2), new cjr.i(crv.qK, 1, 10, 16, 1)},
                  2,
                  new cjr.g[]{new cjr.b(dcj.b, 20, 16, 10), new cjr.i(dcj.eK, 1, 4, 16, 5)},
                  3,
                  new cjr.g[]{
                     new cjr.b(dcj.c, 16, 16, 20),
                     new cjr.b(dcj.g, 16, 16, 20),
                     new cjr.b(dcj.e, 16, 16, 20),
                     new cjr.i(dcj.su, 1, 4, 16, 10),
                     new cjr.i(dcj.h, 1, 4, 16, 10),
                     new cjr.i(dcj.f, 1, 4, 16, 10),
                     new cjr.i(dcj.d, 1, 4, 16, 10)
                  },
                  4,
                  new cjr.g[]{
                     new cjr.b(crv.oA, 12, 12, 30),
                     new cjr.i(dcj.hk, 1, 1, 12, 15),
                     new cjr.i(dcj.hj, 1, 1, 12, 15),
                     new cjr.i(dcj.hu, 1, 1, 12, 15),
                     new cjr.i(dcj.hm, 1, 1, 12, 15),
                     new cjr.i(dcj.hq, 1, 1, 12, 15),
                     new cjr.i(dcj.hr, 1, 1, 12, 15),
                     new cjr.i(dcj.hy, 1, 1, 12, 15),
                     new cjr.i(dcj.hx, 1, 1, 12, 15),
                     new cjr.i(dcj.hp, 1, 1, 12, 15),
                     new cjr.i(dcj.hl, 1, 1, 12, 15),
                     new cjr.i(dcj.ho, 1, 1, 12, 15),
                     new cjr.i(dcj.hw, 1, 1, 12, 15),
                     new cjr.i(dcj.hs, 1, 1, 12, 15),
                     new cjr.i(dcj.ht, 1, 1, 12, 15),
                     new cjr.i(dcj.hn, 1, 1, 12, 15),
                     new cjr.i(dcj.hv, 1, 1, 12, 15),
                     new cjr.i(dcj.lh, 1, 1, 12, 15),
                     new cjr.i(dcj.lg, 1, 1, 12, 15),
                     new cjr.i(dcj.lr, 1, 1, 12, 15),
                     new cjr.i(dcj.lj, 1, 1, 12, 15),
                     new cjr.i(dcj.ln, 1, 1, 12, 15),
                     new cjr.i(dcj.lo, 1, 1, 12, 15),
                     new cjr.i(dcj.lv, 1, 1, 12, 15),
                     new cjr.i(dcj.lu, 1, 1, 12, 15),
                     new cjr.i(dcj.lm, 1, 1, 12, 15),
                     new cjr.i(dcj.li, 1, 1, 12, 15),
                     new cjr.i(dcj.ll, 1, 1, 12, 15),
                     new cjr.i(dcj.lt, 1, 1, 12, 15),
                     new cjr.i(dcj.lp, 1, 1, 12, 15),
                     new cjr.i(dcj.lq, 1, 1, 12, 15),
                     new cjr.i(dcj.lk, 1, 1, 12, 15),
                     new cjr.i(dcj.ls, 1, 1, 12, 15)
                  },
                  5,
                  new cjr.g[]{new cjr.i(dcj.hf, 1, 1, 12, 30), new cjr.i(dcj.hd, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<cjr.g[]> b = a(
      ImmutableMap.of(
         1,
         new cjr.g[]{
            new cjr.i(crv.cS, 2, 1, 5, 1),
            new cjr.i(crv.qP, 4, 1, 5, 1),
            new cjr.i(crv.ft, 2, 1, 5, 1),
            new cjr.i(crv.vP, 5, 1, 5, 1),
            new cjr.i(crv.cN, 1, 1, 12, 1),
            new cjr.i(crv.dI, 1, 1, 8, 1),
            new cjr.i(crv.fj, 1, 1, 4, 1),
            new cjr.i(crv.dJ, 3, 1, 12, 1),
            new cjr.i(crv.eV, 3, 1, 8, 1),
            new cjr.i(crv.dj, 1, 1, 12, 1),
            new cjr.i(crv.dk, 1, 1, 12, 1),
            new cjr.i(crv.dl, 1, 1, 8, 1),
            new cjr.i(crv.dm, 1, 1, 12, 1),
            new cjr.i(crv.dn, 1, 1, 12, 1),
            new cjr.i(crv.do, 1, 1, 12, 1),
            new cjr.i(crv.dp, 1, 1, 12, 1),
            new cjr.i(crv.dq, 1, 1, 12, 1),
            new cjr.i(crv.dr, 1, 1, 12, 1),
            new cjr.i(crv.ds, 1, 1, 12, 1),
            new cjr.i(crv.dt, 1, 1, 12, 1),
            new cjr.i(crv.du, 1, 1, 7, 1),
            new cjr.i(crv.pu, 1, 1, 12, 1),
            new cjr.i(crv.vj, 1, 1, 12, 1),
            new cjr.i(crv.rX, 1, 1, 12, 1),
            new cjr.i(crv.rY, 1, 1, 12, 1),
            new cjr.i(crv.aa, 5, 1, 8, 1),
            new cjr.i(crv.Y, 5, 1, 8, 1),
            new cjr.i(crv.ac, 5, 1, 8, 1),
            new cjr.i(crv.Z, 5, 1, 8, 1),
            new cjr.i(crv.W, 5, 1, 8, 1),
            new cjr.i(crv.X, 5, 1, 8, 1),
            new cjr.i(crv.ab, 5, 1, 8, 1),
            new cjr.i(crv.ad, 5, 1, 8, 1),
            new cjr.i(crv.rv, 1, 3, 12, 1),
            new cjr.i(crv.rh, 1, 3, 12, 1),
            new cjr.i(crv.rs, 1, 3, 12, 1),
            new cjr.i(crv.rn, 1, 3, 12, 1),
            new cjr.i(crv.rw, 1, 3, 12, 1),
            new cjr.i(crv.ru, 1, 3, 12, 1),
            new cjr.i(crv.rp, 1, 3, 12, 1),
            new cjr.i(crv.rj, 1, 3, 12, 1),
            new cjr.i(crv.rl, 1, 3, 12, 1),
            new cjr.i(crv.ro, 1, 3, 12, 1),
            new cjr.i(crv.rr, 1, 3, 12, 1),
            new cjr.i(crv.rk, 1, 3, 12, 1),
            new cjr.i(crv.rm, 1, 3, 12, 1),
            new cjr.i(crv.ri, 1, 3, 12, 1),
            new cjr.i(crv.rt, 1, 3, 12, 1),
            new cjr.i(crv.rq, 1, 3, 12, 1),
            new cjr.i(crv.kw, 3, 1, 8, 1),
            new cjr.i(crv.kx, 3, 1, 8, 1),
            new cjr.i(crv.ky, 3, 1, 8, 1),
            new cjr.i(crv.kz, 3, 1, 8, 1),
            new cjr.i(crv.kv, 3, 1, 8, 1),
            new cjr.i(crv.fU, 1, 1, 12, 1),
            new cjr.i(crv.dz, 1, 1, 12, 1),
            new cjr.i(crv.dA, 1, 1, 12, 1),
            new cjr.i(crv.ga, 1, 2, 5, 1),
            new cjr.i(crv.dP, 1, 2, 5, 1),
            new cjr.i(crv.af, 1, 8, 8, 1),
            new cjr.i(crv.ai, 1, 4, 6, 1),
            new cjr.i(crv.xh, 1, 2, 5, 1),
            new cjr.i(crv.F, 1, 2, 5, 1),
            new cjr.i(crv.dM, 1, 2, 5, 1)
         },
         2,
         new cjr.g[]{
            new cjr.i(crv.qH, 5, 1, 4, 1),
            new cjr.i(crv.qE, 5, 1, 4, 1),
            new cjr.i(crv.hU, 3, 1, 6, 1),
            new cjr.i(crv.kU, 6, 1, 6, 1),
            new cjr.i(crv.pt, 1, 1, 8, 1),
            new cjr.i(crv.E, 3, 3, 6, 1)
         }
      )
   );
   private static final cjr.l s = new cjr.l(8, avp.f, "filled_map.village_desert", emk.a.B, 12, 5);
   private static final cjr.l t = new cjr.l(8, avp.e, "filled_map.village_savanna", emk.a.D, 12, 5);
   private static final cjr.l u = new cjr.l(8, avp.g, "filled_map.village_plains", emk.a.C, 12, 5);
   private static final cjr.l v = new cjr.l(8, avp.h, "filled_map.village_taiga", emk.a.F, 12, 5);
   private static final cjr.l w = new cjr.l(8, avp.i, "filled_map.village_snowy", emk.a.E, 12, 5);
   private static final cjr.l x = new cjr.l(8, avp.j, "filled_map.explorer_jungle", emk.a.G, 12, 5);
   private static final cjr.l y = new cjr.l(8, avp.k, "filled_map.explorer_swamp", emk.a.H, 12, 5);
   public static final Map<cjq, Int2ObjectMap<cjr.g[]>> c = Map.of(
      cjq.k,
      a(
         ImmutableMap.builder()
            .put(1, new cjr.g[]{new cjr.b(crv.qN, 24, 16, 2), a(1), new cjr.i(dcj.cl, 9, 1, 12, 1)})
            .put(2, new cjr.g[]{new cjr.b(crv.qO, 4, 12, 10), a(5), new cjr.i(crv.wl, 1, 1, 5)})
            .put(3, new cjr.g[]{new cjr.b(crv.re, 5, 12, 20), a(10), new cjr.i(crv.cF, 1, 4, 10)})
            .put(4, new cjr.g[]{new cjr.b(crv.tY, 2, 12, 30), new cjr.i(crv.qV, 5, 1, 15), new cjr.i(crv.qR, 4, 1, 15)})
            .put(5, new cjr.g[]{a(), new cjr.i(crv.uJ, 20, 1, 30)})
            .build()
      ),
      cjq.c,
      a(
         ImmutableMap.builder()
            .put(1, new cjr.g[]{new cjr.b(crv.ov, 15, 12, 2), new cjr.b(crv.oD, 5, 12, 2)})
            .put(
               2,
               new cjr.g[]{
                  cjr.m.a(new cjr.i(crv.pI, 4, 1, 12, 5, 0.05F), cjs.a, cjs.c, cjs.d, cjs.e, cjs.g),
                  cjr.m.a(new cjr.i(crv.pE, 4, 1, 12, 5, 0.05F), cjs.b, cjs.f),
                  cjr.m.a(new cjr.i(crv.pF, 5, 1, 12, 5, 0.05F), cjs.a, cjs.c, cjs.d, cjs.e, cjs.g),
                  cjr.m.a(new cjr.i(crv.pB, 5, 1, 12, 5, 0.05F), cjs.b, cjs.f),
                  cjr.m.a(new cjr.i(crv.pH, 7, 1, 12, 5, 0.05F), cjs.a, cjs.c, cjs.d, cjs.e, cjs.g),
                  cjr.m.a(new cjr.i(crv.pD, 7, 1, 12, 5, 0.05F), cjs.b, cjs.f),
                  cjr.m.a(new cjr.i(crv.pG, 9, 1, 12, 5, 0.05F), cjs.a, cjs.c, cjs.d, cjs.e, cjs.g),
                  cjr.m.a(new cjr.i(crv.pC, 9, 1, 12, 5, 0.05F), cjs.b, cjs.f)
               }
            )
            .put(3, new cjr.g[]{new cjr.b(crv.qz, 1, 12, 20), new cjr.i(crv.vq, 5, 1, 12, 10, 0.05F), new cjr.i(crv.wk, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new cjr.g[]{
                  cjr.m.a(new cjr.i(a(crv.pI, cxc.h, 1), 8, 1, 3, 15, 0.05F), cjs.a),
                  cjr.m.a(new cjr.i(a(crv.pF, cxc.h, 1), 9, 1, 3, 15, 0.05F), cjs.a),
                  cjr.m.a(new cjr.i(a(crv.pH, cxc.h, 1), 11, 1, 3, 15, 0.05F), cjs.a),
                  cjr.m.a(new cjr.i(a(crv.pG, cxc.h, 1), 13, 1, 3, 15, 0.05F), cjs.a),
                  cjr.m.a(new cjr.i(a(crv.pI, cxc.a, 1), 8, 1, 3, 15, 0.05F), cjs.c),
                  cjr.m.a(new cjr.i(a(crv.pF, cxc.a, 1), 9, 1, 3, 15, 0.05F), cjs.c),
                  cjr.m.a(new cjr.i(a(crv.pH, cxc.a, 1), 11, 1, 3, 15, 0.05F), cjs.c),
                  cjr.m.a(new cjr.i(a(crv.pG, cxc.a, 1), 13, 1, 3, 15, 0.05F), cjs.c),
                  cjr.m.a(new cjr.i(a(crv.pI, cxc.k, 1), 2, 1, 3, 15, 0.05F), cjs.d),
                  cjr.m.a(new cjr.i(a(crv.pF, cxc.k, 1), 3, 1, 3, 15, 0.05F), cjs.d),
                  cjr.m.a(new cjr.i(a(crv.pH, cxc.k, 1), 5, 1, 3, 15, 0.05F), cjs.d),
                  cjr.m.a(new cjr.i(a(crv.pG, cxc.k, 1), 7, 1, 3, 15, 0.05F), cjs.d),
                  cjr.m.a(new cjr.i(a(crv.pI, cxc.j, 1), 8, 1, 3, 15, 0.05F), cjs.e),
                  cjr.m.a(new cjr.i(a(crv.pF, cxc.g, 1), 9, 1, 3, 15, 0.05F), cjs.e),
                  cjr.m.a(new cjr.i(a(crv.pE, cxc.w, 1), 8, 1, 3, 15, 0.05F), cjs.b),
                  cjr.m.a(new cjr.i(a(crv.pB, cxc.w, 1), 9, 1, 3, 15, 0.05F), cjs.b),
                  cjr.m.a(new cjr.i(a(crv.pD, cxc.w, 1), 11, 1, 3, 15, 0.05F), cjs.b),
                  cjr.m.a(new cjr.i(a(crv.pC, cxc.w, 1), 13, 1, 3, 15, 0.05F), cjs.b),
                  cjr.m.a(new cjr.i(a(crv.pE, cxc.L, 1), 8, 1, 3, 15, 0.05F), cjs.f),
                  cjr.m.a(new cjr.i(a(crv.pB, cxc.L, 1), 9, 1, 3, 15, 0.05F), cjs.f),
                  cjr.m.a(new cjr.i(a(crv.pD, cxc.L, 1), 11, 1, 3, 15, 0.05F), cjs.f),
                  cjr.m.a(new cjr.i(a(crv.pC, cxc.L, 1), 13, 1, 3, 15, 0.05F), cjs.f),
                  cjr.m.a(new cjr.h(crv.pM, 1, 4, crv.pL, 1, 3, 15, 0.05F), cjs.g),
                  cjr.m.a(new cjr.h(crv.pL, 1, 4, crv.pK, 1, 3, 15, 0.05F), cjs.g),
                  cjr.m.a(new cjr.h(crv.pJ, 1, 4, crv.pM, 1, 3, 15, 0.05F), cjs.g),
                  cjr.m.a(new cjr.h(crv.pK, 1, 2, crv.pJ, 1, 3, 15, 0.05F), cjs.g)
               }
            )
            .put(
               5,
               new cjr.g[]{
                  cjr.m.a(new cjr.h(crv.ox, 4, 16, a(crv.pK, cxc.h, 1), 1, 3, 30, 0.05F), cjs.a),
                  cjr.m.a(new cjr.h(crv.ox, 3, 16, a(crv.pL, cxc.h, 1), 1, 3, 30, 0.05F), cjs.a),
                  cjr.m.a(new cjr.h(crv.ox, 3, 16, a(crv.pL, cxc.a, 1), 1, 3, 30, 0.05F), cjs.c),
                  cjr.m.a(new cjr.h(crv.ox, 2, 12, a(crv.pM, cxc.a, 1), 1, 3, 30, 0.05F), cjs.c),
                  cjr.m.a(new cjr.h(crv.ox, 2, 6, a(crv.pJ, cxc.k, 1), 1, 3, 30, 0.05F), cjs.d),
                  cjr.m.a(new cjr.h(crv.ox, 3, 8, a(crv.pK, cxc.k, 1), 1, 3, 30, 0.05F), cjs.d),
                  cjr.m.a(new cjr.h(crv.ox, 2, 12, a(crv.pM, cxc.j, 1), 1, 3, 30, 0.05F), cjs.e),
                  cjr.m.a(new cjr.h(crv.ox, 3, 12, a(crv.pJ, cxc.g, 1), 1, 3, 30, 0.05F), cjs.e),
                  cjr.m.a(new cjr.i(a(crv.pB, cxc.e, 1), 9, 1, 3, 30, 0.05F), cjs.b),
                  cjr.m.a(new cjr.i(a(crv.pE, cxc.c, 1), 8, 1, 3, 30, 0.05F), cjs.b),
                  cjr.m.a(new cjr.i(a(crv.pB, cxc.f, 1), 9, 1, 3, 30, 0.05F), cjs.f),
                  cjr.m.a(new cjr.i(a(crv.pE, cxc.i, 1), 8, 1, 3, 30, 0.05F), cjs.f),
                  cjr.m.a(new cjr.h(crv.ox, 4, 18, a(crv.pK, cxc.d, 1), 1, 3, 30, 0.05F), cjs.g),
                  cjr.m.a(new cjr.h(crv.ox, 3, 18, a(crv.pL, cxc.d, 1), 1, 3, 30, 0.05F), cjs.g),
                  cjr.m.a(new cjr.b(crv.aM, 1, 12, 30, 42), cjs.g),
                  cjr.m.a(new cjr.b(crv.aJ, 1, 12, 30, 4), cjs.a, cjs.b, cjs.c, cjs.d, cjs.e, cjs.f)
               }
            )
            .build()
      ),
      cjq.e,
      a(
         ImmutableMap.of(
            1,
            new cjr.g[]{new cjr.b(crv.qN, 24, 16, 2), new cjr.i(crv.uh, 7, 1, 1)},
            2,
            new cjr.g[]{
               new cjr.b(crv.fS, 11, 16, 10),
               new cjr.m(ImmutableMap.builder().put(cjs.a, t).put(cjs.d, u).put(cjs.c, v).put(cjs.g, w).put(cjs.e, u).put(cjs.b, t).put(cjs.f, w).build()),
               new cjr.m(ImmutableMap.builder().put(cjs.a, u).put(cjs.d, s).put(cjs.c, t).put(cjs.g, u).put(cjs.e, v).put(cjs.b, s).put(cjs.f, v).build()),
               new cjr.m(
                  ImmutableMap.builder().put(cjs.a, x).put(cjs.d, x).put(cjs.c, new cjr.f()).put(cjs.g, y).put(cjs.e, y).put(cjs.b, y).put(cjs.f, x).build()
               )
            },
            3,
            new cjr.g[]{new cjr.b(crv.qR, 1, 12, 20), new cjr.l(13, avp.d, "filled_map.monument", emk.a.j, 12, 10)},
            4,
            new cjr.g[]{
               new cjr.i(crv.ua, 7, 1, 15),
               new cjr.i(crv.uN, 3, 1, 15),
               new cjr.i(crv.uY, 3, 1, 15),
               new cjr.i(crv.uQ, 3, 1, 15),
               new cjr.i(crv.vb, 3, 1, 15),
               new cjr.i(crv.uT, 3, 1, 15),
               new cjr.i(crv.va, 3, 1, 15),
               new cjr.i(crv.uS, 3, 1, 15),
               new cjr.i(crv.uU, 3, 1, 15),
               new cjr.i(crv.vc, 3, 1, 15),
               new cjr.i(crv.uX, 3, 1, 15),
               new cjr.i(crv.uP, 3, 1, 15),
               new cjr.i(crv.uW, 3, 1, 15),
               new cjr.i(crv.uZ, 3, 1, 15),
               new cjr.i(crv.uR, 3, 1, 15),
               new cjr.i(crv.uO, 3, 1, 15),
               new cjr.i(crv.uV, 3, 1, 15)
            },
            5,
            new cjr.g[]{new cjr.i(crv.vY, 8, 1, 30), new cjr.l(14, avp.c, "filled_map.mansion", emk.a.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<cjr.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new cjr.g[]{
               new cjr.b(a(ctr.a), 1, 1, 1),
               new cjr.b(crv.qy, 1, 1, 1, 2),
               new cjr.b(crv.qD, 1, 1, 1, 2),
               new cjr.b(crv.sm, 1, 1, 1, 3),
               new cjr.b(crv.uf, 4, 1, 1),
               new cjr.b(crv.hC, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cjr.g[]{
               new cjr.i(crv.hU, 1, 1, 6, 1),
               new cjr.i(crv.kU, 6, 1, 6, 1),
               new cjr.i(crv.pt, 1, 4, 2, 1),
               new cjr.i(crv.E, 3, 3, 6, 1),
               new cjr.i(dcj.Y, 1, 8, 4, 1),
               new cjr.i(dcj.W, 1, 8, 4, 1),
               new cjr.i(dcj.aa, 1, 8, 4, 1),
               new cjr.i(dcj.X, 1, 8, 4, 1),
               new cjr.i(dcj.U, 1, 8, 4, 1),
               new cjr.i(dcj.V, 1, 8, 4, 1),
               new cjr.i(dcj.Z, 1, 8, 4, 1),
               new cjr.e(crv.pb, 1, 1, 1, 0.2F),
               new cjr.i(b(ctr.h), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cjr.g[]{
               new cjr.i(crv.qH, 3, 1, 4, 1),
               new cjr.i(crv.qE, 3, 1, 4, 1),
               new cjr.i(crv.cS, 2, 1, 5, 1),
               new cjr.i(crv.qP, 4, 1, 5, 1),
               new cjr.i(crv.ft, 2, 1, 5, 1),
               new cjr.i(crv.vP, 5, 1, 5, 1),
               new cjr.i(crv.cN, 1, 1, 12, 1),
               new cjr.i(crv.dI, 1, 1, 8, 1),
               new cjr.i(crv.fj, 1, 1, 4, 1),
               new cjr.i(crv.dJ, 3, 1, 12, 1),
               new cjr.i(crv.eV, 3, 1, 8, 1),
               new cjr.i(crv.dj, 1, 1, 12, 1),
               new cjr.i(crv.dk, 1, 1, 12, 1),
               new cjr.i(crv.dl, 1, 1, 8, 1),
               new cjr.i(crv.dm, 1, 1, 12, 1),
               new cjr.i(crv.dn, 1, 1, 12, 1),
               new cjr.i(crv.do, 1, 1, 12, 1),
               new cjr.i(crv.dp, 1, 1, 12, 1),
               new cjr.i(crv.dq, 1, 1, 12, 1),
               new cjr.i(crv.dr, 1, 1, 12, 1),
               new cjr.i(crv.ds, 1, 1, 12, 1),
               new cjr.i(crv.dt, 1, 1, 12, 1),
               new cjr.i(crv.du, 1, 1, 7, 1),
               new cjr.i(crv.pu, 1, 1, 12, 1),
               new cjr.i(crv.vj, 1, 1, 12, 1),
               new cjr.i(crv.rX, 1, 1, 12, 1),
               new cjr.i(crv.rY, 1, 1, 12, 1),
               new cjr.i(crv.aa, 5, 1, 8, 1),
               new cjr.i(crv.Y, 5, 1, 8, 1),
               new cjr.i(crv.ac, 5, 1, 8, 1),
               new cjr.i(crv.Z, 5, 1, 8, 1),
               new cjr.i(crv.W, 5, 1, 8, 1),
               new cjr.i(crv.X, 5, 1, 8, 1),
               new cjr.i(crv.ab, 5, 1, 8, 1),
               new cjr.i(crv.ad, 5, 1, 8, 1),
               new cjr.i(crv.rv, 1, 3, 12, 1),
               new cjr.i(crv.rh, 1, 3, 12, 1),
               new cjr.i(crv.rs, 1, 3, 12, 1),
               new cjr.i(crv.rn, 1, 3, 12, 1),
               new cjr.i(crv.rw, 1, 3, 12, 1),
               new cjr.i(crv.ru, 1, 3, 12, 1),
               new cjr.i(crv.rp, 1, 3, 12, 1),
               new cjr.i(crv.rj, 1, 3, 12, 1),
               new cjr.i(crv.rl, 1, 3, 12, 1),
               new cjr.i(crv.ro, 1, 3, 12, 1),
               new cjr.i(crv.rr, 1, 3, 12, 1),
               new cjr.i(crv.rk, 1, 3, 12, 1),
               new cjr.i(crv.rm, 1, 3, 12, 1),
               new cjr.i(crv.ri, 1, 3, 12, 1),
               new cjr.i(crv.rt, 1, 3, 12, 1),
               new cjr.i(crv.rq, 1, 3, 12, 1),
               new cjr.i(crv.kw, 3, 1, 8, 1),
               new cjr.i(crv.kx, 3, 1, 8, 1),
               new cjr.i(crv.ky, 3, 1, 8, 1),
               new cjr.i(crv.kz, 3, 1, 8, 1),
               new cjr.i(crv.kv, 3, 1, 8, 1),
               new cjr.i(crv.fU, 1, 3, 4, 1),
               new cjr.i(crv.dz, 1, 3, 4, 1),
               new cjr.i(crv.dA, 1, 3, 4, 1),
               new cjr.i(crv.ga, 1, 5, 2, 1),
               new cjr.i(crv.dP, 1, 2, 5, 1),
               new cjr.i(crv.af, 1, 8, 8, 1),
               new cjr.i(crv.ai, 1, 4, 6, 1),
               new cjr.i(crv.xh, 1, 2, 5, 1),
               new cjr.i(crv.F, 1, 2, 5, 1),
               new cjr.i(crv.dM, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static cjr.g a(int $$0) {
      return new cjr.m(
         ImmutableMap.builder()
            .put(cjs.a, new cjr.d($$0, cxc.b, cxc.h, cxc.B))
            .put(cjs.b, new cjr.d($$0, cxc.c, cxc.e, cxc.y))
            .put(cjs.c, new cjr.d($$0, cxc.z, cxc.o, cxc.p))
            .put(cjs.d, new cjr.d($$0, cxc.q, cxc.k, cxc.t))
            .put(cjs.e, new cjr.d($$0, cxc.g, cxc.s, cxc.j))
            .put(cjs.f, new cjr.d($$0, cxc.i, cxc.f, cxc.M))
            .put(cjs.g, new cjr.d($$0, cxc.d, cxc.r, cxc.A))
            .build()
      );
   }

   private static cjr.g a() {
      return new cjr.m(
         ImmutableMap.builder()
            .put(cjs.a, new cjr.d(30, 3, 3, cxc.u))
            .put(cjs.b, new cjr.d(30, 2, 2, cxc.w))
            .put(cjs.c, new cjr.d(30, 3, 3, cxc.a))
            .put(cjs.d, new cjr.d(30, 3, 3, cxc.n))
            .put(cjs.e, new cjr.d(30, cxc.v))
            .put(cjs.f, new cjr.d(30, cxc.L))
            .put(cjs.g, new cjr.d(30, 2, 2, cxc.x))
            .build()
      );
   }

   private static Int2ObjectMap<cjr.g[]> a(ImmutableMap<Integer, cjr.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static cyc a(in<cto> $$0) {
      return new cyc(crv.sj).a($$1 -> $$1.a(jr.x, new ctq($$0)));
   }

   private static crs b(in<cto> $$0) {
      return ctq.a(crv.sj, $$0);
   }

   private static crs a(crn $$0, cwz $$1, int $$2) {
      crs $$3 = new crs($$0);
      $$3.a($$1, $$2);
      return $$3;
   }

   static class a implements cjr.g {
      private final crn a;
      private final int b;
      private final int c;
      private final int d;

      public a(crn $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(crn $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public cye a(bqa $$0, axt $$1) {
         cyc $$2 = new cyc(crv.oy, this.b);
         crs $$3 = new crs(this.a);
         if ($$3.a(avm.ba)) {
            List<cqm> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = cuf.a($$3, $$4);
         }

         return new cye($$2, $$3, this.c, this.d, 0.2F);
      }

      private static cqm a(axt $$0) {
         return cqm.a(cql.a($$0.a(16)));
      }
   }

   static class b implements cjr.g {
      private final cyc a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(czf $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(czf $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cyc($$0.p(), $$1), $$2, $$3, $$4);
      }

      public b(cyc $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public cye a(bqa $$0, axt $$1) {
         return new cye(this.a, new crs(crv.oy, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements cjr.g {
      private final Map<cjs, crn> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<cjs, crn> $$3) {
         kt.y.s().filter($$1x -> !$$3.containsKey($$1x)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + kt.y.b($$0x));
         });
         this.a = $$3;
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Nullable
      @Override
      public cye a(bqa $$0, axt $$1) {
         if ($$0 instanceof cjp $$2) {
            cyc $$3 = new cyc(this.a.get($$2.gy().a()), this.b);
            return new cye($$3, new crs(crv.oy), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements cjr.g {
      private final int a;
      private final List<cwz> b;
      private final int c;
      private final int d;

      public d(int $$0) {
         this($$0, kt.f.s().filter(cwz::i).toArray(cwz[]::new));
      }

      public d(int $$0, cwz... $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, cwz... $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = Arrays.asList($$3);
      }

      @Override
      public cye a(bqa $$0, axt $$1) {
         cwz $$2 = this.b.get($$1.a(this.b.size()));
         int $$3 = Math.max($$2.f(), this.c);
         int $$4 = Math.min($$2.a(), this.d);
         int $$5 = axm.a($$1, $$3, $$4);
         crs $$6 = cqq.a(new cxb($$2, $$5));
         int $$7 = 2 + $$1.a(5 + $$5 * 10) + 3 * $$5;
         if ($$2.b()) {
            $$7 *= 2;
         }

         if ($$7 > 64) {
            $$7 = 64;
         }

         return new cye(new cyc(crv.oy, $$7), Optional.of(new cyc(crv.qO)), $$6, 12, this.a, 0.2F);
      }
   }

   static class e implements cjr.g {
      private final crs a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(crn $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(crn $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new crs($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public cye a(bqa $$0, axt $$1) {
         int $$2 = 5 + $$1.a(15);
         crs $$3 = cxa.a($$1, new crs(this.a.f()), $$2, false);
         int $$4 = Math.min(this.b + $$2, 64);
         cyc $$5 = new cyc(crv.oy, $$4);
         return new cye($$5, $$3, this.c, this.d, this.e);
      }
   }

   static class f implements cjr.g {
      @Override
      public cye a(bqa $$0, axt $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      cye a(bqa var1, axt var2);
   }

   static class h implements cjr.g {
      private final cyc a;
      private final int b;
      private final crs c;
      private final int d;
      private final int e;
      private final float f;

      public h(czf $$0, int $$1, int $$2, crn $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new crs($$3), $$4, $$5, $$6, $$7);
      }

      h(czf $$0, int $$1, int $$2, crs $$3, int $$4, int $$5, int $$6, float $$7) {
         this(new cyc($$0, $$1), $$2, $$3.c($$4), $$5, $$6, $$7);
      }

      public h(cyc $$0, int $$1, crs $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public cye a(bqa $$0, axt $$1) {
         return new cye(new cyc(crv.oy, this.b), Optional.of(this.a), this.c.r(), 0, this.d, this.e, this.f, 0);
      }
   }

   static class i implements cjr.g {
      private final crs a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public i(dch $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new crs($$0), $$1, $$2, $$3, $$4);
      }

      public i(crn $$0, int $$1, int $$2, int $$3) {
         this(new crs($$0), $$1, $$2, 12, $$3);
      }

      public i(crn $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new crs($$0), $$1, $$2, $$3, $$4);
      }

      public i(crs $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(crn $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new crs($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(crs $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.a.e($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
      }

      @Override
      public cye a(bqa $$0, axt $$1) {
         return new cye(new cyc(crv.oy, this.b), this.a.r(), this.c, this.d, this.e);
      }
   }

   static class j implements cjr.g {
      private final cur a;
      private final int b;
      private final float c;

      public j(in<bpk> $$0, int $$1, int $$2) {
         this(new cur(List.of(new cur.a($$0, $$1))), $$2, 0.05F);
      }

      public j(cur $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public cye a(bqa $$0, axt $$1) {
         crs $$2 = new crs(crv.vS, 1);
         $$2.b(jr.y, this.a);
         return new cye(new cyc(crv.oy), $$2, 12, this.b, this.c);
      }
   }

   static class k implements cjr.g {
      private final crs a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final crn f;
      private final int g;
      private final float h;

      public k(crn $$0, int $$1, crn $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new crs($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public cye a(bqa $$0, axt $$1) {
         cyc $$2 = new cyc(crv.oy, this.c);
         List<in<cto>> $$3 = kt.i.h().filter($$0x -> !((cto)$$0x.a()).a().isEmpty() && ctp.a($$0x)).collect(Collectors.toList());
         in<cto> $$4 = ac.a($$3, $$1);
         crs $$5 = new crs(this.a.f(), this.b);
         $$5.b(jr.x, new ctq($$4));
         return new cye($$2, Optional.of(new cyc(this.f, this.g)), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements cjr.g {
      private final int a;
      private final avt<efq> b;
      private final String c;
      private final emk.a d;
      private final int e;
      private final int f;

      public l(int $$0, avt<efq> $$1, String $$2, emk.a $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public cye a(bqa $$0, axt $$1) {
         if (!($$0.dM() instanceof apu)) {
            return null;
         } else {
            apu $$2 = (apu)$$0.dM();
            id $$3 = $$2.a(this.b, $$0.dm(), 100, true);
            if ($$3 != null) {
               crs $$4 = crz.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               crz.a($$2, $$4);
               emo.a($$4, $$3, "+", this.d);
               $$4.b(jr.d, wi.c(this.c));
               return new cye(new cyc(crv.oy, this.a), Optional.of(new cyc(crv.qR)), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static record m(Map<cjs, cjr.g> a) implements cjr.g {
      public static cjr.m a(cjr.g $$0, cjs... $$1) {
         return new cjr.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public cye a(bqa $$0, axt $$1) {
         if ($$0 instanceof cjp $$2) {
            cjs $$3 = $$2.gy().a();
            cjr.g $$4 = this.a.get($$3);
            return $$4 == null ? null : $$4.a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
