import java.util.function.BiPredicate;
import java.util.function.Function;

public class djc {
   public static <S extends dre> djc.c<S> a(
      drg<S> $$0, Function<dua, djc.a> $$1, Function<dua, jj> $$2, duu $$3, dua $$4, ddt $$5, je $$6, BiPredicate<ddt, je> $$7
   ) {
      S $$8 = $$0.a($$5, $$6);
      if ($$8 == null) {
         return djc.b::b;
      } else if ($$7.test($$5, $$6)) {
         return djc.b::b;
      } else {
         djc.a $$9 = $$1.apply($$4);
         boolean $$10 = $$9 == djc.a.a;
         boolean $$11 = $$9 == djc.a.b;
         if ($$10) {
            return new djc.c.b<>($$8);
         } else {
            je $$12 = $$6.a($$2.apply($$4));
            dua $$13 = $$5.a_($$12);
            if ($$13.a($$4.b())) {
               djc.a $$14 = $$1.apply($$13);
               if ($$14 != djc.a.a && $$9 != $$14 && $$13.c($$3) == $$4.c($$3)) {
                  if ($$7.test($$5, $$12)) {
                     return djc.b::b;
                  }

                  S $$15 = $$0.a($$5, $$12);
                  if ($$15 != null) {
                     S $$16 = $$11 ? $$8 : $$15;
                     S $$17 = $$11 ? $$15 : $$8;
                     return new djc.c.a<>($$16, $$17);
                  }
               }
            }

            return new djc.c.b<>($$8);
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
      <T> T apply(djc.b<? super S, T> var1);

      public static final class a<S> implements djc.c<S> {
         private final S a;
         private final S b;

         public a(S $$0, S $$1) {
            this.a = $$0;
            this.b = $$1;
         }

         @Override
         public <T> T apply(djc.b<? super S, T> $$0) {
            return $$0.a(this.a, this.b);
         }
      }

      public static final class b<S> implements djc.c<S> {
         private final S a;

         public b(S $$0) {
            this.a = $$0;
         }

         @Override
         public <T> T apply(djc.b<? super S, T> $$0) {
            return $$0.a(this.a);
         }
      }
   }
}
