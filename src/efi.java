import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class efi extends eex {
   public static final Codec<efi> a = a(efi::new);

   efi(List<efe> $$0, List<ehk> $$1) {
      super($$0, $$1);
   }

   @Override
   public eff a() {
      return efc.h;
   }

   @Override
   protected eew a(List<? extends eew> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eew)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eew $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static efi.a a(efe.a<?>... $$0) {
      return new efi.a($$0);
   }

   public static class a extends efe.a<efi.a> {
      private final Builder<efe> a = ImmutableList.builder();

      public a(efe.a<?>... $$0) {
         for (efe.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected efi.a a() {
         return this;
      }

      @Override
      public efi.a c(efe.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public efe b() {
         return new efi(this.a.build(), this.f());
      }
   }
}
