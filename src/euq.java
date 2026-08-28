import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class euq extends euf {
   public static final MapCodec<euq> a = a(euq::new);

   euq(List<eum> $$0, List<exh> $$1) {
      super($$0, $$1);
   }

   @Override
   public eun a() {
      return euk.h;
   }

   @Override
   protected eue a(List<? extends eue> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eue)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eue $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static euq.a a(eum.a<?>... $$0) {
      return new euq.a($$0);
   }

   public static class a extends eum.a<euq.a> {
      private final Builder<eum> a = ImmutableList.builder();

      public a(eum.a<?>... $$0) {
         for (eum.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected euq.a a() {
         return this;
      }

      @Override
      public euq.a c(eum.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eum b() {
         return new euq(this.a.build(), this.f());
      }
   }
}
