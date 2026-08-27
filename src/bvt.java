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

public class bvt<E extends bqo, M> implements App<bvt.c<E>, M> {
   private final bvt.e<E, M> a;

   public static <E extends bqo, M> bvt<E, M> a(App<bvt.c<E>, M> $$0) {
      return (bvt<E, M>)$$0;
   }

   public static <E extends bqo> bvt.b<E> a() {
      return new bvt.b<>();
   }

   public static <E extends bqo> btr<E> a(Function<bvt.b<E>, ? extends App<bvt.c<E>, bvw<E>>> $$0) {
      final bvt.e<E, bvw<E>> $$1 = b((App<bvt.c<E>, bvw<E>>)$$0.apply(a()));
      return new btr<E>() {
         @Override
         public boolean trigger(aps $$0, E $$1x, long $$2) {
            bvw<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bqo> btr<E> a(bvw<? super E> $$0, bvw<? super E> $$1) {
      return a((Function<bvt.b<E>, ? extends App<bvt.c<E>, bvw<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bqo> btr<E> a(Predicate<E> $$0, btr<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bqo> btr<E> a(Predicate<E> $$0) {
      return a((Function<bvt.b<E>, ? extends App<bvt.c<E>, bvw<E>>>)($$1 -> $$1.a((bvw<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bqo> btr<E> a(BiPredicate<aps, E> $$0) {
      return a((Function<bvt.b<E>, ? extends App<bvt.c<E>, bvw<E>>>)($$1 -> $$1.a((bvw<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bqo, M> bvt.e<E, M> b(App<bvt.c<E>, M> $$0) {
      return a($$0).a;
   }

   bvt(bvt.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bqo, M> bvt<E, M> a(bvt.e<E, M> $$0) {
      return new bvt<>($$0);
   }

   static final class a<E extends bqo, A> extends bvt<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new bvt.e<E, A>() {
            @Override
            public A a(aps $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bqo> implements Applicative<bvt.c<E>, bvt.b.a<E>> {
      public <Value> Optional<Value> a(bvu<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(bvu<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> bvt<E, bvu<Mu, Value>> a(bzr<Value> $$0) {
         return new bvt.d<>(new bvv.c<>($$0));
      }

      public <Value> bvt<E, bvu<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(bzr<Value> $$0) {
         return new bvt.d<>(new bvv.b<>($$0));
      }

      public <Value> bvt<E, bvu<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(bzr<Value> $$0) {
         return new bvt.d<>(new bvv.a<>($$0));
      }

      public bvt<E, Unit> a(bvw<? super E> $$0) {
         return new bvt.f<>($$0);
      }

      public <A> bvt<E, A> a(A $$0) {
         return new bvt.a<>($$0);
      }

      public <A> bvt<E, A> a(Supplier<String> $$0, A $$1) {
         return new bvt.a<>($$1, $$0);
      }

      public <A, R> Function<App<bvt.c<E>, A>, App<bvt.c<E>, R>> lift1(App<bvt.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final bvt.e<E, A> $$2 = (bvt.e<E, A>)bvt.b((App<bvt.c<E>, M>)$$1);
            final bvt.e<E, Function<A, R>> $$3 = bvt.b($$0);
            return bvt.a(new bvt.e<E, R>() {
               @Override
               public R a(aps $$0, E $$1, long $$2x) {
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

      public <T, R> bvt<E, R> a(final Function<? super T, ? extends R> $$0, App<bvt.c<E>, T> $$1) {
         final bvt.e<E, T> $$2 = (bvt.e<E, T>)bvt.b((App<bvt.c<E>, M>)$$1);
         return bvt.a(new bvt.e<E, R>() {
            @Override
            public R a(aps $$0x, E $$1, long $$2x) {
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

      public <A, B, R> bvt<E, R> a(App<bvt.c<E>, BiFunction<A, B, R>> $$0, App<bvt.c<E>, A> $$1, App<bvt.c<E>, B> $$2) {
         final bvt.e<E, A> $$3 = (bvt.e<E, A>)bvt.b((App<bvt.c<E>, M>)$$1);
         final bvt.e<E, B> $$4 = (bvt.e<E, B>)bvt.b((App<bvt.c<E>, M>)$$2);
         final bvt.e<E, BiFunction<A, B, R>> $$5 = bvt.b($$0);
         return bvt.a(new bvt.e<E, R>() {
            @Override
            public R a(aps $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> bvt<E, R> a(App<bvt.c<E>, Function3<T1, T2, T3, R>> $$0, App<bvt.c<E>, T1> $$1, App<bvt.c<E>, T2> $$2, App<bvt.c<E>, T3> $$3) {
         final bvt.e<E, T1> $$4 = (bvt.e<E, T1>)bvt.b((App<bvt.c<E>, M>)$$1);
         final bvt.e<E, T2> $$5 = (bvt.e<E, T2>)bvt.b((App<bvt.c<E>, M>)$$2);
         final bvt.e<E, T3> $$6 = (bvt.e<E, T3>)bvt.b((App<bvt.c<E>, M>)$$3);
         final bvt.e<E, Function3<T1, T2, T3, R>> $$7 = bvt.b($$0);
         return bvt.a(new bvt.e<E, R>() {
            @Override
            public R a(aps $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> bvt<E, R> a(
         App<bvt.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<bvt.c<E>, T1> $$1, App<bvt.c<E>, T2> $$2, App<bvt.c<E>, T3> $$3, App<bvt.c<E>, T4> $$4
      ) {
         final bvt.e<E, T1> $$5 = (bvt.e<E, T1>)bvt.b((App<bvt.c<E>, M>)$$1);
         final bvt.e<E, T2> $$6 = (bvt.e<E, T2>)bvt.b((App<bvt.c<E>, M>)$$2);
         final bvt.e<E, T3> $$7 = (bvt.e<E, T3>)bvt.b((App<bvt.c<E>, M>)$$3);
         final bvt.e<E, T4> $$8 = (bvt.e<E, T4>)bvt.b((App<bvt.c<E>, M>)$$4);
         final bvt.e<E, Function4<T1, T2, T3, T4, R>> $$9 = bvt.b($$0);
         return bvt.a(new bvt.e<E, R>() {
            @Override
            public R a(aps $$0, E $$1, long $$2) {
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

      static final class a<E extends bqo> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bqo> implements K1 {
   }

   static final class d<E extends bqo, F extends K1, Value> extends bvt<E, bvu<F, Value>> {
      d(final bvv<F, Value> $$0) {
         super(new bvt.e<E, bvu<F, Value>>() {
            public bvu<F, Value> b(aps $$0x, E $$1, long $$2) {
               brp<?> $$3 = $$1.dP();
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

   interface e<E extends bqo, R> {
      @Nullable
      R a(aps var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bqo> extends bvt<E, Unit> {
      f(final bvw<? super E> $$0) {
         super(new bvt.e<E, Unit>() {
            @Nullable
            public Unit b(aps $$0x, E $$1, long $$2) {
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
