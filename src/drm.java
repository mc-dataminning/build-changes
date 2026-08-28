import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class drm extends diq {
   public static final MapCodec<drm> a = b(drm::new);
   public static final dwm b = dod.f;
   public static final dwm c = dod.b;
   public static final dwm d = dod.c;
   public static final dwm e = dod.d;
   public static final dwm f = dod.e;
   public static final Map<jm, dwm> g = dod.h.entrySet().stream().filter($$0 -> $$0.getKey() != jm.a).collect(ae.a());
   protected static final float h = 1.0F;
   private static final fas i = diq.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fas j = diq.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fas k = diq.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fas l = diq.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fas m = diq.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dvv, fas> n;

   @Override
   public MapCodec<drm> a() {
      return a;
   }

   public drm(dvu.d $$0) {
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
      this.n = ImmutableMap.copyOf(this.F.a().stream().collect(Collectors.toMap(Function.identity(), drm::o)));
   }

   private static fas o(dvv $$0) {
      fas $$1 = fap.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = fap.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = fap.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = fap.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = fap.a($$1, j);
      }

      return $$1.c() ? fap.b() : $$1;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return this.n.get($$0);
   }

   @Override
   protected boolean e_(dvv $$0) {
      return true;
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      return this.q(this.e($$0, $$1, $$2));
   }

   private boolean q(dvv $$0) {
      return this.r($$0) > 0;
   }

   private int r(dvv $$0) {
      int $$1 = 0;

      for (dwm $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(der $$0, jh $$1, jm $$2) {
      if ($$2 == jm.a) {
         return false;
      } else {
         jh $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == jm.a.b) {
            return false;
         } else {
            dwm $$4 = g.get($$2);
            dvv $$5 = $$0.a_($$1.d());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(der $$0, jh $$1, jm $$2) {
      return dnp.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dvv e(dvv $$0, der $$1, jh $$2) {
      jh $$3 = $$2.d();
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(a($$1, $$3, jm.a)));
      }

      dvv $$4 = null;

      for (jm $$5 : jm.c.a) {
         dwm $$6 = a($$5);
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
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$4 == jm.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         dvv $$8 = this.e($$0, $$1, $$3);
         return !this.q($$8) ? dis.a.m() : $$8;
      }
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if ($$1.N().b(dfi.X)) {
         if ($$3.a(4) == 0) {
            jm $$4 = jm.b($$3);
            jh $$5 = $$2.d();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  jh $$6 = $$2.a($$4);
                  dvv $$7 = $$1.a_($$6);
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
               if ($$4 == jm.b && $$2.v() < $$1.al()) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.u($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dvv $$15 = $$0;

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

               if ($$2.v() > $$1.K_()) {
                  jh $$17 = $$2.e();
                  dvv $$18 = $$1.a_($$17);
                  if ($$18.l() || $$18.a(this)) {
                     dvv $$19 = $$18.l() ? this.m() : $$18;
                     dvv $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.s($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dvv a(dvv $$0, dvv $$1, azu $$2) {
      for (jm $$3 : jm.c.a) {
         if ($$2.h()) {
            dwm $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.b($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean s(dvv $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(der $$0, jh $$1) {
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
   protected boolean a(dvv $$0, dad $$1) {
      dvv $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.r($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      dvv $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dvv $$3 = $$2 ? $$1 : this.m();

      for (jm $$4 : $$0.f()) {
         if ($$4 != jm.a) {
            dwm $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.b($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
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
   protected dvv a(dvv $$0, dnm $$1) {
      switch ($$1) {
         case b:
            return $$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c:
            return $$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dwm a(jm $$0) {
      return g.get($$0);
   }
}
