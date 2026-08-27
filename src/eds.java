import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class eds extends edu {
   public static final Codec<eds> a = a(eds::new);

   eds(List<eeb> $$0, List<egh> $$1) {
      super($$0, $$1);
   }

   @Override
   public eec a() {
      return edz.g;
   }

   @Override
   protected edt a(List<? extends edt> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (edt)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (edt $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(edr $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.a("Unreachable entry!");
         }
      }
   }

   public static eds.a a(eeb.a<?>... $$0) {
      return new eds.a($$0);
   }

   public static <E> eds.a a(Collection<E> $$0, Function<E, eeb.a<?>> $$1) {
      return new eds.a($$0.stream().map($$1::apply).toArray(eeb.a[]::new));
   }

   public static class a extends eeb.a<eds.a> {
      private final Builder<eeb> a = ImmutableList.builder();

      public a(eeb.a<?>... $$0) {
         for (eeb.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eds.a a() {
         return this;
      }

      @Override
      public eds.a a(eeb.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eeb b() {
         return new eds(this.a.build(), this.f());
      }
   }
}
