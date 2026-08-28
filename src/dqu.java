import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dqu extends dhy {
   public static final MapCodec<dqu> a = b(dqu::new);
   public static final dvu b = dnl.f;
   public static final dvu c = dnl.b;
   public static final dvu d = dnl.c;
   public static final dvu e = dnl.d;
   public static final dvu f = dnl.e;
   public static final Map<jl, dvu> g = dnl.h.entrySet().stream().filter($$0 -> $$0.getKey() != jl.a).collect(ad.a());
   protected static final float h = 1.0F;
   private static final fab i = dhy.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fab j = dhy.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fab k = dhy.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fab l = dhy.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fab m = dhy.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dvd, fab> n;

   @Override
   public MapCodec<dqu> a() {
      return a;
   }

   public dqu(dvc.d $$0) {
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
      this.n = ImmutableMap.copyOf(this.F.a().stream().collect(Collectors.toMap(Function.identity(), dqu::o)));
   }

   private static fab o(dvd $$0) {
      fab $$1 = ezy.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = ezy.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = ezy.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = ezy.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = ezy.a($$1, j);
      }

      return $$1.c() ? ezy.b() : $$1;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return this.n.get($$0);
   }

   @Override
   protected boolean e_(dvd $$0) {
      return true;
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return this.q(this.e($$0, $$1, $$2));
   }

   private boolean q(dvd $$0) {
      return this.r($$0) > 0;
   }

   private int r(dvd $$0) {
      int $$1 = 0;

      for (dvu $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(dea $$0, jg $$1, jl $$2) {
      if ($$2 == jl.a) {
         return false;
      } else {
         jg $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == jl.a.b) {
            return false;
         } else {
            dvu $$4 = g.get($$2);
            dvd $$5 = $$0.a_($$1.d());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(dea $$0, jg $$1, jl $$2) {
      return dmx.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dvd e(dvd $$0, dea $$1, jg $$2) {
      jg $$3 = $$2.d();
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(a($$1, $$3, jl.a)));
      }

      dvd $$4 = null;

      for (jl $$5 : jl.c.a) {
         dvu $$6 = a($$5);
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
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$1 == jl.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         dvd $$6 = this.e($$0, $$3, $$4);
         return !this.q($$6) ? dia.a.m() : $$6;
      }
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$1.ac().b(der.X)) {
         if ($$3.a(4) == 0) {
            jl $$4 = jl.b($$3);
            jg $$5 = $$2.d();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  jg $$6 = $$2.a($$4);
                  dvd $$7 = $$1.a_($$6);
                  if ($$7.l()) {
                     jl $$8 = $$4.h();
                     jl $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     jg $$12 = $$6.a($$8);
                     jg $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.m().b(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.m().b(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        jl $$14 = $$4.g();
                        if ($$10 && $$1.u($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.m().b(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.u($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.m().b(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.d(), jl.b)) {
                           $$1.a($$6, this.m().b(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.b(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == jl.b && $$2.v() < $$1.an()) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.u($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dvd $$15 = $$0;

                     for (jl $$16 : jl.c.a) {
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

               if ($$2.v() > $$1.I_()) {
                  jg $$17 = $$2.e();
                  dvd $$18 = $$1.a_($$17);
                  if ($$18.l() || $$18.a(this)) {
                     dvd $$19 = $$18.l() ? this.m() : $$18;
                     dvd $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.s($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dvd a(dvd $$0, dvd $$1, azr $$2) {
      for (jl $$3 : jl.c.a) {
         if ($$2.h()) {
            dvu $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.b($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean s(dvd $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(dea $$0, jg $$1) {
      int $$2 = 4;
      Iterable<jg> $$3 = jg.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (jg $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected boolean a(dvd $$0, czm $$1) {
      dvd $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.r($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      dvd $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dvd $$3 = $$2 ? $$1 : this.m();

      for (jl $$4 : $$0.f()) {
         if ($$4 != jl.a) {
            dvu $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.b($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
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
   protected dvd a(dvd $$0, dmu $$1) {
      switch ($$1) {
         case b:
            return $$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c:
            return $$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dvu a(jl $$0) {
      return g.get($$0);
   }
}
