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

public class byh<E extends btb, M> implements App<byh.c<E>, M> {
   private final byh.e<E, M> a;

   public static <E extends btb, M> byh<E, M> a(App<byh.c<E>, M> $$0) {
      return (byh<E, M>)$$0;
   }

   public static <E extends btb> byh.b<E> a() {
      return new byh.b<>();
   }

   public static <E extends btb> bwf<E> a(Function<byh.b<E>, ? extends App<byh.c<E>, byk<E>>> $$0) {
      final byh.e<E, byk<E>> $$1 = b((App<byh.c<E>, byk<E>>)$$0.apply(a()));
      return new bwf<E>() {
         @Override
         public boolean trigger(aqm $$0, E $$1x, long $$2) {
            byk<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends btb> bwf<E> a(byk<? super E> $$0, byk<? super E> $$1) {
      return a((Function<byh.b<E>, ? extends App<byh.c<E>, byk<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends btb> bwf<E> a(Predicate<E> $$0, bwf<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends btb> bwf<E> a(Predicate<E> $$0) {
      return a((Function<byh.b<E>, ? extends App<byh.c<E>, byk<E>>>)($$1 -> $$1.a((byk<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends btb> bwf<E> a(BiPredicate<aqm, E> $$0) {
      return a((Function<byh.b<E>, ? extends App<byh.c<E>, byk<E>>>)($$1 -> $$1.a((byk<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends btb, M> byh.e<E, M> b(App<byh.c<E>, M> $$0) {
      return a($$0).a;
   }

   byh(byh.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends btb, M> byh<E, M> a(byh.e<E, M> $$0) {
      return new byh<>($$0);
   }

   static final class a<E extends btb, A> extends byh<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new byh.e<E, A>() {
            @Override
            public A a(aqm $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends btb> implements Applicative<byh.c<E>, byh.b.a<E>> {
      public <Value> Optional<Value> a(byi<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(byi<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> byh<E, byi<Mu, Value>> a(ccf<Value> $$0) {
         return new byh.d<>(new byj.c<>($$0));
      }

      public <Value> byh<E, byi<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(ccf<Value> $$0) {
         return new byh.d<>(new byj.b<>($$0));
      }

      public <Value> byh<E, byi<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(ccf<Value> $$0) {
         return new byh.d<>(new byj.a<>($$0));
      }

      public byh<E, Unit> a(byk<? super E> $$0) {
         return new byh.f<>($$0);
      }

      public <A> byh<E, A> a(A $$0) {
         return new byh.a<>($$0);
      }

      public <A> byh<E, A> a(Supplier<String> $$0, A $$1) {
         return new byh.a<>($$1, $$0);
      }

      public <A, R> Function<App<byh.c<E>, A>, App<byh.c<E>, R>> lift1(App<byh.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final byh.e<E, A> $$2 = (byh.e<E, A>)byh.b((App<byh.c<E>, M>)$$1);
            final byh.e<E, Function<A, R>> $$3 = byh.b($$0);
            return byh.a(new byh.e<E, R>() {
               @Override
               public R a(aqm $$0, E $$1, long $$2x) {
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

      public <T, R> byh<E, R> a(final Function<? super T, ? extends R> $$0, App<byh.c<E>, T> $$1) {
         final byh.e<E, T> $$2 = (byh.e<E, T>)byh.b((App<byh.c<E>, M>)$$1);
         return byh.a(new byh.e<E, R>() {
            @Override
            public R a(aqm $$0x, E $$1, long $$2x) {
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

      public <A, B, R> byh<E, R> a(App<byh.c<E>, BiFunction<A, B, R>> $$0, App<byh.c<E>, A> $$1, App<byh.c<E>, B> $$2) {
         final byh.e<E, A> $$3 = (byh.e<E, A>)byh.b((App<byh.c<E>, M>)$$1);
         final byh.e<E, B> $$4 = (byh.e<E, B>)byh.b((App<byh.c<E>, M>)$$2);
         final byh.e<E, BiFunction<A, B, R>> $$5 = byh.b($$0);
         return byh.a(new byh.e<E, R>() {
            @Override
            public R a(aqm $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> byh<E, R> a(App<byh.c<E>, Function3<T1, T2, T3, R>> $$0, App<byh.c<E>, T1> $$1, App<byh.c<E>, T2> $$2, App<byh.c<E>, T3> $$3) {
         final byh.e<E, T1> $$4 = (byh.e<E, T1>)byh.b((App<byh.c<E>, M>)$$1);
         final byh.e<E, T2> $$5 = (byh.e<E, T2>)byh.b((App<byh.c<E>, M>)$$2);
         final byh.e<E, T3> $$6 = (byh.e<E, T3>)byh.b((App<byh.c<E>, M>)$$3);
         final byh.e<E, Function3<T1, T2, T3, R>> $$7 = byh.b($$0);
         return byh.a(new byh.e<E, R>() {
            @Override
            public R a(aqm $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> byh<E, R> a(
         App<byh.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<byh.c<E>, T1> $$1, App<byh.c<E>, T2> $$2, App<byh.c<E>, T3> $$3, App<byh.c<E>, T4> $$4
      ) {
         final byh.e<E, T1> $$5 = (byh.e<E, T1>)byh.b((App<byh.c<E>, M>)$$1);
         final byh.e<E, T2> $$6 = (byh.e<E, T2>)byh.b((App<byh.c<E>, M>)$$2);
         final byh.e<E, T3> $$7 = (byh.e<E, T3>)byh.b((App<byh.c<E>, M>)$$3);
         final byh.e<E, T4> $$8 = (byh.e<E, T4>)byh.b((App<byh.c<E>, M>)$$4);
         final byh.e<E, Function4<T1, T2, T3, T4, R>> $$9 = byh.b($$0);
         return byh.a(new byh.e<E, R>() {
            @Override
            public R a(aqm $$0, E $$1, long $$2) {
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

      static final class a<E extends btb> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends btb> implements K1 {
   }

   static final class d<E extends btb, F extends K1, Value> extends byh<E, byi<F, Value>> {
      d(final byj<F, Value> $$0) {
         super(new byh.e<E, byi<F, Value>>() {
            public byi<F, Value> b(aqm $$0x, E $$1, long $$2) {
               bud<?> $$3 = $$1.dU();
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

   interface e<E extends btb, R> {
      @Nullable
      R a(aqm var1, E var2, long var3);

      String a();
   }

   static final class f<E extends btb> extends byh<E, Unit> {
      f(final byk<? super E> $$0) {
         super(new byh.e<E, Unit>() {
            @Nullable
            public Unit b(aqm $$0x, E $$1, long $$2) {
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
