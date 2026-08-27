import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dbe extends csk {
   public static final dfp a = cxw.e;
   public static final dfp b = cxw.a;
   public static final dfp c = cxw.b;
   public static final dfp d = cxw.c;
   public static final dfp e = cxw.d;
   public static final Map<hb, dfp> f = cxw.g.entrySet().stream().filter($$0 -> $$0.getKey() != hb.a).collect(ac.a());
   protected static final float g = 1.0F;
   private static final ehy h = csk.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ehy i = csk.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ehy j = csk.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ehy k = csk.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ehy l = csk.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dey, ehy> m;

   public dbe(dex.d $$0) {
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
      this.m = ImmutableMap.copyOf(this.C.a().stream().collect(Collectors.toMap(Function.identity(), dbe::h)));
   }

   private static ehy h(dey $$0) {
      ehy $$1 = ehv.a();
      if ($$0.c(a)) {
         $$1 = h;
      }

      if ($$0.c(b)) {
         $$1 = ehv.a($$1, k);
      }

      if ($$0.c(d)) {
         $$1 = ehv.a($$1, l);
      }

      if ($$0.c(c)) {
         $$1 = ehv.a($$1, j);
      }

      if ($$0.c(e)) {
         $$1 = ehv.a($$1, i);
      }

      return $$1.c() ? ehv.b() : $$1;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return this.m.get($$0);
   }

   @Override
   public boolean c(dey $$0, coq $$1, gv $$2) {
      return true;
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      return this.n(this.i($$0, $$1, $$2));
   }

   private boolean n(dey $$0) {
      return this.o($$0) > 0;
   }

   private int o(dey $$0) {
      int $$1 = 0;

      for (dfp $$2 : f.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(coq $$0, gv $$1, hb $$2) {
      if ($$2 == hb.a) {
         return false;
      } else {
         gv $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == hb.a.b) {
            return false;
         } else {
            dfp $$4 = f.get($$2);
            dey $$5 = $$0.a_($$1.c());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(coq $$0, gv $$1, hb $$2) {
      return cxi.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dey i(dey $$0, coq $$1, gv $$2) {
      gv $$3 = $$2.c();
      if ($$0.c(a)) {
         $$0 = $$0.a(a, Boolean.valueOf(a($$1, $$3, hb.a)));
      }

      dey $$4 = null;

      for (hb $$5 : hb.c.a) {
         dfp $$6 = a($$5);
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
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$1 == hb.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         dey $$6 = this.i($$0, $$3, $$4);
         return !this.n($$6) ? csl.a.n() : $$6;
      }
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$1.X().b(cpg.T)) {
         if ($$3.a(4) == 0) {
            hb $$4 = hb.b($$3);
            gv $$5 = $$2.c();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  gv $$6 = $$2.a($$4);
                  dey $$7 = $$1.a_($$6);
                  if ($$7.i()) {
                     hb $$8 = $$4.h();
                     hb $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     gv $$12 = $$6.a($$8);
                     gv $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.n().a(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.n().a(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        hb $$14 = $$4.g();
                        if ($$10 && $$1.t($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.n().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.t($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.n().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.c(), hb.b)) {
                           $$1.a($$6, this.n().a(a, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.a(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == hb.b && $$2.v() < $$1.aj() - 1) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.a(a, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.t($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dey $$15 = $$0;

                     for (hb $$16 : hb.c.a) {
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
                  gv $$17 = $$2.d();
                  dey $$18 = $$1.a_($$17);
                  if ($$18.i() || $$18.a(this)) {
                     dey $$19 = $$18.i() ? this.n() : $$18;
                     dey $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.p($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dey a(dey $$0, dey $$1, art $$2) {
      for (hb $$3 : hb.c.a) {
         if ($$2.h()) {
            dfp $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.a($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean p(dey $$0) {
      return $$0.c(b) || $$0.c(c) || $$0.c(d) || $$0.c(e);
   }

   private boolean a(coq $$0, gv $$1) {
      int $$2 = 4;
      Iterable<gv> $$3 = gv.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (gv $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public boolean a(dey $$0, cle $$1) {
      dey $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.o($$2) < f.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      dey $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dey $$3 = $$2 ? $$1 : this.n();

      for (hb $$4 : $$0.f()) {
         if ($$4 != hb.a) {
            dfp $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.a($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b, c, d, e);
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
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
   public dey a(dey $$0, cxf $$1) {
      switch ($$1) {
         case b:
            return $$0.a(b, $$0.c(d)).a(d, $$0.c(b));
         case c:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dfp a(hb $$0) {
      return f.get($$0);
   }
}
