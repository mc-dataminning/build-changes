import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dtd extends dke {
   public static final MapCodec<dtd> a = b(dtd::new);
   public static final dye b = dpu.f;
   public static final dye c = dpu.b;
   public static final dye d = dpu.c;
   public static final dye e = dpu.d;
   public static final dye f = dpu.e;
   public static final Map<jm, dye> g = dpu.h.entrySet().stream().filter($$0 -> $$0.getKey() != jm.a).collect(ae.a());
   protected static final float h = 1.0F;
   private static final fcm i = dke.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcm j = dke.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fcm k = dke.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcm l = dke.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fcm m = dke.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dxn, fcm> n;

   @Override
   public MapCodec<dtd> a() {
      return a;
   }

   public dtd(dxm.d $$0) {
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
      this.n = ImmutableMap.copyOf(this.F.a().stream().collect(Collectors.toMap(Function.identity(), dtd::o)));
   }

   private static fcm o(dxn $$0) {
      fcm $$1 = fcj.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = fcj.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = fcj.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = fcj.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = fcj.a($$1, j);
      }

      return $$1.c() ? fcj.b() : $$1;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return this.n.get($$0);
   }

   @Override
   protected boolean e_(dxn $$0) {
      return true;
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      return this.q(this.e($$0, $$1, $$2));
   }

   private boolean q(dxn $$0) {
      return this.r($$0) > 0;
   }

   private int r(dxn $$0) {
      int $$1 = 0;

      for (dye $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(dgf $$0, jh $$1, jm $$2) {
      if ($$2 == jm.a) {
         return false;
      } else {
         jh $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == jm.a.b) {
            return false;
         } else {
            dye $$4 = g.get($$2);
            dxn $$5 = $$0.a_($$1.d());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(dgf $$0, jh $$1, jm $$2) {
      return dpg.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dxn e(dxn $$0, dgf $$1, jh $$2) {
      jh $$3 = $$2.d();
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(a($$1, $$3, jm.a)));
      }

      dxn $$4 = null;

      for (jm $$5 : jm.c.a) {
         dye $$6 = a($$5);
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
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$4 == jm.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         dxn $$8 = this.e($$0, $$1, $$3);
         return !this.q($$8) ? dkg.a.m() : $$8;
      }
   }

   @Override
   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.N().b(dgw.X)) {
         if ($$3.a(4) == 0) {
            jm $$4 = jm.b($$3);
            jh $$5 = $$2.d();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  jh $$6 = $$2.a($$4);
                  dxn $$7 = $$1.a_($$6);
                  if ($$7.l()) {
                     jm $$8 = $$4.h();
                     jm $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     jh $$12 = $$6.a($$8);
                     jh $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.m().b(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.m().b(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        jm $$14 = $$4.g();
                        if ($$10 && $$1.u($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.m().b(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.u($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.m().b(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.d(), jm.b)) {
                           $$1.a($$6, this.m().b(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.b(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == jm.b && $$2.v() < $$1.am()) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.u($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dxn $$15 = $$0;

                     for (jm $$16 : jm.c.a) {
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

               if ($$2.v() > $$1.L_()) {
                  jh $$17 = $$2.e();
                  dxn $$18 = $$1.a_($$17);
                  if ($$18.l() || $$18.a(this)) {
                     dxn $$19 = $$18.l() ? this.m() : $$18;
                     dxn $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.s($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dxn a(dxn $$0, dxn $$1, bam $$2) {
      for (jm $$3 : jm.c.a) {
         if ($$2.h()) {
            dye $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.b($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean s(dxn $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(dgf $$0, jh $$1) {
      int $$2 = 4;
      Iterable<jh> $$3 = jh.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (jh $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected boolean a(dxn $$0, dbb $$1) {
      dxn $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.r($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      dxn $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dxn $$3 = $$2 ? $$1 : this.m();

      for (jm $$4 : $$0.f()) {
         if ($$4 != jm.a) {
            dye $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.b($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
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
   protected dxn a(dxn $$0, dpd $$1) {
      switch ($$1) {
         case b:
            return $$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c:
            return $$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dye a(jm $$0) {
      return g.get($$0);
   }
}
