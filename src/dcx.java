import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface dcx extends ddu {
   @Nullable
   dre c_(je var1);

   default <T extends dre> Optional<T> a(je $$0, drg<T> $$1) {
      dre $$2 = this.c_($$0);
      return $$2 != null && $$2.q() == $$1 ? Optional.of((T)$$2) : Optional.empty();
   }

   dua a_(je var1);

   eqb b_(je var1);

   default int i(je $$0) {
      return this.a_($$0).k();
   }

   default Stream<dua> a(exz $$0) {
      return je.b($$0).map(this::a_);
   }

   default eya a(dcz $$0) {
      return a($$0.b(), $$0.a(), $$0, ($$0x, $$1) -> {
         dua $$2 = this.a_($$1);
         eye $$3 = $$0x.b().d($$0x.a());
         return $$0x.c().test($$2) ? new eya($$0x.a(), jj.a($$3.d, $$3.e, $$3.f), je.a((jx)$$0x.a()), false) : null;
      }, $$0x -> {
         eye $$1 = $$0x.b().d($$0x.a());
         return eya.a($$0x.a(), jj.a($$1.d, $$1.e, $$1.f), je.a((jx)$$0x.a()));
      });
   }

   default eya a(dda $$0) {
      return a($$0.b(), $$0.a(), $$0, ($$0x, $$1) -> {
         dua $$2 = this.a_($$1);
         eqb $$3 = this.b_($$1);
         eye $$4 = $$0x.b();
         eye $$5 = $$0x.a();
         eyx $$6 = $$0x.a($$2, this, $$1);
         eya $$7 = this.a($$4, $$5, $$1, $$6, $$2);
         eyx $$8 = $$0x.a($$3, this, $$1);
         eya $$9 = $$8.a($$4, $$5, $$1);
         double $$10 = $$7 == null ? Double.MAX_VALUE : $$0x.b().g($$7.e());
         double $$11 = $$9 == null ? Double.MAX_VALUE : $$0x.b().g($$9.e());
         return $$10 <= $$11 ? $$7 : $$9;
      }, $$0x -> {
         eye $$1 = $$0x.b().d($$0x.a());
         return eya.a($$0x.a(), jj.a($$1.d, $$1.e, $$1.f), je.a((jx)$$0x.a()));
      });
   }

   @Nullable
   default eya a(eye $$0, eye $$1, je $$2, eyx $$3, dua $$4) {
      eya $$5 = $$3.a($$0, $$1, $$2);
      if ($$5 != null) {
         eya $$6 = $$4.i(this, $$2).a($$0, $$1, $$2);
         if ($$6 != null && $$6.e().d($$0).h() < $$5.e().d($$0).h()) {
            return $$5.a($$6.b());
         }
      }

      return $$5;
   }

   default double a(eyx $$0, Supplier<eyx> $$1) {
      if (!$$0.c()) {
         return $$0.c(jj.a.b);
      } else {
         double $$2 = $$1.get().c(jj.a.b);
         return $$2 >= 1.0 ? $$2 - 1.0 : Double.NEGATIVE_INFINITY;
      }
   }

   default double j(je $$0) {
      return this.a(this.a_($$0).g(this, $$0), () -> {
         je $$1 = $$0.e();
         return this.a_($$1).g(this, $$1);
      });
   }

   static <T, C> T a(eye $$0, eye $$1, C $$2, BiFunction<C, je, T> $$3, Function<C, T> $$4) {
      if ($$0.equals($$1)) {
         return $$4.apply($$2);
      } else {
         double $$5 = azc.d(-1.0E-7, $$1.d, $$0.d);
         double $$6 = azc.d(-1.0E-7, $$1.e, $$0.e);
         double $$7 = azc.d(-1.0E-7, $$1.f, $$0.f);
         double $$8 = azc.d(-1.0E-7, $$0.d, $$1.d);
         double $$9 = azc.d(-1.0E-7, $$0.e, $$1.e);
         double $$10 = azc.d(-1.0E-7, $$0.f, $$1.f);
         int $$11 = azc.a($$8);
         int $$12 = azc.a($$9);
         int $$13 = azc.a($$10);
         je.a $$14 = new je.a($$11, $$12, $$13);
         T $$15 = $$3.apply($$2, $$14);
         if ($$15 != null) {
            return $$15;
         } else {
            double $$16 = $$5 - $$8;
            double $$17 = $$6 - $$9;
            double $$18 = $$7 - $$10;
            int $$19 = azc.j($$16);
            int $$20 = azc.j($$17);
            int $$21 = azc.j($$18);
            double $$22 = $$19 == 0 ? Double.MAX_VALUE : (double)$$19 / $$16;
            double $$23 = $$20 == 0 ? Double.MAX_VALUE : (double)$$20 / $$17;
            double $$24 = $$21 == 0 ? Double.MAX_VALUE : (double)$$21 / $$18;
            double $$25 = $$22 * ($$19 > 0 ? 1.0 - azc.e($$8) : azc.e($$8));
            double $$26 = $$23 * ($$20 > 0 ? 1.0 - azc.e($$9) : azc.e($$9));
            double $$27 = $$24 * ($$21 > 0 ? 1.0 - azc.e($$10) : azc.e($$10));

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

   static Iterable<je> a(eye $$0, eye $$1, exz $$2) {
      exz $$3 = $$2.g(1.0E-5F);
      eye $$4 = $$1.d($$0);
      Iterable<je> $$5 = je.a($$3);
      if ($$4.h() < (double)azc.k(0.99999F)) {
         return $$5;
      } else {
         Set<je> $$6 = new ObjectOpenHashSet();

         for (je $$7 : $$5) {
            $$6.add($$7.j());
         }

         eye $$8 = $$4.d().c(1.0E-7);
         eye $$9 = $$2.g().e($$8);
         eye $$10 = $$2.g().d($$4).d($$8);
         a($$6, $$10, $$9, $$3);
         return $$6;
      }
   }

   private static void a(Set<je> $$0, eye $$1, eye $$2, exz $$3) {
      eye $$4 = $$2.d($$1);
      int $$5 = azc.a($$1.d);
      int $$6 = azc.a($$1.e);
      int $$7 = azc.a($$1.f);
      int $$8 = azc.j($$4.d);
      int $$9 = azc.j($$4.e);
      int $$10 = azc.j($$4.f);
      double $$11 = $$8 == 0 ? Double.MAX_VALUE : (double)$$8 / $$4.d;
      double $$12 = $$9 == 0 ? Double.MAX_VALUE : (double)$$9 / $$4.e;
      double $$13 = $$10 == 0 ? Double.MAX_VALUE : (double)$$10 / $$4.f;
      double $$14 = $$11 * ($$8 > 0 ? 1.0 - azc.e($$1.d) : azc.e($$1.d));
      double $$15 = $$12 * ($$9 > 0 ? 1.0 - azc.e($$1.e) : azc.e($$1.e));
      double $$16 = $$13 * ($$10 > 0 ? 1.0 - azc.e($$1.f) : azc.e($$1.f));

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

         Optional<eye> $$17 = exz.a((double)$$5, (double)$$6, (double)$$7, (double)($$5 + 1), (double)($$6 + 1), (double)($$7 + 1), $$1, $$2);
         if (!$$17.isEmpty()) {
            eye $$18 = $$17.get();
            double $$19 = azc.a($$18.d, (double)$$5 + 1.0E-5F, (double)$$5 + 1.0 - 1.0E-5F);
            double $$20 = azc.a($$18.e, (double)$$6 + 1.0E-5F, (double)$$6 + 1.0 - 1.0E-5F);
            double $$21 = azc.a($$18.f, (double)$$7 + 1.0E-5F, (double)$$7 + 1.0 - 1.0E-5F);
            int $$22 = azc.a($$19 + $$3.b());
            int $$23 = azc.a($$20 + $$3.c());
            int $$24 = azc.a($$21 + $$3.d());

            for (int $$25 = $$5; $$25 <= $$22; $$25++) {
               for (int $$26 = $$6; $$26 <= $$23; $$26++) {
                  for (int $$27 = $$7; $$27 <= $$24; $$27++) {
                     $$0.add(new je($$25, $$26, $$27));
                  }
               }
            }
         }
      }
   }
}
