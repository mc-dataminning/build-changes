import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dbt extends ctc {
   public static final MapCodec<dbt> a = b(dbt::new);
   public static final dfu b = cyo.f;
   public static final dfu c = cyo.b;
   public static final dfu d = cyo.c;
   public static final dfu e = cyo.d;
   public static final dfu f = cyo.e;
   public static final Map<ha, dfu> g = cyo.h.entrySet().stream().filter($$0 -> $$0.getKey() != ha.a).collect(ac.a());
   protected static final float h = 1.0F;
   private static final eia i = ctc.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eia j = ctc.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eia k = ctc.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eia l = ctc.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eia m = ctc.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dfd, eia> n;

   @Override
   public MapCodec<dbt> a() {
      return a;
   }

   public dbt(dfc.d $$0) {
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
      this.n = ImmutableMap.copyOf(this.E.a().stream().collect(Collectors.toMap(Function.identity(), dbt::h)));
   }

   private static eia h(dfd $$0) {
      eia $$1 = ehx.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = ehx.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = ehx.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = ehx.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = ehx.a($$1, j);
      }

      return $$1.c() ? ehx.b() : $$1;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return this.n.get($$0);
   }

   @Override
   public boolean c(dfd $$0, cph $$1, gw $$2) {
      return true;
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      return this.n(this.i($$0, $$1, $$2));
   }

   private boolean n(dfd $$0) {
      return this.o($$0) > 0;
   }

   private int o(dfd $$0) {
      int $$1 = 0;

      for (dfu $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(cph $$0, gw $$1, ha $$2) {
      if ($$2 == ha.a) {
         return false;
      } else {
         gw $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == ha.a.b) {
            return false;
         } else {
            dfu $$4 = g.get($$2);
            dfd $$5 = $$0.a_($$1.c());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(cph $$0, gw $$1, ha $$2) {
      return cya.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dfd i(dfd $$0, cph $$1, gw $$2) {
      gw $$3 = $$2.c();
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(a($$1, $$3, ha.a)));
      }

      dfd $$4 = null;

      for (ha $$5 : ha.c.a) {
         dfu $$6 = a($$5);
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
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$1 == ha.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         dfd $$6 = this.i($$0, $$3, $$4);
         return !this.n($$6) ? cte.a.o() : $$6;
      }
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if ($$1.X().b(cpx.T)) {
         if ($$3.a(4) == 0) {
            ha $$4 = ha.b($$3);
            gw $$5 = $$2.c();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  gw $$6 = $$2.a($$4);
                  dfd $$7 = $$1.a_($$6);
                  if ($$7.i()) {
                     ha $$8 = $$4.h();
                     ha $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     gw $$12 = $$6.a($$8);
                     gw $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.o().a(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.o().a(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        ha $$14 = $$4.g();
                        if ($$10 && $$1.t($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.o().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.t($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.o().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.c(), ha.b)) {
                           $$1.a($$6, this.o().a(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.a(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == ha.b && $$2.v() < $$1.aj() - 1) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.t($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dfd $$15 = $$0;

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

               if ($$2.v() > $$1.H_()) {
                  gw $$17 = $$2.d();
                  dfd $$18 = $$1.a_($$17);
                  if ($$18.i() || $$18.a(this)) {
                     dfd $$19 = $$18.i() ? this.o() : $$18;
                     dfd $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.p($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dfd a(dfd $$0, dfd $$1, ash $$2) {
      for (ha $$3 : ha.c.a) {
         if ($$2.h()) {
            dfu $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.a($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean p(dfd $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(cph $$0, gw $$1) {
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
   public boolean a(dfd $$0, clt $$1) {
      dfd $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.o($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      dfd $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dfd $$3 = $$2 ? $$1 : this.o();

      for (ha $$4 : $$0.f()) {
         if ($$4 != ha.a) {
            dfu $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.a($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
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
   public dfd a(dfd $$0, cxx $$1) {
      switch ($$1) {
         case b:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         case c:
            return $$0.a(d, $$0.c(f)).a(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dfu a(ha $$0) {
      return g.get($$0);
   }
}
