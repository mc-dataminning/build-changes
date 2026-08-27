import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class ehp extends ehr {
   public static final Codec<ehp> a = a(ehp::new);

   ehp(List<ehy> $$0, List<eke> $$1) {
      super($$0, $$1);
   }

   @Override
   public ehz a() {
      return ehw.g;
   }

   @Override
   protected ehq a(List<? extends ehq> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (ehq)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ehq $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(eho $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static ehp.a a(ehy.a<?>... $$0) {
      return new ehp.a($$0);
   }

   public static <E> ehp.a a(Collection<E> $$0, Function<E, ehy.a<?>> $$1) {
      return new ehp.a($$0.stream().map($$1::apply).toArray(ehy.a[]::new));
   }

   public static class a extends ehy.a<ehp.a> {
      private final Builder<ehy> a = ImmutableList.builder();

      public a(ehy.a<?>... $$0) {
         for (ehy.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ehp.a a() {
         return this;
      }

      @Override
      public ehp.a a(ehy.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ehy b() {
         return new ehp(this.a.build(), this.f());
      }
   }
}
