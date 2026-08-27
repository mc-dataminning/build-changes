import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dhi extends cyo {
   public static final MapCodec<dhi> a = b(dhi::new);
   public static final dlw b = deb.f;
   public static final dlw c = deb.b;
   public static final dlw d = deb.c;
   public static final dlw e = deb.d;
   public static final dlw f = deb.e;
   public static final Map<ie, dlw> g = deb.h.entrySet().stream().filter($$0 -> $$0.getKey() != ie.a).collect(ac.a());
   protected static final float h = 1.0F;
   private static final eol i = cyo.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eol j = cyo.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eol k = cyo.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eol l = cyo.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eol m = cyo.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dlf, eol> n;

   @Override
   public MapCodec<dhi> a() {
      return a;
   }

   public dhi(dle.d $$0) {
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
      this.n = ImmutableMap.copyOf(this.E.a().stream().collect(Collectors.toMap(Function.identity(), dhi::m)));
   }

   private static eol m(dlf $$0) {
      eol $$1 = eoi.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = eoi.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = eoi.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = eoi.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = eoi.a($$1, j);
      }

      return $$1.c() ? eoi.b() : $$1;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return this.n.get($$0);
   }

   @Override
   protected boolean a_(dlf $$0, cut $$1, hz $$2) {
      return true;
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      return this.n(this.i($$0, $$1, $$2));
   }

   private boolean n(dlf $$0) {
      return this.o($$0) > 0;
   }

   private int o(dlf $$0) {
      int $$1 = 0;

      for (dlw $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(cut $$0, hz $$1, ie $$2) {
      if ($$2 == ie.a) {
         return false;
      } else {
         hz $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == ie.a.b) {
            return false;
         } else {
            dlw $$4 = g.get($$2);
            dlf $$5 = $$0.a_($$1.c());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(cut $$0, hz $$1, ie $$2) {
      return ddn.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dlf i(dlf $$0, cut $$1, hz $$2) {
      hz $$3 = $$2.c();
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(a($$1, $$3, ie.a)));
      }

      dlf $$4 = null;

      for (ie $$5 : ie.c.a) {
         dlw $$6 = a($$5);
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
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$1 == ie.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         dlf $$6 = this.i($$0, $$3, $$4);
         return !this.n($$6) ? cyq.a.o() : $$6;
      }
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if ($$1.Z().b(cvj.X)) {
         if ($$3.a(4) == 0) {
            ie $$4 = ie.b($$3);
            hz $$5 = $$2.c();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  hz $$6 = $$2.a($$4);
                  dlf $$7 = $$1.a_($$6);
                  if ($$7.i()) {
                     ie $$8 = $$4.h();
                     ie $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     hz $$12 = $$6.a($$8);
                     hz $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.o().a(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.o().a(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        ie $$14 = $$4.g();
                        if ($$10 && $$1.u($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.o().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.u($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.o().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.c(), ie.b)) {
                           $$1.a($$6, this.o().a(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.a(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == ie.b && $$2.v() < $$1.al() - 1) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.u($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dlf $$15 = $$0;

                     for (ie $$16 : ie.c.a) {
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
                  hz $$17 = $$2.d();
                  dlf $$18 = $$1.a_($$17);
                  if ($$18.i() || $$18.a(this)) {
                     dlf $$19 = $$18.i() ? this.o() : $$18;
                     dlf $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.p($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dlf a(dlf $$0, dlf $$1, awo $$2) {
      for (ie $$3 : ie.c.a) {
         if ($$2.h()) {
            dlw $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.a($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean p(dlf $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(cut $$0, hz $$1) {
      int $$2 = 4;
      Iterable<hz> $$3 = hz.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (hz $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected boolean a(dlf $$0, crg $$1) {
      dlf $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.o($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      dlf $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dlf $$3 = $$2 ? $$1 : this.o();

      for (ie $$4 : $$0.f()) {
         if ($$4 != ie.a) {
            dlw $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.a($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
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
   protected dlf a(dlf $$0, ddk $$1) {
      switch ($$1) {
         case b:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         case c:
            return $$0.a(d, $$0.c(f)).a(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dlw a(ie $$0) {
      return g.get($$0);
   }
}
