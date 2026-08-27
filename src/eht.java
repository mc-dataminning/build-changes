import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class eht extends ehi {
   public static final Codec<eht> a = a(eht::new);

   eht(List<ehp> $$0, List<ejv> $$1) {
      super($$0, $$1);
   }

   @Override
   public ehq a() {
      return ehn.h;
   }

   @Override
   protected ehh a(List<? extends ehh> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ehh)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ehh $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static eht.a a(ehp.a<?>... $$0) {
      return new eht.a($$0);
   }

   public static class a extends ehp.a<eht.a> {
      private final Builder<ehp> a = ImmutableList.builder();

      public a(ehp.a<?>... $$0) {
         for (ehp.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eht.a a() {
         return this;
      }

      @Override
      public eht.a c(ehp.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ehp b() {
         return new eht(this.a.build(), this.f());
      }
   }
}
