import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class eda extends edc {
   public static final Codec<eda> a = a(eda::new);

   eda(List<edj> $$0, List<efp> $$1) {
      super($$0, $$1);
   }

   @Override
   public edk a() {
      return edh.g;
   }

   @Override
   protected edb a(List<? extends edb> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (edb)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (edb $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(ecz $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.a("Unreachable entry!");
         }
      }
   }

   public static eda.a a(edj.a<?>... $$0) {
      return new eda.a($$0);
   }

   public static <E> eda.a a(Collection<E> $$0, Function<E, edj.a<?>> $$1) {
      return new eda.a($$0.stream().map($$1::apply).toArray(edj.a[]::new));
   }

   public static class a extends edj.a<eda.a> {
      private final Builder<edj> a = ImmutableList.builder();

      public a(edj.a<?>... $$0) {
         for (edj.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eda.a a() {
         return this;
      }

      @Override
      public eda.a a(edj.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public edj b() {
         return new eda(this.a.build(), this.f());
      }
   }
}
