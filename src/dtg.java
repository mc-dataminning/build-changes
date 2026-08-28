import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dtg extends dke {
   public static final MapCodec<dtg> a = b(dtg::new);
   public static final dyh b = dpw.f;
   public static final dyh c = dpw.b;
   public static final dyh d = dpw.c;
   public static final dyh e = dpw.d;
   public static final dyh f = dpw.e;
   public static final Map<jn, dyh> g = dpw.h.entrySet().stream().filter($$0 -> $$0.getKey() != jn.a).collect(af.a());
   private final Function<dxq, fcr> h;

   @Override
   public MapCodec<dtg> a() {
      return a;
   }

   public dtg(dxp.d $$0) {
      super($$0);
      this.l(
         this.B
            .b()
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
      );
      this.h = this.b();
   }

   private Function<dxq, fcr> b() {
      Map<jn, fcr> $$0 = fco.d(dke.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         fcr $$2 = fco.a();

         for (Entry<jn, dyh> $$3 : g.entrySet()) {
            if ($$1.c($$3.getValue())) {
               $$2 = fco.a($$2, $$0.get($$3.getKey()));
            }
         }

         return $$2.c() ? fco.b() : $$2;
      });
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected boolean e_(dxq $$0) {
      return true;
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return this.o(this.e($$0, $$1, $$2));
   }

   private boolean o(dxq $$0) {
      return this.q($$0) > 0;
   }

   private int q(dxq $$0) {
      int $$1 = 0;

      for (dyh $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(dgf $$0, ji $$1, jn $$2) {
      if ($$2 == jn.a) {
         return false;
      } else {
         ji $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == jn.a.b) {
            return false;
         } else {
            dyh $$4 = g.get($$2);
            dxq $$5 = $$0.a_($$1.d());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(dgf $$0, ji $$1, jn $$2) {
      return dpi.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dxq e(dxq $$0, dgf $$1, ji $$2) {
      ji $$3 = $$2.d();
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(a($$1, $$3, jn.a)));
      }

      dxq $$4 = null;

      for (jn $$5 : jn.c.a) {
         dyh $$6 = a($$5);
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
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$4 == jn.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         dxq $$8 = this.e($$0, $$1, $$3);
         return !this.o($$8) ? dkg.a.m() : $$8;
      }
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.O().b(dgv.Y)) {
         if ($$3.a(4) == 0) {
            jn $$4 = jn.b($$3);
            ji $$5 = $$2.d();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  ji $$6 = $$2.a($$4);
                  dxq $$7 = $$1.a_($$6);
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
               if ($$4 == jn.b && $$2.v() < $$1.ao()) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.u($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dxq $$15 = $$0;

                     for (jn $$16 : jn.c.a) {
                        if ($$3.h() || !a($$1, $$5.a($$16), $$16)) {
                           $$15 = $$15.b(a($$16), Boolean.valueOf(false));
                        }
                     }

                     if (this.r($$15)) {
                        $$1.a($$5, $$15, 2);
                     }

                     return;
                  }
               }

               if ($$2.v() > $$1.G_()) {
                  ji $$17 = $$2.e();
                  dxq $$18 = $$1.a_($$17);
                  if ($$18.l() || $$18.a(this)) {
                     dxq $$19 = $$18.l() ? this.m() : $$18;
                     dxq $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.r($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dxq a(dxq $$0, dxq $$1, azh $$2) {
      for (jn $$3 : jn.c.a) {
         if ($$2.h()) {
            dyh $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.b($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean r(dxq $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(dgf $$0, ji $$1) {
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
   protected boolean a(dxq $$0, dax $$1) {
      dxq $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.q($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      dxq $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dxq $$3 = $$2 ? $$1 : this.m();

      for (jn $$4 : $$0.f()) {
         if ($$4 != jn.a) {
            dyh $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.b($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
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
   protected dxq a(dxq $$0, dpf $$1) {
      switch ($$1) {
         case b:
            return $$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c:
            return $$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dyh a(jn $$0) {
      return g.get($$0);
   }
}
