import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class efh extends efj {
   public static final Codec<efh> a = a(efh::new);

   efh(List<efq> $$0, List<ehw> $$1) {
      super($$0, $$1);
   }

   @Override
   public efr a() {
      return efo.g;
   }

   @Override
   protected efi a(List<? extends efi> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (efi)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (efi $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(efg $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.a("Unreachable entry!");
         }
      }
   }

   public static efh.a a(efq.a<?>... $$0) {
      return new efh.a($$0);
   }

   public static <E> efh.a a(Collection<E> $$0, Function<E, efq.a<?>> $$1) {
      return new efh.a($$0.stream().map($$1::apply).toArray(efq.a[]::new));
   }

   public static class a extends efq.a<efh.a> {
      private final Builder<efq> a = ImmutableList.builder();

      public a(efq.a<?>... $$0) {
         for (efq.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected efh.a a() {
         return this;
      }

      @Override
      public efh.a a(efq.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public efq b() {
         return new efh(this.a.build(), this.f());
      }
   }
}
