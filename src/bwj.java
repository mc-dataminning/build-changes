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

public class bwj<E extends bre, M> implements App<bwj.c<E>, M> {
   private final bwj.e<E, M> a;

   public static <E extends bre, M> bwj<E, M> a(App<bwj.c<E>, M> $$0) {
      return (bwj<E, M>)$$0;
   }

   public static <E extends bre> bwj.b<E> a() {
      return new bwj.b<>();
   }

   public static <E extends bre> buh<E> a(Function<bwj.b<E>, ? extends App<bwj.c<E>, bwm<E>>> $$0) {
      final bwj.e<E, bwm<E>> $$1 = b((App<bwj.c<E>, bwm<E>>)$$0.apply(a()));
      return new buh<E>() {
         @Override
         public boolean trigger(aqe $$0, E $$1x, long $$2) {
            bwm<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bre> buh<E> a(bwm<? super E> $$0, bwm<? super E> $$1) {
      return a((Function<bwj.b<E>, ? extends App<bwj.c<E>, bwm<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bre> buh<E> a(Predicate<E> $$0, buh<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bre> buh<E> a(Predicate<E> $$0) {
      return a((Function<bwj.b<E>, ? extends App<bwj.c<E>, bwm<E>>>)($$1 -> $$1.a((bwm<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bre> buh<E> a(BiPredicate<aqe, E> $$0) {
      return a((Function<bwj.b<E>, ? extends App<bwj.c<E>, bwm<E>>>)($$1 -> $$1.a((bwm<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bre, M> bwj.e<E, M> b(App<bwj.c<E>, M> $$0) {
      return a($$0).a;
   }

   bwj(bwj.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bre, M> bwj<E, M> a(bwj.e<E, M> $$0) {
      return new bwj<>($$0);
   }

   static final class a<E extends bre, A> extends bwj<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new bwj.e<E, A>() {
            @Override
            public A a(aqe $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bre> implements Applicative<bwj.c<E>, bwj.b.a<E>> {
      public <Value> Optional<Value> a(bwk<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(bwk<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> bwj<E, bwk<Mu, Value>> a(cah<Value> $$0) {
         return new bwj.d<>(new bwl.c<>($$0));
      }

      public <Value> bwj<E, bwk<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(cah<Value> $$0) {
         return new bwj.d<>(new bwl.b<>($$0));
      }

      public <Value> bwj<E, bwk<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(cah<Value> $$0) {
         return new bwj.d<>(new bwl.a<>($$0));
      }

      public bwj<E, Unit> a(bwm<? super E> $$0) {
         return new bwj.f<>($$0);
      }

      public <A> bwj<E, A> a(A $$0) {
         return new bwj.a<>($$0);
      }

      public <A> bwj<E, A> a(Supplier<String> $$0, A $$1) {
         return new bwj.a<>($$1, $$0);
      }

      public <A, R> Function<App<bwj.c<E>, A>, App<bwj.c<E>, R>> lift1(App<bwj.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final bwj.e<E, A> $$2 = (bwj.e<E, A>)bwj.b((App<bwj.c<E>, M>)$$1);
            final bwj.e<E, Function<A, R>> $$3 = bwj.b($$0);
            return bwj.a(new bwj.e<E, R>() {
               @Override
               public R a(aqe $$0, E $$1, long $$2x) {
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

      public <T, R> bwj<E, R> a(final Function<? super T, ? extends R> $$0, App<bwj.c<E>, T> $$1) {
         final bwj.e<E, T> $$2 = (bwj.e<E, T>)bwj.b((App<bwj.c<E>, M>)$$1);
         return bwj.a(new bwj.e<E, R>() {
            @Override
            public R a(aqe $$0x, E $$1, long $$2x) {
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

      public <A, B, R> bwj<E, R> a(App<bwj.c<E>, BiFunction<A, B, R>> $$0, App<bwj.c<E>, A> $$1, App<bwj.c<E>, B> $$2) {
         final bwj.e<E, A> $$3 = (bwj.e<E, A>)bwj.b((App<bwj.c<E>, M>)$$1);
         final bwj.e<E, B> $$4 = (bwj.e<E, B>)bwj.b((App<bwj.c<E>, M>)$$2);
         final bwj.e<E, BiFunction<A, B, R>> $$5 = bwj.b($$0);
         return bwj.a(new bwj.e<E, R>() {
            @Override
            public R a(aqe $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> bwj<E, R> a(App<bwj.c<E>, Function3<T1, T2, T3, R>> $$0, App<bwj.c<E>, T1> $$1, App<bwj.c<E>, T2> $$2, App<bwj.c<E>, T3> $$3) {
         final bwj.e<E, T1> $$4 = (bwj.e<E, T1>)bwj.b((App<bwj.c<E>, M>)$$1);
         final bwj.e<E, T2> $$5 = (bwj.e<E, T2>)bwj.b((App<bwj.c<E>, M>)$$2);
         final bwj.e<E, T3> $$6 = (bwj.e<E, T3>)bwj.b((App<bwj.c<E>, M>)$$3);
         final bwj.e<E, Function3<T1, T2, T3, R>> $$7 = bwj.b($$0);
         return bwj.a(new bwj.e<E, R>() {
            @Override
            public R a(aqe $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> bwj<E, R> a(
         App<bwj.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<bwj.c<E>, T1> $$1, App<bwj.c<E>, T2> $$2, App<bwj.c<E>, T3> $$3, App<bwj.c<E>, T4> $$4
      ) {
         final bwj.e<E, T1> $$5 = (bwj.e<E, T1>)bwj.b((App<bwj.c<E>, M>)$$1);
         final bwj.e<E, T2> $$6 = (bwj.e<E, T2>)bwj.b((App<bwj.c<E>, M>)$$2);
         final bwj.e<E, T3> $$7 = (bwj.e<E, T3>)bwj.b((App<bwj.c<E>, M>)$$3);
         final bwj.e<E, T4> $$8 = (bwj.e<E, T4>)bwj.b((App<bwj.c<E>, M>)$$4);
         final bwj.e<E, Function4<T1, T2, T3, T4, R>> $$9 = bwj.b($$0);
         return bwj.a(new bwj.e<E, R>() {
            @Override
            public R a(aqe $$0, E $$1, long $$2) {
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

      static final class a<E extends bre> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bre> implements K1 {
   }

   static final class d<E extends bre, F extends K1, Value> extends bwj<E, bwk<F, Value>> {
      d(final bwl<F, Value> $$0) {
         super(new bwj.e<E, bwk<F, Value>>() {
            public bwk<F, Value> b(aqe $$0x, E $$1, long $$2) {
               bsf<?> $$3 = $$1.dQ();
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

   interface e<E extends bre, R> {
      @Nullable
      R a(aqe var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bre> extends bwj<E, Unit> {
      f(final bwm<? super E> $$0) {
         super(new bwj.e<E, Unit>() {
            @Nullable
            public Unit b(aqe $$0x, E $$1, long $$2) {
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
