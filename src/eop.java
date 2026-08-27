import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class eop extends eom {
   public static final Codec<eop> a = a(eop::new);

   eop(List<eot> $$0, List<erh> $$1) {
      super($$0, $$1);
   }

   @Override
   public eou a() {
      return eor.i;
   }

   @Override
   protected eol a(List<? extends eol> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eol)$$0.get(0);
         case 2 -> {
            eol $$1 = $$0.get(0);
            eol $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (eol $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static eop.a a(eot.a<?>... $$0) {
      return new eop.a($$0);
   }

   public static class a extends eot.a<eop.a> {
      private final Builder<eot> a = ImmutableList.builder();

      public a(eot.a<?>... $$0) {
         for (eot.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eop.a a() {
         return this;
      }

      @Override
      public eop.a b(eot.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eot b() {
         return new eop(this.a.build(), this.f());
      }
   }
}
