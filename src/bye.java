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

public class bye<E extends bsy, M> implements App<bye.c<E>, M> {
   private final bye.e<E, M> a;

   public static <E extends bsy, M> bye<E, M> a(App<bye.c<E>, M> $$0) {
      return (bye<E, M>)$$0;
   }

   public static <E extends bsy> bye.b<E> a() {
      return new bye.b<>();
   }

   public static <E extends bsy> bwc<E> a(Function<bye.b<E>, ? extends App<bye.c<E>, byh<E>>> $$0) {
      final bye.e<E, byh<E>> $$1 = b((App<bye.c<E>, byh<E>>)$$0.apply(a()));
      return new bwc<E>() {
         @Override
         public boolean trigger(aqk $$0, E $$1x, long $$2) {
            byh<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bsy> bwc<E> a(byh<? super E> $$0, byh<? super E> $$1) {
      return a((Function<bye.b<E>, ? extends App<bye.c<E>, byh<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bsy> bwc<E> a(Predicate<E> $$0, bwc<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bsy> bwc<E> a(Predicate<E> $$0) {
      return a((Function<bye.b<E>, ? extends App<bye.c<E>, byh<E>>>)($$1 -> $$1.a((byh<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bsy> bwc<E> a(BiPredicate<aqk, E> $$0) {
      return a((Function<bye.b<E>, ? extends App<bye.c<E>, byh<E>>>)($$1 -> $$1.a((byh<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bsy, M> bye.e<E, M> b(App<bye.c<E>, M> $$0) {
      return a($$0).a;
   }

   bye(bye.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bsy, M> bye<E, M> a(bye.e<E, M> $$0) {
      return new bye<>($$0);
   }

   static final class a<E extends bsy, A> extends bye<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new bye.e<E, A>() {
            @Override
            public A a(aqk $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bsy> implements Applicative<bye.c<E>, bye.b.a<E>> {
      public <Value> Optional<Value> a(byf<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(byf<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> bye<E, byf<Mu, Value>> a(ccc<Value> $$0) {
         return new bye.d<>(new byg.c<>($$0));
      }

      public <Value> bye<E, byf<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(ccc<Value> $$0) {
         return new bye.d<>(new byg.b<>($$0));
      }

      public <Value> bye<E, byf<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(ccc<Value> $$0) {
         return new bye.d<>(new byg.a<>($$0));
      }

      public bye<E, Unit> a(byh<? super E> $$0) {
         return new bye.f<>($$0);
      }

      public <A> bye<E, A> a(A $$0) {
         return new bye.a<>($$0);
      }

      public <A> bye<E, A> a(Supplier<String> $$0, A $$1) {
         return new bye.a<>($$1, $$0);
      }

      public <A, R> Function<App<bye.c<E>, A>, App<bye.c<E>, R>> lift1(App<bye.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final bye.e<E, A> $$2 = (bye.e<E, A>)bye.b((App<bye.c<E>, M>)$$1);
            final bye.e<E, Function<A, R>> $$3 = bye.b($$0);
            return bye.a(new bye.e<E, R>() {
               @Override
               public R a(aqk $$0, E $$1, long $$2x) {
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

      public <T, R> bye<E, R> a(final Function<? super T, ? extends R> $$0, App<bye.c<E>, T> $$1) {
         final bye.e<E, T> $$2 = (bye.e<E, T>)bye.b((App<bye.c<E>, M>)$$1);
         return bye.a(new bye.e<E, R>() {
            @Override
            public R a(aqk $$0x, E $$1, long $$2x) {
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

      public <A, B, R> bye<E, R> a(App<bye.c<E>, BiFunction<A, B, R>> $$0, App<bye.c<E>, A> $$1, App<bye.c<E>, B> $$2) {
         final bye.e<E, A> $$3 = (bye.e<E, A>)bye.b((App<bye.c<E>, M>)$$1);
         final bye.e<E, B> $$4 = (bye.e<E, B>)bye.b((App<bye.c<E>, M>)$$2);
         final bye.e<E, BiFunction<A, B, R>> $$5 = bye.b($$0);
         return bye.a(new bye.e<E, R>() {
            @Override
            public R a(aqk $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> bye<E, R> a(App<bye.c<E>, Function3<T1, T2, T3, R>> $$0, App<bye.c<E>, T1> $$1, App<bye.c<E>, T2> $$2, App<bye.c<E>, T3> $$3) {
         final bye.e<E, T1> $$4 = (bye.e<E, T1>)bye.b((App<bye.c<E>, M>)$$1);
         final bye.e<E, T2> $$5 = (bye.e<E, T2>)bye.b((App<bye.c<E>, M>)$$2);
         final bye.e<E, T3> $$6 = (bye.e<E, T3>)bye.b((App<bye.c<E>, M>)$$3);
         final bye.e<E, Function3<T1, T2, T3, R>> $$7 = bye.b($$0);
         return bye.a(new bye.e<E, R>() {
            @Override
            public R a(aqk $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> bye<E, R> a(
         App<bye.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<bye.c<E>, T1> $$1, App<bye.c<E>, T2> $$2, App<bye.c<E>, T3> $$3, App<bye.c<E>, T4> $$4
      ) {
         final bye.e<E, T1> $$5 = (bye.e<E, T1>)bye.b((App<bye.c<E>, M>)$$1);
         final bye.e<E, T2> $$6 = (bye.e<E, T2>)bye.b((App<bye.c<E>, M>)$$2);
         final bye.e<E, T3> $$7 = (bye.e<E, T3>)bye.b((App<bye.c<E>, M>)$$3);
         final bye.e<E, T4> $$8 = (bye.e<E, T4>)bye.b((App<bye.c<E>, M>)$$4);
         final bye.e<E, Function4<T1, T2, T3, T4, R>> $$9 = bye.b($$0);
         return bye.a(new bye.e<E, R>() {
            @Override
            public R a(aqk $$0, E $$1, long $$2) {
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

      static final class a<E extends bsy> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bsy> implements K1 {
   }

   static final class d<E extends bsy, F extends K1, Value> extends bye<E, byf<F, Value>> {
      d(final byg<F, Value> $$0) {
         super(new bye.e<E, byf<F, Value>>() {
            public byf<F, Value> b(aqk $$0x, E $$1, long $$2) {
               bua<?> $$3 = $$1.dT();
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

   interface e<E extends bsy, R> {
      @Nullable
      R a(aqk var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bsy> extends bye<E, Unit> {
      f(final byh<? super E> $$0) {
         super(new bye.e<E, Unit>() {
            @Nullable
            public Unit b(aqk $$0x, E $$1, long $$2) {
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
