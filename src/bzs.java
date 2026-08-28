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

public class bzs<E extends bun, M> implements App<bzs.c<E>, M> {
   private final bzs.e<E, M> a;

   public static <E extends bun, M> bzs<E, M> a(App<bzs.c<E>, M> $$0) {
      return (bzs<E, M>)$$0;
   }

   public static <E extends bun> bzs.b<E> a() {
      return new bzs.b<>();
   }

   public static <E extends bun> bxq<E> a(Function<bzs.b<E>, ? extends App<bzs.c<E>, bzv<E>>> $$0) {
      final bzs.e<E, bzv<E>> $$1 = b((App<bzs.c<E>, bzv<E>>)$$0.apply(a()));
      return new bxq<E>() {
         @Override
         public boolean trigger(arj $$0, E $$1x, long $$2) {
            bzv<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bun> bxq<E> a(bzv<? super E> $$0, bzv<? super E> $$1) {
      return a((Function<bzs.b<E>, ? extends App<bzs.c<E>, bzv<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bun> bxq<E> a(Predicate<E> $$0, bxq<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bun> bxq<E> a(Predicate<E> $$0) {
      return a((Function<bzs.b<E>, ? extends App<bzs.c<E>, bzv<E>>>)($$1 -> $$1.a((bzv<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bun> bxq<E> a(BiPredicate<arj, E> $$0) {
      return a((Function<bzs.b<E>, ? extends App<bzs.c<E>, bzv<E>>>)($$1 -> $$1.a((bzv<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bun, M> bzs.e<E, M> b(App<bzs.c<E>, M> $$0) {
      return a($$0).a;
   }

   bzs(bzs.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bun, M> bzs<E, M> a(bzs.e<E, M> $$0) {
      return new bzs<>($$0);
   }

   static final class a<E extends bun, A> extends bzs<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new bzs.e<E, A>() {
            @Override
            public A a(arj $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bun> implements Applicative<bzs.c<E>, bzs.b.a<E>> {
      public <Value> Optional<Value> a(bzt<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(bzt<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> bzs<E, bzt<Mu, Value>> a(cdq<Value> $$0) {
         return new bzs.d<>(new bzu.c<>($$0));
      }

      public <Value> bzs<E, bzt<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(cdq<Value> $$0) {
         return new bzs.d<>(new bzu.b<>($$0));
      }

      public <Value> bzs<E, bzt<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(cdq<Value> $$0) {
         return new bzs.d<>(new bzu.a<>($$0));
      }

      public bzs<E, Unit> a(bzv<? super E> $$0) {
         return new bzs.f<>($$0);
      }

      public <A> bzs<E, A> a(A $$0) {
         return new bzs.a<>($$0);
      }

      public <A> bzs<E, A> a(Supplier<String> $$0, A $$1) {
         return new bzs.a<>($$1, $$0);
      }

      public <A, R> Function<App<bzs.c<E>, A>, App<bzs.c<E>, R>> lift1(App<bzs.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final bzs.e<E, A> $$2 = (bzs.e<E, A>)bzs.b((App<bzs.c<E>, M>)$$1);
            final bzs.e<E, Function<A, R>> $$3 = bzs.b($$0);
            return bzs.a(new bzs.e<E, R>() {
               @Override
               public R a(arj $$0, E $$1, long $$2x) {
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

      public <T, R> bzs<E, R> a(final Function<? super T, ? extends R> $$0, App<bzs.c<E>, T> $$1) {
         final bzs.e<E, T> $$2 = (bzs.e<E, T>)bzs.b((App<bzs.c<E>, M>)$$1);
         return bzs.a(new bzs.e<E, R>() {
            @Override
            public R a(arj $$0x, E $$1, long $$2x) {
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

      public <A, B, R> bzs<E, R> a(App<bzs.c<E>, BiFunction<A, B, R>> $$0, App<bzs.c<E>, A> $$1, App<bzs.c<E>, B> $$2) {
         final bzs.e<E, A> $$3 = (bzs.e<E, A>)bzs.b((App<bzs.c<E>, M>)$$1);
         final bzs.e<E, B> $$4 = (bzs.e<E, B>)bzs.b((App<bzs.c<E>, M>)$$2);
         final bzs.e<E, BiFunction<A, B, R>> $$5 = bzs.b($$0);
         return bzs.a(new bzs.e<E, R>() {
            @Override
            public R a(arj $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> bzs<E, R> a(App<bzs.c<E>, Function3<T1, T2, T3, R>> $$0, App<bzs.c<E>, T1> $$1, App<bzs.c<E>, T2> $$2, App<bzs.c<E>, T3> $$3) {
         final bzs.e<E, T1> $$4 = (bzs.e<E, T1>)bzs.b((App<bzs.c<E>, M>)$$1);
         final bzs.e<E, T2> $$5 = (bzs.e<E, T2>)bzs.b((App<bzs.c<E>, M>)$$2);
         final bzs.e<E, T3> $$6 = (bzs.e<E, T3>)bzs.b((App<bzs.c<E>, M>)$$3);
         final bzs.e<E, Function3<T1, T2, T3, R>> $$7 = bzs.b($$0);
         return bzs.a(new bzs.e<E, R>() {
            @Override
            public R a(arj $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> bzs<E, R> a(
         App<bzs.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<bzs.c<E>, T1> $$1, App<bzs.c<E>, T2> $$2, App<bzs.c<E>, T3> $$3, App<bzs.c<E>, T4> $$4
      ) {
         final bzs.e<E, T1> $$5 = (bzs.e<E, T1>)bzs.b((App<bzs.c<E>, M>)$$1);
         final bzs.e<E, T2> $$6 = (bzs.e<E, T2>)bzs.b((App<bzs.c<E>, M>)$$2);
         final bzs.e<E, T3> $$7 = (bzs.e<E, T3>)bzs.b((App<bzs.c<E>, M>)$$3);
         final bzs.e<E, T4> $$8 = (bzs.e<E, T4>)bzs.b((App<bzs.c<E>, M>)$$4);
         final bzs.e<E, Function4<T1, T2, T3, T4, R>> $$9 = bzs.b($$0);
         return bzs.a(new bzs.e<E, R>() {
            @Override
            public R a(arj $$0, E $$1, long $$2) {
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

      static final class a<E extends bun> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bun> implements K1 {
   }

   static final class d<E extends bun, F extends K1, Value> extends bzs<E, bzt<F, Value>> {
      d(final bzu<F, Value> $$0) {
         super(new bzs.e<E, bzt<F, Value>>() {
            public bzt<F, Value> b(arj $$0x, E $$1, long $$2) {
               bvo<?> $$3 = $$1.dY();
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

   interface e<E extends bun, R> {
      @Nullable
      R a(arj var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bun> extends bzs<E, Unit> {
      f(final bzv<? super E> $$0) {
         super(new bzs.e<E, Unit>() {
            @Nullable
            public Unit b(arj $$0x, E $$1, long $$2) {
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
