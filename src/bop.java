import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.OptionalBox.Mu;
import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Function4;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bop<E extends bjm, M> implements App<bop.c<E>, M> {
   private final bop.e<E, M> a;

   public static <E extends bjm, M> bop<E, M> a(App<bop.c<E>, M> $$0) {
      return (bop<E, M>)$$0;
   }

   public static <E extends bjm> bop.b<E> a() {
      return new bop.b<>();
   }

   public static <E extends bjm> bmn<E> a(Function<bop.b<E>, ? extends App<bop.c<E>, bos<E>>> $$0) {
      final bop.e<E, bos<E>> $$1 = b((App<bop.c<E>, bos<E>>)$$0.apply(a()));
      return new bmn<E>() {
         @Override
         public boolean trigger(akt $$0, E $$1x, long $$2) {
            bos<E> $$3 = $$1.a($$0, $$1, $$2);
            return $$3 == null ? false : $$3.trigger($$0, $$1, $$2);
         }

         @Override
         public String b() {
            return "OneShot[" + $$1.a() + "]";
         }

         @Override
         public String toString() {
            return this.b();
         }
      };
   }

   public static <E extends bjm> bmn<E> a(bos<? super E> $$0, bos<? super E> $$1) {
      return a((Function<bop.b<E>, ? extends App<bop.c<E>, bos<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bjm> bmn<E> a(Predicate<E> $$0, bmn<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bjm> bmn<E> a(Predicate<E> $$0) {
      return a((Function<bop.b<E>, ? extends App<bop.c<E>, bos<E>>>)($$1 -> $$1.a((bos<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bjm> bmn<E> a(BiPredicate<akt, E> $$0) {
      return a((Function<bop.b<E>, ? extends App<bop.c<E>, bos<E>>>)($$1 -> $$1.a((bos<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bjm, M> bop.e<E, M> b(App<bop.c<E>, M> $$0) {
      return a($$0).a;
   }

   bop(bop.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bjm, M> bop<E, M> a(bop.e<E, M> $$0) {
      return new bop<>($$0);
   }

   static final class a<E extends bjm, A> extends bop<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new bop.e<E, A>() {
            @Override
            public A a(akt $$0x, E $$1x, long $$2) {
               return $$0;
            }

            @Override
            public String a() {
               return $$1.get();
            }

            @Override
            public String toString() {
               return this.a();
            }
         });
      }
   }

   public static final class b<E extends bjm> implements Applicative<bop.c<E>, bop.b.a<E>> {
      public <Value> Optional<Value> a(boq<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(boq<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> bop<E, boq<Mu, Value>> a(bsn<Value> $$0) {
         return new bop.d<>(new bor.c<>($$0));
      }

      public <Value> bop<E, boq<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(bsn<Value> $$0) {
         return new bop.d<>(new bor.b<>($$0));
      }

      public <Value> bop<E, boq<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(bsn<Value> $$0) {
         return new bop.d<>(new bor.a<>($$0));
      }

      public bop<E, Unit> a(bos<? super E> $$0) {
         return new bop.f<>($$0);
      }

      public <A> bop<E, A> a(A $$0) {
         return new bop.a<>($$0);
      }

      public <A> bop<E, A> a(Supplier<String> $$0, A $$1) {
         return new bop.a<>($$1, $$0);
      }

      public <A, R> Function<App<bop.c<E>, A>, App<bop.c<E>, R>> lift1(App<bop.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final bop.e<E, A> $$2 = (bop.e<E, A>)bop.b((App<bop.c<E>, M>)$$1);
            final bop.e<E, Function<A, R>> $$3 = bop.b($$0);
            return bop.a(new bop.e<E, R>() {
               @Override
               public R a(akt $$0, E $$1, long $$2x) {
                  A $$3 = (A)$$2.a($$0, $$1, $$2);
                  if ($$3 == null) {
                     return null;
                  } else {
                     Function<A, R> $$4 = (Function<A, R>)$$3.a($$0, $$1, $$2);
                     return (R)($$4 == null ? null : $$4.apply($$3));
                  }
               }

               @Override
               public String a() {
                  return $$3.a() + " * " + $$2.a();
               }

               @Override
               public String toString() {
                  return this.a();
               }
            });
         };
      }

      public <T, R> bop<E, R> a(final Function<? super T, ? extends R> $$0, App<bop.c<E>, T> $$1) {
         final bop.e<E, T> $$2 = (bop.e<E, T>)bop.b((App<bop.c<E>, M>)$$1);
         return bop.a(new bop.e<E, R>() {
            @Override
            public R a(akt $$0x, E $$1, long $$2x) {
               T $$3 = $$2.a($$0, $$1, $$2);
               return (R)($$3 == null ? null : $$0.apply($$3));
            }

            @Override
            public String a() {
               return $$2.a() + ".map[" + $$0 + "]";
            }

            @Override
            public String toString() {
               return this.a();
            }
         });
      }

      public <A, B, R> bop<E, R> a(App<bop.c<E>, BiFunction<A, B, R>> $$0, App<bop.c<E>, A> $$1, App<bop.c<E>, B> $$2) {
         final bop.e<E, A> $$3 = (bop.e<E, A>)bop.b((App<bop.c<E>, M>)$$1);
         final bop.e<E, B> $$4 = (bop.e<E, B>)bop.b((App<bop.c<E>, M>)$$2);
         final bop.e<E, BiFunction<A, B, R>> $$5 = bop.b($$0);
         return bop.a(new bop.e<E, R>() {
            @Override
            public R a(akt $$0, E $$1, long $$2) {
               A $$3 = $$3.a($$0, $$1, $$2);
               if ($$3 == null) {
                  return null;
               } else {
                  B $$4 = $$4.a($$0, $$1, $$2);
                  if ($$4 == null) {
                     return null;
                  } else {
                     BiFunction<A, B, R> $$5 = $$5.a($$0, $$1, $$2);
                     return $$5 == null ? null : $$5.apply($$3, $$4);
                  }
               }
            }

            @Override
            public String a() {
               return $$5.a() + " * " + $$3.a() + " * " + $$4.a();
            }

            @Override
            public String toString() {
               return this.a();
            }
         });
      }

      public <T1, T2, T3, R> bop<E, R> a(App<bop.c<E>, Function3<T1, T2, T3, R>> $$0, App<bop.c<E>, T1> $$1, App<bop.c<E>, T2> $$2, App<bop.c<E>, T3> $$3) {
         final bop.e<E, T1> $$4 = (bop.e<E, T1>)bop.b((App<bop.c<E>, M>)$$1);
         final bop.e<E, T2> $$5 = (bop.e<E, T2>)bop.b((App<bop.c<E>, M>)$$2);
         final bop.e<E, T3> $$6 = (bop.e<E, T3>)bop.b((App<bop.c<E>, M>)$$3);
         final bop.e<E, Function3<T1, T2, T3, R>> $$7 = bop.b($$0);
         return bop.a(new bop.e<E, R>() {
            @Override
            public R a(akt $$0, E $$1, long $$2) {
               T1 $$3 = $$4.a($$0, $$1, $$2);
               if ($$3 == null) {
                  return null;
               } else {
                  T2 $$4 = $$5.a($$0, $$1, $$2);
                  if ($$4 == null) {
                     return null;
                  } else {
                     T3 $$5 = $$6.a($$0, $$1, $$2);
                     if ($$5 == null) {
                        return null;
                     } else {
                        Function3<T1, T2, T3, R> $$6 = $$7.a($$0, $$1, $$2);
                        return (R)($$6 == null ? null : $$6.apply($$3, $$4, $$5));
                     }
                  }
               }
            }

            @Override
            public String a() {
               return $$7.a() + " * " + $$4.a() + " * " + $$5.a() + " * " + $$6.a();
            }

            @Override
            public String toString() {
               return this.a();
            }
         });
      }

      public <T1, T2, T3, T4, R> bop<E, R> a(
         App<bop.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<bop.c<E>, T1> $$1, App<bop.c<E>, T2> $$2, App<bop.c<E>, T3> $$3, App<bop.c<E>, T4> $$4
      ) {
         final bop.e<E, T1> $$5 = (bop.e<E, T1>)bop.b((App<bop.c<E>, M>)$$1);
         final bop.e<E, T2> $$6 = (bop.e<E, T2>)bop.b((App<bop.c<E>, M>)$$2);
         final bop.e<E, T3> $$7 = (bop.e<E, T3>)bop.b((App<bop.c<E>, M>)$$3);
         final bop.e<E, T4> $$8 = (bop.e<E, T4>)bop.b((App<bop.c<E>, M>)$$4);
         final bop.e<E, Function4<T1, T2, T3, T4, R>> $$9 = bop.b($$0);
         return bop.a(new bop.e<E, R>() {
            @Override
            public R a(akt $$0, E $$1, long $$2) {
               T1 $$3 = $$5.a($$0, $$1, $$2);
               if ($$3 == null) {
                  return null;
               } else {
                  T2 $$4 = $$6.a($$0, $$1, $$2);
                  if ($$4 == null) {
                     return null;
                  } else {
                     T3 $$5 = $$7.a($$0, $$1, $$2);
                     if ($$5 == null) {
                        return null;
                     } else {
                        T4 $$6 = $$8.a($$0, $$1, $$2);
                        if ($$6 == null) {
                           return null;
                        } else {
                           Function4<T1, T2, T3, T4, R> $$7 = $$9.a($$0, $$1, $$2);
                           return (R)($$7 == null ? null : $$7.apply($$3, $$4, $$5, $$6));
                        }
                     }
                  }
               }
            }

            @Override
            public String a() {
               return $$9.a() + " * " + $$5.a() + " * " + $$6.a() + " * " + $$7.a() + " * " + $$8.a();
            }

            @Override
            public String toString() {
               return this.a();
            }
         });
      }

      static final class a<E extends bjm> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bjm> implements K1 {
   }

   static final class d<E extends bjm, F extends K1, Value> extends bop<E, boq<F, Value>> {
      d(final bor<F, Value> $$0) {
         super(new bop.e<E, boq<F, Value>>() {
            public boq<F, Value> b(akt $$0x, E $$1, long $$2) {
               bkm<?> $$3 = $$1.dN();
               Optional<Value> $$4 = $$3.d($$0.a());
               return $$4 == null ? null : $$0.a($$3, $$4);
            }

            @Override
            public String a() {
               return "M[" + $$0 + "]";
            }

            @Override
            public String toString() {
               return this.a();
            }
         });
      }
   }

   interface e<E extends bjm, R> {
      @Nullable
      R a(akt var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bjm> extends bop<E, Unit> {
      f(final bos<? super E> $$0) {
         super(new bop.e<E, Unit>() {
            @Nullable
            public Unit b(akt $$0x, E $$1, long $$2) {
               return $$0.trigger($$0, $$1, $$2) ? Unit.INSTANCE : null;
            }

            @Override
            public String a() {
               return "T[" + $$0 + "]";
            }
         });
      }
   }
}
