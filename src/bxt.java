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

public class bxt<E extends bso, M> implements App<bxt.c<E>, M> {
   private final bxt.e<E, M> a;

   public static <E extends bso, M> bxt<E, M> a(App<bxt.c<E>, M> $$0) {
      return (bxt<E, M>)$$0;
   }

   public static <E extends bso> bxt.b<E> a() {
      return new bxt.b<>();
   }

   public static <E extends bso> bvr<E> a(Function<bxt.b<E>, ? extends App<bxt.c<E>, bxw<E>>> $$0) {
      final bxt.e<E, bxw<E>> $$1 = b((App<bxt.c<E>, bxw<E>>)$$0.apply(a()));
      return new bvr<E>() {
         @Override
         public boolean trigger(aqt $$0, E $$1x, long $$2) {
            bxw<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bso> bvr<E> a(bxw<? super E> $$0, bxw<? super E> $$1) {
      return a((Function<bxt.b<E>, ? extends App<bxt.c<E>, bxw<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bso> bvr<E> a(Predicate<E> $$0, bvr<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bso> bvr<E> a(Predicate<E> $$0) {
      return a((Function<bxt.b<E>, ? extends App<bxt.c<E>, bxw<E>>>)($$1 -> $$1.a((bxw<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bso> bvr<E> a(BiPredicate<aqt, E> $$0) {
      return a((Function<bxt.b<E>, ? extends App<bxt.c<E>, bxw<E>>>)($$1 -> $$1.a((bxw<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bso, M> bxt.e<E, M> b(App<bxt.c<E>, M> $$0) {
      return a($$0).a;
   }

   bxt(bxt.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bso, M> bxt<E, M> a(bxt.e<E, M> $$0) {
      return new bxt<>($$0);
   }

   static final class a<E extends bso, A> extends bxt<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new bxt.e<E, A>() {
            @Override
            public A a(aqt $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bso> implements Applicative<bxt.c<E>, bxt.b.a<E>> {
      public <Value> Optional<Value> a(bxu<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(bxu<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> bxt<E, bxu<Mu, Value>> a(cbr<Value> $$0) {
         return new bxt.d<>(new bxv.c<>($$0));
      }

      public <Value> bxt<E, bxu<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(cbr<Value> $$0) {
         return new bxt.d<>(new bxv.b<>($$0));
      }

      public <Value> bxt<E, bxu<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(cbr<Value> $$0) {
         return new bxt.d<>(new bxv.a<>($$0));
      }

      public bxt<E, Unit> a(bxw<? super E> $$0) {
         return new bxt.f<>($$0);
      }

      public <A> bxt<E, A> a(A $$0) {
         return new bxt.a<>($$0);
      }

      public <A> bxt<E, A> a(Supplier<String> $$0, A $$1) {
         return new bxt.a<>($$1, $$0);
      }

      public <A, R> Function<App<bxt.c<E>, A>, App<bxt.c<E>, R>> lift1(App<bxt.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final bxt.e<E, A> $$2 = (bxt.e<E, A>)bxt.b((App<bxt.c<E>, M>)$$1);
            final bxt.e<E, Function<A, R>> $$3 = bxt.b($$0);
            return bxt.a(new bxt.e<E, R>() {
               @Override
               public R a(aqt $$0, E $$1, long $$2x) {
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

      public <T, R> bxt<E, R> a(final Function<? super T, ? extends R> $$0, App<bxt.c<E>, T> $$1) {
         final bxt.e<E, T> $$2 = (bxt.e<E, T>)bxt.b((App<bxt.c<E>, M>)$$1);
         return bxt.a(new bxt.e<E, R>() {
            @Override
            public R a(aqt $$0x, E $$1, long $$2x) {
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

      public <A, B, R> bxt<E, R> a(App<bxt.c<E>, BiFunction<A, B, R>> $$0, App<bxt.c<E>, A> $$1, App<bxt.c<E>, B> $$2) {
         final bxt.e<E, A> $$3 = (bxt.e<E, A>)bxt.b((App<bxt.c<E>, M>)$$1);
         final bxt.e<E, B> $$4 = (bxt.e<E, B>)bxt.b((App<bxt.c<E>, M>)$$2);
         final bxt.e<E, BiFunction<A, B, R>> $$5 = bxt.b($$0);
         return bxt.a(new bxt.e<E, R>() {
            @Override
            public R a(aqt $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> bxt<E, R> a(App<bxt.c<E>, Function3<T1, T2, T3, R>> $$0, App<bxt.c<E>, T1> $$1, App<bxt.c<E>, T2> $$2, App<bxt.c<E>, T3> $$3) {
         final bxt.e<E, T1> $$4 = (bxt.e<E, T1>)bxt.b((App<bxt.c<E>, M>)$$1);
         final bxt.e<E, T2> $$5 = (bxt.e<E, T2>)bxt.b((App<bxt.c<E>, M>)$$2);
         final bxt.e<E, T3> $$6 = (bxt.e<E, T3>)bxt.b((App<bxt.c<E>, M>)$$3);
         final bxt.e<E, Function3<T1, T2, T3, R>> $$7 = bxt.b($$0);
         return bxt.a(new bxt.e<E, R>() {
            @Override
            public R a(aqt $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> bxt<E, R> a(
         App<bxt.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<bxt.c<E>, T1> $$1, App<bxt.c<E>, T2> $$2, App<bxt.c<E>, T3> $$3, App<bxt.c<E>, T4> $$4
      ) {
         final bxt.e<E, T1> $$5 = (bxt.e<E, T1>)bxt.b((App<bxt.c<E>, M>)$$1);
         final bxt.e<E, T2> $$6 = (bxt.e<E, T2>)bxt.b((App<bxt.c<E>, M>)$$2);
         final bxt.e<E, T3> $$7 = (bxt.e<E, T3>)bxt.b((App<bxt.c<E>, M>)$$3);
         final bxt.e<E, T4> $$8 = (bxt.e<E, T4>)bxt.b((App<bxt.c<E>, M>)$$4);
         final bxt.e<E, Function4<T1, T2, T3, T4, R>> $$9 = bxt.b($$0);
         return bxt.a(new bxt.e<E, R>() {
            @Override
            public R a(aqt $$0, E $$1, long $$2) {
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

   static final class d<E extends bso, F extends K1, Value> extends bxt<E, bxu<F, Value>> {
      d(final bxv<F, Value> $$0) {
         super(new bxt.e<E, bxu<F, Value>>() {
            public bxu<F, Value> b(aqt $$0x, E $$1, long $$2) {
               btp<?> $$3 = $$1.dZ();
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
      R a(aqt var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bso> extends bxt<E, Unit> {
      f(final bxw<? super E> $$0) {
         super(new bxt.e<E, Unit>() {
            @Nullable
            public Unit b(aqt $$0x, E $$1, long $$2) {
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
