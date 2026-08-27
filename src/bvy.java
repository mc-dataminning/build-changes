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

public class bvy<E extends bqt, M> implements App<bvy.c<E>, M> {
   private final bvy.e<E, M> a;

   public static <E extends bqt, M> bvy<E, M> a(App<bvy.c<E>, M> $$0) {
      return (bvy<E, M>)$$0;
   }

   public static <E extends bqt> bvy.b<E> a() {
      return new bvy.b<>();
   }

   public static <E extends bqt> btw<E> a(Function<bvy.b<E>, ? extends App<bvy.c<E>, bwb<E>>> $$0) {
      final bvy.e<E, bwb<E>> $$1 = b((App<bvy.c<E>, bwb<E>>)$$0.apply(a()));
      return new btw<E>() {
         @Override
         public boolean trigger(apu $$0, E $$1x, long $$2) {
            bwb<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bqt> btw<E> a(bwb<? super E> $$0, bwb<? super E> $$1) {
      return a((Function<bvy.b<E>, ? extends App<bvy.c<E>, bwb<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bqt> btw<E> a(Predicate<E> $$0, btw<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bqt> btw<E> a(Predicate<E> $$0) {
      return a((Function<bvy.b<E>, ? extends App<bvy.c<E>, bwb<E>>>)($$1 -> $$1.a((bwb<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bqt> btw<E> a(BiPredicate<apu, E> $$0) {
      return a((Function<bvy.b<E>, ? extends App<bvy.c<E>, bwb<E>>>)($$1 -> $$1.a((bwb<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bqt, M> bvy.e<E, M> b(App<bvy.c<E>, M> $$0) {
      return a($$0).a;
   }

   bvy(bvy.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bqt, M> bvy<E, M> a(bvy.e<E, M> $$0) {
      return new bvy<>($$0);
   }

   static final class a<E extends bqt, A> extends bvy<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new bvy.e<E, A>() {
            @Override
            public A a(apu $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bqt> implements Applicative<bvy.c<E>, bvy.b.a<E>> {
      public <Value> Optional<Value> a(bvz<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(bvz<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> bvy<E, bvz<Mu, Value>> a(bzw<Value> $$0) {
         return new bvy.d<>(new bwa.c<>($$0));
      }

      public <Value> bvy<E, bvz<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(bzw<Value> $$0) {
         return new bvy.d<>(new bwa.b<>($$0));
      }

      public <Value> bvy<E, bvz<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(bzw<Value> $$0) {
         return new bvy.d<>(new bwa.a<>($$0));
      }

      public bvy<E, Unit> a(bwb<? super E> $$0) {
         return new bvy.f<>($$0);
      }

      public <A> bvy<E, A> a(A $$0) {
         return new bvy.a<>($$0);
      }

      public <A> bvy<E, A> a(Supplier<String> $$0, A $$1) {
         return new bvy.a<>($$1, $$0);
      }

      public <A, R> Function<App<bvy.c<E>, A>, App<bvy.c<E>, R>> lift1(App<bvy.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final bvy.e<E, A> $$2 = (bvy.e<E, A>)bvy.b((App<bvy.c<E>, M>)$$1);
            final bvy.e<E, Function<A, R>> $$3 = bvy.b($$0);
            return bvy.a(new bvy.e<E, R>() {
               @Override
               public R a(apu $$0, E $$1, long $$2x) {
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

      public <T, R> bvy<E, R> a(final Function<? super T, ? extends R> $$0, App<bvy.c<E>, T> $$1) {
         final bvy.e<E, T> $$2 = (bvy.e<E, T>)bvy.b((App<bvy.c<E>, M>)$$1);
         return bvy.a(new bvy.e<E, R>() {
            @Override
            public R a(apu $$0x, E $$1, long $$2x) {
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

      public <A, B, R> bvy<E, R> a(App<bvy.c<E>, BiFunction<A, B, R>> $$0, App<bvy.c<E>, A> $$1, App<bvy.c<E>, B> $$2) {
         final bvy.e<E, A> $$3 = (bvy.e<E, A>)bvy.b((App<bvy.c<E>, M>)$$1);
         final bvy.e<E, B> $$4 = (bvy.e<E, B>)bvy.b((App<bvy.c<E>, M>)$$2);
         final bvy.e<E, BiFunction<A, B, R>> $$5 = bvy.b($$0);
         return bvy.a(new bvy.e<E, R>() {
            @Override
            public R a(apu $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> bvy<E, R> a(App<bvy.c<E>, Function3<T1, T2, T3, R>> $$0, App<bvy.c<E>, T1> $$1, App<bvy.c<E>, T2> $$2, App<bvy.c<E>, T3> $$3) {
         final bvy.e<E, T1> $$4 = (bvy.e<E, T1>)bvy.b((App<bvy.c<E>, M>)$$1);
         final bvy.e<E, T2> $$5 = (bvy.e<E, T2>)bvy.b((App<bvy.c<E>, M>)$$2);
         final bvy.e<E, T3> $$6 = (bvy.e<E, T3>)bvy.b((App<bvy.c<E>, M>)$$3);
         final bvy.e<E, Function3<T1, T2, T3, R>> $$7 = bvy.b($$0);
         return bvy.a(new bvy.e<E, R>() {
            @Override
            public R a(apu $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> bvy<E, R> a(
         App<bvy.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<bvy.c<E>, T1> $$1, App<bvy.c<E>, T2> $$2, App<bvy.c<E>, T3> $$3, App<bvy.c<E>, T4> $$4
      ) {
         final bvy.e<E, T1> $$5 = (bvy.e<E, T1>)bvy.b((App<bvy.c<E>, M>)$$1);
         final bvy.e<E, T2> $$6 = (bvy.e<E, T2>)bvy.b((App<bvy.c<E>, M>)$$2);
         final bvy.e<E, T3> $$7 = (bvy.e<E, T3>)bvy.b((App<bvy.c<E>, M>)$$3);
         final bvy.e<E, T4> $$8 = (bvy.e<E, T4>)bvy.b((App<bvy.c<E>, M>)$$4);
         final bvy.e<E, Function4<T1, T2, T3, T4, R>> $$9 = bvy.b($$0);
         return bvy.a(new bvy.e<E, R>() {
            @Override
            public R a(apu $$0, E $$1, long $$2) {
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

      static final class a<E extends bqt> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bqt> implements K1 {
   }

   static final class d<E extends bqt, F extends K1, Value> extends bvy<E, bvz<F, Value>> {
      d(final bwa<F, Value> $$0) {
         super(new bvy.e<E, bvz<F, Value>>() {
            public bvz<F, Value> b(apu $$0x, E $$1, long $$2) {
               bru<?> $$3 = $$1.dP();
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

   interface e<E extends bqt, R> {
      @Nullable
      R a(apu var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bqt> extends bvy<E, Unit> {
      f(final bwb<? super E> $$0) {
         super(new bvy.e<E, Unit>() {
            @Nullable
            public Unit b(apu $$0x, E $$1, long $$2) {
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
