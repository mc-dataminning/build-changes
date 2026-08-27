import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class epm extends epo {
   public static final MapCodec<epm> a = a(epm::new);

   epm(List<epv> $$0, List<esl> $$1) {
      super($$0, $$1);
   }

   @Override
   public epw a() {
      return ept.g;
   }

   @Override
   protected epn a(List<? extends epn> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (epn)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (epn $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(epl $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static epm.a a(epv.a<?>... $$0) {
      return new epm.a($$0);
   }

   public static <E> epm.a a(Collection<E> $$0, Function<E, epv.a<?>> $$1) {
      return new epm.a($$0.stream().map($$1::apply).toArray(epv.a[]::new));
   }

   public static class a extends epv.a<epm.a> {
      private final Builder<epv> a = ImmutableList.builder();

      public a(epv.a<?>... $$0) {
         for (epv.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected epm.a a() {
         return this;
      }

      @Override
      public epm.a a(epv.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public epv b() {
         return new epm(this.a.build(), this.f());
      }
   }
}
