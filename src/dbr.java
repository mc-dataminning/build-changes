import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dbr extends csx {
   public static final dgc a = cyj.e;
   public static final dgc b = cyj.a;
   public static final dgc c = cyj.b;
   public static final dgc d = cyj.c;
   public static final dgc e = cyj.d;
   public static final Map<hc, dgc> f = cyj.g.entrySet().stream().filter($$0 -> $$0.getKey() != hc.a).collect(ac.a());
   protected static final float g = 1.0F;
   private static final eii h = csx.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eii i = csx.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eii j = csx.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eii k = csx.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eii l = csx.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dfl, eii> m;

   public dbr(dfk.d $$0) {
      super($$0);
      this.k(
         this.C
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
      this.m = ImmutableMap.copyOf(this.C.a().stream().collect(Collectors.toMap(Function.identity(), dbr::h)));
   }

   private static eii h(dfl $$0) {
      eii $$1 = eif.a();
      if ($$0.c(a)) {
         $$1 = h;
      }

      if ($$0.c(b)) {
         $$1 = eif.a($$1, k);
      }

      if ($$0.c(d)) {
         $$1 = eif.a($$1, l);
      }

      if ($$0.c(c)) {
         $$1 = eif.a($$1, j);
      }

      if ($$0.c(e)) {
         $$1 = eif.a($$1, i);
      }

      return $$1.c() ? eif.b() : $$1;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return this.m.get($$0);
   }

   @Override
   public boolean c(dfl $$0, cpd $$1, gw $$2) {
      return true;
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      return this.n(this.i($$0, $$1, $$2));
   }

   private boolean n(dfl $$0) {
      return this.o($$0) > 0;
   }

   private int o(dfl $$0) {
      int $$1 = 0;

      for (dgc $$2 : f.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(cpd $$0, gw $$1, hc $$2) {
      if ($$2 == hc.a) {
         return false;
      } else {
         gw $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == hc.a.b) {
            return false;
         } else {
            dgc $$4 = f.get($$2);
            dfl $$5 = $$0.a_($$1.c());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(cpd $$0, gw $$1, hc $$2) {
      return cxv.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dfl i(dfl $$0, cpd $$1, gw $$2) {
      gw $$3 = $$2.c();
      if ($$0.c(a)) {
         $$0 = $$0.a(a, Boolean.valueOf(a($$1, $$3, hc.a)));
      }

      dfl $$4 = null;

      for (hc $$5 : hc.c.a) {
         dgc $$6 = a($$5);
         if ($$0.c($$6)) {
            boolean $$7 = this.b($$1, $$2, $$5);
            if (!$$7) {
               if ($$4 == null) {
                  $$4 = $$1.a_($$3);
               }

               $$7 = $$4.a(this) && $$4.c($$6);
            }

            $$0 = $$0.a($$6, Boolean.valueOf($$7));
         }
      }

      return $$0;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$1 == hc.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         dfl $$6 = this.i($$0, $$3, $$4);
         return !this.n($$6) ? csy.a.n() : $$6;
      }
   }

   @Override
   public void b(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if ($$1.X().b(cpt.T)) {
         if ($$3.a(4) == 0) {
            hc $$4 = hc.b($$3);
            gw $$5 = $$2.c();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  gw $$6 = $$2.a($$4);
                  dfl $$7 = $$1.a_($$6);
                  if ($$7.i()) {
                     hc $$8 = $$4.h();
                     hc $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     gw $$12 = $$6.a($$8);
                     gw $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.n().a(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.n().a(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        hc $$14 = $$4.g();
                        if ($$10 && $$1.t($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.n().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.t($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.n().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.c(), hc.b)) {
                           $$1.a($$6, this.n().a(a, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.a(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == hc.b && $$2.v() < $$1.aj() - 1) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.a(a, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.t($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dfl $$15 = $$0;

                     for (hc $$16 : hc.c.a) {
                        if ($$3.h() || !a($$1, $$5.a($$16), $$16)) {
                           $$15 = $$15.a(a($$16), Boolean.valueOf(false));
                        }
                     }

                     if (this.p($$15)) {
                        $$1.a($$5, $$15, 2);
                     }

                     return;
                  }
               }

               if ($$2.v() > $$1.H_()) {
                  gw $$17 = $$2.d();
                  dfl $$18 = $$1.a_($$17);
                  if ($$18.i() || $$18.a(this)) {
                     dfl $$19 = $$18.i() ? this.n() : $$18;
                     dfl $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.p($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dfl a(dfl $$0, dfl $$1, ase $$2) {
      for (hc $$3 : hc.c.a) {
         if ($$2.h()) {
            dgc $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.a($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean p(dfl $$0) {
      return $$0.c(b) || $$0.c(c) || $$0.c(d) || $$0.c(e);
   }

   private boolean a(cpd $$0, gw $$1) {
      int $$2 = 4;
      Iterable<gw> $$3 = gw.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (gw $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public boolean a(dfl $$0, clp $$1) {
      dfl $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.o($$2) < f.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      dfl $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dfl $$3 = $$2 ? $$1 : this.n();

      for (hc $$4 : $$0.f()) {
         if ($$4 != hc.a) {
            dgc $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.a($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, b, c, d, e);
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      switch ($$1) {
         case c:
            return $$0.a(b, $$0.c(d)).a(c, $$0.c(e)).a(d, $$0.c(b)).a(e, $$0.c(c));
         case d:
            return $$0.a(b, $$0.c(c)).a(c, $$0.c(d)).a(d, $$0.c(e)).a(e, $$0.c(b));
         case b:
            return $$0.a(b, $$0.c(e)).a(c, $$0.c(b)).a(d, $$0.c(c)).a(e, $$0.c(d));
         default:
            return $$0;
      }
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      switch ($$1) {
         case b:
            return $$0.a(b, $$0.c(d)).a(d, $$0.c(b));
         case c:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dgc a(hc $$0) {
      return f.get($$0);
   }
}
