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

public class bqz<E extends blv, M> implements App<bqz.c<E>, M> {
   private final bqz.e<E, M> a;

   public static <E extends blv, M> bqz<E, M> a(App<bqz.c<E>, M> $$0) {
      return (bqz<E, M>)$$0;
   }

   public static <E extends blv> bqz.b<E> a() {
      return new bqz.b<>();
   }

   public static <E extends blv> box<E> a(Function<bqz.b<E>, ? extends App<bqz.c<E>, brc<E>>> $$0) {
      final bqz.e<E, brc<E>> $$1 = b((App<bqz.c<E>, brc<E>>)$$0.apply(a()));
      return new box<E>() {
         @Override
         public boolean trigger(amp $$0, E $$1x, long $$2) {
            brc<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends blv> box<E> a(brc<? super E> $$0, brc<? super E> $$1) {
      return a((Function<bqz.b<E>, ? extends App<bqz.c<E>, brc<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends blv> box<E> a(Predicate<E> $$0, box<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends blv> box<E> a(Predicate<E> $$0) {
      return a((Function<bqz.b<E>, ? extends App<bqz.c<E>, brc<E>>>)($$1 -> $$1.a((brc<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends blv> box<E> a(BiPredicate<amp, E> $$0) {
      return a((Function<bqz.b<E>, ? extends App<bqz.c<E>, brc<E>>>)($$1 -> $$1.a((brc<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends blv, M> bqz.e<E, M> b(App<bqz.c<E>, M> $$0) {
      return a($$0).a;
   }

   bqz(bqz.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends blv, M> bqz<E, M> a(bqz.e<E, M> $$0) {
      return new bqz<>($$0);
   }

   static final class a<E extends blv, A> extends bqz<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new bqz.e<E, A>() {
            @Override
            public A a(amp $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends blv> implements Applicative<bqz.c<E>, bqz.b.a<E>> {
      public <Value> Optional<Value> a(bra<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(bra<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> bqz<E, bra<Mu, Value>> a(bux<Value> $$0) {
         return new bqz.d<>(new brb.c<>($$0));
      }

      public <Value> bqz<E, bra<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(bux<Value> $$0) {
         return new bqz.d<>(new brb.b<>($$0));
      }

      public <Value> bqz<E, bra<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(bux<Value> $$0) {
         return new bqz.d<>(new brb.a<>($$0));
      }

      public bqz<E, Unit> a(brc<? super E> $$0) {
         return new bqz.f<>($$0);
      }

      public <A> bqz<E, A> a(A $$0) {
         return new bqz.a<>($$0);
      }

      public <A> bqz<E, A> a(Supplier<String> $$0, A $$1) {
         return new bqz.a<>($$1, $$0);
      }

      public <A, R> Function<App<bqz.c<E>, A>, App<bqz.c<E>, R>> lift1(App<bqz.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final bqz.e<E, A> $$2 = (bqz.e<E, A>)bqz.b((App<bqz.c<E>, M>)$$1);
            final bqz.e<E, Function<A, R>> $$3 = bqz.b($$0);
            return bqz.a(new bqz.e<E, R>() {
               @Override
               public R a(amp $$0, E $$1, long $$2x) {
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

      public <T, R> bqz<E, R> a(final Function<? super T, ? extends R> $$0, App<bqz.c<E>, T> $$1) {
         final bqz.e<E, T> $$2 = (bqz.e<E, T>)bqz.b((App<bqz.c<E>, M>)$$1);
         return bqz.a(new bqz.e<E, R>() {
            @Override
            public R a(amp $$0x, E $$1, long $$2x) {
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

      public <A, B, R> bqz<E, R> a(App<bqz.c<E>, BiFunction<A, B, R>> $$0, App<bqz.c<E>, A> $$1, App<bqz.c<E>, B> $$2) {
         final bqz.e<E, A> $$3 = (bqz.e<E, A>)bqz.b((App<bqz.c<E>, M>)$$1);
         final bqz.e<E, B> $$4 = (bqz.e<E, B>)bqz.b((App<bqz.c<E>, M>)$$2);
         final bqz.e<E, BiFunction<A, B, R>> $$5 = bqz.b($$0);
         return bqz.a(new bqz.e<E, R>() {
            @Override
            public R a(amp $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> bqz<E, R> a(App<bqz.c<E>, Function3<T1, T2, T3, R>> $$0, App<bqz.c<E>, T1> $$1, App<bqz.c<E>, T2> $$2, App<bqz.c<E>, T3> $$3) {
         final bqz.e<E, T1> $$4 = (bqz.e<E, T1>)bqz.b((App<bqz.c<E>, M>)$$1);
         final bqz.e<E, T2> $$5 = (bqz.e<E, T2>)bqz.b((App<bqz.c<E>, M>)$$2);
         final bqz.e<E, T3> $$6 = (bqz.e<E, T3>)bqz.b((App<bqz.c<E>, M>)$$3);
         final bqz.e<E, Function3<T1, T2, T3, R>> $$7 = bqz.b($$0);
         return bqz.a(new bqz.e<E, R>() {
            @Override
            public R a(amp $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> bqz<E, R> a(
         App<bqz.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<bqz.c<E>, T1> $$1, App<bqz.c<E>, T2> $$2, App<bqz.c<E>, T3> $$3, App<bqz.c<E>, T4> $$4
      ) {
         final bqz.e<E, T1> $$5 = (bqz.e<E, T1>)bqz.b((App<bqz.c<E>, M>)$$1);
         final bqz.e<E, T2> $$6 = (bqz.e<E, T2>)bqz.b((App<bqz.c<E>, M>)$$2);
         final bqz.e<E, T3> $$7 = (bqz.e<E, T3>)bqz.b((App<bqz.c<E>, M>)$$3);
         final bqz.e<E, T4> $$8 = (bqz.e<E, T4>)bqz.b((App<bqz.c<E>, M>)$$4);
         final bqz.e<E, Function4<T1, T2, T3, T4, R>> $$9 = bqz.b($$0);
         return bqz.a(new bqz.e<E, R>() {
            @Override
            public R a(amp $$0, E $$1, long $$2) {
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

      static final class a<E extends blv> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends blv> implements K1 {
   }

   static final class d<E extends blv, F extends K1, Value> extends bqz<E, bra<F, Value>> {
      d(final brb<F, Value> $$0) {
         super(new bqz.e<E, bra<F, Value>>() {
            public bra<F, Value> b(amp $$0x, E $$1, long $$2) {
               bmv<?> $$3 = $$1.dO();
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

   interface e<E extends blv, R> {
      @Nullable
      R a(amp var1, E var2, long var3);

      String a();
   }

   static final class f<E extends blv> extends bqz<E, Unit> {
      f(final brc<? super E> $$0) {
         super(new bqz.e<E, Unit>() {
            @Nullable
            public Unit b(amp $$0x, E $$1, long $$2) {
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
