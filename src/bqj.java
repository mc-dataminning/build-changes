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

public class bqj<E extends blg, M> implements App<bqj.c<E>, M> {
   private final bqj.e<E, M> a;

   public static <E extends blg, M> bqj<E, M> a(App<bqj.c<E>, M> $$0) {
      return (bqj<E, M>)$$0;
   }

   public static <E extends blg> bqj.b<E> a() {
      return new bqj.b<>();
   }

   public static <E extends blg> boh<E> a(Function<bqj.b<E>, ? extends App<bqj.c<E>, bqm<E>>> $$0) {
      final bqj.e<E, bqm<E>> $$1 = b((App<bqj.c<E>, bqm<E>>)$$0.apply(a()));
      return new boh<E>() {
         @Override
         public boolean trigger(ame $$0, E $$1x, long $$2) {
            bqm<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends blg> boh<E> a(bqm<? super E> $$0, bqm<? super E> $$1) {
      return a((Function<bqj.b<E>, ? extends App<bqj.c<E>, bqm<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends blg> boh<E> a(Predicate<E> $$0, boh<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends blg> boh<E> a(Predicate<E> $$0) {
      return a((Function<bqj.b<E>, ? extends App<bqj.c<E>, bqm<E>>>)($$1 -> $$1.a((bqm<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends blg> boh<E> a(BiPredicate<ame, E> $$0) {
      return a((Function<bqj.b<E>, ? extends App<bqj.c<E>, bqm<E>>>)($$1 -> $$1.a((bqm<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends blg, M> bqj.e<E, M> b(App<bqj.c<E>, M> $$0) {
      return a($$0).a;
   }

   bqj(bqj.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends blg, M> bqj<E, M> a(bqj.e<E, M> $$0) {
      return new bqj<>($$0);
   }

   static final class a<E extends blg, A> extends bqj<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new bqj.e<E, A>() {
            @Override
            public A a(ame $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends blg> implements Applicative<bqj.c<E>, bqj.b.a<E>> {
      public <Value> Optional<Value> a(bqk<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(bqk<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> bqj<E, bqk<Mu, Value>> a(buh<Value> $$0) {
         return new bqj.d<>(new bql.c<>($$0));
      }

      public <Value> bqj<E, bqk<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(buh<Value> $$0) {
         return new bqj.d<>(new bql.b<>($$0));
      }

      public <Value> bqj<E, bqk<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(buh<Value> $$0) {
         return new bqj.d<>(new bql.a<>($$0));
      }

      public bqj<E, Unit> a(bqm<? super E> $$0) {
         return new bqj.f<>($$0);
      }

      public <A> bqj<E, A> a(A $$0) {
         return new bqj.a<>($$0);
      }

      public <A> bqj<E, A> a(Supplier<String> $$0, A $$1) {
         return new bqj.a<>($$1, $$0);
      }

      public <A, R> Function<App<bqj.c<E>, A>, App<bqj.c<E>, R>> lift1(App<bqj.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final bqj.e<E, A> $$2 = (bqj.e<E, A>)bqj.b((App<bqj.c<E>, M>)$$1);
            final bqj.e<E, Function<A, R>> $$3 = bqj.b($$0);
            return bqj.a(new bqj.e<E, R>() {
               @Override
               public R a(ame $$0, E $$1, long $$2x) {
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

      public <T, R> bqj<E, R> a(final Function<? super T, ? extends R> $$0, App<bqj.c<E>, T> $$1) {
         final bqj.e<E, T> $$2 = (bqj.e<E, T>)bqj.b((App<bqj.c<E>, M>)$$1);
         return bqj.a(new bqj.e<E, R>() {
            @Override
            public R a(ame $$0x, E $$1, long $$2x) {
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

      public <A, B, R> bqj<E, R> a(App<bqj.c<E>, BiFunction<A, B, R>> $$0, App<bqj.c<E>, A> $$1, App<bqj.c<E>, B> $$2) {
         final bqj.e<E, A> $$3 = (bqj.e<E, A>)bqj.b((App<bqj.c<E>, M>)$$1);
         final bqj.e<E, B> $$4 = (bqj.e<E, B>)bqj.b((App<bqj.c<E>, M>)$$2);
         final bqj.e<E, BiFunction<A, B, R>> $$5 = bqj.b($$0);
         return bqj.a(new bqj.e<E, R>() {
            @Override
            public R a(ame $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> bqj<E, R> a(App<bqj.c<E>, Function3<T1, T2, T3, R>> $$0, App<bqj.c<E>, T1> $$1, App<bqj.c<E>, T2> $$2, App<bqj.c<E>, T3> $$3) {
         final bqj.e<E, T1> $$4 = (bqj.e<E, T1>)bqj.b((App<bqj.c<E>, M>)$$1);
         final bqj.e<E, T2> $$5 = (bqj.e<E, T2>)bqj.b((App<bqj.c<E>, M>)$$2);
         final bqj.e<E, T3> $$6 = (bqj.e<E, T3>)bqj.b((App<bqj.c<E>, M>)$$3);
         final bqj.e<E, Function3<T1, T2, T3, R>> $$7 = bqj.b($$0);
         return bqj.a(new bqj.e<E, R>() {
            @Override
            public R a(ame $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> bqj<E, R> a(
         App<bqj.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<bqj.c<E>, T1> $$1, App<bqj.c<E>, T2> $$2, App<bqj.c<E>, T3> $$3, App<bqj.c<E>, T4> $$4
      ) {
         final bqj.e<E, T1> $$5 = (bqj.e<E, T1>)bqj.b((App<bqj.c<E>, M>)$$1);
         final bqj.e<E, T2> $$6 = (bqj.e<E, T2>)bqj.b((App<bqj.c<E>, M>)$$2);
         final bqj.e<E, T3> $$7 = (bqj.e<E, T3>)bqj.b((App<bqj.c<E>, M>)$$3);
         final bqj.e<E, T4> $$8 = (bqj.e<E, T4>)bqj.b((App<bqj.c<E>, M>)$$4);
         final bqj.e<E, Function4<T1, T2, T3, T4, R>> $$9 = bqj.b($$0);
         return bqj.a(new bqj.e<E, R>() {
            @Override
            public R a(ame $$0, E $$1, long $$2) {
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

      static final class a<E extends blg> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends blg> implements K1 {
   }

   static final class d<E extends blg, F extends K1, Value> extends bqj<E, bqk<F, Value>> {
      d(final bql<F, Value> $$0) {
         super(new bqj.e<E, bqk<F, Value>>() {
            public bqk<F, Value> b(ame $$0x, E $$1, long $$2) {
               bmg<?> $$3 = $$1.dP();
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

   interface e<E extends blg, R> {
      @Nullable
      R a(ame var1, E var2, long var3);

      String a();
   }

   static final class f<E extends blg> extends bqj<E, Unit> {
      f(final bqm<? super E> $$0) {
         super(new bqj.e<E, Unit>() {
            @Nullable
            public Unit b(ame $$0x, E $$1, long $$2) {
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
