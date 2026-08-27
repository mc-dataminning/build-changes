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

public class bld<E extends bfz, M> implements App<bld.c<E>, M> {
   private final bld.e<E, M> a;

   public static <E extends bfz, M> bld<E, M> a(App<bld.c<E>, M> $$0) {
      return (bld<E, M>)$$0;
   }

   public static <E extends bfz> bld.b<E> a() {
      return new bld.b<>();
   }

   public static <E extends bfz> bjb<E> a(Function<bld.b<E>, ? extends App<bld.c<E>, blg<E>>> $$0) {
      final bld.e<E, blg<E>> $$1 = b((App<bld.c<E>, blg<E>>)$$0.apply(a()));
      return new bjb<E>() {
         @Override
         public boolean trigger(aif $$0, E $$1x, long $$2) {
            blg<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bfz> bjb<E> a(blg<? super E> $$0, blg<? super E> $$1) {
      return a((Function<bld.b<E>, ? extends App<bld.c<E>, blg<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bfz> bjb<E> a(Predicate<E> $$0, bjb<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bfz> bjb<E> a(Predicate<E> $$0) {
      return a((Function<bld.b<E>, ? extends App<bld.c<E>, blg<E>>>)($$1 -> $$1.a((blg<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bfz> bjb<E> a(BiPredicate<aif, E> $$0) {
      return a((Function<bld.b<E>, ? extends App<bld.c<E>, blg<E>>>)($$1 -> $$1.a((blg<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bfz, M> bld.e<E, M> b(App<bld.c<E>, M> $$0) {
      return a($$0).a;
   }

   bld(bld.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bfz, M> bld<E, M> a(bld.e<E, M> $$0) {
      return new bld<>($$0);
   }

   static final class a<E extends bfz, A> extends bld<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new bld.e<E, A>() {
            @Override
            public A a(aif $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bfz> implements Applicative<bld.c<E>, bld.b.a<E>> {
      public <Value> Optional<Value> a(ble<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(ble<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> bld<E, ble<Mu, Value>> a(bpb<Value> $$0) {
         return new bld.d<>(new blf.c<>($$0));
      }

      public <Value> bld<E, ble<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(bpb<Value> $$0) {
         return new bld.d<>(new blf.b<>($$0));
      }

      public <Value> bld<E, ble<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(bpb<Value> $$0) {
         return new bld.d<>(new blf.a<>($$0));
      }

      public bld<E, Unit> a(blg<? super E> $$0) {
         return new bld.f<>($$0);
      }

      public <A> bld<E, A> a(A $$0) {
         return new bld.a<>($$0);
      }

      public <A> bld<E, A> a(Supplier<String> $$0, A $$1) {
         return new bld.a<>($$1, $$0);
      }

      public <A, R> Function<App<bld.c<E>, A>, App<bld.c<E>, R>> lift1(App<bld.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final bld.e<E, A> $$2 = (bld.e<E, A>)bld.b((App<bld.c<E>, M>)$$1);
            final bld.e<E, Function<A, R>> $$3 = bld.b($$0);
            return bld.a(new bld.e<E, R>() {
               @Override
               public R a(aif $$0, E $$1, long $$2x) {
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

      public <T, R> bld<E, R> a(final Function<? super T, ? extends R> $$0, App<bld.c<E>, T> $$1) {
         final bld.e<E, T> $$2 = (bld.e<E, T>)bld.b((App<bld.c<E>, M>)$$1);
         return bld.a(new bld.e<E, R>() {
            @Override
            public R a(aif $$0x, E $$1, long $$2x) {
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

      public <A, B, R> bld<E, R> a(App<bld.c<E>, BiFunction<A, B, R>> $$0, App<bld.c<E>, A> $$1, App<bld.c<E>, B> $$2) {
         final bld.e<E, A> $$3 = (bld.e<E, A>)bld.b((App<bld.c<E>, M>)$$1);
         final bld.e<E, B> $$4 = (bld.e<E, B>)bld.b((App<bld.c<E>, M>)$$2);
         final bld.e<E, BiFunction<A, B, R>> $$5 = bld.b($$0);
         return bld.a(new bld.e<E, R>() {
            @Override
            public R a(aif $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> bld<E, R> a(App<bld.c<E>, Function3<T1, T2, T3, R>> $$0, App<bld.c<E>, T1> $$1, App<bld.c<E>, T2> $$2, App<bld.c<E>, T3> $$3) {
         final bld.e<E, T1> $$4 = (bld.e<E, T1>)bld.b((App<bld.c<E>, M>)$$1);
         final bld.e<E, T2> $$5 = (bld.e<E, T2>)bld.b((App<bld.c<E>, M>)$$2);
         final bld.e<E, T3> $$6 = (bld.e<E, T3>)bld.b((App<bld.c<E>, M>)$$3);
         final bld.e<E, Function3<T1, T2, T3, R>> $$7 = bld.b($$0);
         return bld.a(new bld.e<E, R>() {
            @Override
            public R a(aif $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> bld<E, R> a(
         App<bld.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<bld.c<E>, T1> $$1, App<bld.c<E>, T2> $$2, App<bld.c<E>, T3> $$3, App<bld.c<E>, T4> $$4
      ) {
         final bld.e<E, T1> $$5 = (bld.e<E, T1>)bld.b((App<bld.c<E>, M>)$$1);
         final bld.e<E, T2> $$6 = (bld.e<E, T2>)bld.b((App<bld.c<E>, M>)$$2);
         final bld.e<E, T3> $$7 = (bld.e<E, T3>)bld.b((App<bld.c<E>, M>)$$3);
         final bld.e<E, T4> $$8 = (bld.e<E, T4>)bld.b((App<bld.c<E>, M>)$$4);
         final bld.e<E, Function4<T1, T2, T3, T4, R>> $$9 = bld.b($$0);
         return bld.a(new bld.e<E, R>() {
            @Override
            public R a(aif $$0, E $$1, long $$2) {
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

      static final class a<E extends bfz> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bfz> implements K1 {
   }

   static final class d<E extends bfz, F extends K1, Value> extends bld<E, ble<F, Value>> {
      d(final blf<F, Value> $$0) {
         super(new bld.e<E, ble<F, Value>>() {
            public ble<F, Value> b(aif $$0x, E $$1, long $$2) {
               bha<?> $$3 = $$1.dK();
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

   interface e<E extends bfz, R> {
      @Nullable
      R a(aif var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bfz> extends bld<E, Unit> {
      f(final blg<? super E> $$0) {
         super(new bld.e<E, Unit>() {
            @Nullable
            public Unit b(aif $$0x, E $$1, long $$2) {
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
