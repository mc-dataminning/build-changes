import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class doo extends dfc {
   public static final MapCodec<doo> a = b(doo::new);
   public static final dtt b = dkw.f;
   public static final dtt c = dkw.b;
   public static final dtt d = dkw.c;
   public static final dtt e = dkw.d;
   public static final dtt f = dkw.e;
   public static final Map<iw, dtt> g = dkw.h.entrySet().stream().filter($$0 -> $$0.getKey() != iw.a).collect(ad.a());
   protected static final float h = 1.0F;
   private static final exn i = dfc.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final exn j = dfc.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final exn k = dfc.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final exn l = dfc.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final exn m = dfc.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dtc, exn> n;

   @Override
   public MapCodec<doo> a() {
      return a;
   }

   public doo(dtb.d $$0) {
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
      this.n = ImmutableMap.copyOf(this.E.a().stream().collect(Collectors.toMap(Function.identity(), doo::m)));
   }

   private static exn m(dtc $$0) {
      exn $$1 = exk.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = exk.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = exk.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = exk.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = exk.a($$1, j);
      }

      return $$1.c() ? exk.b() : $$1;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return this.n.get($$0);
   }

   @Override
   protected boolean a_(dtc $$0, dbg $$1, ir $$2) {
      return true;
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      return this.n(this.i($$0, $$1, $$2));
   }

   private boolean n(dtc $$0) {
      return this.o($$0) > 0;
   }

   private int o(dtc $$0) {
      int $$1 = 0;

      for (dtt $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(dbg $$0, ir $$1, iw $$2) {
      if ($$2 == iw.a) {
         return false;
      } else {
         ir $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == iw.a.b) {
            return false;
         } else {
            dtt $$4 = g.get($$2);
            dtc $$5 = $$0.a_($$1.c());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(dbg $$0, ir $$1, iw $$2) {
      return dkh.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dtc i(dtc $$0, dbg $$1, ir $$2) {
      ir $$3 = $$2.c();
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(a($$1, $$3, iw.a)));
      }

      dtc $$4 = null;

      for (iw $$5 : iw.c.a) {
         dtt $$6 = a($$5);
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
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$1 == iw.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         dtc $$6 = this.i($$0, $$3, $$4);
         return !this.n($$6) ? dfe.a.n() : $$6;
      }
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if ($$1.ab().b(dbw.Y)) {
         if ($$3.a(4) == 0) {
            iw $$4 = iw.b($$3);
            ir $$5 = $$2.c();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  ir $$6 = $$2.a($$4);
                  dtc $$7 = $$1.a_($$6);
                  if ($$7.i()) {
                     iw $$8 = $$4.h();
                     iw $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     ir $$12 = $$6.a($$8);
                     ir $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.n().a(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.n().a(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        iw $$14 = $$4.g();
                        if ($$10 && $$1.u($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.n().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.u($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.n().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.c(), iw.b)) {
                           $$1.a($$6, this.n().a(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.a(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == iw.b && $$2.v() < $$1.am() - 1) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.u($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dtc $$15 = $$0;

                     for (iw $$16 : iw.c.a) {
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
                  ir $$17 = $$2.d();
                  dtc $$18 = $$1.a_($$17);
                  if ($$18.i() || $$18.a(this)) {
                     dtc $$19 = $$18.i() ? this.n() : $$18;
                     dtc $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.p($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dtc a(dtc $$0, dtc $$1, ayt $$2) {
      for (iw $$3 : iw.c.a) {
         if ($$2.h()) {
            dtt $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.a($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean p(dtc $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(dbg $$0, ir $$1) {
      int $$2 = 4;
      Iterable<ir> $$3 = ir.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (ir $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected boolean a(dtc $$0, cyd $$1) {
      dtc $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.o($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dtc $$3 = $$2 ? $$1 : this.n();

      for (iw $$4 : $$0.f()) {
         if ($$4 != iw.a) {
            dtt $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.a($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
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
   protected dtc a(dtc $$0, dke $$1) {
      switch ($$1) {
         case b:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         case c:
            return $$0.a(d, $$0.c(f)).a(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dtt a(iw $$0) {
      return g.get($$0);
   }
}
