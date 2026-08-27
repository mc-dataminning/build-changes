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

public class btj<E extends bog, M> implements App<btj.c<E>, M> {
   private final btj.e<E, M> a;

   public static <E extends bog, M> btj<E, M> a(App<btj.c<E>, M> $$0) {
      return (btj<E, M>)$$0;
   }

   public static <E extends bog> btj.b<E> a() {
      return new btj.b<>();
   }

   public static <E extends bog> brh<E> a(Function<btj.b<E>, ? extends App<btj.c<E>, btm<E>>> $$0) {
      final btj.e<E, btm<E>> $$1 = b((App<btj.c<E>, btm<E>>)$$0.apply(a()));
      return new brh<E>() {
         @Override
         public boolean trigger(aov $$0, E $$1x, long $$2) {
            btm<E> $$3 = $$1.a($$0, $$1, $$2);
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

   public static <E extends bog> brh<E> a(btm<? super E> $$0, btm<? super E> $$1) {
      return a((Function<btj.b<E>, ? extends App<btj.c<E>, btm<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends bog> brh<E> a(Predicate<E> $$0, brh<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends bog> brh<E> a(Predicate<E> $$0) {
      return a((Function<btj.b<E>, ? extends App<btj.c<E>, btm<E>>>)($$1 -> $$1.a((btm<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends bog> brh<E> a(BiPredicate<aov, E> $$0) {
      return a((Function<btj.b<E>, ? extends App<btj.c<E>, btm<E>>>)($$1 -> $$1.a((btm<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends bog, M> btj.e<E, M> b(App<btj.c<E>, M> $$0) {
      return a($$0).a;
   }

   btj(btj.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends bog, M> btj<E, M> a(btj.e<E, M> $$0) {
      return new btj<>($$0);
   }

   static final class a<E extends bog, A> extends btj<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new btj.e<E, A>() {
            @Override
            public A a(aov $$0x, E $$1x, long $$2) {
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

   public static final class b<E extends bog> implements Applicative<btj.c<E>, btj.b.a<E>> {
      public <Value> Optional<Value> a(btk<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(btk<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> btj<E, btk<Mu, Value>> a(bxh<Value> $$0) {
         return new btj.d<>(new btl.c<>($$0));
      }

      public <Value> btj<E, btk<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(bxh<Value> $$0) {
         return new btj.d<>(new btl.b<>($$0));
      }

      public <Value> btj<E, btk<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(bxh<Value> $$0) {
         return new btj.d<>(new btl.a<>($$0));
      }

      public btj<E, Unit> a(btm<? super E> $$0) {
         return new btj.f<>($$0);
      }

      public <A> btj<E, A> a(A $$0) {
         return new btj.a<>($$0);
      }

      public <A> btj<E, A> a(Supplier<String> $$0, A $$1) {
         return new btj.a<>($$1, $$0);
      }

      public <A, R> Function<App<btj.c<E>, A>, App<btj.c<E>, R>> lift1(App<btj.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final btj.e<E, A> $$2 = (btj.e<E, A>)btj.b((App<btj.c<E>, M>)$$1);
            final btj.e<E, Function<A, R>> $$3 = btj.b($$0);
            return btj.a(new btj.e<E, R>() {
               @Override
               public R a(aov $$0, E $$1, long $$2x) {
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

      public <T, R> btj<E, R> a(final Function<? super T, ? extends R> $$0, App<btj.c<E>, T> $$1) {
         final btj.e<E, T> $$2 = (btj.e<E, T>)btj.b((App<btj.c<E>, M>)$$1);
         return btj.a(new btj.e<E, R>() {
            @Override
            public R a(aov $$0x, E $$1, long $$2x) {
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

      public <A, B, R> btj<E, R> a(App<btj.c<E>, BiFunction<A, B, R>> $$0, App<btj.c<E>, A> $$1, App<btj.c<E>, B> $$2) {
         final btj.e<E, A> $$3 = (btj.e<E, A>)btj.b((App<btj.c<E>, M>)$$1);
         final btj.e<E, B> $$4 = (btj.e<E, B>)btj.b((App<btj.c<E>, M>)$$2);
         final btj.e<E, BiFunction<A, B, R>> $$5 = btj.b($$0);
         return btj.a(new btj.e<E, R>() {
            @Override
            public R a(aov $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, R> btj<E, R> a(App<btj.c<E>, Function3<T1, T2, T3, R>> $$0, App<btj.c<E>, T1> $$1, App<btj.c<E>, T2> $$2, App<btj.c<E>, T3> $$3) {
         final btj.e<E, T1> $$4 = (btj.e<E, T1>)btj.b((App<btj.c<E>, M>)$$1);
         final btj.e<E, T2> $$5 = (btj.e<E, T2>)btj.b((App<btj.c<E>, M>)$$2);
         final btj.e<E, T3> $$6 = (btj.e<E, T3>)btj.b((App<btj.c<E>, M>)$$3);
         final btj.e<E, Function3<T1, T2, T3, R>> $$7 = btj.b($$0);
         return btj.a(new btj.e<E, R>() {
            @Override
            public R a(aov $$0, E $$1, long $$2) {
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

      public <T1, T2, T3, T4, R> btj<E, R> a(
         App<btj.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<btj.c<E>, T1> $$1, App<btj.c<E>, T2> $$2, App<btj.c<E>, T3> $$3, App<btj.c<E>, T4> $$4
      ) {
         final btj.e<E, T1> $$5 = (btj.e<E, T1>)btj.b((App<btj.c<E>, M>)$$1);
         final btj.e<E, T2> $$6 = (btj.e<E, T2>)btj.b((App<btj.c<E>, M>)$$2);
         final btj.e<E, T3> $$7 = (btj.e<E, T3>)btj.b((App<btj.c<E>, M>)$$3);
         final btj.e<E, T4> $$8 = (btj.e<E, T4>)btj.b((App<btj.c<E>, M>)$$4);
         final btj.e<E, Function4<T1, T2, T3, T4, R>> $$9 = btj.b($$0);
         return btj.a(new btj.e<E, R>() {
            @Override
            public R a(aov $$0, E $$1, long $$2) {
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

      static final class a<E extends bog> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends bog> implements K1 {
   }

   static final class d<E extends bog, F extends K1, Value> extends btj<E, btk<F, Value>> {
      d(final btl<F, Value> $$0) {
         super(new btj.e<E, btk<F, Value>>() {
            public btk<F, Value> b(aov $$0x, E $$1, long $$2) {
               bpf<?> $$3 = $$1.dO();
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

   interface e<E extends bog, R> {
      @Nullable
      R a(aov var1, E var2, long var3);

      String a();
   }

   static final class f<E extends bog> extends btj<E, Unit> {
      f(final btm<? super E> $$0) {
         super(new btj.e<E, Unit>() {
            @Nullable
            public Unit b(aov $$0x, E $$1, long $$2) {
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
