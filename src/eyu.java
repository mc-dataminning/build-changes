import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class eyu extends eyw {
   public static final MapCodec<eyu> a = a(eyu::new);

   eyu(List<ezd> $$0, List<fbw> $$1) {
      super($$0, $$1);
   }

   @Override
   public eze a() {
      return ezb.g;
   }

   @Override
   protected eyv a(List<? extends eyv> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (eyv)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eyv $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(eyt $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static eyu.a a(ezd.a<?>... $$0) {
      return new eyu.a($$0);
   }

   public static <E> eyu.a a(Collection<E> $$0, Function<E, ezd.a<?>> $$1) {
      return new eyu.a($$0.stream().map($$1::apply).toArray(ezd.a[]::new));
   }

   public static class a extends ezd.a<eyu.a> {
      private final Builder<ezd> a = ImmutableList.builder();

      public a(ezd.a<?>... $$0) {
         for (ezd.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eyu.a a() {
         return this;
      }

      @Override
      public eyu.a a(ezd.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ezd b() {
         return new eyu(this.a.build(), this.f());
      }
   }
}
