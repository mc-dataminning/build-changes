import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class ehm extends ehb {
   public static final Codec<ehm> a = a(ehm::new);

   ehm(List<ehi> $$0, List<ejo> $$1) {
      super($$0, $$1);
   }

   @Override
   public ehj a() {
      return ehg.h;
   }

   @Override
   protected eha a(List<? extends eha> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eha)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eha $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static ehm.a a(ehi.a<?>... $$0) {
      return new ehm.a($$0);
   }

   public static class a extends ehi.a<ehm.a> {
      private final Builder<ehi> a = ImmutableList.builder();

      public a(ehi.a<?>... $$0) {
         for (ehi.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ehm.a a() {
         return this;
      }

      @Override
      public ehm.a c(ehi.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ehi b() {
         return new ehm(this.a.build(), this.f());
      }
   }
}
