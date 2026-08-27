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

public class bxf<E extends bsa, M> implements App<bxf.c<E>, M> {
   private final bxf.e<E, M> a;

   public static <E extends bsa, M> bxf<E, M> a(App<bxf.c<E>, M> $$0) {
      return (bxf<E, M>)$$0;
   }

   public static <E extends bsa> bxf.b<E> a() {
      return new bxf.b<>();
   }

   public static <E extends bsa> bvd<E> a(Function<bxf.b<E>, ? extends App<bxf.c<E>, bxi<E>>> $$0) {
      final bxf.e<E, bxi<E>> $$1 = b((App<bxf.c<E>, bxi<E>>)$$0.apply(a()));
      return new bvd<E>() {
         @Override
         public boolean trigger(aqh $$0, E $$1x, long $$2) {
            bxi<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bsa> bvd<E> a(bxi<? super E> $$0, bxi<? super E> $$1) {
      return a((Function<bxf.b<E>, ? extends App<bxf.c<E>, bxi<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bsa> bvd<E> a(Predicate<E> $$0, bvd<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bsa> bvd<E> a(Predicate<E> $$0) {
      return a((Function<bxf.b<E>, ? extends App<bxf.c<E>, bxi<E>>>)($$1 -> $$1.a((bxi<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bsa> bvd<E> a(BiPredicate<aqh, E> $$0) {
      return a((Function<bxf.b<E>, ? extends App<bxf.c<E>, bxi<E>>>)($$1 -> $$1.a((bxi<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bsa, M> bxf.e<E, M> b(App<bxf.c<E>, M> $$0) {
      return a($$0).a;
   }

   bxf(bxf.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bsa, M> bxf<E, M> a(bxf.e<E, M> $$0) {
      return new bxf<>($$0);
   }

   static final class a<E extends bsa, A> extends bxf<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new bxf.e<E, A>() {
            @Override
            public A a(aqh $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bsa> implements Applicative<bxf.c<E>, bxf.b.a<E>> {
      public <Value> Optional<Value> a(bxg<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(bxg<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> bxf<E, bxg<Mu, Value>> a(cbd<Value> $$0) {
         return new bxf.d<>(new bxh.c<>($$0));
      }

      public <Value> bxf<E, bxg<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(cbd<Value> $$0) {
         return new bxf.d<>(new bxh.b<>($$0));
      }

      public <Value> bxf<E, bxg<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(cbd<Value> $$0) {
         return new bxf.d<>(new bxh.a<>($$0));
      }

      public bxf<E, Unit> a(bxi<? super E> $$0) {
         return new bxf.f<>($$0);
      }

      public <A> bxf<E, A> a(A $$0) {
         return new bxf.a<>($$0);
      }

      public <A> bxf<E, A> a(Supplier<String> $$0, A $$1) {
         return new bxf.a<>($$1, $$0);
      }

      public <A, R> Function<App<bxf.c<E>, A>, App<bxf.c<E>, R>> lift1(App<bxf.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final bxf.e<E, A> $$2 = (bxf.e<E, A>)bxf.b((App<bxf.c<E>, M>)$$1);
            final bxf.e<E, Function<A, R>> $$3 = bxf.b($$0);
            return bxf.a(new bxf.e<E, R>() {
               @Override
               public R a(aqh $$0, E $$1, long $$2x) {
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

      public <T, R> bxf<E, R> a(final Function<? super T, ? extends R> $$0, App<bxf.c<E>, T> $$1) {
         final bxf.e<E, T> $$2 = (bxf.e<E, T>)bxf.b((App<bxf.c<E>, M>)$$1);
         return bxf.a(new bxf.e<E, R>() {
            @Override
            public R a(aqh $$0x, E $$1, long $$2x) {
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

      public <A, B, R> bxf<E, R> a(App<bxf.c<E>, BiFunction<A, B, R>> $$0, App<bxf.c<E>, A> $$1, App<bxf.c<E>, B> $$2) {
         final bxf.e<E, A> $$3 = (bxf.e<E, A>)bxf.b((App<bxf.c<E>, M>)$$1);
         final bxf.e<E, B> $$4 = (bxf.e<E, B>)bxf.b((App<bxf.c<E>, M>)$$2);
         final bxf.e<E, BiFunction<A, B, R>> $$5 = bxf.b($$0);
         return bxf.a(new bxf.e<E, R>() {
            @Override
            public R a(aqh $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> bxf<E, R> a(App<bxf.c<E>, Function3<T1, T2, T3, R>> $$0, App<bxf.c<E>, T1> $$1, App<bxf.c<E>, T2> $$2, App<bxf.c<E>, T3> $$3) {
         final bxf.e<E, T1> $$4 = (bxf.e<E, T1>)bxf.b((App<bxf.c<E>, M>)$$1);
         final bxf.e<E, T2> $$5 = (bxf.e<E, T2>)bxf.b((App<bxf.c<E>, M>)$$2);
         final bxf.e<E, T3> $$6 = (bxf.e<E, T3>)bxf.b((App<bxf.c<E>, M>)$$3);
         final bxf.e<E, Function3<T1, T2, T3, R>> $$7 = bxf.b($$0);
         return bxf.a(new bxf.e<E, R>() {
            @Override
            public R a(aqh $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> bxf<E, R> a(
         App<bxf.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<bxf.c<E>, T1> $$1, App<bxf.c<E>, T2> $$2, App<bxf.c<E>, T3> $$3, App<bxf.c<E>, T4> $$4
      ) {
         final bxf.e<E, T1> $$5 = (bxf.e<E, T1>)bxf.b((App<bxf.c<E>, M>)$$1);
         final bxf.e<E, T2> $$6 = (bxf.e<E, T2>)bxf.b((App<bxf.c<E>, M>)$$2);
         final bxf.e<E, T3> $$7 = (bxf.e<E, T3>)bxf.b((App<bxf.c<E>, M>)$$3);
         final bxf.e<E, T4> $$8 = (bxf.e<E, T4>)bxf.b((App<bxf.c<E>, M>)$$4);
         final bxf.e<E, Function4<T1, T2, T3, T4, R>> $$9 = bxf.b($$0);
         return bxf.a(new bxf.e<E, R>() {
            @Override
            public R a(aqh $$0, E $$1, long $$2) {
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

      static final class a<E extends bsa> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bsa> implements K1 {
   }

   static final class d<E extends bsa, F extends K1, Value> extends bxf<E, bxg<F, Value>> {
      d(final bxh<F, Value> $$0) {
         super(new bxf.e<E, bxg<F, Value>>() {
            public bxg<F, Value> b(aqh $$0x, E $$1, long $$2) {
               btb<?> $$3 = $$1.dQ();
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

   interface e<E extends bsa, R> {
      @Nullable
      R a(aqh var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bsa> extends bxf<E, Unit> {
      f(final bxi<? super E> $$0) {
         super(new bxf.e<E, Unit>() {
            @Nullable
            public Unit b(aqh $$0x, E $$1, long $$2) {
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
