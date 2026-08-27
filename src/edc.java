import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class edc extends ede {
   public static final Codec<edc> a = a(edc::new);

   edc(List<edl> $$0, List<efr> $$1) {
      super($$0, $$1);
   }

   @Override
   public edm a() {
      return edj.g;
   }

   @Override
   protected edd a(List<? extends edd> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (edd)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (edd $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(edb $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.a("Unreachable entry!");
         }
      }
   }

   public static edc.a a(edl.a<?>... $$0) {
      return new edc.a($$0);
   }

   public static <E> edc.a a(Collection<E> $$0, Function<E, edl.a<?>> $$1) {
      return new edc.a($$0.stream().map($$1::apply).toArray(edl.a[]::new));
   }

   public static class a extends edl.a<edc.a> {
      private final Builder<edl> a = ImmutableList.builder();

      public a(edl.a<?>... $$0) {
         for (edl.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected edc.a a() {
         return this;
      }

      @Override
      public edc.a a(edl.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public edl b() {
         return new edc(this.a.build(), this.f());
      }
   }
}
