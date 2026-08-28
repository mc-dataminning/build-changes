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

public class cda<E extends bxw, M> implements App<cda.c<E>, M> {
   private final cda.e<E, M> a;

   public static <E extends bxw, M> cda<E, M> a(App<cda.c<E>, M> $$0) {
      return (cda<E, M>)$$0;
   }

   public static <E extends bxw> cda.b<E> a() {
      return new cda.b<>();
   }

   public static <E extends bxw> cay<E> a(Function<cda.b<E>, ? extends App<cda.c<E>, cdd<E>>> $$0) {
      final cda.e<E, cdd<E>> $$1 = b((App<cda.c<E>, cdd<E>>)$$0.apply(a()));
      return new cay<E>() {
         @Override
         public boolean trigger(aru $$0, E $$1x, long $$2) {
            cdd<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bxw> cay<E> a(cdd<? super E> $$0, cdd<? super E> $$1) {
      return a((Function<cda.b<E>, ? extends App<cda.c<E>, cdd<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bxw> cay<E> a(Predicate<E> $$0, cay<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bxw> cay<E> a(Predicate<E> $$0) {
      return a((Function<cda.b<E>, ? extends App<cda.c<E>, cdd<E>>>)($$1 -> $$1.a((cdd<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bxw> cay<E> a(BiPredicate<aru, E> $$0) {
      return a((Function<cda.b<E>, ? extends App<cda.c<E>, cdd<E>>>)($$1 -> $$1.a((cdd<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bxw, M> cda.e<E, M> b(App<cda.c<E>, M> $$0) {
      return a($$0).a;
   }

   cda(cda.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bxw, M> cda<E, M> a(cda.e<E, M> $$0) {
      return new cda<>($$0);
   }

   static final class a<E extends bxw, A> extends cda<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new cda.e<E, A>() {
            @Override
            public A a(aru $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bxw> implements Applicative<cda.c<E>, cda.b.a<E>> {
      public <Value> Optional<Value> a(cdb<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(cdb<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> cda<E, cdb<Mu, Value>> a(cgy<Value> $$0) {
         return new cda.d<>(new cdc.c<>($$0));
      }

      public <Value> cda<E, cdb<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(cgy<Value> $$0) {
         return new cda.d<>(new cdc.b<>($$0));
      }

      public <Value> cda<E, cdb<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(cgy<Value> $$0) {
         return new cda.d<>(new cdc.a<>($$0));
      }

      public cda<E, Unit> a(cdd<? super E> $$0) {
         return new cda.f<>($$0);
      }

      public <A> cda<E, A> a(A $$0) {
         return new cda.a<>($$0);
      }

      public <A> cda<E, A> a(Supplier<String> $$0, A $$1) {
         return new cda.a<>($$1, $$0);
      }

      public <A, R> Function<App<cda.c<E>, A>, App<cda.c<E>, R>> lift1(App<cda.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final cda.e<E, A> $$2 = (cda.e<E, A>)cda.b((App<cda.c<E>, M>)$$1);
            final cda.e<E, Function<A, R>> $$3 = cda.b($$0);
            return cda.a(new cda.e<E, R>() {
               @Override
               public R a(aru $$0, E $$1, long $$2x) {
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

      public <T, R> cda<E, R> a(final Function<? super T, ? extends R> $$0, App<cda.c<E>, T> $$1) {
         final cda.e<E, T> $$2 = (cda.e<E, T>)cda.b((App<cda.c<E>, M>)$$1);
         return cda.a(new cda.e<E, R>() {
            @Override
            public R a(aru $$0x, E $$1, long $$2x) {
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

      public <A, B, R> cda<E, R> a(App<cda.c<E>, BiFunction<A, B, R>> $$0, App<cda.c<E>, A> $$1, App<cda.c<E>, B> $$2) {
         final cda.e<E, A> $$3 = (cda.e<E, A>)cda.b((App<cda.c<E>, M>)$$1);
         final cda.e<E, B> $$4 = (cda.e<E, B>)cda.b((App<cda.c<E>, M>)$$2);
         final cda.e<E, BiFunction<A, B, R>> $$5 = cda.b($$0);
         return cda.a(new cda.e<E, R>() {
            @Override
            public R a(aru $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> cda<E, R> a(App<cda.c<E>, Function3<T1, T2, T3, R>> $$0, App<cda.c<E>, T1> $$1, App<cda.c<E>, T2> $$2, App<cda.c<E>, T3> $$3) {
         final cda.e<E, T1> $$4 = (cda.e<E, T1>)cda.b((App<cda.c<E>, M>)$$1);
         final cda.e<E, T2> $$5 = (cda.e<E, T2>)cda.b((App<cda.c<E>, M>)$$2);
         final cda.e<E, T3> $$6 = (cda.e<E, T3>)cda.b((App<cda.c<E>, M>)$$3);
         final cda.e<E, Function3<T1, T2, T3, R>> $$7 = cda.b($$0);
         return cda.a(new cda.e<E, R>() {
            @Override
            public R a(aru $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> cda<E, R> a(
         App<cda.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<cda.c<E>, T1> $$1, App<cda.c<E>, T2> $$2, App<cda.c<E>, T3> $$3, App<cda.c<E>, T4> $$4
      ) {
         final cda.e<E, T1> $$5 = (cda.e<E, T1>)cda.b((App<cda.c<E>, M>)$$1);
         final cda.e<E, T2> $$6 = (cda.e<E, T2>)cda.b((App<cda.c<E>, M>)$$2);
         final cda.e<E, T3> $$7 = (cda.e<E, T3>)cda.b((App<cda.c<E>, M>)$$3);
         final cda.e<E, T4> $$8 = (cda.e<E, T4>)cda.b((App<cda.c<E>, M>)$$4);
         final cda.e<E, Function4<T1, T2, T3, T4, R>> $$9 = cda.b($$0);
         return cda.a(new cda.e<E, R>() {
            @Override
            public R a(aru $$0, E $$1, long $$2) {
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

      static final class a<E extends bxw> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bxw> implements K1 {
   }

   static final class d<E extends bxw, F extends K1, Value> extends cda<E, cdb<F, Value>> {
      d(final cdc<F, Value> $$0) {
         super(new cda.e<E, cdb<F, Value>>() {
            public cdb<F, Value> b(aru $$0x, E $$1, long $$2) {
               byw<?> $$3 = $$1.ec();
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

   interface e<E extends bxw, R> {
      @Nullable
      R a(aru var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bxw> extends cda<E, Unit> {
      f(final cdd<? super E> $$0) {
         super(new cda.e<E, Unit>() {
            @Nullable
            public Unit b(aru $$0x, E $$1, long $$2) {
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
