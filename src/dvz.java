import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dvz extends dmm {
   public static final MapCodec<dvz> a = b(dvz::new);
   public static final ebf b = dsg.f;
   public static final ebf c = dsg.b;
   public static final ebf d = dsg.c;
   public static final ebf e = dsg.d;
   public static final ebf f = dsg.e;
   public static final Map<jb, ebf> g = dsg.h.entrySet().stream().filter($$0 -> $$0.getKey() != jb.a).collect(ag.a());
   private final Function<eao, ffr> h;

   @Override
   public MapCodec<dvz> a() {
      return a;
   }

   public dvz(ean.d $$0) {
      super($$0);
      this.l(
         this.C
            .b()
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
      );
      this.h = this.b();
   }

   private Function<eao, ffr> b() {
      Map<jb, ffr> $$0 = ffo.d(dmm.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         ffr $$2 = ffo.a();

         for (Entry<jb, ebf> $$3 : g.entrySet()) {
            if ($$1.c($$3.getValue())) {
               $$2 = ffo.a($$2, $$0.get($$3.getKey()));
            }
         }

         return $$2.c() ? ffo.b() : $$2;
      });
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected boolean e_(eao $$0) {
      return true;
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return this.o(this.e($$0, $$1, $$2));
   }

   private boolean o(eao $$0) {
      return this.q($$0) > 0;
   }

   private int q(eao $$0) {
      int $$1 = 0;

      for (ebf $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(din $$0, iv $$1, jb $$2) {
      if ($$2 == jb.a) {
         return false;
      } else {
         iv $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == jb.a.b) {
            return false;
         } else {
            ebf $$4 = g.get($$2);
            eao $$5 = $$0.a_($$1.d());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(din $$0, iv $$1, jb $$2) {
      return drs.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private eao e(eao $$0, din $$1, iv $$2) {
      iv $$3 = $$2.d();
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(a($$1, $$3, jb.a)));
      }

      eao $$4 = null;

      for (jb $$5 : jb.c.a) {
         ebf $$6 = a($$5);
         if ($$0.c($$6)) {
            boolean $$7 = this.b($$1, $$2, $$5);
            if (!$$7) {
               if ($$4 == null) {
                  $$4 = $$1.a_($$3);
               }

               $$7 = $$4.a(this) && $$4.c($$6);
            }

            $$0 = $$0.b($$6, Boolean.valueOf($$7));
         }
      }

      return $$0;
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$4 == jb.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         eao $$8 = this.e($$0, $$1, $$3);
         return !this.o($$8) ? dmo.a.m() : $$8;
      }
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      if ($$1.O().c(djd.Z)) {
         if ($$3.a(4) == 0) {
            jb $$4 = jb.b($$3);
            iv $$5 = $$2.d();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  iv $$6 = $$2.a($$4);
                  eao $$7 = $$1.a_($$6);
                  if ($$7.l()) {
                     jb $$8 = $$4.h();
                     jb $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     iv $$12 = $$6.a($$8);
                     iv $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.m().b(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.m().b(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        jb $$14 = $$4.g();
                        if ($$10 && $$1.v($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.m().b(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.v($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.m().b(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.d(), jb.b)) {
                           $$1.a($$6, this.m().b(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.b(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == jb.b && $$2.v() < $$1.ao()) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.v($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     eao $$15 = $$0;

                     for (jb $$16 : jb.c.a) {
                        if ($$3.h() || !a($$1, $$5.a($$16), $$16)) {
                           $$15 = $$15.b(a($$16), Boolean.valueOf(false));
                        }
                     }

                     if (this.r($$15)) {
                        $$1.a($$5, $$15, 2);
                     }

                     return;
                  }
               }

               if ($$2.v() > $$1.G_()) {
                  iv $$17 = $$2.e();
                  eao $$18 = $$1.a_($$17);
                  if ($$18.l() || $$18.a(this)) {
                     eao $$19 = $$18.l() ? this.m() : $$18;
                     eao $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.r($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private eao a(eao $$0, eao $$1, azv $$2) {
      for (jb $$3 : jb.c.a) {
         if ($$2.h()) {
            ebf $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.b($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean r(eao $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(din $$0, iv $$1) {
      int $$2 = 4;
      Iterable<iv> $$3 = iv.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (iv $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected boolean a(eao $$0, ddd $$1) {
      eao $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.q($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      eao $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      eao $$3 = $$2 ? $$1 : this.m();

      for (jb $$4 : $$0.f()) {
         if ($$4 != jb.a) {
            ebf $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.b($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      switch ($$1) {
         case c:
            return $$0.b(c, $$0.c(e)).b(d, $$0.c(f)).b(e, $$0.c(c)).b(f, $$0.c(d));
         case d:
            return $$0.b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(c));
         case b:
            return $$0.b(c, $$0.c(f)).b(d, $$0.c(c)).b(e, $$0.c(d)).b(f, $$0.c(e));
         default:
            return $$0;
      }
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      switch ($$1) {
         case b:
            return $$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c:
            return $$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static ebf a(jb $$0) {
      return g.get($$0);
   }
}
