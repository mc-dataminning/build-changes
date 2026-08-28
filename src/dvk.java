import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dvk extends dma {
   public static final MapCodec<dvk> a = b(dvk::new);
   public static final eaq b = drt.f;
   public static final eaq c = drt.b;
   public static final eaq d = drt.c;
   public static final eaq e = drt.d;
   public static final eaq f = drt.e;
   public static final Map<ja, eaq> g = drt.h.entrySet().stream().filter($$0 -> $$0.getKey() != ja.a).collect(af.a());
   private final Function<dzz, ffc> h;

   @Override
   public MapCodec<dvk> a() {
      return a;
   }

   public dvk(dzy.d $$0) {
      super($$0);
      this.l(
         this.B
            .b()
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
      );
      this.h = this.b();
   }

   private Function<dzz, ffc> b() {
      Map<ja, ffc> $$0 = fez.d(dma.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         ffc $$2 = fez.a();

         for (Entry<ja, eaq> $$3 : g.entrySet()) {
            if ($$1.c($$3.getValue())) {
               $$2 = fez.a($$2, $$0.get($$3.getKey()));
            }
         }

         return $$2.c() ? fez.b() : $$2;
      });
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected boolean e_(dzz $$0) {
      return true;
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return this.o(this.e($$0, $$1, $$2));
   }

   private boolean o(dzz $$0) {
      return this.q($$0) > 0;
   }

   private int q(dzz $$0) {
      int $$1 = 0;

      for (eaq $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(dib $$0, iu $$1, ja $$2) {
      if ($$2 == ja.a) {
         return false;
      } else {
         iu $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == ja.a.b) {
            return false;
         } else {
            eaq $$4 = g.get($$2);
            dzz $$5 = $$0.a_($$1.d());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(dib $$0, iu $$1, ja $$2) {
      return drf.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dzz e(dzz $$0, dib $$1, iu $$2) {
      iu $$3 = $$2.d();
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(a($$1, $$3, ja.a)));
      }

      dzz $$4 = null;

      for (ja $$5 : ja.c.a) {
         eaq $$6 = a($$5);
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
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$4 == ja.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         dzz $$8 = this.e($$0, $$1, $$3);
         return !this.o($$8) ? dmc.a.m() : $$8;
      }
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if ($$1.O().c(dir.Y)) {
         if ($$3.a(4) == 0) {
            ja $$4 = ja.b($$3);
            iu $$5 = $$2.d();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  iu $$6 = $$2.a($$4);
                  dzz $$7 = $$1.a_($$6);
                  if ($$7.l()) {
                     ja $$8 = $$4.h();
                     ja $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     iu $$12 = $$6.a($$8);
                     iu $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.m().b(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.m().b(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        ja $$14 = $$4.g();
                        if ($$10 && $$1.v($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.m().b(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.v($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.m().b(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.d(), ja.b)) {
                           $$1.a($$6, this.m().b(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.b(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == ja.b && $$2.v() < $$1.ao()) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.v($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dzz $$15 = $$0;

                     for (ja $$16 : ja.c.a) {
                        if ($$3.h() || !a($$1, $$5.a($$16), $$16)) {
                           $$15 = $$15.b(a($$16), Boolean.valueOf(false));
                        }
                     }

                     if (this.r($$15)) {
                        $$1.a($$5, $$15, 2);
                     }

                     return;
                  }
               }

               if ($$2.v() > $$1.G_()) {
                  iu $$17 = $$2.e();
                  dzz $$18 = $$1.a_($$17);
                  if ($$18.l() || $$18.a(this)) {
                     dzz $$19 = $$18.l() ? this.m() : $$18;
                     dzz $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.r($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dzz a(dzz $$0, dzz $$1, azv $$2) {
      for (ja $$3 : ja.c.a) {
         if ($$2.h()) {
            eaq $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.b($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean r(dzz $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(dib $$0, iu $$1) {
      int $$2 = 4;
      Iterable<iu> $$3 = iu.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (iu $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected boolean a(dzz $$0, dcr $$1) {
      dzz $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.q($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      dzz $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dzz $$3 = $$2 ? $$1 : this.m();

      for (ja $$4 : $$0.f()) {
         if ($$4 != ja.a) {
            eaq $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.b($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
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
   protected dzz a(dzz $$0, drc $$1) {
      switch ($$1) {
         case b:
            return $$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c:
            return $$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static eaq a(ja $$0) {
      return g.get($$0);
   }
}
