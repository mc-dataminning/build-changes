import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dty extends dku {
   public static final MapCodec<dty> a = b(dty::new);
   public static final dzd b = dqm.f;
   public static final dzd c = dqm.b;
   public static final dzd d = dqm.c;
   public static final dzd e = dqm.d;
   public static final dzd f = dqm.e;
   public static final Map<jo, dzd> g = dqm.h.entrySet().stream().filter($$0 -> $$0.getKey() != jo.a).collect(af.a());
   private final Function<dym, fdo> h;

   @Override
   public MapCodec<dty> a() {
      return a;
   }

   public dty(dyl.d $$0) {
      super($$0);
      this.l(
         this.B
            .b()
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
      );
      this.h = this.b();
   }

   private Function<dym, fdo> b() {
      Map<jo, fdo> $$0 = fdl.d(dku.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         fdo $$2 = fdl.a();

         for (Entry<jo, dzd> $$3 : g.entrySet()) {
            if ($$1.c($$3.getValue())) {
               $$2 = fdl.a($$2, $$0.get($$3.getKey()));
            }
         }

         return $$2.c() ? fdl.b() : $$2;
      });
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected boolean e_(dym $$0) {
      return true;
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return this.o(this.e($$0, $$1, $$2));
   }

   private boolean o(dym $$0) {
      return this.q($$0) > 0;
   }

   private int q(dym $$0) {
      int $$1 = 0;

      for (dzd $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(dgv $$0, jj $$1, jo $$2) {
      if ($$2 == jo.a) {
         return false;
      } else {
         jj $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == jo.a.b) {
            return false;
         } else {
            dzd $$4 = g.get($$2);
            dym $$5 = $$0.a_($$1.d());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(dgv $$0, jj $$1, jo $$2) {
      return dpy.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dym e(dym $$0, dgv $$1, jj $$2) {
      jj $$3 = $$2.d();
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(a($$1, $$3, jo.a)));
      }

      dym $$4 = null;

      for (jo $$5 : jo.c.a) {
         dzd $$6 = a($$5);
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
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$4 == jo.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         dym $$8 = this.e($$0, $$1, $$3);
         return !this.o($$8) ? dkw.a.m() : $$8;
      }
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$1.O().c(dhl.Y)) {
         if ($$3.a(4) == 0) {
            jo $$4 = jo.b($$3);
            jj $$5 = $$2.d();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  jj $$6 = $$2.a($$4);
                  dym $$7 = $$1.a_($$6);
                  if ($$7.l()) {
                     jo $$8 = $$4.h();
                     jo $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     jj $$12 = $$6.a($$8);
                     jj $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.m().b(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.m().b(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        jo $$14 = $$4.g();
                        if ($$10 && $$1.u($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.m().b(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.u($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.m().b(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.d(), jo.b)) {
                           $$1.a($$6, this.m().b(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.b(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == jo.b && $$2.v() < $$1.ao()) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.u($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dym $$15 = $$0;

                     for (jo $$16 : jo.c.a) {
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
                  jj $$17 = $$2.e();
                  dym $$18 = $$1.a_($$17);
                  if ($$18.l() || $$18.a(this)) {
                     dym $$19 = $$18.l() ? this.m() : $$18;
                     dym $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.r($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dym a(dym $$0, dym $$1, azs $$2) {
      for (jo $$3 : jo.c.a) {
         if ($$2.h()) {
            dzd $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.b($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean r(dym $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(dgv $$0, jj $$1) {
      int $$2 = 4;
      Iterable<jj> $$3 = jj.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (jj $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected boolean a(dym $$0, dbn $$1) {
      dym $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.q($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      dym $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dym $$3 = $$2 ? $$1 : this.m();

      for (jo $$4 : $$0.f()) {
         if ($$4 != jo.a) {
            dzd $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.b($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
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
   protected dym a(dym $$0, dpv $$1) {
      switch ($$1) {
         case b:
            return $$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c:
            return $$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dzd a(jo $$0) {
      return g.get($$0);
   }
}
