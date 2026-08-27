import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class ecu extends ecw {
   public static final Codec<ecu> a = a(ecu::new);

   ecu(List<edd> $$0, List<efj> $$1) {
      super($$0, $$1);
   }

   @Override
   public ede a() {
      return edb.g;
   }

   @Override
   protected ecv a(List<? extends ecv> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (ecv)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ecv $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(ect $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.a("Unreachable entry!");
         }
      }
   }

   public static ecu.a a(edd.a<?>... $$0) {
      return new ecu.a($$0);
   }

   public static <E> ecu.a a(Collection<E> $$0, Function<E, edd.a<?>> $$1) {
      return new ecu.a($$0.stream().map($$1::apply).toArray(edd.a[]::new));
   }

   public static class a extends edd.a<ecu.a> {
      private final Builder<edd> a = ImmutableList.builder();

      public a(edd.a<?>... $$0) {
         for (edd.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ecu.a a() {
         return this;
      }

      @Override
      public ecu.a a(edd.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public edd b() {
         return new ecu(this.a.build(), this.f());
      }
   }
}
