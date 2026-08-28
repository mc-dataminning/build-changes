import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class eqr extends eqt {
   public static final MapCodec<eqr> a = a(eqr::new);

   eqr(List<era> $$0, List<etu> $$1) {
      super($$0, $$1);
   }

   @Override
   public erb a() {
      return eqy.g;
   }

   @Override
   protected eqs a(List<? extends eqs> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (eqs)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eqs $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(eqq $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static eqr.a a(era.a<?>... $$0) {
      return new eqr.a($$0);
   }

   public static <E> eqr.a a(Collection<E> $$0, Function<E, era.a<?>> $$1) {
      return new eqr.a($$0.stream().map($$1::apply).toArray(era.a[]::new));
   }

   public static class a extends era.a<eqr.a> {
      private final Builder<era> a = ImmutableList.builder();

      public a(era.a<?>... $$0) {
         for (era.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eqr.a a() {
         return this;
      }

      @Override
      public eqr.a a(era.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public era b() {
         return new eqr(this.a.build(), this.f());
      }
   }
}
