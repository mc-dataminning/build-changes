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

public class brj<E extends bmf, M> implements App<brj.c<E>, M> {
   private final brj.e<E, M> a;

   public static <E extends bmf, M> brj<E, M> a(App<brj.c<E>, M> $$0) {
      return (brj<E, M>)$$0;
   }

   public static <E extends bmf> brj.b<E> a() {
      return new brj.b<>();
   }

   public static <E extends bmf> bph<E> a(Function<brj.b<E>, ? extends App<brj.c<E>, brm<E>>> $$0) {
      final brj.e<E, brm<E>> $$1 = b((App<brj.c<E>, brm<E>>)$$0.apply(a()));
      return new bph<E>() {
         @Override
         public boolean trigger(amz $$0, E $$1x, long $$2) {
            brm<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bmf> bph<E> a(brm<? super E> $$0, brm<? super E> $$1) {
      return a((Function<brj.b<E>, ? extends App<brj.c<E>, brm<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bmf> bph<E> a(Predicate<E> $$0, bph<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bmf> bph<E> a(Predicate<E> $$0) {
      return a((Function<brj.b<E>, ? extends App<brj.c<E>, brm<E>>>)($$1 -> $$1.a((brm<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bmf> bph<E> a(BiPredicate<amz, E> $$0) {
      return a((Function<brj.b<E>, ? extends App<brj.c<E>, brm<E>>>)($$1 -> $$1.a((brm<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bmf, M> brj.e<E, M> b(App<brj.c<E>, M> $$0) {
      return a($$0).a;
   }

   brj(brj.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bmf, M> brj<E, M> a(brj.e<E, M> $$0) {
      return new brj<>($$0);
   }

   static final class a<E extends bmf, A> extends brj<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new brj.e<E, A>() {
            @Override
            public A a(amz $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bmf> implements Applicative<brj.c<E>, brj.b.a<E>> {
      public <Value> Optional<Value> a(brk<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(brk<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> brj<E, brk<Mu, Value>> a(bvh<Value> $$0) {
         return new brj.d<>(new brl.c<>($$0));
      }

      public <Value> brj<E, brk<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(bvh<Value> $$0) {
         return new brj.d<>(new brl.b<>($$0));
      }

      public <Value> brj<E, brk<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(bvh<Value> $$0) {
         return new brj.d<>(new brl.a<>($$0));
      }

      public brj<E, Unit> a(brm<? super E> $$0) {
         return new brj.f<>($$0);
      }

      public <A> brj<E, A> a(A $$0) {
         return new brj.a<>($$0);
      }

      public <A> brj<E, A> a(Supplier<String> $$0, A $$1) {
         return new brj.a<>($$1, $$0);
      }

      public <A, R> Function<App<brj.c<E>, A>, App<brj.c<E>, R>> lift1(App<brj.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final brj.e<E, A> $$2 = (brj.e<E, A>)brj.b((App<brj.c<E>, M>)$$1);
            final brj.e<E, Function<A, R>> $$3 = brj.b($$0);
            return brj.a(new brj.e<E, R>() {
               @Override
               public R a(amz $$0, E $$1, long $$2x) {
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

      public <T, R> brj<E, R> a(final Function<? super T, ? extends R> $$0, App<brj.c<E>, T> $$1) {
         final brj.e<E, T> $$2 = (brj.e<E, T>)brj.b((App<brj.c<E>, M>)$$1);
         return brj.a(new brj.e<E, R>() {
            @Override
            public R a(amz $$0x, E $$1, long $$2x) {
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

      public <A, B, R> brj<E, R> a(App<brj.c<E>, BiFunction<A, B, R>> $$0, App<brj.c<E>, A> $$1, App<brj.c<E>, B> $$2) {
         final brj.e<E, A> $$3 = (brj.e<E, A>)brj.b((App<brj.c<E>, M>)$$1);
         final brj.e<E, B> $$4 = (brj.e<E, B>)brj.b((App<brj.c<E>, M>)$$2);
         final brj.e<E, BiFunction<A, B, R>> $$5 = brj.b($$0);
         return brj.a(new brj.e<E, R>() {
            @Override
            public R a(amz $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> brj<E, R> a(App<brj.c<E>, Function3<T1, T2, T3, R>> $$0, App<brj.c<E>, T1> $$1, App<brj.c<E>, T2> $$2, App<brj.c<E>, T3> $$3) {
         final brj.e<E, T1> $$4 = (brj.e<E, T1>)brj.b((App<brj.c<E>, M>)$$1);
         final brj.e<E, T2> $$5 = (brj.e<E, T2>)brj.b((App<brj.c<E>, M>)$$2);
         final brj.e<E, T3> $$6 = (brj.e<E, T3>)brj.b((App<brj.c<E>, M>)$$3);
         final brj.e<E, Function3<T1, T2, T3, R>> $$7 = brj.b($$0);
         return brj.a(new brj.e<E, R>() {
            @Override
            public R a(amz $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> brj<E, R> a(
         App<brj.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<brj.c<E>, T1> $$1, App<brj.c<E>, T2> $$2, App<brj.c<E>, T3> $$3, App<brj.c<E>, T4> $$4
      ) {
         final brj.e<E, T1> $$5 = (brj.e<E, T1>)brj.b((App<brj.c<E>, M>)$$1);
         final brj.e<E, T2> $$6 = (brj.e<E, T2>)brj.b((App<brj.c<E>, M>)$$2);
         final brj.e<E, T3> $$7 = (brj.e<E, T3>)brj.b((App<brj.c<E>, M>)$$3);
         final brj.e<E, T4> $$8 = (brj.e<E, T4>)brj.b((App<brj.c<E>, M>)$$4);
         final brj.e<E, Function4<T1, T2, T3, T4, R>> $$9 = brj.b($$0);
         return brj.a(new brj.e<E, R>() {
            @Override
            public R a(amz $$0, E $$1, long $$2) {
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

      static final class a<E extends bmf> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bmf> implements K1 {
   }

   static final class d<E extends bmf, F extends K1, Value> extends brj<E, brk<F, Value>> {
      d(final brl<F, Value> $$0) {
         super(new brj.e<E, brk<F, Value>>() {
            public brk<F, Value> b(amz $$0x, E $$1, long $$2) {
               bnf<?> $$3 = $$1.dO();
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

   interface e<E extends bmf, R> {
      @Nullable
      R a(amz var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bmf> extends brj<E, Unit> {
      f(final brm<? super E> $$0) {
         super(new brj.e<E, Unit>() {
            @Nullable
            public Unit b(amz $$0x, E $$1, long $$2) {
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
