import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class ecv extends ecx {
   public static final Codec<ecv> a = a(ecv::new);

   ecv(List<ede> $$0, List<efk> $$1) {
      super($$0, $$1);
   }

   @Override
   public edf a() {
      return edc.g;
   }

   @Override
   protected ecw a(List<? extends ecw> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (ecw)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ecw $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(ecu $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.a("Unreachable entry!");
         }
      }
   }

   public static ecv.a a(ede.a<?>... $$0) {
      return new ecv.a($$0);
   }

   public static <E> ecv.a a(Collection<E> $$0, Function<E, ede.a<?>> $$1) {
      return new ecv.a($$0.stream().map($$1::apply).toArray(ede.a[]::new));
   }

   public static class a extends ede.a<ecv.a> {
      private final Builder<ede> a = ImmutableList.builder();

      public a(ede.a<?>... $$0) {
         for (ede.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ecv.a a() {
         return this;
      }

      @Override
      public ecv.a a(ede.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ede b() {
         return new ecv(this.a.build(), this.f());
      }
   }
}
