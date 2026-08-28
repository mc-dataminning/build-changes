import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dob extends dff {
   public static final MapCodec<dob> a = b(dob::new);
   public static final dsy b = dkt.f;
   public static final dsy c = dkt.b;
   public static final dsy d = dkt.c;
   public static final dsy e = dkt.d;
   public static final dsy f = dkt.e;
   public static final Map<jf, dsy> g = dkt.h.entrySet().stream().filter($$0 -> $$0.getKey() != jf.a).collect(ac.a());
   protected static final float h = 1.0F;
   private static final ews i = dff.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ews j = dff.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ews k = dff.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ews l = dff.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ews m = dff.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dsh, ews> n;

   @Override
   public MapCodec<dob> a() {
      return a;
   }

   public dob(dsg.d $$0) {
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
      this.n = ImmutableMap.copyOf(this.E.a().stream().collect(Collectors.toMap(Function.identity(), dob::m)));
   }

   private static ews m(dsh $$0) {
      ews $$1 = ewp.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = ewp.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = ewp.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = ewp.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = ewp.a($$1, j);
      }

      return $$1.c() ? ewp.b() : $$1;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return this.n.get($$0);
   }

   @Override
   protected boolean a_(dsh $$0, dbj $$1, ja $$2) {
      return true;
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      return this.n(this.i($$0, $$1, $$2));
   }

   private boolean n(dsh $$0) {
      return this.o($$0) > 0;
   }

   private int o(dsh $$0) {
      int $$1 = 0;

      for (dsy $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(dbj $$0, ja $$1, jf $$2) {
      if ($$2 == jf.a) {
         return false;
      } else {
         ja $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == jf.a.b) {
            return false;
         } else {
            dsy $$4 = g.get($$2);
            dsh $$5 = $$0.a_($$1.c());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(dbj $$0, ja $$1, jf $$2) {
      return dkf.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dsh i(dsh $$0, dbj $$1, ja $$2) {
      ja $$3 = $$2.c();
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(a($$1, $$3, jf.a)));
      }

      dsh $$4 = null;

      for (jf $$5 : jf.c.a) {
         dsy $$6 = a($$5);
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
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$1 == jf.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         dsh $$6 = this.i($$0, $$3, $$4);
         return !this.n($$6) ? dfh.a.o() : $$6;
      }
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if ($$1.ab().b(dbz.X)) {
         if ($$3.a(4) == 0) {
            jf $$4 = jf.b($$3);
            ja $$5 = $$2.c();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  ja $$6 = $$2.a($$4);
                  dsh $$7 = $$1.a_($$6);
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

                     dsh $$15 = $$0;

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
                  dsh $$18 = $$1.a_($$17);
                  if ($$18.i() || $$18.a(this)) {
                     dsh $$19 = $$18.i() ? this.o() : $$18;
                     dsh $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.p($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dsh a(dsh $$0, dsh $$1, aym $$2) {
      for (jf $$3 : jf.c.a) {
         if ($$2.h()) {
            dsy $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.a($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean p(dsh $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(dbj $$0, ja $$1) {
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
   protected boolean a(dsh $$0, cxk $$1) {
      dsh $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.o($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      dsh $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dsh $$3 = $$2 ? $$1 : this.o();

      for (jf $$4 : $$0.f()) {
         if ($$4 != jf.a) {
            dsy $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.a($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
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
   protected dsh a(dsh $$0, dkc $$1) {
      switch ($$1) {
         case b:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         case c:
            return $$0.a(d, $$0.c(f)).a(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dsy a(jf $$0) {
      return g.get($$0);
   }
}
