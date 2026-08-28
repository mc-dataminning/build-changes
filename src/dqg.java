import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dqg extends dhj {
   public static final MapCodec<dqg> a = b(dqg::new);
   public static final dvf b = dmx.f;
   public static final dvf c = dmx.b;
   public static final dvf d = dmx.c;
   public static final dvf e = dmx.d;
   public static final dvf f = dmx.e;
   public static final Map<jj, dvf> g = dmx.h.entrySet().stream().filter($$0 -> $$0.getKey() != jj.a).collect(ad.a());
   protected static final float h = 1.0F;
   private static final ezm i = dhj.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ezm j = dhj.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ezm k = dhj.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ezm l = dhj.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ezm m = dhj.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<duo, ezm> n;

   @Override
   public MapCodec<dqg> a() {
      return a;
   }

   public dqg(dun.d $$0) {
      super($$0);
      this.l(
         this.F
            .b()
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
      );
      this.n = ImmutableMap.copyOf(this.F.a().stream().collect(Collectors.toMap(Function.identity(), dqg::o)));
   }

   private static ezm o(duo $$0) {
      ezm $$1 = ezj.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = ezj.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = ezj.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = ezj.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = ezj.a($$1, j);
      }

      return $$1.c() ? ezj.b() : $$1;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return this.n.get($$0);
   }

   @Override
   protected boolean e_(duo $$0) {
      return true;
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      return this.q(this.e($$0, $$1, $$2));
   }

   private boolean q(duo $$0) {
      return this.r($$0) > 0;
   }

   private int r(duo $$0) {
      int $$1 = 0;

      for (dvf $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(ddl $$0, je $$1, jj $$2) {
      if ($$2 == jj.a) {
         return false;
      } else {
         je $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == jj.a.b) {
            return false;
         } else {
            dvf $$4 = g.get($$2);
            duo $$5 = $$0.a_($$1.d());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(ddl $$0, je $$1, jj $$2) {
      return dmj.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private duo e(duo $$0, ddl $$1, je $$2) {
      je $$3 = $$2.d();
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(a($$1, $$3, jj.a)));
      }

      duo $$4 = null;

      for (jj $$5 : jj.c.a) {
         dvf $$6 = a($$5);
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
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$1 == jj.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         duo $$6 = this.e($$0, $$3, $$4);
         return !this.q($$6) ? dhl.a.o() : $$6;
      }
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$1.ac().b(dec.X)) {
         if ($$3.a(4) == 0) {
            jj $$4 = jj.b($$3);
            je $$5 = $$2.d();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  je $$6 = $$2.a($$4);
                  duo $$7 = $$1.a_($$6);
                  if ($$7.l()) {
                     jj $$8 = $$4.h();
                     jj $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     je $$12 = $$6.a($$8);
                     je $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.o().b(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.o().b(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        jj $$14 = $$4.g();
                        if ($$10 && $$1.u($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.o().b(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.u($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.o().b(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.d(), jj.b)) {
                           $$1.a($$6, this.o().b(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.b(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == jj.b && $$2.v() < $$1.an()) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.u($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     duo $$15 = $$0;

                     for (jj $$16 : jj.c.a) {
                        if ($$3.h() || !a($$1, $$5.a($$16), $$16)) {
                           $$15 = $$15.b(a($$16), Boolean.valueOf(false));
                        }
                     }

                     if (this.s($$15)) {
                        $$1.a($$5, $$15, 2);
                     }

                     return;
                  }
               }

               if ($$2.v() > $$1.G_()) {
                  je $$17 = $$2.e();
                  duo $$18 = $$1.a_($$17);
                  if ($$18.l() || $$18.a(this)) {
                     duo $$19 = $$18.l() ? this.o() : $$18;
                     duo $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.s($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private duo a(duo $$0, duo $$1, azl $$2) {
      for (jj $$3 : jj.c.a) {
         if ($$2.h()) {
            dvf $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.b($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean s(duo $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(ddl $$0, je $$1) {
      int $$2 = 4;
      Iterable<je> $$3 = je.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (je $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected boolean a(duo $$0, czk $$1) {
      duo $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.r($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      duo $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      duo $$3 = $$2 ? $$1 : this.o();

      for (jj $$4 : $$0.f()) {
         if ($$4 != jj.a) {
            dvf $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.b($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
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
   protected duo a(duo $$0, dmg $$1) {
      switch ($$1) {
         case b:
            return $$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c:
            return $$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dvf a(jj $$0) {
      return g.get($$0);
   }
}
