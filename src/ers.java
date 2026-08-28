import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class ers extends eru {
   public static final MapCodec<ers> a = a(ers::new);

   ers(List<esb> $$0, List<euw> $$1) {
      super($$0, $$1);
   }

   @Override
   public esc a() {
      return erz.g;
   }

   @Override
   protected ert a(List<? extends ert> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (ert)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ert $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(err $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static ers.a a(esb.a<?>... $$0) {
      return new ers.a($$0);
   }

   public static <E> ers.a a(Collection<E> $$0, Function<E, esb.a<?>> $$1) {
      return new ers.a($$0.stream().map($$1::apply).toArray(esb.a[]::new));
   }

   public static class a extends esb.a<ers.a> {
      private final Builder<esb> a = ImmutableList.builder();

      public a(esb.a<?>... $$0) {
         for (esb.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ers.a a() {
         return this;
      }

      @Override
      public ers.a a(esb.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public esb b() {
         return new ers(this.a.build(), this.f());
      }
   }
}
