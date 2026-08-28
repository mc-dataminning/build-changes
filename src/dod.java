import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dod extends dfh {
   public static final MapCodec<dod> a = b(dod::new);
   public static final dtb b = dkv.f;
   public static final dtb c = dkv.b;
   public static final dtb d = dkv.c;
   public static final dtb e = dkv.d;
   public static final dtb f = dkv.e;
   public static final Map<jf, dtb> g = dkv.h.entrySet().stream().filter($$0 -> $$0.getKey() != jf.a).collect(ac.a());
   protected static final float h = 1.0F;
   private static final ewy i = dfh.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewy j = dfh.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ewy k = dfh.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewy l = dfh.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ewy m = dfh.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dsk, ewy> n;

   @Override
   public MapCodec<dod> a() {
      return a;
   }

   public dod(dsj.d $$0) {
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
      this.n = ImmutableMap.copyOf(this.E.a().stream().collect(Collectors.toMap(Function.identity(), dod::m)));
   }

   private static ewy m(dsk $$0) {
      ewy $$1 = ewv.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = ewv.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = ewv.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = ewv.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = ewv.a($$1, j);
      }

      return $$1.c() ? ewv.b() : $$1;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return this.n.get($$0);
   }

   @Override
   protected boolean a_(dsk $$0, dbl $$1, ja $$2) {
      return true;
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return this.n(this.i($$0, $$1, $$2));
   }

   private boolean n(dsk $$0) {
      return this.o($$0) > 0;
   }

   private int o(dsk $$0) {
      int $$1 = 0;

      for (dtb $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(dbl $$0, ja $$1, jf $$2) {
      if ($$2 == jf.a) {
         return false;
      } else {
         ja $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == jf.a.b) {
            return false;
         } else {
            dtb $$4 = g.get($$2);
            dsk $$5 = $$0.a_($$1.c());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(dbl $$0, ja $$1, jf $$2) {
      return dkh.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dsk i(dsk $$0, dbl $$1, ja $$2) {
      ja $$3 = $$2.c();
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(a($$1, $$3, jf.a)));
      }

      dsk $$4 = null;

      for (jf $$5 : jf.c.a) {
         dtb $$6 = a($$5);
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
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$1 == jf.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         dsk $$6 = this.i($$0, $$3, $$4);
         return !this.n($$6) ? dfj.a.o() : $$6;
      }
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$1.ab().b(dcb.X)) {
         if ($$3.a(4) == 0) {
            jf $$4 = jf.b($$3);
            ja $$5 = $$2.c();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  ja $$6 = $$2.a($$4);
                  dsk $$7 = $$1.a_($$6);
                  if ($$7.i()) {
                     jf $$8 = $$4.h();
                     jf $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     ja $$12 = $$6.a($$8);
                     ja $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.o().a(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.o().a(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        jf $$14 = $$4.g();
                        if ($$10 && $$1.u($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.o().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.u($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.o().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.c(), jf.b)) {
                           $$1.a($$6, this.o().a(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.a(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == jf.b && $$2.v() < $$1.am() - 1) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.u($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dsk $$15 = $$0;

                     for (jf $$16 : jf.c.a) {
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
                  ja $$17 = $$2.d();
                  dsk $$18 = $$1.a_($$17);
                  if ($$18.i() || $$18.a(this)) {
                     dsk $$19 = $$18.i() ? this.o() : $$18;
                     dsk $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.p($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dsk a(dsk $$0, dsk $$1, ayo $$2) {
      for (jf $$3 : jf.c.a) {
         if ($$2.h()) {
            dtb $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.a($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean p(dsk $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(dbl $$0, ja $$1) {
      int $$2 = 4;
      Iterable<ja> $$3 = ja.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (ja $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected boolean a(dsk $$0, cxm $$1) {
      dsk $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.o($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      dsk $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dsk $$3 = $$2 ? $$1 : this.o();

      for (jf $$4 : $$0.f()) {
         if ($$4 != jf.a) {
            dtb $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.a($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
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
   protected dsk a(dsk $$0, dke $$1) {
      switch ($$1) {
         case b:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         case c:
            return $$0.a(d, $$0.c(f)).a(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dtb a(jf $$0) {
      return g.get($$0);
   }
}
