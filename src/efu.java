import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class efu extends efj {
   public static final Codec<efu> a = a(efu::new);

   efu(List<efq> $$0, List<ehw> $$1) {
      super($$0, $$1);
   }

   @Override
   public efr a() {
      return efo.h;
   }

   @Override
   protected efi a(List<? extends efi> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (efi)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (efi $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static efu.a a(efq.a<?>... $$0) {
      return new efu.a($$0);
   }

   public static class a extends efq.a<efu.a> {
      private final Builder<efq> a = ImmutableList.builder();

      public a(efq.a<?>... $$0) {
         for (efq.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected efu.a a() {
         return this;
      }

      @Override
      public efu.a c(efq.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public efq b() {
         return new efu(this.a.build(), this.f());
      }
   }
}
