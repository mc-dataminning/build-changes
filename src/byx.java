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

public class byx<E extends btr, M> implements App<byx.c<E>, M> {
   private final byx.e<E, M> a;

   public static <E extends btr, M> byx<E, M> a(App<byx.c<E>, M> $$0) {
      return (byx<E, M>)$$0;
   }

   public static <E extends btr> byx.b<E> a() {
      return new byx.b<>();
   }

   public static <E extends btr> bwv<E> a(Function<byx.b<E>, ? extends App<byx.c<E>, bza<E>>> $$0) {
      final byx.e<E, bza<E>> $$1 = b((App<byx.c<E>, bza<E>>)$$0.apply(a()));
      return new bwv<E>() {
         @Override
         public boolean trigger(arf $$0, E $$1x, long $$2) {
            bza<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends btr> bwv<E> a(bza<? super E> $$0, bza<? super E> $$1) {
      return a((Function<byx.b<E>, ? extends App<byx.c<E>, bza<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends btr> bwv<E> a(Predicate<E> $$0, bwv<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends btr> bwv<E> a(Predicate<E> $$0) {
      return a((Function<byx.b<E>, ? extends App<byx.c<E>, bza<E>>>)($$1 -> $$1.a((bza<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends btr> bwv<E> a(BiPredicate<arf, E> $$0) {
      return a((Function<byx.b<E>, ? extends App<byx.c<E>, bza<E>>>)($$1 -> $$1.a((bza<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends btr, M> byx.e<E, M> b(App<byx.c<E>, M> $$0) {
      return a($$0).a;
   }

   byx(byx.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends btr, M> byx<E, M> a(byx.e<E, M> $$0) {
      return new byx<>($$0);
   }

   static final class a<E extends btr, A> extends byx<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new byx.e<E, A>() {
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

   public static final class b<E extends btr> implements Applicative<byx.c<E>, byx.b.a<E>> {
      public <Value> Optional<Value> a(byy<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(byy<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> byx<E, byy<Mu, Value>> a(ccv<Value> $$0) {
         return new byx.d<>(new byz.c<>($$0));
      }

      public <Value> byx<E, byy<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(ccv<Value> $$0) {
         return new byx.d<>(new byz.b<>($$0));
      }

      public <Value> byx<E, byy<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(ccv<Value> $$0) {
         return new byx.d<>(new byz.a<>($$0));
      }

      public byx<E, Unit> a(bza<? super E> $$0) {
         return new byx.f<>($$0);
      }

      public <A> byx<E, A> a(A $$0) {
         return new byx.a<>($$0);
      }

      public <A> byx<E, A> a(Supplier<String> $$0, A $$1) {
         return new byx.a<>($$1, $$0);
      }

      public <A, R> Function<App<byx.c<E>, A>, App<byx.c<E>, R>> lift1(App<byx.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final byx.e<E, A> $$2 = (byx.e<E, A>)byx.b((App<byx.c<E>, M>)$$1);
            final byx.e<E, Function<A, R>> $$3 = byx.b($$0);
            return byx.a(new byx.e<E, R>() {
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

      public <T, R> byx<E, R> a(final Function<? super T, ? extends R> $$0, App<byx.c<E>, T> $$1) {
         final byx.e<E, T> $$2 = (byx.e<E, T>)byx.b((App<byx.c<E>, M>)$$1);
         return byx.a(new byx.e<E, R>() {
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

      public <A, B, R> byx<E, R> a(App<byx.c<E>, BiFunction<A, B, R>> $$0, App<byx.c<E>, A> $$1, App<byx.c<E>, B> $$2) {
         final byx.e<E, A> $$3 = (byx.e<E, A>)byx.b((App<byx.c<E>, M>)$$1);
         final byx.e<E, B> $$4 = (byx.e<E, B>)byx.b((App<byx.c<E>, M>)$$2);
         final byx.e<E, BiFunction<A, B, R>> $$5 = byx.b($$0);
         return byx.a(new byx.e<E, R>() {
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

      public <T1, T2, T3, R> byx<E, R> a(App<byx.c<E>, Function3<T1, T2, T3, R>> $$0, App<byx.c<E>, T1> $$1, App<byx.c<E>, T2> $$2, App<byx.c<E>, T3> $$3) {
         final byx.e<E, T1> $$4 = (byx.e<E, T1>)byx.b((App<byx.c<E>, M>)$$1);
         final byx.e<E, T2> $$5 = (byx.e<E, T2>)byx.b((App<byx.c<E>, M>)$$2);
         final byx.e<E, T3> $$6 = (byx.e<E, T3>)byx.b((App<byx.c<E>, M>)$$3);
         final byx.e<E, Function3<T1, T2, T3, R>> $$7 = byx.b($$0);
         return byx.a(new byx.e<E, R>() {
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

      public <T1, T2, T3, T4, R> byx<E, R> a(
         App<byx.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<byx.c<E>, T1> $$1, App<byx.c<E>, T2> $$2, App<byx.c<E>, T3> $$3, App<byx.c<E>, T4> $$4
      ) {
         final byx.e<E, T1> $$5 = (byx.e<E, T1>)byx.b((App<byx.c<E>, M>)$$1);
         final byx.e<E, T2> $$6 = (byx.e<E, T2>)byx.b((App<byx.c<E>, M>)$$2);
         final byx.e<E, T3> $$7 = (byx.e<E, T3>)byx.b((App<byx.c<E>, M>)$$3);
         final byx.e<E, T4> $$8 = (byx.e<E, T4>)byx.b((App<byx.c<E>, M>)$$4);
         final byx.e<E, Function4<T1, T2, T3, T4, R>> $$9 = byx.b($$0);
         return byx.a(new byx.e<E, R>() {
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

      static final class a<E extends btr> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends btr> implements K1 {
   }

   static final class d<E extends btr, F extends K1, Value> extends byx<E, byy<F, Value>> {
      d(final byz<F, Value> $$0) {
         super(new byx.e<E, byy<F, Value>>() {
            public byy<F, Value> b(arf $$0x, E $$1, long $$2) {
               but<?> $$3 = $$1.dS();
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

   interface e<E extends btr, R> {
      @Nullable
      R a(arf var1, E var2, long var3);

      String a();
   }

   static final class f<E extends btr> extends byx<E, Unit> {
      f(final bza<? super E> $$0) {
         super(new byx.e<E, Unit>() {
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
