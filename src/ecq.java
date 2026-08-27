import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class ecq extends ecs {
   public static final Codec<ecq> a = a(ecq::new);

   ecq(List<ecz> $$0, List<eff> $$1) {
      super($$0, $$1);
   }

   @Override
   public eda a() {
      return ecx.g;
   }

   @Override
   protected ecr a(List<? extends ecr> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (ecr)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ecr $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(ecp $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.a("Unreachable entry!");
         }
      }
   }

   public static ecq.a a(ecz.a<?>... $$0) {
      return new ecq.a($$0);
   }

   public static <E> ecq.a a(Collection<E> $$0, Function<E, ecz.a<?>> $$1) {
      return new ecq.a($$0.stream().map($$1::apply).toArray(ecz.a[]::new));
   }

   public static class a extends ecz.a<ecq.a> {
      private final Builder<ecz> a = ImmutableList.builder();

      public a(ecz.a<?>... $$0) {
         for (ecz.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ecq.a a() {
         return this;
      }

      @Override
      public ecq.a a(ecz.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ecz b() {
         return new ecq(this.a.build(), this.f());
      }
   }
}
