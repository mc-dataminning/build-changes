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

public class bxw<E extends bsq, M> implements App<bxw.c<E>, M> {
   private final bxw.e<E, M> a;

   public static <E extends bsq, M> bxw<E, M> a(App<bxw.c<E>, M> $$0) {
      return (bxw<E, M>)$$0;
   }

   public static <E extends bsq> bxw.b<E> a() {
      return new bxw.b<>();
   }

   public static <E extends bsq> bvu<E> a(Function<bxw.b<E>, ? extends App<bxw.c<E>, bxz<E>>> $$0) {
      final bxw.e<E, bxz<E>> $$1 = b((App<bxw.c<E>, bxz<E>>)$$0.apply(a()));
      return new bvu<E>() {
         @Override
         public boolean trigger(aqn $$0, E $$1x, long $$2) {
            bxz<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bsq> bvu<E> a(bxz<? super E> $$0, bxz<? super E> $$1) {
      return a((Function<bxw.b<E>, ? extends App<bxw.c<E>, bxz<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bsq> bvu<E> a(Predicate<E> $$0, bvu<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bsq> bvu<E> a(Predicate<E> $$0) {
      return a((Function<bxw.b<E>, ? extends App<bxw.c<E>, bxz<E>>>)($$1 -> $$1.a((bxz<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bsq> bvu<E> a(BiPredicate<aqn, E> $$0) {
      return a((Function<bxw.b<E>, ? extends App<bxw.c<E>, bxz<E>>>)($$1 -> $$1.a((bxz<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bsq, M> bxw.e<E, M> b(App<bxw.c<E>, M> $$0) {
      return a($$0).a;
   }

   bxw(bxw.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bsq, M> bxw<E, M> a(bxw.e<E, M> $$0) {
      return new bxw<>($$0);
   }

   static final class a<E extends bsq, A> extends bxw<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new bxw.e<E, A>() {
            @Override
            public A a(aqn $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bsq> implements Applicative<bxw.c<E>, bxw.b.a<E>> {
      public <Value> Optional<Value> a(bxx<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(bxx<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> bxw<E, bxx<Mu, Value>> a(cbu<Value> $$0) {
         return new bxw.d<>(new bxy.c<>($$0));
      }

      public <Value> bxw<E, bxx<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(cbu<Value> $$0) {
         return new bxw.d<>(new bxy.b<>($$0));
      }

      public <Value> bxw<E, bxx<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(cbu<Value> $$0) {
         return new bxw.d<>(new bxy.a<>($$0));
      }

      public bxw<E, Unit> a(bxz<? super E> $$0) {
         return new bxw.f<>($$0);
      }

      public <A> bxw<E, A> a(A $$0) {
         return new bxw.a<>($$0);
      }

      public <A> bxw<E, A> a(Supplier<String> $$0, A $$1) {
         return new bxw.a<>($$1, $$0);
      }

      public <A, R> Function<App<bxw.c<E>, A>, App<bxw.c<E>, R>> lift1(App<bxw.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final bxw.e<E, A> $$2 = (bxw.e<E, A>)bxw.b((App<bxw.c<E>, M>)$$1);
            final bxw.e<E, Function<A, R>> $$3 = bxw.b($$0);
            return bxw.a(new bxw.e<E, R>() {
               @Override
               public R a(aqn $$0, E $$1, long $$2x) {
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

      public <T, R> bxw<E, R> a(final Function<? super T, ? extends R> $$0, App<bxw.c<E>, T> $$1) {
         final bxw.e<E, T> $$2 = (bxw.e<E, T>)bxw.b((App<bxw.c<E>, M>)$$1);
         return bxw.a(new bxw.e<E, R>() {
            @Override
            public R a(aqn $$0x, E $$1, long $$2x) {
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

      public <A, B, R> bxw<E, R> a(App<bxw.c<E>, BiFunction<A, B, R>> $$0, App<bxw.c<E>, A> $$1, App<bxw.c<E>, B> $$2) {
         final bxw.e<E, A> $$3 = (bxw.e<E, A>)bxw.b((App<bxw.c<E>, M>)$$1);
         final bxw.e<E, B> $$4 = (bxw.e<E, B>)bxw.b((App<bxw.c<E>, M>)$$2);
         final bxw.e<E, BiFunction<A, B, R>> $$5 = bxw.b($$0);
         return bxw.a(new bxw.e<E, R>() {
            @Override
            public R a(aqn $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> bxw<E, R> a(App<bxw.c<E>, Function3<T1, T2, T3, R>> $$0, App<bxw.c<E>, T1> $$1, App<bxw.c<E>, T2> $$2, App<bxw.c<E>, T3> $$3) {
         final bxw.e<E, T1> $$4 = (bxw.e<E, T1>)bxw.b((App<bxw.c<E>, M>)$$1);
         final bxw.e<E, T2> $$5 = (bxw.e<E, T2>)bxw.b((App<bxw.c<E>, M>)$$2);
         final bxw.e<E, T3> $$6 = (bxw.e<E, T3>)bxw.b((App<bxw.c<E>, M>)$$3);
         final bxw.e<E, Function3<T1, T2, T3, R>> $$7 = bxw.b($$0);
         return bxw.a(new bxw.e<E, R>() {
            @Override
            public R a(aqn $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> bxw<E, R> a(
         App<bxw.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<bxw.c<E>, T1> $$1, App<bxw.c<E>, T2> $$2, App<bxw.c<E>, T3> $$3, App<bxw.c<E>, T4> $$4
      ) {
         final bxw.e<E, T1> $$5 = (bxw.e<E, T1>)bxw.b((App<bxw.c<E>, M>)$$1);
         final bxw.e<E, T2> $$6 = (bxw.e<E, T2>)bxw.b((App<bxw.c<E>, M>)$$2);
         final bxw.e<E, T3> $$7 = (bxw.e<E, T3>)bxw.b((App<bxw.c<E>, M>)$$3);
         final bxw.e<E, T4> $$8 = (bxw.e<E, T4>)bxw.b((App<bxw.c<E>, M>)$$4);
         final bxw.e<E, Function4<T1, T2, T3, T4, R>> $$9 = bxw.b($$0);
         return bxw.a(new bxw.e<E, R>() {
            @Override
            public R a(aqn $$0, E $$1, long $$2) {
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

      static final class a<E extends bsq> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bsq> implements K1 {
   }

   static final class d<E extends bsq, F extends K1, Value> extends bxw<E, bxx<F, Value>> {
      d(final bxy<F, Value> $$0) {
         super(new bxw.e<E, bxx<F, Value>>() {
            public bxx<F, Value> b(aqn $$0x, E $$1, long $$2) {
               bts<?> $$3 = $$1.dS();
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

   interface e<E extends bsq, R> {
      @Nullable
      R a(aqn var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bsq> extends bxw<E, Unit> {
      f(final bxz<? super E> $$0) {
         super(new bxw.e<E, Unit>() {
            @Nullable
            public Unit b(aqn $$0x, E $$1, long $$2) {
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
