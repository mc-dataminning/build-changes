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

public class cbm<E extends bwg, M> implements App<cbm.c<E>, M> {
   private final cbm.e<E, M> a;

   public static <E extends bwg, M> cbm<E, M> a(App<cbm.c<E>, M> $$0) {
      return (cbm<E, M>)$$0;
   }

   public static <E extends bwg> cbm.b<E> a() {
      return new cbm.b<>();
   }

   public static <E extends bwg> bzk<E> a(Function<cbm.b<E>, ? extends App<cbm.c<E>, cbp<E>>> $$0) {
      final cbm.e<E, cbp<E>> $$1 = b((App<cbm.c<E>, cbp<E>>)$$0.apply(a()));
      return new bzk<E>() {
         @Override
         public boolean trigger(ash $$0, E $$1x, long $$2) {
            cbp<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bwg> bzk<E> a(cbp<? super E> $$0, cbp<? super E> $$1) {
      return a((Function<cbm.b<E>, ? extends App<cbm.c<E>, cbp<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bwg> bzk<E> a(Predicate<E> $$0, bzk<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bwg> bzk<E> a(Predicate<E> $$0) {
      return a((Function<cbm.b<E>, ? extends App<cbm.c<E>, cbp<E>>>)($$1 -> $$1.a((cbp<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bwg> bzk<E> a(BiPredicate<ash, E> $$0) {
      return a((Function<cbm.b<E>, ? extends App<cbm.c<E>, cbp<E>>>)($$1 -> $$1.a((cbp<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bwg, M> cbm.e<E, M> b(App<cbm.c<E>, M> $$0) {
      return a($$0).a;
   }

   cbm(cbm.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bwg, M> cbm<E, M> a(cbm.e<E, M> $$0) {
      return new cbm<>($$0);
   }

   static final class a<E extends bwg, A> extends cbm<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new cbm.e<E, A>() {
            @Override
            public A a(ash $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bwg> implements Applicative<cbm.c<E>, cbm.b.a<E>> {
      public <Value> Optional<Value> a(cbn<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(cbn<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> cbm<E, cbn<Mu, Value>> a(cfk<Value> $$0) {
         return new cbm.d<>(new cbo.c<>($$0));
      }

      public <Value> cbm<E, cbn<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(cfk<Value> $$0) {
         return new cbm.d<>(new cbo.b<>($$0));
      }

      public <Value> cbm<E, cbn<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(cfk<Value> $$0) {
         return new cbm.d<>(new cbo.a<>($$0));
      }

      public cbm<E, Unit> a(cbp<? super E> $$0) {
         return new cbm.f<>($$0);
      }

      public <A> cbm<E, A> a(A $$0) {
         return new cbm.a<>($$0);
      }

      public <A> cbm<E, A> a(Supplier<String> $$0, A $$1) {
         return new cbm.a<>($$1, $$0);
      }

      public <A, R> Function<App<cbm.c<E>, A>, App<cbm.c<E>, R>> lift1(App<cbm.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final cbm.e<E, A> $$2 = (cbm.e<E, A>)cbm.b((App<cbm.c<E>, M>)$$1);
            final cbm.e<E, Function<A, R>> $$3 = cbm.b($$0);
            return cbm.a(new cbm.e<E, R>() {
               @Override
               public R a(ash $$0, E $$1, long $$2x) {
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

      public <T, R> cbm<E, R> a(final Function<? super T, ? extends R> $$0, App<cbm.c<E>, T> $$1) {
         final cbm.e<E, T> $$2 = (cbm.e<E, T>)cbm.b((App<cbm.c<E>, M>)$$1);
         return cbm.a(new cbm.e<E, R>() {
            @Override
            public R a(ash $$0x, E $$1, long $$2x) {
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

      public <A, B, R> cbm<E, R> a(App<cbm.c<E>, BiFunction<A, B, R>> $$0, App<cbm.c<E>, A> $$1, App<cbm.c<E>, B> $$2) {
         final cbm.e<E, A> $$3 = (cbm.e<E, A>)cbm.b((App<cbm.c<E>, M>)$$1);
         final cbm.e<E, B> $$4 = (cbm.e<E, B>)cbm.b((App<cbm.c<E>, M>)$$2);
         final cbm.e<E, BiFunction<A, B, R>> $$5 = cbm.b($$0);
         return cbm.a(new cbm.e<E, R>() {
            @Override
            public R a(ash $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> cbm<E, R> a(App<cbm.c<E>, Function3<T1, T2, T3, R>> $$0, App<cbm.c<E>, T1> $$1, App<cbm.c<E>, T2> $$2, App<cbm.c<E>, T3> $$3) {
         final cbm.e<E, T1> $$4 = (cbm.e<E, T1>)cbm.b((App<cbm.c<E>, M>)$$1);
         final cbm.e<E, T2> $$5 = (cbm.e<E, T2>)cbm.b((App<cbm.c<E>, M>)$$2);
         final cbm.e<E, T3> $$6 = (cbm.e<E, T3>)cbm.b((App<cbm.c<E>, M>)$$3);
         final cbm.e<E, Function3<T1, T2, T3, R>> $$7 = cbm.b($$0);
         return cbm.a(new cbm.e<E, R>() {
            @Override
            public R a(ash $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> cbm<E, R> a(
         App<cbm.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<cbm.c<E>, T1> $$1, App<cbm.c<E>, T2> $$2, App<cbm.c<E>, T3> $$3, App<cbm.c<E>, T4> $$4
      ) {
         final cbm.e<E, T1> $$5 = (cbm.e<E, T1>)cbm.b((App<cbm.c<E>, M>)$$1);
         final cbm.e<E, T2> $$6 = (cbm.e<E, T2>)cbm.b((App<cbm.c<E>, M>)$$2);
         final cbm.e<E, T3> $$7 = (cbm.e<E, T3>)cbm.b((App<cbm.c<E>, M>)$$3);
         final cbm.e<E, T4> $$8 = (cbm.e<E, T4>)cbm.b((App<cbm.c<E>, M>)$$4);
         final cbm.e<E, Function4<T1, T2, T3, T4, R>> $$9 = cbm.b($$0);
         return cbm.a(new cbm.e<E, R>() {
            @Override
            public R a(ash $$0, E $$1, long $$2) {
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

      static final class a<E extends bwg> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bwg> implements K1 {
   }

   static final class d<E extends bwg, F extends K1, Value> extends cbm<E, cbn<F, Value>> {
      d(final cbo<F, Value> $$0) {
         super(new cbm.e<E, cbn<F, Value>>() {
            public cbn<F, Value> b(ash $$0x, E $$1, long $$2) {
               bxi<?> $$3 = $$1.ec();
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

   interface e<E extends bwg, R> {
      @Nullable
      R a(ash var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bwg> extends cbm<E, Unit> {
      f(final cbp<? super E> $$0) {
         super(new cbm.e<E, Unit>() {
            @Nullable
            public Unit b(ash $$0x, E $$1, long $$2) {
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
