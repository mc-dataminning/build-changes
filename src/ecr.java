import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class ecr extends ect {
   public static final Codec<ecr> a = a(ecr::new);

   ecr(List<eda> $$0, List<efg> $$1) {
      super($$0, $$1);
   }

   @Override
   public edb a() {
      return ecy.g;
   }

   @Override
   protected ecs a(List<? extends ecs> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (ecs)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ecs $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(ecq $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.a("Unreachable entry!");
         }
      }
   }

   public static ecr.a a(eda.a<?>... $$0) {
      return new ecr.a($$0);
   }

   public static <E> ecr.a a(Collection<E> $$0, Function<E, eda.a<?>> $$1) {
      return new ecr.a($$0.stream().map($$1::apply).toArray(eda.a[]::new));
   }

   public static class a extends eda.a<ecr.a> {
      private final Builder<eda> a = ImmutableList.builder();

      public a(eda.a<?>... $$0) {
         for (eda.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ecr.a a() {
         return this;
      }

      @Override
      public ecr.a a(eda.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eda b() {
         return new ecr(this.a.build(), this.f());
      }
   }
}
