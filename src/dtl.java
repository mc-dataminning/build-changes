import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dtl extends dkm {
   public static final MapCodec<dtl> a = b(dtl::new);
   public static final dym b = dqc.f;
   public static final dym c = dqc.b;
   public static final dym d = dqc.c;
   public static final dym e = dqc.d;
   public static final dym f = dqc.e;
   public static final Map<jm, dym> g = dqc.h.entrySet().stream().filter($$0 -> $$0.getKey() != jm.a).collect(ae.a());
   protected static final float h = 1.0F;
   private static final fcs i = dkm.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcs j = dkm.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fcs k = dkm.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcs l = dkm.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fcs m = dkm.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dxv, fcs> n;

   @Override
   public MapCodec<dtl> a() {
      return a;
   }

   public dtl(dxu.d $$0) {
      super($$0);
      this.l(
         this.F
            .b()
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
      );
      this.n = ImmutableMap.copyOf(this.F.a().stream().collect(Collectors.toMap(Function.identity(), dtl::o)));
   }

   private static fcs o(dxv $$0) {
      fcs $$1 = fcp.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = fcp.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = fcp.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = fcp.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = fcp.a($$1, j);
      }

      return $$1.c() ? fcp.b() : $$1;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return this.n.get($$0);
   }

   @Override
   protected boolean e_(dxv $$0) {
      return true;
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      return this.q(this.e($$0, $$1, $$2));
   }

   private boolean q(dxv $$0) {
      return this.r($$0) > 0;
   }

   private int r(dxv $$0) {
      int $$1 = 0;

      for (dym $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(dgn $$0, jh $$1, jm $$2) {
      if ($$2 == jm.a) {
         return false;
      } else {
         jh $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == jm.a.b) {
            return false;
         } else {
            dym $$4 = g.get($$2);
            dxv $$5 = $$0.a_($$1.d());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(dgn $$0, jh $$1, jm $$2) {
      return dpo.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dxv e(dxv $$0, dgn $$1, jh $$2) {
      jh $$3 = $$2.d();
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(a($$1, $$3, jm.a)));
      }

      dxv $$4 = null;

      for (jm $$5 : jm.c.a) {
         dym $$6 = a($$5);
         if ($$0.c($$6)) {
            boolean $$7 = this.b($$1, $$2, $$5);
            if (!$$7) {
               if ($$4 == null) {
                  $$4 = $$1.a_($$3);
               }

               $$7 = $$4.a(this) && $$4.c($$6);
            }

            $$0 = $$0.b($$6, Boolean.valueOf($$7));
         }
      }

      return $$0;
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$4 == jm.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         dxv $$8 = this.e($$0, $$1, $$3);
         return !this.q($$8) ? dko.a.m() : $$8;
      }
   }

   @Override
   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.N().b(dhe.Y)) {
         if ($$3.a(4) == 0) {
            jm $$4 = jm.b($$3);
            jh $$5 = $$2.d();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  jh $$6 = $$2.a($$4);
                  dxv $$7 = $$1.a_($$6);
                  if ($$7.l()) {
                     jm $$8 = $$4.h();
                     jm $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     jh $$12 = $$6.a($$8);
                     jh $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.m().b(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.m().b(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        jm $$14 = $$4.g();
                        if ($$10 && $$1.u($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.m().b(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.u($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.m().b(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.d(), jm.b)) {
                           $$1.a($$6, this.m().b(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.b(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == jm.b && $$2.v() < $$1.am()) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.u($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dxv $$15 = $$0;

                     for (jm $$16 : jm.c.a) {
                        if ($$3.h() || !a($$1, $$5.a($$16), $$16)) {
                           $$15 = $$15.b(a($$16), Boolean.valueOf(false));
                        }
                     }

                     if (this.s($$15)) {
                        $$1.a($$5, $$15, 2);
                     }

                     return;
                  }
               }

               if ($$2.v() > $$1.L_()) {
                  jh $$17 = $$2.e();
                  dxv $$18 = $$1.a_($$17);
                  if ($$18.l() || $$18.a(this)) {
                     dxv $$19 = $$18.l() ? this.m() : $$18;
                     dxv $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.s($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dxv a(dxv $$0, dxv $$1, bam $$2) {
      for (jm $$3 : jm.c.a) {
         if ($$2.h()) {
            dym $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.b($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean s(dxv $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(dgn $$0, jh $$1) {
      int $$2 = 4;
      Iterable<jh> $$3 = jh.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (jh $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected boolean a(dxv $$0, dbg $$1) {
      dxv $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.r($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      dxv $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dxv $$3 = $$2 ? $$1 : this.m();

      for (jm $$4 : $$0.f()) {
         if ($$4 != jm.a) {
            dym $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.b($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      switch ($$1) {
         case c:
            return $$0.b(c, $$0.c(e)).b(d, $$0.c(f)).b(e, $$0.c(c)).b(f, $$0.c(d));
         case d:
            return $$0.b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(c));
         case b:
            return $$0.b(c, $$0.c(f)).b(d, $$0.c(c)).b(e, $$0.c(d)).b(f, $$0.c(e));
         default:
            return $$0;
      }
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      switch ($$1) {
         case b:
            return $$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c:
            return $$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dym a(jm $$0) {
      return g.get($$0);
   }
}
