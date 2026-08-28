import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class ery extends esa {
   public static final MapCodec<ery> a = a(ery::new);

   ery(List<esh> $$0, List<evc> $$1) {
      super($$0, $$1);
   }

   @Override
   public esi a() {
      return esf.g;
   }

   @Override
   protected erz a(List<? extends erz> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (erz)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (erz $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(erx $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static ery.a a(esh.a<?>... $$0) {
      return new ery.a($$0);
   }

   public static <E> ery.a a(Collection<E> $$0, Function<E, esh.a<?>> $$1) {
      return new ery.a($$0.stream().map($$1::apply).toArray(esh.a[]::new));
   }

   public static class a extends esh.a<ery.a> {
      private final Builder<esh> a = ImmutableList.builder();

      public a(esh.a<?>... $$0) {
         for (esh.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ery.a a() {
         return this;
      }

      @Override
      public ery.a a(esh.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public esh b() {
         return new ery(this.a.build(), this.f());
      }
   }
}
