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

public class bzk<E extends buf, M> implements App<bzk.c<E>, M> {
   private final bzk.e<E, M> a;

   public static <E extends buf, M> bzk<E, M> a(App<bzk.c<E>, M> $$0) {
      return (bzk<E, M>)$$0;
   }

   public static <E extends buf> bzk.b<E> a() {
      return new bzk.b<>();
   }

   public static <E extends buf> bxi<E> a(Function<bzk.b<E>, ? extends App<bzk.c<E>, bzn<E>>> $$0) {
      final bzk.e<E, bzn<E>> $$1 = b((App<bzk.c<E>, bzn<E>>)$$0.apply(a()));
      return new bxi<E>() {
         @Override
         public boolean trigger(arg $$0, E $$1x, long $$2) {
            bzn<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends buf> bxi<E> a(bzn<? super E> $$0, bzn<? super E> $$1) {
      return a((Function<bzk.b<E>, ? extends App<bzk.c<E>, bzn<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends buf> bxi<E> a(Predicate<E> $$0, bxi<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends buf> bxi<E> a(Predicate<E> $$0) {
      return a((Function<bzk.b<E>, ? extends App<bzk.c<E>, bzn<E>>>)($$1 -> $$1.a((bzn<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends buf> bxi<E> a(BiPredicate<arg, E> $$0) {
      return a((Function<bzk.b<E>, ? extends App<bzk.c<E>, bzn<E>>>)($$1 -> $$1.a((bzn<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends buf, M> bzk.e<E, M> b(App<bzk.c<E>, M> $$0) {
      return a($$0).a;
   }

   bzk(bzk.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends buf, M> bzk<E, M> a(bzk.e<E, M> $$0) {
      return new bzk<>($$0);
   }

   static final class a<E extends buf, A> extends bzk<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new bzk.e<E, A>() {
            @Override
            public A a(arg $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends buf> implements Applicative<bzk.c<E>, bzk.b.a<E>> {
      public <Value> Optional<Value> a(bzl<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(bzl<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> bzk<E, bzl<Mu, Value>> a(cdi<Value> $$0) {
         return new bzk.d<>(new bzm.c<>($$0));
      }

      public <Value> bzk<E, bzl<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(cdi<Value> $$0) {
         return new bzk.d<>(new bzm.b<>($$0));
      }

      public <Value> bzk<E, bzl<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(cdi<Value> $$0) {
         return new bzk.d<>(new bzm.a<>($$0));
      }

      public bzk<E, Unit> a(bzn<? super E> $$0) {
         return new bzk.f<>($$0);
      }

      public <A> bzk<E, A> a(A $$0) {
         return new bzk.a<>($$0);
      }

      public <A> bzk<E, A> a(Supplier<String> $$0, A $$1) {
         return new bzk.a<>($$1, $$0);
      }

      public <A, R> Function<App<bzk.c<E>, A>, App<bzk.c<E>, R>> lift1(App<bzk.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final bzk.e<E, A> $$2 = (bzk.e<E, A>)bzk.b((App<bzk.c<E>, M>)$$1);
            final bzk.e<E, Function<A, R>> $$3 = bzk.b($$0);
            return bzk.a(new bzk.e<E, R>() {
               @Override
               public R a(arg $$0, E $$1, long $$2x) {
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

      public <T, R> bzk<E, R> a(final Function<? super T, ? extends R> $$0, App<bzk.c<E>, T> $$1) {
         final bzk.e<E, T> $$2 = (bzk.e<E, T>)bzk.b((App<bzk.c<E>, M>)$$1);
         return bzk.a(new bzk.e<E, R>() {
            @Override
            public R a(arg $$0x, E $$1, long $$2x) {
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

      public <A, B, R> bzk<E, R> a(App<bzk.c<E>, BiFunction<A, B, R>> $$0, App<bzk.c<E>, A> $$1, App<bzk.c<E>, B> $$2) {
         final bzk.e<E, A> $$3 = (bzk.e<E, A>)bzk.b((App<bzk.c<E>, M>)$$1);
         final bzk.e<E, B> $$4 = (bzk.e<E, B>)bzk.b((App<bzk.c<E>, M>)$$2);
         final bzk.e<E, BiFunction<A, B, R>> $$5 = bzk.b($$0);
         return bzk.a(new bzk.e<E, R>() {
            @Override
            public R a(arg $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> bzk<E, R> a(App<bzk.c<E>, Function3<T1, T2, T3, R>> $$0, App<bzk.c<E>, T1> $$1, App<bzk.c<E>, T2> $$2, App<bzk.c<E>, T3> $$3) {
         final bzk.e<E, T1> $$4 = (bzk.e<E, T1>)bzk.b((App<bzk.c<E>, M>)$$1);
         final bzk.e<E, T2> $$5 = (bzk.e<E, T2>)bzk.b((App<bzk.c<E>, M>)$$2);
         final bzk.e<E, T3> $$6 = (bzk.e<E, T3>)bzk.b((App<bzk.c<E>, M>)$$3);
         final bzk.e<E, Function3<T1, T2, T3, R>> $$7 = bzk.b($$0);
         return bzk.a(new bzk.e<E, R>() {
            @Override
            public R a(arg $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> bzk<E, R> a(
         App<bzk.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<bzk.c<E>, T1> $$1, App<bzk.c<E>, T2> $$2, App<bzk.c<E>, T3> $$3, App<bzk.c<E>, T4> $$4
      ) {
         final bzk.e<E, T1> $$5 = (bzk.e<E, T1>)bzk.b((App<bzk.c<E>, M>)$$1);
         final bzk.e<E, T2> $$6 = (bzk.e<E, T2>)bzk.b((App<bzk.c<E>, M>)$$2);
         final bzk.e<E, T3> $$7 = (bzk.e<E, T3>)bzk.b((App<bzk.c<E>, M>)$$3);
         final bzk.e<E, T4> $$8 = (bzk.e<E, T4>)bzk.b((App<bzk.c<E>, M>)$$4);
         final bzk.e<E, Function4<T1, T2, T3, T4, R>> $$9 = bzk.b($$0);
         return bzk.a(new bzk.e<E, R>() {
            @Override
            public R a(arg $$0, E $$1, long $$2) {
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

      static final class a<E extends buf> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends buf> implements K1 {
   }

   static final class d<E extends buf, F extends K1, Value> extends bzk<E, bzl<F, Value>> {
      d(final bzm<F, Value> $$0) {
         super(new bzk.e<E, bzl<F, Value>>() {
            public bzl<F, Value> b(arg $$0x, E $$1, long $$2) {
               bvg<?> $$3 = $$1.dX();
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

   interface e<E extends buf, R> {
      @Nullable
      R a(arg var1, E var2, long var3);

      String a();
   }

   static final class f<E extends buf> extends bzk<E, Unit> {
      f(final bzn<? super E> $$0) {
         super(new bzk.e<E, Unit>() {
            @Nullable
            public Unit b(arg $$0x, E $$1, long $$2) {
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
