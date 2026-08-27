import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class det extends cvz {
   public static final MapCodec<det> a = b(det::new);
   public static final djg b = dbm.f;
   public static final djg c = dbm.b;
   public static final djg d = dbm.c;
   public static final djg e = dbm.d;
   public static final djg f = dbm.e;
   public static final Map<ia, djg> g = dbm.h.entrySet().stream().filter($$0 -> $$0.getKey() != ia.a).collect(ac.a());
   protected static final float h = 1.0F;
   private static final elu i = cvz.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final elu j = cvz.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final elu k = cvz.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final elu l = cvz.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final elu m = cvz.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dip, elu> n;

   @Override
   public MapCodec<det> a() {
      return a;
   }

   public det(dio.d $$0) {
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
      this.n = ImmutableMap.copyOf(this.E.a().stream().collect(Collectors.toMap(Function.identity(), det::h)));
   }

   private static elu h(dip $$0) {
      elu $$1 = elr.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = elr.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = elr.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = elr.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = elr.a($$1, j);
      }

      return $$1.c() ? elr.b() : $$1;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return this.n.get($$0);
   }

   @Override
   public boolean a_(dip $$0, cse $$1, hv $$2) {
      return true;
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      return this.n(this.i($$0, $$1, $$2));
   }

   private boolean n(dip $$0) {
      return this.o($$0) > 0;
   }

   private int o(dip $$0) {
      int $$1 = 0;

      for (djg $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(cse $$0, hv $$1, ia $$2) {
      if ($$2 == ia.a) {
         return false;
      } else {
         hv $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == ia.a.b) {
            return false;
         } else {
            djg $$4 = g.get($$2);
            dip $$5 = $$0.a_($$1.c());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(cse $$0, hv $$1, ia $$2) {
      return day.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dip i(dip $$0, cse $$1, hv $$2) {
      hv $$3 = $$2.c();
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(a($$1, $$3, ia.a)));
      }

      dip $$4 = null;

      for (ia $$5 : ia.c.a) {
         djg $$6 = a($$5);
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
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$1 == ia.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         dip $$6 = this.i($$0, $$3, $$4);
         return !this.n($$6) ? cwb.a.o() : $$6;
      }
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$1.Y().b(csu.X)) {
         if ($$3.a(4) == 0) {
            ia $$4 = ia.b($$3);
            hv $$5 = $$2.c();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  hv $$6 = $$2.a($$4);
                  dip $$7 = $$1.a_($$6);
                  if ($$7.i()) {
                     ia $$8 = $$4.h();
                     ia $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     hv $$12 = $$6.a($$8);
                     hv $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.o().a(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.o().a(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        ia $$14 = $$4.g();
                        if ($$10 && $$1.t($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.o().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.t($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.o().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.c(), ia.b)) {
                           $$1.a($$6, this.o().a(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.a(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == ia.b && $$2.v() < $$1.ak() - 1) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.t($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dip $$15 = $$0;

                     for (ia $$16 : ia.c.a) {
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
                  hv $$17 = $$2.d();
                  dip $$18 = $$1.a_($$17);
                  if ($$18.i() || $$18.a(this)) {
                     dip $$19 = $$18.i() ? this.o() : $$18;
                     dip $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.p($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dip a(dip $$0, dip $$1, auf $$2) {
      for (ia $$3 : ia.c.a) {
         if ($$2.h()) {
            djg $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.a($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean p(dip $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(cse $$0, hv $$1) {
      int $$2 = 4;
      Iterable<hv> $$3 = hv.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (hv $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public boolean a(dip $$0, coq $$1) {
      dip $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.o($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      dip $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dip $$3 = $$2 ? $$1 : this.o();

      for (ia $$4 : $$0.f()) {
         if ($$4 != ia.a) {
            djg $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.a($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
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
   public dip a(dip $$0, dav $$1) {
      switch ($$1) {
         case b:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         case c:
            return $$0.a(d, $$0.c(f)).a(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static djg a(ia $$0) {
      return g.get($$0);
   }
}
