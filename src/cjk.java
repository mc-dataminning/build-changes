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

public class cjk {
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
   public static final Map<cjj, Int2ObjectMap<cjk.g[]>> a = ac.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            cjj.g,
            a(
               ImmutableMap.of(
                  1,
                  new cjk.g[]{
                     new cjk.b(crm.pv, 20, 16, 2),
                     new cjk.b(crm.ue, 26, 16, 2),
                     new cjk.b(crm.ud, 22, 16, 2),
                     new cjk.b(crm.vi, 15, 16, 2),
                     new cjk.i(crm.pw, 1, 6, 16, 1)
                  },
                  2,
                  new cjk.g[]{new cjk.b(dca.eZ, 6, 12, 10), new cjk.i(crm.ur, 1, 4, 5), new cjk.i(crm.os, 1, 4, 16, 5)},
                  3,
                  new cjk.g[]{new cjk.i(crm.rR, 3, 18, 10), new cjk.b(dca.fa, 4, 12, 20)},
                  4,
                  new cjk.g[]{
                     new cjk.i(dca.eg, 1, 1, 12, 15),
                     new cjk.j(bpj.p, 100, 15),
                     new cjk.j(bpj.h, 160, 15),
                     new cjk.j(bpj.r, 140, 15),
                     new cjk.j(bpj.o, 120, 15),
                     new cjk.j(bpj.s, 280, 15),
                     new cjk.j(bpj.w, 7, 15)
                  },
                  5,
                  new cjk.g[]{new cjk.i(crm.ui, 3, 3, 30), new cjk.i(crm.ss, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            cjj.h,
            a(
               ImmutableMap.of(
                  1,
                  new cjk.g[]{
                     new cjk.b(crm.pr, 20, 16, 2),
                     new cjk.b(crm.ov, 10, 16, 2),
                     new cjk.h(crm.qY, 6, 1, crm.rc, 6, 16, 1, 0.05F),
                     new cjk.i(crm.qG, 3, 1, 16, 1)
                  },
                  2,
                  new cjk.g[]{new cjk.b(crm.qY, 15, 16, 10), new cjk.h(crm.qZ, 6, 1, crm.rd, 6, 16, 5, 0.05F), new cjk.i(crm.wp, 2, 1, 5)},
                  3,
                  new cjk.g[]{new cjk.b(crm.qZ, 13, 16, 20), new cjk.e(crm.qU, 3, 3, 10, 0.2F)},
                  4,
                  new cjk.g[]{new cjk.b(crm.ra, 6, 12, 30)},
                  5,
                  new cjk.g[]{
                     new cjk.b(crm.rb, 4, 12, 30),
                     new cjk.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(cjl.c, crm.nT)
                           .put(cjl.g, crm.nV)
                           .put(cjl.e, crm.nV)
                           .put(cjl.a, crm.nZ)
                           .put(cjl.b, crm.nZ)
                           .put(cjl.d, crm.ob)
                           .put(cjl.f, crm.of)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            cjj.n,
            a(
               ImmutableMap.of(
                  1,
                  new cjk.g[]{
                     new cjk.b(dca.bA, 18, 16, 2),
                     new cjk.b(dca.bM, 18, 16, 2),
                     new cjk.b(dca.bP, 18, 16, 2),
                     new cjk.b(dca.bH, 18, 16, 2),
                     new cjk.i(crm.rU, 2, 1, 1)
                  },
                  2,
                  new cjk.g[]{
                     new cjk.b(crm.rh, 12, 16, 10),
                     new cjk.b(crm.ro, 12, 16, 10),
                     new cjk.b(crm.rw, 12, 16, 10),
                     new cjk.b(crm.rk, 12, 16, 10),
                     new cjk.b(crm.rm, 12, 16, 10),
                     new cjk.i(dca.bA, 1, 1, 16, 5),
                     new cjk.i(dca.bB, 1, 1, 16, 5),
                     new cjk.i(dca.bC, 1, 1, 16, 5),
                     new cjk.i(dca.bD, 1, 1, 16, 5),
                     new cjk.i(dca.bE, 1, 1, 16, 5),
                     new cjk.i(dca.bF, 1, 1, 16, 5),
                     new cjk.i(dca.bG, 1, 1, 16, 5),
                     new cjk.i(dca.bH, 1, 1, 16, 5),
                     new cjk.i(dca.bI, 1, 1, 16, 5),
                     new cjk.i(dca.bJ, 1, 1, 16, 5),
                     new cjk.i(dca.bK, 1, 1, 16, 5),
                     new cjk.i(dca.bL, 1, 1, 16, 5),
                     new cjk.i(dca.bM, 1, 1, 16, 5),
                     new cjk.i(dca.bN, 1, 1, 16, 5),
                     new cjk.i(dca.bO, 1, 1, 16, 5),
                     new cjk.i(dca.bP, 1, 1, 16, 5),
                     new cjk.i(dca.ik, 1, 4, 16, 5),
                     new cjk.i(dca.il, 1, 4, 16, 5),
                     new cjk.i(dca.im, 1, 4, 16, 5),
                     new cjk.i(dca.in, 1, 4, 16, 5),
                     new cjk.i(dca.io, 1, 4, 16, 5),
                     new cjk.i(dca.ip, 1, 4, 16, 5),
                     new cjk.i(dca.iq, 1, 4, 16, 5),
                     new cjk.i(dca.ir, 1, 4, 16, 5),
                     new cjk.i(dca.is, 1, 4, 16, 5),
                     new cjk.i(dca.it, 1, 4, 16, 5),
                     new cjk.i(dca.iu, 1, 4, 16, 5),
                     new cjk.i(dca.iv, 1, 4, 16, 5),
                     new cjk.i(dca.iw, 1, 4, 16, 5),
                     new cjk.i(dca.ix, 1, 4, 16, 5),
                     new cjk.i(dca.iy, 1, 4, 16, 5),
                     new cjk.i(dca.iz, 1, 4, 16, 5)
                  },
                  3,
                  new cjk.g[]{
                     new cjk.b(crm.rl, 12, 16, 20),
                     new cjk.b(crm.rp, 12, 16, 20),
                     new cjk.b(crm.ri, 12, 16, 20),
                     new cjk.b(crm.rv, 12, 16, 20),
                     new cjk.b(crm.rn, 12, 16, 20),
                     new cjk.i(dca.aZ, 3, 1, 12, 10),
                     new cjk.i(dca.bd, 3, 1, 12, 10),
                     new cjk.i(dca.bn, 3, 1, 12, 10),
                     new cjk.i(dca.bo, 3, 1, 12, 10),
                     new cjk.i(dca.bk, 3, 1, 12, 10),
                     new cjk.i(dca.bl, 3, 1, 12, 10),
                     new cjk.i(dca.bi, 3, 1, 12, 10),
                     new cjk.i(dca.bg, 3, 1, 12, 10),
                     new cjk.i(dca.bm, 3, 1, 12, 10),
                     new cjk.i(dca.bc, 3, 1, 12, 10),
                     new cjk.i(dca.bh, 3, 1, 12, 10),
                     new cjk.i(dca.be, 3, 1, 12, 10),
                     new cjk.i(dca.bb, 3, 1, 12, 10),
                     new cjk.i(dca.ba, 3, 1, 12, 10),
                     new cjk.i(dca.bf, 3, 1, 12, 10),
                     new cjk.i(dca.bj, 3, 1, 12, 10)
                  },
                  4,
                  new cjk.g[]{
                     new cjk.b(crm.rt, 12, 16, 30),
                     new cjk.b(crm.rr, 12, 16, 30),
                     new cjk.b(crm.rs, 12, 16, 30),
                     new cjk.b(crm.ru, 12, 16, 30),
                     new cjk.b(crm.rj, 12, 16, 30),
                     new cjk.b(crm.rq, 12, 16, 30),
                     new cjk.i(crm.uN, 3, 1, 12, 15),
                     new cjk.i(crm.uY, 3, 1, 12, 15),
                     new cjk.i(crm.uQ, 3, 1, 12, 15),
                     new cjk.i(crm.vb, 3, 1, 12, 15),
                     new cjk.i(crm.uT, 3, 1, 12, 15),
                     new cjk.i(crm.va, 3, 1, 12, 15),
                     new cjk.i(crm.uS, 3, 1, 12, 15),
                     new cjk.i(crm.uU, 3, 1, 12, 15),
                     new cjk.i(crm.vc, 3, 1, 12, 15),
                     new cjk.i(crm.uX, 3, 1, 12, 15),
                     new cjk.i(crm.uP, 3, 1, 12, 15),
                     new cjk.i(crm.uW, 3, 1, 12, 15),
                     new cjk.i(crm.uZ, 3, 1, 12, 15),
                     new cjk.i(crm.uR, 3, 1, 12, 15),
                     new cjk.i(crm.uO, 3, 1, 12, 15),
                     new cjk.i(crm.uV, 3, 1, 12, 15)
                  },
                  5,
                  new cjk.g[]{new cjk.i(crm.pY, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            cjj.i,
            a(
               ImmutableMap.of(
                  1,
                  new cjk.g[]{new cjk.b(crm.po, 32, 16, 2), new cjk.i(crm.ou, 1, 16, 1), new cjk.h(dca.L, 10, 1, crm.pV, 10, 12, 1, 0.05F)},
                  2,
                  new cjk.g[]{new cjk.b(crm.pV, 26, 12, 10), new cjk.i(crm.ot, 2, 1, 5)},
                  3,
                  new cjk.g[]{new cjk.b(crm.pr, 14, 16, 20), new cjk.i(crm.vR, 3, 1, 10)},
                  4,
                  new cjk.g[]{new cjk.b(crm.ps, 24, 16, 30), new cjk.e(crm.ot, 2, 3, 15)},
                  5,
                  new cjk.g[]{new cjk.b(crm.ma, 8, 12, 30), new cjk.e(crm.vR, 3, 3, 15), new cjk.k(crm.ou, 5, crm.vo, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            cjj.k,
            a(
               ImmutableMap.builder()
                  .put(1, new cjk.g[]{new cjk.b(crm.qN, 24, 16, 2), new cjk.d(1), new cjk.i(dca.cl, 9, 1, 12, 1)})
                  .put(2, new cjk.g[]{new cjk.b(crm.qO, 4, 12, 10), new cjk.d(5), new cjk.i(crm.wl, 1, 1, 5)})
                  .put(3, new cjk.g[]{new cjk.b(crm.re, 5, 12, 20), new cjk.d(10), new cjk.i(crm.cF, 1, 4, 10)})
                  .put(4, new cjk.g[]{new cjk.b(crm.tY, 2, 12, 30), new cjk.d(15), new cjk.i(crm.qV, 5, 1, 15), new cjk.i(crm.qR, 4, 1, 15)})
                  .put(5, new cjk.g[]{new cjk.i(crm.uJ, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            cjj.e,
            a(
               ImmutableMap.of(
                  1,
                  new cjk.g[]{new cjk.b(crm.qN, 24, 16, 2), new cjk.i(crm.uh, 7, 1, 1)},
                  2,
                  new cjk.g[]{new cjk.b(crm.fS, 11, 16, 10), new cjk.l(13, avn.d, "filled_map.monument", emb.a.j, 12, 5)},
                  3,
                  new cjk.g[]{new cjk.b(crm.qR, 1, 12, 20), new cjk.l(14, avn.c, "filled_map.mansion", emb.a.i, 12, 10)},
                  4,
                  new cjk.g[]{
                     new cjk.i(crm.ua, 7, 1, 15),
                     new cjk.i(crm.uN, 3, 1, 15),
                     new cjk.i(crm.uY, 3, 1, 15),
                     new cjk.i(crm.uQ, 3, 1, 15),
                     new cjk.i(crm.vb, 3, 1, 15),
                     new cjk.i(crm.uT, 3, 1, 15),
                     new cjk.i(crm.va, 3, 1, 15),
                     new cjk.i(crm.uS, 3, 1, 15),
                     new cjk.i(crm.uU, 3, 1, 15),
                     new cjk.i(crm.vc, 3, 1, 15),
                     new cjk.i(crm.uX, 3, 1, 15),
                     new cjk.i(crm.uP, 3, 1, 15),
                     new cjk.i(crm.uW, 3, 1, 15),
                     new cjk.i(crm.uZ, 3, 1, 15),
                     new cjk.i(crm.uR, 3, 1, 15),
                     new cjk.i(crm.uO, 3, 1, 15),
                     new cjk.i(crm.uV, 3, 1, 15)
                  },
                  5,
                  new cjk.g[]{new cjk.i(crm.vY, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            cjj.f,
            a(
               ImmutableMap.of(
                  1,
                  new cjk.g[]{new cjk.b(crm.sd, 32, 16, 2), new cjk.i(crm.lG, 1, 2, 1)},
                  2,
                  new cjk.g[]{new cjk.b(crm.oH, 3, 12, 10), new cjk.i(crm.oz, 1, 1, 5)},
                  3,
                  new cjk.g[]{new cjk.b(crm.uB, 2, 12, 20), new cjk.i(dca.ec, 4, 1, 12, 10)},
                  4,
                  new cjk.g[]{new cjk.b(crm.oo, 4, 12, 30), new cjk.b(crm.sk, 9, 12, 30), new cjk.i(crm.se, 5, 1, 15)},
                  5,
                  new cjk.g[]{new cjk.b(crm.si, 22, 12, 30), new cjk.i(crm.tV, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            cjj.c,
            a(
               ImmutableMap.of(
                  1,
                  new cjk.g[]{
                     new cjk.b(crm.ov, 15, 16, 2),
                     new cjk.i(new crj(crm.pH), 7, 1, 12, 1, 0.2F),
                     new cjk.i(new crj(crm.pI), 4, 1, 12, 1, 0.2F),
                     new cjk.i(new crj(crm.pF), 5, 1, 12, 1, 0.2F),
                     new cjk.i(new crj(crm.pG), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cjk.g[]{
                     new cjk.b(crm.oD, 4, 12, 10),
                     new cjk.i(new crj(crm.wk), 36, 1, 12, 5, 0.2F),
                     new cjk.i(new crj(crm.pE), 1, 1, 12, 5, 0.2F),
                     new cjk.i(new crj(crm.pD), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new cjk.g[]{
                     new cjk.b(crm.qz, 1, 12, 20),
                     new cjk.b(crm.ox, 1, 12, 20),
                     new cjk.i(new crj(crm.pB), 1, 1, 12, 10, 0.2F),
                     new cjk.i(new crj(crm.pC), 4, 1, 12, 10, 0.2F),
                     new cjk.i(new crj(crm.vq), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new cjk.g[]{new cjk.e(crm.pL, 14, 3, 15, 0.2F), new cjk.e(crm.pM, 8, 3, 15, 0.2F)},
                  5,
                  new cjk.g[]{new cjk.e(crm.pJ, 8, 3, 30, 0.2F), new cjk.e(crm.pK, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cjj.p,
            a(
               ImmutableMap.of(
                  1,
                  new cjk.g[]{new cjk.b(crm.ov, 15, 16, 2), new cjk.i(new crj(crm.pc), 3, 1, 12, 1, 0.2F), new cjk.e(crm.oZ, 2, 3, 1)},
                  2,
                  new cjk.g[]{new cjk.b(crm.oD, 4, 12, 10), new cjk.i(new crj(crm.wk), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cjk.g[]{new cjk.b(crm.pV, 24, 12, 20)},
                  4,
                  new cjk.g[]{new cjk.b(crm.ox, 1, 12, 30), new cjk.e(crm.ph, 12, 3, 15, 0.2F)},
                  5,
                  new cjk.g[]{new cjk.e(crm.pe, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cjj.o,
            a(
               ImmutableMap.of(
                  1,
                  new cjk.g[]{
                     new cjk.b(crm.ov, 15, 16, 2),
                     new cjk.i(new crj(crm.oS), 1, 1, 12, 1, 0.2F),
                     new cjk.i(new crj(crm.oQ), 1, 1, 12, 1, 0.2F),
                     new cjk.i(new crj(crm.oR), 1, 1, 12, 1, 0.2F),
                     new cjk.i(new crj(crm.oT), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cjk.g[]{new cjk.b(crm.oD, 4, 12, 10), new cjk.i(new crj(crm.wk), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cjk.g[]{
                     new cjk.b(crm.pV, 30, 12, 20),
                     new cjk.e(crm.pc, 1, 3, 10, 0.2F),
                     new cjk.e(crm.pa, 2, 3, 10, 0.2F),
                     new cjk.e(crm.pb, 3, 3, 10, 0.2F),
                     new cjk.i(new crj(crm.pi), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new cjk.g[]{new cjk.b(crm.ox, 1, 12, 30), new cjk.e(crm.ph, 12, 3, 15, 0.2F), new cjk.e(crm.pf, 5, 3, 15, 0.2F)},
                  5,
                  new cjk.g[]{new cjk.e(crm.pg, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cjj.d,
            a(
               ImmutableMap.of(
                  1,
                  new cjk.g[]{new cjk.b(crm.sb, 14, 16, 2), new cjk.b(crm.pW, 7, 16, 2), new cjk.b(crm.uy, 4, 16, 2), new cjk.i(crm.uA, 1, 1, 1)},
                  2,
                  new cjk.g[]{new cjk.b(crm.ov, 15, 16, 2), new cjk.i(crm.pX, 1, 5, 16, 5), new cjk.i(crm.sc, 1, 8, 16, 5)},
                  3,
                  new cjk.g[]{new cjk.b(crm.uL, 7, 16, 20), new cjk.b(crm.rZ, 10, 16, 20)},
                  4,
                  new cjk.g[]{new cjk.b(crm.qM, 10, 12, 30)},
                  5,
                  new cjk.g[]{new cjk.b(crm.wn, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            cjj.j,
            a(
               ImmutableMap.of(
                  1,
                  new cjk.g[]{new cjk.b(crm.qC, 6, 16, 2), new cjk.a(crm.pz, 3), new cjk.a(crm.py, 7)},
                  2,
                  new cjk.g[]{new cjk.b(crm.pV, 26, 12, 10), new cjk.a(crm.px, 5, 12, 5), new cjk.a(crm.pA, 4, 12, 5)},
                  3,
                  new cjk.g[]{new cjk.b(crm.uC, 9, 12, 20), new cjk.a(crm.py, 7)},
                  4,
                  new cjk.g[]{new cjk.b(crm.oo, 4, 12, 30), new cjk.a(crm.uH, 6, 12, 15)},
                  5,
                  new cjk.g[]{new cjk.i(new crj(crm.nK), 6, 1, 12, 30, 0.2F), new cjk.a(crm.px, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            cjj.l,
            a(
               ImmutableMap.of(
                  1,
                  new cjk.g[]{new cjk.b(crm.qL, 10, 16, 2), new cjk.i(crm.qK, 1, 10, 16, 1)},
                  2,
                  new cjk.g[]{new cjk.b(dca.b, 20, 16, 10), new cjk.i(dca.eK, 1, 4, 16, 5)},
                  3,
                  new cjk.g[]{
                     new cjk.b(dca.c, 16, 16, 20),
                     new cjk.b(dca.g, 16, 16, 20),
                     new cjk.b(dca.e, 16, 16, 20),
                     new cjk.i(dca.su, 1, 4, 16, 10),
                     new cjk.i(dca.h, 1, 4, 16, 10),
                     new cjk.i(dca.f, 1, 4, 16, 10),
                     new cjk.i(dca.d, 1, 4, 16, 10)
                  },
                  4,
                  new cjk.g[]{
                     new cjk.b(crm.oA, 12, 12, 30),
                     new cjk.i(dca.hk, 1, 1, 12, 15),
                     new cjk.i(dca.hj, 1, 1, 12, 15),
                     new cjk.i(dca.hu, 1, 1, 12, 15),
                     new cjk.i(dca.hm, 1, 1, 12, 15),
                     new cjk.i(dca.hq, 1, 1, 12, 15),
                     new cjk.i(dca.hr, 1, 1, 12, 15),
                     new cjk.i(dca.hy, 1, 1, 12, 15),
                     new cjk.i(dca.hx, 1, 1, 12, 15),
                     new cjk.i(dca.hp, 1, 1, 12, 15),
                     new cjk.i(dca.hl, 1, 1, 12, 15),
                     new cjk.i(dca.ho, 1, 1, 12, 15),
                     new cjk.i(dca.hw, 1, 1, 12, 15),
                     new cjk.i(dca.hs, 1, 1, 12, 15),
                     new cjk.i(dca.ht, 1, 1, 12, 15),
                     new cjk.i(dca.hn, 1, 1, 12, 15),
                     new cjk.i(dca.hv, 1, 1, 12, 15),
                     new cjk.i(dca.lh, 1, 1, 12, 15),
                     new cjk.i(dca.lg, 1, 1, 12, 15),
                     new cjk.i(dca.lr, 1, 1, 12, 15),
                     new cjk.i(dca.lj, 1, 1, 12, 15),
                     new cjk.i(dca.ln, 1, 1, 12, 15),
                     new cjk.i(dca.lo, 1, 1, 12, 15),
                     new cjk.i(dca.lv, 1, 1, 12, 15),
                     new cjk.i(dca.lu, 1, 1, 12, 15),
                     new cjk.i(dca.lm, 1, 1, 12, 15),
                     new cjk.i(dca.li, 1, 1, 12, 15),
                     new cjk.i(dca.ll, 1, 1, 12, 15),
                     new cjk.i(dca.lt, 1, 1, 12, 15),
                     new cjk.i(dca.lp, 1, 1, 12, 15),
                     new cjk.i(dca.lq, 1, 1, 12, 15),
                     new cjk.i(dca.lk, 1, 1, 12, 15),
                     new cjk.i(dca.ls, 1, 1, 12, 15)
                  },
                  5,
                  new cjk.g[]{new cjk.i(dca.hf, 1, 1, 12, 30), new cjk.i(dca.hd, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<cjk.g[]> b = a(
      ImmutableMap.of(
         1,
         new cjk.g[]{
            new cjk.i(crm.cS, 2, 1, 5, 1),
            new cjk.i(crm.qP, 4, 1, 5, 1),
            new cjk.i(crm.ft, 2, 1, 5, 1),
            new cjk.i(crm.vP, 5, 1, 5, 1),
            new cjk.i(crm.cN, 1, 1, 12, 1),
            new cjk.i(crm.dI, 1, 1, 8, 1),
            new cjk.i(crm.fj, 1, 1, 4, 1),
            new cjk.i(crm.dJ, 3, 1, 12, 1),
            new cjk.i(crm.eV, 3, 1, 8, 1),
            new cjk.i(crm.dj, 1, 1, 12, 1),
            new cjk.i(crm.dk, 1, 1, 12, 1),
            new cjk.i(crm.dl, 1, 1, 8, 1),
            new cjk.i(crm.dm, 1, 1, 12, 1),
            new cjk.i(crm.dn, 1, 1, 12, 1),
            new cjk.i(crm.do, 1, 1, 12, 1),
            new cjk.i(crm.dp, 1, 1, 12, 1),
            new cjk.i(crm.dq, 1, 1, 12, 1),
            new cjk.i(crm.dr, 1, 1, 12, 1),
            new cjk.i(crm.ds, 1, 1, 12, 1),
            new cjk.i(crm.dt, 1, 1, 12, 1),
            new cjk.i(crm.du, 1, 1, 7, 1),
            new cjk.i(crm.pu, 1, 1, 12, 1),
            new cjk.i(crm.vj, 1, 1, 12, 1),
            new cjk.i(crm.rX, 1, 1, 12, 1),
            new cjk.i(crm.rY, 1, 1, 12, 1),
            new cjk.i(crm.aa, 5, 1, 8, 1),
            new cjk.i(crm.Y, 5, 1, 8, 1),
            new cjk.i(crm.ac, 5, 1, 8, 1),
            new cjk.i(crm.Z, 5, 1, 8, 1),
            new cjk.i(crm.W, 5, 1, 8, 1),
            new cjk.i(crm.X, 5, 1, 8, 1),
            new cjk.i(crm.ab, 5, 1, 8, 1),
            new cjk.i(crm.ad, 5, 1, 8, 1),
            new cjk.i(crm.rv, 1, 3, 12, 1),
            new cjk.i(crm.rh, 1, 3, 12, 1),
            new cjk.i(crm.rs, 1, 3, 12, 1),
            new cjk.i(crm.rn, 1, 3, 12, 1),
            new cjk.i(crm.rw, 1, 3, 12, 1),
            new cjk.i(crm.ru, 1, 3, 12, 1),
            new cjk.i(crm.rp, 1, 3, 12, 1),
            new cjk.i(crm.rj, 1, 3, 12, 1),
            new cjk.i(crm.rl, 1, 3, 12, 1),
            new cjk.i(crm.ro, 1, 3, 12, 1),
            new cjk.i(crm.rr, 1, 3, 12, 1),
            new cjk.i(crm.rk, 1, 3, 12, 1),
            new cjk.i(crm.rm, 1, 3, 12, 1),
            new cjk.i(crm.ri, 1, 3, 12, 1),
            new cjk.i(crm.rt, 1, 3, 12, 1),
            new cjk.i(crm.rq, 1, 3, 12, 1),
            new cjk.i(crm.kw, 3, 1, 8, 1),
            new cjk.i(crm.kx, 3, 1, 8, 1),
            new cjk.i(crm.ky, 3, 1, 8, 1),
            new cjk.i(crm.kz, 3, 1, 8, 1),
            new cjk.i(crm.kv, 3, 1, 8, 1),
            new cjk.i(crm.fU, 1, 1, 12, 1),
            new cjk.i(crm.dz, 1, 1, 12, 1),
            new cjk.i(crm.dA, 1, 1, 12, 1),
            new cjk.i(crm.ga, 1, 2, 5, 1),
            new cjk.i(crm.dP, 1, 2, 5, 1),
            new cjk.i(crm.af, 1, 8, 8, 1),
            new cjk.i(crm.ai, 1, 4, 6, 1),
            new cjk.i(crm.xh, 1, 2, 5, 1),
            new cjk.i(crm.F, 1, 2, 5, 1),
            new cjk.i(crm.dM, 1, 2, 5, 1)
         },
         2,
         new cjk.g[]{
            new cjk.i(crm.qH, 5, 1, 4, 1),
            new cjk.i(crm.qE, 5, 1, 4, 1),
            new cjk.i(crm.hU, 3, 1, 6, 1),
            new cjk.i(crm.kU, 6, 1, 6, 1),
            new cjk.i(crm.pt, 1, 1, 8, 1),
            new cjk.i(crm.E, 3, 3, 6, 1)
         }
      )
   );
   private static final cjk.l s = new cjk.l(8, avn.f, "filled_map.village_desert", emb.a.B, 12, 5);
   private static final cjk.l t = new cjk.l(8, avn.e, "filled_map.village_savanna", emb.a.D, 12, 5);
   private static final cjk.l u = new cjk.l(8, avn.g, "filled_map.village_plains", emb.a.C, 12, 5);
   private static final cjk.l v = new cjk.l(8, avn.h, "filled_map.village_taiga", emb.a.F, 12, 5);
   private static final cjk.l w = new cjk.l(8, avn.i, "filled_map.village_snowy", emb.a.E, 12, 5);
   private static final cjk.l x = new cjk.l(8, avn.j, "filled_map.explorer_jungle", emb.a.G, 12, 5);
   private static final cjk.l y = new cjk.l(8, avn.k, "filled_map.explorer_swamp", emb.a.H, 12, 5);
   public static final Map<cjj, Int2ObjectMap<cjk.g[]>> c = Map.of(
      cjj.k,
      a(
         ImmutableMap.builder()
            .put(1, new cjk.g[]{new cjk.b(crm.qN, 24, 16, 2), a(1), new cjk.i(dca.cl, 9, 1, 12, 1)})
            .put(2, new cjk.g[]{new cjk.b(crm.qO, 4, 12, 10), a(5), new cjk.i(crm.wl, 1, 1, 5)})
            .put(3, new cjk.g[]{new cjk.b(crm.re, 5, 12, 20), a(10), new cjk.i(crm.cF, 1, 4, 10)})
            .put(4, new cjk.g[]{new cjk.b(crm.tY, 2, 12, 30), new cjk.i(crm.qV, 5, 1, 15), new cjk.i(crm.qR, 4, 1, 15)})
            .put(5, new cjk.g[]{a(), new cjk.i(crm.uJ, 20, 1, 30)})
            .build()
      ),
      cjj.c,
      a(
         ImmutableMap.builder()
            .put(1, new cjk.g[]{new cjk.b(crm.ov, 15, 12, 2), new cjk.b(crm.oD, 5, 12, 2)})
            .put(
               2,
               new cjk.g[]{
                  cjk.m.a(new cjk.i(crm.pI, 4, 1, 12, 5, 0.05F), cjl.a, cjl.c, cjl.d, cjl.e, cjl.g),
                  cjk.m.a(new cjk.i(crm.pE, 4, 1, 12, 5, 0.05F), cjl.b, cjl.f),
                  cjk.m.a(new cjk.i(crm.pF, 5, 1, 12, 5, 0.05F), cjl.a, cjl.c, cjl.d, cjl.e, cjl.g),
                  cjk.m.a(new cjk.i(crm.pB, 5, 1, 12, 5, 0.05F), cjl.b, cjl.f),
                  cjk.m.a(new cjk.i(crm.pH, 7, 1, 12, 5, 0.05F), cjl.a, cjl.c, cjl.d, cjl.e, cjl.g),
                  cjk.m.a(new cjk.i(crm.pD, 7, 1, 12, 5, 0.05F), cjl.b, cjl.f),
                  cjk.m.a(new cjk.i(crm.pG, 9, 1, 12, 5, 0.05F), cjl.a, cjl.c, cjl.d, cjl.e, cjl.g),
                  cjk.m.a(new cjk.i(crm.pC, 9, 1, 12, 5, 0.05F), cjl.b, cjl.f)
               }
            )
            .put(3, new cjk.g[]{new cjk.b(crm.qz, 1, 12, 20), new cjk.i(crm.vq, 5, 1, 12, 10, 0.05F), new cjk.i(crm.wk, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new cjk.g[]{
                  cjk.m.a(new cjk.i(a(crm.pI, cwt.h, 1), 8, 1, 3, 15, 0.05F), cjl.a),
                  cjk.m.a(new cjk.i(a(crm.pF, cwt.h, 1), 9, 1, 3, 15, 0.05F), cjl.a),
                  cjk.m.a(new cjk.i(a(crm.pH, cwt.h, 1), 11, 1, 3, 15, 0.05F), cjl.a),
                  cjk.m.a(new cjk.i(a(crm.pG, cwt.h, 1), 13, 1, 3, 15, 0.05F), cjl.a),
                  cjk.m.a(new cjk.i(a(crm.pI, cwt.a, 1), 8, 1, 3, 15, 0.05F), cjl.c),
                  cjk.m.a(new cjk.i(a(crm.pF, cwt.a, 1), 9, 1, 3, 15, 0.05F), cjl.c),
                  cjk.m.a(new cjk.i(a(crm.pH, cwt.a, 1), 11, 1, 3, 15, 0.05F), cjl.c),
                  cjk.m.a(new cjk.i(a(crm.pG, cwt.a, 1), 13, 1, 3, 15, 0.05F), cjl.c),
                  cjk.m.a(new cjk.i(a(crm.pI, cwt.k, 1), 2, 1, 3, 15, 0.05F), cjl.d),
                  cjk.m.a(new cjk.i(a(crm.pF, cwt.k, 1), 3, 1, 3, 15, 0.05F), cjl.d),
                  cjk.m.a(new cjk.i(a(crm.pH, cwt.k, 1), 5, 1, 3, 15, 0.05F), cjl.d),
                  cjk.m.a(new cjk.i(a(crm.pG, cwt.k, 1), 7, 1, 3, 15, 0.05F), cjl.d),
                  cjk.m.a(new cjk.i(a(crm.pI, cwt.j, 1), 8, 1, 3, 15, 0.05F), cjl.e),
                  cjk.m.a(new cjk.i(a(crm.pF, cwt.g, 1), 9, 1, 3, 15, 0.05F), cjl.e),
                  cjk.m.a(new cjk.i(a(crm.pE, cwt.w, 1), 8, 1, 3, 15, 0.05F), cjl.b),
                  cjk.m.a(new cjk.i(a(crm.pB, cwt.w, 1), 9, 1, 3, 15, 0.05F), cjl.b),
                  cjk.m.a(new cjk.i(a(crm.pD, cwt.w, 1), 11, 1, 3, 15, 0.05F), cjl.b),
                  cjk.m.a(new cjk.i(a(crm.pC, cwt.w, 1), 13, 1, 3, 15, 0.05F), cjl.b),
                  cjk.m.a(new cjk.i(a(crm.pE, cwt.L, 1), 8, 1, 3, 15, 0.05F), cjl.f),
                  cjk.m.a(new cjk.i(a(crm.pB, cwt.L, 1), 9, 1, 3, 15, 0.05F), cjl.f),
                  cjk.m.a(new cjk.i(a(crm.pD, cwt.L, 1), 11, 1, 3, 15, 0.05F), cjl.f),
                  cjk.m.a(new cjk.i(a(crm.pC, cwt.L, 1), 13, 1, 3, 15, 0.05F), cjl.f),
                  cjk.m.a(new cjk.h(crm.pM, 1, 4, crm.pL, 1, 3, 15, 0.05F), cjl.g),
                  cjk.m.a(new cjk.h(crm.pL, 1, 4, crm.pK, 1, 3, 15, 0.05F), cjl.g),
                  cjk.m.a(new cjk.h(crm.pJ, 1, 4, crm.pM, 1, 3, 15, 0.05F), cjl.g),
                  cjk.m.a(new cjk.h(crm.pK, 1, 2, crm.pJ, 1, 3, 15, 0.05F), cjl.g)
               }
            )
            .put(
               5,
               new cjk.g[]{
                  cjk.m.a(new cjk.h(crm.ox, 4, 16, a(crm.pK, cwt.h, 1), 1, 3, 30, 0.05F), cjl.a),
                  cjk.m.a(new cjk.h(crm.ox, 3, 16, a(crm.pL, cwt.h, 1), 1, 3, 30, 0.05F), cjl.a),
                  cjk.m.a(new cjk.h(crm.ox, 3, 16, a(crm.pL, cwt.a, 1), 1, 3, 30, 0.05F), cjl.c),
                  cjk.m.a(new cjk.h(crm.ox, 2, 12, a(crm.pM, cwt.a, 1), 1, 3, 30, 0.05F), cjl.c),
                  cjk.m.a(new cjk.h(crm.ox, 2, 6, a(crm.pJ, cwt.k, 1), 1, 3, 30, 0.05F), cjl.d),
                  cjk.m.a(new cjk.h(crm.ox, 3, 8, a(crm.pK, cwt.k, 1), 1, 3, 30, 0.05F), cjl.d),
                  cjk.m.a(new cjk.h(crm.ox, 2, 12, a(crm.pM, cwt.j, 1), 1, 3, 30, 0.05F), cjl.e),
                  cjk.m.a(new cjk.h(crm.ox, 3, 12, a(crm.pJ, cwt.g, 1), 1, 3, 30, 0.05F), cjl.e),
                  cjk.m.a(new cjk.i(a(crm.pB, cwt.e, 1), 9, 1, 3, 30, 0.05F), cjl.b),
                  cjk.m.a(new cjk.i(a(crm.pE, cwt.c, 1), 8, 1, 3, 30, 0.05F), cjl.b),
                  cjk.m.a(new cjk.i(a(crm.pB, cwt.f, 1), 9, 1, 3, 30, 0.05F), cjl.f),
                  cjk.m.a(new cjk.i(a(crm.pE, cwt.i, 1), 8, 1, 3, 30, 0.05F), cjl.f),
                  cjk.m.a(new cjk.h(crm.ox, 4, 18, a(crm.pK, cwt.d, 1), 1, 3, 30, 0.05F), cjl.g),
                  cjk.m.a(new cjk.h(crm.ox, 3, 18, a(crm.pL, cwt.d, 1), 1, 3, 30, 0.05F), cjl.g),
                  cjk.m.a(new cjk.b(crm.aM, 1, 12, 30, 42), cjl.g),
                  cjk.m.a(new cjk.b(crm.aJ, 1, 12, 30, 4), cjl.a, cjl.b, cjl.c, cjl.d, cjl.e, cjl.f)
               }
            )
            .build()
      ),
      cjj.e,
      a(
         ImmutableMap.of(
            1,
            new cjk.g[]{new cjk.b(crm.qN, 24, 16, 2), new cjk.i(crm.uh, 7, 1, 1)},
            2,
            new cjk.g[]{
               new cjk.b(crm.fS, 11, 16, 10),
               new cjk.m(ImmutableMap.builder().put(cjl.a, t).put(cjl.d, u).put(cjl.c, v).put(cjl.g, w).put(cjl.e, u).put(cjl.b, t).put(cjl.f, w).build()),
               new cjk.m(ImmutableMap.builder().put(cjl.a, u).put(cjl.d, s).put(cjl.c, t).put(cjl.g, u).put(cjl.e, v).put(cjl.b, s).put(cjl.f, v).build()),
               new cjk.m(
                  ImmutableMap.builder().put(cjl.a, x).put(cjl.d, x).put(cjl.c, new cjk.f()).put(cjl.g, y).put(cjl.e, y).put(cjl.b, y).put(cjl.f, x).build()
               )
            },
            3,
            new cjk.g[]{new cjk.b(crm.qR, 1, 12, 20), new cjk.l(13, avn.d, "filled_map.monument", emb.a.j, 12, 10)},
            4,
            new cjk.g[]{
               new cjk.i(crm.ua, 7, 1, 15),
               new cjk.i(crm.uN, 3, 1, 15),
               new cjk.i(crm.uY, 3, 1, 15),
               new cjk.i(crm.uQ, 3, 1, 15),
               new cjk.i(crm.vb, 3, 1, 15),
               new cjk.i(crm.uT, 3, 1, 15),
               new cjk.i(crm.va, 3, 1, 15),
               new cjk.i(crm.uS, 3, 1, 15),
               new cjk.i(crm.uU, 3, 1, 15),
               new cjk.i(crm.vc, 3, 1, 15),
               new cjk.i(crm.uX, 3, 1, 15),
               new cjk.i(crm.uP, 3, 1, 15),
               new cjk.i(crm.uW, 3, 1, 15),
               new cjk.i(crm.uZ, 3, 1, 15),
               new cjk.i(crm.uR, 3, 1, 15),
               new cjk.i(crm.uO, 3, 1, 15),
               new cjk.i(crm.uV, 3, 1, 15)
            },
            5,
            new cjk.g[]{new cjk.i(crm.vY, 8, 1, 30), new cjk.l(14, avn.c, "filled_map.mansion", emb.a.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<cjk.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new cjk.g[]{
               new cjk.b(a(cti.a), 1, 1, 1),
               new cjk.b(crm.qy, 1, 1, 1, 2),
               new cjk.b(crm.qD, 1, 1, 1, 2),
               new cjk.b(crm.sm, 1, 1, 1, 3),
               new cjk.b(crm.uf, 4, 1, 1),
               new cjk.b(crm.hC, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cjk.g[]{
               new cjk.i(crm.hU, 1, 1, 6, 1),
               new cjk.i(crm.kU, 6, 1, 6, 1),
               new cjk.i(crm.pt, 1, 4, 2, 1),
               new cjk.i(crm.E, 3, 3, 6, 1),
               new cjk.i(dca.Y, 1, 8, 4, 1),
               new cjk.i(dca.W, 1, 8, 4, 1),
               new cjk.i(dca.aa, 1, 8, 4, 1),
               new cjk.i(dca.X, 1, 8, 4, 1),
               new cjk.i(dca.U, 1, 8, 4, 1),
               new cjk.i(dca.V, 1, 8, 4, 1),
               new cjk.i(dca.Z, 1, 8, 4, 1),
               new cjk.e(crm.pb, 1, 1, 1, 0.2F),
               new cjk.i(b(cti.h), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cjk.g[]{
               new cjk.i(crm.qH, 3, 1, 4, 1),
               new cjk.i(crm.qE, 3, 1, 4, 1),
               new cjk.i(crm.cS, 2, 1, 5, 1),
               new cjk.i(crm.qP, 4, 1, 5, 1),
               new cjk.i(crm.ft, 2, 1, 5, 1),
               new cjk.i(crm.vP, 5, 1, 5, 1),
               new cjk.i(crm.cN, 1, 1, 12, 1),
               new cjk.i(crm.dI, 1, 1, 8, 1),
               new cjk.i(crm.fj, 1, 1, 4, 1),
               new cjk.i(crm.dJ, 3, 1, 12, 1),
               new cjk.i(crm.eV, 3, 1, 8, 1),
               new cjk.i(crm.dj, 1, 1, 12, 1),
               new cjk.i(crm.dk, 1, 1, 12, 1),
               new cjk.i(crm.dl, 1, 1, 8, 1),
               new cjk.i(crm.dm, 1, 1, 12, 1),
               new cjk.i(crm.dn, 1, 1, 12, 1),
               new cjk.i(crm.do, 1, 1, 12, 1),
               new cjk.i(crm.dp, 1, 1, 12, 1),
               new cjk.i(crm.dq, 1, 1, 12, 1),
               new cjk.i(crm.dr, 1, 1, 12, 1),
               new cjk.i(crm.ds, 1, 1, 12, 1),
               new cjk.i(crm.dt, 1, 1, 12, 1),
               new cjk.i(crm.du, 1, 1, 7, 1),
               new cjk.i(crm.pu, 1, 1, 12, 1),
               new cjk.i(crm.vj, 1, 1, 12, 1),
               new cjk.i(crm.rX, 1, 1, 12, 1),
               new cjk.i(crm.rY, 1, 1, 12, 1),
               new cjk.i(crm.aa, 5, 1, 8, 1),
               new cjk.i(crm.Y, 5, 1, 8, 1),
               new cjk.i(crm.ac, 5, 1, 8, 1),
               new cjk.i(crm.Z, 5, 1, 8, 1),
               new cjk.i(crm.W, 5, 1, 8, 1),
               new cjk.i(crm.X, 5, 1, 8, 1),
               new cjk.i(crm.ab, 5, 1, 8, 1),
               new cjk.i(crm.ad, 5, 1, 8, 1),
               new cjk.i(crm.rv, 1, 3, 12, 1),
               new cjk.i(crm.rh, 1, 3, 12, 1),
               new cjk.i(crm.rs, 1, 3, 12, 1),
               new cjk.i(crm.rn, 1, 3, 12, 1),
               new cjk.i(crm.rw, 1, 3, 12, 1),
               new cjk.i(crm.ru, 1, 3, 12, 1),
               new cjk.i(crm.rp, 1, 3, 12, 1),
               new cjk.i(crm.rj, 1, 3, 12, 1),
               new cjk.i(crm.rl, 1, 3, 12, 1),
               new cjk.i(crm.ro, 1, 3, 12, 1),
               new cjk.i(crm.rr, 1, 3, 12, 1),
               new cjk.i(crm.rk, 1, 3, 12, 1),
               new cjk.i(crm.rm, 1, 3, 12, 1),
               new cjk.i(crm.ri, 1, 3, 12, 1),
               new cjk.i(crm.rt, 1, 3, 12, 1),
               new cjk.i(crm.rq, 1, 3, 12, 1),
               new cjk.i(crm.kw, 3, 1, 8, 1),
               new cjk.i(crm.kx, 3, 1, 8, 1),
               new cjk.i(crm.ky, 3, 1, 8, 1),
               new cjk.i(crm.kz, 3, 1, 8, 1),
               new cjk.i(crm.kv, 3, 1, 8, 1),
               new cjk.i(crm.fU, 1, 3, 4, 1),
               new cjk.i(crm.dz, 1, 3, 4, 1),
               new cjk.i(crm.dA, 1, 3, 4, 1),
               new cjk.i(crm.ga, 1, 5, 2, 1),
               new cjk.i(crm.dP, 1, 2, 5, 1),
               new cjk.i(crm.af, 1, 8, 8, 1),
               new cjk.i(crm.ai, 1, 4, 6, 1),
               new cjk.i(crm.xh, 1, 2, 5, 1),
               new cjk.i(crm.F, 1, 2, 5, 1),
               new cjk.i(crm.dM, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static cjk.g a(int $$0) {
      return new cjk.m(
         ImmutableMap.builder()
            .put(cjl.a, new cjk.d($$0, cwt.b, cwt.h, cwt.B))
            .put(cjl.b, new cjk.d($$0, cwt.c, cwt.e, cwt.y))
            .put(cjl.c, new cjk.d($$0, cwt.z, cwt.o, cwt.p))
            .put(cjl.d, new cjk.d($$0, cwt.q, cwt.k, cwt.t))
            .put(cjl.e, new cjk.d($$0, cwt.g, cwt.s, cwt.j))
            .put(cjl.f, new cjk.d($$0, cwt.i, cwt.f, cwt.M))
            .put(cjl.g, new cjk.d($$0, cwt.d, cwt.r, cwt.A))
            .build()
      );
   }

   private static cjk.g a() {
      return new cjk.m(
         ImmutableMap.builder()
            .put(cjl.a, new cjk.d(30, 3, 3, cwt.u))
            .put(cjl.b, new cjk.d(30, 2, 2, cwt.w))
            .put(cjl.c, new cjk.d(30, 3, 3, cwt.a))
            .put(cjl.d, new cjk.d(30, 3, 3, cwt.n))
            .put(cjl.e, new cjk.d(30, cwt.v))
            .put(cjl.f, new cjk.d(30, cwt.L))
            .put(cjl.g, new cjk.d(30, 2, 2, cwt.x))
            .build()
      );
   }

   private static Int2ObjectMap<cjk.g[]> a(ImmutableMap<Integer, cjk.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static cxt a(il<ctf> $$0) {
      return new cxt(crm.sj).a($$1 -> $$1.a(jp.x, new cth($$0)));
   }

   private static crj b(il<ctf> $$0) {
      return cth.a(crm.sj, $$0);
   }

   private static crj a(cre $$0, cwq $$1, int $$2) {
      crj $$3 = new crj($$0);
      $$3.a($$1, $$2);
      return $$3;
   }

   static class a implements cjk.g {
      private final cre a;
      private final int b;
      private final int c;
      private final int d;

      public a(cre $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(cre $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public cxv a(bpv $$0, axr $$1) {
         cxt $$2 = new cxt(crm.oy, this.b);
         crj $$3 = new crj(this.a);
         if ($$3.a(avk.ba)) {
            List<cqd> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = ctw.a($$3, $$4);
         }

         return new cxv($$2, $$3, this.c, this.d, 0.2F);
      }

      private static cqd a(axr $$0) {
         return cqd.a(cqc.a($$0.a(16)));
      }
   }

   static class b implements cjk.g {
      private final cxt a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(cyw $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(cyw $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cxt($$0.p(), $$1), $$2, $$3, $$4);
      }

      public b(cxt $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public cxv a(bpv $$0, axr $$1) {
         return new cxv(this.a, new crj(crm.oy, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements cjk.g {
      private final Map<cjl, cre> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<cjl, cre> $$3) {
         kr.y.s().filter($$1x -> !$$3.containsKey($$1x)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + kr.y.b($$0x));
         });
         this.a = $$3;
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Nullable
      @Override
      public cxv a(bpv $$0, axr $$1) {
         if ($$0 instanceof cji $$2) {
            cxt $$3 = new cxt(this.a.get($$2.gy().a()), this.b);
            return new cxv($$3, new crj(crm.oy), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements cjk.g {
      private final int a;
      private final List<cwq> b;
      private final int c;
      private final int d;

      public d(int $$0) {
         this($$0, kr.f.s().filter(cwq::i).toArray(cwq[]::new));
      }

      public d(int $$0, cwq... $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, cwq... $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = Arrays.asList($$3);
      }

      @Override
      public cxv a(bpv $$0, axr $$1) {
         cwq $$2 = this.b.get($$1.a(this.b.size()));
         int $$3 = Math.max($$2.f(), this.c);
         int $$4 = Math.min($$2.a(), this.d);
         int $$5 = axk.a($$1, $$3, $$4);
         crj $$6 = cqh.a(new cws($$2, $$5));
         int $$7 = 2 + $$1.a(5 + $$5 * 10) + 3 * $$5;
         if ($$2.b()) {
            $$7 *= 2;
         }

         if ($$7 > 64) {
            $$7 = 64;
         }

         return new cxv(new cxt(crm.oy, $$7), Optional.of(new cxt(crm.qO)), $$6, 12, this.a, 0.2F);
      }
   }

   static class e implements cjk.g {
      private final crj a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(cre $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(cre $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new crj($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public cxv a(bpv $$0, axr $$1) {
         int $$2 = 5 + $$1.a(15);
         crj $$3 = cwr.a($$1, new crj(this.a.f()), $$2, false);
         int $$4 = Math.min(this.b + $$2, 64);
         cxt $$5 = new cxt(crm.oy, $$4);
         return new cxv($$5, $$3, this.c, this.d, this.e);
      }
   }

   static class f implements cjk.g {
      @Override
      public cxv a(bpv $$0, axr $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      cxv a(bpv var1, axr var2);
   }

   static class h implements cjk.g {
      private final cxt a;
      private final int b;
      private final crj c;
      private final int d;
      private final int e;
      private final float f;

      public h(cyw $$0, int $$1, int $$2, cre $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new crj($$3), $$4, $$5, $$6, $$7);
      }

      h(cyw $$0, int $$1, int $$2, crj $$3, int $$4, int $$5, int $$6, float $$7) {
         this(new cxt($$0, $$1), $$2, $$3.c($$4), $$5, $$6, $$7);
      }

      public h(cxt $$0, int $$1, crj $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public cxv a(bpv $$0, axr $$1) {
         return new cxv(new cxt(crm.oy, this.b), Optional.of(this.a), this.c.r(), 0, this.d, this.e, this.f, 0);
      }
   }

   static class i implements cjk.g {
      private final crj a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public i(dby $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new crj($$0), $$1, $$2, $$3, $$4);
      }

      public i(cre $$0, int $$1, int $$2, int $$3) {
         this(new crj($$0), $$1, $$2, 12, $$3);
      }

      public i(cre $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new crj($$0), $$1, $$2, $$3, $$4);
      }

      public i(crj $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(cre $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new crj($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(crj $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this.a = $$0;
         this.b = $$1;
         this.a.e($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
      }

      @Override
      public cxv a(bpv $$0, axr $$1) {
         return new cxv(new cxt(crm.oy, this.b), this.a.r(), this.c, this.d, this.e);
      }
   }

   static class j implements cjk.g {
      private final cui a;
      private final int b;
      private final float c;

      public j(il<bpf> $$0, int $$1, int $$2) {
         this(new cui(List.of(new cui.a($$0, $$1))), $$2, 0.05F);
      }

      public j(cui $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public cxv a(bpv $$0, axr $$1) {
         crj $$2 = new crj(crm.vS, 1);
         $$2.b(jp.y, this.a);
         return new cxv(new cxt(crm.oy), $$2, 12, this.b, this.c);
      }
   }

   static class k implements cjk.g {
      private final crj a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final cre f;
      private final int g;
      private final float h;

      public k(cre $$0, int $$1, cre $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new crj($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public cxv a(bpv $$0, axr $$1) {
         cxt $$2 = new cxt(crm.oy, this.c);
         List<il<ctf>> $$3 = kr.i.h().filter($$0x -> !((ctf)$$0x.a()).a().isEmpty() && ctg.a($$0x)).collect(Collectors.toList());
         il<ctf> $$4 = ac.a($$3, $$1);
         crj $$5 = new crj(this.a.f(), this.b);
         $$5.b(jp.x, new cth($$4));
         return new cxv($$2, Optional.of(new cxt(this.f, this.g)), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements cjk.g {
      private final int a;
      private final avr<efh> b;
      private final String c;
      private final emb.a d;
      private final int e;
      private final int f;

      public l(int $$0, avr<efh> $$1, String $$2, emb.a $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public cxv a(bpv $$0, axr $$1) {
         if (!($$0.dM() instanceof aps)) {
            return null;
         } else {
            aps $$2 = (aps)$$0.dM();
            ib $$3 = $$2.a(this.b, $$0.dm(), 100, true);
            if ($$3 != null) {
               crj $$4 = crq.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               crq.a($$2, $$4);
               emf.a($$4, $$3, "+", this.d);
               $$4.b(jp.d, wg.c(this.c));
               return new cxv(new cxt(crm.oy, this.a), Optional.of(new cxt(crm.qR)), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static record m(Map<cjl, cjk.g> a) implements cjk.g {
      public static cjk.m a(cjk.g $$0, cjl... $$1) {
         return new cjk.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public cxv a(bpv $$0, axr $$1) {
         if ($$0 instanceof cji $$2) {
            cjl $$3 = $$2.gy().a();
            cjk.g $$4 = this.a.get($$3);
            return $$4 == null ? null : $$4.a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
