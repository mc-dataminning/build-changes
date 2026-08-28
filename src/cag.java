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

public class cag<E extends bva, M> implements App<cag.c<E>, M> {
   private final cag.e<E, M> a;

   public static <E extends bva, M> cag<E, M> a(App<cag.c<E>, M> $$0) {
      return (cag<E, M>)$$0;
   }

   public static <E extends bva> cag.b<E> a() {
      return new cag.b<>();
   }

   public static <E extends bva> bye<E> a(Function<cag.b<E>, ? extends App<cag.c<E>, caj<E>>> $$0) {
      final cag.e<E, caj<E>> $$1 = b((App<cag.c<E>, caj<E>>)$$0.apply(a()));
      return new bye<E>() {
         @Override
         public boolean trigger(arn $$0, E $$1x, long $$2) {
            caj<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bva> bye<E> a(caj<? super E> $$0, caj<? super E> $$1) {
      return a((Function<cag.b<E>, ? extends App<cag.c<E>, caj<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bva> bye<E> a(Predicate<E> $$0, bye<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bva> bye<E> a(Predicate<E> $$0) {
      return a((Function<cag.b<E>, ? extends App<cag.c<E>, caj<E>>>)($$1 -> $$1.a((caj<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bva> bye<E> a(BiPredicate<arn, E> $$0) {
      return a((Function<cag.b<E>, ? extends App<cag.c<E>, caj<E>>>)($$1 -> $$1.a((caj<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bva, M> cag.e<E, M> b(App<cag.c<E>, M> $$0) {
      return a($$0).a;
   }

   cag(cag.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bva, M> cag<E, M> a(cag.e<E, M> $$0) {
      return new cag<>($$0);
   }

   static final class a<E extends bva, A> extends cag<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new cag.e<E, A>() {
            @Override
            public A a(arn $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bva> implements Applicative<cag.c<E>, cag.b.a<E>> {
      public <Value> Optional<Value> a(cah<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(cah<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> cag<E, cah<Mu, Value>> a(cee<Value> $$0) {
         return new cag.d<>(new cai.c<>($$0));
      }

      public <Value> cag<E, cah<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(cee<Value> $$0) {
         return new cag.d<>(new cai.b<>($$0));
      }

      public <Value> cag<E, cah<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(cee<Value> $$0) {
         return new cag.d<>(new cai.a<>($$0));
      }

      public cag<E, Unit> a(caj<? super E> $$0) {
         return new cag.f<>($$0);
      }

      public <A> cag<E, A> a(A $$0) {
         return new cag.a<>($$0);
      }

      public <A> cag<E, A> a(Supplier<String> $$0, A $$1) {
         return new cag.a<>($$1, $$0);
      }

      public <A, R> Function<App<cag.c<E>, A>, App<cag.c<E>, R>> lift1(App<cag.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final cag.e<E, A> $$2 = (cag.e<E, A>)cag.b((App<cag.c<E>, M>)$$1);
            final cag.e<E, Function<A, R>> $$3 = cag.b($$0);
            return cag.a(new cag.e<E, R>() {
               @Override
               public R a(arn $$0, E $$1, long $$2x) {
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

      public <T, R> cag<E, R> a(final Function<? super T, ? extends R> $$0, App<cag.c<E>, T> $$1) {
         final cag.e<E, T> $$2 = (cag.e<E, T>)cag.b((App<cag.c<E>, M>)$$1);
         return cag.a(new cag.e<E, R>() {
            @Override
            public R a(arn $$0x, E $$1, long $$2x) {
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

      public <A, B, R> cag<E, R> a(App<cag.c<E>, BiFunction<A, B, R>> $$0, App<cag.c<E>, A> $$1, App<cag.c<E>, B> $$2) {
         final cag.e<E, A> $$3 = (cag.e<E, A>)cag.b((App<cag.c<E>, M>)$$1);
         final cag.e<E, B> $$4 = (cag.e<E, B>)cag.b((App<cag.c<E>, M>)$$2);
         final cag.e<E, BiFunction<A, B, R>> $$5 = cag.b($$0);
         return cag.a(new cag.e<E, R>() {
            @Override
            public R a(arn $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> cag<E, R> a(App<cag.c<E>, Function3<T1, T2, T3, R>> $$0, App<cag.c<E>, T1> $$1, App<cag.c<E>, T2> $$2, App<cag.c<E>, T3> $$3) {
         final cag.e<E, T1> $$4 = (cag.e<E, T1>)cag.b((App<cag.c<E>, M>)$$1);
         final cag.e<E, T2> $$5 = (cag.e<E, T2>)cag.b((App<cag.c<E>, M>)$$2);
         final cag.e<E, T3> $$6 = (cag.e<E, T3>)cag.b((App<cag.c<E>, M>)$$3);
         final cag.e<E, Function3<T1, T2, T3, R>> $$7 = cag.b($$0);
         return cag.a(new cag.e<E, R>() {
            @Override
            public R a(arn $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> cag<E, R> a(
         App<cag.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<cag.c<E>, T1> $$1, App<cag.c<E>, T2> $$2, App<cag.c<E>, T3> $$3, App<cag.c<E>, T4> $$4
      ) {
         final cag.e<E, T1> $$5 = (cag.e<E, T1>)cag.b((App<cag.c<E>, M>)$$1);
         final cag.e<E, T2> $$6 = (cag.e<E, T2>)cag.b((App<cag.c<E>, M>)$$2);
         final cag.e<E, T3> $$7 = (cag.e<E, T3>)cag.b((App<cag.c<E>, M>)$$3);
         final cag.e<E, T4> $$8 = (cag.e<E, T4>)cag.b((App<cag.c<E>, M>)$$4);
         final cag.e<E, Function4<T1, T2, T3, T4, R>> $$9 = cag.b($$0);
         return cag.a(new cag.e<E, R>() {
            @Override
            public R a(arn $$0, E $$1, long $$2) {
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

      static final class a<E extends bva> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bva> implements K1 {
   }

   static final class d<E extends bva, F extends K1, Value> extends cag<E, cah<F, Value>> {
      d(final cai<F, Value> $$0) {
         super(new cag.e<E, cah<F, Value>>() {
            public cah<F, Value> b(arn $$0x, E $$1, long $$2) {
               bwc<?> $$3 = $$1.ed();
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

   interface e<E extends bva, R> {
      @Nullable
      R a(arn var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bva> extends cag<E, Unit> {
      f(final caj<? super E> $$0) {
         super(new cag.e<E, Unit>() {
            @Nullable
            public Unit b(arn $$0x, E $$1, long $$2) {
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
