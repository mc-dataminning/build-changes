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

public class ccg<E extends bxc, M> implements App<ccg.c<E>, M> {
   private final ccg.e<E, M> a;

   public static <E extends bxc, M> ccg<E, M> a(App<ccg.c<E>, M> $$0) {
      return (ccg<E, M>)$$0;
   }

   public static <E extends bxc> ccg.b<E> a() {
      return new ccg.b<>();
   }

   public static <E extends bxc> cae<E> a(Function<ccg.b<E>, ? extends App<ccg.c<E>, ccj<E>>> $$0) {
      final ccg.e<E, ccj<E>> $$1 = b((App<ccg.c<E>, ccj<E>>)$$0.apply(a()));
      return new cae<E>() {
         @Override
         public boolean trigger(arq $$0, E $$1x, long $$2) {
            ccj<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bxc> cae<E> a(ccj<? super E> $$0, ccj<? super E> $$1) {
      return a((Function<ccg.b<E>, ? extends App<ccg.c<E>, ccj<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bxc> cae<E> a(Predicate<E> $$0, cae<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bxc> cae<E> a(Predicate<E> $$0) {
      return a((Function<ccg.b<E>, ? extends App<ccg.c<E>, ccj<E>>>)($$1 -> $$1.a((ccj<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bxc> cae<E> a(BiPredicate<arq, E> $$0) {
      return a((Function<ccg.b<E>, ? extends App<ccg.c<E>, ccj<E>>>)($$1 -> $$1.a((ccj<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bxc, M> ccg.e<E, M> b(App<ccg.c<E>, M> $$0) {
      return a($$0).a;
   }

   ccg(ccg.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bxc, M> ccg<E, M> a(ccg.e<E, M> $$0) {
      return new ccg<>($$0);
   }

   static final class a<E extends bxc, A> extends ccg<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new ccg.e<E, A>() {
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

   public static final class b<E extends bxc> implements Applicative<ccg.c<E>, ccg.b.a<E>> {
      public <Value> Optional<Value> a(cch<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(cch<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> ccg<E, cch<Mu, Value>> a(cge<Value> $$0) {
         return new ccg.d<>(new cci.c<>($$0));
      }

      public <Value> ccg<E, cch<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(cge<Value> $$0) {
         return new ccg.d<>(new cci.b<>($$0));
      }

      public <Value> ccg<E, cch<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(cge<Value> $$0) {
         return new ccg.d<>(new cci.a<>($$0));
      }

      public ccg<E, Unit> a(ccj<? super E> $$0) {
         return new ccg.f<>($$0);
      }

      public <A> ccg<E, A> a(A $$0) {
         return new ccg.a<>($$0);
      }

      public <A> ccg<E, A> a(Supplier<String> $$0, A $$1) {
         return new ccg.a<>($$1, $$0);
      }

      public <A, R> Function<App<ccg.c<E>, A>, App<ccg.c<E>, R>> lift1(App<ccg.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final ccg.e<E, A> $$2 = (ccg.e<E, A>)ccg.b((App<ccg.c<E>, M>)$$1);
            final ccg.e<E, Function<A, R>> $$3 = ccg.b($$0);
            return ccg.a(new ccg.e<E, R>() {
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

      public <T, R> ccg<E, R> a(final Function<? super T, ? extends R> $$0, App<ccg.c<E>, T> $$1) {
         final ccg.e<E, T> $$2 = (ccg.e<E, T>)ccg.b((App<ccg.c<E>, M>)$$1);
         return ccg.a(new ccg.e<E, R>() {
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

      public <A, B, R> ccg<E, R> a(App<ccg.c<E>, BiFunction<A, B, R>> $$0, App<ccg.c<E>, A> $$1, App<ccg.c<E>, B> $$2) {
         final ccg.e<E, A> $$3 = (ccg.e<E, A>)ccg.b((App<ccg.c<E>, M>)$$1);
         final ccg.e<E, B> $$4 = (ccg.e<E, B>)ccg.b((App<ccg.c<E>, M>)$$2);
         final ccg.e<E, BiFunction<A, B, R>> $$5 = ccg.b($$0);
         return ccg.a(new ccg.e<E, R>() {
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

      public <T1, T2, T3, R> ccg<E, R> a(App<ccg.c<E>, Function3<T1, T2, T3, R>> $$0, App<ccg.c<E>, T1> $$1, App<ccg.c<E>, T2> $$2, App<ccg.c<E>, T3> $$3) {
         final ccg.e<E, T1> $$4 = (ccg.e<E, T1>)ccg.b((App<ccg.c<E>, M>)$$1);
         final ccg.e<E, T2> $$5 = (ccg.e<E, T2>)ccg.b((App<ccg.c<E>, M>)$$2);
         final ccg.e<E, T3> $$6 = (ccg.e<E, T3>)ccg.b((App<ccg.c<E>, M>)$$3);
         final ccg.e<E, Function3<T1, T2, T3, R>> $$7 = ccg.b($$0);
         return ccg.a(new ccg.e<E, R>() {
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

      public <T1, T2, T3, T4, R> ccg<E, R> a(
         App<ccg.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<ccg.c<E>, T1> $$1, App<ccg.c<E>, T2> $$2, App<ccg.c<E>, T3> $$3, App<ccg.c<E>, T4> $$4
      ) {
         final ccg.e<E, T1> $$5 = (ccg.e<E, T1>)ccg.b((App<ccg.c<E>, M>)$$1);
         final ccg.e<E, T2> $$6 = (ccg.e<E, T2>)ccg.b((App<ccg.c<E>, M>)$$2);
         final ccg.e<E, T3> $$7 = (ccg.e<E, T3>)ccg.b((App<ccg.c<E>, M>)$$3);
         final ccg.e<E, T4> $$8 = (ccg.e<E, T4>)ccg.b((App<ccg.c<E>, M>)$$4);
         final ccg.e<E, Function4<T1, T2, T3, T4, R>> $$9 = ccg.b($$0);
         return ccg.a(new ccg.e<E, R>() {
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

      static final class a<E extends bxc> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bxc> implements K1 {
   }

   static final class d<E extends bxc, F extends K1, Value> extends ccg<E, cch<F, Value>> {
      d(final cci<F, Value> $$0) {
         super(new ccg.e<E, cch<F, Value>>() {
            public cch<F, Value> b(arq $$0x, E $$1, long $$2) {
               byc<?> $$3 = $$1.eb();
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

   interface e<E extends bxc, R> {
      @Nullable
      R a(arq var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bxc> extends ccg<E, Unit> {
      f(final ccj<? super E> $$0) {
         super(new ccg.e<E, Unit>() {
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
