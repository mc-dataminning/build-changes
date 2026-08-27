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

public class bro<E extends bmk, M> implements App<bro.c<E>, M> {
   private final bro.e<E, M> a;

   public static <E extends bmk, M> bro<E, M> a(App<bro.c<E>, M> $$0) {
      return (bro<E, M>)$$0;
   }

   public static <E extends bmk> bro.b<E> a() {
      return new bro.b<>();
   }

   public static <E extends bmk> bpm<E> a(Function<bro.b<E>, ? extends App<bro.c<E>, brr<E>>> $$0) {
      final bro.e<E, brr<E>> $$1 = b((App<bro.c<E>, brr<E>>)$$0.apply(a()));
      return new bpm<E>() {
         @Override
         public boolean trigger(and $$0, E $$1x, long $$2) {
            brr<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bmk> bpm<E> a(brr<? super E> $$0, brr<? super E> $$1) {
      return a((Function<bro.b<E>, ? extends App<bro.c<E>, brr<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bmk> bpm<E> a(Predicate<E> $$0, bpm<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bmk> bpm<E> a(Predicate<E> $$0) {
      return a((Function<bro.b<E>, ? extends App<bro.c<E>, brr<E>>>)($$1 -> $$1.a((brr<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bmk> bpm<E> a(BiPredicate<and, E> $$0) {
      return a((Function<bro.b<E>, ? extends App<bro.c<E>, brr<E>>>)($$1 -> $$1.a((brr<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bmk, M> bro.e<E, M> b(App<bro.c<E>, M> $$0) {
      return a($$0).a;
   }

   bro(bro.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bmk, M> bro<E, M> a(bro.e<E, M> $$0) {
      return new bro<>($$0);
   }

   static final class a<E extends bmk, A> extends bro<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new bro.e<E, A>() {
            @Override
            public A a(and $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bmk> implements Applicative<bro.c<E>, bro.b.a<E>> {
      public <Value> Optional<Value> a(brp<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(brp<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> bro<E, brp<Mu, Value>> a(bvm<Value> $$0) {
         return new bro.d<>(new brq.c<>($$0));
      }

      public <Value> bro<E, brp<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(bvm<Value> $$0) {
         return new bro.d<>(new brq.b<>($$0));
      }

      public <Value> bro<E, brp<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(bvm<Value> $$0) {
         return new bro.d<>(new brq.a<>($$0));
      }

      public bro<E, Unit> a(brr<? super E> $$0) {
         return new bro.f<>($$0);
      }

      public <A> bro<E, A> a(A $$0) {
         return new bro.a<>($$0);
      }

      public <A> bro<E, A> a(Supplier<String> $$0, A $$1) {
         return new bro.a<>($$1, $$0);
      }

      public <A, R> Function<App<bro.c<E>, A>, App<bro.c<E>, R>> lift1(App<bro.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final bro.e<E, A> $$2 = (bro.e<E, A>)bro.b((App<bro.c<E>, M>)$$1);
            final bro.e<E, Function<A, R>> $$3 = bro.b($$0);
            return bro.a(new bro.e<E, R>() {
               @Override
               public R a(and $$0, E $$1, long $$2x) {
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

      public <T, R> bro<E, R> a(final Function<? super T, ? extends R> $$0, App<bro.c<E>, T> $$1) {
         final bro.e<E, T> $$2 = (bro.e<E, T>)bro.b((App<bro.c<E>, M>)$$1);
         return bro.a(new bro.e<E, R>() {
            @Override
            public R a(and $$0x, E $$1, long $$2x) {
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

      public <A, B, R> bro<E, R> a(App<bro.c<E>, BiFunction<A, B, R>> $$0, App<bro.c<E>, A> $$1, App<bro.c<E>, B> $$2) {
         final bro.e<E, A> $$3 = (bro.e<E, A>)bro.b((App<bro.c<E>, M>)$$1);
         final bro.e<E, B> $$4 = (bro.e<E, B>)bro.b((App<bro.c<E>, M>)$$2);
         final bro.e<E, BiFunction<A, B, R>> $$5 = bro.b($$0);
         return bro.a(new bro.e<E, R>() {
            @Override
            public R a(and $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> bro<E, R> a(App<bro.c<E>, Function3<T1, T2, T3, R>> $$0, App<bro.c<E>, T1> $$1, App<bro.c<E>, T2> $$2, App<bro.c<E>, T3> $$3) {
         final bro.e<E, T1> $$4 = (bro.e<E, T1>)bro.b((App<bro.c<E>, M>)$$1);
         final bro.e<E, T2> $$5 = (bro.e<E, T2>)bro.b((App<bro.c<E>, M>)$$2);
         final bro.e<E, T3> $$6 = (bro.e<E, T3>)bro.b((App<bro.c<E>, M>)$$3);
         final bro.e<E, Function3<T1, T2, T3, R>> $$7 = bro.b($$0);
         return bro.a(new bro.e<E, R>() {
            @Override
            public R a(and $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> bro<E, R> a(
         App<bro.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<bro.c<E>, T1> $$1, App<bro.c<E>, T2> $$2, App<bro.c<E>, T3> $$3, App<bro.c<E>, T4> $$4
      ) {
         final bro.e<E, T1> $$5 = (bro.e<E, T1>)bro.b((App<bro.c<E>, M>)$$1);
         final bro.e<E, T2> $$6 = (bro.e<E, T2>)bro.b((App<bro.c<E>, M>)$$2);
         final bro.e<E, T3> $$7 = (bro.e<E, T3>)bro.b((App<bro.c<E>, M>)$$3);
         final bro.e<E, T4> $$8 = (bro.e<E, T4>)bro.b((App<bro.c<E>, M>)$$4);
         final bro.e<E, Function4<T1, T2, T3, T4, R>> $$9 = bro.b($$0);
         return bro.a(new bro.e<E, R>() {
            @Override
            public R a(and $$0, E $$1, long $$2) {
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

      static final class a<E extends bmk> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bmk> implements K1 {
   }

   static final class d<E extends bmk, F extends K1, Value> extends bro<E, brp<F, Value>> {
      d(final brq<F, Value> $$0) {
         super(new bro.e<E, brp<F, Value>>() {
            public brp<F, Value> b(and $$0x, E $$1, long $$2) {
               bnk<?> $$3 = $$1.dO();
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

   interface e<E extends bmk, R> {
      @Nullable
      R a(and var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bmk> extends bro<E, Unit> {
      f(final brr<? super E> $$0) {
         super(new bro.e<E, Unit>() {
            @Nullable
            public Unit b(and $$0x, E $$1, long $$2) {
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
