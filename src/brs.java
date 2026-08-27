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

public class brs<E extends bmo, M> implements App<brs.c<E>, M> {
   private final brs.e<E, M> a;

   public static <E extends bmo, M> brs<E, M> a(App<brs.c<E>, M> $$0) {
      return (brs<E, M>)$$0;
   }

   public static <E extends bmo> brs.b<E> a() {
      return new brs.b<>();
   }

   public static <E extends bmo> bpq<E> a(Function<brs.b<E>, ? extends App<brs.c<E>, brv<E>>> $$0) {
      final brs.e<E, brv<E>> $$1 = b((App<brs.c<E>, brv<E>>)$$0.apply(a()));
      return new bpq<E>() {
         @Override
         public boolean trigger(ane $$0, E $$1x, long $$2) {
            brv<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bmo> bpq<E> a(brv<? super E> $$0, brv<? super E> $$1) {
      return a((Function<brs.b<E>, ? extends App<brs.c<E>, brv<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bmo> bpq<E> a(Predicate<E> $$0, bpq<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bmo> bpq<E> a(Predicate<E> $$0) {
      return a((Function<brs.b<E>, ? extends App<brs.c<E>, brv<E>>>)($$1 -> $$1.a((brv<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bmo> bpq<E> a(BiPredicate<ane, E> $$0) {
      return a((Function<brs.b<E>, ? extends App<brs.c<E>, brv<E>>>)($$1 -> $$1.a((brv<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bmo, M> brs.e<E, M> b(App<brs.c<E>, M> $$0) {
      return a($$0).a;
   }

   brs(brs.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bmo, M> brs<E, M> a(brs.e<E, M> $$0) {
      return new brs<>($$0);
   }

   static final class a<E extends bmo, A> extends brs<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new brs.e<E, A>() {
            @Override
            public A a(ane $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bmo> implements Applicative<brs.c<E>, brs.b.a<E>> {
      public <Value> Optional<Value> a(brt<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(brt<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> brs<E, brt<Mu, Value>> a(bvq<Value> $$0) {
         return new brs.d<>(new bru.c<>($$0));
      }

      public <Value> brs<E, brt<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(bvq<Value> $$0) {
         return new brs.d<>(new bru.b<>($$0));
      }

      public <Value> brs<E, brt<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(bvq<Value> $$0) {
         return new brs.d<>(new bru.a<>($$0));
      }

      public brs<E, Unit> a(brv<? super E> $$0) {
         return new brs.f<>($$0);
      }

      public <A> brs<E, A> a(A $$0) {
         return new brs.a<>($$0);
      }

      public <A> brs<E, A> a(Supplier<String> $$0, A $$1) {
         return new brs.a<>($$1, $$0);
      }

      public <A, R> Function<App<brs.c<E>, A>, App<brs.c<E>, R>> lift1(App<brs.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final brs.e<E, A> $$2 = (brs.e<E, A>)brs.b((App<brs.c<E>, M>)$$1);
            final brs.e<E, Function<A, R>> $$3 = brs.b($$0);
            return brs.a(new brs.e<E, R>() {
               @Override
               public R a(ane $$0, E $$1, long $$2x) {
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

      public <T, R> brs<E, R> a(final Function<? super T, ? extends R> $$0, App<brs.c<E>, T> $$1) {
         final brs.e<E, T> $$2 = (brs.e<E, T>)brs.b((App<brs.c<E>, M>)$$1);
         return brs.a(new brs.e<E, R>() {
            @Override
            public R a(ane $$0x, E $$1, long $$2x) {
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

      public <A, B, R> brs<E, R> a(App<brs.c<E>, BiFunction<A, B, R>> $$0, App<brs.c<E>, A> $$1, App<brs.c<E>, B> $$2) {
         final brs.e<E, A> $$3 = (brs.e<E, A>)brs.b((App<brs.c<E>, M>)$$1);
         final brs.e<E, B> $$4 = (brs.e<E, B>)brs.b((App<brs.c<E>, M>)$$2);
         final brs.e<E, BiFunction<A, B, R>> $$5 = brs.b($$0);
         return brs.a(new brs.e<E, R>() {
            @Override
            public R a(ane $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> brs<E, R> a(App<brs.c<E>, Function3<T1, T2, T3, R>> $$0, App<brs.c<E>, T1> $$1, App<brs.c<E>, T2> $$2, App<brs.c<E>, T3> $$3) {
         final brs.e<E, T1> $$4 = (brs.e<E, T1>)brs.b((App<brs.c<E>, M>)$$1);
         final brs.e<E, T2> $$5 = (brs.e<E, T2>)brs.b((App<brs.c<E>, M>)$$2);
         final brs.e<E, T3> $$6 = (brs.e<E, T3>)brs.b((App<brs.c<E>, M>)$$3);
         final brs.e<E, Function3<T1, T2, T3, R>> $$7 = brs.b($$0);
         return brs.a(new brs.e<E, R>() {
            @Override
            public R a(ane $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> brs<E, R> a(
         App<brs.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<brs.c<E>, T1> $$1, App<brs.c<E>, T2> $$2, App<brs.c<E>, T3> $$3, App<brs.c<E>, T4> $$4
      ) {
         final brs.e<E, T1> $$5 = (brs.e<E, T1>)brs.b((App<brs.c<E>, M>)$$1);
         final brs.e<E, T2> $$6 = (brs.e<E, T2>)brs.b((App<brs.c<E>, M>)$$2);
         final brs.e<E, T3> $$7 = (brs.e<E, T3>)brs.b((App<brs.c<E>, M>)$$3);
         final brs.e<E, T4> $$8 = (brs.e<E, T4>)brs.b((App<brs.c<E>, M>)$$4);
         final brs.e<E, Function4<T1, T2, T3, T4, R>> $$9 = brs.b($$0);
         return brs.a(new brs.e<E, R>() {
            @Override
            public R a(ane $$0, E $$1, long $$2) {
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

      static final class a<E extends bmo> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bmo> implements K1 {
   }

   static final class d<E extends bmo, F extends K1, Value> extends brs<E, brt<F, Value>> {
      d(final bru<F, Value> $$0) {
         super(new brs.e<E, brt<F, Value>>() {
            public brt<F, Value> b(ane $$0x, E $$1, long $$2) {
               bno<?> $$3 = $$1.dN();
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

   interface e<E extends bmo, R> {
      @Nullable
      R a(ane var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bmo> extends brs<E, Unit> {
      f(final brv<? super E> $$0) {
         super(new brs.e<E, Unit>() {
            @Nullable
            public Unit b(ane $$0x, E $$1, long $$2) {
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
