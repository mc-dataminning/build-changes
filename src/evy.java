import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class evy extends ewa {
   public static final MapCodec<evy> a = a(evy::new);

   evy(List<ewh> $$0, List<eza> $$1) {
      super($$0, $$1);
   }

   @Override
   public ewi a() {
      return ewf.g;
   }

   @Override
   protected evz a(List<? extends evz> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (evz)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (evz $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(evx $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static evy.a a(ewh.a<?>... $$0) {
      return new evy.a($$0);
   }

   public static <E> evy.a a(Collection<E> $$0, Function<E, ewh.a<?>> $$1) {
      return new evy.a($$0.stream().map($$1::apply).toArray(ewh.a[]::new));
   }

   public static class a extends ewh.a<evy.a> {
      private final Builder<ewh> a = ImmutableList.builder();

      public a(ewh.a<?>... $$0) {
         for (ewh.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected evy.a a() {
         return this;
      }

      @Override
      public evy.a a(ewh.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ewh b() {
         return new evy(this.a.build(), this.f());
      }
   }
}
