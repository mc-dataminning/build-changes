import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class edh extends ecw {
   public static final Codec<edh> a = a(edh::new);

   edh(List<edd> $$0, List<efj> $$1) {
      super($$0, $$1);
   }

   @Override
   public ede a() {
      return edb.h;
   }

   @Override
   protected ecv a(List<? extends ecv> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ecv)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ecv $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static edh.a a(edd.a<?>... $$0) {
      return new edh.a($$0);
   }

   public static class a extends edd.a<edh.a> {
      private final Builder<edd> a = ImmutableList.builder();

      public a(edd.a<?>... $$0) {
         for (edd.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected edh.a a() {
         return this;
      }

      @Override
      public edh.a c(edd.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public edd b() {
         return new edh(this.a.build(), this.f());
      }
   }
}
