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

public class cbl<E extends bwf, M> implements App<cbl.c<E>, M> {
   private final cbl.e<E, M> a;

   public static <E extends bwf, M> cbl<E, M> a(App<cbl.c<E>, M> $$0) {
      return (cbl<E, M>)$$0;
   }

   public static <E extends bwf> cbl.b<E> a() {
      return new cbl.b<>();
   }

   public static <E extends bwf> bzj<E> a(Function<cbl.b<E>, ? extends App<cbl.c<E>, cbo<E>>> $$0) {
      final cbl.e<E, cbo<E>> $$1 = b((App<cbl.c<E>, cbo<E>>)$$0.apply(a()));
      return new bzj<E>() {
         @Override
         public boolean trigger(ash $$0, E $$1x, long $$2) {
            cbo<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bwf> bzj<E> a(cbo<? super E> $$0, cbo<? super E> $$1) {
      return a((Function<cbl.b<E>, ? extends App<cbl.c<E>, cbo<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bwf> bzj<E> a(Predicate<E> $$0, bzj<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bwf> bzj<E> a(Predicate<E> $$0) {
      return a((Function<cbl.b<E>, ? extends App<cbl.c<E>, cbo<E>>>)($$1 -> $$1.a((cbo<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bwf> bzj<E> a(BiPredicate<ash, E> $$0) {
      return a((Function<cbl.b<E>, ? extends App<cbl.c<E>, cbo<E>>>)($$1 -> $$1.a((cbo<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bwf, M> cbl.e<E, M> b(App<cbl.c<E>, M> $$0) {
      return a($$0).a;
   }

   cbl(cbl.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bwf, M> cbl<E, M> a(cbl.e<E, M> $$0) {
      return new cbl<>($$0);
   }

   static final class a<E extends bwf, A> extends cbl<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new cbl.e<E, A>() {
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

   public static final class b<E extends bwf> implements Applicative<cbl.c<E>, cbl.b.a<E>> {
      public <Value> Optional<Value> a(cbm<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(cbm<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> cbl<E, cbm<Mu, Value>> a(cfj<Value> $$0) {
         return new cbl.d<>(new cbn.c<>($$0));
      }

      public <Value> cbl<E, cbm<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(cfj<Value> $$0) {
         return new cbl.d<>(new cbn.b<>($$0));
      }

      public <Value> cbl<E, cbm<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(cfj<Value> $$0) {
         return new cbl.d<>(new cbn.a<>($$0));
      }

      public cbl<E, Unit> a(cbo<? super E> $$0) {
         return new cbl.f<>($$0);
      }

      public <A> cbl<E, A> a(A $$0) {
         return new cbl.a<>($$0);
      }

      public <A> cbl<E, A> a(Supplier<String> $$0, A $$1) {
         return new cbl.a<>($$1, $$0);
      }

      public <A, R> Function<App<cbl.c<E>, A>, App<cbl.c<E>, R>> lift1(App<cbl.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final cbl.e<E, A> $$2 = (cbl.e<E, A>)cbl.b((App<cbl.c<E>, M>)$$1);
            final cbl.e<E, Function<A, R>> $$3 = cbl.b($$0);
            return cbl.a(new cbl.e<E, R>() {
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

      public <T, R> cbl<E, R> a(final Function<? super T, ? extends R> $$0, App<cbl.c<E>, T> $$1) {
         final cbl.e<E, T> $$2 = (cbl.e<E, T>)cbl.b((App<cbl.c<E>, M>)$$1);
         return cbl.a(new cbl.e<E, R>() {
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

      public <A, B, R> cbl<E, R> a(App<cbl.c<E>, BiFunction<A, B, R>> $$0, App<cbl.c<E>, A> $$1, App<cbl.c<E>, B> $$2) {
         final cbl.e<E, A> $$3 = (cbl.e<E, A>)cbl.b((App<cbl.c<E>, M>)$$1);
         final cbl.e<E, B> $$4 = (cbl.e<E, B>)cbl.b((App<cbl.c<E>, M>)$$2);
         final cbl.e<E, BiFunction<A, B, R>> $$5 = cbl.b($$0);
         return cbl.a(new cbl.e<E, R>() {
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

      public <T1, T2, T3, R> cbl<E, R> a(App<cbl.c<E>, Function3<T1, T2, T3, R>> $$0, App<cbl.c<E>, T1> $$1, App<cbl.c<E>, T2> $$2, App<cbl.c<E>, T3> $$3) {
         final cbl.e<E, T1> $$4 = (cbl.e<E, T1>)cbl.b((App<cbl.c<E>, M>)$$1);
         final cbl.e<E, T2> $$5 = (cbl.e<E, T2>)cbl.b((App<cbl.c<E>, M>)$$2);
         final cbl.e<E, T3> $$6 = (cbl.e<E, T3>)cbl.b((App<cbl.c<E>, M>)$$3);
         final cbl.e<E, Function3<T1, T2, T3, R>> $$7 = cbl.b($$0);
         return cbl.a(new cbl.e<E, R>() {
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

      public <T1, T2, T3, T4, R> cbl<E, R> a(
         App<cbl.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<cbl.c<E>, T1> $$1, App<cbl.c<E>, T2> $$2, App<cbl.c<E>, T3> $$3, App<cbl.c<E>, T4> $$4
      ) {
         final cbl.e<E, T1> $$5 = (cbl.e<E, T1>)cbl.b((App<cbl.c<E>, M>)$$1);
         final cbl.e<E, T2> $$6 = (cbl.e<E, T2>)cbl.b((App<cbl.c<E>, M>)$$2);
         final cbl.e<E, T3> $$7 = (cbl.e<E, T3>)cbl.b((App<cbl.c<E>, M>)$$3);
         final cbl.e<E, T4> $$8 = (cbl.e<E, T4>)cbl.b((App<cbl.c<E>, M>)$$4);
         final cbl.e<E, Function4<T1, T2, T3, T4, R>> $$9 = cbl.b($$0);
         return cbl.a(new cbl.e<E, R>() {
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

      static final class a<E extends bwf> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bwf> implements K1 {
   }

   static final class d<E extends bwf, F extends K1, Value> extends cbl<E, cbm<F, Value>> {
      d(final cbn<F, Value> $$0) {
         super(new cbl.e<E, cbm<F, Value>>() {
            public cbm<F, Value> b(ash $$0x, E $$1, long $$2) {
               bxh<?> $$3 = $$1.ec();
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

   interface e<E extends bwf, R> {
      @Nullable
      R a(ash var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bwf> extends cbl<E, Unit> {
      f(final cbo<? super E> $$0) {
         super(new cbl.e<E, Unit>() {
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
