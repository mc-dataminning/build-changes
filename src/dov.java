import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dov extends dfy {
   public static final MapCodec<dov> a = b(dov::new);
   public static final dtt b = dlm.f;
   public static final dtt c = dlm.b;
   public static final dtt d = dlm.c;
   public static final dtt e = dlm.d;
   public static final dtt f = dlm.e;
   public static final Map<ji, dtt> g = dlm.h.entrySet().stream().filter($$0 -> $$0.getKey() != ji.a).collect(ad.a());
   protected static final float h = 1.0F;
   private static final ext i = dfy.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ext j = dfy.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ext k = dfy.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ext l = dfy.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ext m = dfy.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dtc, ext> n;

   @Override
   public MapCodec<dov> a() {
      return a;
   }

   public dov(dtb.d $$0) {
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
      this.n = ImmutableMap.copyOf(this.E.a().stream().collect(Collectors.toMap(Function.identity(), dov::m)));
   }

   private static ext m(dtc $$0) {
      ext $$1 = exq.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = exq.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = exq.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = exq.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = exq.a($$1, j);
      }

      return $$1.c() ? exq.b() : $$1;
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return this.n.get($$0);
   }

   @Override
   protected boolean a_(dtc $$0, dcc $$1, jd $$2) {
      return true;
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
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

   private boolean b(dcc $$0, jd $$1, ji $$2) {
      if ($$2 == ji.a) {
         return false;
      } else {
         jd $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == ji.a.b) {
            return false;
         } else {
            dtt $$4 = g.get($$2);
            dtc $$5 = $$0.a_($$1.d());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(dcc $$0, jd $$1, ji $$2) {
      return dky.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dtc i(dtc $$0, dcc $$1, jd $$2) {
      jd $$3 = $$2.d();
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(a($$1, $$3, ji.a)));
      }

      dtc $$4 = null;

      for (ji $$5 : ji.c.a) {
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
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$1 == ji.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         dtc $$6 = this.i($$0, $$3, $$4);
         return !this.n($$6) ? dga.a.o() : $$6;
      }
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if ($$1.ab().b(dcs.X)) {
         if ($$3.a(4) == 0) {
            ji $$4 = ji.b($$3);
            jd $$5 = $$2.d();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  jd $$6 = $$2.a($$4);
                  dtc $$7 = $$1.a_($$6);
                  if ($$7.i()) {
                     ji $$8 = $$4.h();
                     ji $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     jd $$12 = $$6.a($$8);
                     jd $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.o().a(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.o().a(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        ji $$14 = $$4.g();
                        if ($$10 && $$1.u($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.o().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.u($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.o().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.d(), ji.b)) {
                           $$1.a($$6, this.o().a(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.a(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == ji.b && $$2.v() < $$1.am() - 1) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.u($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dtc $$15 = $$0;

                     for (ji $$16 : ji.c.a) {
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
                  jd $$17 = $$2.e();
                  dtc $$18 = $$1.a_($$17);
                  if ($$18.i() || $$18.a(this)) {
                     dtc $$19 = $$18.i() ? this.o() : $$18;
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

   private dtc a(dtc $$0, dtc $$1, ayw $$2) {
      for (ji $$3 : ji.c.a) {
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

   private boolean a(dcc $$0, jd $$1) {
      int $$2 = 4;
      Iterable<jd> $$3 = jd.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (jd $$5 : $$3) {
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
      dtc $$3 = $$2 ? $$1 : this.o();

      for (ji $$4 : $$0.f()) {
         if ($$4 != ji.a) {
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
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
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
   protected dtc a(dtc $$0, dkv $$1) {
      switch ($$1) {
         case b:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         case c:
            return $$0.a(d, $$0.c(f)).a(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dtt a(ji $$0) {
      return g.get($$0);
   }
}
