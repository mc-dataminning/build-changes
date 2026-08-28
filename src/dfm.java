import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface dfm extends dgj {
   int g = 16;

   @Nullable
   dty c_(ji var1);

   default <T extends dty> Optional<T> a(ji $$0, dua<T> $$1) {
      dty $$2 = this.c_($$0);
      return $$2 != null && $$2.p() == $$1 ? Optional.of((T)$$2) : Optional.empty();
   }

   dww a_(ji var1);

   esy b_(ji var1);

   default int i(ji $$0) {
      return this.a_($$0).k();
   }

   default Stream<dww> a(fau $$0) {
      return ji.b($$0).map(this::a_);
   }

   default fav a(dfo $$0) {
      return a($$0.b(), $$0.a(), $$0, ($$0x, $$1) -> {
         dww $$2 = this.a_($$1);
         faz $$3 = $$0x.b().d($$0x.a());
         return $$0x.c().test($$2) ? new fav($$0x.a(), jn.a($$3.d, $$3.e, $$3.f), ji.a((kb)$$0x.a()), false) : null;
      }, $$0x -> {
         faz $$1 = $$0x.b().d($$0x.a());
         return fav.a($$0x.a(), jn.a($$1.d, $$1.e, $$1.f), ji.a((kb)$$0x.a()));
      });
   }

   default fav a(dfp $$0) {
      return a($$0.b(), $$0.a(), $$0, ($$0x, $$1) -> {
         dww $$2 = this.a_($$1);
         esy $$3 = this.b_($$1);
         faz $$4 = $$0x.b();
         faz $$5 = $$0x.a();
         fbt $$6 = $$0x.a($$2, this, $$1);
         fav $$7 = this.a($$4, $$5, $$1, $$6, $$2);
         fbt $$8 = $$0x.a($$3, this, $$1);
         fav $$9 = $$8.a($$4, $$5, $$1);
         double $$10 = $$7 == null ? Double.MAX_VALUE : $$0x.b().g($$7.g());
         double $$11 = $$9 == null ? Double.MAX_VALUE : $$0x.b().g($$9.g());
         return $$10 <= $$11 ? $$7 : $$9;
      }, $$0x -> {
         faz $$1 = $$0x.b().d($$0x.a());
         return fav.a($$0x.a(), jn.a($$1.d, $$1.e, $$1.f), ji.a((kb)$$0x.a()));
      });
   }

   @Nullable
   default fav a(faz $$0, faz $$1, ji $$2, fbt $$3, dww $$4) {
      fav $$5 = $$3.a($$0, $$1, $$2);
      if ($$5 != null) {
         fav $$6 = $$4.i(this, $$2).a($$0, $$1, $$2);
         if ($$6 != null && $$6.g().d($$0).h() < $$5.g().d($$0).h()) {
            return $$5.a($$6.c());
         }
      }

      return $$5;
   }

   default double a(fbt $$0, Supplier<fbt> $$1) {
      if (!$$0.c()) {
         return $$0.c(jn.a.b);
      } else {
         double $$2 = $$1.get().c(jn.a.b);
         return $$2 >= 1.0 ? $$2 - 1.0 : Double.NEGATIVE_INFINITY;
      }
   }

   default double j(ji $$0) {
      return this.a(this.a_($$0).g(this, $$0), () -> {
         ji $$1 = $$0.e();
         return this.a_($$1).g(this, $$1);
      });
   }

   static <T, C> T a(faz $$0, faz $$1, C $$2, BiFunction<C, ji, T> $$3, Function<C, T> $$4) {
      if ($$0.equals($$1)) {
         return $$4.apply($$2);
      } else {
         double $$5 = ayz.d(-1.0E-7, $$1.d, $$0.d);
         double $$6 = ayz.d(-1.0E-7, $$1.e, $$0.e);
         double $$7 = ayz.d(-1.0E-7, $$1.f, $$0.f);
         double $$8 = ayz.d(-1.0E-7, $$0.d, $$1.d);
         double $$9 = ayz.d(-1.0E-7, $$0.e, $$1.e);
         double $$10 = ayz.d(-1.0E-7, $$0.f, $$1.f);
         int $$11 = ayz.a($$8);
         int $$12 = ayz.a($$9);
         int $$13 = ayz.a($$10);
         ji.a $$14 = new ji.a($$11, $$12, $$13);
         T $$15 = $$3.apply($$2, $$14);
         if ($$15 != null) {
            return $$15;
         } else {
            double $$16 = $$5 - $$8;
            double $$17 = $$6 - $$9;
            double $$18 = $$7 - $$10;
            int $$19 = ayz.j($$16);
            int $$20 = ayz.j($$17);
            int $$21 = ayz.j($$18);
            double $$22 = $$19 == 0 ? Double.MAX_VALUE : (double)$$19 / $$16;
            double $$23 = $$20 == 0 ? Double.MAX_VALUE : (double)$$20 / $$17;
            double $$24 = $$21 == 0 ? Double.MAX_VALUE : (double)$$21 / $$18;
            double $$25 = $$22 * ($$19 > 0 ? 1.0 - ayz.e($$8) : ayz.e($$8));
            double $$26 = $$23 * ($$20 > 0 ? 1.0 - ayz.e($$9) : ayz.e($$9));
            double $$27 = $$24 * ($$21 > 0 ? 1.0 - ayz.e($$10) : ayz.e($$10));

            while ($$25 <= 1.0 || $$26 <= 1.0 || $$27 <= 1.0) {
               if ($$25 < $$26) {
                  if ($$25 < $$27) {
                     $$11 += $$19;
                     $$25 += $$22;
                  } else {
                     $$13 += $$21;
                     $$27 += $$24;
                  }
               } else if ($$26 < $$27) {
                  $$12 += $$20;
                  $$26 += $$23;
               } else {
                  $$13 += $$21;
                  $$27 += $$24;
               }

               T $$28 = $$3.apply($$2, $$14.d($$11, $$12, $$13));
               if ($$28 != null) {
                  return $$28;
               }
            }

            return $$4.apply($$2);
         }
      }
   }

   static Iterable<ji> a(faz $$0, faz $$1, fau $$2) {
      faz $$3 = $$1.d($$0);
      Iterable<ji> $$4 = ji.a($$2);
      if ($$3.h() < (double)ayz.l(0.99999F)) {
         return $$4;
      } else {
         Set<ji> $$5 = new ObjectLinkedOpenHashSet();
         faz $$6 = $$2.h();
         faz $$7 = $$6.d($$3);
         a($$5, $$7, $$6, $$2);

         for (ji $$8 : $$4) {
            $$5.add($$8.j());
         }

         return $$5;
      }
   }

   private static void a(Set<ji> $$0, faz $$1, faz $$2, fau $$3) {
      faz $$4 = $$2.d($$1);
      int $$5 = ayz.a($$1.d);
      int $$6 = ayz.a($$1.e);
      int $$7 = ayz.a($$1.f);
      int $$8 = ayz.j($$4.d);
      int $$9 = ayz.j($$4.e);
      int $$10 = ayz.j($$4.f);
      double $$11 = $$8 == 0 ? Double.MAX_VALUE : (double)$$8 / $$4.d;
      double $$12 = $$9 == 0 ? Double.MAX_VALUE : (double)$$9 / $$4.e;
      double $$13 = $$10 == 0 ? Double.MAX_VALUE : (double)$$10 / $$4.f;
      double $$14 = $$11 * ($$8 > 0 ? 1.0 - ayz.e($$1.d) : ayz.e($$1.d));
      double $$15 = $$12 * ($$9 > 0 ? 1.0 - ayz.e($$1.e) : ayz.e($$1.e));
      double $$16 = $$13 * ($$10 > 0 ? 1.0 - ayz.e($$1.f) : ayz.e($$1.f));
      int $$17 = 0;

      while ($$14 <= 1.0 || $$15 <= 1.0 || $$16 <= 1.0) {
         if ($$14 < $$15) {
            if ($$14 < $$16) {
               $$5 += $$8;
               $$14 += $$11;
            } else {
               $$7 += $$10;
               $$16 += $$13;
            }
         } else if ($$15 < $$16) {
            $$6 += $$9;
            $$15 += $$12;
         } else {
            $$7 += $$10;
            $$16 += $$13;
         }

         if ($$17++ > 16) {
            break;
         }

         Optional<faz> $$18 = fau.a((double)$$5, (double)$$6, (double)$$7, (double)($$5 + 1), (double)($$6 + 1), (double)($$7 + 1), $$1, $$2);
         if (!$$18.isEmpty()) {
            faz $$19 = $$18.get();
            double $$20 = ayz.a($$19.d, (double)$$5 + 1.0E-5F, (double)$$5 + 1.0 - 1.0E-5F);
            double $$21 = ayz.a($$19.e, (double)$$6 + 1.0E-5F, (double)$$6 + 1.0 - 1.0E-5F);
            double $$22 = ayz.a($$19.f, (double)$$7 + 1.0E-5F, (double)$$7 + 1.0 - 1.0E-5F);
            int $$23 = ayz.a($$20 + $$3.b());
            int $$24 = ayz.a($$21 + $$3.c());
            int $$25 = ayz.a($$22 + $$3.d());

            for (int $$26 = $$5; $$26 <= $$23; $$26++) {
               for (int $$27 = $$6; $$27 <= $$24; $$27++) {
                  for (int $$28 = $$7; $$28 <= $$25; $$28++) {
                     $$0.add(new ji($$26, $$27, $$28));
                  }
               }
            }
         }
      }
   }
}
