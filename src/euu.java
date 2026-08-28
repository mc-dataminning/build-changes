import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class euu extends euw {
   public static final MapCodec<euu> a = a(euu::new);

   euu(List<evd> $$0, List<exy> $$1) {
      super($$0, $$1);
   }

   @Override
   public eve a() {
      return evb.g;
   }

   @Override
   protected euv a(List<? extends euv> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (euv)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (euv $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(eut $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static euu.a a(evd.a<?>... $$0) {
      return new euu.a($$0);
   }

   public static <E> euu.a a(Collection<E> $$0, Function<E, evd.a<?>> $$1) {
      return new euu.a($$0.stream().map($$1::apply).toArray(evd.a[]::new));
   }

   public static class a extends evd.a<euu.a> {
      private final Builder<evd> a = ImmutableList.builder();

      public a(evd.a<?>... $$0) {
         for (evd.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected euu.a a() {
         return this;
      }

      @Override
      public euu.a a(evd.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public evd b() {
         return new euu(this.a.build(), this.f());
      }
   }
}
