import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class eoh extends enw {
   public static final Codec<eoh> a = a(eoh::new);

   eoh(List<eod> $$0, List<eql> $$1) {
      super($$0, $$1);
   }

   @Override
   public eoe a() {
      return eob.h;
   }

   @Override
   protected env a(List<? extends env> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (env)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (env $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static eoh.a a(eod.a<?>... $$0) {
      return new eoh.a($$0);
   }

   public static class a extends eod.a<eoh.a> {
      private final Builder<eod> a = ImmutableList.builder();

      public a(eod.a<?>... $$0) {
         for (eod.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eoh.a a() {
         return this;
      }

      @Override
      public eoh.a c(eod.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eod b() {
         return new eoh(this.a.build(), this.f());
      }
   }
}
