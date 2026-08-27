import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cyh extends cpn {
   public static final dcs a = cuz.e;
   public static final dcs b = cuz.a;
   public static final dcs c = cuz.b;
   public static final dcs d = cuz.c;
   public static final dcs e = cuz.d;
   public static final Map<ha, dcs> f = cuz.g.entrySet().stream().filter($$0 -> $$0.getKey() != ha.a).collect(ac.a());
   protected static final float g = 1.0F;
   private static final efb h = cpn.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final efb i = cpn.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final efb j = cpn.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final efb k = cpn.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final efb l = cpn.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dcb, efb> m;

   public cyh(dca.d $$0) {
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
      this.m = ImmutableMap.copyOf(this.C.a().stream().collect(Collectors.toMap(Function.identity(), cyh::h)));
   }

   private static efb h(dcb $$0) {
      efb $$1 = eey.a();
      if ($$0.c(a)) {
         $$1 = h;
      }

      if ($$0.c(b)) {
         $$1 = eey.a($$1, k);
      }

      if ($$0.c(d)) {
         $$1 = eey.a($$1, l);
      }

      if ($$0.c(c)) {
         $$1 = eey.a($$1, j);
      }

      if ($$0.c(e)) {
         $$1 = eey.a($$1, i);
      }

      return $$1.b() ? eey.b() : $$1;
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return this.m.get($$0);
   }

   @Override
   public boolean c(dcb $$0, cls $$1, gu $$2) {
      return true;
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      return this.n(this.i($$0, $$1, $$2));
   }

   private boolean n(dcb $$0) {
      return this.o($$0) > 0;
   }

   private int o(dcb $$0) {
      int $$1 = 0;

      for (dcs $$2 : f.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(cls $$0, gu $$1, ha $$2) {
      if ($$2 == ha.a) {
         return false;
      } else {
         gu $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == ha.a.b) {
            return false;
         } else {
            dcs $$4 = f.get($$2);
            dcb $$5 = $$0.a_($$1.c());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(cls $$0, gu $$1, ha $$2) {
      return cul.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dcb i(dcb $$0, cls $$1, gu $$2) {
      gu $$3 = $$2.c();
      if ($$0.c(a)) {
         $$0 = $$0.a(a, Boolean.valueOf(a($$1, $$3, ha.a)));
      }

      dcb $$4 = null;

      for (ha $$5 : ha.c.a) {
         dcs $$6 = a($$5);
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
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$1 == ha.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         dcb $$6 = this.i($$0, $$3, $$4);
         return !this.n($$6) ? cpo.a.n() : $$6;
      }
   }

   @Override
   public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if ($$1.X().b(cmi.T)) {
         if ($$3.a(4) == 0) {
            ha $$4 = ha.b($$3);
            gu $$5 = $$2.c();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  gu $$6 = $$2.a($$4);
                  dcb $$7 = $$1.a_($$6);
                  if ($$7.i()) {
                     ha $$8 = $$4.h();
                     ha $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     gu $$12 = $$6.a($$8);
                     gu $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.n().a(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.n().a(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        ha $$14 = $$4.g();
                        if ($$10 && $$1.t($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.n().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.t($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.n().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.c(), ha.b)) {
                           $$1.a($$6, this.n().a(a, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.a(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == ha.b && $$2.v() < $$1.aj() - 1) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.a(a, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.t($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dcb $$15 = $$0;

                     for (ha $$16 : ha.c.a) {
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

               if ($$2.v() > $$1.C_()) {
                  gu $$17 = $$2.d();
                  dcb $$18 = $$1.a_($$17);
                  if ($$18.i() || $$18.a(this)) {
                     dcb $$19 = $$18.i() ? this.n() : $$18;
                     dcb $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.p($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dcb a(dcb $$0, dcb $$1, apf $$2) {
      for (ha $$3 : ha.c.a) {
         if ($$2.h()) {
            dcs $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.a($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean p(dcb $$0) {
      return $$0.c(b) || $$0.c(c) || $$0.c(d) || $$0.c(e);
   }

   private boolean a(cls $$0, gu $$1) {
      int $$2 = 4;
      Iterable<gu> $$3 = gu.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (gu $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public boolean a(dcb $$0, cih $$1) {
      dcb $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.o($$2) < f.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dcb a(cih $$0) {
      dcb $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dcb $$3 = $$2 ? $$1 : this.n();

      for (ha $$4 : $$0.f()) {
         if ($$4 != ha.a) {
            dcs $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.a($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a, b, c, d, e);
   }

   @Override
   public dcb a(dcb $$0, cvz $$1) {
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
   public dcb a(dcb $$0, cui $$1) {
      switch ($$1) {
         case b:
            return $$0.a(b, $$0.c(d)).a(d, $$0.c(b));
         case c:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dcs a(ha $$0) {
      return f.get($$0);
   }
}
