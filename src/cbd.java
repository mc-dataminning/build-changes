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

public class cbd<E extends bvx, M> implements App<cbd.c<E>, M> {
   private final cbd.e<E, M> a;

   public static <E extends bvx, M> cbd<E, M> a(App<cbd.c<E>, M> $$0) {
      return (cbd<E, M>)$$0;
   }

   public static <E extends bvx> cbd.b<E> a() {
      return new cbd.b<>();
   }

   public static <E extends bvx> bzb<E> a(Function<cbd.b<E>, ? extends App<cbd.c<E>, cbg<E>>> $$0) {
      final cbd.e<E, cbg<E>> $$1 = b((App<cbd.c<E>, cbg<E>>)$$0.apply(a()));
      return new bzb<E>() {
         @Override
         public boolean trigger(arx $$0, E $$1x, long $$2) {
            cbg<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bvx> bzb<E> a(cbg<? super E> $$0, cbg<? super E> $$1) {
      return a((Function<cbd.b<E>, ? extends App<cbd.c<E>, cbg<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bvx> bzb<E> a(Predicate<E> $$0, bzb<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bvx> bzb<E> a(Predicate<E> $$0) {
      return a((Function<cbd.b<E>, ? extends App<cbd.c<E>, cbg<E>>>)($$1 -> $$1.a((cbg<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bvx> bzb<E> a(BiPredicate<arx, E> $$0) {
      return a((Function<cbd.b<E>, ? extends App<cbd.c<E>, cbg<E>>>)($$1 -> $$1.a((cbg<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bvx, M> cbd.e<E, M> b(App<cbd.c<E>, M> $$0) {
      return a($$0).a;
   }

   cbd(cbd.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bvx, M> cbd<E, M> a(cbd.e<E, M> $$0) {
      return new cbd<>($$0);
   }

   static final class a<E extends bvx, A> extends cbd<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new cbd.e<E, A>() {
            @Override
            public A a(arx $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bvx> implements Applicative<cbd.c<E>, cbd.b.a<E>> {
      public <Value> Optional<Value> a(cbe<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(cbe<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> cbd<E, cbe<Mu, Value>> a(cfb<Value> $$0) {
         return new cbd.d<>(new cbf.c<>($$0));
      }

      public <Value> cbd<E, cbe<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(cfb<Value> $$0) {
         return new cbd.d<>(new cbf.b<>($$0));
      }

      public <Value> cbd<E, cbe<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(cfb<Value> $$0) {
         return new cbd.d<>(new cbf.a<>($$0));
      }

      public cbd<E, Unit> a(cbg<? super E> $$0) {
         return new cbd.f<>($$0);
      }

      public <A> cbd<E, A> a(A $$0) {
         return new cbd.a<>($$0);
      }

      public <A> cbd<E, A> a(Supplier<String> $$0, A $$1) {
         return new cbd.a<>($$1, $$0);
      }

      public <A, R> Function<App<cbd.c<E>, A>, App<cbd.c<E>, R>> lift1(App<cbd.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final cbd.e<E, A> $$2 = (cbd.e<E, A>)cbd.b((App<cbd.c<E>, M>)$$1);
            final cbd.e<E, Function<A, R>> $$3 = cbd.b($$0);
            return cbd.a(new cbd.e<E, R>() {
               @Override
               public R a(arx $$0, E $$1, long $$2x) {
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

      public <T, R> cbd<E, R> a(final Function<? super T, ? extends R> $$0, App<cbd.c<E>, T> $$1) {
         final cbd.e<E, T> $$2 = (cbd.e<E, T>)cbd.b((App<cbd.c<E>, M>)$$1);
         return cbd.a(new cbd.e<E, R>() {
            @Override
            public R a(arx $$0x, E $$1, long $$2x) {
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

      public <A, B, R> cbd<E, R> a(App<cbd.c<E>, BiFunction<A, B, R>> $$0, App<cbd.c<E>, A> $$1, App<cbd.c<E>, B> $$2) {
         final cbd.e<E, A> $$3 = (cbd.e<E, A>)cbd.b((App<cbd.c<E>, M>)$$1);
         final cbd.e<E, B> $$4 = (cbd.e<E, B>)cbd.b((App<cbd.c<E>, M>)$$2);
         final cbd.e<E, BiFunction<A, B, R>> $$5 = cbd.b($$0);
         return cbd.a(new cbd.e<E, R>() {
            @Override
            public R a(arx $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> cbd<E, R> a(App<cbd.c<E>, Function3<T1, T2, T3, R>> $$0, App<cbd.c<E>, T1> $$1, App<cbd.c<E>, T2> $$2, App<cbd.c<E>, T3> $$3) {
         final cbd.e<E, T1> $$4 = (cbd.e<E, T1>)cbd.b((App<cbd.c<E>, M>)$$1);
         final cbd.e<E, T2> $$5 = (cbd.e<E, T2>)cbd.b((App<cbd.c<E>, M>)$$2);
         final cbd.e<E, T3> $$6 = (cbd.e<E, T3>)cbd.b((App<cbd.c<E>, M>)$$3);
         final cbd.e<E, Function3<T1, T2, T3, R>> $$7 = cbd.b($$0);
         return cbd.a(new cbd.e<E, R>() {
            @Override
            public R a(arx $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> cbd<E, R> a(
         App<cbd.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<cbd.c<E>, T1> $$1, App<cbd.c<E>, T2> $$2, App<cbd.c<E>, T3> $$3, App<cbd.c<E>, T4> $$4
      ) {
         final cbd.e<E, T1> $$5 = (cbd.e<E, T1>)cbd.b((App<cbd.c<E>, M>)$$1);
         final cbd.e<E, T2> $$6 = (cbd.e<E, T2>)cbd.b((App<cbd.c<E>, M>)$$2);
         final cbd.e<E, T3> $$7 = (cbd.e<E, T3>)cbd.b((App<cbd.c<E>, M>)$$3);
         final cbd.e<E, T4> $$8 = (cbd.e<E, T4>)cbd.b((App<cbd.c<E>, M>)$$4);
         final cbd.e<E, Function4<T1, T2, T3, T4, R>> $$9 = cbd.b($$0);
         return cbd.a(new cbd.e<E, R>() {
            @Override
            public R a(arx $$0, E $$1, long $$2) {
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

      static final class a<E extends bvx> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bvx> implements K1 {
   }

   static final class d<E extends bvx, F extends K1, Value> extends cbd<E, cbe<F, Value>> {
      d(final cbf<F, Value> $$0) {
         super(new cbd.e<E, cbe<F, Value>>() {
            public cbe<F, Value> b(arx $$0x, E $$1, long $$2) {
               bwz<?> $$3 = $$1.ec();
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

   interface e<E extends bvx, R> {
      @Nullable
      R a(arx var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bvx> extends cbd<E, Unit> {
      f(final cbg<? super E> $$0) {
         super(new cbd.e<E, Unit>() {
            @Nullable
            public Unit b(arx $$0x, E $$1, long $$2) {
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
