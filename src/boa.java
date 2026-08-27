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

public class boa<E extends biw, M> implements App<boa.c<E>, M> {
   private final boa.e<E, M> a;

   public static <E extends biw, M> boa<E, M> a(App<boa.c<E>, M> $$0) {
      return (boa<E, M>)$$0;
   }

   public static <E extends biw> boa.b<E> a() {
      return new boa.b<>();
   }

   public static <E extends biw> bly<E> a(Function<boa.b<E>, ? extends App<boa.c<E>, bod<E>>> $$0) {
      final boa.e<E, bod<E>> $$1 = b((App<boa.c<E>, bod<E>>)$$0.apply(a()));
      return new bly<E>() {
         @Override
         public boolean trigger(aki $$0, E $$1x, long $$2) {
            bod<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends biw> bly<E> a(bod<? super E> $$0, bod<? super E> $$1) {
      return a((Function<boa.b<E>, ? extends App<boa.c<E>, bod<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends biw> bly<E> a(Predicate<E> $$0, bly<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends biw> bly<E> a(Predicate<E> $$0) {
      return a((Function<boa.b<E>, ? extends App<boa.c<E>, bod<E>>>)($$1 -> $$1.a((bod<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends biw> bly<E> a(BiPredicate<aki, E> $$0) {
      return a((Function<boa.b<E>, ? extends App<boa.c<E>, bod<E>>>)($$1 -> $$1.a((bod<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends biw, M> boa.e<E, M> b(App<boa.c<E>, M> $$0) {
      return a($$0).a;
   }

   boa(boa.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends biw, M> boa<E, M> a(boa.e<E, M> $$0) {
      return new boa<>($$0);
   }

   static final class a<E extends biw, A> extends boa<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new boa.e<E, A>() {
            @Override
            public A a(aki $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends biw> implements Applicative<boa.c<E>, boa.b.a<E>> {
      public <Value> Optional<Value> a(bob<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(bob<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> boa<E, bob<Mu, Value>> a(bry<Value> $$0) {
         return new boa.d<>(new boc.c<>($$0));
      }

      public <Value> boa<E, bob<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(bry<Value> $$0) {
         return new boa.d<>(new boc.b<>($$0));
      }

      public <Value> boa<E, bob<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(bry<Value> $$0) {
         return new boa.d<>(new boc.a<>($$0));
      }

      public boa<E, Unit> a(bod<? super E> $$0) {
         return new boa.f<>($$0);
      }

      public <A> boa<E, A> a(A $$0) {
         return new boa.a<>($$0);
      }

      public <A> boa<E, A> a(Supplier<String> $$0, A $$1) {
         return new boa.a<>($$1, $$0);
      }

      public <A, R> Function<App<boa.c<E>, A>, App<boa.c<E>, R>> lift1(App<boa.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final boa.e<E, A> $$2 = (boa.e<E, A>)boa.b((App<boa.c<E>, M>)$$1);
            final boa.e<E, Function<A, R>> $$3 = boa.b($$0);
            return boa.a(new boa.e<E, R>() {
               @Override
               public R a(aki $$0, E $$1, long $$2x) {
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

      public <T, R> boa<E, R> a(final Function<? super T, ? extends R> $$0, App<boa.c<E>, T> $$1) {
         final boa.e<E, T> $$2 = (boa.e<E, T>)boa.b((App<boa.c<E>, M>)$$1);
         return boa.a(new boa.e<E, R>() {
            @Override
            public R a(aki $$0x, E $$1, long $$2x) {
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

      public <A, B, R> boa<E, R> a(App<boa.c<E>, BiFunction<A, B, R>> $$0, App<boa.c<E>, A> $$1, App<boa.c<E>, B> $$2) {
         final boa.e<E, A> $$3 = (boa.e<E, A>)boa.b((App<boa.c<E>, M>)$$1);
         final boa.e<E, B> $$4 = (boa.e<E, B>)boa.b((App<boa.c<E>, M>)$$2);
         final boa.e<E, BiFunction<A, B, R>> $$5 = boa.b($$0);
         return boa.a(new boa.e<E, R>() {
            @Override
            public R a(aki $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> boa<E, R> a(App<boa.c<E>, Function3<T1, T2, T3, R>> $$0, App<boa.c<E>, T1> $$1, App<boa.c<E>, T2> $$2, App<boa.c<E>, T3> $$3) {
         final boa.e<E, T1> $$4 = (boa.e<E, T1>)boa.b((App<boa.c<E>, M>)$$1);
         final boa.e<E, T2> $$5 = (boa.e<E, T2>)boa.b((App<boa.c<E>, M>)$$2);
         final boa.e<E, T3> $$6 = (boa.e<E, T3>)boa.b((App<boa.c<E>, M>)$$3);
         final boa.e<E, Function3<T1, T2, T3, R>> $$7 = boa.b($$0);
         return boa.a(new boa.e<E, R>() {
            @Override
            public R a(aki $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> boa<E, R> a(
         App<boa.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<boa.c<E>, T1> $$1, App<boa.c<E>, T2> $$2, App<boa.c<E>, T3> $$3, App<boa.c<E>, T4> $$4
      ) {
         final boa.e<E, T1> $$5 = (boa.e<E, T1>)boa.b((App<boa.c<E>, M>)$$1);
         final boa.e<E, T2> $$6 = (boa.e<E, T2>)boa.b((App<boa.c<E>, M>)$$2);
         final boa.e<E, T3> $$7 = (boa.e<E, T3>)boa.b((App<boa.c<E>, M>)$$3);
         final boa.e<E, T4> $$8 = (boa.e<E, T4>)boa.b((App<boa.c<E>, M>)$$4);
         final boa.e<E, Function4<T1, T2, T3, T4, R>> $$9 = boa.b($$0);
         return boa.a(new boa.e<E, R>() {
            @Override
            public R a(aki $$0, E $$1, long $$2) {
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

      static final class a<E extends biw> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends biw> implements K1 {
   }

   static final class d<E extends biw, F extends K1, Value> extends boa<E, bob<F, Value>> {
      d(final boc<F, Value> $$0) {
         super(new boa.e<E, bob<F, Value>>() {
            public bob<F, Value> b(aki $$0x, E $$1, long $$2) {
               bjx<?> $$3 = $$1.dM();
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

   interface e<E extends biw, R> {
      @Nullable
      R a(aki var1, E var2, long var3);

      String a();
   }

   static final class f<E extends biw> extends boa<E, Unit> {
      f(final bod<? super E> $$0) {
         super(new boa.e<E, Unit>() {
            @Nullable
            public Unit b(aki $$0x, E $$1, long $$2) {
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
