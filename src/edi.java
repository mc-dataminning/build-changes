import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class edi extends ecx {
   public static final Codec<edi> a = a(edi::new);

   edi(List<ede> $$0, List<efk> $$1) {
      super($$0, $$1);
   }

   @Override
   public edf a() {
      return edc.h;
   }

   @Override
   protected ecw a(List<? extends ecw> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ecw)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ecw $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static edi.a a(ede.a<?>... $$0) {
      return new edi.a($$0);
   }

   public static class a extends ede.a<edi.a> {
      private final Builder<ede> a = ImmutableList.builder();

      public a(ede.a<?>... $$0) {
         for (ede.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected edi.a a() {
         return this;
      }

      @Override
      public edi.a c(ede.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ede b() {
         return new edi(this.a.build(), this.f());
      }
   }
}
