import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dqj extends dhm {
   public static final MapCodec<dqj> a = b(dqj::new);
   public static final dvj b = dna.f;
   public static final dvj c = dna.b;
   public static final dvj d = dna.c;
   public static final dvj e = dna.d;
   public static final dvj f = dna.e;
   public static final Map<jk, dvj> g = dna.h.entrySet().stream().filter($$0 -> $$0.getKey() != jk.a).collect(ad.a());
   protected static final float h = 1.0F;
   private static final ezq i = dhm.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ezq j = dhm.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ezq k = dhm.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ezq l = dhm.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ezq m = dhm.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dus, ezq> n;

   @Override
   public MapCodec<dqj> a() {
      return a;
   }

   public dqj(dur.d $$0) {
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
      this.n = ImmutableMap.copyOf(this.F.a().stream().collect(Collectors.toMap(Function.identity(), dqj::o)));
   }

   private static ezq o(dus $$0) {
      ezq $$1 = ezn.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = ezn.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = ezn.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = ezn.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = ezn.a($$1, j);
      }

      return $$1.c() ? ezn.b() : $$1;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return this.n.get($$0);
   }

   @Override
   protected boolean e_(dus $$0) {
      return true;
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return this.q(this.e($$0, $$1, $$2));
   }

   private boolean q(dus $$0) {
      return this.r($$0) > 0;
   }

   private int r(dus $$0) {
      int $$1 = 0;

      for (dvj $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(ddo $$0, jf $$1, jk $$2) {
      if ($$2 == jk.a) {
         return false;
      } else {
         jf $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == jk.a.b) {
            return false;
         } else {
            dvj $$4 = g.get($$2);
            dus $$5 = $$0.a_($$1.d());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(ddo $$0, jf $$1, jk $$2) {
      return dmm.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dus e(dus $$0, ddo $$1, jf $$2) {
      jf $$3 = $$2.d();
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(a($$1, $$3, jk.a)));
      }

      dus $$4 = null;

      for (jk $$5 : jk.c.a) {
         dvj $$6 = a($$5);
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
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$1 == jk.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         dus $$6 = this.e($$0, $$3, $$4);
         return !this.q($$6) ? dho.a.n() : $$6;
      }
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$1.ac().b(def.X)) {
         if ($$3.a(4) == 0) {
            jk $$4 = jk.b($$3);
            jf $$5 = $$2.d();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  jf $$6 = $$2.a($$4);
                  dus $$7 = $$1.a_($$6);
                  if ($$7.l()) {
                     jk $$8 = $$4.h();
                     jk $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     jf $$12 = $$6.a($$8);
                     jf $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.n().b(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.n().b(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        jk $$14 = $$4.g();
                        if ($$10 && $$1.u($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.n().b(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.u($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.n().b(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.d(), jk.b)) {
                           $$1.a($$6, this.n().b(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.b(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == jk.b && $$2.v() < $$1.an()) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.u($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dus $$15 = $$0;

                     for (jk $$16 : jk.c.a) {
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

               if ($$2.v() > $$1.H_()) {
                  jf $$17 = $$2.e();
                  dus $$18 = $$1.a_($$17);
                  if ($$18.l() || $$18.a(this)) {
                     dus $$19 = $$18.l() ? this.n() : $$18;
                     dus $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.s($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dus a(dus $$0, dus $$1, azn $$2) {
      for (jk $$3 : jk.c.a) {
         if ($$2.h()) {
            dvj $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.b($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean s(dus $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(ddo $$0, jf $$1) {
      int $$2 = 4;
      Iterable<jf> $$3 = jf.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (jf $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected boolean a(dus $$0, czn $$1) {
      dus $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.r($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      dus $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dus $$3 = $$2 ? $$1 : this.n();

      for (jk $$4 : $$0.f()) {
         if ($$4 != jk.a) {
            dvj $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.b($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
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
   protected dus a(dus $$0, dmj $$1) {
      switch ($$1) {
         case b:
            return $$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c:
            return $$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dvj a(jk $$0) {
      return g.get($$0);
   }
}
