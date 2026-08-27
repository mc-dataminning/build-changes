import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class eok extends eom {
   public static final Codec<eok> a = a(eok::new);

   eok(List<eot> $$0, List<erh> $$1) {
      super($$0, $$1);
   }

   @Override
   public eou a() {
      return eor.g;
   }

   @Override
   protected eol a(List<? extends eol> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (eol)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eol $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(eoj $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static eok.a a(eot.a<?>... $$0) {
      return new eok.a($$0);
   }

   public static <E> eok.a a(Collection<E> $$0, Function<E, eot.a<?>> $$1) {
      return new eok.a($$0.stream().map($$1::apply).toArray(eot.a[]::new));
   }

   public static class a extends eot.a<eok.a> {
      private final Builder<eot> a = ImmutableList.builder();

      public a(eot.a<?>... $$0) {
         for (eot.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eok.a a() {
         return this;
      }

      @Override
      public eok.a a(eot.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eot b() {
         return new eok(this.a.build(), this.f());
      }
   }
}
