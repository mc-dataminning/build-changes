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

public class cao<E extends bvi, M> implements App<cao.c<E>, M> {
   private final cao.e<E, M> a;

   public static <E extends bvi, M> cao<E, M> a(App<cao.c<E>, M> $$0) {
      return (cao<E, M>)$$0;
   }

   public static <E extends bvi> cao.b<E> a() {
      return new cao.b<>();
   }

   public static <E extends bvi> bym<E> a(Function<cao.b<E>, ? extends App<cao.c<E>, car<E>>> $$0) {
      final cao.e<E, car<E>> $$1 = b((App<cao.c<E>, car<E>>)$$0.apply(a()));
      return new bym<E>() {
         @Override
         public boolean trigger(ard $$0, E $$1x, long $$2) {
            car<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bvi> bym<E> a(car<? super E> $$0, car<? super E> $$1) {
      return a((Function<cao.b<E>, ? extends App<cao.c<E>, car<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bvi> bym<E> a(Predicate<E> $$0, bym<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bvi> bym<E> a(Predicate<E> $$0) {
      return a((Function<cao.b<E>, ? extends App<cao.c<E>, car<E>>>)($$1 -> $$1.a((car<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bvi> bym<E> a(BiPredicate<ard, E> $$0) {
      return a((Function<cao.b<E>, ? extends App<cao.c<E>, car<E>>>)($$1 -> $$1.a((car<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bvi, M> cao.e<E, M> b(App<cao.c<E>, M> $$0) {
      return a($$0).a;
   }

   cao(cao.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bvi, M> cao<E, M> a(cao.e<E, M> $$0) {
      return new cao<>($$0);
   }

   static final class a<E extends bvi, A> extends cao<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new cao.e<E, A>() {
            @Override
            public A a(ard $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bvi> implements Applicative<cao.c<E>, cao.b.a<E>> {
      public <Value> Optional<Value> a(cap<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(cap<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> cao<E, cap<Mu, Value>> a(cem<Value> $$0) {
         return new cao.d<>(new caq.c<>($$0));
      }

      public <Value> cao<E, cap<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(cem<Value> $$0) {
         return new cao.d<>(new caq.b<>($$0));
      }

      public <Value> cao<E, cap<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(cem<Value> $$0) {
         return new cao.d<>(new caq.a<>($$0));
      }

      public cao<E, Unit> a(car<? super E> $$0) {
         return new cao.f<>($$0);
      }

      public <A> cao<E, A> a(A $$0) {
         return new cao.a<>($$0);
      }

      public <A> cao<E, A> a(Supplier<String> $$0, A $$1) {
         return new cao.a<>($$1, $$0);
      }

      public <A, R> Function<App<cao.c<E>, A>, App<cao.c<E>, R>> lift1(App<cao.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final cao.e<E, A> $$2 = (cao.e<E, A>)cao.b((App<cao.c<E>, M>)$$1);
            final cao.e<E, Function<A, R>> $$3 = cao.b($$0);
            return cao.a(new cao.e<E, R>() {
               @Override
               public R a(ard $$0, E $$1, long $$2x) {
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

      public <T, R> cao<E, R> a(final Function<? super T, ? extends R> $$0, App<cao.c<E>, T> $$1) {
         final cao.e<E, T> $$2 = (cao.e<E, T>)cao.b((App<cao.c<E>, M>)$$1);
         return cao.a(new cao.e<E, R>() {
            @Override
            public R a(ard $$0x, E $$1, long $$2x) {
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

      public <A, B, R> cao<E, R> a(App<cao.c<E>, BiFunction<A, B, R>> $$0, App<cao.c<E>, A> $$1, App<cao.c<E>, B> $$2) {
         final cao.e<E, A> $$3 = (cao.e<E, A>)cao.b((App<cao.c<E>, M>)$$1);
         final cao.e<E, B> $$4 = (cao.e<E, B>)cao.b((App<cao.c<E>, M>)$$2);
         final cao.e<E, BiFunction<A, B, R>> $$5 = cao.b($$0);
         return cao.a(new cao.e<E, R>() {
            @Override
            public R a(ard $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> cao<E, R> a(App<cao.c<E>, Function3<T1, T2, T3, R>> $$0, App<cao.c<E>, T1> $$1, App<cao.c<E>, T2> $$2, App<cao.c<E>, T3> $$3) {
         final cao.e<E, T1> $$4 = (cao.e<E, T1>)cao.b((App<cao.c<E>, M>)$$1);
         final cao.e<E, T2> $$5 = (cao.e<E, T2>)cao.b((App<cao.c<E>, M>)$$2);
         final cao.e<E, T3> $$6 = (cao.e<E, T3>)cao.b((App<cao.c<E>, M>)$$3);
         final cao.e<E, Function3<T1, T2, T3, R>> $$7 = cao.b($$0);
         return cao.a(new cao.e<E, R>() {
            @Override
            public R a(ard $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> cao<E, R> a(
         App<cao.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<cao.c<E>, T1> $$1, App<cao.c<E>, T2> $$2, App<cao.c<E>, T3> $$3, App<cao.c<E>, T4> $$4
      ) {
         final cao.e<E, T1> $$5 = (cao.e<E, T1>)cao.b((App<cao.c<E>, M>)$$1);
         final cao.e<E, T2> $$6 = (cao.e<E, T2>)cao.b((App<cao.c<E>, M>)$$2);
         final cao.e<E, T3> $$7 = (cao.e<E, T3>)cao.b((App<cao.c<E>, M>)$$3);
         final cao.e<E, T4> $$8 = (cao.e<E, T4>)cao.b((App<cao.c<E>, M>)$$4);
         final cao.e<E, Function4<T1, T2, T3, T4, R>> $$9 = cao.b($$0);
         return cao.a(new cao.e<E, R>() {
            @Override
            public R a(ard $$0, E $$1, long $$2) {
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

      static final class a<E extends bvi> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bvi> implements K1 {
   }

   static final class d<E extends bvi, F extends K1, Value> extends cao<E, cap<F, Value>> {
      d(final caq<F, Value> $$0) {
         super(new cao.e<E, cap<F, Value>>() {
            public cap<F, Value> b(ard $$0x, E $$1, long $$2) {
               bwk<?> $$3 = $$1.eb();
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

   interface e<E extends bvi, R> {
      @Nullable
      R a(ard var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bvi> extends cao<E, Unit> {
      f(final car<? super E> $$0) {
         super(new cao.e<E, Unit>() {
            @Nullable
            public Unit b(ard $$0x, E $$1, long $$2) {
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
