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

public class bxu<E extends bso, M> implements App<bxu.c<E>, M> {
   private final bxu.e<E, M> a;

   public static <E extends bso, M> bxu<E, M> a(App<bxu.c<E>, M> $$0) {
      return (bxu<E, M>)$$0;
   }

   public static <E extends bso> bxu.b<E> a() {
      return new bxu.b<>();
   }

   public static <E extends bso> bvs<E> a(Function<bxu.b<E>, ? extends App<bxu.c<E>, bxx<E>>> $$0) {
      final bxu.e<E, bxx<E>> $$1 = b((App<bxu.c<E>, bxx<E>>)$$0.apply(a()));
      return new bvs<E>() {
         @Override
         public boolean trigger(aqm $$0, E $$1x, long $$2) {
            bxx<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bso> bvs<E> a(bxx<? super E> $$0, bxx<? super E> $$1) {
      return a((Function<bxu.b<E>, ? extends App<bxu.c<E>, bxx<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bso> bvs<E> a(Predicate<E> $$0, bvs<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bso> bvs<E> a(Predicate<E> $$0) {
      return a((Function<bxu.b<E>, ? extends App<bxu.c<E>, bxx<E>>>)($$1 -> $$1.a((bxx<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bso> bvs<E> a(BiPredicate<aqm, E> $$0) {
      return a((Function<bxu.b<E>, ? extends App<bxu.c<E>, bxx<E>>>)($$1 -> $$1.a((bxx<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bso, M> bxu.e<E, M> b(App<bxu.c<E>, M> $$0) {
      return a($$0).a;
   }

   bxu(bxu.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bso, M> bxu<E, M> a(bxu.e<E, M> $$0) {
      return new bxu<>($$0);
   }

   static final class a<E extends bso, A> extends bxu<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new bxu.e<E, A>() {
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

   public static final class b<E extends bso> implements Applicative<bxu.c<E>, bxu.b.a<E>> {
      public <Value> Optional<Value> a(bxv<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(bxv<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> bxu<E, bxv<Mu, Value>> a(cbs<Value> $$0) {
         return new bxu.d<>(new bxw.c<>($$0));
      }

      public <Value> bxu<E, bxv<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(cbs<Value> $$0) {
         return new bxu.d<>(new bxw.b<>($$0));
      }

      public <Value> bxu<E, bxv<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(cbs<Value> $$0) {
         return new bxu.d<>(new bxw.a<>($$0));
      }

      public bxu<E, Unit> a(bxx<? super E> $$0) {
         return new bxu.f<>($$0);
      }

      public <A> bxu<E, A> a(A $$0) {
         return new bxu.a<>($$0);
      }

      public <A> bxu<E, A> a(Supplier<String> $$0, A $$1) {
         return new bxu.a<>($$1, $$0);
      }

      public <A, R> Function<App<bxu.c<E>, A>, App<bxu.c<E>, R>> lift1(App<bxu.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final bxu.e<E, A> $$2 = (bxu.e<E, A>)bxu.b((App<bxu.c<E>, M>)$$1);
            final bxu.e<E, Function<A, R>> $$3 = bxu.b($$0);
            return bxu.a(new bxu.e<E, R>() {
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

      public <T, R> bxu<E, R> a(final Function<? super T, ? extends R> $$0, App<bxu.c<E>, T> $$1) {
         final bxu.e<E, T> $$2 = (bxu.e<E, T>)bxu.b((App<bxu.c<E>, M>)$$1);
         return bxu.a(new bxu.e<E, R>() {
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

      public <A, B, R> bxu<E, R> a(App<bxu.c<E>, BiFunction<A, B, R>> $$0, App<bxu.c<E>, A> $$1, App<bxu.c<E>, B> $$2) {
         final bxu.e<E, A> $$3 = (bxu.e<E, A>)bxu.b((App<bxu.c<E>, M>)$$1);
         final bxu.e<E, B> $$4 = (bxu.e<E, B>)bxu.b((App<bxu.c<E>, M>)$$2);
         final bxu.e<E, BiFunction<A, B, R>> $$5 = bxu.b($$0);
         return bxu.a(new bxu.e<E, R>() {
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

      public <T1, T2, T3, R> bxu<E, R> a(App<bxu.c<E>, Function3<T1, T2, T3, R>> $$0, App<bxu.c<E>, T1> $$1, App<bxu.c<E>, T2> $$2, App<bxu.c<E>, T3> $$3) {
         final bxu.e<E, T1> $$4 = (bxu.e<E, T1>)bxu.b((App<bxu.c<E>, M>)$$1);
         final bxu.e<E, T2> $$5 = (bxu.e<E, T2>)bxu.b((App<bxu.c<E>, M>)$$2);
         final bxu.e<E, T3> $$6 = (bxu.e<E, T3>)bxu.b((App<bxu.c<E>, M>)$$3);
         final bxu.e<E, Function3<T1, T2, T3, R>> $$7 = bxu.b($$0);
         return bxu.a(new bxu.e<E, R>() {
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

      public <T1, T2, T3, T4, R> bxu<E, R> a(
         App<bxu.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<bxu.c<E>, T1> $$1, App<bxu.c<E>, T2> $$2, App<bxu.c<E>, T3> $$3, App<bxu.c<E>, T4> $$4
      ) {
         final bxu.e<E, T1> $$5 = (bxu.e<E, T1>)bxu.b((App<bxu.c<E>, M>)$$1);
         final bxu.e<E, T2> $$6 = (bxu.e<E, T2>)bxu.b((App<bxu.c<E>, M>)$$2);
         final bxu.e<E, T3> $$7 = (bxu.e<E, T3>)bxu.b((App<bxu.c<E>, M>)$$3);
         final bxu.e<E, T4> $$8 = (bxu.e<E, T4>)bxu.b((App<bxu.c<E>, M>)$$4);
         final bxu.e<E, Function4<T1, T2, T3, T4, R>> $$9 = bxu.b($$0);
         return bxu.a(new bxu.e<E, R>() {
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

      static final class a<E extends bso> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bso> implements K1 {
   }

   static final class d<E extends bso, F extends K1, Value> extends bxu<E, bxv<F, Value>> {
      d(final bxw<F, Value> $$0) {
         super(new bxu.e<E, bxv<F, Value>>() {
            public bxv<F, Value> b(aqm $$0x, E $$1, long $$2) {
               btq<?> $$3 = $$1.dS();
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

   interface e<E extends bso, R> {
      @Nullable
      R a(aqm var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bso> extends bxu<E, Unit> {
      f(final bxx<? super E> $$0) {
         super(new bxu.e<E, Unit>() {
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
