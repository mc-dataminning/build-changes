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

public class cng {
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
   public static final Map<cnf, Int2ObjectMap<cng.g[]>> a = ad.a(
      Maps.newHashMap(),
      $$0 -> {
         $$0.put(
            cnf.g,
            a(
               ImmutableMap.of(
                  1,
                  new cng.g[]{
                     new cng.b(cvo.px, 20, 16, 2),
                     new cng.b(cvo.ui, 26, 16, 2),
                     new cng.b(cvo.uh, 22, 16, 2),
                     new cng.b(cvo.vm, 15, 16, 2),
                     new cng.i(cvo.py, 1, 6, 16, 1)
                  },
                  2,
                  new cng.g[]{new cng.b(dgx.eZ, 6, 12, 10), new cng.i(cvo.uv, 1, 4, 5), new cng.i(cvo.ov, 1, 4, 16, 5)},
                  3,
                  new cng.g[]{new cng.i(cvo.rT, 3, 18, 10), new cng.b(dgx.fa, 4, 12, 20)},
                  4,
                  new cng.g[]{
                     new cng.i(dgx.eg, 1, 1, 12, 15),
                     new cng.j(bss.p, 100, 15),
                     new cng.j(bss.h, 160, 15),
                     new cng.j(bss.r, 140, 15),
                     new cng.j(bss.o, 120, 15),
                     new cng.j(bss.s, 280, 15),
                     new cng.j(bss.w, 7, 15)
                  },
                  5,
                  new cng.g[]{new cng.i(cvo.um, 3, 3, 30), new cng.i(cvo.su, 4, 3, 30)}
               )
            )
         );
         $$0.put(
            cnf.h,
            a(
               ImmutableMap.of(
                  1,
                  new cng.g[]{
                     new cng.b(cvo.pt, 20, 16, 2),
                     new cng.b(cvo.oy, 10, 16, 2),
                     new cng.h(cvo.ra, 6, 1, cvo.re, 6, 16, 1, 0.05F),
                     new cng.i(cvo.qI, 3, 1, 16, 1)
                  },
                  2,
                  new cng.g[]{new cng.b(cvo.ra, 15, 16, 10), new cng.h(cvo.rb, 6, 1, cvo.rf, 6, 16, 5, 0.05F), new cng.i(cvo.wz, 2, 1, 5)},
                  3,
                  new cng.g[]{new cng.b(cvo.rb, 13, 16, 20), new cng.e(cvo.qW, 3, 3, 10, 0.2F)},
                  4,
                  new cng.g[]{new cng.b(cvo.rc, 6, 12, 30)},
                  5,
                  new cng.g[]{
                     new cng.b(cvo.rd, 4, 12, 30),
                     new cng.c(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(cnh.c, cvo.nV)
                           .put(cnh.g, cvo.nX)
                           .put(cnh.e, cvo.nX)
                           .put(cnh.a, cvo.ob)
                           .put(cnh.b, cvo.ob)
                           .put(cnh.d, cvo.od)
                           .put(cnh.f, cvo.oh)
                           .build()
                     )
                  }
               )
            )
         );
         $$0.put(
            cnf.n,
            a(
               ImmutableMap.of(
                  1,
                  new cng.g[]{
                     new cng.b(dgx.bA, 18, 16, 2),
                     new cng.b(dgx.bM, 18, 16, 2),
                     new cng.b(dgx.bP, 18, 16, 2),
                     new cng.b(dgx.bH, 18, 16, 2),
                     new cng.i(cvo.rW, 2, 1, 1)
                  },
                  2,
                  new cng.g[]{
                     new cng.b(cvo.rj, 12, 16, 10),
                     new cng.b(cvo.rq, 12, 16, 10),
                     new cng.b(cvo.ry, 12, 16, 10),
                     new cng.b(cvo.rm, 12, 16, 10),
                     new cng.b(cvo.ro, 12, 16, 10),
                     new cng.i(dgx.bA, 1, 1, 16, 5),
                     new cng.i(dgx.bB, 1, 1, 16, 5),
                     new cng.i(dgx.bC, 1, 1, 16, 5),
                     new cng.i(dgx.bD, 1, 1, 16, 5),
                     new cng.i(dgx.bE, 1, 1, 16, 5),
                     new cng.i(dgx.bF, 1, 1, 16, 5),
                     new cng.i(dgx.bG, 1, 1, 16, 5),
                     new cng.i(dgx.bH, 1, 1, 16, 5),
                     new cng.i(dgx.bI, 1, 1, 16, 5),
                     new cng.i(dgx.bJ, 1, 1, 16, 5),
                     new cng.i(dgx.bK, 1, 1, 16, 5),
                     new cng.i(dgx.bL, 1, 1, 16, 5),
                     new cng.i(dgx.bM, 1, 1, 16, 5),
                     new cng.i(dgx.bN, 1, 1, 16, 5),
                     new cng.i(dgx.bO, 1, 1, 16, 5),
                     new cng.i(dgx.bP, 1, 1, 16, 5),
                     new cng.i(dgx.ik, 1, 4, 16, 5),
                     new cng.i(dgx.il, 1, 4, 16, 5),
                     new cng.i(dgx.im, 1, 4, 16, 5),
                     new cng.i(dgx.in, 1, 4, 16, 5),
                     new cng.i(dgx.io, 1, 4, 16, 5),
                     new cng.i(dgx.ip, 1, 4, 16, 5),
                     new cng.i(dgx.iq, 1, 4, 16, 5),
                     new cng.i(dgx.ir, 1, 4, 16, 5),
                     new cng.i(dgx.is, 1, 4, 16, 5),
                     new cng.i(dgx.it, 1, 4, 16, 5),
                     new cng.i(dgx.iu, 1, 4, 16, 5),
                     new cng.i(dgx.iv, 1, 4, 16, 5),
                     new cng.i(dgx.iw, 1, 4, 16, 5),
                     new cng.i(dgx.ix, 1, 4, 16, 5),
                     new cng.i(dgx.iy, 1, 4, 16, 5),
                     new cng.i(dgx.iz, 1, 4, 16, 5)
                  },
                  3,
                  new cng.g[]{
                     new cng.b(cvo.rn, 12, 16, 20),
                     new cng.b(cvo.rr, 12, 16, 20),
                     new cng.b(cvo.rk, 12, 16, 20),
                     new cng.b(cvo.rx, 12, 16, 20),
                     new cng.b(cvo.rp, 12, 16, 20),
                     new cng.i(dgx.aZ, 3, 1, 12, 10),
                     new cng.i(dgx.bd, 3, 1, 12, 10),
                     new cng.i(dgx.bn, 3, 1, 12, 10),
                     new cng.i(dgx.bo, 3, 1, 12, 10),
                     new cng.i(dgx.bk, 3, 1, 12, 10),
                     new cng.i(dgx.bl, 3, 1, 12, 10),
                     new cng.i(dgx.bi, 3, 1, 12, 10),
                     new cng.i(dgx.bg, 3, 1, 12, 10),
                     new cng.i(dgx.bm, 3, 1, 12, 10),
                     new cng.i(dgx.bc, 3, 1, 12, 10),
                     new cng.i(dgx.bh, 3, 1, 12, 10),
                     new cng.i(dgx.be, 3, 1, 12, 10),
                     new cng.i(dgx.bb, 3, 1, 12, 10),
                     new cng.i(dgx.ba, 3, 1, 12, 10),
                     new cng.i(dgx.bf, 3, 1, 12, 10),
                     new cng.i(dgx.bj, 3, 1, 12, 10)
                  },
                  4,
                  new cng.g[]{
                     new cng.b(cvo.rv, 12, 16, 30),
                     new cng.b(cvo.rt, 12, 16, 30),
                     new cng.b(cvo.ru, 12, 16, 30),
                     new cng.b(cvo.rw, 12, 16, 30),
                     new cng.b(cvo.rl, 12, 16, 30),
                     new cng.b(cvo.rs, 12, 16, 30),
                     new cng.i(cvo.uR, 3, 1, 12, 15),
                     new cng.i(cvo.vc, 3, 1, 12, 15),
                     new cng.i(cvo.uU, 3, 1, 12, 15),
                     new cng.i(cvo.vf, 3, 1, 12, 15),
                     new cng.i(cvo.uX, 3, 1, 12, 15),
                     new cng.i(cvo.ve, 3, 1, 12, 15),
                     new cng.i(cvo.uW, 3, 1, 12, 15),
                     new cng.i(cvo.uY, 3, 1, 12, 15),
                     new cng.i(cvo.vg, 3, 1, 12, 15),
                     new cng.i(cvo.vb, 3, 1, 12, 15),
                     new cng.i(cvo.uT, 3, 1, 12, 15),
                     new cng.i(cvo.va, 3, 1, 12, 15),
                     new cng.i(cvo.vd, 3, 1, 12, 15),
                     new cng.i(cvo.uV, 3, 1, 12, 15),
                     new cng.i(cvo.uS, 3, 1, 12, 15),
                     new cng.i(cvo.uZ, 3, 1, 12, 15)
                  },
                  5,
                  new cng.g[]{new cng.i(cvo.qa, 2, 3, 30)}
               )
            )
         );
         $$0.put(
            cnf.i,
            a(
               ImmutableMap.of(
                  1,
                  new cng.g[]{new cng.b(cvo.pr, 32, 16, 2), new cng.i(cvo.ox, 1, 16, 1), new cng.h(dgx.L, 10, 1, cvo.pX, 10, 12, 1, 0.05F)},
                  2,
                  new cng.g[]{new cng.b(cvo.pX, 26, 12, 10), new cng.i(cvo.ow, 2, 1, 5)},
                  3,
                  new cng.g[]{new cng.b(cvo.pt, 14, 16, 20), new cng.i(cvo.vX, 3, 1, 10)},
                  4,
                  new cng.g[]{new cng.b(cvo.pu, 24, 16, 30), new cng.e(cvo.ow, 2, 3, 15)},
                  5,
                  new cng.g[]{new cng.b(cvo.mb, 8, 12, 30), new cng.e(cvo.vX, 3, 3, 15), new cng.k(cvo.ox, 5, cvo.vs, 5, 2, 12, 30)}
               )
            )
         );
         $$0.put(
            cnf.k,
            a(
               ImmutableMap.builder()
                  .put(1, new cng.g[]{new cng.b(cvo.qP, 24, 16, 2), new cng.d(1, awv.i), new cng.i(dgx.cl, 9, 1, 12, 1)})
                  .put(2, new cng.g[]{new cng.b(cvo.qQ, 4, 12, 10), new cng.d(5, awv.i), new cng.i(cvo.wv, 1, 1, 5)})
                  .put(3, new cng.g[]{new cng.b(cvo.rg, 5, 12, 20), new cng.d(10, awv.i), new cng.i(cvo.cG, 1, 4, 10)})
                  .put(4, new cng.g[]{new cng.b(cvo.ua, 2, 12, 30), new cng.d(15, awv.i), new cng.i(cvo.qX, 5, 1, 15), new cng.i(cvo.qT, 4, 1, 15)})
                  .put(5, new cng.g[]{new cng.i(cvo.uN, 20, 1, 30)})
                  .build()
            )
         );
         $$0.put(
            cnf.e,
            a(
               ImmutableMap.of(
                  1,
                  new cng.g[]{new cng.b(cvo.qP, 24, 16, 2), new cng.i(cvo.ul, 7, 1, 1)},
                  2,
                  new cng.g[]{new cng.b(cvo.fT, 11, 16, 10), new cng.l(13, axe.d, "filled_map.monument", err.j, 12, 5)},
                  3,
                  new cng.g[]{
                     new cng.b(cvo.qT, 1, 12, 20),
                     new cng.l(14, axe.c, "filled_map.mansion", err.i, 12, 10),
                     new cng.l(12, axe.m, "filled_map.trial_chambers", err.I, 12, 10)
                  },
                  4,
                  new cng.g[]{
                     new cng.i(cvo.ue, 7, 1, 15),
                     new cng.i(cvo.uR, 3, 1, 15),
                     new cng.i(cvo.vc, 3, 1, 15),
                     new cng.i(cvo.uU, 3, 1, 15),
                     new cng.i(cvo.vf, 3, 1, 15),
                     new cng.i(cvo.uX, 3, 1, 15),
                     new cng.i(cvo.ve, 3, 1, 15),
                     new cng.i(cvo.uW, 3, 1, 15),
                     new cng.i(cvo.uY, 3, 1, 15),
                     new cng.i(cvo.vg, 3, 1, 15),
                     new cng.i(cvo.vb, 3, 1, 15),
                     new cng.i(cvo.uT, 3, 1, 15),
                     new cng.i(cvo.va, 3, 1, 15),
                     new cng.i(cvo.vd, 3, 1, 15),
                     new cng.i(cvo.uV, 3, 1, 15),
                     new cng.i(cvo.uS, 3, 1, 15),
                     new cng.i(cvo.uZ, 3, 1, 15)
                  },
                  5,
                  new cng.g[]{new cng.i(cvo.we, 8, 1, 30)}
               )
            )
         );
         $$0.put(
            cnf.f,
            a(
               ImmutableMap.of(
                  1,
                  new cng.g[]{new cng.b(cvo.sf, 32, 16, 2), new cng.i(cvo.lH, 1, 2, 1)},
                  2,
                  new cng.g[]{new cng.b(cvo.oK, 3, 12, 10), new cng.i(cvo.oC, 1, 1, 5)},
                  3,
                  new cng.g[]{new cng.b(cvo.uF, 2, 12, 20), new cng.i(dgx.ec, 4, 1, 12, 10)},
                  4,
                  new cng.g[]{new cng.b(cvo.oq, 4, 12, 30), new cng.b(cvo.sm, 9, 12, 30), new cng.i(cvo.sg, 5, 1, 15)},
                  5,
                  new cng.g[]{new cng.b(cvo.sk, 22, 12, 30), new cng.i(cvo.tX, 3, 1, 30)}
               )
            )
         );
         $$0.put(
            cnf.c,
            a(
               ImmutableMap.of(
                  1,
                  new cng.g[]{
                     new cng.b(cvo.oy, 15, 16, 2),
                     new cng.i(new cvl(cvo.pJ), 7, 1, 12, 1, 0.2F),
                     new cng.i(new cvl(cvo.pK), 4, 1, 12, 1, 0.2F),
                     new cng.i(new cvl(cvo.pH), 5, 1, 12, 1, 0.2F),
                     new cng.i(new cvl(cvo.pI), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cng.g[]{
                     new cng.b(cvo.oG, 4, 12, 10),
                     new cng.i(new cvl(cvo.wu), 36, 1, 12, 5, 0.2F),
                     new cng.i(new cvl(cvo.pG), 1, 1, 12, 5, 0.2F),
                     new cng.i(new cvl(cvo.pF), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new cng.g[]{
                     new cng.b(cvo.qB, 1, 12, 20),
                     new cng.b(cvo.oA, 1, 12, 20),
                     new cng.i(new cvl(cvo.pD), 1, 1, 12, 10, 0.2F),
                     new cng.i(new cvl(cvo.pE), 4, 1, 12, 10, 0.2F),
                     new cng.i(new cvl(cvo.vu), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new cng.g[]{new cng.e(cvo.pN, 14, 3, 15, 0.2F), new cng.e(cvo.pO, 8, 3, 15, 0.2F)},
                  5,
                  new cng.g[]{new cng.e(cvo.pL, 8, 3, 30, 0.2F), new cng.e(cvo.pM, 16, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cnf.p,
            a(
               ImmutableMap.of(
                  1,
                  new cng.g[]{new cng.b(cvo.oy, 15, 16, 2), new cng.i(new cvl(cvo.pf), 3, 1, 12, 1, 0.2F), new cng.e(cvo.pc, 2, 3, 1)},
                  2,
                  new cng.g[]{new cng.b(cvo.oG, 4, 12, 10), new cng.i(new cvl(cvo.wu), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cng.g[]{new cng.b(cvo.pX, 24, 12, 20)},
                  4,
                  new cng.g[]{new cng.b(cvo.oA, 1, 12, 30), new cng.e(cvo.pk, 12, 3, 15, 0.2F)},
                  5,
                  new cng.g[]{new cng.e(cvo.ph, 8, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cnf.o,
            a(
               ImmutableMap.of(
                  1,
                  new cng.g[]{
                     new cng.b(cvo.oy, 15, 16, 2),
                     new cng.i(new cvl(cvo.oV), 1, 1, 12, 1, 0.2F),
                     new cng.i(new cvl(cvo.oT), 1, 1, 12, 1, 0.2F),
                     new cng.i(new cvl(cvo.oU), 1, 1, 12, 1, 0.2F),
                     new cng.i(new cvl(cvo.oW), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new cng.g[]{new cng.b(cvo.oG, 4, 12, 10), new cng.i(new cvl(cvo.wu), 36, 1, 12, 5, 0.2F)},
                  3,
                  new cng.g[]{
                     new cng.b(cvo.pX, 30, 12, 20),
                     new cng.e(cvo.pf, 1, 3, 10, 0.2F),
                     new cng.e(cvo.pd, 2, 3, 10, 0.2F),
                     new cng.e(cvo.pe, 3, 3, 10, 0.2F),
                     new cng.i(new cvl(cvo.pl), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new cng.g[]{new cng.b(cvo.oA, 1, 12, 30), new cng.e(cvo.pk, 12, 3, 15, 0.2F), new cng.e(cvo.pi, 5, 3, 15, 0.2F)},
                  5,
                  new cng.g[]{new cng.e(cvo.pj, 13, 3, 30, 0.2F)}
               )
            )
         );
         $$0.put(
            cnf.d,
            a(
               ImmutableMap.of(
                  1,
                  new cng.g[]{new cng.b(cvo.sd, 14, 16, 2), new cng.b(cvo.pY, 7, 16, 2), new cng.b(cvo.uC, 4, 16, 2), new cng.i(cvo.uE, 1, 1, 1)},
                  2,
                  new cng.g[]{new cng.b(cvo.oy, 15, 16, 2), new cng.i(cvo.pZ, 1, 5, 16, 5), new cng.i(cvo.se, 1, 8, 16, 5)},
                  3,
                  new cng.g[]{new cng.b(cvo.uP, 7, 16, 20), new cng.b(cvo.sb, 10, 16, 20)},
                  4,
                  new cng.g[]{new cng.b(cvo.qO, 10, 12, 30)},
                  5,
                  new cng.g[]{new cng.b(cvo.wx, 10, 12, 30)}
               )
            )
         );
         $$0.put(
            cnf.j,
            a(
               ImmutableMap.of(
                  1,
                  new cng.g[]{new cng.b(cvo.qE, 6, 16, 2), new cng.a(cvo.pB, 3), new cng.a(cvo.pA, 7)},
                  2,
                  new cng.g[]{new cng.b(cvo.pX, 26, 12, 10), new cng.a(cvo.pz, 5, 12, 5), new cng.a(cvo.pC, 4, 12, 5)},
                  3,
                  new cng.g[]{new cng.b(cvo.uG, 9, 12, 20), new cng.a(cvo.pA, 7)},
                  4,
                  new cng.g[]{new cng.b(cvo.oq, 4, 12, 30), new cng.a(cvo.uL, 6, 12, 15)},
                  5,
                  new cng.g[]{new cng.i(new cvl(cvo.nL), 6, 1, 12, 30, 0.2F), new cng.a(cvo.pz, 5, 12, 30)}
               )
            )
         );
         $$0.put(
            cnf.l,
            a(
               ImmutableMap.of(
                  1,
                  new cng.g[]{new cng.b(cvo.qN, 10, 16, 2), new cng.i(cvo.qM, 1, 10, 16, 1)},
                  2,
                  new cng.g[]{new cng.b(dgx.b, 20, 16, 10), new cng.i(dgx.eK, 1, 4, 16, 5)},
                  3,
                  new cng.g[]{
                     new cng.b(dgx.c, 16, 16, 20),
                     new cng.b(dgx.g, 16, 16, 20),
                     new cng.b(dgx.e, 16, 16, 20),
                     new cng.i(dgx.su, 1, 4, 16, 10),
                     new cng.i(dgx.h, 1, 4, 16, 10),
                     new cng.i(dgx.f, 1, 4, 16, 10),
                     new cng.i(dgx.d, 1, 4, 16, 10)
                  },
                  4,
                  new cng.g[]{
                     new cng.b(cvo.oD, 12, 12, 30),
                     new cng.i(dgx.hk, 1, 1, 12, 15),
                     new cng.i(dgx.hj, 1, 1, 12, 15),
                     new cng.i(dgx.hu, 1, 1, 12, 15),
                     new cng.i(dgx.hm, 1, 1, 12, 15),
                     new cng.i(dgx.hq, 1, 1, 12, 15),
                     new cng.i(dgx.hr, 1, 1, 12, 15),
                     new cng.i(dgx.hy, 1, 1, 12, 15),
                     new cng.i(dgx.hx, 1, 1, 12, 15),
                     new cng.i(dgx.hp, 1, 1, 12, 15),
                     new cng.i(dgx.hl, 1, 1, 12, 15),
                     new cng.i(dgx.ho, 1, 1, 12, 15),
                     new cng.i(dgx.hw, 1, 1, 12, 15),
                     new cng.i(dgx.hs, 1, 1, 12, 15),
                     new cng.i(dgx.ht, 1, 1, 12, 15),
                     new cng.i(dgx.hn, 1, 1, 12, 15),
                     new cng.i(dgx.hv, 1, 1, 12, 15),
                     new cng.i(dgx.lh, 1, 1, 12, 15),
                     new cng.i(dgx.lg, 1, 1, 12, 15),
                     new cng.i(dgx.lr, 1, 1, 12, 15),
                     new cng.i(dgx.lj, 1, 1, 12, 15),
                     new cng.i(dgx.ln, 1, 1, 12, 15),
                     new cng.i(dgx.lo, 1, 1, 12, 15),
                     new cng.i(dgx.lv, 1, 1, 12, 15),
                     new cng.i(dgx.lu, 1, 1, 12, 15),
                     new cng.i(dgx.lm, 1, 1, 12, 15),
                     new cng.i(dgx.li, 1, 1, 12, 15),
                     new cng.i(dgx.ll, 1, 1, 12, 15),
                     new cng.i(dgx.lt, 1, 1, 12, 15),
                     new cng.i(dgx.lp, 1, 1, 12, 15),
                     new cng.i(dgx.lq, 1, 1, 12, 15),
                     new cng.i(dgx.lk, 1, 1, 12, 15),
                     new cng.i(dgx.ls, 1, 1, 12, 15)
                  },
                  5,
                  new cng.g[]{new cng.i(dgx.hf, 1, 1, 12, 30), new cng.i(dgx.hd, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static final Int2ObjectMap<cng.g[]> b = a(
      ImmutableMap.of(
         1,
         new cng.g[]{
            new cng.i(cvo.cT, 2, 1, 5, 1),
            new cng.i(cvo.qR, 4, 1, 5, 1),
            new cng.i(cvo.fu, 2, 1, 5, 1),
            new cng.i(cvo.vV, 5, 1, 5, 1),
            new cng.i(cvo.cO, 1, 1, 12, 1),
            new cng.i(cvo.dJ, 1, 1, 8, 1),
            new cng.i(cvo.fk, 1, 1, 4, 1),
            new cng.i(cvo.dK, 3, 1, 12, 1),
            new cng.i(cvo.eW, 3, 1, 8, 1),
            new cng.i(cvo.dk, 1, 1, 12, 1),
            new cng.i(cvo.dl, 1, 1, 12, 1),
            new cng.i(cvo.dm, 1, 1, 8, 1),
            new cng.i(cvo.dn, 1, 1, 12, 1),
            new cng.i(cvo.do, 1, 1, 12, 1),
            new cng.i(cvo.dp, 1, 1, 12, 1),
            new cng.i(cvo.dq, 1, 1, 12, 1),
            new cng.i(cvo.dr, 1, 1, 12, 1),
            new cng.i(cvo.ds, 1, 1, 12, 1),
            new cng.i(cvo.dt, 1, 1, 12, 1),
            new cng.i(cvo.du, 1, 1, 12, 1),
            new cng.i(cvo.dv, 1, 1, 7, 1),
            new cng.i(cvo.pw, 1, 1, 12, 1),
            new cng.i(cvo.vn, 1, 1, 12, 1),
            new cng.i(cvo.rZ, 1, 1, 12, 1),
            new cng.i(cvo.sa, 1, 1, 12, 1),
            new cng.i(cvo.aa, 5, 1, 8, 1),
            new cng.i(cvo.Y, 5, 1, 8, 1),
            new cng.i(cvo.ac, 5, 1, 8, 1),
            new cng.i(cvo.Z, 5, 1, 8, 1),
            new cng.i(cvo.W, 5, 1, 8, 1),
            new cng.i(cvo.X, 5, 1, 8, 1),
            new cng.i(cvo.ab, 5, 1, 8, 1),
            new cng.i(cvo.ad, 5, 1, 8, 1),
            new cng.i(cvo.rx, 1, 3, 12, 1),
            new cng.i(cvo.rj, 1, 3, 12, 1),
            new cng.i(cvo.ru, 1, 3, 12, 1),
            new cng.i(cvo.rp, 1, 3, 12, 1),
            new cng.i(cvo.ry, 1, 3, 12, 1),
            new cng.i(cvo.rw, 1, 3, 12, 1),
            new cng.i(cvo.rr, 1, 3, 12, 1),
            new cng.i(cvo.rl, 1, 3, 12, 1),
            new cng.i(cvo.rn, 1, 3, 12, 1),
            new cng.i(cvo.rq, 1, 3, 12, 1),
            new cng.i(cvo.rt, 1, 3, 12, 1),
            new cng.i(cvo.rm, 1, 3, 12, 1),
            new cng.i(cvo.ro, 1, 3, 12, 1),
            new cng.i(cvo.rk, 1, 3, 12, 1),
            new cng.i(cvo.rv, 1, 3, 12, 1),
            new cng.i(cvo.rs, 1, 3, 12, 1),
            new cng.i(cvo.kx, 3, 1, 8, 1),
            new cng.i(cvo.ky, 3, 1, 8, 1),
            new cng.i(cvo.kz, 3, 1, 8, 1),
            new cng.i(cvo.kA, 3, 1, 8, 1),
            new cng.i(cvo.kw, 3, 1, 8, 1),
            new cng.i(cvo.fV, 1, 1, 12, 1),
            new cng.i(cvo.dA, 1, 1, 12, 1),
            new cng.i(cvo.dB, 1, 1, 12, 1),
            new cng.i(cvo.gb, 1, 2, 5, 1),
            new cng.i(cvo.dQ, 1, 2, 5, 1),
            new cng.i(cvo.af, 1, 8, 8, 1),
            new cng.i(cvo.ai, 1, 4, 6, 1),
            new cng.i(cvo.xr, 1, 2, 5, 1),
            new cng.i(cvo.F, 1, 2, 5, 1),
            new cng.i(cvo.dN, 1, 2, 5, 1)
         },
         2,
         new cng.g[]{
            new cng.i(cvo.qJ, 5, 1, 4, 1),
            new cng.i(cvo.qG, 5, 1, 4, 1),
            new cng.i(cvo.hV, 3, 1, 6, 1),
            new cng.i(cvo.kV, 6, 1, 6, 1),
            new cng.i(cvo.pv, 1, 1, 8, 1),
            new cng.i(cvo.E, 3, 3, 6, 1)
         }
      )
   );
   private static final cng.l s = new cng.l(8, axe.f, "filled_map.village_desert", err.B, 12, 5);
   private static final cng.l t = new cng.l(8, axe.e, "filled_map.village_savanna", err.D, 12, 5);
   private static final cng.l u = new cng.l(8, axe.g, "filled_map.village_plains", err.C, 12, 5);
   private static final cng.l v = new cng.l(8, axe.h, "filled_map.village_taiga", err.F, 12, 5);
   private static final cng.l w = new cng.l(8, axe.i, "filled_map.village_snowy", err.E, 12, 5);
   private static final cng.l x = new cng.l(8, axe.j, "filled_map.explorer_jungle", err.G, 12, 5);
   private static final cng.l y = new cng.l(8, axe.k, "filled_map.explorer_swamp", err.H, 12, 5);
   public static final Map<cnf, Int2ObjectMap<cng.g[]>> c = Map.of(
      cnf.k,
      a(
         ImmutableMap.builder()
            .put(1, new cng.g[]{new cng.b(cvo.qP, 24, 16, 2), a(1), new cng.i(dgx.cl, 9, 1, 12, 1)})
            .put(2, new cng.g[]{new cng.b(cvo.qQ, 4, 12, 10), a(5), new cng.i(cvo.wv, 1, 1, 5)})
            .put(3, new cng.g[]{new cng.b(cvo.rg, 5, 12, 20), a(10), new cng.i(cvo.cG, 1, 4, 10)})
            .put(4, new cng.g[]{new cng.b(cvo.ua, 2, 12, 30), new cng.i(cvo.qX, 5, 1, 15), new cng.i(cvo.qT, 4, 1, 15)})
            .put(5, new cng.g[]{a(), new cng.i(cvo.uN, 20, 1, 30)})
            .build()
      ),
      cnf.c,
      a(
         ImmutableMap.builder()
            .put(1, new cng.g[]{new cng.b(cvo.oy, 15, 12, 2), new cng.b(cvo.oG, 5, 12, 2)})
            .put(
               2,
               new cng.g[]{
                  cng.m.a(new cng.i(cvo.pK, 4, 1, 12, 5, 0.05F), cnh.a, cnh.c, cnh.d, cnh.e, cnh.g),
                  cng.m.a(new cng.i(cvo.pG, 4, 1, 12, 5, 0.05F), cnh.b, cnh.f),
                  cng.m.a(new cng.i(cvo.pH, 5, 1, 12, 5, 0.05F), cnh.a, cnh.c, cnh.d, cnh.e, cnh.g),
                  cng.m.a(new cng.i(cvo.pD, 5, 1, 12, 5, 0.05F), cnh.b, cnh.f),
                  cng.m.a(new cng.i(cvo.pJ, 7, 1, 12, 5, 0.05F), cnh.a, cnh.c, cnh.d, cnh.e, cnh.g),
                  cng.m.a(new cng.i(cvo.pF, 7, 1, 12, 5, 0.05F), cnh.b, cnh.f),
                  cng.m.a(new cng.i(cvo.pI, 9, 1, 12, 5, 0.05F), cnh.a, cnh.c, cnh.d, cnh.e, cnh.g),
                  cng.m.a(new cng.i(cvo.pE, 9, 1, 12, 5, 0.05F), cnh.b, cnh.f)
               }
            )
            .put(3, new cng.g[]{new cng.b(cvo.qB, 1, 12, 20), new cng.i(cvo.vu, 5, 1, 12, 10, 0.05F), new cng.i(cvo.wu, 36, 1, 12, 10, 0.2F)})
            .put(
               4,
               new cng.g[]{
                  cng.m.a(new cng.i(cvo.pK, 8, 1, 3, 15, 0.05F, dcj.a), cnh.a),
                  cng.m.a(new cng.i(cvo.pH, 9, 1, 3, 15, 0.05F, dcj.d), cnh.a),
                  cng.m.a(new cng.i(cvo.pJ, 11, 1, 3, 15, 0.05F, dcj.b), cnh.a),
                  cng.m.a(new cng.i(cvo.pI, 13, 1, 3, 15, 0.05F, dcj.c), cnh.a),
                  cng.m.a(new cng.i(cvo.pK, 8, 1, 3, 15, 0.05F, dcj.g), cnh.c),
                  cng.m.a(new cng.i(cvo.pH, 9, 1, 3, 15, 0.05F, dcj.j), cnh.c),
                  cng.m.a(new cng.i(cvo.pJ, 11, 1, 3, 15, 0.05F, dcj.h), cnh.c),
                  cng.m.a(new cng.i(cvo.pI, 13, 1, 3, 15, 0.05F, dcj.i), cnh.c),
                  cng.m.a(new cng.i(cvo.pK, 2, 1, 3, 15, 0.05F, dcj.m), cnh.d),
                  cng.m.a(new cng.i(cvo.pH, 3, 1, 3, 15, 0.05F, dcj.p), cnh.d),
                  cng.m.a(new cng.i(cvo.pJ, 5, 1, 3, 15, 0.05F, dcj.n), cnh.d),
                  cng.m.a(new cng.i(cvo.pI, 7, 1, 3, 15, 0.05F, dcj.o), cnh.d),
                  cng.m.a(new cng.i(cvo.pK, 8, 1, 3, 15, 0.05F, dcj.s), cnh.e),
                  cng.m.a(new cng.i(cvo.pH, 9, 1, 3, 15, 0.05F, dcj.t), cnh.e),
                  cng.m.a(new cng.i(cvo.pG, 8, 1, 3, 15, 0.05F, dcj.w), cnh.b),
                  cng.m.a(new cng.i(cvo.pD, 9, 1, 3, 15, 0.05F, dcj.z), cnh.b),
                  cng.m.a(new cng.i(cvo.pF, 11, 1, 3, 15, 0.05F, dcj.x), cnh.b),
                  cng.m.a(new cng.i(cvo.pE, 13, 1, 3, 15, 0.05F, dcj.y), cnh.b),
                  cng.m.a(new cng.i(cvo.pG, 8, 1, 3, 15, 0.05F, dcj.C), cnh.f),
                  cng.m.a(new cng.i(cvo.pD, 9, 1, 3, 15, 0.05F, dcj.F), cnh.f),
                  cng.m.a(new cng.i(cvo.pF, 11, 1, 3, 15, 0.05F, dcj.D), cnh.f),
                  cng.m.a(new cng.i(cvo.pE, 13, 1, 3, 15, 0.05F, dcj.E), cnh.f),
                  cng.m.a(new cng.h(cvo.pO, 1, 4, cvo.pN, 1, 3, 15, 0.05F), cnh.g),
                  cng.m.a(new cng.h(cvo.pN, 1, 4, cvo.pM, 1, 3, 15, 0.05F), cnh.g),
                  cng.m.a(new cng.h(cvo.pL, 1, 4, cvo.pO, 1, 3, 15, 0.05F), cnh.g),
                  cng.m.a(new cng.h(cvo.pM, 1, 2, cvo.pL, 1, 3, 15, 0.05F), cnh.g)
               }
            )
            .put(
               5,
               new cng.g[]{
                  cng.m.a(new cng.h(cvo.oA, 4, 16, cvo.pM, 1, 3, 30, 0.05F, dcj.f), cnh.a),
                  cng.m.a(new cng.h(cvo.oA, 3, 16, cvo.pN, 1, 3, 30, 0.05F, dcj.e), cnh.a),
                  cng.m.a(new cng.h(cvo.oA, 3, 16, cvo.pN, 1, 3, 30, 0.05F, dcj.l), cnh.c),
                  cng.m.a(new cng.h(cvo.oA, 2, 12, cvo.pO, 1, 3, 30, 0.05F, dcj.k), cnh.c),
                  cng.m.a(new cng.h(cvo.oA, 2, 6, cvo.pL, 1, 3, 30, 0.05F, dcj.r), cnh.d),
                  cng.m.a(new cng.h(cvo.oA, 3, 8, cvo.pM, 1, 3, 30, 0.05F, dcj.q), cnh.d),
                  cng.m.a(new cng.h(cvo.oA, 2, 12, cvo.pO, 1, 3, 30, 0.05F, dcj.u), cnh.e),
                  cng.m.a(new cng.h(cvo.oA, 3, 12, cvo.pL, 1, 3, 30, 0.05F, dcj.v), cnh.e),
                  cng.m.a(new cng.i(cvo.pD, 9, 1, 3, 30, 0.05F, dcj.B), cnh.b),
                  cng.m.a(new cng.i(cvo.pG, 8, 1, 3, 30, 0.05F, dcj.A), cnh.b),
                  cng.m.a(new cng.i(cvo.pD, 9, 1, 3, 30, 0.05F, dcj.H), cnh.f),
                  cng.m.a(new cng.i(cvo.pG, 8, 1, 3, 30, 0.05F, dcj.G), cnh.f),
                  cng.m.a(new cng.h(cvo.oA, 4, 18, cvo.pM, 1, 3, 30, 0.05F, dcj.J), cnh.g),
                  cng.m.a(new cng.h(cvo.oA, 3, 18, cvo.pN, 1, 3, 30, 0.05F, dcj.I), cnh.g),
                  cng.m.a(new cng.b(cvo.aN, 1, 12, 30, 42), cnh.g),
                  cng.m.a(new cng.b(cvo.aK, 1, 12, 30, 4), cnh.a, cnh.b, cnh.c, cnh.d, cnh.e, cnh.f)
               }
            )
            .build()
      ),
      cnf.e,
      a(
         ImmutableMap.of(
            1,
            new cng.g[]{new cng.b(cvo.qP, 24, 16, 2), new cng.i(cvo.ul, 7, 1, 1)},
            2,
            new cng.g[]{
               new cng.b(cvo.fT, 11, 16, 10),
               new cng.m(ImmutableMap.builder().put(cnh.a, t).put(cnh.d, u).put(cnh.c, v).put(cnh.g, w).put(cnh.e, u).put(cnh.b, t).put(cnh.f, w).build()),
               new cng.m(ImmutableMap.builder().put(cnh.a, u).put(cnh.d, s).put(cnh.c, t).put(cnh.g, u).put(cnh.e, v).put(cnh.b, s).put(cnh.f, v).build()),
               new cng.m(
                  ImmutableMap.builder().put(cnh.a, x).put(cnh.d, x).put(cnh.c, new cng.f()).put(cnh.g, y).put(cnh.e, y).put(cnh.b, y).put(cnh.f, x).build()
               )
            },
            3,
            new cng.g[]{
               new cng.b(cvo.qT, 1, 12, 20),
               new cng.l(13, axe.d, "filled_map.monument", err.j, 12, 10),
               new cng.l(12, axe.m, "filled_map.trial_chambers", err.I, 12, 10)
            },
            4,
            new cng.g[]{
               new cng.i(cvo.ue, 7, 1, 15),
               new cng.i(cvo.uR, 3, 1, 15),
               new cng.i(cvo.vc, 3, 1, 15),
               new cng.i(cvo.uU, 3, 1, 15),
               new cng.i(cvo.vf, 3, 1, 15),
               new cng.i(cvo.uX, 3, 1, 15),
               new cng.i(cvo.ve, 3, 1, 15),
               new cng.i(cvo.uW, 3, 1, 15),
               new cng.i(cvo.uY, 3, 1, 15),
               new cng.i(cvo.vg, 3, 1, 15),
               new cng.i(cvo.vb, 3, 1, 15),
               new cng.i(cvo.uT, 3, 1, 15),
               new cng.i(cvo.va, 3, 1, 15),
               new cng.i(cvo.vd, 3, 1, 15),
               new cng.i(cvo.uV, 3, 1, 15),
               new cng.i(cvo.uS, 3, 1, 15),
               new cng.i(cvo.uZ, 3, 1, 15)
            },
            5,
            new cng.g[]{new cng.i(cvo.we, 8, 1, 30), new cng.l(14, axe.c, "filled_map.mansion", err.i, 1, 30)}
         )
      )
   );
   public static final List<Pair<cng.g[], Integer>> d = ImmutableList.builder()
      .add(
         Pair.of(
            new cng.g[]{
               new cng.b(a(cxo.a), 1, 1, 1),
               new cng.b(cvo.qA, 1, 1, 1, 2),
               new cng.b(cvo.qF, 1, 1, 1, 2),
               new cng.b(cvo.so, 1, 1, 1, 3),
               new cng.b(cvo.uj, 4, 1, 1),
               new cng.b(cvo.hD, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cng.g[]{
               new cng.i(cvo.hV, 1, 1, 6, 1),
               new cng.i(cvo.kV, 6, 1, 6, 1),
               new cng.i(cvo.pv, 1, 4, 2, 1),
               new cng.i(cvo.E, 3, 3, 6, 1),
               new cng.i(dgx.Y, 1, 8, 4, 1),
               new cng.i(dgx.W, 1, 8, 4, 1),
               new cng.i(dgx.aa, 1, 8, 4, 1),
               new cng.i(dgx.X, 1, 8, 4, 1),
               new cng.i(dgx.U, 1, 8, 4, 1),
               new cng.i(dgx.V, 1, 8, 4, 1),
               new cng.i(dgx.Z, 1, 8, 4, 1),
               new cng.e(cvo.pe, 1, 1, 1, 0.2F),
               new cng.i(b(cxo.h), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new cng.g[]{
               new cng.i(cvo.qJ, 3, 1, 4, 1),
               new cng.i(cvo.qG, 3, 1, 4, 1),
               new cng.i(cvo.cT, 2, 1, 5, 1),
               new cng.i(cvo.qR, 4, 1, 5, 1),
               new cng.i(cvo.fu, 2, 1, 5, 1),
               new cng.i(cvo.vV, 5, 1, 5, 1),
               new cng.i(cvo.cO, 1, 1, 12, 1),
               new cng.i(cvo.dJ, 1, 1, 8, 1),
               new cng.i(cvo.fk, 1, 1, 4, 1),
               new cng.i(cvo.dK, 3, 1, 12, 1),
               new cng.i(cvo.eW, 3, 1, 8, 1),
               new cng.i(cvo.dk, 1, 1, 12, 1),
               new cng.i(cvo.dl, 1, 1, 12, 1),
               new cng.i(cvo.dm, 1, 1, 8, 1),
               new cng.i(cvo.dn, 1, 1, 12, 1),
               new cng.i(cvo.do, 1, 1, 12, 1),
               new cng.i(cvo.dp, 1, 1, 12, 1),
               new cng.i(cvo.dq, 1, 1, 12, 1),
               new cng.i(cvo.dr, 1, 1, 12, 1),
               new cng.i(cvo.ds, 1, 1, 12, 1),
               new cng.i(cvo.dt, 1, 1, 12, 1),
               new cng.i(cvo.du, 1, 1, 12, 1),
               new cng.i(cvo.dv, 1, 1, 7, 1),
               new cng.i(cvo.pw, 1, 1, 12, 1),
               new cng.i(cvo.vn, 1, 1, 12, 1),
               new cng.i(cvo.rZ, 1, 1, 12, 1),
               new cng.i(cvo.sa, 1, 1, 12, 1),
               new cng.i(cvo.aa, 5, 1, 8, 1),
               new cng.i(cvo.Y, 5, 1, 8, 1),
               new cng.i(cvo.ac, 5, 1, 8, 1),
               new cng.i(cvo.Z, 5, 1, 8, 1),
               new cng.i(cvo.W, 5, 1, 8, 1),
               new cng.i(cvo.X, 5, 1, 8, 1),
               new cng.i(cvo.ab, 5, 1, 8, 1),
               new cng.i(cvo.ad, 5, 1, 8, 1),
               new cng.i(cvo.rx, 1, 3, 12, 1),
               new cng.i(cvo.rj, 1, 3, 12, 1),
               new cng.i(cvo.ru, 1, 3, 12, 1),
               new cng.i(cvo.rp, 1, 3, 12, 1),
               new cng.i(cvo.ry, 1, 3, 12, 1),
               new cng.i(cvo.rw, 1, 3, 12, 1),
               new cng.i(cvo.rr, 1, 3, 12, 1),
               new cng.i(cvo.rl, 1, 3, 12, 1),
               new cng.i(cvo.rn, 1, 3, 12, 1),
               new cng.i(cvo.rq, 1, 3, 12, 1),
               new cng.i(cvo.rt, 1, 3, 12, 1),
               new cng.i(cvo.rm, 1, 3, 12, 1),
               new cng.i(cvo.ro, 1, 3, 12, 1),
               new cng.i(cvo.rk, 1, 3, 12, 1),
               new cng.i(cvo.rv, 1, 3, 12, 1),
               new cng.i(cvo.rs, 1, 3, 12, 1),
               new cng.i(cvo.kx, 3, 1, 8, 1),
               new cng.i(cvo.ky, 3, 1, 8, 1),
               new cng.i(cvo.kz, 3, 1, 8, 1),
               new cng.i(cvo.kA, 3, 1, 8, 1),
               new cng.i(cvo.kw, 3, 1, 8, 1),
               new cng.i(cvo.fV, 1, 3, 4, 1),
               new cng.i(cvo.dA, 1, 3, 4, 1),
               new cng.i(cvo.dB, 1, 3, 4, 1),
               new cng.i(cvo.gb, 1, 5, 2, 1),
               new cng.i(cvo.dQ, 1, 2, 5, 1),
               new cng.i(cvo.af, 1, 8, 8, 1),
               new cng.i(cvo.ai, 1, 4, 6, 1),
               new cng.i(cvo.xr, 1, 2, 5, 1),
               new cng.i(cvo.F, 1, 2, 5, 1),
               new cng.i(cvo.dN, 1, 2, 5, 1)
            },
            5
         )
      )
      .build();

   private static cng.g a(int $$0) {
      return new cng.m(
         ImmutableMap.builder()
            .put(cnh.a, new cng.d($$0, awv.w))
            .put(cnh.b, new cng.d($$0, awv.x))
            .put(cnh.c, new cng.d($$0, awv.y))
            .put(cnh.d, new cng.d($$0, awv.z))
            .put(cnh.e, new cng.d($$0, awv.A))
            .put(cnh.f, new cng.d($$0, awv.B))
            .put(cnh.g, new cng.d($$0, awv.C))
            .build()
      );
   }

   private static cng.g a() {
      return new cng.m(
         ImmutableMap.builder()
            .put(cnh.a, new cng.d(30, 3, 3, awv.D))
            .put(cnh.b, new cng.d(30, 2, 2, awv.E))
            .put(cnh.c, new cng.d(30, 3, 3, awv.F))
            .put(cnh.d, new cng.d(30, 3, 3, awv.G))
            .put(cnh.e, new cng.d(30, awv.H))
            .put(cnh.f, new cng.d(30, awv.I))
            .put(cnh.g, new cng.d(30, 2, 2, awv.J))
            .build()
      );
   }

   private static Int2ObjectMap<cng.g[]> a(ImmutableMap<Integer, cng.g[]> $$0) {
      return new Int2ObjectOpenHashMap($$0);
   }

   private static dcn a(jn<cxl> $$0) {
      return new dcn(cvo.sl).a($$1 -> $$1.a(kr.I, new cxn($$0)));
   }

   private static cvl b(jn<cxl> $$0) {
      return cxn.a(cvo.sl, $$0);
   }

   static class a implements cng.g {
      private final cvg a;
      private final int b;
      private final int c;
      private final int d;

      public a(cvg $$0, int $$1) {
         this($$0, $$1, 12, 1);
      }

      public a(cvg $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public dcp a(btj $$0, azk $$1) {
         dcn $$2 = new dcn(cvo.oB, this.b);
         cvl $$3 = new cvl(this.a);
         if ($$3.a(axb.bD)) {
            List<cuf> $$4 = Lists.newArrayList();
            $$4.add(a($$1));
            if ($$1.i() > 0.7F) {
               $$4.add(a($$1));
            }

            if ($$1.i() > 0.8F) {
               $$4.add(a($$1));
            }

            $$3 = cyd.a($$3, $$4);
         }

         return new dcp($$2, $$3, this.c, this.d, 0.2F);
      }

      private static cuf a(azk $$0) {
         return cuf.a(cue.a($$0.a(16)));
      }
   }

   static class b implements cng.g {
      private final dcn a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public b(ddr $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 1);
      }

      public b(ddr $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new dcn($$0.r(), $$1), $$2, $$3, $$4);
      }

      public b(dcn $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = 0.05F;
      }

      @Override
      public dcp a(btj $$0, azk $$1) {
         return new dcp(this.a, new cvl(cvo.oB, this.d), this.b, this.c, this.e);
      }
   }

   static class c implements cng.g {
      private final Map<cnh, cvg> a;
      private final int b;
      private final int c;
      private final int d;

      public c(int $$0, int $$1, int $$2, Map<cnh, cvg> $$3) {
         lu.w.s().filter($$1x -> !$$3.containsKey($$1x)).findAny().ifPresent($$0x -> {
            throw new IllegalStateException("Missing trade for villager type: " + lu.w.b($$0x));
         });
         this.a = $$3;
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Nullable
      @Override
      public dcp a(btj $$0, azk $$1) {
         if ($$0 instanceof cne $$2) {
            dcn $$3 = new dcn(this.a.get($$2.gy().a()), this.b);
            return new dcp($$3, new cvl(cvo.oB), this.c, this.d, 0.05F);
         } else {
            return null;
         }
      }
   }

   static class d implements cng.g {
      private final int a;
      private final axi<daw> b;
      private final int c;
      private final int d;

      public d(int $$0, axi<daw> $$1) {
         this($$0, 0, Integer.MAX_VALUE, $$1);
      }

      public d(int $$0, int $$1, int $$2, axi<daw> $$3) {
         this.c = $$1;
         this.d = $$2;
         this.a = $$0;
         this.b = $$3;
      }

      @Override
      public dcp a(btj $$0, azk $$1) {
         Optional<jn<daw>> $$2 = $$0.dS().F_().d(lv.aL).a(this.b, $$1);
         int $$9;
         cvl $$8;
         if (!$$2.isEmpty()) {
            jn<daw> $$3 = $$2.get();
            daw $$4 = $$3.a();
            int $$5 = Math.max($$4.d(), this.c);
            int $$6 = Math.min($$4.e(), this.d);
            int $$7 = azc.a($$1, $$5, $$6);
            $$8 = day.a(new daz($$3, $$7));
            $$9 = 2 + $$1.a(5 + $$7 * 10) + 3 * $$7;
            if ($$3.a(awv.j)) {
               $$9 *= 2;
            }

            if ($$9 > 64) {
               $$9 = 64;
            }
         } else {
            $$9 = 1;
            $$8 = new cvl(cvo.qQ);
         }

         return new dcp(new dcn(cvo.oB, $$9), Optional.of(new dcn(cvo.qQ)), $$8, 12, this.a, 0.2F);
      }
   }

   static class e implements cng.g {
      private final cvl a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;

      public e(cvg $$0, int $$1, int $$2, int $$3) {
         this($$0, $$1, $$2, $$3, 0.05F);
      }

      public e(cvg $$0, int $$1, int $$2, int $$3, float $$4) {
         this.a = new cvl($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public dcp a(btj $$0, azk $$1) {
         int $$2 = 5 + $$1.a(15);
         kb $$3 = $$0.dS().F_();
         Optional<jr.c<daw>> $$4 = $$3.d(lv.aL).a(awv.m);
         cvl $$5 = day.a($$1, new cvl(this.a.h()), $$2, $$3, $$4);
         int $$6 = Math.min(this.b + $$2, 64);
         dcn $$7 = new dcn(cvo.oB, $$6);
         return new dcp($$7, $$5, this.c, this.d, this.e);
      }
   }

   static class f implements cng.g {
      @Override
      public dcp a(btj $$0, azk $$1) {
         return null;
      }
   }

   public interface g {
      @Nullable
      dcp a(btj var1, azk var2);
   }

   static class h implements cng.g {
      private final dcn a;
      private final int b;
      private final cvl c;
      private final int d;
      private final int e;
      private final float f;
      private final Optional<ala<dce>> g;

      public h(ddr $$0, int $$1, int $$2, cvg $$3, int $$4, int $$5, int $$6, float $$7) {
         this($$0, $$1, $$2, new cvl($$3), $$4, $$5, $$6, $$7);
      }

      private h(ddr $$0, int $$1, int $$2, cvl $$3, int $$4, int $$5, int $$6, float $$7) {
         this(new dcn($$0, $$1), $$2, $$3.c($$4), $$5, $$6, $$7, Optional.empty());
      }

      h(ddr $$0, int $$1, int $$2, ddr $$3, int $$4, int $$5, int $$6, float $$7, ala<dce> $$8) {
         this(new dcn($$0, $$1), $$2, new cvl($$3, $$4), $$5, $$6, $$7, Optional.of($$8));
      }

      public h(dcn $$0, int $$1, cvl $$2, int $$3, int $$4, float $$5, Optional<ala<dce>> $$6) {
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
      public dcp a(btj $$0, azk $$1) {
         cvl $$2 = this.c.u();
         dds $$3 = $$0.dS();
         this.g.ifPresent($$4 -> day.a($$2, $$3.F_(), (ala<dce>)$$4, $$3.d_($$0.ds()), $$1));
         return new dcp(new dcn(cvo.oB, this.b), Optional.of(this.a), $$2, 0, this.d, this.e, this.f);
      }
   }

   static class i implements cng.g {
      private final cvl a;
      private final int b;
      private final int c;
      private final int d;
      private final float e;
      private final Optional<ala<dce>> f;

      public i(dgv $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cvl($$0), $$1, $$2, $$3, $$4);
      }

      public i(cvg $$0, int $$1, int $$2, int $$3) {
         this(new cvl($$0), $$1, $$2, 12, $$3);
      }

      public i(cvg $$0, int $$1, int $$2, int $$3, int $$4) {
         this(new cvl($$0), $$1, $$2, $$3, $$4);
      }

      public i(cvl $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, $$1, $$2, $$3, $$4, 0.05F);
      }

      public i(cvg $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this(new cvl($$0), $$1, $$2, $$3, $$4, $$5);
      }

      public i(cvg $$0, int $$1, int $$2, int $$3, int $$4, float $$5, ala<dce> $$6) {
         this(new cvl($$0), $$1, $$2, $$3, $$4, $$5, Optional.of($$6));
      }

      public i(cvl $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
         this($$0, $$1, $$2, $$3, $$4, $$5, Optional.empty());
      }

      public i(cvl $$0, int $$1, int $$2, int $$3, int $$4, float $$5, Optional<ala<dce>> $$6) {
         this.a = $$0;
         this.b = $$1;
         this.a.e($$2);
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
         this.f = $$6;
      }

      @Override
      public dcp a(btj $$0, azk $$1) {
         cvl $$2 = this.a.u();
         dds $$3 = $$0.dS();
         this.f.ifPresent($$4 -> day.a($$2, $$3.F_(), (ala<dce>)$$4, $$3.d_($$0.ds()), $$1));
         return new dcp(new dcn(cvo.oB, this.b), $$2, this.c, this.d, this.e);
      }
   }

   static class j implements cng.g {
      private final cyp a;
      private final int b;
      private final float c;

      public j(jn<bso> $$0, int $$1, int $$2) {
         this(new cyp(List.of(new cyp.a($$0, $$1))), $$2, 0.05F);
      }

      public j(cyp $$0, int $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      @Override
      public dcp a(btj $$0, azk $$1) {
         cvl $$2 = new cvl(cvo.vY, 1);
         $$2.b(kr.J, this.a);
         return new dcp(new dcn(cvo.oB), $$2, 12, this.b, this.c);
      }
   }

   static class k implements cng.g {
      private final cvl a;
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final cvg f;
      private final int g;
      private final float h;

      public k(cvg $$0, int $$1, cvg $$2, int $$3, int $$4, int $$5, int $$6) {
         this.a = new cvl($$2);
         this.c = $$4;
         this.d = $$5;
         this.e = $$6;
         this.f = $$0;
         this.g = $$1;
         this.b = $$3;
         this.h = 0.05F;
      }

      @Override
      public dcp a(btj $$0, azk $$1) {
         dcn $$2 = new dcn(cvo.oB, this.c);
         List<jn<cxl>> $$3 = lu.h.i().filter($$1x -> !((cxl)$$1x.a()).a().isEmpty() && $$0.dS().K().a($$1x)).collect(Collectors.toList());
         jn<cxl> $$4 = ad.a($$3, $$1);
         cvl $$5 = new cvl(this.a.h(), this.b);
         $$5.b(kr.I, new cxn($$4));
         return new dcp($$2, Optional.of(new dcn(this.f, this.g)), $$5, this.d, this.e, this.h);
      }
   }

   static class l implements cng.g {
      private final int a;
      private final axi<eko> b;
      private final String c;
      private final jn<erq> d;
      private final int e;
      private final int f;

      public l(int $$0, axi<eko> $$1, String $$2, jn<erq> $$3, int $$4, int $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      @Nullable
      @Override
      public dcp a(btj $$0, azk $$1) {
         if (!($$0.dS() instanceof arg)) {
            return null;
         } else {
            arg $$2 = (arg)$$0.dS();
            je $$3 = $$2.a(this.b, $$0.ds(), 100, true);
            if ($$3 != null) {
               cvl $$4 = cvx.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
               cvx.a($$2, $$4);
               erv.a($$4, $$3, "+", this.d);
               $$4.b(kr.h, xd.c(this.c));
               return new dcp(new dcn(cvo.oB, this.a), Optional.of(new dcn(cvo.qT)), $$4, this.e, this.f, 0.2F);
            } else {
               return null;
            }
         }
      }
   }

   static record m(Map<cnh, cng.g> a) implements cng.g {
      public static cng.m a(cng.g $$0, cnh... $$1) {
         return new cng.m(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> $$0)));
      }

      @Nullable
      @Override
      public dcp a(btj $$0, azk $$1) {
         if ($$0 instanceof cne $$2) {
            cnh $$3 = $$2.gy().a();
            cng.g $$4 = this.a.get($$3);
            return $$4 == null ? null : $$4.a($$0, $$1);
         } else {
            return null;
         }
      }
   }
}
