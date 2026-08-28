import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dnu extends dey {
   public static final MapCodec<dnu> a = b(dnu::new);
   public static final dss b = dkm.f;
   public static final dss c = dkm.b;
   public static final dss d = dkm.c;
   public static final dss e = dkm.d;
   public static final dss f = dkm.e;
   public static final Map<je, dss> g = dkm.h.entrySet().stream().filter($$0 -> $$0.getKey() != je.a).collect(ac.a());
   protected static final float h = 1.0F;
   private static final ewj i = dey.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewj j = dey.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ewj k = dey.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewj l = dey.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ewj m = dey.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dsb, ewj> n;

   @Override
   public MapCodec<dnu> a() {
      return a;
   }

   public dnu(dsa.d $$0) {
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
      this.n = ImmutableMap.copyOf(this.E.a().stream().collect(Collectors.toMap(Function.identity(), dnu::m)));
   }

   private static ewj m(dsb $$0) {
      ewj $$1 = ewg.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = ewg.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = ewg.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = ewg.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = ewg.a($$1, j);
      }

      return $$1.c() ? ewg.b() : $$1;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return this.n.get($$0);
   }

   @Override
   protected boolean a_(dsb $$0, dbd $$1, iz $$2) {
      return true;
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      return this.n(this.i($$0, $$1, $$2));
   }

   private boolean n(dsb $$0) {
      return this.o($$0) > 0;
   }

   private int o(dsb $$0) {
      int $$1 = 0;

      for (dss $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(dbd $$0, iz $$1, je $$2) {
      if ($$2 == je.a) {
         return false;
      } else {
         iz $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == je.a.b) {
            return false;
         } else {
            dss $$4 = g.get($$2);
            dsb $$5 = $$0.a_($$1.c());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(dbd $$0, iz $$1, je $$2) {
      return djy.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dsb i(dsb $$0, dbd $$1, iz $$2) {
      iz $$3 = $$2.c();
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(a($$1, $$3, je.a)));
      }

      dsb $$4 = null;

      for (je $$5 : je.c.a) {
         dss $$6 = a($$5);
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
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$1 == je.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         dsb $$6 = this.i($$0, $$3, $$4);
         return !this.n($$6) ? dfa.a.o() : $$6;
      }
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
      if ($$1.ab().b(dbt.X)) {
         if ($$3.a(4) == 0) {
            je $$4 = je.b($$3);
            iz $$5 = $$2.c();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  iz $$6 = $$2.a($$4);
                  dsb $$7 = $$1.a_($$6);
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

                     dsb $$15 = $$0;

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
                  dsb $$18 = $$1.a_($$17);
                  if ($$18.i() || $$18.a(this)) {
                     dsb $$19 = $$18.i() ? this.o() : $$18;
                     dsb $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.p($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dsb a(dsb $$0, dsb $$1, azg $$2) {
      for (je $$3 : je.c.a) {
         if ($$2.h()) {
            dss $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.a($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean p(dsb $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(dbd $$0, iz $$1) {
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
   protected boolean a(dsb $$0, cxz $$1) {
      dsb $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.o($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      dsb $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dsb $$3 = $$2 ? $$1 : this.o();

      for (je $$4 : $$0.f()) {
         if ($$4 != je.a) {
            dss $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.a($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
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
   protected dsb a(dsb $$0, djv $$1) {
      switch ($$1) {
         case b:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         case c:
            return $$0.a(d, $$0.c(f)).a(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dss a(je $$0) {
      return g.get($$0);
   }
}
