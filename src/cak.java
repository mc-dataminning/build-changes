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

public class cak<E extends bve, M> implements App<cak.c<E>, M> {
   private final cak.e<E, M> a;

   public static <E extends bve, M> cak<E, M> a(App<cak.c<E>, M> $$0) {
      return (cak<E, M>)$$0;
   }

   public static <E extends bve> cak.b<E> a() {
      return new cak.b<>();
   }

   public static <E extends bve> byi<E> a(Function<cak.b<E>, ? extends App<cak.c<E>, can<E>>> $$0) {
      final cak.e<E, can<E>> $$1 = b((App<cak.c<E>, can<E>>)$$0.apply(a()));
      return new byi<E>() {
         @Override
         public boolean trigger(arq $$0, E $$1x, long $$2) {
            can<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bve> byi<E> a(can<? super E> $$0, can<? super E> $$1) {
      return a((Function<cak.b<E>, ? extends App<cak.c<E>, can<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bve> byi<E> a(Predicate<E> $$0, byi<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bve> byi<E> a(Predicate<E> $$0) {
      return a((Function<cak.b<E>, ? extends App<cak.c<E>, can<E>>>)($$1 -> $$1.a((can<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bve> byi<E> a(BiPredicate<arq, E> $$0) {
      return a((Function<cak.b<E>, ? extends App<cak.c<E>, can<E>>>)($$1 -> $$1.a((can<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bve, M> cak.e<E, M> b(App<cak.c<E>, M> $$0) {
      return a($$0).a;
   }

   cak(cak.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bve, M> cak<E, M> a(cak.e<E, M> $$0) {
      return new cak<>($$0);
   }

   static final class a<E extends bve, A> extends cak<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new cak.e<E, A>() {
            @Override
            public A a(arq $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bve> implements Applicative<cak.c<E>, cak.b.a<E>> {
      public <Value> Optional<Value> a(cal<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(cal<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> cak<E, cal<Mu, Value>> a(cei<Value> $$0) {
         return new cak.d<>(new cam.c<>($$0));
      }

      public <Value> cak<E, cal<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(cei<Value> $$0) {
         return new cak.d<>(new cam.b<>($$0));
      }

      public <Value> cak<E, cal<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(cei<Value> $$0) {
         return new cak.d<>(new cam.a<>($$0));
      }

      public cak<E, Unit> a(can<? super E> $$0) {
         return new cak.f<>($$0);
      }

      public <A> cak<E, A> a(A $$0) {
         return new cak.a<>($$0);
      }

      public <A> cak<E, A> a(Supplier<String> $$0, A $$1) {
         return new cak.a<>($$1, $$0);
      }

      public <A, R> Function<App<cak.c<E>, A>, App<cak.c<E>, R>> lift1(App<cak.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final cak.e<E, A> $$2 = (cak.e<E, A>)cak.b((App<cak.c<E>, M>)$$1);
            final cak.e<E, Function<A, R>> $$3 = cak.b($$0);
            return cak.a(new cak.e<E, R>() {
               @Override
               public R a(arq $$0, E $$1, long $$2x) {
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

      public <T, R> cak<E, R> a(final Function<? super T, ? extends R> $$0, App<cak.c<E>, T> $$1) {
         final cak.e<E, T> $$2 = (cak.e<E, T>)cak.b((App<cak.c<E>, M>)$$1);
         return cak.a(new cak.e<E, R>() {
            @Override
            public R a(arq $$0x, E $$1, long $$2x) {
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

      public <A, B, R> cak<E, R> a(App<cak.c<E>, BiFunction<A, B, R>> $$0, App<cak.c<E>, A> $$1, App<cak.c<E>, B> $$2) {
         final cak.e<E, A> $$3 = (cak.e<E, A>)cak.b((App<cak.c<E>, M>)$$1);
         final cak.e<E, B> $$4 = (cak.e<E, B>)cak.b((App<cak.c<E>, M>)$$2);
         final cak.e<E, BiFunction<A, B, R>> $$5 = cak.b($$0);
         return cak.a(new cak.e<E, R>() {
            @Override
            public R a(arq $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> cak<E, R> a(App<cak.c<E>, Function3<T1, T2, T3, R>> $$0, App<cak.c<E>, T1> $$1, App<cak.c<E>, T2> $$2, App<cak.c<E>, T3> $$3) {
         final cak.e<E, T1> $$4 = (cak.e<E, T1>)cak.b((App<cak.c<E>, M>)$$1);
         final cak.e<E, T2> $$5 = (cak.e<E, T2>)cak.b((App<cak.c<E>, M>)$$2);
         final cak.e<E, T3> $$6 = (cak.e<E, T3>)cak.b((App<cak.c<E>, M>)$$3);
         final cak.e<E, Function3<T1, T2, T3, R>> $$7 = cak.b($$0);
         return cak.a(new cak.e<E, R>() {
            @Override
            public R a(arq $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> cak<E, R> a(
         App<cak.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<cak.c<E>, T1> $$1, App<cak.c<E>, T2> $$2, App<cak.c<E>, T3> $$3, App<cak.c<E>, T4> $$4
      ) {
         final cak.e<E, T1> $$5 = (cak.e<E, T1>)cak.b((App<cak.c<E>, M>)$$1);
         final cak.e<E, T2> $$6 = (cak.e<E, T2>)cak.b((App<cak.c<E>, M>)$$2);
         final cak.e<E, T3> $$7 = (cak.e<E, T3>)cak.b((App<cak.c<E>, M>)$$3);
         final cak.e<E, T4> $$8 = (cak.e<E, T4>)cak.b((App<cak.c<E>, M>)$$4);
         final cak.e<E, Function4<T1, T2, T3, T4, R>> $$9 = cak.b($$0);
         return cak.a(new cak.e<E, R>() {
            @Override
            public R a(arq $$0, E $$1, long $$2) {
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

      static final class a<E extends bve> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bve> implements K1 {
   }

   static final class d<E extends bve, F extends K1, Value> extends cak<E, cal<F, Value>> {
      d(final cam<F, Value> $$0) {
         super(new cak.e<E, cal<F, Value>>() {
            public cal<F, Value> b(arq $$0x, E $$1, long $$2) {
               bwg<?> $$3 = $$1.ee();
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

   interface e<E extends bve, R> {
      @Nullable
      R a(arq var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bve> extends cak<E, Unit> {
      f(final can<? super E> $$0) {
         super(new cak.e<E, Unit>() {
            @Nullable
            public Unit b(arq $$0x, E $$1, long $$2) {
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
