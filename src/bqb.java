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

public class bqb<E extends bky, M> implements App<bqb.c<E>, M> {
   private final bqb.e<E, M> a;

   public static <E extends bky, M> bqb<E, M> a(App<bqb.c<E>, M> $$0) {
      return (bqb<E, M>)$$0;
   }

   public static <E extends bky> bqb.b<E> a() {
      return new bqb.b<>();
   }

   public static <E extends bky> bnz<E> a(Function<bqb.b<E>, ? extends App<bqb.c<E>, bqe<E>>> $$0) {
      final bqb.e<E, bqe<E>> $$1 = b((App<bqb.c<E>, bqe<E>>)$$0.apply(a()));
      return new bnz<E>() {
         @Override
         public boolean trigger(ama $$0, E $$1x, long $$2) {
            bqe<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bky> bnz<E> a(bqe<? super E> $$0, bqe<? super E> $$1) {
      return a((Function<bqb.b<E>, ? extends App<bqb.c<E>, bqe<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bky> bnz<E> a(Predicate<E> $$0, bnz<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bky> bnz<E> a(Predicate<E> $$0) {
      return a((Function<bqb.b<E>, ? extends App<bqb.c<E>, bqe<E>>>)($$1 -> $$1.a((bqe<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bky> bnz<E> a(BiPredicate<ama, E> $$0) {
      return a((Function<bqb.b<E>, ? extends App<bqb.c<E>, bqe<E>>>)($$1 -> $$1.a((bqe<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bky, M> bqb.e<E, M> b(App<bqb.c<E>, M> $$0) {
      return a($$0).a;
   }

   bqb(bqb.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bky, M> bqb<E, M> a(bqb.e<E, M> $$0) {
      return new bqb<>($$0);
   }

   static final class a<E extends bky, A> extends bqb<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new bqb.e<E, A>() {
            @Override
            public A a(ama $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bky> implements Applicative<bqb.c<E>, bqb.b.a<E>> {
      public <Value> Optional<Value> a(bqc<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(bqc<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> bqb<E, bqc<Mu, Value>> a(btz<Value> $$0) {
         return new bqb.d<>(new bqd.c<>($$0));
      }

      public <Value> bqb<E, bqc<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(btz<Value> $$0) {
         return new bqb.d<>(new bqd.b<>($$0));
      }

      public <Value> bqb<E, bqc<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(btz<Value> $$0) {
         return new bqb.d<>(new bqd.a<>($$0));
      }

      public bqb<E, Unit> a(bqe<? super E> $$0) {
         return new bqb.f<>($$0);
      }

      public <A> bqb<E, A> a(A $$0) {
         return new bqb.a<>($$0);
      }

      public <A> bqb<E, A> a(Supplier<String> $$0, A $$1) {
         return new bqb.a<>($$1, $$0);
      }

      public <A, R> Function<App<bqb.c<E>, A>, App<bqb.c<E>, R>> lift1(App<bqb.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final bqb.e<E, A> $$2 = (bqb.e<E, A>)bqb.b((App<bqb.c<E>, M>)$$1);
            final bqb.e<E, Function<A, R>> $$3 = bqb.b($$0);
            return bqb.a(new bqb.e<E, R>() {
               @Override
               public R a(ama $$0, E $$1, long $$2x) {
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

      public <T, R> bqb<E, R> a(final Function<? super T, ? extends R> $$0, App<bqb.c<E>, T> $$1) {
         final bqb.e<E, T> $$2 = (bqb.e<E, T>)bqb.b((App<bqb.c<E>, M>)$$1);
         return bqb.a(new bqb.e<E, R>() {
            @Override
            public R a(ama $$0x, E $$1, long $$2x) {
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

      public <A, B, R> bqb<E, R> a(App<bqb.c<E>, BiFunction<A, B, R>> $$0, App<bqb.c<E>, A> $$1, App<bqb.c<E>, B> $$2) {
         final bqb.e<E, A> $$3 = (bqb.e<E, A>)bqb.b((App<bqb.c<E>, M>)$$1);
         final bqb.e<E, B> $$4 = (bqb.e<E, B>)bqb.b((App<bqb.c<E>, M>)$$2);
         final bqb.e<E, BiFunction<A, B, R>> $$5 = bqb.b($$0);
         return bqb.a(new bqb.e<E, R>() {
            @Override
            public R a(ama $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> bqb<E, R> a(App<bqb.c<E>, Function3<T1, T2, T3, R>> $$0, App<bqb.c<E>, T1> $$1, App<bqb.c<E>, T2> $$2, App<bqb.c<E>, T3> $$3) {
         final bqb.e<E, T1> $$4 = (bqb.e<E, T1>)bqb.b((App<bqb.c<E>, M>)$$1);
         final bqb.e<E, T2> $$5 = (bqb.e<E, T2>)bqb.b((App<bqb.c<E>, M>)$$2);
         final bqb.e<E, T3> $$6 = (bqb.e<E, T3>)bqb.b((App<bqb.c<E>, M>)$$3);
         final bqb.e<E, Function3<T1, T2, T3, R>> $$7 = bqb.b($$0);
         return bqb.a(new bqb.e<E, R>() {
            @Override
            public R a(ama $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> bqb<E, R> a(
         App<bqb.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<bqb.c<E>, T1> $$1, App<bqb.c<E>, T2> $$2, App<bqb.c<E>, T3> $$3, App<bqb.c<E>, T4> $$4
      ) {
         final bqb.e<E, T1> $$5 = (bqb.e<E, T1>)bqb.b((App<bqb.c<E>, M>)$$1);
         final bqb.e<E, T2> $$6 = (bqb.e<E, T2>)bqb.b((App<bqb.c<E>, M>)$$2);
         final bqb.e<E, T3> $$7 = (bqb.e<E, T3>)bqb.b((App<bqb.c<E>, M>)$$3);
         final bqb.e<E, T4> $$8 = (bqb.e<E, T4>)bqb.b((App<bqb.c<E>, M>)$$4);
         final bqb.e<E, Function4<T1, T2, T3, T4, R>> $$9 = bqb.b($$0);
         return bqb.a(new bqb.e<E, R>() {
            @Override
            public R a(ama $$0, E $$1, long $$2) {
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

      static final class a<E extends bky> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bky> implements K1 {
   }

   static final class d<E extends bky, F extends K1, Value> extends bqb<E, bqc<F, Value>> {
      d(final bqd<F, Value> $$0) {
         super(new bqb.e<E, bqc<F, Value>>() {
            public bqc<F, Value> b(ama $$0x, E $$1, long $$2) {
               bly<?> $$3 = $$1.dN();
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

   interface e<E extends bky, R> {
      @Nullable
      R a(ama var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bky> extends bqb<E, Unit> {
      f(final bqe<? super E> $$0) {
         super(new bqb.e<E, Unit>() {
            @Nullable
            public Unit b(ama $$0x, E $$1, long $$2) {
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
