import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dlr extends dcv {
   public static final MapCodec<dlr> a = b(dlr::new);
   public static final dqp b = dij.f;
   public static final dqp c = dij.b;
   public static final dqp d = dij.c;
   public static final dqp e = dij.d;
   public static final dqp f = dij.e;
   public static final Map<ir, dqp> g = dij.h.entrySet().stream().filter($$0 -> $$0.getKey() != ir.a).collect(ac.a());
   protected static final float h = 1.0F;
   private static final ety i = dcv.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ety j = dcv.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ety k = dcv.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ety l = dcv.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ety m = dcv.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dpy, ety> n;

   @Override
   public MapCodec<dlr> a() {
      return a;
   }

   public dlr(dpx.d $$0) {
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
      this.n = ImmutableMap.copyOf(this.E.a().stream().collect(Collectors.toMap(Function.identity(), dlr::m)));
   }

   private static ety m(dpy $$0) {
      ety $$1 = etv.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = etv.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = etv.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = etv.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = etv.a($$1, j);
      }

      return $$1.c() ? etv.b() : $$1;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return this.n.get($$0);
   }

   @Override
   protected boolean a_(dpy $$0, cza $$1, im $$2) {
      return true;
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      return this.n(this.i($$0, $$1, $$2));
   }

   private boolean n(dpy $$0) {
      return this.o($$0) > 0;
   }

   private int o(dpy $$0) {
      int $$1 = 0;

      for (dqp $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(cza $$0, im $$1, ir $$2) {
      if ($$2 == ir.a) {
         return false;
      } else {
         im $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == ir.a.b) {
            return false;
         } else {
            dqp $$4 = g.get($$2);
            dpy $$5 = $$0.a_($$1.c());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(cza $$0, im $$1, ir $$2) {
      return dhv.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dpy i(dpy $$0, cza $$1, im $$2) {
      im $$3 = $$2.c();
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(a($$1, $$3, ir.a)));
      }

      dpy $$4 = null;

      for (ir $$5 : ir.c.a) {
         dqp $$6 = a($$5);
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
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$1 == ir.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         dpy $$6 = this.i($$0, $$3, $$4);
         return !this.n($$6) ? dcx.a.n() : $$6;
      }
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$1.aa().b(czq.X)) {
         if ($$3.a(4) == 0) {
            ir $$4 = ir.b($$3);
            im $$5 = $$2.c();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  im $$6 = $$2.a($$4);
                  dpy $$7 = $$1.a_($$6);
                  if ($$7.i()) {
                     ir $$8 = $$4.h();
                     ir $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     im $$12 = $$6.a($$8);
                     im $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.n().a(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.n().a(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        ir $$14 = $$4.g();
                        if ($$10 && $$1.u($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.n().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.u($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.n().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.c(), ir.b)) {
                           $$1.a($$6, this.n().a(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.a(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == ir.b && $$2.v() < $$1.al() - 1) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.u($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dpy $$15 = $$0;

                     for (ir $$16 : ir.c.a) {
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
                  im $$17 = $$2.d();
                  dpy $$18 = $$1.a_($$17);
                  if ($$18.i() || $$18.a(this)) {
                     dpy $$19 = $$18.i() ? this.n() : $$18;
                     dpy $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.p($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dpy a(dpy $$0, dpy $$1, ayd $$2) {
      for (ir $$3 : ir.c.a) {
         if ($$2.h()) {
            dqp $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.a($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean p(dpy $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(cza $$0, im $$1) {
      int $$2 = 4;
      Iterable<im> $$3 = im.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (im $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected boolean a(dpy $$0, cvl $$1) {
      dpy $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.o($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      dpy $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dpy $$3 = $$2 ? $$1 : this.n();

      for (ir $$4 : $$0.f()) {
         if ($$4 != ir.a) {
            dqp $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.a($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
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
   protected dpy a(dpy $$0, dhs $$1) {
      switch ($$1) {
         case b:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         case c:
            return $$0.a(d, $$0.c(f)).a(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dqp a(ir $$0) {
      return g.get($$0);
   }
}
