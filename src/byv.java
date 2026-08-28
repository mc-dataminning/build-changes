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

public class byv<E extends btp, M> implements App<byv.c<E>, M> {
   private final byv.e<E, M> a;

   public static <E extends btp, M> byv<E, M> a(App<byv.c<E>, M> $$0) {
      return (byv<E, M>)$$0;
   }

   public static <E extends btp> byv.b<E> a() {
      return new byv.b<>();
   }

   public static <E extends btp> bwt<E> a(Function<byv.b<E>, ? extends App<byv.c<E>, byy<E>>> $$0) {
      final byv.e<E, byy<E>> $$1 = b((App<byv.c<E>, byy<E>>)$$0.apply(a()));
      return new bwt<E>() {
         @Override
         public boolean trigger(arf $$0, E $$1x, long $$2) {
            byy<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends btp> bwt<E> a(byy<? super E> $$0, byy<? super E> $$1) {
      return a((Function<byv.b<E>, ? extends App<byv.c<E>, byy<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends btp> bwt<E> a(Predicate<E> $$0, bwt<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends btp> bwt<E> a(Predicate<E> $$0) {
      return a((Function<byv.b<E>, ? extends App<byv.c<E>, byy<E>>>)($$1 -> $$1.a((byy<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends btp> bwt<E> a(BiPredicate<arf, E> $$0) {
      return a((Function<byv.b<E>, ? extends App<byv.c<E>, byy<E>>>)($$1 -> $$1.a((byy<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends btp, M> byv.e<E, M> b(App<byv.c<E>, M> $$0) {
      return a($$0).a;
   }

   byv(byv.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends btp, M> byv<E, M> a(byv.e<E, M> $$0) {
      return new byv<>($$0);
   }

   static final class a<E extends btp, A> extends byv<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new byv.e<E, A>() {
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

   public static final class b<E extends btp> implements Applicative<byv.c<E>, byv.b.a<E>> {
      public <Value> Optional<Value> a(byw<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(byw<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> byv<E, byw<Mu, Value>> a(cct<Value> $$0) {
         return new byv.d<>(new byx.c<>($$0));
      }

      public <Value> byv<E, byw<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(cct<Value> $$0) {
         return new byv.d<>(new byx.b<>($$0));
      }

      public <Value> byv<E, byw<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(cct<Value> $$0) {
         return new byv.d<>(new byx.a<>($$0));
      }

      public byv<E, Unit> a(byy<? super E> $$0) {
         return new byv.f<>($$0);
      }

      public <A> byv<E, A> a(A $$0) {
         return new byv.a<>($$0);
      }

      public <A> byv<E, A> a(Supplier<String> $$0, A $$1) {
         return new byv.a<>($$1, $$0);
      }

      public <A, R> Function<App<byv.c<E>, A>, App<byv.c<E>, R>> lift1(App<byv.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final byv.e<E, A> $$2 = (byv.e<E, A>)byv.b((App<byv.c<E>, M>)$$1);
            final byv.e<E, Function<A, R>> $$3 = byv.b($$0);
            return byv.a(new byv.e<E, R>() {
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

      public <T, R> byv<E, R> a(final Function<? super T, ? extends R> $$0, App<byv.c<E>, T> $$1) {
         final byv.e<E, T> $$2 = (byv.e<E, T>)byv.b((App<byv.c<E>, M>)$$1);
         return byv.a(new byv.e<E, R>() {
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

      public <A, B, R> byv<E, R> a(App<byv.c<E>, BiFunction<A, B, R>> $$0, App<byv.c<E>, A> $$1, App<byv.c<E>, B> $$2) {
         final byv.e<E, A> $$3 = (byv.e<E, A>)byv.b((App<byv.c<E>, M>)$$1);
         final byv.e<E, B> $$4 = (byv.e<E, B>)byv.b((App<byv.c<E>, M>)$$2);
         final byv.e<E, BiFunction<A, B, R>> $$5 = byv.b($$0);
         return byv.a(new byv.e<E, R>() {
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

      public <T1, T2, T3, R> byv<E, R> a(App<byv.c<E>, Function3<T1, T2, T3, R>> $$0, App<byv.c<E>, T1> $$1, App<byv.c<E>, T2> $$2, App<byv.c<E>, T3> $$3) {
         final byv.e<E, T1> $$4 = (byv.e<E, T1>)byv.b((App<byv.c<E>, M>)$$1);
         final byv.e<E, T2> $$5 = (byv.e<E, T2>)byv.b((App<byv.c<E>, M>)$$2);
         final byv.e<E, T3> $$6 = (byv.e<E, T3>)byv.b((App<byv.c<E>, M>)$$3);
         final byv.e<E, Function3<T1, T2, T3, R>> $$7 = byv.b($$0);
         return byv.a(new byv.e<E, R>() {
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

      public <T1, T2, T3, T4, R> byv<E, R> a(
         App<byv.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<byv.c<E>, T1> $$1, App<byv.c<E>, T2> $$2, App<byv.c<E>, T3> $$3, App<byv.c<E>, T4> $$4
      ) {
         final byv.e<E, T1> $$5 = (byv.e<E, T1>)byv.b((App<byv.c<E>, M>)$$1);
         final byv.e<E, T2> $$6 = (byv.e<E, T2>)byv.b((App<byv.c<E>, M>)$$2);
         final byv.e<E, T3> $$7 = (byv.e<E, T3>)byv.b((App<byv.c<E>, M>)$$3);
         final byv.e<E, T4> $$8 = (byv.e<E, T4>)byv.b((App<byv.c<E>, M>)$$4);
         final byv.e<E, Function4<T1, T2, T3, T4, R>> $$9 = byv.b($$0);
         return byv.a(new byv.e<E, R>() {
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

      static final class a<E extends btp> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends btp> implements K1 {
   }

   static final class d<E extends btp, F extends K1, Value> extends byv<E, byw<F, Value>> {
      d(final byx<F, Value> $$0) {
         super(new byv.e<E, byw<F, Value>>() {
            public byw<F, Value> b(arf $$0x, E $$1, long $$2) {
               bur<?> $$3 = $$1.dS();
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

   interface e<E extends btp, R> {
      @Nullable
      R a(arf var1, E var2, long var3);

      String a();
   }

   static final class f<E extends btp> extends byv<E, Unit> {
      f(final byy<? super E> $$0) {
         super(new byv.e<E, Unit>() {
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
