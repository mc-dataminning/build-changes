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

public class byt<E extends btn, M> implements App<byt.c<E>, M> {
   private final byt.e<E, M> a;

   public static <E extends btn, M> byt<E, M> a(App<byt.c<E>, M> $$0) {
      return (byt<E, M>)$$0;
   }

   public static <E extends btn> byt.b<E> a() {
      return new byt.b<>();
   }

   public static <E extends btn> bwr<E> a(Function<byt.b<E>, ? extends App<byt.c<E>, byw<E>>> $$0) {
      final byt.e<E, byw<E>> $$1 = b((App<byt.c<E>, byw<E>>)$$0.apply(a()));
      return new bwr<E>() {
         @Override
         public boolean trigger(are $$0, E $$1x, long $$2) {
            byw<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends btn> bwr<E> a(byw<? super E> $$0, byw<? super E> $$1) {
      return a((Function<byt.b<E>, ? extends App<byt.c<E>, byw<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends btn> bwr<E> a(Predicate<E> $$0, bwr<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends btn> bwr<E> a(Predicate<E> $$0) {
      return a((Function<byt.b<E>, ? extends App<byt.c<E>, byw<E>>>)($$1 -> $$1.a((byw<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends btn> bwr<E> a(BiPredicate<are, E> $$0) {
      return a((Function<byt.b<E>, ? extends App<byt.c<E>, byw<E>>>)($$1 -> $$1.a((byw<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends btn, M> byt.e<E, M> b(App<byt.c<E>, M> $$0) {
      return a($$0).a;
   }

   byt(byt.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends btn, M> byt<E, M> a(byt.e<E, M> $$0) {
      return new byt<>($$0);
   }

   static final class a<E extends btn, A> extends byt<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new byt.e<E, A>() {
            @Override
            public A a(are $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends btn> implements Applicative<byt.c<E>, byt.b.a<E>> {
      public <Value> Optional<Value> a(byu<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(byu<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> byt<E, byu<Mu, Value>> a(ccr<Value> $$0) {
         return new byt.d<>(new byv.c<>($$0));
      }

      public <Value> byt<E, byu<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(ccr<Value> $$0) {
         return new byt.d<>(new byv.b<>($$0));
      }

      public <Value> byt<E, byu<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(ccr<Value> $$0) {
         return new byt.d<>(new byv.a<>($$0));
      }

      public byt<E, Unit> a(byw<? super E> $$0) {
         return new byt.f<>($$0);
      }

      public <A> byt<E, A> a(A $$0) {
         return new byt.a<>($$0);
      }

      public <A> byt<E, A> a(Supplier<String> $$0, A $$1) {
         return new byt.a<>($$1, $$0);
      }

      public <A, R> Function<App<byt.c<E>, A>, App<byt.c<E>, R>> lift1(App<byt.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final byt.e<E, A> $$2 = (byt.e<E, A>)byt.b((App<byt.c<E>, M>)$$1);
            final byt.e<E, Function<A, R>> $$3 = byt.b($$0);
            return byt.a(new byt.e<E, R>() {
               @Override
               public R a(are $$0, E $$1, long $$2x) {
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

      public <T, R> byt<E, R> a(final Function<? super T, ? extends R> $$0, App<byt.c<E>, T> $$1) {
         final byt.e<E, T> $$2 = (byt.e<E, T>)byt.b((App<byt.c<E>, M>)$$1);
         return byt.a(new byt.e<E, R>() {
            @Override
            public R a(are $$0x, E $$1, long $$2x) {
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

      public <A, B, R> byt<E, R> a(App<byt.c<E>, BiFunction<A, B, R>> $$0, App<byt.c<E>, A> $$1, App<byt.c<E>, B> $$2) {
         final byt.e<E, A> $$3 = (byt.e<E, A>)byt.b((App<byt.c<E>, M>)$$1);
         final byt.e<E, B> $$4 = (byt.e<E, B>)byt.b((App<byt.c<E>, M>)$$2);
         final byt.e<E, BiFunction<A, B, R>> $$5 = byt.b($$0);
         return byt.a(new byt.e<E, R>() {
            @Override
            public R a(are $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> byt<E, R> a(App<byt.c<E>, Function3<T1, T2, T3, R>> $$0, App<byt.c<E>, T1> $$1, App<byt.c<E>, T2> $$2, App<byt.c<E>, T3> $$3) {
         final byt.e<E, T1> $$4 = (byt.e<E, T1>)byt.b((App<byt.c<E>, M>)$$1);
         final byt.e<E, T2> $$5 = (byt.e<E, T2>)byt.b((App<byt.c<E>, M>)$$2);
         final byt.e<E, T3> $$6 = (byt.e<E, T3>)byt.b((App<byt.c<E>, M>)$$3);
         final byt.e<E, Function3<T1, T2, T3, R>> $$7 = byt.b($$0);
         return byt.a(new byt.e<E, R>() {
            @Override
            public R a(are $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> byt<E, R> a(
         App<byt.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<byt.c<E>, T1> $$1, App<byt.c<E>, T2> $$2, App<byt.c<E>, T3> $$3, App<byt.c<E>, T4> $$4
      ) {
         final byt.e<E, T1> $$5 = (byt.e<E, T1>)byt.b((App<byt.c<E>, M>)$$1);
         final byt.e<E, T2> $$6 = (byt.e<E, T2>)byt.b((App<byt.c<E>, M>)$$2);
         final byt.e<E, T3> $$7 = (byt.e<E, T3>)byt.b((App<byt.c<E>, M>)$$3);
         final byt.e<E, T4> $$8 = (byt.e<E, T4>)byt.b((App<byt.c<E>, M>)$$4);
         final byt.e<E, Function4<T1, T2, T3, T4, R>> $$9 = byt.b($$0);
         return byt.a(new byt.e<E, R>() {
            @Override
            public R a(are $$0, E $$1, long $$2) {
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

      static final class a<E extends btn> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends btn> implements K1 {
   }

   static final class d<E extends btn, F extends K1, Value> extends byt<E, byu<F, Value>> {
      d(final byv<F, Value> $$0) {
         super(new byt.e<E, byu<F, Value>>() {
            public byu<F, Value> b(are $$0x, E $$1, long $$2) {
               bup<?> $$3 = $$1.dS();
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

   interface e<E extends btn, R> {
      @Nullable
      R a(are var1, E var2, long var3);

      String a();
   }

   static final class f<E extends btn> extends byt<E, Unit> {
      f(final byw<? super E> $$0) {
         super(new byt.e<E, Unit>() {
            @Nullable
            public Unit b(are $$0x, E $$1, long $$2) {
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
