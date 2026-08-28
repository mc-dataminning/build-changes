import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface dgv extends dhr {
   int g = 16;

   @Nullable
   dvl c_(jj var1);

   default <T extends dvl> Optional<T> a(jj $$0, dvn<T> $$1) {
      dvl $$2 = this.c_($$0);
      return $$2 != null && $$2.p() == $$1 ? Optional.of((T)$$2) : Optional.empty();
   }

   dym a_(jj var1);

   eut b_(jj var1);

   default int i(jj $$0) {
      return this.a_($$0).k();
   }

   default Stream<dym> a(fcp $$0) {
      return jj.b($$0).map(this::a_);
   }

   default fcq a(dgx $$0) {
      return a($$0.b(), $$0.a(), $$0, ($$0x, $$1) -> {
         dym $$2 = this.a_($$1);
         fcu $$3 = $$0x.b().d($$0x.a());
         return $$0x.c().test($$2) ? new fcq($$0x.a(), jo.a($$3.d, $$3.e, $$3.f), jj.a((kc)$$0x.a()), false) : null;
      }, $$0x -> {
         fcu $$1 = $$0x.b().d($$0x.a());
         return fcq.a($$0x.a(), jo.a($$1.d, $$1.e, $$1.f), jj.a((kc)$$0x.a()));
      });
   }

   default fcq a(dgy $$0) {
      return a($$0.b(), $$0.a(), $$0, ($$0x, $$1) -> {
         dym $$2 = this.a_($$1);
         eut $$3 = this.b_($$1);
         fcu $$4 = $$0x.b();
         fcu $$5 = $$0x.a();
         fdo $$6 = $$0x.a($$2, this, $$1);
         fcq $$7 = this.a($$4, $$5, $$1, $$6, $$2);
         fdo $$8 = $$0x.a($$3, this, $$1);
         fcq $$9 = $$8.a($$4, $$5, $$1);
         double $$10 = $$7 == null ? Double.MAX_VALUE : $$0x.b().g($$7.g());
         double $$11 = $$9 == null ? Double.MAX_VALUE : $$0x.b().g($$9.g());
         return $$10 <= $$11 ? $$7 : $$9;
      }, $$0x -> {
         fcu $$1 = $$0x.b().d($$0x.a());
         return fcq.a($$0x.a(), jo.a($$1.d, $$1.e, $$1.f), jj.a((kc)$$0x.a()));
      });
   }

   @Nullable
   default fcq a(fcu $$0, fcu $$1, jj $$2, fdo $$3, dym $$4) {
      fcq $$5 = $$3.a($$0, $$1, $$2);
      if ($$5 != null) {
         fcq $$6 = $$4.i(this, $$2).a($$0, $$1, $$2);
         if ($$6 != null && $$6.g().d($$0).h() < $$5.g().d($$0).h()) {
            return $$5.a($$6.c());
         }
      }

      return $$5;
   }

   default double a(fdo $$0, Supplier<fdo> $$1) {
      if (!$$0.c()) {
         return $$0.c(jo.a.b);
      } else {
         double $$2 = $$1.get().c(jo.a.b);
         return $$2 >= 1.0 ? $$2 - 1.0 : Double.NEGATIVE_INFINITY;
      }
   }

   default double j(jj $$0) {
      return this.a(this.a_($$0).g(this, $$0), () -> {
         jj $$1 = $$0.e();
         return this.a_($$1).g(this, $$1);
      });
   }

   static <T, C> T a(fcu $$0, fcu $$1, C $$2, BiFunction<C, jj, T> $$3, Function<C, T> $$4) {
      if ($$0.equals($$1)) {
         return $$4.apply($$2);
      } else {
         double $$5 = azk.d(-1.0E-7, $$1.d, $$0.d);
         double $$6 = azk.d(-1.0E-7, $$1.e, $$0.e);
         double $$7 = azk.d(-1.0E-7, $$1.f, $$0.f);
         double $$8 = azk.d(-1.0E-7, $$0.d, $$1.d);
         double $$9 = azk.d(-1.0E-7, $$0.e, $$1.e);
         double $$10 = azk.d(-1.0E-7, $$0.f, $$1.f);
         int $$11 = azk.a($$8);
         int $$12 = azk.a($$9);
         int $$13 = azk.a($$10);
         jj.a $$14 = new jj.a($$11, $$12, $$13);
         T $$15 = $$3.apply($$2, $$14);
         if ($$15 != null) {
            return $$15;
         } else {
            double $$16 = $$5 - $$8;
            double $$17 = $$6 - $$9;
            double $$18 = $$7 - $$10;
            int $$19 = azk.j($$16);
            int $$20 = azk.j($$17);
            int $$21 = azk.j($$18);
            double $$22 = $$19 == 0 ? Double.MAX_VALUE : (double)$$19 / $$16;
            double $$23 = $$20 == 0 ? Double.MAX_VALUE : (double)$$20 / $$17;
            double $$24 = $$21 == 0 ? Double.MAX_VALUE : (double)$$21 / $$18;
            double $$25 = $$22 * ($$19 > 0 ? 1.0 - azk.e($$8) : azk.e($$8));
            double $$26 = $$23 * ($$20 > 0 ? 1.0 - azk.e($$9) : azk.e($$9));
            double $$27 = $$24 * ($$21 > 0 ? 1.0 - azk.e($$10) : azk.e($$10));

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

   static Iterable<jj> a(fcu $$0, fcu $$1, fcp $$2) {
      fcu $$3 = $$1.d($$0);
      Iterable<jj> $$4 = jj.a($$2);
      if ($$3.h() < (double)azk.l(0.99999F)) {
         return $$4;
      } else {
         Set<jj> $$5 = new ObjectLinkedOpenHashSet();
         fcu $$6 = $$2.h();
         fcu $$7 = $$6.d($$3);
         a($$5, $$7, $$6, $$2);

         for (jj $$8 : $$4) {
            $$5.add($$8.j());
         }

         return $$5;
      }
   }

   private static void a(Set<jj> $$0, fcu $$1, fcu $$2, fcp $$3) {
      fcu $$4 = $$2.d($$1);
      int $$5 = azk.a($$1.d);
      int $$6 = azk.a($$1.e);
      int $$7 = azk.a($$1.f);
      int $$8 = azk.j($$4.d);
      int $$9 = azk.j($$4.e);
      int $$10 = azk.j($$4.f);
      double $$11 = $$8 == 0 ? Double.MAX_VALUE : (double)$$8 / $$4.d;
      double $$12 = $$9 == 0 ? Double.MAX_VALUE : (double)$$9 / $$4.e;
      double $$13 = $$10 == 0 ? Double.MAX_VALUE : (double)$$10 / $$4.f;
      double $$14 = $$11 * ($$8 > 0 ? 1.0 - azk.e($$1.d) : azk.e($$1.d));
      double $$15 = $$12 * ($$9 > 0 ? 1.0 - azk.e($$1.e) : azk.e($$1.e));
      double $$16 = $$13 * ($$10 > 0 ? 1.0 - azk.e($$1.f) : azk.e($$1.f));
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

         Optional<fcu> $$18 = fcp.a((double)$$5, (double)$$6, (double)$$7, (double)($$5 + 1), (double)($$6 + 1), (double)($$7 + 1), $$1, $$2);
         if (!$$18.isEmpty()) {
            fcu $$19 = $$18.get();
            double $$20 = azk.a($$19.d, (double)$$5 + 1.0E-5F, (double)$$5 + 1.0 - 1.0E-5F);
            double $$21 = azk.a($$19.e, (double)$$6 + 1.0E-5F, (double)$$6 + 1.0 - 1.0E-5F);
            double $$22 = azk.a($$19.f, (double)$$7 + 1.0E-5F, (double)$$7 + 1.0 - 1.0E-5F);
            int $$23 = azk.a($$20 + $$3.b());
            int $$24 = azk.a($$21 + $$3.c());
            int $$25 = azk.a($$22 + $$3.d());

            for (int $$26 = $$5; $$26 <= $$23; $$26++) {
               for (int $$27 = $$6; $$27 <= $$24; $$27++) {
                  for (int $$28 = $$7; $$28 <= $$25; $$28++) {
                     $$0.add(new jj($$26, $$27, $$28));
                  }
               }
            }
         }
      }
   }
}
