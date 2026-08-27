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

public class buu<E extends bpp, M> implements App<buu.c<E>, M> {
   private final buu.e<E, M> a;

   public static <E extends bpp, M> buu<E, M> a(App<buu.c<E>, M> $$0) {
      return (buu<E, M>)$$0;
   }

   public static <E extends bpp> buu.b<E> a() {
      return new buu.b<>();
   }

   public static <E extends bpp> bss<E> a(Function<buu.b<E>, ? extends App<buu.c<E>, bux<E>>> $$0) {
      final buu.e<E, bux<E>> $$1 = b((App<buu.c<E>, bux<E>>)$$0.apply(a()));
      return new bss<E>() {
         @Override
         public boolean trigger(apf $$0, E $$1x, long $$2) {
            bux<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bpp> bss<E> a(bux<? super E> $$0, bux<? super E> $$1) {
      return a((Function<buu.b<E>, ? extends App<buu.c<E>, bux<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bpp> bss<E> a(Predicate<E> $$0, bss<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bpp> bss<E> a(Predicate<E> $$0) {
      return a((Function<buu.b<E>, ? extends App<buu.c<E>, bux<E>>>)($$1 -> $$1.a((bux<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bpp> bss<E> a(BiPredicate<apf, E> $$0) {
      return a((Function<buu.b<E>, ? extends App<buu.c<E>, bux<E>>>)($$1 -> $$1.a((bux<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bpp, M> buu.e<E, M> b(App<buu.c<E>, M> $$0) {
      return a($$0).a;
   }

   buu(buu.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bpp, M> buu<E, M> a(buu.e<E, M> $$0) {
      return new buu<>($$0);
   }

   static final class a<E extends bpp, A> extends buu<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new buu.e<E, A>() {
            @Override
            public A a(apf $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bpp> implements Applicative<buu.c<E>, buu.b.a<E>> {
      public <Value> Optional<Value> a(buv<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(buv<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> buu<E, buv<Mu, Value>> a(bys<Value> $$0) {
         return new buu.d<>(new buw.c<>($$0));
      }

      public <Value> buu<E, buv<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(bys<Value> $$0) {
         return new buu.d<>(new buw.b<>($$0));
      }

      public <Value> buu<E, buv<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(bys<Value> $$0) {
         return new buu.d<>(new buw.a<>($$0));
      }

      public buu<E, Unit> a(bux<? super E> $$0) {
         return new buu.f<>($$0);
      }

      public <A> buu<E, A> a(A $$0) {
         return new buu.a<>($$0);
      }

      public <A> buu<E, A> a(Supplier<String> $$0, A $$1) {
         return new buu.a<>($$1, $$0);
      }

      public <A, R> Function<App<buu.c<E>, A>, App<buu.c<E>, R>> lift1(App<buu.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final buu.e<E, A> $$2 = (buu.e<E, A>)buu.b((App<buu.c<E>, M>)$$1);
            final buu.e<E, Function<A, R>> $$3 = buu.b($$0);
            return buu.a(new buu.e<E, R>() {
               @Override
               public R a(apf $$0, E $$1, long $$2x) {
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

      public <T, R> buu<E, R> a(final Function<? super T, ? extends R> $$0, App<buu.c<E>, T> $$1) {
         final buu.e<E, T> $$2 = (buu.e<E, T>)buu.b((App<buu.c<E>, M>)$$1);
         return buu.a(new buu.e<E, R>() {
            @Override
            public R a(apf $$0x, E $$1, long $$2x) {
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

      public <A, B, R> buu<E, R> a(App<buu.c<E>, BiFunction<A, B, R>> $$0, App<buu.c<E>, A> $$1, App<buu.c<E>, B> $$2) {
         final buu.e<E, A> $$3 = (buu.e<E, A>)buu.b((App<buu.c<E>, M>)$$1);
         final buu.e<E, B> $$4 = (buu.e<E, B>)buu.b((App<buu.c<E>, M>)$$2);
         final buu.e<E, BiFunction<A, B, R>> $$5 = buu.b($$0);
         return buu.a(new buu.e<E, R>() {
            @Override
            public R a(apf $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> buu<E, R> a(App<buu.c<E>, Function3<T1, T2, T3, R>> $$0, App<buu.c<E>, T1> $$1, App<buu.c<E>, T2> $$2, App<buu.c<E>, T3> $$3) {
         final buu.e<E, T1> $$4 = (buu.e<E, T1>)buu.b((App<buu.c<E>, M>)$$1);
         final buu.e<E, T2> $$5 = (buu.e<E, T2>)buu.b((App<buu.c<E>, M>)$$2);
         final buu.e<E, T3> $$6 = (buu.e<E, T3>)buu.b((App<buu.c<E>, M>)$$3);
         final buu.e<E, Function3<T1, T2, T3, R>> $$7 = buu.b($$0);
         return buu.a(new buu.e<E, R>() {
            @Override
            public R a(apf $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> buu<E, R> a(
         App<buu.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<buu.c<E>, T1> $$1, App<buu.c<E>, T2> $$2, App<buu.c<E>, T3> $$3, App<buu.c<E>, T4> $$4
      ) {
         final buu.e<E, T1> $$5 = (buu.e<E, T1>)buu.b((App<buu.c<E>, M>)$$1);
         final buu.e<E, T2> $$6 = (buu.e<E, T2>)buu.b((App<buu.c<E>, M>)$$2);
         final buu.e<E, T3> $$7 = (buu.e<E, T3>)buu.b((App<buu.c<E>, M>)$$3);
         final buu.e<E, T4> $$8 = (buu.e<E, T4>)buu.b((App<buu.c<E>, M>)$$4);
         final buu.e<E, Function4<T1, T2, T3, T4, R>> $$9 = buu.b($$0);
         return buu.a(new buu.e<E, R>() {
            @Override
            public R a(apf $$0, E $$1, long $$2) {
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

      static final class a<E extends bpp> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bpp> implements K1 {
   }

   static final class d<E extends bpp, F extends K1, Value> extends buu<E, buv<F, Value>> {
      d(final buw<F, Value> $$0) {
         super(new buu.e<E, buv<F, Value>>() {
            public buv<F, Value> b(apf $$0x, E $$1, long $$2) {
               bqq<?> $$3 = $$1.dP();
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

   interface e<E extends bpp, R> {
      @Nullable
      R a(apf var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bpp> extends buu<E, Unit> {
      f(final bux<? super E> $$0) {
         super(new buu.e<E, Unit>() {
            @Nullable
            public Unit b(apf $$0x, E $$1, long $$2) {
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
