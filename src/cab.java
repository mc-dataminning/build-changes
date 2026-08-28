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

public class cab<E extends buv, M> implements App<cab.c<E>, M> {
   private final cab.e<E, M> a;

   public static <E extends buv, M> cab<E, M> a(App<cab.c<E>, M> $$0) {
      return (cab<E, M>)$$0;
   }

   public static <E extends buv> cab.b<E> a() {
      return new cab.b<>();
   }

   public static <E extends buv> bxz<E> a(Function<cab.b<E>, ? extends App<cab.c<E>, cae<E>>> $$0) {
      final cab.e<E, cae<E>> $$1 = b((App<cab.c<E>, cae<E>>)$$0.apply(a()));
      return new bxz<E>() {
         @Override
         public boolean trigger(arm $$0, E $$1x, long $$2) {
            cae<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends buv> bxz<E> a(cae<? super E> $$0, cae<? super E> $$1) {
      return a((Function<cab.b<E>, ? extends App<cab.c<E>, cae<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends buv> bxz<E> a(Predicate<E> $$0, bxz<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends buv> bxz<E> a(Predicate<E> $$0) {
      return a((Function<cab.b<E>, ? extends App<cab.c<E>, cae<E>>>)($$1 -> $$1.a((cae<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends buv> bxz<E> a(BiPredicate<arm, E> $$0) {
      return a((Function<cab.b<E>, ? extends App<cab.c<E>, cae<E>>>)($$1 -> $$1.a((cae<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends buv, M> cab.e<E, M> b(App<cab.c<E>, M> $$0) {
      return a($$0).a;
   }

   cab(cab.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends buv, M> cab<E, M> a(cab.e<E, M> $$0) {
      return new cab<>($$0);
   }

   static final class a<E extends buv, A> extends cab<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new cab.e<E, A>() {
            @Override
            public A a(arm $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends buv> implements Applicative<cab.c<E>, cab.b.a<E>> {
      public <Value> Optional<Value> a(cac<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(cac<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> cab<E, cac<Mu, Value>> a(cdz<Value> $$0) {
         return new cab.d<>(new cad.c<>($$0));
      }

      public <Value> cab<E, cac<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(cdz<Value> $$0) {
         return new cab.d<>(new cad.b<>($$0));
      }

      public <Value> cab<E, cac<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(cdz<Value> $$0) {
         return new cab.d<>(new cad.a<>($$0));
      }

      public cab<E, Unit> a(cae<? super E> $$0) {
         return new cab.f<>($$0);
      }

      public <A> cab<E, A> a(A $$0) {
         return new cab.a<>($$0);
      }

      public <A> cab<E, A> a(Supplier<String> $$0, A $$1) {
         return new cab.a<>($$1, $$0);
      }

      public <A, R> Function<App<cab.c<E>, A>, App<cab.c<E>, R>> lift1(App<cab.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final cab.e<E, A> $$2 = (cab.e<E, A>)cab.b((App<cab.c<E>, M>)$$1);
            final cab.e<E, Function<A, R>> $$3 = cab.b($$0);
            return cab.a(new cab.e<E, R>() {
               @Override
               public R a(arm $$0, E $$1, long $$2x) {
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

      public <T, R> cab<E, R> a(final Function<? super T, ? extends R> $$0, App<cab.c<E>, T> $$1) {
         final cab.e<E, T> $$2 = (cab.e<E, T>)cab.b((App<cab.c<E>, M>)$$1);
         return cab.a(new cab.e<E, R>() {
            @Override
            public R a(arm $$0x, E $$1, long $$2x) {
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

      public <A, B, R> cab<E, R> a(App<cab.c<E>, BiFunction<A, B, R>> $$0, App<cab.c<E>, A> $$1, App<cab.c<E>, B> $$2) {
         final cab.e<E, A> $$3 = (cab.e<E, A>)cab.b((App<cab.c<E>, M>)$$1);
         final cab.e<E, B> $$4 = (cab.e<E, B>)cab.b((App<cab.c<E>, M>)$$2);
         final cab.e<E, BiFunction<A, B, R>> $$5 = cab.b($$0);
         return cab.a(new cab.e<E, R>() {
            @Override
            public R a(arm $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> cab<E, R> a(App<cab.c<E>, Function3<T1, T2, T3, R>> $$0, App<cab.c<E>, T1> $$1, App<cab.c<E>, T2> $$2, App<cab.c<E>, T3> $$3) {
         final cab.e<E, T1> $$4 = (cab.e<E, T1>)cab.b((App<cab.c<E>, M>)$$1);
         final cab.e<E, T2> $$5 = (cab.e<E, T2>)cab.b((App<cab.c<E>, M>)$$2);
         final cab.e<E, T3> $$6 = (cab.e<E, T3>)cab.b((App<cab.c<E>, M>)$$3);
         final cab.e<E, Function3<T1, T2, T3, R>> $$7 = cab.b($$0);
         return cab.a(new cab.e<E, R>() {
            @Override
            public R a(arm $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> cab<E, R> a(
         App<cab.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<cab.c<E>, T1> $$1, App<cab.c<E>, T2> $$2, App<cab.c<E>, T3> $$3, App<cab.c<E>, T4> $$4
      ) {
         final cab.e<E, T1> $$5 = (cab.e<E, T1>)cab.b((App<cab.c<E>, M>)$$1);
         final cab.e<E, T2> $$6 = (cab.e<E, T2>)cab.b((App<cab.c<E>, M>)$$2);
         final cab.e<E, T3> $$7 = (cab.e<E, T3>)cab.b((App<cab.c<E>, M>)$$3);
         final cab.e<E, T4> $$8 = (cab.e<E, T4>)cab.b((App<cab.c<E>, M>)$$4);
         final cab.e<E, Function4<T1, T2, T3, T4, R>> $$9 = cab.b($$0);
         return cab.a(new cab.e<E, R>() {
            @Override
            public R a(arm $$0, E $$1, long $$2) {
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

      static final class a<E extends buv> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends buv> implements K1 {
   }

   static final class d<E extends buv, F extends K1, Value> extends cab<E, cac<F, Value>> {
      d(final cad<F, Value> $$0) {
         super(new cab.e<E, cac<F, Value>>() {
            public cac<F, Value> b(arm $$0x, E $$1, long $$2) {
               bvx<?> $$3 = $$1.ed();
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

   interface e<E extends buv, R> {
      @Nullable
      R a(arm var1, E var2, long var3);

      String a();
   }

   static final class f<E extends buv> extends cab<E, Unit> {
      f(final cae<? super E> $$0) {
         super(new cab.e<E, Unit>() {
            @Nullable
            public Unit b(arm $$0x, E $$1, long $$2) {
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
