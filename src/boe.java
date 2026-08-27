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

public class boe<E extends bjb, M> implements App<boe.c<E>, M> {
   private final boe.e<E, M> a;

   public static <E extends bjb, M> boe<E, M> a(App<boe.c<E>, M> $$0) {
      return (boe<E, M>)$$0;
   }

   public static <E extends bjb> boe.b<E> a() {
      return new boe.b<>();
   }

   public static <E extends bjb> bmc<E> a(Function<boe.b<E>, ? extends App<boe.c<E>, boh<E>>> $$0) {
      final boe.e<E, boh<E>> $$1 = b((App<boe.c<E>, boh<E>>)$$0.apply(a()));
      return new bmc<E>() {
         @Override
         public boolean trigger(akn $$0, E $$1x, long $$2) {
            boh<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bjb> bmc<E> a(boh<? super E> $$0, boh<? super E> $$1) {
      return a((Function<boe.b<E>, ? extends App<boe.c<E>, boh<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bjb> bmc<E> a(Predicate<E> $$0, bmc<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bjb> bmc<E> a(Predicate<E> $$0) {
      return a((Function<boe.b<E>, ? extends App<boe.c<E>, boh<E>>>)($$1 -> $$1.a((boh<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bjb> bmc<E> a(BiPredicate<akn, E> $$0) {
      return a((Function<boe.b<E>, ? extends App<boe.c<E>, boh<E>>>)($$1 -> $$1.a((boh<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bjb, M> boe.e<E, M> b(App<boe.c<E>, M> $$0) {
      return a($$0).a;
   }

   boe(boe.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bjb, M> boe<E, M> a(boe.e<E, M> $$0) {
      return new boe<>($$0);
   }

   static final class a<E extends bjb, A> extends boe<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new boe.e<E, A>() {
            @Override
            public A a(akn $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bjb> implements Applicative<boe.c<E>, boe.b.a<E>> {
      public <Value> Optional<Value> a(bof<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(bof<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> boe<E, bof<Mu, Value>> a(bsc<Value> $$0) {
         return new boe.d<>(new bog.c<>($$0));
      }

      public <Value> boe<E, bof<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(bsc<Value> $$0) {
         return new boe.d<>(new bog.b<>($$0));
      }

      public <Value> boe<E, bof<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(bsc<Value> $$0) {
         return new boe.d<>(new bog.a<>($$0));
      }

      public boe<E, Unit> a(boh<? super E> $$0) {
         return new boe.f<>($$0);
      }

      public <A> boe<E, A> a(A $$0) {
         return new boe.a<>($$0);
      }

      public <A> boe<E, A> a(Supplier<String> $$0, A $$1) {
         return new boe.a<>($$1, $$0);
      }

      public <A, R> Function<App<boe.c<E>, A>, App<boe.c<E>, R>> lift1(App<boe.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final boe.e<E, A> $$2 = (boe.e<E, A>)boe.b((App<boe.c<E>, M>)$$1);
            final boe.e<E, Function<A, R>> $$3 = boe.b($$0);
            return boe.a(new boe.e<E, R>() {
               @Override
               public R a(akn $$0, E $$1, long $$2x) {
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

      public <T, R> boe<E, R> a(final Function<? super T, ? extends R> $$0, App<boe.c<E>, T> $$1) {
         final boe.e<E, T> $$2 = (boe.e<E, T>)boe.b((App<boe.c<E>, M>)$$1);
         return boe.a(new boe.e<E, R>() {
            @Override
            public R a(akn $$0x, E $$1, long $$2x) {
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

      public <A, B, R> boe<E, R> a(App<boe.c<E>, BiFunction<A, B, R>> $$0, App<boe.c<E>, A> $$1, App<boe.c<E>, B> $$2) {
         final boe.e<E, A> $$3 = (boe.e<E, A>)boe.b((App<boe.c<E>, M>)$$1);
         final boe.e<E, B> $$4 = (boe.e<E, B>)boe.b((App<boe.c<E>, M>)$$2);
         final boe.e<E, BiFunction<A, B, R>> $$5 = boe.b($$0);
         return boe.a(new boe.e<E, R>() {
            @Override
            public R a(akn $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> boe<E, R> a(App<boe.c<E>, Function3<T1, T2, T3, R>> $$0, App<boe.c<E>, T1> $$1, App<boe.c<E>, T2> $$2, App<boe.c<E>, T3> $$3) {
         final boe.e<E, T1> $$4 = (boe.e<E, T1>)boe.b((App<boe.c<E>, M>)$$1);
         final boe.e<E, T2> $$5 = (boe.e<E, T2>)boe.b((App<boe.c<E>, M>)$$2);
         final boe.e<E, T3> $$6 = (boe.e<E, T3>)boe.b((App<boe.c<E>, M>)$$3);
         final boe.e<E, Function3<T1, T2, T3, R>> $$7 = boe.b($$0);
         return boe.a(new boe.e<E, R>() {
            @Override
            public R a(akn $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> boe<E, R> a(
         App<boe.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<boe.c<E>, T1> $$1, App<boe.c<E>, T2> $$2, App<boe.c<E>, T3> $$3, App<boe.c<E>, T4> $$4
      ) {
         final boe.e<E, T1> $$5 = (boe.e<E, T1>)boe.b((App<boe.c<E>, M>)$$1);
         final boe.e<E, T2> $$6 = (boe.e<E, T2>)boe.b((App<boe.c<E>, M>)$$2);
         final boe.e<E, T3> $$7 = (boe.e<E, T3>)boe.b((App<boe.c<E>, M>)$$3);
         final boe.e<E, T4> $$8 = (boe.e<E, T4>)boe.b((App<boe.c<E>, M>)$$4);
         final boe.e<E, Function4<T1, T2, T3, T4, R>> $$9 = boe.b($$0);
         return boe.a(new boe.e<E, R>() {
            @Override
            public R a(akn $$0, E $$1, long $$2) {
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

      static final class a<E extends bjb> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bjb> implements K1 {
   }

   static final class d<E extends bjb, F extends K1, Value> extends boe<E, bof<F, Value>> {
      d(final bog<F, Value> $$0) {
         super(new boe.e<E, bof<F, Value>>() {
            public bof<F, Value> b(akn $$0x, E $$1, long $$2) {
               bkb<?> $$3 = $$1.dM();
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

   interface e<E extends bjb, R> {
      @Nullable
      R a(akn var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bjb> extends boe<E, Unit> {
      f(final boh<? super E> $$0) {
         super(new boe.e<E, Unit>() {
            @Nullable
            public Unit b(akn $$0x, E $$1, long $$2) {
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
