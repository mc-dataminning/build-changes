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

public class bol<E extends bji, M> implements App<bol.c<E>, M> {
   private final bol.e<E, M> a;

   public static <E extends bji, M> bol<E, M> a(App<bol.c<E>, M> $$0) {
      return (bol<E, M>)$$0;
   }

   public static <E extends bji> bol.b<E> a() {
      return new bol.b<>();
   }

   public static <E extends bji> bmj<E> a(Function<bol.b<E>, ? extends App<bol.c<E>, boo<E>>> $$0) {
      final bol.e<E, boo<E>> $$1 = b((App<bol.c<E>, boo<E>>)$$0.apply(a()));
      return new bmj<E>() {
         @Override
         public boolean trigger(aks $$0, E $$1x, long $$2) {
            boo<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bji> bmj<E> a(boo<? super E> $$0, boo<? super E> $$1) {
      return a((Function<bol.b<E>, ? extends App<bol.c<E>, boo<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bji> bmj<E> a(Predicate<E> $$0, bmj<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bji> bmj<E> a(Predicate<E> $$0) {
      return a((Function<bol.b<E>, ? extends App<bol.c<E>, boo<E>>>)($$1 -> $$1.a((boo<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bji> bmj<E> a(BiPredicate<aks, E> $$0) {
      return a((Function<bol.b<E>, ? extends App<bol.c<E>, boo<E>>>)($$1 -> $$1.a((boo<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bji, M> bol.e<E, M> b(App<bol.c<E>, M> $$0) {
      return a($$0).a;
   }

   bol(bol.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bji, M> bol<E, M> a(bol.e<E, M> $$0) {
      return new bol<>($$0);
   }

   static final class a<E extends bji, A> extends bol<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new bol.e<E, A>() {
            @Override
            public A a(aks $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bji> implements Applicative<bol.c<E>, bol.b.a<E>> {
      public <Value> Optional<Value> a(bom<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(bom<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> bol<E, bom<Mu, Value>> a(bsj<Value> $$0) {
         return new bol.d<>(new bon.c<>($$0));
      }

      public <Value> bol<E, bom<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(bsj<Value> $$0) {
         return new bol.d<>(new bon.b<>($$0));
      }

      public <Value> bol<E, bom<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(bsj<Value> $$0) {
         return new bol.d<>(new bon.a<>($$0));
      }

      public bol<E, Unit> a(boo<? super E> $$0) {
         return new bol.f<>($$0);
      }

      public <A> bol<E, A> a(A $$0) {
         return new bol.a<>($$0);
      }

      public <A> bol<E, A> a(Supplier<String> $$0, A $$1) {
         return new bol.a<>($$1, $$0);
      }

      public <A, R> Function<App<bol.c<E>, A>, App<bol.c<E>, R>> lift1(App<bol.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final bol.e<E, A> $$2 = (bol.e<E, A>)bol.b((App<bol.c<E>, M>)$$1);
            final bol.e<E, Function<A, R>> $$3 = bol.b($$0);
            return bol.a(new bol.e<E, R>() {
               @Override
               public R a(aks $$0, E $$1, long $$2x) {
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

      public <T, R> bol<E, R> a(final Function<? super T, ? extends R> $$0, App<bol.c<E>, T> $$1) {
         final bol.e<E, T> $$2 = (bol.e<E, T>)bol.b((App<bol.c<E>, M>)$$1);
         return bol.a(new bol.e<E, R>() {
            @Override
            public R a(aks $$0x, E $$1, long $$2x) {
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

      public <A, B, R> bol<E, R> a(App<bol.c<E>, BiFunction<A, B, R>> $$0, App<bol.c<E>, A> $$1, App<bol.c<E>, B> $$2) {
         final bol.e<E, A> $$3 = (bol.e<E, A>)bol.b((App<bol.c<E>, M>)$$1);
         final bol.e<E, B> $$4 = (bol.e<E, B>)bol.b((App<bol.c<E>, M>)$$2);
         final bol.e<E, BiFunction<A, B, R>> $$5 = bol.b($$0);
         return bol.a(new bol.e<E, R>() {
            @Override
            public R a(aks $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> bol<E, R> a(App<bol.c<E>, Function3<T1, T2, T3, R>> $$0, App<bol.c<E>, T1> $$1, App<bol.c<E>, T2> $$2, App<bol.c<E>, T3> $$3) {
         final bol.e<E, T1> $$4 = (bol.e<E, T1>)bol.b((App<bol.c<E>, M>)$$1);
         final bol.e<E, T2> $$5 = (bol.e<E, T2>)bol.b((App<bol.c<E>, M>)$$2);
         final bol.e<E, T3> $$6 = (bol.e<E, T3>)bol.b((App<bol.c<E>, M>)$$3);
         final bol.e<E, Function3<T1, T2, T3, R>> $$7 = bol.b($$0);
         return bol.a(new bol.e<E, R>() {
            @Override
            public R a(aks $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> bol<E, R> a(
         App<bol.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<bol.c<E>, T1> $$1, App<bol.c<E>, T2> $$2, App<bol.c<E>, T3> $$3, App<bol.c<E>, T4> $$4
      ) {
         final bol.e<E, T1> $$5 = (bol.e<E, T1>)bol.b((App<bol.c<E>, M>)$$1);
         final bol.e<E, T2> $$6 = (bol.e<E, T2>)bol.b((App<bol.c<E>, M>)$$2);
         final bol.e<E, T3> $$7 = (bol.e<E, T3>)bol.b((App<bol.c<E>, M>)$$3);
         final bol.e<E, T4> $$8 = (bol.e<E, T4>)bol.b((App<bol.c<E>, M>)$$4);
         final bol.e<E, Function4<T1, T2, T3, T4, R>> $$9 = bol.b($$0);
         return bol.a(new bol.e<E, R>() {
            @Override
            public R a(aks $$0, E $$1, long $$2) {
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

      static final class a<E extends bji> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bji> implements K1 {
   }

   static final class d<E extends bji, F extends K1, Value> extends bol<E, bom<F, Value>> {
      d(final bon<F, Value> $$0) {
         super(new bol.e<E, bom<F, Value>>() {
            public bom<F, Value> b(aks $$0x, E $$1, long $$2) {
               bki<?> $$3 = $$1.dN();
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

   interface e<E extends bji, R> {
      @Nullable
      R a(aks var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bji> extends bol<E, Unit> {
      f(final boo<? super E> $$0) {
         super(new bol.e<E, Unit>() {
            @Nullable
            public Unit b(aks $$0x, E $$1, long $$2) {
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
