import java.util.function.BiPredicate;
import java.util.function.Function;

public class dmm {
   public static <S extends dus> dmm.c<S> a(
      duu<S> $$0, Function<dxq, dmm.a> $$1, Function<dxq, jn> $$2, dyt<jn> $$3, dxq $$4, dha $$5, ji $$6, BiPredicate<dha, ji> $$7
   ) {
      S $$8 = $$0.a($$5, $$6);
      if ($$8 == null) {
         return dmm.b::b;
      } else if ($$7.test($$5, $$6)) {
         return dmm.b::b;
      } else {
         dmm.a $$9 = $$1.apply($$4);
         boolean $$10 = $$9 == dmm.a.a;
         boolean $$11 = $$9 == dmm.a.b;
         if ($$10) {
            return new dmm.c.b<>($$8);
         } else {
            ji $$12 = $$6.a($$2.apply($$4));
            dxq $$13 = $$5.a_($$12);
            if ($$13.a($$4.b())) {
               dmm.a $$14 = $$1.apply($$13);
               if ($$14 != dmm.a.a && $$9 != $$14 && $$13.c($$3) == $$4.c($$3)) {
                  if ($$7.test($$5, $$12)) {
                     return dmm.b::b;
                  }

                  S $$15 = $$0.a($$5, $$12);
                  if ($$15 != null) {
                     S $$16 = $$11 ? $$8 : $$15;
                     S $$17 = $$11 ? $$15 : $$8;
                     return new dmm.c.a<>($$16, $$17);
                  }
               }
            }

            return new dmm.c.b<>($$8);
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
      <T> T apply(dmm.b<? super S, T> var1);

      public static final class a<S> implements dmm.c<S> {
         private final S a;
         private final S b;

         public a(S $$0, S $$1) {
            this.a = $$0;
            this.b = $$1;
         }

         @Override
         public <T> T apply(dmm.b<? super S, T> $$0) {
            return $$0.a(this.a, this.b);
         }
      }

      public static final class b<S> implements dmm.c<S> {
         private final S a;

         public b(S $$0) {
            this.a = $$0;
         }

         @Override
         public <T> T apply(dmm.b<? super S, T> $$0) {
            return $$0.a(this.a);
         }
      }
   }
}
