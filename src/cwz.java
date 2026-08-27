import java.util.function.BiPredicate;
import java.util.function.Function;

public class cwz {
   public static <S extends der> cwz.c<S> a(
      det<S> $$0, Function<dgw, cwz.a> $$1, Function<dgw, hx> $$2, dhq $$3, dgw $$4, crt $$5, ht $$6, BiPredicate<crt, ht> $$7
   ) {
      S $$8 = $$0.a($$5, $$6);
      if ($$8 == null) {
         return cwz.b::b;
      } else if ($$7.test($$5, $$6)) {
         return cwz.b::b;
      } else {
         cwz.a $$9 = $$1.apply($$4);
         boolean $$10 = $$9 == cwz.a.a;
         boolean $$11 = $$9 == cwz.a.b;
         if ($$10) {
            return new cwz.c.b<>($$8);
         } else {
            ht $$12 = $$6.a($$2.apply($$4));
            dgw $$13 = $$5.a_($$12);
            if ($$13.a($$4.b())) {
               cwz.a $$14 = $$1.apply($$13);
               if ($$14 != cwz.a.a && $$9 != $$14 && $$13.c($$3) == $$4.c($$3)) {
                  if ($$7.test($$5, $$12)) {
                     return cwz.b::b;
                  }

                  S $$15 = $$0.a($$5, $$12);
                  if ($$15 != null) {
                     S $$16 = $$11 ? $$8 : $$15;
                     S $$17 = $$11 ? $$15 : $$8;
                     return new cwz.c.a<>($$16, $$17);
                  }
               }
            }

            return new cwz.c.b<>($$8);
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
      <T> T apply(cwz.b<? super S, T> var1);

      public static final class a<S> implements cwz.c<S> {
         private final S a;
         private final S b;

         public a(S $$0, S $$1) {
            this.a = $$0;
            this.b = $$1;
         }

         @Override
         public <T> T apply(cwz.b<? super S, T> $$0) {
            return $$0.a(this.a, this.b);
         }
      }

      public static final class b<S> implements cwz.c<S> {
         private final S a;

         public b(S $$0) {
            this.a = $$0;
         }

         @Override
         public <T> T apply(cwz.b<? super S, T> $$0) {
            return $$0.a(this.a);
         }
      }
   }
}
