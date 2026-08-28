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

public class byw<E extends btq, M> implements App<byw.c<E>, M> {
   private final byw.e<E, M> a;

   public static <E extends btq, M> byw<E, M> a(App<byw.c<E>, M> $$0) {
      return (byw<E, M>)$$0;
   }

   public static <E extends btq> byw.b<E> a() {
      return new byw.b<>();
   }

   public static <E extends btq> bwu<E> a(Function<byw.b<E>, ? extends App<byw.c<E>, byz<E>>> $$0) {
      final byw.e<E, byz<E>> $$1 = b((App<byw.c<E>, byz<E>>)$$0.apply(a()));
      return new bwu<E>() {
         @Override
         public boolean trigger(arf $$0, E $$1x, long $$2) {
            byz<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends btq> bwu<E> a(byz<? super E> $$0, byz<? super E> $$1) {
      return a((Function<byw.b<E>, ? extends App<byw.c<E>, byz<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends btq> bwu<E> a(Predicate<E> $$0, bwu<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends btq> bwu<E> a(Predicate<E> $$0) {
      return a((Function<byw.b<E>, ? extends App<byw.c<E>, byz<E>>>)($$1 -> $$1.a((byz<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends btq> bwu<E> a(BiPredicate<arf, E> $$0) {
      return a((Function<byw.b<E>, ? extends App<byw.c<E>, byz<E>>>)($$1 -> $$1.a((byz<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends btq, M> byw.e<E, M> b(App<byw.c<E>, M> $$0) {
      return a($$0).a;
   }

   byw(byw.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends btq, M> byw<E, M> a(byw.e<E, M> $$0) {
      return new byw<>($$0);
   }

   static final class a<E extends btq, A> extends byw<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new byw.e<E, A>() {
            @Override
            public A a(arf $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends btq> implements Applicative<byw.c<E>, byw.b.a<E>> {
      public <Value> Optional<Value> a(byx<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(byx<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> byw<E, byx<Mu, Value>> a(ccu<Value> $$0) {
         return new byw.d<>(new byy.c<>($$0));
      }

      public <Value> byw<E, byx<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(ccu<Value> $$0) {
         return new byw.d<>(new byy.b<>($$0));
      }

      public <Value> byw<E, byx<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(ccu<Value> $$0) {
         return new byw.d<>(new byy.a<>($$0));
      }

      public byw<E, Unit> a(byz<? super E> $$0) {
         return new byw.f<>($$0);
      }

      public <A> byw<E, A> a(A $$0) {
         return new byw.a<>($$0);
      }

      public <A> byw<E, A> a(Supplier<String> $$0, A $$1) {
         return new byw.a<>($$1, $$0);
      }

      public <A, R> Function<App<byw.c<E>, A>, App<byw.c<E>, R>> lift1(App<byw.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final byw.e<E, A> $$2 = (byw.e<E, A>)byw.b((App<byw.c<E>, M>)$$1);
            final byw.e<E, Function<A, R>> $$3 = byw.b($$0);
            return byw.a(new byw.e<E, R>() {
               @Override
               public R a(arf $$0, E $$1, long $$2x) {
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

      public <T, R> byw<E, R> a(final Function<? super T, ? extends R> $$0, App<byw.c<E>, T> $$1) {
         final byw.e<E, T> $$2 = (byw.e<E, T>)byw.b((App<byw.c<E>, M>)$$1);
         return byw.a(new byw.e<E, R>() {
            @Override
            public R a(arf $$0x, E $$1, long $$2x) {
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

      public <A, B, R> byw<E, R> a(App<byw.c<E>, BiFunction<A, B, R>> $$0, App<byw.c<E>, A> $$1, App<byw.c<E>, B> $$2) {
         final byw.e<E, A> $$3 = (byw.e<E, A>)byw.b((App<byw.c<E>, M>)$$1);
         final byw.e<E, B> $$4 = (byw.e<E, B>)byw.b((App<byw.c<E>, M>)$$2);
         final byw.e<E, BiFunction<A, B, R>> $$5 = byw.b($$0);
         return byw.a(new byw.e<E, R>() {
            @Override
            public R a(arf $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> byw<E, R> a(App<byw.c<E>, Function3<T1, T2, T3, R>> $$0, App<byw.c<E>, T1> $$1, App<byw.c<E>, T2> $$2, App<byw.c<E>, T3> $$3) {
         final byw.e<E, T1> $$4 = (byw.e<E, T1>)byw.b((App<byw.c<E>, M>)$$1);
         final byw.e<E, T2> $$5 = (byw.e<E, T2>)byw.b((App<byw.c<E>, M>)$$2);
         final byw.e<E, T3> $$6 = (byw.e<E, T3>)byw.b((App<byw.c<E>, M>)$$3);
         final byw.e<E, Function3<T1, T2, T3, R>> $$7 = byw.b($$0);
         return byw.a(new byw.e<E, R>() {
            @Override
            public R a(arf $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> byw<E, R> a(
         App<byw.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<byw.c<E>, T1> $$1, App<byw.c<E>, T2> $$2, App<byw.c<E>, T3> $$3, App<byw.c<E>, T4> $$4
      ) {
         final byw.e<E, T1> $$5 = (byw.e<E, T1>)byw.b((App<byw.c<E>, M>)$$1);
         final byw.e<E, T2> $$6 = (byw.e<E, T2>)byw.b((App<byw.c<E>, M>)$$2);
         final byw.e<E, T3> $$7 = (byw.e<E, T3>)byw.b((App<byw.c<E>, M>)$$3);
         final byw.e<E, T4> $$8 = (byw.e<E, T4>)byw.b((App<byw.c<E>, M>)$$4);
         final byw.e<E, Function4<T1, T2, T3, T4, R>> $$9 = byw.b($$0);
         return byw.a(new byw.e<E, R>() {
            @Override
            public R a(arf $$0, E $$1, long $$2) {
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

      static final class a<E extends btq> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends btq> implements K1 {
   }

   static final class d<E extends btq, F extends K1, Value> extends byw<E, byx<F, Value>> {
      d(final byy<F, Value> $$0) {
         super(new byw.e<E, byx<F, Value>>() {
            public byx<F, Value> b(arf $$0x, E $$1, long $$2) {
               bus<?> $$3 = $$1.dS();
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

   interface e<E extends btq, R> {
      @Nullable
      R a(arf var1, E var2, long var3);

      String a();
   }

   static final class f<E extends btq> extends byw<E, Unit> {
      f(final byz<? super E> $$0) {
         super(new byw.e<E, Unit>() {
            @Nullable
            public Unit b(arf $$0x, E $$1, long $$2) {
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
