import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dnq extends deu {
   public static final MapCodec<dnq> a = b(dnq::new);
   public static final dso b = dki.f;
   public static final dso c = dki.b;
   public static final dso d = dki.c;
   public static final dso e = dki.d;
   public static final dso f = dki.e;
   public static final Map<je, dso> g = dki.h.entrySet().stream().filter($$0 -> $$0.getKey() != je.a).collect(ac.a());
   protected static final float h = 1.0F;
   private static final ewf i = deu.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewf j = deu.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ewf k = deu.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewf l = deu.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ewf m = deu.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<drx, ewf> n;

   @Override
   public MapCodec<dnq> a() {
      return a;
   }

   public dnq(drw.d $$0) {
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
      this.n = ImmutableMap.copyOf(this.E.a().stream().collect(Collectors.toMap(Function.identity(), dnq::m)));
   }

   private static ewf m(drx $$0) {
      ewf $$1 = ewc.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = ewc.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = ewc.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = ewc.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = ewc.a($$1, j);
      }

      return $$1.c() ? ewc.b() : $$1;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return this.n.get($$0);
   }

   @Override
   protected boolean a_(drx $$0, daz $$1, iz $$2) {
      return true;
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      return this.n(this.i($$0, $$1, $$2));
   }

   private boolean n(drx $$0) {
      return this.o($$0) > 0;
   }

   private int o(drx $$0) {
      int $$1 = 0;

      for (dso $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(daz $$0, iz $$1, je $$2) {
      if ($$2 == je.a) {
         return false;
      } else {
         iz $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == je.a.b) {
            return false;
         } else {
            dso $$4 = g.get($$2);
            drx $$5 = $$0.a_($$1.c());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(daz $$0, iz $$1, je $$2) {
      return dju.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private drx i(drx $$0, daz $$1, iz $$2) {
      iz $$3 = $$2.c();
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(a($$1, $$3, je.a)));
      }

      drx $$4 = null;

      for (je $$5 : je.c.a) {
         dso $$6 = a($$5);
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
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$1 == je.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         drx $$6 = this.i($$0, $$3, $$4);
         return !this.n($$6) ? dew.a.n() : $$6;
      }
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$1.ab().b(dbp.X)) {
         if ($$3.a(4) == 0) {
            je $$4 = je.b($$3);
            iz $$5 = $$2.c();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  iz $$6 = $$2.a($$4);
                  drx $$7 = $$1.a_($$6);
                  if ($$7.i()) {
                     je $$8 = $$4.h();
                     je $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     iz $$12 = $$6.a($$8);
                     iz $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.n().a(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.n().a(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        je $$14 = $$4.g();
                        if ($$10 && $$1.u($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.n().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.u($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.n().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.c(), je.b)) {
                           $$1.a($$6, this.n().a(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.a(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == je.b && $$2.v() < $$1.am() - 1) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.u($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     drx $$15 = $$0;

                     for (je $$16 : je.c.a) {
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
                  iz $$17 = $$2.d();
                  drx $$18 = $$1.a_($$17);
                  if ($$18.i() || $$18.a(this)) {
                     drx $$19 = $$18.i() ? this.n() : $$18;
                     drx $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.p($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private drx a(drx $$0, drx $$1, azc $$2) {
      for (je $$3 : je.c.a) {
         if ($$2.h()) {
            dso $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.a($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean p(drx $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(daz $$0, iz $$1) {
      int $$2 = 4;
      Iterable<iz> $$3 = iz.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (iz $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected boolean a(drx $$0, cxv $$1) {
      drx $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.o($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      drx $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      drx $$3 = $$2 ? $$1 : this.n();

      for (je $$4 : $$0.f()) {
         if ($$4 != je.a) {
            dso $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.a($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
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
   protected drx a(drx $$0, djr $$1) {
      switch ($$1) {
         case b:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         case c:
            return $$0.a(d, $$0.c(f)).a(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dso a(je $$0) {
      return g.get($$0);
   }
}
