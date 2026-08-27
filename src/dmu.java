import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dmu extends ddy {
   public static final MapCodec<dmu> a = b(dmu::new);
   public static final drs b = djm.f;
   public static final drs c = djm.b;
   public static final drs d = djm.c;
   public static final drs e = djm.d;
   public static final drs f = djm.e;
   public static final Map<it, drs> g = djm.h.entrySet().stream().filter($$0 -> $$0.getKey() != it.a).collect(ac.a());
   protected static final float h = 1.0F;
   private static final evd i = ddy.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final evd j = ddy.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final evd k = ddy.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final evd l = ddy.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final evd m = ddy.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<drb, evd> n;

   @Override
   public MapCodec<dmu> a() {
      return a;
   }

   public dmu(dra.d $$0) {
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
      this.n = ImmutableMap.copyOf(this.E.a().stream().collect(Collectors.toMap(Function.identity(), dmu::m)));
   }

   private static evd m(drb $$0) {
      evd $$1 = eva.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = eva.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = eva.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = eva.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = eva.a($$1, j);
      }

      return $$1.c() ? eva.b() : $$1;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return this.n.get($$0);
   }

   @Override
   protected boolean a_(drb $$0, dad $$1, io $$2) {
      return true;
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      return this.n(this.i($$0, $$1, $$2));
   }

   private boolean n(drb $$0) {
      return this.o($$0) > 0;
   }

   private int o(drb $$0) {
      int $$1 = 0;

      for (drs $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(dad $$0, io $$1, it $$2) {
      if ($$2 == it.a) {
         return false;
      } else {
         io $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == it.a.b) {
            return false;
         } else {
            drs $$4 = g.get($$2);
            drb $$5 = $$0.a_($$1.c());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(dad $$0, io $$1, it $$2) {
      return diy.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private drb i(drb $$0, dad $$1, io $$2) {
      io $$3 = $$2.c();
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(a($$1, $$3, it.a)));
      }

      drb $$4 = null;

      for (it $$5 : it.c.a) {
         drs $$6 = a($$5);
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
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$1 == it.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         drb $$6 = this.i($$0, $$3, $$4);
         return !this.n($$6) ? dea.a.n() : $$6;
      }
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$1.aa().b(dat.X)) {
         if ($$3.a(4) == 0) {
            it $$4 = it.b($$3);
            io $$5 = $$2.c();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  io $$6 = $$2.a($$4);
                  drb $$7 = $$1.a_($$6);
                  if ($$7.i()) {
                     it $$8 = $$4.h();
                     it $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     io $$12 = $$6.a($$8);
                     io $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.n().a(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.n().a(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        it $$14 = $$4.g();
                        if ($$10 && $$1.u($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.n().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.u($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.n().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.c(), it.b)) {
                           $$1.a($$6, this.n().a(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.a(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == it.b && $$2.v() < $$1.al() - 1) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.u($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     drb $$15 = $$0;

                     for (it $$16 : it.c.a) {
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
                  io $$17 = $$2.d();
                  drb $$18 = $$1.a_($$17);
                  if ($$18.i() || $$18.a(this)) {
                     drb $$19 = $$18.i() ? this.n() : $$18;
                     drb $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.p($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private drb a(drb $$0, drb $$1, ayk $$2) {
      for (it $$3 : it.c.a) {
         if ($$2.h()) {
            drs $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.a($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean p(drb $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(dad $$0, io $$1) {
      int $$2 = 4;
      Iterable<io> $$3 = io.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (io $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected boolean a(drb $$0, cwz $$1) {
      drb $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.o($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      drb $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      drb $$3 = $$2 ? $$1 : this.n();

      for (it $$4 : $$0.f()) {
         if ($$4 != it.a) {
            drs $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.a($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
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
   protected drb a(drb $$0, div $$1) {
      switch ($$1) {
         case b:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         case c:
            return $$0.a(d, $$0.c(f)).a(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static drs a(it $$0) {
      return g.get($$0);
   }
}
