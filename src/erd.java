import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class erd extends erf {
   public static final MapCodec<erd> a = a(erd::new);

   erd(List<erm> $$0, List<euh> $$1) {
      super($$0, $$1);
   }

   @Override
   public ern a() {
      return erk.g;
   }

   @Override
   protected ere a(List<? extends ere> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (ere)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ere $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(erc $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static erd.a a(erm.a<?>... $$0) {
      return new erd.a($$0);
   }

   public static <E> erd.a a(Collection<E> $$0, Function<E, erm.a<?>> $$1) {
      return new erd.a($$0.stream().map($$1::apply).toArray(erm.a[]::new));
   }

   public static class a extends erm.a<erd.a> {
      private final Builder<erm> a = ImmutableList.builder();

      public a(erm.a<?>... $$0) {
         for (erm.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected erd.a a() {
         return this;
      }

      @Override
      public erd.a a(erm.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public erm b() {
         return new erd(this.a.build(), this.f());
      }
   }
}
