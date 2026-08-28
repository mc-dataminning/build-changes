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

public class cam<E extends bvg, M> implements App<cam.c<E>, M> {
   private final cam.e<E, M> a;

   public static <E extends bvg, M> cam<E, M> a(App<cam.c<E>, M> $$0) {
      return (cam<E, M>)$$0;
   }

   public static <E extends bvg> cam.b<E> a() {
      return new cam.b<>();
   }

   public static <E extends bvg> byk<E> a(Function<cam.b<E>, ? extends App<cam.c<E>, cap<E>>> $$0) {
      final cam.e<E, cap<E>> $$1 = b((App<cam.c<E>, cap<E>>)$$0.apply(a()));
      return new byk<E>() {
         @Override
         public boolean trigger(arc $$0, E $$1x, long $$2) {
            cap<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bvg> byk<E> a(cap<? super E> $$0, cap<? super E> $$1) {
      return a((Function<cam.b<E>, ? extends App<cam.c<E>, cap<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bvg> byk<E> a(Predicate<E> $$0, byk<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bvg> byk<E> a(Predicate<E> $$0) {
      return a((Function<cam.b<E>, ? extends App<cam.c<E>, cap<E>>>)($$1 -> $$1.a((cap<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bvg> byk<E> a(BiPredicate<arc, E> $$0) {
      return a((Function<cam.b<E>, ? extends App<cam.c<E>, cap<E>>>)($$1 -> $$1.a((cap<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bvg, M> cam.e<E, M> b(App<cam.c<E>, M> $$0) {
      return a($$0).a;
   }

   cam(cam.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bvg, M> cam<E, M> a(cam.e<E, M> $$0) {
      return new cam<>($$0);
   }

   static final class a<E extends bvg, A> extends cam<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new cam.e<E, A>() {
            @Override
            public A a(arc $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bvg> implements Applicative<cam.c<E>, cam.b.a<E>> {
      public <Value> Optional<Value> a(can<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(can<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> cam<E, can<Mu, Value>> a(cek<Value> $$0) {
         return new cam.d<>(new cao.c<>($$0));
      }

      public <Value> cam<E, can<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(cek<Value> $$0) {
         return new cam.d<>(new cao.b<>($$0));
      }

      public <Value> cam<E, can<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(cek<Value> $$0) {
         return new cam.d<>(new cao.a<>($$0));
      }

      public cam<E, Unit> a(cap<? super E> $$0) {
         return new cam.f<>($$0);
      }

      public <A> cam<E, A> a(A $$0) {
         return new cam.a<>($$0);
      }

      public <A> cam<E, A> a(Supplier<String> $$0, A $$1) {
         return new cam.a<>($$1, $$0);
      }

      public <A, R> Function<App<cam.c<E>, A>, App<cam.c<E>, R>> lift1(App<cam.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final cam.e<E, A> $$2 = (cam.e<E, A>)cam.b((App<cam.c<E>, M>)$$1);
            final cam.e<E, Function<A, R>> $$3 = cam.b($$0);
            return cam.a(new cam.e<E, R>() {
               @Override
               public R a(arc $$0, E $$1, long $$2x) {
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

      public <T, R> cam<E, R> a(final Function<? super T, ? extends R> $$0, App<cam.c<E>, T> $$1) {
         final cam.e<E, T> $$2 = (cam.e<E, T>)cam.b((App<cam.c<E>, M>)$$1);
         return cam.a(new cam.e<E, R>() {
            @Override
            public R a(arc $$0x, E $$1, long $$2x) {
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

      public <A, B, R> cam<E, R> a(App<cam.c<E>, BiFunction<A, B, R>> $$0, App<cam.c<E>, A> $$1, App<cam.c<E>, B> $$2) {
         final cam.e<E, A> $$3 = (cam.e<E, A>)cam.b((App<cam.c<E>, M>)$$1);
         final cam.e<E, B> $$4 = (cam.e<E, B>)cam.b((App<cam.c<E>, M>)$$2);
         final cam.e<E, BiFunction<A, B, R>> $$5 = cam.b($$0);
         return cam.a(new cam.e<E, R>() {
            @Override
            public R a(arc $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> cam<E, R> a(App<cam.c<E>, Function3<T1, T2, T3, R>> $$0, App<cam.c<E>, T1> $$1, App<cam.c<E>, T2> $$2, App<cam.c<E>, T3> $$3) {
         final cam.e<E, T1> $$4 = (cam.e<E, T1>)cam.b((App<cam.c<E>, M>)$$1);
         final cam.e<E, T2> $$5 = (cam.e<E, T2>)cam.b((App<cam.c<E>, M>)$$2);
         final cam.e<E, T3> $$6 = (cam.e<E, T3>)cam.b((App<cam.c<E>, M>)$$3);
         final cam.e<E, Function3<T1, T2, T3, R>> $$7 = cam.b($$0);
         return cam.a(new cam.e<E, R>() {
            @Override
            public R a(arc $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> cam<E, R> a(
         App<cam.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<cam.c<E>, T1> $$1, App<cam.c<E>, T2> $$2, App<cam.c<E>, T3> $$3, App<cam.c<E>, T4> $$4
      ) {
         final cam.e<E, T1> $$5 = (cam.e<E, T1>)cam.b((App<cam.c<E>, M>)$$1);
         final cam.e<E, T2> $$6 = (cam.e<E, T2>)cam.b((App<cam.c<E>, M>)$$2);
         final cam.e<E, T3> $$7 = (cam.e<E, T3>)cam.b((App<cam.c<E>, M>)$$3);
         final cam.e<E, T4> $$8 = (cam.e<E, T4>)cam.b((App<cam.c<E>, M>)$$4);
         final cam.e<E, Function4<T1, T2, T3, T4, R>> $$9 = cam.b($$0);
         return cam.a(new cam.e<E, R>() {
            @Override
            public R a(arc $$0, E $$1, long $$2) {
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

      static final class a<E extends bvg> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bvg> implements K1 {
   }

   static final class d<E extends bvg, F extends K1, Value> extends cam<E, can<F, Value>> {
      d(final cao<F, Value> $$0) {
         super(new cam.e<E, can<F, Value>>() {
            public can<F, Value> b(arc $$0x, E $$1, long $$2) {
               bwi<?> $$3 = $$1.ec();
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

   interface e<E extends bvg, R> {
      @Nullable
      R a(arc var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bvg> extends cam<E, Unit> {
      f(final cap<? super E> $$0) {
         super(new cam.e<E, Unit>() {
            @Nullable
            public Unit b(arc $$0x, E $$1, long $$2) {
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
