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

public class bqo<E extends bll, M> implements App<bqo.c<E>, M> {
   private final bqo.e<E, M> a;

   public static <E extends bll, M> bqo<E, M> a(App<bqo.c<E>, M> $$0) {
      return (bqo<E, M>)$$0;
   }

   public static <E extends bll> bqo.b<E> a() {
      return new bqo.b<>();
   }

   public static <E extends bll> bom<E> a(Function<bqo.b<E>, ? extends App<bqo.c<E>, bqr<E>>> $$0) {
      final bqo.e<E, bqr<E>> $$1 = b((App<bqo.c<E>, bqr<E>>)$$0.apply(a()));
      return new bom<E>() {
         @Override
         public boolean trigger(ami $$0, E $$1x, long $$2) {
            bqr<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bll> bom<E> a(bqr<? super E> $$0, bqr<? super E> $$1) {
      return a((Function<bqo.b<E>, ? extends App<bqo.c<E>, bqr<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bll> bom<E> a(Predicate<E> $$0, bom<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bll> bom<E> a(Predicate<E> $$0) {
      return a((Function<bqo.b<E>, ? extends App<bqo.c<E>, bqr<E>>>)($$1 -> $$1.a((bqr<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bll> bom<E> a(BiPredicate<ami, E> $$0) {
      return a((Function<bqo.b<E>, ? extends App<bqo.c<E>, bqr<E>>>)($$1 -> $$1.a((bqr<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bll, M> bqo.e<E, M> b(App<bqo.c<E>, M> $$0) {
      return a($$0).a;
   }

   bqo(bqo.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bll, M> bqo<E, M> a(bqo.e<E, M> $$0) {
      return new bqo<>($$0);
   }

   static final class a<E extends bll, A> extends bqo<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new bqo.e<E, A>() {
            @Override
            public A a(ami $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bll> implements Applicative<bqo.c<E>, bqo.b.a<E>> {
      public <Value> Optional<Value> a(bqp<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(bqp<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> bqo<E, bqp<Mu, Value>> a(bum<Value> $$0) {
         return new bqo.d<>(new bqq.c<>($$0));
      }

      public <Value> bqo<E, bqp<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(bum<Value> $$0) {
         return new bqo.d<>(new bqq.b<>($$0));
      }

      public <Value> bqo<E, bqp<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(bum<Value> $$0) {
         return new bqo.d<>(new bqq.a<>($$0));
      }

      public bqo<E, Unit> a(bqr<? super E> $$0) {
         return new bqo.f<>($$0);
      }

      public <A> bqo<E, A> a(A $$0) {
         return new bqo.a<>($$0);
      }

      public <A> bqo<E, A> a(Supplier<String> $$0, A $$1) {
         return new bqo.a<>($$1, $$0);
      }

      public <A, R> Function<App<bqo.c<E>, A>, App<bqo.c<E>, R>> lift1(App<bqo.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final bqo.e<E, A> $$2 = (bqo.e<E, A>)bqo.b((App<bqo.c<E>, M>)$$1);
            final bqo.e<E, Function<A, R>> $$3 = bqo.b($$0);
            return bqo.a(new bqo.e<E, R>() {
               @Override
               public R a(ami $$0, E $$1, long $$2x) {
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

      public <T, R> bqo<E, R> a(final Function<? super T, ? extends R> $$0, App<bqo.c<E>, T> $$1) {
         final bqo.e<E, T> $$2 = (bqo.e<E, T>)bqo.b((App<bqo.c<E>, M>)$$1);
         return bqo.a(new bqo.e<E, R>() {
            @Override
            public R a(ami $$0x, E $$1, long $$2x) {
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

      public <A, B, R> bqo<E, R> a(App<bqo.c<E>, BiFunction<A, B, R>> $$0, App<bqo.c<E>, A> $$1, App<bqo.c<E>, B> $$2) {
         final bqo.e<E, A> $$3 = (bqo.e<E, A>)bqo.b((App<bqo.c<E>, M>)$$1);
         final bqo.e<E, B> $$4 = (bqo.e<E, B>)bqo.b((App<bqo.c<E>, M>)$$2);
         final bqo.e<E, BiFunction<A, B, R>> $$5 = bqo.b($$0);
         return bqo.a(new bqo.e<E, R>() {
            @Override
            public R a(ami $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> bqo<E, R> a(App<bqo.c<E>, Function3<T1, T2, T3, R>> $$0, App<bqo.c<E>, T1> $$1, App<bqo.c<E>, T2> $$2, App<bqo.c<E>, T3> $$3) {
         final bqo.e<E, T1> $$4 = (bqo.e<E, T1>)bqo.b((App<bqo.c<E>, M>)$$1);
         final bqo.e<E, T2> $$5 = (bqo.e<E, T2>)bqo.b((App<bqo.c<E>, M>)$$2);
         final bqo.e<E, T3> $$6 = (bqo.e<E, T3>)bqo.b((App<bqo.c<E>, M>)$$3);
         final bqo.e<E, Function3<T1, T2, T3, R>> $$7 = bqo.b($$0);
         return bqo.a(new bqo.e<E, R>() {
            @Override
            public R a(ami $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> bqo<E, R> a(
         App<bqo.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<bqo.c<E>, T1> $$1, App<bqo.c<E>, T2> $$2, App<bqo.c<E>, T3> $$3, App<bqo.c<E>, T4> $$4
      ) {
         final bqo.e<E, T1> $$5 = (bqo.e<E, T1>)bqo.b((App<bqo.c<E>, M>)$$1);
         final bqo.e<E, T2> $$6 = (bqo.e<E, T2>)bqo.b((App<bqo.c<E>, M>)$$2);
         final bqo.e<E, T3> $$7 = (bqo.e<E, T3>)bqo.b((App<bqo.c<E>, M>)$$3);
         final bqo.e<E, T4> $$8 = (bqo.e<E, T4>)bqo.b((App<bqo.c<E>, M>)$$4);
         final bqo.e<E, Function4<T1, T2, T3, T4, R>> $$9 = bqo.b($$0);
         return bqo.a(new bqo.e<E, R>() {
            @Override
            public R a(ami $$0, E $$1, long $$2) {
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

      static final class a<E extends bll> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bll> implements K1 {
   }

   static final class d<E extends bll, F extends K1, Value> extends bqo<E, bqp<F, Value>> {
      d(final bqq<F, Value> $$0) {
         super(new bqo.e<E, bqp<F, Value>>() {
            public bqp<F, Value> b(ami $$0x, E $$1, long $$2) {
               bml<?> $$3 = $$1.dP();
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

   interface e<E extends bll, R> {
      @Nullable
      R a(ami var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bll> extends bqo<E, Unit> {
      f(final bqr<? super E> $$0) {
         super(new bqo.e<E, Unit>() {
            @Nullable
            public Unit b(ami $$0x, E $$1, long $$2) {
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
