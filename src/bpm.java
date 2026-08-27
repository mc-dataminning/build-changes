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

public class bpm<E extends bkj, M> implements App<bpm.c<E>, M> {
   private final bpm.e<E, M> a;

   public static <E extends bkj, M> bpm<E, M> a(App<bpm.c<E>, M> $$0) {
      return (bpm<E, M>)$$0;
   }

   public static <E extends bkj> bpm.b<E> a() {
      return new bpm.b<>();
   }

   public static <E extends bkj> bnk<E> a(Function<bpm.b<E>, ? extends App<bpm.c<E>, bpp<E>>> $$0) {
      final bpm.e<E, bpp<E>> $$1 = b((App<bpm.c<E>, bpp<E>>)$$0.apply(a()));
      return new bnk<E>() {
         @Override
         public boolean trigger(alq $$0, E $$1x, long $$2) {
            bpp<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bkj> bnk<E> a(bpp<? super E> $$0, bpp<? super E> $$1) {
      return a((Function<bpm.b<E>, ? extends App<bpm.c<E>, bpp<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bkj> bnk<E> a(Predicate<E> $$0, bnk<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bkj> bnk<E> a(Predicate<E> $$0) {
      return a((Function<bpm.b<E>, ? extends App<bpm.c<E>, bpp<E>>>)($$1 -> $$1.a((bpp<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bkj> bnk<E> a(BiPredicate<alq, E> $$0) {
      return a((Function<bpm.b<E>, ? extends App<bpm.c<E>, bpp<E>>>)($$1 -> $$1.a((bpp<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bkj, M> bpm.e<E, M> b(App<bpm.c<E>, M> $$0) {
      return a($$0).a;
   }

   bpm(bpm.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bkj, M> bpm<E, M> a(bpm.e<E, M> $$0) {
      return new bpm<>($$0);
   }

   static final class a<E extends bkj, A> extends bpm<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new bpm.e<E, A>() {
            @Override
            public A a(alq $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bkj> implements Applicative<bpm.c<E>, bpm.b.a<E>> {
      public <Value> Optional<Value> a(bpn<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(bpn<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> bpm<E, bpn<Mu, Value>> a(btk<Value> $$0) {
         return new bpm.d<>(new bpo.c<>($$0));
      }

      public <Value> bpm<E, bpn<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(btk<Value> $$0) {
         return new bpm.d<>(new bpo.b<>($$0));
      }

      public <Value> bpm<E, bpn<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(btk<Value> $$0) {
         return new bpm.d<>(new bpo.a<>($$0));
      }

      public bpm<E, Unit> a(bpp<? super E> $$0) {
         return new bpm.f<>($$0);
      }

      public <A> bpm<E, A> a(A $$0) {
         return new bpm.a<>($$0);
      }

      public <A> bpm<E, A> a(Supplier<String> $$0, A $$1) {
         return new bpm.a<>($$1, $$0);
      }

      public <A, R> Function<App<bpm.c<E>, A>, App<bpm.c<E>, R>> lift1(App<bpm.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final bpm.e<E, A> $$2 = (bpm.e<E, A>)bpm.b((App<bpm.c<E>, M>)$$1);
            final bpm.e<E, Function<A, R>> $$3 = bpm.b($$0);
            return bpm.a(new bpm.e<E, R>() {
               @Override
               public R a(alq $$0, E $$1, long $$2x) {
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

      public <T, R> bpm<E, R> a(final Function<? super T, ? extends R> $$0, App<bpm.c<E>, T> $$1) {
         final bpm.e<E, T> $$2 = (bpm.e<E, T>)bpm.b((App<bpm.c<E>, M>)$$1);
         return bpm.a(new bpm.e<E, R>() {
            @Override
            public R a(alq $$0x, E $$1, long $$2x) {
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

      public <A, B, R> bpm<E, R> a(App<bpm.c<E>, BiFunction<A, B, R>> $$0, App<bpm.c<E>, A> $$1, App<bpm.c<E>, B> $$2) {
         final bpm.e<E, A> $$3 = (bpm.e<E, A>)bpm.b((App<bpm.c<E>, M>)$$1);
         final bpm.e<E, B> $$4 = (bpm.e<E, B>)bpm.b((App<bpm.c<E>, M>)$$2);
         final bpm.e<E, BiFunction<A, B, R>> $$5 = bpm.b($$0);
         return bpm.a(new bpm.e<E, R>() {
            @Override
            public R a(alq $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> bpm<E, R> a(App<bpm.c<E>, Function3<T1, T2, T3, R>> $$0, App<bpm.c<E>, T1> $$1, App<bpm.c<E>, T2> $$2, App<bpm.c<E>, T3> $$3) {
         final bpm.e<E, T1> $$4 = (bpm.e<E, T1>)bpm.b((App<bpm.c<E>, M>)$$1);
         final bpm.e<E, T2> $$5 = (bpm.e<E, T2>)bpm.b((App<bpm.c<E>, M>)$$2);
         final bpm.e<E, T3> $$6 = (bpm.e<E, T3>)bpm.b((App<bpm.c<E>, M>)$$3);
         final bpm.e<E, Function3<T1, T2, T3, R>> $$7 = bpm.b($$0);
         return bpm.a(new bpm.e<E, R>() {
            @Override
            public R a(alq $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> bpm<E, R> a(
         App<bpm.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<bpm.c<E>, T1> $$1, App<bpm.c<E>, T2> $$2, App<bpm.c<E>, T3> $$3, App<bpm.c<E>, T4> $$4
      ) {
         final bpm.e<E, T1> $$5 = (bpm.e<E, T1>)bpm.b((App<bpm.c<E>, M>)$$1);
         final bpm.e<E, T2> $$6 = (bpm.e<E, T2>)bpm.b((App<bpm.c<E>, M>)$$2);
         final bpm.e<E, T3> $$7 = (bpm.e<E, T3>)bpm.b((App<bpm.c<E>, M>)$$3);
         final bpm.e<E, T4> $$8 = (bpm.e<E, T4>)bpm.b((App<bpm.c<E>, M>)$$4);
         final bpm.e<E, Function4<T1, T2, T3, T4, R>> $$9 = bpm.b($$0);
         return bpm.a(new bpm.e<E, R>() {
            @Override
            public R a(alq $$0, E $$1, long $$2) {
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

      static final class a<E extends bkj> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bkj> implements K1 {
   }

   static final class d<E extends bkj, F extends K1, Value> extends bpm<E, bpn<F, Value>> {
      d(final bpo<F, Value> $$0) {
         super(new bpm.e<E, bpn<F, Value>>() {
            public bpn<F, Value> b(alq $$0x, E $$1, long $$2) {
               blj<?> $$3 = $$1.dN();
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

   interface e<E extends bkj, R> {
      @Nullable
      R a(alq var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bkj> extends bpm<E, Unit> {
      f(final bpp<? super E> $$0) {
         super(new bpm.e<E, Unit>() {
            @Nullable
            public Unit b(alq $$0x, E $$1, long $$2) {
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
