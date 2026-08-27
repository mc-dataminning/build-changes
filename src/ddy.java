import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class ddy extends cvf {
   public static final MapCodec<ddy> a = b(ddy::new);
   public static final die b = das.f;
   public static final die c = das.b;
   public static final die d = das.c;
   public static final die e = das.d;
   public static final die f = das.e;
   public static final Map<ib, die> g = das.h.entrySet().stream().filter($$0 -> $$0.getKey() != ib.a).collect(ac.a());
   protected static final float h = 1.0F;
   private static final eks i = cvf.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eks j = cvf.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eks k = cvf.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eks l = cvf.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eks m = cvf.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dhn, eks> n;

   @Override
   public MapCodec<ddy> a() {
      return a;
   }

   public ddy(dhm.d $$0) {
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
      this.n = ImmutableMap.copyOf(this.E.a().stream().collect(Collectors.toMap(Function.identity(), ddy::h)));
   }

   private static eks h(dhn $$0) {
      eks $$1 = ekp.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = ekp.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = ekp.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = ekp.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = ekp.a($$1, j);
      }

      return $$1.c() ? ekp.b() : $$1;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return this.n.get($$0);
   }

   @Override
   public boolean a_(dhn $$0, crl $$1, hx $$2) {
      return true;
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return this.n(this.i($$0, $$1, $$2));
   }

   private boolean n(dhn $$0) {
      return this.o($$0) > 0;
   }

   private int o(dhn $$0) {
      int $$1 = 0;

      for (die $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(crl $$0, hx $$1, ib $$2) {
      if ($$2 == ib.a) {
         return false;
      } else {
         hx $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == ib.a.b) {
            return false;
         } else {
            die $$4 = g.get($$2);
            dhn $$5 = $$0.a_($$1.c());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(crl $$0, hx $$1, ib $$2) {
      return dae.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dhn i(dhn $$0, crl $$1, hx $$2) {
      hx $$3 = $$2.c();
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(a($$1, $$3, ib.a)));
      }

      dhn $$4 = null;

      for (ib $$5 : ib.c.a) {
         die $$6 = a($$5);
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
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$1 == ib.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         dhn $$6 = this.i($$0, $$3, $$4);
         return !this.n($$6) ? cvh.a.o() : $$6;
      }
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$1.Y().b(csb.X)) {
         if ($$3.a(4) == 0) {
            ib $$4 = ib.b($$3);
            hx $$5 = $$2.c();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  hx $$6 = $$2.a($$4);
                  dhn $$7 = $$1.a_($$6);
                  if ($$7.i()) {
                     ib $$8 = $$4.h();
                     ib $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     hx $$12 = $$6.a($$8);
                     hx $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.o().a(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.o().a(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        ib $$14 = $$4.g();
                        if ($$10 && $$1.t($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.o().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.t($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.o().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.c(), ib.b)) {
                           $$1.a($$6, this.o().a(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.a(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == ib.b && $$2.v() < $$1.ak() - 1) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.t($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dhn $$15 = $$0;

                     for (ib $$16 : ib.c.a) {
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

               if ($$2.v() > $$1.J_()) {
                  hx $$17 = $$2.d();
                  dhn $$18 = $$1.a_($$17);
                  if ($$18.i() || $$18.a(this)) {
                     dhn $$19 = $$18.i() ? this.o() : $$18;
                     dhn $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.p($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dhn a(dhn $$0, dhn $$1, atw $$2) {
      for (ib $$3 : ib.c.a) {
         if ($$2.h()) {
            die $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.a($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean p(dhn $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(crl $$0, hx $$1) {
      int $$2 = 4;
      Iterable<hx> $$3 = hx.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (hx $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public boolean a(dhn $$0, cnw $$1) {
      dhn $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.o($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      dhn $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dhn $$3 = $$2 ? $$1 : this.o();

      for (ib $$4 : $$0.f()) {
         if ($$4 != ib.a) {
            die $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.a($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
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
   public dhn a(dhn $$0, dab $$1) {
      switch ($$1) {
         case b:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         case c:
            return $$0.a(d, $$0.c(f)).a(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static die a(ib $$0) {
      return g.get($$0);
   }
}
