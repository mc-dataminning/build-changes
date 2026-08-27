import java.util.function.BiPredicate;
import java.util.function.Function;

public class dfl {
   public static <S extends dnm> dfl.c<S> a(
      dno<S> $$0, Function<dqh, dfl.a> $$1, Function<dqh, is> $$2, drb $$3, dqh $$4, dae $$5, in $$6, BiPredicate<dae, in> $$7
   ) {
      S $$8 = $$0.a($$5, $$6);
      if ($$8 == null) {
         return dfl.b::b;
      } else if ($$7.test($$5, $$6)) {
         return dfl.b::b;
      } else {
         dfl.a $$9 = $$1.apply($$4);
         boolean $$10 = $$9 == dfl.a.a;
         boolean $$11 = $$9 == dfl.a.b;
         if ($$10) {
            return new dfl.c.b<>($$8);
         } else {
            in $$12 = $$6.a($$2.apply($$4));
            dqh $$13 = $$5.a_($$12);
            if ($$13.a($$4.b())) {
               dfl.a $$14 = $$1.apply($$13);
               if ($$14 != dfl.a.a && $$9 != $$14 && $$13.c($$3) == $$4.c($$3)) {
                  if ($$7.test($$5, $$12)) {
                     return dfl.b::b;
                  }

                  S $$15 = $$0.a($$5, $$12);
                  if ($$15 != null) {
                     S $$16 = $$11 ? $$8 : $$15;
                     S $$17 = $$11 ? $$15 : $$8;
                     return new dfl.c.a<>($$16, $$17);
                  }
               }
            }

            return new dfl.c.b<>($$8);
         }
      }
   }

   public static enum a {
      a,
      b,
      c;
   }

   public interface b<S, T> {
      T a(S var1, S var2);

      T a(S var1);

      T b();
   }

   public interface c<S> {
      <T> T apply(dfl.b<? super S, T> var1);

      public static final class a<S> implements dfl.c<S> {
         private final S a;
         private final S b;

         public a(S $$0, S $$1) {
            this.a = $$0;
            this.b = $$1;
         }

         @Override
         public <T> T apply(dfl.b<? super S, T> $$0) {
            return $$0.a(this.a, this.b);
         }
      }

      public static final class b<S> implements dfl.c<S> {
         private final S a;

         public b(S $$0) {
            this.a = $$0;
         }

         @Override
         public <T> T apply(dfl.b<? super S, T> $$0) {
            return $$0.a(this.a);
         }
      }
   }
}
