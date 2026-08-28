import java.util.function.BiPredicate;
import java.util.function.Function;

public class dmn {
   public static <S extends dup> dmn.c<S> a(
      dur<S> $$0, Function<dxn, dmn.a> $$1, Function<dxn, jm> $$2, dyp<jm> $$3, dxn $$4, dhb $$5, jh $$6, BiPredicate<dhb, jh> $$7
   ) {
      S $$8 = $$0.a($$5, $$6);
      if ($$8 == null) {
         return dmn.b::b;
      } else if ($$7.test($$5, $$6)) {
         return dmn.b::b;
      } else {
         dmn.a $$9 = $$1.apply($$4);
         boolean $$10 = $$9 == dmn.a.a;
         boolean $$11 = $$9 == dmn.a.b;
         if ($$10) {
            return new dmn.c.b<>($$8);
         } else {
            jh $$12 = $$6.a($$2.apply($$4));
            dxn $$13 = $$5.a_($$12);
            if ($$13.a($$4.b())) {
               dmn.a $$14 = $$1.apply($$13);
               if ($$14 != dmn.a.a && $$9 != $$14 && $$13.c($$3) == $$4.c($$3)) {
                  if ($$7.test($$5, $$12)) {
                     return dmn.b::b;
                  }

                  S $$15 = $$0.a($$5, $$12);
                  if ($$15 != null) {
                     S $$16 = $$11 ? $$8 : $$15;
                     S $$17 = $$11 ? $$15 : $$8;
                     return new dmn.c.a<>($$16, $$17);
                  }
               }
            }

            return new dmn.c.b<>($$8);
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
      <T> T apply(dmn.b<? super S, T> var1);

      public static final class a<S> implements dmn.c<S> {
         private final S a;
         private final S b;

         public a(S $$0, S $$1) {
            this.a = $$0;
            this.b = $$1;
         }

         @Override
         public <T> T apply(dmn.b<? super S, T> $$0) {
            return $$0.a(this.a, this.b);
         }
      }

      public static final class b<S> implements dmn.c<S> {
         private final S a;

         public b(S $$0) {
            this.a = $$0;
         }

         @Override
         public <T> T apply(dmn.b<? super S, T> $$0) {
            return $$0.a(this.a);
         }
      }
   }
}
