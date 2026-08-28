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

public class byi<E extends btc, M> implements App<byi.c<E>, M> {
   private final byi.e<E, M> a;

   public static <E extends btc, M> byi<E, M> a(App<byi.c<E>, M> $$0) {
      return (byi<E, M>)$$0;
   }

   public static <E extends btc> byi.b<E> a() {
      return new byi.b<>();
   }

   public static <E extends btc> bwg<E> a(Function<byi.b<E>, ? extends App<byi.c<E>, byl<E>>> $$0) {
      final byi.e<E, byl<E>> $$1 = b((App<byi.c<E>, byl<E>>)$$0.apply(a()));
      return new bwg<E>() {
         @Override
         public boolean trigger(aqm $$0, E $$1x, long $$2) {
            byl<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends btc> bwg<E> a(byl<? super E> $$0, byl<? super E> $$1) {
      return a((Function<byi.b<E>, ? extends App<byi.c<E>, byl<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends btc> bwg<E> a(Predicate<E> $$0, bwg<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends btc> bwg<E> a(Predicate<E> $$0) {
      return a((Function<byi.b<E>, ? extends App<byi.c<E>, byl<E>>>)($$1 -> $$1.a((byl<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends btc> bwg<E> a(BiPredicate<aqm, E> $$0) {
      return a((Function<byi.b<E>, ? extends App<byi.c<E>, byl<E>>>)($$1 -> $$1.a((byl<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends btc, M> byi.e<E, M> b(App<byi.c<E>, M> $$0) {
      return a($$0).a;
   }

   byi(byi.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends btc, M> byi<E, M> a(byi.e<E, M> $$0) {
      return new byi<>($$0);
   }

   static final class a<E extends btc, A> extends byi<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new byi.e<E, A>() {
            @Override
            public A a(aqm $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends btc> implements Applicative<byi.c<E>, byi.b.a<E>> {
      public <Value> Optional<Value> a(byj<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(byj<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> byi<E, byj<Mu, Value>> a(ccg<Value> $$0) {
         return new byi.d<>(new byk.c<>($$0));
      }

      public <Value> byi<E, byj<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(ccg<Value> $$0) {
         return new byi.d<>(new byk.b<>($$0));
      }

      public <Value> byi<E, byj<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(ccg<Value> $$0) {
         return new byi.d<>(new byk.a<>($$0));
      }

      public byi<E, Unit> a(byl<? super E> $$0) {
         return new byi.f<>($$0);
      }

      public <A> byi<E, A> a(A $$0) {
         return new byi.a<>($$0);
      }

      public <A> byi<E, A> a(Supplier<String> $$0, A $$1) {
         return new byi.a<>($$1, $$0);
      }

      public <A, R> Function<App<byi.c<E>, A>, App<byi.c<E>, R>> lift1(App<byi.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final byi.e<E, A> $$2 = (byi.e<E, A>)byi.b((App<byi.c<E>, M>)$$1);
            final byi.e<E, Function<A, R>> $$3 = byi.b($$0);
            return byi.a(new byi.e<E, R>() {
               @Override
               public R a(aqm $$0, E $$1, long $$2x) {
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

      public <T, R> byi<E, R> a(final Function<? super T, ? extends R> $$0, App<byi.c<E>, T> $$1) {
         final byi.e<E, T> $$2 = (byi.e<E, T>)byi.b((App<byi.c<E>, M>)$$1);
         return byi.a(new byi.e<E, R>() {
            @Override
            public R a(aqm $$0x, E $$1, long $$2x) {
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

      public <A, B, R> byi<E, R> a(App<byi.c<E>, BiFunction<A, B, R>> $$0, App<byi.c<E>, A> $$1, App<byi.c<E>, B> $$2) {
         final byi.e<E, A> $$3 = (byi.e<E, A>)byi.b((App<byi.c<E>, M>)$$1);
         final byi.e<E, B> $$4 = (byi.e<E, B>)byi.b((App<byi.c<E>, M>)$$2);
         final byi.e<E, BiFunction<A, B, R>> $$5 = byi.b($$0);
         return byi.a(new byi.e<E, R>() {
            @Override
            public R a(aqm $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> byi<E, R> a(App<byi.c<E>, Function3<T1, T2, T3, R>> $$0, App<byi.c<E>, T1> $$1, App<byi.c<E>, T2> $$2, App<byi.c<E>, T3> $$3) {
         final byi.e<E, T1> $$4 = (byi.e<E, T1>)byi.b((App<byi.c<E>, M>)$$1);
         final byi.e<E, T2> $$5 = (byi.e<E, T2>)byi.b((App<byi.c<E>, M>)$$2);
         final byi.e<E, T3> $$6 = (byi.e<E, T3>)byi.b((App<byi.c<E>, M>)$$3);
         final byi.e<E, Function3<T1, T2, T3, R>> $$7 = byi.b($$0);
         return byi.a(new byi.e<E, R>() {
            @Override
            public R a(aqm $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> byi<E, R> a(
         App<byi.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<byi.c<E>, T1> $$1, App<byi.c<E>, T2> $$2, App<byi.c<E>, T3> $$3, App<byi.c<E>, T4> $$4
      ) {
         final byi.e<E, T1> $$5 = (byi.e<E, T1>)byi.b((App<byi.c<E>, M>)$$1);
         final byi.e<E, T2> $$6 = (byi.e<E, T2>)byi.b((App<byi.c<E>, M>)$$2);
         final byi.e<E, T3> $$7 = (byi.e<E, T3>)byi.b((App<byi.c<E>, M>)$$3);
         final byi.e<E, T4> $$8 = (byi.e<E, T4>)byi.b((App<byi.c<E>, M>)$$4);
         final byi.e<E, Function4<T1, T2, T3, T4, R>> $$9 = byi.b($$0);
         return byi.a(new byi.e<E, R>() {
            @Override
            public R a(aqm $$0, E $$1, long $$2) {
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

      static final class a<E extends btc> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends btc> implements K1 {
   }

   static final class d<E extends btc, F extends K1, Value> extends byi<E, byj<F, Value>> {
      d(final byk<F, Value> $$0) {
         super(new byi.e<E, byj<F, Value>>() {
            public byj<F, Value> b(aqm $$0x, E $$1, long $$2) {
               bue<?> $$3 = $$1.dV();
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

   interface e<E extends btc, R> {
      @Nullable
      R a(aqm var1, E var2, long var3);

      String a();
   }

   static final class f<E extends btc> extends byi<E, Unit> {
      f(final byl<? super E> $$0) {
         super(new byi.e<E, Unit>() {
            @Nullable
            public Unit b(aqm $$0x, E $$1, long $$2) {
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
