import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class eox extends eom {
   public static final Codec<eox> a = a(eox::new);

   eox(List<eot> $$0, List<erh> $$1) {
      super($$0, $$1);
   }

   @Override
   public eou a() {
      return eor.h;
   }

   @Override
   protected eol a(List<? extends eol> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eol)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eol $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static eox.a a(eot.a<?>... $$0) {
      return new eox.a($$0);
   }

   public static class a extends eot.a<eox.a> {
      private final Builder<eot> a = ImmutableList.builder();

      public a(eot.a<?>... $$0) {
         for (eot.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eox.a a() {
         return this;
      }

      @Override
      public eox.a c(eot.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eot b() {
         return new eox(this.a.build(), this.f());
      }
   }
}
