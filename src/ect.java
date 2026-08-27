import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.ArrayUtils;

public class ect extends ecv {
   ect(edc[] $$0, efh[] $$1) {
      super($$0, $$1);
   }

   @Override
   public edd a() {
      return eda.f;
   }

   @Override
   protected ecu a(ecu[] $$0) {
      switch ($$0.length) {
         case 0:
            return a;
         case 1:
            return $$0[0];
         case 2:
            return $$0[0].or($$0[1]);
         default:
            return ($$1, $$2) -> {
               for (ecu $$3 : $$0) {
                  if ($$3.expand($$1, $$2)) {
                     return true;
                  }
               }

               return false;
            };
      }
   }

   @Override
   public void a(ecs $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.length - 1; $$1++) {
         if (ArrayUtils.isEmpty(this.c[$$1].d)) {
            $$0.a("Unreachable entry!");
         }
      }
   }

   public static ect.a a(edc.a<?>... $$0) {
      return new ect.a($$0);
   }

   public static <E> ect.a a(Collection<E> $$0, Function<E, edc.a<?>> $$1) {
      return new ect.a($$0.stream().map($$1::apply).toArray(edc.a[]::new));
   }

   public static class a extends edc.a<ect.a> {
      private final List<edc> a = Lists.newArrayList();

      public a(edc.a<?>... $$0) {
         for (edc.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ect.a a() {
         return this;
      }

      @Override
      public ect.a a(edc.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public edc b() {
         return new ect(this.a.toArray(new edc[0]), this.f());
      }
   }
}
