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

public class cdj<E extends byf, M> implements App<cdj.c<E>, M> {
   private final cdj.e<E, M> a;

   public static <E extends byf, M> cdj<E, M> a(App<cdj.c<E>, M> $$0) {
      return (cdj<E, M>)$$0;
   }

   public static <E extends byf> cdj.b<E> a() {
      return new cdj.b<>();
   }

   public static <E extends byf> cbh<E> a(Function<cdj.b<E>, ? extends App<cdj.c<E>, cdm<E>>> $$0) {
      final cdj.e<E, cdm<E>> $$1 = b((App<cdj.c<E>, cdm<E>>)$$0.apply(a()));
      return new cbh<E>() {
         @Override
         public boolean trigger(asb $$0, E $$1x, long $$2) {
            cdm<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends byf> cbh<E> a(cdm<? super E> $$0, cdm<? super E> $$1) {
      return a((Function<cdj.b<E>, ? extends App<cdj.c<E>, cdm<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends byf> cbh<E> a(Predicate<E> $$0, cbh<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends byf> cbh<E> a(Predicate<E> $$0) {
      return a((Function<cdj.b<E>, ? extends App<cdj.c<E>, cdm<E>>>)($$1 -> $$1.a((cdm<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends byf> cbh<E> a(BiPredicate<asb, E> $$0) {
      return a((Function<cdj.b<E>, ? extends App<cdj.c<E>, cdm<E>>>)($$1 -> $$1.a((cdm<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends byf, M> cdj.e<E, M> b(App<cdj.c<E>, M> $$0) {
      return a($$0).a;
   }

   cdj(cdj.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends byf, M> cdj<E, M> a(cdj.e<E, M> $$0) {
      return new cdj<>($$0);
   }

   static final class a<E extends byf, A> extends cdj<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new cdj.e<E, A>() {
            @Override
            public A a(asb $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends byf> implements Applicative<cdj.c<E>, cdj.b.a<E>> {
      public <Value> Optional<Value> a(cdk<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(cdk<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> cdj<E, cdk<Mu, Value>> a(chh<Value> $$0) {
         return new cdj.d<>(new cdl.c<>($$0));
      }

      public <Value> cdj<E, cdk<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(chh<Value> $$0) {
         return new cdj.d<>(new cdl.b<>($$0));
      }

      public <Value> cdj<E, cdk<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(chh<Value> $$0) {
         return new cdj.d<>(new cdl.a<>($$0));
      }

      public cdj<E, Unit> a(cdm<? super E> $$0) {
         return new cdj.f<>($$0);
      }

      public <A> cdj<E, A> a(A $$0) {
         return new cdj.a<>($$0);
      }

      public <A> cdj<E, A> a(Supplier<String> $$0, A $$1) {
         return new cdj.a<>($$1, $$0);
      }

      public <A, R> Function<App<cdj.c<E>, A>, App<cdj.c<E>, R>> lift1(App<cdj.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final cdj.e<E, A> $$2 = (cdj.e<E, A>)cdj.b((App<cdj.c<E>, M>)$$1);
            final cdj.e<E, Function<A, R>> $$3 = cdj.b($$0);
            return cdj.a(new cdj.e<E, R>() {
               @Override
               public R a(asb $$0, E $$1, long $$2x) {
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

      public <T, R> cdj<E, R> a(final Function<? super T, ? extends R> $$0, App<cdj.c<E>, T> $$1) {
         final cdj.e<E, T> $$2 = (cdj.e<E, T>)cdj.b((App<cdj.c<E>, M>)$$1);
         return cdj.a(new cdj.e<E, R>() {
            @Override
            public R a(asb $$0x, E $$1, long $$2x) {
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

      public <A, B, R> cdj<E, R> a(App<cdj.c<E>, BiFunction<A, B, R>> $$0, App<cdj.c<E>, A> $$1, App<cdj.c<E>, B> $$2) {
         final cdj.e<E, A> $$3 = (cdj.e<E, A>)cdj.b((App<cdj.c<E>, M>)$$1);
         final cdj.e<E, B> $$4 = (cdj.e<E, B>)cdj.b((App<cdj.c<E>, M>)$$2);
         final cdj.e<E, BiFunction<A, B, R>> $$5 = cdj.b($$0);
         return cdj.a(new cdj.e<E, R>() {
            @Override
            public R a(asb $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> cdj<E, R> a(App<cdj.c<E>, Function3<T1, T2, T3, R>> $$0, App<cdj.c<E>, T1> $$1, App<cdj.c<E>, T2> $$2, App<cdj.c<E>, T3> $$3) {
         final cdj.e<E, T1> $$4 = (cdj.e<E, T1>)cdj.b((App<cdj.c<E>, M>)$$1);
         final cdj.e<E, T2> $$5 = (cdj.e<E, T2>)cdj.b((App<cdj.c<E>, M>)$$2);
         final cdj.e<E, T3> $$6 = (cdj.e<E, T3>)cdj.b((App<cdj.c<E>, M>)$$3);
         final cdj.e<E, Function3<T1, T2, T3, R>> $$7 = cdj.b($$0);
         return cdj.a(new cdj.e<E, R>() {
            @Override
            public R a(asb $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> cdj<E, R> a(
         App<cdj.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<cdj.c<E>, T1> $$1, App<cdj.c<E>, T2> $$2, App<cdj.c<E>, T3> $$3, App<cdj.c<E>, T4> $$4
      ) {
         final cdj.e<E, T1> $$5 = (cdj.e<E, T1>)cdj.b((App<cdj.c<E>, M>)$$1);
         final cdj.e<E, T2> $$6 = (cdj.e<E, T2>)cdj.b((App<cdj.c<E>, M>)$$2);
         final cdj.e<E, T3> $$7 = (cdj.e<E, T3>)cdj.b((App<cdj.c<E>, M>)$$3);
         final cdj.e<E, T4> $$8 = (cdj.e<E, T4>)cdj.b((App<cdj.c<E>, M>)$$4);
         final cdj.e<E, Function4<T1, T2, T3, T4, R>> $$9 = cdj.b($$0);
         return cdj.a(new cdj.e<E, R>() {
            @Override
            public R a(asb $$0, E $$1, long $$2) {
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

      static final class a<E extends byf> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends byf> implements K1 {
   }

   static final class d<E extends byf, F extends K1, Value> extends cdj<E, cdk<F, Value>> {
      d(final cdl<F, Value> $$0) {
         super(new cdj.e<E, cdk<F, Value>>() {
            public cdk<F, Value> b(asb $$0x, E $$1, long $$2) {
               bzf<?> $$3 = $$1.ec();
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

   interface e<E extends byf, R> {
      @Nullable
      R a(asb var1, E var2, long var3);

      String a();
   }

   static final class f<E extends byf> extends cdj<E, Unit> {
      f(final cdm<? super E> $$0) {
         super(new cdj.e<E, Unit>() {
            @Nullable
            public Unit b(asb $$0x, E $$1, long $$2) {
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
