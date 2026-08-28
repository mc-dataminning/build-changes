import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface djn extends dkl {
   int g = 16;

   @Nullable
   dyo c_(iw var1);

   default <T extends dyo> Optional<T> a(iw $$0, dyq<T> $$1) {
      dyo $$2 = this.c_($$0);
      return $$2 != null && $$2.p() == $$1 ? Optional.of((T)$$2) : Optional.empty();
   }

   ebq a_(iw var1);

   eya b_(iw var1);

   default int i(iw $$0) {
      return this.a_($$0).k();
   }

   default Stream<ebq> a(ffx $$0) {
      return iw.b($$0).map(this::a_);
   }

   default ffy a(djp $$0) {
      return a($$0.b(), $$0.a(), $$0, ($$0x, $$1) -> {
         ebq $$2 = this.a_($$1);
         fgc $$3 = $$0x.b().d($$0x.a());
         return $$0x.c().test($$2) ? new ffy($$0x.a(), jc.a($$3.d, $$3.e, $$3.f), iw.a((jq)$$0x.a()), false) : null;
      }, $$0x -> {
         fgc $$1 = $$0x.b().d($$0x.a());
         return ffy.a($$0x.a(), jc.a($$1.d, $$1.e, $$1.f), iw.a((jq)$$0x.a()));
      });
   }

   default ffy a(djq $$0) {
      return a($$0.b(), $$0.a(), $$0, ($$0x, $$1) -> {
         ebq $$2 = this.a_($$1);
         eya $$3 = this.b_($$1);
         fgc $$4 = $$0x.b();
         fgc $$5 = $$0x.a();
         fgw $$6 = $$0x.a($$2, this, $$1);
         ffy $$7 = this.a($$4, $$5, $$1, $$6, $$2);
         fgw $$8 = $$0x.a($$3, this, $$1);
         ffy $$9 = $$8.a($$4, $$5, $$1);
         double $$10 = $$7 == null ? Double.MAX_VALUE : $$0x.b().g($$7.g());
         double $$11 = $$9 == null ? Double.MAX_VALUE : $$0x.b().g($$9.g());
         return $$10 <= $$11 ? $$7 : $$9;
      }, $$0x -> {
         fgc $$1 = $$0x.b().d($$0x.a());
         return ffy.a($$0x.a(), jc.a($$1.d, $$1.e, $$1.f), iw.a((jq)$$0x.a()));
      });
   }

   @Nullable
   default ffy a(fgc $$0, fgc $$1, iw $$2, fgw $$3, ebq $$4) {
      ffy $$5 = $$3.a($$0, $$1, $$2);
      if ($$5 != null) {
         ffy $$6 = $$4.i(this, $$2).a($$0, $$1, $$2);
         if ($$6 != null && $$6.g().d($$0).h() < $$5.g().d($$0).h()) {
            return $$5.a($$6.c());
         }
      }

      return $$5;
   }

   default double a(fgw $$0, Supplier<fgw> $$1) {
      if (!$$0.c()) {
         return $$0.c(jc.a.b);
      } else {
         double $$2 = $$1.get().c(jc.a.b);
         return $$2 >= 1.0 ? $$2 - 1.0 : Double.NEGATIVE_INFINITY;
      }
   }

   default double j(iw $$0) {
      return this.a(this.a_($$0).g(this, $$0), () -> {
         iw $$1 = $$0.e();
         return this.a_($$1).g(this, $$1);
      });
   }

   static <T, C> T a(fgc $$0, fgc $$1, C $$2, BiFunction<C, iw, T> $$3, Function<C, T> $$4) {
      if ($$0.equals($$1)) {
         return $$4.apply($$2);
      } else {
         double $$5 = azz.d(-1.0E-7, $$1.d, $$0.d);
         double $$6 = azz.d(-1.0E-7, $$1.e, $$0.e);
         double $$7 = azz.d(-1.0E-7, $$1.f, $$0.f);
         double $$8 = azz.d(-1.0E-7, $$0.d, $$1.d);
         double $$9 = azz.d(-1.0E-7, $$0.e, $$1.e);
         double $$10 = azz.d(-1.0E-7, $$0.f, $$1.f);
         int $$11 = azz.a($$8);
         int $$12 = azz.a($$9);
         int $$13 = azz.a($$10);
         iw.a $$14 = new iw.a($$11, $$12, $$13);
         T $$15 = $$3.apply($$2, $$14);
         if ($$15 != null) {
            return $$15;
         } else {
            double $$16 = $$5 - $$8;
            double $$17 = $$6 - $$9;
            double $$18 = $$7 - $$10;
            int $$19 = azz.j($$16);
            int $$20 = azz.j($$17);
            int $$21 = azz.j($$18);
            double $$22 = $$19 == 0 ? Double.MAX_VALUE : (double)$$19 / $$16;
            double $$23 = $$20 == 0 ? Double.MAX_VALUE : (double)$$20 / $$17;
            double $$24 = $$21 == 0 ? Double.MAX_VALUE : (double)$$21 / $$18;
            double $$25 = $$22 * ($$19 > 0 ? 1.0 - azz.e($$8) : azz.e($$8));
            double $$26 = $$23 * ($$20 > 0 ? 1.0 - azz.e($$9) : azz.e($$9));
            double $$27 = $$24 * ($$21 > 0 ? 1.0 - azz.e($$10) : azz.e($$10));

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

   static void a(fgc $$0, fgc $$1, ffx $$2, djn.a $$3) {
      fgc $$4 = $$1.d($$0);
      if (!($$4.h() < (double)azz.l(0.99999F))) {
         LongSet $$6 = new LongOpenHashSet();
         fgc $$7 = $$2.h();
         fgc $$8 = $$7.d($$4);
         int $$9 = a($$6, $$8, $$7, $$2, $$3);

         for (iw $$10 : iw.a($$2)) {
            if (!$$6.contains($$10.a())) {
               $$3.visit($$10, $$9 + 1);
            }
         }
      } else {
         for (iw $$5 : iw.a($$2)) {
            $$3.visit($$5, 0);
         }
      }
   }

   private static int a(LongSet $$0, fgc $$1, fgc $$2, ffx $$3, djn.a $$4) {
      fgc $$5 = $$2.d($$1);
      int $$6 = azz.a($$1.d);
      int $$7 = azz.a($$1.e);
      int $$8 = azz.a($$1.f);
      int $$9 = azz.j($$5.d);
      int $$10 = azz.j($$5.e);
      int $$11 = azz.j($$5.f);
      double $$12 = $$9 == 0 ? Double.MAX_VALUE : (double)$$9 / $$5.d;
      double $$13 = $$10 == 0 ? Double.MAX_VALUE : (double)$$10 / $$5.e;
      double $$14 = $$11 == 0 ? Double.MAX_VALUE : (double)$$11 / $$5.f;
      double $$15 = $$12 * ($$9 > 0 ? 1.0 - azz.e($$1.d) : azz.e($$1.d));
      double $$16 = $$13 * ($$10 > 0 ? 1.0 - azz.e($$1.e) : azz.e($$1.e));
      double $$17 = $$14 * ($$11 > 0 ? 1.0 - azz.e($$1.f) : azz.e($$1.f));
      int $$18 = 0;
      iw.a $$19 = new iw.a();

      while ($$15 <= 1.0 || $$16 <= 1.0 || $$17 <= 1.0) {
         if ($$15 < $$16) {
            if ($$15 < $$17) {
               $$6 += $$9;
               $$15 += $$12;
            } else {
               $$8 += $$11;
               $$17 += $$14;
            }
         } else if ($$16 < $$17) {
            $$7 += $$10;
            $$16 += $$13;
         } else {
            $$8 += $$11;
            $$17 += $$14;
         }

         if ($$18++ > 16) {
            break;
         }

         Optional<fgc> $$20 = ffx.a((double)$$6, (double)$$7, (double)$$8, (double)($$6 + 1), (double)($$7 + 1), (double)($$8 + 1), $$1, $$2);
         if (!$$20.isEmpty()) {
            fgc $$21 = $$20.get();
            double $$22 = azz.a($$21.d, (double)$$6 + 1.0E-5F, (double)$$6 + 1.0 - 1.0E-5F);
            double $$23 = azz.a($$21.e, (double)$$7 + 1.0E-5F, (double)$$7 + 1.0 - 1.0E-5F);
            double $$24 = azz.a($$21.f, (double)$$8 + 1.0E-5F, (double)$$8 + 1.0 - 1.0E-5F);
            int $$25 = azz.a($$22 + $$3.b());
            int $$26 = azz.a($$23 + $$3.c());
            int $$27 = azz.a($$24 + $$3.d());

            for (int $$28 = $$6; $$28 <= $$25; $$28++) {
               for (int $$29 = $$7; $$29 <= $$26; $$29++) {
                  for (int $$30 = $$8; $$30 <= $$27; $$30++) {
                     if ($$0.add(iw.a($$28, $$29, $$30))) {
                        $$4.visit($$19.d($$28, $$29, $$30), $$18);
                     }
                  }
               }
            }
         }
      }

      return $$18;
   }

   @FunctionalInterface
   public interface a {
      void visit(iw var1, int var2);
   }
}
