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

public class ccn<E extends bxj, M> implements App<ccn.c<E>, M> {
   private final ccn.e<E, M> a;

   public static <E extends bxj, M> ccn<E, M> a(App<ccn.c<E>, M> $$0) {
      return (ccn<E, M>)$$0;
   }

   public static <E extends bxj> ccn.b<E> a() {
      return new ccn.b<>();
   }

   public static <E extends bxj> cal<E> a(Function<ccn.b<E>, ? extends App<ccn.c<E>, ccq<E>>> $$0) {
      final ccn.e<E, ccq<E>> $$1 = b((App<ccn.c<E>, ccq<E>>)$$0.apply(a()));
      return new cal<E>() {
         @Override
         public boolean trigger(arq $$0, E $$1x, long $$2) {
            ccq<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bxj> cal<E> a(ccq<? super E> $$0, ccq<? super E> $$1) {
      return a((Function<ccn.b<E>, ? extends App<ccn.c<E>, ccq<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bxj> cal<E> a(Predicate<E> $$0, cal<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bxj> cal<E> a(Predicate<E> $$0) {
      return a((Function<ccn.b<E>, ? extends App<ccn.c<E>, ccq<E>>>)($$1 -> $$1.a((ccq<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bxj> cal<E> a(BiPredicate<arq, E> $$0) {
      return a((Function<ccn.b<E>, ? extends App<ccn.c<E>, ccq<E>>>)($$1 -> $$1.a((ccq<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bxj, M> ccn.e<E, M> b(App<ccn.c<E>, M> $$0) {
      return a($$0).a;
   }

   ccn(ccn.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bxj, M> ccn<E, M> a(ccn.e<E, M> $$0) {
      return new ccn<>($$0);
   }

   static final class a<E extends bxj, A> extends ccn<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new ccn.e<E, A>() {
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

   public static final class b<E extends bxj> implements Applicative<ccn.c<E>, ccn.b.a<E>> {
      public <Value> Optional<Value> a(cco<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(cco<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> ccn<E, cco<Mu, Value>> a(cgl<Value> $$0) {
         return new ccn.d<>(new ccp.c<>($$0));
      }

      public <Value> ccn<E, cco<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(cgl<Value> $$0) {
         return new ccn.d<>(new ccp.b<>($$0));
      }

      public <Value> ccn<E, cco<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(cgl<Value> $$0) {
         return new ccn.d<>(new ccp.a<>($$0));
      }

      public ccn<E, Unit> a(ccq<? super E> $$0) {
         return new ccn.f<>($$0);
      }

      public <A> ccn<E, A> a(A $$0) {
         return new ccn.a<>($$0);
      }

      public <A> ccn<E, A> a(Supplier<String> $$0, A $$1) {
         return new ccn.a<>($$1, $$0);
      }

      public <A, R> Function<App<ccn.c<E>, A>, App<ccn.c<E>, R>> lift1(App<ccn.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final ccn.e<E, A> $$2 = (ccn.e<E, A>)ccn.b((App<ccn.c<E>, M>)$$1);
            final ccn.e<E, Function<A, R>> $$3 = ccn.b($$0);
            return ccn.a(new ccn.e<E, R>() {
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

      public <T, R> ccn<E, R> a(final Function<? super T, ? extends R> $$0, App<ccn.c<E>, T> $$1) {
         final ccn.e<E, T> $$2 = (ccn.e<E, T>)ccn.b((App<ccn.c<E>, M>)$$1);
         return ccn.a(new ccn.e<E, R>() {
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

      public <A, B, R> ccn<E, R> a(App<ccn.c<E>, BiFunction<A, B, R>> $$0, App<ccn.c<E>, A> $$1, App<ccn.c<E>, B> $$2) {
         final ccn.e<E, A> $$3 = (ccn.e<E, A>)ccn.b((App<ccn.c<E>, M>)$$1);
         final ccn.e<E, B> $$4 = (ccn.e<E, B>)ccn.b((App<ccn.c<E>, M>)$$2);
         final ccn.e<E, BiFunction<A, B, R>> $$5 = ccn.b($$0);
         return ccn.a(new ccn.e<E, R>() {
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

      public <T1, T2, T3, R> ccn<E, R> a(App<ccn.c<E>, Function3<T1, T2, T3, R>> $$0, App<ccn.c<E>, T1> $$1, App<ccn.c<E>, T2> $$2, App<ccn.c<E>, T3> $$3) {
         final ccn.e<E, T1> $$4 = (ccn.e<E, T1>)ccn.b((App<ccn.c<E>, M>)$$1);
         final ccn.e<E, T2> $$5 = (ccn.e<E, T2>)ccn.b((App<ccn.c<E>, M>)$$2);
         final ccn.e<E, T3> $$6 = (ccn.e<E, T3>)ccn.b((App<ccn.c<E>, M>)$$3);
         final ccn.e<E, Function3<T1, T2, T3, R>> $$7 = ccn.b($$0);
         return ccn.a(new ccn.e<E, R>() {
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

      public <T1, T2, T3, T4, R> ccn<E, R> a(
         App<ccn.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<ccn.c<E>, T1> $$1, App<ccn.c<E>, T2> $$2, App<ccn.c<E>, T3> $$3, App<ccn.c<E>, T4> $$4
      ) {
         final ccn.e<E, T1> $$5 = (ccn.e<E, T1>)ccn.b((App<ccn.c<E>, M>)$$1);
         final ccn.e<E, T2> $$6 = (ccn.e<E, T2>)ccn.b((App<ccn.c<E>, M>)$$2);
         final ccn.e<E, T3> $$7 = (ccn.e<E, T3>)ccn.b((App<ccn.c<E>, M>)$$3);
         final ccn.e<E, T4> $$8 = (ccn.e<E, T4>)ccn.b((App<ccn.c<E>, M>)$$4);
         final ccn.e<E, Function4<T1, T2, T3, T4, R>> $$9 = ccn.b($$0);
         return ccn.a(new ccn.e<E, R>() {
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

      static final class a<E extends bxj> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bxj> implements K1 {
   }

   static final class d<E extends bxj, F extends K1, Value> extends ccn<E, cco<F, Value>> {
      d(final ccp<F, Value> $$0) {
         super(new ccn.e<E, cco<F, Value>>() {
            public cco<F, Value> b(arq $$0x, E $$1, long $$2) {
               byj<?> $$3 = $$1.eb();
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

   interface e<E extends bxj, R> {
      @Nullable
      R a(arq var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bxj> extends ccn<E, Unit> {
      f(final ccq<? super E> $$0) {
         super(new ccn.e<E, Unit>() {
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
