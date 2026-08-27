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

public class buc<E extends box, M> implements App<buc.c<E>, M> {
   private final buc.e<E, M> a;

   public static <E extends box, M> buc<E, M> a(App<buc.c<E>, M> $$0) {
      return (buc<E, M>)$$0;
   }

   public static <E extends box> buc.b<E> a() {
      return new buc.b<>();
   }

   public static <E extends box> bsa<E> a(Function<buc.b<E>, ? extends App<buc.c<E>, buf<E>>> $$0) {
      final buc.e<E, buf<E>> $$1 = b((App<buc.c<E>, buf<E>>)$$0.apply(a()));
      return new bsa<E>() {
         @Override
         public boolean trigger(apa $$0, E $$1x, long $$2) {
            buf<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends box> bsa<E> a(buf<? super E> $$0, buf<? super E> $$1) {
      return a((Function<buc.b<E>, ? extends App<buc.c<E>, buf<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends box> bsa<E> a(Predicate<E> $$0, bsa<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends box> bsa<E> a(Predicate<E> $$0) {
      return a((Function<buc.b<E>, ? extends App<buc.c<E>, buf<E>>>)($$1 -> $$1.a((buf<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends box> bsa<E> a(BiPredicate<apa, E> $$0) {
      return a((Function<buc.b<E>, ? extends App<buc.c<E>, buf<E>>>)($$1 -> $$1.a((buf<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends box, M> buc.e<E, M> b(App<buc.c<E>, M> $$0) {
      return a($$0).a;
   }

   buc(buc.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends box, M> buc<E, M> a(buc.e<E, M> $$0) {
      return new buc<>($$0);
   }

   static final class a<E extends box, A> extends buc<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new buc.e<E, A>() {
            @Override
            public A a(apa $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends box> implements Applicative<buc.c<E>, buc.b.a<E>> {
      public <Value> Optional<Value> a(bud<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(bud<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> buc<E, bud<Mu, Value>> a(bya<Value> $$0) {
         return new buc.d<>(new bue.c<>($$0));
      }

      public <Value> buc<E, bud<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(bya<Value> $$0) {
         return new buc.d<>(new bue.b<>($$0));
      }

      public <Value> buc<E, bud<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(bya<Value> $$0) {
         return new buc.d<>(new bue.a<>($$0));
      }

      public buc<E, Unit> a(buf<? super E> $$0) {
         return new buc.f<>($$0);
      }

      public <A> buc<E, A> a(A $$0) {
         return new buc.a<>($$0);
      }

      public <A> buc<E, A> a(Supplier<String> $$0, A $$1) {
         return new buc.a<>($$1, $$0);
      }

      public <A, R> Function<App<buc.c<E>, A>, App<buc.c<E>, R>> lift1(App<buc.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final buc.e<E, A> $$2 = (buc.e<E, A>)buc.b((App<buc.c<E>, M>)$$1);
            final buc.e<E, Function<A, R>> $$3 = buc.b($$0);
            return buc.a(new buc.e<E, R>() {
               @Override
               public R a(apa $$0, E $$1, long $$2x) {
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

      public <T, R> buc<E, R> a(final Function<? super T, ? extends R> $$0, App<buc.c<E>, T> $$1) {
         final buc.e<E, T> $$2 = (buc.e<E, T>)buc.b((App<buc.c<E>, M>)$$1);
         return buc.a(new buc.e<E, R>() {
            @Override
            public R a(apa $$0x, E $$1, long $$2x) {
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

      public <A, B, R> buc<E, R> a(App<buc.c<E>, BiFunction<A, B, R>> $$0, App<buc.c<E>, A> $$1, App<buc.c<E>, B> $$2) {
         final buc.e<E, A> $$3 = (buc.e<E, A>)buc.b((App<buc.c<E>, M>)$$1);
         final buc.e<E, B> $$4 = (buc.e<E, B>)buc.b((App<buc.c<E>, M>)$$2);
         final buc.e<E, BiFunction<A, B, R>> $$5 = buc.b($$0);
         return buc.a(new buc.e<E, R>() {
            @Override
            public R a(apa $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> buc<E, R> a(App<buc.c<E>, Function3<T1, T2, T3, R>> $$0, App<buc.c<E>, T1> $$1, App<buc.c<E>, T2> $$2, App<buc.c<E>, T3> $$3) {
         final buc.e<E, T1> $$4 = (buc.e<E, T1>)buc.b((App<buc.c<E>, M>)$$1);
         final buc.e<E, T2> $$5 = (buc.e<E, T2>)buc.b((App<buc.c<E>, M>)$$2);
         final buc.e<E, T3> $$6 = (buc.e<E, T3>)buc.b((App<buc.c<E>, M>)$$3);
         final buc.e<E, Function3<T1, T2, T3, R>> $$7 = buc.b($$0);
         return buc.a(new buc.e<E, R>() {
            @Override
            public R a(apa $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> buc<E, R> a(
         App<buc.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<buc.c<E>, T1> $$1, App<buc.c<E>, T2> $$2, App<buc.c<E>, T3> $$3, App<buc.c<E>, T4> $$4
      ) {
         final buc.e<E, T1> $$5 = (buc.e<E, T1>)buc.b((App<buc.c<E>, M>)$$1);
         final buc.e<E, T2> $$6 = (buc.e<E, T2>)buc.b((App<buc.c<E>, M>)$$2);
         final buc.e<E, T3> $$7 = (buc.e<E, T3>)buc.b((App<buc.c<E>, M>)$$3);
         final buc.e<E, T4> $$8 = (buc.e<E, T4>)buc.b((App<buc.c<E>, M>)$$4);
         final buc.e<E, Function4<T1, T2, T3, T4, R>> $$9 = buc.b($$0);
         return buc.a(new buc.e<E, R>() {
            @Override
            public R a(apa $$0, E $$1, long $$2) {
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

      static final class a<E extends box> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends box> implements K1 {
   }

   static final class d<E extends box, F extends K1, Value> extends buc<E, bud<F, Value>> {
      d(final bue<F, Value> $$0) {
         super(new buc.e<E, bud<F, Value>>() {
            public bud<F, Value> b(apa $$0x, E $$1, long $$2) {
               bpy<?> $$3 = $$1.dM();
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

   interface e<E extends box, R> {
      @Nullable
      R a(apa var1, E var2, long var3);

      String a();
   }

   static final class f<E extends box> extends buc<E, Unit> {
      f(final buf<? super E> $$0) {
         super(new buc.e<E, Unit>() {
            @Nullable
            public Unit b(apa $$0x, E $$1, long $$2) {
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
