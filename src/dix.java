import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dix extends dac {
   public static final MapCodec<dix> a = b(dix::new);
   public static final dns b = dfp.f;
   public static final dns c = dfp.b;
   public static final dns d = dfp.c;
   public static final dns e = dfp.d;
   public static final dns f = dfp.e;
   public static final Map<ih, dns> g = dfp.h.entrySet().stream().filter($$0 -> $$0.getKey() != ih.a).collect(ac.a());
   protected static final float h = 1.0F;
   private static final eqm i = dac.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eqm j = dac.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eqm k = dac.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eqm l = dac.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eqm m = dac.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dnb, eqm> n;

   @Override
   public MapCodec<dix> a() {
      return a;
   }

   public dix(dna.d $$0) {
      super($$0);
      this.k(
         this.E
            .b()
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
            .a(f, Boolean.valueOf(false))
      );
      this.n = ImmutableMap.copyOf(this.E.a().stream().collect(Collectors.toMap(Function.identity(), dix::m)));
   }

   private static eqm m(dnb $$0) {
      eqm $$1 = eqj.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = eqj.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = eqj.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = eqj.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = eqj.a($$1, j);
      }

      return $$1.c() ? eqj.b() : $$1;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return this.n.get($$0);
   }

   @Override
   protected boolean a_(dnb $$0, cwh $$1, ib $$2) {
      return true;
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      return this.n(this.i($$0, $$1, $$2));
   }

   private boolean n(dnb $$0) {
      return this.o($$0) > 0;
   }

   private int o(dnb $$0) {
      int $$1 = 0;

      for (dns $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(cwh $$0, ib $$1, ih $$2) {
      if ($$2 == ih.a) {
         return false;
      } else {
         ib $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == ih.a.b) {
            return false;
         } else {
            dns $$4 = g.get($$2);
            dnb $$5 = $$0.a_($$1.c());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(cwh $$0, ib $$1, ih $$2) {
      return dfb.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dnb i(dnb $$0, cwh $$1, ib $$2) {
      ib $$3 = $$2.c();
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(a($$1, $$3, ih.a)));
      }

      dnb $$4 = null;

      for (ih $$5 : ih.c.a) {
         dns $$6 = a($$5);
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
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$1 == ih.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         dnb $$6 = this.i($$0, $$3, $$4);
         return !this.n($$6) ? dae.a.o() : $$6;
      }
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if ($$1.Z().b(cwx.X)) {
         if ($$3.a(4) == 0) {
            ih $$4 = ih.b($$3);
            ib $$5 = $$2.c();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  ib $$6 = $$2.a($$4);
                  dnb $$7 = $$1.a_($$6);
                  if ($$7.i()) {
                     ih $$8 = $$4.h();
                     ih $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     ib $$12 = $$6.a($$8);
                     ib $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.o().a(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.o().a(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        ih $$14 = $$4.g();
                        if ($$10 && $$1.u($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.o().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.u($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.o().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.c(), ih.b)) {
                           $$1.a($$6, this.o().a(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.a(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == ih.b && $$2.v() < $$1.ak() - 1) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.u($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dnb $$15 = $$0;

                     for (ih $$16 : ih.c.a) {
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

               if ($$2.v() > $$1.I_()) {
                  ib $$17 = $$2.d();
                  dnb $$18 = $$1.a_($$17);
                  if ($$18.i() || $$18.a(this)) {
                     dnb $$19 = $$18.i() ? this.o() : $$18;
                     dnb $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.p($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dnb a(dnb $$0, dnb $$1, axd $$2) {
      for (ih $$3 : ih.c.a) {
         if ($$2.h()) {
            dns $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.a($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean p(dnb $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(cwh $$0, ib $$1) {
      int $$2 = 4;
      Iterable<ib> $$3 = ib.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (ib $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected boolean a(dnb $$0, csu $$1) {
      dnb $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.o($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      dnb $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dnb $$3 = $$2 ? $$1 : this.o();

      for (ih $$4 : $$0.f()) {
         if ($$4 != ih.a) {
            dns $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.a($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      switch ($$1) {
         case c:
            return $$0.a(c, $$0.c(e)).a(d, $$0.c(f)).a(e, $$0.c(c)).a(f, $$0.c(d));
         case d:
            return $$0.a(c, $$0.c(d)).a(d, $$0.c(e)).a(e, $$0.c(f)).a(f, $$0.c(c));
         case b:
            return $$0.a(c, $$0.c(f)).a(d, $$0.c(c)).a(e, $$0.c(d)).a(f, $$0.c(e));
         default:
            return $$0;
      }
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      switch ($$1) {
         case b:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         case c:
            return $$0.a(d, $$0.c(f)).a(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dns a(ih $$0) {
      return g.get($$0);
   }
}
