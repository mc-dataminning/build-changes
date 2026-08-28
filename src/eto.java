import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class eto extends etq {
   public static final MapCodec<eto> a = a(eto::new);

   eto(List<etx> $$0, List<ews> $$1) {
      super($$0, $$1);
   }

   @Override
   public ety a() {
      return etv.g;
   }

   @Override
   protected etp a(List<? extends etp> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (etp)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (etp $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(etn $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static eto.a a(etx.a<?>... $$0) {
      return new eto.a($$0);
   }

   public static <E> eto.a a(Collection<E> $$0, Function<E, etx.a<?>> $$1) {
      return new eto.a($$0.stream().map($$1::apply).toArray(etx.a[]::new));
   }

   public static class a extends etx.a<eto.a> {
      private final Builder<etx> a = ImmutableList.builder();

      public a(etx.a<?>... $$0) {
         for (etx.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eto.a a() {
         return this;
      }

      @Override
      public eto.a a(etx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public etx b() {
         return new eto(this.a.build(), this.f());
      }
   }
}
