import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.ArrayUtils;

public class dzw extends dzy {
   dzw(eaf[] $$0, eck[] $$1) {
      super($$0, $$1);
   }

   @Override
   public eag a() {
      return ead.f;
   }

   @Override
   protected dzx a(dzx[] $$0) {
      switch ($$0.length) {
         case 0:
            return a;
         case 1:
            return $$0[0];
         case 2:
            return $$0[0].or($$0[1]);
         default:
            return ($$1, $$2) -> {
               for (dzx $$3 : $$0) {
                  if ($$3.expand($$1, $$2)) {
                     return true;
                  }
               }

               return false;
            };
      }
   }

   @Override
   public void a(dzv $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.length - 1; $$1++) {
         if (ArrayUtils.isEmpty(this.c[$$1].d)) {
            $$0.a("Unreachable entry!");
         }
      }
   }

   public static dzw.a a(eaf.a<?>... $$0) {
      return new dzw.a($$0);
   }

   public static <E> dzw.a a(Collection<E> $$0, Function<E, eaf.a<?>> $$1) {
      return new dzw.a($$0.stream().map($$1::apply).toArray(eaf.a[]::new));
   }

   public static class a extends eaf.a<dzw.a> {
      private final List<eaf> a = Lists.newArrayList();

      public a(eaf.a<?>... $$0) {
         for (eaf.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected dzw.a a() {
         return this;
      }

      @Override
      public dzw.a a(eaf.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eaf b() {
         return new dzw(this.a.toArray(new eaf[0]), this.f());
      }
   }
}
