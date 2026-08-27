import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class eev extends eex {
   public static final Codec<eev> a = a(eev::new);

   eev(List<efe> $$0, List<ehk> $$1) {
      super($$0, $$1);
   }

   @Override
   public eff a() {
      return efc.g;
   }

   @Override
   protected eew a(List<? extends eew> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (eew)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eew $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(eeu $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.a("Unreachable entry!");
         }
      }
   }

   public static eev.a a(efe.a<?>... $$0) {
      return new eev.a($$0);
   }

   public static <E> eev.a a(Collection<E> $$0, Function<E, efe.a<?>> $$1) {
      return new eev.a($$0.stream().map($$1::apply).toArray(efe.a[]::new));
   }

   public static class a extends efe.a<eev.a> {
      private final Builder<efe> a = ImmutableList.builder();

      public a(efe.a<?>... $$0) {
         for (efe.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eev.a a() {
         return this;
      }

      @Override
      public eev.a a(efe.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public efe b() {
         return new eev(this.a.build(), this.f());
      }
   }
}
