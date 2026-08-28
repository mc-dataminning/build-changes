import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dnw extends dfa {
   public static final MapCodec<dnw> a = b(dnw::new);
   public static final dsu b = dko.f;
   public static final dsu c = dko.b;
   public static final dsu d = dko.c;
   public static final dsu e = dko.d;
   public static final dsu f = dko.e;
   public static final Map<je, dsu> g = dko.h.entrySet().stream().filter($$0 -> $$0.getKey() != je.a).collect(ac.a());
   protected static final float h = 1.0F;
   private static final ewl i = dfa.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewl j = dfa.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ewl k = dfa.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewl l = dfa.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ewl m = dfa.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dsd, ewl> n;

   @Override
   public MapCodec<dnw> a() {
      return a;
   }

   public dnw(dsc.d $$0) {
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
      this.n = ImmutableMap.copyOf(this.E.a().stream().collect(Collectors.toMap(Function.identity(), dnw::m)));
   }

   private static ewl m(dsd $$0) {
      ewl $$1 = ewi.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = ewi.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = ewi.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = ewi.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = ewi.a($$1, j);
      }

      return $$1.c() ? ewi.b() : $$1;
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return this.n.get($$0);
   }

   @Override
   protected boolean a_(dsd $$0, dbf $$1, iz $$2) {
      return true;
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      return this.n(this.i($$0, $$1, $$2));
   }

   private boolean n(dsd $$0) {
      return this.o($$0) > 0;
   }

   private int o(dsd $$0) {
      int $$1 = 0;

      for (dsu $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(dbf $$0, iz $$1, je $$2) {
      if ($$2 == je.a) {
         return false;
      } else {
         iz $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == je.a.b) {
            return false;
         } else {
            dsu $$4 = g.get($$2);
            dsd $$5 = $$0.a_($$1.c());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(dbf $$0, iz $$1, je $$2) {
      return dka.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dsd i(dsd $$0, dbf $$1, iz $$2) {
      iz $$3 = $$2.c();
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(a($$1, $$3, je.a)));
      }

      dsd $$4 = null;

      for (je $$5 : je.c.a) {
         dsu $$6 = a($$5);
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
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$1 == je.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         dsd $$6 = this.i($$0, $$3, $$4);
         return !this.n($$6) ? dfc.a.o() : $$6;
      }
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if ($$1.ab().b(dbv.X)) {
         if ($$3.a(4) == 0) {
            je $$4 = je.b($$3);
            iz $$5 = $$2.c();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  iz $$6 = $$2.a($$4);
                  dsd $$7 = $$1.a_($$6);
                  if ($$7.i()) {
                     je $$8 = $$4.h();
                     je $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     iz $$12 = $$6.a($$8);
                     iz $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.o().a(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.o().a(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        je $$14 = $$4.g();
                        if ($$10 && $$1.u($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.o().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.u($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.o().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.c(), je.b)) {
                           $$1.a($$6, this.o().a(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.a(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == je.b && $$2.v() < $$1.am() - 1) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.u($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dsd $$15 = $$0;

                     for (je $$16 : je.c.a) {
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
                  iz $$17 = $$2.d();
                  dsd $$18 = $$1.a_($$17);
                  if ($$18.i() || $$18.a(this)) {
                     dsd $$19 = $$18.i() ? this.o() : $$18;
                     dsd $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.p($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dsd a(dsd $$0, dsd $$1, azh $$2) {
      for (je $$3 : je.c.a) {
         if ($$2.h()) {
            dsu $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.a($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean p(dsd $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(dbf $$0, iz $$1) {
      int $$2 = 4;
      Iterable<iz> $$3 = iz.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (iz $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected boolean a(dsd $$0, cyb $$1) {
      dsd $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.o($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      dsd $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dsd $$3 = $$2 ? $$1 : this.o();

      for (je $$4 : $$0.f()) {
         if ($$4 != je.a) {
            dsu $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.a($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
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
   protected dsd a(dsd $$0, djx $$1) {
      switch ($$1) {
         case b:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         case c:
            return $$0.a(d, $$0.c(f)).a(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dsu a(je $$0) {
      return g.get($$0);
   }
}
