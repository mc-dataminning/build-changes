import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dso extends djn {
   public static final MapCodec<dso> a = b(dso::new);
   public static final dxp b = dpf.f;
   public static final dxp c = dpf.b;
   public static final dxp d = dpf.c;
   public static final dxp e = dpf.d;
   public static final dxp f = dpf.e;
   public static final Map<jn, dxp> g = dpf.h.entrySet().stream().filter($$0 -> $$0.getKey() != jn.a).collect(af.a());
   protected static final float h = 1.0F;
   private static final fbv i = djn.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbv j = djn.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fbv k = djn.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbv l = djn.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fbv m = djn.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dwy, fbv> n;

   @Override
   public MapCodec<dso> a() {
      return a;
   }

   public dso(dwx.d $$0) {
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
      this.n = ImmutableMap.copyOf(this.F.a().stream().collect(Collectors.toMap(Function.identity(), dso::o)));
   }

   private static fbv o(dwy $$0) {
      fbv $$1 = fbs.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = fbs.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = fbs.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = fbs.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = fbs.a($$1, j);
      }

      return $$1.c() ? fbs.b() : $$1;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return this.n.get($$0);
   }

   @Override
   protected boolean e_(dwy $$0) {
      return true;
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      return this.q(this.e($$0, $$1, $$2));
   }

   private boolean q(dwy $$0) {
      return this.r($$0) > 0;
   }

   private int r(dwy $$0) {
      int $$1 = 0;

      for (dxp $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(dfo $$0, ji $$1, jn $$2) {
      if ($$2 == jn.a) {
         return false;
      } else {
         ji $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == jn.a.b) {
            return false;
         } else {
            dxp $$4 = g.get($$2);
            dwy $$5 = $$0.a_($$1.d());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(dfo $$0, ji $$1, jn $$2) {
      return dop.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dwy e(dwy $$0, dfo $$1, ji $$2) {
      ji $$3 = $$2.d();
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(a($$1, $$3, jn.a)));
      }

      dwy $$4 = null;

      for (jn $$5 : jn.c.a) {
         dxp $$6 = a($$5);
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
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$4 == jn.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         dwy $$8 = this.e($$0, $$1, $$3);
         return !this.q($$8) ? djp.a.m() : $$8;
      }
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.O().b(dgf.Y)) {
         if ($$3.a(4) == 0) {
            jn $$4 = jn.b($$3);
            ji $$5 = $$2.d();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  ji $$6 = $$2.a($$4);
                  dwy $$7 = $$1.a_($$6);
                  if ($$7.l()) {
                     jn $$8 = $$4.h();
                     jn $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     ji $$12 = $$6.a($$8);
                     ji $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.m().b(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.m().b(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        jn $$14 = $$4.g();
                        if ($$10 && $$1.u($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.m().b(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.u($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.m().b(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.d(), jn.b)) {
                           $$1.a($$6, this.m().b(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.b(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == jn.b && $$2.v() < $$1.an()) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.u($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dwy $$15 = $$0;

                     for (jn $$16 : jn.c.a) {
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
                  ji $$17 = $$2.e();
                  dwy $$18 = $$1.a_($$17);
                  if ($$18.l() || $$18.a(this)) {
                     dwy $$19 = $$18.l() ? this.m() : $$18;
                     dwy $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.s($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dwy a(dwy $$0, dwy $$1, azh $$2) {
      for (jn $$3 : jn.c.a) {
         if ($$2.h()) {
            dxp $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.b($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean s(dwy $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(dfo $$0, ji $$1) {
      int $$2 = 4;
      Iterable<ji> $$3 = ji.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (ji $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected boolean a(dwy $$0, dah $$1) {
      dwy $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.r($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      dwy $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dwy $$3 = $$2 ? $$1 : this.m();

      for (jn $$4 : $$0.f()) {
         if ($$4 != jn.a) {
            dxp $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.b($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
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
   protected dwy a(dwy $$0, dom $$1) {
      switch ($$1) {
         case b:
            return $$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c:
            return $$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dxp a(jn $$0) {
      return g.get($$0);
   }
}
