import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class ets extends etu {
   public static final MapCodec<ets> a = a(ets::new);

   ets(List<eub> $$0, List<eww> $$1) {
      super($$0, $$1);
   }

   @Override
   public euc a() {
      return etz.g;
   }

   @Override
   protected ett a(List<? extends ett> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (ett)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ett $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(etr $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static ets.a a(eub.a<?>... $$0) {
      return new ets.a($$0);
   }

   public static <E> ets.a a(Collection<E> $$0, Function<E, eub.a<?>> $$1) {
      return new ets.a($$0.stream().map($$1::apply).toArray(eub.a[]::new));
   }

   public static class a extends eub.a<ets.a> {
      private final Builder<eub> a = ImmutableList.builder();

      public a(eub.a<?>... $$0) {
         for (eub.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ets.a a() {
         return this;
      }

      @Override
      public ets.a a(eub.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eub b() {
         return new ets(this.a.build(), this.f());
      }
   }
}
